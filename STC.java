import java.util.*;

public class STC extends Object
{
    String type_qualifier;
    String type;
    String name;
    Boolean pre_declared = false;

    Boolean written_to = false;
    Boolean read_from = false;

    public STC(String type_qualifier, String name, Boolean pre_declared)
    {
        this.type_qualifier = type_qualifier;
        this.name = name;
        this.pre_declared = pre_declared;
    }

    public STC(String type_qualifier, String name, String type, Boolean pre_declared)
    {
        this.type_qualifier = type_qualifier;
        this.name = name;
        this.type = type;
    }

    public void addType(String type)
    {
        this.type = type;
    }

    public void write()
    {
        this.written_to = true;
    }

    public void read()
    {
        this.read_from = true;
    }
}