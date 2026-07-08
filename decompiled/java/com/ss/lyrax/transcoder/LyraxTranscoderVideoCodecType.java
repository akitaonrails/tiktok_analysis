package com.ss.lyrax.transcoder;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxTranscoderVideoCodecType {
    H264(0),
    H265(1);

    public int value;

    /* JADX INFO: renamed from: com.ss.lyrax.transcoder.LyraxTranscoderVideoCodecType$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderVideoCodecType;

        static {
            int[] iArr = new int[LyraxTranscoderVideoCodecType.values().length];
            $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderVideoCodecType = iArr;
            try {
                iArr[LyraxTranscoderVideoCodecType.H264.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderVideoCodecType[LyraxTranscoderVideoCodecType.H265.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        return AnonymousClass1.$SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderVideoCodecType[ordinal()] != 2 ? "kH264" : "kH265";
    }

    public int value() {
        return this.value;
    }

    public static LyraxTranscoderVideoCodecType fromId(int i) {
        for (LyraxTranscoderVideoCodecType lyraxTranscoderVideoCodecType : values()) {
            if (lyraxTranscoderVideoCodecType.value() == i) {
                return lyraxTranscoderVideoCodecType;
            }
        }
        return H264;
    }

    public static LyraxTranscoderVideoCodecType valueOf(String str) {
        return (LyraxTranscoderVideoCodecType) C08FF.LIZ(LyraxTranscoderVideoCodecType.class, str);
    }

    LyraxTranscoderVideoCodecType(int i) {
        this.value = i;
    }
}
