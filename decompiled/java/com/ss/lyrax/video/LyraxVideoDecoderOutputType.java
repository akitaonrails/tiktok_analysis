package com.ss.lyrax.video;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxVideoDecoderOutputType {
    RAW(0),
    ENCODED(1),
    BOTH(2);

    public int value;

    /* JADX INFO: renamed from: com.ss.lyrax.video.LyraxVideoDecoderOutputType$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$video$LyraxVideoDecoderOutputType;

        static {
            int[] iArr = new int[LyraxVideoDecoderOutputType.values().length];
            $SwitchMap$com$ss$lyrax$video$LyraxVideoDecoderOutputType = iArr;
            try {
                iArr[LyraxVideoDecoderOutputType.RAW.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoDecoderOutputType[LyraxVideoDecoderOutputType.ENCODED.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoDecoderOutputType[LyraxVideoDecoderOutputType.BOTH.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$lyrax$video$LyraxVideoDecoderOutputType[ordinal()];
        return i != 2 ? i != 3 ? "kRaw" : "kBoth" : "kEncoded";
    }

    public int value() {
        return this.value;
    }

    public static LyraxVideoDecoderOutputType fromId(int i) {
        for (LyraxVideoDecoderOutputType lyraxVideoDecoderOutputType : values()) {
            if (lyraxVideoDecoderOutputType.value() == i) {
                return lyraxVideoDecoderOutputType;
            }
        }
        return RAW;
    }

    public static LyraxVideoDecoderOutputType valueOf(String str) {
        return (LyraxVideoDecoderOutputType) C08FF.LIZ(LyraxVideoDecoderOutputType.class, str);
    }

    LyraxVideoDecoderOutputType(int i) {
        this.value = i;
    }
}
