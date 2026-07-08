package com.ss.android.ugc.aweme.feed.model.ad;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class PlayableData implements Serializable {

    @C09CT("disable_web_convert")
    public final Integer disableWebConvert;

    @C09CT("playable_style")
    public final String playableStyle;

    @C09CT("playable_type")
    public final Integer playableType;

    @C09CT("playable_url")
    public final String playableUrl;

    public PlayableData() {
        this(null, null, 0, null);
    }

    public PlayableData(String str, String str2, Integer num, Integer num2) {
        this.playableUrl = str;
        this.playableStyle = str2;
        this.playableType = num;
        this.disableWebConvert = num2;
    }
}
