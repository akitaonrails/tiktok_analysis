package com.ss.android.ugc.feed.platform.cell.interact.info;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C03H5;
import X.C0X35;
import X.C1359490lTv;
import X.C1360220lV6;
import X.C1360240lV8;
import X.C1360250lV9;
import X.C13IQ;
import X.C1558520qew;
import X.C2188811AlT;
import X.C452501pT;
import X.C723830SaL;
import X.C724240Sb0;
import X.C724270Sb3;
import X.InterfaceC1360060lUq;
import X.InterfaceC1360230lV7;
import X.InterfaceC691660RBc;
import android.view.View;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractInfoAreaAttachAbility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes22.dex */
public final class UpvoteVideoTrigger extends BaseCellTriggerComponent<UpvoteVideoTrigger> {
    public static final C01GW<InterfaceC1360230lV7> LLJL = C452501pT.LIZIZ(new C1360240lV8());
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new C1360220lV6(this));

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJLLLL() {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> getType() {
        C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> c13iqLIZJ = LLJL.getValue().LIZJ();
        if (c13iqLIZJ != null) {
            return c13iqLIZJ;
        }
        throw new IllegalStateException("UpvoteVideoTrigger should have correct type");
    }

    public final InterfaceC1360060lUq yp() {
        return (InterfaceC1360060lUq) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJL() {
        InterfaceC1360060lUq interfaceC1360060lUqYp = yp();
        if (interfaceC1360060lUqYp != null) {
            interfaceC1360060lUqYp.LJL();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Object obj;
        String aid;
        super.onViewCreated(view);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onViewCreated: ");
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        Aweme aweme = ((VideoItemParams) obj).getAweme();
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        sbLIZ.append(aid);
        C2188811AlT.LIZIZ(sbLIZ);
        C01GW<InterfaceC1360230lV7> c01gw = LLJL;
        if (c01gw.getValue().LIZJ() != null) {
            C0X35.LIZ("upvote_assem_part_1", false);
            C723830SaL.LIZ(this, null, new C1359490lTv(this));
            C0X35.LJIIJJI("upvote_assem_part_1", false);
            C0X35.LIZ("upvote_assem_part_2", false);
            InterfaceC1360230lV7 value = c01gw.getValue();
            C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> type = getType();
            yp();
            value.LIZ(this, type);
            C0X35.LJIIJJI("upvote_assem_part_2", false);
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
        String aid;
        tp(videoItemParams);
        InterfaceC1360060lUq interfaceC1360060lUqYp = yp();
        if (interfaceC1360060lUqYp != null) {
            Aweme aweme = videoItemParams.getAweme();
            if (aweme == null || (aid = aweme.getAid()) == null) {
                aid = "";
            }
            interfaceC1360060lUqYp.LJI(aid);
        }
        InteractAreaAttachAbility interactAreaAttachAbility = (InteractAreaAttachAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InteractInfoAreaAttachAbility.class, null);
        if (interactAreaAttachAbility != null) {
            interactAreaAttachAbility.Fn1(this, new C1360250lV9());
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean up(VideoItemParams videoItemParams) {
        boolean zLIZIZ;
        String aid;
        BaseFeedPageParams baseFeedPageParams = videoItemParams.baseFeedPageParams;
        C01GW<InterfaceC1360230lV7> c01gw = LLJL;
        if (c01gw.getValue().LIZJ() == null) {
            zLIZIZ = false;
        } else {
            zLIZIZ = c01gw.getValue().LIZIZ(videoItemParams.getAweme(), baseFeedPageParams);
        }
        InterfaceC1360060lUq interfaceC1360060lUqYp = yp();
        if (interfaceC1360060lUqYp != null) {
            Aweme aweme = videoItemParams.getAweme();
            if (aweme == null || (aid = aweme.getAid()) == null) {
                aid = "";
            }
            interfaceC1360060lUqYp.LJIIIIZZ(aid, zLIZIZ);
        }
        return zLIZIZ;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        InterfaceC1360060lUq interfaceC1360060lUqYp = yp();
        if (interfaceC1360060lUqYp != null) {
            interfaceC1360060lUqYp.LJJLJLI();
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
