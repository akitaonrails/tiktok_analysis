package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ShippingPolicySection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ShippingPolicySection implements Parcelable {

    @C09CT("content")
    public final String content;

    @C09CT("header")
    public final String header;
    public static final Parcelable.Creator<ShippingPolicySection> CREATOR = new Parcelable.Creator<ShippingPolicySection>() { // from class: X.03pj
        @Override // android.os.Parcelable.Creator
        public final ShippingPolicySection createFromParcel(Parcel parcel) {
            return new ShippingPolicySection(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShippingPolicySection[] newArray(int i) {
            return new ShippingPolicySection[i];
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
        if (!(obj instanceof ShippingPolicySection)) {
            return false;
        }
        ShippingPolicySection shippingPolicySection = (ShippingPolicySection) obj;
        return Intrinsics.LJFF(this.header, shippingPolicySection.header) && Intrinsics.LJFF(this.content, shippingPolicySection.content);
    }

    public final int hashCode() {
        String str = this.header;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.content;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShippingPolicySection(header=");
        sbLIZ.append(this.header);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.header);
        parcel.writeString(this.content);
    }

    public ShippingPolicySection(String str, String str2) {
        this.header = str;
        this.content = str2;
    }
}
