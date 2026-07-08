package com.ss.android.ugc.aweme.discover.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class Position implements Serializable {

    @C09CT("begin")
    public int begin;

    @C09CT("end")
    public int end;

    public Position() {
    }

    public int getBegin() {
        return this.begin;
    }

    public int getEnd() {
        return this.end;
    }

    public void setBegin(int i) {
        this.begin = i;
    }

    public void setEnd(int i) {
        this.end = i;
    }

    public Position(int i, int i2) {
        setBegin(i);
        setEnd(i2);
    }
}
