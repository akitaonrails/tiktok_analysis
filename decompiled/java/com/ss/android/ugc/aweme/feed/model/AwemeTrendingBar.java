package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C830490Whz;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class AwemeTrendingBar implements Serializable {

    @C09CT("display")
    public String display;

    @C09CT("event_keyword")
    public String eventKeyword;

    @C09CT("event_keyword_id")
    public long eventKeywordId;

    @C09CT("event_tracking_param")
    public String eventTrackingParam;

    @C09CT("icon_url")
    public UrlModel iconUrl;

    @C09CT("schema")
    public String schema;

    public AwemeTrendingBar() {
        this(new UrlModel(), "", "", 0L, "", "");
    }

    public final Map<String, String> getTrackMap() {
        C830490Whz c830490Whz = new C830490Whz();
        try {
            for (Map.Entry entry : ((HashMap) new Gson().LJII(this.eventTrackingParam, HashMap.class)).entrySet()) {
                c830490Whz.put(entry.getKey().toString(), entry.getValue().toString());
            }
            return c830490Whz;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new C830490Whz();
        }
    }

    public final void setDisplay(String str) {
        this.display = str;
    }

    public final void setEventKeyword(String str) {
        this.eventKeyword = str;
    }

    public final void setEventKeywordId(long j) {
        this.eventKeywordId = j;
    }

    public final void setEventTrackingParam(String str) {
        this.eventTrackingParam = str;
    }

    public final void setIconUrl(UrlModel urlModel) {
        this.iconUrl = urlModel;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }

    public AwemeTrendingBar(UrlModel urlModel, String str, String str2, long j, String str3, String str4) {
        this.iconUrl = urlModel;
        this.display = str;
        this.schema = str2;
        this.eventKeywordId = j;
        this.eventKeyword = str3;
        this.eventTrackingParam = str4;
    }
}
