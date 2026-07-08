package com.ss.android.ugc.aweme.agent.tools.business;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.tako.ccl.model.api.PlaySpeed;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class PlaybackConfig {

    @C09CT("auto_scroll")
    public final Boolean autoScroll;

    @C09CT("clear_display")
    public final Boolean clearDisplay;

    @C09CT("translate_posts")
    public final Boolean openAutoTranslation;

    @C09CT("show_captions")
    public final Boolean openCaptionOfVideo;

    @C09CT("pip")
    public final Boolean openPictureInPic;

    @C09CT("speed")
    public final PlaySpeed speed;

    @C09CT("volume")
    public final Integer volumeOfVideo;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaybackConfig)) {
            return false;
        }
        PlaybackConfig playbackConfig = (PlaybackConfig) obj;
        return this.speed == playbackConfig.speed && Intrinsics.LJFF(this.clearDisplay, playbackConfig.clearDisplay) && Intrinsics.LJFF(this.autoScroll, playbackConfig.autoScroll) && Intrinsics.LJFF(this.openAutoTranslation, playbackConfig.openAutoTranslation) && Intrinsics.LJFF(this.openCaptionOfVideo, playbackConfig.openCaptionOfVideo) && Intrinsics.LJFF(this.volumeOfVideo, playbackConfig.volumeOfVideo) && Intrinsics.LJFF(this.openPictureInPic, playbackConfig.openPictureInPic);
    }

    public final int hashCode() {
        PlaySpeed playSpeed = this.speed;
        int iHashCode = (playSpeed == null ? 0 : playSpeed.hashCode()) * 31;
        Boolean bool = this.clearDisplay;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.autoScroll;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.openAutoTranslation;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.openCaptionOfVideo;
        int iHashCode5 = (iHashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num = this.volumeOfVideo;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool5 = this.openPictureInPic;
        return iHashCode6 + (bool5 != null ? bool5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlaybackConfig(speed=");
        sbLIZ.append(this.speed);
        sbLIZ.append(", clearDisplay=");
        sbLIZ.append(this.clearDisplay);
        sbLIZ.append(", autoScroll=");
        sbLIZ.append(this.autoScroll);
        sbLIZ.append(", openAutoTranslation=");
        sbLIZ.append(this.openAutoTranslation);
        sbLIZ.append(", openCaptionOfVideo=");
        sbLIZ.append(this.openCaptionOfVideo);
        sbLIZ.append(", volumeOfVideo=");
        sbLIZ.append(this.volumeOfVideo);
        sbLIZ.append(", openPictureInPic=");
        sbLIZ.append(this.openPictureInPic);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PlaybackConfig(PlaySpeed playSpeed, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num, Boolean bool5) {
        this.speed = playSpeed;
        this.clearDisplay = bool;
        this.autoScroll = bool2;
        this.openAutoTranslation = bool3;
        this.openCaptionOfVideo = bool4;
        this.volumeOfVideo = num;
        this.openPictureInPic = bool5;
    }
}
