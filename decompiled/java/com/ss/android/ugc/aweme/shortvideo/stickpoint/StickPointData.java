package com.ss.android.ugc.aweme.shortvideo.stickpoint;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class StickPointData implements Serializable {

    @C09CT("ai_cut_id")
    public String aiCutId;

    @C09CT("video_count")
    public Integer videoCount = 0;

    @C09CT("video_cut_len_list")
    public String videoCutLenListStr;

    @C09CT("video_cut_start_time")
    public String videoCutStartTimeListStr;

    @C09CT("video_id")
    public String videoId;

    @C09CT("video_src_len_list")
    public String videoSrcLenListStr;

    public final String getAiCutId() {
        return this.aiCutId;
    }

    public final Integer getVideoCount() {
        return this.videoCount;
    }

    public final String getVideoCutLenListStr() {
        return this.videoCutLenListStr;
    }

    public final String getVideoCutStartTimeListStr() {
        return this.videoCutStartTimeListStr;
    }

    public final String getVideoId() {
        return this.videoId;
    }

    public final String getVideoSrcLenListStr() {
        return this.videoSrcLenListStr;
    }

    public final void setAiCutId(String str) {
        this.aiCutId = str;
    }

    public final void setVideoCount(Integer num) {
        this.videoCount = num;
    }

    public final void setVideoCutLenListStr(String str) {
        this.videoCutLenListStr = str;
    }

    public final void setVideoCutStartTimeListStr(String str) {
        this.videoCutStartTimeListStr = str;
    }

    public final void setVideoId(String str) {
        this.videoId = str;
    }

    public final void setVideoSrcLenListStr(String str) {
        this.videoSrcLenListStr = str;
    }
}
