package com.ss.bytertc.engine;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes21.dex */
public class SubscribeConfig {
    public int framerate;
    public boolean isScreen;
    public boolean subAudio;
    public int subHeight;
    public boolean subVideo;
    public int subVideoIndex;
    public int subWidth;
    public SVCLayer svcLayer;
    public int videoIndex;

    public SubscribeConfig() {
        this.subVideoIndex = -1;
        this.svcLayer = SVCLayer.DEFAULT;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubscribeConfig{isScreen=");
        sbLIZ.append(this.isScreen);
        sbLIZ.append(", subVideo=");
        sbLIZ.append(this.subVideo);
        sbLIZ.append(", subAudio=");
        sbLIZ.append(this.subAudio);
        sbLIZ.append(", videoIndex=");
        sbLIZ.append(this.videoIndex);
        sbLIZ.append(", svcLayer=");
        sbLIZ.append(this.svcLayer);
        sbLIZ.append(", sub_width=");
        sbLIZ.append(this.subWidth);
        sbLIZ.append(", sub_height=");
        sbLIZ.append(this.subHeight);
        sbLIZ.append(", sub_video_index=");
        sbLIZ.append(this.subVideoIndex);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public enum SVCLayer {
        DEFAULT(0),
        BASE(1),
        MAIN(2),
        HIGH(3);

        public int value;

        public int getValue() {
            return this.value;
        }

        public static SVCLayer convertFromInt(int i) {
            return values()[i];
        }

        public static SVCLayer valueOf(String str) {
            return (SVCLayer) C08FF.LIZ(SVCLayer.class, str);
        }

        SVCLayer(int i) {
            this.value = i;
        }
    }

    public SubscribeConfig(SubscribeConfig subscribeConfig) {
        this.subVideoIndex = -1;
        this.svcLayer = SVCLayer.DEFAULT;
        if (subscribeConfig != null) {
            this.isScreen = subscribeConfig.isScreen;
            this.subVideo = subscribeConfig.subVideo;
            this.subAudio = subscribeConfig.subAudio;
            this.videoIndex = subscribeConfig.videoIndex;
            this.svcLayer = subscribeConfig.svcLayer;
            this.subWidth = subscribeConfig.subWidth;
            this.subHeight = subscribeConfig.subHeight;
            this.subVideoIndex = subscribeConfig.subVideoIndex;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubscribeConfig subscribeConfig = (SubscribeConfig) obj;
        if (this.isScreen == subscribeConfig.isScreen && this.subVideo == subscribeConfig.subVideo && this.subAudio == subscribeConfig.subAudio && this.videoIndex == subscribeConfig.videoIndex && this.svcLayer == subscribeConfig.svcLayer && this.subWidth == subscribeConfig.subWidth && this.subHeight == subscribeConfig.subHeight) {
            return true;
        }
        return false;
    }

    public SubscribeConfig(boolean z, boolean z2, boolean z3, int i) {
        this.subVideoIndex = -1;
        SVCLayer sVCLayer = SVCLayer.DEFAULT;
        this.isScreen = z;
        this.subVideo = z2;
        this.subAudio = z3;
        this.videoIndex = i;
        this.svcLayer = sVCLayer;
        this.subVideoIndex = -1;
    }

    public SubscribeConfig(boolean z, boolean z2, boolean z3, int i, int i2) {
        this.subVideoIndex = -1;
        this.svcLayer = SVCLayer.DEFAULT;
        this.isScreen = z;
        this.subVideo = z2;
        this.subAudio = z3;
        this.videoIndex = i;
        this.svcLayer = SVCLayer.convertFromInt(i2);
        this.subWidth = 0;
        this.subHeight = 0;
        this.subVideoIndex = -1;
    }

    public SubscribeConfig(boolean z, boolean z2, boolean z3, int i, int i2, int i3, int i4, int i5) {
        this.subVideoIndex = -1;
        this.svcLayer = SVCLayer.DEFAULT;
        this.isScreen = z;
        this.subVideo = z2;
        this.subAudio = z3;
        this.videoIndex = i;
        this.svcLayer = SVCLayer.convertFromInt(i2);
        this.subWidth = i3;
        this.subHeight = i4;
        this.subVideoIndex = i5;
    }

    public static SubscribeConfig create(boolean z, boolean z2, boolean z3, int i, int i2, int i3, int i4, int i5) {
        return new SubscribeConfig(z, z2, z3, i, i2, i3, i4, i5);
    }
}
