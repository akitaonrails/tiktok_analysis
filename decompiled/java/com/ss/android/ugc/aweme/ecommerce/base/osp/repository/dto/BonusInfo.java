package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class BonusInfo {

    @C09CT("additional")
    public String additional;

    @C09CT("additional_notice")
    public ECRichText additionalNotice;

    @C09CT("animation_icon")
    public Icon animationIcon;

    @C09CT("bonus_title")
    public ECRichText bonusTitle;

    @C09CT("bonus_ui_version")
    public Integer bonusUiVersion;

    @C09CT("da_info")
    public String daInfo;

    @C09CT("discount_brief")
    public List<PromotionDiscountBrief> discountBrief;

    @C09CT("earn_bonus_text")
    public String earnBonusText;

    @C09CT("non_redeem_reason")
    public String nonRedeemReason;

    @C09CT("popup_layer_detail_info")
    public PopupLayerDetailInfo popupLayerDetailInfo;

    @C09CT("popup_tip")
    public PopupTip popupTip;

    @C09CT("redeem_amount")
    public ColorText redeemAmount;

    @C09CT("redeem_amount_value")
    public String redeemAmountValue;

    @C09CT("redeem_can_be_used")
    public Boolean redeemCanBeUsed;

    @C09CT("redeem_icon")
    public Icon redeemIcon;

    @C09CT("redeem_info")
    public ExceptionUX redeemInfo;

    @C09CT("redeem_title")
    public String redeemTitle;

    @C09CT("redeem_title_rich_text")
    public ECRichText redeemTitleRichText;

    @C09CT("use_bonus_redeem")
    public Boolean useBonusRedeem;

    public BonusInfo() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BonusInfo)) {
            return false;
        }
        BonusInfo bonusInfo = (BonusInfo) obj;
        return Intrinsics.LJFF(this.redeemIcon, bonusInfo.redeemIcon) && Intrinsics.LJFF(this.redeemTitle, bonusInfo.redeemTitle) && Intrinsics.LJFF(this.redeemAmount, bonusInfo.redeemAmount) && Intrinsics.LJFF(this.redeemCanBeUsed, bonusInfo.redeemCanBeUsed) && Intrinsics.LJFF(this.useBonusRedeem, bonusInfo.useBonusRedeem) && Intrinsics.LJFF(this.nonRedeemReason, bonusInfo.nonRedeemReason) && Intrinsics.LJFF(this.redeemInfo, bonusInfo.redeemInfo) && Intrinsics.LJFF(this.redeemAmountValue, bonusInfo.redeemAmountValue) && Intrinsics.LJFF(this.additional, bonusInfo.additional) && Intrinsics.LJFF(this.daInfo, bonusInfo.daInfo) && Intrinsics.LJFF(this.discountBrief, bonusInfo.discountBrief) && Intrinsics.LJFF(this.animationIcon, bonusInfo.animationIcon) && Intrinsics.LJFF(this.earnBonusText, bonusInfo.earnBonusText) && Intrinsics.LJFF(this.popupTip, bonusInfo.popupTip) && Intrinsics.LJFF(this.popupLayerDetailInfo, bonusInfo.popupLayerDetailInfo) && Intrinsics.LJFF(this.bonusTitle, bonusInfo.bonusTitle) && Intrinsics.LJFF(this.additionalNotice, bonusInfo.additionalNotice) && Intrinsics.LJFF(this.bonusUiVersion, bonusInfo.bonusUiVersion) && Intrinsics.LJFF(this.redeemTitleRichText, bonusInfo.redeemTitleRichText);
    }

    public final int hashCode() {
        Icon icon = this.redeemIcon;
        int iHashCode = (icon == null ? 0 : icon.hashCode()) * 31;
        String str = this.redeemTitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ColorText colorText = this.redeemAmount;
        int iHashCode3 = (iHashCode2 + (colorText == null ? 0 : colorText.hashCode())) * 31;
        Boolean bool = this.redeemCanBeUsed;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.useBonusRedeem;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.nonRedeemReason;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ExceptionUX exceptionUX = this.redeemInfo;
        int iHashCode7 = (iHashCode6 + (exceptionUX == null ? 0 : exceptionUX.hashCode())) * 31;
        String str3 = this.redeemAmountValue;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.additional;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.daInfo;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<PromotionDiscountBrief> list = this.discountBrief;
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        Icon icon2 = this.animationIcon;
        int iHashCode12 = (iHashCode11 + (icon2 == null ? 0 : icon2.hashCode())) * 31;
        String str6 = this.earnBonusText;
        int iHashCode13 = (iHashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        PopupTip popupTip = this.popupTip;
        int iHashCode14 = (iHashCode13 + (popupTip == null ? 0 : popupTip.hashCode())) * 31;
        PopupLayerDetailInfo popupLayerDetailInfo = this.popupLayerDetailInfo;
        int iHashCode15 = (iHashCode14 + (popupLayerDetailInfo == null ? 0 : popupLayerDetailInfo.hashCode())) * 31;
        ECRichText eCRichText = this.bonusTitle;
        int iHashCode16 = (iHashCode15 + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        ECRichText eCRichText2 = this.additionalNotice;
        int iHashCode17 = (iHashCode16 + (eCRichText2 == null ? 0 : eCRichText2.hashCode())) * 31;
        Integer num = this.bonusUiVersion;
        int iHashCode18 = (iHashCode17 + (num == null ? 0 : num.hashCode())) * 31;
        ECRichText eCRichText3 = this.redeemTitleRichText;
        return iHashCode18 + (eCRichText3 != null ? eCRichText3.hashCode() : 0);
    }

    public final String toString() {
        return "BonusInfo(redeemIcon=" + this.redeemIcon + ", redeemTitle=" + this.redeemTitle + ", redeemAmount=" + this.redeemAmount + ", redeemCanBeUsed=" + this.redeemCanBeUsed + ", useBonusRedeem=" + this.useBonusRedeem + ", nonRedeemReason=" + this.nonRedeemReason + ", redeemInfo=" + this.redeemInfo + ", redeemAmountValue=" + this.redeemAmountValue + ", additional=" + this.additional + ", daInfo=" + this.daInfo + ", discountBrief=" + this.discountBrief + ", animationIcon=" + this.animationIcon + ", earnBonusText=" + this.earnBonusText + ", popupTip=" + this.popupTip + ", popupLayerDetailInfo=" + this.popupLayerDetailInfo + ", bonusTitle=" + this.bonusTitle + ", additionalNotice=" + this.additionalNotice + ", bonusUiVersion=" + this.bonusUiVersion + ", redeemTitleRichText=" + this.redeemTitleRichText + ')';
    }

    public BonusInfo(Icon icon, String str, ColorText colorText, Boolean bool, Boolean bool2, String str2, ExceptionUX exceptionUX, String str3, String str4, String str5, List<PromotionDiscountBrief> list, Icon icon2, String str6, PopupTip popupTip, PopupLayerDetailInfo popupLayerDetailInfo, ECRichText eCRichText, ECRichText eCRichText2, Integer num, ECRichText eCRichText3) {
        this.redeemIcon = icon;
        this.redeemTitle = str;
        this.redeemAmount = colorText;
        this.redeemCanBeUsed = bool;
        this.useBonusRedeem = bool2;
        this.nonRedeemReason = str2;
        this.redeemInfo = exceptionUX;
        this.redeemAmountValue = str3;
        this.additional = str4;
        this.daInfo = str5;
        this.discountBrief = list;
        this.animationIcon = icon2;
        this.earnBonusText = str6;
        this.popupTip = popupTip;
        this.popupLayerDetailInfo = popupLayerDetailInfo;
        this.bonusTitle = eCRichText;
        this.additionalNotice = eCRichText2;
        this.bonusUiVersion = num;
        this.redeemTitleRichText = eCRichText3;
    }
}
