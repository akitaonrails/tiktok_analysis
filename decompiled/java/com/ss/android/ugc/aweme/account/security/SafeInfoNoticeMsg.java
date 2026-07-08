package com.ss.android.ugc.aweme.account.security;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class SafeInfoNoticeMsg {

    @C09CT("has_notice")
    public final boolean hasNotice;

    @C09CT("highlight")
    public final List<SafeInfoNoticeMsgHighlight> highlight;

    @C09CT("notice")
    public final String notice;

    @C09CT("notice_id_str")
    public final String noticeId;

    @C09CT("notice_model")
    public final String noticeModel;

    @C09CT("notice_type")
    public final String noticeType;

    @C09CT("scheme")
    public final String scheme;

    public SafeInfoNoticeMsg() {
        this("", "", null, false, "", "", "");
    }

    public SafeInfoNoticeMsg(String str, String str2, List<SafeInfoNoticeMsgHighlight> list, boolean z, String str3, String str4, String str5) {
        this.noticeId = str;
        this.notice = str2;
        this.highlight = list;
        this.hasNotice = z;
        this.noticeType = str3;
        this.noticeModel = str4;
        this.scheme = str5;
    }
}
