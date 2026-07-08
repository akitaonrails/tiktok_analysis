package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class AccountLabelInfo implements Serializable {

    @C09CT("content")
    public String content;

    @C09CT("label_type")
    public int labelType;

    @C09CT("learn_more_url")
    public String learnMoreUrl;

    public AccountLabelInfo() {
        this(-1, "", "");
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setLabelType(int i) {
        this.labelType = i;
    }

    public final void setLearnMoreUrl(String str) {
        this.learnMoreUrl = str;
    }

    public AccountLabelInfo(int i, String str, String str2) {
        this.labelType = i;
        this.content = str;
        this.learnMoreUrl = str2;
    }
}
