package com.ss.android.ugc.aweme.story.feed.common.collection.viewmodel;

import X.C06Y2;
import X.C095D;
import X.C0PEM;
import X.C11NZ;
import X.C2189821An6;
import X.C2502209rI;
import X.C728370Shf;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryRevealFeedViewModel extends StoryFeedViewModel {
    @Override // com.ss.android.ugc.aweme.story.feed.common.collection.viewmodel.StoryFeedViewModel
    public final boolean GQ2() {
        return false;
    }

    public StoryRevealFeedViewModel(LifecycleOwner lifecycleOwner, C2189821An6 c2189821An6) {
        super(lifecycleOwner, c2189821An6);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.collection.viewmodel.StoryFeedViewModel
    public final C11NZ<UserStoryResponse> bR2(String str, String str2, long j, boolean z, UserStory userStory, C2189821An6 c2189821An6) {
        if (!Intrinsics.LJFF(str2, "reveal_story")) {
            return super.bR2(str, str2, j, z, userStory, c2189821An6);
        }
        C728370Shf.LIZ.getClass();
        return C11NZ.LJIJJLI(new C2502209rI(C0PEM.LIZJ, new C095D(new C06Y2(j, null, z)), 1));
    }
}
