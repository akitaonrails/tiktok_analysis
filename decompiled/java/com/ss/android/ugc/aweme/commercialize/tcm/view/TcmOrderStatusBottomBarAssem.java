package com.ss.android.ugc.aweme.commercialize.tcm.view;

import X.C0QSJ;
import X.C13LE;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import X.C2217381BqS;
import X.C687700QyG;
import X.EnumC700430Rdh;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class TcmOrderStatusBottomBarAssem extends BaseCellSlotComponent<TcmOrderStatusBottomBarAssem> implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFF;
    public ViewGroup LLJLLIL;
    public TuxTextView LLJLLL;
    public final TcmOrderStatusBottomBarAssem$descExpandModeProtocol$1 LLJZ = new DescExpandModeProtocol() { // from class: com.ss.android.ugc.aweme.commercialize.tcm.view.TcmOrderStatusBottomBarAssem$descExpandModeProtocol$1
    };
    public volatile ITriggerAssemHost LLJZIJLIL;
    public InterfaceC665370Q7z LLL;
    public C0QSJ LLLF;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TcmOrderStatusBottomBarAssem.class, "triggerHost", "getTriggerHost()Lcom/ss/android/ugc/aweme/commercialize/tcm/view/ITriggerAssemHost;", 0);
        C13LE.LIZ.getClass();
        LLLFF = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void LJL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fs0;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{TcmOrderStatusVSCope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TcmOrderStatusVSCope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), DescExpandModeProtocol.class, C1697810uHb.LJIILJJIL(this.LLJZ));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.hs3);
        this.LLJLLIL = viewGroup;
        if (viewGroup != null) {
            setComponentClickStatusExperimental(viewGroup, EnumC700430Rdh.POSITIVE);
        }
        this.LLJLLL = (TuxTextView) view.findViewById(R.id.bsq);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(com.ss.android.ugc.aweme.feed.model.VideoItemParams r5) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r5 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r5
            android.view.ViewGroup r0 = r4.LLJLLIL
            r3 = 0
            if (r0 == 0) goto La
            X.C786410Ut5.LJLZ(r3, r0)
        La:
            com.ss.android.ugc.aweme.commercialize.tcm.view.ITriggerAssemHost r2 = r4.LLJZIJLIL
            if (r2 != 0) goto L45
            monitor-enter(r4)
            com.ss.android.ugc.aweme.commercialize.tcm.view.ITriggerAssemHost r2 = r4.LLJZIJLIL     // Catch: java.lang.Throwable -> L40
            if (r2 != 0) goto L3e
            X.0QSJ r1 = r4.LLLF     // Catch: java.lang.Throwable -> L40
            if (r1 != 0) goto L32
            X.0Q7z r2 = r4.LLL     // Catch: java.lang.Throwable -> L40
            if (r2 != 0) goto L21
            X.0Q7z r2 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L40
            r4.LLL = r2     // Catch: java.lang.Throwable -> L40
        L21:
            r0 = 1
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L40
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.tcm.view.TcmOrderStatusVSCope> r0 = com.ss.android.ugc.aweme.commercialize.tcm.view.TcmOrderStatusVSCope.class
            r1[r3] = r0     // Catch: java.lang.Throwable -> L40
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r2, r1)     // Catch: java.lang.Throwable -> L40
            r4.LLLF = r1     // Catch: java.lang.Throwable -> L40
            if (r1 != 0) goto L32
            r2 = 0
            goto L3a
        L32:
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.tcm.view.ITriggerAssemHost> r0 = com.ss.android.ugc.aweme.commercialize.tcm.view.ITriggerAssemHost.class
            java.lang.Object r2 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L40
            com.ss.android.ugc.aweme.commercialize.tcm.view.ITriggerAssemHost r2 = (com.ss.android.ugc.aweme.commercialize.tcm.view.ITriggerAssemHost) r2     // Catch: java.lang.Throwable -> L40
        L3a:
            r4.LLJZIJLIL = r2     // Catch: java.lang.Throwable -> L40
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L40
            goto L43
        L3e:
            monitor-exit(r4)
            goto L45
        L40:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L43:
            if (r2 == 0) goto L4f
        L45:
            kotlin.jvm.internal.AwS382S0200000_16 r1 = new kotlin.jvm.internal.AwS382S0200000_16
            r0 = 108(0x6c, float:1.51E-43)
            r1.<init>(r4, r5, r0)
            r2.LLLILZ(r1)
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.tcm.view.TcmOrderStatusBottomBarAssem.up(java.lang.Object):void");
    }
}
