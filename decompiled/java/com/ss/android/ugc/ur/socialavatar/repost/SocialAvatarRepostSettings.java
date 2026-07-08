package com.ss.android.ugc.ur.socialavatar.repost;

import X.C09CT;
import X.C1697810uHb;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public final class SocialAvatarRepostSettings {
    public static final Config LIZ = new Config(true, C1697810uHb.LJIIJJI("thumbsup", "aww", "fingerheart", "idk", "amused", "amazed", "goodmorning", "shocked", "bored", "sad"));

    public static final Config LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        Config config = LIZ;
        Config config2 = (Config) settingsManagerLIZLLL.LJIIIIZZ("repost_with_sa_expressions", Config.class, config);
        return config2 != null ? config2 : config;
    }

    public static final class Config {

        @C09CT("default_expressions")
        public final List<String> defaultExpressions;

        @C09CT("enable_sorting")
        public final boolean enableSorting;

        public Config() {
            this(true, C1697810uHb.LJIIJJI("thumbsup", "aww", "fingerheart", "idk", "amused", "amazed", "goodmorning", "shocked", "bored", "sad"));
        }

        public Config(boolean z, List<String> list) {
            this.enableSorting = z;
            this.defaultExpressions = list;
        }
    }
}
