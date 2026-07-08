package com.ss.android.ugc.aweme.search.ecommerce.core.ui;

import X.C1276504z5;
import X.C786410Ut5;
import Y.ACListenerS137S0100000_2;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ProductSeeAllCell extends PowerCell<C1276504z5> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.f00, viewGroup, false);
        C786410Ut5.I7(new ACListenerS137S0100000_2(this, 45), viewTd);
        return viewTd;
    }
}
