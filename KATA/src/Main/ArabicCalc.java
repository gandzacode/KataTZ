package Main;

class ArabicCalc {
    static public String arabicCalc(String figure1, String operator ,String figure2) throws MyExceptions {

        if(Integer.parseInt(figure1)>10|Integer.parseInt(figure2)>10){
            throw new MyExceptions();
        }

        if(operator.charAt(0) != '+'& operator.charAt(0) != '-'&operator.charAt(0) != '*'&operator.charAt(0) != '/'){
            throw new MyExceptions();
        }

        String result = null;

        switch (operator)  {
            case "+":
                String result1 = "" + (Integer.parseInt(figure1) + Integer.parseInt(figure2));
                System.out.println(Integer.parseInt(figure1) + Integer.parseInt(figure2));
                result = result1;
                break;
            case "-":
                String result2 = "" + (Integer.parseInt(figure1) - Integer.parseInt(figure2));
                System.out.println(Integer.parseInt(figure1) - Integer.parseInt(figure2));
                result = result2;
                break;
            case "*":
                String result3 = "" + (Integer.parseInt(figure1) * Integer.parseInt(figure2));
                System.out.println(Integer.parseInt(figure1) * Integer.parseInt(figure2));
                result = result3;
                break;
            case "/":
                String result4 = "" + (Integer.parseInt(figure1) / Integer.parseInt(figure2));
                System.out.println(Integer.parseInt(figure1) / Integer.parseInt(figure2));
                result = result4;
                break;
        }
        return result;
    }
}
