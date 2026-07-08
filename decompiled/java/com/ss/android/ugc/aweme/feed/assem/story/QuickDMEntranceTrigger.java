package com.ss.android.ugc.aweme.feed.assem.story;

import X.C01GW;
import X.C03H5;
import X.C0RJN;
import X.C0S1K;
import X.C11JF;
import X.C11S5;
import X.C1239300iM4;
import X.C1389300mG0;
import X.C13IQ;
import X.C13LE;
import X.C1578630rBN;
import X.C1701940uOG;
import X.C452501pT;
import X.C688590Qzh;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.C702420Rgu;
import X.C706180Rmy;
import X.C706190Rmz;
import X.C706720Rnq;
import X.C706730Rnr;
import X.C706740Rns;
import X.C724240Sb0;
import X.C786410Ut5;
import X.EnumC713160RyE;
import X.InterfaceC699970Rcx;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;

/* JADX INFO: loaded from: classes12.dex */
public final class QuickDMEntranceTrigger extends BaseCellTriggerComponent<QuickDMEntranceTrigger> implements PriorityProtocol, InterfaceC699970Rcx {
    public final /* synthetic */ C702420Rgu LLJJLIIIJLLLLLLLZ = new C702420Rgu();
    public final C01GW LLJL = C452501pT.LIZIZ(new C706190Rmz(this));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new C706180Rmy(this));
    public C11JF LLJLILLLLZIIL;

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "bottom_button_story_message";
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final C700450Rdj Ke1() {
        return null;
    }

    @Override // X.C0RJM
    public final boolean Kj() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final boolean YZ() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> getType() {
        return C13LE.LIZ(QuickDMEntranceAssem.class);
    }

    @Override // X.InterfaceC699970Rcx
    public final boolean l5(boolean z) {
        return this.LLJJLIIIJLLLLLLLZ.l5(z);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final boolean lk2() {
        return false;
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String zg() {
        return "bottom_button_story_message";
    }

    @Override // X.InterfaceC699970Rcx
    public final boolean Nm() {
        return this.LLJJLIIIJLLLLLLLZ.LL;
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
        return Vt();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        boolean zLJI = MethodIDManager.LJI(71790);
        up((VideoItemParams) obj);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* JADX INFO: renamed from: sp */
    public final void up(VideoItemParams videoItemParams) {
        boolean zLJI = MethodIDManager.LJI(71790);
        tp(videoItemParams);
        if (lp(videoItemParams)) {
            PriorityAbility priorityAbility = (PriorityAbility) this.LLJL.getValue();
            if (priorityAbility != null) {
                priorityAbility.MJ(this, new C706740Rns(this));
            }
            C11JF c11jf = this.LLJLILLLLZIIL;
            if (c11jf != null) {
                c11jf.dispose();
            }
            this.LLJLILLLLZIIL = null;
            this.LLJLILLLLZIIL = C1239300iM4.LJ(C0S1K.LIZIZ.LJI(videoItemParams.getAweme(), EnumC713160RyE.FEED, null).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()), new C706720Rnq(this), C1239300iM4.LIZJ, new C706730Rnr(this));
        } else {
            C786410Ut5.LJLLLLLL(8, LJJIJL());
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean up(VideoItemParams videoItemParams) {
        C0RJN c0rjnLIZIZ;
        C0RJN c0rjnLIZIZ2;
        Fragment fragment;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            c0rjnLIZIZ = C1578630rBN.LIZIZ(fragmentLJI);
        } else {
            c0rjnLIZIZ = null;
        }
        if ((!C1389300mG0.LJIL(c0rjnLIZIZ) && !C1389300mG0.LJIIIZ(c0rjnLIZIZ) && !C1389300mG0.LJIIIIZZ(c0rjnLIZIZ) && !C1389300mG0.LJII(c0rjnLIZIZ)) || !C0S1K.LIZIZ.LIZ(videoItemParams.getAweme(), EnumC713160RyE.FEED, null) || ((c0rjnLIZIZ2 = jm().LIZIZ()) != null && (fragment = c0rjnLIZIZ2.LJ) != null && C1389300mG0.LJIIJ(fragment))) {
            return false;
        }
        return true;
    }
}
