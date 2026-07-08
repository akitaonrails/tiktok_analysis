package com.ss.android.ugc.aweme.im.messagelist.database;

import X.AbstractC796510VMj;
import X.C0VKN;
import X.C0VLF;
import X.C0VN2;
import X.C0VN3;
import X.C795550VIr;
import X.C796520VMk;
import X.C796620VMu;
import X.InterfaceC2275591E5d;
import X.InterfaceC593180NOi;
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
public final class AwemeMessageDatabase_Impl extends AwemeMessageDatabase {
    public volatile C795550VIr LLILLL;

    @Override // com.ss.android.ugc.aweme.im.messagelist.database.AwemeMessageDatabase
    public final InterfaceC593180NOi LIZ() {
        C795550VIr c795550VIr;
        if (this.LLILLL != null) {
            return this.LLILLL;
        }
        synchronized (this) {
            try {
                if (this.LLILLL == null) {
                    this.LLILLL = new C795550VIr(this);
                }
                c795550VIr = this.LLILLL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c795550VIr;
    }

    @Override // X.AbstractC796540VMm
    public final void clearAllTables() {
        super.assertNotMainThread();
        C0VLF c0vlfLJLJJI = this.mOpenHelper.LJLJJI();
        try {
            super.beginTransaction();
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `AWEME_MESSAGE_KV`");
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
        return new C796620VMu(this, new HashMap(0), new HashMap(0), "AWEME_MESSAGE_KV");
    }

    @Override // X.AbstractC796540VMm
    public final Set<Class<? extends InterfaceC2275591E5d>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // X.AbstractC796540VMm
    public final Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(InterfaceC593180NOi.class, Collections.emptyList());
        return map;
    }

    @Override // X.AbstractC796540VMm
    public final InterfaceC796190VLd createOpenHelper(C796520VMk c796520VMk) {
        C0VN2 c0vn2 = new C0VN2(c796520VMk, new C0VN3() { // from class: X.0VKW
            @Override // X.C0VN3
            public final void onPostMigrate(C0VLF c0vlf) {
            }

            {
                super(3);
            }

            @Override // X.C0VN3
            public final void createAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `AWEME_MESSAGE_KV` (`MSG_ID` INTEGER NOT NULL, `MSG_UUID` TEXT NOT NULL, `CONVERSATION_ID` TEXT NOT NULL, `AWEME_ID` TEXT NOT NULL, `CREATE_TIME` INTEGER NOT NULL, `SENDER_IS_MYSELF` INTEGER NOT NULL, `VIDEO_COVER_COMPONENT` TEXT, `COVER_URL` TEXT NOT NULL, `HAS_CONSUMED_FOR_EXPLOSION_EFFECT` INTEGER NOT NULL, `HAS_CONSUMED_FOR_VIDEO_RAIN_EFFECT` INTEGER NOT NULL, `INDEX` INTEGER NOT NULL, PRIMARY KEY(`MSG_ID`))");
                c0vlf.LJIILJJIL("CREATE INDEX IF NOT EXISTS `idx_create_time` ON `AWEME_MESSAGE_KV` (`CREATE_TIME`)");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                c0vlf.LJIILJJIL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '6bdf1d457c6ee7406f2f6312e3cff026')");
            }

            @Override // X.C0VN3
            public final void dropAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `AWEME_MESSAGE_KV`");
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
                HashMap map = new HashMap(11);
                map.put("MSG_ID", new C795990VKj(1, 1, "MSG_ID", "INTEGER", null, true));
                map.put("MSG_UUID", new C795990VKj(0, 1, "MSG_UUID", "TEXT", null, true));
                map.put("CONVERSATION_ID", new C795990VKj(0, 1, "CONVERSATION_ID", "TEXT", null, true));
                map.put("AWEME_ID", new C795990VKj(0, 1, "AWEME_ID", "TEXT", null, true));
                map.put("CREATE_TIME", new C795990VKj(0, 1, "CREATE_TIME", "INTEGER", null, true));
                map.put("SENDER_IS_MYSELF", new C795990VKj(0, 1, "SENDER_IS_MYSELF", "INTEGER", null, true));
                map.put("VIDEO_COVER_COMPONENT", new C795990VKj(0, 1, "VIDEO_COVER_COMPONENT", "TEXT", null, false));
                map.put("COVER_URL", new C795990VKj(0, 1, "COVER_URL", "TEXT", null, true));
                map.put("HAS_CONSUMED_FOR_EXPLOSION_EFFECT", new C795990VKj(0, 1, "HAS_CONSUMED_FOR_EXPLOSION_EFFECT", "INTEGER", null, true));
                map.put("HAS_CONSUMED_FOR_VIDEO_RAIN_EFFECT", new C795990VKj(0, 1, "HAS_CONSUMED_FOR_VIDEO_RAIN_EFFECT", "INTEGER", null, true));
                map.put("INDEX", new C795990VKj(0, 1, "INDEX", "INTEGER", null, true));
                HashSet hashSet = new HashSet(0);
                HashSet hashSet2 = new HashSet(1);
                hashSet2.add(new C796450VMd(Arrays.asList("CREATE_TIME"), "idx_create_time", Arrays.asList("ASC"), false));
                C0VN6 c0vn6 = new C0VN6("AWEME_MESSAGE_KV", map, hashSet, hashSet2);
                C0VN6 c0vn6LIZ = C0VN6.LIZ(c0vlf, "AWEME_MESSAGE_KV");
                if (!c0vn6.equals(c0vn6LIZ)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("AWEME_MESSAGE_KV(com.ss.android.ugc.aweme.im.messagelist.database.AwemeMessageKvEntity).\n Expected:\n");
                    sbLIZ.append(c0vn6);
                    sbLIZ.append("\n Found:\n");
                    sbLIZ.append(c0vn6LIZ);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ));
                }
                return new C0VN4(true, null);
            }
        }, "6bdf1d457c6ee7406f2f6312e3cff026", "10f86dd5e07a3bb1a72096066b39e59b");
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
