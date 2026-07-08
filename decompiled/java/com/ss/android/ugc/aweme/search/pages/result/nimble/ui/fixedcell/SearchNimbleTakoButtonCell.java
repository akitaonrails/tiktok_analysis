package com.ss.android.ugc.aweme.search.pages.result.nimble.ui.fixedcell;

import X.C00EV;
import X.C01GW;
import X.C1308910kAL;
import X.C14TF;
import X.C2211631BhB;
import X.C384050F3z;
import X.C418440Gaw;
import X.C427690Gpr;
import X.C452501pT;
import X.C467860IWi;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import wh6.AbS692S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchNimbleTakoButtonCell extends PowerCell<C00EV> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 593));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 595));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 596));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 594));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.ez2;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View view = (View) this.LLILLJJLI.getValue();
        if (view != null) {
            float fLIZIZ = C418440Gaw.LIZIZ(10);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.a03, view.getContext());
            c384050F3z.LIZJ = Float.valueOf(fLIZIZ);
            view.setBackground(c384050F3z.LIZ(view.getContext()));
            C427690Gpr.LJ(view, fLIZIZ);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        View view;
        C00EV c00ev = (C00EV) interfaceC1891350zJl;
        super.onBindItemView(c00ev);
        TextView textView = (TextView) this.LLILZ.getValue();
        if (textView != null) {
            textView.setText(c00ev.LL);
        }
        View view2 = (View) this.LLILLJJLI.getValue();
        if (view2 != null) {
            C786410Ut5.I7(new AbS692S0100000_10(this, 23), view2);
        }
        if (c00ev.LLILLJJLI) {
            TuxIconView tuxIconView = (TuxIconView) this.LLILLL.getValue();
            if (tuxIconView != null) {
                tuxIconView.setIconRes(C14TF.LIZIZ.LJJLIIIJ().LJII(C467860IWi.LIZ(tuxIconView.getContext())));
                C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            }
        } else {
            TuxIconView tuxIconView2 = (TuxIconView) this.LLILLL.getValue();
            if (tuxIconView2 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
            }
        }
        if (c00ev.LLILLL && (view = (View) this.LLILLJJLI.getValue()) != null) {
            C2211631BhB.LJ(view, new AwS589S0100000_10(this, 380));
        }
    }
}
