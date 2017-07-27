package Utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.comparator.LastModifiedFileComparator;

public class Test 
{

	public static void main(String[] args) 
	{
		File src = new File("D:/ZZZ");
//		File des = new File("");
		File[] files = src.listFiles();
		//Arrays.sort(files,LastModifiedFileComparator,LASTMODIFIED_REVERSE);
		
	}

}


/*public static void main(String[] args) throws Exception 
{
	SimpleDateFormat df = new SimpleDateFormat();
	Date date = new Date();
	List<String> filePathList = new ArrayList<String>();
	
	File src = new File("D:/ZZZ");
	File des = new File("D:/A");
	File[] files = src.listFiles();
	Arrays.sort(files, LastModifiedFileComparator.LASTMODIFIED_REVERSE);
	for(File m: files)
	{
		if(m.getName().contains(args[0]))
		{
			if(df.format(m.lastModified()).contains(df.format(date)))
			{
				filePathList.add(m.getAbsoluteFile().toString());
				System.out.println(filePathList);
			}
		}
	}
}*/