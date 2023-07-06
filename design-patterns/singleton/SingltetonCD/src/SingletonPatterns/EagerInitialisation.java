package SingletonPatterns;

public class EagerInitialisation {
    // creates the single instance on the object
    private static final EagerInitialisation INITIALISATION = new EagerInitialisation();

    private EagerInitialisation(){
        System.out.println("creating the instance on class load");
    }

    public static EagerInitialisation getInitialisation(){
        System.out.println("returning the static instance in eager initialisation");
        return INITIALISATION;
    }

}
