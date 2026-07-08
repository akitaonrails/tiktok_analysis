package com.ss.android.ugc.aweme.series.feed.tab.feed.author;

import X.C0RRR;
import X.C0SFX;
import X.C337180DJs;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.C724270Sb3;
import X.InterfaceC1577520r9a;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.series.feed.ISeriesFeedService;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class SeriesTabAuthorInfoPersistentAssem extends SeriesTabAuthorInfoAssem implements ComponentPriorityProtocol {
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
        int i = SeriesFeedAuthorInfoAssemTrigger.LLJL;
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

    @Override // com.ss.android.ugc.aweme.series.feed.tab.feed.author.SeriesTabAuthorInfoAssem
    /* JADX INFO: renamed from: Ep */
    public final void up(VideoItemParams videoItemParams) {
        InterfaceC1577520r9a interfaceC1577520r9aLIZIZ;
        ISeriesFeedService iSeriesFeedServiceLIZIZ = C0RRR.LIZIZ();
        if (iSeriesFeedServiceLIZIZ != null && (interfaceC1577520r9aLIZIZ = iSeriesFeedServiceLIZIZ.LIZIZ()) != null && interfaceC1577520r9aLIZIZ.LIZIZ(videoItemParams.getAweme(), videoItemParams.mEventType)) {
            C337180DJs.LIZJ(LJJIJL());
        } else {
            C337180DJs.LIZ(LJJIJL());
        }
        super.up(videoItemParams);
    }

    @Override // com.ss.android.ugc.aweme.series.feed.tab.feed.author.SeriesTabAuthorInfoAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
        up(videoItemParams);
    }
}
