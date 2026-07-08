package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.LiveSettingManagerSolidifyUtils;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_broadcast_storage_monitor_switch")
public final class LiveBroadcastStorageMonitorSwitch {
    public static final boolean DEFAULT = false;
    public static final LiveBroadcastStorageMonitorSwitch INSTANCE;
    public static final C01GW solidifyValue$delegate;
    public static final boolean value;

    public static /* synthetic */ void getValue$annotations() {
    }

    static {
        LiveBroadcastStorageMonitorSwitch liveBroadcastStorageMonitorSwitch = new LiveBroadcastStorageMonitorSwitch();
        INSTANCE = liveBroadcastStorageMonitorSwitch;
        solidifyValue$delegate = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(70));
        value = LiveSettingManagerSolidifyUtils.INSTANCE.isSolidifyEnable("live_broadcast_storage_monitor_switch") ? liveBroadcastStorageMonitorSwitch.getSolidifyValue() : SettingsManager.INSTANCE.getBooleanValue("live_broadcast_storage_monitor_switch", DEFAULT);
    }

    private final boolean getSolidifyValue() {
        return ((Boolean) solidifyValue$delegate.getValue()).booleanValue();
    }

    public static final boolean getValue() {
        return value;
    }
}
