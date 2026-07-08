package com.ss.android.ugc.aweme.feed.assem.story;

import X.C0RKM;
import X.C13LE;
import X.C19719912Dl;
import X.C300390Bq1;
import X.C690870R8b;
import X.C700450Rdj;
import android.content.Context;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.AbsInfoGenreTagContainerTrigger;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedStoryTagTriggerV2ForGenreTagContainer extends AbsInfoGenreTagContainerTrigger<FeedStoryTagAssemV2> implements ComponentPriorityProtocol {
    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.AbsComponentTrigger
    public final C19719912Dl LJIIJJI() {
        return C13LE.LIZ(FeedStoryTagAssemV2.class);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean PT1() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean Qm0() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C700450Rdj vN0() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String zg() {
        int i = FeedStoryTagTriggerV2.LLJLIL;
        return C300390Bq1.LIZ() ? "genre_tag_story" : "low_tag_story";
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.AbsComponentTrigger
    public final boolean LJIIJ(VideoItemParams videoItemParams, C690870R8b c690870R8b) {
        Context context;
        int i = FeedStoryTagTriggerV2.LLJLIL;
        if (videoItemParams == null) {
            return false;
        }
        ReusedAssem<?> reusedAssem = this.LLILLL;
        if (reusedAssem != null) {
            context = reusedAssem.getContext();
        } else {
            context = null;
        }
        int i2 = FeedStoryTagTrigger.LLJL;
        return C0RKM.LIZ(context, videoItemParams.getAweme(), videoItemParams.mEventType);
    }
}
