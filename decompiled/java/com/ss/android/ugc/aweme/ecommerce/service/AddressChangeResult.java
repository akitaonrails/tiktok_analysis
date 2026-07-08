package com.ss.android.ugc.aweme.ecommerce.service;

import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AddressChangeResult {
    public final String addressId;
    public final int eventType;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressChangeResult)) {
            return false;
        }
        AddressChangeResult addressChangeResult = (AddressChangeResult) obj;
        return this.eventType == addressChangeResult.eventType && Intrinsics.LJFF(this.addressId, addressChangeResult.addressId);
    }

    public int hashCode() {
        int i = this.eventType * 31;
        String str = this.addressId;
        return i + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddressChangeResult(eventType=");
        sbLIZ.append(this.eventType);
        sbLIZ.append(", addressId=");
        sbLIZ.append(this.addressId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AddressChangeResult(int i, String str) {
        this.eventType = i;
        this.addressId = str;
    }
}
