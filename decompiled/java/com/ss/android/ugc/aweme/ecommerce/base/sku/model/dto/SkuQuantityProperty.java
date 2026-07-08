package com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuQuantityProperty;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SkuQuantityProperty implements Parcelable {

    @C09CT("quantity_minus_support_edit")
    public Boolean canLessThanDefaultQuantity;

    @C09CT("default_add_cart_quantity")
    public Integer defaultAddCartQuantity;
    public static final Parcelable.Creator<SkuQuantityProperty> CREATOR = new Parcelable.Creator<SkuQuantityProperty>() { // from class: X.02ma
        @Override // android.os.Parcelable.Creator
        public final SkuQuantityProperty createFromParcel(Parcel parcel) {
            Integer numValueOf;
            boolean z;
            Boolean boolValueOf = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new SkuQuantityProperty(numValueOf, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final SkuQuantityProperty[] newArray(int i) {
            return new SkuQuantityProperty[i];
        }
    };
    public static final int $stable = 8;

    public SkuQuantityProperty() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuQuantityProperty)) {
            return false;
        }
        SkuQuantityProperty skuQuantityProperty = (SkuQuantityProperty) obj;
        return Intrinsics.LJFF(this.defaultAddCartQuantity, skuQuantityProperty.defaultAddCartQuantity) && Intrinsics.LJFF(this.canLessThanDefaultQuantity, skuQuantityProperty.canLessThanDefaultQuantity);
    }

    public final int hashCode() {
        Integer num = this.defaultAddCartQuantity;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.canLessThanDefaultQuantity;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkuQuantityProperty(defaultAddCartQuantity=");
        sbLIZ.append(this.defaultAddCartQuantity);
        sbLIZ.append(", canLessThanDefaultQuantity=");
        sbLIZ.append(this.canLessThanDefaultQuantity);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.defaultAddCartQuantity;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Boolean bool = this.canLessThanDefaultQuantity;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public SkuQuantityProperty(Integer num, Boolean bool) {
        this.defaultAddCartQuantity = num;
        this.canLessThanDefaultQuantity = bool;
    }
}
