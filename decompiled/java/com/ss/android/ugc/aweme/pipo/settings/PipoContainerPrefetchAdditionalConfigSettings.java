package com.ss.android.ugc.aweme.pipo.settings;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoContainerPrefetchAdditionalConfigSettings {
    public static final PipoContainerPrefetchAdditionalConfigModel LIZ = new PipoContainerPrefetchAdditionalConfigModel(null);

    public static final class PipoContainerPrefetchAdditionalConfigModel {

        @C09CT("riskInfo")
        public final Map<String, Object> riskInfo;

        public PipoContainerPrefetchAdditionalConfigModel() {
            this(null);
        }

        public PipoContainerPrefetchAdditionalConfigModel(Map<String, ? extends Object> map) {
            this.riskInfo = map;
        }
    }
}
