package com.ss.android.ugc.aweme.ecommerce.base.osp.module.sea.span;

import X.C03J8;
import X.C12ES;
import X.C1308910kAL;
import X.C7811033h;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class SpanCell extends AbsFullSpanCell<C7811033h> {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.sea.span.AbsFullSpanCell, com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C7811033h c7811033h = (C7811033h) interfaceC1891350zJl;
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, (int) C12ES.LIZJ(c7811033h.LLILZLL, this.itemView.getContext()));
        int i = c7811033h.LLIZLLLIL;
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i;
        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i;
        C786410Ut5.W5(this.itemView, layoutParams);
        View view = this.itemView;
        int i2 = c7811033h.LLIZLLLIL;
        int iIntValue = 0;
        view.setPadding(i2, 0, i2, 0);
        View view2 = this.itemView;
        Integer numLIZJ = C1308910kAL.LIZJ(c7811033h.LLJ, view2.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        }
        view2.setBackgroundColor(iIntValue);
        C03J8.LIZ(this.itemView, c7811033h.LLIZ);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return new View(viewGroup.getContext());
    }
}
