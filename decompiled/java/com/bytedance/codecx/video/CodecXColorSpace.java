package com.bytedance.codecx.video;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public enum CodecXColorSpace {
    kUnknown(0),
    kYCbCrBT601LimitedRange(1),
    kYCbCrBT601FullRange(2),
    kYCbCrBT709LimitedRange(3),
    kYCbCrBT709FullRange(4);

    public int colorSpace;

    /* JADX INFO: renamed from: com.bytedance.codecx.video.CodecXColorSpace$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$bytedance$codecx$video$CodecXColorSpace;

        static {
            int[] iArr = new int[CodecXColorSpace.values().length];
            $SwitchMap$com$bytedance$codecx$video$CodecXColorSpace = iArr;
            try {
                iArr[CodecXColorSpace.kUnknown.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXColorSpace[CodecXColorSpace.kYCbCrBT601LimitedRange.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXColorSpace[CodecXColorSpace.kYCbCrBT601FullRange.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXColorSpace[CodecXColorSpace.kYCbCrBT709LimitedRange.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXColorSpace[CodecXColorSpace.kYCbCrBT709FullRange.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$bytedance$codecx$video$CodecXColorSpace[ordinal()];
        return i != 2 ? i != 3 ? i != 4 ? i != 5 ? "kUnknown" : "kYCbCrBT709FullRange" : "kYCbCrBT709LimitedRange" : "kYCbCrBT601FullRange" : "kYCbCrBT601LimitedRange";
    }

    private int value() {
        return this.colorSpace;
    }

    public int getColorSpace() {
        return this.colorSpace;
    }

    public static CodecXColorSpace fromId(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return kUnknown;
                        }
                        return kYCbCrBT709FullRange;
                    }
                    return kYCbCrBT709LimitedRange;
                }
                return kYCbCrBT601FullRange;
            }
            return kYCbCrBT601LimitedRange;
        }
        return kUnknown;
    }

    public static CodecXColorSpace valueOf(String str) {
        return (CodecXColorSpace) C08FF.LIZ(CodecXColorSpace.class, str);
    }

    CodecXColorSpace(int i) {
        this.colorSpace = i;
    }
}
