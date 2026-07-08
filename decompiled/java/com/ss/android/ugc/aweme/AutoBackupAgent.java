package com.ss.android.ugc.aweme;

import X.C01GW;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C452501pT;
import X.C817700W5w;
import android.app.backup.BackupAgentHelper;
import android.app.backup.FullBackupDataOutput;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class AutoBackupAgent extends BackupAgentHelper {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(62));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(63));

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextWrapper: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            context = new C817700W5w(context, false);
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.backup.BackupAgent
    public final void onFullBackup(FullBackupDataOutput fullBackupDataOutput) {
        int i;
        try {
            super.onFullBackup(fullBackupDataOutput);
            if (!((SharedPreferences) this.LIZ.getValue()).getAll().isEmpty()) {
                i = 1;
            } else {
                i = 0;
            }
            int i2 = ((SharedPreferences) this.LIZIZ.getValue()).getInt("backup_count_key", 0) + 1;
            ((SharedPreferences) this.LIZIZ.getValue()).edit().putInt("backup_count_key", i2).apply();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(i, "did_backup_data");
            c2344009Gk.LIZJ(i2, "backup_count");
            C20684815ws.LJIILLIIL("full_backup", c2344009Gk.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
