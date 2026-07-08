package com.bytedance.android.livesdk.broadcast.setting;

import X.C1161920gLG;
import X.C168H;
import X.InterfaceC1101100elA;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_anchor_status_diagnostics_enable")
public final class LiveAnchorStatusDiagnosticsEnableSetting {
    public static final boolean DEFAULT = false;
    public static final LiveAnchorStatusDiagnosticsEnableSetting INSTANCE = new LiveAnchorStatusDiagnosticsEnableSetting();
    public static Integer resolvedDeviceLevel;

    private final int getPerformanceDeviceLevel() {
        InterfaceC1101100elA interfaceC1101100elAOK1;
        Integer num = resolvedDeviceLevel;
        if (num != null) {
            return num.intValue();
        }
        Integer num2 = (Integer) DataChannelGlobal.LLILZ.gg0(C168H.class);
        int i = 3;
        if (num2 != null && new IntRange(1, 3).LJLJL(num2.intValue())) {
            resolvedDeviceLevel = num2;
            return num2.intValue();
        }
        float value = TTliveAnchorDeviceScoreSetting.INSTANCE.getValue();
        IHostPerformanceMonitor iHostPerformanceMonitor = (IHostPerformanceMonitor) C1161920gLG.LIZJ(IHostPerformanceMonitor.class);
        float fLJ = (iHostPerformanceMonitor == null || (interfaceC1101100elAOK1 = iHostPerformanceMonitor.OK1()) == null) ? value : interfaceC1101100elAOK1.LJ();
        if (fLJ > 0.0f) {
            value = fLJ;
        }
        if (value <= 0.0f) {
            i = 0;
        } else {
            BroadcastOverallScoreLevelSetting broadcastOverallScoreLevelSetting = BroadcastOverallScoreLevelSetting.INSTANCE;
            if (value < broadcastOverallScoreLevelSetting.getValue().getLow_end_device_max()) {
                i = 1;
            } else if (value < broadcastOverallScoreLevelSetting.getValue().getMedium_end_device_max()) {
                i = 2;
            }
        }
        resolvedDeviceLevel = Integer.valueOf(i);
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.android.livesdk.broadcast.setting.LiveAnchorStatusDiagnosticsPerfConfig getPerfConfig() {
        /*
            r4 = this;
            com.bytedance.android.livesdk.broadcast.setting.LiveAnchorStatusDiagnosticsPerfConfigSetting r0 = com.bytedance.android.livesdk.broadcast.setting.LiveAnchorStatusDiagnosticsPerfConfigSetting.INSTANCE
            com.bytedance.android.livesdk.broadcast.setting.LiveAnchorStatusDiagnosticsPerfConfig r3 = r0.getValue()
            com.bytedance.android.livesdk.broadcast.setting.LiveAnchorStatusDiagnosticsPerfConfigAndroidSetting r0 = com.bytedance.android.livesdk.broadcast.setting.LiveAnchorStatusDiagnosticsPerfConfigAndroidSetting.INSTANCE
            com.bytedance.android.livesdk.broadcast.setting.LiveAnchorStatusDiagnosticsPerfConfigAndroidConfig r2 = r0.getValue()
            boolean r0 = r2.hasTierConfig()
            if (r0 != 0) goto L13
            return r3
        L13:
            int r1 = r4.getPerformanceDeviceLevel()
            if (r1 == 0) goto L37
            r0 = 1
            if (r1 == r0) goto L30
            r0 = 2
            if (r1 == r0) goto L29
            r0 = 3
            if (r1 == r0) goto L37
            com.bytedance.android.livesdk.broadcast.setting.LiveAnchorStatusDiagnosticsPerfConfig r0 = r2.getHighTier()
            if (r0 != 0) goto L3e
            return r3
        L29:
            com.bytedance.android.livesdk.broadcast.setting.LiveAnchorStatusDiagnosticsPerfConfig r0 = r2.getMediumTier()
            if (r0 != 0) goto L3e
            return r3
        L30:
            com.bytedance.android.livesdk.broadcast.setting.LiveAnchorStatusDiagnosticsPerfConfig r0 = r2.getLowTier()
            if (r0 != 0) goto L3e
            return r3
        L37:
            com.bytedance.android.livesdk.broadcast.setting.LiveAnchorStatusDiagnosticsPerfConfig r0 = r2.getHighTier()
            if (r0 != 0) goto L3e
            return r3
        L3e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.setting.LiveAnchorStatusDiagnosticsEnableSetting.getPerfConfig():com.bytedance.android.livesdk.broadcast.setting.LiveAnchorStatusDiagnosticsPerfConfig");
    }

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_anchor_status_diagnostics_enable", DEFAULT);
    }
}
