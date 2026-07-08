package com.bytedance.ies.web.jsbridge2;

import X.C2204811BQx;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes35.dex */
public class TimeLineEvent implements Serializable {
    public final long elapsedTimestamp;
    public final HashMap<String, Object> extra;
    public final String label;
    public final String message;
    public final String time;
    public final long timeInMillis;

    public long getElapsedTimestamp() {
        return this.elapsedTimestamp;
    }

    public HashMap<String, Object> getExtra() {
        return this.extra;
    }

    public String getLabel() {
        return this.label;
    }

    public String getMessage() {
        return this.message;
    }

    public String getTime() {
        return this.time;
    }

    public long getTimeInMillis() {
        return this.timeInMillis;
    }

    public TimeLineEvent(C2204811BQx c2204811BQx) {
        this.label = c2204811BQx.LIZ;
        this.message = null;
        this.time = c2204811BQx.LIZIZ;
        this.extra = c2204811BQx.LJ;
        this.elapsedTimestamp = c2204811BQx.LIZLLL;
        this.timeInMillis = c2204811BQx.LIZJ;
    }
}
