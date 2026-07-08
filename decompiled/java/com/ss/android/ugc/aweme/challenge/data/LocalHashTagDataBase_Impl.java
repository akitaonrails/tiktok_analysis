package com.ss.android.ugc.aweme.challenge.data;

import X.AbstractC796510VMj;
import X.C0VKN;
import X.C0VL1;
import X.C0VLF;
import X.C0VN2;
import X.C0VN3;
import X.C796140VKy;
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
public final class LocalHashTagDataBase_Impl extends LocalHashTagDataBase {
    public volatile C796140VKy LL;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0VKy] */
    @Override // com.ss.android.ugc.aweme.challenge.data.LocalHashTagDataBase
    public final C0VL1 LIZ() {
        C796140VKy c796140VKy;
        if (this.LL != null) {
            return this.LL;
        }
        synchronized (this) {
            try {
                if (this.LL == null) {
                    this.LL = new C0VL1(this) { // from class: X.0VKy
                        public final AbstractC796540VMm LIZ;

                        @Override // X.C0VL1
                        public final List<C0VL0> LIZ() {
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(0, "SELECT * FROM localHashTag order by time desc");
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "name");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "time");
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    C0VL0 c0vl0 = new C0VL0();
                                    Long lValueOf = null;
                                    c0vl0.LIZ = cursorLIZIZ.isNull(iLIZIZ) ? null : cursorLIZIZ.getString(iLIZIZ);
                                    if (!cursorLIZIZ.isNull(iLIZIZ2)) {
                                        lValueOf = Long.valueOf(cursorLIZIZ.getLong(iLIZIZ2));
                                    }
                                    c0vl0.LIZIZ = lValueOf;
                                    arrayList.add(c0vl0);
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
                            new C854570Xfj(this, 4);
                            new AbstractC796320VLq<C0VL0>(this) { // from class: X.0VKz
                                @Override // X.AbstractC796320VLq, X.AbstractC795470VIj
                                public final String createQuery() {
                                    return "UPDATE OR FAIL `localHashTag` SET `name` = ?,`time` = ? WHERE `name` = ?";
                                }

                                @Override // X.AbstractC796320VLq
                                public final void bind(InterfaceC796340VLs interfaceC796340VLs, C0VL0 c0vl0) {
                                    C0VL0 c0vl02 = c0vl0;
                                    String str = c0vl02.LIZ;
                                    if (str == null) {
                                        interfaceC796340VLs.LLD(1);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(1, str);
                                    }
                                    Long l = c0vl02.LIZIZ;
                                    if (l == null) {
                                        interfaceC796340VLs.LLD(2);
                                    } else {
                                        interfaceC796340VLs.LJIJ(2, l.longValue());
                                    }
                                    String str2 = c0vl02.LIZ;
                                    if (str2 == null) {
                                        interfaceC796340VLs.LLD(3);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(3, str2);
                                    }
                                }
                            };
                            new C854550Xfh(this, 14);
                        }
                    };
                }
                c796140VKy = this.LL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c796140VKy;
    }

    @Override // X.AbstractC796540VMm
    public final void clearAllTables() {
        super.assertNotMainThread();
        C0VLF c0vlfLJLJJI = this.mOpenHelper.LJLJJI();
        try {
            super.beginTransaction();
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `localHashTag`");
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
        return new C796620VMu(this, new HashMap(0), new HashMap(0), "localHashTag");
    }

    @Override // X.AbstractC796540VMm
    public final Set<Class<? extends InterfaceC2275591E5d>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // X.AbstractC796540VMm
    public final Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(C0VL1.class, Collections.emptyList());
        return map;
    }

    @Override // X.AbstractC796540VMm
    public final InterfaceC796190VLd createOpenHelper(C796520VMk c796520VMk) {
        C0VN2 c0vn2 = new C0VN2(c796520VMk, new C0VN3() { // from class: X.0VKG
            @Override // X.C0VN3
            public final void onPostMigrate(C0VLF c0vlf) {
            }

            {
                super(1);
            }

            @Override // X.C0VN3
            public final void createAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `localHashTag` (`name` TEXT NOT NULL, `time` INTEGER, PRIMARY KEY(`name`))");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                c0vlf.LJIILJJIL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '0fdb23fe113307f93af74ceea527f0a9')");
            }

            @Override // X.C0VN3
            public final void dropAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `localHashTag`");
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
                map.put("name", new C795990VKj(1, 1, "name", "TEXT", null, true));
                map.put("time", new C795990VKj(0, 1, "time", "INTEGER", null, false));
                C0VN6 c0vn6 = new C0VN6("localHashTag", map, new HashSet(0), new HashSet(0));
                C0VN6 c0vn6LIZ = C0VN6.LIZ(c0vlf, "localHashTag");
                if (!c0vn6.equals(c0vn6LIZ)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("localHashTag(com.ss.android.ugc.aweme.challenge.data.LocalHashTagItem).\n Expected:\n");
                    sbLIZ.append(c0vn6);
                    sbLIZ.append("\n Found:\n");
                    sbLIZ.append(c0vn6LIZ);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ));
                }
                return new C0VN4(true, null);
            }
        }, "0fdb23fe113307f93af74ceea527f0a9", "606e3395020db78e36e0b235c6657129");
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
