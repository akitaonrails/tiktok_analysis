package com.ss.android.vesdk;

import X.InterfaceC2216281Bog;
import com.ss.android.vesdk.VEConfigCenter;

/* JADX INFO: loaded from: classes35.dex */
public class VEGetABManager {
    public static final Object object = new Object();
    public static volatile InterfaceC2216281Bog sABProvider = null;
    public static boolean mIsLocalTest = false;

    public static InterfaceC2216281Bog getABProvider() {
        return sABProvider;
    }

    public static void setABProvider(InterfaceC2216281Bog interfaceC2216281Bog) {
        sABProvider = interfaceC2216281Bog;
    }

    public static void setLocalTest(boolean z) {
        mIsLocalTest = z;
    }

    public static boolean getBooleanValue(String str, boolean z, boolean z2) {
        if (sABProvider != null) {
            z = sABProvider.LIZJ(str, z);
        } else {
            VEConfigCenter.ValuePkt valueNotNeedByteBench = VEConfigCenter.getInstance().getValueNotNeedByteBench(str);
            if (valueNotNeedByteBench != null && valueNotNeedByteBench.getValue() != null) {
                z = ((Boolean) valueNotNeedByteBench.getValue()).booleanValue();
            }
        }
        boolean z3 = mIsLocalTest;
        return z;
    }

    public static float getFloatValue(String str, float f, boolean z) {
        if (sABProvider != null) {
            f = sABProvider.LIZLLL(str, f);
        } else {
            VEConfigCenter.ValuePkt valueNotNeedByteBench = VEConfigCenter.getInstance().getValueNotNeedByteBench(str);
            if (valueNotNeedByteBench != null && valueNotNeedByteBench.getValue() != null) {
                f = ((Float) valueNotNeedByteBench.getValue()).floatValue();
            }
        }
        boolean z2 = mIsLocalTest;
        return f;
    }

    public static int getIntValue(String str, int i, boolean z) {
        if (sABProvider != null) {
            i = sABProvider.LIZ(str, i);
        } else {
            VEConfigCenter.ValuePkt valueNotNeedByteBench = VEConfigCenter.getInstance().getValueNotNeedByteBench(str);
            if (valueNotNeedByteBench != null && valueNotNeedByteBench.getValue() != null) {
                i = ((Integer) valueNotNeedByteBench.getValue()).intValue();
            }
        }
        boolean z2 = mIsLocalTest;
        return i;
    }

    public static String getStringValue(String str, String str2, boolean z) {
        if (sABProvider != null) {
            str2 = sABProvider.LIZIZ(str, str2);
        } else {
            VEConfigCenter.ValuePkt valueNotNeedByteBench = VEConfigCenter.getInstance().getValueNotNeedByteBench(str);
            if (valueNotNeedByteBench != null && valueNotNeedByteBench.getValue() != null) {
                str2 = (String) valueNotNeedByteBench.getValue();
            }
        }
        boolean z2 = mIsLocalTest;
        return str2;
    }
}
