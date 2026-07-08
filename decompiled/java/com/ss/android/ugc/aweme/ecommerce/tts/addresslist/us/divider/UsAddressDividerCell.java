package com.ss.android.ugc.aweme.ecommerce.tts.addresslist.us.divider;

import X.C786410Ut5;
import X.C975003rY;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommercebase.view.ECBaseCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes2.dex */
public final class UsAddressDividerCell extends ECBaseCell<C975003rY, UsAddressDividerVH> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.b0c, viewGroup, false);
        this.LL = new UsAddressDividerVH(viewTd);
        return viewTd;
    }
}
