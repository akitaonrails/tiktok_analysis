package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module;

import X.C04DX;
import X.C1308910kAL;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.libra.EcPdpLockupFrameworkUpgradeConfig;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes2.dex */
public final class PdpBodyTopAnchorCell extends PowerCell<C04DX> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int i;
        C04DX c04dx = (C04DX) interfaceC1891350zJl;
        super.onBindItemView(c04dx);
        if (!c04dx.LL && !EcPdpLockupFrameworkUpgradeConfig.LIZIZ()) {
            i = R.attr.e1;
        } else {
            i = R.attr.bx;
        }
        Integer numLIZJ = C1308910kAL.LIZJ(i, this.itemView.getContext());
        if (numLIZJ != null) {
            this.itemView.setBackgroundColor(numLIZJ.intValue());
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View view = new View(viewGroup.getContext());
        C786410Ut5.W5(view, new RecyclerView.LayoutParams(-1, 1));
        view.setImportantForAccessibility(2);
        return view;
    }
}
