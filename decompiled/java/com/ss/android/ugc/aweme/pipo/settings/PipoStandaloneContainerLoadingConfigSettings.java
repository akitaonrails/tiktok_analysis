package com.ss.android.ugc.aweme.pipo.settings;

import X.C01GW;
import X.C09CT;
import X.C1948507kB;
import X.C452501pT;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoStandaloneContainerLoadingConfigSettings {
    public static final PipoStandaloneContainerLoadingConfigModel LIZ = new PipoStandaloneContainerLoadingConfigModel(null, null, null, 7, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(241));

    public static final class TimeoutModel {

        @C09CT("enable")
        public final Boolean enable;

        @C09CT("time")
        public final Long time;

        public TimeoutModel() {
            this(Boolean.TRUE, 15000L);
        }

        public TimeoutModel(Boolean bool, Long l) {
            this.enable = bool;
            this.time = l;
        }
    }

    public static boolean LIZ(String str) {
        List<String> list;
        if (!C1948507kB.LIZ(str) || (list = ((PipoStandaloneContainerLoadingConfigModel) LIZIZ.getValue()).urls) == null || !list.contains(str)) {
            return false;
        }
        return true;
    }

    public static final class PipoStandaloneContainerLoadingConfigModel {

        @C09CT("enable_loading")
        public final Boolean enableLoading;

        @C09CT("time_out")
        public final TimeoutModel timeoutModel;

        @C09CT("urls")
        public final List<String> urls;

        public PipoStandaloneContainerLoadingConfigModel() {
            this(null, null, null, 7, null);
        }

        public PipoStandaloneContainerLoadingConfigModel(Boolean bool, List<String> list, TimeoutModel timeoutModel) {
            this.enableLoading = bool;
            this.urls = list;
            this.timeoutModel = timeoutModel;
        }

        public PipoStandaloneContainerLoadingConfigModel(Boolean bool, List list, TimeoutModel timeoutModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? Collections.singletonList("") : list, (i & 4) != 0 ? new TimeoutModel(Boolean.TRUE, 15000L) : timeoutModel);
        }
    }
}
