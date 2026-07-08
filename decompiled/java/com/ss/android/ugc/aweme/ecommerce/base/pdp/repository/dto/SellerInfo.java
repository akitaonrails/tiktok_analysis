package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C704002ow;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LiveInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PhoneContact;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUpMessage;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerDetailInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerSellingPoint;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopBenefitInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopCardBackground;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopPerformance;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopPerformanceInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopRecommend;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreLabel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SellerInfo implements Parcelable {

    @C09CT("about_this_shop_link")
    public String aboutShopLink;

    @C09CT("about_this_shop_rich_text")
    public ECRichText aboutShopRichText;

    @C09CT("avatar")
    public Image avatar;

    @C09CT("shop_benefit")
    public ShopBenefitInfo benefitInfo;

    @C09CT("pdp_enable_shop_follow_voucher")
    public Boolean enableFollow;

    @C09CT("enable_nav_bar_shop_avatar")
    public boolean enableNavBarShopAvatar;

    @C09CT("enable_new_shop_entrance")
    public Boolean enableNewShopEntrance;

    @C09CT("enable_shop_follow")
    public boolean enableShopFollow;

    @C09CT("follow_voucher")
    public Voucher followVoucher;

    @C09CT("half_pdp_shop_entrance_experiment")
    public Integer halfPdpShopEntranceExperiment;

    @C09CT("half_pdp_store_identity_text")
    public ECRichText halfPdpStoreIdentityText;

    @C09CT("im_button_text")
    public String imButtonText;

    @C09CT("im_schema")
    public String imSchema;

    @C09CT("im_type")
    public Integer imType;

    @C09CT("is_hide")
    public Boolean isHide;

    @C09CT("is_new_ses_experience")
    public Boolean isSESExperience;

    @C09CT("link")
    public String link;

    @C09CT("live_info")
    public LiveInfo liveInfo;

    @C09CT("name")
    public String name;

    @C09CT("phone_contact")
    public PhoneContact phoneContact;

    @C09CT("platform_seller_id")
    public String platformSellerId;

    @C09CT("product_count")
    public Long productCount;

    @C09CT("rating")
    public String rating;

    @C09CT("exp_rate_percentile")
    public Integer ratingPercentile;

    @C09CT("show_rate_not_applicable")
    public Boolean ratingShowNA;

    @C09CT("rate_display_style")
    public Integer ratingStyle;

    @C09CT("sales_info")
    public SellerDetailInfo salesInfo;

    @C09CT("seller_detail_infos")
    public List<SellerDetailInfo> sellerDetailInfos;

    @C09CT("seller_id")
    public String sellerId;

    @C09CT("seller_selling_point")
    public SellerSellingPoint sellerSellingPoint;

    @C09CT("shop_background")
    public ShopCardBackground shopBackground;

    @C09CT("shop_identity_experiment")
    public Integer shopIdentityExperiment;

    @C09CT("shop_link")
    public String shopLink;

    @C09CT("shop_performance")
    public ShopPerformance shopPerformance;

    @C09CT("shop_performance_info")
    public ShopPerformanceInfo shopPerformanceInfo;

    @C09CT("shop_recommend")
    public ShopRecommend shopRecommend;

    @C09CT("slogan_text")
    public String sloganText;

    @C09CT("sold_item_description")
    public PopUpMessage soldItemDescription;

    @C09CT("store_label")
    public StoreLabel storeLabel;

    @C09CT("unread_message_count")
    public Integer unreadMsgCount;

    @C09CT("seller_user_info")
    public User user;

    @C09CT("visit_shop_text")
    public ECRichText visitShopExpText;
    public static final C704002ow Companion = new Object() { // from class: X.02ow
    };
    public static final Parcelable.Creator<SellerInfo> CREATOR = new Parcelable.Creator<SellerInfo>() { // from class: X.02ko
        @Override // android.os.Parcelable.Creator
        public final SellerInfo createFromParcel(Parcel parcel) {
            Long lValueOf;
            PhoneContact phoneContactCreateFromParcel;
            ShopRecommend shopRecommendCreateFromParcel;
            boolean z;
            Boolean boolValueOf;
            ArrayList arrayList;
            Integer numValueOf;
            Integer numValueOf2;
            Integer numValueOf3;
            boolean z2;
            Boolean boolValueOf2;
            SellerSellingPoint sellerSellingPointCreateFromParcel;
            Integer numValueOf4;
            ShopPerformance shopPerformanceCreateFromParcel;
            boolean z3;
            Boolean boolValueOf3;
            boolean z4;
            Boolean boolValueOf4;
            ShopCardBackground shopCardBackgroundCreateFromParcel;
            PopUpMessage popUpMessageCreateFromParcel;
            Integer numValueOf5;
            ShopPerformanceInfo shopPerformanceInfoCreateFromParcel;
            SellerDetailInfo sellerDetailInfoCreateFromParcel;
            ShopBenefitInfo shopBenefitInfoCreateFromParcel;
            Integer numValueOf6;
            boolean z5;
            Voucher voucherCreateFromParcel;
            boolean z6;
            Boolean boolValueOf5;
            boolean z7;
            LiveInfo liveInfoCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            Image image = (Image) parcel.readParcelable(SellerInfo.class.getClassLoader());
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                phoneContactCreateFromParcel = null;
            } else {
                phoneContactCreateFromParcel = PhoneContact.CREATOR.createFromParcel(parcel);
            }
            PhoneContact phoneContact = phoneContactCreateFromParcel;
            String string6 = parcel.readString();
            StoreLabel storeLabel = (StoreLabel) parcel.readParcelable(SellerInfo.class.getClassLoader());
            if (parcel.readInt() == 0) {
                shopRecommendCreateFromParcel = null;
            } else {
                shopRecommendCreateFromParcel = ShopRecommend.CREATOR.createFromParcel(parcel);
            }
            ShopRecommend shopRecommend = shopRecommendCreateFromParcel;
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
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(SellerDetailInfo.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf3 = null;
            } else {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
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
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                sellerSellingPointCreateFromParcel = null;
            } else {
                sellerSellingPointCreateFromParcel = SellerSellingPoint.CREATOR.createFromParcel(parcel);
            }
            SellerSellingPoint sellerSellingPoint = sellerSellingPointCreateFromParcel;
            String string8 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf4 = null;
            } else {
                numValueOf4 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                shopPerformanceCreateFromParcel = null;
            } else {
                shopPerformanceCreateFromParcel = ShopPerformance.CREATOR.createFromParcel(parcel);
            }
            ShopPerformance shopPerformance = shopPerformanceCreateFromParcel;
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
            String string9 = parcel.readString();
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(SellerInfo.class.getClassLoader());
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
            if (parcel.readInt() == 0) {
                shopCardBackgroundCreateFromParcel = null;
            } else {
                shopCardBackgroundCreateFromParcel = ShopCardBackground.CREATOR.createFromParcel(parcel);
            }
            ShopCardBackground shopCardBackground = shopCardBackgroundCreateFromParcel;
            ECRichText eCRichText2 = (ECRichText) parcel.readParcelable(SellerInfo.class.getClassLoader());
            String string10 = parcel.readString();
            if (parcel.readInt() == 0) {
                popUpMessageCreateFromParcel = null;
            } else {
                popUpMessageCreateFromParcel = PopUpMessage.CREATOR.createFromParcel(parcel);
            }
            PopUpMessage popUpMessage = popUpMessageCreateFromParcel;
            if (parcel.readInt() == 0) {
                numValueOf5 = null;
            } else {
                numValueOf5 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                shopPerformanceInfoCreateFromParcel = null;
            } else {
                shopPerformanceInfoCreateFromParcel = ShopPerformanceInfo.CREATOR.createFromParcel(parcel);
            }
            ShopPerformanceInfo shopPerformanceInfo = shopPerformanceInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                sellerDetailInfoCreateFromParcel = null;
            } else {
                sellerDetailInfoCreateFromParcel = SellerDetailInfo.CREATOR.createFromParcel(parcel);
            }
            SellerDetailInfo sellerDetailInfo = sellerDetailInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                shopBenefitInfoCreateFromParcel = null;
            } else {
                shopBenefitInfoCreateFromParcel = ShopBenefitInfo.CREATOR.createFromParcel(parcel);
            }
            ShopBenefitInfo shopBenefitInfo = shopBenefitInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                numValueOf6 = null;
            } else {
                numValueOf6 = Integer.valueOf(parcel.readInt());
            }
            ECRichText eCRichText3 = (ECRichText) parcel.readParcelable(SellerInfo.class.getClassLoader());
            User user = (User) parcel.readSerializable();
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (parcel.readInt() == 0) {
                voucherCreateFromParcel = null;
            } else {
                voucherCreateFromParcel = Voucher.CREATOR.createFromParcel(parcel);
            }
            Voucher voucher = voucherCreateFromParcel;
            if (parcel.readInt() == 0) {
                boolValueOf5 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolValueOf5 = Boolean.valueOf(z6);
            }
            if (parcel.readInt() != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (parcel.readInt() == 0) {
                liveInfoCreateFromParcel = null;
            } else {
                liveInfoCreateFromParcel = LiveInfo.CREATOR.createFromParcel(parcel);
            }
            return new SellerInfo(string, string2, image, lValueOf, string3, string4, string5, phoneContact, string6, storeLabel, shopRecommend, boolValueOf, arrayList, numValueOf, numValueOf2, numValueOf3, boolValueOf2, string7, sellerSellingPoint, string8, numValueOf4, shopPerformance, boolValueOf3, string9, eCRichText, boolValueOf4, shopCardBackground, eCRichText2, string10, popUpMessage, numValueOf5, shopPerformanceInfo, sellerDetailInfo, shopBenefitInfo, numValueOf6, eCRichText3, user, z5, voucher, boolValueOf5, z7, liveInfoCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SellerInfo[] newArray(int i) {
            return new SellerInfo[i];
        }
    };
    public static final int $stable = 8;

    public SellerInfo() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SellerInfo)) {
            return false;
        }
        SellerInfo sellerInfo = (SellerInfo) obj;
        return Intrinsics.LJFF(this.sellerId, sellerInfo.sellerId) && Intrinsics.LJFF(this.name, sellerInfo.name) && Intrinsics.LJFF(this.avatar, sellerInfo.avatar) && Intrinsics.LJFF(this.productCount, sellerInfo.productCount) && Intrinsics.LJFF(this.rating, sellerInfo.rating) && Intrinsics.LJFF(this.link, sellerInfo.link) && Intrinsics.LJFF(this.imSchema, sellerInfo.imSchema) && Intrinsics.LJFF(this.phoneContact, sellerInfo.phoneContact) && Intrinsics.LJFF(this.shopLink, sellerInfo.shopLink) && Intrinsics.LJFF(this.storeLabel, sellerInfo.storeLabel) && Intrinsics.LJFF(this.shopRecommend, sellerInfo.shopRecommend) && Intrinsics.LJFF(this.isHide, sellerInfo.isHide) && Intrinsics.LJFF(this.sellerDetailInfos, sellerInfo.sellerDetailInfos) && Intrinsics.LJFF(this.ratingPercentile, sellerInfo.ratingPercentile) && Intrinsics.LJFF(this.ratingStyle, sellerInfo.ratingStyle) && Intrinsics.LJFF(this.unreadMsgCount, sellerInfo.unreadMsgCount) && Intrinsics.LJFF(this.ratingShowNA, sellerInfo.ratingShowNA) && Intrinsics.LJFF(this.sloganText, sellerInfo.sloganText) && Intrinsics.LJFF(this.sellerSellingPoint, sellerInfo.sellerSellingPoint) && Intrinsics.LJFF(this.imButtonText, sellerInfo.imButtonText) && Intrinsics.LJFF(this.imType, sellerInfo.imType) && Intrinsics.LJFF(this.shopPerformance, sellerInfo.shopPerformance) && Intrinsics.LJFF(this.isSESExperience, sellerInfo.isSESExperience) && Intrinsics.LJFF(this.aboutShopLink, sellerInfo.aboutShopLink) && Intrinsics.LJFF(this.aboutShopRichText, sellerInfo.aboutShopRichText) && Intrinsics.LJFF(this.enableNewShopEntrance, sellerInfo.enableNewShopEntrance) && Intrinsics.LJFF(this.shopBackground, sellerInfo.shopBackground) && Intrinsics.LJFF(this.visitShopExpText, sellerInfo.visitShopExpText) && Intrinsics.LJFF(this.platformSellerId, sellerInfo.platformSellerId) && Intrinsics.LJFF(this.soldItemDescription, sellerInfo.soldItemDescription) && Intrinsics.LJFF(this.shopIdentityExperiment, sellerInfo.shopIdentityExperiment) && Intrinsics.LJFF(this.shopPerformanceInfo, sellerInfo.shopPerformanceInfo) && Intrinsics.LJFF(this.salesInfo, sellerInfo.salesInfo) && Intrinsics.LJFF(this.benefitInfo, sellerInfo.benefitInfo) && Intrinsics.LJFF(this.halfPdpShopEntranceExperiment, sellerInfo.halfPdpShopEntranceExperiment) && Intrinsics.LJFF(this.halfPdpStoreIdentityText, sellerInfo.halfPdpStoreIdentityText) && Intrinsics.LJFF(this.user, sellerInfo.user) && this.enableNavBarShopAvatar == sellerInfo.enableNavBarShopAvatar && Intrinsics.LJFF(this.followVoucher, sellerInfo.followVoucher) && Intrinsics.LJFF(this.enableFollow, sellerInfo.enableFollow) && this.enableShopFollow == sellerInfo.enableShopFollow && Intrinsics.LJFF(this.liveInfo, sellerInfo.liveInfo);
    }

    public final int hashCode() {
        String str = this.sellerId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Image image = this.avatar;
        int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        Long l = this.productCount;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.rating;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.link;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.imSchema;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        PhoneContact phoneContact = this.phoneContact;
        int iHashCode8 = (iHashCode7 + (phoneContact == null ? 0 : phoneContact.hashCode())) * 31;
        String str6 = this.shopLink;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        StoreLabel storeLabel = this.storeLabel;
        int iHashCode10 = (iHashCode9 + (storeLabel == null ? 0 : storeLabel.hashCode())) * 31;
        ShopRecommend shopRecommend = this.shopRecommend;
        int iHashCode11 = (iHashCode10 + (shopRecommend == null ? 0 : shopRecommend.hashCode())) * 31;
        Boolean bool = this.isHide;
        int iHashCode12 = (iHashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<SellerDetailInfo> list = this.sellerDetailInfos;
        int iHashCode13 = (iHashCode12 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.ratingPercentile;
        int iHashCode14 = (iHashCode13 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.ratingStyle;
        int iHashCode15 = (iHashCode14 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.unreadMsgCount;
        int iHashCode16 = (iHashCode15 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool2 = this.ratingShowNA;
        int iHashCode17 = (iHashCode16 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str7 = this.sloganText;
        int iHashCode18 = (iHashCode17 + (str7 == null ? 0 : str7.hashCode())) * 31;
        SellerSellingPoint sellerSellingPoint = this.sellerSellingPoint;
        int iHashCode19 = (iHashCode18 + (sellerSellingPoint == null ? 0 : sellerSellingPoint.hashCode())) * 31;
        String str8 = this.imButtonText;
        int iHashCode20 = (iHashCode19 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num4 = this.imType;
        int iHashCode21 = (iHashCode20 + (num4 == null ? 0 : num4.hashCode())) * 31;
        ShopPerformance shopPerformance = this.shopPerformance;
        int iHashCode22 = (iHashCode21 + (shopPerformance == null ? 0 : shopPerformance.hashCode())) * 31;
        Boolean bool3 = this.isSESExperience;
        int iHashCode23 = (iHashCode22 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str9 = this.aboutShopLink;
        int iHashCode24 = (iHashCode23 + (str9 == null ? 0 : str9.hashCode())) * 31;
        ECRichText eCRichText = this.aboutShopRichText;
        int iHashCode25 = (iHashCode24 + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        Boolean bool4 = this.enableNewShopEntrance;
        int iHashCode26 = (iHashCode25 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        ShopCardBackground shopCardBackground = this.shopBackground;
        int iHashCode27 = (iHashCode26 + (shopCardBackground == null ? 0 : shopCardBackground.hashCode())) * 31;
        ECRichText eCRichText2 = this.visitShopExpText;
        int iHashCode28 = (iHashCode27 + (eCRichText2 == null ? 0 : eCRichText2.hashCode())) * 31;
        String str10 = this.platformSellerId;
        int iHashCode29 = (iHashCode28 + (str10 == null ? 0 : str10.hashCode())) * 31;
        PopUpMessage popUpMessage = this.soldItemDescription;
        int iHashCode30 = (iHashCode29 + (popUpMessage == null ? 0 : popUpMessage.hashCode())) * 31;
        Integer num5 = this.shopIdentityExperiment;
        int iHashCode31 = (iHashCode30 + (num5 == null ? 0 : num5.hashCode())) * 31;
        ShopPerformanceInfo shopPerformanceInfo = this.shopPerformanceInfo;
        int iHashCode32 = (iHashCode31 + (shopPerformanceInfo == null ? 0 : shopPerformanceInfo.hashCode())) * 31;
        SellerDetailInfo sellerDetailInfo = this.salesInfo;
        int iHashCode33 = (iHashCode32 + (sellerDetailInfo == null ? 0 : sellerDetailInfo.hashCode())) * 31;
        ShopBenefitInfo shopBenefitInfo = this.benefitInfo;
        int iHashCode34 = (iHashCode33 + (shopBenefitInfo == null ? 0 : shopBenefitInfo.hashCode())) * 31;
        Integer num6 = this.halfPdpShopEntranceExperiment;
        int iHashCode35 = (iHashCode34 + (num6 == null ? 0 : num6.hashCode())) * 31;
        ECRichText eCRichText3 = this.halfPdpStoreIdentityText;
        int iHashCode36 = (iHashCode35 + (eCRichText3 == null ? 0 : eCRichText3.hashCode())) * 31;
        User user = this.user;
        int iHashCode37 = (((iHashCode36 + (user == null ? 0 : user.hashCode())) * 31) + C786410Ut5.Z2(this.enableNavBarShopAvatar)) * 31;
        Voucher voucher = this.followVoucher;
        int iHashCode38 = (iHashCode37 + (voucher == null ? 0 : voucher.hashCode())) * 31;
        Boolean bool5 = this.enableFollow;
        int iHashCode39 = (((iHashCode38 + (bool5 == null ? 0 : bool5.hashCode())) * 31) + C786410Ut5.Z2(this.enableShopFollow)) * 31;
        LiveInfo liveInfo = this.liveInfo;
        return iHashCode39 + (liveInfo != null ? liveInfo.hashCode() : 0);
    }

    public final String toString() {
        return "SellerInfo(sellerId=" + this.sellerId + ", name=" + this.name + ", avatar=" + this.avatar + ", productCount=" + this.productCount + ", rating=" + this.rating + ", link=" + this.link + ", imSchema=" + this.imSchema + ", phoneContact=" + this.phoneContact + ", shopLink=" + this.shopLink + ", storeLabel=" + this.storeLabel + ", shopRecommend=" + this.shopRecommend + ", isHide=" + this.isHide + ", sellerDetailInfos=" + this.sellerDetailInfos + ", ratingPercentile=" + this.ratingPercentile + ", ratingStyle=" + this.ratingStyle + ", unreadMsgCount=" + this.unreadMsgCount + ", ratingShowNA=" + this.ratingShowNA + ", sloganText=" + this.sloganText + ", sellerSellingPoint=" + this.sellerSellingPoint + ", imButtonText=" + this.imButtonText + ", imType=" + this.imType + ", shopPerformance=" + this.shopPerformance + ", isSESExperience=" + this.isSESExperience + ", aboutShopLink=" + this.aboutShopLink + ", aboutShopRichText=" + this.aboutShopRichText + ", enableNewShopEntrance=" + this.enableNewShopEntrance + ", shopBackground=" + this.shopBackground + ", visitShopExpText=" + this.visitShopExpText + ", platformSellerId=" + this.platformSellerId + ", soldItemDescription=" + this.soldItemDescription + ", shopIdentityExperiment=" + this.shopIdentityExperiment + ", shopPerformanceInfo=" + this.shopPerformanceInfo + ", salesInfo=" + this.salesInfo + ", benefitInfo=" + this.benefitInfo + ", halfPdpShopEntranceExperiment=" + this.halfPdpShopEntranceExperiment + ", halfPdpStoreIdentityText=" + this.halfPdpStoreIdentityText + ", user=" + this.user + ", enableNavBarShopAvatar=" + this.enableNavBarShopAvatar + ", followVoucher=" + this.followVoucher + ", enableFollow=" + this.enableFollow + ", enableShopFollow=" + this.enableShopFollow + ", liveInfo=" + this.liveInfo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.sellerId);
        parcel.writeString(this.name);
        parcel.writeParcelable(this.avatar, i);
        Long l = this.productCount;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.rating);
        parcel.writeString(this.link);
        parcel.writeString(this.imSchema);
        PhoneContact phoneContact = this.phoneContact;
        if (phoneContact == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            phoneContact.writeToParcel(parcel, i);
        }
        parcel.writeString(this.shopLink);
        parcel.writeParcelable(this.storeLabel, i);
        ShopRecommend shopRecommend = this.shopRecommend;
        if (shopRecommend == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shopRecommend.writeToParcel(parcel, i);
        }
        Boolean bool = this.isHide;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        List<SellerDetailInfo> list = this.sellerDetailInfos;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<SellerDetailInfo> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        Integer num = this.ratingPercentile;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.ratingStyle;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.unreadMsgCount;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Boolean bool2 = this.ratingShowNA;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.sloganText);
        SellerSellingPoint sellerSellingPoint = this.sellerSellingPoint;
        if (sellerSellingPoint == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sellerSellingPoint.writeToParcel(parcel, i);
        }
        parcel.writeString(this.imButtonText);
        Integer num4 = this.imType;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        ShopPerformance shopPerformance = this.shopPerformance;
        if (shopPerformance == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shopPerformance.writeToParcel(parcel, i);
        }
        Boolean bool3 = this.isSESExperience;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.aboutShopLink);
        parcel.writeParcelable(this.aboutShopRichText, i);
        Boolean bool4 = this.enableNewShopEntrance;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        ShopCardBackground shopCardBackground = this.shopBackground;
        if (shopCardBackground == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shopCardBackground.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.visitShopExpText, i);
        parcel.writeString(this.platformSellerId);
        PopUpMessage popUpMessage = this.soldItemDescription;
        if (popUpMessage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            popUpMessage.writeToParcel(parcel, i);
        }
        Integer num5 = this.shopIdentityExperiment;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
        ShopPerformanceInfo shopPerformanceInfo = this.shopPerformanceInfo;
        if (shopPerformanceInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shopPerformanceInfo.writeToParcel(parcel, i);
        }
        SellerDetailInfo sellerDetailInfo = this.salesInfo;
        if (sellerDetailInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sellerDetailInfo.writeToParcel(parcel, i);
        }
        ShopBenefitInfo shopBenefitInfo = this.benefitInfo;
        if (shopBenefitInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shopBenefitInfo.writeToParcel(parcel, i);
        }
        Integer num6 = this.halfPdpShopEntranceExperiment;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num6.intValue());
        }
        parcel.writeParcelable(this.halfPdpStoreIdentityText, i);
        parcel.writeSerializable(this.user);
        parcel.writeInt(this.enableNavBarShopAvatar ? 1 : 0);
        Voucher voucher = this.followVoucher;
        if (voucher == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            voucher.writeToParcel(parcel, i);
        }
        Boolean bool5 = this.enableFollow;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.enableShopFollow ? 1 : 0);
        LiveInfo liveInfo = this.liveInfo;
        if (liveInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            liveInfo.writeToParcel(parcel, i);
        }
    }

    public static SellerInfo LIZ(SellerInfo sellerInfo, Integer num) {
        return new SellerInfo(sellerInfo.sellerId, sellerInfo.name, sellerInfo.avatar, sellerInfo.productCount, sellerInfo.rating, sellerInfo.link, sellerInfo.imSchema, sellerInfo.phoneContact, sellerInfo.shopLink, sellerInfo.storeLabel, sellerInfo.shopRecommend, sellerInfo.isHide, sellerInfo.sellerDetailInfos, sellerInfo.ratingPercentile, sellerInfo.ratingStyle, num, sellerInfo.ratingShowNA, sellerInfo.sloganText, sellerInfo.sellerSellingPoint, sellerInfo.imButtonText, sellerInfo.imType, sellerInfo.shopPerformance, sellerInfo.isSESExperience, sellerInfo.aboutShopLink, sellerInfo.aboutShopRichText, sellerInfo.enableNewShopEntrance, sellerInfo.shopBackground, sellerInfo.visitShopExpText, sellerInfo.platformSellerId, sellerInfo.soldItemDescription, sellerInfo.shopIdentityExperiment, sellerInfo.shopPerformanceInfo, sellerInfo.salesInfo, sellerInfo.benefitInfo, sellerInfo.halfPdpShopEntranceExperiment, sellerInfo.halfPdpStoreIdentityText, sellerInfo.user, sellerInfo.enableNavBarShopAvatar, sellerInfo.followVoucher, sellerInfo.enableFollow, sellerInfo.enableShopFollow, sellerInfo.liveInfo);
    }

    public SellerInfo(String str, String str2, Image image, Long l, String str3, String str4, String str5, PhoneContact phoneContact, String str6, StoreLabel storeLabel, ShopRecommend shopRecommend, Boolean bool, List<SellerDetailInfo> list, Integer num, Integer num2, Integer num3, Boolean bool2, String str7, SellerSellingPoint sellerSellingPoint, String str8, Integer num4, ShopPerformance shopPerformance, Boolean bool3, String str9, ECRichText eCRichText, Boolean bool4, ShopCardBackground shopCardBackground, ECRichText eCRichText2, String str10, PopUpMessage popUpMessage, Integer num5, ShopPerformanceInfo shopPerformanceInfo, SellerDetailInfo sellerDetailInfo, ShopBenefitInfo shopBenefitInfo, Integer num6, ECRichText eCRichText3, User user, boolean z, Voucher voucher, Boolean bool5, boolean z2, LiveInfo liveInfo) {
        this.sellerId = str;
        this.name = str2;
        this.avatar = image;
        this.productCount = l;
        this.rating = str3;
        this.link = str4;
        this.imSchema = str5;
        this.phoneContact = phoneContact;
        this.shopLink = str6;
        this.storeLabel = storeLabel;
        this.shopRecommend = shopRecommend;
        this.isHide = bool;
        this.sellerDetailInfos = list;
        this.ratingPercentile = num;
        this.ratingStyle = num2;
        this.unreadMsgCount = num3;
        this.ratingShowNA = bool2;
        this.sloganText = str7;
        this.sellerSellingPoint = sellerSellingPoint;
        this.imButtonText = str8;
        this.imType = num4;
        this.shopPerformance = shopPerformance;
        this.isSESExperience = bool3;
        this.aboutShopLink = str9;
        this.aboutShopRichText = eCRichText;
        this.enableNewShopEntrance = bool4;
        this.shopBackground = shopCardBackground;
        this.visitShopExpText = eCRichText2;
        this.platformSellerId = str10;
        this.soldItemDescription = popUpMessage;
        this.shopIdentityExperiment = num5;
        this.shopPerformanceInfo = shopPerformanceInfo;
        this.salesInfo = sellerDetailInfo;
        this.benefitInfo = shopBenefitInfo;
        this.halfPdpShopEntranceExperiment = num6;
        this.halfPdpStoreIdentityText = eCRichText3;
        this.user = user;
        this.enableNavBarShopAvatar = z;
        this.followVoucher = voucher;
        this.enableFollow = bool5;
        this.enableShopFollow = z2;
        this.liveInfo = liveInfo;
    }
}
