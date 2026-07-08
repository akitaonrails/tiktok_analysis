package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ShippingAddressParam implements Serializable {
    public static final int $stable = 0;

    @C09CT("address_id")
    public final String addressId;

    @C09CT("pudo_id")
    public final String pudoId;

    public ShippingAddressParam() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShippingAddressParam)) {
            return false;
        }
        ShippingAddressParam shippingAddressParam = (ShippingAddressParam) obj;
        return Intrinsics.LJFF(this.addressId, shippingAddressParam.addressId) && Intrinsics.LJFF(this.pudoId, shippingAddressParam.pudoId);
    }

    public int hashCode() {
        String str = this.addressId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.pudoId;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShippingAddressParam(addressId=");
        sbLIZ.append(this.addressId);
        sbLIZ.append(", pudoId=");
        sbLIZ.append(this.pudoId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ShippingAddressParam(String str, String str2) {
        this.addressId = str;
        this.pudoId = str2;
    }
}
