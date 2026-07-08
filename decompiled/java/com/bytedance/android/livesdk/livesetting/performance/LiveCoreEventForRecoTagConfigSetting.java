package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CT;
import X.C13LP;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_core_event_for_reco_tag_config")
public final class LiveCoreEventForRecoTagConfigSetting {
    public static final LiveCoreEventForRecoTagConfig DEFAULT;
    public static final LiveCoreEventForRecoTagConfigSetting INSTANCE;
    public static final Set<String> whiteList;

    public static final class LiveCoreEventForRecoTagConfig {
        public static final TypeAdapter ADAPTER = new LiveCoreEventForRecoTagConfigSetting_LiveCoreEventForRecoTagConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("core_event_set")
        public List<String> eventWhiteList;

        public LiveCoreEventForRecoTagConfig() {
            this(new ArrayList());
        }

        public final List<String> getEventWhiteList() {
            return this.eventWhiteList;
        }

        public LiveCoreEventForRecoTagConfig(List<String> list) {
            this.eventWhiteList = list;
        }

        public final void setEventWhiteList(List<String> list) {
            this.eventWhiteList = list;
        }
    }

    static {
        List<String> eventWhiteList;
        LiveCoreEventForRecoTagConfigSetting liveCoreEventForRecoTagConfigSetting = new LiveCoreEventForRecoTagConfigSetting();
        INSTANCE = liveCoreEventForRecoTagConfigSetting;
        Set<String> setLLIIJI = null;
        DEFAULT = new LiveCoreEventForRecoTagConfig(new ArrayList());
        LiveCoreEventForRecoTagConfig value = liveCoreEventForRecoTagConfigSetting.getValue();
        if (value != null && (eventWhiteList = value.getEventWhiteList()) != null) {
            setLLIIJI = C13LP.LLIIJI(eventWhiteList);
        }
        whiteList = setLLIIJI;
    }

    private final LiveCoreEventForRecoTagConfig getValue() {
        LiveCoreEventForRecoTagConfig liveCoreEventForRecoTagConfig = (LiveCoreEventForRecoTagConfig) SettingsManager.INSTANCE.getValueSafely(LiveCoreEventForRecoTagConfigSetting.class);
        return liveCoreEventForRecoTagConfig == null ? DEFAULT : liveCoreEventForRecoTagConfig;
    }

    public final Set<String> getWhiteList() {
        return whiteList;
    }
}
