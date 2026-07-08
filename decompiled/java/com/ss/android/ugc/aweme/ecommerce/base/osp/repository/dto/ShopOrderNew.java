package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ShopOrderNew {

    @C09CT("banner_promotion_activity")
    public ShopPromotionActivity bannerPromotionActivity;

    @C09CT("coupon_schema")
    public String couponSchema;

    @C09CT("expand_all_items_text")
    public String expandAllTitle;

    @C09CT("item_text")
    public String itemText;

    @C09CT("main_order_infos")
    public List<MainOrderInfo> mainOrderInfos;

    @C09CT("phone_credit")
    public PhoneCredit phoneCredit;

    @C09CT("product_type")
    public Integer productType;

    @C09CT("seller")
    public SellerInfo seller;

    @C09CT("seller_id")
    public String sellerId;

    @C09CT("seller_info_clickable")
    public boolean sellerInfoClickable;

    @C09CT("seller_text")
    public String sellerText;

    @C09CT("shop_bill")
    public ShopBill shopBill;

    @C09CT("starling_texts")
    public ShopOrderStarling shopOrderStarling;

    @C09CT("shop_promotion_cache_key")
    public String shopPromotionCacheKey;

    @C09CT("shop_tab_schema")
    public String shopTabSchema;

    @C09CT("title")
    public String title;

    @C09CT("voucher_selected_info")
    public List<VoucherInfoNew> voucherSelectedInfo;

    public ShopOrderNew() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopOrderNew)) {
            return false;
        }
        ShopOrderNew shopOrderNew = (ShopOrderNew) obj;
        return Intrinsics.LJFF(this.seller, shopOrderNew.seller) && Intrinsics.LJFF(this.sellerId, shopOrderNew.sellerId) && Intrinsics.LJFF(this.shopTabSchema, shopOrderNew.shopTabSchema) && Intrinsics.LJFF(this.shopBill, shopOrderNew.shopBill) && Intrinsics.LJFF(this.bannerPromotionActivity, shopOrderNew.bannerPromotionActivity) && Intrinsics.LJFF(this.shopPromotionCacheKey, shopOrderNew.shopPromotionCacheKey) && Intrinsics.LJFF(this.mainOrderInfos, shopOrderNew.mainOrderInfos) && Intrinsics.LJFF(this.voucherSelectedInfo, shopOrderNew.voucherSelectedInfo) && Intrinsics.LJFF(this.productType, shopOrderNew.productType) && Intrinsics.LJFF(this.phoneCredit, shopOrderNew.phoneCredit) && Intrinsics.LJFF(this.couponSchema, shopOrderNew.couponSchema) && Intrinsics.LJFF(this.title, shopOrderNew.title) && Intrinsics.LJFF(this.expandAllTitle, shopOrderNew.expandAllTitle) && Intrinsics.LJFF(this.sellerText, shopOrderNew.sellerText) && Intrinsics.LJFF(this.itemText, shopOrderNew.itemText) && Intrinsics.LJFF(this.shopOrderStarling, shopOrderNew.shopOrderStarling) && this.sellerInfoClickable == shopOrderNew.sellerInfoClickable;
    }

    public static ShopOrderNew LIZ(ShopOrderNew shopOrderNew, List list, int i) {
        SellerInfo sellerInfo;
        String str;
        String str2;
        ShopBill shopBill;
        ShopPromotionActivity shopPromotionActivity;
        String str3;
        List<VoucherInfoNew> list2;
        Integer num;
        PhoneCredit phoneCredit;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        boolean z;
        List list3 = list;
        ShopOrderStarling shopOrderStarling = null;
        if ((i & 1) != 0) {
            sellerInfo = shopOrderNew.seller;
        } else {
            sellerInfo = null;
        }
        if ((i & 2) != 0) {
            str = shopOrderNew.sellerId;
        } else {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = shopOrderNew.shopTabSchema;
        } else {
            str2 = null;
        }
        if ((i & 8) != 0) {
            shopBill = shopOrderNew.shopBill;
        } else {
            shopBill = null;
        }
        if ((i & 16) != 0) {
            shopPromotionActivity = shopOrderNew.bannerPromotionActivity;
        } else {
            shopPromotionActivity = null;
        }
        if ((i & 32) != 0) {
            str3 = shopOrderNew.shopPromotionCacheKey;
        } else {
            str3 = null;
        }
        if ((i & 64) != 0) {
            list3 = shopOrderNew.mainOrderInfos;
        }
        if ((i & 128) != 0) {
            list2 = shopOrderNew.voucherSelectedInfo;
        } else {
            list2 = null;
        }
        if ((i & 256) != 0) {
            num = shopOrderNew.productType;
        } else {
            num = null;
        }
        if ((i & 512) != 0) {
            phoneCredit = shopOrderNew.phoneCredit;
        } else {
            phoneCredit = null;
        }
        if ((i & 1024) != 0) {
            str4 = shopOrderNew.couponSchema;
        } else {
            str4 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str5 = shopOrderNew.title;
        } else {
            str5 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str6 = shopOrderNew.expandAllTitle;
        } else {
            str6 = null;
        }
        if ((i & 8192) != 0) {
            str7 = shopOrderNew.sellerText;
        } else {
            str7 = null;
        }
        if ((i & 16384) != 0) {
            str8 = shopOrderNew.itemText;
        } else {
            str8 = null;
        }
        if ((32768 & i) != 0) {
            shopOrderStarling = shopOrderNew.shopOrderStarling;
        }
        if ((i & 65536) != 0) {
            z = shopOrderNew.sellerInfoClickable;
        } else {
            z = false;
        }
        shopOrderNew.getClass();
        return new ShopOrderNew(sellerInfo, str, str2, shopBill, shopPromotionActivity, str3, list3, list2, num, phoneCredit, str4, str5, str6, str7, str8, shopOrderStarling, z);
    }

    public ShopOrderNew(SellerInfo sellerInfo, String str, String str2, ShopBill shopBill, ShopPromotionActivity shopPromotionActivity, String str3, List<MainOrderInfo> list, List<VoucherInfoNew> list2, Integer num, PhoneCredit phoneCredit, String str4, String str5, String str6, String str7, String str8, ShopOrderStarling shopOrderStarling, boolean z) {
        this.seller = sellerInfo;
        this.sellerId = str;
        this.shopTabSchema = str2;
        this.shopBill = shopBill;
        this.bannerPromotionActivity = shopPromotionActivity;
        this.shopPromotionCacheKey = str3;
        this.mainOrderInfos = list;
        this.voucherSelectedInfo = list2;
        this.productType = num;
        this.phoneCredit = phoneCredit;
        this.couponSchema = str4;
        this.title = str5;
        this.expandAllTitle = str6;
        this.sellerText = str7;
        this.itemText = str8;
        this.shopOrderStarling = shopOrderStarling;
        this.sellerInfoClickable = z;
    }
}
