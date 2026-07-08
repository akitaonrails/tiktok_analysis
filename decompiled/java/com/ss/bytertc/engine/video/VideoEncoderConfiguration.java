package com.ss.bytertc.engine.video;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes10.dex */
public class VideoEncoderConfiguration {
    public VideoDimensions dimensions;
    public FrameRate frameRate;
    public int kBitrate;
    public int kMinBitrate;
    public OrientationMode orientationMode;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoEncoderConfiguration{dimensions=");
        sbLIZ.append(this.dimensions);
        sbLIZ.append(", frameRate=");
        sbLIZ.append(this.frameRate);
        sbLIZ.append(", bitrate=");
        sbLIZ.append(this.kBitrate);
        sbLIZ.append(", minBitrate=");
        sbLIZ.append(this.kMinBitrate);
        sbLIZ.append(", orienttationMode=");
        sbLIZ.append(this.orientationMode);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public enum OrientationMode {
        ORIENTATION_MODE_ADAPTIVE(0),
        ORIENTATION_MODE_FIXED_LANDSCAPE(1),
        ORIENTATION_MODE_FIXED_PORTRAIT(2);

        public int value;

        public int getValue() {
            return this.value;
        }

        public static OrientationMode valueOf(String str) {
            return (OrientationMode) C08FF.LIZ(OrientationMode.class, str);
        }

        OrientationMode(int i) {
            this.value = i;
        }
    }

    public VideoEncoderConfiguration(VideoDimensions videoDimensions, FrameRate frameRate, int i, int i2, OrientationMode orientationMode) {
        this.dimensions = videoDimensions;
        this.frameRate = frameRate;
        this.kBitrate = i;
        this.kMinBitrate = i2;
        this.orientationMode = orientationMode;
    }
}
