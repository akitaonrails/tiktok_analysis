package com.ss.android.ugc.aweme.comment.plus;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class PlusPanelConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("fold_buttons")
    public final List<String> foldButtons;

    @C09CT("plus_panel_buttons")
    public final List<String> plusPanelButtons;

    @C09CT("unfold_buttons")
    public final List<String> unfoldButtons;

    public PlusPanelConfig() {
        this(false, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlusPanelConfig)) {
            return false;
        }
        PlusPanelConfig plusPanelConfig = (PlusPanelConfig) obj;
        return this.enable == plusPanelConfig.enable && Intrinsics.LJFF(this.foldButtons, plusPanelConfig.foldButtons) && Intrinsics.LJFF(this.unfoldButtons, plusPanelConfig.unfoldButtons) && Intrinsics.LJFF(this.plusPanelButtons, plusPanelConfig.plusPanelButtons);
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.enable) * 31) + this.foldButtons.hashCode()) * 31) + this.unfoldButtons.hashCode()) * 31) + this.plusPanelButtons.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlusPanelConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", foldButtons=");
        sbLIZ.append(this.foldButtons);
        sbLIZ.append(", unfoldButtons=");
        sbLIZ.append(this.unfoldButtons);
        sbLIZ.append(", plusPanelButtons=");
        sbLIZ.append(this.plusPanelButtons);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PlusPanelConfig(boolean z, List<String> list, List<String> list2, List<String> list3) {
        this.enable = z;
        this.foldButtons = list;
        this.unfoldButtons = list2;
        this.plusPanelButtons = list3;
    }

    public PlusPanelConfig(boolean z, List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? C13BV.INSTANCE : list2, (i & 8) != 0 ? C13BV.INSTANCE : list3);
    }
}
