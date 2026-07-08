package com.ss.android.ugc.aweme.tools.mvtemplate.net;

import X.C09CT;

/* JADX INFO: loaded from: classes9.dex */
public final class AfrData {
    public static final int $stable = 8;
    public String algorithm = "";

    @C09CT("pic_conf")
    public String jsonResult = "";

    /* JADX INFO: renamed from: pic, reason: collision with root package name */
    public String f424pic;

    public final String getAlgorithm() {
        return this.algorithm;
    }

    public final String getJsonResult() {
        return this.jsonResult;
    }

    public final String getPic() {
        return this.f424pic;
    }

    public final void setAlgorithm(String str) {
        this.algorithm = str;
    }

    public final void setJsonResult(String str) {
        this.jsonResult = str;
    }

    public final void setPic(String str) {
        this.f424pic = str;
    }
}
