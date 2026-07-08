package com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag;

import X.C01GW;
import X.C03H5;
import X.C0RKG;
import X.C0RP1;
import X.C13IQ;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C1865850yed;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C688590Qzh;
import X.C697060RVw;
import X.C697070RVx;
import X.C699500RcC;
import X.C700100RdA;
import X.C700450Rdj;
import X.C708910RrN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1554640qYg;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationTrigger;
import com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationVM;
import com.ss.android.ugc.aweme.feed.assem.unreadshare.HideComponentForTagAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoTagCategoryProtocol;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedDMSharedTagTrigger extends BaseCellTriggerComponent<FeedDMSharedTagTrigger> implements VideoTagCategoryProtocol, HideComponentForTagAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1262));
    public final InterfaceC1731706qJ LLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FeedDMSharedTagTrigger.class, "sharerInfoVM", "getSharerInfoVM()Lcom/ss/android/ugc/aweme/feed/assem/sharer/VideoExposeSharerInformationVM;", 0);
        C13LE.LIZ.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FeedDMSharedTagTrigger() {
        C0RP1 c0rp1 = C0RP1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoExposeSharerInformationVM.class);
        this.LLJL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0rp1, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 1263), null, AFwS243S0000000_11.get$arr$(567));
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final C700450Rdj Ke1() {
        return null;
    }

    @Override // X.C0RJM
    public final boolean Kj() {
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final boolean YZ() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> getType() {
        return C13LE.LIZ(FeedDMSharedTagAssem.class);
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
        if (str.hashCode() != -477493971) {
            return null;
        }
        return this;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void so() {
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJL.getValue(this, LLJLIL[0]), new C2217381BqS() { // from class: X.0ROw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0S2L) obj).LLJILJIL;
            }
        }, null, AFwS294S0000000_11.get$arr$(214), 6);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String zg() {
        return "high_tag_dm_shared";
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return C0RKG.LIZIZ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        C688590Qzh.LIZLLL(this);
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.unreadshare.HideComponentForTagAbility
    public final void LJJJJIZL() {
        View viewLJJIJL = LJJIJL();
        C708910RrN c708910RrN = viewLJJIJL instanceof C708910RrN ? (C708910RrN) viewLJJIJL : null;
        if (c708910RrN != null) {
            c708910RrN.setTag(C700100RdA.LJI, "is_avoided");
            C786410Ut5.W(c708910RrN, 8);
        } else {
            View viewLJJIJL2 = LJJIJL();
            if (viewLJJIJL2 != null) {
                C786410Ut5.LJLLLLLL(8, viewLJJIJL2);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C0RKG.LIZ(this);
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
        return C0RKG.LIZJ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void tp(Object obj) {
        up((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* JADX INFO: renamed from: sp */
    public final void up(VideoItemParams videoItemParams) {
        PriorityAbility priorityAbility;
        tp(videoItemParams);
        C786410Ut5.LJLLLLLL(8, LJJIJL());
        if (yp(videoItemParams) && (priorityAbility = (PriorityAbility) this.LLJJLIIIJLLLLLLLZ.getValue()) != null) {
            priorityAbility.MJ(this, new AwS590S0100000_11(this, 17));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean up(VideoItemParams videoItemParams) {
        return yp(videoItemParams);
    }

    public final boolean yp(VideoItemParams videoItemParams) {
        C697060RVw c697060RVw = C697060RVw.LIZ;
        Aweme aweme = videoItemParams.getAweme();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        c697060RVw.getClass();
        if (!C697060RVw.LIZ(fragmentLJI, aweme)) {
            VideoExposeSharerInformationTrigger.LLJLIL.getClass();
            if (!C697070RVx.LIZ(videoItemParams, true) || !C1865850yed.LIZ()) {
                return false;
            }
        }
        return true;
    }
}
