package com.ss.android.ugc.aweme.hybridkit.experiment;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class JsbNoUrlConfigSettings {
    public static final JsbNoUrlConfigModel LIZ = new JsbNoUrlConfigModel(false, new ArrayList());

    public static final class JsbNoUrlConfigModel {

        @C09CT("bdxBridgeBridgeCanNoURLRuntimeNameSet")
        public final List<String> bdxBridgeBridgeCanNoURLRuntimeNameSet;

        @C09CT("bdxBridgeDisableBridgeCanNoURL")
        public final boolean bdxBridgeDisableBridgeCanNoURL;

        public JsbNoUrlConfigModel() {
            this(false, new ArrayList());
        }

        public JsbNoUrlConfigModel(boolean z, List<String> list) {
            this.bdxBridgeDisableBridgeCanNoURL = z;
            this.bdxBridgeBridgeCanNoURLRuntimeNameSet = list;
        }
    }
}
