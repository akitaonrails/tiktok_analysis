package com.ss.android.ugc.aweme.live.pcs.course.model;

import X.C09CT;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class SMBCourseVideoCopy implements Serializable {
    public static final int $stable = 8;

    @C09CT("audio_review_result")
    public int audioReviewResult;

    @C09CT("audio_review_status")
    public int audioReviewStatus;

    @C09CT("aweme_struct_str")
    public String awemeStructStr;

    @C09CT("course_id")
    public long courseId;

    @C09CT("item_id")
    public long itemId;

    @C09CT("need_confirm_audio")
    public boolean needConfirmAudio;

    @C09CT("position")
    public int position;

    @C09CT("publish_status")
    public int publishStatus;

    @C09CT("video_action_list")
    public List<Object> videoActionCopyList;

    @C09CT("video_duration")
    public long videoDuration;

    @C09CT("video_id")
    public long videoId;

    @C09CT("video_review_status")
    public int videoReviewStatus;

    @C09CT("view_count")
    public long viewCount;

    public SMBCourseVideoCopy() {
        this(0L, 0L, 0L, 0, 0, "", 0, 0, 0, false, new ArrayList(), 0L, 0L);
    }

    public final void setAudioReviewResult(int i) {
        this.audioReviewResult = i;
    }

    public final void setAudioReviewStatus(int i) {
        this.audioReviewStatus = i;
    }

    public final void setAwemeStructStr(String str) {
        this.awemeStructStr = str;
    }

    public final void setCourseId(long j) {
        this.courseId = j;
    }

    public final void setItemId(long j) {
        this.itemId = j;
    }

    public final void setNeedConfirmAudio(boolean z) {
        this.needConfirmAudio = z;
    }

    public final void setPosition(int i) {
        this.position = i;
    }

    public final void setPublishStatus(int i) {
        this.publishStatus = i;
    }

    public final void setVideoActionCopyList(List<Object> list) {
        this.videoActionCopyList = list;
    }

    public final void setVideoDuration(long j) {
        this.videoDuration = j;
    }

    public final void setVideoId(long j) {
        this.videoId = j;
    }

    public final void setVideoReviewStatus(int i) {
        this.videoReviewStatus = i;
    }

    public final void setViewCount(long j) {
        this.viewCount = j;
    }

    public SMBCourseVideoCopy(long j, long j2, long j3, int i, int i2, String str, int i3, int i4, int i5, boolean z, List<Object> list, long j4, long j5) {
        this.videoId = j;
        this.itemId = j2;
        this.courseId = j3;
        this.position = i;
        this.publishStatus = i2;
        this.awemeStructStr = str;
        this.videoReviewStatus = i3;
        this.audioReviewStatus = i4;
        this.audioReviewResult = i5;
        this.needConfirmAudio = z;
        this.videoActionCopyList = list;
        this.videoDuration = j4;
        this.viewCount = j5;
    }
}
