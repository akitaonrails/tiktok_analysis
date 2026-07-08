package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class FeedbackRequest {

    @C09CT("check_message_status_code")
    public final Integer checkMessageStatusCode;

    @C09CT("content")
    public final String content;

    @C09CT("content_pb")
    public final String contentPb;

    @C09CT("conv_id")
    public final String convId;

    @C09CT("decision_rule_id")
    public final String decisionRuleId;

    @C09CT("msg_type")
    public final String msgType;

    @C09CT("msg_id")
    public final String msgUUID;

    @C09CT("receiver_uid")
    public final Long receiverUid;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("sending_ban_messages")
    public final List<SendingBanMessage> sendingBanMessages;

    @C09CT("server_msg_id")
    public final String serverMsgId;

    @C09CT("conv_short_id")
    public final Long shortConversationId;

    @C09CT("template_scene")
    public final String templateScene;

    public FeedbackRequest(String str, String str2, Long l, String str3, String str4, Long l2, String str5, String str6, String str7, String str8, List<SendingBanMessage> list, Integer num, String str9) {
        this.msgType = str;
        this.convId = str2;
        this.shortConversationId = l;
        this.scene = str3;
        this.content = str4;
        this.receiverUid = l2;
        this.msgUUID = str5;
        this.serverMsgId = str6;
        this.contentPb = str7;
        this.templateScene = str8;
        this.sendingBanMessages = list;
        this.checkMessageStatusCode = num;
        this.decisionRuleId = str9;
    }
}
