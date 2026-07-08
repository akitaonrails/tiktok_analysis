package com.ss.lyrax.subscriber;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxSubscriberState {
    SUCCESS(0),
    ERROR(1);

    public int value;

    /* JADX INFO: renamed from: com.ss.lyrax.subscriber.LyraxSubscriberState$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$subscriber$LyraxSubscriberState;

        static {
            int[] iArr = new int[LyraxSubscriberState.values().length];
            $SwitchMap$com$ss$lyrax$subscriber$LyraxSubscriberState = iArr;
            try {
                iArr[LyraxSubscriberState.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$subscriber$LyraxSubscriberState[LyraxSubscriberState.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$lyrax$subscriber$LyraxSubscriberState[ordinal()];
        return i != 1 ? i != 2 ? "UNKNOWN" : "ERROR" : "SUCCESS";
    }

    public int value() {
        return this.value;
    }

    public static LyraxSubscriberState fromId(int i) {
        for (LyraxSubscriberState lyraxSubscriberState : values()) {
            if (lyraxSubscriberState.value() == i) {
                return lyraxSubscriberState;
            }
        }
        return ERROR;
    }

    public static LyraxSubscriberState valueOf(String str) {
        return (LyraxSubscriberState) C08FF.LIZ(LyraxSubscriberState.class, str);
    }

    LyraxSubscriberState(int i) {
        this.value = i;
    }
}
