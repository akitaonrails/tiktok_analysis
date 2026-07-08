package com.ss.android.ugc.aweme.poi.detail.worldcup.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class WorldCupDateMatchGroup implements Serializable {

    @C09CT("date_display")
    public final String dateDisplay;

    @C09CT("matches")
    public final List<WorldCupMatch> matches;

    public WorldCupDateMatchGroup() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorldCupDateMatchGroup)) {
            return false;
        }
        WorldCupDateMatchGroup worldCupDateMatchGroup = (WorldCupDateMatchGroup) obj;
        return Intrinsics.LJFF(this.dateDisplay, worldCupDateMatchGroup.dateDisplay) && Intrinsics.LJFF(this.matches, worldCupDateMatchGroup.matches);
    }

    public int hashCode() {
        String str = this.dateDisplay;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<WorldCupMatch> list = this.matches;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WorldCupDateMatchGroup(dateDisplay=");
        sbLIZ.append(this.dateDisplay);
        sbLIZ.append(", matches=");
        sbLIZ.append(this.matches);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public WorldCupDateMatchGroup(String str, List<WorldCupMatch> list) {
        this.dateDisplay = str;
        this.matches = list;
    }
}
