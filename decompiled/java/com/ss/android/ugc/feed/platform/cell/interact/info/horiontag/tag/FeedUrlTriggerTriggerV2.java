package com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag;

import X.C0RW5;
import X.C13LE;
import X.C19719912Dl;
import X.C690870R8b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.AbsVideoSocialTagContainerTrigger;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedUrlTriggerTriggerV2 extends AbsVideoSocialTagContainerTrigger {
    @Override // com.ss.android.ugc.feed.platform.cell.trigger.AbsComponentTrigger
    public final C19719912Dl LJIIJJI() {
        return C13LE.LIZ(FeedUrlTagAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String zg() {
        return "high_tag_multilabel";
    }

    @Override // X.C0RWO
    public final void bf(Aweme aweme) {
        LJIJJLI();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.AbsComponentTrigger
    public final boolean LJIIJ(VideoItemParams videoItemParams, C690870R8b c690870R8b) {
        Aweme aweme;
        if (videoItemParams != null) {
            aweme = videoItemParams.getAweme();
        } else {
            aweme = null;
        }
        int i = FeedUrlTriggerTrigger.LLJL;
        return C0RW5.LIZ(aweme);
    }
}
