package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SESMetric;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopPerformance;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ShopPerformance implements Parcelable {

    @C09CT("shop_performance_content")
    public String content;

    @C09CT("detail_page_url")
    public String learnMoreSchema;

    @C09CT("detail_page_entry_text")
    public String learnMoreText;

    @C09CT("detailed_metrics")
    public List<SESMetric> metricsList;

    @C09CT("shop_performance_title")
    public String title;

    @C09CT("shop_performance_value")
    public Integer value;
    public static final Parcelable.Creator<ShopPerformance> CREATOR = new Parcelable.Creator<ShopPerformance>() { // from class: X.02Xg
        @Override // android.os.Parcelable.Creator
        public final ShopPerformance createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(SESMetric.CREATOR.createFromParcel(parcel));
                }
            }
            return new ShopPerformance(string, string2, numValueOf, string3, string4, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ShopPerformance[] newArray(int i) {
            return new ShopPerformance[i];
        }
    };
    public static final int $stable = 8;

    public ShopPerformance() {
        this(null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopPerformance)) {
            return false;
        }
        ShopPerformance shopPerformance = (ShopPerformance) obj;
        return Intrinsics.LJFF(this.title, shopPerformance.title) && Intrinsics.LJFF(this.content, shopPerformance.content) && Intrinsics.LJFF(this.value, shopPerformance.value) && Intrinsics.LJFF(this.learnMoreText, shopPerformance.learnMoreText) && Intrinsics.LJFF(this.learnMoreSchema, shopPerformance.learnMoreSchema) && Intrinsics.LJFF(this.metricsList, shopPerformance.metricsList);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.content;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.value;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.learnMoreText;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.learnMoreSchema;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<SESMetric> list = this.metricsList;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShopPerformance(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", value=");
        sbLIZ.append(this.value);
        sbLIZ.append(", learnMoreText=");
        sbLIZ.append(this.learnMoreText);
        sbLIZ.append(", learnMoreSchema=");
        sbLIZ.append(this.learnMoreSchema);
        sbLIZ.append(", metricsList=");
        sbLIZ.append(this.metricsList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.content);
        Integer num = this.value;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.learnMoreText);
        parcel.writeString(this.learnMoreSchema);
        List<SESMetric> list = this.metricsList;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<SESMetric> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public ShopPerformance(String str, String str2, Integer num, String str3, String str4, List<SESMetric> list) {
        this.title = str;
        this.content = str2;
        this.value = num;
        this.learnMoreText = str3;
        this.learnMoreSchema = str4;
        this.metricsList = list;
    }
}
