package codewithmosh1;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	    //Hello World
        System.out.println("Hello World");

        // Variables
	    int age = 30;
        System.out.println(age);
        age = 24;
        System.out.println(age);
        int myAge = 23;
        int herAge = myAge;
        System.out.println(herAge);

        // Primitive Types
        byte idade = 30;
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;

        // Reference Types
        Date now = new Date();
        now.getTime();
        System.out.println(now);

        // Reference (cópia da referência) vs Primitive (cópia do valor)
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y);

        Point point1 = new Point(1,1);
        Point point2 = point1;
        System.out.println(point2);
        point1.x = 2;
        System.out.println(point2);

        // Strings
        String message = "    Hello World" + "!!";
        System.out.println(message);
        System.out.println(message.startsWith("Hello"));
        System.out.println(message.length());
        System.out.println(message.indexOf("Hello"));
        System.out.println(message.replace("!!","*")); //target=parameters, "!!"=argument
        System.out.println(message); // String é imutável
        System.out.println(message.trim().toUpperCase());

        // Escape Sequences
        String msg = "Hello \"Nak\"";
        System.out.println(msg);
        msg = "c:\\Windows\\...";
        System.out.println(msg);
        msg = "c:\nWindows\\...";
        System.out.println(msg);
        msg = "c:\tWindows\\...";
        System.out.println(msg);

        // Arrays
        int[] numeros = new int[5]; // antigo
        numeros[0] = 2;
        numeros[1] = 3;
        numeros[2] = 4;
        System.out.println(Arrays.toString(numeros));

        int[] numbers = {7,3,1,5,6};
        // System.out.println(numbers);  // fazendo assim será printado local na memória
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        // Multi-dimensional Arrays
        int[][] numbers2D= {{1,2,3}, {2,3,4}};
        int[][][] numbers3D = new int[2][3][2];
        numbers3D[0][1][1] = 1;
        // deepToString para printar multi-dimensional arrays
        System.out.println(Arrays.deepToString(numbers2D));
        System.out.println(Arrays.deepToString(numbers3D));

        // Constants
        final float PI = 3.14F;
        // pi = 1;

        // Arithmetic Expressions
        int result = 10/3;
        System.out.println(result); // divisão de inteiro resulta em inteiro
        double result2 = (double)10/(double)3;
        System.out.println(result2);

        int a1 = 1;
        int b1 = a1++;
        System.out.println(a1);
        System.out.println(b1);
        int a2 = 1;
        int b2 = ++a2;
        System.out.println(a2);
        System.out.println(b2);
        a1 += 2; // pode ser usado com qualquer operador
        System.out.println(a1);

        //Casting
        //Implicit casting (automático) No data loss
        // byte > short > int > long > float > double
        short q = 1;
        int w = q + 2;
        System.out.println(w);
        double o = 1.1;
        double p = o + 2;
        System.out.println(p);

        //Explicit casting
        double c = 1.1;
        int v = (int)c + 2;
        System.out.println(v);

        String x1 = "10";
        int y1 = Integer.parseInt(x1) + 2;
        System.out.println(y1);

        String x2 = "2.1";
        float y2 = Float.parseFloat(x2) + 2;
        System.out.println(y2);

        // The Math Class
        int result4 = Math.round(1.1F);
        int result5 = (int)Math.ceil(1.1F);
        int result6 = (int)Math.floor(1.1F);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        int result7 = Math.max(10,2);
        System.out.println(result7);

        double result8 = Math.random();
        System.out.println(result8);

        double result9 = Math.random() * 100;
        System.out.println(result9);
        int result10 = (int)Math.round(Math.random() * 100);
        int result11 = (int)Math.random() * 100; // Sempre será Zero, pq será gerado um número de 0 a 1 e perderá as casas decimais
        int result12 = (int)(Math.random() * 100);
        System.out.println(result10);
        System.out.println(result11);
        System.out.println(result12);
        // Número aleatório entre 5 e 13
        int aleatorio = 5 + (int)(Math.random()*(13-5));
        System.out.println(aleatorio);



    }
}
