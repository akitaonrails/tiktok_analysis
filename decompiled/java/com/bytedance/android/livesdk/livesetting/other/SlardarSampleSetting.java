package com.bytedance.android.livesdk.livesetting.other;

import X.C1161920gLG;
import X.C2188811AlT;
import android.text.TextUtils;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.model.SlardarSample;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.text.u;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_slardar_log_sample_report")
public final class SlardarSampleSetting {
    public static boolean isHasSetOffline;
    public static boolean isOffline;
    public static final SlardarSampleSetting INSTANCE = new SlardarSampleSetting();
    public static double randomSampleVale = -1.0d;
    public static final SlardarSample DEFAULT = new SlardarSample();
    public static final int $stable = 8;

    private final boolean getOffline() {
        if (!isHasSetOffline) {
            isOffline = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline();
            isHasSetOffline = true;
        }
        return isOffline;
    }

    private final SlardarSample getSampleData() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        SlardarSample slardarSample = DEFAULT;
        SlardarSample slardarSample2 = (SlardarSample) settingsManager.getValueSafely("live_slardar_log_sample_report", slardarSample);
        return slardarSample2 != null ? slardarSample2 : slardarSample;
    }

    private final boolean isExperiment() {
        return getSampleData().isExperiment;
    }

    public final boolean isReport(String str, double d) {
        if (!TextUtils.isEmpty(str) && isExperiment() && !isOffline) {
            Double d2 = getSampleData().sampleList.get(str);
            if (d2 != null) {
                d = d2.doubleValue();
            }
            if (d > 0.0d) {
                if (randomSampleVale < 0.0d) {
                    randomSampleVale = ThreadLocalRandom.current().nextDouble();
                }
                if (randomSampleVale >= d) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public final boolean isSampleReportSlardar(String str, double d) {
        if (TextUtils.isEmpty(str) || !isExperiment() || getOffline()) {
            return true;
        }
        if (str == null || !u.LJJIIJZLJL(str, "ttlive_", false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ttlive_");
            sbLIZ.append(str);
            str = C2188811AlT.LIZIZ(sbLIZ);
        }
        return isReport(str, d);
    }
}
