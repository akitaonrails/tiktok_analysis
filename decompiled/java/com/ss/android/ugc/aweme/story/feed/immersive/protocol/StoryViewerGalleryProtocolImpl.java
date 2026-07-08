package com.ss.android.ugc.aweme.story.feed.immersive.protocol;

import X.C723850SaN;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryGalleryFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryViewerGalleryProtocolImpl implements IStoryViewerGalleryProtocol {
    @Override // com.ss.android.ugc.aweme.story.feed.immersive.protocol.IStoryGalleryProtocol
    public final int getLayoutId() {
        return R.layout.fbd;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.protocol.IStoryGalleryProtocol
    public final void jy2(StoryGalleryFragment storyGalleryFragment) {
        C723850SaN.LIZ(storyGalleryFragment, false, null, new AwS590S0100000_11(storyGalleryFragment, 550), 3);
    }
}
