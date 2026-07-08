package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C01GW;
import X.C09CT;
import X.C13BV;
import X.C452501pT;
import java.util.List;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class EcSeaPdpVideoShrinkAllowListExperiment {
    public static final EcSeaPdpVideoShrinkAllowListModel LIZ = new EcSeaPdpVideoShrinkAllowListModel(null, 1, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(228));

    public static final class EcSeaPdpVideoShrinkAllowListModel {

        @C09CT("bPart_allow_list")
        public final List<String> allowList;

        public EcSeaPdpVideoShrinkAllowListModel() {
            this(null, 1, null);
        }

        public EcSeaPdpVideoShrinkAllowListModel(List<String> list) {
            this.allowList = list;
        }

        public EcSeaPdpVideoShrinkAllowListModel(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C13BV.INSTANCE : list);
        }
    }
}
