package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class PdpSplitConfig {
    public static final PdpSplitConfigModel LIZ = new PdpSplitConfigModel(Boolean.FALSE, null);

    public static final class PdpSplitConfigModel {

        @C09CT("biz")
        public final String biz;

        @C09CT("useV2Tempalte")
        public final Boolean useV2Tempalte;

        public PdpSplitConfigModel() {
            this(Boolean.FALSE, null);
        }

        public PdpSplitConfigModel(Boolean bool, String str) {
            this.useV2Tempalte = bool;
            this.biz = str;
        }
    }
}
