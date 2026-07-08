package com.ss.lyrax.audio;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxAudioPlayerCustomSourceMode {
    PUSH(0),
    PULL(1);

    public int value;

    /* JADX INFO: renamed from: com.ss.lyrax.audio.LyraxAudioPlayerCustomSourceMode$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$audio$LyraxAudioPlayerCustomSourceMode;

        static {
            int[] iArr = new int[LyraxAudioPlayerCustomSourceMode.values().length];
            $SwitchMap$com$ss$lyrax$audio$LyraxAudioPlayerCustomSourceMode = iArr;
            try {
                iArr[LyraxAudioPlayerCustomSourceMode.PUSH.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioPlayerCustomSourceMode[LyraxAudioPlayerCustomSourceMode.PULL.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$lyrax$audio$LyraxAudioPlayerCustomSourceMode[ordinal()];
        return (i == 1 || i != 2) ? "PUSH" : "PULL";
    }

    public int value() {
        return this.value;
    }

    public static LyraxAudioPlayerCustomSourceMode fromId(int i) {
        for (LyraxAudioPlayerCustomSourceMode lyraxAudioPlayerCustomSourceMode : values()) {
            if (lyraxAudioPlayerCustomSourceMode.value() == i) {
                return lyraxAudioPlayerCustomSourceMode;
            }
        }
        return PUSH;
    }

    public static LyraxAudioPlayerCustomSourceMode valueOf(String str) {
        return (LyraxAudioPlayerCustomSourceMode) C08FF.LIZ(LyraxAudioPlayerCustomSourceMode.class, str);
    }

    LyraxAudioPlayerCustomSourceMode(int i) {
        this.value = i;
    }
}
