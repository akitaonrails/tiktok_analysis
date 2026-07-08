package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDiscountView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class LogisticDiscountView implements Parcelable {

    @C09CT("discount_text")
    public String discountText;
    public static final Parcelable.Creator<LogisticDiscountView> CREATOR = new Parcelable.Creator<LogisticDiscountView>() { // from class: X.02Ht
        @Override // android.os.Parcelable.Creator
        public final LogisticDiscountView createFromParcel(Parcel parcel) {
            return new LogisticDiscountView(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LogisticDiscountView[] newArray(int i) {
            return new LogisticDiscountView[i];
        }
    };
    public static final int $stable = 8;

    public LogisticDiscountView() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LogisticDiscountView) && Intrinsics.LJFF(this.discountText, ((LogisticDiscountView) obj).discountText);
    }

    public final int hashCode() {
        String str = this.discountText;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LogisticDiscountView(discountText=");
        sbLIZ.append(this.discountText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.discountText);
    }

    public LogisticDiscountView(String str) {
        this.discountText = str;
    }
}
