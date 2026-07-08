package com.ss.android.ugc.aweme.poi.detail.cells;

import X.C09CT;
import X.C1178930gmh;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.poi.detail.container.model.DynamicIcon;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class AddressInfo implements Serializable {
    public static final C1178930gmh Companion = new Object() { // from class: X.0gmh
    };

    @C09CT("address_show_type")
    public final Integer addressShowType;

    @C09CT("distance_content")
    public final String distanceContent;

    @C09CT("distance_icon")
    public final DynamicIcon distanceIcon;

    @C09CT("distance_type")
    public final Integer distanceType;

    @C09CT("location_content")
    public final String locationContent;

    public AddressInfo() {
        this(null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressInfo)) {
            return false;
        }
        AddressInfo addressInfo = (AddressInfo) obj;
        return Intrinsics.LJFF(this.distanceContent, addressInfo.distanceContent) && Intrinsics.LJFF(this.locationContent, addressInfo.locationContent) && Intrinsics.LJFF(this.distanceType, addressInfo.distanceType) && Intrinsics.LJFF(this.addressShowType, addressInfo.addressShowType) && Intrinsics.LJFF(this.distanceIcon, addressInfo.distanceIcon);
    }

    public int hashCode() {
        String str = this.distanceContent;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.locationContent;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.distanceType;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.addressShowType;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        DynamicIcon dynamicIcon = this.distanceIcon;
        return iHashCode4 + (dynamicIcon != null ? dynamicIcon.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddressInfo(distanceContent=");
        sbLIZ.append(this.distanceContent);
        sbLIZ.append(", locationContent=");
        sbLIZ.append(this.locationContent);
        sbLIZ.append(", distanceType=");
        sbLIZ.append(this.distanceType);
        sbLIZ.append(", addressShowType=");
        sbLIZ.append(this.addressShowType);
        sbLIZ.append(", distanceIcon=");
        sbLIZ.append(this.distanceIcon);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AddressInfo(String str, String str2, Integer num, Integer num2, DynamicIcon dynamicIcon) {
        this.distanceContent = str;
        this.locationContent = str2;
        this.distanceType = num;
        this.addressShowType = num2;
        this.distanceIcon = dynamicIcon;
    }
}
