package maventest.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {

	public static void main(String[] args) {
		read();
//		write();
		bufferWrite();
	}

	public static void read(){
		try {
			FileReader fr = new FileReader("E:\\test\\fr.txt");
			char[] buff = new char[1024];
			int i = 0;
			while((i = fr.read(buff)) != -1){
				System.out.println(new String(buff,0,i));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void write(){
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("E:\\test\\fr.txt");
			fw = new FileWriter("E:\\test\\fw.txt");
			char[] buff = new char[1024];
			int i = 0;
			while((i = fr.read(buff)) != -1){
				fw.write(buff, 0, i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if(fr != null){
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(fw != null){
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	
	public static void bufferWrite(){
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			fr = new FileReader("E:\\test\\fr.txt");
			fw = new FileWriter("E:\\test\\fw.txt");
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			String line = null;
			while((line = br.readLine()) != null){
				bw.write(line);
				bw.newLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if(br != null){
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(bw != null){
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	
	
}
