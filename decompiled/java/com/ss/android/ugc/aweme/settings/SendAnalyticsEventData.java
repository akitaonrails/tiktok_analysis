package com.ss.android.ugc.aweme.settings;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class SendAnalyticsEventData {

    @C09CT("base_url")
    public final String baseUrl;

    @C09CT("whitelist_path")
    public final List<String> whiteList;

    public SendAnalyticsEventData() {
        this("", null);
    }

    public SendAnalyticsEventData(String str, List<String> list) {
        this.baseUrl = str;
        this.whiteList = list;
    }
}
