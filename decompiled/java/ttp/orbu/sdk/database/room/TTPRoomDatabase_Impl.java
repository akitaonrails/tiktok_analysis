package ttp.orbu.sdk.database.room;

import X.AbstractC796510VMj;
import X.C0VK6;
import X.C0VKN;
import X.C0VLF;
import X.C0VN0;
import X.C0VN2;
import X.C0VN3;
import X.C0VN4;
import X.C0VN6;
import X.C795990VKj;
import X.C796520VMk;
import X.C796620VMu;
import X.InterfaceC2275591E5d;
import X.InterfaceC796190VLd;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ttpobfuscated.c3;
import ttpobfuscated.d3;
import ttpobfuscated.sf;
import ttpobfuscated.tf;
import ttpobfuscated.u2;
import ttpobfuscated.v2;
import ttpobfuscated.x2;
import ttpobfuscated.y2;

/* JADX INFO: loaded from: classes14.dex */
public final class TTPRoomDatabase_Impl extends TTPRoomDatabase {
    public volatile x2 a;
    public volatile u2 b;
    public volatile c3 c;

    @Override // ttp.orbu.sdk.database.room.TTPRoomDatabase
    public u2 a() {
        u2 u2Var;
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            try {
                if (this.b == null) {
                    this.b = new v2(this);
                }
                u2Var = this.b;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return u2Var;
    }

    @Override // ttp.orbu.sdk.database.room.TTPRoomDatabase
    public x2 b() {
        x2 x2Var;
        if (this.a != null) {
            return this.a;
        }
        synchronized (this) {
            try {
                if (this.a == null) {
                    this.a = new y2(this);
                }
                x2Var = this.a;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return x2Var;
    }

    @Override // ttp.orbu.sdk.database.room.TTPRoomDatabase
    public c3 c() {
        c3 c3Var;
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            try {
                if (this.c == null) {
                    this.c = new d3(this);
                }
                c3Var = this.c;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c3Var;
    }

    @Override // X.AbstractC796540VMm
    public void clearAllTables() {
        assertNotMainThread();
        C0VLF c0vlfLJLJJI = this.mOpenHelper.LJLJJI();
        try {
            beginTransaction();
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `events`");
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `users`");
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `sent_event`");
            setTransactionSuccessful();
            endTransaction();
            c0vlfLJLJJI.query("PRAGMA wal_checkpoint(FULL)").close();
            if (c0vlfLJLJJI.LJJIJIIJI()) {
                return;
            }
            c0vlfLJLJJI.LJIILJJIL("VACUUM");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            endTransaction();
            c0vlfLJLJJI.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!c0vlfLJLJJI.LJJIJIIJI()) {
                c0vlfLJLJJI.LJIILJJIL("VACUUM");
            }
            throw th;
        }
    }

    @Override // X.AbstractC796540VMm
    public C796620VMu createInvalidationTracker() {
        return new C796620VMu(this, new HashMap(0), new HashMap(0), "events", "users", "sent_event");
    }

    @Override // X.AbstractC796540VMm
    public Set<Class<? extends InterfaceC2275591E5d>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // X.AbstractC796540VMm
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(x2.class, Collections.emptyList());
        map.put(u2.class, Collections.emptyList());
        map.put(c3.class, Collections.emptyList());
        return map;
    }

    public class a extends C0VN3 {
        @Override // X.C0VN3
        public void onPostMigrate(C0VLF c0vlf) {
        }

        @Override // X.C0VN3
        public void createAllTables(C0VLF c0vlf) {
            c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `events` (`id` BLOB NOT NULL, `timestamp` INTEGER NOT NULL, `kind` TEXT NOT NULL, `metadata` TEXT NOT NULL, PRIMARY KEY(`id`))");
            c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `users` (`userId` TEXT NOT NULL, `deviceId` TEXT NOT NULL, `region` TEXT NOT NULL, `lastUpdateTime` INTEGER NOT NULL, `clientIdentifier` TEXT NOT NULL DEFAULT '', `regionStatus` TEXT NOT NULL DEFAULT '', `exRegions` TEXT NOT NULL DEFAULT '', `activated` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`userId`))");
            c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `sent_event` (`id` TEXT NOT NULL, `last_sent_event` INTEGER NOT NULL, PRIMARY KEY(`id`))");
            c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            c0vlf.LJIILJJIL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '40bd5b2e51f0cdd888629a749892c69e')");
        }

        @Override // X.C0VN3
        public void dropAllTables(C0VLF c0vlf) {
            c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `events`");
            c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `users`");
            c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `sent_event`");
            if (TTPRoomDatabase_Impl.this.mCallbacks != null) {
                int size = TTPRoomDatabase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ListProtector.get(TTPRoomDatabase_Impl.this.mCallbacks, i).getClass();
                }
            }
        }

