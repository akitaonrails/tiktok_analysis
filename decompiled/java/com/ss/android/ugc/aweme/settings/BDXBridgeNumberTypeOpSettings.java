package com.ss.android.ugc.aweme.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class BDXBridgeNumberTypeOpSettings {
    public static final BDXBridgeNumberTypeOpModel LIZ = new BDXBridgeNumberTypeOpModel(false, false);

    public static final class BDXBridgeNumberTypeOpModel {

        @C09CT("BDXBridgeDisableLongToDouble")
        public final boolean BDXBridgeDisableLongToDouble;

        @C09CT("BDXBridgeNewInputNumberTypeChange")
        public final boolean BDXBridgeNewInputNumberTypeChange;

        public BDXBridgeNumberTypeOpModel() {
            this(false, false);
        }

        public BDXBridgeNumberTypeOpModel(boolean z, boolean z2) {
            this.BDXBridgeDisableLongToDouble = z;
            this.BDXBridgeNewInputNumberTypeChange = z2;
        }
    }
}
