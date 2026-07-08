package com.bytedance.ies.cutsame.source.api;

import X.C09CT;

/* JADX INFO: loaded from: classes4.dex */
public final class AfrData {
    public String algorithm = "";

    @C09CT("pic_conf")
    public String jsonResult = "";

    /* JADX INFO: renamed from: pic, reason: collision with root package name */
    public String f330pic;

    public final String getAlgorithm() {
        return this.algorithm;
    }

    public final String getJsonResult() {
        return this.jsonResult;
    }

    public final String getPic() {
        return this.f330pic;
    }

    public final void setAlgorithm(String str) {
        this.algorithm = str;
    }

    public final void setJsonResult(String str) {
        this.jsonResult = str;
    }

    public final void setPic(String str) {
        this.f330pic = str;
    }
}
