package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes19.dex */
public final class EcSeaPdpAllowShowInternalWindowListSettings {
    public static final EcSeaPdpAllowShowInternalWindowListModel LIZ = new EcSeaPdpAllowShowInternalWindowListModel(null, 1, null);

    public static final class EcSeaPdpAllowShowInternalWindowListModel {

        @C09CT("allow_list")
        public final List<String> allowList;

        public EcSeaPdpAllowShowInternalWindowListModel() {
            this(null, 1, null);
        }

        public EcSeaPdpAllowShowInternalWindowListModel(List<String> list) {
            this.allowList = list;
        }

        public EcSeaPdpAllowShowInternalWindowListModel(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Collections.singletonList("") : list);
        }
    }
}
