package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class DiggNotice implements Serializable {

    @C09CT("avatar_badge_url")
    public UrlModel avatarBadgeUrl;

    @C09CT("aweme")
    public Aweme aweme;

    @C09CT("cid")
    public String cid;

    @C09CT("comment")
    public Comment comment;

    @C09CT("content")
    public String content;

    @C09CT("digg_type")
    public int diggType;

    @C09CT("forward_id")
    public String forwardId;

    @C09CT("has_digg_list")
    public Boolean hasDiggList;

    @C09CT("label_text")
    public String mLabelText;

    @C09CT("merge_count")
    public int mergeCount;

    @C09CT("nudge_info")
    public NudgeData nudgeData;

    @C09CT("relation_label")
    public RelationDynamicLabel relationLabel;

    @C09CT("from_user")
    public List<User> users;

    public UrlModel getAvatarBadgeUrl() {
        return this.avatarBadgeUrl;
    }

    public Aweme getAweme() {
        return this.aweme;
    }

    public String getCid() {
        return this.cid;
    }

    public Comment getComment() {
        return this.comment;
    }

    public String getContent() {
        return this.content;
    }

    public int getDiggType() {
        return this.diggType;
    }

    public String getForwardId() {
        return this.forwardId;
    }

    public Boolean getHasDiggList() {
        return this.hasDiggList;
    }

    public String getLabelText() {
        return this.mLabelText;
    }

    public int getMergeCount() {
        return this.mergeCount;
    }

    public NudgeData getNudgeData() {
        return this.nudgeData;
    }

    public RelationDynamicLabel getRelationLabel() {
        return this.relationLabel;
    }

    public List<User> getUsers() {
        return this.users;
    }

    public DiggNotice(DiggNotice diggNotice) {
        this.aweme = diggNotice.aweme;
        this.users = diggNotice.users;
        this.content = diggNotice.content;
        this.mergeCount = diggNotice.mergeCount;
        this.diggType = diggNotice.diggType;
        this.cid = diggNotice.cid;
        this.relationLabel = diggNotice.relationLabel;
        this.forwardId = diggNotice.forwardId;
        this.mLabelText = diggNotice.mLabelText;
        this.avatarBadgeUrl = diggNotice.avatarBadgeUrl;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DiggNotice diggNotice = (DiggNotice) obj;
            List<User> list = this.users;
            if (list != null && diggNotice.users != null && list.size() > 0 && this.users.size() == diggNotice.users.size() && ((User) ListProtector.get(this.users, 0)).equals(ListProtector.get(diggNotice.users, 0))) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void setAvatarBadgeUrl(UrlModel urlModel) {
        this.avatarBadgeUrl = urlModel;
    }

    public void setAweme(Aweme aweme) {
        this.aweme = aweme;
    }

    public void setCid(String str) {
        this.cid = str;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setDiggType(int i) {
        this.diggType = i;
    }

    public void setForwardId(String str) {
        this.forwardId = str;
    }

    public void setLabelText(String str) {
        this.mLabelText = str;
    }

    public void setMergeCount(int i) {
        this.mergeCount = i;
    }

    public void setNudgeData(NudgeData nudgeData) {
        this.nudgeData = nudgeData;
    }

    public void setRelationLabel(RelationDynamicLabel relationDynamicLabel) {
        this.relationLabel = relationDynamicLabel;
    }

    public void setUsers(List<User> list) {
        this.users = list;
    }
}
