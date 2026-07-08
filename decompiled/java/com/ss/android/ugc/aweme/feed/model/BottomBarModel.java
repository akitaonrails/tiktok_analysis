package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class BottomBarModel implements Serializable {

    @C09CT("content")
    public String content;

    @C09CT("icon")
    public UrlModel icon;

    @C09CT("type")
    public int type;

    public BottomBarModel() {
        this("", 0, new UrlModel());
    }

    public BottomBarModel(String str, int i, UrlModel urlModel) {
        this.content = str;
        this.type = i;
        this.icon = urlModel;
    }
}
