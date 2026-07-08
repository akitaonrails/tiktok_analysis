package com.ss.android.ugc.aweme.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class VideoConfigInfo implements Serializable {

    @C09CT("need_report_othershow")
    public final Boolean needReportOthershow;

    @C09CT("not_hidden_when_unvisible")
    public final Boolean notHiddenWhenUnvisible;

    @C09CT("show_resource_ready")
    public final Boolean showResourceReady;

    @C09CT("use_Anole_hidden_config")
    public final Boolean useAnoleHiddenConfig;

    @C09CT("video_corner")
    public final Integer videoCorner;

    @C09CT("video_layout_in_contentView")
    public final Boolean videoLayoutInContentView;

    @C09CT("video_layout")
    public final VideoLayoutInfo videoLayoutInfo;

    @C09CT("video_resume_when_visible")
    public final Boolean videoResumeWhenVisible;

    @C09CT("video_touch_enable")
    public final Boolean videoTouchEnable;

    public VideoConfigInfo() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoConfigInfo)) {
            return false;
        }
        VideoConfigInfo videoConfigInfo = (VideoConfigInfo) obj;
        return Intrinsics.LJFF(this.videoCorner, videoConfigInfo.videoCorner) && Intrinsics.LJFF(this.videoTouchEnable, videoConfigInfo.videoTouchEnable) && Intrinsics.LJFF(this.needReportOthershow, videoConfigInfo.needReportOthershow) && Intrinsics.LJFF(this.videoResumeWhenVisible, videoConfigInfo.videoResumeWhenVisible) && Intrinsics.LJFF(this.notHiddenWhenUnvisible, videoConfigInfo.notHiddenWhenUnvisible) && Intrinsics.LJFF(this.showResourceReady, videoConfigInfo.showResourceReady) && Intrinsics.LJFF(this.useAnoleHiddenConfig, videoConfigInfo.useAnoleHiddenConfig) && Intrinsics.LJFF(this.videoLayoutInfo, videoConfigInfo.videoLayoutInfo) && Intrinsics.LJFF(this.videoLayoutInContentView, videoConfigInfo.videoLayoutInContentView);
    }

    public int hashCode() {
        Integer num = this.videoCorner;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.videoTouchEnable;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.needReportOthershow;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.videoResumeWhenVisible;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.notHiddenWhenUnvisible;
        int iHashCode5 = (iHashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.showResourceReady;
        int iHashCode6 = (iHashCode5 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.useAnoleHiddenConfig;
        int iHashCode7 = (iHashCode6 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        VideoLayoutInfo videoLayoutInfo = this.videoLayoutInfo;
        int iHashCode8 = (iHashCode7 + (videoLayoutInfo == null ? 0 : videoLayoutInfo.hashCode())) * 31;
        Boolean bool7 = this.videoLayoutInContentView;
        return iHashCode8 + (bool7 != null ? bool7.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoConfigInfo(videoCorner=");
        sbLIZ.append(this.videoCorner);
        sbLIZ.append(", videoTouchEnable=");
        sbLIZ.append(this.videoTouchEnable);
        sbLIZ.append(", needReportOthershow=");
        sbLIZ.append(this.needReportOthershow);
        sbLIZ.append(", videoResumeWhenVisible=");
        sbLIZ.append(this.videoResumeWhenVisible);
        sbLIZ.append(", notHiddenWhenUnvisible=");
        sbLIZ.append(this.notHiddenWhenUnvisible);
        sbLIZ.append(", showResourceReady=");
        sbLIZ.append(this.showResourceReady);
        sbLIZ.append(", useAnoleHiddenConfig=");
        sbLIZ.append(this.useAnoleHiddenConfig);
        sbLIZ.append(", videoLayoutInfo=");
        sbLIZ.append(this.videoLayoutInfo);
        sbLIZ.append(", videoLayoutInContentView=");
        sbLIZ.append(this.videoLayoutInContentView);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VideoConfigInfo(Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, VideoLayoutInfo videoLayoutInfo, Boolean bool7) {
        this.videoCorner = num;
        this.videoTouchEnable = bool;
        this.needReportOthershow = bool2;
        this.videoResumeWhenVisible = bool3;
        this.notHiddenWhenUnvisible = bool4;
        this.showResourceReady = bool5;
        this.useAnoleHiddenConfig = bool6;
        this.videoLayoutInfo = videoLayoutInfo;
        this.videoLayoutInContentView = bool7;
    }
}
