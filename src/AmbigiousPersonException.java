public class AmbigiousPersonException extends Exception{
    public String path1;
    public String path2;

    public AmbigiousPersonException(String name) {
    }

    public AmbigiousPersonException(String name, String path1, String path2){
        super(String.format("Person named %s is ambigious.", name));
        this.path1 = path1;
        this.path2 = path2;

    }
}
