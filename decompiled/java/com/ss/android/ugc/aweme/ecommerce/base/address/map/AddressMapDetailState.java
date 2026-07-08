package com.ss.android.ugc.aweme.ecommerce.base.address.map;

import X.C004I;
import X.C13BV;
import X.C1745680vWo;
import X.C1747430vZd;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1746980vYu;
import X.InterfaceC0148002o;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class AddressMapDetailState implements C004I, InterfaceC0148002o {
    public static final int $stable = 8;
    public final List<C1745680vWo> inputItemVOList;
    public final boolean isReturnFromAssociate;
    public final C1747430vZd mapLocationVO;
    public final EnumC1746980vYu pageState;
    public final Integer saveLoadingStatus;

    public AddressMapDetailState() {
        this(null, null, null, false, null, 31, null);
    }

    public final AddressMapDetailState copy(EnumC1746980vYu enumC1746980vYu, C1747430vZd c1747430vZd, List<C1745680vWo> list, boolean z, Integer num) {
        return new AddressMapDetailState(enumC1746980vYu, c1747430vZd, list, z, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressMapDetailState)) {
            return false;
        }
        AddressMapDetailState addressMapDetailState = (AddressMapDetailState) obj;
        return this.pageState == addressMapDetailState.pageState && Intrinsics.LJFF(this.mapLocationVO, addressMapDetailState.mapLocationVO) && Intrinsics.LJFF(this.inputItemVOList, addressMapDetailState.inputItemVOList) && this.isReturnFromAssociate == addressMapDetailState.isReturnFromAssociate && Intrinsics.LJFF(this.saveLoadingStatus, addressMapDetailState.saveLoadingStatus);
    }

    public int hashCode() {
        EnumC1746980vYu enumC1746980vYu = this.pageState;
        int iHashCode = (enumC1746980vYu == null ? 0 : enumC1746980vYu.hashCode()) * 31;
        C1747430vZd c1747430vZd = this.mapLocationVO;
        int iHashCode2 = (((((iHashCode + (c1747430vZd == null ? 0 : c1747430vZd.hashCode())) * 31) + this.inputItemVOList.hashCode()) * 31) + C786410Ut5.Z2(this.isReturnFromAssociate)) * 31;
        Integer num = this.saveLoadingStatus;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddressMapDetailState(pageState=");
        sbLIZ.append(this.pageState);
        sbLIZ.append(", mapLocationVO=");
        sbLIZ.append(this.mapLocationVO);
        sbLIZ.append(", inputItemVOList=");
        sbLIZ.append(this.inputItemVOList);
        sbLIZ.append(", isReturnFromAssociate=");
        sbLIZ.append(this.isReturnFromAssociate);
        sbLIZ.append(", saveLoadingStatus=");
        sbLIZ.append(this.saveLoadingStatus);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<C1745680vWo> getInputItemVOList() {
        return this.inputItemVOList;
    }

    public final C1747430vZd getMapLocationVO() {
        return this.mapLocationVO;
    }

    public final EnumC1746980vYu getPageState() {
        return this.pageState;
    }

    public final Integer getSaveLoadingStatus() {
        return this.saveLoadingStatus;
    }

    public final boolean isReturnFromAssociate() {
        return this.isReturnFromAssociate;
    }

    public AddressMapDetailState(EnumC1746980vYu enumC1746980vYu, C1747430vZd c1747430vZd, List<C1745680vWo> list, boolean z, Integer num) {
        this.pageState = enumC1746980vYu;
        this.mapLocationVO = c1747430vZd;
        this.inputItemVOList = list;
        this.isReturnFromAssociate = z;
        this.saveLoadingStatus = num;
    }

    public AddressMapDetailState(EnumC1746980vYu enumC1746980vYu, C1747430vZd c1747430vZd, List list, boolean z, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : enumC1746980vYu, (i & 2) != 0 ? null : c1747430vZd, (i & 4) != 0 ? C13BV.INSTANCE : list, (i & 8) != 0 ? false : z, (i & 16) == 0 ? num : null);
    }
}
