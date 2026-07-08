package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class DisclaimerText implements Serializable {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id;

    @C09CT("text")
    public String text;

    @C09CT("type")
    public int type;

    @C09CT("url")
    public String url;

    public DisclaimerText() {
        this("", "", "", -1);
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public DisclaimerText(String str, String str2, String str3, int i) {
        this.text = str;
        this.url = str2;
        this.id = str3;
        this.type = i;
    }
}
