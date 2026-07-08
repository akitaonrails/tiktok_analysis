package com.ss.android.ugc.aweme.search.ecom.data;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.search.model.Image;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class Product {

    @C09CT("activity_info")
    public final ActivityInfo activityInfo;

    @C09CT("bcm_standard_track")
    public final BcmStandardTrackEvent bcmStandardTrackEvent;

    @C09CT("biz_type")
    public final Integer bizType;

    @C09CT("brand_name")
    public final String brandName;

    @C09CT("cover")
    public final String cover;

    @C09CT("creator_showcase_price_style")
    public final Integer creatorShowcasePriceStyle;

    @C09CT("currency")
    public final String currency;

    @C09CT("currency_position")
    public final Integer currencyPosition;

    @C09CT("currency_show_mode")
    public final Integer currencyShowMode;

    @C09CT("currency_symbol")
    public final String currencySymbol;

    @C09CT("detail_url")
    public final String detailUrl;

    @C09CT("elastic_title")
    public final String elasticTitle;

    @C09CT("extra")
    public final ExtraInfo extra;

    @C09CT("format_discount")
    public final String formatDiscount;

    @C09CT("format_origin_price_number")
    public final String formatOriginPriceNumber;

    @C09CT("format_price")
    public final String formatPrice;

    @C09CT("format_price_number")
    public final String formatPriceNumber;

    @C09CT("product_id_str")
    public final String idStr;

    @C09CT("img")
    public final List<String> imgUrlList;

    @C09CT("is_pinned")
    public final Boolean isPinned;

    @C09CT("live_product_anchor_style")
    public final LiveProductAnchorStyleInfo liveProductAnchorStyle;

    @C09CT("platform")
    public final Integer platform;

    @C09CT("product_id")
    public final Long productId;

    @C09CT("promotion_labels")
    public final List<PromotionLabel> promotionLabels;

    @C09CT("schema")
    public final String schema;

    @C09CT("show_currency_space")
    public final Boolean showCurrencySpace;

    @C09CT("source")
    public final String source;

    @C09CT("source_from")
    public final String sourceFrom;

    @C09CT("symbol_position")
    public final Integer symbolPosition;

    @C09CT("title")
    public final String title;

    public Product() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741823, null);
    }

    public final int hashCode() {
        Long l = this.productId;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        BcmStandardTrackEvent bcmStandardTrackEvent = this.bcmStandardTrackEvent;
        int iHashCode2 = (iHashCode + (bcmStandardTrackEvent == null ? 0 : bcmStandardTrackEvent.hashCode())) * 31;
        String str = this.idStr;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isPinned;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cover;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.elasticTitle;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list = this.imgUrlList;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.formatPrice;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.currency;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.currencySymbol;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.formatPriceNumber;
        int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.formatDiscount;
        int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Boolean bool2 = this.showCurrencySpace;
        int iHashCode14 = (iHashCode13 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.symbolPosition;
        int iHashCode15 = (iHashCode14 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.currencyShowMode;
        int iHashCode16 = (iHashCode15 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.creatorShowcasePriceStyle;
        int iHashCode17 = (iHashCode16 + (num3 == null ? 0 : num3.hashCode())) * 31;
        LiveProductAnchorStyleInfo liveProductAnchorStyleInfo = this.liveProductAnchorStyle;
        int iHashCode18 = (iHashCode17 + (liveProductAnchorStyleInfo == null ? 0 : liveProductAnchorStyleInfo.hashCode())) * 31;
        String str10 = this.formatOriginPriceNumber;
        int iHashCode19 = (iHashCode18 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Integer num4 = this.currencyPosition;
        int iHashCode20 = (iHashCode19 + (num4 == null ? 0 : num4.hashCode())) * 31;
        ActivityInfo activityInfo = this.activityInfo;
        int iHashCode21 = (iHashCode20 + (activityInfo == null ? 0 : activityInfo.hashCode())) * 31;
        String str11 = this.schema;
        int iHashCode22 = (iHashCode21 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.detailUrl;
        int iHashCode23 = (((iHashCode22 + (str12 == null ? 0 : str12.hashCode())) * 31) + this.promotionLabels.hashCode()) * 31;
        Integer num5 = this.platform;
        int iHashCode24 = (iHashCode23 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str13 = this.sourceFrom;
        int iHashCode25 = (iHashCode24 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.source;
        int iHashCode26 = (iHashCode25 + (str14 == null ? 0 : str14.hashCode())) * 31;
        ExtraInfo extraInfo = this.extra;
        int iHashCode27 = (iHashCode26 + (extraInfo == null ? 0 : extraInfo.hashCode())) * 31;
        Integer num6 = this.bizType;
        int iHashCode28 = (iHashCode27 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str15 = this.brandName;
        return iHashCode28 + (str15 != null ? str15.hashCode() : 0);
    }

    public final String toString() {
        return "Product(productId=" + this.productId + ", bcmStandardTrackEvent=" + this.bcmStandardTrackEvent + ", idStr=" + this.idStr + ", isPinned=" + this.isPinned + ", title=" + this.title + ", cover=" + this.cover + ", elasticTitle=" + this.elasticTitle + ", imgUrlList=" + this.imgUrlList + ", formatPrice=" + this.formatPrice + ", currency=" + this.currency + ", currencySymbol=" + this.currencySymbol + ", formatPriceNumber=" + this.formatPriceNumber + ", formatDiscount=" + this.formatDiscount + ", showCurrencySpace=" + this.showCurrencySpace + ", symbolPosition=" + this.symbolPosition + ", currencyShowMode=" + this.currencyShowMode + ", creatorShowcasePriceStyle=" + this.creatorShowcasePriceStyle + ", liveProductAnchorStyle=" + this.liveProductAnchorStyle + ", formatOriginPriceNumber=" + this.formatOriginPriceNumber + ", currencyPosition=" + this.currencyPosition + ", activityInfo=" + this.activityInfo + ", schema=" + this.schema + ", detailUrl=" + this.detailUrl + ", promotionLabels=" + this.promotionLabels + ", platform=" + this.platform + ", sourceFrom=" + this.sourceFrom + ", source=" + this.source + ", extra=" + this.extra + ", bizType=" + this.bizType + ", brandName=" + this.brandName + ')';
    }

    public final String LIZIZ() {
        String str = this.idStr;
        return (str == null || str.length() == 0) ? String.valueOf(this.productId) : this.idStr;
    }

    public static final class ExtraInfo {

        @C09CT("is_pinned")
        public final int isPinned;

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ExtraInfo(isPinned=");
            sbLIZ.append(this.isPinned);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public ExtraInfo(int i) {
            this.isPinned = i;
        }
    }

    public static final class LabelIcon implements Serializable {

        @C09CT("label_image_dark")
        public Image labelImageDark;

        @C09CT("label_image_light")
        public Image labelImageLight;

        public LabelIcon() {
            this(null, null);
        }

        public final void setLabelImageDark(Image image) {
            this.labelImageDark = image;
        }

        public final void setLabelImageLight(Image image) {
            this.labelImageLight = image;
        }

        public LabelIcon(Image image, Image image2) {
            this.labelImageLight = image;
            this.labelImageDark = image2;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Product) {
            return Intrinsics.LJFF(((Product) obj).productId, this.productId);
        }
        return false;
    }

    public static final class ActivityInfo {

        @C09CT("icon")
        public final UrlModel iconUrl;

        @C09CT("name")
        public final String name;

        public ActivityInfo() {
            this(null, null);
        }

        public ActivityInfo(String str, UrlModel urlModel) {
            this.name = str;
            this.iconUrl = urlModel;
        }
    }

    public static final class LiveProductAnchorStyleInfo {

        @C09CT("anchor_icon_text")
        public final String anchorIconText;

        @C09CT("type")
        public final Integer type;

        public LiveProductAnchorStyleInfo() {
            this(null, null);
        }

        public LiveProductAnchorStyleInfo(Integer num, String str) {
            this.type = num;
            this.anchorIconText = str;
        }
    }

    public static Product LIZ(Product product, String str) {
        return new Product(product.productId, product.bcmStandardTrackEvent, str, product.isPinned, product.title, product.cover, product.elasticTitle, product.imgUrlList, product.formatPrice, product.currency, product.currencySymbol, product.formatPriceNumber, product.formatDiscount, product.showCurrencySpace, product.symbolPosition, product.currencyShowMode, product.creatorShowcasePriceStyle, product.liveProductAnchorStyle, product.formatOriginPriceNumber, product.currencyPosition, product.activityInfo, product.schema, product.detailUrl, product.promotionLabels, product.platform, product.sourceFrom, product.source, product.extra, product.bizType, product.brandName);
    }

    public static final class PromotionLabel {

        @C09CT("da_info")
        public final String daInfo;

        @C09CT("icon")
        public final LabelIcon icon;

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public final String id;

        @C09CT("text")
        public final String text;

        @C09CT("label_type")
        public final Integer type;

        public PromotionLabel() {
            this(null, null, null, null, null);
        }

        public PromotionLabel(String str, LabelIcon labelIcon, String str2, Integer num, String str3) {
            this.id = str;
            this.icon = labelIcon;
            this.text = str2;
            this.type = num;
            this.daInfo = str3;
        }
    }

    public Product(Long l, BcmStandardTrackEvent bcmStandardTrackEvent, String str, Boolean bool, String str2, String str3, String str4, List<String> list, String str5, String str6, String str7, String str8, String str9, Boolean bool2, Integer num, Integer num2, Integer num3, LiveProductAnchorStyleInfo liveProductAnchorStyleInfo, String str10, Integer num4, ActivityInfo activityInfo, String str11, String str12, List<PromotionLabel> list2, Integer num5, String str13, String str14, ExtraInfo extraInfo, Integer num6, String str15) {
        this.productId = l;
        this.bcmStandardTrackEvent = bcmStandardTrackEvent;
        this.idStr = str;
        this.isPinned = bool;
        this.title = str2;
        this.cover = str3;
        this.elasticTitle = str4;
        this.imgUrlList = list;
        this.formatPrice = str5;
        this.currency = str6;
        this.currencySymbol = str7;
        this.formatPriceNumber = str8;
        this.formatDiscount = str9;
        this.showCurrencySpace = bool2;
        this.symbolPosition = num;
        this.currencyShowMode = num2;
        this.creatorShowcasePriceStyle = num3;
        this.liveProductAnchorStyle = liveProductAnchorStyleInfo;
        this.formatOriginPriceNumber = str10;
        this.currencyPosition = num4;
        this.activityInfo = activityInfo;
        this.schema = str11;
        this.detailUrl = str12;
        this.promotionLabels = list2;
        this.platform = num5;
        this.sourceFrom = str13;
        this.source = str14;
        this.extra = extraInfo;
        this.bizType = num6;
        this.brandName = str15;
    }

    public Product(Long l, BcmStandardTrackEvent bcmStandardTrackEvent, String str, Boolean bool, String str2, String str3, String str4, List list, String str5, String str6, String str7, String str8, String str9, Boolean bool2, Integer num, Integer num2, Integer num3, LiveProductAnchorStyleInfo liveProductAnchorStyleInfo, String str10, Integer num4, ActivityInfo activityInfo, String str11, String str12, List list2, Integer num5, String str13, String str14, ExtraInfo extraInfo, Integer num6, String str15, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : bcmStandardTrackEvent, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : str7, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : str8, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : str9, (i & 8192) != 0 ? null : bool2, (i & 16384) != 0 ? null : num, (32768 & i) != 0 ? null : num2, (65536 & i) != 0 ? null : num3, (131072 & i) != 0 ? null : liveProductAnchorStyleInfo, (262144 & i) != 0 ? null : str10, (524288 & i) != 0 ? null : num4, (1048576 & i) != 0 ? null : activityInfo, (2097152 & i) != 0 ? null : str11, (4194304 & i) != 0 ? null : str12, (8388608 & i) != 0 ? C13BV.INSTANCE : list2, (16777216 & i) != 0 ? null : num5, (33554432 & i) != 0 ? null : str13, (67108864 & i) != 0 ? null : str14, (134217728 & i) != 0 ? null : extraInfo, (268435456 & i) != 0 ? null : num6, (i & 536870912) != 0 ? null : str15);
    }
}
