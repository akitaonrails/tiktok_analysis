package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticPromotion;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticTextDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.SpendMoreForFree;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shipping.ShippingDialogDto;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticsDescription;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShippingService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class LogisticDTO implements Parcelable {

    @C09CT("arrival_info")
    public String arrivalInfo;

    @C09CT("da_info")
    public String daInfo;

    @C09CT("delivery_max_days")
    public Integer deliveryMaxDays;

    @C09CT("delivery_min_days")
    public Integer deliveryMinDays;

    @C09CT("delivery_name")
    public String deliveryName;

    @C09CT("delivery_option")
    public Integer deliveryOption;

    @C09CT("event_tracking")
    public Map<String, String> eventTrackInfo;

    @C09CT("free_shipping")
    public Boolean freeShipping;

    @C09CT("has_native_page")
    public Boolean hasNativePage;

    @C09CT("is_default")
    public Boolean isDefault;
    public Boolean isUseSkeleton;

    @C09CT("lead_time")
    public String leadTime;

    @C09CT("logistic_rich_text")
    public LogisticLinkRichText logisticRichText;

    @C09CT("logistic_rich_text_list")
    public List<LogisticLinkRichText> logisticRichTextList;

    @C09CT("logistic_text")
    public LogisticTextDTO logisticText;

    @C09CT("logistics_description")
    public LogisticsDescription logisticsDescription;

    @C09CT("logistics_service_id")
    public String logisticsServiceId;

    @C09CT("order_cut_off_notice")
    public LogisticLinkRichText orderCutOffNotice;

    @C09CT("original_shipping_fee")
    public String originShippingFee;

    @C09CT("original_shipping_val")
    public String originShippingVal;

    @C09CT("logistic_promotion")
    public LogisticPromotion promotion;

    @C09CT("reachable")
    public Boolean reachable;

    @C09CT("shipping_discount")
    public Boolean shippingDiscount;

    @C09CT("shipping_fee")
    public Price shippingFee;

    @C09CT("shipping_service")
    public ShippingService shippingService;

    @C09CT("shipping_threshold_text")
    public LogisticLinkRichText shippingThresholdText;

    @C09CT("shipping_fallback_dialog")
    public ShippingDialogDto shopifyFallbackDialog;

    @C09CT("spend_more_jumper")
    public SpendMoreForFree spendMoreForFree;
    public static final Parcelable.Creator<LogisticDTO> CREATOR = new Parcelable.Creator<LogisticDTO>() { // from class: X.02mT
        @Override // android.os.Parcelable.Creator
        public final LogisticDTO createFromParcel(Parcel parcel) {
            Integer numValueOf;
            boolean z;
            Boolean boolValueOf;
            boolean z2;
            Boolean boolValueOf2;
            Price priceCreateFromParcel;
            boolean z3;
            Boolean boolValueOf3;
            boolean z4;
            Boolean boolValueOf4;
            LogisticTextDTO logisticTextDTOCreateFromParcel;
            Integer numValueOf2;
            Integer numValueOf3;
            SpendMoreForFree spendMoreForFreeCreateFromParcel;
            LinkedHashMap linkedHashMap;
            LogisticPromotion logisticPromotionCreateFromParcel;
            boolean z5;
            Boolean boolValueOf5;
            ShippingDialogDto shippingDialogDtoCreateFromParcel;
            ShippingService shippingServiceCreateFromParcel;
            LogisticLinkRichText logisticLinkRichTextCreateFromParcel;
            LogisticLinkRichText logisticLinkRichTextCreateFromParcel2;
            ArrayList arrayList;
            LogisticLinkRichText logisticLinkRichTextCreateFromParcel3;
            LogisticsDescription logisticsDescriptionCreateFromParcel;
            boolean z6;
            Boolean boolValueOf6;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string = parcel.readString();
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
                boolValueOf2 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                priceCreateFromParcel = null;
            } else {
                priceCreateFromParcel = Price.CREATOR.createFromParcel(parcel);
            }
            Price price = priceCreateFromParcel;
            String string3 = parcel.readString();
            String string4 = parcel.readString();
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
                logisticTextDTOCreateFromParcel = null;
            } else {
                logisticTextDTOCreateFromParcel = LogisticTextDTO.CREATOR.createFromParcel(parcel);
            }
            LogisticTextDTO logisticTextDTO = logisticTextDTOCreateFromParcel;
            String string5 = parcel.readString();
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
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                spendMoreForFreeCreateFromParcel = null;
            } else {
                spendMoreForFreeCreateFromParcel = SpendMoreForFree.CREATOR.createFromParcel(parcel);
            }
            SpendMoreForFree spendMoreForFree = spendMoreForFreeCreateFromParcel;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            if (parcel.readInt() == 0) {
                logisticPromotionCreateFromParcel = null;
            } else {
                logisticPromotionCreateFromParcel = LogisticPromotion.CREATOR.createFromParcel(parcel);
            }
            LogisticPromotion logisticPromotion = logisticPromotionCreateFromParcel;
            if (parcel.readInt() == 0) {
                boolValueOf5 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolValueOf5 = Boolean.valueOf(z5);
            }
            if (parcel.readInt() == 0) {
                shippingDialogDtoCreateFromParcel = null;
            } else {
                shippingDialogDtoCreateFromParcel = ShippingDialogDto.CREATOR.createFromParcel(parcel);
            }
            ShippingDialogDto shippingDialogDto = shippingDialogDtoCreateFromParcel;
            if (parcel.readInt() == 0) {
                shippingServiceCreateFromParcel = null;
            } else {
                shippingServiceCreateFromParcel = ShippingService.CREATOR.createFromParcel(parcel);
            }
            ShippingService shippingService = shippingServiceCreateFromParcel;
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                logisticLinkRichTextCreateFromParcel = null;
            } else {
                logisticLinkRichTextCreateFromParcel = LogisticLinkRichText.CREATOR.createFromParcel(parcel);
            }
            LogisticLinkRichText logisticLinkRichText = logisticLinkRichTextCreateFromParcel;
            if (parcel.readInt() == 0) {
                logisticLinkRichTextCreateFromParcel2 = null;
            } else {
                logisticLinkRichTextCreateFromParcel2 = LogisticLinkRichText.CREATOR.createFromParcel(parcel);
            }
            LogisticLinkRichText logisticLinkRichText2 = logisticLinkRichTextCreateFromParcel2;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i3 = parcel.readInt();
                arrayList = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList.add(LogisticLinkRichText.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                logisticLinkRichTextCreateFromParcel3 = null;
            } else {
                logisticLinkRichTextCreateFromParcel3 = LogisticLinkRichText.CREATOR.createFromParcel(parcel);
            }
            LogisticLinkRichText logisticLinkRichText3 = logisticLinkRichTextCreateFromParcel3;
            if (parcel.readInt() == 0) {
                logisticsDescriptionCreateFromParcel = null;
            } else {
                logisticsDescriptionCreateFromParcel = LogisticsDescription.CREATOR.createFromParcel(parcel);
            }
            LogisticsDescription logisticsDescription = logisticsDescriptionCreateFromParcel;
            if (parcel.readInt() == 0) {
                boolValueOf6 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolValueOf6 = Boolean.valueOf(z6);
            }
            return new LogisticDTO(numValueOf, string, boolValueOf, boolValueOf2, string2, price, string3, string4, boolValueOf3, boolValueOf4, logisticTextDTO, string5, numValueOf2, numValueOf3, string6, spendMoreForFree, linkedHashMap, logisticPromotion, boolValueOf5, shippingDialogDto, shippingService, string7, logisticLinkRichText, logisticLinkRichText2, arrayList, logisticLinkRichText3, logisticsDescription, boolValueOf6);
        }

        @Override // android.os.Parcelable.Creator
        public final LogisticDTO[] newArray(int i) {
            return new LogisticDTO[i];
        }
    };
    public static final int $stable = 8;

    public LogisticDTO() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogisticDTO)) {
            return false;
        }
        LogisticDTO logisticDTO = (LogisticDTO) obj;
        return Intrinsics.LJFF(this.deliveryOption, logisticDTO.deliveryOption) && Intrinsics.LJFF(this.deliveryName, logisticDTO.deliveryName) && Intrinsics.LJFF(this.isDefault, logisticDTO.isDefault) && Intrinsics.LJFF(this.reachable, logisticDTO.reachable) && Intrinsics.LJFF(this.leadTime, logisticDTO.leadTime) && Intrinsics.LJFF(this.shippingFee, logisticDTO.shippingFee) && Intrinsics.LJFF(this.originShippingFee, logisticDTO.originShippingFee) && Intrinsics.LJFF(this.originShippingVal, logisticDTO.originShippingVal) && Intrinsics.LJFF(this.freeShipping, logisticDTO.freeShipping) && Intrinsics.LJFF(this.shippingDiscount, logisticDTO.shippingDiscount) && Intrinsics.LJFF(this.logisticText, logisticDTO.logisticText) && Intrinsics.LJFF(this.logisticsServiceId, logisticDTO.logisticsServiceId) && Intrinsics.LJFF(this.deliveryMinDays, logisticDTO.deliveryMinDays) && Intrinsics.LJFF(this.deliveryMaxDays, logisticDTO.deliveryMaxDays) && Intrinsics.LJFF(this.daInfo, logisticDTO.daInfo) && Intrinsics.LJFF(this.spendMoreForFree, logisticDTO.spendMoreForFree) && Intrinsics.LJFF(this.eventTrackInfo, logisticDTO.eventTrackInfo) && Intrinsics.LJFF(this.promotion, logisticDTO.promotion) && Intrinsics.LJFF(this.hasNativePage, logisticDTO.hasNativePage) && Intrinsics.LJFF(this.shopifyFallbackDialog, logisticDTO.shopifyFallbackDialog) && Intrinsics.LJFF(this.shippingService, logisticDTO.shippingService) && Intrinsics.LJFF(this.arrivalInfo, logisticDTO.arrivalInfo) && Intrinsics.LJFF(this.shippingThresholdText, logisticDTO.shippingThresholdText) && Intrinsics.LJFF(this.logisticRichText, logisticDTO.logisticRichText) && Intrinsics.LJFF(this.logisticRichTextList, logisticDTO.logisticRichTextList) && Intrinsics.LJFF(this.orderCutOffNotice, logisticDTO.orderCutOffNotice) && Intrinsics.LJFF(this.logisticsDescription, logisticDTO.logisticsDescription) && Intrinsics.LJFF(this.isUseSkeleton, logisticDTO.isUseSkeleton);
    }

    public final int hashCode() {
        Integer num = this.deliveryOption;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.deliveryName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isDefault;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.reachable;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.leadTime;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Price price = this.shippingFee;
        int iHashCode6 = (iHashCode5 + (price == null ? 0 : price.hashCode())) * 31;
        String str3 = this.originShippingFee;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.originShippingVal;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool3 = this.freeShipping;
        int iHashCode9 = (iHashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.shippingDiscount;
        int iHashCode10 = (iHashCode9 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        LogisticTextDTO logisticTextDTO = this.logisticText;
        int iHashCode11 = (iHashCode10 + (logisticTextDTO == null ? 0 : logisticTextDTO.hashCode())) * 31;
        String str5 = this.logisticsServiceId;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.deliveryMinDays;
        int iHashCode13 = (iHashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.deliveryMaxDays;
        int iHashCode14 = (iHashCode13 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str6 = this.daInfo;
        int iHashCode15 = (iHashCode14 + (str6 == null ? 0 : str6.hashCode())) * 31;
        SpendMoreForFree spendMoreForFree = this.spendMoreForFree;
        int iHashCode16 = (iHashCode15 + (spendMoreForFree == null ? 0 : spendMoreForFree.hashCode())) * 31;
        Map<String, String> map = this.eventTrackInfo;
        int iHashCode17 = (iHashCode16 + (map == null ? 0 : map.hashCode())) * 31;
        LogisticPromotion logisticPromotion = this.promotion;
        int iHashCode18 = (iHashCode17 + (logisticPromotion == null ? 0 : logisticPromotion.hashCode())) * 31;
        Boolean bool5 = this.hasNativePage;
        int iHashCode19 = (iHashCode18 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        ShippingDialogDto shippingDialogDto = this.shopifyFallbackDialog;
        int iHashCode20 = (iHashCode19 + (shippingDialogDto == null ? 0 : shippingDialogDto.hashCode())) * 31;
        ShippingService shippingService = this.shippingService;
        int iHashCode21 = (iHashCode20 + (shippingService == null ? 0 : shippingService.hashCode())) * 31;
        String str7 = this.arrivalInfo;
        int iHashCode22 = (iHashCode21 + (str7 == null ? 0 : str7.hashCode())) * 31;
        LogisticLinkRichText logisticLinkRichText = this.shippingThresholdText;
        int iHashCode23 = (iHashCode22 + (logisticLinkRichText == null ? 0 : logisticLinkRichText.hashCode())) * 31;
        LogisticLinkRichText logisticLinkRichText2 = this.logisticRichText;
        int iHashCode24 = (iHashCode23 + (logisticLinkRichText2 == null ? 0 : logisticLinkRichText2.hashCode())) * 31;
        List<LogisticLinkRichText> list = this.logisticRichTextList;
        int iHashCode25 = (iHashCode24 + (list == null ? 0 : list.hashCode())) * 31;
        LogisticLinkRichText logisticLinkRichText3 = this.orderCutOffNotice;
        int iHashCode26 = (iHashCode25 + (logisticLinkRichText3 == null ? 0 : logisticLinkRichText3.hashCode())) * 31;
        LogisticsDescription logisticsDescription = this.logisticsDescription;
        int iHashCode27 = (iHashCode26 + (logisticsDescription == null ? 0 : logisticsDescription.hashCode())) * 31;
        Boolean bool6 = this.isUseSkeleton;
        return iHashCode27 + (bool6 != null ? bool6.hashCode() : 0);
    }

    public final String toString() {
        return "LogisticDTO(deliveryOption=" + this.deliveryOption + ", deliveryName=" + this.deliveryName + ", isDefault=" + this.isDefault + ", reachable=" + this.reachable + ", leadTime=" + this.leadTime + ", shippingFee=" + this.shippingFee + ", originShippingFee=" + this.originShippingFee + ", originShippingVal=" + this.originShippingVal + ", freeShipping=" + this.freeShipping + ", shippingDiscount=" + this.shippingDiscount + ", logisticText=" + this.logisticText + ", logisticsServiceId=" + this.logisticsServiceId + ", deliveryMinDays=" + this.deliveryMinDays + ", deliveryMaxDays=" + this.deliveryMaxDays + ", daInfo=" + this.daInfo + ", spendMoreForFree=" + this.spendMoreForFree + ", eventTrackInfo=" + this.eventTrackInfo + ", promotion=" + this.promotion + ", hasNativePage=" + this.hasNativePage + ", shopifyFallbackDialog=" + this.shopifyFallbackDialog + ", shippingService=" + this.shippingService + ", arrivalInfo=" + this.arrivalInfo + ", shippingThresholdText=" + this.shippingThresholdText + ", logisticRichText=" + this.logisticRichText + ", logisticRichTextList=" + this.logisticRichTextList + ", orderCutOffNotice=" + this.orderCutOffNotice + ", logisticsDescription=" + this.logisticsDescription + ", isUseSkeleton=" + this.isUseSkeleton + ')';
    }

    public final String LIZ() {
        String str;
        Map<String, String> map = this.eventTrackInfo;
        return (map == null || (str = map.get("is_next_day_delivery")) == null) ? CardStruct.IStatusCode.DEFAULT : str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.deliveryOption;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.deliveryName);
        Boolean bool = this.isDefault;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.reachable;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.leadTime);
        Price price = this.shippingFee;
        if (price == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            price.writeToParcel(parcel, i);
        }
        parcel.writeString(this.originShippingFee);
        parcel.writeString(this.originShippingVal);
        Boolean bool3 = this.freeShipping;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Boolean bool4 = this.shippingDiscount;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        LogisticTextDTO logisticTextDTO = this.logisticText;
        if (logisticTextDTO == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            logisticTextDTO.writeToParcel(parcel, i);
        }
        parcel.writeString(this.logisticsServiceId);
        Integer num2 = this.deliveryMinDays;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.deliveryMaxDays;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeString(this.daInfo);
        SpendMoreForFree spendMoreForFree = this.spendMoreForFree;
        if (spendMoreForFree == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            spendMoreForFree.writeToParcel(parcel, i);
        }
        Map<String, String> map = this.eventTrackInfo;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        LogisticPromotion logisticPromotion = this.promotion;
        if (logisticPromotion == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            logisticPromotion.writeToParcel(parcel, i);
        }
        Boolean bool5 = this.hasNativePage;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        ShippingDialogDto shippingDialogDto = this.shopifyFallbackDialog;
        if (shippingDialogDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shippingDialogDto.writeToParcel(parcel, i);
        }
        ShippingService shippingService = this.shippingService;
        if (shippingService == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(shippingService.shippingRightsContent);
        }
        parcel.writeString(this.arrivalInfo);
        LogisticLinkRichText logisticLinkRichText = this.shippingThresholdText;
        if (logisticLinkRichText == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            logisticLinkRichText.writeToParcel(parcel, i);
        }
        LogisticLinkRichText logisticLinkRichText2 = this.logisticRichText;
        if (logisticLinkRichText2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            logisticLinkRichText2.writeToParcel(parcel, i);
        }
        List<LogisticLinkRichText> list = this.logisticRichTextList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<LogisticLinkRichText> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        LogisticLinkRichText logisticLinkRichText3 = this.orderCutOffNotice;
        if (logisticLinkRichText3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            logisticLinkRichText3.writeToParcel(parcel, i);
        }
        LogisticsDescription logisticsDescription = this.logisticsDescription;
        if (logisticsDescription == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            logisticsDescription.writeToParcel(parcel, i);
        }
        Boolean bool6 = this.isUseSkeleton;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool6.booleanValue() ? 1 : 0);
        }
    }

    public LogisticDTO(Integer num, String str, Boolean bool, Boolean bool2, String str2, Price price, String str3, String str4, Boolean bool3, Boolean bool4, LogisticTextDTO logisticTextDTO, String str5, Integer num2, Integer num3, String str6, SpendMoreForFree spendMoreForFree, Map<String, String> map, LogisticPromotion logisticPromotion, Boolean bool5, ShippingDialogDto shippingDialogDto, ShippingService shippingService, String str7, LogisticLinkRichText logisticLinkRichText, LogisticLinkRichText logisticLinkRichText2, List<LogisticLinkRichText> list, LogisticLinkRichText logisticLinkRichText3, LogisticsDescription logisticsDescription, Boolean bool6) {
        this.deliveryOption = num;
        this.deliveryName = str;
        this.isDefault = bool;
        this.reachable = bool2;
        this.leadTime = str2;
        this.shippingFee = price;
        this.originShippingFee = str3;
        this.originShippingVal = str4;
        this.freeShipping = bool3;
        this.shippingDiscount = bool4;
        this.logisticText = logisticTextDTO;
        this.logisticsServiceId = str5;
        this.deliveryMinDays = num2;
        this.deliveryMaxDays = num3;
        this.daInfo = str6;
        this.spendMoreForFree = spendMoreForFree;
        this.eventTrackInfo = map;
        this.promotion = logisticPromotion;
        this.hasNativePage = bool5;
        this.shopifyFallbackDialog = shippingDialogDto;
        this.shippingService = shippingService;
        this.arrivalInfo = str7;
        this.shippingThresholdText = logisticLinkRichText;
        this.logisticRichText = logisticLinkRichText2;
        this.logisticRichTextList = list;
        this.orderCutOffNotice = logisticLinkRichText3;
        this.logisticsDescription = logisticsDescription;
        this.isUseSkeleton = bool6;
    }
}
