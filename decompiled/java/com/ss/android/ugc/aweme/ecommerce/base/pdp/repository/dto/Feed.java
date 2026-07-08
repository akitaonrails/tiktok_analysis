package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import X.C703902ov;
import X.InterfaceC1891350zJl;
import X.InterfaceC746802vq;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class Feed implements InterfaceC746802vq {

    @C09CT("card")
    public final Card card;

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("extra")
    public final FeedExtra extra;

    @C09CT("type")
    public final Integer feedType;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("product")
    public final FeedProduct product;

    @C09CT("pdp_recommendation_product")
    public final ProductTile productTile;

    @C09CT("shop_product")
    public final ShopProductData shopProduct;

    public Feed() {
        this(null, 1, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Feed)) {
            return false;
        }
        Feed feed = (Feed) obj;
        return Intrinsics.LJFF(this.id, feed.id) && Intrinsics.LJFF(this.feedType, feed.feedType) && Intrinsics.LJFF(this.product, feed.product) && Intrinsics.LJFF(this.shopProduct, feed.shopProduct) && Intrinsics.LJFF(this.productTile, feed.productTile) && Intrinsics.LJFF(this.extra, feed.extra) && Intrinsics.LJFF(this.card, feed.card) && Intrinsics.LJFF(this.daInfo, feed.daInfo);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC746802vq
    public final String getItemId() {
        return null;
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.feedType;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        FeedProduct feedProduct = this.product;
        int iHashCode3 = (iHashCode2 + (feedProduct == null ? 0 : feedProduct.hashCode())) * 31;
        ShopProductData shopProductData = this.shopProduct;
        int iHashCode4 = (iHashCode3 + (shopProductData == null ? 0 : shopProductData.hashCode())) * 31;
        ProductTile productTile = this.productTile;
        int iHashCode5 = (iHashCode4 + (productTile == null ? 0 : productTile.hashCode())) * 31;
        FeedExtra feedExtra = this.extra;
        int iHashCode6 = (iHashCode5 + (feedExtra == null ? 0 : feedExtra.hashCode())) * 31;
        Card card = this.card;
        int iHashCode7 = (iHashCode6 + (card == null ? 0 : card.hashCode())) * 31;
        String str2 = this.daInfo;
        return iHashCode7 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Feed(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", feedType=");
        sbLIZ.append(this.feedType);
        sbLIZ.append(", product=");
        sbLIZ.append(this.product);
        sbLIZ.append(", shopProduct=");
        sbLIZ.append(this.shopProduct);
        sbLIZ.append(", productTile=");
        sbLIZ.append(this.productTile);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(", card=");
        sbLIZ.append(this.card);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C703902ov.LIZ(this, interfaceC1891350zJl);
    }

    public Feed(String str, Integer num, FeedProduct feedProduct, ShopProductData shopProductData, ProductTile productTile, FeedExtra feedExtra, Card card, String str2) {
        this.id = str;
        this.feedType = num;
        this.product = feedProduct;
        this.shopProduct = shopProductData;
        this.productTile = productTile;
        this.extra = feedExtra;
        this.card = card;
        this.daInfo = str2;
    }
}
