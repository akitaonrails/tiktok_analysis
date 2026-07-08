package com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag;

import X.C13LE;
import X.C19719912Dl;
import X.C690870R8b;
import X.C697050RVv;
import X.C700450Rdj;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.AbsVideoTagContainerTrigger;
import kotlin.jvm.internal.AwS625S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedLiveRelatedTagTriggerV2 extends AbsVideoTagContainerTrigger {
    public Aweme LLJILJILJ;

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.AbsComponentTrigger
    public final C19719912Dl LJIIJJI() {
        return C13LE.LIZ(FeedLiveRelatedTagAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String zg() {
        return "high_tag_live_related";
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.AbsComponentTrigger, com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final C700450Rdj Ke1() {
        int i = FeedLiveRelatedTagTrigger.LLJL;
        return new C700450Rdj(new AwS625S0100000_11(this.LLJILJILJ, 95), null, null, 4);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.AbsComponentTrigger
    public final boolean LJIIJ(VideoItemParams videoItemParams, C690870R8b c690870R8b) {
        Aweme aweme;
        Aweme aweme2 = null;
        if (videoItemParams != null) {
            aweme = videoItemParams.getAweme();
        } else {
            aweme = null;
        }
        this.LLJILJILJ = aweme;
        int i = FeedLiveRelatedTagTrigger.LLJL;
        if (videoItemParams != null) {
            aweme2 = videoItemParams.getAweme();
        }
        return C697050RVv.LIZ(aweme2);
    }
}
