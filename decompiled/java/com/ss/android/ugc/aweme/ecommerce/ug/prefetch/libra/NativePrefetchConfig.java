package com.ss.android.ugc.aweme.ecommerce.ug.prefetch.libra;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class NativePrefetchConfig {
    public static final NativePrefetchConfigModel LIZ = new NativePrefetchConfigModel(new ArrayList(), null, Boolean.FALSE);

    public static final class NativePrefetchConfigModel {

        @C09CT("config")
        public List<String> channelList;

        @C09CT("enable_without_params_check")
        public Boolean enableWithoutParamsCheck;

        @C09CT("timeout")
        public Long networkTimeout;

        public NativePrefetchConfigModel() {
            this(new ArrayList(), null, Boolean.FALSE);
        }

        public NativePrefetchConfigModel(List<String> list, Long l, Boolean bool) {
            this.channelList = list;
            this.networkTimeout = l;
            this.enableWithoutParamsCheck = bool;
        }
    }
}
