package com.ss.android.ugc.aweme.template.datamodel;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class TemplateStructModel implements Serializable {
    public static final int $stable = 8;

    @C09CT("author_id")
    public String authorId;

    @C09CT("author_name")
    public String authorName;

    @C09CT("desc")
    public String desc;

    @C09CT("extra")
    public String extra;

    @C09CT("is_collected")
    public Boolean isCollected;

    @C09CT("user_count")
    public Long publishCount;

    @C09CT("resource_id")
    public String resourceId;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String templateId;

    @C09CT("name")
    public String templateTitle;

    @C09CT("icon_url")
    public UrlModel thumbnailUrl;

    public final String getAuthorId() {
        return this.authorId;
    }

    public final String getAuthorName() {
        return this.authorName;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final Long getPublishCount() {
        return this.publishCount;
    }

    public final String getResourceId() {
        return this.resourceId;
    }

    public final String getTemplateId() {
        return this.templateId;
    }

    public final String getTemplateTitle() {
        return this.templateTitle;
    }

    public final UrlModel getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public final Boolean isCollected() {
        return this.isCollected;
    }

    public final void setAuthorId(String str) {
        this.authorId = str;
    }

    public final void setAuthorName(String str) {
        this.authorName = str;
    }

    public final void setCollected(Boolean bool) {
        this.isCollected = bool;
    }

    public final void setDesc(String str) {
        this.desc = str;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setPublishCount(Long l) {
        this.publishCount = l;
    }

    public final void setResourceId(String str) {
        this.resourceId = str;
    }

    public final void setTemplateId(String str) {
        this.templateId = str;
    }

    public final void setTemplateTitle(String str) {
        this.templateTitle = str;
    }

    public final void setThumbnailUrl(UrlModel urlModel) {
        this.thumbnailUrl = urlModel;
    }
}
