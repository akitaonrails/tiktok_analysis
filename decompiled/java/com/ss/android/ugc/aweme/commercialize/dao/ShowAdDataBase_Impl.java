package com.ss.android.ugc.aweme.commercialize.dao;

import X.AbstractC796510VMj;
import X.C0VKN;
import X.C0VL4;
import X.C0VL7;
import X.C0VLF;
import X.C0VN2;
import X.C0VN3;
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
public final class ShowAdDataBase_Impl extends ShowAdDataBase {
    public volatile C0VL4 LLILLJJLI;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0VL4] */
    @Override // com.ss.android.ugc.aweme.commercialize.dao.ShowAdDataBase
    public final C0VL7 LIZ() {
        C0VL4 c0vl4;
        if (this.LLILLJJLI != null) {
            return this.LLILLJJLI;
        }
        synchronized (this) {
            try {
                if (this.LLILLJJLI == null) {
                    this.LLILLJJLI = new C0VL7(this) { // from class: X.0VL4
                        public final AbstractC796540VMm LIZ;
                        public final C854570Xfj LIZIZ;
                        public final C854550Xfh LIZJ;

                        @Override // X.C0VL7
                        public final void LIZIZ() {
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

                        {
                            this.LIZ = this;
                            this.LIZIZ = new C854570Xfj(this, 27);
                            new AbstractC796320VLq<C0VL6>(this) { // from class: X.0VL5
                                @Override // X.AbstractC796320VLq, X.AbstractC795470VIj
                                public final String createQuery() {
                                    return "DELETE FROM `showAd` WHERE `awemeId` = ?";
                                }

                                @Override // X.AbstractC796320VLq
                                public final void bind(InterfaceC796340VLs interfaceC796340VLs, C0VL6 c0vl6) {
                                    String str = c0vl6.LIZ;
                                    if (str == null) {
                                        interfaceC796340VLs.LLD(1);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(1, str);
                                    }
                                }
                            };
                            this.LIZJ = new C854550Xfh(this, 67);
                        }

                        @Override // X.C0VL7
                        public final void LIZ(C0VL6 c0vl6) {
                            this.LIZ.assertNotSuspendingTransaction();
                            this.LIZ.beginTransaction();
                            try {
                                this.LIZIZ.insert(c0vl6);
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                throw th;
                            }
                        }

                        @Override // X.C0VL7
                        public final C0VL6 LIZJ(String str) {
                            String string;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT * FROM showAd WHERE awemeId = ?");
                            if (str == null) {
                                c0vn5LIZLLL.LLD(1);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(1, str);
                            }
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "awemeId");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "cid");
                                C0VL6 c0vl6 = null;
                                String string2 = null;
                                if (cursorLIZIZ.moveToFirst()) {
                                    if (cursorLIZIZ.isNull(iLIZIZ)) {
                                        string = null;
                                    } else {
                                        string = cursorLIZIZ.getString(iLIZIZ);
                                    }
                                    if (!cursorLIZIZ.isNull(iLIZIZ2)) {
                                        string2 = cursorLIZIZ.getString(iLIZIZ2);
                                    }
                                    c0vl6 = new C0VL6(string, string2);
                                }
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                return c0vl6;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                throw th;
                            }
                        }

                        @Override // X.C0VL7
                        public final List<C0VL6> LIZLLL(String str) {
                            String string;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT * FROM showAd where awemeId = ?");
                            if (str == null) {
                                c0vn5LIZLLL.LLD(1);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(1, str);
                            }
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "awemeId");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "cid");
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    String string2 = null;
                                    if (cursorLIZIZ.isNull(iLIZIZ)) {
                                        string = null;
                                    } else {
                                        string = cursorLIZIZ.getString(iLIZIZ);
                                    }
                                    if (!cursorLIZIZ.isNull(iLIZIZ2)) {
                                        string2 = cursorLIZIZ.getString(iLIZIZ2);
                                    }
                                    arrayList.add(new C0VL6(string, string2));
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
                c0vl4 = this.LLILLJJLI;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c0vl4;
    }

    @Override // X.AbstractC796540VMm
    public final void clearAllTables() {
        super.assertNotMainThread();
        C0VLF c0vlfLJLJJI = this.mOpenHelper.LJLJJI();
        try {
            super.beginTransaction();
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `showAd`");
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
        return new C796620VMu(this, new HashMap(0), new HashMap(0), "showAd");
    }

    @Override // X.AbstractC796540VMm
    public final Set<Class<? extends InterfaceC2275591E5d>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // X.AbstractC796540VMm
    public final Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(C0VL7.class, Collections.emptyList());
        return map;
    }

    @Override // X.AbstractC796540VMm
    public final InterfaceC796190VLd createOpenHelper(C796520VMk c796520VMk) {
        C0VN2 c0vn2 = new C0VN2(c796520VMk, new C0VN3() { // from class: X.0VKh
            @Override // X.C0VN3
            public final void onPostMigrate(C0VLF c0vlf) {
            }

            {
                super(2);
            }

            @Override // X.C0VN3
            public final void createAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `showAd` (`awemeId` TEXT NOT NULL, `cid` TEXT, PRIMARY KEY(`awemeId`))");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                c0vlf.LJIILJJIL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'e04cf56d01dc68702059f284d226e920')");
            }

            @Override // X.C0VN3
            public final void dropAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `showAd`");
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
                map.put("awemeId", new C795990VKj(1, 1, "awemeId", "TEXT", null, true));
                map.put("cid", new C795990VKj(0, 1, "cid", "TEXT", null, false));
                C0VN6 c0vn6 = new C0VN6("showAd", map, new HashSet(0), new HashSet(0));
                C0VN6 c0vn6LIZ = C0VN6.LIZ(c0vlf, "showAd");
                if (!c0vn6.equals(c0vn6LIZ)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("showAd(com.ss.android.ugc.aweme.commercialize.dao.ShowAd).\n Expected:\n");
                    sbLIZ.append(c0vn6);
                    sbLIZ.append("\n Found:\n");
                    sbLIZ.append(c0vn6LIZ);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ));
                }
                return new C0VN4(true, null);
            }
        }, "e04cf56d01dc68702059f284d226e920", "8048ca69d4eccc57764a79d8cf08baa6");
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
