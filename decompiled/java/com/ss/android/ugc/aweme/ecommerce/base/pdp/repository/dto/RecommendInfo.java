package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RecommendInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class RecommendInfo implements Parcelable {

    @C09CT("full_vap_schema")
    public String fullVapSchema;

    @C09CT("recommend_extra")
    public final Map<String, String> recommendExtra;

    @C09CT("recommend_products")
    public final List<ProductBase> recommendProducts;

    @C09CT("recommend_title")
    public final String recommendTitle;

    @C09CT("vap_schema")
    public String vapSchema;
    public static final Parcelable.Creator<RecommendInfo> CREATOR = new Parcelable.Creator<RecommendInfo>() { // from class: X.02oT
        @Override // android.os.Parcelable.Creator
        public final RecommendInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            LinkedHashMap linkedHashMap = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(ProductBase.CREATOR.createFromParcel(parcel));
                }
            }
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            return new RecommendInfo(arrayList, string, linkedHashMap, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RecommendInfo[] newArray(int i) {
            return new RecommendInfo[i];
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
        if (!(obj instanceof RecommendInfo)) {
            return false;
        }
        RecommendInfo recommendInfo = (RecommendInfo) obj;
        return Intrinsics.LJFF(this.recommendProducts, recommendInfo.recommendProducts) && Intrinsics.LJFF(this.recommendTitle, recommendInfo.recommendTitle) && Intrinsics.LJFF(this.recommendExtra, recommendInfo.recommendExtra) && Intrinsics.LJFF(this.fullVapSchema, recommendInfo.fullVapSchema) && Intrinsics.LJFF(this.vapSchema, recommendInfo.vapSchema);
    }

    public final int hashCode() {
        List<ProductBase> list = this.recommendProducts;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.recommendTitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, String> map = this.recommendExtra;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.fullVapSchema;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.vapSchema;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecommendInfo(recommendProducts=");
        sbLIZ.append(this.recommendProducts);
        sbLIZ.append(", recommendTitle=");
        sbLIZ.append(this.recommendTitle);
        sbLIZ.append(", recommendExtra=");
        sbLIZ.append(this.recommendExtra);
        sbLIZ.append(", fullVapSchema=");
        sbLIZ.append(this.fullVapSchema);
        sbLIZ.append(", vapSchema=");
        sbLIZ.append(this.vapSchema);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<ProductBase> list = this.recommendProducts;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<ProductBase> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.recommendTitle);
        Map<String, String> map = this.recommendExtra;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        parcel.writeString(this.fullVapSchema);
        parcel.writeString(this.vapSchema);
    }

    public RecommendInfo(List<ProductBase> list, String str, Map<String, String> map, String str2, String str3) {
        this.recommendProducts = list;
        this.recommendTitle = str;
        this.recommendExtra = map;
        this.fullVapSchema = str2;
        this.vapSchema = str3;
    }
}
