package com.ss.android.ugc.aweme.story.highlights.service;

import X.C2189821An6;
import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.story.feed.immersive.panel.component.StoryImmersiveUserFeedComponent;
import com.ss.android.ugc.aweme.story.highlights.feed.BaseStoryHighlightsFeedSharedVM;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightsAwemeDetailResponse;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightsCollectionCacheResponse;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public interface IStoryHighlightsService {
    Pair<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(C2189821An6 c2189821An6);

    BaseStoryHighlightsFeedSharedVM LIZIZ(StoryImmersiveUserFeedComponent storyImmersiveUserFeedComponent, C2189821An6 c2189821An6);

    Object LIZJ(String str, InterfaceC1364105Vn<? super StoryHighlightsCollectionCacheResponse> interfaceC1364105Vn);

    Object highlightAwemeDetail(String str, String str2, Integer num, InterfaceC1364105Vn<? super StoryHighlightsAwemeDetailResponse> interfaceC1364105Vn);
}
