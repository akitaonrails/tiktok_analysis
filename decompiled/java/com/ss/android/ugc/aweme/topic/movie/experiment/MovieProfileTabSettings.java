package com.ss.android.ugc.aweme.topic.movie.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class MovieProfileTabSettings {
    public static final ConfigModel LIZ = new ConfigModel();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2121));

    public static final class ConfigModel {

        @C09CT("enable_update_total_count_when_load_total")
        public Boolean enableUpdateTotalCountWhenLoadTotal = Boolean.TRUE;

        public final Boolean getEnableUpdateTotalCountWhenLoadTotal() {
            return this.enableUpdateTotalCountWhenLoadTotal;
        }

        public final void setEnableUpdateTotalCountWhenLoadTotal(Boolean bool) {
            this.enableUpdateTotalCountWhenLoadTotal = bool;
        }
    }
}
