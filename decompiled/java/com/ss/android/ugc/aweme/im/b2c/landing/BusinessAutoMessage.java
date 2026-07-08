package com.ss.android.ugc.aweme.im.b2c.landing;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes3.dex */
public final class BusinessAutoMessage {

    @C09CT("client_msg_id")
    public String clientMsgId;

    @C09CT("content")
    public final String content;

    @C09CT("content_pb")
    public final String contentPB;

    @C09CT("ext")
    public final String ext;

    @C09CT("strategy")
    public final LandingMsgStrategy messageStrategy;

    @C09CT("msg_type")
    public final int msgType;

    @C09CT("biz_persistent_extra")
    public final String persistentExtra;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    public BusinessAutoMessage() {
        this("", 0, "", null, "", null, "", "");
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BusinessAutoMessage(clientMsgId=");
        sbLIZ.append(this.clientMsgId);
        sbLIZ.append(", msgType=");
        sbLIZ.append(this.msgType);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(", contentPB=");
        sbLIZ.append(this.contentPB);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", messageStrategy=");
        sbLIZ.append(this.messageStrategy);
        sbLIZ.append(", ext=");
        sbLIZ.append(this.ext);
        sbLIZ.append(", persistentExtra=");
        sbLIZ.append(this.persistentExtra);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static BusinessAutoMessage LIZ(BusinessAutoMessage businessAutoMessage, String str, String str2) {
        return new BusinessAutoMessage(str, businessAutoMessage.msgType, businessAutoMessage.scene, businessAutoMessage.contentPB, businessAutoMessage.content, businessAutoMessage.messageStrategy, str2, businessAutoMessage.persistentExtra);
    }

    public BusinessAutoMessage(String str, int i, String str2, String str3, String str4, LandingMsgStrategy landingMsgStrategy, String str5, String str6) {
        this.clientMsgId = str;
        this.msgType = i;
        this.scene = str2;
        this.contentPB = str3;
        this.content = str4;
        this.messageStrategy = landingMsgStrategy;
        this.ext = str5;
        this.persistentExtra = str6;
    }
}
