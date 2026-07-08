package com.ss.android.ugc.aweme.feed.model.banner;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class StandardTagUi implements Serializable {

    @C09CT("action")
    public StandardTagActionV2 action;

    @C09CT("action_key")
    public String actionKey;

    @C09CT("background_color")
    public String backgroundColor;

    @C09CT("content")
    public StandardTagContentV2 content;

    @C09CT("head_icon")
    public String headIcon;

    public StandardTagUi() {
        this(null, null, null, null, null);
    }

    public StandardTagUi(String str, StandardTagContentV2 standardTagContentV2, StandardTagActionV2 standardTagActionV2, String str2, String str3) {
        this.headIcon = str;
        this.content = standardTagContentV2;
        this.action = standardTagActionV2;
        this.backgroundColor = str2;
        this.actionKey = str3;
    }
}
