package com.ss.android.ugc.aweme.internalshare.impl.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class UnselectedUserStruct implements Serializable {

    @C09CT("chat_type")
    public final String chatType;

    @C09CT("follow_status")
    public final Integer followStatus;

    @C09CT("item_id")
    public final String itemId;

    @C09CT("rank_num")
    public final Integer rankNum;

    public UnselectedUserStruct(String str, String str2, Integer num, Integer num2) {
        this.itemId = str;
        this.chatType = str2;
        this.rankNum = num;
        this.followStatus = num2;
    }
}
