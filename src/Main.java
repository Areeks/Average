class Average {

    int[] arr;
    int size;
    public Average (int n)
    {
        if(n>0 && n<=20) {
            this.size = n;
            this.arr = new int[size];
            for (int i = 0; i < size; i++) {
                this.arr[i] = (int) Math.floor(Math.random() * (6 - 1 + 1) + 1);
            }
            System.out.println(size + " random ratings were generated, ranging from 1 to 6");
        }
        else
            System.out.println("Wrong range");
    }

    public double Calculate()
    {
        int sum = 0;
        for (int i=0; i<size; i++)
            sum+=arr[i];

        return (double)sum/size;
    }

    public void Display()
    {
        System.out.println("Randomly generated "+size+ " numbers degree in range from 1 to 6 is: ");
        for (int i = 0; i < size; i++)
            System.out.print(arr[i]+", ");
        System.out.println();
    }

}

public class Main {
    public static void main(String[] args) {

        Average av = new Average(20);
        av.Display();
        System.out.println("Average from generated degrees is: " + av.Calculate());

        System.out.println();

        Average av1 = new Average(5);
        av1.Display();
        System.out.println("Average from generated degrees is: " + av1.Calculate());

    }
}