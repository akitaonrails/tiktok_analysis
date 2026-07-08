package com.bytedance.android.livesdk.rank.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public final class ActivityRankLabel {

    @C09CT("dark_style")
    public LabelStyle darkStyle;

    @C09CT("light_style")
    public LabelStyle lightStyle;

    @C09CT("tip_text")
    public String tipText = "";

    public static final class LabelStyle {

        @C09CT("icon")
        public ImageModel icon;

        @C09CT("bg_color")
        public String bgColor = "";

        @C09CT("text_color")
        public String textColor = "";
    }
}
