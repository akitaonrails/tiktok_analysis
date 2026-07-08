package com.ss.android.ugc.aweme.tako.common.ui;

import X.C09CT;
import X.C1697810uHb;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoDisclaimerUIConfigExperiment {
    public static final TakoDisclaimerUIConfigExperiment LIZ = new TakoDisclaimerUIConfigExperiment();
    public static final TakoDisclaimerUIConfig LIZIZ = new TakoDisclaimerUIConfig(new Config(C1697810uHb.LJIIJJI("#1E9655FF", "#1E666666"), C1697810uHb.LJIIJJI("#A6FFFFFF", "#00FFFFFF", "#00000000"), C1697810uHb.LJIIJJI("#F7F1FF", "#EEEBFF"), C1697810uHb.LJIIJJI("#261D45", "#222222"), C1697810uHb.LJIIJJI("#A6FFFFFF", "#00FFFFFF", "#00000000"), C1697810uHb.LJIIJJI("#1F1540", "#151142")));

    public static final class Config {

        @C09CT("border_dark_colors")
        public final List<String> borderDarkColor;

        @C09CT("border_light_colors")
        public final List<String> borderLightColor;

        @C09CT("horizontal_dark_colors")
        public final List<String> horizontalDarkColor;

        @C09CT("horizontal_light_colors")
        public final List<String> horizontalLightColor;

        @C09CT("vertical_dark_colors")
        public final List<String> verticalDarkColor;

        @C09CT("vertical_light_colors")
        public final List<String> verticalLightColor;

        public Config() {
            this(C1697810uHb.LJIIJJI("#1E9655FF", "#1E666666"), C1697810uHb.LJIIJJI("#A6FFFFFF", "#00FFFFFF", "#00000000"), C1697810uHb.LJIIJJI("#F7F1FF", "#EEEBFF"), C1697810uHb.LJIIJJI("#261D45", "#222222"), C1697810uHb.LJIIJJI("#A6FFFFFF", "#00FFFFFF", "#00000000"), C1697810uHb.LJIIJJI("#1F1540", "#151142"));
        }

        public Config(List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5, List<String> list6) {
            this.borderLightColor = list;
            this.verticalLightColor = list2;
            this.horizontalLightColor = list3;
            this.borderDarkColor = list4;
            this.verticalDarkColor = list5;
            this.horizontalDarkColor = list6;
        }
    }

    public static final class TakoDisclaimerUIConfig {

        /* JADX INFO: renamed from: android, reason: collision with root package name */
        @C09CT("android")
        public final Config f423android;

        public TakoDisclaimerUIConfig() {
            this(new Config(C1697810uHb.LJIIJJI("#1E9655FF", "#1E666666"), C1697810uHb.LJIIJJI("#A6FFFFFF", "#00FFFFFF", "#00000000"), C1697810uHb.LJIIJJI("#F7F1FF", "#EEEBFF"), C1697810uHb.LJIIJJI("#261D45", "#222222"), C1697810uHb.LJIIJJI("#A6FFFFFF", "#00FFFFFF", "#00000000"), C1697810uHb.LJIIJJI("#1F1540", "#151142")));
        }

        public TakoDisclaimerUIConfig(Config config) {
            this.f423android = config;
        }
    }
}
