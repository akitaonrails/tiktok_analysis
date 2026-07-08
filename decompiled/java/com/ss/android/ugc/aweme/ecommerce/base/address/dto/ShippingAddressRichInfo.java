package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ShippingAddressRichInfo;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.IconAttribute;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ShippingAddressRichInfo implements Parcelable {

    @C09CT("description_list")
    public List<ECRichText> descriptionList;

    @C09CT("icon_attribute")
    public IconAttribute icon;

    @C09CT("show_type")
    public Integer showType;

    @C09CT("title")
    public ECRichText title;
    public static final Parcelable.Creator<ShippingAddressRichInfo> CREATOR = new Parcelable.Creator<ShippingAddressRichInfo>() { // from class: X.02mp
        @Override // android.os.Parcelable.Creator
        public final ShippingAddressRichInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(ShippingAddressRichInfo.class.getClassLoader());
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(ShippingAddressRichInfo.class.getClassLoader()));
                }
            }
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new ShippingAddressRichInfo(eCRichText, arrayList, numValueOf, (IconAttribute) parcel.readParcelable(ShippingAddressRichInfo.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ShippingAddressRichInfo[] newArray(int i) {
            return new ShippingAddressRichInfo[i];
        }
    };
    public static final int $stable = 8;

    public ShippingAddressRichInfo() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShippingAddressRichInfo)) {
            return false;
        }
        ShippingAddressRichInfo shippingAddressRichInfo = (ShippingAddressRichInfo) obj;
        return Intrinsics.LJFF(this.title, shippingAddressRichInfo.title) && Intrinsics.LJFF(this.descriptionList, shippingAddressRichInfo.descriptionList) && Intrinsics.LJFF(this.showType, shippingAddressRichInfo.showType) && Intrinsics.LJFF(this.icon, shippingAddressRichInfo.icon);
    }

    public final int hashCode() {
        ECRichText eCRichText = this.title;
        int iHashCode = (eCRichText == null ? 0 : eCRichText.hashCode()) * 31;
        List<ECRichText> list = this.descriptionList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.showType;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        IconAttribute iconAttribute = this.icon;
        return iHashCode3 + (iconAttribute != null ? iconAttribute.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShippingAddressRichInfo(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", descriptionList=");
        sbLIZ.append(this.descriptionList);
        sbLIZ.append(", showType=");
        sbLIZ.append(this.showType);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.title, i);
        List<ECRichText> list = this.descriptionList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<ECRichText> it2 = list.iterator();
            while (it2.hasNext()) {
                parcel.writeParcelable(it2.next(), i);
            }
        }
        Integer num = this.showType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeParcelable(this.icon, i);
    }

    public ShippingAddressRichInfo(ECRichText eCRichText, List<ECRichText> list, Integer num, IconAttribute iconAttribute) {
        this.title = eCRichText;
        this.descriptionList = list;
        this.showType = num;
        this.icon = iconAttribute;
    }
}
