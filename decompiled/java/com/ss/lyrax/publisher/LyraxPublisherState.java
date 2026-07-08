package com.ss.lyrax.publisher;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxPublisherState {
    UNKONWN(0),
    CONNECTING(1),
    SUCCESS(2),
    RECONNECTING(3),
    STOP(4),
    ERROR(5);

    public final int value;

    /* JADX INFO: renamed from: com.ss.lyrax.publisher.LyraxPublisherState$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$publisher$LyraxPublisherState;

        static {
            int[] iArr = new int[LyraxPublisherState.values().length];
            $SwitchMap$com$ss$lyrax$publisher$LyraxPublisherState = iArr;
            try {
                iArr[LyraxPublisherState.CONNECTING.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$publisher$LyraxPublisherState[LyraxPublisherState.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$lyrax$publisher$LyraxPublisherState[LyraxPublisherState.RECONNECTING.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$ss$lyrax$publisher$LyraxPublisherState[LyraxPublisherState.STOP.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                $SwitchMap$com$ss$lyrax$publisher$LyraxPublisherState[LyraxPublisherState.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$lyrax$publisher$LyraxPublisherState[ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN" : "ERROR" : "STOP" : "RECONNECTING" : "SUCCESS" : "CONNECTING";
    }

    public int value() {
        return this.value;
    }

    public static LyraxPublisherState fromId(int i) {
        for (LyraxPublisherState lyraxPublisherState : values()) {
            if (lyraxPublisherState.value() == i) {
                return lyraxPublisherState;
            }
        }
        return UNKONWN;
    }

    public static LyraxPublisherState valueOf(String str) {
        return (LyraxPublisherState) C08FF.LIZ(LyraxPublisherState.class, str);
    }

    LyraxPublisherState(int i) {
        this.value = i;
    }
}
