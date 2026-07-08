package com.ss.android.ugc.aweme.commercialize.feed.assem.bottomlabel;

import X.C01GW;
import X.C03H5;
import X.C0RYO;
import X.C1017070cZd;
import X.C1022620cia;
import X.C13IQ;
import X.C13LE;
import X.C13LQ;
import X.C1697810uHb;
import X.C1865480ye2;
import X.C2095008Iq;
import X.C452501pT;
import X.C688590Qzh;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.C786410Ut5;
import X.EnumC1430380nKG;
import X.EnumC699300Rbs;
import X.InterfaceC698070RZt;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import Y.ACListenerS146S0100000_11;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.appdiff.ICommonFeedAppDiffProtocol;
import com.ss.android.ugc.aweme.commercialize.model.BrandedContentAccount;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel.BottomLabelTriggerComponent;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoBottomLabelProtocol;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class PaidPartnershipBottomLabelTriggerAssem extends BottomLabelTriggerComponent<PaidPartnershipBottomLabelUIAssem> implements VideoBottomLabelProtocol, ComponentPriorityProtocol {
    public final C01GW LLJLIL = C452501pT.LIZIZ(new C0RYO(this));
    public boolean LLJLILLLLZIIL;

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "bottom_tag_container_paid_partnership_label";
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
        return C13LE.LIZ(PaidPartnershipBottomLabelUIAssem.class);
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
        return "bottom_tag_container_paid_partnership_label";
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel.BottomLabelTriggerComponent
    public final InterfaceC698070RZt Ap() {
        return new InterfaceC698070RZt() { // from class: X.0RZs
            @Override // X.InterfaceC698070RZt
            public final Integer LIZIZ() {
                return null;
            }

            @Override // X.InterfaceC698070RZt
            public final String LLLII() {
                return "bottom_tag_container_paid_partnership_label";
            }

            @Override // X.InterfaceC698070RZt
            public final View.OnClickListener LIZ(VideoItemParams videoItemParams) {
                List<BrandedContentAccount> brandContentAccounts = videoItemParams.getAweme().getBrandContentAccounts();
                if (brandContentAccounts == null || brandContentAccounts.size() <= 0) {
                    return null;
                }
                return new ACListenerS146S0100000_11(brandContentAccounts, 73);
            }

            @Override // X.InterfaceC698070RZt
            public final String LIZJ(VideoItemParams videoItemParams) {
                return C1017070cZd.LJIL(videoItemParams.getAweme());
            }
        };
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        if (this.LLJLILLLLZIIL) {
            C1022620cia.LIZ("PaidPartnershipBottomLabelTriggerAssem", "[globalRelation] experiment SHOW, declare WITHOUT game anchors");
            return new C699500RcC(C1697810uHb.LJIIJJI("anchor_tiktok_game", "anchor_tiktok_game_creator", "anchor_minigame", "anchor_vertical_solution"), EnumC699300Rbs.WITHOUT);
        }
        C1022620cia.LIZ("PaidPartnershipBottomLabelTriggerAssem", "[globalRelation] experiment not SHOW, no mutual exclusion");
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

    public final void Bp(VideoItemParams videoItemParams) {
        AnchorCommonStruct next;
        String dataFromExtra;
        boolean z = false;
        Set setLJLIIL = C13LQ.LJLIIL(new Integer[]{Integer.valueOf(EnumC1430380nKG.VERTICAL_SOLUTION_GAME.getTYPE()), Integer.valueOf(EnumC1430380nKG.GAME_LIVE_PARTNER_ANCHOR.getTYPE()), Integer.valueOf(EnumC1430380nKG.GAME_LIVE_PARTNER_ANCHOR_2.getTYPE()), Integer.valueOf(EnumC1430380nKG.GAME_LIVE_PARTNER_ANCHOR_3.getTYPE())});
        List<AnchorCommonStruct> anchors = videoItemParams.getAweme().getAnchors();
        Integer numLJIIJJI = null;
        if (anchors != null) {
            Iterator<AnchorCommonStruct> it2 = anchors.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (setLJLIIL.contains(Integer.valueOf(next.getType()))) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AnchorCommonStruct anchorCommonStruct = next;
            if (anchorCommonStruct != null && (dataFromExtra = anchorCommonStruct.getDataFromExtra("bc_toggle_style_type", "")) != null) {
                numLJIIJJI = C2095008Iq.LJIIJJI(dataFromExtra);
            }
        }
        int value = AnchorCommonStruct.BCToggleABTestMode.SHOW.getValue();
        if (numLJIIJJI != null && numLJIIJJI.intValue() == value && !C1017070cZd.LJJJJZ(videoItemParams.getAweme()) && !TextUtils.isEmpty(C1017070cZd.LJIL(videoItemParams.getAweme()))) {
            z = true;
        }
        this.LLJLILLLLZIIL = z;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* JADX INFO: renamed from: sp */
    public final void up(VideoItemParams videoItemParams) {
        tp(videoItemParams);
        Bp(videoItemParams);
        C786410Ut5.LJLLLLLL(8, LJJIJL());
        yp(this, null, null);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean up(VideoItemParams videoItemParams) {
        Bp(videoItemParams);
        if (!TextUtils.isEmpty(C1017070cZd.LJIL(videoItemParams.getAweme()))) {
            ICommonFeedAppDiffProtocol.LIZ.getClass();
            C1865480ye2.LIZ().LJIIIIZZ();
            return true;
        }
        return false;
    }
}
