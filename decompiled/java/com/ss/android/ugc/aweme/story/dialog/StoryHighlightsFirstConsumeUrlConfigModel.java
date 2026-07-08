package com.ss.android.ugc.aweme.story.dialog;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class StoryHighlightsFirstConsumeUrlConfigModel implements Serializable {
    public static final int $stable = 0;

    @C09CT("consumption_fresh_guide_dark_background_image_url")
    public final String darkImageUrl;

    @C09CT("consumption_fresh_guide_light_background_image_url")
    public final String lightImageUrl;

    public StoryHighlightsFirstConsumeUrlConfigModel() {
        this(null, null);
    }

    public StoryHighlightsFirstConsumeUrlConfigModel(String str, String str2) {
        this.lightImageUrl = str;
        this.darkImageUrl = str2;
    }
}
