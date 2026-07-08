package com.ss.android.ugc.aweme.vibefeed.database;

import X.AbstractC796510VMj;
import X.C0VKN;
import X.C0VKY;
import X.C0VLF;
import X.C0VN2;
import X.C0VN3;
import X.C0Z7U;
import X.C796520VMk;
import X.C796620VMu;
import X.InterfaceC2275591E5d;
import X.InterfaceC796190VLd;
import android.database.Cursor;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public final class SharedFeedDatabase_Impl extends SharedFeedDatabase {
    public volatile C0VKY LLILLL;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0VKY] */
    @Override // com.ss.android.ugc.aweme.vibefeed.database.SharedFeedDatabase
    public final C0Z7U LIZ() {
        C0VKY c0vky;
        if (this.LLILLL != null) {
            return this.LLILLL;
        }
        synchronized (this) {
            try {
                if (this.LLILLL == null) {
                    this.LLILLL = new C0Z7U(this) { // from class: X.0VKY
                        public final AbstractC796540VMm LIZIZ;
                        public final C854570Xfj LIZJ;

                        {
                            this.LIZIZ = this;
                            this.LIZJ = new C854570Xfj(this, 22);
                        }

                        @Override // X.C0Z7U
                        public final void LIZIZ(C0VKZ c0vkz) {
                            this.LIZIZ.assertNotSuspendingTransaction();
                            this.LIZIZ.beginTransaction();
                            try {
                                this.LIZJ.insert(c0vkz);
                                this.LIZIZ.setTransactionSuccessful();
                                this.LIZIZ.endTransaction();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZIZ.endTransaction();
                                throw th;
                            }
                        }

                        @Override // X.C0Z7U
                        public final List<C0VKZ> LIZ(String str, String str2) {
                            String string;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(2, "SELECT * FROM MESSAGE_KV WHERE CONVERSATION_ID = ? AND AWEME_ID = ? ORDER BY CREATE_TIME DESC");
                            if (str == null) {
                                c0vn5LIZLLL.LLD(1);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(1, str);
                            }
                            if (str2 == null) {
                                c0vn5LIZLLL.LLD(2);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(2, str2);
                            }
                            this.LIZIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "MSG_ID");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "CONVERSATION_ID");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "AWEME_ID");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "CREATE_TIME");
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    long j = cursorLIZIZ.getLong(iLIZIZ);
                                    String string2 = null;
                                    if (cursorLIZIZ.isNull(iLIZIZ2)) {
                                        string = null;
                                    } else {
                                        string = cursorLIZIZ.getString(iLIZIZ2);
                                    }
                                    if (!cursorLIZIZ.isNull(iLIZIZ3)) {
                                        string2 = cursorLIZIZ.getString(iLIZIZ3);
                                    }
                                    arrayList.add(new C0VKZ(j, string, string2, cursorLIZIZ.getLong(iLIZIZ4)));
                                }
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                return arrayList;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                throw th;
                            }
                        }
                    };
                }
                c0vky = this.LLILLL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c0vky;
    }

    @Override // X.AbstractC796540VMm
    public final void clearAllTables() {
        super.assertNotMainThread();
        C0VLF c0vlfLJLJJI = this.mOpenHelper.LJLJJI();
        try {
            super.beginTransaction();
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `MESSAGE_KV`");
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
        return new C796620VMu(this, new HashMap(0), new HashMap(0), "MESSAGE_KV");
    }

    @Override // X.AbstractC796540VMm
    public final Set<Class<? extends InterfaceC2275591E5d>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // X.AbstractC796540VMm
    public final Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(C0Z7U.class, Collections.emptyList());
        return map;
    }

    @Override // X.AbstractC796540VMm
    public final InterfaceC796190VLd createOpenHelper(C796520VMk c796520VMk) {
        C0VN2 c0vn2 = new C0VN2(c796520VMk, new C0VN3() { // from class: X.0VKX
            @Override // X.C0VN3
            public final void onPostMigrate(C0VLF c0vlf) {
            }

            {
                super(1);
            }

            @Override // X.C0VN3
            public final void createAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `MESSAGE_KV` (`MSG_ID` INTEGER NOT NULL, `CONVERSATION_ID` TEXT NOT NULL, `AWEME_ID` TEXT NOT NULL, `CREATE_TIME` INTEGER NOT NULL, PRIMARY KEY(`MSG_ID`))");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                c0vlf.LJIILJJIL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c80e663a5068a2161b0608b83fa42b06')");
            }

            @Override // X.C0VN3
            public final void dropAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `MESSAGE_KV`");
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
                HashMap map = new HashMap(4);
                map.put("MSG_ID", new C795990VKj(1, 1, "MSG_ID", "INTEGER", null, true));
                map.put("CONVERSATION_ID", new C795990VKj(0, 1, "CONVERSATION_ID", "TEXT", null, true));
                map.put("AWEME_ID", new C795990VKj(0, 1, "AWEME_ID", "TEXT", null, true));
                map.put("CREATE_TIME", new C795990VKj(0, 1, "CREATE_TIME", "INTEGER", null, true));
                C0VN6 c0vn6 = new C0VN6("MESSAGE_KV", map, new HashSet(0), new HashSet(0));
                C0VN6 c0vn6LIZ = C0VN6.LIZ(c0vlf, "MESSAGE_KV");
                if (!c0vn6.equals(c0vn6LIZ)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("MESSAGE_KV(com.ss.android.ugc.aweme.vibefeed.database.entity.MessageKvEntity).\n Expected:\n");
                    sbLIZ.append(c0vn6);
                    sbLIZ.append("\n Found:\n");
                    sbLIZ.append(c0vn6LIZ);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ));
                }
                return new C0VN4(true, null);
            }
        }, "c80e663a5068a2161b0608b83fa42b06", "e404f46bcd3683731199154e80f95093");
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
