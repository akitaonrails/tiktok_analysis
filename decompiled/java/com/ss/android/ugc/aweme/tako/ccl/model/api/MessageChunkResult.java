package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.tako.ccl.model.conversation.ConversationInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class MessageChunkResult extends TakoBaseResponse {

    @C09CT("answer_index")
    public final int answerIndex;

    @C09CT("chunk_index")
    public final int chunkIndex;

    @C09CT("entity_intro")
    public final EntityIntro entityIntro;

    @C09CT("event")
    public final int event;

    @C09CT("msg_content_patch")
    public final MessagePatch messagePatch;

    @C09CT("msg")
    public final Message messages;

    @C09CT("multi_answer_degrade")
    public final boolean multiAnswerDegrade;

    @C09CT("multi_answer_upgrade")
    public final boolean multiAnswerUpgrade;

    @C09CT("questionnaire")
    public final TakoQuestionnaire questionnaire;

    @C09CT("server_process_info")
    public final ServerProcessInfo serverProcessInfo;

    @C09CT("stream_time")
    public final long streamTime;

    @C09CT("sub_conv_info")
    public final ConversationInfo subConversationInfo;

    @C09CT("sug")
    public final TakoSug sug;

    public MessageChunkResult() {
        this(0, null, null, null, null, 0, 0L, null, null, null, 0, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageChunkResult)) {
            return false;
        }
        MessageChunkResult messageChunkResult = (MessageChunkResult) obj;
        return this.event == messageChunkResult.event && Intrinsics.LJFF(this.messages, messageChunkResult.messages) && Intrinsics.LJFF(this.messagePatch, messageChunkResult.messagePatch) && Intrinsics.LJFF(this.sug, messageChunkResult.sug) && Intrinsics.LJFF(this.entityIntro, messageChunkResult.entityIntro) && this.chunkIndex == messageChunkResult.chunkIndex && this.streamTime == messageChunkResult.streamTime && Intrinsics.LJFF(this.serverProcessInfo, messageChunkResult.serverProcessInfo) && Intrinsics.LJFF(this.questionnaire, messageChunkResult.questionnaire) && Intrinsics.LJFF(this.subConversationInfo, messageChunkResult.subConversationInfo) && this.answerIndex == messageChunkResult.answerIndex && this.multiAnswerUpgrade == messageChunkResult.multiAnswerUpgrade && this.multiAnswerDegrade == messageChunkResult.multiAnswerDegrade;
    }

    public final int hashCode() {
        int i = this.event * 31;
        Message message = this.messages;
        int iHashCode = (i + (message == null ? 0 : message.hashCode())) * 31;
        MessagePatch messagePatch = this.messagePatch;
        int iHashCode2 = (iHashCode + (messagePatch == null ? 0 : messagePatch.hashCode())) * 31;
        TakoSug takoSug = this.sug;
        int iHashCode3 = (iHashCode2 + (takoSug == null ? 0 : takoSug.hashCode())) * 31;
        EntityIntro entityIntro = this.entityIntro;
        int iHashCode4 = (((((iHashCode3 + (entityIntro == null ? 0 : entityIntro.hashCode())) * 31) + this.chunkIndex) * 31) + C786410Ut5.Y2(this.streamTime)) * 31;
        ServerProcessInfo serverProcessInfo = this.serverProcessInfo;
        int iHashCode5 = (iHashCode4 + (serverProcessInfo == null ? 0 : serverProcessInfo.hashCode())) * 31;
        TakoQuestionnaire takoQuestionnaire = this.questionnaire;
        int iHashCode6 = (iHashCode5 + (takoQuestionnaire == null ? 0 : takoQuestionnaire.hashCode())) * 31;
        ConversationInfo conversationInfo = this.subConversationInfo;
        return ((((((iHashCode6 + (conversationInfo != null ? conversationInfo.hashCode() : 0)) * 31) + this.answerIndex) * 31) + C786410Ut5.Z2(this.multiAnswerUpgrade)) * 31) + C786410Ut5.Z2(this.multiAnswerDegrade);
    }

    public final String toString() {
        return "MessageChunkResult(event=" + this.event + ", messages=" + this.messages + ", messagePatch=" + this.messagePatch + ", sug=" + this.sug + ", entityIntro=" + this.entityIntro + ", chunkIndex=" + this.chunkIndex + ", streamTime=" + this.streamTime + ", serverProcessInfo=" + this.serverProcessInfo + ", questionnaire=" + this.questionnaire + ", subConversationInfo=" + this.subConversationInfo + ", answerIndex=" + this.answerIndex + ", multiAnswerUpgrade=" + this.multiAnswerUpgrade + ", multiAnswerDegrade=" + this.multiAnswerDegrade + ')';
    }

    public MessageChunkResult(int i, Message message, MessagePatch messagePatch, TakoSug takoSug, EntityIntro entityIntro, int i2, long j, ServerProcessInfo serverProcessInfo, TakoQuestionnaire takoQuestionnaire, ConversationInfo conversationInfo, int i3, boolean z, boolean z2) {
        super(null, 0, "");
        this.event = i;
        this.messages = message;
        this.messagePatch = messagePatch;
        this.sug = takoSug;
        this.entityIntro = entityIntro;
        this.chunkIndex = i2;
        this.streamTime = j;
        this.serverProcessInfo = serverProcessInfo;
        this.questionnaire = takoQuestionnaire;
        this.subConversationInfo = conversationInfo;
        this.answerIndex = i3;
        this.multiAnswerUpgrade = z;
        this.multiAnswerDegrade = z2;
    }
}
