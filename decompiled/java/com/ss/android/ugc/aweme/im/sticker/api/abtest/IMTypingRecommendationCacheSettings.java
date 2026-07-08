package com.ss.android.ugc.aweme.im.sticker.api.abtest;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class IMTypingRecommendationCacheSettings {
    public static final IMTypingRecommendationCacheConfig LIZ = new IMTypingRecommendationCacheConfig(86400000, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(209));

    public static final class IMTypingRecommendationCacheConfig {

        @C09CT("cache_ttl_ms")
        public final long cacheTtlMs;

        @C09CT("use_conversation_level_cache")
        public final boolean useConversationLevelCache;

        public IMTypingRecommendationCacheConfig() {
            this(86400000L, false);
        }

        public IMTypingRecommendationCacheConfig(long j, boolean z) {
            this.cacheTtlMs = j;
            this.useConversationLevelCache = z;
        }
    }
}
