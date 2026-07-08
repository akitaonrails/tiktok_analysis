package com.ss.android.ugc.aweme.notice.repo;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class TutorialVideoInfo {

    @C09CT("button_caption")
    public final String button;

    @C09CT("deep_link")
    public final String deepLink;

    @C09CT("desc")
    public final String desc;

    @C09CT("icon")
    public final String icon;

    @C09CT("msg_id")
    public final String msgId;

    @C09CT("title")
    public final String title;

    public TutorialVideoInfo() {
        this("", "", "", "", "", "");
    }

    public TutorialVideoInfo(String str, String str2, String str3, String str4, String str5, String str6) {
        this.msgId = str;
        this.icon = str2;
        this.title = str3;
        this.desc = str4;
        this.button = str5;
        this.deepLink = str6;
    }
}
