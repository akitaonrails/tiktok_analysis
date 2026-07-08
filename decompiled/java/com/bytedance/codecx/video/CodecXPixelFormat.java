package com.bytedance.codecx.video;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes21.dex */
public enum CodecXPixelFormat {
    kUnknown(0),
    kArgb(1),
    kBgra(2),
    kRgba(3),
    kRgb24(4),
    kI420(5),
    kNv12(6),
    kNv21(7),
    kRgb(8),
    kNative(9),
    kIYUV(10),
    kYUY2(11),
    kYV12(12),
    kUYVY(13),
    kRGB565(14),
    kMJPEG(15),
    kTexture2D(16),
    kTextureOES(17);

    public int value;

    /* JADX INFO: renamed from: com.bytedance.codecx.video.CodecXPixelFormat$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$bytedance$codecx$video$CodecXPixelFormat;

        static {
            int[] iArr = new int[CodecXPixelFormat.values().length];
            $SwitchMap$com$bytedance$codecx$video$CodecXPixelFormat = iArr;
            try {
                iArr[CodecXPixelFormat.kArgb.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXPixelFormat[CodecXPixelFormat.kBgra.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXPixelFormat[CodecXPixelFormat.kRgba.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXPixelFormat[CodecXPixelFormat.kI420.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXPixelFormat[CodecXPixelFormat.kNv12.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXPixelFormat[CodecXPixelFormat.kNv21.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXPixelFormat[CodecXPixelFormat.kRgb.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
                TryCatchGuardChecker.doCheck(e7);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXPixelFormat[CodecXPixelFormat.kNative.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
                TryCatchGuardChecker.doCheck(e8);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXPixelFormat[CodecXPixelFormat.kIYUV.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
                TryCatchGuardChecker.doCheck(e9);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXPixelFormat[CodecXPixelFormat.kYUY2.ordinal()] = 10;
            } catch (NoSuchFieldError e10) {
                TryCatchGuardChecker.doCheck(e10);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXPixelFormat[CodecXPixelFormat.kYV12.ordinal()] = 11;
            } catch (NoSuchFieldError e11) {
                TryCatchGuardChecker.doCheck(e11);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXPixelFormat[CodecXPixelFormat.kUYVY.ordinal()] = 12;
            } catch (NoSuchFieldError e12) {
                TryCatchGuardChecker.doCheck(e12);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXPixelFormat[CodecXPixelFormat.kRGB565.ordinal()] = 13;
            } catch (NoSuchFieldError e13) {
                TryCatchGuardChecker.doCheck(e13);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXPixelFormat[CodecXPixelFormat.kMJPEG.ordinal()] = 14;
            } catch (NoSuchFieldError e14) {
                TryCatchGuardChecker.doCheck(e14);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXPixelFormat[CodecXPixelFormat.kTexture2D.ordinal()] = 15;
            } catch (NoSuchFieldError e15) {
                TryCatchGuardChecker.doCheck(e15);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXPixelFormat[CodecXPixelFormat.kTextureOES.ordinal()] = 16;
            } catch (NoSuchFieldError e16) {
                TryCatchGuardChecker.doCheck(e16);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXPixelFormat[CodecXPixelFormat.kUnknown.ordinal()] = 17;
            } catch (NoSuchFieldError e17) {
                TryCatchGuardChecker.doCheck(e17);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (AnonymousClass1.$SwitchMap$com$bytedance$codecx$video$CodecXPixelFormat[ordinal()]) {
            case 1:
                return "kArgb";
            case 2:
                return "kBgra";
            case 3:
                return "kRgba";
            case 4:
                return "kI420";
            case 5:
                return "kNv12";
            case 6:
                return "kNv21";
            case 7:
                return "kRgb";
            case 8:
                return "kNative";
            case BdTuring.TYPE_ECAF /* 9 */:
                return "kIYUV";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return "kYUY2";
            case BdTuring.TYPE_EMAIL /* 11 */:
                return "kYV12";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return "kUYVY";
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return "kRGB565";
            case 14:
                return "kMJPEG";
            case 15:
                return "kTexture2D";
            case 16:
                return "kTextureOES";
            default:
                return "kUnknown";
        }
    }

    public int value() {
        return this.value;
    }

    public static CodecXPixelFormat fromId(int i) {
        if (i != 3553) {
            if (i != 36197) {
                switch (i) {
                }
                return kUnknown;
            }
            return kTextureOES;
        }
        return kTexture2D;
    }

    public static CodecXPixelFormat valueOf(String str) {
        return (CodecXPixelFormat) C08FF.LIZ(CodecXPixelFormat.class, str);
    }

    CodecXPixelFormat(int i) {
        this.value = i;
    }
}
