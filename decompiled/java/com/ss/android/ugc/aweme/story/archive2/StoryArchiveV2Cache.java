package com.ss.android.ugc.aweme.story.archive2;

import X.C09CT;
import X.C09DE;
import X.C1173800geQ;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class StoryArchiveV2Cache implements Serializable {
    public static final int $stable = 0;
    public static final C1173800geQ Companion = new Object() { // from class: X.0geQ
    };

    @C09CT("aweme_count")
    @C09DE
    public final int awemeCount;

    @C09CT("cache_date")
    @C09DE
    public final String cacheDate;

    @C09CT("has_on_this_day")
    @C09DE
    public final boolean hasOnThisDay;

    @C09CT("thought_aweme_count")
    @C09DE
    public final int thoughtAwemeCount;

    public StoryArchiveV2Cache() {
        this("", false, 0, 0);
    }

    public final boolean isValid() {
        String str = this.cacheDate;
        Companion.getClass();
        return Intrinsics.LJFF(str, new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(Long.valueOf(System.currentTimeMillis())));
    }

    public StoryArchiveV2Cache(String str, boolean z, int i, int i2) {
        this.cacheDate = str;
        this.hasOnThisDay = z;
        this.awemeCount = i;
        this.thoughtAwemeCount = i2;
    }
}
