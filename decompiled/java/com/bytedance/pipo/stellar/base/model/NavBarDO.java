package com.bytedance.pipo.stellar.base.model;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class NavBarDO extends BaseWidgetDO {

    @C09CT("center")
    public final NavbarActionDO centerAction;

    @C09CT("end_actions")
    public final List<NavbarActionDO> endActions;

    @C09CT("padding")
    public final MarginDO padding;

    @C09CT("spacing")
    public final String spacing;

    @C09CT("start_actions")
    public final List<NavbarActionDO> startActions;

    public NavBarDO() {
        this(null, null, null, null, null);
    }

    public final NavBarDO copy(String str, MarginDO marginDO, List<NavbarActionDO> list, List<NavbarActionDO> list2, NavbarActionDO navbarActionDO) {
        return new NavBarDO(str, marginDO, list, list2, navbarActionDO);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NavBarDO)) {
            return false;
        }
        NavBarDO navBarDO = (NavBarDO) obj;
        return Intrinsics.LJFF(this.spacing, navBarDO.spacing) && Intrinsics.LJFF(this.padding, navBarDO.padding) && Intrinsics.LJFF(this.startActions, navBarDO.startActions) && Intrinsics.LJFF(this.endActions, navBarDO.endActions) && Intrinsics.LJFF(this.centerAction, navBarDO.centerAction);
    }

    public int hashCode() {
        String str = this.spacing;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        MarginDO marginDO = this.padding;
        int iHashCode2 = (iHashCode + (marginDO == null ? 0 : marginDO.hashCode())) * 31;
        List<NavbarActionDO> list = this.startActions;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<NavbarActionDO> list2 = this.endActions;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        NavbarActionDO navbarActionDO = this.centerAction;
        return iHashCode4 + (navbarActionDO != null ? navbarActionDO.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NavBarDO(spacing=");
        sbLIZ.append(this.spacing);
        sbLIZ.append(", padding=");
        sbLIZ.append(this.padding);
        sbLIZ.append(", startActions=");
        sbLIZ.append(this.startActions);
        sbLIZ.append(", endActions=");
        sbLIZ.append(this.endActions);
        sbLIZ.append(", centerAction=");
        sbLIZ.append(this.centerAction);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final NavbarActionDO getCenterAction() {
        return this.centerAction;
    }

    public final List<NavbarActionDO> getEndActions() {
        return this.endActions;
    }

    public final MarginDO getPadding() {
        return this.padding;
    }

    public final String getSpacing() {
        return this.spacing;
    }

    public final List<NavbarActionDO> getStartActions() {
        return this.startActions;
    }

    public NavBarDO(String str, MarginDO marginDO, List<NavbarActionDO> list, List<NavbarActionDO> list2, NavbarActionDO navbarActionDO) {
        super(null, null, 1, null, null);
        this.spacing = str;
        this.padding = marginDO;
        this.startActions = list;
        this.endActions = list2;
        this.centerAction = navbarActionDO;
    }
}
