package com.ss.android.ugc.aweme.freeflowcard.data.database;

import X.AbstractC796510VMj;
import X.C0VKN;
import X.C0VLF;
import X.C0VN2;
import X.C0VN3;
import X.C796520VMk;
import X.C796620VMu;
import X.InterfaceC2275591E5d;
import X.InterfaceC796190VLd;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public final class FreeFlowDatabase_Impl extends FreeFlowDatabase {
    @Override // X.AbstractC796540VMm
    public final void clearAllTables() {
        super.assertNotMainThread();
        C0VLF c0vlfLJLJJI = this.mOpenHelper.LJLJJI();
        try {
            super.beginTransaction();
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `tb_auto_play_setting`");
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `tb_user_click_event`");
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `tb_app_start_mode`");
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
        return new C796620VMu(this, new HashMap(0), new HashMap(0), "tb_auto_play_setting", "tb_user_click_event", "tb_app_start_mode");
    }

    @Override // X.AbstractC796540VMm
    public final Set<Class<? extends InterfaceC2275591E5d>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // X.AbstractC796540VMm
    public final Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        return new HashMap();
    }

    @Override // X.AbstractC796540VMm
    public final InterfaceC796190VLd createOpenHelper(C796520VMk c796520VMk) {
        C0VN2 c0vn2 = new C0VN2(c796520VMk, new C0VN3() { // from class: X.0VKa
            @Override // X.C0VN3
            public final void onPostMigrate(C0VLF c0vlf) {
            }

            {
                super(1);
            }

            @Override // X.C0VN3
            public final void createAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `tb_auto_play_setting` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `is_open` INTEGER NOT NULL, `change_type` INTEGER NOT NULL, `reset_time` INTEGER NOT NULL, `monthly_state` INTEGER NOT NULL, `day_open` INTEGER NOT NULL, `day_open_reset_time` INTEGER NOT NULL)");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `tb_user_click_event` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `time` INTEGER NOT NULL, `click_type` INTEGER NOT NULL, `is_auto_play` INTEGER NOT NULL)");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `tb_app_start_mode` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `time` INTEGER NOT NULL, `start_mode` INTEGER NOT NULL)");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                c0vlf.LJIILJJIL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '1967f4d2e5a4f7e5e76e753b06cafe2b')");
            }

            @Override // X.C0VN3
            public final void dropAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `tb_auto_play_setting`");
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `tb_user_click_event`");
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `tb_app_start_mode`");
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
                HashMap map = new HashMap(7);
                map.put(FollowStatusChangeMethod.PARAM_UID, new C795990VKj(1, 1, FollowStatusChangeMethod.PARAM_UID, "INTEGER", null, true));
                map.put("is_open", new C795990VKj(0, 1, "is_open", "INTEGER", null, true));
                map.put("change_type", new C795990VKj(0, 1, "change_type", "INTEGER", null, true));
                map.put("reset_time", new C795990VKj(0, 1, "reset_time", "INTEGER", null, true));
                map.put("monthly_state", new C795990VKj(0, 1, "monthly_state", "INTEGER", null, true));
                map.put("day_open", new C795990VKj(0, 1, "day_open", "INTEGER", null, true));
                map.put("day_open_reset_time", new C795990VKj(0, 1, "day_open_reset_time", "INTEGER", null, true));
                C0VN6 c0vn6 = new C0VN6("tb_auto_play_setting", map, new HashSet(0), new HashSet(0));
                C0VN6 c0vn6LIZ = C0VN6.LIZ(c0vlf, "tb_auto_play_setting");
                if (!c0vn6.equals(c0vn6LIZ)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("tb_auto_play_setting(com.ss.android.ugc.aweme.freeflowcard.data.entity.AutoPlaySetting).\n Expected:\n");
                    sbLIZ.append(c0vn6);
                    sbLIZ.append("\n Found:\n");
                    sbLIZ.append(c0vn6LIZ);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ));
                }
                HashMap map2 = new HashMap(4);
                map2.put(FollowStatusChangeMethod.PARAM_UID, new C795990VKj(1, 1, FollowStatusChangeMethod.PARAM_UID, "INTEGER", null, true));
                map2.put("time", new C795990VKj(0, 1, "time", "INTEGER", null, true));
                map2.put("click_type", new C795990VKj(0, 1, "click_type", "INTEGER", null, true));
                map2.put("is_auto_play", new C795990VKj(0, 1, "is_auto_play", "INTEGER", null, true));
                C0VN6 c0vn62 = new C0VN6("tb_user_click_event", map2, new HashSet(0), new HashSet(0));
                C0VN6 c0vn6LIZ2 = C0VN6.LIZ(c0vlf, "tb_user_click_event");
                if (!c0vn62.equals(c0vn6LIZ2)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("tb_user_click_event(com.ss.android.ugc.aweme.freeflowcard.data.entity.UserClickEvent).\n Expected:\n");
                    sbLIZ2.append(c0vn62);
                    sbLIZ2.append("\n Found:\n");
                    sbLIZ2.append(c0vn6LIZ2);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ2));
                }
                HashMap map3 = new HashMap(3);
                map3.put(FollowStatusChangeMethod.PARAM_UID, new C795990VKj(1, 1, FollowStatusChangeMethod.PARAM_UID, "INTEGER", null, true));
                map3.put("time", new C795990VKj(0, 1, "time", "INTEGER", null, true));
                map3.put("start_mode", new C795990VKj(0, 1, "start_mode", "INTEGER", null, true));
                C0VN6 c0vn63 = new C0VN6("tb_app_start_mode", map3, new HashSet(0), new HashSet(0));
                C0VN6 c0vn6LIZ3 = C0VN6.LIZ(c0vlf, "tb_app_start_mode");
                if (!c0vn63.equals(c0vn6LIZ3)) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("tb_app_start_mode(com.ss.android.ugc.aweme.freeflowcard.data.entity.AppStartMode).\n Expected:\n");
                    sbLIZ3.append(c0vn63);
                    sbLIZ3.append("\n Found:\n");
                    sbLIZ3.append(c0vn6LIZ3);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ3));
                }
                return new C0VN4(true, null);
            }
        }, "1967f4d2e5a4f7e5e76e753b06cafe2b", "b3be3e5c94533db90027e813123cd689");
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
