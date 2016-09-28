/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class TabStops extends DispatchPtr
{
	public TabStops(String progid) throws COMException { super(progid);}
	public TabStops(IUnknown other) throws COMException { super(other);}

	public TabStops(GUID ClsID) throws COMException { super(ClsID);}

	public IUnknown get_NewEnum() throws COMException
	{
		return (IUnknown) get("_NewEnum");
	}

	public Object _Index(int index) throws COMException
	{
		return invokeN("_Index", new Object[] {new Integer(index)});
	}

	public int getCount() throws COMException
	{
		return ((Integer) get("Count")).intValue();
	}

	public _Application getApplication() throws COMException
	{
		return (new _Application((DispatchPtr)  get("Application")));
	}

	public DispatchPtr getParent() throws COMException
	{
		return (DispatchPtr) get("Parent");
	}

	public TabStop Item(int index) throws COMException
	{
		return (new TabStop((DispatchPtr)invokeN("Item", new Object[] {new Integer(index)})));
	}

	public float getDefaultSpacing() throws COMException
	{
		return ((Float) get("DefaultSpacing")).floatValue();
	}

	public void setDefaultSpacing(float pfloat) throws COMException
	{
		put("DefaultSpacing", new Float(pfloat));
	}

	public TabStop Add(int Type, float Position) throws COMException
	{
		return (new TabStop((DispatchPtr)invokeN("Add", new Object[] {new Integer(Type), new Float(Position)})));
	}


}
