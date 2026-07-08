package com.ss.android.ugc.aweme.hybridkit.task;

import X.C09CT;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes24.dex */
public final class JsbOfflineConfigSettings {
    public static final JsbOfflineConfigModel LIZ = new JsbOfflineConfigModel(new ArrayList(), new ArrayList());

    public static final class JsbOfflineConfigModel {

        @C09CT("offlineList")
        public final ArrayList<String> offlineList;

        @C09CT("reportList")
        public final ArrayList<String> reportList;

        public JsbOfflineConfigModel() {
            this(new ArrayList(), new ArrayList());
        }

        public JsbOfflineConfigModel(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
            this.offlineList = arrayList;
            this.reportList = arrayList2;
        }
    }
}
