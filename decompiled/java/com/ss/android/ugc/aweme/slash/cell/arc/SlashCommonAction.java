package com.ss.android.ugc.aweme.slash.cell.arc;

import X.C09CT;
import X.C1156550gCb;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class SlashCommonAction implements Serializable {
    public static final C1156550gCb Companion = new Object() { // from class: X.0gCb
    };

    @C09CT("params")
    public final Map<String, Object> params;

    @C09CT("type")
    public final String type;

    public SlashCommonAction() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlashCommonAction)) {
            return false;
        }
        SlashCommonAction slashCommonAction = (SlashCommonAction) obj;
        return Intrinsics.LJFF(this.params, slashCommonAction.params) && Intrinsics.LJFF(this.type, slashCommonAction.type);
    }

    public int hashCode() {
        Map<String, Object> map = this.params;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        String str = this.type;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlashCommonAction(params=");
        sbLIZ.append(this.params);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isTrackEvent() {
        return Intrinsics.LJFF(this.type, "track");
    }

    public SlashCommonAction(Map<String, ? extends Object> map, String str) {
        this.params = map;
        this.type = str;
    }
}
