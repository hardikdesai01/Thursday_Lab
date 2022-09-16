package ThursDayLab;

import java.io.*; 
	  
public class TodayTest
	{ 
	    public static void main(String[] args)throws IOException  {
	    		
	     
	        File file = new File("C:\\NGCCA\\mihir.txt"); 
	        FileInputStream fileStream = new FileInputStream(file); 
	        InputStreamReader input = new InputStreamReader(fileStream); 
	        BufferedReader reader = new BufferedReader(input); 
	          
	        String line; 
	          
	        // Initializing counters 
	        int countWords = 0; 
	        int sentenceCount = 0; 
	        int characterCount = 0; 
	        int paragraphCount = 1; 
	        int whitespacesCount = 0; 
	          
	        // Reading line by line from the  
	        // file until a null is returned 
	        while((line = reader.readLine()) != null) 
	        { 
	            if(line.equals("")) 
	            { 
	                paragraphCount++; 
	            } 
	            if(!(line.equals(""))) 
	            { 
	                  
	                characterCount += line.length(); 
	                  
	                // \s+ is the space delimiter in java 
	                String[] wordList = line.split("/s+"); 
	                  
	                countWords += wordList.length; 
	                whitespacesCount += countWords -1; 
	                  
	                // [!?.:]+ is the sentence delimiter in java 
	                String[] sentenceList = line.split("[!?.:]+"); 
	                  
	                sentenceCount += sentenceList.length; 
	            } 
	        } 
	          
	        System.out.println("Total word count = " + countWords); 
	        System.out.println("Total number of sentences = " + sentenceCount); 
	        System.out.println("Total number of characters = " + characterCount); 
	        System.out.println("Number of paragraphs = " + paragraphCount); 
	        System.out.println("Total number of whitespaces = " + whitespacesCount); 
	    } 
	}