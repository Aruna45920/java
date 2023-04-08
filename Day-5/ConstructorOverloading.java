class ConstructorOverloading
{
    public static void main(String args[])
    {
    Sample s1=new Sample("Aruna",10,20);
}
}
class Sample{
    Sample()
    {
        System.out.println("empty constructor");
    }
    Sample(int a)
    {
        System.out.println("Passing one parameter");
    }
    Sample(String s,int a,int b)
    {
        System.out.println("passing three parameters");
    }
    }
