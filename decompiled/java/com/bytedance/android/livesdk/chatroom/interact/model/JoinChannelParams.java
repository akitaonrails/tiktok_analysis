package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes.dex */
public final class JoinChannelParams {

    @C09CT("channel_id")
    public Long channelId;

    @C09CT(Scene.SCENE_SERVICE)
    public Long scene;

    @C09CT("transparent_extra")
    public String transparentExtra;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.channelId != null) {
            sb.append(", channel_id=");
            sb.append(this.channelId);
        }
        if (this.scene != null) {
            sb.append(", scene=");
            sb.append(this.scene);
        }
        if (this.transparentExtra != null) {
            sb.append(", transparent_extra=");
            sb.append(this.transparentExtra);
        }
        sb.replace(0, 2, "JoinChannelParams{");
        sb.append('}');
        return sb.toString();
    }
}
