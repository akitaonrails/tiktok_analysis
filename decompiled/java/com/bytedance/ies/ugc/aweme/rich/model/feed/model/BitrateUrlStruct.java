package com.bytedance.ies.ugc.aweme.rich.model.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes24.dex */
public final class BitrateUrlStruct implements Serializable {

    @C09CT("backup_url")
    public String backupUrl;

    @C09CT("fallback_url")
    public String fallbackUrl;

    @C09CT("main_url")
    public String mainUrl;

    public final String getBackupUrl() {
        return this.backupUrl;
    }

    public final String getFallbackUrl() {
        return this.fallbackUrl;
    }

    public final String getMainUrl() {
        return this.mainUrl;
    }

    public final void setBackupUrl(String str) {
        this.backupUrl = str;
    }

    public final void setFallbackUrl(String str) {
        this.fallbackUrl = str;
    }

    public final void setMainUrl(String str) {
        this.mainUrl = str;
    }
}
