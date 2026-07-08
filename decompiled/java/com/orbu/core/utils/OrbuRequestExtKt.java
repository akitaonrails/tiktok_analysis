package com.orbu.core.utils;

import X.C2188811AlT;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes4.dex */
public final class OrbuRequestExtKt {
    public static final String dataFlowId2Hex(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return "null";
        }
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("0x");
            int i = CastIntegerProtector.parseInt(str);
            CharsKt__CharJVMKt.checkRadix(16);
            sbLIZ.append(Integer.toString(i, 16));
            return C2188811AlT.LIZIZ(sbLIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "Exception";
        }
    }

    public static final String extractDomain(String str) {
        boolean z;
        int iIntValue;
        int length;
        if (str == null) {
            return "";
        }
        Integer numValueOf = Integer.valueOf(a0.LJJJ(str, "://", 0, false, 6));
        if (numValueOf.intValue() != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            iIntValue = numValueOf.intValue() + 3;
        } else {
            iIntValue = 0;
        }
        Integer numValueOf2 = Integer.valueOf(a0.LJJIZ(str, '/', iIntValue, false, 4));
        if (numValueOf2.intValue() != -1) {
            length = numValueOf2.intValue();
        } else {
            length = str.length();
        }
        return str.substring(iIntValue, length);
    }

    public static final boolean isDataFlowIdEmpty(String str) {
        String strDataFlowId2Hex = dataFlowId2Hex(str);
        if (!Intrinsics.LJFF("null", strDataFlowId2Hex) && !Intrinsics.LJFF("0x-1", strDataFlowId2Hex) && !Intrinsics.LJFF("Exception", strDataFlowId2Hex)) {
            return false;
        }
        return true;
    }

    public static final boolean isHexDataFlowIdEmpty(String str) {
        if (!Intrinsics.LJFF("null", str) && !Intrinsics.LJFF("0x-1", str) && !Intrinsics.LJFF("Exception", str)) {
            return false;
        }
        return true;
    }
}
