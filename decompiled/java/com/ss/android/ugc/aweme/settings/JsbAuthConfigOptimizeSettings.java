package com.ss.android.ugc.aweme.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class JsbAuthConfigOptimizeSettings {
    public static final JsbAuthConfigOptimizeModel LIZ = new JsbAuthConfigOptimizeModel(false);

    public static final class JsbAuthConfigOptimizeModel {

        @C09CT("enable")
        public final boolean enable;

        public JsbAuthConfigOptimizeModel() {
            this(false);
        }

        public JsbAuthConfigOptimizeModel(boolean z) {
            this.enable = z;
        }
    }
}
