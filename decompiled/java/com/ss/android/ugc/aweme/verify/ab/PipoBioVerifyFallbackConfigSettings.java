package com.ss.android.ugc.aweme.verify.ab;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoBioVerifyFallbackConfigSettings {
    public static final PipoBioVerifyFallbackConfigModel LIZ = new PipoBioVerifyFallbackConfigModel(null, 1, null);

    public static final class PipoBioVerifyFallbackConfigModel {

        @C09CT("server_fallback_reasons")
        public final List<String> reasonList;

        public PipoBioVerifyFallbackConfigModel() {
            this(null, 1, null);
        }

        public PipoBioVerifyFallbackConfigModel(List<String> list) {
            this.reasonList = list;
        }

        public PipoBioVerifyFallbackConfigModel(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C13BV.INSTANCE : list);
        }
    }
}
