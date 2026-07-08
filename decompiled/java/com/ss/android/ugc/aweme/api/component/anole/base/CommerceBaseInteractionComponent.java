package com.ss.android.ugc.aweme.api.component.anole.base;

import X.C01GW;
import X.C0RHW;
import X.C2188811AlT;
import X.C452501pT;
import X.C692570REp;
import X.C693790RJh;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.C786410Ut5;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class CommerceBaseInteractionComponent extends BaseCellTriggerComponent<CommerceBaseInteractionComponent> implements ComponentPriorityProtocol {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 54));
    public final C01GW LLJL = C452501pT.LIZIZ(new C692570REp(this));

    public abstract InteractAreaAttachAbility Ap();

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
    }

    public abstract String Bp();

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
    public C700450Rdj vN0() {
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

    public abstract String yp();

    public abstract String zp();

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return zp();
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return LJJIJL();
    }

    public boolean Ep(Aweme aweme) {
        if (a0.LJJJIL(yp())) {
            return false;
        }
        return C693790RJh.LIZ(aweme).contains(yp());
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
        Bp();
        C786410Ut5.LJLLLLLL(8, LJJIJL());
        if (up(videoItemParams)) {
            InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLJL.getValue();
            if (interactAreaCommonAbility != null) {
                interactAreaCommonAbility.zB1(this);
            }
            InteractAreaAttachAbility interactAreaAttachAbility = (InteractAreaAttachAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
            if (interactAreaAttachAbility != null) {
                interactAreaAttachAbility.Fn1(this, new C0RHW(this));
            }
            Bp();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean up(VideoItemParams videoItemParams) {
        Bp();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("trigger = ");
        sbLIZ.append(Ep(videoItemParams.getAweme()));
        sbLIZ.append(",slotId = ");
        sbLIZ.append(yp());
        C2188811AlT.LIZIZ(sbLIZ);
        return Ep(videoItemParams.getAweme());
    }
}
