package com.ss.android.ugc.aweme.poi.recommendfeature.list.component.list;

import X.C1390410mHn;
import X.C21681819tI;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import Y.ACListenerS141S0100000_6;
import Y.ARunnableS106S0100000_6;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes7.dex */
public final class PoiRecommendFeatureListLoadingFooterCell extends PowerLoadingCell {
    public C1390410mHn LL;
    public TuxTextView LLILLJJLI;

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void L5() {
        C1390410mHn c1390410mHn = this.LL;
        if (c1390410mHn != null) {
            c1390410mHn.LIZLLL();
        }
        C1390410mHn c1390410mHn2 = this.LL;
        if (c1390410mHn2 != null) {
            C786410Ut5.LLLZZIL(c1390410mHn2, 8);
        }
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
        }
        TuxTextView tuxTextView2 = this.LLILLJJLI;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(this.itemView.getContext().getString(2131829012));
        }
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void LIZJ() {
        C1390410mHn c1390410mHn = this.LL;
        if (c1390410mHn != null) {
            c1390410mHn.LIZLLL();
        }
        C1390410mHn c1390410mHn2 = this.LL;
        if (c1390410mHn2 != null) {
            C786410Ut5.LLLZZIL(c1390410mHn2, 8);
        }
        C786410Ut5.I7(new ACListenerS141S0100000_6(this, 50), this.itemView);
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
        }
        TuxTextView tuxTextView2 = this.LLILLJJLI;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(this.itemView.getContext().getString(2131844925));
        }
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void N5() {
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
        }
        C1390410mHn c1390410mHn = this.LL;
        if (c1390410mHn != null) {
            HandlerHook.viewPost(c1390410mHn, new ARunnableS106S0100000_6(this, 98));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if (layoutParams instanceof C21681819tI) {
            ((C21681819tI) layoutParams).LLILLJJLI = true;
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.e6x, viewGroup, false);
        viewTd.setPadding(viewTd.getPaddingLeft(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), viewTd.getPaddingRight(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
        this.LL = (C1390410mHn) viewTd.findViewById(R.id.ra3);
        this.LLILLJJLI = (TuxTextView) viewTd.findViewById(R.id.ra4);
        return viewTd;
    }
}
