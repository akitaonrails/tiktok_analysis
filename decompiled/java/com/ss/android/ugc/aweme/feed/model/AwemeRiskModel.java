package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import android.text.TextUtils;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class AwemeRiskModel implements Serializable {

    @C09CT("content")
    public String content;

    @C09CT("notice")
    public boolean notice;

    @C09CT("risk_sink")
    public boolean riskSink;

    @C09CT("type")
    public int type;

    @C09CT("url")
    public String url;

    @C09CT("warn")
    public boolean warn;

    public String getContent() {
        return TextUtils.isEmpty(this.content) ? "" : this.content;
    }

    public int getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isNotice() {
        return this.notice;
    }

    public boolean isRiskSink() {
        return this.riskSink;
    }

    public boolean isWarn() {
        return this.warn;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setNotice(boolean z) {
        this.notice = z;
    }

    public void setRiskSink(boolean z) {
        this.riskSink = z;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setWarn(boolean z) {
        this.warn = z;
    }
}
