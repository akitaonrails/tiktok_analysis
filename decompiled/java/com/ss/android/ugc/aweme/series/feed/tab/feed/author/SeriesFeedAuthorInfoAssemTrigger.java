package com.ss.android.ugc.aweme.series.feed.tab.feed.author;

import X.C01GW;
import X.C03H5;
import X.C0RRR;
import X.C0SFX;
import X.C13IQ;
import X.C13LE;
import X.C1558520qew;
import X.C452501pT;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.C718080SEs;
import X.C724270Sb3;
import X.C786410Ut5;
import X.InterfaceC1577520r9a;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.series.feed.ISeriesFeedService;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractInfoAreaAttachAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class SeriesFeedAuthorInfoAssemTrigger extends BaseCellTriggerComponent<SeriesFeedAuthorInfoAssemTrigger> implements ComponentPriorityProtocol {
    public static final /* synthetic */ int LLJL = 0;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new C718080SEs(this));

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "left_container_drama_info";
    }

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

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> getType() {
        return C13LE.LIZ(SeriesTabAuthorInfoAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean kp(BaseFeedPageParams baseFeedPageParams, int i) {
        return true;
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC701260Rf2 vk() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC700000Rd0 wb1() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C700450Rdj vN0() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        VideoItemParams videoItemParams = (VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null);
        return new C700450Rdj(new C0SFX(videoItemParams), new AwS625S0100000_11(videoItemParams, 47), new AwS555S0100000_11(videoItemParams, 547));
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
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
        InteractAreaAttachAbility interactAreaAttachAbility;
        tp(videoItemParams);
        C786410Ut5.LJLLLLLL(8, LJJIJL());
        if (up(videoItemParams) && (interactAreaAttachAbility = (InteractAreaAttachAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InteractInfoAreaAttachAbility.class, null)) != null) {
            interactAreaAttachAbility.Fn1(this, new AwS555S0100000_11(this, 546));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean up(VideoItemParams videoItemParams) {
        InterfaceC1577520r9a interfaceC1577520r9aLIZIZ;
        ISeriesFeedService iSeriesFeedServiceLIZIZ = C0RRR.LIZIZ();
        if (iSeriesFeedServiceLIZIZ == null || (interfaceC1577520r9aLIZIZ = iSeriesFeedServiceLIZIZ.LIZIZ()) == null || !interfaceC1577520r9aLIZIZ.LIZIZ(videoItemParams.getAweme(), videoItemParams.mEventType)) {
            return false;
        }
        return true;
    }
}
