package com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.DiscountView;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class DiscountView implements Parcelable, Serializable {

    @C09CT("discount_text")
    public String discountText;
    public static final Parcelable.Creator<DiscountView> CREATOR = new Parcelable.Creator<DiscountView>() { // from class: X.02i8
        @Override // android.os.Parcelable.Creator
        public final DiscountView createFromParcel(Parcel parcel) {
            return new DiscountView(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DiscountView[] newArray(int i) {
            return new DiscountView[i];
        }
    };
    public static final int $stable = 8;

    public DiscountView() {
        this(null);
    }

    public final DiscountView copy(String str) {
        return new DiscountView(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DiscountView) && Intrinsics.LJFF(this.discountText, ((DiscountView) obj).discountText);
    }

    public int hashCode() {
        String str = this.discountText;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DiscountView(discountText=");
        sbLIZ.append(this.discountText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.discountText);
    }

    public final String getDiscountText() {
        return this.discountText;
    }

    public DiscountView(String str) {
        this.discountText = str;
    }
}
