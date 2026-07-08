package com.ss.android.ugc.aweme.story.archive2.model;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class ArchivedStoryIdList implements Serializable {
    public static final int $stable = 8;

    @C09CT("story_ids")
    public final List<String> storyIds;

    public ArchivedStoryIdList() {
        this(null, 1, null);
    }

    public ArchivedStoryIdList(List<String> list) {
        this.storyIds = list;
    }

    public ArchivedStoryIdList(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
