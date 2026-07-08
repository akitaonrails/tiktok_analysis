package com.ss.android.ugc.aweme.comment.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentShareInfo implements Serializable {

    @C09CT("acl")
    public CommentShareACL acl;

    @C09CT("url")
    public String url = "";

    @C09CT("desc")
    public String desc = "";

    @C09CT("title")
    public String title = "";

    @C09CT("need_confirm")
    public final Boolean needConfirm = Boolean.FALSE;

    @C09CT("desc_tpl")
    public final String descTemplate = "";

    public final CommentShareACL getAcl() {
        return this.acl;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getDescTemplate() {
        return this.descTemplate;
    }

    public final Boolean getNeedConfirm() {
        return this.needConfirm;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setAcl(CommentShareACL commentShareACL) {
        this.acl = commentShareACL;
    }

    public final void setDesc$common_model_release(String str) {
        this.desc = str;
    }

    public final void setTitle$common_model_release(String str) {
        this.title = str;
    }

    public final void setUrl$common_model_release(String str) {
        this.url = str;
    }
}
