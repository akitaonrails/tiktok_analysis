package com.ss.android.ugc.aweme.ecommerce.base.address.list;

import X.C01GW;
import X.C451700HnU;
import X.C452501pT;
import X.C972903rD;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.aweme.ecommercebase.view.ECBaseCell;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class AddressCell extends ECBaseCell<ReachableAddress, AddressAdapter$AddressViewHolder> {
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C451700HnU(this));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        int itemCount = getItemCount();
        C972903rD c972903rD = new C972903rD(viewGroup.getContext());
        getAbsoluteAdapterPosition();
        this.LL = new AddressAdapter$AddressViewHolder(c972903rD, itemCount, new AwS545S0100000_1(this, 43));
        return c972903rD;
    }
}
