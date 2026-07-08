package com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.ProductLinkProperty;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PropertyValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ProductLinkProperty implements Parcelable {

    @C09CT("property_name")
    public String propertyName;

    @C09CT("property_values")
    public List<PropertyValue> propertyValues;
    public static final Parcelable.Creator<ProductLinkProperty> CREATOR = new Parcelable.Creator<ProductLinkProperty>() { // from class: X.02Yo
        @Override // android.os.Parcelable.Creator
        public final ProductLinkProperty createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(PropertyValue.CREATOR.createFromParcel(parcel));
                }
            }
            return new ProductLinkProperty(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ProductLinkProperty[] newArray(int i) {
            return new ProductLinkProperty[i];
        }
    };
    public static final int $stable = 8;

    public ProductLinkProperty() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductLinkProperty)) {
            return false;
        }
        ProductLinkProperty productLinkProperty = (ProductLinkProperty) obj;
        return Intrinsics.LJFF(this.propertyName, productLinkProperty.propertyName) && Intrinsics.LJFF(this.propertyValues, productLinkProperty.propertyValues);
    }

    public final int hashCode() {
        String str = this.propertyName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<PropertyValue> list = this.propertyValues;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProductLinkProperty(propertyName=");
        sbLIZ.append(this.propertyName);
        sbLIZ.append(", propertyValues=");
        sbLIZ.append(this.propertyValues);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.propertyName);
        List<PropertyValue> list = this.propertyValues;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<PropertyValue> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public ProductLinkProperty(String str, List<PropertyValue> list) {
        this.propertyName = str;
        this.propertyValues = list;
    }
}
