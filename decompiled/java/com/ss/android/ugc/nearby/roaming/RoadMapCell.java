package com.ss.android.ugc.nearby.roaming;

import X.C1272804yU;
import X.C418440Gaw;
import X.C426750GoL;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes3.dex */
public final class RoadMapCell extends PowerCell<C1272804yU> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1272804yU c1272804yU = (C1272804yU) interfaceC1891350zJl;
        super.onBindItemView(c1272804yU);
        ((TextView) this.itemView).setText(c1272804yU.LL);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        TuxTextView tuxTextView = new TuxTextView(viewGroup.getContext(), null, 6, 0);
        C426750GoL.LJIIL(tuxTextView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 16);
        tuxTextView.setTuxFont(62);
        tuxTextView.setTextColorRes(R.attr.a1k);
        return tuxTextView;
    }
}
