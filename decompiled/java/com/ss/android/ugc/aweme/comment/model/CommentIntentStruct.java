package com.ss.android.ugc.aweme.comment.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentIntentStruct implements Serializable {

    @C09CT("biz_type")
    public String bizType;

    @C09CT("button_text")
    public String buttonText;

    @C09CT("button_url")
    public String buttonUrl;

    @C09CT("text")
    public String text;

    @C09CT("uuid")
    public String uuid;

    public final String getBizType() {
        return this.bizType;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final String getButtonUrl() {
        return this.buttonUrl;
    }

    public final String getText() {
        return this.text;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final void setBizType(String str) {
        this.bizType = str;
    }

    public final void setButtonText(String str) {
        this.buttonText = str;
    }

    public final void setButtonUrl(String str) {
        this.buttonUrl = str;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setUuid(String str) {
        this.uuid = str;
    }
}
