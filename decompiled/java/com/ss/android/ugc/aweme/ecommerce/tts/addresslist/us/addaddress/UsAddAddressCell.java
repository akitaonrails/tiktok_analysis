package com.ss.android.ugc.aweme.ecommerce.tts.addresslist.us.addaddress;

import X.C01GW;
import X.C451710HnV;
import X.C452501pT;
import X.C786410Ut5;
import X.C970803qs;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommercebase.view.ECBaseCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class UsAddAddressCell extends ECBaseCell<C970803qs, UsAddAddressVH> {
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C451710HnV(this));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.b0i, viewGroup, false);
        this.LL = new UsAddAddressVH(viewTd, new AwS545S0100000_1(this, 1485));
        return viewTd;
    }
}
