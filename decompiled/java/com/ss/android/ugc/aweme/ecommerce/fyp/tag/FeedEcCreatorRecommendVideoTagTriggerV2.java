package com.ss.android.ugc.aweme.ecommerce.fyp.tag;

import X.C13LE;
import X.C19719912Dl;
import X.C1D5X;
import X.C690870R8b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.AbsVideoTagContainerTrigger;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedEcCreatorRecommendVideoTagTriggerV2 extends AbsVideoTagContainerTrigger {
    @Override // com.ss.android.ugc.feed.platform.cell.trigger.AbsComponentTrigger
    public final C19719912Dl LJIIJJI() {
        return C13LE.LIZ(FeedEcCreatorRecommendVideoTagAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String zg() {
        return "high_tag_ttec_recommend_tag_creator";
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.AbsComponentTrigger
    public final boolean LJIIJ(VideoItemParams videoItemParams, C690870R8b c690870R8b) {
        Aweme aweme;
        int i = FeedEcCreatorRecommendVideoTagTrigger.LLJL;
        if (videoItemParams != null) {
            aweme = videoItemParams.getAweme();
        } else {
            aweme = null;
        }
        return C1D5X.LIZ(aweme);
    }
}
