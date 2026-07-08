package com.ss.android.ugc.aweme.hybridkit.experiment;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes24.dex */
public final class SparkJsinjectionInlineConfigSettings {
    public static final SparkJsinjectionInlineConfigModel LIZ = new SparkJsinjectionInlineConfigModel(Boolean.FALSE);

    public static final SparkJsinjectionInlineConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        SparkJsinjectionInlineConfigModel sparkJsinjectionInlineConfigModel = LIZ;
        SparkJsinjectionInlineConfigModel sparkJsinjectionInlineConfigModel2 = (SparkJsinjectionInlineConfigModel) settingsManagerLIZLLL.LJIIIIZZ("spark_jsinjection_inline_config", SparkJsinjectionInlineConfigModel.class, sparkJsinjectionInlineConfigModel);
        return sparkJsinjectionInlineConfigModel2 != null ? sparkJsinjectionInlineConfigModel2 : sparkJsinjectionInlineConfigModel;
    }

    public static final class SparkJsinjectionInlineConfigModel {

        @C09CT("enable")
        public final Boolean enable;

        public SparkJsinjectionInlineConfigModel(Boolean bool) {
            this.enable = bool;
        }
    }
}
