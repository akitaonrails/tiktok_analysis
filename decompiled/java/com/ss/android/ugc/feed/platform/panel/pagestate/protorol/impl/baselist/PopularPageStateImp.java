package com.ss.android.ugc.feed.platform.panel.pagestate.protorol.impl.baselist;

import X.C1749280vcc;
import X.C786410Ut5;
import X.EnumC1609900rzo;
import X.InterfaceC494301wD;
import com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent;

/* JADX INFO: loaded from: classes25.dex */
public final class PopularPageStateImp extends PageStateCommonComponent {
    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent, X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -721105229) {
            return null;
        }
        return this;
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
    public final void Ys2(Exception exc) {
        Ho(EnumC1609900rzo.DEFAULT, exc);
    }
}
