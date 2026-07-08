package com.ss.android.ugc.aweme.notification.utils;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C098200Yq;
import X.C0XQ7;
import X.C1720106oR;
import X.C189200o6;
import X.C1901310zZp;
import X.C2187451AjH;
import X.C786410Ut5;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.inbox.experiment.Configuration;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes29.dex */
public final class FollowSortDataCache {
    public static final FollowSortDataCache LIZ = new FollowSortDataCache();
    public static final LinkedHashMap<String, Integer> LIZIZ = new LinkedHashMap<>();
    public static final int LIZJ;
    public static final int LIZLLL;

    static {
        C01GW c01gw = C1901310zZp.LIZIZ;
        LIZJ = ((Configuration) c01gw.getValue()).exposedCount;
        LIZLLL = ((Configuration) c01gw.getValue()).saveMaxCount;
    }

    public static void LIZ() {
        try {
            if (LIZIZ.isEmpty()) {
                LIZ.getClass();
                String string = LIZIZ().getString("inbox_new_follower_expose", "");
                if (string == null || string.length() == 0) {
                    return;
                }
                for (NidCountEntry nidCountEntry : JsonParseUtils.LIZJ(NidCountEntry.class, string)) {
                    LIZIZ.put(nidCountEntry.nid, Integer.valueOf(nidCountEntry.count));
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                int i = C2187451AjH.LIZ;
                C1720106oR.LIZIZ("InboxDataCache", "fillNidCountMap error", thM5exceptionOrNullimpl);
            }
        }
    }

    public static Keva LIZIZ() {
        String uid;
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        if (curUser == null || (uid = curUser.getUid()) == null) {
            uid = "";
        }
        return Keva.getRepo(C786410Ut5.j4("inbox_new_follower_sort_%s", Arrays.copyOf(new Object[]{uid}, 1)));
    }

    public static final class NidCountEntry {
        public static final int $stable = 0;
        public final int count;
        public final String nid;

        public NidCountEntry(String str, int i) {
            this.nid = str;
            this.count = i;
        }
    }
}
