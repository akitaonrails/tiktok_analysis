package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class WikipediaExtra implements Serializable {

    @C09CT("warning_msg")
    public String warningMsg = "";

    @C09CT("language")
    public String language = "";

    @C09CT("review_status")
    public Integer status = 0;

    public final String getLanguage() {
        return this.language;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final String getWarningMsg() {
        return this.warningMsg;
    }

    public final void setLanguage(String str) {
        this.language = str;
    }

    public final void setStatus(Integer num) {
        this.status = num;
    }

    public final void setWarningMsg(String str) {
        this.warningMsg = str;
    }
}
