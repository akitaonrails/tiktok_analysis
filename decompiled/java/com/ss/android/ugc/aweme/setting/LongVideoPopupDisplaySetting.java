package com.ss.android.ugc.aweme.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes9.dex */
public final class LongVideoPopupDisplaySetting {
    public static final /* synthetic */ int LIZ = 0;

    public static final class LongVideoStructJsonModel {

        @C09CT("cache_ttl")
        public final long cacheTTL;

        @C09CT("display_history")
        public final long displayedHistory;

        public LongVideoStructJsonModel(long j, long j2) {
            this.displayedHistory = j;
            this.cacheTTL = j2;
        }
    }
}
