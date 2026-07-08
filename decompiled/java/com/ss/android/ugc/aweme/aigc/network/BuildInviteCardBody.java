package com.ss.android.ugc.aweme.aigc.network;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class BuildInviteCardBody {

    @C09CT("business")
    public final String businessScene;

    @C09CT("extra")
    public final Map<String, Object> extra;

    @C09CT("invite_user_id")
    public final Long receiverUid;

    public BuildInviteCardBody() {
        this(null, null, null);
    }

    public BuildInviteCardBody(Long l, String str, Map<String, Object> map) {
        this.receiverUid = l;
        this.businessScene = str;
        this.extra = map;
    }
}
