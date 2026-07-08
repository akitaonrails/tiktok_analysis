package com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class CreatorLastNewMessageResponse {

    @C09CT("avatar_url")
    public final String avatarUrl;

    @C09CT("last_preview_message")
    public final String lastMessage;

    @C09CT("last_new_message_time")
    public final Long lastMessageTime;

    @C09CT("need_bold")
    public final Boolean needBold;

    @C09CT("link_schema")
    public final String schema;

    @C09CT("entrance_show")
    public final Boolean showEntrance;

    @C09CT("title")
    public final String title;

    public CreatorLastNewMessageResponse(Boolean bool, String str, String str2, String str3, Boolean bool2, String str4, Long l) {
        this.showEntrance = bool;
        this.avatarUrl = str;
        this.title = str2;
        this.schema = str3;
        this.needBold = bool2;
        this.lastMessage = str4;
        this.lastMessageTime = l;
    }
}
