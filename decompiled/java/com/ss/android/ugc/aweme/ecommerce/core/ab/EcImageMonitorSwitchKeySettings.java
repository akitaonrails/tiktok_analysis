package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes3.dex */
public final class EcImageMonitorSwitchKeySettings {
    public static final EcImageMonitorSwitchKeyModel LIZ;

    static {
        new EcImageMonitorSwitchKeySettings();
        LIZ = new EcImageMonitorSwitchKeyModel(Boolean.FALSE);
    }

    public static final class EcImageMonitorSwitchKeyModel {

        @C09CT("isOpen")
        public final Boolean isOpen;

        public EcImageMonitorSwitchKeyModel(Boolean bool) {
            this.isOpen = bool;
        }
    }
}
