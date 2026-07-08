package com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail;

import X.C004I;
import X.C13BV;
import X.C1745680vWo;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputDataOptions;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class AddressEditDetailState implements C004I {
    public static final int $stable = 8;
    public final CandInputDataOptions candInputDataOptions;
    public final CandInputDataOptions initData;
    public final int inputItemFirstTimeLoadingStatus;
    public final List<C1745680vWo> inputItemVOList;
    public final boolean isAllRequiredItemFilled;

    public AddressEditDetailState() {
        this(0, null, null, false, null, 31, null);
    }

    public final AddressEditDetailState copy(int i, List<C1745680vWo> list, CandInputDataOptions candInputDataOptions, boolean z, CandInputDataOptions candInputDataOptions2) {
        return new AddressEditDetailState(i, list, candInputDataOptions, z, candInputDataOptions2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressEditDetailState)) {
            return false;
        }
        AddressEditDetailState addressEditDetailState = (AddressEditDetailState) obj;
        return this.inputItemFirstTimeLoadingStatus == addressEditDetailState.inputItemFirstTimeLoadingStatus && Intrinsics.LJFF(this.inputItemVOList, addressEditDetailState.inputItemVOList) && Intrinsics.LJFF(this.initData, addressEditDetailState.initData) && this.isAllRequiredItemFilled == addressEditDetailState.isAllRequiredItemFilled && Intrinsics.LJFF(this.candInputDataOptions, addressEditDetailState.candInputDataOptions);
    }

    public int hashCode() {
        int iHashCode = ((this.inputItemFirstTimeLoadingStatus * 31) + this.inputItemVOList.hashCode()) * 31;
        CandInputDataOptions candInputDataOptions = this.initData;
        int iHashCode2 = (((iHashCode + (candInputDataOptions == null ? 0 : candInputDataOptions.hashCode())) * 31) + C786410Ut5.Z2(this.isAllRequiredItemFilled)) * 31;
        CandInputDataOptions candInputDataOptions2 = this.candInputDataOptions;
        return iHashCode2 + (candInputDataOptions2 != null ? candInputDataOptions2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddressEditDetailState(inputItemFirstTimeLoadingStatus=");
        sbLIZ.append(this.inputItemFirstTimeLoadingStatus);
        sbLIZ.append(", inputItemVOList=");
        sbLIZ.append(this.inputItemVOList);
        sbLIZ.append(", initData=");
        sbLIZ.append(this.initData);
        sbLIZ.append(", isAllRequiredItemFilled=");
        sbLIZ.append(this.isAllRequiredItemFilled);
        sbLIZ.append(", candInputDataOptions=");
        sbLIZ.append(this.candInputDataOptions);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final CandInputDataOptions getCandInputDataOptions() {
        return this.candInputDataOptions;
    }

    public final CandInputDataOptions getInitData() {
        return this.initData;
    }

    public final int getInputItemFirstTimeLoadingStatus() {
        return this.inputItemFirstTimeLoadingStatus;
    }

    public final List<C1745680vWo> getInputItemVOList() {
        return this.inputItemVOList;
    }

    public final boolean isAllRequiredItemFilled() {
        return this.isAllRequiredItemFilled;
    }

    public AddressEditDetailState(int i, List<C1745680vWo> list, CandInputDataOptions candInputDataOptions, boolean z, CandInputDataOptions candInputDataOptions2) {
        this.inputItemFirstTimeLoadingStatus = i;
        this.inputItemVOList = list;
        this.initData = candInputDataOptions;
        this.isAllRequiredItemFilled = z;
        this.candInputDataOptions = candInputDataOptions2;
    }

    public AddressEditDetailState(int i, List list, CandInputDataOptions candInputDataOptions, boolean z, CandInputDataOptions candInputDataOptions2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? C13BV.INSTANCE : list, (i2 & 4) != 0 ? null : candInputDataOptions, (i2 & 8) != 0 ? false : z, (i2 & 16) == 0 ? candInputDataOptions2 : null);
    }
}
