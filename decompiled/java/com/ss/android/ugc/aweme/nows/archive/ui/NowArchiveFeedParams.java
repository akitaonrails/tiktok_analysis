package com.ss.android.ugc.aweme.nows.archive.ui;

import X.C1866370yfT;
import X.InterfaceC111300bX;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class NowArchiveFeedParams implements Serializable, InterfaceC111300bX {
    public static final C1866370yfT Companion = new Object() { // from class: X.0yfT
    };
    public final String aid;
    public final String enterFrom;
    public final String enterPosition;
    public final long landingPostTime;

    public NowArchiveFeedParams() {
        this(0L, "", null, null);
    }

    public final String getAid() {
        return this.aid;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterPosition() {
        return this.enterPosition;
    }

    public final long getLandingPostTime() {
        return this.landingPostTime;
    }

    public NowArchiveFeedParams(long j, String str, String str2, String str3) {
        this.landingPostTime = j;
        this.aid = str;
        this.enterFrom = str2;
        this.enterPosition = str3;
    }
}
