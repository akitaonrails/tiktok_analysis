package com.ss.android.ugc.aweme.ecommerce.tts.addresslist.us.changeaddressmsg;

import X.C00X5;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommercebase.view.ECBaseCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes2.dex */
public final class USChangeAddressMsgCell extends ECBaseCell<C00X5, USChangeAddressMsgVH> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.b0j, viewGroup, false);
        this.LL = new USChangeAddressMsgVH(viewTd);
        return viewTd;
    }
}
