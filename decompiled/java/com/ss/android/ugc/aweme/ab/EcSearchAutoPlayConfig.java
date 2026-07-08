package com.ss.android.ugc.aweme.ab;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchAutoPlayConfig {
    public static final EcSearchAutoPlayConfigModel LIZ = new EcSearchAutoPlayConfigModel(5, Collections.singletonList(9));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(37));

    public static EcSearchAutoPlayConfigModel LIZ() {
        return (EcSearchAutoPlayConfigModel) LIZIZ.getValue();
    }

    public static final class EcSearchAutoPlayConfigModel {

        @C09CT("origin_type")
        public final List<Integer> originType;

        @C09CT("time_interval")
        public final Integer timeInterval;

        public EcSearchAutoPlayConfigModel(Integer num, List<Integer> list) {
            this.timeInterval = num;
            this.originType = list;
        }
    }
}
