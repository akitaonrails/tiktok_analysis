package com.bytedance.common.jato.memory;

import X.C2104908Ml;
import X.C2188811AlT;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public class StringCacheOpt {
    public static native void doStringCache(boolean z, String[] strArr, String[] strArr2, String[] strArr3);

    public static void LIZ(boolean z, String[] strArr, String[] strArr2, String[] strArr3) {
        C2104908Ml.LIZIZ();
        String str = new String("ab");
        String str2 = new String("H".getBytes(), StandardCharsets.UTF_8);
        PrintStream printStream = System.out;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Init string jni funcs, content: ");
        sbLIZ.append("b");
        sbLIZ.append("H");
        sbLIZ.append(str2);
        sbLIZ.append(str);
        printStream.println(C2188811AlT.LIZIZ(sbLIZ));
        try {
            if (Build.VERSION.SDK_INT <= 30) {
                if (strArr2 != null) {
                    if (strArr == null) {
                        strArr = strArr2;
                    } else {
                        HashSet hashSet = new HashSet(Arrays.asList(strArr2));
                        hashSet.addAll(Arrays.asList(strArr));
                        strArr = (String[]) hashSet.toArray(new String[0]);
                    }
                }
                doStringCache(z, null, strArr, strArr3);
                return;
            }
            doStringCache(z, strArr, strArr2, strArr3);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
