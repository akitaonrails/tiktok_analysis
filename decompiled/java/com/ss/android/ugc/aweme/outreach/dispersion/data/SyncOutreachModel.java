package com.ss.android.ugc.aweme.outreach.dispersion.data;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes32.dex */
public final class SyncOutreachModel implements Serializable {

    @C09CT("outreach_key")
    public final String key;

    @C09CT("log_id")
    public final String logId;

    @C09CT("trigger_scene")
    public final String outreachScene;

    @C09CT("time")
    public final Long outreachTime;

    @C09CT("outreach_type")
    public final String outreachType;

    @C09CT("session_id")
    public final String sessionId;

    @C09CT("trigger_id")
    public final String triggerId;

    public SyncOutreachModel(String str, String str2, String str3, String str4, Long l, String str5, String str6) {
        this.key = str;
        this.outreachType = str2;
        this.outreachScene = str3;
        this.sessionId = str4;
        this.outreachTime = l;
        this.triggerId = str5;
        this.logId = str6;
    }
}
