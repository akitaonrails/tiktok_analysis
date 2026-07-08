package com.ss.android.ugc.feed.platform.cell.interact.bottom.bar;

import X.C01GW;
import X.C03H5;
import X.C11JF;
import X.C13IQ;
import X.C13LE;
import X.C1A54;
import X.C1A56;
import X.C1A57;
import X.C20267014Rw;
import X.C452501pT;
import X.C589080N8o;
import X.C688590Qzh;
import X.C694180RKu;
import X.C697860RYy;
import X.C699500RcC;
import X.C700450Rdj;
import X.C786410Ut5;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.live.RelatedLiveTagStruct;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.AwS647S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class GameLiveBottomBarAssemTriggerV2 extends BaseCellTriggerComponent<GameLiveBottomBarAssemTriggerV2> implements BottomBarPriorityProtocol {
    public static final /* synthetic */ int LLJLL = 0;
    public VideoItemParams LLJJLIIIJLLLLLLLZ;
    public C11JF LLJL;
    public long LLJLIL;
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new C697860RYy(this));

    static {
        new C1A56();
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "bottom_banner_game_live";
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
        return C13LE.LIZ(GameLiveBottomBarAssemV2.class);
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
        return "bottom_banner_game_live";
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final C700450Rdj Ke1() {
        return new C700450Rdj(new AwS647S0100000_33(this, 31), null, new AwS577S0100000_33(this, 3642));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJL() {
        Aweme aweme;
        Aweme aweme2;
        Aweme aweme3;
        RelatedLiveTagStruct relatedLiveTag;
        C589080N8o.LIZIZ(C20267014Rw.LIZ, "GameLiveBottomBarAssemTest", new C1A54(this));
        VideoItemParams videoItemParams = this.LLJJLIIIJLLLLLLLZ;
        if (videoItemParams != null && (aweme3 = videoItemParams.getAweme()) != null && (relatedLiveTag = aweme3.getRelatedLiveTag()) != null) {
            relatedLiveTag.enterMixPageSign = false;
        }
        C11JF c11jf = this.LLJL;
        if (c11jf == null || c11jf.isDisposed()) {
            return;
        }
        C11JF c11jf2 = this.LLJL;
        if (c11jf2 != null) {
            c11jf2.dispose();
        }
        VideoItemParams videoItemParams2 = this.LLJJLIIIJLLLLLLLZ;
        String aid = null;
        RelatedLiveTagStruct relatedLiveTag2 = (videoItemParams2 == null || (aweme2 = videoItemParams2.getAweme()) == null) ? null : aweme2.getRelatedLiveTag();
        boolean zLIZIZ = C1A56.LIZIZ(LJJIJL());
        long j = this.LLJLIL;
        C1A57 c1a57 = C1A57.LIZ;
        VideoItemParams videoItemParams3 = this.LLJJLIIIJLLLLLLLZ;
        if (videoItemParams3 != null && (aweme = videoItemParams3.getAweme()) != null) {
            aid = aweme.getAid();
        }
        c1a57.getClass();
        C1A56.LIZJ(videoItemParams2, relatedLiveTag2, false, zLIZIZ, true, j, j, true, C1A57.LIZIZ(aid), 8);
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
        tp(videoItemParams);
        C786410Ut5.LJLLLLLL(8, LJJIJL());
        if (lp(videoItemParams)) {
            C1A56.LIZLLL("game_live_bottom_banner_need_show", videoItemParams, false, false, 0L);
            PriorityAbility priorityAbility = (PriorityAbility) this.LLJLILLLLZIIL.getValue();
            if (priorityAbility != null) {
                priorityAbility.MJ(this, new AwS612S0100000_33(this, 102));
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean up(VideoItemParams videoItemParams) {
        if (C1A56.LJ(videoItemParams)) {
            this.LLJJLIIIJLLLLLLLZ = videoItemParams;
            return true;
        }
        return false;
    }
}
