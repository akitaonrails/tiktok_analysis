package com.ss.lyrax.stream;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxVideoLocalState {
    UNKNOWN(-1),
    BEGIN_ENCODE(0),
    FIRST_FRAME_ENCODED(1),
    BEGIN_SEND(2),
    FIRST_FRAME_SENT(3);

    public int value;

    /* JADX INFO: renamed from: com.ss.lyrax.stream.LyraxVideoLocalState$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$stream$LyraxVideoLocalState;

        static {
            int[] iArr = new int[LyraxVideoLocalState.values().length];
            $SwitchMap$com$ss$lyrax$stream$LyraxVideoLocalState = iArr;
            try {
                iArr[LyraxVideoLocalState.BEGIN_ENCODE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$stream$LyraxVideoLocalState[LyraxVideoLocalState.FIRST_FRAME_ENCODED.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$lyrax$stream$LyraxVideoLocalState[LyraxVideoLocalState.BEGIN_SEND.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$ss$lyrax$stream$LyraxVideoLocalState[LyraxVideoLocalState.FIRST_FRAME_SENT.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$lyrax$stream$LyraxVideoLocalState[ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "UNKNOWN" : "VIDEO_SENT" : "VIDEO_BEGIN_SEND" : "VIDEO_ENCODED" : "VIDEO_BEGIN_ENCODE";
    }

    public int value() {
        return this.value;
    }

    public static LyraxVideoLocalState fromId(int i) {
        for (LyraxVideoLocalState lyraxVideoLocalState : values()) {
            if (lyraxVideoLocalState.value() == i) {
                return lyraxVideoLocalState;
            }
        }
        return UNKNOWN;
    }

    public static LyraxVideoLocalState valueOf(String str) {
        return (LyraxVideoLocalState) C08FF.LIZ(LyraxVideoLocalState.class, str);
    }

    LyraxVideoLocalState(int i) {
        this.value = i;
    }
}
