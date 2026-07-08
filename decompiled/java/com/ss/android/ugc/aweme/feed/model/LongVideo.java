package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class LongVideo implements Serializable {

    @C09CT("long_video_type")
    public int longVideoType;

    @C09CT("trailer_start_time")
    public int trailerStartTime;

    @C09CT("video")
    public Video video;

    @C09CT("video_control")
    public VideoControl videoControl;

    public int getLongVideoType() {
        return this.longVideoType;
    }

    public int getTrailerStartTime() {
        return this.trailerStartTime;
    }

    public Video getVideo() {
        return this.video;
    }

    public VideoControl getVideoControl() {
        return this.videoControl;
    }

    public void setLongVideoType(int i) {
        this.longVideoType = i;
    }

    public void setTrailerStartTime(int i) {
        this.trailerStartTime = i;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public void setVideoControl(VideoControl videoControl) {
        this.videoControl = videoControl;
    }
}
