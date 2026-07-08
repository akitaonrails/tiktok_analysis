package com.ss.android.ugc.aweme.notification.creator.assem;

import X.C01GW;
import X.C13BV;
import X.C1602160rnK;
import X.C1618770sE7;
import X.C1900590zYf;
import X.C1900830zZ3;
import X.C452501pT;
import X.C687700QyG;
import X.C786410Ut5;
import X.InterfaceC1900470zYT;
import X.InterfaceC1902130zb9;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.selectsheet.TuxMultiSelectionSheet;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeFilterModel;
import com.ss.android.ugc.aweme.notification.creator.vscope.CreatorNoticeTabScope;
import java.util.List;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class CreatorNoticeFilterButtonAssem extends UIContentAssem implements InterfaceC1900470zYT, InterfaceC737790Swr {
    public TuxMultiSelectionSheet LLJILLL;
    public InterfaceC1902130zb9 LLJJ;
    public List<NoticeFilterModel> LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public final CreatorNoticeFilterButtonAssem LLIZLLLIL = this;
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 315));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 314));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 317));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 316));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 319));
    public List<Integer> LLJJI = C13BV.INSTANCE;

    @Override // X.InterfaceC1900470zYT
    public final void lf() {
        this.LLJJIJIIJIL = true;
        if (this.LLJJIJI) {
            mj(this.LLJJI);
        }
    }

    @Override // com.bytedance.assem.arch.view.UIContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        super.xo();
        C1618770sE7.LJI((View) this.LLJ.getValue(), new AwS572S0100000_28(this, 318));
    }

    @Override // X.InterfaceC1900470zYT
    public final void A9(C1900590zYf c1900590zYf) {
        this.LLJJIII = c1900590zYf.LIZIZ;
        mj(c1900590zYf.LIZ);
        RecyclerView recyclerView = (RecyclerView) this.LLJILJILJ.getValue();
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void Go(List<Integer> list) {
        if (!list.isEmpty()) {
            ((TextView) this.LLJIJIL.getValue()).setText(String.valueOf(list.size()));
            C786410Ut5.LLLLZLL((TuxTextView) this.LLJIJIL.getValue(), 0);
            C786410Ut5.LLLLLLZZ((TuxIconView) this.LLJILJIL.getValue(), 0);
        } else {
            C786410Ut5.LLLLZLL((TuxTextView) this.LLJIJIL.getValue(), 8);
            C786410Ut5.LLLLLLZZ((TuxIconView) this.LLJILJIL.getValue(), 0);
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{CreatorNoticeTabScope.class}).unbindAbility(this.LLIZLLLIL, InterfaceC1900470zYT.class);
    }

    @Override // X.InterfaceC1900470zYT
    public final void mj(List<Integer> list) {
        if (C1900830zZ3.LIZ("filter_button", this.LLJJIII)) {
            this.LLJJIJI = false;
            View view = (View) this.LLJI.getValue();
            int visibility = view.getVisibility();
            view.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, view);
            C786410Ut5.LJZL(8, (LinearLayout) this.LLJ.getValue());
            return;
        }
        this.LLJJIJI = true;
        if (this.LLJJIJIIJIL) {
            View view2 = (View) this.LLJI.getValue();
            int visibility2 = view2.getVisibility();
            view2.setVisibility(0);
            C1602160rnK.LIZIZ(visibility2, 0, view2);
            C786410Ut5.LJZL(0, (LinearLayout) this.LLJ.getValue());
            Go(list);
        }
        this.LLJJI = list;
    }

    @Override // X.InterfaceC1900470zYT
    public final void p0(InterfaceC1902130zb9 interfaceC1902130zb9) {
        this.LLJJ = interfaceC1902130zb9;
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{CreatorNoticeTabScope.class}).bindAbility(this.LLIZLLLIL, InterfaceC1900470zYT.class);
    }
}
