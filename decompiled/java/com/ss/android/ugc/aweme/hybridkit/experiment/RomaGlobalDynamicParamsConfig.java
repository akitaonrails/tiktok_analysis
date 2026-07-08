package com.ss.android.ugc.aweme.hybridkit.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class RomaGlobalDynamicParamsConfig {
    public static final RomaGlobalDynamicParamsModel LIZ = new RomaGlobalDynamicParamsModel(true);

    public static final class RomaGlobalDynamicParamsModel {

        @C09CT("enable_live")
        public final boolean enableLive;

        public RomaGlobalDynamicParamsModel() {
            this(true);
        }

        public RomaGlobalDynamicParamsModel(boolean z) {
            this.enableLive = z;
        }
    }
}
