package com.ss.android.ugc.gamora.editor.text;

import X.C01GW;
import X.C09CT;
import X.C1697810uHb;
import X.C452501pT;
import java.util.List;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class TextModeBackgroundColorSettings {
    public static final TextModeBackgroundColorConfig LIZ = new TextModeBackgroundColorConfig(C1697810uHb.LJIIJJI(new BackgroundColorItem("bg_00.png", C1697810uHb.LJIIJJI("#252525", "#252525"), "#FFFFFFFF"), new BackgroundColorItem("bg_01.png", C1697810uHb.LJIIJJI("#4654D7", "#F5BAA8"), "#FFFFFFFF"), new BackgroundColorItem("bg_02.png", C1697810uHb.LJIIJJI("#6D43B1", "#B189F3"), "#FFFFFFFF"), new BackgroundColorItem("bg_03.png", C1697810uHb.LJIIJJI("#FF625C", "#F4A578"), "#FFFFFFFF"), new BackgroundColorItem("bg_04.png", C1697810uHb.LJIIJJI("#2A3449", "#616776"), "#FFFFFFFF"), new BackgroundColorItem("bg_05.png", C1697810uHb.LJIIJJI("#284F37", "#788D70"), "#FFFFFFFF")));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(277));

    public static final class TextModeBackgroundColorConfig {

        @C09CT("config")
        public final List<BackgroundColorItem> items;

        public TextModeBackgroundColorConfig() {
            this(C1697810uHb.LJIIJJI(new BackgroundColorItem("bg_00.png", C1697810uHb.LJIIJJI("#252525", "#252525"), "#FFFFFFFF"), new BackgroundColorItem("bg_01.png", C1697810uHb.LJIIJJI("#4654D7", "#F5BAA8"), "#FFFFFFFF"), new BackgroundColorItem("bg_02.png", C1697810uHb.LJIIJJI("#6D43B1", "#B189F3"), "#FFFFFFFF"), new BackgroundColorItem("bg_03.png", C1697810uHb.LJIIJJI("#FF625C", "#F4A578"), "#FFFFFFFF"), new BackgroundColorItem("bg_04.png", C1697810uHb.LJIIJJI("#2A3449", "#616776"), "#FFFFFFFF"), new BackgroundColorItem("bg_05.png", C1697810uHb.LJIIJJI("#284F37", "#788D70"), "#FFFFFFFF")));
        }

        public TextModeBackgroundColorConfig(List<BackgroundColorItem> list) {
            this.items = list;
        }
    }

    public static final class BackgroundColorItem {

        @C09CT("background")
        public final String background;

        @C09CT("gradientColor")
        public final List<String> gradientColor;

        @C09CT("textColor")
        public final String textColor;

        public BackgroundColorItem() {
            this(null, null, null);
        }

        public BackgroundColorItem(String str, List<String> list, String str2) {
            this.background = str;
            this.gradientColor = list;
            this.textColor = str2;
        }
    }
}
