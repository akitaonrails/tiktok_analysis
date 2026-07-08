package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Objects;

/* JADX INFO: loaded from: classes29.dex */
public class FollowNotice {

    @C09CT("content")
    public String content;

    @C09CT("follow_notice_from_scene")
    public int followFrom;

    @C09CT("relation_label")
    public RelationDynamicLabel relationLabel;

    @C09CT("from_user")
    public User user;

    public int hashCode() {
        return Objects.hash(this.content, this.user);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public FollowNotice m292clone() {
        FollowNotice followNotice = new FollowNotice();
        User user = this.user;
        followNotice.user = user == null ? null : user.m307clone();
        followNotice.content = this.content;
        followNotice.relationLabel = this.relationLabel;
        followNotice.followFrom = this.followFrom;
        return followNotice;
    }

    public String getContent() {
        return this.content;
    }

    public RelationDynamicLabel getRelationLabel() {
        return this.relationLabel;
    }

    public User getUser() {
        return this.user;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FollowNotice followNotice = (FollowNotice) obj;
        if (Objects.equals(this.content, followNotice.content) && Objects.equals(this.user, followNotice.user)) {
            return true;
        }
        return false;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setRelationLabel(RelationDynamicLabel relationDynamicLabel) {
        this.relationLabel = relationDynamicLabel;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
