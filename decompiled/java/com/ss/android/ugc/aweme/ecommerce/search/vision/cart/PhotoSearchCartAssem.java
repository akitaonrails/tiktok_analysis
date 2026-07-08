package com.ss.android.ugc.aweme.ecommerce.search.vision.cart;

import X.C0GYM;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.search.cart.SearchCartAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes11.dex */
public final class PhotoSearchCartAssem extends SearchCartAssem {
    @Override // com.ss.android.ugc.aweme.ecommerce.search.cart.SearchCartAssem, com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.brl;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.cart.SearchCartAssem
    public final void lp(View view) {
        super.lp(view);
        this.LLJJIJI = (TuxIconView) view.findViewById(R.id.qda);
        this.LLJJIII = (C0GYM) view.findViewById(R.id.qdb);
    }
}
