package com.ss.android.ugc.aweme.autofill.setting;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import java.util.List;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class OptAdAutofillInjectExp {
    public static final OptAdAutofillInjectConfig LIZ = new OptAdAutofillInjectConfig(null, false, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(111));

    public static final boolean LIZ(Long l) {
        List<Long> list;
        C01GW c01gw = LIZIZ;
        List<Long> list2 = ((OptAdAutofillInjectConfig) c01gw.getValue()).eaList;
        if (list2 == null || list2.isEmpty()) {
            return true;
        }
        if (l == null || (list = ((OptAdAutofillInjectConfig) c01gw.getValue()).eaList) == null || !list.contains(l)) {
            return false;
        }
        return true;
    }

    public static final class OptAdAutofillInjectConfig {

        @C09CT("all_page")
        public final boolean allPage;

        @C09CT("ea_list")
        public final List<Long> eaList;

        @C09CT("inject_time")
        public final String injectTime;

        public OptAdAutofillInjectConfig() {
            this(null, false, null);
        }

        public OptAdAutofillInjectConfig(List<Long> list, boolean z, String str) {
            this.eaList = list;
            this.allPage = z;
            this.injectTime = str;
        }
    }
}
