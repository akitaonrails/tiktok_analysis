package com.ss.android.ugc.aweme.api;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes15.dex */
public final class VideoInfoFromURLResponse implements Serializable {

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("valid_info")
    public final ValidInfo validInfo;

    @C09CT("video_info")
    public final VideoRelatedInfo videoInfo;

    public VideoInfoFromURLResponse(int i, VideoRelatedInfo videoRelatedInfo, ValidInfo validInfo) {
        this.statusCode = i;
        this.videoInfo = videoRelatedInfo;
        this.validInfo = validInfo;
    }
}
