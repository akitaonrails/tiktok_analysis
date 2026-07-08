package com.ss.android.ugc.aweme.property;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1420160n3m;

/* JADX INFO: loaded from: classes23.dex */
public final class StoryUploadSpeedEncodeSettings implements InterfaceC1420160n3m {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("force_reencode")
    public final int forceReencode;

    @C09CT("max_speed")
    public final int maxSpeed;

    @C09CT("min_speed")
    public final int minSpeed;

    @C09CT("video_hw_bitrate")
    public final int videoBitrate;

    public StoryUploadSpeedEncodeSettings() {
        this(-1, -1, -1, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryUploadSpeedEncodeSettings)) {
            return false;
        }
        StoryUploadSpeedEncodeSettings storyUploadSpeedEncodeSettings = (StoryUploadSpeedEncodeSettings) obj;
        return this.maxSpeed == storyUploadSpeedEncodeSettings.maxSpeed && this.videoBitrate == storyUploadSpeedEncodeSettings.videoBitrate && this.minSpeed == storyUploadSpeedEncodeSettings.minSpeed && this.forceReencode == storyUploadSpeedEncodeSettings.forceReencode;
    }

    public final int hashCode() {
        return (((((this.maxSpeed * 31) + this.videoBitrate) * 31) + this.minSpeed) * 31) + this.forceReencode;
    }

    @Override // X.InterfaceC1420160n3m
    public final void setIndex(int i) {
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryUploadSpeedEncodeSettings(maxSpeed=");
        sbLIZ.append(this.maxSpeed);
        sbLIZ.append(", videoBitrate=");
        sbLIZ.append(this.videoBitrate);
        sbLIZ.append(", minSpeed=");
        sbLIZ.append(this.minSpeed);
        sbLIZ.append(", forceReencode=");
        sbLIZ.append(this.forceReencode);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1420160n3m
    public final int LIZ() {
        return this.maxSpeed;
    }

    public StoryUploadSpeedEncodeSettings(int i, int i2, int i3, int i4) {
        this.maxSpeed = i;
        this.videoBitrate = i2;
        this.minSpeed = i3;
        this.forceReencode = i4;
    }
}
