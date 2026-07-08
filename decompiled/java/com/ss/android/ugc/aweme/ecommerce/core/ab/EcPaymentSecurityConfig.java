package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C01GW;
import X.C098200Yq;
import X.C09CT;
import X.C189200o6;
import X.C452501pT;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes2.dex */
public final class EcPaymentSecurityConfig {
    public static final SecurityConfigModel LIZ = new SecurityConfigModel(null, null, 3, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(130));

    public static boolean LIZ(String str) {
        List<String> list;
        Object c098200Yq;
        List<String> list2;
        C01GW c01gw = LIZIZ;
        if (Intrinsics.LJFF(((SecurityConfigModel) c01gw.getValue()).enable, Boolean.TRUE) && (list = ((SecurityConfigModel) c01gw.getValue()).apiList) != null && !list.isEmpty()) {
            try {
                c098200Yq = UriProtector.parse(str).getPath();
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            String str2 = (String) c098200Yq;
            if (str2 != null && str2.length() != 0 && (list2 = ((SecurityConfigModel) LIZIZ.getValue()).apiList) != null && !list2.isEmpty()) {
                Iterator<String> it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (u.LJIIZILJ(str2, it2.next(), false)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final class SecurityConfigModel {

        @C09CT("api_list")
        public final List<String> apiList;

        @C09CT("enable")
        public final Boolean enable;

        public SecurityConfigModel() {
            this(null, null, 3, null);
        }

        public SecurityConfigModel(Boolean bool, List<String> list) {
            this.enable = bool;
            this.apiList = list;
        }

        public SecurityConfigModel(Boolean bool, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? Collections.singletonList("") : list);
        }
    }
}
