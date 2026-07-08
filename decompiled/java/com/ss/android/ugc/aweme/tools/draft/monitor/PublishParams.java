package com.ss.android.ugc.aweme.tools.draft.monitor;

import X.C09CT;
import X.C570430MYv;

/* JADX INFO: loaded from: classes9.dex */
public final class PublishParams extends C570430MYv {

    @C09CT("awemeType")
    public final int awemeType;

    @C09CT("isDraft")
    public final boolean isDraft;

    @C09CT("preview_video_duration")
    public final int previewVideoDuration;

    @C09CT("publishId")
    public final String publishId;

    @C09CT("vid")
    public final String vid;

    public PublishParams(int i, boolean z, String str, String str2, int i2) {
        this.awemeType = i;
        this.isDraft = z;
        this.vid = str;
        this.publishId = str2;
        this.previewVideoDuration = i2;
    }
}
