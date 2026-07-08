package com.bytedance.android.livesdk.livesetting.performance;

import X.C1161920gLG;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_broadcast_livelog_opt")
public final class LiveBroadcastLiveLogOpt {
    public static final int DEFAULT = 0;
    public static Boolean isOffline;
    public static final LiveBroadcastLiveLogOpt INSTANCE = new LiveBroadcastLiveLogOpt();
    public static final double randomValue = ThreadLocalRandom.current().nextDouble();

    public final boolean canReport(double d) {
        Boolean boolValueOf = isOffline;
        if (boolValueOf == null) {
            IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
            if (iHostAppContext != null) {
                boolValueOf = Boolean.valueOf(iHostAppContext.isOffline());
            } else {
                boolValueOf = Boolean.FALSE;
            }
            isOffline = boolValueOf;
        }
        if (boolValueOf.booleanValue() || SettingsManager.INSTANCE.getIntValue("live_broadcast_livelog_opt", DEFAULT) == 0 || randomValue < d) {
            return true;
        }
        return false;
    }
}
