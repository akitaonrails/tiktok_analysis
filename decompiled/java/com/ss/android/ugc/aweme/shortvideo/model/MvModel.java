package com.ss.android.ugc.aweme.shortvideo.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class MvModel implements Serializable {

    @C09CT("desc")
    public String desc;

    @C09CT("extra")
    public String extra;

    @C09CT("icon_url")
    public UrlModel iconUrl;

    @C09CT("is_collected")
    public boolean isCollected;

    @C09CT("is_mv_anchor")
    public int isMvAnchor;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String mvId;

    @C09CT("name")
    public String name;

    @C09CT("user_count")
    public Long userCount;

    public final String getDesc() {
        return this.desc;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public final String getMvId() {
        return this.mvId;
    }

    public final String getName() {
        return this.name;
    }

    public final Long getUserCount() {
        return this.userCount;
    }

    public final boolean isCollected() {
        return this.isCollected;
    }

    public final int isMvAnchor() {
        return this.isMvAnchor;
    }

    public final void setCollected(boolean z) {
        this.isCollected = z;
    }

    public final void setDesc(String str) {
        this.desc = str;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setIconUrl(UrlModel urlModel) {
        this.iconUrl = urlModel;
    }

    public final void setMvAnchor(int i) {
        this.isMvAnchor = i;
    }

    public final void setMvId(String str) {
        this.mvId = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setUserCount(Long l) {
        this.userCount = l;
    }
}
