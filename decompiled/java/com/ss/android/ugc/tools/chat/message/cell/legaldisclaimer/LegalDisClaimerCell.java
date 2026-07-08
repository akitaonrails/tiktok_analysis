package com.ss.android.ugc.tools.chat.message.cell.legaldisclaimer;

import X.C21291518Tx;
import X.C418440Gaw;
import X.C426750GoL;
import X.C432070Gwv;
import X.C786410Ut5;
import X.C814420VxA;
import X.C904550Ze9;
import X.EnumC21291418Tw;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes7.dex */
public final class LegalDisClaimerCell extends PowerCell<C904550Ze9> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        TuxTextView tuxTextView = new TuxTextView(viewGroup.getContext(), null, 6, 0);
        tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
        tuxTextView.setTuxFont(51);
        tuxTextView.setTextColorRes(R.attr.a1k);
        tuxTextView.setText(C432070Gwv.LIZLLL(tuxTextView.getContext(), C21291518Tx.LJ(EnumC21291418Tw.PRIVACY_LEGAL_DISCLAIMER_HINT, new Object[0])));
        C426750GoL.LJIIL(tuxTextView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 16);
        tuxTextView.setGravity(17);
        C786410Ut5.R6(tuxTextView, new ViewGroup.MarginLayoutParams(-1, -2));
        return tuxTextView;
    }
}
