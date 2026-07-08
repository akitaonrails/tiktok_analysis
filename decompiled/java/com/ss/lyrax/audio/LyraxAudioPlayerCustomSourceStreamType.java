package com.ss.lyrax.audio;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxAudioPlayerCustomSourceStreamType {
    RAW(0),
    ENCODED(1);

    public int value;

    /* JADX INFO: renamed from: com.ss.lyrax.audio.LyraxAudioPlayerCustomSourceStreamType$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$audio$LyraxAudioPlayerCustomSourceStreamType;

        static {
            int[] iArr = new int[LyraxAudioPlayerCustomSourceStreamType.values().length];
            $SwitchMap$com$ss$lyrax$audio$LyraxAudioPlayerCustomSourceStreamType = iArr;
            try {
                iArr[LyraxAudioPlayerCustomSourceStreamType.RAW.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioPlayerCustomSourceStreamType[LyraxAudioPlayerCustomSourceStreamType.ENCODED.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$lyrax$audio$LyraxAudioPlayerCustomSourceStreamType[ordinal()];
        return (i == 1 || i != 2) ? "RAW" : "ENCODED";
    }

    public int value() {
        return this.value;
    }

    public static LyraxAudioPlayerCustomSourceStreamType fromId(int i) {
        for (LyraxAudioPlayerCustomSourceStreamType lyraxAudioPlayerCustomSourceStreamType : values()) {
            if (lyraxAudioPlayerCustomSourceStreamType.value() == i) {
                return lyraxAudioPlayerCustomSourceStreamType;
            }
        }
        return RAW;
    }

    public static LyraxAudioPlayerCustomSourceStreamType valueOf(String str) {
        return (LyraxAudioPlayerCustomSourceStreamType) C08FF.LIZ(LyraxAudioPlayerCustomSourceStreamType.class, str);
    }

    LyraxAudioPlayerCustomSourceStreamType(int i) {
        this.value = i;
    }
}
