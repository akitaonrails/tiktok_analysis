package com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.elements.vh;

import X.C1276104z1;
import X.C1710770ucV;
import X.C1722120uuo;
import X.C21569319b9;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes27.dex */
public final class TitleViewHolder extends PowerCell<C1276104z1> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        TextView textView;
        C1276104z1 c1276104z1 = (C1276104z1) interfaceC1891350zJl;
        super.onBindItemView(c1276104z1);
        C1710770ucV.LIZ(this.itemView, new C21569319b9(C1722120uuo.LIZJ(24), C1722120uuo.LIZJ(16), C1722120uuo.LIZJ(16), 48, true, 232));
        View view = this.itemView;
        if ((view instanceof TuxTextView) && (textView = (TextView) view) != null) {
            textView.setText(c1276104z1.LL);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        TuxTextView tuxTextView = new TuxTextView(viewGroup.getContext(), null, 6, 0);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        tuxTextView.setPadding(C1722120uuo.LIZJ(4), 0, C1722120uuo.LIZJ(4), 0);
        C786410Ut5.R6(tuxTextView, layoutParams);
        tuxTextView.setTuxFont(23);
        tuxTextView.setTextColorRes(R.attr.a1h);
        return tuxTextView;
    }
}
