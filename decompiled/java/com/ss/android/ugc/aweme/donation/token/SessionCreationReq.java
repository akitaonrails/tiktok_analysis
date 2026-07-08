package com.ss.android.ugc.aweme.donation.token;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class SessionCreationReq {

    @C09CT("extra")
    public String extraJsonString;

    @C09CT("item_id")
    public Long itemId;

    @C09CT("item_type")
    public Integer itemType;

    @C09CT("organization_id")
    public String organizationId;

    @C09CT("sec_uid")
    public String secUid;

    public SessionCreationReq(String str, Integer num, Long l, String str2, String str3) {
        this.organizationId = str;
        this.itemType = num;
        this.itemId = l;
        this.secUid = str2;
        this.extraJsonString = str3;
    }
}
