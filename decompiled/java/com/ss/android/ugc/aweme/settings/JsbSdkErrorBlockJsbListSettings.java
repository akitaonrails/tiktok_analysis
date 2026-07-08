package com.ss.android.ugc.aweme.settings;

import X.C09CT;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class JsbSdkErrorBlockJsbListSettings {
    public static final JsbSdkErrorBlockJsbListModel LIZ;

    public static final class JsbSdkErrorBlockJsbListModel {

        @C09CT("methods")
        public final ArrayList<String> methods;

        public JsbSdkErrorBlockJsbListModel() {
            this(new ArrayList());
        }

        public JsbSdkErrorBlockJsbListModel(ArrayList<String> arrayList) {
            this.methods = arrayList;
        }
    }

    static {
        JsbSdkErrorBlockJsbListModel jsbSdkErrorBlockJsbListModel = new JsbSdkErrorBlockJsbListModel(new ArrayList());
        jsbSdkErrorBlockJsbListModel.methods.add("x.getDebugInfo");
        jsbSdkErrorBlockJsbListModel.methods.add("x.getDeviceStatus");
        LIZ = jsbSdkErrorBlockJsbListModel;
    }
}
