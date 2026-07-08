package com.ss.android.ugc.aweme.poi.detail.container.ui;

import X.C1200890hM7;
import X.C1202420hOa;
import X.C1390410mHn;
import X.C21681819tI;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import Y.ACListenerS121S0200000_18;
import Y.ARunnableS118S0100000_18;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailLoadingFooterCellV2 extends PowerLoadingCell {
    public C1390410mHn LL;
    public TuxTextView LLILLJJLI;
    public String LLILLL;

    static {
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void L5() {
        String string;
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
            if (C1200890hM7.LIZ(this.LLILLL)) {
                string = this.LLILLL;
            } else {
                string = C1202420hOa.LIZ().getString(2131829012);
                this.LLILLL = string;
            }
            tuxTextView2.setText(string);
        }
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void LIZJ() {
        View view = this.itemView;
        C1390410mHn c1390410mHn = this.LL;
        if (c1390410mHn != null) {
            c1390410mHn.LIZLLL();
        }
        C1390410mHn c1390410mHn2 = this.LL;
        if (c1390410mHn2 != null) {
            C786410Ut5.LLLZZIL(c1390410mHn2, 8);
        }
        C786410Ut5.I7(new ACListenerS121S0200000_18(this, view, 18), view);
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
        }
        TuxTextView tuxTextView2 = this.LLILLJJLI;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(view.getContext().getString(2131844925));
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
            HandlerHook.viewPost(c1390410mHn, new ARunnableS118S0100000_18(this, 37));
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
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.e0x, viewGroup, false);
        viewTd.setPadding(viewTd.getPaddingLeft(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), viewTd.getPaddingRight(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
        this.LL = (C1390410mHn) viewTd.findViewById(R.id.gb5);
        this.LLILLJJLI = (TuxTextView) viewTd.findViewById(R.id.zmm);
        return viewTd;
    }
}