        @Override // X.C0VN3
        public void onCreate(C0VLF c0vlf) {
            if (TTPRoomDatabase_Impl.this.mCallbacks != null) {
                int size = TTPRoomDatabase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ListProtector.get(TTPRoomDatabase_Impl.this.mCallbacks, i).getClass();
                }
            }
        }

        @Override // X.C0VN3
        public void onOpen(C0VLF c0vlf) {
            TTPRoomDatabase_Impl.this.mDatabase = c0vlf;
            TTPRoomDatabase_Impl.this.internalInitInvalidationTracker(c0vlf);
            if (TTPRoomDatabase_Impl.this.mCallbacks != null) {
                int size = TTPRoomDatabase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((C0VK6) ListProtector.get(TTPRoomDatabase_Impl.this.mCallbacks, i)).LIZ(c0vlf);
                }
            }
        }

        @Override // X.C0VN3
        public void onPreMigrate(C0VLF c0vlf) {
            C0VN0.LIZ(c0vlf);
        }

        @Override // X.C0VN3
        public C0VN4 onValidateSchema(C0VLF c0vlf) {
            HashMap map = new HashMap(4);
            map.put(FollowStatusChangeMethod.PARAM_UID, new C795990VKj(1, 1, FollowStatusChangeMethod.PARAM_UID, "BLOB", null, true));
            map.put("timestamp", new C795990VKj(0, 1, "timestamp", "INTEGER", null, true));
            map.put("kind", new C795990VKj(0, 1, "kind", "TEXT", null, true));
            map.put("metadata", new C795990VKj(0, 1, "metadata", "TEXT", null, true));
            C0VN6 c0vn6 = new C0VN6("events", map, new HashSet(0), new HashSet(0));
            C0VN6 c0vn6LIZ = C0VN6.LIZ(c0vlf, "events");
            if (!c0vn6.equals(c0vn6LIZ)) {
                return new C0VN4(false, "events(ttp.orbu.sdk.repository.model.DBEvent).\n Expected:\n" + c0vn6 + "\n Found:\n" + c0vn6LIZ);
            }
            HashMap map2 = new HashMap(8);
            map2.put("userId", new C795990VKj(1, 1, "userId", "TEXT", null, true));
            map2.put("deviceId", new C795990VKj(0, 1, "deviceId", "TEXT", null, true));
            map2.put("region", new C795990VKj(0, 1, "region", "TEXT", null, true));
            map2.put("lastUpdateTime", new C795990VKj(0, 1, "lastUpdateTime", "INTEGER", null, true));
            map2.put("clientIdentifier", new C795990VKj(0, 1, "clientIdentifier", "TEXT", "''", true));
            map2.put("regionStatus", new C795990VKj(0, 1, "regionStatus", "TEXT", "''", true));
            map2.put("exRegions", new C795990VKj(0, 1, "exRegions", "TEXT", "''", true));
            map2.put("activated", new C795990VKj(0, 1, "activated", "INTEGER", CardStruct.IStatusCode.DEFAULT, true));
            C0VN6 c0vn62 = new C0VN6("users", map2, new HashSet(0), new HashSet(0));
            C0VN6 c0vn6LIZ2 = C0VN6.LIZ(c0vlf, "users");
            if (!c0vn62.equals(c0vn6LIZ2)) {
                return new C0VN4(false, "users(ttp.orbu.sdk.repository.model.DBUser).\n Expected:\n" + c0vn62 + "\n Found:\n" + c0vn6LIZ2);
            }
            HashMap map3 = new HashMap(2);
            map3.put(FollowStatusChangeMethod.PARAM_UID, new C795990VKj(1, 1, FollowStatusChangeMethod.PARAM_UID, "TEXT", null, true));
            map3.put("last_sent_event", new C795990VKj(0, 1, "last_sent_event", "INTEGER", null, true));
            C0VN6 c0vn63 = new C0VN6("sent_event", map3, new HashSet(0), new HashSet(0));
            C0VN6 c0vn6LIZ3 = C0VN6.LIZ(c0vlf, "sent_event");
            if (!c0vn63.equals(c0vn6LIZ3)) {
                return new C0VN4(false, "sent_event(ttp.orbu.sdk.repository.model.DBEventSent).\n Expected:\n" + c0vn63 + "\n Found:\n" + c0vn6LIZ3);
            }
            return new C0VN4(true, null);
        }

        public a(int i) {
            super(i);
        }
    }

    @Override // X.AbstractC796540VMm
    public InterfaceC796190VLd createOpenHelper(C796520VMk c796520VMk) {
        C0VN2 c0vn2 = new C0VN2(c796520VMk, new a(3), "40bd5b2e51f0cdd888629a749892c69e", "335f2ac1672955a8900b12c7a81f2982");
        C0VKN c0vkn = new C0VKN(c796520VMk.LIZIZ);
        c0vkn.LIZIZ = c796520VMk.LIZJ;
        c0vkn.LIZJ = c0vn2;
        return c796520VMk.LIZ.LIZ(c0vkn.LIZ());
    }

    @Override // X.AbstractC796540VMm
    public List<AbstractC796510VMj> getAutoMigrations(Map<Class<? extends InterfaceC2275591E5d>, InterfaceC2275591E5d> map) {
        return Arrays.asList(new sf(), new tf());
    }
}
