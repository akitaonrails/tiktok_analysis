package com.ss.android.ugc.aweme.aigc.graph.nodes.node;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class BuiltinNodeErrorCustomContext {

    @C09CT("legacyCode")
    public final int legacyCode;

    @C09CT("legacyMessage")
    public final String legacyMessage;

    @C09CT("serverCode")
    public final Integer serverCode;

    @C09CT("serverMessage")
    public final String serverMessage;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuiltinNodeErrorCustomContext)) {
            return false;
        }
        BuiltinNodeErrorCustomContext builtinNodeErrorCustomContext = (BuiltinNodeErrorCustomContext) obj;
        return this.legacyCode == builtinNodeErrorCustomContext.legacyCode && Intrinsics.LJFF(this.legacyMessage, builtinNodeErrorCustomContext.legacyMessage) && Intrinsics.LJFF(this.serverCode, builtinNodeErrorCustomContext.serverCode) && Intrinsics.LJFF(this.serverMessage, builtinNodeErrorCustomContext.serverMessage);
    }

    public final int hashCode() {
        int iHashCode = ((this.legacyCode * 31) + this.legacyMessage.hashCode()) * 31;
        Integer num = this.serverCode;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.serverMessage;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BuiltinNodeErrorCustomContext(legacyCode=");
        sbLIZ.append(this.legacyCode);
        sbLIZ.append(", legacyMessage=");
        sbLIZ.append(this.legacyMessage);
        sbLIZ.append(", serverCode=");
        sbLIZ.append(this.serverCode);
        sbLIZ.append(", serverMessage=");
        sbLIZ.append(this.serverMessage);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BuiltinNodeErrorCustomContext(int i, String str, Integer num, String str2) {
        this.legacyCode = i;
        this.legacyMessage = str;
        this.serverCode = num;
        this.serverMessage = str2;
    }
}
