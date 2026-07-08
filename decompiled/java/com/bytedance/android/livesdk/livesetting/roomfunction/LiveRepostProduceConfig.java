package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_repost_produce_config")
public final class LiveRepostProduceConfig {
    public static final LiveRepostProduceConfig INSTANCE = new LiveRepostProduceConfig();
    public static final ProduceGroupConfig DEFAULT = new ProduceGroupConfig(true, true, true, true, true);
    public static final C01GW settingValue$delegate = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(88));

    private final ProduceGroupConfig getSettingValue() {
        return (ProduceGroupConfig) settingValue$delegate.getValue();
    }

    public final ProduceGroupConfig config() {
        return getSettingValue();
    }

    public static final class ProduceGroupConfig {
        public static final TypeAdapter ADAPTER = new LiveRepostProduceConfig_ProduceGroupConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("repost_see_myself_message")
        public boolean myselfMessage;

        @C09CT("repost_bubble_show")
        public boolean repostBubbleShow;

        @C09CT("repost_education_panel")
        public boolean repostEducationPanel;

        @C09CT("repost_produce_enable")
        public boolean repostProduceEnable;

        @C09CT("repost_like_icon_show")
        public boolean selfLikeIconShow;

        public ProduceGroupConfig() {
            this(true, true, true, true, true);
        }

        public ProduceGroupConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            this.repostProduceEnable = z;
            this.myselfMessage = z2;
            this.selfLikeIconShow = z3;
            this.repostBubbleShow = z4;
            this.repostEducationPanel = z5;
        }
    }
}
