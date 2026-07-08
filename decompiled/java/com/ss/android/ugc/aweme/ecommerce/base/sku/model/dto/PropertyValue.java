package com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PropertyValue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PropertyValue implements Parcelable {

    @C09CT("da_info")
    public String daInfo;

    @C09CT("is_current_selection")
    public Boolean isCurrentSelection;

    @C09CT("pdp_jump_schema")
    public String pdpJumpSchema;

    @C09CT("value_name")
    public String valueName;
    public static final Parcelable.Creator<PropertyValue> CREATOR = new Parcelable.Creator<PropertyValue>() { // from class: X.02Ta
        @Override // android.os.Parcelable.Creator
        public final PropertyValue createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            String string = parcel.readString();
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
            return new PropertyValue(string, boolValueOf, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PropertyValue[] newArray(int i) {
            return new PropertyValue[i];
        }
    };
    public static final int $stable = 8;

    public PropertyValue() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PropertyValue)) {
            return false;
        }
        PropertyValue propertyValue = (PropertyValue) obj;
        return Intrinsics.LJFF(this.valueName, propertyValue.valueName) && Intrinsics.LJFF(this.isCurrentSelection, propertyValue.isCurrentSelection) && Intrinsics.LJFF(this.pdpJumpSchema, propertyValue.pdpJumpSchema) && Intrinsics.LJFF(this.daInfo, propertyValue.daInfo);
    }

    public final int hashCode() {
        String str = this.valueName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isCurrentSelection;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.pdpJumpSchema;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.daInfo;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PropertyValue(valueName=");
        sbLIZ.append(this.valueName);
        sbLIZ.append(", isCurrentSelection=");
        sbLIZ.append(this.isCurrentSelection);
        sbLIZ.append(", pdpJumpSchema=");
        sbLIZ.append(this.pdpJumpSchema);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        parcel.writeString(this.valueName);
        Boolean bool = this.isCurrentSelection;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
        parcel.writeString(this.pdpJumpSchema);
        parcel.writeString(this.daInfo);
    }

    public PropertyValue(String str, Boolean bool, String str2, String str3) {
        this.valueName = str;
        this.isCurrentSelection = bool;
        this.pdpJumpSchema = str2;
        this.daInfo = str3;
    }
}
