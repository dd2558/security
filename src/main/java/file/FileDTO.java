package file;

public class FileDTO {
	
	String fileName;
	String fileRealName;
	int downloadCount; 
	public String getFielName() {
		return fileName;
	}
	public void setFielName(String fielName) {
		this.fileName = fielName;
	}
	public String getFileRealName() {
		return fileRealName;
	}
	public void setFileRealName(String fileRealName) {
		this.fileRealName = fileRealName;
	}
	
	public int getDownloadCount() {
		return downloadCount;
	}
	public void setDownloadCount(int downloadCount) {
		this.downloadCount = downloadCount;
	}
	
	public FileDTO(String fileName, String fileRealName, int downloadCount) {
		super();
		this.fileName = fileName;
		this.fileRealName = fileRealName;
		this.downloadCount = downloadCount;
	}


	
}
