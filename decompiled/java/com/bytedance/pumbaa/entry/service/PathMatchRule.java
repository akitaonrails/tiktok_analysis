package com.bytedance.pumbaa.entry.service;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class PathMatchRule {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("pattern")
    public final String pattern;

    @C09CT("type")
    public final String type;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PathMatchRule)) {
            return false;
        }
        PathMatchRule pathMatchRule = (PathMatchRule) obj;
        return Intrinsics.LJFF(this.type, pathMatchRule.type) && Intrinsics.LJFF(this.pattern, pathMatchRule.pattern);
    }

    public final int hashCode() {
        return (this.type.hashCode() * 31) + this.pattern.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PathMatchRule(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", pattern=");
        sbLIZ.append(this.pattern);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PathMatchRule() {
        this("exact", "");
    }

    public PathMatchRule(String str, String str2) {
        this.type = str;
        this.pattern = str2;
    }
}
