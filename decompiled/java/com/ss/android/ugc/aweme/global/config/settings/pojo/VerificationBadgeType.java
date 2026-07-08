package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public class VerificationBadgeType {

    @C09CT("badge_type")
    public Integer badgeType = 1;

    @C09CT("action_type")
    public Integer actionType = 1;

    @C09CT("link")
    public String link = "";

    public Integer getActionType() {
        return this.actionType;
    }

    public Integer getBadgeType() {
        return this.badgeType;
    }

    public String getLink() {
        return this.link;
    }
}
