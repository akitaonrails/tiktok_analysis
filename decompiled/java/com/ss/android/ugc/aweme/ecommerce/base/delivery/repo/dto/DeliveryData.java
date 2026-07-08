package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C09CT;
import X.C13BV;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ChangeLocationData;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DeliveryData;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DispatchFrom;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DispatchTo;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticPanelModule;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ShippingPolicyModule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MultiLogisticsPanelInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShippingTOAddressInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PreOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class DeliveryData implements Parcelable {

    @C09CT("address_num_threshold")
    public final Integer addressThreshold;

    @C09CT("shipping_address_list")
    public final List<ReachableAddress> addresses;

    @C09CT("change_location_data")
    public final ChangeLocationData changeLocationData;

    @C09CT("change_location_selections")
    public final List<ChangeLocationData> changeLocationSelections;

    @C09CT("dispatch_from")
    public final DispatchFrom dispatchFrom;

    @C09CT("dispatch_to")
    public final DispatchTo dispatchTo;

    @C09CT("exception_ux")
    public final ExceptionUX exceptionUX;

    @C09CT("is_delivery_selectable")
    public final Boolean isDeliverySelectable;

    @C09CT("logistic_panel_module")
    public final LogisticPanelModule logisticPanelModule;

    @C09CT("logistics")
    public final List<LogisticDTO> logistics;

    @C09CT("multi_logistics_panel_info")
    public final MultiLogisticsPanelInfo multiLogisticsPanelInfo;

    @C09CT("pdp_logistics_express")
    public final List<LogisticDTO> pdpLogisticExpress;

    @C09CT("pdp_logistic_module")
    public final PDPLogisticModule pdpLogisticModule;

    @C09CT("pre_order_info")
    public final PreOrderInfo preOrderInfo;

    @C09CT("policy_statement")
    public final ECRichText privacyPolicyStatement;

    @C09CT("shipping_policy_module")
    public final ShippingPolicyModule shippingPolicyModule;

    @C09CT("shipping_right_list")
    public final List<LogisticLinkRichText> shippingRightsList;

    @C09CT("shipping_to_address_info")
    public final ShippingTOAddressInfo shippingToAddressInfo;

    @C09CT("show_voucher")
    public final Voucher showVoucher;
    public static final Parcelable.Creator<DeliveryData> CREATOR = new Parcelable.Creator<DeliveryData>() { // from class: X.03FO
        @Override // android.os.Parcelable.Creator
        public final DeliveryData createFromParcel(Parcel parcel) {
            MultiLogisticsPanelInfo multiLogisticsPanelInfoCreateFromParcel;
            ArrayList arrayList;
            ArrayList arrayList2;
            DispatchFrom dispatchFromCreateFromParcel;
            Voucher voucherCreateFromParcel;
            DispatchTo dispatchToCreateFromParcel;
            ShippingTOAddressInfo shippingTOAddressInfoCreateFromParcel;
            ArrayList arrayList3;
            ArrayList arrayList4;
            PreOrderInfo preOrderInfoCreateFromParcel;
            PDPLogisticModule pDPLogisticModuleCreateFromParcel;
            ChangeLocationData changeLocationDataCreateFromParcel;
            LogisticPanelModule logisticPanelModuleCreateFromParcel;
            ArrayList arrayList5;
            ShippingPolicyModule shippingPolicyModuleCreateFromParcel;
            Integer numValueOf;
            boolean z;
            Boolean boolValueOf;
            if (parcel.readInt() == 0) {
                multiLogisticsPanelInfoCreateFromParcel = null;
            } else {
                multiLogisticsPanelInfoCreateFromParcel = MultiLogisticsPanelInfo.CREATOR.createFromParcel(parcel);
            }
            MultiLogisticsPanelInfo multiLogisticsPanelInfo = multiLogisticsPanelInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(LogisticDTO.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(ReachableAddress.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                dispatchFromCreateFromParcel = null;
            } else {
                dispatchFromCreateFromParcel = DispatchFrom.CREATOR.createFromParcel(parcel);
            }
            DispatchFrom dispatchFrom = dispatchFromCreateFromParcel;
            if (parcel.readInt() == 0) {
                voucherCreateFromParcel = null;
            } else {
                voucherCreateFromParcel = Voucher.CREATOR.createFromParcel(parcel);
            }
            Voucher voucher = voucherCreateFromParcel;
            ExceptionUX exceptionUX = (ExceptionUX) parcel.readParcelable(DeliveryData.class.getClassLoader());
            if (parcel.readInt() == 0) {
                dispatchToCreateFromParcel = null;
            } else {
                dispatchToCreateFromParcel = DispatchTo.CREATOR.createFromParcel(parcel);
            }
            DispatchTo dispatchTo = dispatchToCreateFromParcel;
            if (parcel.readInt() == 0) {
                shippingTOAddressInfoCreateFromParcel = null;
            } else {
                shippingTOAddressInfoCreateFromParcel = ShippingTOAddressInfo.CREATOR.createFromParcel(parcel);
            }
            ShippingTOAddressInfo shippingTOAddressInfo = shippingTOAddressInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i5 = parcel.readInt();
                arrayList3 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList3.add(LogisticDTO.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int i7 = parcel.readInt();
                arrayList4 = new ArrayList(i7);
                for (int i8 = 0; i8 != i7; i8++) {
                    arrayList4.add(LogisticLinkRichText.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                preOrderInfoCreateFromParcel = null;
            } else {
                preOrderInfoCreateFromParcel = PreOrderInfo.CREATOR.createFromParcel(parcel);
            }
            PreOrderInfo preOrderInfo = preOrderInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                pDPLogisticModuleCreateFromParcel = null;
            } else {
                pDPLogisticModuleCreateFromParcel = PDPLogisticModule.CREATOR.createFromParcel(parcel);
            }
            PDPLogisticModule pDPLogisticModule = pDPLogisticModuleCreateFromParcel;
            if (parcel.readInt() == 0) {
                changeLocationDataCreateFromParcel = null;
            } else {
                changeLocationDataCreateFromParcel = ChangeLocationData.CREATOR.createFromParcel(parcel);
            }
            ChangeLocationData changeLocationData = changeLocationDataCreateFromParcel;
            if (parcel.readInt() == 0) {
                logisticPanelModuleCreateFromParcel = null;
            } else {
                logisticPanelModuleCreateFromParcel = LogisticPanelModule.CREATOR.createFromParcel(parcel);
            }
            LogisticPanelModule logisticPanelModule = logisticPanelModuleCreateFromParcel;
            if (parcel.readInt() == 0) {
                arrayList5 = null;
            } else {
                int i9 = parcel.readInt();
                arrayList5 = new ArrayList(i9);
                for (int i10 = 0; i10 != i9; i10++) {
                    arrayList5.add(ChangeLocationData.CREATOR.createFromParcel(parcel));
                }
            }
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(DeliveryData.class.getClassLoader());
            if (parcel.readInt() == 0) {
                shippingPolicyModuleCreateFromParcel = null;
            } else {
                shippingPolicyModuleCreateFromParcel = ShippingPolicyModule.CREATOR.createFromParcel(parcel);
            }
            ShippingPolicyModule shippingPolicyModule = shippingPolicyModuleCreateFromParcel;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
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
            return new DeliveryData(multiLogisticsPanelInfo, arrayList, arrayList2, dispatchFrom, voucher, exceptionUX, dispatchTo, shippingTOAddressInfo, arrayList3, arrayList4, preOrderInfo, pDPLogisticModule, changeLocationData, logisticPanelModule, arrayList5, eCRichText, shippingPolicyModule, numValueOf, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final DeliveryData[] newArray(int i) {
            return new DeliveryData[i];
        }
    };
    public static final int $stable = 8;

    public DeliveryData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryData)) {
            return false;
        }
        DeliveryData deliveryData = (DeliveryData) obj;
        return Intrinsics.LJFF(this.multiLogisticsPanelInfo, deliveryData.multiLogisticsPanelInfo) && Intrinsics.LJFF(this.logistics, deliveryData.logistics) && Intrinsics.LJFF(this.addresses, deliveryData.addresses) && Intrinsics.LJFF(this.dispatchFrom, deliveryData.dispatchFrom) && Intrinsics.LJFF(this.showVoucher, deliveryData.showVoucher) && Intrinsics.LJFF(this.exceptionUX, deliveryData.exceptionUX) && Intrinsics.LJFF(this.dispatchTo, deliveryData.dispatchTo) && Intrinsics.LJFF(this.shippingToAddressInfo, deliveryData.shippingToAddressInfo) && Intrinsics.LJFF(this.pdpLogisticExpress, deliveryData.pdpLogisticExpress) && Intrinsics.LJFF(this.shippingRightsList, deliveryData.shippingRightsList) && Intrinsics.LJFF(this.preOrderInfo, deliveryData.preOrderInfo) && Intrinsics.LJFF(this.pdpLogisticModule, deliveryData.pdpLogisticModule) && Intrinsics.LJFF(this.changeLocationData, deliveryData.changeLocationData) && Intrinsics.LJFF(this.logisticPanelModule, deliveryData.logisticPanelModule) && Intrinsics.LJFF(this.changeLocationSelections, deliveryData.changeLocationSelections) && Intrinsics.LJFF(this.privacyPolicyStatement, deliveryData.privacyPolicyStatement) && Intrinsics.LJFF(this.shippingPolicyModule, deliveryData.shippingPolicyModule) && Intrinsics.LJFF(this.addressThreshold, deliveryData.addressThreshold) && Intrinsics.LJFF(this.isDeliverySelectable, deliveryData.isDeliverySelectable);
    }

    public final int hashCode() {
        MultiLogisticsPanelInfo multiLogisticsPanelInfo = this.multiLogisticsPanelInfo;
        int iHashCode = (multiLogisticsPanelInfo == null ? 0 : multiLogisticsPanelInfo.hashCode()) * 31;
        List<LogisticDTO> list = this.logistics;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<ReachableAddress> list2 = this.addresses;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        DispatchFrom dispatchFrom = this.dispatchFrom;
        int iHashCode4 = (iHashCode3 + (dispatchFrom == null ? 0 : dispatchFrom.hashCode())) * 31;
        Voucher voucher = this.showVoucher;
        int iHashCode5 = (iHashCode4 + (voucher == null ? 0 : voucher.hashCode())) * 31;
        ExceptionUX exceptionUX = this.exceptionUX;
        int iHashCode6 = (iHashCode5 + (exceptionUX == null ? 0 : exceptionUX.hashCode())) * 31;
        DispatchTo dispatchTo = this.dispatchTo;
        int iHashCode7 = (iHashCode6 + (dispatchTo == null ? 0 : dispatchTo.hashCode())) * 31;
        ShippingTOAddressInfo shippingTOAddressInfo = this.shippingToAddressInfo;
        int iHashCode8 = (iHashCode7 + (shippingTOAddressInfo == null ? 0 : shippingTOAddressInfo.hashCode())) * 31;
        List<LogisticDTO> list3 = this.pdpLogisticExpress;
        int iHashCode9 = (iHashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<LogisticLinkRichText> list4 = this.shippingRightsList;
        int iHashCode10 = (iHashCode9 + (list4 == null ? 0 : list4.hashCode())) * 31;
        PreOrderInfo preOrderInfo = this.preOrderInfo;
        int iHashCode11 = (iHashCode10 + (preOrderInfo == null ? 0 : preOrderInfo.hashCode())) * 31;
        PDPLogisticModule pDPLogisticModule = this.pdpLogisticModule;
        int iHashCode12 = (iHashCode11 + (pDPLogisticModule == null ? 0 : pDPLogisticModule.hashCode())) * 31;
        ChangeLocationData changeLocationData = this.changeLocationData;
        int iHashCode13 = (iHashCode12 + (changeLocationData == null ? 0 : changeLocationData.hashCode())) * 31;
        LogisticPanelModule logisticPanelModule = this.logisticPanelModule;
        int iHashCode14 = (iHashCode13 + (logisticPanelModule == null ? 0 : logisticPanelModule.hashCode())) * 31;
        List<ChangeLocationData> list5 = this.changeLocationSelections;
        int iHashCode15 = (iHashCode14 + (list5 == null ? 0 : list5.hashCode())) * 31;
        ECRichText eCRichText = this.privacyPolicyStatement;
        int iHashCode16 = (iHashCode15 + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        ShippingPolicyModule shippingPolicyModule = this.shippingPolicyModule;
        int iHashCode17 = (iHashCode16 + (shippingPolicyModule == null ? 0 : shippingPolicyModule.hashCode())) * 31;
        Integer num = this.addressThreshold;
        int iHashCode18 = (iHashCode17 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isDeliverySelectable;
        return iHashCode18 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "DeliveryData(multiLogisticsPanelInfo=" + this.multiLogisticsPanelInfo + ", logistics=" + this.logistics + ", addresses=" + this.addresses + ", dispatchFrom=" + this.dispatchFrom + ", showVoucher=" + this.showVoucher + ", exceptionUX=" + this.exceptionUX + ", dispatchTo=" + this.dispatchTo + ", shippingToAddressInfo=" + this.shippingToAddressInfo + ", pdpLogisticExpress=" + this.pdpLogisticExpress + ", shippingRightsList=" + this.shippingRightsList + ", preOrderInfo=" + this.preOrderInfo + ", pdpLogisticModule=" + this.pdpLogisticModule + ", changeLocationData=" + this.changeLocationData + ", logisticPanelModule=" + this.logisticPanelModule + ", changeLocationSelections=" + this.changeLocationSelections + ", privacyPolicyStatement=" + this.privacyPolicyStatement + ", shippingPolicyModule=" + this.shippingPolicyModule + ", addressThreshold=" + this.addressThreshold + ", isDeliverySelectable=" + this.isDeliverySelectable + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MultiLogisticsPanelInfo multiLogisticsPanelInfo = this.multiLogisticsPanelInfo;
        if (multiLogisticsPanelInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            multiLogisticsPanelInfo.writeToParcel(parcel, i);
        }
        List<LogisticDTO> list = this.logistics;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<LogisticDTO> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        List<ReachableAddress> list2 = this.addresses;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<ReachableAddress> it3 = list2.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }
        DispatchFrom dispatchFrom = this.dispatchFrom;
        if (dispatchFrom == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dispatchFrom.writeToParcel(parcel, i);
        }
        Voucher voucher = this.showVoucher;
        if (voucher == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            voucher.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.exceptionUX, i);
        DispatchTo dispatchTo = this.dispatchTo;
        if (dispatchTo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dispatchTo.writeToParcel(parcel, i);
        }
        ShippingTOAddressInfo shippingTOAddressInfo = this.shippingToAddressInfo;
        if (shippingTOAddressInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shippingTOAddressInfo.writeToParcel(parcel, i);
        }
        List<LogisticDTO> list3 = this.pdpLogisticExpress;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator<LogisticDTO> it4 = list3.iterator();
            while (it4.hasNext()) {
                it4.next().writeToParcel(parcel, i);
            }
        }
        List<LogisticLinkRichText> list4 = this.shippingRightsList;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list4.size());
            Iterator<LogisticLinkRichText> it5 = list4.iterator();
            while (it5.hasNext()) {
                it5.next().writeToParcel(parcel, i);
            }
        }
        PreOrderInfo preOrderInfo = this.preOrderInfo;
        if (preOrderInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            preOrderInfo.writeToParcel(parcel, i);
        }
        PDPLogisticModule pDPLogisticModule = this.pdpLogisticModule;
        if (pDPLogisticModule == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pDPLogisticModule.writeToParcel(parcel, i);
        }
        ChangeLocationData changeLocationData = this.changeLocationData;
        if (changeLocationData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            changeLocationData.writeToParcel(parcel, i);
        }
        LogisticPanelModule logisticPanelModule = this.logisticPanelModule;
        if (logisticPanelModule == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            logisticPanelModule.writeToParcel(parcel, i);
        }
        List<ChangeLocationData> list5 = this.changeLocationSelections;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list5.size());
            Iterator<ChangeLocationData> it6 = list5.iterator();
            while (it6.hasNext()) {
                it6.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeParcelable(this.privacyPolicyStatement, i);
        ShippingPolicyModule shippingPolicyModule = this.shippingPolicyModule;
        if (shippingPolicyModule == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shippingPolicyModule.writeToParcel(parcel, i);
        }
        Integer num = this.addressThreshold;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Boolean bool = this.isDeliverySelectable;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public static DeliveryData LIZ(DeliveryData deliveryData, List list, ChangeLocationData changeLocationData, List list2, int i) {
        MultiLogisticsPanelInfo multiLogisticsPanelInfo;
        List<LogisticDTO> list3;
        DispatchFrom dispatchFrom;
        Voucher voucher;
        ExceptionUX exceptionUX;
        DispatchTo dispatchTo;
        ShippingTOAddressInfo shippingTOAddressInfo;
        List<LogisticDTO> list4;
        List<LogisticLinkRichText> list5;
        PreOrderInfo preOrderInfo;
        PDPLogisticModule pDPLogisticModule;
        LogisticPanelModule logisticPanelModule;
        ECRichText eCRichText;
        ShippingPolicyModule shippingPolicyModule;
        Integer num;
        List list6 = list2;
        ChangeLocationData changeLocationData2 = changeLocationData;
        List list7 = list;
        Boolean bool = null;
        if ((i & 1) != 0) {
            multiLogisticsPanelInfo = deliveryData.multiLogisticsPanelInfo;
        } else {
            multiLogisticsPanelInfo = null;
        }
        if ((i & 2) != 0) {
            list3 = deliveryData.logistics;
        } else {
            list3 = null;
        }
        if ((i & 4) != 0) {
            list7 = deliveryData.addresses;
        }
        if ((i & 8) != 0) {
            dispatchFrom = deliveryData.dispatchFrom;
        } else {
            dispatchFrom = null;
        }
        if ((i & 16) != 0) {
            voucher = deliveryData.showVoucher;
        } else {
            voucher = null;
        }
        if ((i & 32) != 0) {
            exceptionUX = deliveryData.exceptionUX;
        } else {
            exceptionUX = null;
        }
        if ((i & 64) != 0) {
            dispatchTo = deliveryData.dispatchTo;
        } else {
            dispatchTo = null;
        }
        if ((i & 128) != 0) {
            shippingTOAddressInfo = deliveryData.shippingToAddressInfo;
        } else {
            shippingTOAddressInfo = null;
        }
        if ((i & 256) != 0) {
            list4 = deliveryData.pdpLogisticExpress;
        } else {
            list4 = null;
        }
        if ((i & 512) != 0) {
            list5 = deliveryData.shippingRightsList;
        } else {
            list5 = null;
        }
        if ((i & 1024) != 0) {
            preOrderInfo = deliveryData.preOrderInfo;
        } else {
            preOrderInfo = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            pDPLogisticModule = deliveryData.pdpLogisticModule;
        } else {
            pDPLogisticModule = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            changeLocationData2 = deliveryData.changeLocationData;
        }
        if ((i & 8192) != 0) {
            logisticPanelModule = deliveryData.logisticPanelModule;
        } else {
            logisticPanelModule = null;
        }
        if ((i & 16384) != 0) {
            list6 = deliveryData.changeLocationSelections;
        }
        if ((32768 & i) != 0) {
            eCRichText = deliveryData.privacyPolicyStatement;
        } else {
            eCRichText = null;
        }
        if ((65536 & i) != 0) {
            shippingPolicyModule = deliveryData.shippingPolicyModule;
        } else {
            shippingPolicyModule = null;
        }
        if ((131072 & i) != 0) {
            num = deliveryData.addressThreshold;
        } else {
            num = null;
        }
        if ((i & 262144) != 0) {
            bool = deliveryData.isDeliverySelectable;
        }
        return new DeliveryData(multiLogisticsPanelInfo, list3, list7, dispatchFrom, voucher, exceptionUX, dispatchTo, shippingTOAddressInfo, list4, list5, preOrderInfo, pDPLogisticModule, changeLocationData2, logisticPanelModule, list6, eCRichText, shippingPolicyModule, num, bool);
    }

    public DeliveryData(MultiLogisticsPanelInfo multiLogisticsPanelInfo, List<LogisticDTO> list, List<ReachableAddress> list2, DispatchFrom dispatchFrom, Voucher voucher, ExceptionUX exceptionUX, DispatchTo dispatchTo, ShippingTOAddressInfo shippingTOAddressInfo, List<LogisticDTO> list3, List<LogisticLinkRichText> list4, PreOrderInfo preOrderInfo, PDPLogisticModule pDPLogisticModule, ChangeLocationData changeLocationData, LogisticPanelModule logisticPanelModule, List<ChangeLocationData> list5, ECRichText eCRichText, ShippingPolicyModule shippingPolicyModule, Integer num, Boolean bool) {
        this.multiLogisticsPanelInfo = multiLogisticsPanelInfo;
        this.logistics = list;
        this.addresses = list2;
        this.dispatchFrom = dispatchFrom;
        this.showVoucher = voucher;
        this.exceptionUX = exceptionUX;
        this.dispatchTo = dispatchTo;
        this.shippingToAddressInfo = shippingTOAddressInfo;
        this.pdpLogisticExpress = list3;
        this.shippingRightsList = list4;
        this.preOrderInfo = preOrderInfo;
        this.pdpLogisticModule = pDPLogisticModule;
        this.changeLocationData = changeLocationData;
        this.logisticPanelModule = logisticPanelModule;
        this.changeLocationSelections = list5;
        this.privacyPolicyStatement = eCRichText;
        this.shippingPolicyModule = shippingPolicyModule;
        this.addressThreshold = num;
        this.isDeliverySelectable = bool;
    }

    public DeliveryData(MultiLogisticsPanelInfo multiLogisticsPanelInfo, List list, List list2, DispatchFrom dispatchFrom, Voucher voucher, ExceptionUX exceptionUX, DispatchTo dispatchTo, ShippingTOAddressInfo shippingTOAddressInfo, List list3, List list4, PreOrderInfo preOrderInfo, PDPLogisticModule pDPLogisticModule, ChangeLocationData changeLocationData, LogisticPanelModule logisticPanelModule, List list5, ECRichText eCRichText, ShippingPolicyModule shippingPolicyModule, Integer num, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : multiLogisticsPanelInfo, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? C13BV.INSTANCE : list2, (i & 8) != 0 ? null : dispatchFrom, (i & 16) != 0 ? null : voucher, (i & 32) != 0 ? null : exceptionUX, (i & 64) != 0 ? null : dispatchTo, (i & 128) != 0 ? null : shippingTOAddressInfo, (i & 256) != 0 ? null : list3, (i & 512) != 0 ? null : list4, (i & 1024) != 0 ? null : preOrderInfo, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : pDPLogisticModule, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : changeLocationData, (i & 8192) != 0 ? null : logisticPanelModule, (i & 16384) != 0 ? null : list5, (32768 & i) != 0 ? null : eCRichText, (65536 & i) != 0 ? null : shippingPolicyModule, (131072 & i) != 0 ? null : num, (i & 262144) != 0 ? null : bool);
    }
}
