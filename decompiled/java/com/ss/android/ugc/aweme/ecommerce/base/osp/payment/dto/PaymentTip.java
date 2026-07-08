package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import X.C0HEZ;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodTooltips;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentServiceFeeInfoToolTips;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentTip;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentTip implements Parcelable {

    @C09CT("dark_font_color")
    public String darkFontColor;

    @C09CT("extra_tips")
    public ECRichText extraTips;

    @C09CT("font_color")
    public String fontColor;

    @C09CT("payment_method_tooltips")
    public PaymentMethodTooltips paymentMethodTooltips;

    @C09CT("show_description_default")
    public Boolean showDescriptionDefault;

    @C09CT("tips")
    public String tips;

    @C09CT("tooltips")
    public PaymentServiceFeeInfoToolTips toolTips;
    public static final Parcelable.Creator<PaymentTip> CREATOR = new Parcelable.Creator<PaymentTip>() { // from class: X.02hR
        @Override // android.os.Parcelable.Creator
        public final PaymentTip createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            PaymentServiceFeeInfoToolTips paymentServiceFeeInfoToolTipsCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            PaymentMethodTooltips paymentMethodTooltipsCreateFromParcel = null;
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
            if (parcel.readInt() == 0) {
                paymentServiceFeeInfoToolTipsCreateFromParcel = null;
            } else {
                paymentServiceFeeInfoToolTipsCreateFromParcel = PaymentServiceFeeInfoToolTips.CREATOR.createFromParcel(parcel);
            }
            PaymentServiceFeeInfoToolTips paymentServiceFeeInfoToolTips = paymentServiceFeeInfoToolTipsCreateFromParcel;
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(PaymentTip.class.getClassLoader());
            if (parcel.readInt() != 0) {
                paymentMethodTooltipsCreateFromParcel = PaymentMethodTooltips.CREATOR.createFromParcel(parcel);
            }
            return new PaymentTip(string, string2, string3, boolValueOf, paymentServiceFeeInfoToolTips, eCRichText, paymentMethodTooltipsCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PaymentTip[] newArray(int i) {
            return new PaymentTip[i];
        }
    };
    public static final int $stable = 8;

    public PaymentTip() {
        this(null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentTip)) {
            return false;
        }
        PaymentTip paymentTip = (PaymentTip) obj;
        return Intrinsics.LJFF(this.tips, paymentTip.tips) && Intrinsics.LJFF(this.fontColor, paymentTip.fontColor) && Intrinsics.LJFF(this.darkFontColor, paymentTip.darkFontColor) && Intrinsics.LJFF(this.showDescriptionDefault, paymentTip.showDescriptionDefault) && Intrinsics.LJFF(this.toolTips, paymentTip.toolTips) && Intrinsics.LJFF(this.extraTips, paymentTip.extraTips) && Intrinsics.LJFF(this.paymentMethodTooltips, paymentTip.paymentMethodTooltips);
    }

    public final int hashCode() {
        String str = this.tips;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fontColor;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.darkFontColor;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.showDescriptionDefault;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        PaymentServiceFeeInfoToolTips paymentServiceFeeInfoToolTips = this.toolTips;
        int iHashCode5 = (iHashCode4 + (paymentServiceFeeInfoToolTips == null ? 0 : paymentServiceFeeInfoToolTips.hashCode())) * 31;
        ECRichText eCRichText = this.extraTips;
        int iHashCode6 = (iHashCode5 + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        PaymentMethodTooltips paymentMethodTooltips = this.paymentMethodTooltips;
        return iHashCode6 + (paymentMethodTooltips != null ? paymentMethodTooltips.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaymentTip(tips=");
        sbLIZ.append(this.tips);
        sbLIZ.append(", fontColor=");
        sbLIZ.append(this.fontColor);
        sbLIZ.append(", darkFontColor=");
        sbLIZ.append(this.darkFontColor);
        sbLIZ.append(", showDescriptionDefault=");
        sbLIZ.append(this.showDescriptionDefault);
        sbLIZ.append(", toolTips=");
        sbLIZ.append(this.toolTips);
        sbLIZ.append(", extraTips=");
        sbLIZ.append(this.extraTips);
        sbLIZ.append(", paymentMethodTooltips=");
        sbLIZ.append(this.paymentMethodTooltips);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.tips);
        parcel.writeString(this.fontColor);
        parcel.writeString(this.darkFontColor);
        Boolean bool = this.showDescriptionDefault;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        PaymentServiceFeeInfoToolTips paymentServiceFeeInfoToolTips = this.toolTips;
        if (paymentServiceFeeInfoToolTips == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paymentServiceFeeInfoToolTips.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.extraTips, i);
        PaymentMethodTooltips paymentMethodTooltips = this.paymentMethodTooltips;
        if (paymentMethodTooltips == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paymentMethodTooltips.writeToParcel(parcel, i);
        }
    }

    public static PaymentTip LIZ(PaymentTip paymentTip) {
        return new PaymentTip(paymentTip.tips, paymentTip.fontColor, paymentTip.darkFontColor, paymentTip.showDescriptionDefault, paymentTip.toolTips, paymentTip.extraTips, paymentTip.paymentMethodTooltips);
    }

    public static Integer LIZIZ(PaymentTip paymentTip, boolean z, int i) {
        String str;
        boolean z2 = true;
        if ((i & 1) != 0) {
            z = false;
        }
        if (z) {
            str = paymentTip.darkFontColor;
        } else {
            str = paymentTip.fontColor;
        }
        if (str != null && str.length() != 0) {
            z2 = false;
        }
        Integer numValueOf = null;
        if (!z2) {
            try {
                numValueOf = Integer.valueOf(C0HEZ.LIZIZ(str));
                return numValueOf;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return numValueOf;
    }

    public PaymentTip(String str, String str2, String str3, Boolean bool, PaymentServiceFeeInfoToolTips paymentServiceFeeInfoToolTips, ECRichText eCRichText, PaymentMethodTooltips paymentMethodTooltips) {
        this.tips = str;
        this.fontColor = str2;
        this.darkFontColor = str3;
        this.showDescriptionDefault = bool;
        this.toolTips = paymentServiceFeeInfoToolTips;
        this.extraTips = eCRichText;
        this.paymentMethodTooltips = paymentMethodTooltips;
    }
}
