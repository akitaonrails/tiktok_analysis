package com.ss.android.ugc.aweme.poi;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiAnchorCardSecondLine implements Serializable {

    @C09CT("extra")
    public final String extra;

    @C09CT("sub_type")
    public final String subType;

    @C09CT("suffix_value")
    public final String suffixValue;

    @C09CT("type")
    public final String type;

    @C09CT("value")
    public final String value;

    public PoiAnchorCardSecondLine() {
        this(null, null, null, null, null);
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.value;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.suffixValue;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.extra;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public PoiAnchorCardSecondLine(String str, String str2, String str3, String str4, String str5) {
        this.type = str;
        this.subType = str2;
        this.value = str3;
        this.suffixValue = str4;
        this.extra = str5;
    }
}
