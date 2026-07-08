package com.ss.android.ugc.aweme.aigc;

import X.C09CT;

/* JADX INFO: loaded from: classes12.dex */
public final class AigcLabelH5Url {

    @C09CT("appeal_page_url")
    public final String appealPageUrl;

    @C09CT("introduce_page_url")
    public final String introducePageUrl;

    public AigcLabelH5Url() {
        this("https://www.tiktok.com/falcon/communitysafety/page/violation-appeal/index.html", "https://www.tiktok.com/tns-inapp/pages/ai-generated-content");
    }

    public AigcLabelH5Url(String str, String str2) {
        this.appealPageUrl = str;
        this.introducePageUrl = str2;
    }
}
