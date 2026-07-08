package com.ss.android.ugc.aweme.feed.model.trendingtopic;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes32.dex */
public final class VideoTrendingTopic implements Serializable {

    @C09CT("event_id")
    public long eventId;

    @C09CT("event_img")
    public String eventImg;

    @C09CT("event_name")
    public String eventName;

    @C09CT("extra")
    public String extra;

    @C09CT("total_videos")
    public long totalVideos;

    @C09CT("total_views")
    public long totalViews;

    public VideoTrendingTopic() {
        this(0L, "", 0L, 0L, "", "");
    }

    public final void setEventId(long j) {
        this.eventId = j;
    }

    public final void setEventImg(String str) {
        this.eventImg = str;
    }

    public final void setEventName(String str) {
        this.eventName = str;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setTotalVideos(long j) {
        this.totalVideos = j;
    }

    public final void setTotalViews(long j) {
        this.totalViews = j;
    }

    public VideoTrendingTopic(long j, String str, long j2, long j3, String str2, String str3) {
        this.eventId = j;
        this.eventName = str;
        this.totalViews = j2;
        this.totalVideos = j3;
        this.eventImg = str2;
        this.extra = str3;
    }
}
