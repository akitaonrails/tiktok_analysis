package com.ss.android.ugc.aweme.story.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class StoryInteractionListInfo {

    @C09CT("expiry_period")
    public final int expiryPeriod;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("interaction_list")
    public List<StoryInteractionUser> interactionList;

    @C09CT("interaction_list_type")
    public final Integer interactionType;

    @C09CT("next_cursor")
    public final long nextCursor;

    public StoryInteractionListInfo() {
        this(false, 0L, null, null, 0);
    }

    public StoryInteractionListInfo(boolean z, long j, List<StoryInteractionUser> list, Integer num, int i) {
        this.hasMore = z;
        this.nextCursor = j;
        this.interactionList = list;
        this.interactionType = num;
        this.expiryPeriod = i;
    }
}
