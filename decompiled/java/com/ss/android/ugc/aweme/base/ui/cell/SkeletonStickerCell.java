package com.ss.android.ugc.aweme.base.ui.cell;

import X.C00GN;
import X.C384050F3z;
import X.C418440Gaw;
import X.InterfaceC1891350zJl;
import android.view.View;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes2.dex */
public final class SkeletonStickerCell extends PowerCell<C00GN> {
    public View LL;
    public View LLILLJJLI;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.dm3;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LL = this.itemView.findViewById(R.id.vep);
        this.LLILLJJLI = this.itemView.findViewById(R.id.vfc);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int i = ((C00GN) interfaceC1891350zJl).LLILLJJLI;
        View view = this.LL;
        if (view != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(i);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(56));
            view.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
        }
        View view2 = this.LLILLJJLI;
        if (view2 != null) {
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZIZ = Integer.valueOf(i);
            view2.setBackground(c384050F3z2.LIZ(this.itemView.getContext()));
        }
    }
}
