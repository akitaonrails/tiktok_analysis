package com.ss.android.ugc.aweme.ecommerce.base.address.list;

import X.C0136002c;
import X.C01GW;
import X.C451730HnX;
import X.C452501pT;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommercebase.view.ECBaseCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class AddAddressBarCell extends ECBaseCell<C0136002c, AddressAdapter$AddAddressBarHolder> {
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C451730HnX(this));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        int itemCount = getItemCount();
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ahu, viewGroup, false);
        this.LL = new AddressAdapter$AddAddressBarHolder(viewTd, itemCount, new AwS545S0100000_1(this, 42));
        return viewTd;
    }
}
