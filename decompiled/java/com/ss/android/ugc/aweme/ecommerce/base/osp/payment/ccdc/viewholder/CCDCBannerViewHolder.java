package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder;

import X.C03H8;
import X.C0H9H;
import X.C1308910kAL;
import X.C426750GoL;
import X.C707402pU;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes2.dex */
public final class CCDCBannerViewHolder extends PowerCell<C707402pU> implements C03H8 {
    @Override // X.C03H8
    public final View LJJIJL() {
        throw null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View view = this.itemView;
        if (!(view instanceof TuxTextView) || view == null) {
            return;
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zp, view.getContext());
        view.setBackgroundColor(numLIZJ != null ? numLIZJ.intValue() : -1);
        C426750GoL.LJIIL(view, Integer.valueOf(C0H9H.LIZIZ(16)), Integer.valueOf(C0H9H.LIZIZ(12)), Integer.valueOf(C0H9H.LIZIZ(16)), Integer.valueOf(C0H9H.LIZIZ(12)), 16);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        TextView textView;
        C707402pU c707402pU = (C707402pU) interfaceC1891350zJl;
        super.onBindItemView(c707402pU);
        View view = this.itemView;
        if ((view instanceof TuxTextView) && (textView = (TextView) view) != null) {
            textView.setText(c707402pU.LL.labelName);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        TuxTextView tuxTextView = new TuxTextView(viewGroup.getContext(), null, 6, 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = C0H9H.LIZIZ(12);
        C786410Ut5.R6(tuxTextView, layoutParams);
        return tuxTextView;
    }
}
