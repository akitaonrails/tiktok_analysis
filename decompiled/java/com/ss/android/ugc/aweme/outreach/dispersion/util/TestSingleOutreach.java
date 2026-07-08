package com.ss.android.ugc.aweme.outreach.dispersion.util;

import X.C09CT;

/* JADX INFO: loaded from: classes32.dex */
public final class TestSingleOutreach {

    @C09CT("outreach_key")
    public final String outreachKey;

    @C09CT("outreach_type")
    public final String outreachType;

    @C09CT("trigger_scene")
    public String scene;

    @C09CT("session_id")
    public final String sessionId;

    @C09CT("show_time_interval")
    public final String showTimeInterval;

    @C09CT("trigger_id")
    public final String triggerId;

    public TestSingleOutreach(String str, String str2, String str3, String str4, String str5, String str6) {
        this.outreachType = str;
        this.outreachKey = str2;
        this.triggerId = str3;
        this.scene = str4;
        this.sessionId = str5;
        this.showTimeInterval = str6;
    }
}
