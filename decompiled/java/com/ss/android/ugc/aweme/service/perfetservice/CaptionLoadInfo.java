package com.ss.android.ugc.aweme.service.perfetservice;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes32.dex */
public final class CaptionLoadInfo implements Serializable {

    @C09CT("cla_subtitle_id")
    public final String claSubtitleId;

    @C09CT("error_msg")
    public final String errorMsg;

    @C09CT("first_caption_load_to_display_time")
    public int firstCaptionLoadToDisplayTime;

    @C09CT("language_code")
    public final String languageCode;

    @C09CT("load_duration")
    public final int loadDuration;

    @C09CT("load_result")
    public final String loadResult;

    @C09CT("sub_id")
    public final String subId;

    @C09CT("timestamp")
    public final long timestamp;

    @C09CT("type")
    public final String type;

    public final void setFirstCaptionLoadToDisplayTime(int i) {
        this.firstCaptionLoadToDisplayTime = i;
    }

    public CaptionLoadInfo(String str, String str2, String str3, String str4, int i, String str5, String str6, int i2, long j) {
        this.languageCode = str;
        this.subId = str2;
        this.claSubtitleId = str3;
        this.loadResult = str4;
        this.loadDuration = i;
        this.errorMsg = str5;
        this.type = str6;
        this.firstCaptionLoadToDisplayTime = i2;
        this.timestamp = j;
    }
}
