package com.ss.android.ugc.aweme.feed.assem.caption;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C03H5;
import X.C0RDX;
import X.C0RJN;
import X.C0RR7;
import X.C0RT2;
import X.C10EU;
import X.C13IQ;
import X.C1558520qew;
import X.C19EG;
import X.C300940Bqu;
import X.C693270RHh;
import X.C694320RLi;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C786410Ut5;
import X.InterfaceC691660RBc;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.ICLACaptionService;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractBizTopAreaAttachAbility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes12.dex */
public final class VideoCLACaptionTrigger extends BaseCellTriggerComponent<VideoCLACaptionTrigger> {
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean kp(BaseFeedPageParams baseFeedPageParams, int i) {
        return true;
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

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> getType() {
        return C0RT2.LIZ().LJII();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final void unBind() {
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

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* JADX INFO: renamed from: sp */
    public final void up(VideoItemParams videoItemParams) {
        InteractAreaAttachAbility interactAreaAttachAbility;
        tp(videoItemParams);
        C786410Ut5.LJLLLLLL(8, LJJIJL());
        C19EG c19egLIZ = null;
        if (up(videoItemParams) && (interactAreaAttachAbility = (InteractAreaAttachAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InteractBizTopAreaAttachAbility.class, null)) != null) {
            interactAreaAttachAbility.Fn1(this, new C693270RHh(this, videoItemParams));
        }
        C0RJN c0rjnLIZIZ = jm().LIZIZ();
        if (c0rjnLIZIZ != null) {
            c19egLIZ = c0rjnLIZIZ.LIZ();
        }
        if (C0RR7.LIZIZ(c19egLIZ, videoItemParams.getAweme(), videoItemParams.mEventType)) {
            C01GW c01gw = C694320RLi.LIZ;
            C694320RLi.LIZIZ(C694320RLi.LIZIZ, LJJIJL(), true);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean up(VideoItemParams videoItemParams) {
        if ((C300940Bqu.LIZ() && !C10EU.LJIILLIIL(videoItemParams.getAweme().getAuthor())) || videoItemParams.baseFeedPageParams == null) {
            return false;
        }
        return ((ICLACaptionService) ServiceManager.get().getService(ICLACaptionService.class)).LIZJ(videoItemParams.getAweme());
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
}
