package com.ss.android.ugc.aweme.account.login.chooseaccount;

import X.C09CT;

/* JADX INFO: loaded from: classes26.dex */
public final class AuthorizedOrgAccountInfo {

    @C09CT("avatar_url")
    public final String avatarUrl;

    @C09CT("display_entity_info")
    public final String displayEntityInfo;

    @C09CT("domain")
    public final String domain;

    @C09CT("is_in_c2b_intermediate_period")
    public final boolean isInC2B;

    @C09CT("nickname")
    public final String nickname;

    @C09CT("trial_tag_type")
    public final int trialTagType;

    @C09CT("user_id_str")
    public final String userIdStr;

    @C09CT("username")
    public final String username;

    public AuthorizedOrgAccountInfo() {
        this("", "", "", "", "", "", false, 0);
    }

    public AuthorizedOrgAccountInfo(String str, String str2, String str3, String str4, String str5, String str6, boolean z, int i) {
        this.userIdStr = str;
        this.username = str2;
        this.nickname = str3;
        this.displayEntityInfo = str4;
        this.domain = str5;
        this.avatarUrl = str6;
        this.isInC2B = z;
        this.trialTagType = i;
    }
}
