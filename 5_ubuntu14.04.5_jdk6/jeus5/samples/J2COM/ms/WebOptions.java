/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class WebOptions extends DispatchPtr
{
	public WebOptions(String progid) throws COMException { super(progid);}
	public WebOptions(IUnknown other) throws COMException { super(other);}

	public WebOptions(GUID ClsID) throws COMException { super(ClsID);}

	public int getIncludeNavigation() throws COMException
	{
		return ((Integer) get("IncludeNavigation")).intValue();
	}

	public void setIncludeNavigation(int pint) throws COMException
	{
		put("IncludeNavigation", new Integer(pint));
	}

	public int getFrameColors() throws COMException
	{
		return ((Integer) get("FrameColors")).intValue();
	}

	public void setFrameColors(int pint) throws COMException
	{
		put("FrameColors", new Integer(pint));
	}

	public int getResizeGraphics() throws COMException
	{
		return ((Integer) get("ResizeGraphics")).intValue();
	}

	public void setResizeGraphics(int pint) throws COMException
	{
		put("ResizeGraphics", new Integer(pint));
	}

	public int getShowSlideAnimation() throws COMException
	{
		return ((Integer) get("ShowSlideAnimation")).intValue();
	}

	public void setShowSlideAnimation(int pint) throws COMException
	{
		put("ShowSlideAnimation", new Integer(pint));
	}

	public int getOrganizeInFolder() throws COMException
	{
		return ((Integer) get("OrganizeInFolder")).intValue();
	}

	public void setOrganizeInFolder(int pint) throws COMException
	{
		put("OrganizeInFolder", new Integer(pint));
	}

	public int getUseLongFileNames() throws COMException
	{
		return ((Integer) get("UseLongFileNames")).intValue();
	}

	public void setUseLongFileNames(int pint) throws COMException
	{
		put("UseLongFileNames", new Integer(pint));
	}

	public int getRelyOnVML() throws COMException
	{
		return ((Integer) get("RelyOnVML")).intValue();
	}

	public void setRelyOnVML(int pint) throws COMException
	{
		put("RelyOnVML", new Integer(pint));
	}

	public int getAllowPNG() throws COMException
	{
		return ((Integer) get("AllowPNG")).intValue();
	}

	public void setAllowPNG(int pint) throws COMException
	{
		put("AllowPNG", new Integer(pint));
	}

	public int getScreenSize() throws COMException
	{
		return ((Integer) get("ScreenSize")).intValue();
	}

	public void setScreenSize(int pint) throws COMException
	{
		put("ScreenSize", new Integer(pint));
	}

	public int getEncoding() throws COMException
	{
		return ((Integer) get("Encoding")).intValue();
	}

	public void setEncoding(int pint) throws COMException
	{
		put("Encoding", new Integer(pint));
	}

	public String getFolderSuffix() throws COMException
	{
		return (String) get("FolderSuffix");
	}

	public void UseDefaultFolderSuffix() throws COMException
	{
		invoke("UseDefaultFolderSuffix");
	}


}
