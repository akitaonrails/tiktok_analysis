package com.ss.android.ugc.aweme.discover.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class ChallengeTransform implements Serializable {

    @C09CT("action")
    public String action;

    @C09CT("icon")
    public UrlModel iconUrlModel;

    @C09CT("text")
    public String text;

    public ChallengeTransform() {
        this(null, null, null);
    }

    public final void setAction(String str) {
        this.action = str;
    }

    public final void setIconUrlModel(UrlModel urlModel) {
        this.iconUrlModel = urlModel;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public ChallengeTransform(String str, UrlModel urlModel, String str2) {
        this.text = str;
        this.iconUrlModel = urlModel;
        this.action = str2;
    }
}
