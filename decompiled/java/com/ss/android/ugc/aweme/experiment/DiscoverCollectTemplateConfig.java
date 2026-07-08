package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
public final class DiscoverCollectTemplateConfig {
    public static String LIZ() {
        Config config = (Config) SettingsManager.LIZLLL().LJIIIIZZ("discovery_collect_template", Config.class, null);
        if (config == null) {
            config = new Config(null, null);
        }
        return config.hashtagCdnUrl;
    }

    public static final class Config {

        @C09CT("hashtag_cdn_url")
        public final String hashtagCdnUrl;

        @C09CT("music_cdn_url")
        public final String musicCdnUrl;

        public Config() {
            this(null, null);
        }

        public Config(String str, String str2) {
            this.musicCdnUrl = str;
            this.hashtagCdnUrl = str2;
        }
    }
}
