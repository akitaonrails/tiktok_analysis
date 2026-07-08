package com.ss.android.ugc.playerkit.model.bright;

/* JADX INFO: loaded from: classes24.dex */
public class EnvBrightCondition {
    public String name;
    public int start = Integer.MIN_VALUE;
    public int end = Integer.MAX_VALUE;

    public int getEnd() {
        return this.end;
    }

    public String getName() {
        return this.name;
    }

    public int getStart() {
        return this.start;
    }

    public void setEnd(int i) {
        this.end = i;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setStart(int i) {
        this.start = i;
    }
}
