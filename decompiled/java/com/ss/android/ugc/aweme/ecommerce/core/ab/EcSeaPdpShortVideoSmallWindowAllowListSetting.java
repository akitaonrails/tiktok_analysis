package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C01GW;
import X.C09CT;
import X.C13BV;
import X.C452501pT;
import java.util.List;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class EcSeaPdpShortVideoSmallWindowAllowListSetting {
    public static final EcSeaPdpShortVideoSmallWindowAllowListModel LIZ = new EcSeaPdpShortVideoSmallWindowAllowListModel(null, 1, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(131));

    public static final class EcSeaPdpShortVideoSmallWindowAllowListModel {

        @C09CT("bPart_allow_list")
        public final List<String> allowList;

        public EcSeaPdpShortVideoSmallWindowAllowListModel() {
            this(null, 1, null);
        }

        public EcSeaPdpShortVideoSmallWindowAllowListModel(List<String> list) {
            this.allowList = list;
        }

        public EcSeaPdpShortVideoSmallWindowAllowListModel(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C13BV.INSTANCE : list);
        }
    }
}
