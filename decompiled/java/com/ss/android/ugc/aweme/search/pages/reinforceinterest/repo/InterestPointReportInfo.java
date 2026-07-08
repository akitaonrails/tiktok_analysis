package com.ss.android.ugc.aweme.search.pages.reinforceinterest.repo;

import X.C09CT;
import X.C674490Qcx;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class InterestPointReportInfo implements Serializable {
    public static final int $stable = 0;
    public static final C674490Qcx Companion = new Object() { // from class: X.0Qcx
    };

    @C09CT("exit_time")
    public final long exitTime;

    @C09CT("exit_type")
    public final int exitType;

    @C09CT("word")
    public final String word;

    public InterestPointReportInfo(String str, int i, long j) {
        this.word = str;
        this.exitType = i;
        this.exitTime = j;
    }
}
