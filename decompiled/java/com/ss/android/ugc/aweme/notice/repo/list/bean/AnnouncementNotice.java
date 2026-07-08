package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.model.Challenge;

/* JADX INFO: loaded from: classes29.dex */
public class AnnouncementNotice {

    @C09CT("challenge")
    public Challenge challenge;

    @C09CT("content")
    public String content;

    @C09CT("image_url")
    public UrlModel imageUrl;

    @C09CT("object_id")
    public String objectId;

    @C09CT("schema_url")
    public String schemaUrl;

    @C09CT("search")
    public Search search;

    @C09CT("task_id")
    public long taskId;

    @C09CT("title")
    public String title;

    @C09CT("type")
    public int type;

    public Challenge getChallenge() {
        return this.challenge;
    }

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

    public Search getSearch() {
        return this.search;
    }

    public long getTaskId() {
        return this.taskId;
    }

    public String getTitle() {
        return this.title;
    }

    public int getType() {
        return this.type;
    }

    public void setChallenge(Challenge challenge) {
        this.challenge = challenge;
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

    public void setSearch(Search search) {
        this.search = search;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(int i) {
        this.type = i;
    }
}
