package com.ss.android.ugc.aweme.aigc.asynctask;

import X.AbstractC796510VMj;
import X.AbstractC796540VMm;
import X.C01GW;
import X.C0LX1;
import X.C1E5M;
import X.C1E5N;
import X.C1E5O;
import X.C1E5P;
import X.C1E5Q;
import X.C1E5R;
import X.C1E5S;
import X.C1E5T;
import X.C452501pT;
import android.database.SQLException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: loaded from: classes36.dex */
public abstract class CreationAsyncTaskDatabase extends AbstractC796540VMm {
    public static final C1E5N LL = new AbstractC796510VMj() { // from class: X.1E5N
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            try {
                c0vlf.LJIILJJIL("ALTER TABLE creation_async_task ADD COLUMN 'prompt' TEXT NOT NULL DEFAULT ''");
            } catch (SQLException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("MIGRATION_2_3 error, e=");
                sbLIZ.append(e);
                C09JK.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    };
    public static final C1E5O LLILLJJLI = new AbstractC796510VMj() { // from class: X.1E5O
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            try {
                c0vlf.LJIILJJIL("ALTER TABLE creation_async_task ADD COLUMN 'parent_task_id' TEXT NOT NULL DEFAULT ''");
            } catch (SQLException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("MIGRATION_2_3 error, e=");
                sbLIZ.append(e);
                C09JK.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    };
    public static final C1E5M LLILLL = new AbstractC796510VMj() { // from class: X.1E5M
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            try {
                c0vlf.LJIILJJIL("ALTER TABLE creation_async_task ADD COLUMN 'log_extra' TEXT NOT NULL DEFAULT ''");
            } catch (SQLException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("MIGRATION_3_4 error, e=");
                sbLIZ.append(e);
                C09JK.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    };
    public static final C1E5P LLILZ = new AbstractC796510VMj() { // from class: X.1E5P
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            try {
                c0vlf.LJIILJJIL("ALTER TABLE creation_async_task ADD COLUMN 'ai_creation_id' TEXT NOT NULL DEFAULT ''");
            } catch (SQLException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("MIGRATION_4_5 error, e=");
                sbLIZ.append(e);
                C09JK.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    };
    public static final C1E5Q LLILZIL = new AbstractC796510VMj() { // from class: X.1E5Q
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            try {
                c0vlf.LJIILJJIL("ALTER TABLE creation_async_task ADD COLUMN 'fail_reason_msg' TEXT NOT NULL DEFAULT ''");
            } catch (SQLException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("MIGRATION_5_6 error, e=");
                sbLIZ.append(e);
                C09JK.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    };
    public static final C1E5R LLILZLL = new AbstractC796510VMj() { // from class: X.1E5R
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            try {
                c0vlf.LJIILJJIL("ALTER TABLE creation_async_task ADD COLUMN 'remain_time_stage' INTEGER NOT NULL DEFAULT 0");
            } catch (SQLException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("MIGRATION_6_7 error, e=");
                sbLIZ.append(e);
                C09JK.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    };
    public static final C1E5S LLIZ = new AbstractC796510VMj() { // from class: X.1E5S
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            try {
                c0vlf.LJIILJJIL("ALTER TABLE creation_async_task ADD COLUMN 'input_cache' TEXT NOT NULL DEFAULT ''");
            } catch (SQLException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("MIGRATION_7_8 error, e=");
                sbLIZ.append(e);
                C09JK.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    };
    public static final C1E5T LLIZLLLIL = new AbstractC796510VMj() { // from class: X.1E5T
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            try {
                c0vlf.LJIILJJIL("ALTER TABLE creation_async_task ADD COLUMN 'quota_result' TEXT NOT NULL DEFAULT ''");
            } catch (SQLException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("MIGRATION_8_9 error, e=");
                sbLIZ.append(e);
                C09JK.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    };
    public static final C01GW<CreationAsyncTaskDatabase> LLJ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(124));

    public abstract C0LX1 LIZ();
}
