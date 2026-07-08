package com.ss.android.ugc.aweme.comment.experiment;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;

/* JADX INFO: loaded from: classes12.dex */
public final class NewStyleBubbleConfig {

    @C09CT("icon")
    public UrlModel icon;

    @C09CT("subtype")
    public String subtype;

    @C09CT("type")
    public int type;

    public NewStyleBubbleConfig() {
        this(0, null, null);
    }

    public NewStyleBubbleConfig(int i, String str, UrlModel urlModel) {
        this.type = i;
        this.subtype = str;
        this.icon = urlModel;
    }
}
