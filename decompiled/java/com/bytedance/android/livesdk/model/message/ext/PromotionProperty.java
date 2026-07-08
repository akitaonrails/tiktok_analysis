package com.bytedance.android.livesdk.model.message.ext;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.model.message.ext.PromotionProperty;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PromotionProperty implements Serializable, Parcelable {
    public static final Parcelable.Creator<PromotionProperty> CREATOR = new Parcelable.Creator<PromotionProperty>() { // from class: X.02TO
        @Override // android.os.Parcelable.Creator
        public final PromotionProperty createFromParcel(Parcel parcel) {
            return new PromotionProperty(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PromotionProperty[] newArray(int i) {
            return new PromotionProperty[i];
        }
    };

    @C09CT("property_name")
    public String propertyName;

    @C09CT("property_value")
    public String propertyValue;

    public PromotionProperty() {
        this(null, null);
    }

    public final PromotionProperty copy(String str, String str2) {
        return new PromotionProperty(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionProperty)) {
            return false;
        }
        PromotionProperty promotionProperty = (PromotionProperty) obj;
        return Intrinsics.LJFF(this.propertyName, promotionProperty.propertyName) && Intrinsics.LJFF(this.propertyValue, promotionProperty.propertyValue);
    }

    public int hashCode() {
        String str = this.propertyName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.propertyValue;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PromotionProperty(propertyName=");
        sbLIZ.append(this.propertyName);
        sbLIZ.append(", propertyValue=");
        sbLIZ.append(this.propertyValue);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.propertyName);
        parcel.writeString(this.propertyValue);
    }

    public final String getPropertyName() {
        return this.propertyName;
    }

    public final String getPropertyValue() {
        return this.propertyValue;
    }

    public PromotionProperty(String str, String str2) {
        this.propertyName = str;
        this.propertyValue = str2;
    }
}
