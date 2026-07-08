package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class RoomHealthScoreInfo {

    @C09CT("bubble_message")
    public String bubbleMessage;

    @C09CT("jump_url")
    public String jumpUrl;

    @C09CT("score")
    public Double score;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.score != null) {
            sb.append(", score=");
            sb.append(this.score);
        }
        if (this.bubbleMessage != null) {
            sb.append(", bubble_message=");
            sb.append(this.bubbleMessage);
        }
        if (this.jumpUrl != null) {
            sb.append(", jump_url=");
            sb.append(this.jumpUrl);
        }
        sb.replace(0, 2, "RoomHealthScoreInfo{");
        sb.append('}');
        return sb.toString();
    }
}
