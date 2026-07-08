package com.ss.android.ugc.aweme.audiorecord;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public final class Point implements Serializable {

    @C09CT("time")
    public long t;

    @C09CT("x")
    public int x;

    @C09CT("y")
    public int y;

    public final long getT() {
        return this.t;
    }

    public final int getX() {
        return this.x;
    }

    public final int getY() {
        return this.y;
    }

    public final boolean isEqual(Point point) {
        if (this.x == point.x && this.y == point.y && this.t == point.t) {
            return true;
        }
        return false;
    }

    public final void setT(long j) {
        this.t = j;
    }

    public final void setX(int i) {
        this.x = i;
    }

    public final void setY(int i) {
        this.y = i;
    }

    public Point(int i, int i2, long j) {
        this.x = i;
        this.y = i2;
        this.t = j;
    }
}
