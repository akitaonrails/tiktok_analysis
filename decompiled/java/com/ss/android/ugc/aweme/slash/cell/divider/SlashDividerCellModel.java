package com.ss.android.ugc.aweme.slash.cell.divider;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.slash.cell.arc.BaseSlashCellData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class SlashDividerCellModel extends BaseSlashCellData {

    @C09CT("color")
    public final String color;

    @C09CT("height")
    public final Integer height;

    @C09CT("height_pixel")
    public final Integer heightPixel;

    public SlashDividerCellModel() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlashDividerCellModel)) {
            return false;
        }
        SlashDividerCellModel slashDividerCellModel = (SlashDividerCellModel) obj;
        return Intrinsics.LJFF(this.height, slashDividerCellModel.height) && Intrinsics.LJFF(this.color, slashDividerCellModel.color) && Intrinsics.LJFF(this.heightPixel, slashDividerCellModel.heightPixel);
    }

    public final int hashCode() {
        Integer num = this.height;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.color;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.heightPixel;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlashDividerCellModel(height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", color=");
        sbLIZ.append(this.color);
        sbLIZ.append(", heightPixel=");
        sbLIZ.append(this.heightPixel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SlashDividerCellModel(Integer num, String str, Integer num2) {
        super(null, null);
        this.height = num;
        this.color = str;
        this.heightPixel = num2;
    }
}
