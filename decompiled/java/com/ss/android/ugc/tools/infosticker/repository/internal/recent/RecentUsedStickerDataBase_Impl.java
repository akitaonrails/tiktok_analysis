package com.ss.android.ugc.tools.infosticker.repository.internal.recent;

import X.AbstractC796510VMj;
import X.C0VKN;
import X.C0VL9;
import X.C0VLF;
import X.C0VN2;
import X.C0VN3;
import X.C796520VMk;
import X.C796620VMu;
import X.InterfaceC1634800sdy;
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
public final class RecentUsedStickerDataBase_Impl extends RecentUsedStickerDataBase {
    public volatile C0VL9 LLILZ;

    @Override // com.ss.android.ugc.tools.infosticker.repository.internal.recent.RecentUsedStickerDataBase
    public final InterfaceC1634800sdy LIZ() {
        C0VL9 c0vl9;
        if (this.LLILZ != null) {
            return this.LLILZ;
        }
        synchronized (this) {
            try {
                if (this.LLILZ == null) {
                    this.LLILZ = new C0VL9(this);
                }
                c0vl9 = this.LLILZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c0vl9;
    }

    @Override // X.AbstractC796540VMm
    public final void clearAllTables() {
        super.assertNotMainThread();
        C0VLF c0vlfLJLJJI = this.mOpenHelper.LJLJJI();
        try {
            super.beginTransaction();
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `stickers`");
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
        return new C796620VMu(this, new HashMap(0), new HashMap(0), "stickers");
    }

    @Override // X.AbstractC796540VMm
    public final Set<Class<? extends InterfaceC2275591E5d>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // X.AbstractC796540VMm
    public final Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(InterfaceC1634800sdy.class, Collections.emptyList());
        return map;
    }

    @Override // X.AbstractC796540VMm
    public final InterfaceC796190VLd createOpenHelper(C796520VMk c796520VMk) {
        C0VN2 c0vn2 = new C0VN2(c796520VMk, new C0VN3() { // from class: X.0VL8
            @Override // X.C0VN3
            public final void onPostMigrate(C0VLF c0vlf) {
            }

            {
                super(3);
            }

            @Override // X.C0VN3
            public final void createAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `stickers` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `tableName` TEXT NOT NULL, `lastUsedTime` INTEGER NOT NULL, `resourceId` TEXT, `imageUrl` TEXT, `lokiIconUrl` TEXT, `isCustomStickerEntrance` INTEGER NOT NULL, `thirdPartyUrl` TEXT, `stickerId` TEXT, `customStickerEntranceExtra` TEXT, `customStickerEffectId` TEXT, `customStickerWidth` TEXT, `customStickerHeight` TEXT, `tags` TEXT NOT NULL, `imageLocalPath` TEXT NOT NULL)");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                c0vlf.LJIILJJIL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '96f4dce0a5d8a99386a6084c92bee73b')");
            }

            @Override // X.C0VN3
            public final void dropAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `stickers`");
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
                HashMap map = new HashMap(15);
                map.put(FollowStatusChangeMethod.PARAM_UID, new C795990VKj(1, 1, FollowStatusChangeMethod.PARAM_UID, "INTEGER", null, true));
                map.put("tableName", new C795990VKj(0, 1, "tableName", "TEXT", null, true));
                map.put("lastUsedTime", new C795990VKj(0, 1, "lastUsedTime", "INTEGER", null, true));
                map.put("resourceId", new C795990VKj(0, 1, "resourceId", "TEXT", null, false));
                map.put("imageUrl", new C795990VKj(0, 1, "imageUrl", "TEXT", null, false));
                map.put("lokiIconUrl", new C795990VKj(0, 1, "lokiIconUrl", "TEXT", null, false));
                map.put("isCustomStickerEntrance", new C795990VKj(0, 1, "isCustomStickerEntrance", "INTEGER", null, true));
                map.put("thirdPartyUrl", new C795990VKj(0, 1, "thirdPartyUrl", "TEXT", null, false));
                map.put("stickerId", new C795990VKj(0, 1, "stickerId", "TEXT", null, false));
                map.put("customStickerEntranceExtra", new C795990VKj(0, 1, "customStickerEntranceExtra", "TEXT", null, false));
                map.put("customStickerEffectId", new C795990VKj(0, 1, "customStickerEffectId", "TEXT", null, false));
                map.put("customStickerWidth", new C795990VKj(0, 1, "customStickerWidth", "TEXT", null, false));
                map.put("customStickerHeight", new C795990VKj(0, 1, "customStickerHeight", "TEXT", null, false));
                map.put("tags", new C795990VKj(0, 1, "tags", "TEXT", null, true));
                map.put("imageLocalPath", new C795990VKj(0, 1, "imageLocalPath", "TEXT", null, true));
                C0VN6 c0vn6 = new C0VN6("stickers", map, new HashSet(0), new HashSet(0));
                C0VN6 c0vn6LIZ = C0VN6.LIZ(c0vlf, "stickers");
                if (!c0vn6.equals(c0vn6LIZ)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("stickers(com.ss.android.ugc.tools.infosticker.repository.internal.recent.RecentUsedSticker).\n Expected:\n");
                    sbLIZ.append(c0vn6);
                    sbLIZ.append("\n Found:\n");
                    sbLIZ.append(c0vn6LIZ);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ));
                }
                return new C0VN4(true, null);
            }
        }, "96f4dce0a5d8a99386a6084c92bee73b", "df3404c407853233c72c07b33275e30e");
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
