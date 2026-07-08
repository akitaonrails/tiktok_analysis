package com.ss.android.ugc.aweme.ecommerce.tts.addresslist.us;

import X.C19EG;
import X.C970803qs;
import X.C975003rY;
import X.InterfaceC1748810vbr;
import X.InterfaceC1891350zJl;
import X.InterfaceC975103rZ;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressListData;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListAssemViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS210S0300000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class UsAddressListAssemViewModel extends AddressListAssemViewModel implements InterfaceC975103rZ {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListAssemViewModel, X.InterfaceC975703rf
    public final void Pg1(Address address) {
        setState(new AwS367S0200000_1(address, this, 328));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListAssemViewModel, X.InterfaceC975703rf
    public final List<InterfaceC1891350zJl> RL0(AddressListData addressListData) {
        ArrayList arrayList = new ArrayList();
        if (!this.LLJIJIL) {
            arrayList.add(new C970803qs(0));
            arrayList.add(new C975003rY());
        }
        Integer num = this.LLJJIII;
        if (num != null && num.intValue() == 4) {
            ml(new AwS210S0300000_1(addressListData, this, arrayList, 105));
            return arrayList;
        }
        ml(new AwS210S0300000_1(addressListData, this, arrayList, 106));
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListAssemViewModel
    public final void xQ2(C19EG c19eg, InterfaceC1748810vbr interfaceC1748810vbr, AwS545S0100000_1 awS545S0100000_1) {
        withState(new AwS367S0200000_1(awS545S0100000_1, this, 329));
    }
}
