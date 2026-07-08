package com.ss.android.ugc.aweme.coldcache.database;

import X.AbstractC796510VMj;
import X.C0NDX;
import X.C0VKN;
import X.C0VLF;
import X.C0VN2;
import X.C0VN3;
import X.C796070VKr;
import X.C796520VMk;
import X.C796620VMu;
import X.InterfaceC2275591E5d;
import X.InterfaceC796190VLd;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public final class ColdCacheDataBase_Impl extends ColdCacheDataBase {
    public volatile C796070VKr LLILZLL;

    @Override // com.ss.android.ugc.aweme.coldcache.database.ColdCacheDataBase
    public final C0NDX LIZ() {
        C796070VKr c796070VKr;
        if (this.LLILZLL != null) {
            return this.LLILZLL;
        }
        synchronized (this) {
            try {
                if (this.LLILZLL == null) {
                    this.LLILZLL = new C796070VKr(this);
                }
                c796070VKr = this.LLILZLL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c796070VKr;
    }

    @Override // X.AbstractC796540VMm
    public final void clearAllTables() {
        super.assertNotMainThread();
        C0VLF c0vlfLJLJJI = this.mOpenHelper.LJLJJI();
        try {
            super.beginTransaction();
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `cold_cache_mode_feed_pb`");
            super.setTransactionSuccessful();
            super.endTransaction();
            c0vlfLJLJJI.query("PRAGMA wal_checkpoint(FULL)").close();
            if (c0vlfLJLJJI.LJJIJIIJI()) {
                return;
            }
            c0vlfLJLJJI.LJIILJJIL("VACUUM");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            super.endTransaction();
            c0vlfLJLJJI.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!c0vlfLJLJJI.LJJIJIIJI()) {
                c0vlfLJLJJI.LJIILJJIL("VACUUM");
            }
            throw th;
        }
    }

    @Override // X.AbstractC796540VMm
    public final C796620VMu createInvalidationTracker() {
        return new C796620VMu(this, new HashMap(0), new HashMap(0), "cold_cache_mode_feed_pb");
    }

    @Override // X.AbstractC796540VMm
    public final Set<Class<? extends InterfaceC2275591E5d>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // X.AbstractC796540VMm
    public final Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(C0NDX.class, Collections.emptyList());
        return map;
    }

    @Override // X.AbstractC796540VMm
    public final InterfaceC796190VLd createOpenHelper(C796520VMk c796520VMk) {
        C0VN2 c0vn2 = new C0VN2(c796520VMk, new C0VN3() { // from class: X.0VKq
            @Override // X.C0VN3
            public final void onPostMigrate(C0VLF c0vlf) {
            }

            {
                super(5);
            }

            @Override // X.C0VN3
            public final void createAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `cold_cache_mode_feed_pb` (`aid` TEXT NOT NULL, `uid` TEXT NOT NULL, `source_type` INTEGER NOT NULL, `aweme_struct` BLOB, `aweme_data` TEXT, `fcp_protocol` TEXT, `had_cached_video` INTEGER NOT NULL, `had_loaded_count` INTEGER NOT NULL, `had_watched_count` INTEGER NOT NULL, `cache_time` INTEGER NOT NULL, `expire_time` INTEGER NOT NULL, `request_id` TEXT NOT NULL, `priority` INTEGER NOT NULL, `incomplete_path` TEXT NOT NULL, `rec_finish` REAL NOT NULL, `file_key` TEXT NOT NULL, `score` REAL NOT NULL, `extra_info` TEXT NOT NULL, PRIMARY KEY(`aid`))");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                c0vlf.LJIILJJIL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'a807f07599d61725d471b8b4581cd552')");
            }

            @Override // X.C0VN3
            public final void dropAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `cold_cache_mode_feed_pb`");
                List<C0VK6> list = this.LIZ.mCallbacks;
                if (list != null) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ListProtector.get(this.LIZ.mCallbacks, i).getClass();
                    }
                }
            }

            @Override // X.C0VN3
            public final void onCreate(C0VLF c0vlf) {
                List<C0VK6> list = this.LIZ.mCallbacks;
                if (list != null) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ListProtector.get(this.LIZ.mCallbacks, i).getClass();
                    }
                }
            }

            @Override // X.C0VN3
            public final void onOpen(C0VLF c0vlf) {
                this.LIZ.mDatabase = c0vlf;
                this.LIZ.internalInitInvalidationTracker(c0vlf);
                List<C0VK6> list = this.LIZ.mCallbacks;
                if (list != null) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((C0VK6) ListProtector.get(this.LIZ.mCallbacks, i)).LIZ(c0vlf);
                    }
                }
            }

            @Override // X.C0VN3
            public final void onPreMigrate(C0VLF c0vlf) {
                C0VN0.LIZ(c0vlf);
            }

            @Override // X.C0VN3
            public final C0VN4 onValidateSchema(C0VLF c0vlf) {
                HashMap map = new HashMap(18);
                map.put("aid", new C795990VKj(1, 1, "aid", "TEXT", null, true));
                map.put("uid", new C795990VKj(0, 1, "uid", "TEXT", null, true));
                map.put("source_type", new C795990VKj(0, 1, "source_type", "INTEGER", null, true));
                map.put("aweme_struct", new C795990VKj(0, 1, "aweme_struct", "BLOB", null, false));
                map.put("aweme_data", new C795990VKj(0, 1, "aweme_data", "TEXT", null, false));
                map.put("fcp_protocol", new C795990VKj(0, 1, "fcp_protocol", "TEXT", null, false));
                map.put("had_cached_video", new C795990VKj(0, 1, "had_cached_video", "INTEGER", null, true));
                map.put("had_loaded_count", new C795990VKj(0, 1, "had_loaded_count", "INTEGER", null, true));
                map.put("had_watched_count", new C795990VKj(0, 1, "had_watched_count", "INTEGER", null, true));
                map.put("cache_time", new C795990VKj(0, 1, "cache_time", "INTEGER", null, true));
                map.put("expire_time", new C795990VKj(0, 1, "expire_time", "INTEGER", null, true));
                map.put("request_id", new C795990VKj(0, 1, "request_id", "TEXT", null, true));
                map.put("priority", new C795990VKj(0, 1, "priority", "INTEGER", null, true));
                map.put("incomplete_path", new C795990VKj(0, 1, "incomplete_path", "TEXT", null, true));
                map.put("rec_finish", new C795990VKj(0, 1, "rec_finish", "REAL", null, true));
                map.put("file_key", new C795990VKj(0, 1, "file_key", "TEXT", null, true));
                map.put("score", new C795990VKj(0, 1, "score", "REAL", null, true));
                map.put("extra_info", new C795990VKj(0, 1, "extra_info", "TEXT", null, true));
                C0VN6 c0vn6 = new C0VN6("cold_cache_mode_feed_pb", map, new HashSet(0), new HashSet(0));
                C0VN6 c0vn6LIZ = C0VN6.LIZ(c0vlf, "cold_cache_mode_feed_pb");
                if (!c0vn6.equals(c0vn6LIZ)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("cold_cache_mode_feed_pb(com.ss.android.ugc.aweme.localcache.database.ColdCacheEntity).\n Expected:\n");
                    sbLIZ.append(c0vn6);
                    sbLIZ.append("\n Found:\n");
                    sbLIZ.append(c0vn6LIZ);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ));
                }
                return new C0VN4(true, null);
            }
        }, "a807f07599d61725d471b8b4581cd552", "76f5203e689bf7b1c64c9fbb32b01653");
        C0VKN c0vkn = new C0VKN(c796520VMk.LIZIZ);
        c0vkn.LIZIZ = c796520VMk.LIZJ;
        c0vkn.LIZJ = c0vn2;
        return c796520VMk.LIZ.LIZ(c0vkn.LIZ());
    }

    @Override // X.AbstractC796540VMm
    public final List<AbstractC796510VMj> getAutoMigrations(Map<Class<? extends InterfaceC2275591E5d>, InterfaceC2275591E5d> map) {
        return Arrays.asList(new AbstractC796510VMj[0]);
    }
}
