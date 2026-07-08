package com.ss.android.ugc.aweme.ecommerce.ug.common.bean;

import X.C09CT;
import android.os.SystemClock;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.ug.btm.BcmStandardTrackData;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes33.dex */
public final class EcUgProduct {
    public final long LIZ;

    @C09CT("bcm_standard_track")
    public final BcmStandardTrackData bcmStandardTrack;

    @C09CT("biz_type")
    public final Integer bizType;

    @C09CT("buy_button")
    public final EcUgProductBtn btnBuy;

    @C09CT("jump_pdp_index")
    public final Integer cacheImageIndex;

    @C09CT("first_image")
    public final Image firstImage;

    @C09CT("is_intelligent_selection_main_image")
    public final Boolean isIntelligentSelectionMainImage;

    @C09CT("log_extra")
    public final String logExtra;

    @C09CT("pdp_cache_image")
    public final Image pdpCacheImage;

    @C09CT("platform")
    public final Integer platform;

    @C09CT("price")
    public final EcUgProductPrice price;

    @C09CT("product_card_schema")
    public final String productCardSchema;

    @C09CT("product_id")
    public final String productId;

    @C09CT("product_labels")
    public final Map<String, List<EcUgPromotionLabel>> productLabels;

    @C09CT("product_rating")
    public final Float productRating;

    @C09CT("promotion_labels")
    public final List<PromotionLabel> promotionLabels;

    @C09CT("promotion_view")
    public final PromotionView promotionView;

    @C09CT("schema")
    public final String schema;

    @C09CT("seller")
    public final EcUgProductSeller seller;

    @C09CT("shop_id")
    public final String shopId;

    @C09CT("skc_info")
    public final EcUgProductSkcInfo skcInfo;

    @C09CT("skus")
    public final List<Object> skus;

    @C09CT("sold_count_str")
    public final String soldCountStr;

    @C09CT("source_from")
    public final Integer sourceFrom;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;

    @C09CT("title")
    public final String title;

    public EcUgProduct() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, -1, 1, 5, 3, null, null, 0, Boolean.FALSE, null, null, null, null, null);
    }

    public static final class EcUgProductSeller {

        @C09CT("seller_id")
        public final String sellerId;

        public EcUgProductSeller() {
            this(null);
        }

        public EcUgProductSeller(String str) {
            this.sellerId = str;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class EcUgProductSkcInfo {

        @C09CT("skcs")
        public final List<Object> skcs;

        public EcUgProductSkcInfo() {
            this(null);
        }

        public EcUgProductSkcInfo(List<Object> list) {
            this.skcs = list;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class EcUgProductBtn {

        @C09CT("jump_schema")
        public final String jumpSchema;

        @C09CT("log_extra")
        public final String logExtra;

        @C09CT("desc")
        public final String text;

        public EcUgProductBtn() {
            this(null, null, null);
        }

        public EcUgProductBtn(String str, String str2, String str3) {
            this.text = str;
            this.logExtra = str2;
            this.jumpSchema = str3;
        }
    }

    public static final class EcUgProductPrice {

        @C09CT("currency")
        public final String currency;

        @C09CT("currency_decimal_symbol")
        public final String currencyDecimalSymbol;

        @C09CT("currency_separator")
        public final String currencySeparator;

        @C09CT("min_price")
        public final String minOriginalPrice;

        @C09CT("min_real_price")
        public final String minSalesPrice;

        public EcUgProductPrice() {
            this(null, null, null, null, null);
        }

        public EcUgProductPrice(String str, String str2, String str3, String str4, String str5) {
            this.currency = str;
            this.minSalesPrice = str2;
            this.minOriginalPrice = str3;
            this.currencyDecimalSymbol = str4;
            this.currencySeparator = str5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EcUgProduct(String str, Image image, String str2, EcUgProductPrice ecUgProductPrice, Float f, String str3, PromotionView promotionView, EcUgProductBtn ecUgProductBtn, String str4, List<Object> list, EcUgProductSkcInfo ecUgProductSkcInfo, EcUgProductSeller ecUgProductSeller, Integer num, Integer num2, Integer num3, Integer num4, String str5, List<PromotionLabel> list2, Integer num5, Boolean bool, Image image2, BcmStandardTrackData bcmStandardTrackData, String str6, String str7, Map<String, ? extends List<EcUgPromotionLabel>> map) {
        this.productId = str;
        this.firstImage = image;
        this.title = str2;
        this.price = ecUgProductPrice;
        this.productRating = f;
        this.soldCountStr = str3;
        this.promotionView = promotionView;
        this.btnBuy = ecUgProductBtn;
        this.schema = str4;
        this.skus = list;
        this.skcInfo = ecUgProductSkcInfo;
        this.seller = ecUgProductSeller;
        this.bizType = num;
        this.status = num2;
        this.platform = num3;
        this.sourceFrom = num4;
        this.logExtra = str5;
        this.promotionLabels = list2;
        this.cacheImageIndex = num5;
        this.isIntelligentSelectionMainImage = bool;
        this.pdpCacheImage = image2;
        this.bcmStandardTrack = bcmStandardTrackData;
        this.productCardSchema = str6;
        this.shopId = str7;
        this.productLabels = map;
        this.LIZ = SystemClock.elapsedRealtime();
    }
}
