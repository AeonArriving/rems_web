
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int temp=11;
		//System.out.println(temp/10);
		
		String name = "G:\\����\\���֤\\IMG_1422.JPG";
    	
    	if(name.contains("\\")){
    		//���name ����\  ֤����IE�����
    		int lastChar=name.lastIndexOf("\\");
    		String tempStr=name.substring(lastChar+1, name.length());
    		System.out.println("tempStr========="+tempStr);
    	}

	}

}
