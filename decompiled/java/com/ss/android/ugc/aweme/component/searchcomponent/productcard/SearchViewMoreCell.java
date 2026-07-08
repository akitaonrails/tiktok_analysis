package com.ss.android.ugc.aweme.component.searchcomponent.productcard;

import X.C1005280cGc;
import X.C1011660cQu;
import X.C21146717pB;
import X.C418440Gaw;
import X.C475630Ikz;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import Y.ACListenerS151S0100000_16;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes17.dex */
public final class SearchViewMoreCell extends PowerCell<C1005280cGc> {
    public ViewGroup LL;
    public TuxTextView LLILLJJLI;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View view = this.itemView;
        this.LL = view != null ? (ViewGroup) view.findViewById(R.id.iho) : null;
        View view2 = this.itemView;
        this.LLILLJJLI = view2 != null ? (TuxTextView) view2.findViewById(R.id.view_more) : null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1005280cGc c1005280cGc = (C1005280cGc) interfaceC1891350zJl;
        super.onBindItemView(c1005280cGc);
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            tuxTextView.setText(c1005280cGc.LL);
        }
        ViewGroup viewGroup = this.LL;
        if (viewGroup != null) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
                layoutParams.height = -1;
                C786410Ut5.W5(viewGroup, layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(4));
        gradientDrawable.setStroke(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C475630Ikz.LIZIZ(R.attr.a02, getContext()));
        ViewGroup viewGroup2 = this.LL;
        if (viewGroup2 != null) {
            viewGroup2.setBackground(gradientDrawable);
        }
        ViewGroup viewGroup3 = this.LL;
        if (viewGroup3 != null) {
            C1011660cQu.LIZLLL(viewGroup3, C418440Gaw.LIZIZ(4));
        }
        ViewGroup viewGroup4 = this.LL;
        if (viewGroup4 != null) {
            C786410Ut5.K7(viewGroup4, new ACListenerS151S0100000_16(this, 174));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C21146717pB.LIZIZ(viewGroup.getContext(), R.layout.qc, viewGroup, false);
    }
}
