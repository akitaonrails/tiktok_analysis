package defpackage;

import com.bytedance.ies.abmock.SettingsManager;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes5.dex */
public final class n0 {
    public static final boolean LIZ;
    public static final int LIZIZ;

    static {
        ApplogFlushOnAccountSwitchModel applogFlushOnAccountSwitchModel = new ApplogFlushOnAccountSwitchModel(true, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        ApplogFlushOnAccountSwitchModel applogFlushOnAccountSwitchModel2 = (ApplogFlushOnAccountSwitchModel) SettingsManager.LIZLLL().LJIIIIZZ("applog_flush_on_account_switch", ApplogFlushOnAccountSwitchModel.class, applogFlushOnAccountSwitchModel);
        if (applogFlushOnAccountSwitchModel2 == null) {
            applogFlushOnAccountSwitchModel2 = applogFlushOnAccountSwitchModel;
        }
        LIZ = applogFlushOnAccountSwitchModel2.shouldFlush;
        ApplogFlushOnAccountSwitchModel applogFlushOnAccountSwitchModel3 = (ApplogFlushOnAccountSwitchModel) SettingsManager.LIZLLL().LJIIIIZZ("applog_flush_on_account_switch", ApplogFlushOnAccountSwitchModel.class, applogFlushOnAccountSwitchModel);
        if (applogFlushOnAccountSwitchModel3 != null) {
            applogFlushOnAccountSwitchModel = applogFlushOnAccountSwitchModel3;
        }
        LIZIZ = applogFlushOnAccountSwitchModel.wait;
    }
}
