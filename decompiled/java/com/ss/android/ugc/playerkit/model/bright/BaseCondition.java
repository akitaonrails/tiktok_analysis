package com.ss.android.ugc.playerkit.model.bright;

/* JADX INFO: loaded from: classes.dex */
public class BaseCondition<T> {
    public T end;
    public String name;
    public T start;

    public T getEnd() {
        return this.end;
    }

    public String getName() {
        return this.name;
    }

    public T getStart() {
        return this.start;
    }

    public void setEnd(T t) {
        this.end = t;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setStart(T t) {
        this.start = t;
    }
}
