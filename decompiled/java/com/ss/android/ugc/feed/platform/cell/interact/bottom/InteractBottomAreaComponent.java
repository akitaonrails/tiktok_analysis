package com.ss.android.ugc.feed.platform.cell.interact.bottom;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C03H5;
import X.C04S1;
import X.C07CT;
import X.C0RDX;
import X.C0RI0;
import X.C0RJ0;
import X.C0RJN;
import X.C0RPZ;
import X.C0RQ6;
import X.C0RQN;
import X.C0RQO;
import X.C0RUJ;
import X.C13LE;
import X.C1558520qew;
import X.C452501pT;
import X.C692070RCr;
import X.C692090RCt;
import X.C693390RHt;
import X.C693650RIt;
import X.C715260S3w;
import X.C720670SOr;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C737910Sx3;
import X.EnumC697300RWu;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC691660RBc;
import android.view.View;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tako.ITakoService;
import com.ss.android.ugc.feed.platform.cell.interact.InteractBottomAreaAttachAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractBottomAreaViewAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.AreaContainerProtocol;
import com.ss.android.ugc.feed.platform.container.core.BaseContainer;
import com.ss.android.ugc.feed.platform.container.core.VContainerProtocol;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS62S1000000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class InteractBottomAreaComponent extends BaseContainer<VContainerProtocol, InteractBottomAreaComponent> implements InteractBottomAreaAttachAbility, AreaContainerProtocol, InteractBottomAreaViewAbility, C0RUJ, C0RQO, InterfaceC1554640qYg {
    public C0RJ0 LLJLILLLLZIIL;
    public C692090RCt LLJZ;
    public final /* synthetic */ C693650RIt LLJL = new C693650RIt();
    public final C0RPZ LLJLIL = new C0RPZ(true, true, false);
    public final C01GW LLJLL = C452501pT.LIZIZ(new C0RI0(this));
    public final C01GW LLJLLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), new C693390RHt());
    public final C0RQ6 LLJLLL = C0RQ6.INTERACT_BOTTOM_AREA_COMPONENT;

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.AreaContainerProtocol
    public final C720670SOr D42() {
        int[] iArr = new int[2];
        LJJIJL().getLocationInWindow(iArr);
        return new C720670SOr(LJJIJL().getWidth(), LJJIJL().getHeight(), iArr);
    }

    @Override // X.C0RUJ
    public final void Ie() {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.AreaContainerProtocol
    public final void Lk1(AwS590S0100000_11 awS590S0100000_11) {
    }

    @Override // X.C0RUJ
    public final String T1() {
        return "bottom_container";
    }

    @Override // X.C0RUJ
    public final void a6() {
    }

    @Override // X.C0RUJ
    public final boolean m8() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -1669038589 || iHashCode == -141581021) {
            return this;
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.AreaContainerProtocol
    public final String s81() {
        return "bottom_container";
    }

    @Override // X.C0RQO
    public final String Ig() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        return C0RQN.LIZIZ(c724270Sb3 != null ? c724270Sb3.LL : null, jm());
    }

    @Override // X.C0RUJ
    public final void lj() {
        AssemViewModel assemViewModel = (AssemViewModel) this.LLJLLIL.getValue();
        assemViewModel.getClass();
        assemViewModel.setState(new AwS62S1000000_11("bottom_container", 11));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void xo() {
        C01GW c01gw = C692070RCr.LIZ;
        this.LLJZ = C692070RCr.LIZLLL(String.valueOf(jm().hashCode()), "InteractBottomAreaComponent", "iterateBind");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void yo() {
        C01GW c01gw = C692070RCr.LIZ;
        C692070RCr.LIZ(this.LLJZ, String.valueOf(jm().hashCode()), null, null);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractBottomAreaViewAbility
    public final View BE0() {
        return LJJIJL();
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.AreaContainerProtocol
    public final View Fd2() {
        return LJJIJL();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void H() {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ == null || (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
            if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                arrayList.add(abstractC738140SxQ);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC691660RBc) it2.next()).H();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJL() {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        long jLJFF = C0RQN.LJFF();
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C0RDX.LIZIZ((InterfaceC691660RBc) it2.next());
            }
        }
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_ONUNSELECTED, jLJFF);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        long jLJFF = C0RQN.LJFF();
        super.onParentSet();
        C1558520qew.LIZLLL(this);
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_ONPARENTSET, jLJFF);
        }
    }

    public final void op() {
        ITakoService iTakoService;
        C0RJN c0rjnLIZIZ = jm().LIZIZ();
        if (!C07CT.LIZ(c0rjnLIZIZ != null ? c0rjnLIZIZ.LIZJ : null) || (iTakoService = (ITakoService) PluggableExtentionKt.pluggableSpi$default(ITakoService.class, false, false, false, 14, null)) == null) {
            return;
        }
        iTakoService.LJLLILLLL(LJJIJL(), Integer.valueOf(((Number) C04S1.LIZ.getValue()).intValue()));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void unBind() {
        /*
            r6 = this;
            long r1 = X.C0RQN.LJFF()
            X.0R8b r0 = r6.jm()
            X.0RJN r0 = r0.LIZIZ()
            r5 = 0
            if (r0 == 0) goto L8e
            X.19EG r4 = r0.LIZ()
        L13:
            X.0Sb3 r0 = r6.LLJI
            if (r0 == 0) goto L8c
            java.lang.Object r0 = r0.LL
        L19:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            java.lang.String r3 = r0.mEventType
            X.0Sb3 r0 = r6.LLJI
            if (r0 == 0) goto L8a
            java.lang.Object r0 = r0.LL
        L23:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            boolean r0 = X.C0RR7.LIZIZ(r4, r0, r3)
            if (r0 != 0) goto L5b
            X.01GW r0 = X.C695730RQt.LIZ
            X.0R8b r0 = r6.jm()
            X.0RJN r0 = r0.LIZIZ()
            if (r0 == 0) goto L88
            X.19EG r4 = r0.LIZ()
        L3f:
            X.0Sb3 r0 = r6.LLJI
            if (r0 == 0) goto L86
            java.lang.Object r0 = r0.LL
        L45:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            java.lang.String r3 = r0.mEventType
            X.0Sb3 r0 = r6.LLJI
            if (r0 == 0) goto L4f
            java.lang.Object r5 = r0.LL
        L4f:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r5 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r5
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.getAweme()
            boolean r0 = X.C695730RQt.LIZIZ(r4, r0, r3)
            if (r0 == 0) goto L7a
        L5b:
            X.0RJ0 r5 = r6.LLJLILLLLZIIL
            if (r5 == 0) goto L7a
            java.lang.StringBuilder r4 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "bottom banner setEnableUnifiedSpacing: enable="
            r4.append(r0)
            r3 = 0
            r4.append(r3)
            X.C2188811AlT.LIZIZ(r4)
            boolean r0 = r5.LLILLL
            if (r0 == 0) goto L77
            r5.LLILLL = r3
            r5.LLILZ = r3
        L77:
            r6.Kc2(r5)
        L7a:
            boolean r0 = X.C715260S3w.LIZJ()
            if (r0 == 0) goto L85
            X.0RWu r0 = X.EnumC697300RWu.M_UNBIND
            X.C0RQN.LIZLLL(r6, r0, r1)
        L85:
            return
        L86:
            r0 = r5
            goto L45
        L88:
            r4 = r5
            goto L3f
        L8a:
            r0 = r5
            goto L23
        L8c:
            r0 = r5
            goto L19
        L8e:
            r4 = r5
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.interact.bottom.InteractBottomAreaComponent.unBind():void");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractBottomAreaViewAbility
    public final boolean v9() {
        return LJJIJL().getVisibility() != 8 && LJJIJL().getHeight() > 0;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        super.Co();
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    public final C0RQ6 hp() {
        return this.LLJLLL;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.AreaContainerProtocol
    public final void Kc2(View.OnLayoutChangeListener onLayoutChangeListener) {
        LJJIJL().removeOnLayoutChangeListener(onLayoutChangeListener);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.AreaContainerProtocol
    public final void Ko2(View.OnLayoutChangeListener onLayoutChangeListener) {
        LJJIJL().addOnLayoutChangeListener(onLayoutChangeListener);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJLIIIL(int i) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC691660RBc) it2.next()).LJLIIIL(i);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LLLI(int i) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC691660RBc) it2.next()).LLLI(i);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent
    /* JADX INFO: renamed from: cp */
    public final boolean ur(VideoItemParams videoItemParams) {
        long jLJFF = C0RQN.LJFF();
        Boolean bool = Boolean.TRUE;
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_ISACTIVE, jLJFF);
        }
        if ((bool instanceof Boolean) && bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    /* JADX INFO: renamed from: ip */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void tp(com.ss.android.ugc.aweme.feed.model.VideoItemParams r7) {
        /*
            r6 = this;
            long r1 = X.C0RQN.LJFF()
            r6.op()
            boolean r0 = com.ss.android.ugc.feed.platform.ab.LowScreenOptimizeAB.LJ()
            if (r0 != 0) goto L44
            X.0R8b r0 = r6.jm()
            X.0RJN r0 = r0.LIZIZ()
            r5 = 0
            if (r0 == 0) goto L6d
            X.19EG r4 = r0.LIZ()
        L1c:
            java.lang.String r3 = r7.mEventType
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.getAweme()
            boolean r0 = X.C0RR7.LIZIZ(r4, r0, r3)
            if (r0 != 0) goto L44
            X.01GW r0 = X.C695730RQt.LIZ
            X.0R8b r0 = r6.jm()
            X.0RJN r0 = r0.LIZIZ()
            if (r0 == 0) goto L38
            X.19EG r5 = r0.LIZ()
        L38:
            java.lang.String r3 = r7.mEventType
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.getAweme()
            boolean r0 = X.C695730RQt.LIZIZ(r5, r0, r3)
            if (r0 == 0) goto L61
        L44:
            X.0RJ0 r5 = r6.LLJLILLLLZIIL
            if (r5 == 0) goto L61
            java.lang.StringBuilder r4 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "bottom banner setEnableUnifiedSpacing: enable="
            r4.append(r0)
            r3 = 1
            r4.append(r3)
            X.C2188811AlT.LIZIZ(r4)
            boolean r0 = r5.LLILLL
            if (r0 == r3) goto L5e
            r5.LLILLL = r3
        L5e:
            r6.Ko2(r5)
        L61:
            boolean r0 = X.C715260S3w.LIZJ()
            if (r0 == 0) goto L6c
            X.0RWu r0 = X.EnumC697300RWu.M_ONBIND
            X.C0RQN.LIZLLL(r6, r0, r1)
        L6c:
            return
        L6d:
            r4 = r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.interact.bottom.InteractBottomAreaComponent.tp(com.ss.android.ugc.aweme.feed.model.VideoItemParams):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ea  */
    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, com.bytedance.assem.arch.reused.ReusedUIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r16) {
        /*
            Method dump skipped, instruction units count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.interact.bottom.InteractBottomAreaComponent.onViewCreated(android.view.View):void");
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        tp((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility
    public final void Fn1(ReusedUIAssem<? extends C03H5> reusedUIAssem, Function0<Unit> function0) {
        this.LLJLIL.LIZLLL(LJJIJL(), reusedUIAssem);
        function0.invoke();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        long jLJFF = C0RQN.LJFF();
        C01GW c01gw = C692070RCr.LIZ;
        C692090RCt c692090RCtLIZLLL = C692070RCr.LIZLLL(String.valueOf(jm().hashCode()), "InteractBottomAreaComponent", "onHolderSelected");
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C0RDX.LIZ((InterfaceC691660RBc) it2.next(), i, aweme);
            }
        }
        C01GW c01gw2 = C692070RCr.LIZ;
        C692070RCr.LIZ(c692090RCtLIZLLL, String.valueOf(jm().hashCode()), null, null);
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_ONSELECTED, jLJFF);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void T6(int i, Aweme aweme) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        long jLJFF = C0RQN.LJFF();
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC691660RBc) it2.next()).T6(i, aweme);
            }
        }
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_ONREUSEDBIND, jLJFF);
        }
    }
}
