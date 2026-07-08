package com.ss.android.ugc.aweme.services.interceptor;

import X.C1697810uHb;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes36.dex */
public final class PassportApiErrorReportingAllowlistSettings {
    public static final PassportApiErrorReportingAllowlistSettings INSTANCE = new PassportApiErrorReportingAllowlistSettings();
    public static final PassportApiErrorReportingAllowlistModel DEFAULT_GROUP = new PassportApiErrorReportingAllowlistModel(C1697810uHb.LJIIJJI("-3005", "-1005", "1", "4", "6", "7", "10", "1009", "1011", "1033", "1091", "1202", "1203", "1349", "1364", "1450", "1466", "2035", "56004"));
    public static final int $stable = 8;

    public static final PassportApiErrorReportingAllowlistModel getValue() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PassportApiErrorReportingAllowlistModel passportApiErrorReportingAllowlistModel = DEFAULT_GROUP;
        PassportApiErrorReportingAllowlistModel passportApiErrorReportingAllowlistModel2 = (PassportApiErrorReportingAllowlistModel) settingsManagerLIZLLL.LJIIIIZZ("passport_api_error_reporting_allowlist", PassportApiErrorReportingAllowlistModel.class, passportApiErrorReportingAllowlistModel);
        return passportApiErrorReportingAllowlistModel2 != null ? passportApiErrorReportingAllowlistModel2 : passportApiErrorReportingAllowlistModel;
    }
}
