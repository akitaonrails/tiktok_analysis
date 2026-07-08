package com.ss.android.ugc.aweme.feed.assem.tns.banner;

import X.C01GW;
import X.C03H5;
import X.C13IQ;
import X.C13LE;
import X.C1548820qPI;
import X.C1871910yoP;
import X.C1AV3;
import X.C2180521AVm;
import X.C23250099c;
import X.C262100zr;
import X.C452501pT;
import X.C660360PvG;
import X.C688590Qzh;
import X.C694180RKu;
import X.C697620RYa;
import X.C699500RcC;
import X.C700450Rdj;
import X.C702420Rgu;
import X.C707120RoU;
import X.C707130RoV;
import X.C707140RoW;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import X.InterfaceC699970Rcx;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FootNoteInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class TnsBannerAssemTrigger extends BaseCellTriggerComponent<TnsBannerAssemTrigger> implements BottomBarPriorityProtocol, InterfaceC1141530foN, InterfaceC699970Rcx {
    public final /* synthetic */ C702420Rgu LLJJLIIIJLLLLLLLZ = new C702420Rgu();
    public final C01GW LLJL = C452501pT.LIZIZ(new C697620RYa(this));
    public Aweme LLJLIL;

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
        return C13LE.LIZ(TnSBannerAssem.class);
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

    @Override // X.InterfaceC699970Rcx
    public final boolean Nm() {
        return this.LLJJLIIIJLLLLLLLZ.LL;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        C1548820qPI.LJIIIIZZ("footnotes_add_success", this);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String zg() {
        Aweme aweme = this.LLJLIL;
        return aweme != null ? C707140RoW.LIZIZ(aweme) ? "bottom_banner_take_down" : C660360PvG.LIZ(aweme) ? "bottom_banner_warning" : "bottom_banner_customized_notice" : "bottom_banner_customized_notice";
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return zg();
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

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        String strLJFF;
        String aid;
        if (Intrinsics.LJFF(c262100zr.LIZ, "footnotes_add_success")) {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            if (interfaceC1107590evd != null) {
                strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "awemeId", "");
            } else {
                strLJFF = null;
            }
            Aweme aweme = this.LLJLIL;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            if (!Intrinsics.LJFF(strLJFF, aid)) {
                return;
            }
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C707120RoU(this, null), 3);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C1548820qPI.LIZLLL("footnotes_add_success", this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* JADX INFO: renamed from: sp */
    public final void up(VideoItemParams videoItemParams) {
        PriorityAbility priorityAbility;
        PriorityAbility priorityAbility2;
        tp(videoItemParams);
        this.LLJLIL = videoItemParams.getAweme();
        C2180521AVm.LIZLLL(LJJIJL(), 8, C1AV3.LIZ(1, "Feed", null, "tns_banner"));
        if (lp(videoItemParams) && (priorityAbility2 = (PriorityAbility) this.LLJL.getValue()) != null) {
            priorityAbility2.MJ(this, new C707130RoV(this));
        }
        if (up(videoItemParams) && (priorityAbility = (PriorityAbility) this.LLJL.getValue()) != null) {
            priorityAbility.nw0(this, true);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean up(VideoItemParams videoItemParams) {
        FootNoteInfo footNoteInfo;
        this.LLJLIL = videoItemParams.getAweme();
        if (!C707140RoW.LIZ(videoItemParams) && (((footNoteInfo = videoItemParams.getAweme().getFootNoteInfo()) == null || footNoteInfo.banner == null) && !C707140RoW.LIZIZ(videoItemParams.getAweme()))) {
            return false;
        }
        return true;
    }
}
