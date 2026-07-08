package com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.spec.skeleton;

import X.C7864035i;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaSkuSkeletonCell extends ECPowerCell<C7864035i> {
    public View LLJ;
    public View LLJI;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLJ = this.itemView.findViewById(R.id.u4t);
        this.LLJI = this.itemView.findViewById(R.id.u4u);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        int i;
        C7864035i c7864035i = (C7864035i) interfaceC1891350zJl;
        super.onBindItemView(c7864035i);
        int i2 = 0;
        if (c7864035i.LLILZLL == 0) {
            z = true;
        } else {
            z = false;
        }
        View view = this.LLJ;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
        View view2 = this.LLJI;
        if (view2 != null) {
            if (!(!z)) {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, view2);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.avp, viewGroup, false);
    }
}
