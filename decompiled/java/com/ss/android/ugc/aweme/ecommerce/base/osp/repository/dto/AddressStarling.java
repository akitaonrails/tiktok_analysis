package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AddressStarling {

    @C09CT("change_address")
    public BillStarlingText changeAddressStarling;

    public AddressStarling() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddressStarling) && Intrinsics.LJFF(this.changeAddressStarling, ((AddressStarling) obj).changeAddressStarling);
    }

    public final int hashCode() {
        BillStarlingText billStarlingText = this.changeAddressStarling;
        if (billStarlingText == null) {
            return 0;
        }
        return billStarlingText.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddressStarling(changeAddressStarling=");
        sbLIZ.append(this.changeAddressStarling);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AddressStarling(BillStarlingText billStarlingText) {
        this.changeAddressStarling = billStarlingText;
    }
}
