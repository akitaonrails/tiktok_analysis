package com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.ui;

import X.C01GW;
import X.C0P6P;
import X.C1390410mHn;
import X.C13LE;
import X.C1864830ycz;
import X.C21681819tI;
import X.C2217381BqS;
import X.C452501pT;
import X.C497740JfY;
import X.C627300Oj2;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS161S0100000_27;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveReplayListFooterCell extends PowerLoadingCell {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public C627300Oj2 LL;
    public C1390410mHn LLILLJJLI;
    public TuxTextView LLILLL;
    public final C1864830ycz LLILZ = new C1864830ycz(this, 0);
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 492));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 491));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LiveReplayListFooterCell.class, "control", "getControl()Lcom/ss/android/ugc/aweme/live/livehostimpl/livereply/replaylist/ui/IFooterControl;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void L5() {
        C1390410mHn c1390410mHn = this.LLILLJJLI;
        if (c1390410mHn != null) {
            c1390410mHn.LIZLLL();
            C786410Ut5.LLLZZIL(c1390410mHn, 8);
        }
        TuxTextView tuxTextView = this.LLILLL;
        if (tuxTextView != null) {
            tuxTextView.setText(C497740JfY.LJIJI(2131851076));
            C786410Ut5.h9(tuxTextView, null);
            C786410Ut5.LLLLZLL(tuxTextView, 0);
        }
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void LIZJ() {
        C1390410mHn c1390410mHn = this.LLILLJJLI;
        if (c1390410mHn != null) {
            c1390410mHn.LIZLLL();
            C786410Ut5.LLLZZIL(c1390410mHn, 8);
        }
        TuxTextView tuxTextView = this.LLILLL;
        if (tuxTextView != null) {
            tuxTextView.setText(C497740JfY.LJIJI(2131836754));
            C786410Ut5.h9(tuxTextView, new ACListenerS161S0100000_27(this, 44));
            C786410Ut5.LLLLZLL(tuxTextView, 0);
        }
        RecyclerView recyclerView = (RecyclerView) this.LLILZIL.getValue();
        if (recyclerView != null) {
            if (this.LL == null) {
                this.LL = new C627300Oj2(recyclerView, (C0P6P) this.LLILZLL.getValue());
            }
            C627300Oj2 c627300Oj2 = this.LL;
            if (c627300Oj2 != null) {
                c627300Oj2.LLILLL = true;
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void N5() {
        TuxTextView tuxTextView = this.LLILLL;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
        }
        C1390410mHn c1390410mHn = this.LLILLJJLI;
        if (c1390410mHn != null) {
            C786410Ut5.LLLZZIL(c1390410mHn, 0);
            c1390410mHn.LIZJ();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        C21681819tI c21681819tI;
        super.onItemViewCreated();
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if ((layoutParams instanceof C21681819tI) && (c21681819tI = (C21681819tI) layoutParams) != null) {
            c21681819tI.LLILLJJLI = true;
        }
        this.LLILLJJLI = (C1390410mHn) this.itemView.findViewById(R.id.nnp);
        this.LLILLL = (TuxTextView) this.itemView.findViewById(R.id.w24);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dgt, viewGroup, false);
    }
}
