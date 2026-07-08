package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.title.ui;

import X.C01GW;
import X.C07E5;
import X.C1559260qg8;
import X.C452501pT;
import X.C656210PoZ;
import X.C723590SZx;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchCardTitleAssem extends ReusedUISlotAssem<SearchCardTitleAssem> implements InterfaceC712990Rxx<InterfaceC1587906Jp> {
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723590SZx(this, C656210PoZ.class, null), checkSupervisorPrepared());
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 251));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 250));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 252));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ev0;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final C656210PoZ op() {
        return (C656210PoZ) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final Context So(Context context) {
        if (C07E5.LIZ()) {
            return LJJIJL().getContext();
        }
        return context;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0093  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.InterfaceC1587906Jp r5) {
        /*
            r4 = this;
            X.0PoZ r0 = r4.op()
            kotlin.jvm.functions.Function0<java.lang.Boolean> r0 = r0.LLILLL
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto La0
            X.01GW r0 = r4.LLJL
            java.lang.Object r0 = r0.getValue()
            com.bytedance.tux.input.TuxTextView r0 = (com.bytedance.tux.input.TuxTextView) r0
            r1 = 0
            X.C786410Ut5.LLLLZLL(r0, r1)
            X.01GW r0 = r4.LLJLIL
            java.lang.Object r0 = r0.getValue()
            com.bytedance.tux.icon.TuxIconView r0 = (com.bytedance.tux.icon.TuxIconView) r0
            X.C786410Ut5.LLLLLLZZ(r0, r1)
        L29:
            X.0PoZ r0 = r4.op()
            kotlin.jvm.functions.Function0<java.lang.String> r0 = r0.LL
            r0.invoke()
            X.0PoZ r0 = r4.op()
            kotlin.jvm.functions.Function0<java.lang.String> r0 = r0.LLILLJJLI
            if (r0 == 0) goto L93
            java.lang.Object r2 = r0.invoke()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L93
            boolean r0 = X.C123100dR.LIZ(r2)
            if (r0 == 0) goto L93
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            X.0PoZ r0 = r4.op()
            kotlin.jvm.functions.Function0<java.lang.String> r0 = r0.LL
            java.lang.Object r0 = r0.invoke()
            java.lang.String r0 = (java.lang.String) r0
            r1.append(r0)
            java.lang.String r0 = " - "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            if (r0 == 0) goto L93
        L69:
            X.01GW r1 = r4.LLJLILLLLZIIL
            java.lang.Object r1 = r1.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setText(r0)
            X.0PoZ r0 = r4.op()
            kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> r3 = r0.LLILZ
            if (r3 == 0) goto L92
            android.view.View r2 = r4.getContentView()
            g1c.AjS65S0100000_10 r1 = new g1c.AjS65S0100000_10
            r0 = 10
            r1.<init>(r3, r0)
            X.C786410Ut5.I7(r1, r2)
            android.view.View r1 = r4.getContentView()
            r0 = 0
            X.C427690Gpr.LJ(r1, r0)
        L92:
            return
        L93:
            X.0PoZ r0 = r4.op()
            kotlin.jvm.functions.Function0<java.lang.String> r0 = r0.LL
            java.lang.Object r0 = r0.invoke()
            java.lang.String r0 = (java.lang.String) r0
            goto L69
        La0:
            X.01GW r0 = r4.LLJL
            java.lang.Object r0 = r0.getValue()
            com.bytedance.tux.input.TuxTextView r0 = (com.bytedance.tux.input.TuxTextView) r0
            r1 = 8
            X.C786410Ut5.LLLLZLL(r0, r1)
            X.01GW r0 = r4.LLJLIL
            java.lang.Object r0 = r0.getValue()
            com.bytedance.tux.icon.TuxIconView r0 = (com.bytedance.tux.icon.TuxIconView) r0
            X.C786410Ut5.LLLLLLZZ(r0, r1)
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.title.ui.SearchCardTitleAssem.up(java.lang.Object):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC1587906Jp interfaceC1587906Jp) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC1587906Jp interfaceC1587906Jp) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
