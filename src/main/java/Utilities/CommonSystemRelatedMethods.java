package Utilities;

import java.io.File;

import org.apache.commons.io.FileUtils;


public class CommonSystemRelatedMethods extends CommonBrowserRelatedMethods
{
	public void copyfiles(String source, String destination) throws Exception	//D:/ZZZ/New folder/R1	//D:/ZZZ/New folder/R2
	{
		File src = new File(source);
		File des = new File(destination);
		if(des.exists())
		{
			FileUtils.deleteDirectory(des);
		}
		Thread.sleep(3000);
		FileUtils.copyDirectory(src, des);
	}
	
	public void createfile(String destination) throws Exception		//D:/Automation.exe
	{
		{
			File file = new File(destination);
			file.createNewFile();
		}
	}
	
	public void createfolder(String destination) throws Exception		//D:/Automation.exe
	{
		{
			File file = new File(destination);
			file.mkdirs();
		}
	}
	
	public void filepresentverification(String filepath) throws Exception		//D:/Automation/Test.txt
	{
		{
			File file = new File(filepath);
			if(file.exists())
			{
				System.out.println("File is present");
			}
			else
			{
				System.out.println("File is not present");
			}
		}
	}
}
