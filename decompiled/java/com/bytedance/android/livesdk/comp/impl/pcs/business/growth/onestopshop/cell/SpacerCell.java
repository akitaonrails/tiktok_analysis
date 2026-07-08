package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.cell;

import X.C1338790kwX;
import X.C1820900xU8;
import X.C500260Jjc;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes28.dex */
public final class SpacerCell extends PowerCell<C1820900xU8> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1820900xU8 c1820900xU8 = (C1820900xU8) interfaceC1891350zJl;
        super.onBindItemView(c1820900xU8);
        C500260Jjc.LJJZ(C1338790kwX.LIZ(c1820900xU8.LL), this.itemView.findViewById(R.id.pmp));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return PowerCell.inflateItemView$default(this, viewGroup, R.layout.gtu, false, 4, null);
    }
}
