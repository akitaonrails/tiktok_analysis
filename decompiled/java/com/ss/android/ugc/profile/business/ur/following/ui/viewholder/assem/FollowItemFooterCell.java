package com.ss.android.ugc.profile.business.ur.following.ui.viewholder.assem;

import X.C01GW;
import X.C0P6P;
import X.C1216270hkv;
import X.C1389890mGx;
import X.C1390410mHn;
import X.C13LE;
import X.C20748516Hb;
import X.C2217381BqS;
import X.C452501pT;
import X.C627300Oj2;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class FollowItemFooterCell extends PowerLoadingCell {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public C627300Oj2 LLILZ;
    public final C20748516Hb LL = new C20748516Hb(this, 6);
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1286));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1284));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1285));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1283));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FollowItemFooterCell.class, "control", "getControl()Lcom/ss/android/ugc/profile/business/ur/following/ui/viewholder/assem/IFollowItemFooterControl;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void L5() {
        C1390410mHn c1390410mHn = (C1390410mHn) this.LLILZIL.getValue();
        c1390410mHn.LIZLLL();
        C786410Ut5.LLLZZIL(c1390410mHn, 8);
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void LIZJ() {
        C786410Ut5.LLLZZIL((C1390410mHn) this.LLILZIL.getValue(), 8);
        RecyclerView recyclerView = (RecyclerView) this.LLILLJJLI.getValue();
        if (recyclerView != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(recyclerView);
            c1389890mGx.LJIIIZ(2131836753);
            c1389890mGx.LJIIJJI();
            TuxTextView tuxTextView = (TuxTextView) this.LLILZLL.getValue();
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            tuxTextView.setText(C1216270hkv.LIZJ(2131845625));
            if (this.LLILZ == null) {
                this.LLILZ = new C627300Oj2(recyclerView, (C0P6P) this.LLILLL.getValue());
            }
            C627300Oj2 c627300Oj2 = this.LLILZ;
            if (c627300Oj2 != null) {
                c627300Oj2.LLILLL = true;
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void N5() {
        C1390410mHn c1390410mHn = (C1390410mHn) this.LLILZIL.getValue();
        C786410Ut5.LLLZZIL(c1390410mHn, 0);
        c1390410mHn.LIZJ();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ecs, viewGroup, false);
    }
}
