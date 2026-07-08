package com.ss.android.ugc.aweme.runtime.behavior;

import X.AbstractC796510VMj;
import X.C0VKN;
import X.C0VLA;
import X.C0VLF;
import X.C0VN2;
import X.C0VN3;
import X.C796520VMk;
import X.C796620VMu;
import X.InterfaceC2275591E5d;
import X.InterfaceC796190VLd;
import X.InterfaceC799430VXp;
import android.database.Cursor;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public final class RuntimeBehaviorDataBase_Impl extends RuntimeBehaviorDataBase {
    public volatile C0VLA LL;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0VLA] */
    @Override // com.ss.android.ugc.aweme.runtime.behavior.RuntimeBehaviorDataBase
    public final InterfaceC799430VXp LIZ() {
        C0VLA c0vla;
        if (this.LL != null) {
            return this.LL;
        }
        synchronized (this) {
            try {
                if (this.LL == null) {
                    this.LL = new InterfaceC799430VXp(this) { // from class: X.0VLA
                        public final AbstractC796540VMm LIZ;
                        public final C854570Xfj LIZIZ;
                        public final C854550Xfh LIZJ;

                        {
                            this.LIZ = this;
                            this.LIZIZ = new C854570Xfj(this, 6);
                            this.LIZJ = new C854550Xfh(this, 20);
                            new C854550Xfh(this, 21);
                        }

                        @Override // X.InterfaceC799430VXp
                        public final void LIZIZ(C0VLB c0vlb) {
                            this.LIZ.assertNotSuspendingTransaction();
                            this.LIZ.beginTransaction();
                            try {
                                this.LIZIZ.insert(c0vlb);
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC799430VXp
                        public final void LIZ(long j, String str) {
                            this.LIZ.assertNotSuspendingTransaction();
                            InterfaceC796340VLs interfaceC796340VLsAcquire = this.LIZJ.acquire();
                            if (str == null) {
                                interfaceC796340VLsAcquire.LLD(1);
                            } else {
                                interfaceC796340VLsAcquire.LJIILIIL(1, str);
                            }
                            interfaceC796340VLsAcquire.LJIJ(2, j);
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

                        @Override // X.InterfaceC799430VXp
                        public final List LIZJ(long j, String str) {
                            String string;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(2, "SELECT * FROM runtimeBehaviorEntity where type = ?  and time > ?");
                            if (str == null) {
                                c0vn5LIZLLL.LLD(1);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(1, str);
                            }
                            c0vn5LIZLLL.LJIJ(2, j);
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, FollowStatusChangeMethod.PARAM_UID);
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "type");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "time");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "msg");
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    C0VLB c0vlb = new C0VLB();
                                    c0vlb.LIZ = cursorLIZIZ.getInt(iLIZIZ);
                                    String string2 = null;
                                    if (cursorLIZIZ.isNull(iLIZIZ2)) {
                                        string = null;
                                    } else {
                                        string = cursorLIZIZ.getString(iLIZIZ2);
                                    }
                                    c0vlb.LIZIZ = string;
                                    c0vlb.LIZJ = cursorLIZIZ.getLong(iLIZIZ3);
                                    if (!cursorLIZIZ.isNull(iLIZIZ4)) {
                                        string2 = cursorLIZIZ.getString(iLIZIZ4);
                                    }
                                    c0vlb.LIZLLL = string2;
                                    arrayList.add(c0vlb);
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
                c0vla = this.LL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c0vla;
    }

    @Override // X.AbstractC796540VMm
    public final void clearAllTables() {
        super.assertNotMainThread();
        C0VLF c0vlfLJLJJI = this.mOpenHelper.LJLJJI();
        try {
            super.beginTransaction();
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `runtimeBehaviorEntity`");
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
        return new C796620VMu(this, new HashMap(0), new HashMap(0), "runtimeBehaviorEntity");
    }

    @Override // X.AbstractC796540VMm
    public final Set<Class<? extends InterfaceC2275591E5d>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // X.AbstractC796540VMm
    public final Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(InterfaceC799430VXp.class, Collections.emptyList());
        return map;
    }

    @Override // X.AbstractC796540VMm
    public final InterfaceC796190VLd createOpenHelper(C796520VMk c796520VMk) {
        C0VN2 c0vn2 = new C0VN2(c796520VMk, new C0VN3() { // from class: X.0VKF
            @Override // X.C0VN3
            public final void onPostMigrate(C0VLF c0vlf) {
            }

            {
                super(1);
            }

            @Override // X.C0VN3
            public final void createAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `runtimeBehaviorEntity` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `type` TEXT NOT NULL, `time` INTEGER NOT NULL, `msg` TEXT NOT NULL)");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                c0vlf.LJIILJJIL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '977ffca18b985d80d9f488e58c9d7da9')");
            }

            @Override // X.C0VN3
            public final void dropAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `runtimeBehaviorEntity`");
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
                map.put(FollowStatusChangeMethod.PARAM_UID, new C795990VKj(1, 1, FollowStatusChangeMethod.PARAM_UID, "INTEGER", null, true));
                map.put("type", new C795990VKj(0, 1, "type", "TEXT", null, true));
                map.put("time", new C795990VKj(0, 1, "time", "INTEGER", null, true));
                map.put("msg", new C795990VKj(0, 1, "msg", "TEXT", null, true));
                C0VN6 c0vn6 = new C0VN6("runtimeBehaviorEntity", map, new HashSet(0), new HashSet(0));
                C0VN6 c0vn6LIZ = C0VN6.LIZ(c0vlf, "runtimeBehaviorEntity");
                if (!c0vn6.equals(c0vn6LIZ)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("runtimeBehaviorEntity(com.ss.android.ugc.aweme.runtime.behavior.RuntimeBehaviorEntity).\n Expected:\n");
                    sbLIZ.append(c0vn6);
                    sbLIZ.append("\n Found:\n");
                    sbLIZ.append(c0vn6LIZ);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ));
                }
                return new C0VN4(true, null);
            }
        }, "977ffca18b985d80d9f488e58c9d7da9", "3d4bcb8798a8e5184ae76e79c3f54456");
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
