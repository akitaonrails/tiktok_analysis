package com.ss.android.ugc.aweme.base.util;

import X.C1598180rgu;
import com.ss.android.ugc.aweme.story.inbox.StoryInboxItem;

/* JADX INFO: loaded from: classes25.dex */
public final class InboxCacheItem {
    public final C1598180rgu liveItem;
    public final StoryInboxItem storyItem;
    public final String type;

    public InboxCacheItem(String str, StoryInboxItem storyInboxItem, C1598180rgu c1598180rgu) {
        this.type = str;
        this.storyItem = storyInboxItem;
        this.liveItem = c1598180rgu;
    }
}
