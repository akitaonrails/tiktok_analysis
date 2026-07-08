package com.bytedance.android.livesdk.livesetting.performance.degrade;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_watch_preload")
public final class LiveWatchPreloadSettings {
    public static final LiveWatchPreloadSettings INSTANCE = new LiveWatchPreloadSettings();
    public static final Item DEFAULT = new Item(false, false, false, false, false, false, false);

    private final Item getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Item item = DEFAULT;
        Item item2 = (Item) settingsManager.getValueSafely("live_watch_preload", item);
        return item2 != null ? item2 : item;
    }

    public final boolean breakUpPlayFragmentCreate() {
        return getValue().breakUpPlayFragmentCreate;
    }

    public final boolean callAheadPrepareNextStep() {
        return getValue().callAheadPrepareNextStep;
    }

    public final boolean disableUnusedLog() {
        return getValue().disableUnusedTeaLog;
    }

    public final boolean gpuInfoDisable() {
        return getValue().gpuInfoDisable;
    }

    public final boolean messageManagerDisable() {
        return getValue().messageManagerDisable;
    }

    public final boolean reGetGOpt() {
        return getValue().resGetOpt;
    }

    public final boolean xmlResDisable() {
        return getValue().xmlResDisable;
    }

    public static final class Item {
        public static final TypeAdapter ADAPTER = new LiveWatchPreloadSettings_Item_OptTypeAdapter(NormalGson.singleton());

        @C09CT("breakup_play_fragment_create")
        public boolean breakUpPlayFragmentCreate;

        @C09CT("call_ahead_prepare_next_step")
        public boolean callAheadPrepareNextStep;

        @C09CT("disable_unused_tea_log")
        public boolean disableUnusedTeaLog;

        @C09CT("gpu_info_disable")
        public boolean gpuInfoDisable;

        @C09CT("message_manager")
        public boolean messageManagerDisable;

        @C09CT("res_get_opt")
        public boolean resGetOpt;

        @C09CT("xml_res")
        public boolean xmlResDisable;

        public Item() {
            this(false, false, false, false, false, false, false);
        }

        public Item(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
            this.xmlResDisable = z;
            this.messageManagerDisable = z2;
            this.gpuInfoDisable = z3;
            this.resGetOpt = z4;
            this.breakUpPlayFragmentCreate = z5;
            this.disableUnusedTeaLog = z6;
            this.callAheadPrepareNextStep = z7;
        }
    }
}
