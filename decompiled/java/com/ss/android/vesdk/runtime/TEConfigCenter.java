package com.ss.android.vesdk.runtime;

import X.C2122208Tc;
import X.EnumC1284080jWI;
import com.ss.android.vesdk.VEConfigCenter;

/* JADX INFO: loaded from: classes21.dex */
public class TEConfigCenter {
    public static native void nativeBatchSetConfig(String[] strArr, int[] iArr, Object[] objArr);

    public static native void nativeClear();

    public static native void nativeSetBoolConfig(String str, boolean z, boolean z2, int i);

    public static native void nativeSetFloatConfig(String str, float f, boolean z, int i);

    public static native void nativeSetIntConfig(String str, int i, boolean z, int i2);

    public static native void nativeSetStringConfig(String str, String str2, boolean z, int i);

    static {
        C2122208Tc.LIZJ();
    }

    public static void LIZIZ(String str, VEConfigCenter.ValuePkt valuePkt) {
        boolean z;
        if (valuePkt.getABType() == EnumC1284080jWI.FOREFFECT) {
            z = true;
        } else {
            z = false;
        }
        int iOrdinal = valuePkt.getDataType().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1 && iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal == 4) {
                        nativeSetStringConfig(str, (String) valuePkt.getValue(), z, valuePkt.getConfigType().ordinal());
                        return;
                    }
                    return;
                }
                nativeSetFloatConfig(str, ((Float) valuePkt.getValue()).floatValue(), z, valuePkt.getConfigType().ordinal());
                return;
            }
            nativeSetIntConfig(str, ((Integer) valuePkt.getValue()).intValue(), z, valuePkt.getConfigType().ordinal());
            return;
        }
        nativeSetBoolConfig(str, ((Boolean) valuePkt.getValue()).booleanValue(), z, valuePkt.getConfigType().ordinal());
    }

    public static void LIZ(String[] strArr, int[] iArr, Object[] objArr) {
        if (strArr.length == iArr.length && strArr.length == objArr.length) {
            nativeBatchSetConfig(strArr, iArr, objArr);
        }
    }
}
