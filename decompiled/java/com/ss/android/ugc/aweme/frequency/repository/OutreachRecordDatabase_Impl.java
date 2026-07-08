package com.ss.android.ugc.aweme.frequency.repository;

import X.AbstractC796510VMj;
import X.C0VKN;
import X.C0VLF;
import X.C0VN2;
import X.C0VN3;
import X.C795580VIu;
import X.C796520VMk;
import X.C796620VMu;
import X.InterfaceC2275591E5d;
import X.InterfaceC796190VLd;
import X.InterfaceC808060Vmu;
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
public final class OutreachRecordDatabase_Impl extends OutreachRecordDatabase {
    public volatile C795580VIu LLILZ;

    @Override // com.ss.android.ugc.aweme.frequency.repository.OutreachRecordDatabase
    public final InterfaceC808060Vmu LIZ() {
        C795580VIu c795580VIu;
        if (this.LLILZ != null) {
            return this.LLILZ;
        }
        synchronized (this) {
            try {
                if (this.LLILZ == null) {
                    this.LLILZ = new C795580VIu(this);
                }
                c795580VIu = this.LLILZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c795580VIu;
    }

    @Override // X.AbstractC796540VMm
    public final void clearAllTables() {
        super.assertNotMainThread();
        C0VLF c0vlfLJLJJI = this.mOpenHelper.LJLJJI();
        try {
            super.beginTransaction();
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `outreach_records`");
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
        return new C796620VMu(this, new HashMap(0), new HashMap(0), "outreach_records");
    }

    @Override // X.AbstractC796540VMm
    public final Set<Class<? extends InterfaceC2275591E5d>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // X.AbstractC796540VMm
    public final Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(InterfaceC808060Vmu.class, Collections.emptyList());
        return map;
    }

    @Override // X.AbstractC796540VMm
    public final InterfaceC796190VLd createOpenHelper(C796520VMk c796520VMk) {
        C0VN2 c0vn2 = new C0VN2(c796520VMk, new C0VN3() { // from class: X.0VKB
            @Override // X.C0VN3
            public final void onPostMigrate(C0VLF c0vlf) {
            }

            {
                super(2);
            }

            @Override // X.C0VN3
            public final void createAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `outreach_records` (`unique_key` TEXT NOT NULL, `outreach_key` TEXT, `outreach_type` TEXT, `trigger_scene` TEXT, `trigger_session` TEXT, `show_report_info` TEXT, `click_report_info_list` TEXT NOT NULL, `outreach_info` TEXT NOT NULL, `create_time` INTEGER NOT NULL, PRIMARY KEY(`unique_key`))");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                c0vlf.LJIILJJIL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '1fba166baa982d40b3da2fa8333a4523')");
            }

            @Override // X.C0VN3
            public final void dropAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `outreach_records`");
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
                HashMap map = new HashMap(9);
                map.put("unique_key", new C795990VKj(1, 1, "unique_key", "TEXT", null, true));
                map.put("outreach_key", new C795990VKj(0, 1, "outreach_key", "TEXT", null, false));
                map.put("outreach_type", new C795990VKj(0, 1, "outreach_type", "TEXT", null, false));
                map.put("trigger_scene", new C795990VKj(0, 1, "trigger_scene", "TEXT", null, false));
                map.put("trigger_session", new C795990VKj(0, 1, "trigger_session", "TEXT", null, false));
                map.put("show_report_info", new C795990VKj(0, 1, "show_report_info", "TEXT", null, false));
                map.put("click_report_info_list", new C795990VKj(0, 1, "click_report_info_list", "TEXT", null, true));
                map.put("outreach_info", new C795990VKj(0, 1, "outreach_info", "TEXT", null, true));
                map.put("create_time", new C795990VKj(0, 1, "create_time", "INTEGER", null, true));
                C0VN6 c0vn6 = new C0VN6("outreach_records", map, new HashSet(0), new HashSet(0));
                C0VN6 c0vn6LIZ = C0VN6.LIZ(c0vlf, "outreach_records");
                if (!c0vn6.equals(c0vn6LIZ)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("outreach_records(com.ss.android.ugc.aweme.frequency.repository.CachedOutreachRecord).\n Expected:\n");
                    sbLIZ.append(c0vn6);
                    sbLIZ.append("\n Found:\n");
                    sbLIZ.append(c0vn6LIZ);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ));
                }
                return new C0VN4(true, null);
            }
        }, "1fba166baa982d40b3da2fa8333a4523", "0a4eec80f396373e4c894a81b6420f14");
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
