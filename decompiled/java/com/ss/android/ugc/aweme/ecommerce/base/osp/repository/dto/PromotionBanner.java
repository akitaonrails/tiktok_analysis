package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogContent;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PromotionBanner {

    @C09CT("activity_end_countdown_ms")
    public String activityEndCountdownMs;

    @C09CT("banner_action_type")
    public Integer bannerActionType;

    @C09CT("banner_icon")
    public Icon bannerIcon;

    @C09CT("banner_rich_text")
    public ECRichText bannerRichText;

    @C09CT("banner_text")
    public String bannerText;

    @C09CT("da_info")
    public String daInfo;

    @C09CT("dialog_on_countdown_end")
    public DialogContent dialogOnCountdownEnd;

    @C09CT("link_schema")
    public String linkSchema;

    @C09CT("style")
    public BannerStyle style;

    public PromotionBanner() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionBanner)) {
            return false;
        }
        PromotionBanner promotionBanner = (PromotionBanner) obj;
        return Intrinsics.LJFF(this.bannerText, promotionBanner.bannerText) && Intrinsics.LJFF(this.linkSchema, promotionBanner.linkSchema) && Intrinsics.LJFF(this.daInfo, promotionBanner.daInfo) && Intrinsics.LJFF(this.activityEndCountdownMs, promotionBanner.activityEndCountdownMs) && Intrinsics.LJFF(this.dialogOnCountdownEnd, promotionBanner.dialogOnCountdownEnd) && this.style == promotionBanner.style && Intrinsics.LJFF(this.bannerRichText, promotionBanner.bannerRichText) && Intrinsics.LJFF(this.bannerIcon, promotionBanner.bannerIcon) && Intrinsics.LJFF(this.bannerActionType, promotionBanner.bannerActionType);
    }

    public final int hashCode() {
        String str = this.bannerText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.linkSchema;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.daInfo;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.activityEndCountdownMs;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        DialogContent dialogContent = this.dialogOnCountdownEnd;
        int iHashCode5 = (iHashCode4 + (dialogContent == null ? 0 : dialogContent.hashCode())) * 31;
        BannerStyle bannerStyle = this.style;
        int iHashCode6 = (iHashCode5 + (bannerStyle == null ? 0 : bannerStyle.hashCode())) * 31;
        ECRichText eCRichText = this.bannerRichText;
        int iHashCode7 = (iHashCode6 + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        Icon icon = this.bannerIcon;
        int iHashCode8 = (iHashCode7 + (icon == null ? 0 : icon.hashCode())) * 31;
        Integer num = this.bannerActionType;
        return iHashCode8 + (num != null ? num.hashCode() : 0);
    }

    public static PromotionBanner LIZ(PromotionBanner promotionBanner) {
        return new PromotionBanner(promotionBanner.bannerText, promotionBanner.linkSchema, promotionBanner.daInfo, null, promotionBanner.dialogOnCountdownEnd, promotionBanner.style, promotionBanner.bannerRichText, promotionBanner.bannerIcon, promotionBanner.bannerActionType);
    }

    public PromotionBanner(String str, String str2, String str3, String str4, DialogContent dialogContent, BannerStyle bannerStyle, ECRichText eCRichText, Icon icon, Integer num) {
        this.bannerText = str;
        this.linkSchema = str2;
        this.daInfo = str3;
        this.activityEndCountdownMs = str4;
        this.dialogOnCountdownEnd = dialogContent;
        this.style = bannerStyle;
        this.bannerRichText = eCRichText;
        this.bannerIcon = icon;
        this.bannerActionType = num;
    }
}
