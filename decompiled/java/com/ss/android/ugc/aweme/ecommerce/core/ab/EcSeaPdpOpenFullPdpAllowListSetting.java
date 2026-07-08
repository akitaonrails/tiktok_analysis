package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C01GW;
import X.C09CT;
import X.C13BV;
import X.C452501pT;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes3.dex */
public final class EcSeaPdpOpenFullPdpAllowListSetting {
    public static final EcSeaPdpOpenFullPdpAllowListModel LIZ = new EcSeaPdpOpenFullPdpAllowListModel(null, 1, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(227));

    public static final class EcSeaPdpOpenFullPdpAllowListModel {

        @C09CT("bPart_allow_list")
        public final List<String> allowList;

        public EcSeaPdpOpenFullPdpAllowListModel() {
            this(null, 1, null);
        }

        public EcSeaPdpOpenFullPdpAllowListModel(List<String> list) {
            this.allowList = list;
        }

        public EcSeaPdpOpenFullPdpAllowListModel(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C13BV.INSTANCE : list);
        }
    }

    public static boolean LIZ(String str) {
        List list = ((EcSeaPdpOpenFullPdpAllowListModel) LIZIZ.getValue()).allowList;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        if (str == null || a0.LJJJIL(str) || Intrinsics.LJFF(list, Collections.singletonList(""))) {
            return false;
        }
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next(), str)) {
                return true;
            }
        }
        return false;
    }
}
