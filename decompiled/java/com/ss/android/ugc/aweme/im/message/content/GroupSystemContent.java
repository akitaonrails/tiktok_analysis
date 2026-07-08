package com.ss.android.ugc.aweme.im.message.content;

import X.C09CT;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class GroupSystemContent extends SystemContent {
    public static final Companion Companion = new Companion();

    @C09CT("group_name")
    public String groupName;

    @C09CT("item_id")
    public String itemId;

    @C09CT("max_display_object_users")
    public int maxObjectUsers;

    @C09CT("max_display_subject_users")
    public int maxSubjectUsers;

    @C09CT("object_users")
    public List<? extends BaseContact> objectUsers;

    @C09CT("subject_users")
    public List<? extends BaseContact> subjectUsers;

    public static final class Companion {
    }

    public final String getGroupName() {
        return this.groupName;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final int getMaxObjectUsers() {
        return this.maxObjectUsers;
    }

    public final int getMaxSubjectUsers() {
        return this.maxSubjectUsers;
    }

    public final List<BaseContact> getObjectUsers() {
        return this.objectUsers;
    }

    public final List<BaseContact> getSubjectUsers() {
        return this.subjectUsers;
    }

    public final void setGroupName(String str) {
        this.groupName = str;
    }

    public final void setItemId(String str) {
        this.itemId = str;
    }

    public final void setMaxObjectUsers(int i) {
        this.maxObjectUsers = i;
    }

    public final void setMaxSubjectUsers(int i) {
        this.maxSubjectUsers = i;
    }

    public final void setObjectUsers(List<? extends BaseContact> list) {
        this.objectUsers = list;
    }

    public final void setSubjectUsers(List<? extends BaseContact> list) {
        this.subjectUsers = list;
    }
}
