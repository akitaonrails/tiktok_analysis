package com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address;

import X.C004I;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ChangeLocationData;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AddressSelectState implements C004I {
    public static final int $stable = 8;
    public final boolean applyBtnEnable;
    public final ChangeLocationData chooseLocation;
    public final int currentAddressSelectType;
    public final LaneParams logDuration;
    public final List<ReachableAddress> reachableAddress;
    public final List<Object> renderDataList;
    public final Object selectCountry;
    public final ReachableAddress selectedAddress;
    public final List<Region> selectedRegions;
    public final int status;

    public AddressSelectState() {
        this(null, 0, null, null, false, 0, null, null, null, null, 1023, null);
    }

    public final AddressSelectState copy(ReachableAddress reachableAddress, int i, List<? extends Object> list, List<Region> list2, boolean z, int i2, Object obj, ChangeLocationData changeLocationData, List<ReachableAddress> list3, LaneParams laneParams) {
        return new AddressSelectState(reachableAddress, i, list, list2, z, i2, obj, changeLocationData, list3, laneParams);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressSelectState)) {
            return false;
        }
        AddressSelectState addressSelectState = (AddressSelectState) obj;
        return Intrinsics.LJFF(this.selectedAddress, addressSelectState.selectedAddress) && this.status == addressSelectState.status && Intrinsics.LJFF(this.renderDataList, addressSelectState.renderDataList) && Intrinsics.LJFF(this.selectedRegions, addressSelectState.selectedRegions) && this.applyBtnEnable == addressSelectState.applyBtnEnable && this.currentAddressSelectType == addressSelectState.currentAddressSelectType && Intrinsics.LJFF(this.selectCountry, addressSelectState.selectCountry) && Intrinsics.LJFF(this.chooseLocation, addressSelectState.chooseLocation) && Intrinsics.LJFF(this.reachableAddress, addressSelectState.reachableAddress) && Intrinsics.LJFF(this.logDuration, addressSelectState.logDuration);
    }

    public int hashCode() {
        ReachableAddress reachableAddress = this.selectedAddress;
        int iHashCode = (((((reachableAddress == null ? 0 : reachableAddress.hashCode()) * 31) + this.status) * 31) + this.renderDataList.hashCode()) * 31;
        List<Region> list = this.selectedRegions;
        int iHashCode2 = (((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + C786410Ut5.Z2(this.applyBtnEnable)) * 31) + this.currentAddressSelectType) * 31;
        Object obj = this.selectCountry;
        int iHashCode3 = (iHashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
        ChangeLocationData changeLocationData = this.chooseLocation;
        int iHashCode4 = (iHashCode3 + (changeLocationData == null ? 0 : changeLocationData.hashCode())) * 31;
        List<ReachableAddress> list2 = this.reachableAddress;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        LaneParams laneParams = this.logDuration;
        return iHashCode5 + (laneParams != null ? laneParams.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddressSelectState(selectedAddress=");
        sbLIZ.append(this.selectedAddress);
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(", renderDataList=");
        sbLIZ.append(this.renderDataList);
        sbLIZ.append(", selectedRegions=");
        sbLIZ.append(this.selectedRegions);
        sbLIZ.append(", applyBtnEnable=");
        sbLIZ.append(this.applyBtnEnable);
        sbLIZ.append(", currentAddressSelectType=");
        sbLIZ.append(this.currentAddressSelectType);
        sbLIZ.append(", selectCountry=");
        sbLIZ.append(this.selectCountry);
        sbLIZ.append(", chooseLocation=");
        sbLIZ.append(this.chooseLocation);
        sbLIZ.append(", reachableAddress=");
        sbLIZ.append(this.reachableAddress);
        sbLIZ.append(", logDuration=");
        sbLIZ.append(this.logDuration);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean getApplyBtnEnable() {
        return this.applyBtnEnable;
    }

    public final ChangeLocationData getChooseLocation() {
        return this.chooseLocation;
    }

    public final int getCurrentAddressSelectType() {
        return this.currentAddressSelectType;
    }

    public final LaneParams getLogDuration() {
        return this.logDuration;
    }

    public final List<ReachableAddress> getReachableAddress() {
        return this.reachableAddress;
    }

    public final List<Object> getRenderDataList() {
        return this.renderDataList;
    }

    public final Object getSelectCountry() {
        return this.selectCountry;
    }

    public final ReachableAddress getSelectedAddress() {
        return this.selectedAddress;
    }

    public final List<Region> getSelectedRegions() {
        return this.selectedRegions;
    }

    public final int getStatus() {
        return this.status;
    }

    public AddressSelectState(ReachableAddress reachableAddress, int i, List<? extends Object> list, List<Region> list2, boolean z, int i2, Object obj, ChangeLocationData changeLocationData, List<ReachableAddress> list3, LaneParams laneParams) {
        this.selectedAddress = reachableAddress;
        this.status = i;
        this.renderDataList = list;
        this.selectedRegions = list2;
        this.applyBtnEnable = z;
        this.currentAddressSelectType = i2;
        this.selectCountry = obj;
        this.chooseLocation = changeLocationData;
        this.reachableAddress = list3;
        this.logDuration = laneParams;
    }

    public AddressSelectState(ReachableAddress reachableAddress, int i, List list, List list2, boolean z, int i2, Object obj, ChangeLocationData changeLocationData, List list3, LaneParams laneParams, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : reachableAddress, (i3 & 2) != 0 ? -1 : i, (i3 & 4) != 0 ? C13BV.INSTANCE : list, (i3 & 8) != 0 ? null : list2, (i3 & 16) != 0 ? false : z, (i3 & 32) == 0 ? i2 : 0, (i3 & 64) != 0 ? null : obj, (i3 & 128) != 0 ? null : changeLocationData, (i3 & 256) != 0 ? null : list3, (i3 & 512) == 0 ? laneParams : null);
    }
}
