package com.ss.android.ugc.aweme.ecommerce.base.address.list.changeaddressmsgv2;

import X.C00X2;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommercebase.view.ECBaseCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ChangeAddressMsgV2Cell extends ECBaseCell<C00X2, ChangeAddressMsgV2VH> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.alb, viewGroup, false);
        this.LL = new ChangeAddressMsgV2VH(viewTd);
        return viewTd;
    }
}
