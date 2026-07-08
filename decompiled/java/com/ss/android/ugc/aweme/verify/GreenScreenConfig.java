package com.ss.android.ugc.aweme.verify;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class GreenScreenConfig {

    @C09CT("anchors")
    public final Anchors anchors;

    public static final class Anchors {

        @C09CT("green_screen_anchor")
        public final String anchor;

        @C09CT("green_screen_anchor_on_the_panel")
        public final String anchorOnPanel;

        @C09CT("green_screen_anchor_with_bg")
        public final String anchorWithBG;

        public Anchors() {
            this("", "", "");
        }

        public Anchors(String str, String str2, String str3) {
            this.anchor = str;
            this.anchorOnPanel = str2;
            this.anchorWithBG = str3;
        }
    }

    public GreenScreenConfig() {
        this(new Anchors("", "", ""));
    }

    public GreenScreenConfig(Anchors anchors) {
        this.anchors = anchors;
    }
}
