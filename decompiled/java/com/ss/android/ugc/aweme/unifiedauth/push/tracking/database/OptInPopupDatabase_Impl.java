package com.ss.android.ugc.aweme.unifiedauth.push.tracking.database;

import X.AbstractC796510VMj;
import X.C0VKN;
import X.C0VLF;
import X.C0VN2;
import X.C0VN3;
import X.C796040VKo;
import X.C796520VMk;
import X.C796620VMu;
import X.InterfaceC2275591E5d;
import X.InterfaceC796190VLd;
import X.InterfaceC796380VLw;
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
public final class OptInPopupDatabase_Impl extends OptInPopupDatabase {
    public volatile C796040VKo LLILLL;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0VKo] */
    @Override // com.ss.android.ugc.aweme.unifiedauth.push.tracking.database.OptInPopupDatabase
    public final InterfaceC796380VLw LIZ() {
        C796040VKo c796040VKo;
        if (this.LLILLL != null) {
            return this.LLILLL;
        }
        synchronized (this) {
            try {
                if (this.LLILLL == null) {
                    this.LLILLL = new InterfaceC796380VLw(this) { // from class: X.0VKo
                        public final AbstractC796540VMm LIZ;
                        public final C19217010Ga LIZIZ;
                        public final C854550Xfh LIZJ;
                        public final C854550Xfh LIZLLL;

                        @Override // X.InterfaceC796380VLw
                        public final List<C10GS> LIZ() {
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(0, "\n        SELECT * \n        FROM optin_popup_record\n        ");
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "trigger_time");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "trigger_scene");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "frequency_control");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "show_type");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "filter_reason");
                                int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "popup_type");
                                int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "action_type");
                                int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "action_time");
                                int iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "extra_1");
                                int iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "extra_2");
                                int iLIZIZ11 = C795450VIh.LIZIZ(cursorLIZIZ, "extra_3");
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    long j = cursorLIZIZ.getLong(iLIZIZ);
                                    String string = null;
                                    String string2 = cursorLIZIZ.isNull(iLIZIZ2) ? null : cursorLIZIZ.getString(iLIZIZ2);
                                    long j2 = cursorLIZIZ.getLong(iLIZIZ3);
                                    int i = cursorLIZIZ.getInt(iLIZIZ4);
                                    String string3 = cursorLIZIZ.isNull(iLIZIZ5) ? null : cursorLIZIZ.getString(iLIZIZ5);
                                    String string4 = cursorLIZIZ.isNull(iLIZIZ6) ? null : cursorLIZIZ.getString(iLIZIZ6);
                                    int i2 = cursorLIZIZ.getInt(iLIZIZ7);
                                    long j3 = cursorLIZIZ.getLong(iLIZIZ8);
                                    String string5 = cursorLIZIZ.isNull(iLIZIZ9) ? null : cursorLIZIZ.getString(iLIZIZ9);
                                    String string6 = cursorLIZIZ.isNull(iLIZIZ10) ? null : cursorLIZIZ.getString(iLIZIZ10);
                                    if (!cursorLIZIZ.isNull(iLIZIZ11)) {
                                        string = cursorLIZIZ.getString(iLIZIZ11);
                                    }
                                    arrayList.add(new C10GS(j, string2, j2, i, string3, string4, i2, j3, string5, string6, string));
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

                        /* JADX WARN: Type inference failed for: r0v0, types: [X.10Ga] */
                        {
                            this.LIZ = this;
                            this.LIZIZ = new AbstractC796330VLr<C10GS>(this) { // from class: X.10Ga
                                @Override // X.AbstractC795470VIj
                                public final String createQuery() {
                                    return "INSERT OR REPLACE INTO `optin_popup_record` (`trigger_time`,`trigger_scene`,`frequency_control`,`show_type`,`filter_reason`,`popup_type`,`action_type`,`action_time`,`extra_1`,`extra_2`,`extra_3`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
                                }

                                @Override // X.AbstractC796330VLr
                                public final void bind(InterfaceC796340VLs interfaceC796340VLs, C10GS c10gs) {
                                    C10GS c10gs2 = c10gs;
                                    interfaceC796340VLs.LJIJ(1, c10gs2.LIZ);
                                    String str = c10gs2.LIZIZ;
                                    if (str == null) {
                                        interfaceC796340VLs.LLD(2);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(2, str);
                                    }
                                    interfaceC796340VLs.LJIJ(3, c10gs2.LIZJ);
                                    interfaceC796340VLs.LJIJ(4, c10gs2.LIZLLL);
                                    String str2 = c10gs2.LJ;
                                    if (str2 == null) {
                                        interfaceC796340VLs.LLD(5);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(5, str2);
                                    }
                                    String str3 = c10gs2.LJFF;
                                    if (str3 == null) {
                                        interfaceC796340VLs.LLD(6);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(6, str3);
                                    }
                                    interfaceC796340VLs.LJIJ(7, c10gs2.LJI);
                                    interfaceC796340VLs.LJIJ(8, c10gs2.LJII);
                                    String str4 = c10gs2.LJIIIIZZ;
                                    if (str4 == null) {
                                        interfaceC796340VLs.LLD(9);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(9, str4);
                                    }
                                    String str5 = c10gs2.LJIIIZ;
                                    if (str5 == null) {
                                        interfaceC796340VLs.LLD(10);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(10, str5);
                                    }
                                    String str6 = c10gs2.LJIIJ;
                                    if (str6 == null) {
                                        interfaceC796340VLs.LLD(11);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(11, str6);
                                    }
                                }
                            };
                            this.LIZJ = new C854550Xfh(this, 17);
                            this.LIZLLL = new C854550Xfh(this, 18);
                        }

                        @Override // X.InterfaceC796380VLw
                        public final int LIZLLL(long j) {
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

                        @Override // X.InterfaceC796380VLw
                        public final long LJ(C10GS c10gs) {
                            this.LIZ.assertNotSuspendingTransaction();
                            this.LIZ.beginTransaction();
                            try {
                                long jInsertAndReturnId = insertAndReturnId(c10gs);
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                                return jInsertAndReturnId;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC796380VLw
                        public final C10GS LJFF(long j) {
                            String string;
                            String string2;
                            String string3;
                            String string4;
                            String string5;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "\n        SELECT * \n        FROM optin_popup_record\n        WHERE trigger_time = ?\n        ");
                            c0vn5LIZLLL.LJIJ(1, j);
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "trigger_time");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "trigger_scene");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "frequency_control");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "show_type");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "filter_reason");
                                int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "popup_type");
                                int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "action_type");
                                int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "action_time");
                                int iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "extra_1");
                                int iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "extra_2");
                                int iLIZIZ11 = C795450VIh.LIZIZ(cursorLIZIZ, "extra_3");
                                C10GS c10gs = null;
                                String string6 = null;
                                if (cursorLIZIZ.moveToFirst()) {
                                    long j2 = cursorLIZIZ.getLong(iLIZIZ);
                                    if (cursorLIZIZ.isNull(iLIZIZ2)) {
                                        string = null;
                                    } else {
                                        string = cursorLIZIZ.getString(iLIZIZ2);
                                    }
                                    long j3 = cursorLIZIZ.getLong(iLIZIZ3);
                                    int i = cursorLIZIZ.getInt(iLIZIZ4);
                                    if (cursorLIZIZ.isNull(iLIZIZ5)) {
                                        string2 = null;
                                    } else {
                                        string2 = cursorLIZIZ.getString(iLIZIZ5);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ6)) {
                                        string3 = null;
                                    } else {
                                        string3 = cursorLIZIZ.getString(iLIZIZ6);
                                    }
                                    int i2 = cursorLIZIZ.getInt(iLIZIZ7);
                                    long j4 = cursorLIZIZ.getLong(iLIZIZ8);
                                    if (cursorLIZIZ.isNull(iLIZIZ9)) {
                                        string4 = null;
                                    } else {
                                        string4 = cursorLIZIZ.getString(iLIZIZ9);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ10)) {
                                        string5 = null;
                                    } else {
                                        string5 = cursorLIZIZ.getString(iLIZIZ10);
                                    }
                                    if (!cursorLIZIZ.isNull(iLIZIZ11)) {
                                        string6 = cursorLIZIZ.getString(iLIZIZ11);
                                    }
                                    c10gs = new C10GS(j2, string, j3, i, string2, string3, i2, j4, string4, string5, string6);
                                }
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                return c10gs;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC796380VLw
                        public final List<C10GS> LIZIZ(long j, long j2) {
                            String string;
                            String string2;
                            String string3;
                            String string4;
                            String string5;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(2, "\n        SELECT * \n        FROM optin_popup_record\n        WHERE trigger_time > ? AND trigger_time <= ?\n        ORDER BY trigger_time ASC\n        ");
                            c0vn5LIZLLL.LJIJ(1, j);
                            c0vn5LIZLLL.LJIJ(2, j2);
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "trigger_time");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "trigger_scene");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "frequency_control");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "show_type");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "filter_reason");
                                int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "popup_type");
                                int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "action_type");
                                int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "action_time");
                                int iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "extra_1");
                                int iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "extra_2");
                                int iLIZIZ11 = C795450VIh.LIZIZ(cursorLIZIZ, "extra_3");
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    long j3 = cursorLIZIZ.getLong(iLIZIZ);
                                    String string6 = null;
                                    if (cursorLIZIZ.isNull(iLIZIZ2)) {
                                        string = null;
                                    } else {
                                        string = cursorLIZIZ.getString(iLIZIZ2);
                                    }
                                    long j4 = cursorLIZIZ.getLong(iLIZIZ3);
                                    int i = cursorLIZIZ.getInt(iLIZIZ4);
                                    if (cursorLIZIZ.isNull(iLIZIZ5)) {
                                        string2 = null;
                                    } else {
                                        string2 = cursorLIZIZ.getString(iLIZIZ5);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ6)) {
                                        string3 = null;
                                    } else {
                                        string3 = cursorLIZIZ.getString(iLIZIZ6);
                                    }
                                    int i2 = cursorLIZIZ.getInt(iLIZIZ7);
                                    long j5 = cursorLIZIZ.getLong(iLIZIZ8);
                                    if (cursorLIZIZ.isNull(iLIZIZ9)) {
                                        string4 = null;
                                    } else {
                                        string4 = cursorLIZIZ.getString(iLIZIZ9);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ10)) {
                                        string5 = null;
                                    } else {
                                        string5 = cursorLIZIZ.getString(iLIZIZ10);
                                    }
                                    if (!cursorLIZIZ.isNull(iLIZIZ11)) {
                                        string6 = cursorLIZIZ.getString(iLIZIZ11);
                                    }
                                    arrayList.add(new C10GS(j3, string, j4, i, string2, string3, i2, j5, string4, string5, string6));
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

                        @Override // X.InterfaceC796380VLw
                        public final int LIZJ(int i, long j, long j2, String str) {
                            this.LIZ.assertNotSuspendingTransaction();
                            InterfaceC796340VLs interfaceC796340VLsAcquire = this.LIZLLL.acquire();
                            interfaceC796340VLsAcquire.LJIJ(1, i);
                            interfaceC796340VLsAcquire.LJIJ(2, j2);
                            if (str == null) {
                                interfaceC796340VLsAcquire.LLD(3);
                            } else {
                                interfaceC796340VLsAcquire.LJIILIIL(3, str);
                            }
                            interfaceC796340VLsAcquire.LJIJ(4, j);
                            this.LIZ.beginTransaction();
                            try {
                                int iLJIIL = interfaceC796340VLsAcquire.LJIIL();
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                                this.LIZLLL.release(interfaceC796340VLsAcquire);
                                return iLJIIL;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                this.LIZLLL.release(interfaceC796340VLsAcquire);
                                throw th;
                            }
                        }
                    };
                }
                c796040VKo = this.LLILLL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c796040VKo;
    }

    @Override // X.AbstractC796540VMm
    public final void clearAllTables() {
        super.assertNotMainThread();
        C0VLF c0vlfLJLJJI = this.mOpenHelper.LJLJJI();
        try {
            super.beginTransaction();
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `optin_popup_record`");
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
        return new C796620VMu(this, new HashMap(0), new HashMap(0), "optin_popup_record");
    }

    @Override // X.AbstractC796540VMm
    public final Set<Class<? extends InterfaceC2275591E5d>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // X.AbstractC796540VMm
    public final Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(InterfaceC796380VLw.class, Collections.emptyList());
        return map;
    }

    @Override // X.AbstractC796540VMm
    public final InterfaceC796190VLd createOpenHelper(C796520VMk c796520VMk) {
        C0VN2 c0vn2 = new C0VN2(c796520VMk, new C0VN3() { // from class: X.0VKn
            @Override // X.C0VN3
            public final void onPostMigrate(C0VLF c0vlf) {
            }

            {
                super(1);
            }

            @Override // X.C0VN3
            public final void createAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `optin_popup_record` (`trigger_time` INTEGER NOT NULL, `trigger_scene` TEXT NOT NULL, `frequency_control` INTEGER NOT NULL, `show_type` INTEGER NOT NULL, `filter_reason` TEXT NOT NULL, `popup_type` TEXT NOT NULL, `action_type` INTEGER NOT NULL, `action_time` INTEGER NOT NULL, `extra_1` TEXT NOT NULL, `extra_2` TEXT NOT NULL, `extra_3` TEXT NOT NULL, PRIMARY KEY(`trigger_time`))");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                c0vlf.LJIILJJIL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '0bcaea65e1b2a843da43b2be9ce849f2')");
            }

            @Override // X.C0VN3
            public final void dropAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `optin_popup_record`");
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
                map.put("trigger_time", new C795990VKj(1, 1, "trigger_time", "INTEGER", null, true));
                map.put("trigger_scene", new C795990VKj(0, 1, "trigger_scene", "TEXT", null, true));
                map.put("frequency_control", new C795990VKj(0, 1, "frequency_control", "INTEGER", null, true));
                map.put("show_type", new C795990VKj(0, 1, "show_type", "INTEGER", null, true));
                map.put("filter_reason", new C795990VKj(0, 1, "filter_reason", "TEXT", null, true));
                map.put("popup_type", new C795990VKj(0, 1, "popup_type", "TEXT", null, true));
                map.put("action_type", new C795990VKj(0, 1, "action_type", "INTEGER", null, true));
                map.put("action_time", new C795990VKj(0, 1, "action_time", "INTEGER", null, true));
                map.put("extra_1", new C795990VKj(0, 1, "extra_1", "TEXT", null, true));
                map.put("extra_2", new C795990VKj(0, 1, "extra_2", "TEXT", null, true));
                map.put("extra_3", new C795990VKj(0, 1, "extra_3", "TEXT", null, true));
                C0VN6 c0vn6 = new C0VN6("optin_popup_record", map, new HashSet(0), new HashSet(0));
                C0VN6 c0vn6LIZ = C0VN6.LIZ(c0vlf, "optin_popup_record");
                if (!c0vn6.equals(c0vn6LIZ)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("optin_popup_record(com.ss.android.ugc.aweme.unifiedauthapi.push.tracking.model.OptInPopupRecord).\n Expected:\n");
                    sbLIZ.append(c0vn6);
                    sbLIZ.append("\n Found:\n");
                    sbLIZ.append(c0vn6LIZ);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ));
                }
                return new C0VN4(true, null);
            }
        }, "0bcaea65e1b2a843da43b2be9ce849f2", "9afb4901b64005867518f71f20e80ce8");
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
