package com.ss.android.ugc.aweme.feed.model.story;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class AvatarThoughtInfo implements Serializable {

    @C09CT("avatar_thought_primary_uri")
    public String avatarPrimaryUri;

    @C09CT("avatar_thought_primary_url_list")
    public List<String> avatarPrimaryUrlList;

    @C09CT("avatar_thought_secondary_uri")
    public String avatarSecondaryUri;

    @C09CT("avatar_thought_secondary_url_list")
    public List<String> avatarSecondaryUrlList;

    @C09CT("avatar_type")
    public Integer avatarType;

    public AvatarThoughtInfo() {
    }

    public AvatarThoughtInfo(Integer num, List<String> list, List<String> list2, String str, String str2) {
        this.avatarType = num;
        this.avatarPrimaryUrlList = list;
        this.avatarSecondaryUrlList = list2;
        this.avatarPrimaryUri = str;
        this.avatarSecondaryUri = str2;
    }
}
