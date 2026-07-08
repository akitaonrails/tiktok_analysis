package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public class LiveStreamUrlExtra implements Serializable {

    @C09CT("anchor_interact_profile")
    public int anchorInteractProfile;

    @C09CT("audience_interact_profile")
    public int audienceInteractProfile;

    @C09CT("bitrate_adapt_strategy")
    public int bitrateAdaptStrategy;

    @C09CT("hardware_encode")
    public boolean hardwareEncode;

    @C09CT("roi")
    public boolean isRoi;

    @C09CT("sw_roi")
    public boolean isSwRoi;
    public int previewHeight;
    public int previewWidth;

    @C09CT("super_resolution")
    public SrConfig srConfig;

    @C09CT("ngb_push_url")
    public String ngbPushUrl = "";

    @C09CT("ngb_push_url_postfix")
    public String ngbPushUrlPrefix = "";

    @C09CT("height")
    public int height = 640;

    @C09CT("width")
    public int width = 360;

    @C09CT("min_bitrate")
    public int minBitrate = 200;

    @C09CT("default_bitrate")
    public int defaultBitrate = 500;

    @C09CT("max_bitrate")
    public int maxBitrate = 800;

    @C09CT("video_profile")
    public int profile = 1;

    @C09CT("fps")
    public int fps = 15;

    @C09CT("gop_sec")
    public float gopSec = 2.0f;

    @C09CT("bframe_enable")
    public boolean enableBFrame = true;

    /* JADX INFO: loaded from: classes.dex */
    public static class SrConfig implements Serializable {

        @C09CT("antialiasing")
        public boolean antiAlias;

        @C09CT("enable")
        public boolean enabled;

        @C09CT("strength")
        public int strength;

        public SrConfig() {
            this(false, false, 0);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SrConfig{enabled=");
            sbLIZ.append(this.enabled);
            sbLIZ.append(", antiAlias=");
            sbLIZ.append(this.antiAlias);
            sbLIZ.append(", strength=");
            sbLIZ.append(this.strength);
            sbLIZ.append('}');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public SrConfig(boolean z, boolean z2, int i) {
            this.enabled = z;
            this.antiAlias = z2;
            this.strength = i;
        }
    }

    public int getDefaultBitrate() {
        if (this.defaultBitrate == 0) {
            this.defaultBitrate = 500;
        }
        return this.defaultBitrate;
    }

    public int getFPS() {
        if (this.fps == 0) {
            this.fps = 15;
        }
        return this.fps;
    }

    public int getHeight() {
        if (this.height == 0) {
            this.height = 640;
        }
        return this.height;
    }

    public int getMaxBitrate() {
        if (this.maxBitrate == 0) {
            this.maxBitrate = (getDefaultBitrate() * 2) - getMinBitrate();
        }
        return this.maxBitrate;
    }

    public int getMinBitrate() {
        if (this.minBitrate == 0) {
            this.minBitrate = 200;
        }
        return this.minBitrate;
    }

    public int getPreviewHeight() {
        int i = this.previewHeight;
        if (i == 0) {
            return 1280;
        }
        return i;
    }

    public int getPreviewWidth() {
        int i = this.previewWidth;
        if (i == 0) {
            return 720;
        }
        return i;
    }

    public int getWidth() {
        if (this.width == 0) {
            this.width = 360;
        }
        return this.width;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveStreamUrlExtra{ngbPushUrl='");
        sbLIZ.append(this.ngbPushUrl);
        sbLIZ.append('\'');
        sbLIZ.append(", ngbPushUrlPrefix='");
        sbLIZ.append(this.ngbPushUrlPrefix);
        sbLIZ.append('\'');
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", minBitrate=");
        sbLIZ.append(this.minBitrate);
        sbLIZ.append(", defaultBitrate=");
        sbLIZ.append(this.defaultBitrate);
        sbLIZ.append(", maxBitrate=");
        sbLIZ.append(this.maxBitrate);
        sbLIZ.append(", profile=");
        sbLIZ.append(this.profile);
        sbLIZ.append(", hardwareEncode=");
        sbLIZ.append(this.hardwareEncode);
        sbLIZ.append(", bitrateAdaptStrategy=");
        sbLIZ.append(this.bitrateAdaptStrategy);
        sbLIZ.append(", fps=");
        sbLIZ.append(this.fps);
        sbLIZ.append(", anchorInteractProfile=");
        sbLIZ.append(this.anchorInteractProfile);
        sbLIZ.append(", audienceInteractProfile=");
        sbLIZ.append(this.audienceInteractProfile);
        sbLIZ.append(", srConfig=");
        sbLIZ.append(this.srConfig);
        sbLIZ.append(", gopSec=");
        sbLIZ.append(this.gopSec);
        sbLIZ.append(", enableBFrame=");
        sbLIZ.append(this.enableBFrame);
        sbLIZ.append(", isRoi=");
        sbLIZ.append(this.isRoi);
        sbLIZ.append(", isSwRoi=");
        sbLIZ.append(this.isSwRoi);
        sbLIZ.append(", previewWidth=");
        sbLIZ.append(this.previewWidth);
        sbLIZ.append(", previewHeight=");
        sbLIZ.append(this.previewHeight);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int getAnchorInteractProfile() {
        return this.anchorInteractProfile;
    }

    public int getAudienceInteractProfile() {
        return this.audienceInteractProfile;
    }

    public int getBitrateAdaptStrategy() {
        return this.bitrateAdaptStrategy;
    }

    public float getGopSec() {
        return this.gopSec;
    }

    public String getNgbPushUrl() {
        return this.ngbPushUrl;
    }

    public String getNgbPushUrlPrefix() {
        return this.ngbPushUrlPrefix;
    }

    public int getProfile() {
        return this.profile;
    }

    public SrConfig getSrConfig() {
        return this.srConfig;
    }

    public boolean isEnableBFrame() {
        return this.enableBFrame;
    }

    public boolean isHardwareEncode() {
        return this.hardwareEncode;
    }

    public boolean isRoi() {
        return this.isRoi;
    }

    public boolean isSwRoi() {
        return this.isSwRoi;
    }

    public void setAnchorInteractProfile(int i) {
        this.anchorInteractProfile = i;
    }

    public void setAudienceInteractProfile(int i) {
        this.audienceInteractProfile = i;
    }

    @C09CT("bitrate_adapt_strategy")
    public void setBitrateAdaptStrategy(int i) {
        this.bitrateAdaptStrategy = i;
    }

    public void setDefaultBitrate(int i) {
        this.defaultBitrate = i;
    }

    @C09CT("bframe_enable")
    public void setEnableBFrame(boolean z) {
        this.enableBFrame = z;
    }

    public void setFPS(int i) {
        this.fps = i;
    }

    @C09CT("gop_sec")
    public void setGopSec(float f) {
        this.gopSec = f;
    }

    public void setHardwareEncode(boolean z) {
        this.hardwareEncode = z;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setMaxBitrate(int i) {
        this.maxBitrate = i;
    }

    public void setMinBitrate(int i) {
        this.minBitrate = i;
    }

    public void setNgbPushUrl(String str) {
        this.ngbPushUrl = str;
    }

    public void setNgbPushUrlPrefix(String str) {
        this.ngbPushUrlPrefix = str;
    }

    public void setProfile(int i) {
        this.profile = i;
    }

    @C09CT("roi")
    public void setRoi(boolean z) {
        this.isRoi = z;
    }

    public void setSrConfig(SrConfig srConfig) {
        this.srConfig = srConfig;
    }

    @C09CT("sw_roi")
    public void setSwRoi(boolean z) {
        this.isSwRoi = z;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
