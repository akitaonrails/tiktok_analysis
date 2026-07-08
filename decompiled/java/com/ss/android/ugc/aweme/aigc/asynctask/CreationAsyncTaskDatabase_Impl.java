package com.ss.android.ugc.aweme.aigc.asynctask;

import X.AbstractC796510VMj;
import X.C0LX1;
import X.C0VKN;
import X.C0VLF;
import X.C0VN2;
import X.C0VN3;
import X.C796520VMk;
import X.C796620VMu;
import X.C796850VNr;
import X.InterfaceC2275591E5d;
import X.InterfaceC796190VLd;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public final class CreationAsyncTaskDatabase_Impl extends CreationAsyncTaskDatabase {
    public volatile C796850VNr LLJI;

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskDatabase
    public final C0LX1 LIZ() {
        C796850VNr c796850VNr;
        if (this.LLJI != null) {
            return this.LLJI;
        }
        synchronized (this) {
            try {
                if (this.LLJI == null) {
                    this.LLJI = new C796850VNr(this);
                }
                c796850VNr = this.LLJI;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c796850VNr;
    }

    @Override // X.AbstractC796540VMm
    public final void clearAllTables() {
        super.assertNotMainThread();
        C0VLF c0vlfLJLJJI = this.mOpenHelper.LJLJJI();
        try {
            super.beginTransaction();
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `creation_async_task`");
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
        return new C796620VMu(this, new HashMap(0), new HashMap(0), "creation_async_task");
    }

    @Override // X.AbstractC796540VMm
    public final Set<Class<? extends InterfaceC2275591E5d>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // X.AbstractC796540VMm
    public final Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(C0LX1.class, Collections.emptyList());
        return map;
    }

    @Override // X.AbstractC796540VMm
    public final InterfaceC796190VLd createOpenHelper(C796520VMk c796520VMk) {
        C0VN2 c0vn2 = new C0VN2(c796520VMk, new C0VN3() { // from class: X.0VNa
            @Override // X.C0VN3
            public final void onPostMigrate(C0VLF c0vlf) {
            }

            {
                super(9);
            }

            @Override // X.C0VN3
            public final void createAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `creation_async_task` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `icon` TEXT NOT NULL, `type` TEXT NOT NULL, `status` TEXT NOT NULL, `async_status` TEXT NOT NULL, `step` TEXT NOT NULL, `progress` INTEGER NOT NULL, `child_task_id` TEXT NOT NULL, `parent_task_id` TEXT NOT NULL, `creation_id` TEXT NOT NULL, `creation_version` INTEGER NOT NULL, `source` TEXT NOT NULL, `extra` TEXT NOT NULL, `prompt` TEXT NOT NULL, `error_code` INTEGER NOT NULL, `error_msg` TEXT NOT NULL, `fail_reason_msg` TEXT NOT NULL, `resource_id` TEXT NOT NULL, `created_at` INTEGER NOT NULL, `server_task_id` TEXT NOT NULL, `remain_time` INTEGER NOT NULL, `log_extra` TEXT NOT NULL, `ai_creation_id` TEXT NOT NULL, `remain_time_stage` INTEGER NOT NULL, `input_cache` TEXT NOT NULL, `quota_result` TEXT NOT NULL, PRIMARY KEY(`id`))");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                c0vlf.LJIILJJIL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'dc6ddf3bab18be6174fb5a016d91de95')");
            }

            @Override // X.C0VN3
            public final void dropAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `creation_async_task`");
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
                HashMap map = new HashMap(27);
                map.put(FollowStatusChangeMethod.PARAM_UID, new C795990VKj(1, 1, FollowStatusChangeMethod.PARAM_UID, "TEXT", null, true));
                map.put("name", new C795990VKj(0, 1, "name", "TEXT", null, true));
                map.put("icon", new C795990VKj(0, 1, "icon", "TEXT", null, true));
                map.put("type", new C795990VKj(0, 1, "type", "TEXT", null, true));
                map.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, new C795990VKj(0, 1, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "TEXT", null, true));
                map.put("async_status", new C795990VKj(0, 1, "async_status", "TEXT", null, true));
                map.put("step", new C795990VKj(0, 1, "step", "TEXT", null, true));
                map.put("progress", new C795990VKj(0, 1, "progress", "INTEGER", null, true));
                map.put("child_task_id", new C795990VKj(0, 1, "child_task_id", "TEXT", null, true));
                map.put("parent_task_id", new C795990VKj(0, 1, "parent_task_id", "TEXT", null, true));
                map.put("creation_id", new C795990VKj(0, 1, "creation_id", "TEXT", null, true));
                map.put("creation_version", new C795990VKj(0, 1, "creation_version", "INTEGER", null, true));
                map.put("source", new C795990VKj(0, 1, "source", "TEXT", null, true));
                map.put("extra", new C795990VKj(0, 1, "extra", "TEXT", null, true));
                map.put("prompt", new C795990VKj(0, 1, "prompt", "TEXT", null, true));
                map.put("error_code", new C795990VKj(0, 1, "error_code", "INTEGER", null, true));
                map.put("error_msg", new C795990VKj(0, 1, "error_msg", "TEXT", null, true));
                map.put("fail_reason_msg", new C795990VKj(0, 1, "fail_reason_msg", "TEXT", null, true));
                map.put("resource_id", new C795990VKj(0, 1, "resource_id", "TEXT", null, true));
                map.put("created_at", new C795990VKj(0, 1, "created_at", "INTEGER", null, true));
                map.put("server_task_id", new C795990VKj(0, 1, "server_task_id", "TEXT", null, true));
                map.put("remain_time", new C795990VKj(0, 1, "remain_time", "INTEGER", null, true));
                map.put("log_extra", new C795990VKj(0, 1, "log_extra", "TEXT", null, true));
                map.put("ai_creation_id", new C795990VKj(0, 1, "ai_creation_id", "TEXT", null, true));
                map.put("remain_time_stage", new C795990VKj(0, 1, "remain_time_stage", "INTEGER", null, true));
                map.put("input_cache", new C795990VKj(0, 1, "input_cache", "TEXT", null, true));
                map.put("quota_result", new C795990VKj(0, 1, "quota_result", "TEXT", null, true));
                C0VN6 c0vn6 = new C0VN6("creation_async_task", map, new HashSet(0), new HashSet(0));
                C0VN6 c0vn6LIZ = C0VN6.LIZ(c0vlf, "creation_async_task");
                if (!c0vn6.equals(c0vn6LIZ)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("creation_async_task(com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskEntity).\n Expected:\n");
                    sbLIZ.append(c0vn6);
                    sbLIZ.append("\n Found:\n");
                    sbLIZ.append(c0vn6LIZ);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ));
                }
                return new C0VN4(true, null);
            }
        }, "dc6ddf3bab18be6174fb5a016d91de95", "b9f5477e6a200467e548644209784022");
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
