package com.ss.android.ugc.aweme.tako.ccl.net;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.scene.Scene;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class AudioAuthRequest {

    @C09CT("conversation_id")
    public final String conversationId;

    @C09CT(Scene.SCENE_SERVICE)
    public final int scene;

    @C09CT("sub_conv_id")
    public final String subConversationId;

    public AudioAuthRequest() {
        this("", null, 2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioAuthRequest)) {
            return false;
        }
        AudioAuthRequest audioAuthRequest = (AudioAuthRequest) obj;
        return Intrinsics.LJFF(this.conversationId, audioAuthRequest.conversationId) && Intrinsics.LJFF(this.subConversationId, audioAuthRequest.subConversationId) && this.scene == audioAuthRequest.scene;
    }

    public final int hashCode() {
        int iHashCode = this.conversationId.hashCode() * 31;
        String str = this.subConversationId;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.scene;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AudioAuthRequest(conversationId=");
        sbLIZ.append(this.conversationId);
        sbLIZ.append(", subConversationId=");
        sbLIZ.append(this.subConversationId);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AudioAuthRequest(String str, String str2, int i) {
        this.conversationId = str;
        this.subConversationId = str2;
        this.scene = i;
    }
}
