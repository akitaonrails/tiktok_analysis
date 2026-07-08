package com.ss.android.ugc.aweme.i18n.abtest;

import X.C09CT;
import X.C1543330qGR;
import X.C1544000qHW;
import X.C667430QFx;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes17.dex */
public final class JSBAIMigrationTCPSettings {
    public static final JSBAIMigrationModel LIZ = new JSBAIMigrationModel(true, true, true, true, true, true, true, true, true, true, true);

    public static final JSBAIMigrationModel LIZ() {
        JSBAIMigrationModel jSBAIMigrationModel;
        if (C667430QFx.LIZ()) {
            jSBAIMigrationModel = LIZ;
        } else {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            JSBAIMigrationModel jSBAIMigrationModel2 = LIZ;
            jSBAIMigrationModel = (JSBAIMigrationModel) settingsManagerLIZLLL.LJIIIIZZ("JSB_AI_Migration_TCP", JSBAIMigrationModel.class, jSBAIMigrationModel2);
            if (jSBAIMigrationModel == null) {
                jSBAIMigrationModel = jSBAIMigrationModel2;
            }
        }
        AtomicBoolean atomicBoolean = C1544000qHW.LIZ;
        C1543330qGR c1543330qGR = C1544000qHW.LJIILLIIL;
        long j = jSBAIMigrationModel.enable ? 1L : 0L;
        if (jSBAIMigrationModel.darkMode) {
            j |= 2;
        }
        if (jSBAIMigrationModel.monitorLog) {
            j |= 4;
        }
        if (jSBAIMigrationModel.getContainerId) {
            j |= 8;
        }
        if (jSBAIMigrationModel.getNativeItem) {
            j |= 16;
        }
        if (jSBAIMigrationModel.getABTestParams) {
            j |= 32;
        }
        if (jSBAIMigrationModel.appSetting) {
            j |= 64;
        }
        if (jSBAIMigrationModel.getThirdLoginToken) {
            j |= 128;
        }
        if (jSBAIMigrationModel.openBrowser) {
            j |= 256;
        }
        if (jSBAIMigrationModel.openSchema) {
            j |= 512;
        }
        if (jSBAIMigrationModel.openAweme) {
            j |= 1024;
        }
        c1543330qGR.LIZJ.setValue(c1543330qGR, C1543330qGR.LJIIIZ[2], Long.valueOf(j));
        return jSBAIMigrationModel;
    }

    public static final class JSBAIMigrationModel {

        @C09CT("appSetting")
        public final boolean appSetting;

        @C09CT("darkMode")
        public final boolean darkMode;

        @C09CT("enable")
        public final boolean enable;

        @C09CT("getABTestParams")
        public final boolean getABTestParams;

        @C09CT("getContainerId")
        public final boolean getContainerId;

        @C09CT("getNativeItem")
        public final boolean getNativeItem;

        @C09CT("getThirdLoginToken")
        public final boolean getThirdLoginToken;

        @C09CT("monitorLog")
        public final boolean monitorLog;

        @C09CT("openAweme")
        public final boolean openAweme;

        @C09CT("openBrowser")
        public final boolean openBrowser;

        @C09CT("openSchema")
        public final boolean openSchema;

        public JSBAIMigrationModel() {
            this(true, true, true, true, true, true, true, true, true, true, true);
        }

        public JSBAIMigrationModel(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
            this.enable = z;
            this.darkMode = z2;
            this.monitorLog = z3;
            this.getContainerId = z4;
            this.getNativeItem = z5;
            this.getABTestParams = z6;
            this.appSetting = z7;
            this.getThirdLoginToken = z8;
            this.openBrowser = z9;
            this.openSchema = z10;
            this.openAweme = z11;
        }
    }
}
