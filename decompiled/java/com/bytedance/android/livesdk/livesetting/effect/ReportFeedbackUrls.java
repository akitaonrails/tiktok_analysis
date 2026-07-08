package com.bytedance.android.livesdk.livesetting.effect;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes13.dex */
public final class ReportFeedbackUrls {
    public static final TypeAdapter ADAPTER;

    @C09CT("creator")
    public String reportCreatorUrl;

    @C09CT("official")
    public String reportOfficialUrl;

    static {
        NormalGson.singleton();
        ADAPTER = new ReportFeedbackUrls_OptTypeAdapter();
    }

    public ReportFeedbackUrls() {
        this("", "");
    }

    public ReportFeedbackUrls(String str, String str2) {
        this.reportCreatorUrl = str;
        this.reportOfficialUrl = str2;
    }
}
