package com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol;

import X.AbstractC796510VMj;
import X.C0VKN;
import X.C0VKT;
import X.C0VLF;
import X.C0VN2;
import X.C0VN3;
import X.C796520VMk;
import X.C796620VMu;
import X.InterfaceC2275591E5d;
import X.InterfaceC533660KwO;
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
public final class LiveRecordingsRoomDatabaseAdapter_Impl extends LiveRecordingsRoomDatabaseAdapter {
    public volatile C0VKT LLILZ;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0VKT] */
    @Override // com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.LiveRecordingsRoomDatabaseAdapter
    public final InterfaceC533660KwO LIZIZ() {
        C0VKT c0vkt;
        if (this.LLILZ != null) {
            return this.LLILZ;
        }
        synchronized (this) {
            try {
                if (this.LLILZ == null) {
                    this.LLILZ = new InterfaceC533660KwO(this) { // from class: X.0VKT
                        public final AbstractC796540VMm LIZ;
                        public final C580780MqC LIZIZ;
                        public final C854550Xfh LIZJ;
                        public final C854550Xfh LIZLLL;
                        public final C854550Xfh LJ;

                        @Override // X.InterfaceC533660KwO
                        public final List<C533710KwT> LIZ() {
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(0, "SELECT * FROM live_recordings_content_mapping");
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "fragment_id");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "create_time");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "local_file_path");
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    arrayList.add(new C533710KwT(cursorLIZIZ.getLong(iLIZIZ), cursorLIZIZ.getLong(iLIZIZ2), cursorLIZIZ.isNull(iLIZIZ3) ? null : cursorLIZIZ.getString(iLIZIZ3)));
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

                        @Override // X.InterfaceC533660KwO
                        public final int clearAll() {
                            this.LIZ.assertNotSuspendingTransaction();
                            InterfaceC796340VLs interfaceC796340VLsAcquire = this.LJ.acquire();
                            this.LIZ.beginTransaction();
                            try {
                                int iLJIIL = interfaceC796340VLsAcquire.LJIIL();
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                                this.LJ.release(interfaceC796340VLsAcquire);
                                return iLJIIL;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                this.LJ.release(interfaceC796340VLsAcquire);
                                throw th;
                            }
                        }

                        {
                            this.LIZ = this;
                            this.LIZIZ = new C580780MqC(this, 2);
                            this.LIZJ = new C854550Xfh(this, 34);
                            this.LIZLLL = new C854550Xfh(this, 35);
                            this.LJ = new C854550Xfh(this, 36);
                        }

                        @Override // X.InterfaceC533660KwO
                        public final List<C533710KwT> LIZIZ(long j) {
                            String string;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT * FROM live_recordings_content_mapping WHERE create_time < ?");
                            c0vn5LIZLLL.LJIJ(1, j);
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "fragment_id");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "create_time");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "local_file_path");
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    long j2 = cursorLIZIZ.getLong(iLIZIZ);
                                    long j3 = cursorLIZIZ.getLong(iLIZIZ2);
                                    if (cursorLIZIZ.isNull(iLIZIZ3)) {
                                        string = null;
                                    } else {
                                        string = cursorLIZIZ.getString(iLIZIZ3);
                                    }
                                    arrayList.add(new C533710KwT(j2, j3, string));
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

                        @Override // X.InterfaceC533660KwO
                        public final long LIZJ(C533710KwT c533710KwT) {
                            this.LIZ.assertNotSuspendingTransaction();
                            this.LIZ.beginTransaction();
                            try {
                                long jInsertAndReturnId = this.LIZIZ.insertAndReturnId(c533710KwT);
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                                return jInsertAndReturnId;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC533660KwO
                        public final void LIZLLL(long j) {
                            this.LIZ.assertNotSuspendingTransaction();
                            InterfaceC796340VLs interfaceC796340VLsAcquire = this.LIZLLL.acquire();
                            interfaceC796340VLsAcquire.LJIJ(1, j);
                            this.LIZ.beginTransaction();
                            try {
                                interfaceC796340VLsAcquire.LJIIL();
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                                this.LIZLLL.release(interfaceC796340VLsAcquire);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                this.LIZLLL.release(interfaceC796340VLsAcquire);
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC533660KwO
                        public final int LJ(long j) {
                            this.LIZ.assertNotSuspendingTransaction();
                            InterfaceC796340VLs interfaceC796340VLsAcquire = this.LIZJ.acquire();
                            interfaceC796340VLsAcquire.LJIJ(1, j);
                            this.LIZ.beginTransaction();
                            try {
                                int iLJIIL = interfaceC796340VLsAcquire.LJIIL();
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                                this.LIZJ.release(interfaceC796340VLsAcquire);
                                return iLJIIL;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                this.LIZJ.release(interfaceC796340VLsAcquire);
                                throw th;
                            }
                        }
                    };
                }
                c0vkt = this.LLILZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c0vkt;
    }

    @Override // X.AbstractC796540VMm
    public final void clearAllTables() {
        super.assertNotMainThread();
        C0VLF c0vlfLJLJJI = this.mOpenHelper.LJLJJI();
        try {
            super.beginTransaction();
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `live_recordings_content_mapping`");
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
        return new C796620VMu(this, new HashMap(0), new HashMap(0), "live_recordings_content_mapping");
    }

    @Override // X.AbstractC796540VMm
    public final Set<Class<? extends InterfaceC2275591E5d>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // X.AbstractC796540VMm
    public final Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(InterfaceC533660KwO.class, Collections.emptyList());
        return map;
    }

    @Override // X.AbstractC796540VMm
    public final InterfaceC796190VLd createOpenHelper(C796520VMk c796520VMk) {
        C0VN2 c0vn2 = new C0VN2(c796520VMk, new C0VN3() { // from class: X.0VKS
            @Override // X.C0VN3
            public final void onPostMigrate(C0VLF c0vlf) {
            }

            {
                super(1);
            }

            @Override // X.C0VN3
            public final void createAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `live_recordings_content_mapping` (`fragment_id` INTEGER NOT NULL, `create_time` INTEGER NOT NULL, `local_file_path` TEXT NOT NULL, PRIMARY KEY(`fragment_id`))");
                c0vlf.LJIILJJIL("CREATE INDEX IF NOT EXISTS `index_live_recordings_content_mapping_create_time` ON `live_recordings_content_mapping` (`create_time`)");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                c0vlf.LJIILJJIL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '9e3886dd7b237c64e37c2bb509ff9327')");
            }

            @Override // X.C0VN3
            public final void dropAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `live_recordings_content_mapping`");
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
                HashMap map = new HashMap(3);
                map.put("fragment_id", new C795990VKj(1, 1, "fragment_id", "INTEGER", null, true));
                map.put("create_time", new C795990VKj(0, 1, "create_time", "INTEGER", null, true));
                map.put("local_file_path", new C795990VKj(0, 1, "local_file_path", "TEXT", null, true));
                HashSet hashSet = new HashSet(0);
                HashSet hashSet2 = new HashSet(1);
                hashSet2.add(new C796450VMd(Arrays.asList("create_time"), "index_live_recordings_content_mapping_create_time", Arrays.asList("ASC"), false));
                C0VN6 c0vn6 = new C0VN6("live_recordings_content_mapping", map, hashSet, hashSet2);
                C0VN6 c0vn6LIZ = C0VN6.LIZ(c0vlf, "live_recordings_content_mapping");
                if (!c0vn6.equals(c0vn6LIZ)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("live_recordings_content_mapping(com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.LiveRecordingsContent).\n Expected:\n");
                    sbLIZ.append(c0vn6);
                    sbLIZ.append("\n Found:\n");
                    sbLIZ.append(c0vn6LIZ);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ));
                }
                return new C0VN4(true, null);
            }
        }, "9e3886dd7b237c64e37c2bb509ff9327", "8321082555de888a05f0e25b586f8e83");
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
