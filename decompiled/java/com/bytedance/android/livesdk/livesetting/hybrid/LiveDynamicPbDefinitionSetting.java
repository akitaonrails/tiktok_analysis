package com.bytedance.android.livesdk.livesetting.hybrid;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "tiktok_live_lynx_dynamic_pb_definition")
public final class LiveDynamicPbDefinitionSetting {
    public static final LiveDynamicPbDefinitionSetting INSTANCE = new LiveDynamicPbDefinitionSetting();
    public static final PbDefinitionItem[] DEFAULT = new PbDefinitionItem[0];

    public static final class PbDefinitionItem {
        public static final TypeAdapter ADAPTER;

        @C09CT("channel")
        public String channel;

        @C09CT("definition_url")
        public String url;

        static {
            NormalGson.singleton();
            ADAPTER = new LiveDynamicPbDefinitionSetting_PbDefinitionItem_OptTypeAdapter();
        }

        public PbDefinitionItem() {
            this("", "");
        }

        public PbDefinitionItem(String str, String str2) {
            this.channel = str;
            this.url = str2;
        }
    }

    public static final PbDefinitionItem[] getValue() {
        return (PbDefinitionItem[]) SettingsManager.INSTANCE.getValueSafely(LiveDynamicPbDefinitionSetting.class);
    }
}
