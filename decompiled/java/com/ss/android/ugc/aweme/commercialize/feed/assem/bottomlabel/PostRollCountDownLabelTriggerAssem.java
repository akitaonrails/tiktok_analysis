package com.ss.android.ugc.aweme.commercialize.feed.assem.bottomlabel;

import X.C01GW;
import X.C03H5;
import X.C0RJB;
import X.C1111504Wj;
import X.C13IQ;
import X.C13LE;
import X.C1558520qew;
import X.C2188811AlT;
import X.C2245741Cv6;
import X.C452501pT;
import X.C688590Qzh;
import X.C694180RKu;
import X.C696110RSf;
import X.C699500RcC;
import X.C700450Rdj;
import X.C786410Ut5;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.commercialize.feed.assem.midad.MidAdCellComponent;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility;
import com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel.VideoBottomLabelAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoBottomLabelProtocol;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class PostRollCountDownLabelTriggerAssem extends BaseCellTriggerComponent<MidAdCellComponent> implements VideoBottomLabelProtocol, ComponentPriorityProtocol, PostRollBottomAbility, InterfaceC1554640qYg {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new C696110RSf());
    public final C01GW LLJL = C452501pT.LIZIZ(new C0RJB(this));
    public final String LLJLIL;

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "bottom_tag_container_postroll_countdown";
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final C700450Rdj Ke1() {
        return null;
    }

    @Override // X.C0RJM
    public final boolean Kj() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean PT1() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean Qm0() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.VideoBottomLabelProtocol
    public final ReusedUIAssem<? extends C03H5> VO() {
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final boolean YZ() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> getType() {
        return C13LE.LIZ(MidAdCellComponent.class);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final boolean lk2() {
        return false;
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1981813616) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C700450Rdj vN0() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String zg() {
        return "bottom_tag_container_postroll_countdown";
    }

    public PostRollCountDownLabelTriggerAssem() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PostRollCountDownLabelTriggerAssem@");
        sbLIZ.append(hashCode());
        this.LLJLIL = C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        C688590Qzh.LIZLLL(this);
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final View Vt() {
        return LJJIJL();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC701260Rf2 vk() {
        C688590Qzh.LIZJ(this);
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC700000Rd0 wb1() {
        C688590Qzh.LIZIZ(this);
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return LJJIJL();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* JADX INFO: renamed from: sp */
    public final void up(VideoItemParams videoItemParams) {
        tp(videoItemParams);
        C786410Ut5.LJLLLLLL(8, LJJIJL());
        if (up(videoItemParams)) {
            InteractAreaAttachAbility interactAreaAttachAbility = (InteractAreaAttachAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), VideoBottomLabelAbility.class, null);
            if (interactAreaAttachAbility != null) {
                interactAreaAttachAbility.Fn1(this, new AwS555S0100000_11(this, 99));
                interactAreaAttachAbility.wR(0);
                return;
            }
            return;
        }
        if (C1111504Wj.LIZ()) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, LJJIJL());
        InteractAreaAttachAbility interactAreaAttachAbility2 = (InteractAreaAttachAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), VideoBottomLabelAbility.class, null);
        if (interactAreaAttachAbility2 == null) {
            return;
        }
        interactAreaAttachAbility2.wR(8);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean up(VideoItemParams videoItemParams) {
        if (((Boolean) this.LLJJLIIIJLLLLLLLZ.getValue()).booleanValue() && C2245741Cv6.LIZIZ(videoItemParams.getAweme())) {
            return true;
        }
        return false;
    }
}
