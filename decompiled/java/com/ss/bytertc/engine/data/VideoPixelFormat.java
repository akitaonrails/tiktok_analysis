package com.ss.bytertc.engine.data;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public enum VideoPixelFormat {
    UNKNOWN(0),
    I420(1),
    NV12(2),
    NV21(3),
    RGBA(5),
    TEXTURE_2D(3553),
    TEXTURE_OES(36197);

    public int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.VideoPixelFormat$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat;

        static {
            int[] iArr = new int[VideoPixelFormat.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat = iArr;
            try {
                iArr[VideoPixelFormat.I420.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat[VideoPixelFormat.NV12.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat[VideoPixelFormat.NV21.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat[VideoPixelFormat.RGBA.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat[VideoPixelFormat.TEXTURE_2D.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat[VideoPixelFormat.TEXTURE_OES.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat[ordinal()]) {
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

    public static VideoPixelFormat fromId(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 5) {
                            if (i != 3553) {
                                if (i != 36197) {
                                    return null;
                                }
                                return TEXTURE_OES;
                            }
                            return TEXTURE_2D;
                        }
                        return RGBA;
                    }
                    return NV21;
                }
                return NV12;
            }
            return I420;
        }
        return UNKNOWN;
    }

    public static VideoPixelFormat valueOf(String str) {
        return (VideoPixelFormat) C08FF.LIZ(VideoPixelFormat.class, str);
    }

    VideoPixelFormat(int i) {
        this.value = i;
    }
}
