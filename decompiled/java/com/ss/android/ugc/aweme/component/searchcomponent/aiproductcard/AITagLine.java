package com.ss.android.ugc.aweme.component.searchcomponent.aiproductcard;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AITagLine implements Serializable {
    public static final int $stable = 8;

    @C09CT("blocks")
    public final List<AITagBlock> blocks;

    @C09CT("separator_type")
    public final Integer separatorType;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AITagLine)) {
            return false;
        }
        AITagLine aITagLine = (AITagLine) obj;
        return Intrinsics.LJFF(this.separatorType, aITagLine.separatorType) && Intrinsics.LJFF(this.blocks, aITagLine.blocks);
    }

    public int hashCode() {
        Integer num = this.separatorType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<AITagBlock> list = this.blocks;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AITagLine(separatorType=");
        sbLIZ.append(this.separatorType);
        sbLIZ.append(", blocks=");
        sbLIZ.append(this.blocks);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AITagLine(Integer num, List<AITagBlock> list) {
        this.separatorType = num;
        this.blocks = list;
    }
}
