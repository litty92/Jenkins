import utility.ExcelUtils;

// Now this method does not need any arguments

public class SignIn{

    public static String[] Execute() throws Exception{

        //This is to get the values from Excel sheet, passing parameters (Row num &amp; Col num)to getCellData method

        ExcelUtils.setExcelFile("/home/litty/Downloads/Selenium_Guru99/Data/TestData.xls","Sheet1");

        String sUserName = ExcelUtils.getCellData(1, 0);
        String sPassword = ExcelUtils.getCellData(1, 1);
        String sURl = ExcelUtils.getCellData(1 , 2);
        return new String[]{sUserName, sPassword,sURl};
    }

    public static String[] Data() throws Exception{

        //This is to get the values from Excel sheet, passing parameters (Row num &amp; Col num)to getCellData method
        ExcelUtils.setExcelFile("/home/litty/Downloads/Selenium_Guru99/Data/TestData.xls","Sheet2");
        String sUserName = ExcelUtils.getCellData(1, 0);
        String sPassword = ExcelUtils.getCellData(1, 1);
        String sURl = ExcelUtils.getCellData(1 , 2);
        return new String[]{sUserName, sPassword,sURl};
    }

}
