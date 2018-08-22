package Cn.Day_2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/** 
 * @author  洋  
 * @ClassName:Test_1.java
 * @Description:
 * @date 创建时间:2018-6-28 下午8:48:29  
 */
public class Test_1 {
	public static void main(String[] args) {
		File file = new File("e:/");
		if (file.exists() && file.isDirectory()) {
			List<File> mlist = new ArrayList<File>();
			//getAllFile(file, mlist);		//获取E盘所有图片
            getOneFile(file, mlist);		//获取E盘根目录图片
			// 已经获取了所有图片
            for (File file2 : mlist) {
                System.out.println(file2.getAbsolutePath());
            }
        }
    }

    private static void getAllFile(File file, List<File> mlist) {
        // 1.获取子目录
        File[] files = file.listFiles();
        
        // 2.判断files是否是空的 否则程序崩溃
        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) {
                    getAllFile(f, mlist);//调用递归的方式
                } else {
                    // 4. 添加到集合中去
                    String fileName = f.getName();
                    if (fileName.endsWith(".jpg") || fileName.endsWith(".png")
                            || fileName.endsWith(".gif")) {
                        mlist.add(f);//如果是这几种图片格式就添加进去
                    }
                }
            }
        }
    }
    
    private static void getOneFile(File file, List<File> mlist) {
        // 1.获取子目录
        File[] files = file.listFiles();
        // 2.判断files是否是空的 否则程序崩溃
        if (files != null) {
            for (File f : files) {
            	// 4. 添加到集合中去
                String fileName = f.getName();
                if (fileName.endsWith(".jpg") || fileName.endsWith(".png")|| fileName.endsWith(".gif")) {
                    mlist.add(f);//如果是这几种图片格式就添加进去
                }
            }
        }
    }
}
