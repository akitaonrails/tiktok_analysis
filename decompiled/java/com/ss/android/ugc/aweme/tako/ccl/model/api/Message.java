package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C13BV;
import X.C1557890qdv;
import X.C1697810uHb;
import X.C1860390yVp;
import X.C1863900ybU;
import X.C2097608Jq;
import X.C786410Ut5;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import defpackage.v2;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class Message {
    public boolean LIZ;
    public int LIZIZ;
    public List<Integer> LIZJ;
    public long LIZLLL;
    public int LJ;
    public final int LJFF;
    public Map<String, ? extends Object> LJI;
    public long LJII;
    public Boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public transient Boolean LJIIJ;
    public Boolean LJIIJJI;
    public C1863900ybU LJIIL;
    public final transient Map<String, Object> LJIILIIL;
    public String LJIILJJIL;
    public final TakoQuestionnaire LJIILL;
    public final boolean LJIILLIIL;
    public final transient C1557890qdv LJIIZILJ;
    public TakoMixFeed LJIJ;
    public TakoMixFeed LJIJI;
    public Map<String, Object> LJIJJ;
    public Map<String, Object> LJIJJLI;
    public TakoMixFeed LJIL;
    public Map<String, Object> LJJ;

    @C09CT("action_id")
    public long actionId;

    @C09CT("bot_id")
    public long botId;

    @C09CT("msg_channel")
    public final int channel;

    @C09CT("conversation_id")
    public String conversationId;

    @C09CT("edit_info")
    public TakoEditInfo editInfo;

    @C09CT("ext")
    public final MessageExt ext;

    @C09CT("gen_style")
    public int genStyle;

    @C09CT("hide_push_message_button")
    public int hidePushMessageImageButton;

    @C09CT("msg_intercept_type")
    public final v2 interceptType;

    @C09CT("is_degraded")
    public boolean isDegraded;

    @C09CT("is_hidden")
    public boolean isHidden;

    @C09CT("is_multi_answer")
    public boolean isMultiAnswer;

    @C09CT("is_push_msg")
    public boolean isPush;

    @C09CT("is_regen_deprecated")
    public boolean isRegenDeprecated;

    @C09CT("msg_content")
    public String msgContent;

    @C09CT("msg_id")
    public String msgId;

    @C09CT("msg_type")
    public int msgType;

    @C09CT("multi_msg_content")
    public String multiMsgContent;

    @C09CT("reference_info")
    public TakoReferenceInfo referenceInfo;

    @C09CT("reply_msg_id")
    public String replyMsgId;

    @C09CT("reply_uuid")
    public String replyUuid;

    @C09CT("retried")
    public int retried;

    @C09CT("selected_answer_index")
    public int selectedAnswerIndex;

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

    @C09CT("sub_conv_id")
    public String subConversationId;

    @C09CT("sub_conv_seq_id")
    public final long subServerSeq;

    @C09CT("sub_session_id")
    public String subSessionId;

    @C09CT("uuid")
    public String uuid;

    @C09CT("version")
    public final int version;

    @C09CT("version_id")
    public String versionId;

    @C09CT("version_seq")
    public long versionSeq;

    public Message() {
        this(null, null, null, null, null, null, false, null, 0L, 0L, null, 0, null, null, false, 0, false, null, null, 0L, 0L, 0L, 0, 0, 0, null, 0, null, 0L, false, 0, 0, null, null, false, false, 0, null, 0L, 0, 0, null, 0L, null, false, null, null, null, null, null, null, false, null, -1, 2097151, null);
    }

    public final Message LJ() {
        Message messageLIZLLL = LIZLLL(this, null, 0, false, 0, false, null, false, -1, 2097151);
        if (!this.isMultiAnswer) {
            messageLIZLLL.LJIIJ(LJIIIZ());
            return messageLIZLLL;
        }
        messageLIZLLL.LJIJ = LJI();
        messageLIZLLL.LJIJI = LJII();
        return messageLIZLLL;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Message)) {
            return false;
        }
        Message message = (Message) obj;
        return Intrinsics.LJFF(this.msgId, message.msgId) && Intrinsics.LJFF(this.replyUuid, message.replyUuid) && Intrinsics.LJFF(this.replyMsgId, message.replyMsgId) && Intrinsics.LJFF(this.sender, message.sender) && Intrinsics.LJFF(this.conversationId, message.conversationId) && Intrinsics.LJFF(this.subConversationId, message.subConversationId) && this.isPush == message.isPush && Intrinsics.LJFF(this.subSessionId, message.subSessionId) && this.actionId == message.actionId && this.botId == message.botId && Intrinsics.LJFF(this.uuid, message.uuid) && this.msgType == message.msgType && Intrinsics.LJFF(this.msgContent, message.msgContent) && Intrinsics.LJFF(this.multiMsgContent, message.multiMsgContent) && this.isMultiAnswer == message.isMultiAnswer && this.selectedAnswerIndex == message.selectedAnswerIndex && this.isDegraded == message.isDegraded && Intrinsics.LJFF(this.sessionId, message.sessionId) && Intrinsics.LJFF(this.ext, message.ext) && this.serverTime == message.serverTime && this.serverSeq == message.serverSeq && this.subServerSeq == message.subServerSeq && this.version == message.version && this.serverStatus == message.serverStatus && this.channel == message.channel && this.interceptType == message.interceptType && this.genStyle == message.genStyle && Intrinsics.LJFF(this.versionId, message.versionId) && this.versionSeq == message.versionSeq && this.isHidden == message.isHidden && this.retried == message.retried && this.hidePushMessageImageButton == message.hidePushMessageImageButton && Intrinsics.LJFF(this.referenceInfo, message.referenceInfo) && Intrinsics.LJFF(this.editInfo, message.editInfo) && this.isRegenDeprecated == message.isRegenDeprecated && this.LIZ == message.LIZ && this.LIZIZ == message.LIZIZ && Intrinsics.LJFF(this.LIZJ, message.LIZJ) && this.LIZLLL == message.LIZLLL && this.LJ == message.LJ && this.LJFF == message.LJFF && Intrinsics.LJFF(this.LJI, message.LJI) && this.LJII == message.LJII && Intrinsics.LJFF(this.LJIIIIZZ, message.LJIIIIZZ) && this.LJIIIZ == message.LJIIIZ && Intrinsics.LJFF(this.LJIIJ, message.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, message.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, message.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, message.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, message.LJIILJJIL) && Intrinsics.LJFF(this.LJIILL, message.LJIILL) && this.LJIILLIIL == message.LJIILLIIL && Intrinsics.LJFF(this.LJIIZILJ, message.LJIIZILJ);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.msgId.hashCode() * 31) + this.replyUuid.hashCode()) * 31) + this.replyMsgId.hashCode()) * 31) + this.sender.hashCode()) * 31) + this.conversationId.hashCode()) * 31;
        String str = this.subConversationId;
        int iHashCode2 = (((((((((((((((((((((((((((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.isPush)) * 31) + this.subSessionId.hashCode()) * 31) + C786410Ut5.Y2(this.actionId)) * 31) + C786410Ut5.Y2(this.botId)) * 31) + this.uuid.hashCode()) * 31) + this.msgType) * 31) + this.msgContent.hashCode()) * 31) + this.multiMsgContent.hashCode()) * 31) + C786410Ut5.Z2(this.isMultiAnswer)) * 31) + this.selectedAnswerIndex) * 31) + C786410Ut5.Z2(this.isDegraded)) * 31) + this.sessionId.hashCode()) * 31) + this.ext.hashCode()) * 31) + C786410Ut5.Y2(this.serverTime)) * 31) + C786410Ut5.Y2(this.serverSeq)) * 31) + C786410Ut5.Y2(this.subServerSeq)) * 31) + this.version) * 31) + this.serverStatus) * 31) + this.channel) * 31;
        v2 v2Var = this.interceptType;
        int iHashCode3 = (((((((((((((iHashCode2 + (v2Var == null ? 0 : v2Var.hashCode())) * 31) + this.genStyle) * 31) + this.versionId.hashCode()) * 31) + C786410Ut5.Y2(this.versionSeq)) * 31) + C786410Ut5.Z2(this.isHidden)) * 31) + this.retried) * 31) + this.hidePushMessageImageButton) * 31;
        TakoReferenceInfo takoReferenceInfo = this.referenceInfo;
        int iHashCode4 = (iHashCode3 + (takoReferenceInfo == null ? 0 : takoReferenceInfo.hashCode())) * 31;
        TakoEditInfo takoEditInfo = this.editInfo;
        int iHashCode5 = (((((((((((((((((((iHashCode4 + (takoEditInfo == null ? 0 : takoEditInfo.hashCode())) * 31) + C786410Ut5.Z2(this.isRegenDeprecated)) * 31) + C786410Ut5.Z2(this.LIZ)) * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + this.LJ) * 31) + this.LJFF) * 31) + this.LJI.hashCode()) * 31) + C786410Ut5.Y2(this.LJII)) * 31;
        Boolean bool = this.LJIIIIZZ;
        int iHashCode6 = (((iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31) + C786410Ut5.Z2(this.LJIIIZ)) * 31;
        Boolean bool2 = this.LJIIJ;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.LJIIJJI;
        int iHashCode8 = (((((iHashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31) + this.LJIIL.hashCode()) * 31) + this.LJIILIIL.hashCode()) * 31;
        String str2 = this.LJIILJJIL;
        int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        TakoQuestionnaire takoQuestionnaire = this.LJIILL;
        return ((((iHashCode9 + (takoQuestionnaire != null ? takoQuestionnaire.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJIILLIIL)) * 31) + this.LJIIZILJ.hashCode();
    }

    public final String toString() {
        return "Message(msgId=" + this.msgId + ", replyUuid=" + this.replyUuid + ", replyMsgId=" + this.replyMsgId + ", sender=" + this.sender + ", conversationId=" + this.conversationId + ", subConversationId=" + this.subConversationId + ", isPush=" + this.isPush + ", subSessionId=" + this.subSessionId + ", actionId=" + this.actionId + ", botId=" + this.botId + ", uuid=" + this.uuid + ", msgType=" + this.msgType + ", msgContent=" + this.msgContent + ", multiMsgContent=" + this.multiMsgContent + ", isMultiAnswer=" + this.isMultiAnswer + ", selectedAnswerIndex=" + this.selectedAnswerIndex + ", isDegraded=" + this.isDegraded + ", sessionId=" + this.sessionId + ", ext=" + this.ext + ", serverTime=" + this.serverTime + ", serverSeq=" + this.serverSeq + ", subServerSeq=" + this.subServerSeq + ", version=" + this.version + ", serverStatus=" + this.serverStatus + ", channel=" + this.channel + ", interceptType=" + this.interceptType + ", genStyle=" + this.genStyle + ", versionId=" + this.versionId + ", versionSeq=" + this.versionSeq + ", isHidden=" + this.isHidden + ", retried=" + this.retried + ", hidePushMessageImageButton=" + this.hidePushMessageImageButton + ", referenceInfo=" + this.referenceInfo + ", editInfo=" + this.editInfo + ", isRegenDeprecated=" + this.isRegenDeprecated + ", read=" + this.LIZ + ", clientStatus=" + this.LIZIZ + ", updateAction=" + this.LIZJ + ", clientSeq=" + this.LIZLLL + ", retryTime=" + this.LJ + ", sendType=" + this.LJFF + ", lynxData=" + this.LJI + ", pushReceiveTime=" + this.LJII + ", thinkInfoExpanded=" + this.LJIIIIZZ + ", showMultiAnswerTab=" + this.LJIIIZ + ", longPromptExpanded=" + this.LJIIJ + ", hasReceivedFirstPacket=" + this.LJIIJJI + ", requestMessageData=" + this.LJIIL + ", cacheMap=" + this.LJIILIIL + ", replyMessageText=" + this.LJIILJJIL + ", questionnaire=" + this.LJIILL + ", delayHidden=" + this.LJIILLIIL + ", videoComponentMixed=" + this.LJIIZILJ + ')';
    }

    public final List<Integer> LIZIZ() {
        if (!this.isMultiAnswer) {
            TakoMixFeed takoMixFeedLJIIIZ = LJIIIZ();
            return Collections.singletonList(Integer.valueOf(takoMixFeedLJIIIZ != null ? takoMixFeedLJIIIZ.status : -1));
        }
        Integer[] numArr = new Integer[2];
        TakoMixFeed takoMixFeedLJI = LJI();
        numArr[0] = Integer.valueOf(takoMixFeedLJI != null ? takoMixFeedLJI.status : -1);
        TakoMixFeed takoMixFeedLJII = LJII();
        numArr[1] = Integer.valueOf(takoMixFeedLJII != null ? takoMixFeedLJII.status : -1);
        return C1697810uHb.LJIIJJI(numArr);
    }

    public final TakoMixFeed LJI() {
        TakoMixFeed takoMixFeed = this.LJIJ;
        if (takoMixFeed != null) {
            return takoMixFeed;
        }
        TakoMixFeed takoMixFeedLJI = C1860390yVp.LJI(this.msgContent);
        this.LJIJ = takoMixFeedLJI;
        return takoMixFeedLJI;
    }

    public final TakoMixFeed LJII() {
        TakoMixFeed takoMixFeed = this.LJIJI;
        if (takoMixFeed != null) {
            return takoMixFeed;
        }
        TakoMixFeed takoMixFeedLJI = C1860390yVp.LJI(this.multiMsgContent);
        this.LJIJI = takoMixFeedLJI;
        return takoMixFeedLJI;
    }

    public final Map<String, Object> LJIIIIZZ() {
        if (!this.isMultiAnswer) {
            Map<String, Object> map = this.LJJ;
            if (map != null) {
                return map;
            }
            Map<String, Object> mapLJFF = C1860390yVp.LJFF(this.msgContent);
            this.LJJ = mapLJFF;
            return mapLJFF;
        }
        if (this.selectedAnswerIndex == 1) {
            Map<String, Object> map2 = this.LJIJJLI;
            if (map2 != null) {
                return map2;
            }
            Map<String, Object> mapLJFF2 = C1860390yVp.LJFF(this.multiMsgContent);
            this.LJIJJLI = mapLJFF2;
            if (mapLJFF2 != null) {
                return mapLJFF2;
            }
            Map<String, Object> mapLJFF3 = C1860390yVp.LJFF(this.multiMsgContent);
            this.LJIJJLI = mapLJFF3;
            return mapLJFF3;
        }
        Map<String, Object> map3 = this.LJIJJ;
        if (map3 != null) {
            return map3;
        }
        Map<String, Object> mapLJFF4 = C1860390yVp.LJFF(this.msgContent);
        this.LJIJJ = mapLJFF4;
        if (mapLJFF4 != null) {
            return mapLJFF4;
        }
        Map<String, Object> mapLJFF5 = C1860390yVp.LJFF(this.msgContent);
        this.LJIJJ = mapLJFF5;
        return mapLJFF5;
    }

    public final TakoMixFeed LJIIIZ() {
        if (!this.isMultiAnswer) {
            TakoMixFeed takoMixFeed = this.LJIL;
            if (takoMixFeed != null) {
                return takoMixFeed;
            }
            TakoMixFeed takoMixFeedLJI = C1860390yVp.LJI(this.msgContent);
            this.LJIL = takoMixFeedLJI;
            return takoMixFeedLJI;
        }
        if (this.selectedAnswerIndex == 1) {
            TakoMixFeed takoMixFeedLJII = LJII();
            if (takoMixFeedLJII != null) {
                return takoMixFeedLJII;
            }
            TakoMixFeed takoMixFeedLJI2 = C1860390yVp.LJI(this.multiMsgContent);
            this.LJIJI = takoMixFeedLJI2;
            return takoMixFeedLJI2;
        }
        TakoMixFeed takoMixFeedLJI3 = LJI();
        if (takoMixFeedLJI3 != null) {
            return takoMixFeedLJI3;
        }
        TakoMixFeed takoMixFeedLJI4 = C1860390yVp.LJI(this.msgContent);
        this.LJIJ = takoMixFeedLJI4;
        return takoMixFeedLJI4;
    }

    public final int LJFF() {
        Integer next;
        TakoMixFeed takoMixFeedLJIIIZ = LJIIIZ();
        int i = takoMixFeedLJIIIZ != null ? takoMixFeedLJIIIZ.status : -1;
        if (!this.isMultiAnswer) {
            return i;
        }
        List<Integer> listLIZIZ = LIZIZ();
        if (!(listLIZIZ instanceof Collection) || !listLIZIZ.isEmpty()) {
            Iterator<Integer> it2 = listLIZIZ.iterator();
            while (it2.hasNext()) {
                if (it2.next().intValue() == 4) {
                    return 4;
                }
            }
        }
        List<Integer> listLIZIZ2 = LIZIZ();
        if (!listLIZIZ2.isEmpty()) {
            if (!listLIZIZ2.isEmpty()) {
                Iterator<Integer> it3 = listLIZIZ2.iterator();
                while (it3.hasNext()) {
                    if (it3.next().intValue() == 2) {
                    }
                }
            }
            return 2;
        }
        if (i != 2) {
            return i;
        }
        Iterator<Integer> it4 = LIZIZ().iterator();
        while (true) {
            if (!it4.hasNext()) {
                next = null;
                break;
            }
            next = it4.next();
            if (next.intValue() != 2) {
                break;
            }
        }
        Integer num = next;
        return num != null ? num.intValue() : i;
    }

    public final int LIZ(int i) {
        if (this.isMultiAnswer) {
            if (i == 1) {
                TakoMixFeed takoMixFeedLJII = LJII();
                if (takoMixFeedLJII == null) {
                    return -1;
                }
                return takoMixFeedLJII.status;
            }
            TakoMixFeed takoMixFeedLJI = LJI();
            if (takoMixFeedLJI == null) {
                return -1;
            }
            return takoMixFeedLJI.status;
        }
        TakoMixFeed takoMixFeedLJIIIZ = LJIIIZ();
        if (takoMixFeedLJIIIZ == null) {
            return -1;
        }
        return takoMixFeedLJIIIZ.status;
    }

    public final void LIZJ(Function1 function1) {
        TakoMixFeed takoMixFeed = new TakoMixFeed(null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, null, -1, 1023, null);
        function1.invoke(takoMixFeed);
        if (this.isMultiAnswer) {
            if (this.selectedAnswerIndex == 1) {
                this.LJIJI = takoMixFeed;
                this.multiMsgContent = C1860390yVp.LIZJ(takoMixFeed);
                return;
            } else {
                this.LJIJ = takoMixFeed;
                this.msgContent = C1860390yVp.LIZJ(takoMixFeed);
                return;
            }
        }
        LJIIJ(takoMixFeed);
        this.msgContent = C1860390yVp.LIZJ(takoMixFeed);
    }

    public final void LJIIJ(TakoMixFeed takoMixFeed) {
        if (this.isMultiAnswer) {
            if (this.selectedAnswerIndex == 1) {
                this.LJIJI = takoMixFeed;
                return;
            } else {
                this.LJIJ = takoMixFeed;
                return;
            }
        }
        this.LJIL = takoMixFeed;
    }

    public final void LJIIJJI(Function1 function1) {
        TakoMixFeed takoMixFeedLJIIIZ = LJIIIZ();
        if (takoMixFeedLJIIIZ == null) {
            takoMixFeedLJIIIZ = new TakoMixFeed(null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, null, -1, 1023, null);
        }
        TakoMixFeed takoMixFeedLIZ = TakoMixFeed.LIZ(takoMixFeedLJIIIZ, null, null, -1);
        function1.invoke(takoMixFeedLIZ);
        if (this.isMultiAnswer) {
            if (this.selectedAnswerIndex == 1) {
                this.LJIJI = takoMixFeedLIZ;
                this.multiMsgContent = C1860390yVp.LIZJ(takoMixFeedLIZ);
                return;
            } else {
                this.LJIJ = takoMixFeedLIZ;
                this.msgContent = C1860390yVp.LIZJ(takoMixFeedLIZ);
                return;
            }
        }
        LJIIJ(takoMixFeedLIZ);
        this.msgContent = C1860390yVp.LIZJ(takoMixFeedLIZ);
    }

    public static Message LIZLLL(Message message, String str, int i, boolean z, int i2, boolean z2, Boolean bool, boolean z3, int i3, int i4) {
        String str2;
        String str3;
        String str4;
        MessageSender messageSender;
        String str5;
        boolean z4;
        String str6;
        long j;
        long j2;
        String str7;
        int i5;
        String str8;
        String str9;
        boolean z5;
        boolean z6;
        String str10;
        MessageExt messageExt;
        long j3;
        long j4;
        long j5;
        int i6;
        int i7;
        int i8;
        v2 v2Var;
        int i9;
        String str11;
        long j6;
        int i10;
        TakoReferenceInfo takoReferenceInfo;
        TakoEditInfo takoEditInfo;
        boolean z7;
        int i11;
        List<Integer> list;
        long j7;
        int i12;
        int i13;
        Map<String, ? extends Object> map;
        long j8;
        Boolean bool2;
        boolean z8;
        Boolean bool3;
        C1863900ybU c1863900ybU;
        int i14;
        Map<String, Object> map2;
        int i15;
        String str12;
        int i16;
        TakoQuestionnaire takoQuestionnaire;
        C1557890qdv c1557890qdv;
        boolean z9 = z3;
        Boolean bool4 = bool;
        boolean z10 = z2;
        String str13 = str;
        int i17 = i2;
        boolean z11 = z;
        int i18 = i;
        if ((i3 & 1) != 0) {
            str2 = message.msgId;
        } else {
            str2 = null;
        }
        if ((i3 & 2) != 0) {
            str3 = message.replyUuid;
        } else {
            str3 = null;
        }
        if ((i3 & 4) != 0) {
            str4 = message.replyMsgId;
        } else {
            str4 = null;
        }
        if ((i3 & 8) != 0) {
            messageSender = message.sender;
        } else {
            messageSender = null;
        }
        if ((i3 & 16) != 0) {
            str5 = message.conversationId;
        } else {
            str5 = null;
        }
        if ((i3 & 32) != 0) {
            str13 = message.subConversationId;
        }
        if ((i3 & 64) != 0) {
            z4 = message.isPush;
        } else {
            z4 = false;
        }
        if ((i3 & 128) != 0) {
            str6 = message.subSessionId;
        } else {
            str6 = null;
        }
        if ((i3 & 256) != 0) {
            j = message.actionId;
        } else {
            j = 0;
        }
        if ((i3 & 512) != 0) {
            j2 = message.botId;
        } else {
            j2 = 0;
        }
        if ((i3 & 1024) != 0) {
            str7 = message.uuid;
        } else {
            str7 = null;
        }
        if ((i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            i5 = message.msgType;
        } else {
            i5 = 0;
        }
        if ((i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str8 = message.msgContent;
        } else {
            str8 = null;
        }
        if ((i3 & 8192) != 0) {
            str9 = message.multiMsgContent;
        } else {
            str9 = null;
        }
        if ((i3 & 16384) != 0) {
            z5 = message.isMultiAnswer;
        } else {
            z5 = false;
        }
        if ((i3 & 32768) != 0) {
            i18 = message.selectedAnswerIndex;
        }
        if ((i3 & 65536) != 0) {
            z6 = message.isDegraded;
        } else {
            z6 = false;
        }
        if ((131072 & i3) != 0) {
            str10 = message.sessionId;
        } else {
            str10 = null;
        }
        if ((262144 & i3) != 0) {
            messageExt = message.ext;
        } else {
            messageExt = null;
        }
        if ((524288 & i3) != 0) {
            j3 = message.serverTime;
        } else {
            j3 = 0;
        }
        if ((1048576 & i3) != 0) {
            j4 = message.serverSeq;
        } else {
            j4 = 0;
        }
        if ((2097152 & i3) != 0) {
            j5 = message.subServerSeq;
        } else {
            j5 = 0;
        }
        if ((4194304 & i3) != 0) {
            i6 = message.version;
        } else {
            i6 = 0;
        }
        if ((8388608 & i3) != 0) {
            i7 = message.serverStatus;
        } else {
            i7 = 0;
        }
        if ((16777216 & i3) != 0) {
            i8 = message.channel;
        } else {
            i8 = 0;
        }
        if ((33554432 & i3) != 0) {
            v2Var = message.interceptType;
        } else {
            v2Var = null;
        }
        if ((67108864 & i3) != 0) {
            i9 = message.genStyle;
        } else {
            i9 = 0;
        }
        if ((134217728 & i3) != 0) {
            str11 = message.versionId;
        } else {
            str11 = null;
        }
        if ((268435456 & i3) != 0) {
            j6 = message.versionSeq;
        } else {
            j6 = 0;
        }
        if ((536870912 & i3) != 0) {
            z11 = message.isHidden;
        }
        if ((1073741824 & i3) != 0) {
            i10 = message.retried;
        } else {
            i10 = 0;
        }
        if ((i3 & Integer.MIN_VALUE) != 0) {
            i17 = message.hidePushMessageImageButton;
        }
        if ((i4 & 1) != 0) {
            takoReferenceInfo = message.referenceInfo;
        } else {
            takoReferenceInfo = null;
        }
        if ((i4 & 2) != 0) {
            takoEditInfo = message.editInfo;
        } else {
            takoEditInfo = null;
        }
        if ((i4 & 4) != 0) {
            z10 = message.isRegenDeprecated;
        }
        if ((i4 & 8) != 0) {
            z7 = message.LIZ;
        } else {
            z7 = false;
        }
        if ((i4 & 16) != 0) {
            i11 = message.LIZIZ;
        } else {
            i11 = 0;
        }
        if ((i4 & 32) != 0) {
            list = message.LIZJ;
        } else {
            list = null;
        }
        if ((i4 & 64) != 0) {
            j7 = message.LIZLLL;
        } else {
            j7 = 0;
        }
        if ((i4 & 128) != 0) {
            i12 = message.LJ;
        } else {
            i12 = 0;
        }
        if ((i4 & 256) != 0) {
            i13 = message.LJFF;
        } else {
            i13 = 0;
        }
        if ((i4 & 512) != 0) {
            map = message.LJI;
        } else {
            map = null;
        }
        if ((i4 & 1024) != 0) {
            j8 = message.LJII;
        } else {
            j8 = 0;
        }
        if ((i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            bool2 = message.LJIIIIZZ;
        } else {
            bool2 = null;
        }
        if ((i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z8 = message.LJIIIZ;
        } else {
            z8 = false;
        }
        if ((i4 & 8192) != 0) {
            bool4 = message.LJIIJ;
        }
        if ((i4 & 16384) != 0) {
            bool3 = message.LJIIJJI;
        } else {
            bool3 = null;
        }
        if ((32768 & i4) != 0) {
            c1863900ybU = message.LJIIL;
        } else {
            c1863900ybU = null;
        }
        if ((i4 & 65536) != 0) {
            map2 = message.LJIILIIL;
            i14 = 131072;
        } else {
            i14 = 131072;
            map2 = null;
        }
        if ((i14 & i4) != 0) {
            str12 = message.LJIILJJIL;
            i15 = 262144;
        } else {
            i15 = 262144;
            str12 = null;
        }
        if ((i15 & i4) != 0) {
            takoQuestionnaire = message.LJIILL;
            i16 = 524288;
        } else {
            i16 = 524288;
            takoQuestionnaire = null;
        }
        if ((i16 & i4) != 0) {
            z9 = message.LJIILLIIL;
        }
        if ((i4 & 1048576) != 0) {
            c1557890qdv = message.LJIIZILJ;
        } else {
            c1557890qdv = null;
        }
        message.getClass();
        return new Message(str2, str3, str4, messageSender, str5, str13, z4, str6, j, j2, str7, i5, str8, str9, z5, i18, z6, str10, messageExt, j3, j4, j5, i6, i7, i8, v2Var, i9, str11, j6, z11, i10, i17, takoReferenceInfo, takoEditInfo, z10, z7, i11, list, j7, i12, i13, map, j8, bool2, z8, bool4, bool3, c1863900ybU, map2, str12, takoQuestionnaire, z9, c1557890qdv);
    }

    public Message(String str, String str2, String str3, MessageSender messageSender, String str4, String str5, boolean z, String str6, long j, long j2, String str7, int i, String str8, String str9, boolean z2, int i2, boolean z3, String str10, MessageExt messageExt, long j3, long j4, long j5, int i3, int i4, int i5, v2 v2Var, int i6, String str11, long j6, boolean z4, int i7, int i8, TakoReferenceInfo takoReferenceInfo, TakoEditInfo takoEditInfo, boolean z5, boolean z6, int i9, List<Integer> list, long j7, int i10, int i11, Map<String, ? extends Object> map, long j8, Boolean bool, boolean z7, Boolean bool2, Boolean bool3, C1863900ybU c1863900ybU, Map<String, Object> map2, String str12, TakoQuestionnaire takoQuestionnaire, boolean z8, C1557890qdv c1557890qdv) {
        this.msgId = str;
        this.replyUuid = str2;
        this.replyMsgId = str3;
        this.sender = messageSender;
        this.conversationId = str4;
        this.subConversationId = str5;
        this.isPush = z;
        this.subSessionId = str6;
        this.actionId = j;
        this.botId = j2;
        this.uuid = str7;
        this.msgType = i;
        this.msgContent = str8;
        this.multiMsgContent = str9;
        this.isMultiAnswer = z2;
        this.selectedAnswerIndex = i2;
        this.isDegraded = z3;
        this.sessionId = str10;
        this.ext = messageExt;
        this.serverTime = j3;
        this.serverSeq = j4;
        this.subServerSeq = j5;
        this.version = i3;
        this.serverStatus = i4;
        this.channel = i5;
        this.interceptType = v2Var;
        this.genStyle = i6;
        this.versionId = str11;
        this.versionSeq = j6;
        this.isHidden = z4;
        this.retried = i7;
        this.hidePushMessageImageButton = i8;
        this.referenceInfo = takoReferenceInfo;
        this.editInfo = takoEditInfo;
        this.isRegenDeprecated = z5;
        this.LIZ = z6;
        this.LIZIZ = i9;
        this.LIZJ = list;
        this.LIZLLL = j7;
        this.LJ = i10;
        this.LJFF = i11;
        this.LJI = map;
        this.LJII = j8;
        this.LJIIIIZZ = bool;
        this.LJIIIZ = z7;
        this.LJIIJ = bool2;
        this.LJIIJJI = bool3;
        this.LJIIL = c1863900ybU;
        this.LJIILIIL = map2;
        this.LJIILJJIL = str12;
        this.LJIILL = takoQuestionnaire;
        this.LJIILLIIL = z8;
        this.LJIIZILJ = c1557890qdv;
    }

    public Message(String str, String str2, String str3, MessageSender messageSender, String str4, String str5, boolean z, String str6, long j, long j2, String str7, int i, String str8, String str9, boolean z2, int i2, boolean z3, String str10, MessageExt messageExt, long j3, long j4, long j5, int i3, int i4, int i5, v2 v2Var, int i6, String str11, long j6, boolean z4, int i7, int i8, TakoReferenceInfo takoReferenceInfo, TakoEditInfo takoEditInfo, boolean z5, boolean z6, int i9, List list, long j7, int i10, int i11, Map map, long j8, Boolean bool, boolean z7, Boolean bool2, Boolean bool3, C1863900ybU c1863900ybU, Map map2, String str12, TakoQuestionnaire takoQuestionnaire, boolean z8, C1557890qdv c1557890qdv, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? "" : str2, (i12 & 4) != 0 ? "" : str3, (i12 & 8) != 0 ? new MessageSender(1, 0L, 0L, false, "") : messageSender, (i12 & 16) != 0 ? "" : str4, (i12 & 32) != 0 ? null : str5, (i12 & 64) != 0 ? false : z, (i12 & 128) != 0 ? "" : str6, (i12 & 256) != 0 ? 0L : j, (i12 & 512) != 0 ? 0L : j2, (i12 & 1024) != 0 ? "" : str7, (i12 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 0 : i, (i12 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? "" : str8, (i12 & 8192) != 0 ? "" : str9, (i12 & 16384) != 0 ? false : z2, (i12 & 32768) != 0 ? 0 : i2, (i12 & 65536) != 0 ? false : z3, (i12 & 131072) != 0 ? "" : str10, (i12 & 262144) != 0 ? new MessageExt(0L, 0, 0, "", "", "", "", "", null, null, "", 0, null, "", false, "", "") : messageExt, (i12 & 524288) != 0 ? 0L : j3, (i12 & 1048576) != 0 ? 0L : j4, (2097152 & i12) != 0 ? 0L : j5, (4194304 & i12) != 0 ? 0 : i3, (8388608 & i12) != 0 ? 0 : i4, (16777216 & i12) != 0 ? 0 : i5, (33554432 & i12) != 0 ? v2.TAKO_MSG_INTERCEPT_TYPE_NORMAL : v2Var, (67108864 & i12) != 0 ? 0 : i6, (134217728 & i12) == 0 ? str11 : "", (268435456 & i12) != 0 ? 0L : j6, (536870912 & i12) != 0 ? false : z4, (1073741824 & i12) != 0 ? 0 : i7, (i12 & Integer.MIN_VALUE) != 0 ? 0 : i8, (i13 & 1) != 0 ? null : takoReferenceInfo, (i13 & 2) != 0 ? null : takoEditInfo, (i13 & 4) != 0 ? false : z5, (i13 & 8) != 0 ? false : z6, (i13 & 16) != 0 ? 0 : i9, (i13 & 32) != 0 ? C13BV.INSTANCE : list, (i13 & 64) != 0 ? 0L : j7, (i13 & 128) != 0 ? 0 : i10, (i13 & 256) != 0 ? -1 : i11, (i13 & 512) != 0 ? C2097608Jq.LJ() : map, (i13 & 1024) != 0 ? 0L : j8, (i13 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : bool, (i13 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? false : z7, (i13 & 8192) != 0 ? null : bool2, (i13 & 16384) != 0 ? null : bool3, (i13 & 32768) != 0 ? new C1863900ybU(0, null, 0L, null, null, null, 0, null, null, null, null, null, 0L, null, 0L, 0, null, null, 0, null, null, null, null, false, 0, 0, 0, null, null, null, null, 0, 0, null, null, null, null, null, null, false, null, -1, 1023) : c1863900ybU, (i13 & 65536) != 0 ? new LinkedHashMap() : map2, (i13 & 131072) != 0 ? null : str12, (i13 & 262144) != 0 ? null : takoQuestionnaire, (i13 & 524288) != 0 ? false : z8, (i13 & 1048576) != 0 ? new C1557890qdv(0) : c1557890qdv);
    }
}
