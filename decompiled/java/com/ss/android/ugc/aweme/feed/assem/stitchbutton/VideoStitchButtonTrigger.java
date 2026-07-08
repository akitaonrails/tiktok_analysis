package com.ss.android.ugc.aweme.feed.assem.stitchbutton;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C03H5;
import X.C0C64;
import X.C0XQ7;
import X.C13IQ;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2189821An6;
import X.C2217381BqS;
import X.C452501pT;
import X.C688590Qzh;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.C706110Rmr;
import X.C706120Rms;
import X.C706130Rmt;
import X.C706140Rmu;
import X.C706150Rmv;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class VideoStitchButtonTrigger extends BaseCellTriggerComponent<VideoStitchButtonTrigger> implements PriorityProtocol {
    public static final C706150Rmv LLJLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Rmv] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoStitchButtonTrigger.class, "stitchButtonVM", "getStitchButtonVM()Lcom/ss/android/ugc/aweme/feed/assem/stitchbutton/VideoStitchButtonViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJLIL = new Object() { // from class: X.0Rmv
        };
    }

    public VideoStitchButtonTrigger() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoStitchButtonViewModel.class);
        this.LLJJLIIIJLLLLLLLZ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), null, C1637806bA.LIZ, new C706110Rmr(c19719912DlLIZ), null, new C706140Rmu());
        this.LLJL = C452501pT.LIZIZ(new C706120Rms(this));
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "bottom_button_stitch";
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
        return C13LE.LIZ(VideoStitchButtonAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final boolean lk2() {
        return false;
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String zg() {
        return "bottom_button_stitch";
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
        up((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* JADX INFO: renamed from: sp */
    public final void up(VideoItemParams videoItemParams) {
        PriorityAbility priorityAbility;
        tp(videoItemParams);
        C786410Ut5.LJLLLLLL(8, LJJIJL());
        if (lp(videoItemParams) && (priorityAbility = (PriorityAbility) this.LLJL.getValue()) != null) {
            priorityAbility.MJ(this, new AwS590S0100000_11(this, 102));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean up(VideoItemParams videoItemParams) {
        C706130Rmt.LIZ.getClass();
        if (((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getAccountType() == 3 || C0C64.LJIILLIIL().LJIJ(31744, 0, "show_stitch_button_on_player", true) != 1) {
            return false;
        }
        Object value = this.LLJJLIIIJLLLLLLLZ.getValue(this, LLJLILLLLZIIL[0]);
        Aweme aweme = videoItemParams.getAweme();
        value.getClass();
        if (!VideoStitchButtonViewModel.vQ2(aweme)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean kp(BaseFeedPageParams baseFeedPageParams, int i) {
        C706130Rmt.LIZ.getClass();
        if (((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getAccountType() == 3 || C0C64.LJIILLIIL().LJIJ(31744, 0, "show_stitch_button_on_player", true) != 1 || i != 3) {
            return false;
        }
        LLJLIL.getClass();
        C2189821An6 c2189821An6 = baseFeedPageParams.param;
        if (c2189821An6 == null || !c2189821An6.isFromStitchChain()) {
            return false;
        }
        return true;
    }
}
