package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.OrderSKUDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dto.InsuranceInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BcmStandardTrack;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MemberShipInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuCardStyleInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.UserVirtualInfo;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.PlatformLinkInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class OrderSKUDTO implements Parcelable {

    @C09CT("aggregation_count")
    public Integer aggregationCount;

    @C09CT("aggregation_key")
    public String aggregationKey;

    @C09CT("bcm_standard_track")
    public BcmStandardTrack bcmStandardTrack;

    @C09CT("biz_type")
    public Integer bizType;

    @C09CT("bundle_id")
    public String bundleId;

    @C09CT("cart_item_id")
    public String cartItemId;

    @C09CT("chain_key")
    public String chainKey;

    @C09CT("channel_reserve_key")
    public String channelReserveKey;

    @C09CT("currency")
    public String currency;

    @C09CT("entrance_info")
    public String entranceInfo;

    @C09CT("kol_id")
    public String kolId;

    @C09CT("logistics_service_id")
    public String logisticsServiceId;

    @C09CT("membership_info")
    public MemberShipInfo membershipInfo;

    @C09CT("platform_link_based_item")
    public PlatformLinkInfo platformLinkInfo;

    @C09CT("price_val")
    public String priceVal;

    @C09CT("product_id")
    public String productId;

    @C09CT("product_sale_modes")
    public List<Integer> productSaleModes;

    @C09CT("quantity")
    public Integer quantity;

    @C09CT("selected_insurance_info")
    public InsuranceInfo selectedInsuranceInfo;

    @C09CT("selected_props")
    public List<String> selectedProps;

    @C09CT("sku_card_style")
    public SkuCardStyleInfo skuCardStyleInfo;

    @C09CT("sku_id")
    public String skuId;

    @C09CT("sns_info")
    public SnsInfo snsInfo;

    @C09CT("source")
    public Integer source;

    @C09CT("source_info")
    public String sourceInfo;

    @C09CT("user_virtual_info")
    public UserVirtualInfo userVirtualInfo;

    @C09CT("warehouse_id")
    public String warehouseId;
    public static final Parcelable.Creator<OrderSKUDTO> CREATOR = new Parcelable.Creator<OrderSKUDTO>() { // from class: X.02ny
        @Override // android.os.Parcelable.Creator
        public final OrderSKUDTO createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            Integer numValueOf3;
            SkuCardStyleInfo skuCardStyleInfoCreateFromParcel;
            Integer numValueOf4;
            SnsInfo snsInfoCreateFromParcel;
            BcmStandardTrack bcmStandardTrackCreateFromParcel;
            ArrayList arrayList;
            UserVirtualInfo userVirtualInfoCreateFromParcel;
            MemberShipInfo memberShipInfoCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf3 = null;
            } else {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                skuCardStyleInfoCreateFromParcel = null;
            } else {
                skuCardStyleInfoCreateFromParcel = SkuCardStyleInfo.CREATOR.createFromParcel(parcel);
            }
            SkuCardStyleInfo skuCardStyleInfo = skuCardStyleInfoCreateFromParcel;
            String string14 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf4 = null;
            } else {
                numValueOf4 = Integer.valueOf(parcel.readInt());
            }
            PlatformLinkInfo platformLinkInfo = (PlatformLinkInfo) parcel.readParcelable(OrderSKUDTO.class.getClassLoader());
            if (parcel.readInt() == 0) {
                snsInfoCreateFromParcel = null;
            } else {
                snsInfoCreateFromParcel = SnsInfo.CREATOR.createFromParcel(parcel);
            }
            SnsInfo snsInfo = snsInfoCreateFromParcel;
            InsuranceInfo insuranceInfo = (InsuranceInfo) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                bcmStandardTrackCreateFromParcel = null;
            } else {
                bcmStandardTrackCreateFromParcel = BcmStandardTrack.CREATOR.createFromParcel(parcel);
            }
            BcmStandardTrack bcmStandardTrack = bcmStandardTrackCreateFromParcel;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Integer.valueOf(parcel.readInt()));
                }
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                userVirtualInfoCreateFromParcel = null;
            } else {
                userVirtualInfoCreateFromParcel = UserVirtualInfo.CREATOR.createFromParcel(parcel);
            }
            UserVirtualInfo userVirtualInfo = userVirtualInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                memberShipInfoCreateFromParcel = null;
            } else {
                memberShipInfoCreateFromParcel = MemberShipInfo.CREATOR.createFromParcel(parcel);
            }
            return new OrderSKUDTO(string, string2, numValueOf, string3, numValueOf2, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, numValueOf3, skuCardStyleInfo, string14, numValueOf4, platformLinkInfo, snsInfo, insuranceInfo, bcmStandardTrack, arrayList, arrayListCreateStringArrayList, userVirtualInfo, memberShipInfoCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final OrderSKUDTO[] newArray(int i) {
            return new OrderSKUDTO[i];
        }
    };
    public static final int $stable = 8;

    public OrderSKUDTO() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderSKUDTO)) {
            return false;
        }
        OrderSKUDTO orderSKUDTO = (OrderSKUDTO) obj;
        return Intrinsics.LJFF(this.productId, orderSKUDTO.productId) && Intrinsics.LJFF(this.skuId, orderSKUDTO.skuId) && Intrinsics.LJFF(this.quantity, orderSKUDTO.quantity) && Intrinsics.LJFF(this.cartItemId, orderSKUDTO.cartItemId) && Intrinsics.LJFF(this.source, orderSKUDTO.source) && Intrinsics.LJFF(this.sourceInfo, orderSKUDTO.sourceInfo) && Intrinsics.LJFF(this.entranceInfo, orderSKUDTO.entranceInfo) && Intrinsics.LJFF(this.chainKey, orderSKUDTO.chainKey) && Intrinsics.LJFF(this.kolId, orderSKUDTO.kolId) && Intrinsics.LJFF(this.logisticsServiceId, orderSKUDTO.logisticsServiceId) && Intrinsics.LJFF(this.priceVal, orderSKUDTO.priceVal) && Intrinsics.LJFF(this.currency, orderSKUDTO.currency) && Intrinsics.LJFF(this.warehouseId, orderSKUDTO.warehouseId) && Intrinsics.LJFF(this.bundleId, orderSKUDTO.bundleId) && Intrinsics.LJFF(this.aggregationKey, orderSKUDTO.aggregationKey) && Intrinsics.LJFF(this.aggregationCount, orderSKUDTO.aggregationCount) && Intrinsics.LJFF(this.skuCardStyleInfo, orderSKUDTO.skuCardStyleInfo) && Intrinsics.LJFF(this.channelReserveKey, orderSKUDTO.channelReserveKey) && Intrinsics.LJFF(this.bizType, orderSKUDTO.bizType) && Intrinsics.LJFF(this.platformLinkInfo, orderSKUDTO.platformLinkInfo) && Intrinsics.LJFF(this.snsInfo, orderSKUDTO.snsInfo) && Intrinsics.LJFF(this.selectedInsuranceInfo, orderSKUDTO.selectedInsuranceInfo) && Intrinsics.LJFF(this.bcmStandardTrack, orderSKUDTO.bcmStandardTrack) && Intrinsics.LJFF(this.productSaleModes, orderSKUDTO.productSaleModes) && Intrinsics.LJFF(this.selectedProps, orderSKUDTO.selectedProps) && Intrinsics.LJFF(this.userVirtualInfo, orderSKUDTO.userVirtualInfo) && Intrinsics.LJFF(this.membershipInfo, orderSKUDTO.membershipInfo);
    }

    public final int hashCode() {
        String str = this.productId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.skuId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.quantity;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.cartItemId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.source;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.sourceInfo;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.entranceInfo;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.chainKey;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.kolId;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.logisticsServiceId;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.priceVal;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.currency;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.warehouseId;
        int iHashCode13 = (iHashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.bundleId;
        int iHashCode14 = (iHashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.aggregationKey;
        int iHashCode15 = (iHashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Integer num3 = this.aggregationCount;
        int iHashCode16 = (iHashCode15 + (num3 == null ? 0 : num3.hashCode())) * 31;
        SkuCardStyleInfo skuCardStyleInfo = this.skuCardStyleInfo;
        int iHashCode17 = (iHashCode16 + (skuCardStyleInfo == null ? 0 : skuCardStyleInfo.hashCode())) * 31;
        String str14 = this.channelReserveKey;
        int iHashCode18 = (iHashCode17 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Integer num4 = this.bizType;
        int iHashCode19 = (iHashCode18 + (num4 == null ? 0 : num4.hashCode())) * 31;
        PlatformLinkInfo platformLinkInfo = this.platformLinkInfo;
        int iHashCode20 = (iHashCode19 + (platformLinkInfo == null ? 0 : platformLinkInfo.hashCode())) * 31;
        SnsInfo snsInfo = this.snsInfo;
        int iHashCode21 = (iHashCode20 + (snsInfo == null ? 0 : snsInfo.hashCode())) * 31;
        InsuranceInfo insuranceInfo = this.selectedInsuranceInfo;
        int iHashCode22 = (iHashCode21 + (insuranceInfo == null ? 0 : insuranceInfo.hashCode())) * 31;
        BcmStandardTrack bcmStandardTrack = this.bcmStandardTrack;
        int iHashCode23 = (iHashCode22 + (bcmStandardTrack == null ? 0 : bcmStandardTrack.hashCode())) * 31;
        List<Integer> list = this.productSaleModes;
        int iHashCode24 = (iHashCode23 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.selectedProps;
        int iHashCode25 = (iHashCode24 + (list2 == null ? 0 : list2.hashCode())) * 31;
        UserVirtualInfo userVirtualInfo = this.userVirtualInfo;
        int iHashCode26 = (iHashCode25 + (userVirtualInfo == null ? 0 : userVirtualInfo.hashCode())) * 31;
        MemberShipInfo memberShipInfo = this.membershipInfo;
        return iHashCode26 + (memberShipInfo != null ? memberShipInfo.hashCode() : 0);
    }

    public final String toString() {
        return "OrderSKUDTO(productId=" + this.productId + ", skuId=" + this.skuId + ", quantity=" + this.quantity + ", cartItemId=" + this.cartItemId + ", source=" + this.source + ", sourceInfo=" + this.sourceInfo + ", entranceInfo=" + this.entranceInfo + ", chainKey=" + this.chainKey + ", kolId=" + this.kolId + ", logisticsServiceId=" + this.logisticsServiceId + ", priceVal=" + this.priceVal + ", currency=" + this.currency + ", warehouseId=" + this.warehouseId + ", bundleId=" + this.bundleId + ", aggregationKey=" + this.aggregationKey + ", aggregationCount=" + this.aggregationCount + ", skuCardStyleInfo=" + this.skuCardStyleInfo + ", channelReserveKey=" + this.channelReserveKey + ", bizType=" + this.bizType + ", platformLinkInfo=" + this.platformLinkInfo + ", snsInfo=" + this.snsInfo + ", selectedInsuranceInfo=" + this.selectedInsuranceInfo + ", bcmStandardTrack=" + this.bcmStandardTrack + ", productSaleModes=" + this.productSaleModes + ", selectedProps=" + this.selectedProps + ", userVirtualInfo=" + this.userVirtualInfo + ", membershipInfo=" + this.membershipInfo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.productId);
        parcel.writeString(this.skuId);
        Integer num = this.quantity;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.cartItemId);
        Integer num2 = this.source;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.sourceInfo);
        parcel.writeString(this.entranceInfo);
        parcel.writeString(this.chainKey);
        parcel.writeString(this.kolId);
        parcel.writeString(this.logisticsServiceId);
        parcel.writeString(this.priceVal);
        parcel.writeString(this.currency);
        parcel.writeString(this.warehouseId);
        parcel.writeString(this.bundleId);
        parcel.writeString(this.aggregationKey);
        Integer num3 = this.aggregationCount;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        SkuCardStyleInfo skuCardStyleInfo = this.skuCardStyleInfo;
        if (skuCardStyleInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            skuCardStyleInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.channelReserveKey);
        Integer num4 = this.bizType;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        parcel.writeParcelable(this.platformLinkInfo, i);
        SnsInfo snsInfo = this.snsInfo;
        if (snsInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            snsInfo.writeToParcel(parcel, i);
        }
        parcel.writeSerializable(this.selectedInsuranceInfo);
        BcmStandardTrack bcmStandardTrack = this.bcmStandardTrack;
        if (bcmStandardTrack == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bcmStandardTrack.writeToParcel(parcel, i);
        }
        List<Integer> list = this.productSaleModes;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Integer> it2 = list.iterator();
            while (it2.hasNext()) {
                parcel.writeInt(it2.next().intValue());
            }
        }
        parcel.writeStringList(this.selectedProps);
        UserVirtualInfo userVirtualInfo = this.userVirtualInfo;
        if (userVirtualInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            userVirtualInfo.writeToParcel(parcel, i);
        }
        MemberShipInfo memberShipInfo = this.membershipInfo;
        if (memberShipInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            memberShipInfo.writeToParcel(parcel, i);
        }
    }

    public final boolean LIZIZ() {
        Integer num;
        Integer num2;
        Integer num3;
        SkuCardStyleInfo skuCardStyleInfo = this.skuCardStyleInfo;
        if (skuCardStyleInfo != null && (num3 = skuCardStyleInfo.skuCardStyleType) != null && num3.intValue() == 1) {
            return true;
        }
        SkuCardStyleInfo skuCardStyleInfo2 = this.skuCardStyleInfo;
        if (skuCardStyleInfo2 != null && (num2 = skuCardStyleInfo2.skuCardStyleType) != null && num2.intValue() == 3) {
            return true;
        }
        SkuCardStyleInfo skuCardStyleInfo3 = this.skuCardStyleInfo;
        return (skuCardStyleInfo3 == null || (num = skuCardStyleInfo3.skuCardStyleType) == null || num.intValue() != 4) ? false : true;
    }

    public static OrderSKUDTO LIZ(OrderSKUDTO orderSKUDTO, String str, Integer num, String str2, String str3, String str4, String str5, SnsInfo snsInfo, InsuranceInfo insuranceInfo, List list, UserVirtualInfo userVirtualInfo, int i) {
        String str6;
        Integer num2;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        Integer num3;
        SkuCardStyleInfo skuCardStyleInfo;
        String str14;
        Integer num4;
        PlatformLinkInfo platformLinkInfo;
        BcmStandardTrack bcmStandardTrack;
        List<Integer> list2;
        SnsInfo snsInfo2 = snsInfo;
        List list3 = list;
        String str15 = str5;
        InsuranceInfo insuranceInfo2 = insuranceInfo;
        String str16 = str3;
        UserVirtualInfo userVirtualInfo2 = userVirtualInfo;
        String str17 = str2;
        Integer num5 = num;
        String str18 = str4;
        String str19 = str;
        MemberShipInfo memberShipInfo = null;
        if ((i & 1) != 0) {
            str6 = orderSKUDTO.productId;
        } else {
            str6 = null;
        }
        if ((i & 2) != 0) {
            str19 = orderSKUDTO.skuId;
        }
        if ((i & 4) != 0) {
            num5 = orderSKUDTO.quantity;
        }
        if ((i & 8) != 0) {
            str17 = orderSKUDTO.cartItemId;
        }
        if ((i & 16) != 0) {
            num2 = orderSKUDTO.source;
        } else {
            num2 = null;
        }
        if ((i & 32) != 0) {
            str16 = orderSKUDTO.sourceInfo;
        }
        if ((i & 64) != 0) {
            str18 = orderSKUDTO.entranceInfo;
        }
        if ((i & 128) != 0) {
            str15 = orderSKUDTO.chainKey;
        }
        if ((i & 256) != 0) {
            str7 = orderSKUDTO.kolId;
        } else {
            str7 = null;
        }
        if ((i & 512) != 0) {
            str8 = orderSKUDTO.logisticsServiceId;
        } else {
            str8 = null;
        }
        if ((i & 1024) != 0) {
            str9 = orderSKUDTO.priceVal;
        } else {
            str9 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str10 = orderSKUDTO.currency;
        } else {
            str10 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str11 = orderSKUDTO.warehouseId;
        } else {
            str11 = null;
        }
        if ((i & 8192) != 0) {
            str12 = orderSKUDTO.bundleId;
        } else {
            str12 = null;
        }
        if ((i & 16384) != 0) {
            str13 = orderSKUDTO.aggregationKey;
        } else {
            str13 = null;
        }
        if ((32768 & i) != 0) {
            num3 = orderSKUDTO.aggregationCount;
        } else {
            num3 = null;
        }
        if ((65536 & i) != 0) {
            skuCardStyleInfo = orderSKUDTO.skuCardStyleInfo;
        } else {
            skuCardStyleInfo = null;
        }
        if ((131072 & i) != 0) {
            str14 = orderSKUDTO.channelReserveKey;
        } else {
            str14 = null;
        }
        if ((262144 & i) != 0) {
            num4 = orderSKUDTO.bizType;
        } else {
            num4 = null;
        }
        if ((524288 & i) != 0) {
            platformLinkInfo = orderSKUDTO.platformLinkInfo;
        } else {
            platformLinkInfo = null;
        }
        if ((1048576 & i) != 0) {
            snsInfo2 = orderSKUDTO.snsInfo;
        }
        if ((2097152 & i) != 0) {
            insuranceInfo2 = orderSKUDTO.selectedInsuranceInfo;
        }
        if ((4194304 & i) != 0) {
            bcmStandardTrack = orderSKUDTO.bcmStandardTrack;
        } else {
            bcmStandardTrack = null;
        }
        if ((8388608 & i) != 0) {
            list2 = orderSKUDTO.productSaleModes;
        } else {
            list2 = null;
        }
        if ((16777216 & i) != 0) {
            list3 = orderSKUDTO.selectedProps;
        }
        if ((33554432 & i) != 0) {
            userVirtualInfo2 = orderSKUDTO.userVirtualInfo;
        }
        if ((i & 67108864) != 0) {
            memberShipInfo = orderSKUDTO.membershipInfo;
        }
        orderSKUDTO.getClass();
        return new OrderSKUDTO(str6, str19, num5, str17, num2, str16, str18, str15, str7, str8, str9, str10, str11, str12, str13, num3, skuCardStyleInfo, str14, num4, platformLinkInfo, snsInfo2, insuranceInfo2, bcmStandardTrack, list2, list3, userVirtualInfo2, memberShipInfo);
    }

    public OrderSKUDTO(String str, String str2, Integer num, String str3, Integer num2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Integer num3, SkuCardStyleInfo skuCardStyleInfo, String str14, Integer num4, PlatformLinkInfo platformLinkInfo, SnsInfo snsInfo, InsuranceInfo insuranceInfo, BcmStandardTrack bcmStandardTrack, List<Integer> list, List<String> list2, UserVirtualInfo userVirtualInfo, MemberShipInfo memberShipInfo) {
        this.productId = str;
        this.skuId = str2;
        this.quantity = num;
        this.cartItemId = str3;
        this.source = num2;
        this.sourceInfo = str4;
        this.entranceInfo = str5;
        this.chainKey = str6;
        this.kolId = str7;
        this.logisticsServiceId = str8;
        this.priceVal = str9;
        this.currency = str10;
        this.warehouseId = str11;
        this.bundleId = str12;
        this.aggregationKey = str13;
        this.aggregationCount = num3;
        this.skuCardStyleInfo = skuCardStyleInfo;
        this.channelReserveKey = str14;
        this.bizType = num4;
        this.platformLinkInfo = platformLinkInfo;
        this.snsInfo = snsInfo;
        this.selectedInsuranceInfo = insuranceInfo;
        this.bcmStandardTrack = bcmStandardTrack;
        this.productSaleModes = list;
        this.selectedProps = list2;
        this.userVirtualInfo = userVirtualInfo;
        this.membershipInfo = memberShipInfo;
    }
}
