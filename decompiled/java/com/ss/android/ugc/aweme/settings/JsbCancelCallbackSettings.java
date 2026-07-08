package com.ss.android.ugc.aweme.settings;

import X.C09CT;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes24.dex */
public final class JsbCancelCallbackSettings {
    public static final JsbCancelCallbackModel LIZ = new JsbCancelCallbackModel(false, new ArrayList());

    public static final class JsbCancelCallbackModel {

        @C09CT("enable")
        public boolean enable;

        @C09CT("urlList")
        public final ArrayList<String> urlList;

        public JsbCancelCallbackModel() {
            this(false, new ArrayList());
        }

        public JsbCancelCallbackModel(boolean z, ArrayList<String> arrayList) {
            this.enable = z;
            this.urlList = arrayList;
        }
    }
}
