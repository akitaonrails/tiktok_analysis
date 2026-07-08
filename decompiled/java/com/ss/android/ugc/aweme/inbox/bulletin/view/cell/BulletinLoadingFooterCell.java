package com.ss.android.ugc.aweme.inbox.bulletin.view.cell;

import X.C1390410mHn;
import X.C786410Ut5;
import Y.ACListenerS137S0100000_2;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes3.dex */
public final class BulletinLoadingFooterCell extends PowerLoadingCell {
    public C1390410mHn LL;
    public TuxTextView LLILLJJLI;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.a7g;
    }

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
            C786410Ut5.LLLLZLL(tuxTextView, 8);
        }
        TuxTextView tuxTextView2 = this.LLILLJJLI;
        if (tuxTextView2 != null) {
            C786410Ut5.h9(tuxTextView2, null);
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
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
        }
        TuxTextView tuxTextView2 = this.LLILLJJLI;
        if (tuxTextView2 != null) {
            C786410Ut5.h9(tuxTextView2, new ACListenerS137S0100000_2(this, 36));
        }
        TuxTextView tuxTextView3 = this.LLILLJJLI;
        if (tuxTextView3 != null) {
            tuxTextView3.setText(this.itemView.getContext().getString(2131836754));
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
            C786410Ut5.LLLZZIL(c1390410mHn, 0);
        }
        C1390410mHn c1390410mHn2 = this.LL;
        if (c1390410mHn2 != null) {
            c1390410mHn2.LIZJ();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LL = (C1390410mHn) this.itemView.findViewById(R.id.gb5);
        this.LLILLJJLI = (TuxTextView) this.itemView.findViewById(R.id.zmm);
    }
}
