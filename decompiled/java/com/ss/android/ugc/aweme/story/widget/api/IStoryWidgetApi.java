package com.ss.android.ugc.aweme.story.widget.api;

import X.C0X9S;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.story.widget.model.StoryWidgetModel;

/* JADX INFO: loaded from: classes3.dex */
public interface IStoryWidgetApi {
    @InterfaceC1501160pAQ("/tiktok/v1/story/latest_in_feed")
    C0X9S<StoryWidgetModel> getStoryLatestInFeed();
}
