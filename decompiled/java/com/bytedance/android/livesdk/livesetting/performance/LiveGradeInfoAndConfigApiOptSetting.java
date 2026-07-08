package com.bytedance.android.livesdk.livesetting.performance;

import X.C098200Yq;
import X.C189200o6;
import X.InterfaceC1093700eZE;
import X.InterfaceC1093910eZZ;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_grade_info_and_config_api_opt_config")
public final class LiveGradeInfoAndConfigApiOptSetting {
    public static final LiveGradeInfoAndConfigApiOptSetting INSTANCE = new LiveGradeInfoAndConfigApiOptSetting();
    public static final GradeInfoApiConfig DEFAULT = new GradeInfoApiConfig(86400, 86400, false, false, false);

    public final GradeInfoApiConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        GradeInfoApiConfig gradeInfoApiConfig = DEFAULT;
        GradeInfoApiConfig gradeInfoApiConfig2 = (GradeInfoApiConfig) settingsManager.getValueSafely("live_grade_info_and_config_api_opt_config", gradeInfoApiConfig);
        return gradeInfoApiConfig2 != null ? gradeInfoApiConfig2 : gradeInfoApiConfig;
    }

    public final boolean reachTimeLimitForFansClubApi() {
        Object c098200Yq;
        try {
            String strLIZ = InterfaceC1093910eZZ.LLLLZLLLI.LIZ();
            c098200Yq = strLIZ != null ? Long.valueOf(CastLongProtector.parseLong(strLIZ)) : null;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = 0L;
        }
        Long l = (Long) c098200Yq;
        return (System.currentTimeMillis() - (l != null ? l.longValue() : 0L)) / 1000 > getConfig().fansClubApiInterval;
    }

    public final boolean reachTimeLimitForGradeEnterRoomApi() {
        Object c098200Yq;
        try {
            String strLIZ = InterfaceC1093700eZE.Rf.LIZ();
            c098200Yq = strLIZ != null ? Long.valueOf(CastLongProtector.parseLong(strLIZ)) : null;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = 0L;
        }
        Long l = (Long) c098200Yq;
        return (System.currentTimeMillis() - (l != null ? l.longValue() : 0L)) / 1000 > getConfig().userLevelApiInterval;
    }

    public final boolean willSleep() {
        Object c098200Yq;
        try {
            String strLIZ = InterfaceC1093700eZE.Pf.LIZ();
            c098200Yq = strLIZ != null ? Long.valueOf(CastLongProtector.parseLong(strLIZ)) : null;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = 0L;
        }
        Long l = (Long) c098200Yq;
        return System.currentTimeMillis() > (l != null ? l.longValue() : 0L);
    }

    public final GradeInfoApiConfig getDEFAULT() {
        return DEFAULT;
    }
}
