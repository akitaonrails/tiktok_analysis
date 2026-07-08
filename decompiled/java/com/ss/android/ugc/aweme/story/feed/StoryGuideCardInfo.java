package com.ss.android.ugc.aweme.story.feed;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryGuideCardInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("insert_cards")
    public final List<InsertStruct> insertCards;

    public StoryGuideCardInfo() {
        this(null, 1, null);
    }

    public StoryGuideCardInfo(List<InsertStruct> list) {
        this.insertCards = list;
    }

    public StoryGuideCardInfo(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
