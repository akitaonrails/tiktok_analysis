package com.ss.android.ugc.feed.platform.popupclean.tool;

import X.C01GW;
import X.C09CT;
import X.C20657915sX;
import X.C452501pT;

/* JADX INFO: loaded from: classes32.dex */
public final class PopupMonitorSetting {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C20657915sX());

    public static final class PopupMonitorData {

        @C09CT("enablePopupMonitor")
        public final boolean enable;

        @C09CT("popupShowFrequencyLimitCount")
        public final int popupFrequencyLimit;

        @C09CT("popupShowFrequencySpecifiedTime")
        public final int popupFrequencySpecifiedTime;

        @C09CT("popupShowTimeOut")
        public final int timeOut;

        public PopupMonitorData(boolean z, int i, int i2, int i3) {
            this.enable = z;
            this.popupFrequencyLimit = i;
            this.popupFrequencySpecifiedTime = i2;
            this.timeOut = i3;
        }
    }
}
