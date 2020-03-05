package bsu_comp152;

public interface Logger { //public is redundant, all interfaces are public
    static String DEFAULT_FILE_NAME = "log.txt";
    void writeLogging(String toLog); //method writelogging, returns void, toLog parameter, just saying it exists
}
