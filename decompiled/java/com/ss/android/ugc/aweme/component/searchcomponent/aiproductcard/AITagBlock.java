package com.ss.android.ugc.aweme.component.searchcomponent.aiproductcard;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AITagBlock implements Serializable {
    public static final int $stable = 0;

    @C09CT("text")
    public final String text;

    @C09CT("type")
    public final Integer type;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AITagBlock)) {
            return false;
        }
        AITagBlock aITagBlock = (AITagBlock) obj;
        return Intrinsics.LJFF(this.type, aITagBlock.type) && Intrinsics.LJFF(this.text, aITagBlock.text);
    }

    public int hashCode() {
        Integer num = this.type;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.text;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AITagBlock(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AITagBlock(Integer num, String str) {
        this.type = num;
        this.text = str;
    }
}
