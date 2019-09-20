package edu.nyu.cs9053.homework3.metadata;

/**
 * User: blangel
 */
public class Processor {   //change <default> to public, because this class will be used in another package, edu.nyu.cs9053.homework3 

    private final boolean strict;

    public Processor(boolean strict) {   //change <default> to public, because this method will be used in another package.
        this.strict = strict;
    }

    public String processMetadata(String metadata) {
        return strict ? String.format("\"%d\"", metadata) : metadata;   //change : to ?, ? to :,because the syntax is b?x:y
    }

}
