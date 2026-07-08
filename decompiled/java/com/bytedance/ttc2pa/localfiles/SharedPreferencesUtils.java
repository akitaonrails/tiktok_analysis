package com.bytedance.ttc2pa.localfiles;

import X.C2188811AlT;
import X.C810670Vr7;
import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttc2pa.utils.Logger;

/* JADX INFO: loaded from: classes35.dex */
public final class SharedPreferencesUtils {
    public static final SharedPreferencesUtils LIZ = new SharedPreferencesUtils();

    public static void LIZ(Context context, String str) {
        Logger logger = Logger.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("data changed, save to sp: ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        logger.getClass();
        try {
            SharedPreferences.Editor editorEdit = C810670Vr7.LIZJ(context, 0, "ttc2pa_main_process_config").edit();
            editorEdit.putString("ttc2pa_config", str);
            editorEdit.apply();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
