package com.ss.lyrax.stream;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxAudioLocalState {
    UNKNOWN(-1),
    BEGIN_ENCODE(0),
    FIRST_FRAME_ENCODED(1),
    BEGIN_SEND(2),
    FIRST_FRAME_SENT(3);

    public int value;

    /* JADX INFO: renamed from: com.ss.lyrax.stream.LyraxAudioLocalState$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$stream$LyraxAudioLocalState;

        static {
            int[] iArr = new int[LyraxAudioLocalState.values().length];
            $SwitchMap$com$ss$lyrax$stream$LyraxAudioLocalState = iArr;
            try {
                iArr[LyraxAudioLocalState.BEGIN_ENCODE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$stream$LyraxAudioLocalState[LyraxAudioLocalState.FIRST_FRAME_ENCODED.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$lyrax$stream$LyraxAudioLocalState[LyraxAudioLocalState.BEGIN_SEND.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$ss$lyrax$stream$LyraxAudioLocalState[LyraxAudioLocalState.FIRST_FRAME_SENT.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$lyrax$stream$LyraxAudioLocalState[ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "UNKNOWN" : "AUDIO_SENT" : "AUDIO_BEGIN_SEND" : "AUDIO_ENCODED" : "AUDIO_BEGIN_ENCODE";
    }

    public int value() {
        return this.value;
    }

    public static LyraxAudioLocalState fromId(int i) {
        for (LyraxAudioLocalState lyraxAudioLocalState : values()) {
            if (lyraxAudioLocalState.value() == i) {
                return lyraxAudioLocalState;
            }
        }
        return UNKNOWN;
    }

    public static LyraxAudioLocalState valueOf(String str) {
        return (LyraxAudioLocalState) C08FF.LIZ(LyraxAudioLocalState.class, str);
    }

    LyraxAudioLocalState(int i) {
        this.value = i;
    }
}
