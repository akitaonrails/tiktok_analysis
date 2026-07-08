package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import X.C656802hK;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductUnavailableInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ProductUnavailableInfo implements Parcelable {

    @C09CT("action")
    public Integer action;

    @C09CT("action_redirect_type")
    public Integer actionRedirectType;

    @C09CT("action_text")
    public String actionText;

    @C09CT("link_schema")
    public String linkSchema;

    @C09CT("text")
    public String text;

    @C09CT("reason")
    public Integer unavailableReason;
    public static final C656802hK UnavailableEnum = new Object() { // from class: X.02hK
    };
    public static final Parcelable.Creator<ProductUnavailableInfo> CREATOR = new Parcelable.Creator<ProductUnavailableInfo>() { // from class: X.02hJ
        @Override // android.os.Parcelable.Creator
        public final ProductUnavailableInfo createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            Integer numValueOf3 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            return new ProductUnavailableInfo(string, string2, numValueOf, numValueOf2, string3, numValueOf3);
        }

        @Override // android.os.Parcelable.Creator
        public final ProductUnavailableInfo[] newArray(int i) {
            return new ProductUnavailableInfo[i];
        }
    };
    public static final int $stable = 8;

    public ProductUnavailableInfo() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductUnavailableInfo)) {
            return false;
        }
        ProductUnavailableInfo productUnavailableInfo = (ProductUnavailableInfo) obj;
        return Intrinsics.LJFF(this.text, productUnavailableInfo.text) && Intrinsics.LJFF(this.linkSchema, productUnavailableInfo.linkSchema) && Intrinsics.LJFF(this.unavailableReason, productUnavailableInfo.unavailableReason) && Intrinsics.LJFF(this.action, productUnavailableInfo.action) && Intrinsics.LJFF(this.actionText, productUnavailableInfo.actionText) && Intrinsics.LJFF(this.actionRedirectType, productUnavailableInfo.actionRedirectType);
    }

    public final int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.linkSchema;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.unavailableReason;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.action;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.actionText;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.actionRedirectType;
        return iHashCode5 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProductUnavailableInfo(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", linkSchema=");
        sbLIZ.append(this.linkSchema);
        sbLIZ.append(", unavailableReason=");
        sbLIZ.append(this.unavailableReason);
        sbLIZ.append(", action=");
        sbLIZ.append(this.action);
        sbLIZ.append(", actionText=");
        sbLIZ.append(this.actionText);
        sbLIZ.append(", actionRedirectType=");
        sbLIZ.append(this.actionRedirectType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeString(this.linkSchema);
        Integer num = this.unavailableReason;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.action;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.actionText);
        Integer num3 = this.actionRedirectType;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
    }

    public ProductUnavailableInfo(String str, String str2, Integer num, Integer num2, String str3, Integer num3) {
        this.text = str;
        this.linkSchema = str2;
        this.unavailableReason = num;
        this.action = num2;
        this.actionText = str3;
        this.actionRedirectType = num3;
    }
}
