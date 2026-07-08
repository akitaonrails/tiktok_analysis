package com.ss.android.ugc.aweme.story.archive2;

import X.C2189821An6;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.story.archive2.feed.BaseStoryArchiveV2FeedSharedViewModel;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public interface IStoryArchiveV2Service {
    Pair<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(C2189821An6 c2189821An6);

    BaseStoryArchiveV2FeedSharedViewModel<?, ?> LIZIZ(LifecycleOwner lifecycleOwner, C2189821An6 c2189821An6);

    boolean LIZJ(C2189821An6 c2189821An6);

    BaseStoryArchiveV2FeedSharedViewModel LIZLLL(String str, LifecycleOwner lifecycleOwner);
}
