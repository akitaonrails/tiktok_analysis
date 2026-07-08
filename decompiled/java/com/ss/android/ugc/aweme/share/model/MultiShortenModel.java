package com.ss.android.ugc.aweme.share.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class MultiShortenModel {

    @C09CT("extra")
    public Extra extra;

    @C09CT("log_pb")
    public LogPbBean logPb;

    @C09CT("shorten_urls")
    public List<ShortenURLInfo> shortenUrls;

    @C09CT("status_code")
    public Integer statusCode;

    @C09CT("status_msg")
    public String statusMsg;

    public MultiShortenModel() {
        this(new ArrayList(), null, null, null, null);
    }

    public MultiShortenModel(List<ShortenURLInfo> list, Integer num, String str, LogPbBean logPbBean, Extra extra) {
        this.shortenUrls = list;
        this.statusCode = num;
        this.statusMsg = str;
        this.logPb = logPbBean;
        this.extra = extra;
    }
}
