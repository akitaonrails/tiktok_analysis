package com.ss.android.ugc.aweme.cache;

import X.C098200Yq;
import X.C14EU;
import X.C1720106oR;
import X.C189200o6;
import X.C2187451AjH;
import X.C2349909Ir;
import X.C486550J6f;
import X.C804950Vht;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeedList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes14.dex */
public final class FollowingFeedCacheService {
    public static final AtomicBoolean LIZ;
    public static FollowingCache LIZIZ;

    static {
        FollowingFeedCacheService followingFeedCacheService = new FollowingFeedCacheService();
        LIZ = new AtomicBoolean(false);
        EventBus.LIZLLL().LJIJJ(followingFeedCacheService);
    }

    public static FollowingCache LIZ() {
        long j;
        FollowFeedList followFeedListLIZIZ;
        if (LIZ.get()) {
            return LIZIZ;
        }
        C804950Vht.LIZ.getClass();
        try {
            j = C804950Vht.LIZ().getLong("key_following_feed_cache_time", 0L);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                int i = C2187451AjH.LIZ;
                C1720106oR.LIZIZ("FollowingKevaStorage", "getFeedCacheTime error", thM5exceptionOrNullimpl);
            }
            j = -1;
        }
        synchronized (C2349909Ir.LIZ) {
            followFeedListLIZIZ = C2349909Ir.LIZIZ();
        }
        LIZ.set(true);
        if (followFeedListLIZIZ == null) {
            return null;
        }
        FollowingCache followingCache = new FollowingCache(followFeedListLIZIZ, j);
        LIZIZ = followingCache;
        return followingCache;
    }

    public static final class FollowingCache {
        public final FollowFeedList data;
        public boolean hasCacheCheckedByServer;
        public final long updateTime;

        public final void setHasCacheCheckedByServer(boolean z) {
            this.hasCacheCheckedByServer = z;
        }

        public FollowingCache(FollowFeedList followFeedList, long j) {
            this.data = followFeedList;
            this.updateTime = j;
        }
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onLoginStateChangeEvent(C486550J6f c486550J6f) {
        LIZIZ = null;
        LIZ.set(false);
    }
}
