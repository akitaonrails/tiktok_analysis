package com.ss.android.ugc.aweme.story.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class StoryArchDetail implements Serializable {
    public static final int $stable = 8;

    @C09CT("extra")
    public final String extra;

    @C09CT("items")
    public final List<Aweme> items;

    @C09CT("statistic")
    public final StoryArchStatistic statistic;

    /* JADX WARN: Multi-variable type inference failed */
    public StoryArchDetail(StoryArchStatistic storyArchStatistic, List<? extends Aweme> list, String str) {
        this.statistic = storyArchStatistic;
        this.items = list;
        this.extra = str;
    }
}
