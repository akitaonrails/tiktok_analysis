package com.ss.android.ugc.aweme.feed.assem.story;

import X.C0RKM;
import X.C13LE;
import X.C19719912Dl;
import X.C300390Bq1;
import X.C690870R8b;
import android.content.Context;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.AbsInfoGenreTagContainerTrigger;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoTagCategoryProtocol;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedStoryTagTriggerForGenreTagContainer extends AbsInfoGenreTagContainerTrigger<FeedStoryTagAssem> implements VideoTagCategoryProtocol {
    @Override // com.ss.android.ugc.feed.platform.cell.trigger.AbsComponentTrigger
    public final C19719912Dl LJIIJJI() {
        return C13LE.LIZ(FeedStoryTagAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String zg() {
        int i = FeedStoryTagTrigger.LLJL;
        return C300390Bq1.LIZ() ? "genre_tag_story" : "low_tag_story";
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.AbsComponentTrigger
    public final boolean LJIIJ(VideoItemParams videoItemParams, C690870R8b c690870R8b) {
        Context context;
        if (videoItemParams != null) {
            int i = FeedStoryTagTrigger.LLJL;
            ReusedAssem<?> reusedAssem = this.LLILLL;
            if (reusedAssem != null) {
                context = reusedAssem.getContext();
            } else {
                context = null;
            }
            return C0RKM.LIZ(context, videoItemParams.getAweme(), videoItemParams.mEventType);
        }
        return false;
    }
}
