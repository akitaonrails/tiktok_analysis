package com.ss.android.ugc.aweme.ecommerce.base.address.list;

import X.C004I;
import X.C2188811AlT;
import X.C948003nC;
import X.C978303s5;
import X.C979503sH;
import X.InterfaceC0148002o;
import X.InterfaceC1891350zJl;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AddressListState implements C004I, InterfaceC0148002o {
    public static final int $stable = 8;
    public final List<InterfaceC1891350zJl> addressItems;
    public final C979503sH addressState;
    public final C948003nC<String> changeOnOrderToast;
    public final C978303s5 policyItemVO;
    public final String selectAddressId;
    public final int status;

    public AddressListState() {
        this(0, null, null, null, null, null);
    }

    public final AddressListState copy(int i, List<? extends InterfaceC1891350zJl> list, String str, C978303s5 c978303s5, C979503sH c979503sH, C948003nC<String> c948003nC) {
        return new AddressListState(i, list, str, c978303s5, c979503sH, c948003nC);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressListState)) {
            return false;
        }
        AddressListState addressListState = (AddressListState) obj;
        return this.status == addressListState.status && Intrinsics.LJFF(this.addressItems, addressListState.addressItems) && Intrinsics.LJFF(this.selectAddressId, addressListState.selectAddressId) && Intrinsics.LJFF(this.policyItemVO, addressListState.policyItemVO) && Intrinsics.LJFF(this.addressState, addressListState.addressState) && Intrinsics.LJFF(this.changeOnOrderToast, addressListState.changeOnOrderToast);
    }

    public int hashCode() {
        int i = this.status * 31;
        List<InterfaceC1891350zJl> list = this.addressItems;
        int iHashCode = (i + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.selectAddressId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C978303s5 c978303s5 = this.policyItemVO;
        int iHashCode3 = (iHashCode2 + (c978303s5 == null ? 0 : c978303s5.hashCode())) * 31;
        C979503sH c979503sH = this.addressState;
        int iHashCode4 = (iHashCode3 + (c979503sH == null ? 0 : c979503sH.hashCode())) * 31;
        C948003nC<String> c948003nC = this.changeOnOrderToast;
        return iHashCode4 + (c948003nC != null ? c948003nC.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddressListState(status=");
        sbLIZ.append(this.status);
        sbLIZ.append(", addressItems=");
        sbLIZ.append(this.addressItems);
        sbLIZ.append(", selectAddressId=");
        sbLIZ.append(this.selectAddressId);
        sbLIZ.append(", policyItemVO=");
        sbLIZ.append(this.policyItemVO);
        sbLIZ.append(", addressState=");
        sbLIZ.append(this.addressState);
        sbLIZ.append(", changeOnOrderToast=");
        sbLIZ.append(this.changeOnOrderToast);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<InterfaceC1891350zJl> getAddressItems() {
        return this.addressItems;
    }

    public final C979503sH getAddressState() {
        return this.addressState;
    }

    public final C948003nC<String> getChangeOnOrderToast() {
        return this.changeOnOrderToast;
    }

    public final C978303s5 getPolicyItemVO() {
        return this.policyItemVO;
    }

    public final String getSelectAddressId() {
        return this.selectAddressId;
    }

    public final int getStatus() {
        return this.status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AddressListState(int i, List<? extends InterfaceC1891350zJl> list, String str, C978303s5 c978303s5, C979503sH c979503sH, C948003nC<String> c948003nC) {
        this.status = i;
        this.addressItems = list;
        this.selectAddressId = str;
        this.policyItemVO = c978303s5;
        this.addressState = c979503sH;
        this.changeOnOrderToast = c948003nC;
    }
}
