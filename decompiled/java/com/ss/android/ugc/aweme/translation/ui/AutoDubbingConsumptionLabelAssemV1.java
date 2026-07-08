package com.ss.android.ugc.aweme.translation.ui;

import X.AbstractC738140SxQ;
import X.AnonymousClass0956;
import X.C017O;
import X.C01GW;
import X.C098200Yq;
import X.C0RDX;
import X.C0RJN;
import X.C0RR7;
import X.C0RT5;
import X.C10EU;
import X.C13LE;
import X.C189200o6;
import X.C19EG;
import X.C1AF0;
import X.C1AV3;
import X.C2180521AVm;
import X.C2217381BqS;
import X.C23250099c;
import X.C299180Bo4;
import X.C452501pT;
import X.C693770RJf;
import X.C694180RKu;
import X.C694320RLi;
import X.C698120RZy;
import X.C699500RcC;
import X.C700450Rdj;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC691660RBc;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.translation.service.IAutoDubbingService;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.info.ConstraintSizeVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class AutoDubbingConsumptionLabelAssemV1 extends BaseCellSlotComponent<AutoDubbingConsumptionLabelAssemV1> implements ComponentPriorityProtocol {
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 959));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 958));
    public final C01GW LLJZ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(493));
    public TuxTag LLJZIJLIL;
    public boolean LLL;
    public AnonymousClass0956 LLLF;

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "left_container_auto_dubbing";
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b8m;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean PT1() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean Qm0() {
        return false;
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C700450Rdj vN0() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC701260Rf2 vk() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC700000Rd0 wb1() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        AnonymousClass0956 anonymousClass0956 = this.LLLF;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLLF = null;
        C0RJN c0rjnLIZIZ = jm().LIZIZ();
        C19EG c19egLIZ = c0rjnLIZIZ != null ? c0rjnLIZIZ.LIZ() : null;
        C724270Sb3 c724270Sb3 = this.LLJI;
        String str = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).mEventType;
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (C0RR7.LIZIZ(c19egLIZ, ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme(), str)) {
            C01GW c01gw = C694320RLi.LIZ;
            C694320RLi.LIZ(LJJIJL(), null);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void LJL() {
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
            C0RDX.LIZIZ((InterfaceC691660RBc) it2.next());
        }
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return LJJIJL();
    }

    public final void Bp(boolean z) {
        View viewLJJIJL;
        if (C017O.LIZ()) {
            viewLJJIJL = getContentView();
        } else {
            viewLJJIJL = LJJIJL();
        }
        if (z) {
            C786410Ut5.LJLLLLLL(0, viewLJJIJL);
            InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLJLLL.getValue();
            if (interactAreaCommonAbility != null) {
                interactAreaCommonAbility.zB1(this);
            }
            InteractAreaCommonAbility interactAreaCommonAbility2 = (InteractAreaCommonAbility) this.LLJLLL.getValue();
            if (interactAreaCommonAbility2 != null) {
                interactAreaCommonAbility2.CL("left_container_auto_dubbing", this, true);
                return;
            }
            return;
        }
        InteractAreaCommonAbility interactAreaCommonAbility3 = (InteractAreaCommonAbility) this.LLJLLL.getValue();
        if (interactAreaCommonAbility3 != null) {
            interactAreaCommonAbility3.CL("left_container_auto_dubbing", this, false);
        }
        C2180521AVm.LIZLLL(viewLJJIJL, 8, C1AV3.LIZ(1, "Feed", null, "auto_dubbing_consumption_tag"));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
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

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
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

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Object c098200Yq;
        super.onViewCreated(view);
        try {
            Bp(false);
            this.LLJZIJLIL = (TuxTag) getContentView().findViewById(R.id.bdu);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1AF0.LJFF(thM5exceptionOrNullimpl, "AutoDubbingConsumptionLabelAssemV1 onViewCreated");
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        C19EG c19egLIZ;
        boolean zLIZ;
        VideoItemParams videoItemParams2 = videoItemParams;
        C0RJN c0rjnLIZIZ = jm().LIZIZ();
        if (c0rjnLIZIZ != null) {
            c19egLIZ = c0rjnLIZIZ.LIZ();
        } else {
            c19egLIZ = null;
        }
        if (C0RR7.LIZIZ(c19egLIZ, videoItemParams2.getAweme(), videoItemParams2.mEventType)) {
            C01GW c01gw = C694320RLi.LIZ;
            View viewLJJIJL = LJJIJL();
            C01GW<Integer> c01gw2 = ConstraintSizeVM.LL;
            C694320RLi.LIZIZ(C693770RJf.LIZ(), viewLJJIJL, true);
        }
        if (C299180Bo4.LIZ() && !C10EU.LJIIZILJ(AwemeExtKt.getAuthorUid(videoItemParams2.getAweme()))) {
            IAutoDubbingService iAutoDubbingServiceLIZ = C0RT5.LIZ();
            if (iAutoDubbingServiceLIZ != null) {
                iAutoDubbingServiceLIZ.LJ(videoItemParams2.getAweme());
            }
            IAutoDubbingService iAutoDubbingServiceLIZ2 = C0RT5.LIZ();
            if (iAutoDubbingServiceLIZ2 != null) {
                zLIZ = iAutoDubbingServiceLIZ2.LIZ(videoItemParams2.getAweme());
            } else {
                zLIZ = false;
            }
            Bp(zLIZ);
            AnonymousClass0956 anonymousClass0956 = this.LLLF;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LLLF = null;
            this.LLLF = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C698120RZy(this, null), 3);
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZ.getValue(), new C2217381BqS() { // from class: X.0NzD
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C709790Rsn) obj).LLILLL;
                }
            }, null, AFwS294S0000000_11.get$arr$(252), 6);
            return;
        }
        AnonymousClass0956 anonymousClass09562 = this.LLLF;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        this.LLLF = null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
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
                C0RDX.LIZ((InterfaceC691660RBc) it2.next(), i, aweme);
            }
        }
    }
}
