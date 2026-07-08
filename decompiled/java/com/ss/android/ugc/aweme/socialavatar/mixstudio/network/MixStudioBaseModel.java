package com.ss.android.ugc.aweme.socialavatar.mixstudio.network;

import X.C09CT;

/* JADX INFO: loaded from: classes7.dex */
public final class MixStudioBaseModel {

    @C09CT("avatar_uri")
    public final String avatarUri;

    @C09CT("id_type")
    public final int idType;

    @C09CT("social_avatar_task_id")
    public final String saTaskId;

    @C09CT("static_task_id")
    public final String staticTaskId;

    @C09CT("uid")
    public final Long uid;

    public MixStudioBaseModel() {
        this(null, null, null, null, 0);
    }

    public MixStudioBaseModel(String str, String str2, Long l, String str3, int i) {
        this.saTaskId = str;
        this.staticTaskId = str2;
        this.uid = l;
        this.avatarUri = str3;
        this.idType = i;
    }
}
