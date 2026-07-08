package com.ss.android.ugc.aweme.base.share;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class RocketFansGroupInfo implements Serializable {

    @C09CT("download_url")
    public String downloadUrl;

    @C09CT("schema")
    public String schema;

    @C09CT("token")
    public String token;

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getToken() {
        return this.token;
    }

    public void setDownloadUrl(String str) {
        this.downloadUrl = str;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setToken(String str) {
        this.token = str;
    }
}
