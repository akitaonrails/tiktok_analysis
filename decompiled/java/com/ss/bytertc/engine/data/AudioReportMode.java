package com.ss.bytertc.engine.data;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public enum AudioReportMode {
    AUDIO_REPORT_MODE_NORMAL(0),
    AUDIO_REPORT_MODE_DISCONNECT(1),
    AUDIO_REPORT_MODE_RESET(2);

    public int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.AudioReportMode$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$AudioReportMode;

        static {
            int[] iArr = new int[AudioReportMode.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$AudioReportMode = iArr;
            try {
                iArr[AudioReportMode.AUDIO_REPORT_MODE_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioReportMode[AudioReportMode.AUDIO_REPORT_MODE_DISCONNECT.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioReportMode[AudioReportMode.AUDIO_REPORT_MODE_RESET.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$AudioReportMode[ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? "" : "AUDIO_REPORT_MODE_RESET" : "AUDIO_REPORT_MODE_DISCONNECT" : "AUDIO_REPORT_MODE_NORMAL";
    }

    public int value() {
        return this.value;
    }

    public static AudioReportMode fromId(int i) {
        for (AudioReportMode audioReportMode : values()) {
            if (audioReportMode.value() == i) {
                return audioReportMode;
            }
        }
        return null;
    }

    public static AudioReportMode valueOf(String str) {
        return (AudioReportMode) C08FF.LIZ(AudioReportMode.class, str);
    }

    AudioReportMode(int i) {
        this.value = i;
    }
}
