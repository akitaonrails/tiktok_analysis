package com.ss.lyrax.video;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxVideoSEIStreamEvent {
    STREAM_ADD(0),
    STREAM_REMOVE(1);

    public int value;

    /* JADX INFO: renamed from: com.ss.lyrax.video.LyraxVideoSEIStreamEvent$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$video$LyraxVideoSEIStreamEvent;

        static {
            int[] iArr = new int[LyraxVideoSEIStreamEvent.values().length];
            $SwitchMap$com$ss$lyrax$video$LyraxVideoSEIStreamEvent = iArr;
            try {
                iArr[LyraxVideoSEIStreamEvent.STREAM_ADD.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoSEIStreamEvent[LyraxVideoSEIStreamEvent.STREAM_REMOVE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        return AnonymousClass1.$SwitchMap$com$ss$lyrax$video$LyraxVideoSEIStreamEvent[ordinal()] != 2 ? "kStreamAdd" : "kStreamRemove";
    }

    public int value() {
        return this.value;
    }

    public static LyraxVideoSEIStreamEvent fromId(int i) {
        for (LyraxVideoSEIStreamEvent lyraxVideoSEIStreamEvent : values()) {
            if (lyraxVideoSEIStreamEvent.value() == i) {
                return lyraxVideoSEIStreamEvent;
            }
        }
        return STREAM_ADD;
    }

    public static LyraxVideoSEIStreamEvent valueOf(String str) {
        return (LyraxVideoSEIStreamEvent) C08FF.LIZ(LyraxVideoSEIStreamEvent.class, str);
    }

    LyraxVideoSEIStreamEvent(int i) {
        this.value = i;
    }
}
