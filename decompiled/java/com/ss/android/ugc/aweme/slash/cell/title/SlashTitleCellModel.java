package com.ss.android.ugc.aweme.slash.cell.title;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.slash.cell.arc.BaseSlashCellData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class SlashTitleCellModel extends BaseSlashCellData {

    @C09CT("more_button_click_event")
    public final String moreButtonClickEvent;

    @C09CT("more_button_icon")
    public final String moreButtonIcon;

    @C09CT("more_button_text")
    public final String moreButtonText;

    @C09CT("title")
    public final String title;

    public SlashTitleCellModel() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlashTitleCellModel)) {
            return false;
        }
        SlashTitleCellModel slashTitleCellModel = (SlashTitleCellModel) obj;
        return Intrinsics.LJFF(this.title, slashTitleCellModel.title) && Intrinsics.LJFF(this.moreButtonText, slashTitleCellModel.moreButtonText) && Intrinsics.LJFF(this.moreButtonIcon, slashTitleCellModel.moreButtonIcon) && Intrinsics.LJFF(this.moreButtonClickEvent, slashTitleCellModel.moreButtonClickEvent);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.moreButtonText;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.moreButtonIcon;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.moreButtonClickEvent;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlashTitleCellModel(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", moreButtonText=");
        sbLIZ.append(this.moreButtonText);
        sbLIZ.append(", moreButtonIcon=");
        sbLIZ.append(this.moreButtonIcon);
        sbLIZ.append(", moreButtonClickEvent=");
        sbLIZ.append(this.moreButtonClickEvent);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SlashTitleCellModel(String str, String str2, String str3, String str4) {
        super(null, null);
        this.title = str;
        this.moreButtonText = str2;
        this.moreButtonIcon = str3;
        this.moreButtonClickEvent = str4;
    }
}
