package com.ss.android.ugc.feed.platform.cell.interact.info.titlecontainer;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0RDX;
import X.C0RKE;
import X.C0RPT;
import X.C0RPV;
import X.C0RPZ;
import X.C0RQ6;
import X.C1558520qew;
import X.C339190DRl;
import X.C426750GoL;
import X.C693480RIc;
import X.C693770RJf;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.C724240Sb0;
import X.C786410Ut5;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC691660RBc;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoRelationAssem;
import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoInfoGenreTagContainerAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import com.ss.android.ugc.feed.platform.ab.LowScreenOptimizeAB;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.core.BaseContainer;
import com.ss.android.ugc.feed.platform.container.core.VContainerProtocol;
import com.ss.android.ugc.feed.platform.container.info.ConstraintSizeVM;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class InteractTitleContainer extends BaseContainer<VContainerProtocol, InteractTitleContainer> implements InteractTitleContainerAbility, InterfaceC1554640qYg {
    public final C0RPZ LLJL = new C0RPZ(false, false, LowScreenOptimizeAB.LIZJ().operatorRefactor);

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -185125902) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.info.titlecontainer.InteractTitleContainerAbility
    public final ComponentPriorityProtocol u9() {
        return new ComponentPriorityProtocol() { // from class: com.ss.android.ugc.feed.platform.cell.interact.info.titlecontainer.InteractTitleContainer$getAreaContainerAsProtocol$1
            @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
            public final void Bh2(boolean z) {
            }

            @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
            public final String H3() {
                return "title_container";
            }

            @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
            public final C699500RcC II() {
                return null;
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
                return false;
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

            @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
            public final View xb() {
                return this.LL.LJJIJL();
            }

            @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
            public final String LLLII() {
                return C694180RKu.LIZ(this);
            }
        };
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

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    public final C0RQ6 hp() {
        return C0RQ6.TITLE_CONTAINER;
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

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        LinearLayout.LayoutParams layoutParams;
        LinearLayout linearLayout;
        ViewGroup viewGroup;
        C0RKE c0rke = C0RKE.LIZ;
        C0RPZ c0rpz = this.LLJL;
        c0rke.getClass();
        final View viewLJJIJL = LJJIJL();
        final C0RPT c0rpt = new C0RPT(new AwS555S0100000_11(this, 1340));
        c0rpz.LJIIIZ = new C0RPV(viewLJJIJL, c0rpt) { // from class: X.0RPQ
            @Override // X.C0RPV
            public final C695280RPa LIZIZ(String str) {
                return new C695280RPa(0, 0, 15);
            }
        };
        VideoAuthorInfoRelationAssem videoAuthorInfoRelationAssem = new VideoAuthorInfoRelationAssem();
        IFeedDebugService iFeedDebugService = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
        if (iFeedDebugService != null) {
            iFeedDebugService.LJIJJ();
        }
        ArrayList arrayList = (ArrayList) C693480RIc.LIZIZ;
        arrayList.add(videoAuthorInfoRelationAssem);
        VideoInfoGenreTagContainerAssem videoInfoGenreTagContainerAssem = new VideoInfoGenreTagContainerAssem();
        IFeedDebugService iFeedDebugService2 = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
        if (iFeedDebugService2 != null) {
            iFeedDebugService2.LJIJJ();
        }
        arrayList.add(videoInfoGenreTagContainerAssem);
        if (LJJIJL() instanceof ViewGroup) {
            C0RPZ c0rpz2 = this.LLJL;
            View viewLJJIJL2 = LJJIJL();
            if ((viewLJJIJL2 instanceof ViewGroup) && (viewGroup = (ViewGroup) viewLJJIJL2) != null) {
                C693480RIc.LIZ(this, c0rpz2, viewGroup);
            } else {
                return;
            }
        }
        C339190DRl.LIZLLL(LJJIJL());
        View viewLJJIJL3 = LJJIJL();
        if ((viewLJJIJL3 instanceof LinearLayout) && (linearLayout = (LinearLayout) viewLJJIJL3) != null) {
            linearLayout.setGravity(8388627);
        }
        ViewGroup viewGroup2 = (ViewGroup) LJJIJL();
        ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
        layoutParams2.width = -2;
        layoutParams2.height = -2;
        C01GW<Integer> c01gw = ConstraintSizeVM.LL;
        C426750GoL.LJIIIZ(viewGroup2, null, null, null, Integer.valueOf(C693770RJf.LIZ()), false, 23);
        View childAt = viewGroup2.getChildAt(0);
        if (childAt != null && (childAt instanceof LinearLayout)) {
            LinearLayout linearLayout2 = (LinearLayout) childAt;
            ViewGroup.LayoutParams layoutParams3 = linearLayout2.getLayoutParams();
            layoutParams3.width = 0;
            layoutParams3.height = -2;
            if ((layoutParams3 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams3) != null) {
                layoutParams.weight = 1.0f;
            }
            C786410Ut5.d6(linearLayout2, layoutParams3);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
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

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void T6(int i, Aweme aweme) {
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
                ((InterfaceC691660RBc) it2.next()).T6(i, aweme);
            }
        }
    }
}
