package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.DynamicSchema;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class DynamicSchema implements Serializable, Parcelable {

    @C09CT("address_edit_schema")
    public String addressEditSchema;

    @C09CT("address_list_schema")
    public String addressListSchema;

    @C09CT("buy_now_schema")
    public String buyNowSchema;

    @C09CT("popup_schema")
    public String popupSchema;

    @C09CT("pudo_edit_schema")
    public String pudoSchema;
    public static final Parcelable.Creator<DynamicSchema> CREATOR = new Parcelable.Creator<DynamicSchema>() { // from class: X.02r5
        @Override // android.os.Parcelable.Creator
        public final DynamicSchema createFromParcel(Parcel parcel) {
            return new DynamicSchema(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DynamicSchema[] newArray(int i) {
            return new DynamicSchema[i];
        }
    };
    public static final int $stable = 8;

    public DynamicSchema() {
    }

    public final DynamicSchema copy(String str, String str2, String str3, String str4, String str5) {
        return new DynamicSchema(str, str2, str3, str4, str5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicSchema)) {
            return false;
        }
        DynamicSchema dynamicSchema = (DynamicSchema) obj;
        return Intrinsics.LJFF(this.buyNowSchema, dynamicSchema.buyNowSchema) && Intrinsics.LJFF(this.addressListSchema, dynamicSchema.addressListSchema) && Intrinsics.LJFF(this.addressEditSchema, dynamicSchema.addressEditSchema) && Intrinsics.LJFF(this.popupSchema, dynamicSchema.popupSchema) && Intrinsics.LJFF(this.pudoSchema, dynamicSchema.pudoSchema);
    }

    public int hashCode() {
        String str = this.buyNowSchema;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.addressListSchema;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.addressEditSchema;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.popupSchema;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.pudoSchema;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DynamicSchema(buyNowSchema=");
        sbLIZ.append(this.buyNowSchema);
        sbLIZ.append(", addressListSchema=");
        sbLIZ.append(this.addressListSchema);
        sbLIZ.append(", addressEditSchema=");
        sbLIZ.append(this.addressEditSchema);
        sbLIZ.append(", popupSchema=");
        sbLIZ.append(this.popupSchema);
        sbLIZ.append(", pudoSchema=");
        sbLIZ.append(this.pudoSchema);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.buyNowSchema);
        parcel.writeString(this.addressListSchema);
        parcel.writeString(this.addressEditSchema);
        parcel.writeString(this.popupSchema);
        parcel.writeString(this.pudoSchema);
    }

    public final String getAddressEditSchema() {
        return this.addressEditSchema;
    }

    public final String getAddressListSchema() {
        return this.addressListSchema;
    }

    public final String getBuyNowSchema() {
        return this.buyNowSchema;
    }

    public final String getPopupSchema() {
        return this.popupSchema;
    }

    public final String getPudoSchema() {
        return this.pudoSchema;
    }

    public final DynamicSchema merge(DynamicSchema dynamicSchema) {
        if (dynamicSchema == null) {
            return this;
        }
        String str = dynamicSchema.buyNowSchema;
        if (str == null) {
            str = this.buyNowSchema;
        }
        String str2 = dynamicSchema.addressListSchema;
        if (str2 == null) {
            str2 = this.addressListSchema;
        }
        String str3 = dynamicSchema.addressEditSchema;
        if (str3 == null) {
            str3 = this.addressEditSchema;
        }
        String str4 = dynamicSchema.popupSchema;
        if (str4 == null) {
            str4 = this.popupSchema;
        }
        String str5 = dynamicSchema.pudoSchema;
        if (str5 == null) {
            str5 = this.pudoSchema;
        }
        return new DynamicSchema(str, str2, str3, str4, str5);
    }

    public DynamicSchema(String str, String str2, String str3, String str4, String str5) {
        this.buyNowSchema = str;
        this.addressListSchema = str2;
        this.addressEditSchema = str3;
        this.popupSchema = str4;
        this.pudoSchema = str5;
    }
}
