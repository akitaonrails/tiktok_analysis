package com.ss.android.ugc.aweme.iap.component.api;

import X.C09CT;
import X.C13BV;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class UnifiedPurchaseOption {

    @C09CT("create_contract_intent")
    public final Integer createContractIntent;

    @C09CT("cycle_type")
    public final Integer cycleType;

    @C09CT("description")
    public final String description;

    @C09CT("footer")
    public final FooterOverride footer;

    @C09CT("is_auto_renew")
    public final Boolean isAutoRenew;

    @C09CT("item_count")
    public final Integer itemCount;

    @C09CT("option_type")
    public final Integer optionType;

    @C09CT("package_id")
    public final String packageId;

    @C09CT("pay_channel")
    public final Integer payChannel;

    @C09CT("price")
    public final UnifiedPricePacket price;

    @C09CT("promotion_badge")
    public final PromotionBadge promotionBadge;

    @C09CT("purchase_category")
    public final Integer purchaseCategory;

    @C09CT("sku_id_list")
    public final List<String> skuIdList;

    @C09CT("sku_name")
    public final String skuName;

    @C09CT("title")
    public final String title;

    @C09CT("tpl_id")
    public final String tplId;

    public UnifiedPurchaseOption() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnifiedPurchaseOption)) {
            return false;
        }
        UnifiedPurchaseOption unifiedPurchaseOption = (UnifiedPurchaseOption) obj;
        return Intrinsics.LJFF(this.tplId, unifiedPurchaseOption.tplId) && Intrinsics.LJFF(this.optionType, unifiedPurchaseOption.optionType) && Intrinsics.LJFF(this.skuIdList, unifiedPurchaseOption.skuIdList) && Intrinsics.LJFF(this.title, unifiedPurchaseOption.title) && Intrinsics.LJFF(this.description, unifiedPurchaseOption.description) && Intrinsics.LJFF(this.packageId, unifiedPurchaseOption.packageId) && Intrinsics.LJFF(this.price, unifiedPurchaseOption.price) && Intrinsics.LJFF(this.isAutoRenew, unifiedPurchaseOption.isAutoRenew) && Intrinsics.LJFF(this.cycleType, unifiedPurchaseOption.cycleType) && Intrinsics.LJFF(this.itemCount, unifiedPurchaseOption.itemCount) && Intrinsics.LJFF(this.purchaseCategory, unifiedPurchaseOption.purchaseCategory) && Intrinsics.LJFF(this.footer, unifiedPurchaseOption.footer) && Intrinsics.LJFF(this.payChannel, unifiedPurchaseOption.payChannel) && Intrinsics.LJFF(this.createContractIntent, unifiedPurchaseOption.createContractIntent) && Intrinsics.LJFF(this.skuName, unifiedPurchaseOption.skuName) && Intrinsics.LJFF(this.promotionBadge, unifiedPurchaseOption.promotionBadge);
    }

    public final int hashCode() {
        String str = this.tplId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.optionType;
        int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.skuIdList.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.packageId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        UnifiedPricePacket unifiedPricePacket = this.price;
        int iHashCode6 = (iHashCode5 + (unifiedPricePacket == null ? 0 : unifiedPricePacket.hashCode())) * 31;
        Boolean bool = this.isAutoRenew;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.cycleType;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.itemCount;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.purchaseCategory;
        int iHashCode10 = (iHashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
        FooterOverride footerOverride = this.footer;
        int iHashCode11 = (iHashCode10 + (footerOverride == null ? 0 : footerOverride.hashCode())) * 31;
        Integer num5 = this.payChannel;
        int iHashCode12 = (iHashCode11 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.createContractIntent;
        int iHashCode13 = (iHashCode12 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str5 = this.skuName;
        int iHashCode14 = (iHashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31;
        PromotionBadge promotionBadge = this.promotionBadge;
        return iHashCode14 + (promotionBadge != null ? promotionBadge.hashCode() : 0);
    }

    public final String toString() {
        return "UnifiedPurchaseOption(tplId=" + this.tplId + ", optionType=" + this.optionType + ", skuIdList=" + this.skuIdList + ", title=" + this.title + ", description=" + this.description + ", packageId=" + this.packageId + ", price=" + this.price + ", isAutoRenew=" + this.isAutoRenew + ", cycleType=" + this.cycleType + ", itemCount=" + this.itemCount + ", purchaseCategory=" + this.purchaseCategory + ", footer=" + this.footer + ", payChannel=" + this.payChannel + ", createContractIntent=" + this.createContractIntent + ", skuName=" + this.skuName + ", promotionBadge=" + this.promotionBadge + ')';
    }

    public UnifiedPurchaseOption(String str, Integer num, List<String> list, String str2, String str3, String str4, UnifiedPricePacket unifiedPricePacket, Boolean bool, Integer num2, Integer num3, Integer num4, FooterOverride footerOverride, Integer num5, Integer num6, String str5, PromotionBadge promotionBadge) {
        this.tplId = str;
        this.optionType = num;
        this.skuIdList = list;
        this.title = str2;
        this.description = str3;
        this.packageId = str4;
        this.price = unifiedPricePacket;
        this.isAutoRenew = bool;
        this.cycleType = num2;
        this.itemCount = num3;
        this.purchaseCategory = num4;
        this.footer = footerOverride;
        this.payChannel = num5;
        this.createContractIntent = num6;
        this.skuName = str5;
        this.promotionBadge = promotionBadge;
    }

    public UnifiedPurchaseOption(String str, Integer num, List list, String str2, String str3, String str4, UnifiedPricePacket unifiedPricePacket, Boolean bool, Integer num2, Integer num3, Integer num4, FooterOverride footerOverride, Integer num5, Integer num6, String str5, PromotionBadge promotionBadge, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? C13BV.INSTANCE : list, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : unifiedPricePacket, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? null : num2, (i & 512) != 0 ? null : num3, (i & 1024) != 0 ? null : num4, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : footerOverride, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : num5, (i & 8192) != 0 ? null : num6, (i & 16384) != 0 ? null : str5, (i & 32768) != 0 ? null : promotionBadge);
    }
}
