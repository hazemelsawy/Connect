package com.example.connectapp.models;


public class Chat {

    private boolean seen;
    private long time_stamp;

    public Chat() {
    }

    public Chat(boolean seen, long time_stamp) {
        this.seen = seen;
        this.time_stamp = time_stamp;
    }

    public boolean isSeen() {
        return seen;
    }

    public void setSeen(boolean seen) {
        this.seen = seen;
    }

    public long getTime_stamp() {
        return time_stamp;
    }

    public void setTime_stamp(long time_stamp) {
        this.time_stamp = time_stamp;
    }
}
