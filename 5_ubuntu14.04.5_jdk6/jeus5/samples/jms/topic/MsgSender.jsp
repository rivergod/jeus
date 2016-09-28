<%@ page contentType="text/html;charset=euc-kr"
    import="javax.naming.*, java.io.*, javax.jms.*, javax.jms.Queue"%>

<%!
    String literal;
    boolean persistent;
    int priority;
    long ttl;
    String replyto;
    String msgText;
%>

<%

    try {
      if (request.getMethod().equals("GET")) {
%>

<html>
    <head><title>JMS Message Sender</title></head>
    <body BGCOLOR=#FFFFFF>
        <font FACE="Verdana">
        <p><h1><font color=#DB1260 face="Verdana">Submit a JMS Message at Topic</font></h1>
        <form METHOD="POST" ACTION="MsgSender.jsp">
            <table bgcolor=#EEEEEE cellpadding=2 border=0 align=center>
                <TR>
                    <TD>Destination:</TD>
                    <TD><select name=dest>
                        <option value=topic selected>JMS Topic</option>
                </TR>
                <TR>
                    <TD>Message Type:</TD>
                    <TD><select name=persistent>
                        <option value=persistent selected>Persistent</option>
                        <option value=nonpersistent>Non Persistent</option></select>
                </TR>
                <TR>
                    <TD>Priority:</td>
                    <TD><select name=priority>
                        <option value=0>0</option>
                        <option value=1>1</option>
                        <option value=2>2</option>
                        <option value=3>3</option>
                        <option value=4 selected>4</option>
                        <option value=5>5</option>
                        <option value=6>6</option>
                        <option value=7>7</option>
                        <option value=8>8</option>
                        <option value=9>9</option></select>
                </TR>
                <TR>
                    <TD>Time to live:</td>
                    <TD><select name=timetolive>
                        <option value=0 selected>Never expires</option>
                        <option value=60000>one minute</option>
                        <option value=600000>ten minutes</option>
                        <option value=3600000>one hour</option>
                        <option value=86400000>one day</option></select>
                </TR>
                <TR>
                    <TD>Reply to:</TD>
                    <TD><select name=replyto>
                        <option value=topic selected>ExampleTopic</option></select>
                </TR>
                <TR><TD>Message Text:</TD><TD><input NAME="msgtext" SIZE=60></TD></TR>
                <TR>
                    <TD colspan=2 align=center><input TYPE="submit" VALUE="Send Message"></TD>
                </TR>
            </table>
        </form>
        </font>
    </body>
</html>

<%
      
      } else {
        
        persistent = request.getParameter("persistent").equals("persistent");
        priority = Integer.parseInt(request.getParameter("priority"));
        ttl = Long.parseLong(request.getParameter("timetolive"));
        replyto = request.getParameter("replyto");
        msgText = request.getParameter("msgtext");

        sendTopicMessage(persistent, priority, ttl, replyto, msgText);
%>

<HTML>
    <HEAD><TITLE>Message Status</TITLE></HEAD>
    <BODY BGCLOR=#FFFFFF><p>
        <h1><FONT COLOR=#DB1260 FACE="Verdana">Message Status</FONT></h1>
        Message Submitted: <%=msgText %>
    </BODY>
</HTML>

<%
        return;
      }
    } catch (Exception e) {
            e.printStackTrace();
    }

%>



<%!

        public void sendTopicMessage(boolean persistent, int priority, long ttl,
                             String replyto, String topicMessage) throws NamingException, JMSException {
            Context ctx = new InitialContext();
            TopicConnectionFactory tconFactory;
            TopicConnection connection;
            TopicSession session;
            TopicPublisher publisher;
            Topic topic;
            Queue queue;
            TextMessage msg;

            tconFactory = (TopicConnectionFactory) ctx.lookup("TopicConnectionFactory");
            connection = tconFactory.createTopicConnection();
            session = connection.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
            topic = (Topic) ctx.lookup("ExampleTopic");
            publisher = session.createPublisher(topic);
            msg = session.createTextMessage();
            if (replyto.equals("topic")) {
                msg.setJMSReplyTo(topic);
            } else if (replyto.equals("queue")) {
                try {
                    queue = (Queue) ctx.lookup("ExampleTopic");
                    msg.setJMSReplyTo(queue);
                } catch (NamingException ne) {}
            }
            msg.setText(topicMessage);
            connection.start();

            publisher.publish(msg,
                                  persistent ? DeliveryMode.PERSISTENT: DeliveryMode.NON_PERSISTENT,
                                  priority,
                                  ttl);

            publisher.close();
            session.close();
            connection.close();
        }

        
%>
