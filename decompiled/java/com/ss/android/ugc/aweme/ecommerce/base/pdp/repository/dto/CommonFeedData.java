package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class CommonFeedData {

    @C09CT("add_to_cart_button_text")
    public final String addToCartButtonText;

    @C09CT("price_rich_text")
    public final LinkRichText bundlePrice;

    @C09CT("feed_list")
    public final List<Feed> feedList;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("jump_schema")
    public final String jumpSchema;

    @C09CT("max_bundle_price")
    public final String maxBundlePrice;

    @C09CT("min_bundle_price")
    public final String minBundlePrice;

    @C09CT("next_cursor")
    public final int nextCursor;

    @C09CT("promotion_rich_text")
    public final LinkRichText promotion;

    @C09CT("request_id")
    public final String requestId;

    @C09CT("session_id")
    public final String sessionId;

    @C09CT("shop_promotion")
    public final ShopPromotionItem shopPromotion;

    @C09CT("title")
    public final String title;

    public CommonFeedData() {
        this(null, null, null, null, null, null, null, false, 1, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonFeedData)) {
            return false;
        }
        CommonFeedData commonFeedData = (CommonFeedData) obj;
        return Intrinsics.LJFF(this.title, commonFeedData.title) && Intrinsics.LJFF(this.addToCartButtonText, commonFeedData.addToCartButtonText) && Intrinsics.LJFF(this.promotion, commonFeedData.promotion) && Intrinsics.LJFF(this.bundlePrice, commonFeedData.bundlePrice) && Intrinsics.LJFF(this.feedList, commonFeedData.feedList) && Intrinsics.LJFF(this.requestId, commonFeedData.requestId) && Intrinsics.LJFF(this.sessionId, commonFeedData.sessionId) && this.hasMore == commonFeedData.hasMore && this.nextCursor == commonFeedData.nextCursor && Intrinsics.LJFF(this.minBundlePrice, commonFeedData.minBundlePrice) && Intrinsics.LJFF(this.maxBundlePrice, commonFeedData.maxBundlePrice) && Intrinsics.LJFF(this.jumpSchema, commonFeedData.jumpSchema) && Intrinsics.LJFF(this.shopPromotion, commonFeedData.shopPromotion);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.addToCartButtonText;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        LinkRichText linkRichText = this.promotion;
        int iHashCode3 = (iHashCode2 + (linkRichText == null ? 0 : linkRichText.hashCode())) * 31;
        LinkRichText linkRichText2 = this.bundlePrice;
        int iHashCode4 = (iHashCode3 + (linkRichText2 == null ? 0 : linkRichText2.hashCode())) * 31;
        List<Feed> list = this.feedList;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.requestId;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sessionId;
        int iHashCode7 = (((((iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31) + C786410Ut5.Z2(this.hasMore)) * 31) + this.nextCursor) * 31;
        String str5 = this.minBundlePrice;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.maxBundlePrice;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.jumpSchema;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        ShopPromotionItem shopPromotionItem = this.shopPromotion;
        return iHashCode10 + (shopPromotionItem != null ? shopPromotionItem.hashCode() : 0);
    }

    public CommonFeedData(String str, String str2, LinkRichText linkRichText, LinkRichText linkRichText2, List<Feed> list, String str3, String str4, boolean z, int i, String str5, String str6, String str7, ShopPromotionItem shopPromotionItem) {
        this.title = str;
        this.addToCartButtonText = str2;
        this.promotion = linkRichText;
        this.bundlePrice = linkRichText2;
        this.feedList = list;
        this.requestId = str3;
        this.sessionId = str4;
        this.hasMore = z;
        this.nextCursor = i;
        this.minBundlePrice = str5;
        this.maxBundlePrice = str6;
        this.jumpSchema = str7;
        this.shopPromotion = shopPromotionItem;
    }
}
