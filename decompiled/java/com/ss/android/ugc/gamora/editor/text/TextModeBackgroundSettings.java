package com.ss.android.ugc.gamora.editor.text;

import X.C01GW;
import X.C09CT;
import X.C1697810uHb;
import X.C452501pT;
import java.util.List;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class TextModeBackgroundSettings {
    public static final TextModeBackgroundConfig LIZ = new TextModeBackgroundConfig("textmode_bg_resource", C1697810uHb.LJIIJJI(new BackgroundItem("bg_00.png", "#FFFFFFFF", "buttonImage00.png"), new BackgroundItem("bg_01.png", "#FFFFFFFF", "buttonImage01.png"), new BackgroundItem("bg_02.png", "#FFFFFFFF", "buttonImage02.png"), new BackgroundItem("bg_03.png", "#FFFFFFFF", "buttonImage03.png"), new BackgroundItem("bg_04.png", "#FFFFFFFF", "buttonImage04.png"), new BackgroundItem("bg_05.png", "#FFFFFFFF", "buttonImage05.png")));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(278));

    public static final class TextModeBackgroundConfig {

        @C09CT("channelName")
        public final String channelName;

        @C09CT("config")
        public final List<BackgroundItem> items;

        public TextModeBackgroundConfig() {
            this("textmode_bg_resource", C1697810uHb.LJIIJJI(new BackgroundItem("bg_00.png", "#FFFFFFFF", "buttonImage00.png"), new BackgroundItem("bg_01.png", "#FFFFFFFF", "buttonImage01.png"), new BackgroundItem("bg_02.png", "#FFFFFFFF", "buttonImage02.png"), new BackgroundItem("bg_03.png", "#FFFFFFFF", "buttonImage03.png"), new BackgroundItem("bg_04.png", "#FFFFFFFF", "buttonImage04.png"), new BackgroundItem("bg_05.png", "#FFFFFFFF", "buttonImage05.png")));
        }

        public TextModeBackgroundConfig(String str, List<BackgroundItem> list) {
            this.channelName = str;
            this.items = list;
        }
    }

    public static final class BackgroundItem {

        @C09CT("background")
        public final String backgroundFileName;

        @C09CT("button")
        public final String buttonIconName;

        @C09CT("textColor")
        public final String textColor;

        public BackgroundItem() {
            this(null, null, null);
        }

        public BackgroundItem(String str, String str2, String str3) {
            this.backgroundFileName = str;
            this.textColor = str2;
            this.buttonIconName = str3;
        }
    }
}
