package com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag;

import X.C13LE;
import X.C19719912Dl;
import X.C2277711EDh;
import X.C690870R8b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.AbsVideoSocialTagContainerTrigger;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedReconsumptionTagTriggerV2 extends AbsVideoSocialTagContainerTrigger {
    @Override // com.ss.android.ugc.feed.platform.cell.trigger.AbsComponentTrigger
    public final C19719912Dl LJIIJJI() {
        return C13LE.LIZ(FeedReconsumptionTagAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String zg() {
        return "high_tag_reconsumption";
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
        int i = FeedReconsumptionTagTrigger.LLJL;
        if (aweme == null) {
            return false;
        }
        if (!C2277711EDh.LIZIZ.LJ(aweme) && aweme.getRecReasonTag() == null) {
            return false;
        }
        return true;
    }
}
