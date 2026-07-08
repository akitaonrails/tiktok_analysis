package com.ss.android.ugc.aweme.story.feed.common.sub.video;

import X.C13LE;
import X.C19719912Dl;
import X.C690870R8b;
import com.ss.android.ugc.aweme.story.feed.common.sub.video.component.StoryUploadingVideoCoverComponent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryUploadingVideoCellConfig extends StoryVideoCellConfig {
    @Override // com.ss.android.ugc.aweme.story.feed.common.sub.video.StoryVideoCellConfig
    public final C19719912Dl LIZ() {
        return C13LE.LIZ(StoryUploadingVideoCoverComponent.class);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.sub.video.StoryVideoCellConfig, com.ss.android.ugc.feed.platform.cell.CellConfigurationProtocol
    public final boolean Jg(C690870R8b c690870R8b) {
        return Intrinsics.LJFF(c690870R8b.LIZ(), "cell_story_video_uploading");
    }
}
