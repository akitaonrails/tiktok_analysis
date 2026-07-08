package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.dropdown;

import X.C09CT;
import X.C1405840mgg;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.dropdown.DropdownProperty;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class DropdownProperty implements Parcelable {

    @C09CT("default_text")
    public final String defaultText;

    @C09CT("prop_id")
    public final String propId;

    @C09CT("source")
    public final Integer source;
    public static final C1405840mgg Companion = new Object() { // from class: X.0mgg
    };
    public static final Parcelable.Creator<DropdownProperty> CREATOR = new Parcelable.Creator<DropdownProperty>() { // from class: X.0mgf
        @Override // android.os.Parcelable.Creator
        public final DropdownProperty createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new DropdownProperty(string, numValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DropdownProperty[] newArray(int i) {
            return new DropdownProperty[i];
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
        if (!(obj instanceof DropdownProperty)) {
            return false;
        }
        DropdownProperty dropdownProperty = (DropdownProperty) obj;
        return Intrinsics.LJFF(this.propId, dropdownProperty.propId) && Intrinsics.LJFF(this.source, dropdownProperty.source) && Intrinsics.LJFF(this.defaultText, dropdownProperty.defaultText);
    }

    public final int hashCode() {
        String str = this.propId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.source;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.defaultText;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DropdownProperty(propId=");
        sbLIZ.append(this.propId);
        sbLIZ.append(", source=");
        sbLIZ.append(this.source);
        sbLIZ.append(", defaultText=");
        sbLIZ.append(this.defaultText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeString(this.propId);
        Integer num = this.source;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.defaultText);
    }

    public DropdownProperty(String str, Integer num, String str2) {
        this.propId = str;
        this.source = num;
        this.defaultText = str2;
    }
}
