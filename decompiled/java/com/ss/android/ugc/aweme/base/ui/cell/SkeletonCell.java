package com.ss.android.ugc.aweme.base.ui.cell;

import X.C00GN;
import X.C384050F3z;
import X.C418440Gaw;
import X.InterfaceC1891350zJl;
import android.view.View;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes2.dex */
public final class SkeletonCell extends PowerCell<C00GN> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.dm2;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View viewFindViewById = this.itemView.findViewById(R.id.vep);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zj);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(48));
        viewFindViewById.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final /* bridge */ /* synthetic */ void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
    }
}
