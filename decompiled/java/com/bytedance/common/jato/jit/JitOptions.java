package com.bytedance.common.jato.jit;

import X.C2104908Ml;
import X.C2188811AlT;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class JitOptions {
    public static native void compilerOptionsSupport14();

    public static native long[] getCompileThreshold();

    public static native int getJitTaskCount();

    public static native void setCompileThreshold(int i, int i2, int i3, int i4, int i5);

    public static native void setCompilerOptions(String[] strArr);

    static {
        C2104908Ml.LIZIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZIZ(int i) {
        ArrayList arrayList = new ArrayList();
        if (i > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("--huge-method-max=");
            sbLIZ.append(i);
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (arrayList.isEmpty()) {
            return;
        }
        String[] strArr = new String[arrayList.size()];
        Iterator it2 = arrayList.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            strArr[i2] = it2.next();
            i2++;
        }
        setCompilerOptions(strArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZJ(int i) {
        ArrayList arrayList = new ArrayList();
        if (i > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("--large-method-max=");
            sbLIZ.append(i);
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (arrayList.isEmpty()) {
            return;
        }
        String[] strArr = new String[arrayList.size()];
        Iterator it2 = arrayList.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            strArr[i2] = it2.next();
            i2++;
        }
        setCompilerOptions(strArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (i >= 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("--inline-max-code-units=");
            sbLIZ.append(i);
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (!z) {
            arrayList.add("--no-generate-debug-info");
            arrayList.add("--no-generate-mini-debug-info");
        }
        if (arrayList.isEmpty()) {
            return;
        }
        String[] strArr = new String[arrayList.size()];
        Iterator it2 = arrayList.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            strArr[i2] = it2.next();
            i2++;
        }
        setCompilerOptions(strArr);
    }
}
