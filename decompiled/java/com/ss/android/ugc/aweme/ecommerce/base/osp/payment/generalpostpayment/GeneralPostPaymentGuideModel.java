package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.generalpostpayment;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommonRetainDisplayInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.generalpostpayment.GeneralPostPaymentGuideModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class GeneralPostPaymentGuideModel implements Parcelable {

    @C09CT("after_payment_agreement")
    public final String agreement;

    @C09CT("common_retain_display_info")
    public CommonRetainDisplayInfo commonRetainDisplayInfo;

    @C09CT("after_payment_enable_btn")
    public final String enableBtn;

    @C09CT("after_payment_fail_toast")
    public final String failToast;

    @C09CT("after_payment_host")
    public final String host;

    @C09CT("after_payment_instruction")
    public final String instruction;

    @C09CT("after_payment_merchant_id")
    public final String merchantId;

    @C09CT("after_payment_merchant_user_id")
    public final String merchantUserId;

    @C09CT("after_payment_scene")
    public final String scene;

    @C09CT("after_payment_skip_btn")
    public final String skipBtn;

    @C09CT("after_payment_source")
    public final String source;

    @C09CT("after_payment_success_toast")
    public final String successToast;

    @C09CT("after_payment_theme")
    public final String theme;

    @C09CT("after_payment_title")
    public final String title;

    @C09CT("after_payment_token")
    public final String token;
    public static final Parcelable.Creator<GeneralPostPaymentGuideModel> CREATOR = new Parcelable.Creator<GeneralPostPaymentGuideModel>() { // from class: X.0um5
        @Override // android.os.Parcelable.Creator
        public final GeneralPostPaymentGuideModel createFromParcel(Parcel parcel) {
            return new GeneralPostPaymentGuideModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GeneralPostPaymentGuideModel[] newArray(int i) {
            return new GeneralPostPaymentGuideModel[i];
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
        if (!(obj instanceof GeneralPostPaymentGuideModel)) {
            return false;
        }
        GeneralPostPaymentGuideModel generalPostPaymentGuideModel = (GeneralPostPaymentGuideModel) obj;
        return Intrinsics.LJFF(this.title, generalPostPaymentGuideModel.title) && Intrinsics.LJFF(this.instruction, generalPostPaymentGuideModel.instruction) && Intrinsics.LJFF(this.enableBtn, generalPostPaymentGuideModel.enableBtn) && Intrinsics.LJFF(this.skipBtn, generalPostPaymentGuideModel.skipBtn) && Intrinsics.LJFF(this.agreement, generalPostPaymentGuideModel.agreement) && Intrinsics.LJFF(this.source, generalPostPaymentGuideModel.source) && Intrinsics.LJFF(this.theme, generalPostPaymentGuideModel.theme) && Intrinsics.LJFF(this.scene, generalPostPaymentGuideModel.scene) && Intrinsics.LJFF(this.merchantId, generalPostPaymentGuideModel.merchantId) && Intrinsics.LJFF(this.merchantUserId, generalPostPaymentGuideModel.merchantUserId) && Intrinsics.LJFF(this.host, generalPostPaymentGuideModel.host) && Intrinsics.LJFF(this.token, generalPostPaymentGuideModel.token) && Intrinsics.LJFF(this.successToast, generalPostPaymentGuideModel.successToast) && Intrinsics.LJFF(this.failToast, generalPostPaymentGuideModel.failToast);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.instruction;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.enableBtn;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.skipBtn;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.agreement;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.source;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.theme;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.scene;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.merchantId;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.merchantUserId;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.host;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.token;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.successToast;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.failToast;
        return iHashCode13 + (str14 != null ? str14.hashCode() : 0);
    }

    public final String toString() {
        return "GeneralPostPaymentGuideModel(title=" + this.title + ", instruction=" + this.instruction + ", enableBtn=" + this.enableBtn + ", skipBtn=" + this.skipBtn + ", agreement=" + this.agreement + ", source=" + this.source + ", theme=" + this.theme + ", scene=" + this.scene + ", merchantId=" + this.merchantId + ", merchantUserId=" + this.merchantUserId + ", host=" + this.host + ", token=" + this.token + ", successToast=" + this.successToast + ", failToast=" + this.failToast + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.instruction);
        parcel.writeString(this.enableBtn);
        parcel.writeString(this.skipBtn);
        parcel.writeString(this.agreement);
        parcel.writeString(this.source);
        parcel.writeString(this.theme);
        parcel.writeString(this.scene);
        parcel.writeString(this.merchantId);
        parcel.writeString(this.merchantUserId);
        parcel.writeString(this.host);
        parcel.writeString(this.token);
        parcel.writeString(this.successToast);
        parcel.writeString(this.failToast);
    }

    public GeneralPostPaymentGuideModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.title = str;
        this.instruction = str2;
        this.enableBtn = str3;
        this.skipBtn = str4;
        this.agreement = str5;
        this.source = str6;
        this.theme = str7;
        this.scene = str8;
        this.merchantId = str9;
        this.merchantUserId = str10;
        this.host = str11;
        this.token = str12;
        this.successToast = str13;
        this.failToast = str14;
    }
}
