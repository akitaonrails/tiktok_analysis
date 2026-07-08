package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class NewFaceSticker implements Serializable {

    @C09CT("desc")
    public String desc;

    @C09CT("effect_id")
    public String effectId;

    @C09CT("icon_url")
    public UrlModel iconUrl;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id;

    @C09CT("log_pb")
    public LogPbBean logPb;

    @C09CT("name")
    public String name;

    @C09CT("owner_id")
    public String ownerId;

    @C09CT("owner_nickname")
    public String ownerNickName;

    @C09CT("user_count")
    public int userCount;

    public final String getDesc() {
        return this.desc;
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public final String getId() {
        return this.id;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOwnerId() {
        return this.ownerId;
    }

    public final String getOwnerNickName() {
        return this.ownerNickName;
    }

    public final int getUserCount() {
        return this.userCount;
    }

    public final void setDesc(String str) {
        this.desc = str;
    }

    public final void setEffectId(String str) {
        this.effectId = str;
    }

    public final void setIconUrl(UrlModel urlModel) {
        this.iconUrl = urlModel;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setOwnerId(String str) {
        this.ownerId = str;
    }

    public final void setOwnerNickName(String str) {
        this.ownerNickName = str;
    }

    public final void setUserCount(int i) {
        this.userCount = i;
    }
}
