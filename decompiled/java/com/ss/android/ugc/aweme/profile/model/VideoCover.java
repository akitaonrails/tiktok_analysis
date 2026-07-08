package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class VideoCover implements Serializable {

    @C09CT("offset")
    public Integer offset;

    @C09CT("video")
    public Video video;

    @C09CT("video_id")
    public String videoId;

    public final Integer getOffset() {
        return this.offset;
    }

    public final Video getVideo() {
        return this.video;
    }

    public final String getVideoId() {
        return this.videoId;
    }

    public final void setOffset(Integer num) {
        this.offset = num;
    }

    public final void setVideo(Video video) {
        this.video = video;
    }

    public final void setVideoId(String str) {
        this.videoId = str;
    }
}
