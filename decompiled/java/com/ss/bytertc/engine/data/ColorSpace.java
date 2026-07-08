package com.ss.bytertc.engine.data;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public enum ColorSpace {
    UNKNOWN(0),
    BT601_LIMITED_RANGE(1),
    BT601_FULL_RANGE(2),
    BT709_LIMITED_RANGE(3),
    BT709_FULL_RANGE(4);

    public int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.ColorSpace$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$ColorSpace;

        static {
            int[] iArr = new int[ColorSpace.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$ColorSpace = iArr;
            try {
                iArr[ColorSpace.BT601_LIMITED_RANGE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$ColorSpace[ColorSpace.BT601_FULL_RANGE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$ColorSpace[ColorSpace.BT709_LIMITED_RANGE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$ColorSpace[ColorSpace.BT709_FULL_RANGE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$ColorSpace[ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "kColorSpaceUnknown" : "kColorSpaceYCbCrBT709FullRange" : "kColorSpaceYCbCrBT709LimitedRange" : "kColorSpaceYCbCrBT601FullRange" : "kColorSpaceYCbCrBT601LimitedRange";
    }

    public int value() {
        return this.value;
    }

    public static ColorSpace fromId(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return BT709_FULL_RANGE;
                    }
                    return BT709_LIMITED_RANGE;
                }
                return BT601_FULL_RANGE;
            }
            return BT601_LIMITED_RANGE;
        }
        return UNKNOWN;
    }

    public static ColorSpace valueOf(String str) {
        return (ColorSpace) C08FF.LIZ(ColorSpace.class, str);
    }

    ColorSpace(int i) {
        this.value = i;
    }
}
