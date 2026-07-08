package com.ss.android.ugc.trill.share.data;

import X.AbstractC796510VMj;
import X.AbstractC796540VMm;
import X.C0OGG;
import X.C786410Ut5;
import X.C796350VLt;
import X.C796360VLu;
import X.C796500VMi;
import X.InterfaceC351940Dqy;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes14.dex */
public abstract class ShareDatabase extends AbstractC796540VMm {
    public static volatile ShareDatabase LL;
    public static final C796350VLt LLILLJJLI = new AbstractC796510VMj() { // from class: X.0VLt
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `quick_share_data` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `mutual_follow_status` INTEGER NOT NULL, `friends_list` TEXT, `timestamp` INTEGER NOT NULL)");
            c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `quick_share_history` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `hashed_phone_number` TEXT NOT NULL, `created_time` INTEGER)");
            c0vlf.LJIILJJIL("CREATE UNIQUE INDEX `index_quick_share_history_hashed_phone_number` ON `quick_share_history` (`hashed_phone_number`)");
            c0vlf.LJIILJJIL("CREATE TRIGGER delete_oldest_record AFTER INSERT ON quick_share_history BEGIN DELETE FROM quick_share_history WHERE id NOT IN (SELECT id FROM quick_share_history ORDER BY created_time DESC LIMIT 10); END");
        }
    };
    public static final C796360VLu LLILLL = new AbstractC796510VMj() { // from class: X.0VLu
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `quick_share_data`");
            c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `quick_share_history`");
        }
    };

    public abstract InterfaceC351940Dqy LIZIZ();

    public static ShareDatabase LIZ(Context context) {
        if (LL == null) {
            synchronized (ShareDatabase.class) {
                try {
                    try {
                        if (LL == null) {
                            C796500VMi c796500VMiLIZ = C0OGG.LIZ(C786410Ut5.N3(context), ShareDatabase.class, "share.db");
                            c796500VMiLIZ.LIZ(LLILLJJLI, LLILLL);
                            c796500VMiLIZ.LJII = true;
                            LL = (ShareDatabase) c796500VMiLIZ.LIZIZ();
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
        return LL;
    }
}
