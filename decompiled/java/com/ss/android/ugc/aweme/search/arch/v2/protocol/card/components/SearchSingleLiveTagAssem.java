package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components;

import X.C1840207Iq;
import X.C666750QDh;
import X.C786410Ut5;
import X.InterfaceC655680Pni;
import android.view.View;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchSingleLiveTagAssem extends SearchCardLiveTagAssem {
    public View LLJLILLLLZIIL;
    public View LLJLL;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardLiveTagAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r5) {
        /*
            r4 = this;
            super.onViewCreated(r5)
            r3 = 2131380336(0x7f0a4870, float:1.8380958E38)
            android.view.View r0 = r5.findViewById(r3)
            r4.LLJLILLLLZIIL = r0
            r0 = 2131377908(0x7f0a3ef4, float:1.8376033E38)
            r5.findViewById(r0)
            r0 = 2131380519(0x7f0a4927, float:1.838133E38)
            android.view.View r0 = r5.findViewById(r0)
            r4.LLJLL = r0
            boolean r2 = X.C650240Pew.LIZ()
            if (r2 == 0) goto L41
            android.view.View r1 = r4.LLJLILLLLZIIL
            if (r1 == 0) goto L31
            X.07In r0 = X.C1839907In.LIZ
            r0.getClass()
            int r0 = X.C1839907In.LIZ()
            r1.setMinimumHeight(r0)
        L31:
            android.view.View r1 = r4.LLJLL
            if (r1 == 0) goto L41
            X.07In r0 = X.C1839907In.LIZ
            r0.getClass()
            int r0 = X.C1839907In.LIZ()
            r1.setMinimumHeight(r0)
        L41:
            int r0 = X.C1913107eT.LIZIZ()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            if (r0 > 0) goto L50
            r1 = 0
        L50:
            if (r2 == 0) goto L8c
            X.07In r0 = X.C1839907In.LIZ
            r0.getClass()
            float r2 = X.C1839907In.LIZIZ()
        L5b:
            android.content.Context r0 = r4.getContext()
            boolean r0 = X.C444960Hcc.LIZJ(r0)
            r1 = 0
            if (r0 == 0) goto L81
            android.view.View r0 = r4.LLJLILLLLZIIL
            X.C661350Pwr.LJ(r0, r1, r2, r2, r1)
            android.view.View r0 = r4.LLJLL
            X.C661350Pwr.LJ(r0, r2, r1, r1, r2)
        L70:
            boolean r0 = X.C1840207Iq.LIZ()
            if (r0 == 0) goto L80
            android.view.View r1 = r5.findViewById(r3)
            r0 = 2130973271(0x7f041257, float:1.7555332E38)
            r1.setBackgroundResource(r0)
        L80:
            return
        L81:
            android.view.View r0 = r4.LLJLILLLLZIIL
            X.C661350Pwr.LJ(r0, r2, r1, r1, r2)
            android.view.View r0 = r4.LLJLL
            X.C661350Pwr.LJ(r0, r1, r2, r2, r1)
            goto L70
        L8c:
            if (r1 == 0) goto L70
            float r2 = X.C418440Gaw.LIZIZ(r1)
            goto L5b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchSingleLiveTagAssem.onViewCreated(android.view.View):void");
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardLiveTagAssem
    /* JADX INFO: renamed from: op */
    public final void up(InterfaceC655680Pni interfaceC655680Pni) {
        View view;
        super.up(interfaceC655680Pni);
        View view2 = this.LLJLL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(C666750QDh.LIZ, view2);
        }
        if (C1840207Iq.LIZ() && (view = this.LLJLL) != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardLiveTagAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(InterfaceC655680Pni interfaceC655680Pni) {
        up(interfaceC655680Pni);
    }
}
