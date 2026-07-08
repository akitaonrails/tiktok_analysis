package com.ss.android.ugc.aweme.aime.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class AIMEStructModel implements Serializable {
    public static final int $stable = 8;

    @C09CT("author")
    public Author author;

    @C09CT("biz_params")
    public BizParam bizParam;

    @C09CT("extra")
    public String extra;

    @C09CT("post_count")
    public Long postCount;

    @C09CT("root_style_id")
    public String rootStyleId;

    @C09CT("icon_url")
    public UrlModel styleIcon;

    @C09CT("style_id")
    public String styleId;

    @C09CT("name")
    public String styleName;

    @C09CT("style_resource_id")
    public String styleResourceId;

    public final Author getAuthor() {
        return this.author;
    }

    public final BizParam getBizParam() {
        return this.bizParam;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final Long getPostCount() {
        return this.postCount;
    }

    public final String getRootStyleId() {
        return this.rootStyleId;
    }

    public final UrlModel getStyleIcon() {
        return this.styleIcon;
    }

    public final String getStyleId() {
        return this.styleId;
    }

    public final String getStyleName() {
        return this.styleName;
    }

    public final String getStyleResourceId() {
        return this.styleResourceId;
    }

    public final void setAuthor(Author author) {
        this.author = author;
    }

    public final void setBizParam(BizParam bizParam) {
        this.bizParam = bizParam;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setPostCount(Long l) {
        this.postCount = l;
    }

    public final void setRootStyleId(String str) {
        this.rootStyleId = str;
    }

    public final void setStyleIcon(UrlModel urlModel) {
        this.styleIcon = urlModel;
    }

    public final void setStyleId(String str) {
        this.styleId = str;
    }

    public final void setStyleName(String str) {
        this.styleName = str;
    }

    public final void setStyleResourceId(String str) {
        this.styleResourceId = str;
    }
}
