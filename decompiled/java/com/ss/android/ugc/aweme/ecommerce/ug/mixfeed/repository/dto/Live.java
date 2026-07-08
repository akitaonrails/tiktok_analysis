package com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes30.dex */
public final class Live {

    @C09CT("author_id")
    public final String authorID;

    @C09CT("aweme_struct")
    public final String awemeStruct;

    @C09CT("room_id")
    public final String roomID;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final String status;

    public Live() {
        this(null, null, null, null);
    }

    public Live(String str, String str2, String str3, String str4) {
        this.roomID = str;
        this.status = str2;
        this.authorID = str3;
        this.awemeStruct = str4;
    }
}
