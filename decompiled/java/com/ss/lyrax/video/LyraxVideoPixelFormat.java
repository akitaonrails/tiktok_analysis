package com.ss.lyrax.video;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxVideoPixelFormat {
    UNKNOWN(0),
    I420(1),
    NV12(2),
    NV21(3),
    RGBA(5),
    TEXTURE_2D(3553),
    TEXTURE_OES(36197);

    public int value;

    /* JADX INFO: renamed from: com.ss.lyrax.video.LyraxVideoPixelFormat$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$video$LyraxVideoPixelFormat;

        static {
            int[] iArr = new int[LyraxVideoPixelFormat.values().length];
            $SwitchMap$com$ss$lyrax$video$LyraxVideoPixelFormat = iArr;
            try {
                iArr[LyraxVideoPixelFormat.I420.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoPixelFormat[LyraxVideoPixelFormat.NV12.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoPixelFormat[LyraxVideoPixelFormat.NV21.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoPixelFormat[LyraxVideoPixelFormat.RGBA.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoPixelFormat[LyraxVideoPixelFormat.TEXTURE_2D.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoPixelFormat[LyraxVideoPixelFormat.TEXTURE_OES.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (AnonymousClass1.$SwitchMap$com$ss$lyrax$video$LyraxVideoPixelFormat[ordinal()]) {
            case 1:
                return "kVideoPixelFormatI420";
            case 2:
                return "kVideoPixelFormatNV12";
            case 3:
                return "kVideoPixelFormatNV21";
            case 4:
                return "kVideoPixelFormatRGBA";
            case 5:
                return "kVideoPixelFormatTexture2D";
            case 6:
                return "kVideoPixelFormatTextureOES";
            default:
                return "kVideoPixelFormatUnknown";
        }
    }

    public int value() {
        return this.value;
    }

    public static LyraxVideoPixelFormat fromId(int i) {
        for (LyraxVideoPixelFormat lyraxVideoPixelFormat : values()) {
            if (lyraxVideoPixelFormat.value() == i) {
                return lyraxVideoPixelFormat;
            }
        }
        return UNKNOWN;
    }

    public static LyraxVideoPixelFormat valueOf(String str) {
        return (LyraxVideoPixelFormat) C08FF.LIZ(LyraxVideoPixelFormat.class, str);
    }

    LyraxVideoPixelFormat(int i) {
        this.value = i;
    }
}
