<%@ page contentType="text/html; charset=euc-kr" %>

<html>
<head>
<title>JEUS 5.0 Sample Application</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link href="/web-sample/css/jmtable.css" rel="stylesheet" type="text/css">
<script language="javascript" src="/web-sample/js/common.js"></script>
</head>

	<div style="padding-left:11px"><br>
	<table width="776" border="0" cellspacing="0" cellpadding="0">
		<tr class="JMHeading5">
		<td height="27" bgcolor="F0F0F0"><img src="/web-sample/images/point_01.gif" width="9" height="9" align="absmiddle">
		<a href="/web-sample/ko/jsp_main.html">JSP </a>&gt; Snoop ����</td>
		</tr>
	</table>
	<br>
	<table width="776" border="0" cellspacing="0" cellpadding="0">
		<tr>
		<td width="22">&nbsp;</td>
		<td width="145" valign="top" background="/web-sample/images/b_bg.gif"><a href="intro.html" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('sub01','','/web-sample/images/b_me1_up.gif',1)"><img src="/web-sample/images/b_me1.gif" name="sub01" width="145" height="26" border="0"></a><a href="snoop.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('sub02','','/web-sample/images/b_me2_up.gif',1)"><img src="/web-sample/images/b_me2.gif" name="sub02" width="145" height="26" border="0"></a><a href="build.html" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('sub03','','/web-sample/images/b_me3_up.gif',1)"><img src="/web-sample/images/b_me3.gif" name="sub03" width="145" height="26" border="0"></a>
		</td>
		<td valign="top"><table width="100%" height="100%" border="0" cellpadding="0" cellspacing="0">
		<tr>
		<td height="1" bgcolor="CCCCCC"></td>
		</tr>
		<tr>
		<td background="/web-sample/images/con_bg.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
		<tr>
		<td height="39" valign="bottom" class="JMHeading6">
		<img src="/web-sample/images/point_05.gif" width="11" height="12">�� ��</td>
		</tr>
		<tr>
		<td align="right"><img src="/web-sample/images/line2.gif" width="597" height="6"></td>
		</tr>
		<tr>
		<!-- contents start -->
		<td class="JMHeading4" width="597">
		<br><br>
	    	<p class="JMHeading1"> Request Information </p>
		<P class="JMHeading4">
		JSP Request Method: <%= request.getMethod() %>
		<br>
		Request URI: <%= request.getRequestURI() %>
		<br>
		Request Protocol: <%= request.getProtocol() %>
		<br>
		Servlet path: <%= request.getServletPath() %>
		<br>
		Path info: <%= request.getPathInfo() %>
		<br>
		Path translated: <%= request.getPathTranslated() %>
		<br>
		Query string: <%= request.getQueryString() %>
		<br>
		Content length: <%= request.getContentLength() %>
		<br>
		Content type: <%= request.getContentType() %>
		<br>
		Server name: <%= request.getServerName() %>
		<br>
		Server port: <%= request.getServerPort() %>
		<br>
		Remote user: <%= request.getRemoteUser() %>
		<br>
		Remote address: <%= request.getRemoteAddr() %>
		<br>
		Remote host: <%= request.getRemoteHost() %>
		<br>
		Authorization scheme: <%= request.getAuthType() %>
		<hr>
		The browser you are using is <%= request.getHeader("User-Agent") %>
		<hr>
		<br>
		</P>
		</td>
		<!-- contents end -->
		</tr>
		</table></td>
		</tr>
		<tr>
		<td height="1" bgcolor="CCCCCC"></td>
		</tr>
		</table></td>
		</tr>
		</table>
		<br>
		</div></td>
		</tr>
		<tr>
		<td height="60"><div style="padding-left:11px"><table width="776" border="0" cellspacing="0" cellpadding="0">
		<tr class="JMHeading5">
		<td height="44"><img src="/web-sample/images/copy.gif" width="776" height="44"></td>
		</tr>
	</table>
</div>

</body>
</html>

