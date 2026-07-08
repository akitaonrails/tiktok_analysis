package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C098200Yq;
import X.C09CT;
import X.C189200o6;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CardBinPromotionInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CardBindPromotionPopUpInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentPromotion;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PromotionFormat;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentPromotion implements Parcelable, Serializable {

    @C09CT("promotion_amount")
    public String amount;

    @C09CT("card_bin_promotion_info")
    public CardBinPromotionInfo cardBinPromotionInfo;

    @C09CT("card_bind_promotion_popup_info")
    public CardBindPromotionPopUpInfo cardBindPromotionPopupInfo;

    @C09CT("cashier_bind_pi_promo_desc")
    public String cashierBindPiPromoDesc;

    @C09CT("cashier_bind_pi_promo_desc_selected")
    public String cashierBindPiPromoDescSelected;

    @C09CT("coupon_dimensions")
    public List<Integer> couponDimensions;

    @C09CT("da_info")
    public String daInfo;

    @C09CT("desc")
    public String desc;

    @C09CT("edit_card_prom_desc")
    public String descInEditStatus;

    @C09CT("hide_marketing_amount")
    public Boolean hideMarketingAmount;

    @C09CT("is_bonus_type_promotion")
    public Boolean isBonusTypePromotion;

    @C09CT("is_card_bind_promotion")
    public Boolean isCardBindPromotion;

    @C09CT("is_not_meet_promotion_threshold")
    public Boolean isNotMeetPromotionThreshold;

    @C09CT("not_deductable_on_marketing_bind_payment_method")
    public Boolean notDeductableOnMarketingBindPaymentMethod;

    @C09CT("promotion_amount_val")
    public String promotionAmountValue;

    @C09CT("promotion_batch_id")
    public String promotionBatchId;

    @C09CT("promotion_currency")
    public String promotionCurrency;

    @C09CT("promotion_desc_header")
    public String promotionDescHeader;

    @C09CT("promotion_format")
    public PromotionFormat promotionFormat;

    @C09CT("promotion_id")
    public String promotionId;

    @C09CT("promotion_link")
    public String promotionLink;

    @C09CT("desc_selected")
    public String selectedDesc;
    public static final Parcelable.Creator<PaymentPromotion> CREATOR = new Parcelable.Creator<PaymentPromotion>() { // from class: X.02iC
        @Override // android.os.Parcelable.Creator
        public final PaymentPromotion createFromParcel(Parcel parcel) {
            CardBinPromotionInfo cardBinPromotionInfoCreateFromParcel;
            boolean z;
            Boolean boolValueOf;
            boolean z2;
            Boolean boolValueOf2;
            boolean z3;
            Boolean boolValueOf3;
            ArrayList arrayList;
            boolean z4;
            Boolean boolValueOf4;
            boolean z5;
            Boolean boolValueOf5;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                cardBinPromotionInfoCreateFromParcel = null;
            } else {
                cardBinPromotionInfoCreateFromParcel = CardBinPromotionInfo.CREATOR.createFromParcel(parcel);
            }
            CardBinPromotionInfo cardBinPromotionInfo = cardBinPromotionInfoCreateFromParcel;
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
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
            String string10 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolValueOf3 = Boolean.valueOf(z3);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Integer.valueOf(parcel.readInt()));
                }
            }
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolValueOf4 = Boolean.valueOf(z4);
            }
            CardBindPromotionPopUpInfo cardBindPromotionPopUpInfo = (CardBindPromotionPopUpInfo) parcel.readSerializable();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            PromotionFormat promotionFormat = (PromotionFormat) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                boolValueOf5 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolValueOf5 = Boolean.valueOf(z5);
            }
            return new PaymentPromotion(string, string2, string3, string4, cardBinPromotionInfo, string5, string6, string7, string8, string9, boolValueOf, string10, boolValueOf2, boolValueOf3, arrayList, boolValueOf4, cardBindPromotionPopUpInfo, string11, string12, string13, promotionFormat, boolValueOf5);
        }

        @Override // android.os.Parcelable.Creator
        public final PaymentPromotion[] newArray(int i) {
            return new PaymentPromotion[i];
        }
    };
    public static final int $stable = 8;

    public PaymentPromotion() {
    }

    public final PaymentPromotion copy(String str, String str2, String str3, String str4, CardBinPromotionInfo cardBinPromotionInfo, String str5, String str6, String str7, String str8, String str9, Boolean bool, String str10, Boolean bool2, Boolean bool3, List<Integer> list, Boolean bool4, CardBindPromotionPopUpInfo cardBindPromotionPopUpInfo, String str11, String str12, String str13, PromotionFormat promotionFormat, Boolean bool5) {
        return new PaymentPromotion(str, str2, str3, str4, cardBinPromotionInfo, str5, str6, str7, str8, str9, bool, str10, bool2, bool3, list, bool4, cardBindPromotionPopUpInfo, str11, str12, str13, promotionFormat, bool5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentPromotion)) {
            return false;
        }
        PaymentPromotion paymentPromotion = (PaymentPromotion) obj;
        return Intrinsics.LJFF(this.desc, paymentPromotion.desc) && Intrinsics.LJFF(this.selectedDesc, paymentPromotion.selectedDesc) && Intrinsics.LJFF(this.amount, paymentPromotion.amount) && Intrinsics.LJFF(this.descInEditStatus, paymentPromotion.descInEditStatus) && Intrinsics.LJFF(this.cardBinPromotionInfo, paymentPromotion.cardBinPromotionInfo) && Intrinsics.LJFF(this.promotionId, paymentPromotion.promotionId) && Intrinsics.LJFF(this.promotionAmountValue, paymentPromotion.promotionAmountValue) && Intrinsics.LJFF(this.promotionCurrency, paymentPromotion.promotionCurrency) && Intrinsics.LJFF(this.promotionLink, paymentPromotion.promotionLink) && Intrinsics.LJFF(this.promotionDescHeader, paymentPromotion.promotionDescHeader) && Intrinsics.LJFF(this.isNotMeetPromotionThreshold, paymentPromotion.isNotMeetPromotionThreshold) && Intrinsics.LJFF(this.promotionBatchId, paymentPromotion.promotionBatchId) && Intrinsics.LJFF(this.notDeductableOnMarketingBindPaymentMethod, paymentPromotion.notDeductableOnMarketingBindPaymentMethod) && Intrinsics.LJFF(this.hideMarketingAmount, paymentPromotion.hideMarketingAmount) && Intrinsics.LJFF(this.couponDimensions, paymentPromotion.couponDimensions) && Intrinsics.LJFF(this.isCardBindPromotion, paymentPromotion.isCardBindPromotion) && Intrinsics.LJFF(this.cardBindPromotionPopupInfo, paymentPromotion.cardBindPromotionPopupInfo) && Intrinsics.LJFF(this.cashierBindPiPromoDesc, paymentPromotion.cashierBindPiPromoDesc) && Intrinsics.LJFF(this.cashierBindPiPromoDescSelected, paymentPromotion.cashierBindPiPromoDescSelected) && Intrinsics.LJFF(this.daInfo, paymentPromotion.daInfo) && Intrinsics.LJFF(this.promotionFormat, paymentPromotion.promotionFormat) && Intrinsics.LJFF(this.isBonusTypePromotion, paymentPromotion.isBonusTypePromotion);
    }

    public int hashCode() {
        String str = this.desc;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.selectedDesc;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.amount;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.descInEditStatus;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        CardBinPromotionInfo cardBinPromotionInfo = this.cardBinPromotionInfo;
        int iHashCode5 = (iHashCode4 + (cardBinPromotionInfo == null ? 0 : cardBinPromotionInfo.hashCode())) * 31;
        String str5 = this.promotionId;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.promotionAmountValue;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.promotionCurrency;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.promotionLink;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.promotionDescHeader;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Boolean bool = this.isNotMeetPromotionThreshold;
        int iHashCode11 = (iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str10 = this.promotionBatchId;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool2 = this.notDeductableOnMarketingBindPaymentMethod;
        int iHashCode13 = (iHashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.hideMarketingAmount;
        int iHashCode14 = (iHashCode13 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        List<Integer> list = this.couponDimensions;
        int iHashCode15 = (iHashCode14 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool4 = this.isCardBindPromotion;
        int iHashCode16 = (iHashCode15 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        CardBindPromotionPopUpInfo cardBindPromotionPopUpInfo = this.cardBindPromotionPopupInfo;
        int iHashCode17 = (iHashCode16 + (cardBindPromotionPopUpInfo == null ? 0 : cardBindPromotionPopUpInfo.hashCode())) * 31;
        String str11 = this.cashierBindPiPromoDesc;
        int iHashCode18 = (iHashCode17 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.cashierBindPiPromoDescSelected;
        int iHashCode19 = (iHashCode18 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.daInfo;
        int iHashCode20 = (iHashCode19 + (str13 == null ? 0 : str13.hashCode())) * 31;
        PromotionFormat promotionFormat = this.promotionFormat;
        int iHashCode21 = (iHashCode20 + (promotionFormat == null ? 0 : promotionFormat.hashCode())) * 31;
        Boolean bool5 = this.isBonusTypePromotion;
        return iHashCode21 + (bool5 != null ? bool5.hashCode() : 0);
    }

    public String toString() {
        return "PaymentPromotion(desc=" + this.desc + ", selectedDesc=" + this.selectedDesc + ", amount=" + this.amount + ", descInEditStatus=" + this.descInEditStatus + ", cardBinPromotionInfo=" + this.cardBinPromotionInfo + ", promotionId=" + this.promotionId + ", promotionAmountValue=" + this.promotionAmountValue + ", promotionCurrency=" + this.promotionCurrency + ", promotionLink=" + this.promotionLink + ", promotionDescHeader=" + this.promotionDescHeader + ", isNotMeetPromotionThreshold=" + this.isNotMeetPromotionThreshold + ", promotionBatchId=" + this.promotionBatchId + ", notDeductableOnMarketingBindPaymentMethod=" + this.notDeductableOnMarketingBindPaymentMethod + ", hideMarketingAmount=" + this.hideMarketingAmount + ", couponDimensions=" + this.couponDimensions + ", isCardBindPromotion=" + this.isCardBindPromotion + ", cardBindPromotionPopupInfo=" + this.cardBindPromotionPopupInfo + ", cashierBindPiPromoDesc=" + this.cashierBindPiPromoDesc + ", cashierBindPiPromoDescSelected=" + this.cashierBindPiPromoDescSelected + ", daInfo=" + this.daInfo + ", promotionFormat=" + this.promotionFormat + ", isBonusTypePromotion=" + this.isBonusTypePromotion + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.desc);
        parcel.writeString(this.selectedDesc);
        parcel.writeString(this.amount);
        parcel.writeString(this.descInEditStatus);
        CardBinPromotionInfo cardBinPromotionInfo = this.cardBinPromotionInfo;
        if (cardBinPromotionInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cardBinPromotionInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.promotionId);
        parcel.writeString(this.promotionAmountValue);
        parcel.writeString(this.promotionCurrency);
        parcel.writeString(this.promotionLink);
        parcel.writeString(this.promotionDescHeader);
        Boolean bool = this.isNotMeetPromotionThreshold;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.promotionBatchId);
        Boolean bool2 = this.notDeductableOnMarketingBindPaymentMethod;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.hideMarketingAmount;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        List<Integer> list = this.couponDimensions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Integer> it2 = list.iterator();
            while (it2.hasNext()) {
                parcel.writeInt(it2.next().intValue());
            }
        }
        Boolean bool4 = this.isCardBindPromotion;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        parcel.writeSerializable(this.cardBindPromotionPopupInfo);
        parcel.writeString(this.cashierBindPiPromoDesc);
        parcel.writeString(this.cashierBindPiPromoDescSelected);
        parcel.writeString(this.daInfo);
        parcel.writeSerializable(this.promotionFormat);
        Boolean bool5 = this.isBonusTypePromotion;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool5.booleanValue() ? 1 : 0);
        }
    }

    public final Map<String, Object> constructDaInfo() {
        Object obj;
        String str = this.daInfo;
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            JSONObject jSONObject = new JSONObject(this.daInfo);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = jSONObject.opt(next);
                if (objOpt != null && !Intrinsics.LJFF(objOpt, JSONObject.NULL)) {
                    linkedHashMap.put(next, objOpt);
                }
            }
            C189200o6.m2constructorimpl(linkedHashMap);
            obj = linkedHashMap;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        return (Map) (C189200o6.m7isFailureimpl(obj) ? null : obj);
    }

    public final String getDescByCondition() {
        String str;
        return (!Intrinsics.LJFF(this.isCardBindPromotion, Boolean.TRUE) || (str = this.cashierBindPiPromoDesc) == null) ? this.desc : str;
    }

    public final String getSelectedDescByCondition() {
        String str;
        return (!Intrinsics.LJFF(this.isCardBindPromotion, Boolean.TRUE) || (str = this.cashierBindPiPromoDescSelected) == null) ? this.selectedDesc : str;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final CardBinPromotionInfo getCardBinPromotionInfo() {
        return this.cardBinPromotionInfo;
    }

    public final CardBindPromotionPopUpInfo getCardBindPromotionPopupInfo() {
        return this.cardBindPromotionPopupInfo;
    }

    public final String getCashierBindPiPromoDesc() {
        return this.cashierBindPiPromoDesc;
    }

    public final String getCashierBindPiPromoDescSelected() {
        return this.cashierBindPiPromoDescSelected;
    }

    public final List<Integer> getCouponDimensions() {
        return this.couponDimensions;
    }

    public final String getDaInfo() {
        return this.daInfo;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getDescInEditStatus() {
        return this.descInEditStatus;
    }

    public final Boolean getHideMarketingAmount() {
        return this.hideMarketingAmount;
    }

    public final Boolean getNotDeductableOnMarketingBindPaymentMethod() {
        return this.notDeductableOnMarketingBindPaymentMethod;
    }

    public final String getPromotionAmountValue() {
        return this.promotionAmountValue;
    }

    public final String getPromotionBatchId() {
        return this.promotionBatchId;
    }

    public final String getPromotionCurrency() {
        return this.promotionCurrency;
    }

    public final String getPromotionDescHeader() {
        return this.promotionDescHeader;
    }

    public final PromotionFormat getPromotionFormat() {
        return this.promotionFormat;
    }

    public final String getPromotionId() {
        return this.promotionId;
    }

    public final String getPromotionLink() {
        return this.promotionLink;
    }

    public final String getSelectedDesc() {
        return this.selectedDesc;
    }

    public final Boolean isBonusTypePromotion() {
        return this.isBonusTypePromotion;
    }

    public final Boolean isCardBindPromotion() {
        return this.isCardBindPromotion;
    }

    public final Boolean isNotMeetPromotionThreshold() {
        return this.isNotMeetPromotionThreshold;
    }

    public PaymentPromotion(String str, String str2, String str3, String str4, CardBinPromotionInfo cardBinPromotionInfo, String str5, String str6, String str7, String str8, String str9, Boolean bool, String str10, Boolean bool2, Boolean bool3, List<Integer> list, Boolean bool4, CardBindPromotionPopUpInfo cardBindPromotionPopUpInfo, String str11, String str12, String str13, PromotionFormat promotionFormat, Boolean bool5) {
        this.desc = str;
        this.selectedDesc = str2;
        this.amount = str3;
        this.descInEditStatus = str4;
        this.cardBinPromotionInfo = cardBinPromotionInfo;
        this.promotionId = str5;
        this.promotionAmountValue = str6;
        this.promotionCurrency = str7;
        this.promotionLink = str8;
        this.promotionDescHeader = str9;
        this.isNotMeetPromotionThreshold = bool;
        this.promotionBatchId = str10;
        this.notDeductableOnMarketingBindPaymentMethod = bool2;
        this.hideMarketingAmount = bool3;
        this.couponDimensions = list;
        this.isCardBindPromotion = bool4;
        this.cardBindPromotionPopupInfo = cardBindPromotionPopUpInfo;
        this.cashierBindPiPromoDesc = str11;
        this.cashierBindPiPromoDescSelected = str12;
        this.daInfo = str13;
        this.promotionFormat = promotionFormat;
        this.isBonusTypePromotion = bool5;
    }
}
