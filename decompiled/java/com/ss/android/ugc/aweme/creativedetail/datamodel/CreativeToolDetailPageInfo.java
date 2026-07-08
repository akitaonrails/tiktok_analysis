package com.ss.android.ugc.aweme.creativedetail.datamodel;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class CreativeToolDetailPageInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("author_id")
    public String authorId;

    @C09CT("author_name")
    public String authorName;

    @C09CT("dynamic_cover")
    public UrlModel dynamicCover;

    @C09CT("count")
    public Long publishCount;

    @C09CT("title")
    public String title;

    public final String getAuthorId() {
        return this.authorId;
    }

    public final String getAuthorName() {
        return this.authorName;
    }

    public final UrlModel getDynamicCover() {
        return this.dynamicCover;
    }

    public final Long getPublishCount() {
        return this.publishCount;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setAuthorId(String str) {
        this.authorId = str;
    }

    public final void setAuthorName(String str) {
        this.authorName = str;
    }

    public final void setDynamicCover(UrlModel urlModel) {
        this.dynamicCover = urlModel;
    }

    public final void setPublishCount(Long l) {
        this.publishCount = l;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
