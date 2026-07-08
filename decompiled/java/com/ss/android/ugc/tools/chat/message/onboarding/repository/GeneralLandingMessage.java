package com.ss.android.ugc.tools.chat.message.onboarding.repository;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes.dex */
public final class GeneralLandingMessage {

    @C09CT("client_msg_id")
    public String clientMsgId;

    @C09CT("content")
    public final String content;

    @C09CT("content_pb")
    public final String contentPB;

    @C09CT("ext")
    public final String ext;

    @C09CT("msg_type")
    public final int msgType;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    public GeneralLandingMessage() {
        this("", 0, "", null, "", "");
    }

    public GeneralLandingMessage(String str, int i, String str2, String str3, String str4, String str5) {
        this.clientMsgId = str;
        this.msgType = i;
        this.scene = str2;
        this.contentPB = str3;
        this.content = str4;
        this.ext = str5;
    }
}
