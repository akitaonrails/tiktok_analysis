package com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class Position {

    @C09CT("begin")
    public final int begin;

    @C09CT("end")
    public final int end;

    public final boolean LIZ() {
        int i = this.end;
        int i2 = this.begin;
        return i2 >= 0 && i2 <= i;
    }

    public Position(int i, int i2) {
        this.begin = i;
        this.end = i2;
    }
}
