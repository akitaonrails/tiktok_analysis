package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentServiceFeeInfoToolTips;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentServiceFeeInfoToolTips implements Parcelable, Serializable {

    @C09CT("button_text")
    public String buttonText;

    @C09CT("content")
    public String content;

    @C09CT("title")
    public String title;
    public static final Parcelable.Creator<PaymentServiceFeeInfoToolTips> CREATOR = new Parcelable.Creator<PaymentServiceFeeInfoToolTips>() { // from class: X.02hS
        @Override // android.os.Parcelable.Creator
        public final PaymentServiceFeeInfoToolTips createFromParcel(Parcel parcel) {
            return new PaymentServiceFeeInfoToolTips(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PaymentServiceFeeInfoToolTips[] newArray(int i) {
            return new PaymentServiceFeeInfoToolTips[i];
        }
    };
    public static final int $stable = 8;

    public PaymentServiceFeeInfoToolTips() {
        this(null, null, null);
    }

    public final PaymentServiceFeeInfoToolTips copy(String str, String str2, String str3) {
        return new PaymentServiceFeeInfoToolTips(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentServiceFeeInfoToolTips)) {
            return false;
        }
        PaymentServiceFeeInfoToolTips paymentServiceFeeInfoToolTips = (PaymentServiceFeeInfoToolTips) obj;
        return Intrinsics.LJFF(this.title, paymentServiceFeeInfoToolTips.title) && Intrinsics.LJFF(this.content, paymentServiceFeeInfoToolTips.content) && Intrinsics.LJFF(this.buttonText, paymentServiceFeeInfoToolTips.buttonText);
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.content;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.buttonText;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaymentServiceFeeInfoToolTips(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", buttonText=");
        sbLIZ.append(this.buttonText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.content);
        parcel.writeString(this.buttonText);
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getTitle() {
        return this.title;
    }

    public PaymentServiceFeeInfoToolTips(String str, String str2, String str3) {
        this.title = str;
        this.content = str2;
        this.buttonText = str3;
    }
}
