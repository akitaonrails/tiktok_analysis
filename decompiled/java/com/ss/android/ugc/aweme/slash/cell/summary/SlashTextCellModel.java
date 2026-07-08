package com.ss.android.ugc.aweme.slash.cell.summary;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.slash.cell.arc.BaseSlashCellData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class SlashTextCellModel extends BaseSlashCellData {

    @C09CT("font")
    public final String font;

    @C09CT("max_lines")
    public final int maxLine;

    @C09CT("content")
    public final String text;

    @C09CT("text_color")
    public final String textColor;

    public SlashTextCellModel() {
        this(null, null, null, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlashTextCellModel)) {
            return false;
        }
        SlashTextCellModel slashTextCellModel = (SlashTextCellModel) obj;
        return Intrinsics.LJFF(this.text, slashTextCellModel.text) && Intrinsics.LJFF(this.textColor, slashTextCellModel.textColor) && Intrinsics.LJFF(this.font, slashTextCellModel.font) && this.maxLine == slashTextCellModel.maxLine;
    }

    public final int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.textColor;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.font;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.maxLine;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlashTextCellModel(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", textColor=");
        sbLIZ.append(this.textColor);
        sbLIZ.append(", font=");
        sbLIZ.append(this.font);
        sbLIZ.append(", maxLine=");
        sbLIZ.append(this.maxLine);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SlashTextCellModel(String str, String str2, String str3, int i) {
        super(null, null);
        this.text = str;
        this.textColor = str2;
        this.font = str3;
        this.maxLine = i;
    }
}
