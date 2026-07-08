package com.ss.android.ugc.aweme.comment.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class ButtonResource implements Serializable {

    @C09CT("action_type")
    public final Integer actionType;

    @C09CT("key")
    public final String key;

    @C09CT("link")
    public final String link;

    @C09CT("pos")
    public final Integer pos;

    @C09CT("reply_cid")
    public final String replyCid;

    @C09CT("url")
    public final UrlModel url;

    public ButtonResource() {
        this(null, null, null, null, null, null);
    }

    public ButtonResource(String str, String str2, UrlModel urlModel, Integer num, Integer num2, String str3) {
        this.key = str;
        this.link = str2;
        this.url = urlModel;
        this.pos = num;
        this.actionType = num2;
        this.replyCid = str3;
    }
}
