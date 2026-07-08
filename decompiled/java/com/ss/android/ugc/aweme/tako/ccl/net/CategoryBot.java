package com.ss.android.ugc.aweme.tako.ccl.net;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes29.dex */
public final class CategoryBot {

    @C09CT("bots")
    public final List<BriefBot> bots;

    @C09CT("category")
    public final BotCategoryInfo category;

    public CategoryBot() {
        this(null, null, 3, null);
    }

    public CategoryBot(BotCategoryInfo botCategoryInfo, List<BriefBot> list) {
        this.category = botCategoryInfo;
        this.bots = list;
    }

    public CategoryBot(BotCategoryInfo botCategoryInfo, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : botCategoryInfo, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
