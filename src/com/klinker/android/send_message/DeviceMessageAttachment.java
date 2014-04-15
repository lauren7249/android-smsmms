package com.klinker.android.send_message;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.mms.MMSPart;

public class DeviceMessageAttachment extends MMSPart
{

	public DeviceMessageAttachment(@JsonProperty("FileName") String fileName, @JsonProperty("FileType") String fileType,@JsonProperty("FileData") byte[]  fileData)
	{
		Name = fileName;
		MimeType = fileType;
		Data = fileData;
	}

	public String getFileName()
	{
		return Name;
	}

	public void setFileName(String fileName)
	{
		Name = fileName;
	}

	public String getFileType()
	{
		return MimeType;
	}

	public void setFileType(String fileType)
	{
		MimeType = fileType;
	}

	public byte[] getFileData()
	{
		return Data;
	}

	public void setFileData(byte[] fileData)
	{
		Data = fileData;
	}
}
