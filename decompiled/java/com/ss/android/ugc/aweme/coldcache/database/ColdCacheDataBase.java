package com.ss.android.ugc.aweme.coldcache.database;

import X.AbstractC796510VMj;
import X.AbstractC796540VMm;
import X.C01GW;
import X.C0NDX;
import X.C1E5J;
import X.C1E5U;
import X.C1E5V;
import X.C1E5W;
import X.C1E5X;
import X.C452501pT;

/* JADX INFO: loaded from: classes36.dex */
public abstract class ColdCacheDataBase extends AbstractC796540VMm {
    public static final C1E5U LL = new AbstractC796510VMj() { // from class: X.1E5U
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            c0vlf.LJIILJJIL("ALTER TABLE cold_cache_mode_feed_pb ADD COLUMN uid TEXT NOT NULL DEFAULT ''");
            c0vlf.LJIILJJIL("ALTER TABLE cold_cache_mode_feed_pb ADD COLUMN incomplete_path TEXT NOT NULL DEFAULT ''");
            c0vlf.LJIILJJIL("ALTER TABLE cold_cache_mode_feed_pb ADD COLUMN rec_finish REAL NOT NULL DEFAULT 0.0");
        }
    };
    public static final C1E5V LLILLJJLI = new AbstractC796510VMj() { // from class: X.1E5V
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            c0vlf.LJIILJJIL("ALTER TABLE cold_cache_mode_feed_pb ADD COLUMN score REAL NOT NULL DEFAULT 0.0");
            c0vlf.LJIILJJIL("ALTER TABLE cold_cache_mode_feed_pb ADD COLUMN file_key TEXT NOT NULL DEFAULT ''");
        }
    };
    public static final C1E5W LLILLL = new AbstractC796510VMj() { // from class: X.1E5W
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            c0vlf.LJIILJJIL("ALTER TABLE cold_cache_mode_feed_pb ADD COLUMN fcp_protocol TEXT DEFAULT NULL");
        }
    };
    public static final C1E5X LLILZ = new AbstractC796510VMj() { // from class: X.1E5X
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            c0vlf.LJIILJJIL("ALTER TABLE cold_cache_mode_feed_pb ADD COLUMN source_type INTEGER NOT NULL DEFAULT 0");
        }
    };
    public static final C01GW<ColdCacheDataBase> LLILZIL = C452501pT.LIZIZ(new C1E5J());

    public abstract C0NDX LIZ();
}
