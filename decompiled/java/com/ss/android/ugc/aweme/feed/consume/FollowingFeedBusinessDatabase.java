package com.ss.android.ugc.aweme.feed.consume;

import X.AbstractC796510VMj;
import X.AbstractC796540VMm;
import X.C01GW;
import X.C0VLI;
import X.C0VLJ;
import X.C0VLQ;
import X.C0VLR;
import X.C0VLY;
import X.C452501pT;
import X.InterfaceC804960Vhu;
import X.InterfaceC805040Vi2;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: loaded from: classes14.dex */
public abstract class FollowingFeedBusinessDatabase extends AbstractC796540VMm {
    public static final C0VLQ LL = new AbstractC796510VMj() { // from class: X.0VLQ
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            Object c098200Yq;
            try {
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `following_frequent_user` (`uid` TEXT NOT NULL, `author_id` TEXT NOT NULL, `status` INTEGER NOT NULL, `update_time` INTEGER NOT NULL,  PRIMARY KEY(`uid`,`author_id`))");
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
        }
    };
    public static final C0VLI LLILLJJLI = new AbstractC796510VMj() { // from class: X.0VLI
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            Object c098200Yq;
            try {
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `following_hvr_user` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `uid` TEXT NOT NULL, `author_id` TEXT NOT NULL, `frequently_watch` INTEGER NOT NULL, `frequently_interact` INTEGER NOT NULL)");
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
        }
    };
    public static final C0VLJ LLILLL = new AbstractC796510VMj() { // from class: X.0VLJ
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            Object c098200Yq;
            try {
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `following_frequent_user`");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `following_frequent_user_new` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `uid` TEXT NOT NULL, `author_id` TEXT NOT NULL, `status` INTEGER NOT NULL, `update_time` INTEGER NOT NULL)");
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
        }
    };
    public static final C01GW<FollowingFeedBusinessDatabase> LLILZ = C452501pT.LIZIZ(new C0VLR());

    public abstract InterfaceC805040Vi2 LIZ();

    public abstract C0VLY LIZIZ();

    public abstract InterfaceC804960Vhu LIZJ();
}
