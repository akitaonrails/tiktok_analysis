package com.ss.android.ugc.aweme.settings;

import X.C09CT;
import X.C1697810uHb;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class SDUIGlobalSettings {
    public static final SduiEnableSwitchModel LIZ = new SduiEnableSwitchModel(true, Mp4ScreenVideoLoadTimeout.CONTROL, Mp4ScreenVideoLoadTimeout.CONTROL, Mp4ScreenVideoLoadTimeout.CONTROL, 300000, true, Mp4ScreenVideoLoadTimeout.CONTROL, C1697810uHb.LJIILJJIL("sendLogV3", "userInfo", "hideSearchLoading", "searchRequestSuccess", "error"), C1697810uHb.LJIILJJIL("load", "layoutcomplete", "nodeappear", "scrollstatechange"), true, true, true, true, true, true);
    public static SduiEnableSwitchModel LIZIZ;

    public static final class SduiEnableSwitchModel {

        @C09CT("cachedBridgeList")
        public final List<String> cachedBridgeResponseList;

        @C09CT("cachedEventList")
        public final List<String> cachedEventList;

        @C09CT("eventInterval")
        public final long eventInterval;

        @C09CT("eventLogInterval")
        public final long eventLogInterval;

        @C09CT("eventTimeOut")
        public final long eventTimeOut;

        @C09CT("fixParentRequest")
        public final boolean fixParentRequest;

        @C09CT("fixRelayout")
        public final boolean fixRelayout;

        @C09CT("heartBeatInterval")
        public final long heartBeatInterval;

        @C09CT("isSDUIEnable")
        public final boolean isSDUIEnable;

        @C09CT("isSupportAsyncCreate")
        public final boolean isSupportAsyncCreate;

        @C09CT("isSupportGzipTransfer")
        public final boolean isSupportGzipTransfer;

        @C09CT("reportErrorToSDUIServer")
        public final boolean reportErrorToSDUIServer;

        @C09CT("reportRuntimeInfo")
        public final boolean reportRuntimeInfo;

        @C09CT("sessionTimeOut")
        public final long sessionTimeOut;

        @C09CT("shouldUploadEvents")
        public final boolean shouldUploadEvents;

        public SduiEnableSwitchModel() {
            this(true, Mp4ScreenVideoLoadTimeout.CONTROL, Mp4ScreenVideoLoadTimeout.CONTROL, Mp4ScreenVideoLoadTimeout.CONTROL, 300000L, true, Mp4ScreenVideoLoadTimeout.CONTROL, C1697810uHb.LJIILJJIL("sendLogV3", "userInfo", "hideSearchLoading", "searchRequestSuccess", "error"), C1697810uHb.LJIILJJIL("load", "layoutcomplete", "nodeappear", "scrollstatechange"), true, true, true, true, true, true);
        }

        public SduiEnableSwitchModel(boolean z, long j, long j2, long j3, long j4, boolean z2, long j5, List<String> list, List<String> list2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
            this.isSDUIEnable = z;
            this.eventInterval = j;
            this.eventTimeOut = j2;
            this.sessionTimeOut = j3;
            this.heartBeatInterval = j4;
            this.reportRuntimeInfo = z2;
            this.eventLogInterval = j5;
            this.cachedBridgeResponseList = list;
            this.cachedEventList = list2;
            this.isSupportAsyncCreate = z3;
            this.isSupportGzipTransfer = z4;
            this.reportErrorToSDUIServer = z5;
            this.shouldUploadEvents = z6;
            this.fixParentRequest = z7;
            this.fixRelayout = z8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.settings.SDUIGlobalSettings.SduiEnableSwitchModel LIZ() {
        /*
            boolean r0 = X.C1253204vK.LIZ()
            java.lang.String r3 = "sdui_enable_switch"
            if (r0 == 0) goto L33
            java.lang.String r1 = "ab_repo_cold_boot"
            com.bytedance.keva.Keva r0 = com.bytedance.keva.Keva.getRepo(r1)
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L33
            com.ss.android.ugc.aweme.settings.SDUIGlobalSettings$SduiEnableSwitchModel r0 = com.ss.android.ugc.aweme.settings.SDUIGlobalSettings.LIZIZ
            if (r0 == 0) goto L19
            return r0
        L19:
            com.google.gson.Gson r2 = X.C08JS.LIZIZ()
            com.bytedance.keva.Keva r1 = com.bytedance.keva.Keva.getRepo(r1)
            java.lang.String r0 = ""
            java.lang.String r1 = r1.getString(r3, r0)
            java.lang.Class<com.ss.android.ugc.aweme.settings.SDUIGlobalSettings$SduiEnableSwitchModel> r0 = com.ss.android.ugc.aweme.settings.SDUIGlobalSettings.SduiEnableSwitchModel.class
            java.lang.Object r1 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r2, r1, r0)
            com.ss.android.ugc.aweme.settings.SDUIGlobalSettings$SduiEnableSwitchModel r1 = (com.ss.android.ugc.aweme.settings.SDUIGlobalSettings.SduiEnableSwitchModel) r1
            com.ss.android.ugc.aweme.settings.SDUIGlobalSettings.LIZIZ = r1
            if (r1 != 0) goto L44
        L33:
            com.bytedance.ies.abmock.SettingsManager r2 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            java.lang.Class<com.ss.android.ugc.aweme.settings.SDUIGlobalSettings$SduiEnableSwitchModel> r1 = com.ss.android.ugc.aweme.settings.SDUIGlobalSettings.SduiEnableSwitchModel.class
            com.ss.android.ugc.aweme.settings.SDUIGlobalSettings$SduiEnableSwitchModel r0 = com.ss.android.ugc.aweme.settings.SDUIGlobalSettings.LIZ
            java.lang.Object r1 = r2.LJIIIIZZ(r3, r1, r0)
            com.ss.android.ugc.aweme.settings.SDUIGlobalSettings$SduiEnableSwitchModel r1 = (com.ss.android.ugc.aweme.settings.SDUIGlobalSettings.SduiEnableSwitchModel) r1
            if (r1 != 0) goto L44
            return r0
        L44:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.settings.SDUIGlobalSettings.LIZ():com.ss.android.ugc.aweme.settings.SDUIGlobalSettings$SduiEnableSwitchModel");
    }
}
