package com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.banner.switchcolor;

import X.C00X1;
import X.C16F5;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes.dex */
public final class CountryGroupHeaderCell extends PowerCell<C00X1> {
    public C16F5 LL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LL = (C16F5) this.itemView.findViewById(R.id.f1x);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C00X1 c00x1 = (C00X1) interfaceC1891350zJl;
        super.onBindItemView(c00x1);
        C16F5 c16f5 = this.LL;
        if (c16f5 != null) {
            c16f5.setText(c00x1.LL);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.g3b, viewGroup, false);
    }
}
