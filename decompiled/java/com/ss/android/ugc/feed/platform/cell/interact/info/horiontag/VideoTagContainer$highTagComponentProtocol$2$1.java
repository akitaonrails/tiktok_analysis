package com.ss.android.ugc.feed.platform.cell.interact.info.horiontag;

import X.C0RQN;
import X.C0RWV;
import X.C0RWZ;
import X.C0RXO;
import X.C0RY3;
import X.C0RZK;
import X.C0S41;
import X.C0S4B;
import X.C13LP;
import X.C2097608Jq;
import X.C2765015f;
import X.C631370Opb;
import X.C697240RWo;
import X.C697770RYp;
import X.C697790RYr;
import X.C698680Ras;
import X.C698800Rb4;
import X.C699500RcC;
import X.C700170RdH;
import X.C700260RdQ;
import X.C700450Rdj;
import X.C700950ReX;
import X.C700960ReY;
import X.C701320Rf8;
import X.EnumC695830RRd;
import X.EnumC697290RWt;
import X.EnumC697700RYi;
import X.EnumC697820RYu;
import X.InterfaceC697220RWm;
import X.InterfaceC697230RWn;
import X.InterfaceC697640RYc;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import X.InterfaceC702410Rgt;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.assem.unreadshare.HideComponentForButtonAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class VideoTagContainer$highTagComponentProtocol$2$1 implements ComponentPriorityProtocol, InterfaceC697640RYc, C0RY3 {
    public final /* synthetic */ C697240RWo LL = new C697240RWo();
    public final /* synthetic */ VideoTagContainer LLILLJJLI;

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        return null;
    }

    public final void LIZ(String str, boolean z) {
        this.LL.LIZ(str, z);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return "high_tag";
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return true;
    }

    @Override // X.InterfaceC697640RYc
    public final void rk(C0RZK c0rzk, Function1<? super Boolean, Unit> function1) {
        this.LL.rk(c0rzk, function1);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC701260Rf2 vk() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC700000Rd0 wb1() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        Set<String> setKeySet;
        if (this.LLILLJJLI.Fp()) {
            Map<String, PriorityProtocol> map = this.LLILLJJLI.Bp().LIZLLL().get("high_tag");
            if (map == null || (setKeySet = map.keySet()) == null) {
                return null;
            }
            return (String) C13LP.LJJJLIIL(setKeySet);
        }
        C698800Rb4 c698800Rb4 = C698800Rb4.LIZ;
        String str = (String) this.LLILLJJLI.LLLII.getValue();
        String genreType = AwemeExtKt.getGenreType(((VideoItemParams) C631370Opb.LIZ(this.LLILLJJLI)).getAweme());
        FeedComponentPriorityData feedComponentPriorityDataUp = this.LLILLJJLI.up();
        Map<String, PriorityProtocol> mapLJ = this.LLILLJJLI.Bp().LIZJ().get("high_tag");
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        EnumC697700RYi enumC697700RYi = EnumC697700RYi.VIDEO_TAG;
        c698800Rb4.getClass();
        return C698800Rb4.LIZLLL(str, genreType, feedComponentPriorityDataUp, mapLJ, enumC697700RYi);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean Qm0() {
        PriorityProtocol priorityProtocol;
        Map<String, PriorityProtocol> map = this.LLILLJJLI.Bp().LIZLLL().get("high_tag");
        return (map == null || (priorityProtocol = map.get(H3())) == null || !priorityProtocol.YZ()) ? false : true;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return ((InterfaceC697230RWn) C2097608Jq.LJFF("high_tag", this.LLILLJJLI.Bp().LIZIZ())).LJJIJL();
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean PT1() {
        return Qm0();
    }

    @Override // X.C0RY3
    public final C0S4B a7() {
        String strH3 = H3();
        if (strH3 == null || strH3.length() == 0) {
            return null;
        }
        Map<String, PriorityProtocol> map = this.LLILLJJLI.Bp().LIZJ().get("high_tag");
        return C0S41.LJI(map != null ? map.get(H3()) : null);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C700450Rdj vN0() {
        Map<String, PriorityProtocol> map;
        PriorityProtocol priorityProtocol;
        String strH3 = H3();
        if (strH3 == null || strH3.length() == 0 || (map = this.LLILLJJLI.Bp().LIZJ().get("high_tag")) == null || (priorityProtocol = map.get(H3())) == null) {
            return null;
        }
        return priorityProtocol.Ke1();
    }

    public VideoTagContainer$highTagComponentProtocol$2$1(VideoTagContainer videoTagContainer) {
        this.LLILLJJLI = videoTagContainer;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
        boolean z2;
        HideComponentForButtonAbility hideComponentForButtonAbility;
        Aweme aweme;
        C697790RYr c697790RYr = C697790RYr.LIZ;
        String aid = ((VideoItemParams) C631370Opb.LIZ(this.LLILLJJLI)).getAweme().getAid();
        EnumC697290RWt enumC697290RWt = EnumC697290RWt.P_TAG_DECISION;
        String start = enumC697290RWt.getStart();
        EnumC697820RYu enumC697820RYu = EnumC697820RYu.APPEND;
        C700950ReX c700950ReXLIZIZ = null;
        c697790RYr.getClass();
        C697790RYr.LIZJ(aid, start, null, enumC697820RYu, null, null);
        C2765015f.LIZJ("high_tag.notifyDecisionDone", new AwS555S0100000_11(this.LLILLJJLI, 1256));
        String aid2 = null;
        LIZ(null, z);
        if (z) {
            InterfaceC697220RWm interfaceC697220RWmRs = ((InterfaceC697230RWn) C2097608Jq.LJFF("high_tag", this.LLILLJJLI.Bp().LIZIZ())).rs();
            C698680Ras c698680RasLIZ = C0RXO.LIZ(H3(), "outreach", C2097608Jq.LJ());
            C701320Rf8 c701320Rf8 = C701320Rf8.LIZ;
            final VideoTagContainer videoTagContainer = this.LLILLJJLI;
            interfaceC697220RWmRs.gg(new C700260RdQ(c698680RasLIZ, c701320Rf8, false, new InterfaceC702410Rgt() { // from class: X.0RWT
                @Override // X.InterfaceC702410Rgt
                public final void hl() {
                }

                @Override // X.InterfaceC702410Rgt
                public final void vg(C700950ReX c700950ReX) {
                    C0RWZ c0rwz = (C0RWZ) ((LinkedHashMap) videoTagContainer.LLLIILIL).get("high_tag_standardized_container");
                    if (c0rwz != null) {
                        c0rwz.qa(c700950ReX);
                    }
                }
            }, 4));
        } else {
            C0RWZ c0rwz = (C0RWZ) ((LinkedHashMap) this.LLILLJJLI.LLLIILIL).get("high_tag_standardized_container");
            if (c0rwz != null) {
                C700170RdH c700170RdHJ9 = ((InterfaceC697230RWn) C2097608Jq.LJFF("high_tag", this.LLILLJJLI.Bp().LIZIZ())).rs().J9();
                if (c700170RdHJ9 != null) {
                    c700950ReXLIZIZ = C700960ReY.LIZIZ(c700170RdHJ9);
                }
                c0rwz.qa(c700950ReXLIZIZ);
            }
        }
        VideoTagContainer videoTagContainer2 = this.LLILLJJLI;
        AssemViewModel assemViewModel = (AssemViewModel) videoTagContainer2.LLLFFI.getValue(videoTagContainer2, VideoTagContainer.LLLJIL[2]);
        VideoItemParams videoItemParams = (VideoItemParams) C631370Opb.LIZ(this.LLILLJJLI);
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null) {
            aid2 = aweme.getAid();
        }
        C697770RYp.LIZ.getClass();
        if (C13LP.LJJJJ(H3(), C697770RYp.LIZJ) && !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        assemViewModel.getClass();
        if (aid2 != null) {
            assemViewModel.setStateImmediate(new C0RWV(aid2, z2));
        }
        if ((z || !Intrinsics.LJFF(H3(), "high_tag_dm_shared")) && (hideComponentForButtonAbility = (HideComponentForButtonAbility) this.LLILLJJLI.LLLIIII.getValue()) != null) {
            hideComponentForButtonAbility.LJJJJIZL();
        }
        C0RQN.LIZJ(((VideoItemParams) C631370Opb.LIZ(this.LLILLJJLI)).getAweme().getAid(), EnumC695830RRd.TAG_KEY, enumC697290RWt, H3());
        C2765015f.LIZ("high_tag.notifyDecisionDone", new AwS555S0100000_11(this.LLILLJJLI, 1257));
    }
}
