package com.ss.android.ugc.aweme.hybridkit.experiment;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class JsbNonIdlInterceptorAllowlistSettings {
    public static final JsbNonIdlInterceptorAllowlistModel LIZ = new JsbNonIdlInterceptorAllowlistModel(false, new ArrayList());

    public static final class JsbNonIdlInterceptorAllowlistModel {

        @C09CT("allowList")
        public final List<String> allowList;

        @C09CT("enable")
        public final boolean enable;

        public JsbNonIdlInterceptorAllowlistModel() {
            this(false, new ArrayList());
        }

        public JsbNonIdlInterceptorAllowlistModel(boolean z, List<String> list) {
            this.enable = z;
            this.allowList = list;
        }
    }
}
