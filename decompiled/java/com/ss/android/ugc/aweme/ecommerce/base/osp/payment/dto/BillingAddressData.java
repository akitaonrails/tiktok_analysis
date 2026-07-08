package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class BillingAddressData {

    @C09CT("billingAddressLine")
    public final String billingAddressLine;

    @C09CT("billingCity")
    public final String billingCity;

    @C09CT("billingCountryRegionCode")
    public final String billingCountryRegionCode;

    @C09CT("billingCountryRegionDisplay")
    public final String billingCountryRegionDisplay;

    @C09CT("billingPostalCode")
    public final String billingPostalCode;

    @C09CT("billingState")
    public final String billingState;

    @C09CT("selectedRegion")
    public final List<Region> selectedRegion;

    public BillingAddressData() {
        this(null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillingAddressData)) {
            return false;
        }
        BillingAddressData billingAddressData = (BillingAddressData) obj;
        return Intrinsics.LJFF(this.billingAddressLine, billingAddressData.billingAddressLine) && Intrinsics.LJFF(this.billingCity, billingAddressData.billingCity) && Intrinsics.LJFF(this.billingCountryRegionDisplay, billingAddressData.billingCountryRegionDisplay) && Intrinsics.LJFF(this.billingCountryRegionCode, billingAddressData.billingCountryRegionCode) && Intrinsics.LJFF(this.billingPostalCode, billingAddressData.billingPostalCode) && Intrinsics.LJFF(this.billingState, billingAddressData.billingState) && Intrinsics.LJFF(this.selectedRegion, billingAddressData.selectedRegion);
    }

    public final int hashCode() {
        String str = this.billingAddressLine;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.billingCity;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.billingCountryRegionDisplay;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.billingCountryRegionCode;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.billingPostalCode;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.billingState;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<Region> list = this.selectedRegion;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BillingAddressData(billingAddressLine=");
        sbLIZ.append(this.billingAddressLine);
        sbLIZ.append(", billingCity=");
        sbLIZ.append(this.billingCity);
        sbLIZ.append(", billingCountryRegionDisplay=");
        sbLIZ.append(this.billingCountryRegionDisplay);
        sbLIZ.append(", billingCountryRegionCode=");
        sbLIZ.append(this.billingCountryRegionCode);
        sbLIZ.append(", billingPostalCode=");
        sbLIZ.append(this.billingPostalCode);
        sbLIZ.append(", billingState=");
        sbLIZ.append(this.billingState);
        sbLIZ.append(", selectedRegion=");
        sbLIZ.append(this.selectedRegion);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BillingAddressData(String str, String str2, String str3, String str4, String str5, String str6, List<Region> list) {
        this.billingAddressLine = str;
        this.billingCity = str2;
        this.billingCountryRegionDisplay = str3;
        this.billingCountryRegionCode = str4;
        this.billingPostalCode = str5;
        this.billingState = str6;
        this.selectedRegion = list;
    }

    public static BillingAddressData LIZ(BillingAddressData billingAddressData, String str, String str2, String str3, String str4, String str5, int i) {
        String str6;
        String str7 = str5;
        String str8 = str4;
        String str9 = str3;
        String str10 = str2;
        String str11 = str;
        if ((i & 1) != 0) {
            str11 = billingAddressData.billingAddressLine;
        }
        if ((i & 2) != 0) {
            str10 = billingAddressData.billingCity;
        }
        List<Region> list = null;
        if ((i & 4) != 0) {
            str6 = billingAddressData.billingCountryRegionDisplay;
        } else {
            str6 = null;
        }
        if ((i & 8) != 0) {
            str9 = billingAddressData.billingCountryRegionCode;
        }
        if ((i & 16) != 0) {
            str8 = billingAddressData.billingPostalCode;
        }
        if ((i & 32) != 0) {
            str7 = billingAddressData.billingState;
        }
        if ((i & 64) != 0) {
            list = billingAddressData.selectedRegion;
        }
        return new BillingAddressData(str11, str10, str6, str9, str8, str7, list);
    }
}
