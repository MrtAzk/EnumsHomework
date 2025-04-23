public enum Days {
    SUNDAY("9:00","17:00"),
    MONDAY("9:00","17:00"),
    TUESDAY("9:00","17:00"),
    WEDNESDAY("9:00","17:00"),
    THURSDAY("9:00","17:00"),
    FRIDAY("9:00","17:00"),
    SATURDAY("9:00","17:00");

    private final String start;
    private final String finish;

    Days(String start,String finish) {
        this.start =start;
        this.finish=finish;
    }

    public String getStart(){
        return this.start;
    }

    public String getFinish(){
        return this.finish;
    }


}
