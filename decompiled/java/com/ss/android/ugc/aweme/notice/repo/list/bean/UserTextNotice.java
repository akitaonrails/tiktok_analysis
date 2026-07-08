package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: loaded from: classes29.dex */
public class UserTextNotice {

    @C09CT("content")
    public String content;

    @C09CT("image_url")
    public UrlModel imageUrl;

    @C09CT("object_id")
    public String objectId;

    @C09CT("schema_url")
    public String schemaUrl;

    @C09CT("sub_type")
    public int subType;

    @C09CT("task_id")
    public long taskId;

    @C09CT("title")
    public String title;

    @C09CT("user_info")
    public User user;

    public String getContent() {
        return this.content;
    }

    public UrlModel getImageUrl() {
        return this.imageUrl;
    }

    public String getObjectId() {
        return this.objectId;
    }

    public String getSchemaUrl() {
        return this.schemaUrl;
    }

    public int getSubType() {
        return this.subType;
    }

    public long getTaskId() {
        return this.taskId;
    }

    public String getTitle() {
        return this.title;
    }

    public User getUser() {
        return this.user;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setImageUrl(UrlModel urlModel) {
        this.imageUrl = urlModel;
    }

    public void setObjectId(String str) {
        this.objectId = str;
    }

    public void setSchemaUrl(String str) {
        this.schemaUrl = str;
    }

    public void setSubType(int i) {
        this.subType = i;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
