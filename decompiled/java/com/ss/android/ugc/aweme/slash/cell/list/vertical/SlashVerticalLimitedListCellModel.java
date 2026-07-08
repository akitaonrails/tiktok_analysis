package com.ss.android.ugc.aweme.slash.cell.list.vertical;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.slash.cell.arc.BaseSlashCellData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class SlashVerticalLimitedListCellModel extends BaseSlashCellData {

    @C09CT("max")
    public final int max;

    @C09CT("see_more_button_height")
    public final int seeMoreButtonHeight;

    @C09CT("see_more_button_icon")
    public final String seeMoreButtonIcon;

    @C09CT("see_more_button_text")
    public final String seeMoreButtonText;

    @C09CT("step")
    public final int step;

    public SlashVerticalLimitedListCellModel() {
        this(4, 12, 72, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlashVerticalLimitedListCellModel)) {
            return false;
        }
        SlashVerticalLimitedListCellModel slashVerticalLimitedListCellModel = (SlashVerticalLimitedListCellModel) obj;
        return this.step == slashVerticalLimitedListCellModel.step && this.max == slashVerticalLimitedListCellModel.max && this.seeMoreButtonHeight == slashVerticalLimitedListCellModel.seeMoreButtonHeight && Intrinsics.LJFF(this.seeMoreButtonText, slashVerticalLimitedListCellModel.seeMoreButtonText) && Intrinsics.LJFF(this.seeMoreButtonIcon, slashVerticalLimitedListCellModel.seeMoreButtonIcon);
    }

    public final int hashCode() {
        int i = ((((this.step * 31) + this.max) * 31) + this.seeMoreButtonHeight) * 31;
        String str = this.seeMoreButtonText;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.seeMoreButtonIcon;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlashVerticalLimitedListCellModel(step=");
        sbLIZ.append(this.step);
        sbLIZ.append(", max=");
        sbLIZ.append(this.max);
        sbLIZ.append(", seeMoreButtonHeight=");
        sbLIZ.append(this.seeMoreButtonHeight);
        sbLIZ.append(", seeMoreButtonText=");
        sbLIZ.append(this.seeMoreButtonText);
        sbLIZ.append(", seeMoreButtonIcon=");
        sbLIZ.append(this.seeMoreButtonIcon);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SlashVerticalLimitedListCellModel(int i, int i2, int i3, String str, String str2) {
        super(null, null);
        this.step = i;
        this.max = i2;
        this.seeMoreButtonHeight = i3;
        this.seeMoreButtonText = str;
        this.seeMoreButtonIcon = str2;
    }
}
