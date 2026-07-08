package com.ss.android.ugc.aweme.ecommerce.base.address.associate;

import X.C004I;
import X.C2188811AlT;
import X.EnumC1746970vYt;
import X.InterfaceC0148002o;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputDataOptions;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class AddressAssociateState implements C004I, InterfaceC0148002o {
    public static final int $stable = 8;
    public final Address address;
    public final CandInputDataOptions candInputDataOptions;
    public final EnumC1746970vYt pageState;

    public AddressAssociateState() {
        this(null, null, null);
    }

    public final AddressAssociateState copy(Address address, CandInputDataOptions candInputDataOptions, EnumC1746970vYt enumC1746970vYt) {
        return new AddressAssociateState(address, candInputDataOptions, enumC1746970vYt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressAssociateState)) {
            return false;
        }
        AddressAssociateState addressAssociateState = (AddressAssociateState) obj;
        return Intrinsics.LJFF(this.address, addressAssociateState.address) && Intrinsics.LJFF(this.candInputDataOptions, addressAssociateState.candInputDataOptions) && this.pageState == addressAssociateState.pageState;
    }

    public int hashCode() {
        Address address = this.address;
        int iHashCode = (address == null ? 0 : address.hashCode()) * 31;
        CandInputDataOptions candInputDataOptions = this.candInputDataOptions;
        int iHashCode2 = (iHashCode + (candInputDataOptions == null ? 0 : candInputDataOptions.hashCode())) * 31;
        EnumC1746970vYt enumC1746970vYt = this.pageState;
        return iHashCode2 + (enumC1746970vYt != null ? enumC1746970vYt.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddressAssociateState(address=");
        sbLIZ.append(this.address);
        sbLIZ.append(", candInputDataOptions=");
        sbLIZ.append(this.candInputDataOptions);
        sbLIZ.append(", pageState=");
        sbLIZ.append(this.pageState);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Address getAddress() {
        return this.address;
    }

    public final CandInputDataOptions getCandInputDataOptions() {
        return this.candInputDataOptions;
    }

    public final EnumC1746970vYt getPageState() {
        return this.pageState;
    }

    public AddressAssociateState(Address address, CandInputDataOptions candInputDataOptions, EnumC1746970vYt enumC1746970vYt) {
        this.address = address;
        this.candInputDataOptions = candInputDataOptions;
        this.pageState = enumC1746970vYt;
    }
}
