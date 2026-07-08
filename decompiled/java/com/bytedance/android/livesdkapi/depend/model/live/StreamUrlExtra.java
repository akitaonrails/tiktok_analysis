package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public class StreamUrlExtra {
    public int LIZ;
    public int LIZIZ;
    public boolean LIZJ;

    @C09CT("anchor_interact_profile")
    public int anchorInteractProfile;

    @C09CT("audience_interact_profile")
    public int audienceInteractProfile;

    @C09CT("bitrate_adapt_strategy")
    public int bitrateAdaptStrategy;

    @C09CT("bytevc1_enable")
    public boolean enableByteVC1;

    @C09CT("hardware_encode")
    public boolean hardwareEncode;

    @C09CT("roi")
    public boolean isRoi;

    @C09CT("sw_roi")
    public boolean isSwRoi;

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

    public final int LIZ() {
        if (this.height == 0) {
            this.height = 640;
        }
        return this.height;
    }

    public final int LIZIZ() {
        if (this.maxBitrate == 0) {
            if (this.defaultBitrate == 0) {
                this.defaultBitrate = 500;
            }
            int i = this.defaultBitrate * 2;
            if (this.minBitrate == 0) {
                this.minBitrate = 200;
            }
            this.maxBitrate = i - this.minBitrate;
        }
        return this.maxBitrate;
    }

    public final int LIZJ() {
        if (this.width == 0) {
            this.width = 360;
        }
        return this.width;
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class SrConfig {
        public boolean LIZ;

        @C09CT("antialiasing")
        public boolean antiAlias;

        @C09CT("enable")
        public boolean enabled;

        @C09CT("strength")
        public int strength;

        public SrConfig() {
            this(false, false, 0);
        }

        public SrConfig(boolean z, boolean z2, int i) {
            this.enabled = z;
            this.antiAlias = z2;
            this.strength = i;
        }
    }
}
