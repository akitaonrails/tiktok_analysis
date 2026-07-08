package com.ss.lyrax.audio;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxAudioReportMode {
    NORMAL(0),
    DISCONNECT(1),
    RESET(2);

    public int value;

    /* JADX INFO: renamed from: com.ss.lyrax.audio.LyraxAudioReportMode$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$audio$LyraxAudioReportMode;

        static {
            int[] iArr = new int[LyraxAudioReportMode.values().length];
            $SwitchMap$com$ss$lyrax$audio$LyraxAudioReportMode = iArr;
            try {
                iArr[LyraxAudioReportMode.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioReportMode[LyraxAudioReportMode.DISCONNECT.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioReportMode[LyraxAudioReportMode.RESET.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$lyrax$audio$LyraxAudioReportMode[ordinal()];
        return i != 1 ? i != 2 ? i == 3 ? "RESET" : "NORMAL" : "DISCONNECT" : "NORMAL";
    }

    public int value() {
        return this.value;
    }

    public static LyraxAudioReportMode fromId(int i) {
        for (LyraxAudioReportMode lyraxAudioReportMode : values()) {
            if (lyraxAudioReportMode.value() == i) {
                return lyraxAudioReportMode;
            }
        }
        return NORMAL;
    }

    public static LyraxAudioReportMode valueOf(String str) {
        return (LyraxAudioReportMode) C08FF.LIZ(LyraxAudioReportMode.class, str);
    }

    LyraxAudioReportMode(int i) {
        this.value = i;
    }
}
