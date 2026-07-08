package com.ss.android.ugc.aweme.live.pcs.course.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class PostSMBCourseVideoRequestCopy implements Serializable {
    public static final int $stable = 8;

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("course_id")
    public long courseId;

    @C09CT("cover_info")
    public SMBCoverInfoCopy coverInfo;

    @C09CT("cover_text_attr")
    public String coverTextAttr;

    @C09CT("cover_text_uri")
    public String coverTextUri;

    @C09CT("cover_tsp")
    public double coverTsp;

    @C09CT("duration")
    public double duration;

    @C09CT("is_cover_positioned")
    public long isCoverPositioned;

    @C09CT("is_cover_text")
    public long isCoverText;

    @C09CT("title")
    public String title;

    @C09CT("video_count")
    public long videoCount;

    @C09CT("video_height")
    public long videoHeight;

    @C09CT("video_id")
    public String videoId;

    @C09CT("video_width")
    public long videoWidth;

    public PostSMBCourseVideoRequestCopy() {
        this(0L, 0L, "", 0L, 0L, 0L, 0.0d, null, "", 0L, 0L, "", "", 0.0d);
    }

    public final long isCoverPositioned() {
        return this.isCoverPositioned;
    }

    public final long isCoverText() {
        return this.isCoverText;
    }

    public final void setAnchorId(long j) {
        this.anchorId = j;
    }

    public final void setCourseId(long j) {
        this.courseId = j;
    }

    public final void setCoverInfo(SMBCoverInfoCopy sMBCoverInfoCopy) {
        this.coverInfo = sMBCoverInfoCopy;
    }

    public final void setCoverPositioned(long j) {
        this.isCoverPositioned = j;
    }

    public final void setCoverText(long j) {
        this.isCoverText = j;
    }

    public final void setCoverTextAttr(String str) {
        this.coverTextAttr = str;
    }

    public final void setCoverTextUri(String str) {
        this.coverTextUri = str;
    }

    public final void setCoverTsp(double d) {
        this.coverTsp = d;
    }

    public final void setDuration(double d) {
        this.duration = d;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setVideoCount(long j) {
        this.videoCount = j;
    }

    public final void setVideoHeight(long j) {
        this.videoHeight = j;
    }

    public final void setVideoId(String str) {
        this.videoId = str;
    }

    public final void setVideoWidth(long j) {
        this.videoWidth = j;
    }

    public PostSMBCourseVideoRequestCopy(long j, long j2, String str, long j3, long j4, long j5, double d, SMBCoverInfoCopy sMBCoverInfoCopy, String str2, long j6, long j7, String str3, String str4, double d2) {
        this.anchorId = j;
        this.courseId = j2;
        this.videoId = str;
        this.videoWidth = j3;
        this.videoHeight = j4;
        this.videoCount = j5;
        this.duration = d;
        this.coverInfo = sMBCoverInfoCopy;
        this.title = str2;
        this.isCoverText = j6;
        this.isCoverPositioned = j7;
        this.coverTextAttr = str3;
        this.coverTextUri = str4;
        this.coverTsp = d2;
    }
}
