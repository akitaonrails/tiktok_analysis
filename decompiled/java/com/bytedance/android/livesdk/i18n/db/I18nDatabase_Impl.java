package com.bytedance.android.livesdk.i18n.db;

import X.AbstractC796510VMj;
import X.C0VJ0;
import X.C0VKN;
import X.C0VLF;
import X.C0VN2;
import X.C0VN3;
import X.C795940VKe;
import X.C796520VMk;
import X.C796620VMu;
import X.InterfaceC1125010fNj;
import X.InterfaceC2275591E5d;
import X.InterfaceC795960VKg;
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
public final class I18nDatabase_Impl extends I18nDatabase {
    public volatile C0VJ0 LL;
    public volatile C795940VKe LLILLJJLI;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0VKe] */
    @Override // com.bytedance.android.livesdk.i18n.db.I18nDatabase
    public final InterfaceC795960VKg LIZ() {
        C795940VKe c795940VKe;
        if (this.LLILLJJLI != null) {
            return this.LLILLJJLI;
        }
        synchronized (this) {
            try {
                if (this.LLILLJJLI == null) {
                    this.LLILLJJLI = new InterfaceC795960VKg(this) { // from class: X.0VKe
                        public final AbstractC796540VMm LIZ;
                        public final C854570Xfj LIZIZ;

                        {
                            this.LIZ = this;
                            this.LIZIZ = new C854570Xfj(this, 23);
                        }

                        @Override // X.InterfaceC795960VKg
                        public final void LIZ(C795950VKf c795950VKf) {
                            this.LIZ.assertNotSuspendingTransaction();
                            this.LIZ.beginTransaction();
                            try {
                                this.LIZIZ.insert(c795950VKf);
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC795960VKg
                        public final C795950VKf get(String str) {
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT * FROM information WHERE `key` = ?");
                            c0vn5LIZLLL.LJIILIIL(1, str);
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "key");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "value");
                                C795950VKf c795950VKf = null;
                                if (cursorLIZIZ.moveToFirst()) {
                                    C795950VKf c795950VKf2 = new C795950VKf();
                                    if (cursorLIZIZ.isNull(iLIZIZ)) {
                                        c795950VKf2.LIZ = null;
                                    } else {
                                        c795950VKf2.LIZ = cursorLIZIZ.getString(iLIZIZ);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ2)) {
                                        c795950VKf2.LIZIZ = null;
                                    } else {
                                        c795950VKf2.LIZIZ = cursorLIZIZ.getString(iLIZIZ2);
                                    }
                                    c795950VKf = c795950VKf2;
                                }
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                return c795950VKf;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                throw th;
                            }
                        }
                    };
                }
                c795940VKe = this.LLILLJJLI;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c795940VKe;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0VJ0] */
    @Override // com.bytedance.android.livesdk.i18n.db.I18nDatabase
    public final InterfaceC1125010fNj LIZIZ() {
        C0VJ0 c0vj0;
        if (this.LL != null) {
            return this.LL;
        }
        synchronized (this) {
            try {
                if (this.LL == null) {
                    this.LL = new InterfaceC1125010fNj(this) { // from class: X.0VJ0
                        public final AbstractC796540VMm LIZ;
                        public final C854570Xfj LIZIZ;
                        public final C854550Xfh LIZJ;

                        @Override // X.InterfaceC1125010fNj
                        public final void empty() {
                            this.LIZ.assertNotSuspendingTransaction();
                            InterfaceC796340VLs interfaceC796340VLsAcquire = this.LIZJ.acquire();
                            this.LIZ.beginTransaction();
                            try {
                                interfaceC796340VLsAcquire.LJIIL();
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                                this.LIZJ.release(interfaceC796340VLsAcquire);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                this.LIZJ.release(interfaceC796340VLsAcquire);
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC1125010fNj
                        public final List<C0VJ1> getAll() {
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(0, "SELECT * FROM translation");
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "key");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "value");
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    C0VJ1 c0vj1 = new C0VJ1();
                                    if (cursorLIZIZ.isNull(iLIZIZ)) {
                                        c0vj1.LIZ = null;
                                    } else {
                                        c0vj1.LIZ = cursorLIZIZ.getString(iLIZIZ);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ2)) {
                                        c0vj1.LIZIZ = null;
                                    } else {
                                        c0vj1.LIZIZ = cursorLIZIZ.getString(iLIZIZ2);
                                    }
                                    arrayList.add(c0vj1);
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

                        {
                            this.LIZ = this;
                            this.LIZIZ = new C854570Xfj(this, 24);
                            this.LIZJ = new C854550Xfh(this, 61);
                        }

                        @Override // X.InterfaceC1125010fNj
                        public final void LIZ(List<C0VJ1> list) {
                            this.LIZ.assertNotSuspendingTransaction();
                            this.LIZ.beginTransaction();
                            try {
                                this.LIZIZ.insert((Iterable) list);
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC1125010fNj
                        public final long LIZIZ(String str) {
                            long j;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT COUNT(*) FROM translation WHERE `key` < ?");
                            if (str == null) {
                                c0vn5LIZLLL.LLD(1);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(1, str);
                            }
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                if (cursorLIZIZ.moveToFirst()) {
                                    j = cursorLIZIZ.getLong(0);
                                } else {
                                    j = 0;
                                }
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                return j;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC1125010fNj
                        public final void LIZJ(List<String> list) {
                            this.LIZ.assertNotSuspendingTransaction();
                            StringBuilder sb = new StringBuilder();
                            sb.append("DELETE FROM translation WHERE `key` IN (");
                            C0VIY.LIZ(sb, list.size());
                            sb.append(")");
                            InterfaceC796340VLs interfaceC796340VLsCompileStatement = this.LIZ.compileStatement(sb.toString());
                            int i = 1;
                            for (String str : list) {
                                if (str == null) {
                                    interfaceC796340VLsCompileStatement.LLD(i);
                                } else {
                                    interfaceC796340VLsCompileStatement.LJIILIIL(i, str);
                                }
                                i++;
                            }
                            this.LIZ.beginTransaction();
                            try {
                                interfaceC796340VLsCompileStatement.LJIIL();
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC1125010fNj
                        public final List<C0VJ1> LJ(List<String> list) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("SELECT * FROM translation WHERE `key` in (");
                            ArrayList<String> arrayList = (ArrayList) list;
                            int size = arrayList.size();
                            C0VIY.LIZ(sb, size);
                            sb.append(")");
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(size, sb.toString());
                            int i = 1;
                            for (String str : arrayList) {
                                if (str == null) {
                                    c0vn5LIZLLL.LLD(i);
                                } else {
                                    c0vn5LIZLLL.LJIILIIL(i, str);
                                }
                                i++;
                            }
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "key");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "value");
                                ArrayList arrayList2 = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    C0VJ1 c0vj1 = new C0VJ1();
                                    if (cursorLIZIZ.isNull(iLIZIZ)) {
                                        c0vj1.LIZ = null;
                                    } else {
                                        c0vj1.LIZ = cursorLIZIZ.getString(iLIZIZ);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ2)) {
                                        c0vj1.LIZIZ = null;
                                    } else {
                                        c0vj1.LIZIZ = cursorLIZIZ.getString(iLIZIZ2);
                                    }
                                    arrayList2.add(c0vj1);
                                }
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                return arrayList2;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC1125010fNj
                        public final C0VJ1 LJFF(String str) {
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT * FROM translation WHERE `key` = ?");
                            if (str == null) {
                                c0vn5LIZLLL.LLD(1);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(1, str);
                            }
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "key");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "value");
                                C0VJ1 c0vj1 = null;
                                if (cursorLIZIZ.moveToFirst()) {
                                    C0VJ1 c0vj12 = new C0VJ1();
                                    if (cursorLIZIZ.isNull(iLIZIZ)) {
                                        c0vj12.LIZ = null;
                                    } else {
                                        c0vj12.LIZ = cursorLIZIZ.getString(iLIZIZ);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ2)) {
                                        c0vj12.LIZIZ = null;
                                    } else {
                                        c0vj12.LIZIZ = cursorLIZIZ.getString(iLIZIZ2);
                                    }
                                    c0vj1 = c0vj12;
                                }
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                return c0vj1;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC1125010fNj
                        public final List<C0VJ1> LIZLLL(long j, long j2) {
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(2, "SELECT * FROM (SELECT * FROM translation ORDER BY `key`) LIMIT ? OFFSET ?");
                            c0vn5LIZLLL.LJIJ(1, j);
                            c0vn5LIZLLL.LJIJ(2, j2);
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "key");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "value");
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    C0VJ1 c0vj1 = new C0VJ1();
                                    if (cursorLIZIZ.isNull(iLIZIZ)) {
                                        c0vj1.LIZ = null;
                                    } else {
                                        c0vj1.LIZ = cursorLIZIZ.getString(iLIZIZ);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ2)) {
                                        c0vj1.LIZIZ = null;
                                    } else {
                                        c0vj1.LIZIZ = cursorLIZIZ.getString(iLIZIZ2);
                                    }
                                    arrayList.add(c0vj1);
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
                c0vj0 = this.LL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c0vj0;
    }

    @Override // X.AbstractC796540VMm
    public final void clearAllTables() {
        super.assertNotMainThread();
        C0VLF c0vlfLJLJJI = this.mOpenHelper.LJLJJI();
        try {
            super.beginTransaction();
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `translation`");
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `information`");
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
        return new C796620VMu(this, new HashMap(0), new HashMap(0), "translation", "information");
    }

    @Override // X.AbstractC796540VMm
    public final Set<Class<? extends InterfaceC2275591E5d>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // X.AbstractC796540VMm
    public final Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(InterfaceC1125010fNj.class, Collections.emptyList());
        map.put(InterfaceC795960VKg.class, Collections.emptyList());
        return map;
    }

    @Override // X.AbstractC796540VMm
    public final InterfaceC796190VLd createOpenHelper(C796520VMk c796520VMk) {
        C0VN2 c0vn2 = new C0VN2(c796520VMk, new C0VN3() { // from class: X.0VKR
            @Override // X.C0VN3
            public final void onPostMigrate(C0VLF c0vlf) {
            }

            {
                super(1);
            }

            @Override // X.C0VN3
            public final void createAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `translation` (`key` TEXT NOT NULL, `value` TEXT, PRIMARY KEY(`key`))");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `information` (`key` TEXT NOT NULL, `value` TEXT, PRIMARY KEY(`key`))");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                c0vlf.LJIILJJIL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'db08c04e8a10c6c1ddb9d9ab384c2f17')");
            }

            @Override // X.C0VN3
            public final void dropAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `translation`");
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `information`");
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
                HashMap map = new HashMap(2);
                map.put("key", new C795990VKj(1, 1, "key", "TEXT", null, true));
                map.put("value", new C795990VKj(0, 1, "value", "TEXT", null, false));
                C0VN6 c0vn6 = new C0VN6("translation", map, new HashSet(0), new HashSet(0));
                C0VN6 c0vn6LIZ = C0VN6.LIZ(c0vlf, "translation");
                if (!c0vn6.equals(c0vn6LIZ)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("translation(com.bytedance.android.livesdk.i18n.db.I18nTranslation).\n Expected:\n");
                    sbLIZ.append(c0vn6);
                    sbLIZ.append("\n Found:\n");
                    sbLIZ.append(c0vn6LIZ);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ));
                }
                HashMap map2 = new HashMap(2);
                map2.put("key", new C795990VKj(1, 1, "key", "TEXT", null, true));
                map2.put("value", new C795990VKj(0, 1, "value", "TEXT", null, false));
                C0VN6 c0vn62 = new C0VN6("information", map2, new HashSet(0), new HashSet(0));
                C0VN6 c0vn6LIZ2 = C0VN6.LIZ(c0vlf, "information");
                if (!c0vn62.equals(c0vn6LIZ2)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("information(com.bytedance.android.livesdk.i18n.db.I18nInformation).\n Expected:\n");
                    sbLIZ2.append(c0vn62);
                    sbLIZ2.append("\n Found:\n");
                    sbLIZ2.append(c0vn6LIZ2);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ2));
                }
                return new C0VN4(true, null);
            }
        }, "db08c04e8a10c6c1ddb9d9ab384c2f17", "e3af7f9b450df7204a5f65d0fd2a1eaa");
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
