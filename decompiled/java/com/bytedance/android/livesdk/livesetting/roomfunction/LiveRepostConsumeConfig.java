package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_repost_consume_config")
public final class LiveRepostConsumeConfig {
    public static final LiveRepostConsumeConfig INSTANCE = new LiveRepostConsumeConfig();
    public static final ConsumeGroupConfig DEFAULT = new ConsumeGroupConfig(true, new ConsumeAudienceGroupConfig(true, true, true), new ConsumeAnchorGroupConfig(true, true, true));
    public static final C01GW settingValue$delegate = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(86));

    public final ConsumeGroupConfig getSettingValue() {
        return (ConsumeGroupConfig) settingValue$delegate.getValue();
    }

    public final ConsumeGroupConfig config() {
        return getSettingValue();
    }

    public static final class ConsumeAnchorGroupConfig {
        public static final TypeAdapter ADAPTER = new LiveRepostConsumeConfig_ConsumeAnchorGroupConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("anchor_enable")
        public boolean anchorEnable;

        @C09CT("anchor_repost_like_icon_show")
        public boolean anchorLikeIcon;

        @C09CT("anchor_repost_message")
        public boolean anchorRepostMessage;

        public ConsumeAnchorGroupConfig() {
            this(true, true, true);
        }

        public ConsumeAnchorGroupConfig(boolean z, boolean z2, boolean z3) {
            this.anchorEnable = z;
            this.anchorRepostMessage = z2;
            this.anchorLikeIcon = z3;
        }
    }

    public static final class ConsumeAudienceGroupConfig {
        public static final TypeAdapter ADAPTER = new LiveRepostConsumeConfig_ConsumeAudienceGroupConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("audience_enable")
        public boolean audienceEnable;

        @C09CT("others_repost_like_icon_show")
        public boolean othersLikeIcon;

        @C09CT("others_repost_message")
        public boolean othersRepostMessage;

        public ConsumeAudienceGroupConfig() {
            this(true, true, true);
        }

        public ConsumeAudienceGroupConfig(boolean z, boolean z2, boolean z3) {
            this.audienceEnable = z;
            this.othersRepostMessage = z2;
            this.othersLikeIcon = z3;
        }
    }

    public static final class ConsumeGroupConfig {
        public static final TypeAdapter ADAPTER = new LiveRepostConsumeConfig_ConsumeGroupConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("repost_anchor_message_config")
        public ConsumeAnchorGroupConfig consumeAnchorGroupConfig;

        @C09CT("repost_audience_message_config")
        public ConsumeAudienceGroupConfig consumeAudienceGroupConfig;

        @C09CT("repost_consume_enable")
        public boolean repostConsumeEnable;

        public ConsumeGroupConfig() {
            this(true, new ConsumeAudienceGroupConfig(true, true, true), new ConsumeAnchorGroupConfig(true, true, true));
        }

        public ConsumeGroupConfig(boolean z, ConsumeAudienceGroupConfig consumeAudienceGroupConfig, ConsumeAnchorGroupConfig consumeAnchorGroupConfig) {
            this.repostConsumeEnable = z;
            this.consumeAudienceGroupConfig = consumeAudienceGroupConfig;
            this.consumeAnchorGroupConfig = consumeAnchorGroupConfig;
        }
    }
}
