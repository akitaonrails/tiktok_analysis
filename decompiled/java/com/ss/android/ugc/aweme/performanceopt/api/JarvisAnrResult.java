package com.ss.android.ugc.aweme.performanceopt.api;

import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class JarvisAnrResult {
    public final String flushDirPath;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof JarvisAnrResult) && Intrinsics.LJFF(this.flushDirPath, ((JarvisAnrResult) obj).flushDirPath);
    }

    public int hashCode() {
        String str = this.flushDirPath;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("JarvisAnrResult(flushDirPath=");
        sbLIZ.append(this.flushDirPath);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public JarvisAnrResult(String str) {
        this.flushDirPath = str;
    }
}
