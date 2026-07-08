package com.ss.android.ugc.aweme.im.common.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class IMTiktokLinkRegexConfig {

    @C09CT("tiktok_domain_regex")
    public final String tiktokDomainRegex;

    @C09CT("tiktok_video_id_regex")
    public final String tiktokVideoIdRegex;

    public IMTiktokLinkRegexConfig() {
        this("(https:\\/\\/.*?\\.tiktok\\.com\\/[\\S]+)", "https:\\/\\/www\\.tiktok\\.com\\/@[^\\/]+\\/(?:video|photo)\\/(\\d+)");
    }

    public IMTiktokLinkRegexConfig(String str, String str2) {
        this.tiktokDomainRegex = str;
        this.tiktokVideoIdRegex = str2;
    }
}
