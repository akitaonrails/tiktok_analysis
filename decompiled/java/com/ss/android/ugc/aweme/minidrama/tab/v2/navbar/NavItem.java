package com.ss.android.ugc.aweme.minidrama.tab.v2.navbar;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class NavItem implements Serializable {

    @C09CT("icon")
    public final String icon;

    @C09CT("name")
    public final String name;

    @C09CT("schema")
    public final String schema;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NavItem)) {
            return false;
        }
        NavItem navItem = (NavItem) obj;
        return Intrinsics.LJFF(this.icon, navItem.icon) && Intrinsics.LJFF(this.name, navItem.name) && Intrinsics.LJFF(this.schema, navItem.schema);
    }

    public int hashCode() {
        String str = this.icon;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.schema;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NavItem(icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public NavItem(String str, String str2, String str3) {
        this.icon = str;
        this.name = str2;
        this.schema = str3;
    }
}
