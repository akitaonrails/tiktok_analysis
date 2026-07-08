package com.ss.android.ugc.aweme.ecommerce.base.delivery.vm;

import X.C004I;
import X.C03FV;
import X.C13BV;
import X.C786410Ut5;
import X.C948003nC;
import X.C969303qd;
import X.EnumC966703qD;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.PudoAddress;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DispatchFrom;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ShippingPolicyModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShippingTOAddressInfo;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class DeliveryPanelState implements C004I {
    public static final int $stable = 8;
    public final List<Object> addressRenderData;
    public final boolean apply;
    public final Address centerAddress;
    public final String changeAddressJumpSchema;
    public final C969303qd changePage;
    public final ExceptionUX claimVoucherExceptionUX;
    public final DispatchFrom dispatchInfo;
    public final Set<String> exposedAddOnItems;
    public final Set<LogisticDTO> exposedItems;
    public final int getPudoAddressStatus;
    public final boolean hasMapLocationChanged;
    public final List<Object> logisticList;
    public final List<LogisticDTO> logistics;
    public final PDPLogisticModule pdpLogisticModule;
    public final List<Object> pickUpList;
    public final PudoAddress pickupSelectAddress;
    public final Integer pickupSelectIdx;
    public final ECRichText privacyPolicyStatement;
    public final LogisticDTO pudoSelectedLogistic;
    public final String pudoSource;
    public final int savePickUpStatus;
    public final C948003nC<Object> savePickUpToast;
    public final LogisticDTO selectedLogistic;
    public final C03FV selectedShipToInfo;
    public final ShippingPolicyModule shippingPolicyModule;
    public final ShippingTOAddressInfo shippingToAddressInfo;
    public final int status;
    public final int tab;

    public DeliveryPanelState() {
        this(null, false, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, false, 0, null, null, null, 0, null, 0, null, null, null, null, 268435455, null);
    }

    public final DeliveryPanelState copy(C969303qd c969303qd, boolean z, LogisticDTO logisticDTO, C03FV c03fv, List<? extends Object> list, int i, List<? extends Object> list2, ExceptionUX exceptionUX, Set<LogisticDTO> set, Set<String> set2, DispatchFrom dispatchFrom, ShippingTOAddressInfo shippingTOAddressInfo, List<LogisticDTO> list3, PDPLogisticModule pDPLogisticModule, ECRichText eCRichText, ShippingPolicyModule shippingPolicyModule, boolean z2, int i2, PudoAddress pudoAddress, List<? extends Object> list4, Integer num, int i3, C948003nC<Object> c948003nC, int i4, LogisticDTO logisticDTO2, Address address, String str, String str2) {
        return new DeliveryPanelState(c969303qd, z, logisticDTO, c03fv, list, i, list2, exceptionUX, set, set2, dispatchFrom, shippingTOAddressInfo, list3, pDPLogisticModule, eCRichText, shippingPolicyModule, z2, i2, pudoAddress, list4, num, i3, c948003nC, i4, logisticDTO2, address, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryPanelState)) {
            return false;
        }
        DeliveryPanelState deliveryPanelState = (DeliveryPanelState) obj;
        return Intrinsics.LJFF(this.changePage, deliveryPanelState.changePage) && this.apply == deliveryPanelState.apply && Intrinsics.LJFF(this.selectedLogistic, deliveryPanelState.selectedLogistic) && Intrinsics.LJFF(this.selectedShipToInfo, deliveryPanelState.selectedShipToInfo) && Intrinsics.LJFF(this.addressRenderData, deliveryPanelState.addressRenderData) && this.status == deliveryPanelState.status && Intrinsics.LJFF(this.logisticList, deliveryPanelState.logisticList) && Intrinsics.LJFF(this.claimVoucherExceptionUX, deliveryPanelState.claimVoucherExceptionUX) && Intrinsics.LJFF(this.exposedItems, deliveryPanelState.exposedItems) && Intrinsics.LJFF(this.exposedAddOnItems, deliveryPanelState.exposedAddOnItems) && Intrinsics.LJFF(this.dispatchInfo, deliveryPanelState.dispatchInfo) && Intrinsics.LJFF(this.shippingToAddressInfo, deliveryPanelState.shippingToAddressInfo) && Intrinsics.LJFF(this.logistics, deliveryPanelState.logistics) && Intrinsics.LJFF(this.pdpLogisticModule, deliveryPanelState.pdpLogisticModule) && Intrinsics.LJFF(this.privacyPolicyStatement, deliveryPanelState.privacyPolicyStatement) && Intrinsics.LJFF(this.shippingPolicyModule, deliveryPanelState.shippingPolicyModule) && this.hasMapLocationChanged == deliveryPanelState.hasMapLocationChanged && this.tab == deliveryPanelState.tab && Intrinsics.LJFF(this.pickupSelectAddress, deliveryPanelState.pickupSelectAddress) && Intrinsics.LJFF(this.pickUpList, deliveryPanelState.pickUpList) && Intrinsics.LJFF(this.pickupSelectIdx, deliveryPanelState.pickupSelectIdx) && this.savePickUpStatus == deliveryPanelState.savePickUpStatus && Intrinsics.LJFF(this.savePickUpToast, deliveryPanelState.savePickUpToast) && this.getPudoAddressStatus == deliveryPanelState.getPudoAddressStatus && Intrinsics.LJFF(this.pudoSelectedLogistic, deliveryPanelState.pudoSelectedLogistic) && Intrinsics.LJFF(this.centerAddress, deliveryPanelState.centerAddress) && Intrinsics.LJFF(this.pudoSource, deliveryPanelState.pudoSource) && Intrinsics.LJFF(this.changeAddressJumpSchema, deliveryPanelState.changeAddressJumpSchema);
    }

    public int hashCode() {
        int iHashCode = ((this.changePage.hashCode() * 31) + C786410Ut5.Z2(this.apply)) * 31;
        LogisticDTO logisticDTO = this.selectedLogistic;
        int iHashCode2 = (((((((iHashCode + (logisticDTO == null ? 0 : logisticDTO.hashCode())) * 31) + this.selectedShipToInfo.hashCode()) * 31) + this.addressRenderData.hashCode()) * 31) + this.status) * 31;
        List<Object> list = this.logisticList;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        ExceptionUX exceptionUX = this.claimVoucherExceptionUX;
        int iHashCode4 = (((((iHashCode3 + (exceptionUX == null ? 0 : exceptionUX.hashCode())) * 31) + this.exposedItems.hashCode()) * 31) + this.exposedAddOnItems.hashCode()) * 31;
        DispatchFrom dispatchFrom = this.dispatchInfo;
        int iHashCode5 = (iHashCode4 + (dispatchFrom == null ? 0 : dispatchFrom.hashCode())) * 31;
        ShippingTOAddressInfo shippingTOAddressInfo = this.shippingToAddressInfo;
        int iHashCode6 = (iHashCode5 + (shippingTOAddressInfo == null ? 0 : shippingTOAddressInfo.hashCode())) * 31;
        List<LogisticDTO> list2 = this.logistics;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        PDPLogisticModule pDPLogisticModule = this.pdpLogisticModule;
        int iHashCode8 = (iHashCode7 + (pDPLogisticModule == null ? 0 : pDPLogisticModule.hashCode())) * 31;
        ECRichText eCRichText = this.privacyPolicyStatement;
        int iHashCode9 = (iHashCode8 + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        ShippingPolicyModule shippingPolicyModule = this.shippingPolicyModule;
        int iHashCode10 = (((((iHashCode9 + (shippingPolicyModule == null ? 0 : shippingPolicyModule.hashCode())) * 31) + C786410Ut5.Z2(this.hasMapLocationChanged)) * 31) + this.tab) * 31;
        PudoAddress pudoAddress = this.pickupSelectAddress;
        int iHashCode11 = (iHashCode10 + (pudoAddress == null ? 0 : pudoAddress.hashCode())) * 31;
        List<Object> list3 = this.pickUpList;
        int iHashCode12 = (iHashCode11 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num = this.pickupSelectIdx;
        int iHashCode13 = (((iHashCode12 + (num == null ? 0 : num.hashCode())) * 31) + this.savePickUpStatus) * 31;
        C948003nC<Object> c948003nC = this.savePickUpToast;
        int iHashCode14 = (((iHashCode13 + (c948003nC == null ? 0 : c948003nC.hashCode())) * 31) + this.getPudoAddressStatus) * 31;
        LogisticDTO logisticDTO2 = this.pudoSelectedLogistic;
        int iHashCode15 = (iHashCode14 + (logisticDTO2 == null ? 0 : logisticDTO2.hashCode())) * 31;
        Address address = this.centerAddress;
        int iHashCode16 = (iHashCode15 + (address == null ? 0 : address.hashCode())) * 31;
        String str = this.pudoSource;
        int iHashCode17 = (iHashCode16 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.changeAddressJumpSchema;
        return iHashCode17 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "DeliveryPanelState(changePage=" + this.changePage + ", apply=" + this.apply + ", selectedLogistic=" + this.selectedLogistic + ", selectedShipToInfo=" + this.selectedShipToInfo + ", addressRenderData=" + this.addressRenderData + ", status=" + this.status + ", logisticList=" + this.logisticList + ", claimVoucherExceptionUX=" + this.claimVoucherExceptionUX + ", exposedItems=" + this.exposedItems + ", exposedAddOnItems=" + this.exposedAddOnItems + ", dispatchInfo=" + this.dispatchInfo + ", shippingToAddressInfo=" + this.shippingToAddressInfo + ", logistics=" + this.logistics + ", pdpLogisticModule=" + this.pdpLogisticModule + ", privacyPolicyStatement=" + this.privacyPolicyStatement + ", shippingPolicyModule=" + this.shippingPolicyModule + ", hasMapLocationChanged=" + this.hasMapLocationChanged + ", tab=" + this.tab + ", pickupSelectAddress=" + this.pickupSelectAddress + ", pickUpList=" + this.pickUpList + ", pickupSelectIdx=" + this.pickupSelectIdx + ", savePickUpStatus=" + this.savePickUpStatus + ", savePickUpToast=" + this.savePickUpToast + ", getPudoAddressStatus=" + this.getPudoAddressStatus + ", pudoSelectedLogistic=" + this.pudoSelectedLogistic + ", centerAddress=" + this.centerAddress + ", pudoSource=" + this.pudoSource + ", changeAddressJumpSchema=" + this.changeAddressJumpSchema + ')';
    }

    public final List<Object> getAddressRenderData() {
        return this.addressRenderData;
    }

    public final boolean getApply() {
        return this.apply;
    }

    public final Address getCenterAddress() {
        return this.centerAddress;
    }

    public final String getChangeAddressJumpSchema() {
        return this.changeAddressJumpSchema;
    }

    public final C969303qd getChangePage() {
        return this.changePage;
    }

    public final ExceptionUX getClaimVoucherExceptionUX() {
        return this.claimVoucherExceptionUX;
    }

    public final DispatchFrom getDispatchInfo() {
        return this.dispatchInfo;
    }

    public final Set<String> getExposedAddOnItems() {
        return this.exposedAddOnItems;
    }

    public final Set<LogisticDTO> getExposedItems() {
        return this.exposedItems;
    }

    public final int getGetPudoAddressStatus() {
        return this.getPudoAddressStatus;
    }

    public final boolean getHasMapLocationChanged() {
        return this.hasMapLocationChanged;
    }

    public final List<Object> getLogisticList() {
        return this.logisticList;
    }

    public final List<LogisticDTO> getLogistics() {
        return this.logistics;
    }

    public final PDPLogisticModule getPdpLogisticModule() {
        return this.pdpLogisticModule;
    }

    public final List<Object> getPickUpList() {
        return this.pickUpList;
    }

    public final PudoAddress getPickupSelectAddress() {
        return this.pickupSelectAddress;
    }

    public final Integer getPickupSelectIdx() {
        return this.pickupSelectIdx;
    }

    public final ECRichText getPrivacyPolicyStatement() {
        return this.privacyPolicyStatement;
    }

    public final LogisticDTO getPudoSelectedLogistic() {
        return this.pudoSelectedLogistic;
    }

    public final String getPudoSource() {
        return this.pudoSource;
    }

    public final int getSavePickUpStatus() {
        return this.savePickUpStatus;
    }

    public final C948003nC<Object> getSavePickUpToast() {
        return this.savePickUpToast;
    }

    public final LogisticDTO getSelectedLogistic() {
        return this.selectedLogistic;
    }

    public final C03FV getSelectedShipToInfo() {
        return this.selectedShipToInfo;
    }

    public final ShippingPolicyModule getShippingPolicyModule() {
        return this.shippingPolicyModule;
    }

    public final ShippingTOAddressInfo getShippingToAddressInfo() {
        return this.shippingToAddressInfo;
    }

    public final int getStatus() {
        return this.status;
    }

    public final int getTab() {
        return this.tab;
    }

    public final boolean canSelectLogistic(Parcelable parcelable) {
        boolean z;
        boolean z2;
        boolean zLJFF;
        ReachableAddress reachableAddress;
        if (this.selectedShipToInfo.LIZ == null) {
            z = true;
        } else {
            z = false;
        }
        if (!this.addressRenderData.isEmpty()) {
            Iterator<Object> it2 = this.addressRenderData.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if ((next instanceof ReachableAddress) && (reachableAddress = (ReachableAddress) next) != null && Intrinsics.LJFF(reachableAddress.reachable, Boolean.TRUE)) {
                    if (next != null) {
                        z2 = false;
                    }
                }
            }
            z2 = true;
        } else {
            z2 = true;
        }
        boolean z3 = parcelable instanceof DeliveryPanelStarter.EnterParamForProductDetailPage;
        ReachableAddress reachableAddressLIZ = this.selectedShipToInfo.LIZ();
        if (reachableAddressLIZ == null) {
            zLJFF = false;
        } else {
            zLJFF = Intrinsics.LJFF(reachableAddressLIZ.reachable, Boolean.FALSE);
        }
        if (((!z || !z2) && !zLJFF) || !z3) {
            return true;
        }
        return false;
    }

    public DeliveryPanelState(C969303qd c969303qd, boolean z, LogisticDTO logisticDTO, C03FV c03fv, List<? extends Object> list, int i, List<? extends Object> list2, ExceptionUX exceptionUX, Set<LogisticDTO> set, Set<String> set2, DispatchFrom dispatchFrom, ShippingTOAddressInfo shippingTOAddressInfo, List<LogisticDTO> list3, PDPLogisticModule pDPLogisticModule, ECRichText eCRichText, ShippingPolicyModule shippingPolicyModule, boolean z2, int i2, PudoAddress pudoAddress, List<? extends Object> list4, Integer num, int i3, C948003nC<Object> c948003nC, int i4, LogisticDTO logisticDTO2, Address address, String str, String str2) {
        this.changePage = c969303qd;
        this.apply = z;
        this.selectedLogistic = logisticDTO;
        this.selectedShipToInfo = c03fv;
        this.addressRenderData = list;
        this.status = i;
        this.logisticList = list2;
        this.claimVoucherExceptionUX = exceptionUX;
        this.exposedItems = set;
        this.exposedAddOnItems = set2;
        this.dispatchInfo = dispatchFrom;
        this.shippingToAddressInfo = shippingTOAddressInfo;
        this.logistics = list3;
        this.pdpLogisticModule = pDPLogisticModule;
        this.privacyPolicyStatement = eCRichText;
        this.shippingPolicyModule = shippingPolicyModule;
        this.hasMapLocationChanged = z2;
        this.tab = i2;
        this.pickupSelectAddress = pudoAddress;
        this.pickUpList = list4;
        this.pickupSelectIdx = num;
        this.savePickUpStatus = i3;
        this.savePickUpToast = c948003nC;
        this.getPudoAddressStatus = i4;
        this.pudoSelectedLogistic = logisticDTO2;
        this.centerAddress = address;
        this.pudoSource = str;
        this.changeAddressJumpSchema = str2;
    }

    public DeliveryPanelState(C969303qd c969303qd, boolean z, LogisticDTO logisticDTO, C03FV c03fv, List list, int i, List list2, ExceptionUX exceptionUX, Set set, Set set2, DispatchFrom dispatchFrom, ShippingTOAddressInfo shippingTOAddressInfo, List list3, PDPLogisticModule pDPLogisticModule, ECRichText eCRichText, ShippingPolicyModule shippingPolicyModule, boolean z2, int i2, PudoAddress pudoAddress, List list4, Integer num, int i3, C948003nC c948003nC, int i4, LogisticDTO logisticDTO2, Address address, String str, String str2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? new C969303qd(EnumC966703qD.NONE) : c969303qd, (i5 & 2) != 0 ? false : z, (i5 & 4) != 0 ? null : logisticDTO, (i5 & 8) != 0 ? new C03FV(null) : c03fv, (i5 & 16) != 0 ? C13BV.INSTANCE : list, (i5 & 32) != 0 ? 0 : i, (i5 & 64) != 0 ? null : list2, (i5 & 128) != 0 ? null : exceptionUX, (i5 & 256) != 0 ? new LinkedHashSet() : set, (i5 & 512) != 0 ? new LinkedHashSet() : set2, (i5 & 1024) != 0 ? null : dispatchFrom, (i5 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : shippingTOAddressInfo, (i5 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : list3, (i5 & 8192) == 0 ? pDPLogisticModule : null, (i5 & 16384) != 0 ? null : eCRichText, (32768 & i5) != 0 ? null : shippingPolicyModule, (65536 & i5) != 0 ? false : z2, (131072 & i5) != 0 ? 1 : i2, (262144 & i5) != 0 ? null : pudoAddress, (524288 & i5) != 0 ? null : list4, (1048576 & i5) != 0 ? null : num, (2097152 & i5) != 0 ? -1 : i3, (4194304 & i5) != 0 ? null : c948003nC, (8388608 & i5) != 0 ? 5 : i4, (16777216 & i5) != 0 ? null : logisticDTO2, (33554432 & i5) != 0 ? null : address, (67108864 & i5) != 0 ? null : str, (i5 & 134217728) != 0 ? null : str2);
    }
}
