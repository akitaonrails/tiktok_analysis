package com.ss.android.ugc.aweme.poi.mapdetail.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiFeedFilterStruct implements Serializable {

    @C09CT("filter_type")
    public final Integer filterType;

    @C09CT("filter_type_desc")
    public final String filterTypeDesc;

    @C09CT("is_multi_selection")
    public final Boolean isMultiSelection;

    @C09CT("name")
    public final String name;

    @C09CT("option_list")
    public final List<PoiFeedFilterOption> optionList;

    public PoiFeedFilterStruct() {
        this(null, null, null, null, null);
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.filterType;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.filterTypeDesc;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<PoiFeedFilterOption> list = this.optionList;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.isMultiSelection;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiFeedFilterStruct(name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", filterType=");
        sbLIZ.append(this.filterType);
        sbLIZ.append(", filterTypeDesc=");
        sbLIZ.append(this.filterTypeDesc);
        sbLIZ.append(", optionList=");
        sbLIZ.append(this.optionList);
        sbLIZ.append(", isMultiSelection=");
        sbLIZ.append(this.isMultiSelection);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Boolean isMultiSelection() {
        return this.isMultiSelection;
    }

    public PoiFeedFilterStruct(String str, Integer num, String str2, List<PoiFeedFilterOption> list, Boolean bool) {
        this.name = str;
        this.filterType = num;
        this.filterTypeDesc = str2;
        this.optionList = list;
        this.isMultiSelection = bool;
    }
}
