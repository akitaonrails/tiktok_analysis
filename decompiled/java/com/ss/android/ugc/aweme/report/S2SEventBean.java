package com.ss.android.ugc.aweme.report;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class S2SEventBean {

    @C09CT("advertising_id")
    public final String advertisingId;

    @C09CT("android_id")
    public final String androidId;

    @C09CT("event_time")
    public final Long eventTime;

    @C09CT("extra_info")
    public final String extraInfo;

    @C09CT("gaid")
    public final String gAid;

    @C09CT("ip")
    public final String ip;

    @C09CT("os_type")
    public final Integer osType;

    @C09CT("outreach_intention_type")
    public final String outreachIntentionType;

    @C09CT("outreach_key")
    public final String outreachKey;

    @C09CT("outreach_type")
    public final String outreachType;

    @C09CT("s2s_event_type")
    public final Integer s2sEventType;

    @C09CT("sim_region")
    public final String simRegion;

    @C09CT("to_app_id")
    public final String toAppId;

    @C09CT("user_agent")
    public final String userAgent;

    public S2SEventBean() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public S2SEventBean(String str, String str2, Integer num, String str3, String str4, Long l, Integer num2, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.outreachType = str;
        this.outreachKey = str2;
        this.s2sEventType = num;
        this.outreachIntentionType = str3;
        this.toAppId = str4;
        this.eventTime = l;
        this.osType = num2;
        this.simRegion = str5;
        this.ip = str6;
        this.userAgent = str7;
        this.advertisingId = str8;
        this.androidId = str9;
        this.gAid = str10;
        this.extraInfo = str11;
    }
}
