package com.ss.android.ugc.aweme.ad.comment.reviewtab.ui.powerlist;

import X.C1876007Wk;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes5.dex */
public final class ReviewPrivacyCell extends PowerCell<C1876007Wk> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        TextView textView;
        C1876007Wk c1876007Wk = (C1876007Wk) interfaceC1891350zJl;
        View view = this.itemView;
        if ((view instanceof TuxTextView) && (textView = (TextView) view) != null) {
            textView.setText(c1876007Wk.LL);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        TuxTextView tuxTextView = new TuxTextView(viewGroup.getContext(), null, 6, 0);
        C786410Ut5.R6(tuxTextView, new ViewGroup.LayoutParams(-1, -2));
        tuxTextView.setTextDirection(5);
        tuxTextView.setTextAlignment(4);
        tuxTextView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(45)));
        tuxTextView.setTuxFont(61);
        tuxTextView.setTextColorRes(R.attr.a1k);
        return tuxTextView;
    }
}
