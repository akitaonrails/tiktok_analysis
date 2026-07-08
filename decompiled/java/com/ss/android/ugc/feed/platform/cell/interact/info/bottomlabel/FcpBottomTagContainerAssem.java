package com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel;

import X.InterfaceC697220RWm;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.banner.ClientStandardModel;
import com.ss.android.ugc.feed.platform.cell.interact.next.standardized.assem.FcpContainerAssem;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FcpBottomTagContainerAssem extends FcpContainerAssem {
    public final Function0<ClientStandardModel> LLLI;
    public final InterfaceC697220RWm LLLII;
    public final Function0<View> LLLIIII;

    @Override // com.ss.android.ugc.feed.platform.cell.interact.next.standardized.assem.FcpContainerAssem
    /* JADX INFO: renamed from: ip */
    public final void up(VideoItemParams videoItemParams) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.next.standardized.assem.FcpContainerAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
    }

    public FcpBottomTagContainerAssem(AwS545S0100000_1 awS545S0100000_1, VideoBottomDescLabelContainer videoBottomDescLabelContainer, AwS555S0100000_11 awS555S0100000_11) {
        super(awS545S0100000_1, "standardized_bottom_tag", videoBottomDescLabelContainer, AFwS198S0000000_11.get$arr$(532), awS555S0100000_11);
        this.LLLI = awS545S0100000_1;
        this.LLLII = videoBottomDescLabelContainer;
        this.LLLIIII = awS555S0100000_11;
    }
}
