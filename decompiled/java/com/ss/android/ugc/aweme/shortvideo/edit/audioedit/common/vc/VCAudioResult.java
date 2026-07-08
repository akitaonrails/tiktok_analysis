package com.ss.android.ugc.aweme.shortvideo.edit.audioedit.common.vc;

import X.C09CT;

/* JADX INFO: loaded from: classes30.dex */
public final class VCAudioResult {

    @C09CT("data")
    public final String data;

    @C09CT("original_vid")
    public final String originalVid;

    @C09CT("sami_status")
    public final Integer samiStatus;

    @C09CT("speaker")
    public final String speaker;

    @C09CT("task_id")
    public final String taskId;

    @C09CT("url")
    public final String url;

    @C09CT("vid")
    public final String vid;

    public VCAudioResult(String str, String str2, String str3, String str4, String str5, String str6, Integer num) {
        this.data = str;
        this.taskId = str2;
        this.url = str3;
        this.speaker = str4;
        this.vid = str5;
        this.originalVid = str6;
        this.samiStatus = num;
    }
}
