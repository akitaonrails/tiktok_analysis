package com.ss.lyrax.audio;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes36.dex */
public enum LyraxAudioPlayerCustomSourceSeekWhence {
    SET(0),
    CUR(1),
    END(2),
    SIZE(3);

    public int value;

    /* JADX INFO: renamed from: com.ss.lyrax.audio.LyraxAudioPlayerCustomSourceSeekWhence$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$audio$LyraxAudioPlayerCustomSourceSeekWhence;

        static {
            int[] iArr = new int[LyraxAudioPlayerCustomSourceSeekWhence.values().length];
            $SwitchMap$com$ss$lyrax$audio$LyraxAudioPlayerCustomSourceSeekWhence = iArr;
            try {
                iArr[LyraxAudioPlayerCustomSourceSeekWhence.SET.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioPlayerCustomSourceSeekWhence[LyraxAudioPlayerCustomSourceSeekWhence.CUR.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioPlayerCustomSourceSeekWhence[LyraxAudioPlayerCustomSourceSeekWhence.END.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioPlayerCustomSourceSeekWhence[LyraxAudioPlayerCustomSourceSeekWhence.SIZE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$lyrax$audio$LyraxAudioPlayerCustomSourceSeekWhence[ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i == 4 ? "SIZE" : "SET" : "END" : "CUR" : "SET";
    }

    public int value() {
        return this.value;
    }

    public static LyraxAudioPlayerCustomSourceSeekWhence fromId(int i) {
        for (LyraxAudioPlayerCustomSourceSeekWhence lyraxAudioPlayerCustomSourceSeekWhence : values()) {
            if (lyraxAudioPlayerCustomSourceSeekWhence.value() == i) {
                return lyraxAudioPlayerCustomSourceSeekWhence;
            }
        }
        return SET;
    }

    public static LyraxAudioPlayerCustomSourceSeekWhence valueOf(String str) {
        return (LyraxAudioPlayerCustomSourceSeekWhence) C08FF.LIZ(LyraxAudioPlayerCustomSourceSeekWhence.class, str);
    }

    LyraxAudioPlayerCustomSourceSeekWhence(int i) {
        this.value = i;
    }
}
