package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PMExplanationPopup;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodTooltips;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentMethodTooltips implements Parcelable {

    @C09CT("pm_explanation_popup")
    public PMExplanationPopup pmExplanationPopup;

    @C09CT("type")
    public String type;
    public static final Parcelable.Creator<PaymentMethodTooltips> CREATOR = new Parcelable.Creator<PaymentMethodTooltips>() { // from class: X.02TQ
        @Override // android.os.Parcelable.Creator
        public final PaymentMethodTooltips createFromParcel(Parcel parcel) {
            PMExplanationPopup pMExplanationPopupCreateFromParcel;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                pMExplanationPopupCreateFromParcel = null;
            } else {
                pMExplanationPopupCreateFromParcel = PMExplanationPopup.CREATOR.createFromParcel(parcel);
            }
            return new PaymentMethodTooltips(string, pMExplanationPopupCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PaymentMethodTooltips[] newArray(int i) {
            return new PaymentMethodTooltips[i];
        }
    };
    public static final int $stable = 8;

    public PaymentMethodTooltips() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentMethodTooltips)) {
            return false;
        }
        PaymentMethodTooltips paymentMethodTooltips = (PaymentMethodTooltips) obj;
        return Intrinsics.LJFF(this.type, paymentMethodTooltips.type) && Intrinsics.LJFF(this.pmExplanationPopup, paymentMethodTooltips.pmExplanationPopup);
    }

    public final int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        PMExplanationPopup pMExplanationPopup = this.pmExplanationPopup;
        return iHashCode + (pMExplanationPopup != null ? pMExplanationPopup.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaymentMethodTooltips(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", pmExplanationPopup=");
        sbLIZ.append(this.pmExplanationPopup);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        PMExplanationPopup pMExplanationPopup = this.pmExplanationPopup;
        if (pMExplanationPopup == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pMExplanationPopup.writeToParcel(parcel, i);
        }
    }

    public PaymentMethodTooltips(String str, PMExplanationPopup pMExplanationPopup) {
        this.type = str;
        this.pmExplanationPopup = pMExplanationPopup;
    }
}
