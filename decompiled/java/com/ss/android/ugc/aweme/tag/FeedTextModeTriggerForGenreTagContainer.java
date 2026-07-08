package com.ss.android.ugc.aweme.tag;

import X.C0RKJ;
import X.C13LE;
import X.C19719912Dl;
import X.C300390Bq1;
import X.C690870R8b;
import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.AbsInfoGenreTagContainerTrigger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoTagCategoryProtocol;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedTextModeTriggerForGenreTagContainer extends AbsInfoGenreTagContainerTrigger<FeedTextModeVideoTagAssem> implements VideoTagCategoryProtocol {
    @Override // com.ss.android.ugc.feed.platform.cell.trigger.AbsComponentTrigger
    public final C19719912Dl LJIIJJI() {
        return C13LE.LIZ(FeedTextModeVideoTagAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String zg() {
        return C300390Bq1.LIZ() ? "genre_tag_text" : "low_tag_text";
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.AbsComponentTrigger
    public final boolean LJIIJ(VideoItemParams videoItemParams, C690870R8b c690870R8b) {
        Aweme aweme;
        if (videoItemParams != null) {
            aweme = videoItemParams.getAweme();
        } else {
            aweme = null;
        }
        return C0RKJ.LIZIZ.LIZJ(aweme);
    }
}
