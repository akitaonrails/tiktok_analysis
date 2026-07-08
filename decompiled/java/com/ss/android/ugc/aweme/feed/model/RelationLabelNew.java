package com.ss.android.ugc.aweme.feed.model;

import X.C09CS;
import X.C09CT;
import com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class RelationLabelNew implements Serializable {

    @C09CT("extra")
    @C09CS(StringJsonAdapterFactory.class)
    public RelationLabelExtra extra;

    @C09CT("type")
    public Integer type = 0;

    @C09CT("user_list")
    public List<RelationLabelUser> userList;

    public final RelationLabelExtra getExtra() {
        return this.extra;
    }

    public final Integer getType() {
        return this.type;
    }

    public final List<RelationLabelUser> getUserList() {
        return this.userList;
    }

    public final void setExtra(RelationLabelExtra relationLabelExtra) {
        this.extra = relationLabelExtra;
    }

    public final void setType(Integer num) {
        this.type = num;
    }

    public final void setUserList(List<RelationLabelUser> list) {
        this.userList = list;
    }
}
