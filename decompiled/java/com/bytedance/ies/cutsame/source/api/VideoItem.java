package com.bytedance.ies.cutsame.source.api;

import X.C09CT;

/* JADX INFO: loaded from: classes4.dex */
public final class VideoItem {
    public String content;
    public String algorithm = "";

    @C09CT("video_conf")
    public String jsonResult = "";

    public final String getAlgorithm() {
        return this.algorithm;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getJsonResult() {
        return this.jsonResult;
    }

    public final void setAlgorithm(String str) {
        this.algorithm = str;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setJsonResult(String str) {
        this.jsonResult = str;
    }
}
