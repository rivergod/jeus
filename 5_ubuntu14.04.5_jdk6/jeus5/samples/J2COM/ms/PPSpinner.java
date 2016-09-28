/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class PPSpinner extends DispatchPtr
{
	public PPSpinner(String progid) throws COMException { super(progid);}
	public PPSpinner(IUnknown other) throws COMException { super(other);}

	public PPSpinner(GUID ClsID) throws COMException { super(ClsID);}

	public _Application getApplication() throws COMException
	{
		return (new _Application((DispatchPtr)  get("Application")));
	}

	public DispatchPtr getParent() throws COMException
	{
		return (DispatchPtr) get("Parent");
	}

	public int getEnable() throws COMException
	{
		return ((Integer) get("Enable")).intValue();
	}

	public void setEnable(int pint) throws COMException
	{
		put("Enable", new Integer(pint));
	}

	public int getVisible() throws COMException
	{
		return ((Integer) get("Visible")).intValue();
	}

	public void setVisible(int pint) throws COMException
	{
		put("Visible", new Integer(pint));
	}

	public int getFocus() throws COMException
	{
		return ((Integer) get("Focus")).intValue();
	}

	public void setFocus(int pint) throws COMException
	{
		put("Focus", new Integer(pint));
	}

	public String getLabel() throws COMException
	{
		return (String) get("Label");
	}

	public void setLabel(String pString) throws COMException
	{
		put("Label", pString);
	}

	public int getHelpId() throws COMException
	{
		return ((Integer) get("HelpId")).intValue();
	}

	public void setHelpId(int pint) throws COMException
	{
		put("HelpId", new Integer(pint));
	}

	public float getLeft() throws COMException
	{
		return ((Float) get("Left")).floatValue();
	}

	public void setLeft(float pfloat) throws COMException
	{
		put("Left", new Float(pfloat));
	}

	public float getTop() throws COMException
	{
		return ((Float) get("Top")).floatValue();
	}

	public void setTop(float pfloat) throws COMException
	{
		put("Top", new Float(pfloat));
	}

	public float getWidth() throws COMException
	{
		return ((Float) get("Width")).floatValue();
	}

	public void setWidth(float pfloat) throws COMException
	{
		put("Width", new Float(pfloat));
	}

	public float getHeight() throws COMException
	{
		return ((Float) get("Height")).floatValue();
	}

	public void setHeight(float pfloat) throws COMException
	{
		put("Height", new Float(pfloat));
	}

	public int getHWND() throws COMException
	{
		return ((Integer) get("HWND")).intValue();
	}

	public String getOnSetFocus() throws COMException
	{
		return (String) get("OnSetFocus");
	}

	public void setOnSetFocus(String pString) throws COMException
	{
		put("OnSetFocus", pString);
	}

	public String getOnKillFocus() throws COMException
	{
		return (String) get("OnKillFocus");
	}

	public void setOnKillFocus(String pString) throws COMException
	{
		put("OnKillFocus", pString);
	}

	public Tags getTags() throws COMException
	{
		return ( new Tags((DispatchPtr)  get("Tags")));
	}

	public String getName() throws COMException
	{
		return (String) get("Name");
	}

	public void setName(String pString) throws COMException
	{
		put("Name", pString);
	}

	public int getMinimum() throws COMException
	{
		return ((Integer) get("Minimum")).intValue();
	}

	public void setMinimum(int pint) throws COMException
	{
		put("Minimum", new Integer(pint));
	}

	public int getMaximum() throws COMException
	{
		return ((Integer) get("Maximum")).intValue();
	}

	public void setMaximum(int pint) throws COMException
	{
		put("Maximum", new Integer(pint));
	}

	public int getIncrement() throws COMException
	{
		return ((Integer) get("Increment")).intValue();
	}

	public void setIncrement(int pint) throws COMException
	{
		put("Increment", new Integer(pint));
	}

	public int getPageChange() throws COMException
	{
		return ((Integer) get("PageChange")).intValue();
	}

	public void setPageChange(int pint) throws COMException
	{
		put("PageChange", new Integer(pint));
	}

	public int getCurrentValue() throws COMException
	{
		return ((Integer) get("CurrentValue")).intValue();
	}

	public void setCurrentValue(int pint) throws COMException
	{
		put("CurrentValue", new Integer(pint));
	}

	public String getOnAChange() throws COMException
	{
		return (String) get("OnAChange");
	}

	public void setOnAChange(String pString) throws COMException
	{
		put("OnAChange", pString);
	}


}
