package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.cci;

import X.C00XM;
import X.C426750GoL;
import X.C679280Qkg;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes2.dex */
public final class TextHeaderViewHolder extends PowerCell<C00XM> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        TuxTextView tuxTextView;
        C00XM c00xm = (C00XM) interfaceC1891350zJl;
        super.onBindItemView(c00xm);
        View view = this.itemView;
        if ((view instanceof TuxTextView) && (tuxTextView = (TuxTextView) view) != null) {
            C786410Ut5.R6(tuxTextView, new ViewGroup.LayoutParams(-1, -2));
            C426750GoL.LJIIL(tuxTextView, Integer.valueOf(C679280Qkg.LIZ(16)), Integer.valueOf(C679280Qkg.LIZ(12)), Integer.valueOf(C679280Qkg.LIZ(16)), Integer.valueOf(C679280Qkg.LIZ(12)), 16);
            tuxTextView.setText(c00xm.LL);
            tuxTextView.setTextColorRes(R.attr.a1j);
            tuxTextView.setTuxFont(51);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return new TuxTextView(viewGroup.getContext(), null, 6, 0);
    }
}
