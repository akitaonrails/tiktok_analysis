package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.shop;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.view.bannerlayout.SeaBannerBackground;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaOfficialShopProfileVO {

    @C09CT("avatar")
    public final Image avatar;

    @C09CT("background")
    public final SeaBannerBackground background;

    @C09CT("banner_style")
    public final ShopBannerStyle bannerStyle;

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("link")
    public final String link;

    @C09CT("margin")
    public final List<Integer> margin;

    @C09CT("name")
    public final String name;

    @C09CT("rating_info")
    public final RatingInfo ratingInfo;

    @C09CT("sales_detail_infos")
    public final List<SaleDetailInfo> salesDetailInfos;

    @C09CT("sales_simple_info")
    public final SaleDetailInfo salesSimpleInfo;

    @C09CT("shop_link")
    public final String shopLink;

    public SeaOfficialShopProfileVO() {
        this(null, null, null, null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeaOfficialShopProfileVO)) {
            return false;
        }
        SeaOfficialShopProfileVO seaOfficialShopProfileVO = (SeaOfficialShopProfileVO) obj;
        return Intrinsics.LJFF(this.name, seaOfficialShopProfileVO.name) && Intrinsics.LJFF(this.avatar, seaOfficialShopProfileVO.avatar) && Intrinsics.LJFF(this.ratingInfo, seaOfficialShopProfileVO.ratingInfo) && Intrinsics.LJFF(this.salesSimpleInfo, seaOfficialShopProfileVO.salesSimpleInfo) && Intrinsics.LJFF(this.salesDetailInfos, seaOfficialShopProfileVO.salesDetailInfos) && Intrinsics.LJFF(this.bannerStyle, seaOfficialShopProfileVO.bannerStyle) && Intrinsics.LJFF(this.background, seaOfficialShopProfileVO.background) && Intrinsics.LJFF(this.link, seaOfficialShopProfileVO.link) && Intrinsics.LJFF(this.shopLink, seaOfficialShopProfileVO.shopLink) && Intrinsics.LJFF(this.margin, seaOfficialShopProfileVO.margin) && Intrinsics.LJFF(this.daInfo, seaOfficialShopProfileVO.daInfo);
    }

    public final int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Image image = this.avatar;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        RatingInfo ratingInfo = this.ratingInfo;
        int iHashCode3 = (iHashCode2 + (ratingInfo == null ? 0 : ratingInfo.hashCode())) * 31;
        SaleDetailInfo saleDetailInfo = this.salesSimpleInfo;
        int iHashCode4 = (iHashCode3 + (saleDetailInfo == null ? 0 : saleDetailInfo.hashCode())) * 31;
        List<SaleDetailInfo> list = this.salesDetailInfos;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        ShopBannerStyle shopBannerStyle = this.bannerStyle;
        int iHashCode6 = (iHashCode5 + (shopBannerStyle == null ? 0 : shopBannerStyle.hashCode())) * 31;
        SeaBannerBackground seaBannerBackground = this.background;
        int iHashCode7 = (iHashCode6 + (seaBannerBackground == null ? 0 : seaBannerBackground.hashCode())) * 31;
        String str2 = this.link;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.shopLink;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<Integer> list2 = this.margin;
        int iHashCode10 = (iHashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str4 = this.daInfo;
        return iHashCode10 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "SeaOfficialShopProfileVO(name=" + this.name + ", avatar=" + this.avatar + ", ratingInfo=" + this.ratingInfo + ", salesSimpleInfo=" + this.salesSimpleInfo + ", salesDetailInfos=" + this.salesDetailInfos + ", bannerStyle=" + this.bannerStyle + ", background=" + this.background + ", link=" + this.link + ", shopLink=" + this.shopLink + ", margin=" + this.margin + ", daInfo=" + this.daInfo + ')';
    }

    public SeaOfficialShopProfileVO(String str, Image image, RatingInfo ratingInfo, SaleDetailInfo saleDetailInfo, List<SaleDetailInfo> list, ShopBannerStyle shopBannerStyle, SeaBannerBackground seaBannerBackground, String str2, String str3, List<Integer> list2, String str4) {
        this.name = str;
        this.avatar = image;
        this.ratingInfo = ratingInfo;
        this.salesSimpleInfo = saleDetailInfo;
        this.salesDetailInfos = list;
        this.bannerStyle = shopBannerStyle;
        this.background = seaBannerBackground;
        this.link = str2;
        this.shopLink = str3;
        this.margin = list2;
        this.daInfo = str4;
    }
}
