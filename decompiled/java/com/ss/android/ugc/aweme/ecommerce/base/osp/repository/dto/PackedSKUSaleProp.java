package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PackedSKUSaleProp {

    @C09CT("prop_id")
    public String propId;

    @C09CT("prop_name")
    public String propName;

    @C09CT("prop_value")
    public String propValue;

    @C09CT("prop_value_id")
    public String propValueId;

    public PackedSKUSaleProp() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PackedSKUSaleProp)) {
            return false;
        }
        PackedSKUSaleProp packedSKUSaleProp = (PackedSKUSaleProp) obj;
        return Intrinsics.LJFF(this.propId, packedSKUSaleProp.propId) && Intrinsics.LJFF(this.propValueId, packedSKUSaleProp.propValueId) && Intrinsics.LJFF(this.propName, packedSKUSaleProp.propName) && Intrinsics.LJFF(this.propValue, packedSKUSaleProp.propValue);
    }

    public final int hashCode() {
        String str = this.propId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.propValueId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.propName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.propValue;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PackedSKUSaleProp(propId=");
        sbLIZ.append(this.propId);
        sbLIZ.append(", propValueId=");
        sbLIZ.append(this.propValueId);
        sbLIZ.append(", propName=");
        sbLIZ.append(this.propName);
        sbLIZ.append(", propValue=");
        sbLIZ.append(this.propValue);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PackedSKUSaleProp(String str, String str2, String str3, String str4) {
        this.propId = str;
        this.propValueId = str2;
        this.propName = str3;
        this.propValue = str4;
    }
}
