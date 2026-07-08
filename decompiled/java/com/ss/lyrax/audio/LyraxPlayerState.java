package com.ss.lyrax.audio;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes36.dex */
public enum LyraxPlayerState {
    IDLE(0),
    PRELOADED(1),
    OPENED(2),
    PLAYING(3),
    PAUSED(4),
    STOPPED(5),
    FAILED(6),
    LOOP_STARTED(7),
    FINISHED(8);

    public int value;

    /* JADX INFO: renamed from: com.ss.lyrax.audio.LyraxPlayerState$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$audio$LyraxPlayerState;

        static {
            int[] iArr = new int[LyraxPlayerState.values().length];
            $SwitchMap$com$ss$lyrax$audio$LyraxPlayerState = iArr;
            try {
                iArr[LyraxPlayerState.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxPlayerState[LyraxPlayerState.PRELOADED.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxPlayerState[LyraxPlayerState.OPENED.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxPlayerState[LyraxPlayerState.PLAYING.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxPlayerState[LyraxPlayerState.PAUSED.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxPlayerState[LyraxPlayerState.STOPPED.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxPlayerState[LyraxPlayerState.FAILED.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
                TryCatchGuardChecker.doCheck(e7);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxPlayerState[LyraxPlayerState.LOOP_STARTED.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
                TryCatchGuardChecker.doCheck(e8);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxPlayerState[LyraxPlayerState.FINISHED.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
                TryCatchGuardChecker.doCheck(e9);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (AnonymousClass1.$SwitchMap$com$ss$lyrax$audio$LyraxPlayerState[ordinal()]) {
            case 2:
                return "PRELOADED";
            case 3:
                return "OPENED";
            case 4:
                return "PLAYING";
            case 5:
                return "PAUSED";
            case 6:
                return "STOPPED";
            case 7:
                return "FAILED";
            case 8:
                return "LOOP_STARTED";
            case BdTuring.TYPE_ECAF /* 9 */:
                return "FINISHED";
            default:
                return "IDLE";
        }
    }

    public int value() {
        return this.value;
    }

    public static LyraxPlayerState fromId(int i) {
        for (LyraxPlayerState lyraxPlayerState : values()) {
            if (lyraxPlayerState.value() == i) {
                return lyraxPlayerState;
            }
        }
        return IDLE;
    }

    public static LyraxPlayerState valueOf(String str) {
        return (LyraxPlayerState) C08FF.LIZ(LyraxPlayerState.class, str);
    }

    LyraxPlayerState(int i) {
        this.value = i;
    }
}
