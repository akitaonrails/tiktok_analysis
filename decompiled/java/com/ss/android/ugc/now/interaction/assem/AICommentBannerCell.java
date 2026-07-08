package com.ss.android.ugc.now.interaction.assem;

import X.C786410Ut5;
import X.C993620bxo;
import X.InterfaceC1891350zJl;
import Y.ACListenerS151S0100000_16;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes17.dex */
public final class AICommentBannerCell extends PowerCell<C993620bxo> {
    public TuxTextView LL;
    public TuxTextView LLILLJJLI;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C993620bxo c993620bxo = (C993620bxo) interfaceC1891350zJl;
        super.onBindItemView(c993620bxo);
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView != null) {
            C786410Ut5.h9(tuxTextView, new ACListenerS151S0100000_16(c993620bxo, 105));
        }
        TuxTextView tuxTextView2 = this.LLILLJJLI;
        if (tuxTextView2 != null) {
            C786410Ut5.h9(tuxTextView2, new ACListenerS151S0100000_16(c993620bxo, 106));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.mh, viewGroup, false);
        viewTd.findViewById(R.id.ana);
        this.LL = (TuxTextView) viewTd.findViewById(R.id.an8);
        this.LLILLJJLI = (TuxTextView) viewTd.findViewById(R.id.an9);
        return viewTd;
    }
}
