package com.bytedance.android.livesdk.livesetting.performance;

import X.C01GW;
import X.C13BV;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import java.util.List;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_thread_opt")
public final class LiveThreadOptSetting {
    public static final LiveThreadOptSetting INSTANCE = new LiveThreadOptSetting();
    public static final ThreadOptConfig DEFAULT = new ThreadOptConfig();
    public static final C01GW config$delegate = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(52));
    public static final C01GW value$delegate = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(53));

    private final int getValue() {
        return ((Number) value$delegate.getValue()).intValue();
    }

    public final ThreadOptConfig getConfig() {
        return (ThreadOptConfig) config$delegate.getValue();
    }

    public final boolean enableJitOpt() {
        return (getValue() & 4) == 4;
    }

    public final boolean enablePriorityOpt() {
        return (getValue() & 1) == 1;
    }

    public final boolean enableUniHandlerThr() {
        return (getValue() & 2) == 2;
    }

    public final long getDelayTimeMs() {
        ThreadOptConfig config = getConfig();
        if (config != null) {
            return config.delayTimeMs;
        }
        return 1000L;
    }

    public final int getSlowDownOps() {
        ThreadOptConfig config = getConfig();
        if (config != null) {
            return config.slowDownOps;
        }
        return 3;
    }

    public final int getSlowDownPriority() {
        ThreadOptConfig config = getConfig();
        if (config != null) {
            return config.slowDownPriority;
        }
        return 12;
    }

    public final List<String> getTargetThreadNamePrefix() {
        List<String> list;
        ThreadOptConfig config = getConfig();
        return (config == null || (list = config.targetThreadNamePrefix) == null) ? C13BV.INSTANCE : list;
    }
}
