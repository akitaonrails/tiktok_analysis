package com.ss.android.ugc.aweme.creative.compileconfig;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class CompileConfigLevelStruct<T> implements Serializable {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    @C09CT("default")
    public final T f53default;

    @C09CT("hd")
    public final T hd;

    public CompileConfigLevelStruct() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompileConfigLevelStruct)) {
            return false;
        }
        CompileConfigLevelStruct compileConfigLevelStruct = (CompileConfigLevelStruct) obj;
        return Intrinsics.LJFF(this.f53default, compileConfigLevelStruct.f53default) && Intrinsics.LJFF(this.hd, compileConfigLevelStruct.hd);
    }

    public int hashCode() {
        T t = this.f53default;
        int iHashCode = (t == null ? 0 : t.hashCode()) * 31;
        T t2 = this.hd;
        return iHashCode + (t2 != null ? t2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompileConfigLevelStruct(default=");
        sbLIZ.append(this.f53default);
        sbLIZ.append(", hd=");
        sbLIZ.append(this.hd);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CompileConfigLevelStruct(T t, T t2) {
        this.f53default = t;
        this.hd = t2;
    }
}
