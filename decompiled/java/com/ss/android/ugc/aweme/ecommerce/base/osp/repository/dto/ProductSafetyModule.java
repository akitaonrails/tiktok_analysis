package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ProductSafetyModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ProductSafetyModule implements Parcelable {

    @C09CT("disclaimer_text")
    public String disClaimerText;

    @C09CT("safety_icons")
    public List<Icon> iconList;

    @C09CT("safety_texts")
    public List<String> safetyText;

    @C09CT("schema")
    public String schema;

    @C09CT("sub_title")
    public String subTitle;

    @C09CT("title")
    public String title;
    public static final Parcelable.Creator<ProductSafetyModule> CREATOR = new Parcelable.Creator<ProductSafetyModule>() { // from class: X.02Tk
        @Override // android.os.Parcelable.Creator
        public final ProductSafetyModule createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(ProductSafetyModule.class.getClassLoader()));
                }
            }
            return new ProductSafetyModule(string, arrayList, parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ProductSafetyModule[] newArray(int i) {
            return new ProductSafetyModule[i];
        }
    };
    public static final int $stable = 8;

    public ProductSafetyModule() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductSafetyModule)) {
            return false;
        }
        ProductSafetyModule productSafetyModule = (ProductSafetyModule) obj;
        return Intrinsics.LJFF(this.title, productSafetyModule.title) && Intrinsics.LJFF(this.iconList, productSafetyModule.iconList) && Intrinsics.LJFF(this.subTitle, productSafetyModule.subTitle) && Intrinsics.LJFF(this.safetyText, productSafetyModule.safetyText) && Intrinsics.LJFF(this.disClaimerText, productSafetyModule.disClaimerText) && Intrinsics.LJFF(this.schema, productSafetyModule.schema);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<Icon> list = this.iconList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.subTitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list2 = this.safetyText;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str3 = this.disClaimerText;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.schema;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProductSafetyModule(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", iconList=");
        sbLIZ.append(this.iconList);
        sbLIZ.append(", subTitle=");
        sbLIZ.append(this.subTitle);
        sbLIZ.append(", safetyText=");
        sbLIZ.append(this.safetyText);
        sbLIZ.append(", disClaimerText=");
        sbLIZ.append(this.disClaimerText);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        List<Icon> list = this.iconList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Icon> it2 = list.iterator();
            while (it2.hasNext()) {
                parcel.writeParcelable(it2.next(), i);
            }
        }
        parcel.writeString(this.subTitle);
        parcel.writeStringList(this.safetyText);
        parcel.writeString(this.disClaimerText);
        parcel.writeString(this.schema);
    }

    public ProductSafetyModule(String str, List<Icon> list, String str2, List<String> list2, String str3, String str4) {
        this.title = str;
        this.iconList = list;
        this.subTitle = str2;
        this.safetyText = list2;
        this.disClaimerText = str3;
        this.schema = str4;
    }
}
