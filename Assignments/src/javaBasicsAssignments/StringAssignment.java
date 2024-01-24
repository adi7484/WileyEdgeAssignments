package javaBasicsAssignments;

public class StringAssignment {
	 
	
	public static String dashPrint(String input) {
	        
	        char[] charArray = input.toCharArray();

	        
	        for (int i = 0, j = charArray.length - 1; i < j; i++, j--) {
	            char temp = charArray[i];
	            charArray[i] = charArray[j];
	            charArray[j] = temp;
	        }

	        
	        return new String(charArray).replaceAll("", "-").substring(0, input.length() * 2 );
	    }
	
	public static String removex(String input) {
		 
        String stringWithoutX = input.replace("x", "");

        int countX = input.length() - stringWithoutX.length();

        String result = stringWithoutX;
        for (int i = 0; i < countX; i++) {
            result += "x";
        }

        return result;
    }
	 
	public static String reverseFirstLast(String input) {
		
		String replacedFirst = input.substring(input.length() - 1) + input.substring(1, input.length() - 1) + input.substring(0, 1);

        return replacedFirst;
	}
	
	public static String shortForms(String input) {
        
        String[] words = input.split("\\s+");

        
        String initials = "";

        
        for (String word : words) {
            if (!word.isEmpty()) {
                initials += word.charAt(0);
            }
        }

        return initials;
    }
	
   public static String findMax(String input) {
       
        String[] words = input.split("\\s+");
        
       
        int maxLength = 0;
        String maxSubstring = "";

        
        for (String word : words) {
        	 if (word.length() > maxLength || (word.length() == maxLength && input.indexOf(word) < input.indexOf(maxSubstring))) {
                maxLength = word.length();
                maxSubstring = word;
            }
        }

        return maxSubstring;
    }
   
   
   public static String secondShort(String input) {
       
	   String[] words = input.split(" ");

       
       String result = "";

     
       for (int i = 0; i < words.length; i++) {
        
           if (i < words[i].length()) {
           
               result += words[i].charAt(i);
           }
       }

       
       result = result.toUpperCase();
       return result;
   }
   
   public static String getNextCharacter(String inputString) {
       StringBuilder result = new StringBuilder();

       for (char ch : inputString.toCharArray()) {
           if (Character.isLetter(ch)) {
               
               if (Character.isLowerCase(ch)) {
                   result.append((char) ((ch - 'a' + 1) % 26 + 'a'));
               } else {
                   result.append((char) ((ch - 'A' + 1) % 26 + 'A'));
               }
           } else {
               
               result.append(ch);
           }
       }

       return result.toString();
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="computer";
		
		 String res1=dashPrint(str1);
		 System.out.println("Assignment 1 output: " +res1);
		 
		 
		 String str2="abcxXXcxerxxXXwer";
		
		 String res2=removex(str2);
		 System.out.println("Assignment 2 output: " +res2);
		 
		 String str3="Hello World";
		 
		 String res3=reverseFirstLast(str3);
		 System.out.println("Assignment 3 output: " +res3);
		 
		 String str4="Hi How are you";
		 
		 String res4=findMax(str4);
		 System.out.println("Assignment 4 output: " +res4);
		 
		 String str5="Softra Services Limited";
		 
		 String res5=shortForms(str5);
		 System.out.println("Assignment 5 output: " +res5);
		 
		 String str6="Softra Services Limited";
		 
		 String res6=secondShort(str6);
		 System.out.println("Assignment 6 output: " +res6);
		 
		 String str7 = "hello java";
		 String res7 = getNextCharacter(str7);
		 System.out.println("Assignment 6 output: " +res7);
	}

}
