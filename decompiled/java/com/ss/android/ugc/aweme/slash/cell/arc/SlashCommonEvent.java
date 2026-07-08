package com.ss.android.ugc.aweme.slash.cell.arc;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SlashCommonEvent implements Serializable {

    @C09CT("actions")
    public final List<SlashCommonAction> actions;

    @C09CT("name")
    public final String name;

    public SlashCommonEvent() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlashCommonEvent)) {
            return false;
        }
        SlashCommonEvent slashCommonEvent = (SlashCommonEvent) obj;
        return Intrinsics.LJFF(this.name, slashCommonEvent.name) && Intrinsics.LJFF(this.actions, slashCommonEvent.actions);
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<SlashCommonAction> list = this.actions;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlashCommonEvent(name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", actions=");
        sbLIZ.append(this.actions);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isCellShowEvent() {
        return Intrinsics.LJFF(this.name, "cell_show");
    }

    public SlashCommonEvent(String str, List<SlashCommonAction> list) {
        this.name = str;
        this.actions = list;
    }
}
