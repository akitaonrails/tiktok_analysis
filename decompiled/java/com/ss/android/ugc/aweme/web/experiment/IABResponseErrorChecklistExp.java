package com.ss.android.ugc.aweme.web.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import java.util.List;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class IABResponseErrorChecklistExp {
    public static final IABResponseErrorChecklist LIZ = new IABResponseErrorChecklist(null, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(298));

    public static final class IABResponseErrorChecklist {

        @C09CT("check_list")
        public final List<String> checkList;

        @C09CT("msg_check_list")
        public final List<String> msgCheckList;

        public IABResponseErrorChecklist() {
            this(null, null);
        }

        public IABResponseErrorChecklist(List<String> list, List<String> list2) {
            this.checkList = list;
            this.msgCheckList = list2;
        }
    }
}
