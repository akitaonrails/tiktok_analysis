package com.ss.android.ugc.profile.business.ad.platform;

import X.C09CT;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;

/* JADX INFO: loaded from: classes20.dex */
public final class BioDownloadData extends BizBaseData {
    public static final int $stable = 8;

    @C09CT("android_download_app_link")
    public String androidDownloadAppLink;

    public final String getAndroidDownloadAppLink() {
        return this.androidDownloadAppLink;
    }

    public final void setAndroidDownloadAppLink(String str) {
        this.androidDownloadAppLink = str;
    }
}
