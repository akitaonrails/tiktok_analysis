package com.ss.android.ugc.feed.platform.panel.pagestate.protorol.impl.baselist;

import X.C01GW;
import X.C1390130mHL;
import X.C1390410mHn;
import X.C1749280vcc;
import X.C1850050yF9;
import X.C305550ByL;
import X.C426750GoL;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1609900rzo;
import X.InterfaceC1749320vcg;
import X.InterfaceC494301wD;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.service.NearbyPerformanceOpt;
import com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class NearbyPageStateImp extends PageStateCommonComponent {
    public View LLJJIJI;
    public final C01GW<C1390410mHn> LLJJI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1013));
    public final C01GW<C1390130mHL> LLJJIII = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1014));
    public final C1850050yF9 LLJJIJIIJIL = new InterfaceC1749320vcg() { // from class: X.0yF9
        @Override // X.InterfaceC1749320vcg
        public final void hide() {
            C1390410mHn c1390410mHn;
            View view = this.LIZ.LLJJIJI;
            if (view != null) {
                C786410Ut5.LJLLLLLL(4, view);
            }
            View view2 = this.LIZ.LLJJIJI;
            if (!(view2 instanceof C1390410mHn) || (c1390410mHn = (C1390410mHn) view2) == null) {
                return;
            }
            c1390410mHn.LIZLLL();
        }

        @Override // X.InterfaceC1749320vcg
        public final void show() {
            C1390410mHn c1390410mHn;
            View view = this.LIZ.LLJJIJI;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            View view2 = this.LIZ.LLJJIJI;
            if (!(view2 instanceof C1390410mHn) || (c1390410mHn = (C1390410mHn) view2) == null) {
                return;
            }
            c1390410mHn.LIZJ();
        }
    };

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent, X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -721105229) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent
    public final void Jo() {
        C1390410mHn value;
        C1749280vcc c1749280vcc = this.LLJILJILJ;
        if (c1749280vcc != null) {
            C786410Ut5.LLLZLZ(c1749280vcc, 0);
            if (this.LLJJI.isInitialized() && (value = this.LLJJI.getValue()) != null) {
                C786410Ut5.LLLZZIL(value, 8);
            }
            this.LLJJIJI = this.LLJJIII.getValue();
            c1749280vcc.LJ();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent
    public final void Lo() {
        C1749280vcc c1749280vcc = this.LLJILJILJ;
        if (c1749280vcc != null) {
            C786410Ut5.LLLZLZ(c1749280vcc, 0);
            c1749280vcc.LJ();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent, com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility
    public final void A72() {
        if (NearbyPerformanceOpt.LIZ()) {
            return;
        }
        super.A72();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent, com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility
    public final void Ys2(Exception exc) {
        Ho(EnumC1609900rzo.DEFAULT, exc);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent, X.InterfaceC743730TFj
    public final void LLZLLLL(View view, Bundle bundle) {
        super.LLZLLLL(view, bundle);
        C1749280vcc c1749280vcc = this.LLJILJILJ;
        if (c1749280vcc != null) {
            c1749280vcc.LIZ(this.LLJJIJIIJIL);
        }
        if (C305550ByL.LIZJ()) {
            C1749280vcc c1749280vcc2 = this.LLJILJILJ;
            if (c1749280vcc2 != null) {
                c1749280vcc2.setLayoutVariant(1);
            }
            C1749280vcc c1749280vcc3 = this.LLJILJILJ;
            if (c1749280vcc3 != null) {
                C426750GoL.LJIIIZ(c1749280vcc3, 0, 0, 0, 0, false, 16);
            }
        }
    }

    public final void No(int i, int i2, View view) {
        C1749280vcc c1749280vcc = this.LLJILJILJ;
        if (c1749280vcc != null) {
            view.setId(R.id.z1_);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2);
            layoutParams.gravity = 17;
            C786410Ut5.W5(view, layoutParams);
            if (view.getParent() == null) {
                c1749280vcc.addView(view);
            }
        }
    }
}
