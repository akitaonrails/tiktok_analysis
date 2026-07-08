package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1053604Ac;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PageSaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PageSaleProp implements InterfaceC1053604Ac, Parcelable {

    @C09CT("has_image")
    public final Boolean hasImage;

    @C09CT("prop_id")
    public final String propId;

    @C09CT("sale_prop_type")
    public final Integer salePropType;

    @C09CT("sale_prop_values")
    public final List<SalePropValue> salePropValueList;
    public static final Parcelable.Creator<PageSaleProp> CREATOR = new Parcelable.Creator<PageSaleProp>() { // from class: X.02lX
        @Override // android.os.Parcelable.Creator
        public final PageSaleProp createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            ArrayList arrayList;
            String string = parcel.readString();
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(SalePropValue.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new PageSaleProp(string, boolValueOf, arrayList, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final PageSaleProp[] newArray(int i) {
            return new PageSaleProp[i];
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
        if (!(obj instanceof PageSaleProp)) {
            return false;
        }
        PageSaleProp pageSaleProp = (PageSaleProp) obj;
        return Intrinsics.LJFF(this.propId, pageSaleProp.propId) && Intrinsics.LJFF(this.hasImage, pageSaleProp.hasImage) && Intrinsics.LJFF(this.salePropValueList, pageSaleProp.salePropValueList) && Intrinsics.LJFF(this.salePropType, pageSaleProp.salePropType);
    }

    public final int hashCode() {
        String str = this.propId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.hasImage;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List<SalePropValue> list = this.salePropValueList;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.salePropType;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PageSaleProp(propId=");
        sbLIZ.append(this.propId);
        sbLIZ.append(", hasImage=");
        sbLIZ.append(this.hasImage);
        sbLIZ.append(", salePropValueList=");
        sbLIZ.append(this.salePropValueList);
        sbLIZ.append(", salePropType=");
        sbLIZ.append(this.salePropType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.propId);
        Boolean bool = this.hasImage;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        List<SalePropValue> list = this.salePropValueList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<SalePropValue> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        Integer num = this.salePropType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    @Override // X.InterfaceC1053604Ac
    public final Integer LIZ() {
        return this.salePropType;
    }

    @Override // X.InterfaceC1053604Ac
    public final Boolean LIZIZ() {
        return this.hasImage;
    }

    @Override // X.InterfaceC1053604Ac
    public final List<SalePropValue> LIZJ() {
        return this.salePropValueList;
    }

    public PageSaleProp(String str, Boolean bool, List<SalePropValue> list, Integer num) {
        this.propId = str;
        this.hasImage = bool;
        this.salePropValueList = list;
        this.salePropType = num;
    }
}
