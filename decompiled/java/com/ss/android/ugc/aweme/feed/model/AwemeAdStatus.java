package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes2.dex */
public class AwemeAdStatus extends BaseResponse {

    @C09CT("ad_exist")
    public boolean adExist;

    @C09CT("ad_id")
    public String adId;

    @C09CT("pass")
    public boolean pass;

    @C09CT("url")
    public String url;

    public String getAdId() {
        return this.adId;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isAdExist() {
        return this.adExist;
    }

    public boolean isPass() {
        return this.pass;
    }

    public void setAdExist(boolean z) {
        this.adExist = z;
    }

    public void setAdId(String str) {
        this.adId = str;
    }

    public void setPass(boolean z) {
        this.pass = z;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
