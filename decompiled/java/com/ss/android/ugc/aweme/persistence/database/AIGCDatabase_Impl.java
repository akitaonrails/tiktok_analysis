package com.ss.android.ugc.aweme.persistence.database;

import X.AbstractC796510VMj;
import X.C0VKN;
import X.C0VLF;
import X.C0VN2;
import X.C0VN3;
import X.C795520VIo;
import X.C796520VMk;
import X.C796620VMu;
import X.InterfaceC2275591E5d;
import X.InterfaceC796190VLd;
import X.InterfaceC796410VLz;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public final class AIGCDatabase_Impl extends AIGCDatabase {
    public volatile C795520VIo LLILLL;

    @Override // com.ss.android.ugc.aweme.persistence.database.AIGCDatabase
    public final InterfaceC796410VLz LIZ() {
        C795520VIo c795520VIo;
        if (this.LLILLL != null) {
            return this.LLILLL;
        }
        synchronized (this) {
            try {
                if (this.LLILLL == null) {
                    this.LLILLL = new C795520VIo(this);
                }
                c795520VIo = this.LLILLL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c795520VIo;
    }

    @Override // X.AbstractC796540VMm
    public final void clearAllTables() {
        super.assertNotMainThread();
        C0VLF c0vlfLJLJJI = this.mOpenHelper.LJLJJI();
        try {
            super.beginTransaction();
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `aigc_workflow`");
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
        return new C796620VMu(this, new HashMap(0), new HashMap(0), "aigc_workflow");
    }

    @Override // X.AbstractC796540VMm
    public final Set<Class<? extends InterfaceC2275591E5d>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // X.AbstractC796540VMm
    public final Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(InterfaceC796410VLz.class, Collections.emptyList());
        return map;
    }

    @Override // X.AbstractC796540VMm
    public final InterfaceC796190VLd createOpenHelper(C796520VMk c796520VMk) {
        C0VN2 c0vn2 = new C0VN2(c796520VMk, new C0VN3() { // from class: X.0VLC
            @Override // X.C0VN3
            public final void onPostMigrate(C0VLF c0vlf) {
            }

            {
                super(1);
            }

            @Override // X.C0VN3
            public final void createAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `aigc_workflow` (`id` TEXT NOT NULL, `creation_id_read_only` TEXT NOT NULL, `old_framework_data` TEXT NOT NULL, `aigc_workflow_static` TEXT NOT NULL, `workflow_config` TEXT NOT NULL, `central_registry` TEXT NOT NULL, `static_central_registry` TEXT NOT NULL, `workflow_state` TEXT NOT NULL, `preview_info` TEXT NOT NULL, `links` TEXT NOT NULL, `source_read_only` TEXT NOT NULL, `created_at` INTEGER NOT NULL, `server_task_id` TEXT NOT NULL, `grade_down_count` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`id`))");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                c0vlf.LJIILJJIL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '59b57e9de3ff8413c695260a43c1bfee')");
            }

            @Override // X.C0VN3
            public final void dropAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `aigc_workflow`");
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
                HashMap map = new HashMap(14);
                map.put(FollowStatusChangeMethod.PARAM_UID, new C795990VKj(1, 1, FollowStatusChangeMethod.PARAM_UID, "TEXT", null, true));
                map.put("creation_id_read_only", new C795990VKj(0, 1, "creation_id_read_only", "TEXT", null, true));
                map.put("old_framework_data", new C795990VKj(0, 1, "old_framework_data", "TEXT", null, true));
                map.put("aigc_workflow_static", new C795990VKj(0, 1, "aigc_workflow_static", "TEXT", null, true));
                map.put("workflow_config", new C795990VKj(0, 1, "workflow_config", "TEXT", null, true));
                map.put("central_registry", new C795990VKj(0, 1, "central_registry", "TEXT", null, true));
                map.put("static_central_registry", new C795990VKj(0, 1, "static_central_registry", "TEXT", null, true));
                map.put("workflow_state", new C795990VKj(0, 1, "workflow_state", "TEXT", null, true));
                map.put("preview_info", new C795990VKj(0, 1, "preview_info", "TEXT", null, true));
                map.put("links", new C795990VKj(0, 1, "links", "TEXT", null, true));
                map.put("source_read_only", new C795990VKj(0, 1, "source_read_only", "TEXT", null, true));
                map.put("created_at", new C795990VKj(0, 1, "created_at", "INTEGER", null, true));
                map.put("server_task_id", new C795990VKj(0, 1, "server_task_id", "TEXT", null, true));
                map.put("grade_down_count", new C795990VKj(0, 1, "grade_down_count", "INTEGER", CardStruct.IStatusCode.DEFAULT, true));
                C0VN6 c0vn6 = new C0VN6("aigc_workflow", map, new HashSet(0), new HashSet(0));
                C0VN6 c0vn6LIZ = C0VN6.LIZ(c0vlf, "aigc_workflow");
                if (!c0vn6.equals(c0vn6LIZ)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("aigc_workflow(com.ss.android.ugc.aweme.persistence.database.AIGCWorkflowPersistence).\n Expected:\n");
                    sbLIZ.append(c0vn6);
                    sbLIZ.append("\n Found:\n");
                    sbLIZ.append(c0vn6LIZ);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ));
                }
                return new C0VN4(true, null);
            }
        }, "59b57e9de3ff8413c695260a43c1bfee", "4f564fcd337d009909e5fd49fccf3850");
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
