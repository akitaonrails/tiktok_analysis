package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.productinterlink;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.productinterlink.ProductInterlinkItemVO;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ProductInterlinkItemVO implements Parcelable {

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("event_tracking_trigger_keys")
    public final Map<String, String> eventTrackingTriggerKeys;

    @C09CT("module_da_info")
    public final String moduleDaInfo;

    @C09CT("product_da_info")
    public final String productDaInfo;

    @C09CT("pdp_jump_schema")
    public final String schema;

    @C09CT("value_name")
    public final String valueName;
    public static final Parcelable.Creator<ProductInterlinkItemVO> CREATOR = new Parcelable.Creator<ProductInterlinkItemVO>() { // from class: X.03xB
        @Override // android.os.Parcelable.Creator
        public final ProductInterlinkItemVO createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            return new ProductInterlinkItemVO(string, string2, string3, string4, string5, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final ProductInterlinkItemVO[] newArray(int i) {
            return new ProductInterlinkItemVO[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductInterlinkItemVO)) {
            return false;
        }
        ProductInterlinkItemVO productInterlinkItemVO = (ProductInterlinkItemVO) obj;
        return Intrinsics.LJFF(this.valueName, productInterlinkItemVO.valueName) && Intrinsics.LJFF(this.schema, productInterlinkItemVO.schema) && Intrinsics.LJFF(this.daInfo, productInterlinkItemVO.daInfo) && Intrinsics.LJFF(this.moduleDaInfo, productInterlinkItemVO.moduleDaInfo) && Intrinsics.LJFF(this.productDaInfo, productInterlinkItemVO.productDaInfo) && Intrinsics.LJFF(this.eventTrackingTriggerKeys, productInterlinkItemVO.eventTrackingTriggerKeys);
    }

    public final int hashCode() {
        String str = this.valueName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.schema;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.daInfo;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.moduleDaInfo;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.productDaInfo;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Map<String, String> map = this.eventTrackingTriggerKeys;
        return iHashCode5 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProductInterlinkItemVO(valueName=");
        sbLIZ.append(this.valueName);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(", moduleDaInfo=");
        sbLIZ.append(this.moduleDaInfo);
        sbLIZ.append(", productDaInfo=");
        sbLIZ.append(this.productDaInfo);
        sbLIZ.append(", eventTrackingTriggerKeys=");
        sbLIZ.append(this.eventTrackingTriggerKeys);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.valueName);
        parcel.writeString(this.schema);
        parcel.writeString(this.daInfo);
        parcel.writeString(this.moduleDaInfo);
        parcel.writeString(this.productDaInfo);
        Map<String, String> map = this.eventTrackingTriggerKeys;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    public ProductInterlinkItemVO(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        this.valueName = str;
        this.schema = str2;
        this.daInfo = str3;
        this.moduleDaInfo = str4;
        this.productDaInfo = str5;
        this.eventTrackingTriggerKeys = map;
    }
}
