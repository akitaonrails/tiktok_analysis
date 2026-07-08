package com.ss.android.ugc.aweme.feed.assem.tikbot;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C03H5;
import X.C07G1;
import X.C0AX2;
import X.C0AXL;
import X.C0AXP;
import X.C0RUJ;
import X.C1389300mG0;
import X.C13IQ;
import X.C13LE;
import X.C14TF;
import X.C2189821An6;
import X.C339190DRl;
import X.C452501pT;
import X.C724240Sb0;
import X.InterfaceC1350790lFt;
import X.InterfaceC691660RBc;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility;
import com.ss.android.ugc.feed.platform.dowgrade.BaseDowngradeCellTriggerComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class TakoTrigger extends BaseDowngradeCellTriggerComponent<TakoTrigger> implements C0RUJ {
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 256));

    @Override // X.C0RUJ
    public final void Ie() {
    }

    @Override // X.C0RUJ
    public final String T1() {
        return "right_container_chat_gpt";
    }

    @Override // X.C0RUJ
    public final void a6() {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> getType() {
        return C13LE.LIZ(TakoAssem.class);
    }

    @Override // X.C0RUJ
    public final void lj() {
    }

    @Override // X.C0RUJ
    public final boolean m8() {
        return ((Boolean) C0AXP.LIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.feed.platform.dowgrade.BaseDowngradeCellTriggerComponent
    public final boolean yp() {
        if ((C07G1.LIZ() & 256) != 0) {
            return false;
        }
        return ((Boolean) C0AXL.LIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean ip(BaseFeedPageParams baseFeedPageParams) {
        return C14TF.LIZIZ.LJIILL().LJI(baseFeedPageParams.param);
    }

    @Override // com.ss.android.ugc.feed.platform.dowgrade.BaseDowngradeCellTriggerComponent, com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.dowgrade.BaseDowngradeCellTriggerComponent, com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* JADX INFO: renamed from: sp */
    public final void up(VideoItemParams videoItemParams) {
        InteractAreaAttachAbility interactAreaAttachAbility;
        super.up(videoItemParams);
        C339190DRl.LIZIZ(LJJIJL());
        if (up(videoItemParams) && (interactAreaAttachAbility = (InteractAreaAttachAbility) this.LLJL.getValue()) != null) {
            interactAreaAttachAbility.Fn1(this, new AwS555S0100000_11(this, 257));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean up(VideoItemParams videoItemParams) {
        C2189821An6 c2189821An6;
        if (C1389300mG0.LJFF(jm().LIZIZ())) {
            return false;
        }
        if ((C07G1.LIZ() & 32) == 0) {
            int i = videoItemParams.currentPosition;
            C01GW c01gw = C0AX2.LIZ;
            if (((Number) c01gw.getValue()).intValue() > 0 && i < ((Number) c01gw.getValue()).intValue()) {
                return false;
            }
        }
        C14TF c14tf = C14TF.LIZIZ;
        InterfaceC1350790lFt interfaceC1350790lFtLJIILL = c14tf.LJIILL();
        BaseFeedPageParams baseFeedPageParams = videoItemParams.baseFeedPageParams;
        if (baseFeedPageParams != null) {
            c2189821An6 = baseFeedPageParams.param;
        } else {
            c2189821An6 = null;
        }
        if (!interfaceC1350790lFtLJIILL.LJI(c2189821An6) || !c14tf.LJIILL().LJFF(videoItemParams.getAweme())) {
            return false;
        }
        return true;
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
