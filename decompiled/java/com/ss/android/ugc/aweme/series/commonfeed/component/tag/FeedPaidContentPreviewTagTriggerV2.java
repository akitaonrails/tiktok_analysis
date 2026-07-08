package com.ss.android.ugc.aweme.series.commonfeed.component.tag;

import X.C13LE;
import X.C19719912Dl;
import X.C300390Bq1;
import X.C690870R8b;
import X.C696140RSi;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.AbsVideoTagContainerTrigger;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedPaidContentPreviewTagTriggerV2 extends AbsVideoTagContainerTrigger {
    @Override // com.ss.android.ugc.feed.platform.cell.trigger.AbsComponentTrigger
    public final C19719912Dl LJIIJJI() {
        return C13LE.LIZ(FeedPaidContentPreviewTagAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String zg() {
        return C300390Bq1.LIZ() ? "high_tag_paid_content_preview_tag" : "low_tag_paid_content_preview_tag";
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.AbsComponentTrigger
    public final boolean LJIIJ(VideoItemParams videoItemParams, C690870R8b c690870R8b) {
        if (videoItemParams != null) {
            int i = FeedPaidContentPreviewTagTrigger.LLJL;
            return C696140RSi.LIZ(videoItemParams);
        }
        return false;
    }
}
