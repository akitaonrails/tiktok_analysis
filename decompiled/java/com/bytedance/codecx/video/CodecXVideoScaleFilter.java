package com.bytedance.codecx.video;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes36.dex */
public enum CodecXVideoScaleFilter {
    kLibYUVNone(0),
    kLibYUVLinear(1),
    kLibYUVBilinear(2),
    kLibYUVBox(3),
    kFFMPegFastBilinear(4),
    kFFMPegBilinear(5),
    kFFMPegBicubic(6),
    kFFMPegGauss(7),
    kFFMPegLanczos(8),
    kOpenGLOrigin(9),
    kOpenGLBilinear(10),
    kOpenGLBicubic(11),
    kOpenGLBox(12);

    public int value;

    /* JADX INFO: renamed from: com.bytedance.codecx.video.CodecXVideoScaleFilter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$bytedance$codecx$video$CodecXVideoScaleFilter;

        static {
            int[] iArr = new int[CodecXVideoScaleFilter.values().length];
            $SwitchMap$com$bytedance$codecx$video$CodecXVideoScaleFilter = iArr;
            try {
                iArr[CodecXVideoScaleFilter.kLibYUVNone.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXVideoScaleFilter[CodecXVideoScaleFilter.kLibYUVLinear.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXVideoScaleFilter[CodecXVideoScaleFilter.kLibYUVBilinear.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXVideoScaleFilter[CodecXVideoScaleFilter.kLibYUVBox.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXVideoScaleFilter[CodecXVideoScaleFilter.kFFMPegFastBilinear.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXVideoScaleFilter[CodecXVideoScaleFilter.kFFMPegBilinear.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXVideoScaleFilter[CodecXVideoScaleFilter.kFFMPegBicubic.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
                TryCatchGuardChecker.doCheck(e7);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXVideoScaleFilter[CodecXVideoScaleFilter.kFFMPegGauss.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
                TryCatchGuardChecker.doCheck(e8);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXVideoScaleFilter[CodecXVideoScaleFilter.kFFMPegLanczos.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
                TryCatchGuardChecker.doCheck(e9);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXVideoScaleFilter[CodecXVideoScaleFilter.kOpenGLOrigin.ordinal()] = 10;
            } catch (NoSuchFieldError e10) {
                TryCatchGuardChecker.doCheck(e10);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXVideoScaleFilter[CodecXVideoScaleFilter.kOpenGLBilinear.ordinal()] = 11;
            } catch (NoSuchFieldError e11) {
                TryCatchGuardChecker.doCheck(e11);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXVideoScaleFilter[CodecXVideoScaleFilter.kOpenGLBicubic.ordinal()] = 12;
            } catch (NoSuchFieldError e12) {
                TryCatchGuardChecker.doCheck(e12);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXVideoScaleFilter[CodecXVideoScaleFilter.kOpenGLBox.ordinal()] = 13;
            } catch (NoSuchFieldError e13) {
                TryCatchGuardChecker.doCheck(e13);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (AnonymousClass1.$SwitchMap$com$bytedance$codecx$video$CodecXVideoScaleFilter[ordinal()]) {
            case 1:
                return "kLibYUVNone";
            case 2:
                return "kLibYUVLinear";
            case 3:
                return "kLibYUVBilinear";
            case 4:
                return "kLibYUVBox";
            case 5:
                return "kFFMPegFastBilinear";
            case 6:
                return "kFFMPegBilinear";
            case 7:
                return "kFFMPegBicubic";
            case 8:
                return "kFFMPegGauss";
            case BdTuring.TYPE_ECAF /* 9 */:
                return "kFFMPegLanczos";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return "kOpenGLOrigin";
            case BdTuring.TYPE_EMAIL /* 11 */:
                return "kOpenGLBilinear";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return "kOpenGLBicubic";
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return "kOpenGLBox";
            default:
                return "unknownValue";
        }
    }

    public int value() {
        return this.value;
    }

    public static CodecXVideoScaleFilter fromId(int i) {
        switch (i) {
            case 0:
                return kLibYUVNone;
            case 1:
                return kLibYUVLinear;
            case 2:
                return kLibYUVBilinear;
            case 3:
                return kLibYUVBox;
            case 4:
                return kFFMPegFastBilinear;
            case 5:
                return kFFMPegBilinear;
            case 6:
                return kFFMPegBicubic;
            case 7:
                return kFFMPegGauss;
            case 8:
                return kFFMPegLanczos;
            case BdTuring.TYPE_ECAF /* 9 */:
                return kOpenGLOrigin;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return kOpenGLBilinear;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return kOpenGLBicubic;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return kOpenGLBox;
            default:
                return null;
        }
    }

    public static CodecXVideoScaleFilter valueOf(String str) {
        return (CodecXVideoScaleFilter) C08FF.LIZ(CodecXVideoScaleFilter.class, str);
    }

    CodecXVideoScaleFilter(int i) {
        this.value = i;
    }
}
