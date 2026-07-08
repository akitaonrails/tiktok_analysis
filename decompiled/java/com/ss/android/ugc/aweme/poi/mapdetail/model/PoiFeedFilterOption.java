package com.ss.android.ugc.aweme.poi.mapdetail.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiFeedFilterOption implements Serializable {

    @C09CT("display_text")
    public final String displayText;

    @C09CT("filter_option_key")
    public final String filterOptionKey;

    @C09CT("filter_type")
    public final Integer filterType;

    @C09CT("filter_type_desc")
    public final String filterTypeDesc;

    @C09CT("is_empty_option")
    public final Boolean isEmptyOption;

    @C09CT("is_selected")
    public final Boolean isSelected;

    public PoiFeedFilterOption() {
        this(null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiFeedFilterOption)) {
            return false;
        }
        PoiFeedFilterOption poiFeedFilterOption = (PoiFeedFilterOption) obj;
        return Intrinsics.LJFF(this.displayText, poiFeedFilterOption.displayText) && Intrinsics.LJFF(this.filterOptionKey, poiFeedFilterOption.filterOptionKey) && Intrinsics.LJFF(this.filterType, poiFeedFilterOption.filterType) && Intrinsics.LJFF(this.filterTypeDesc, poiFeedFilterOption.filterTypeDesc) && Intrinsics.LJFF(this.isSelected, poiFeedFilterOption.isSelected) && Intrinsics.LJFF(this.isEmptyOption, poiFeedFilterOption.isEmptyOption);
    }

    public int hashCode() {
        String str = this.displayText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.filterOptionKey;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.filterType;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.filterTypeDesc;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isSelected;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isEmptyOption;
        return iHashCode5 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiFeedFilterOption(displayText=");
        sbLIZ.append(this.displayText);
        sbLIZ.append(", filterOptionKey=");
        sbLIZ.append(this.filterOptionKey);
        sbLIZ.append(", filterType=");
        sbLIZ.append(this.filterType);
        sbLIZ.append(", filterTypeDesc=");
        sbLIZ.append(this.filterTypeDesc);
        sbLIZ.append(", isSelected=");
        sbLIZ.append(this.isSelected);
        sbLIZ.append(", isEmptyOption=");
        sbLIZ.append(this.isEmptyOption);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Boolean isEmptyOption() {
        return this.isEmptyOption;
    }

    public final Boolean isSelected() {
        return this.isSelected;
    }

    public PoiFeedFilterOption(String str, String str2, Integer num, String str3, Boolean bool, Boolean bool2) {
        this.displayText = str;
        this.filterOptionKey = str2;
        this.filterType = num;
        this.filterTypeDesc = str3;
        this.isSelected = bool;
        this.isEmptyOption = bool2;
    }
}
