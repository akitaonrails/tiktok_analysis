package com.ss.android.ugc.aweme.commercialize.feed.assem.bottomlabel;

import X.C1017070cZd;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel.BottomLabelUIModelAssem;
import com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel.FeedBottomLabelLayout;

/* JADX INFO: loaded from: classes12.dex */
public final class PaidPartnershipBottomLabelUIAssem extends BottomLabelUIModelAssem {
    @Override // com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel.BottomLabelUIModelAssem
    /* JADX INFO: renamed from: Ep */
    public final void tp(VideoItemParams videoItemParams) {
        FeedBottomLabelLayout feedBottomLabelLayoutBp;
        int i;
        super.tp(videoItemParams);
        Aweme aweme = videoItemParams.getAweme();
        if (this.LLJLLIL != null && (feedBottomLabelLayoutBp = Bp()) != null) {
            if (!C1017070cZd.LJJJJZ(aweme)) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, feedBottomLabelLayoutBp);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel.BottomLabelUIModelAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        tp((VideoItemParams) obj);
    }
}
