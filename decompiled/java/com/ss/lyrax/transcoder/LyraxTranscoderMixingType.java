package com.ss.lyrax.transcoder;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxTranscoderMixingType {
    BY_SERVER(0),
    BY_CLIENT(1);

    public int value;

    /* JADX INFO: renamed from: com.ss.lyrax.transcoder.LyraxTranscoderMixingType$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingType;

        static {
            int[] iArr = new int[LyraxTranscoderMixingType.values().length];
            $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingType = iArr;
            try {
                iArr[LyraxTranscoderMixingType.BY_SERVER.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingType[LyraxTranscoderMixingType.BY_CLIENT.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        return AnonymousClass1.$SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingType[ordinal()] != 2 ? "MixedStreamTypeByServer" : "MixedStreamTypeByClient";
    }

    public int value() {
        return this.value;
    }

    public static LyraxTranscoderMixingType fromId(int i) {
        for (LyraxTranscoderMixingType lyraxTranscoderMixingType : values()) {
            if (lyraxTranscoderMixingType.value() == i) {
                return lyraxTranscoderMixingType;
            }
        }
        return BY_SERVER;
    }

    public static LyraxTranscoderMixingType valueOf(String str) {
        return (LyraxTranscoderMixingType) C08FF.LIZ(LyraxTranscoderMixingType.class, str);
    }

    LyraxTranscoderMixingType(int i) {
        this.value = i;
    }
}
