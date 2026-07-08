package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop;

import X.C04DW;
import X.C09CT;
import X.C14NM;
import X.C703902ov;
import X.C786410Ut5;
import X.EnumC1752690vi7;
import X.InterfaceC1891350zJl;
import X.InterfaceC746802vq;
import X.InterfaceC997603vC;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LiveInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerDetailInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopCardBackground;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopPerformance;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopPerformanceInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.USSESSellerModuleVO;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreLabel;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.TopRatedInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class USSESSellerModuleVO implements InterfaceC997603vC, InterfaceC746802vq, C14NM, Parcelable, C04DW {

    @C09CT("about_this_shop_link")
    public final String aboutShopLink;

    @C09CT("avatar")
    public final Image avatar;

    @C09CT("brand_labels")
    public final List<StoreLabel> brandLabels;

    @C09CT("pdp_enable_shop_follow_voucher")
    public final Boolean enableFollow;

    @C09CT("enable_new_shop_entrance")
    public final Boolean enableNewShopEntrance;

    @C09CT("follow_voucher")
    public final Voucher followVoucher;

    @C09CT("im_button_text")
    public final String imButtonText;

    @C09CT("im_schema")
    public final String imSchema;

    @C09CT("is_hide")
    public final Boolean isHide;

    @C09CT("is_new_ses_experience")
    public final boolean isNewSESExperience;

    @C09CT("link")
    public final String link;

    @C09CT("live_info")
    public final LiveInfo liveInfo;

    @C09CT("rating")
    public final String rating;

    @C09CT("seller_id")
    public final String sellerId;

    @C09CT("name")
    public final String sellerName;

    @C09CT("shop_background")
    public final ShopCardBackground shopBackground;

    @C09CT("shop_card_new_style")
    public final Integer shopCardNewStyle;

    @C09CT("seller_detail_infos")
    public final List<SellerDetailInfo> shopDetailInfos;

    @C09CT("shop_identity_experiment")
    public final int shopIdentityExperiment;

    @C09CT("shop_identity_experiment_pdp_style")
    public final Integer shopIdentityExperimentPdpStyle;

    @C09CT("shop_link")
    public final String shopLink;

    @C09CT("shop_performance")
    public final ShopPerformance shopPerformance;

    @C09CT("shop_performance_info")
    public final ShopPerformanceInfo shopPerformanceInfo;

    @C09CT("shop_schema")
    public final String shopReview;

    @C09CT("store_label")
    public final StoreLabel storeLabel;

    @C09CT("top_rated_info")
    public final TopRatedInfo topRatedInfo;

    @C09CT("unread_message_count")
    public final Integer unreadMsgCount;

    @C09CT("seller_user_info")
    public final User user;
    public static final Parcelable.Creator<USSESSellerModuleVO> CREATOR = new Parcelable.Creator<USSESSellerModuleVO>() { // from class: X.02kp
        @Override // android.os.Parcelable.Creator
        public final USSESSellerModuleVO createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ShopPerformance shopPerformanceCreateFromParcel;
            boolean z;
            Boolean boolValueOf;
            ShopCardBackground shopCardBackgroundCreateFromParcel;
            ShopPerformanceInfo shopPerformanceInfoCreateFromParcel;
            ArrayList arrayList2;
            Integer numValueOf;
            boolean z2;
            Boolean boolValueOf2;
            boolean z3;
            Voucher voucherCreateFromParcel;
            LiveInfo liveInfoCreateFromParcel;
            boolean z4;
            Boolean boolValueOf3;
            Integer numValueOf2;
            Integer numValueOf3;
            String string = parcel.readString();
            Image image = (Image) parcel.readParcelable(USSESSellerModuleVO.class.getClassLoader());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(SellerDetailInfo.CREATOR.createFromParcel(parcel));
                }
            }
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                shopPerformanceCreateFromParcel = null;
            } else {
                shopPerformanceCreateFromParcel = ShopPerformance.CREATOR.createFromParcel(parcel);
            }
            ShopPerformance shopPerformance = shopPerformanceCreateFromParcel;
            String string8 = parcel.readString();
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
                shopCardBackgroundCreateFromParcel = null;
            } else {
                shopCardBackgroundCreateFromParcel = ShopCardBackground.CREATOR.createFromParcel(parcel);
            }
            ShopCardBackground shopCardBackground = shopCardBackgroundCreateFromParcel;
            StoreLabel storeLabel = (StoreLabel) parcel.readParcelable(USSESSellerModuleVO.class.getClassLoader());
            int i3 = parcel.readInt();
            if (parcel.readInt() == 0) {
                shopPerformanceInfoCreateFromParcel = null;
            } else {
                shopPerformanceInfoCreateFromParcel = ShopPerformanceInfo.CREATOR.createFromParcel(parcel);
            }
            ShopPerformanceInfo shopPerformanceInfo = shopPerformanceInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i4 = parcel.readInt();
                arrayList2 = new ArrayList(i4);
                for (int i5 = 0; i5 != i4; i5++) {
                    arrayList2.add(parcel.readParcelable(USSESSellerModuleVO.class.getClassLoader()));
                }
            }
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
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
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            String string9 = parcel.readString();
            if (parcel.readInt() == 0) {
                voucherCreateFromParcel = null;
            } else {
                voucherCreateFromParcel = Voucher.CREATOR.createFromParcel(parcel);
            }
            Voucher voucher = voucherCreateFromParcel;
            if (parcel.readInt() == 0) {
                liveInfoCreateFromParcel = null;
            } else {
                liveInfoCreateFromParcel = LiveInfo.CREATOR.createFromParcel(parcel);
            }
            LiveInfo liveInfo = liveInfoCreateFromParcel;
            User user = (User) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolValueOf3 = Boolean.valueOf(z4);
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
            return new USSESSellerModuleVO(string, image, string2, string3, string4, string5, arrayList, string6, string7, shopPerformance, string8, boolValueOf, shopCardBackground, storeLabel, i3, shopPerformanceInfo, arrayList2, numValueOf, boolValueOf2, z3, string9, voucher, liveInfo, user, boolValueOf3, numValueOf2, numValueOf3, (TopRatedInfo) parcel.readParcelable(USSESSellerModuleVO.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final USSESSellerModuleVO[] newArray(int i) {
            return new USSESSellerModuleVO[i];
        }
    };
    public static final int $stable = 8;
    public String godaGroupId = "undefined";
    public String godaNodeId = "undefined";
    public int brickName = EnumC1752690vi7.SELLER_INFO.getValue();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof USSESSellerModuleVO)) {
            return false;
        }
        USSESSellerModuleVO uSSESSellerModuleVO = (USSESSellerModuleVO) obj;
        return Intrinsics.LJFF(this.sellerId, uSSESSellerModuleVO.sellerId) && Intrinsics.LJFF(this.avatar, uSSESSellerModuleVO.avatar) && Intrinsics.LJFF(this.sellerName, uSSESSellerModuleVO.sellerName) && Intrinsics.LJFF(this.rating, uSSESSellerModuleVO.rating) && Intrinsics.LJFF(this.link, uSSESSellerModuleVO.link) && Intrinsics.LJFF(this.shopLink, uSSESSellerModuleVO.shopLink) && Intrinsics.LJFF(this.shopDetailInfos, uSSESSellerModuleVO.shopDetailInfos) && Intrinsics.LJFF(this.imButtonText, uSSESSellerModuleVO.imButtonText) && Intrinsics.LJFF(this.shopReview, uSSESSellerModuleVO.shopReview) && Intrinsics.LJFF(this.shopPerformance, uSSESSellerModuleVO.shopPerformance) && Intrinsics.LJFF(this.aboutShopLink, uSSESSellerModuleVO.aboutShopLink) && Intrinsics.LJFF(this.enableNewShopEntrance, uSSESSellerModuleVO.enableNewShopEntrance) && Intrinsics.LJFF(this.shopBackground, uSSESSellerModuleVO.shopBackground) && Intrinsics.LJFF(this.storeLabel, uSSESSellerModuleVO.storeLabel) && this.shopIdentityExperiment == uSSESSellerModuleVO.shopIdentityExperiment && Intrinsics.LJFF(this.shopPerformanceInfo, uSSESSellerModuleVO.shopPerformanceInfo) && Intrinsics.LJFF(this.brandLabels, uSSESSellerModuleVO.brandLabels) && Intrinsics.LJFF(this.unreadMsgCount, uSSESSellerModuleVO.unreadMsgCount) && Intrinsics.LJFF(this.isHide, uSSESSellerModuleVO.isHide) && this.isNewSESExperience == uSSESSellerModuleVO.isNewSESExperience && Intrinsics.LJFF(this.imSchema, uSSESSellerModuleVO.imSchema) && Intrinsics.LJFF(this.followVoucher, uSSESSellerModuleVO.followVoucher) && Intrinsics.LJFF(this.liveInfo, uSSESSellerModuleVO.liveInfo) && Intrinsics.LJFF(this.user, uSSESSellerModuleVO.user) && Intrinsics.LJFF(this.enableFollow, uSSESSellerModuleVO.enableFollow) && Intrinsics.LJFF(this.shopIdentityExperimentPdpStyle, uSSESSellerModuleVO.shopIdentityExperimentPdpStyle) && Intrinsics.LJFF(this.shopCardNewStyle, uSSESSellerModuleVO.shopCardNewStyle) && Intrinsics.LJFF(this.topRatedInfo, uSSESSellerModuleVO.topRatedInfo);
    }

    @Override // X.InterfaceC997603vC
    public final BrickStyle getBrickStyle() {
        return null;
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
        String str = this.sellerId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Image image = this.avatar;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        String str2 = this.sellerName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.rating;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.link;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.shopLink;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<SellerDetailInfo> list = this.shopDetailInfos;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str6 = this.imButtonText;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.shopReview;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        ShopPerformance shopPerformance = this.shopPerformance;
        int iHashCode10 = (iHashCode9 + (shopPerformance == null ? 0 : shopPerformance.hashCode())) * 31;
        String str8 = this.aboutShopLink;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool = this.enableNewShopEntrance;
        int iHashCode12 = (iHashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        ShopCardBackground shopCardBackground = this.shopBackground;
        int iHashCode13 = (iHashCode12 + (shopCardBackground == null ? 0 : shopCardBackground.hashCode())) * 31;
        StoreLabel storeLabel = this.storeLabel;
        int iHashCode14 = (((iHashCode13 + (storeLabel == null ? 0 : storeLabel.hashCode())) * 31) + this.shopIdentityExperiment) * 31;
        ShopPerformanceInfo shopPerformanceInfo = this.shopPerformanceInfo;
        int iHashCode15 = (iHashCode14 + (shopPerformanceInfo == null ? 0 : shopPerformanceInfo.hashCode())) * 31;
        List<StoreLabel> list2 = this.brandLabels;
        int iHashCode16 = (iHashCode15 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.unreadMsgCount;
        int iHashCode17 = (iHashCode16 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool2 = this.isHide;
        int iHashCode18 = (((iHashCode17 + (bool2 == null ? 0 : bool2.hashCode())) * 31) + C786410Ut5.Z2(this.isNewSESExperience)) * 31;
        String str9 = this.imSchema;
        int iHashCode19 = (iHashCode18 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Voucher voucher = this.followVoucher;
        int iHashCode20 = (iHashCode19 + (voucher == null ? 0 : voucher.hashCode())) * 31;
        LiveInfo liveInfo = this.liveInfo;
        int iHashCode21 = (iHashCode20 + (liveInfo == null ? 0 : liveInfo.hashCode())) * 31;
        User user = this.user;
        int iHashCode22 = (iHashCode21 + (user == null ? 0 : user.hashCode())) * 31;
        Boolean bool3 = this.enableFollow;
        int iHashCode23 = (iHashCode22 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num2 = this.shopIdentityExperimentPdpStyle;
        int iHashCode24 = (iHashCode23 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.shopCardNewStyle;
        int iHashCode25 = (iHashCode24 + (num3 == null ? 0 : num3.hashCode())) * 31;
        TopRatedInfo topRatedInfo = this.topRatedInfo;
        return iHashCode25 + (topRatedInfo != null ? topRatedInfo.hashCode() : 0);
    }

    public final String toString() {
        return "USSESSellerModuleVO(sellerId=" + this.sellerId + ", avatar=" + this.avatar + ", sellerName=" + this.sellerName + ", rating=" + this.rating + ", link=" + this.link + ", shopLink=" + this.shopLink + ", shopDetailInfos=" + this.shopDetailInfos + ", imButtonText=" + this.imButtonText + ", shopReview=" + this.shopReview + ", shopPerformance=" + this.shopPerformance + ", aboutShopLink=" + this.aboutShopLink + ", enableNewShopEntrance=" + this.enableNewShopEntrance + ", shopBackground=" + this.shopBackground + ", storeLabel=" + this.storeLabel + ", shopIdentityExperiment=" + this.shopIdentityExperiment + ", shopPerformanceInfo=" + this.shopPerformanceInfo + ", brandLabels=" + this.brandLabels + ", unreadMsgCount=" + this.unreadMsgCount + ", isHide=" + this.isHide + ", isNewSESExperience=" + this.isNewSESExperience + ", imSchema=" + this.imSchema + ", followVoucher=" + this.followVoucher + ", liveInfo=" + this.liveInfo + ", user=" + this.user + ", enableFollow=" + this.enableFollow + ", shopIdentityExperimentPdpStyle=" + this.shopIdentityExperimentPdpStyle + ", shopCardNewStyle=" + this.shopCardNewStyle + ", topRatedInfo=" + this.topRatedInfo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.sellerId);
        parcel.writeParcelable(this.avatar, i);
        parcel.writeString(this.sellerName);
        parcel.writeString(this.rating);
        parcel.writeString(this.link);
        parcel.writeString(this.shopLink);
        List<SellerDetailInfo> list = this.shopDetailInfos;
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
        parcel.writeString(this.imButtonText);
        parcel.writeString(this.shopReview);
        ShopPerformance shopPerformance = this.shopPerformance;
        if (shopPerformance == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shopPerformance.writeToParcel(parcel, i);
        }
        parcel.writeString(this.aboutShopLink);
        Boolean bool = this.enableNewShopEntrance;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        ShopCardBackground shopCardBackground = this.shopBackground;
        if (shopCardBackground == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shopCardBackground.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.storeLabel, i);
        parcel.writeInt(this.shopIdentityExperiment);
        ShopPerformanceInfo shopPerformanceInfo = this.shopPerformanceInfo;
        if (shopPerformanceInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shopPerformanceInfo.writeToParcel(parcel, i);
        }
        List<StoreLabel> list2 = this.brandLabels;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<StoreLabel> it3 = list2.iterator();
            while (it3.hasNext()) {
                parcel.writeParcelable(it3.next(), i);
            }
        }
        Integer num = this.unreadMsgCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Boolean bool2 = this.isHide;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.isNewSESExperience ? 1 : 0);
        parcel.writeString(this.imSchema);
        Voucher voucher = this.followVoucher;
        if (voucher == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            voucher.writeToParcel(parcel, i);
        }
        LiveInfo liveInfo = this.liveInfo;
        if (liveInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            liveInfo.writeToParcel(parcel, i);
        }
        parcel.writeSerializable(this.user);
        Boolean bool3 = this.enableFollow;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Integer num2 = this.shopIdentityExperimentPdpStyle;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.shopCardNewStyle;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeParcelable(this.topRatedInfo, i);
    }

    @Override // X.C14NM
    public final int getContentType() {
        Integer num = this.shopCardNewStyle;
        if (num != null && num.intValue() == 1) {
            return 55003;
        }
        Integer num2 = this.shopCardNewStyle;
        if (num2 != null && num2.intValue() == 3) {
            return 55003;
        }
        Integer num3 = this.shopCardNewStyle;
        if (num3 != null && num3.intValue() == 4) {
            return 55003;
        }
        if (this.shopIdentityExperiment == 0) {
            return 55001;
        }
        Integer num4 = this.shopIdentityExperimentPdpStyle;
        return (num4 == null || num4.intValue() != 1) ? 55002 : 55001;
    }

    @Override // X.InterfaceC997603vC
    public final int getBrickName() {
        return this.brickName;
    }

    @Override // X.C04DW
    public final String getGodaNodeId() {
        return this.godaNodeId;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C703902ov.LIZ(this, interfaceC1891350zJl);
    }

    @Override // X.C04DW
    public final void setGodaGroupId(String str) {
        this.godaGroupId = str;
    }

    @Override // X.C04DW
    public final void setGodaNodeId(String str) {
        this.godaNodeId = str;
    }

    public USSESSellerModuleVO(String str, Image image, String str2, String str3, String str4, String str5, List<SellerDetailInfo> list, String str6, String str7, ShopPerformance shopPerformance, String str8, Boolean bool, ShopCardBackground shopCardBackground, StoreLabel storeLabel, int i, ShopPerformanceInfo shopPerformanceInfo, List<StoreLabel> list2, Integer num, Boolean bool2, boolean z, String str9, Voucher voucher, LiveInfo liveInfo, User user, Boolean bool3, Integer num2, Integer num3, TopRatedInfo topRatedInfo) {
        this.sellerId = str;
        this.avatar = image;
        this.sellerName = str2;
        this.rating = str3;
        this.link = str4;
        this.shopLink = str5;
        this.shopDetailInfos = list;
        this.imButtonText = str6;
        this.shopReview = str7;
        this.shopPerformance = shopPerformance;
        this.aboutShopLink = str8;
        this.enableNewShopEntrance = bool;
        this.shopBackground = shopCardBackground;
        this.storeLabel = storeLabel;
        this.shopIdentityExperiment = i;
        this.shopPerformanceInfo = shopPerformanceInfo;
        this.brandLabels = list2;
        this.unreadMsgCount = num;
        this.isHide = bool2;
        this.isNewSESExperience = z;
        this.imSchema = str9;
        this.followVoucher = voucher;
        this.liveInfo = liveInfo;
        this.user = user;
        this.enableFollow = bool3;
        this.shopIdentityExperimentPdpStyle = num2;
        this.shopCardNewStyle = num3;
        this.topRatedInfo = topRatedInfo;
    }
}
