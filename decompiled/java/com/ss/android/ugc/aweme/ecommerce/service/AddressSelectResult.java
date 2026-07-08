package com.ss.android.ugc.aweme.ecommerce.service;

import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AddressSelectResult {
    public final HostAddressSnapshot address;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddressSelectResult) && Intrinsics.LJFF(this.address, ((AddressSelectResult) obj).address);
    }

    public int hashCode() {
        return this.address.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddressSelectResult(address=");
        sbLIZ.append(this.address);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AddressSelectResult(HostAddressSnapshot hostAddressSnapshot) {
        this.address = hostAddressSnapshot;
    }
}
