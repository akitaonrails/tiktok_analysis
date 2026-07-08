package com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api;

import X.C00EH;
import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import X.C321050CiF;
import X.C321070CiH;
import X.C786410Ut5;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class Message {
    public final boolean LIZ;
    public boolean LIZIZ;
    public int LIZJ;
    public final List<Integer> LIZLLL;
    public long LJ;
    public int LJFF;
    public final int LJI;
    public final Map<String, ? extends Object> LJII;
    public long LJIIIIZZ;
    public final Boolean LJIIIZ;
    public C321070CiH LJIIJ;
    public final Map<String, Object> LJIIJJI;
    public final Boolean LJIIL;
    public Boolean LJIILIIL;
    public CommerceAgentMixFeed LJIILJJIL;

    @C09CT("action_id")
    public long actionId;

    @C09CT("bot_id")
    public long botId;

    @C09CT("msg_channel")
    public final int channel;

    @C09CT("conversation_id")
    public String conversationId;

    @C09CT("ext")
    public final MessageExt ext;

    @C09CT("gen_style")
    public int genStyle;

    @C09CT("msg_intercept_type")
    public final C00EH interceptType;

    @C09CT("is_hidden")
    public boolean isHidden;

    @C09CT("msg_content")
    public String msgContent;

    @C09CT("msg_id")
    public String msgId;

    @C09CT("msg_type")
    public int msgType;

    @C09CT("reply_msg_id")
    public String replyMsgId;

    @C09CT("reply_uuid")
    public String replyUuid;

    @C09CT("sender")
    public MessageSender sender;

    @C09CT("server_seq")
    public long serverSeq;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int serverStatus;

    @C09CT("server_time")
    public final long serverTime;

    @C09CT("session_id")
    public String sessionId;

    @C09CT("sub_session_id")
    public String subSessionId;

    @C09CT("uuid")
    public String uuid;

    @C09CT("version")
    public final int version;

    @C09CT("version_id")
    public String versionId;

    @C09CT("version_seq_id")
    public long versionSeqId;

    public Message() {
        this(null, null, null, null, null, null, 0L, 0L, null, 0, null, null, null, 0L, 0L, 0, 0, 0, null, 0, null, 0L, false, false, false, 0, null, 0L, 0, 0, null, 0L, null, null, null, null, null, -1, 31, null);
    }

    public final int hashCode() {
        int iHashCode = ((((this.msgId.hashCode() * 31) + this.replyUuid.hashCode()) * 31) + this.replyMsgId.hashCode()) * 31;
        MessageSender messageSender = this.sender;
        int iHashCode2 = (((((((((((((((((iHashCode + (messageSender == null ? 0 : messageSender.hashCode())) * 31) + this.conversationId.hashCode()) * 31) + this.subSessionId.hashCode()) * 31) + C786410Ut5.Y2(this.actionId)) * 31) + C786410Ut5.Y2(this.botId)) * 31) + this.uuid.hashCode()) * 31) + this.msgType) * 31) + this.msgContent.hashCode()) * 31) + this.sessionId.hashCode()) * 31;
        MessageExt messageExt = this.ext;
        int iHashCode3 = (((((((((((iHashCode2 + (messageExt == null ? 0 : messageExt.hashCode())) * 31) + C786410Ut5.Y2(this.serverTime)) * 31) + C786410Ut5.Y2(this.serverSeq)) * 31) + this.version) * 31) + this.serverStatus) * 31) + this.channel) * 31;
        C00EH c00eh = this.interceptType;
        int iHashCode4 = (((((((((((((((((((((((((((iHashCode3 + (c00eh == null ? 0 : c00eh.hashCode())) * 31) + this.genStyle) * 31) + this.versionId.hashCode()) * 31) + C786410Ut5.Y2(this.versionSeqId)) * 31) + C786410Ut5.Z2(this.isHidden)) * 31) + C786410Ut5.Z2(this.LIZ)) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + this.LJFF) * 31) + this.LJI) * 31) + this.LJII.hashCode()) * 31) + C786410Ut5.Y2(this.LJIIIIZZ)) * 31;
        Boolean bool = this.LJIIIZ;
        int iHashCode5 = (((((iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31) + this.LJIIJ.hashCode()) * 31) + this.LJIIJJI.hashCode()) * 31;
        Boolean bool2 = this.LJIIL;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.LJIILIIL;
        return iHashCode6 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final Message LIZ() {
        Message message = new Message(this.msgId, this.replyUuid, this.replyMsgId, this.sender, this.conversationId, this.subSessionId, this.actionId, this.botId, this.uuid, this.msgType, this.msgContent, this.sessionId, this.ext, this.serverTime, this.serverSeq, this.version, this.serverStatus, this.channel, this.interceptType, this.genStyle, this.versionId, this.versionSeqId, this.isHidden, this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL);
        message.LJIILJJIL = LIZIZ();
        return message;
    }

    public final CommerceAgentMixFeed LIZIZ() {
        CommerceAgentMixFeed commerceAgentMixFeed = this.LJIILJJIL;
        if (commerceAgentMixFeed != null) {
            return commerceAgentMixFeed;
        }
        CommerceAgentMixFeed commerceAgentMixFeedLIZ = C321050CiF.LIZ(this.msgContent);
        this.LJIILJJIL = commerceAgentMixFeedLIZ;
        return commerceAgentMixFeedLIZ;
    }

    public Message(String str, String str2, String str3, MessageSender messageSender, String str4, String str5, long j, long j2, String str6, int i, String str7, String str8, MessageExt messageExt, long j3, long j4, int i2, int i3, int i4, C00EH c00eh, int i5, String str9, long j5, boolean z, boolean z2, boolean z3, int i6, List<Integer> list, long j6, int i7, int i8, Map<String, ? extends Object> map, long j7, Boolean bool, C321070CiH c321070CiH, Map<String, Object> map2, Boolean bool2, Boolean bool3) {
        this.msgId = str;
        this.replyUuid = str2;
        this.replyMsgId = str3;
        this.sender = messageSender;
        this.conversationId = str4;
        this.subSessionId = str5;
        this.actionId = j;
        this.botId = j2;
        this.uuid = str6;
        this.msgType = i;
        this.msgContent = str7;
        this.sessionId = str8;
        this.ext = messageExt;
        this.serverTime = j3;
        this.serverSeq = j4;
        this.version = i2;
        this.serverStatus = i3;
        this.channel = i4;
        this.interceptType = c00eh;
        this.genStyle = i5;
        this.versionId = str9;
        this.versionSeqId = j5;
        this.isHidden = z;
        this.LIZ = z2;
        this.LIZIZ = z3;
        this.LIZJ = i6;
        this.LIZLLL = list;
        this.LJ = j6;
        this.LJFF = i7;
        this.LJI = i8;
        this.LJII = map;
        this.LJIIIIZZ = j7;
        this.LJIIIZ = bool;
        this.LJIIJ = c321070CiH;
        this.LJIIJJI = map2;
        this.LJIIL = bool2;
        this.LJIILIIL = bool3;
    }

    public Message(String str, String str2, String str3, MessageSender messageSender, String str4, String str5, long j, long j2, String str6, int i, String str7, String str8, MessageExt messageExt, long j3, long j4, int i2, int i3, int i4, C00EH c00eh, int i5, String str9, long j5, boolean z, boolean z2, boolean z3, int i6, List list, long j6, int i7, int i8, Map map, long j7, Boolean bool, C321070CiH c321070CiH, Map map2, Boolean bool2, Boolean bool3, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? "" : str, (i9 & 2) != 0 ? "" : str2, (i9 & 4) != 0 ? "" : str3, (i9 & 8) != 0 ? new MessageSender(1, 0L, 0L, false, "") : messageSender, (i9 & 16) != 0 ? "" : str4, (i9 & 32) != 0 ? "" : str5, (i9 & 64) != 0 ? 0L : j, (i9 & 128) != 0 ? 0L : j2, (i9 & 256) != 0 ? "" : str6, (i9 & 512) != 0 ? 0 : i, (i9 & 1024) != 0 ? "" : str7, (i9 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? "" : str8, (i9 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? new MessageExt(0L, 0, 0) : messageExt, (i9 & 8192) != 0 ? 0L : j3, (i9 & 16384) != 0 ? 0L : j4, (32768 & i9) != 0 ? 0 : i2, (65536 & i9) != 0 ? 0 : i3, (131072 & i9) != 0 ? 0 : i4, (262144 & i9) != 0 ? C00EH.COMMERCE_AGENT_MSG_INTERCEPT_TYPE_NORMAL : c00eh, (524288 & i9) != 0 ? 0 : i5, (1048576 & i9) == 0 ? str9 : "", (2097152 & i9) != 0 ? 0L : j5, (4194304 & i9) != 0 ? false : z, (8388608 & i9) != 0 ? false : z2, (16777216 & i9) != 0 ? false : z3, (33554432 & i9) != 0 ? 0 : i6, (67108864 & i9) != 0 ? C13BV.INSTANCE : list, (134217728 & i9) != 0 ? 0L : j6, (268435456 & i9) != 0 ? 0 : i7, (536870912 & i9) != 0 ? -1 : i8, (1073741824 & i9) != 0 ? C2097608Jq.LJ() : map, (i9 & Integer.MIN_VALUE) != 0 ? 0L : j7, (i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? new C321070CiH(0) : c321070CiH, (i10 & 4) != 0 ? new LinkedHashMap() : map2, (i10 & 8) == 0 ? bool2 : null, (i10 & 16) != 0 ? Boolean.TRUE : bool3);
    }
}
