package com.ss.lyrax.stream;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxFirstFramePlayState {
    UNKNOWN(-1),
    PLAYING(0),
    PLAYED(1),
    FAILED(2);

    public int value;

    /* JADX INFO: renamed from: com.ss.lyrax.stream.LyraxFirstFramePlayState$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$stream$LyraxFirstFramePlayState;

        static {
            int[] iArr = new int[LyraxFirstFramePlayState.values().length];
            $SwitchMap$com$ss$lyrax$stream$LyraxFirstFramePlayState = iArr;
            try {
                iArr[LyraxFirstFramePlayState.PLAYING.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$stream$LyraxFirstFramePlayState[LyraxFirstFramePlayState.PLAYED.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$lyrax$stream$LyraxFirstFramePlayState[LyraxFirstFramePlayState.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$lyrax$stream$LyraxFirstFramePlayState[ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "FAILED" : "PLAYED" : "PLAYING";
    }

    public int value() {
        return this.value;
    }

    public static LyraxFirstFramePlayState fromId(int i) {
        for (LyraxFirstFramePlayState lyraxFirstFramePlayState : values()) {
            if (lyraxFirstFramePlayState.value() == i) {
                return lyraxFirstFramePlayState;
            }
        }
        return UNKNOWN;
    }

    public static LyraxFirstFramePlayState valueOf(String str) {
        return (LyraxFirstFramePlayState) C08FF.LIZ(LyraxFirstFramePlayState.class, str);
    }

    LyraxFirstFramePlayState(int i) {
        this.value = i;
    }
}
