package com.ss.android.ugc.aweme.commercialize.adsetting;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class AdSettingsData {

    @C09CT("code_status")
    public final Integer codeStatus;

    @C09CT("dark_post_source")
    public final Integer darkPostSource;

    @C09CT("dark_post_status")
    public final Integer darkPostStatus;

    @C09CT("end_time")
    public final Long endTime;

    @C09CT("promotable")
    public final Boolean promotable;

    @C09CT("start_time")
    public final Long startTime;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    @C09CT("video_code")
    public final String videoCode;

    public AdSettingsData(Integer num, String str, Boolean bool, Integer num2, Integer num3, String str2, Integer num4, Long l, Long l2) {
        this.statusCode = num;
        this.statusMsg = str;
        this.promotable = bool;
        this.darkPostStatus = num2;
        this.darkPostSource = num3;
        this.videoCode = str2;
        this.codeStatus = num4;
        this.startTime = l;
        this.endTime = l2;
    }
}
