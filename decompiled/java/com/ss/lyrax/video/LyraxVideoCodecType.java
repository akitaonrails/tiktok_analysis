package com.ss.lyrax.video;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxVideoCodecType {
    AUTO(0),
    H264(1),
    BYTEVC1(2);

    public int value;

    /* JADX INFO: renamed from: com.ss.lyrax.video.LyraxVideoCodecType$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$video$LyraxVideoCodecType;

        static {
            int[] iArr = new int[LyraxVideoCodecType.values().length];
            $SwitchMap$com$ss$lyrax$video$LyraxVideoCodecType = iArr;
            try {
                iArr[LyraxVideoCodecType.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoCodecType[LyraxVideoCodecType.H264.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoCodecType[LyraxVideoCodecType.BYTEVC1.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$lyrax$video$LyraxVideoCodecType[ordinal()];
        return i != 2 ? i != 3 ? "kAUTO" : "kBytevc1" : "kH264";
    }

    public int value() {
        return this.value;
    }

    public static LyraxVideoCodecType fromId(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return AUTO;
                }
                return BYTEVC1;
            }
            return H264;
        }
        return AUTO;
    }

    public static LyraxVideoCodecType valueOf(String str) {
        return (LyraxVideoCodecType) C08FF.LIZ(LyraxVideoCodecType.class, str);
    }

    LyraxVideoCodecType(int i) {
        this.value = i;
    }
}
