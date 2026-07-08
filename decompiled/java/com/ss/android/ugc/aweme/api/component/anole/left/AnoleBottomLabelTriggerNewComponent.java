package com.ss.android.ugc.aweme.api.component.anole.left;

import X.C01GW;
import X.C03H5;
import X.C0RJ8;
import X.C1111504Wj;
import X.C13IQ;
import X.C13LE;
import X.C1558520qew;
import X.C452501pT;
import X.C688590Qzh;
import X.C693430RHx;
import X.C693790RJh;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.C786410Ut5;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility;
import com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel.VideoBottomLabelAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoBottomLabelProtocol;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes12.dex */
public final class AnoleBottomLabelTriggerNewComponent extends BaseCellTriggerComponent<AnoleBottomLabelAssem> implements VideoBottomLabelProtocol, ComponentPriorityProtocol {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new C0RJ8(this));

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "bottom_tag_container_anole_label_slot";
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
        return C13LE.LIZ(AnoleBottomLabelAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final boolean lk2() {
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

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String zg() {
        return "bottom_tag_container_anole_label_slot";
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
                interactAreaAttachAbility.Fn1(this, new AwS555S0100000_11(this, 57));
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
        Aweme aweme = videoItemParams.getAweme();
        String str = C693430RHx.LIZ;
        if (a0.LJJJIL(str)) {
            return false;
        }
        return C693790RJh.LIZ(aweme).contains(str);
    }
}
