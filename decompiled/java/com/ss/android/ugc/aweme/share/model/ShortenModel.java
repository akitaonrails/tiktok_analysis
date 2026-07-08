package com.ss.android.ugc.aweme.share.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;

/* JADX INFO: loaded from: classes.dex */
public final class ShortenModel {

    @C09CT("extra")
    public Extra extra;

    @C09CT("log_pb")
    public LogPbBean logPb;

    @C09CT("shorten_url")
    public String shortenUrl;

    @C09CT("status_code")
    public Integer statusCode;

    @C09CT("status_msg")
    public String statusMsg;

    public ShortenModel() {
        this("", null, null, null, null);
    }

    public ShortenModel(String str, Integer num, String str2, LogPbBean logPbBean, Extra extra) {
        this.shortenUrl = str;
        this.statusCode = num;
        this.statusMsg = str2;
        this.logPb = logPbBean;
        this.extra = extra;
    }
}
