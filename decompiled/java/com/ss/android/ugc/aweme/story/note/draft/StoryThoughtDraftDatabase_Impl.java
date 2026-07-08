package com.ss.android.ugc.aweme.story.note.draft;

import X.AbstractC796510VMj;
import X.C0VKN;
import X.C0VLF;
import X.C0VN2;
import X.C0VN3;
import X.C796120VKw;
import X.C796520VMk;
import X.C796620VMu;
import X.InterfaceC20582915gR;
import X.InterfaceC2275591E5d;
import X.InterfaceC796190VLd;
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
public final class StoryThoughtDraftDatabase_Impl extends StoryThoughtDraftDatabase {
    public volatile C796120VKw LL;

    @Override // com.ss.android.ugc.aweme.story.note.draft.StoryThoughtDraftDatabase
    public final InterfaceC20582915gR LIZ() {
        C796120VKw c796120VKw;
        if (this.LL != null) {
            return this.LL;
        }
        synchronized (this) {
            try {
                if (this.LL == null) {
                    this.LL = new C796120VKw(this);
                }
                c796120VKw = this.LL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c796120VKw;
    }

    @Override // X.AbstractC796540VMm
    public final void clearAllTables() {
        super.assertNotMainThread();
        C0VLF c0vlfLJLJJI = this.mOpenHelper.LJLJJI();
        try {
            super.beginTransaction();
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `story_thought_drafts`");
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
        return new C796620VMu(this, new HashMap(0), new HashMap(0), "story_thought_drafts");
    }

    @Override // X.AbstractC796540VMm
    public final Set<Class<? extends InterfaceC2275591E5d>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // X.AbstractC796540VMm
    public final Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(InterfaceC20582915gR.class, Collections.emptyList());
        return map;
    }

    @Override // X.AbstractC796540VMm
    public final InterfaceC796190VLd createOpenHelper(C796520VMk c796520VMk) {
        C0VN2 c0vn2 = new C0VN2(c796520VMk, new C0VN3() { // from class: X.0VKl
            @Override // X.C0VN3
            public final void onPostMigrate(C0VLF c0vlf) {
            }

            {
                super(10);
            }

            @Override // X.C0VN3
            public final void createAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `story_thought_drafts` (`task_id` TEXT NOT NULL, `uid` TEXT NOT NULL, `created_time` INTEGER NOT NULL, `modified_time` INTEGER NOT NULL, `text` TEXT NOT NULL, `background_index` INTEGER NOT NULL, `privacy_permission` INTEGER NOT NULL, `task_status` INTEGER NOT NULL, `avatar_urls` TEXT, `is_read` INTEGER NOT NULL, `avatar_uri` TEXT, `text_extras` TEXT, PRIMARY KEY(`task_id`))");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                c0vlf.LJIILJJIL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '640d0beaa26b9b9cc32948f161933e52')");
            }

            @Override // X.C0VN3
            public final void dropAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `story_thought_drafts`");
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
                HashMap map = new HashMap(12);
                map.put("task_id", new C795990VKj(1, 1, "task_id", "TEXT", null, true));
                map.put("uid", new C795990VKj(0, 1, "uid", "TEXT", null, true));
                map.put("created_time", new C795990VKj(0, 1, "created_time", "INTEGER", null, true));
                map.put("modified_time", new C795990VKj(0, 1, "modified_time", "INTEGER", null, true));
                map.put("text", new C795990VKj(0, 1, "text", "TEXT", null, true));
                map.put("background_index", new C795990VKj(0, 1, "background_index", "INTEGER", null, true));
                map.put("privacy_permission", new C795990VKj(0, 1, "privacy_permission", "INTEGER", null, true));
                map.put("task_status", new C795990VKj(0, 1, "task_status", "INTEGER", null, true));
                map.put("avatar_urls", new C795990VKj(0, 1, "avatar_urls", "TEXT", null, false));
                map.put("is_read", new C795990VKj(0, 1, "is_read", "INTEGER", null, true));
                map.put("avatar_uri", new C795990VKj(0, 1, "avatar_uri", "TEXT", null, false));
                map.put("text_extras", new C795990VKj(0, 1, "text_extras", "TEXT", null, false));
                C0VN6 c0vn6 = new C0VN6("story_thought_drafts", map, new HashSet(0), new HashSet(0));
                C0VN6 c0vn6LIZ = C0VN6.LIZ(c0vlf, "story_thought_drafts");
                if (!c0vn6.equals(c0vn6LIZ)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("story_thought_drafts(com.ss.android.ugc.aweme.story.note.draft.StoryThoughtDraft).\n Expected:\n");
                    sbLIZ.append(c0vn6);
                    sbLIZ.append("\n Found:\n");
                    sbLIZ.append(c0vn6LIZ);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ));
                }
                return new C0VN4(true, null);
            }
        }, "640d0beaa26b9b9cc32948f161933e52", "ae417df8d09dbd91f09827c1e486b742");
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
