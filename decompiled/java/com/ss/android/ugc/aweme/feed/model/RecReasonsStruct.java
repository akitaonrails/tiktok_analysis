package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class RecReasonsStruct implements Serializable {

    @C09CT("biz_type")
    public String bizType;

    @C09CT("body")
    public String body;

    @C09CT("button_text")
    public String buttonText;

    @C09CT("rec_reasons")
    public List<RecReasonEntry> reasons;

    @C09CT("sub_body")
    public String subBody;

    @C09CT("title")
    public String title;

    @C09CT("url")
    public String url;

    @C09CT("url_text")
    public String urlText;

    public RecReasonsStruct() {
    }

    public final void setBizType(String str) {
        this.bizType = str;
    }

    public final void setBody(String str) {
        this.body = str;
    }

    public final void setButtonText(String str) {
        this.buttonText = str;
    }

    public final void setReasons(List<RecReasonEntry> list) {
        this.reasons = list;
    }

    public final void setSubBody(String str) {
        this.subBody = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final void setUrlText(String str) {
        this.urlText = str;
    }

    public RecReasonsStruct(List<RecReasonEntry> list, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.reasons = list;
        this.title = str;
        this.body = str2;
        this.subBody = str3;
        this.urlText = str4;
        this.url = str5;
        this.buttonText = str6;
        this.bizType = str7;
    }
}
