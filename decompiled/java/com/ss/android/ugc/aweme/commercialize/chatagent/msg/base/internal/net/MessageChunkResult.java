package com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.internal.net;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.CommerceAgentSug;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.Message;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.MessagePatch;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class MessageChunkResult extends CommerceAgentBaseResponse {

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

    @C09CT("server_process_info")
    public final ServerProcessInfo serverProcessInfo;

    @C09CT("stream_time")
    public final long streamTime;

    @C09CT("sug")
    public final CommerceAgentSug sug;

    public MessageChunkResult() {
        this(0, null, null, null, null, 0, 0L, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageChunkResult)) {
            return false;
        }
        MessageChunkResult messageChunkResult = (MessageChunkResult) obj;
        return this.event == messageChunkResult.event && Intrinsics.LJFF(this.messages, messageChunkResult.messages) && Intrinsics.LJFF(this.messagePatch, messageChunkResult.messagePatch) && Intrinsics.LJFF(this.sug, messageChunkResult.sug) && Intrinsics.LJFF(this.entityIntro, messageChunkResult.entityIntro) && this.chunkIndex == messageChunkResult.chunkIndex && this.streamTime == messageChunkResult.streamTime && Intrinsics.LJFF(this.serverProcessInfo, messageChunkResult.serverProcessInfo);
    }

    public final int hashCode() {
        int i = this.event * 31;
        Message message = this.messages;
        int iHashCode = (i + (message == null ? 0 : message.hashCode())) * 31;
        MessagePatch messagePatch = this.messagePatch;
        int iHashCode2 = (iHashCode + (messagePatch == null ? 0 : messagePatch.hashCode())) * 31;
        CommerceAgentSug commerceAgentSug = this.sug;
        int iHashCode3 = (iHashCode2 + (commerceAgentSug == null ? 0 : commerceAgentSug.hashCode())) * 31;
        EntityIntro entityIntro = this.entityIntro;
        int iHashCode4 = (((((iHashCode3 + (entityIntro == null ? 0 : entityIntro.hashCode())) * 31) + this.chunkIndex) * 31) + C786410Ut5.Y2(this.streamTime)) * 31;
        ServerProcessInfo serverProcessInfo = this.serverProcessInfo;
        return iHashCode4 + (serverProcessInfo != null ? serverProcessInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageChunkResult(event=");
        sbLIZ.append(this.event);
        sbLIZ.append(", messages=");
        sbLIZ.append(this.messages);
        sbLIZ.append(", messagePatch=");
        sbLIZ.append(this.messagePatch);
        sbLIZ.append(", sug=");
        sbLIZ.append(this.sug);
        sbLIZ.append(", entityIntro=");
        sbLIZ.append(this.entityIntro);
        sbLIZ.append(", chunkIndex=");
        sbLIZ.append(this.chunkIndex);
        sbLIZ.append(", streamTime=");
        sbLIZ.append(this.streamTime);
        sbLIZ.append(", serverProcessInfo=");
        sbLIZ.append(this.serverProcessInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MessageChunkResult(int i, Message message, MessagePatch messagePatch, CommerceAgentSug commerceAgentSug, EntityIntro entityIntro, int i2, long j, ServerProcessInfo serverProcessInfo) {
        super(null, 0, "");
        this.event = i;
        this.messages = message;
        this.messagePatch = messagePatch;
        this.sug = commerceAgentSug;
        this.entityIntro = entityIntro;
        this.chunkIndex = i2;
        this.streamTime = j;
        this.serverProcessInfo = serverProcessInfo;
    }
}
