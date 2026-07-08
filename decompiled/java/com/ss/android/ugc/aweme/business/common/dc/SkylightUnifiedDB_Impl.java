package com.ss.android.ugc.aweme.business.common.dc;

import X.AbstractC796510VMj;
import X.C0VKN;
import X.C0VLF;
import X.C0VLZ;
import X.C0VN2;
import X.C0VN3;
import X.C796490VMh;
import X.C796520VMk;
import X.C796620VMu;
import X.InterfaceC2275591E5d;
import X.InterfaceC611050Nxv;
import X.InterfaceC611220NyC;
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
public final class SkylightUnifiedDB_Impl extends SkylightUnifiedDB {
    public volatile C796490VMh LLILZLL;
    public volatile C0VLZ LLIZ;

    @Override // com.ss.android.ugc.aweme.business.common.dc.SkylightUnifiedDB
    public final InterfaceC611050Nxv LIZ() {
        C0VLZ c0vlz;
        if (this.LLIZ != null) {
            return this.LLIZ;
        }
        synchronized (this) {
            try {
                if (this.LLIZ == null) {
                    this.LLIZ = new C0VLZ(this);
                }
                c0vlz = this.LLIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c0vlz;
    }

    @Override // com.ss.android.ugc.aweme.business.common.dc.SkylightUnifiedDB
    public final InterfaceC611220NyC LIZIZ() {
        C796490VMh c796490VMh;
        if (this.LLILZLL != null) {
            return this.LLILZLL;
        }
        synchronized (this) {
            try {
                if (this.LLILZLL == null) {
                    this.LLILZLL = new C796490VMh(this);
                }
                c796490VMh = this.LLILZLL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c796490VMh;
    }

    @Override // X.AbstractC796540VMm
    public final void clearAllTables() {
        super.assertNotMainThread();
        C0VLF c0vlfLJLJJI = this.mOpenHelper.LJLJJI();
        try {
            super.beginTransaction();
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `skylight_story_collection`");
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `skylight_live`");
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
        return new C796620VMu(this, new HashMap(0), new HashMap(0), "skylight_story_collection", "skylight_live");
    }

    @Override // X.AbstractC796540VMm
    public final Set<Class<? extends InterfaceC2275591E5d>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // X.AbstractC796540VMm
    public final Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(InterfaceC611220NyC.class, Collections.emptyList());
        map.put(InterfaceC611050Nxv.class, Collections.emptyList());
        return map;
    }

    @Override // X.AbstractC796540VMm
    public final InterfaceC796190VLd createOpenHelper(C796520VMk c796520VMk) {
        C0VN2 c0vn2 = new C0VN2(c796520VMk, new C0VN3() { // from class: X.0VLG
            @Override // X.C0VN3
            public final void onPostMigrate(C0VLF c0vlf) {
            }

            {
                super(1);
            }

            @Override // X.C0VN3
            public final void createAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `skylight_story_collection` (`author_id` TEXT NOT NULL, `collection` TEXT NOT NULL, `user_story` TEXT, `updated_at` INTEGER NOT NULL, PRIMARY KEY(`author_id`))");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `skylight_live` (`uid` TEXT NOT NULL, `user_info` TEXT NOT NULL, `updated_at` INTEGER NOT NULL, PRIMARY KEY(`uid`))");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                c0vlf.LJIILJJIL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ca9a0a3a40224540761c73d56d563fbd')");
            }

            @Override // X.C0VN3
            public final void dropAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `skylight_story_collection`");
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `skylight_live`");
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
                map.put("author_id", new C795990VKj(1, 1, "author_id", "TEXT", null, true));
                map.put("collection", new C795990VKj(0, 1, "collection", "TEXT", null, true));
                map.put("user_story", new C795990VKj(0, 1, "user_story", "TEXT", null, false));
                map.put("updated_at", new C795990VKj(0, 1, "updated_at", "INTEGER", null, true));
                C0VN6 c0vn6 = new C0VN6("skylight_story_collection", map, new HashSet(0), new HashSet(0));
                C0VN6 c0vn6LIZ = C0VN6.LIZ(c0vlf, "skylight_story_collection");
                if (!c0vn6.equals(c0vn6LIZ)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("skylight_story_collection(com.ss.android.ugc.aweme.business.common.dc.SkylightStoryCollectionEntity).\n Expected:\n");
                    sbLIZ.append(c0vn6);
                    sbLIZ.append("\n Found:\n");
                    sbLIZ.append(c0vn6LIZ);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ));
                }
                HashMap map2 = new HashMap(3);
                map2.put("uid", new C795990VKj(1, 1, "uid", "TEXT", null, true));
                map2.put("user_info", new C795990VKj(0, 1, "user_info", "TEXT", null, true));
                map2.put("updated_at", new C795990VKj(0, 1, "updated_at", "INTEGER", null, true));
                C0VN6 c0vn62 = new C0VN6("skylight_live", map2, new HashSet(0), new HashSet(0));
                C0VN6 c0vn6LIZ2 = C0VN6.LIZ(c0vlf, "skylight_live");
                if (!c0vn62.equals(c0vn6LIZ2)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("skylight_live(com.ss.android.ugc.aweme.business.common.dc.SkylightLiveEntity).\n Expected:\n");
                    sbLIZ2.append(c0vn62);
                    sbLIZ2.append("\n Found:\n");
                    sbLIZ2.append(c0vn6LIZ2);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ2));
                }
                return new C0VN4(true, null);
            }
        }, "ca9a0a3a40224540761c73d56d563fbd", "23ae16829da2e437d52866f17b5b42ad");
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
