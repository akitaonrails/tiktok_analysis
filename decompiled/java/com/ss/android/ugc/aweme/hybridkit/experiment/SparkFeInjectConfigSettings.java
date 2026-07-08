package com.ss.android.ugc.aweme.hybridkit.experiment;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes24.dex */
public final class SparkFeInjectConfigSettings {
    public static final SparkFeInjectConfigModel LIZ = new SparkFeInjectConfigModel(null);

    public static final SparkFeInjectConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        SparkFeInjectConfigModel sparkFeInjectConfigModel = LIZ;
        SparkFeInjectConfigModel sparkFeInjectConfigModel2 = (SparkFeInjectConfigModel) settingsManagerLIZLLL.LJIIIIZZ("spark_fe_inject_config", SparkFeInjectConfigModel.class, sparkFeInjectConfigModel);
        return sparkFeInjectConfigModel2 != null ? sparkFeInjectConfigModel2 : sparkFeInjectConfigModel;
    }

    public static final class SparkFeInjectConfigModel {

        @C09CT("enable")
        public final Boolean enable;

        public SparkFeInjectConfigModel(Boolean bool) {
            this.enable = bool;
        }
    }
}
