package com.ss.android.ugc.feed.platform.panel.pagestate.protorol.impl.baselist;

import X.C1749280vcc;
import X.C786410Ut5;
import X.InterfaceC494301wD;
import com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent;

/* JADX INFO: loaded from: classes25.dex */
public final class PlaymodePageStateImp extends PageStateCommonComponent {
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

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent, com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ys2(java.lang.Exception r4) {
        /*
            r3 = this;
            X.0RJN r0 = r3.getPanelContext()
            java.lang.String r2 = r0.LIZ
            int r1 = r2.hashCode()
            r0 = -2003839741(0xffffffff888fd503, float:-8.656578E-34)
            if (r1 == r0) goto L32
            r0 = -1222453033(0xffffffffb722d8d7, float:-9.706439E-6)
            if (r1 == r0) goto L27
            r0 = -1222446964(0xffffffffb722f08c, float:-9.711959E-6)
            if (r1 != r0) goto L3d
            java.lang.String r0 = "Playmode Top"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L3d
            X.0rzo r0 = X.EnumC1609900rzo.PLAYMODE_TOP
        L23:
            r3.Ho(r0, r4)
            return
        L27:
            java.lang.String r0 = "Playmode New"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L3d
            X.0rzo r0 = X.EnumC1609900rzo.PLAYMODE_NEW
            goto L23
        L32:
            java.lang.String r0 = "Playmode Moodboost"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L3d
            X.0rzo r0 = X.EnumC1609900rzo.PLAYMODE_MOODBOOST
            goto L23
        L3d:
            X.0rzo r0 = X.EnumC1609900rzo.DEFAULT
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.panel.pagestate.protorol.impl.baselist.PlaymodePageStateImp.Ys2(java.lang.Exception):void");
    }
}
