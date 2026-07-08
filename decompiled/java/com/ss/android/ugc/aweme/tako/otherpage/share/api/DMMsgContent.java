package com.ss.android.ugc.aweme.tako.otherpage.share.api;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class DMMsgContent {

    @C09CT("msg_content")
    public final String msgContent;

    @C09CT("note_starling")
    public final String noteStarling;

    @C09CT("open_schema")
    public final String openSchema;

    @C09CT("title_starling")
    public final String titleStarling;

    @C09CT("user_name")
    public final String userName;

    public DMMsgContent() {
        this("", "", "", "", "");
    }

    public DMMsgContent(String str, String str2, String str3, String str4, String str5) {
        this.msgContent = str;
        this.noteStarling = str2;
        this.openSchema = str3;
        this.titleStarling = str4;
        this.userName = str5;
    }
}
