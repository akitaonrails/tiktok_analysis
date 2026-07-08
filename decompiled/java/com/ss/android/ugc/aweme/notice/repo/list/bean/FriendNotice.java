package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: loaded from: classes.dex */
public class FriendNotice {

    @C09CT("content")
    public String content;

    @C09CT("schema_url")
    public String openUrl;

    @C09CT("type")
    public int type;

    @C09CT("from_user")
    public User user;

    public String getContent() {
        return this.content;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public int getType() {
        return this.type;
    }

    public User getUser() {
        return this.user;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
