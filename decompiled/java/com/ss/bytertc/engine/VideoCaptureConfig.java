package com.ss.bytertc.engine;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes19.dex */
public class VideoCaptureConfig {
    public CapturePreference capturePreference;
    public int frameRate;
    public int height;
    public int width;

    public VideoCaptureConfig() {
        this.capturePreference = CapturePreference.AUTO;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoCaptureConfig{capturePreference=");
        sbLIZ.append(this.capturePreference);
        sbLIZ.append("width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", frameRate=");
        sbLIZ.append(this.frameRate);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public enum CapturePreference {
        AUTO(0),
        MANUAL(1),
        AUTO_PERFORMANCE(2);

        public int value;

        public int getValue() {
            return this.value;
        }

        public static CapturePreference convertFromInt(int i) {
            return values()[i];
        }

        public static CapturePreference valueOf(String str) {
            return (CapturePreference) C08FF.LIZ(CapturePreference.class, str);
        }

        CapturePreference(int i) {
            this.value = i;
        }
    }

    public VideoCaptureConfig(int i, int i2, int i3) {
        this.capturePreference = CapturePreference.AUTO;
        this.capturePreference = CapturePreference.MANUAL;
        this.width = i;
        this.height = i2;
        this.frameRate = i3;
    }
}
