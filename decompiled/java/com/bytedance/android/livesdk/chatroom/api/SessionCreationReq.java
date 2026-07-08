package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public final class SessionCreationReq {

    @C09CT("extra")
    public String extraJsonString;

    @C09CT("item_id")
    public Long itemId;

    @C09CT("item_type")
    public Long itemType;

    @C09CT("organization_id")
    public String organizationId;

    @C09CT("sec_uid")
    public String secUid;

    public SessionCreationReq(String str, Long l, Long l2, String str2, String str3) {
        this.organizationId = str;
        this.itemType = l;
        this.itemId = l2;
        this.secUid = str2;
        this.extraJsonString = str3;
    }
}
