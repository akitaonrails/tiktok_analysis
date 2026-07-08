package com.sun.jna;

import X.C1697810uHb;
import X.C2110908Ot;
import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class JnaLibrarianLancet {
    public static final JnaLibrarianLancet INSTANCE = new JnaLibrarianLancet();

    public static final NativeLibrary loadLibrary(String str, Map<String, ?> map) {
        int iIntValue;
        Number number;
        if (!JnaAabFixSettings.isOpen()) {
            int i = C2110908Ot.LIZ;
            return (NativeLibrary) new Object();
        }
        Object obj = map.get("open-flags");
        if ((obj instanceof Number) && (number = (Number) obj) != null) {
            iIntValue = number.intValue();
        } else {
            iIntValue = -1;
        }
        ArrayList<String> arrayList = new ArrayList();
        int i2 = 0;
        long jLongValue = 0;
        for (Function2<String, Integer, Long> function2 : JnaLibrarianLancetHelper.INSTANCE.getLoadLibraryRetries()) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                Function2<String, Integer, Long> function22 = function2;
                if (jLongValue == 0) {
                    try {
                        jLongValue = function22.invoke(str, Integer.valueOf(iIntValue)).longValue();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        String message = th.getMessage();
                        if (message == null) {
                            message = th.toString();
                        }
                        arrayList.add(message);
                        jLongValue = 0;
                    }
                }
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        if (jLongValue != 0) {
            return JnaLibrarianLancetHelper.INSTANCE.newNativeLibrary(str, jLongValue, map);
        }
        try {
            int i4 = C2110908Ot.LIZ;
            return (NativeLibrary) new Object();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            StringBuilder sb = new StringBuilder("Unable to load library '");
            sb.append(str);
            sb.append("':");
            for (String str2 : arrayList) {
                sb.append("\n");
                sb.append(str2);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("\nOrigin.call:\n");
            sbLIZ.append(th2.getMessage());
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
            throw new UnsatisfiedLinkError(sb.toString());
        }
    }
}
