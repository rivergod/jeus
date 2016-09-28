/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class Pane extends DispatchPtr
{
	public Pane(String progid) throws COMException { super(progid);}
	public Pane(IUnknown other) throws COMException { super(other);}

	public Pane(GUID ClsID) throws COMException { super(ClsID);}

	public DispatchPtr getParent() throws COMException
	{
		return (DispatchPtr) get("Parent");
	}

	public void Activate() throws COMException
	{
		invoke("Activate");
	}

	public int getActive() throws COMException
	{
		return ((Integer) get("Active")).intValue();
	}

	public _Application getApplication() throws COMException
	{
		return (new _Application((DispatchPtr)  get("Application")));
	}

	public int getViewType() throws COMException
	{
		return ((Integer) get("ViewType")).intValue();
	}


}
