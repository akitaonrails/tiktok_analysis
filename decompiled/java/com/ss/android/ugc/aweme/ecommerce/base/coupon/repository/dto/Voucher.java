package com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.DiscountView;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.InstanceInfo;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.VoucherCountdown;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.VoucherInteractiveInfo;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.VoucherLabel;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.VoucherLabelGroup;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BCMStandardTrack;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Voucher implements Parcelable, Serializable {

    @C09CT("bcm_standard_track")
    public BCMStandardTrack bcmStandardTrack;

    @C09CT("button_text")
    public String buttonText;

    @C09CT("claim_time")
    public Long claimTime;

    @C09CT("claim_user_type")
    public Integer claimUserType;

    @C09CT("cost_role")
    public Integer costRole;

    @C09CT("cost_role_text")
    public String costRoleText;

    @C09CT("cost_type")
    public Integer costType;

    @C09CT("countdown")
    public VoucherCountdown countdown;

    @C09CT("currency_symbol")
    public String currencySymbol;

    @C09CT("da_info")
    public String daInfo;

    @C09CT("discount_limit_text")
    public String discountLimitText;

    @C09CT("discount_text")
    public String discountText;

    @C09CT("discount_view")
    public List<DiscountView> discountViews;

    @C09CT("exclusions_text")
    public String exclusionsText;

    @C09CT("full_vap_schema")
    public String fullVapSchema;

    @C09CT("instance_info_list")
    public List<InstanceInfo> instanceInfoList;

    @C09CT("voucher_interactive_info")
    public VoucherInteractiveInfo interactiveInfo;

    @C09CT("is_best")
    public Boolean isBest;

    @C09CT("labels")
    public List<VoucherLabel> labels;

    @C09CT("main_order_id")
    public String mainOrderID;

    @C09CT("odp_schema")
    public String odpSchema;

    @C09CT("orientation_text")
    public String orientationText;

    @C09CT("promotion_id")
    public String promotionID;

    @C09CT("reduction_type")
    public Integer reductionType;

    @C09CT("scope_text")
    public String scopeText;

    @C09CT("selected")
    public Boolean selected;

    @C09CT("shipping_discount_text")
    public String shippingDiscountText;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public Integer status;

    @C09CT("status_text")
    public String statusText;

    @C09CT("threshold_text")
    public String thresholdText;

    @C09CT("title")
    public String title;

    @C09CT("transparent_fields")
    public Map<String, String> transparentFields;

    @C09CT("usable_end_time")
    public Long usableEndTime;

    @C09CT("usable_start_time")
    public Long usableStartTime;

    @C09CT("use_limit_text")
    public String useLimitText;

    @C09CT("use_limit_type")
    public Integer useLimitType;

    @C09CT("valid_time_text")
    public String validTimeText;

    @C09CT("valid_time_text_style")
    public Integer validTimeTextStyle;

    @C09CT("vap_schema")
    public String vapSchema;

    @C09CT("vap_schema_type")
    public Integer vapSchemaType;

    @C09CT("voucher_business_type")
    public String voucherBusinessType;

    @C09CT("voucher_count")
    public Integer voucherCount;

    @C09CT("voucher_display_type")
    public Integer voucherDisplayType;

    @C09CT("voucher_id")
    public String voucherID;

    @C09CT("voucher_label_map")
    public Map<String, VoucherLabelGroup> voucherLabelMap;

    @C09CT("voucher_membership_type")
    public Integer voucherMembershipType;

    @C09CT("usable_reminder_text")
    public String voucherReminderText;

    @C09CT("voucher_type_id")
    public String voucherTypeID;
    public static final Parcelable.Creator<Voucher> CREATOR = new Parcelable.Creator<Voucher>() { // from class: X.02ld
        @Override // android.os.Parcelable.Creator
        public final Voucher createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Integer numValueOf;
            Integer numValueOf2;
            Integer numValueOf3;
            Integer numValueOf4;
            Integer numValueOf5;
            Integer numValueOf6;
            Long lValueOf;
            Long lValueOf2;
            Long lValueOf3;
            boolean z;
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Integer numValueOf7;
            ArrayList arrayList2;
            Integer numValueOf8;
            Integer numValueOf9;
            VoucherInteractiveInfo voucherInteractiveInfoCreateFromParcel;
            ArrayList arrayList3;
            Integer numValueOf10;
            BCMStandardTrack bCMStandardTrackCreateFromParcel;
            LinkedHashMap linkedHashMap;
            Integer numValueOf11;
            LinkedHashMap linkedHashMap2;
            VoucherLabelGroup voucherLabelGroupCreateFromParcel;
            VoucherCountdown voucherCountdownCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(InstanceInfo.CREATOR.createFromParcel(parcel));
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
                numValueOf4 = null;
            } else {
                numValueOf4 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf5 = null;
            } else {
                numValueOf5 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf6 = null;
            } else {
                numValueOf6 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                lValueOf2 = null;
            } else {
                lValueOf2 = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                lValueOf3 = null;
            } else {
                lValueOf3 = Long.valueOf(parcel.readLong());
            }
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            boolean z2 = true;
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
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf7 = null;
            } else {
                numValueOf7 = Integer.valueOf(parcel.readInt());
            }
            String string19 = parcel.readString();
            String string20 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(DiscountView.CREATOR.createFromParcel(parcel));
                }
            }
            String string21 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf8 = null;
            } else {
                numValueOf8 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf9 = null;
            } else {
                numValueOf9 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                voucherInteractiveInfoCreateFromParcel = null;
            } else {
                voucherInteractiveInfoCreateFromParcel = VoucherInteractiveInfo.CREATOR.createFromParcel(parcel);
            }
            VoucherInteractiveInfo voucherInteractiveInfo = voucherInteractiveInfoCreateFromParcel;
            String string22 = parcel.readString();
            String string23 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i5 = parcel.readInt();
                arrayList3 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList3.add(VoucherLabel.CREATOR.createFromParcel(parcel));
                }
            }
            String string24 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf10 = null;
            } else {
                numValueOf10 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                bCMStandardTrackCreateFromParcel = null;
            } else {
                bCMStandardTrackCreateFromParcel = BCMStandardTrack.CREATOR.createFromParcel(parcel);
            }
            BCMStandardTrack bCMStandardTrack = bCMStandardTrackCreateFromParcel;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i7 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i7);
                for (int i8 = 0; i8 != i7; i8++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            if (parcel.readInt() == 0) {
                numValueOf11 = null;
            } else {
                numValueOf11 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                linkedHashMap2 = null;
            } else {
                int i9 = parcel.readInt();
                linkedHashMap2 = new LinkedHashMap(i9);
                for (int i10 = 0; i10 != i9; i10++) {
                    String string25 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        voucherLabelGroupCreateFromParcel = null;
                    } else {
                        voucherLabelGroupCreateFromParcel = VoucherLabelGroup.CREATOR.createFromParcel(parcel);
                    }
                    linkedHashMap2.put(string25, voucherLabelGroupCreateFromParcel);
                }
            }
            if (parcel.readInt() == 0) {
                voucherCountdownCreateFromParcel = null;
            } else {
                voucherCountdownCreateFromParcel = VoucherCountdown.CREATOR.createFromParcel(parcel);
            }
            return new Voucher(string, string2, arrayList, numValueOf, numValueOf2, numValueOf3, numValueOf4, numValueOf5, numValueOf6, lValueOf, lValueOf2, lValueOf3, string3, string4, boolValueOf, string5, boolValueOf2, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, numValueOf7, string19, string20, arrayList2, string21, numValueOf8, numValueOf9, voucherInteractiveInfo, string22, string23, arrayList3, string24, numValueOf10, bCMStandardTrack, linkedHashMap, numValueOf11, linkedHashMap2, voucherCountdownCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Voucher[] newArray(int i) {
            return new Voucher[i];
        }
    };
    public static final int $stable = 8;

    public Voucher() {
        this(null, "", null, 0, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, "", "", "", "", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final Voucher copy(String str, String str2, List<InstanceInfo> list, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Long l, Long l2, Long l3, String str3, String str4, Boolean bool, String str5, Boolean bool2, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, Integer num7, String str19, String str20, List<DiscountView> list2, String str21, Integer num8, Integer num9, VoucherInteractiveInfo voucherInteractiveInfo, String str22, String str23, List<VoucherLabel> list3, String str24, Integer num10, BCMStandardTrack bCMStandardTrack, Map<String, String> map, Integer num11, Map<String, VoucherLabelGroup> map2, VoucherCountdown voucherCountdown) {
        return new Voucher(str, str2, list, num, num2, num3, num4, num5, num6, l, l2, l3, str3, str4, bool, str5, bool2, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, num7, str19, str20, list2, str21, num8, num9, voucherInteractiveInfo, str22, str23, list3, str24, num10, bCMStandardTrack, map, num11, map2, voucherCountdown);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Voucher)) {
            return false;
        }
        Voucher voucher = (Voucher) obj;
        return Intrinsics.LJFF(this.voucherID, voucher.voucherID) && Intrinsics.LJFF(this.voucherTypeID, voucher.voucherTypeID) && Intrinsics.LJFF(this.instanceInfoList, voucher.instanceInfoList) && Intrinsics.LJFF(this.status, voucher.status) && Intrinsics.LJFF(this.costType, voucher.costType) && Intrinsics.LJFF(this.costRole, voucher.costRole) && Intrinsics.LJFF(this.reductionType, voucher.reductionType) && Intrinsics.LJFF(this.claimUserType, voucher.claimUserType) && Intrinsics.LJFF(this.useLimitType, voucher.useLimitType) && Intrinsics.LJFF(this.claimTime, voucher.claimTime) && Intrinsics.LJFF(this.usableStartTime, voucher.usableStartTime) && Intrinsics.LJFF(this.usableEndTime, voucher.usableEndTime) && Intrinsics.LJFF(this.mainOrderID, voucher.mainOrderID) && Intrinsics.LJFF(this.voucherBusinessType, voucher.voucherBusinessType) && Intrinsics.LJFF(this.selected, voucher.selected) && Intrinsics.LJFF(this.promotionID, voucher.promotionID) && Intrinsics.LJFF(this.isBest, voucher.isBest) && Intrinsics.LJFF(this.statusText, voucher.statusText) && Intrinsics.LJFF(this.costRoleText, voucher.costRoleText) && Intrinsics.LJFF(this.discountText, voucher.discountText) && Intrinsics.LJFF(this.shippingDiscountText, voucher.shippingDiscountText) && Intrinsics.LJFF(this.thresholdText, voucher.thresholdText) && Intrinsics.LJFF(this.useLimitText, voucher.useLimitText) && Intrinsics.LJFF(this.orientationText, voucher.orientationText) && Intrinsics.LJFF(this.odpSchema, voucher.odpSchema) && Intrinsics.LJFF(this.scopeText, voucher.scopeText) && Intrinsics.LJFF(this.exclusionsText, voucher.exclusionsText) && Intrinsics.LJFF(this.currencySymbol, voucher.currencySymbol) && Intrinsics.LJFF(this.buttonText, voucher.buttonText) && Intrinsics.LJFF(this.validTimeText, voucher.validTimeText) && Intrinsics.LJFF(this.validTimeTextStyle, voucher.validTimeTextStyle) && Intrinsics.LJFF(this.vapSchema, voucher.vapSchema) && Intrinsics.LJFF(this.fullVapSchema, voucher.fullVapSchema) && Intrinsics.LJFF(this.discountViews, voucher.discountViews) && Intrinsics.LJFF(this.daInfo, voucher.daInfo) && Intrinsics.LJFF(this.vapSchemaType, voucher.vapSchemaType) && Intrinsics.LJFF(this.voucherDisplayType, voucher.voucherDisplayType) && Intrinsics.LJFF(this.interactiveInfo, voucher.interactiveInfo) && Intrinsics.LJFF(this.title, voucher.title) && Intrinsics.LJFF(this.discountLimitText, voucher.discountLimitText) && Intrinsics.LJFF(this.labels, voucher.labels) && Intrinsics.LJFF(this.voucherReminderText, voucher.voucherReminderText) && Intrinsics.LJFF(this.voucherCount, voucher.voucherCount) && Intrinsics.LJFF(this.bcmStandardTrack, voucher.bcmStandardTrack) && Intrinsics.LJFF(this.transparentFields, voucher.transparentFields) && Intrinsics.LJFF(this.voucherMembershipType, voucher.voucherMembershipType) && Intrinsics.LJFF(this.voucherLabelMap, voucher.voucherLabelMap) && Intrinsics.LJFF(this.countdown, voucher.countdown);
    }

    public int hashCode() {
        String str = this.voucherID;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.voucherTypeID;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<InstanceInfo> list = this.instanceInfoList;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.status;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.costType;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.costRole;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.reductionType;
        int iHashCode7 = (iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.claimUserType;
        int iHashCode8 = (iHashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.useLimitType;
        int iHashCode9 = (iHashCode8 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Long l = this.claimTime;
        int iHashCode10 = (iHashCode9 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.usableStartTime;
        int iHashCode11 = (iHashCode10 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.usableEndTime;
        int iHashCode12 = (iHashCode11 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str3 = this.mainOrderID;
        int iHashCode13 = (iHashCode12 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.voucherBusinessType;
        int iHashCode14 = (iHashCode13 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.selected;
        int iHashCode15 = (iHashCode14 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.promotionID;
        int iHashCode16 = (iHashCode15 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool2 = this.isBest;
        int iHashCode17 = (iHashCode16 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str6 = this.statusText;
        int iHashCode18 = (iHashCode17 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.costRoleText;
        int iHashCode19 = (iHashCode18 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.discountText;
        int iHashCode20 = (iHashCode19 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.shippingDiscountText;
        int iHashCode21 = (iHashCode20 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.thresholdText;
        int iHashCode22 = (iHashCode21 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.useLimitText;
        int iHashCode23 = (iHashCode22 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.orientationText;
        int iHashCode24 = (iHashCode23 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.odpSchema;
        int iHashCode25 = (iHashCode24 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.scopeText;
        int iHashCode26 = (iHashCode25 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.exclusionsText;
        int iHashCode27 = (iHashCode26 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.currencySymbol;
        int iHashCode28 = (iHashCode27 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.buttonText;
        int iHashCode29 = (iHashCode28 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.validTimeText;
        int iHashCode30 = (iHashCode29 + (str18 == null ? 0 : str18.hashCode())) * 31;
        Integer num7 = this.validTimeTextStyle;
        int iHashCode31 = (iHashCode30 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str19 = this.vapSchema;
        int iHashCode32 = (iHashCode31 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.fullVapSchema;
        int iHashCode33 = (iHashCode32 + (str20 == null ? 0 : str20.hashCode())) * 31;
        List<DiscountView> list2 = this.discountViews;
        int iHashCode34 = (iHashCode33 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str21 = this.daInfo;
        int iHashCode35 = (iHashCode34 + (str21 == null ? 0 : str21.hashCode())) * 31;
        Integer num8 = this.vapSchemaType;
        int iHashCode36 = (iHashCode35 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.voucherDisplayType;
        int iHashCode37 = (iHashCode36 + (num9 == null ? 0 : num9.hashCode())) * 31;
        VoucherInteractiveInfo voucherInteractiveInfo = this.interactiveInfo;
        int iHashCode38 = (iHashCode37 + (voucherInteractiveInfo == null ? 0 : voucherInteractiveInfo.hashCode())) * 31;
        String str22 = this.title;
        int iHashCode39 = (iHashCode38 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.discountLimitText;
        int iHashCode40 = (iHashCode39 + (str23 == null ? 0 : str23.hashCode())) * 31;
        List<VoucherLabel> list3 = this.labels;
        int iHashCode41 = (iHashCode40 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str24 = this.voucherReminderText;
        int iHashCode42 = (iHashCode41 + (str24 == null ? 0 : str24.hashCode())) * 31;
        Integer num10 = this.voucherCount;
        int iHashCode43 = (iHashCode42 + (num10 == null ? 0 : num10.hashCode())) * 31;
        BCMStandardTrack bCMStandardTrack = this.bcmStandardTrack;
        int iHashCode44 = (iHashCode43 + (bCMStandardTrack == null ? 0 : bCMStandardTrack.hashCode())) * 31;
        Map<String, String> map = this.transparentFields;
        int iHashCode45 = (iHashCode44 + (map == null ? 0 : map.hashCode())) * 31;
        Integer num11 = this.voucherMembershipType;
        int iHashCode46 = (iHashCode45 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Map<String, VoucherLabelGroup> map2 = this.voucherLabelMap;
        int iHashCode47 = (iHashCode46 + (map2 == null ? 0 : map2.hashCode())) * 31;
        VoucherCountdown voucherCountdown = this.countdown;
        return iHashCode47 + (voucherCountdown != null ? voucherCountdown.hashCode() : 0);
    }

    public String toString() {
        return "Voucher(voucherID=" + this.voucherID + ", voucherTypeID=" + this.voucherTypeID + ", instanceInfoList=" + this.instanceInfoList + ", status=" + this.status + ", costType=" + this.costType + ", costRole=" + this.costRole + ", reductionType=" + this.reductionType + ", claimUserType=" + this.claimUserType + ", useLimitType=" + this.useLimitType + ", claimTime=" + this.claimTime + ", usableStartTime=" + this.usableStartTime + ", usableEndTime=" + this.usableEndTime + ", mainOrderID=" + this.mainOrderID + ", voucherBusinessType=" + this.voucherBusinessType + ", selected=" + this.selected + ", promotionID=" + this.promotionID + ", isBest=" + this.isBest + ", statusText=" + this.statusText + ", costRoleText=" + this.costRoleText + ", discountText=" + this.discountText + ", shippingDiscountText=" + this.shippingDiscountText + ", thresholdText=" + this.thresholdText + ", useLimitText=" + this.useLimitText + ", orientationText=" + this.orientationText + ", odpSchema=" + this.odpSchema + ", scopeText=" + this.scopeText + ", exclusionsText=" + this.exclusionsText + ", currencySymbol=" + this.currencySymbol + ", buttonText=" + this.buttonText + ", validTimeText=" + this.validTimeText + ", validTimeTextStyle=" + this.validTimeTextStyle + ", vapSchema=" + this.vapSchema + ", fullVapSchema=" + this.fullVapSchema + ", discountViews=" + this.discountViews + ", daInfo=" + this.daInfo + ", vapSchemaType=" + this.vapSchemaType + ", voucherDisplayType=" + this.voucherDisplayType + ", interactiveInfo=" + this.interactiveInfo + ", title=" + this.title + ", discountLimitText=" + this.discountLimitText + ", labels=" + this.labels + ", voucherReminderText=" + this.voucherReminderText + ", voucherCount=" + this.voucherCount + ", bcmStandardTrack=" + this.bcmStandardTrack + ", transparentFields=" + this.transparentFields + ", voucherMembershipType=" + this.voucherMembershipType + ", voucherLabelMap=" + this.voucherLabelMap + ", countdown=" + this.countdown + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.voucherID);
        parcel.writeString(this.voucherTypeID);
        List<InstanceInfo> list = this.instanceInfoList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<InstanceInfo> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        Integer num = this.status;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.costType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.costRole;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.reductionType;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        Integer num5 = this.claimUserType;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
        Integer num6 = this.useLimitType;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num6.intValue());
        }
        Long l = this.claimTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.usableStartTime;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        Long l3 = this.usableEndTime;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
        parcel.writeString(this.mainOrderID);
        parcel.writeString(this.voucherBusinessType);
        Boolean bool = this.selected;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.promotionID);
        Boolean bool2 = this.isBest;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.statusText);
        parcel.writeString(this.costRoleText);
        parcel.writeString(this.discountText);
        parcel.writeString(this.shippingDiscountText);
        parcel.writeString(this.thresholdText);
        parcel.writeString(this.useLimitText);
        parcel.writeString(this.orientationText);
        parcel.writeString(this.odpSchema);
        parcel.writeString(this.scopeText);
        parcel.writeString(this.exclusionsText);
        parcel.writeString(this.currencySymbol);
        parcel.writeString(this.buttonText);
        parcel.writeString(this.validTimeText);
        Integer num7 = this.validTimeTextStyle;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num7.intValue());
        }
        parcel.writeString(this.vapSchema);
        parcel.writeString(this.fullVapSchema);
        List<DiscountView> list2 = this.discountViews;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<DiscountView> it3 = list2.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.daInfo);
        Integer num8 = this.vapSchemaType;
        if (num8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num8.intValue());
        }
        Integer num9 = this.voucherDisplayType;
        if (num9 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num9.intValue());
        }
        VoucherInteractiveInfo voucherInteractiveInfo = this.interactiveInfo;
        if (voucherInteractiveInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            voucherInteractiveInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.title);
        parcel.writeString(this.discountLimitText);
        List<VoucherLabel> list3 = this.labels;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator<VoucherLabel> it4 = list3.iterator();
            while (it4.hasNext()) {
                it4.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.voucherReminderText);
        Integer num10 = this.voucherCount;
        if (num10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num10.intValue());
        }
        BCMStandardTrack bCMStandardTrack = this.bcmStandardTrack;
        if (bCMStandardTrack == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bCMStandardTrack.writeToParcel(parcel, i);
        }
        Map<String, String> map = this.transparentFields;
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
        Integer num11 = this.voucherMembershipType;
        if (num11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num11.intValue());
        }
        Map<String, VoucherLabelGroup> map2 = this.voucherLabelMap;
        if (map2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map2.size());
            for (Map.Entry<String, VoucherLabelGroup> entry2 : map2.entrySet()) {
                parcel.writeString(entry2.getKey());
                VoucherLabelGroup value = entry2.getValue();
                if (value == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    value.writeToParcel(parcel, i);
                }
            }
        }
        VoucherCountdown voucherCountdown = this.countdown;
        if (voucherCountdown == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            voucherCountdown.writeToParcel(parcel, i);
        }
    }

    public final BCMStandardTrack getBcmStandardTrack() {
        return this.bcmStandardTrack;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final Long getClaimTime() {
        return this.claimTime;
    }

    public final Integer getClaimUserType() {
        return this.claimUserType;
    }

    public final Integer getCostRole() {
        return this.costRole;
    }

    public final String getCostRoleText() {
        return this.costRoleText;
    }

    public final Integer getCostType() {
        return this.costType;
    }

    public final VoucherCountdown getCountdown() {
        return this.countdown;
    }

    public final String getCurrencySymbol() {
        return this.currencySymbol;
    }

    public final String getDaInfo() {
        return this.daInfo;
    }

    public final String getDiscountLimitText() {
        return this.discountLimitText;
    }

    public final String getDiscountText() {
        return this.discountText;
    }

    public final List<DiscountView> getDiscountViews() {
        return this.discountViews;
    }

    public final String getExclusionsText() {
        return this.exclusionsText;
    }

    public final String getFullVapSchema() {
        return this.fullVapSchema;
    }

    public final List<InstanceInfo> getInstanceInfoList() {
        return this.instanceInfoList;
    }

    public final VoucherInteractiveInfo getInteractiveInfo() {
        return this.interactiveInfo;
    }

    public final List<VoucherLabel> getLabels() {
        return this.labels;
    }

    public final String getMainOrderID() {
        return this.mainOrderID;
    }

    public final String getOdpSchema() {
        return this.odpSchema;
    }

    public final String getOrientationText() {
        return this.orientationText;
    }

    public final String getPromotionID() {
        return this.promotionID;
    }

    public final Integer getReductionType() {
        return this.reductionType;
    }

    public final String getScopeText() {
        return this.scopeText;
    }

    public final Boolean getSelected() {
        return this.selected;
    }

    public final String getShippingDiscountText() {
        return this.shippingDiscountText;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final String getStatusText() {
        return this.statusText;
    }

    public final String getThresholdText() {
        return this.thresholdText;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Map<String, String> getTransparentFields() {
        return this.transparentFields;
    }

    public final Long getUsableEndTime() {
        return this.usableEndTime;
    }

    public final Long getUsableStartTime() {
        return this.usableStartTime;
    }

    public final String getUseLimitText() {
        return this.useLimitText;
    }

    public final Integer getUseLimitType() {
        return this.useLimitType;
    }

    public final String getValidTimeText() {
        return this.validTimeText;
    }

    public final Integer getValidTimeTextStyle() {
        return this.validTimeTextStyle;
    }

    public final String getVapSchema() {
        return this.vapSchema;
    }

    public final Integer getVapSchemaType() {
        return this.vapSchemaType;
    }

    public final String getVoucherBusinessType() {
        return this.voucherBusinessType;
    }

    public final Integer getVoucherCount() {
        return this.voucherCount;
    }

    public final Integer getVoucherDisplayType() {
        return this.voucherDisplayType;
    }

    public final String getVoucherID() {
        return this.voucherID;
    }

    public final Map<String, VoucherLabelGroup> getVoucherLabelMap() {
        return this.voucherLabelMap;
    }

    public final Integer getVoucherMembershipType() {
        return this.voucherMembershipType;
    }

    public final String getVoucherReminderText() {
        return this.voucherReminderText;
    }

    public final String getVoucherTypeID() {
        return this.voucherTypeID;
    }

    public final Boolean isBest() {
        return this.isBest;
    }

    public final void setButtonText(String str) {
        this.buttonText = str;
    }

    public final void setVapSchema(String str) {
        this.vapSchema = str;
    }

    public final void setVoucherID(String str) {
        this.voucherID = str;
    }

    public Voucher(String str, String str2, List<InstanceInfo> list, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Long l, Long l2, Long l3, String str3, String str4, Boolean bool, String str5, Boolean bool2, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, Integer num7, String str19, String str20, List<DiscountView> list2, String str21, Integer num8, Integer num9, VoucherInteractiveInfo voucherInteractiveInfo, String str22, String str23, List<VoucherLabel> list3, String str24, Integer num10, BCMStandardTrack bCMStandardTrack, Map<String, String> map, Integer num11, Map<String, VoucherLabelGroup> map2, VoucherCountdown voucherCountdown) {
        this.voucherID = str;
        this.voucherTypeID = str2;
        this.instanceInfoList = list;
        this.status = num;
        this.costType = num2;
        this.costRole = num3;
        this.reductionType = num4;
        this.claimUserType = num5;
        this.useLimitType = num6;
        this.claimTime = l;
        this.usableStartTime = l2;
        this.usableEndTime = l3;
        this.mainOrderID = str3;
        this.voucherBusinessType = str4;
        this.selected = bool;
        this.promotionID = str5;
        this.isBest = bool2;
        this.statusText = str6;
        this.costRoleText = str7;
        this.discountText = str8;
        this.shippingDiscountText = str9;
        this.thresholdText = str10;
        this.useLimitText = str11;
        this.orientationText = str12;
        this.odpSchema = str13;
        this.scopeText = str14;
        this.exclusionsText = str15;
        this.currencySymbol = str16;
        this.buttonText = str17;
        this.validTimeText = str18;
        this.validTimeTextStyle = num7;
        this.vapSchema = str19;
        this.fullVapSchema = str20;
        this.discountViews = list2;
        this.daInfo = str21;
        this.vapSchemaType = num8;
        this.voucherDisplayType = num9;
        this.interactiveInfo = voucherInteractiveInfo;
        this.title = str22;
        this.discountLimitText = str23;
        this.labels = list3;
        this.voucherReminderText = str24;
        this.voucherCount = num10;
        this.bcmStandardTrack = bCMStandardTrack;
        this.transparentFields = map;
        this.voucherMembershipType = num11;
        this.voucherLabelMap = map2;
        this.countdown = voucherCountdown;
    }
}
