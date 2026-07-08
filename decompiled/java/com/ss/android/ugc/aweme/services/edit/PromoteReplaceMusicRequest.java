package com.ss.android.ugc.aweme.services.edit;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class PromoteReplaceMusicRequest {

    @C09CT("item_id")
    public String itemID = "";

    @C09CT("original_music_id")
    public String originalMusicID = "";

    @C09CT("replace_music_request")
    public ReplaceMusicRequest replaceMusicRequest = new ReplaceMusicRequest();

    @C09CT("request_from")
    public String requestFrom = "";

    @C09CT("retry_scene")
    public int retryScene;

    public final String getItemID() {
        return this.itemID;
    }

    public final String getOriginalMusicID() {
        return this.originalMusicID;
    }

    public final ReplaceMusicRequest getReplaceMusicRequest() {
        return this.replaceMusicRequest;
    }

    public final String getRequestFrom() {
        return this.requestFrom;
    }

    public final int getRetryScene() {
        return this.retryScene;
    }

    public final void setItemID(String str) {
        this.itemID = str;
    }

    public final void setOriginalMusicID(String str) {
        this.originalMusicID = str;
    }

    public final void setReplaceMusicRequest(ReplaceMusicRequest replaceMusicRequest) {
        this.replaceMusicRequest = replaceMusicRequest;
    }

    public final void setRequestFrom(String str) {
        this.requestFrom = str;
    }

    public final void setRetryScene(int i) {
        this.retryScene = i;
    }
}
