package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CheckPopUpEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class CheckPopUpEntry implements Parcelable {

    @C09CT("coupon_context")
    public final String couponContext;

    @C09CT("external_pass_through_params")
    public final String externalPassThroughParams;

    @C09CT("page_source_info")
    public final String pageSourceInfo;

    @C09CT("pass_through_params")
    public final String passThroughParams;

    @C09CT("product_id")
    public final String productId;

    @C09CT("selected_address_id")
    public final String selectedAddressId;

    @C09CT("ship_to_addr")
    public final List<Region> shipToAddr;

    @C09CT("trigger_type")
    public final Integer triggerType;
    public static final Parcelable.Creator<CheckPopUpEntry> CREATOR = new Parcelable.Creator<CheckPopUpEntry>() { // from class: X.0vvi
        @Override // android.os.Parcelable.Creator
        public final CheckPopUpEntry createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Region.CREATOR.createFromParcel(parcel));
                }
            }
            return new CheckPopUpEntry(string, numValueOf, string2, string3, arrayList, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CheckPopUpEntry[] newArray(int i) {
            return new CheckPopUpEntry[i];
        }
    };
    public static final int $stable = 8;

    public CheckPopUpEntry() {
        this(null, null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckPopUpEntry)) {
            return false;
        }
        CheckPopUpEntry checkPopUpEntry = (CheckPopUpEntry) obj;
        return Intrinsics.LJFF(this.productId, checkPopUpEntry.productId) && Intrinsics.LJFF(this.triggerType, checkPopUpEntry.triggerType) && Intrinsics.LJFF(this.couponContext, checkPopUpEntry.couponContext) && Intrinsics.LJFF(this.selectedAddressId, checkPopUpEntry.selectedAddressId) && Intrinsics.LJFF(this.shipToAddr, checkPopUpEntry.shipToAddr) && Intrinsics.LJFF(this.passThroughParams, checkPopUpEntry.passThroughParams) && Intrinsics.LJFF(this.pageSourceInfo, checkPopUpEntry.pageSourceInfo) && Intrinsics.LJFF(this.externalPassThroughParams, checkPopUpEntry.externalPassThroughParams);
    }

    public final int hashCode() {
        String str = this.productId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.triggerType;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.couponContext;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.selectedAddressId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<Region> list = this.shipToAddr;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.passThroughParams;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.pageSourceInfo;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.externalPassThroughParams;
        return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckPopUpEntry(productId=");
        sbLIZ.append(this.productId);
        sbLIZ.append(", triggerType=");
        sbLIZ.append(this.triggerType);
        sbLIZ.append(", couponContext=");
        sbLIZ.append(this.couponContext);
        sbLIZ.append(", selectedAddressId=");
        sbLIZ.append(this.selectedAddressId);
        sbLIZ.append(", shipToAddr=");
        sbLIZ.append(this.shipToAddr);
        sbLIZ.append(", passThroughParams=");
        sbLIZ.append(this.passThroughParams);
        sbLIZ.append(", pageSourceInfo=");
        sbLIZ.append(this.pageSourceInfo);
        sbLIZ.append(", externalPassThroughParams=");
        sbLIZ.append(this.externalPassThroughParams);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.productId);
        Integer num = this.triggerType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.couponContext);
        parcel.writeString(this.selectedAddressId);
        List<Region> list = this.shipToAddr;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Region> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.passThroughParams);
        parcel.writeString(this.pageSourceInfo);
        parcel.writeString(this.externalPassThroughParams);
    }

    public CheckPopUpEntry(String str, Integer num, String str2, String str3, List<Region> list, String str4, String str5, String str6) {
        this.productId = str;
        this.triggerType = num;
        this.couponContext = str2;
        this.selectedAddressId = str3;
        this.shipToAddr = list;
        this.passThroughParams = str4;
        this.pageSourceInfo = str5;
        this.externalPassThroughParams = str6;
    }
}
