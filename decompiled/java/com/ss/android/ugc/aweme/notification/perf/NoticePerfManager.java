package com.ss.android.ugc.aweme.notification.perf;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class NoticePerfManager {
    public static final /* synthetic */ int LIZ = 0;

    public static final class OptimizationStrategy {
        public static final MetaData LIZ = new MetaData(true, false, false, false, false, false, false, 0, 120000, 15000, 120000, 43200000);
        public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(281));

        public static final class MetaData {

            @C09CT("boot_lazy_preload_delay")
            public final long bootLazyPreloadDelayMs;

            @C09CT("activity_entrance_preload")
            public final boolean enableActivityEntranceUpdatePreload;

            @C09CT("boot_lazy_preload")
            public final boolean enableBootLazyPreload;

            @C09CT("boot_cache_preload")
            public final boolean enableBootPreload;

            @C09CT("click_preload")
            public final boolean enableClickPreload;

            @C09CT("load_more_preload")
            public final boolean enableLoadMorePreload;

            @C09CT("stable_id")
            public final boolean enableStableId;

            @C09CT("unread_post_preload")
            public final boolean enableUnreadPostPreload;

            @C09CT("live_abandon_duration")
            public final long liveAbandonDurationMs;

            @C09CT("notice_abandon_duration")
            public final long noticeAbandonDurationMs;

            @C09CT("preload_req_duration")
            public final long preloadReqDurationMs;

            @C09CT("refresh_again_duration")
            public final long refreshAgainDurationMs;

            public MetaData() {
                this(true, false, false, false, false, false, false, 0L, 120000L, 15000L, 120000L, 43200000L);
            }

            public MetaData(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, long j, long j2, long j3, long j4, long j5) {
                this.enableStableId = z;
                this.enableLoadMorePreload = z2;
                this.enableClickPreload = z3;
                this.enableBootPreload = z4;
                this.enableBootLazyPreload = z5;
                this.enableUnreadPostPreload = z6;
                this.enableActivityEntranceUpdatePreload = z7;
                this.bootLazyPreloadDelayMs = j;
                this.preloadReqDurationMs = j2;
                this.refreshAgainDurationMs = j3;
                this.liveAbandonDurationMs = j4;
                this.noticeAbandonDurationMs = j5;
            }
        }
    }
}
