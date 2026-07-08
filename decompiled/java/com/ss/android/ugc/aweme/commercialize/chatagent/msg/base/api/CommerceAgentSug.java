package com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import X.C321240CiY;
import X.C786410Ut5;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class CommerceAgentSug {
    public final transient long LIZ;
    public final transient String LIZIZ;
    public final transient boolean LIZJ;
    public final transient boolean LIZLLL;
    public final transient C321240CiY LJ;
    public final transient int LJFF;
    public final long LJI;
    public final boolean LJII;
    public final transient Message LJIIIIZZ;
    public final boolean LJIIIZ;

    @C09CT("action_button")
    public CommerceAgentActionButton actionButton;

    @C09CT("bot_id")
    public final long botId;

    @C09CT("emoji_list")
    public final List<String> emojiList;

    @C09CT("extra")
    public final Map<String, String> extra;

    @C09CT("hint_in_text")
    public String hintInText;

    @C09CT("is_click")
    public boolean isClick;

    @C09CT("is_first_sug")
    public final boolean isFirstSug;

    @C09CT("lucky_send_content")
    public final String luckySendContent;

    @C09CT("pass_extra")
    public Map<String, String> passExtra;

    @C09CT("reply_msg_id")
    public final String replyMsgId;

    @C09CT("reply_uuid")
    public final String replyUuid;

    @C09CT("sug_card_type")
    public final Integer sugCardType;

    @C09CT("sug_floating_content")
    public final String sugFloatingContent;

    @C09CT("sug_guide_words")
    public final String sugGuide;

    @C09CT("sug_id_list")
    public final List<String> sugIdList;

    @C09CT("sug_list")
    public final List<String> sugList;

    @C09CT("sug_key_map")
    public final Map<String, String> sugMultiLanguageKeyMap;

    @C09CT("sug_show_type")
    public final int sugShowType;

    @C09CT("sug_source")
    public final Integer sugSource;

    @C09CT("sug_title")
    public final String sugTitle;

    public CommerceAgentSug() {
        this(false, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, 0L, null, 0L, null, false, false, null, 0, 0L, false, null, false, null, null, 1073741823, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommerceAgentSug)) {
            return false;
        }
        CommerceAgentSug commerceAgentSug = (CommerceAgentSug) obj;
        return this.isFirstSug == commerceAgentSug.isFirstSug && Intrinsics.LJFF(this.sugList, commerceAgentSug.sugList) && Intrinsics.LJFF(this.sugCardType, commerceAgentSug.sugCardType) && Intrinsics.LJFF(this.replyUuid, commerceAgentSug.replyUuid) && Intrinsics.LJFF(this.replyMsgId, commerceAgentSug.replyMsgId) && Intrinsics.LJFF(this.sugMultiLanguageKeyMap, commerceAgentSug.sugMultiLanguageKeyMap) && this.isClick == commerceAgentSug.isClick && this.sugShowType == commerceAgentSug.sugShowType && Intrinsics.LJFF(this.sugGuide, commerceAgentSug.sugGuide) && Intrinsics.LJFF(this.sugIdList, commerceAgentSug.sugIdList) && Intrinsics.LJFF(this.sugSource, commerceAgentSug.sugSource) && Intrinsics.LJFF(this.passExtra, commerceAgentSug.passExtra) && Intrinsics.LJFF(this.sugTitle, commerceAgentSug.sugTitle) && Intrinsics.LJFF(this.emojiList, commerceAgentSug.emojiList) && Intrinsics.LJFF(this.sugFloatingContent, commerceAgentSug.sugFloatingContent) && Intrinsics.LJFF(this.luckySendContent, commerceAgentSug.luckySendContent) && this.botId == commerceAgentSug.botId && Intrinsics.LJFF(this.extra, commerceAgentSug.extra) && this.LIZ == commerceAgentSug.LIZ && Intrinsics.LJFF(this.LIZIZ, commerceAgentSug.LIZIZ) && this.LIZJ == commerceAgentSug.LIZJ && this.LIZLLL == commerceAgentSug.LIZLLL && Intrinsics.LJFF(this.LJ, commerceAgentSug.LJ) && this.LJFF == commerceAgentSug.LJFF && this.LJI == commerceAgentSug.LJI && this.LJII == commerceAgentSug.LJII && Intrinsics.LJFF(this.LJIIIIZZ, commerceAgentSug.LJIIIIZZ) && this.LJIIIZ == commerceAgentSug.LJIIIZ && Intrinsics.LJFF(this.hintInText, commerceAgentSug.hintInText) && Intrinsics.LJFF(this.actionButton, commerceAgentSug.actionButton);
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.isFirstSug) * 31) + this.sugList.hashCode()) * 31;
        Integer num = this.sugCardType;
        int iHashCode = (iZ2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.replyUuid;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.replyMsgId;
        int iHashCode3 = (((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.sugMultiLanguageKeyMap.hashCode()) * 31) + C786410Ut5.Z2(this.isClick)) * 31) + this.sugShowType) * 31;
        String str3 = this.sugGuide;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.sugIdList.hashCode()) * 31;
        Integer num2 = this.sugSource;
        int iHashCode5 = (((iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.passExtra.hashCode()) * 31;
        String str4 = this.sugTitle;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list = this.emojiList;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.sugFloatingContent;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.luckySendContent;
        int iHashCode9 = (((((((((((((((((((((iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31) + C786410Ut5.Y2(this.botId)) * 31) + this.extra.hashCode()) * 31) + C786410Ut5.Y2(this.LIZ)) * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + this.LJ.hashCode()) * 31) + this.LJFF) * 31) + C786410Ut5.Y2(this.LJI)) * 31) + C786410Ut5.Z2(this.LJII)) * 31;
        Message message = this.LJIIIIZZ;
        int iHashCode10 = (((iHashCode9 + (message == null ? 0 : message.hashCode())) * 31) + C786410Ut5.Z2(this.LJIIIZ)) * 31;
        String str7 = this.hintInText;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        CommerceAgentActionButton commerceAgentActionButton = this.actionButton;
        return iHashCode11 + (commerceAgentActionButton != null ? commerceAgentActionButton.hashCode() : 0);
    }

    public final String toString() {
        return "CommerceAgentSug(isFirstSug=" + this.isFirstSug + ", sugList=" + this.sugList + ", sugCardType=" + this.sugCardType + ", replyUuid=" + this.replyUuid + ", replyMsgId=" + this.replyMsgId + ", sugMultiLanguageKeyMap=" + this.sugMultiLanguageKeyMap + ", isClick=" + this.isClick + ", sugShowType=" + this.sugShowType + ", sugGuide=" + this.sugGuide + ", sugIdList=" + this.sugIdList + ", sugSource=" + this.sugSource + ", passExtra=" + this.passExtra + ", sugTitle=" + this.sugTitle + ", emojiList=" + this.emojiList + ", sugFloatingContent=" + this.sugFloatingContent + ", luckySendContent=" + this.luckySendContent + ", botId=" + this.botId + ", extra=" + this.extra + ", actionId=" + this.LIZ + ", subSessionId=" + this.LIZIZ + ", isAnchorBotSug=" + this.LIZJ + ", sugWaitingReply=" + this.LIZLLL + ", commonInfo=" + this.LJ + ", statusCode=" + this.LJFF + ", clientSeq=" + this.LJI + ", isSuccess=" + this.LJII + ", fromMessage=" + this.LJIIIIZZ + ", ignoreFirstSugLocate=" + this.LJIIIZ + ", hintInText=" + this.hintInText + ", actionButton=" + this.actionButton + ')';
    }

    public static CommerceAgentSug LIZ(CommerceAgentSug commerceAgentSug, boolean z, Map map, long j, String str, boolean z2, C321240CiY c321240CiY, int i, long j2, Message message, int i2) {
        List<String> list;
        Integer num;
        String str2;
        String str3;
        Map<String, String> map2;
        boolean z3;
        int i3;
        String str4;
        List<String> list2;
        Integer num2;
        Map<String, String> map3;
        String str5;
        List<String> list3;
        String str6;
        String str7;
        long j3;
        boolean z4;
        boolean z5;
        boolean z6;
        String str8;
        CommerceAgentActionButton commerceAgentActionButton;
        long j4 = j2;
        Message message2 = message;
        boolean z7 = z2;
        String str9 = str;
        C321240CiY c321240CiY2 = c321240CiY;
        Map map4 = map;
        int i4 = i;
        long j5 = j;
        boolean z8 = z;
        if ((i2 & 1) != 0) {
            z8 = commerceAgentSug.isFirstSug;
        }
        if ((i2 & 2) != 0) {
            list = commerceAgentSug.sugList;
        } else {
            list = null;
        }
        if ((i2 & 4) != 0) {
            num = commerceAgentSug.sugCardType;
        } else {
            num = null;
        }
        if ((i2 & 8) != 0) {
            str2 = commerceAgentSug.replyUuid;
        } else {
            str2 = null;
        }
        if ((i2 & 16) != 0) {
            str3 = commerceAgentSug.replyMsgId;
        } else {
            str3 = null;
        }
        if ((i2 & 32) != 0) {
            map2 = commerceAgentSug.sugMultiLanguageKeyMap;
        } else {
            map2 = null;
        }
        if ((i2 & 64) != 0) {
            z3 = commerceAgentSug.isClick;
        } else {
            z3 = false;
        }
        if ((i2 & 128) != 0) {
            i3 = commerceAgentSug.sugShowType;
        } else {
            i3 = 0;
        }
        if ((i2 & 256) != 0) {
            str4 = commerceAgentSug.sugGuide;
        } else {
            str4 = null;
        }
        if ((i2 & 512) != 0) {
            list2 = commerceAgentSug.sugIdList;
        } else {
            list2 = null;
        }
        if ((i2 & 1024) != 0) {
            num2 = commerceAgentSug.sugSource;
        } else {
            num2 = null;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            map3 = commerceAgentSug.passExtra;
        } else {
            map3 = null;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str5 = commerceAgentSug.sugTitle;
        } else {
            str5 = null;
        }
        if ((i2 & 8192) != 0) {
            list3 = commerceAgentSug.emojiList;
        } else {
            list3 = null;
        }
        if ((i2 & 16384) != 0) {
            str6 = commerceAgentSug.sugFloatingContent;
        } else {
            str6 = null;
        }
        if ((32768 & i2) != 0) {
            str7 = commerceAgentSug.luckySendContent;
        } else {
            str7 = null;
        }
        if ((65536 & i2) != 0) {
            j3 = commerceAgentSug.botId;
        } else {
            j3 = 0;
        }
        if ((131072 & i2) != 0) {
            map4 = commerceAgentSug.extra;
        }
        if ((262144 & i2) != 0) {
            j5 = commerceAgentSug.LIZ;
        }
        if ((524288 & i2) != 0) {
            str9 = commerceAgentSug.LIZIZ;
        }
        if ((1048576 & i2) != 0) {
            z4 = commerceAgentSug.LIZJ;
        } else {
            z4 = false;
        }
        if ((2097152 & i2) != 0) {
            z7 = commerceAgentSug.LIZLLL;
        }
        if ((4194304 & i2) != 0) {
            c321240CiY2 = commerceAgentSug.LJ;
        }
        if ((8388608 & i2) != 0) {
            i4 = commerceAgentSug.LJFF;
        }
        if ((16777216 & i2) != 0) {
            j4 = commerceAgentSug.LJI;
        }
        if ((33554432 & i2) != 0) {
            z5 = commerceAgentSug.LJII;
        } else {
            z5 = false;
        }
        if ((67108864 & i2) != 0) {
            message2 = commerceAgentSug.LJIIIIZZ;
        }
        if ((134217728 & i2) != 0) {
            z6 = commerceAgentSug.LJIIIZ;
        } else {
            z6 = false;
        }
        if ((268435456 & i2) != 0) {
            str8 = commerceAgentSug.hintInText;
        } else {
            str8 = null;
        }
        if ((i2 & 536870912) != 0) {
            commerceAgentActionButton = commerceAgentSug.actionButton;
        } else {
            commerceAgentActionButton = null;
        }
        commerceAgentSug.getClass();
        return new CommerceAgentSug(z8, list, num, str2, str3, map2, z3, i3, str4, list2, num2, map3, str5, list3, str6, str7, j3, map4, j5, str9, z4, z7, c321240CiY2, i4, j4, z5, message2, z6, str8, commerceAgentActionButton);
    }

    public CommerceAgentSug(boolean z, List<String> list, Integer num, String str, String str2, Map<String, String> map, boolean z2, int i, String str3, List<String> list2, Integer num2, Map<String, String> map2, String str4, List<String> list3, String str5, String str6, long j, Map<String, String> map3, long j2, String str7, boolean z3, boolean z4, C321240CiY c321240CiY, int i2, long j3, boolean z5, Message message, boolean z6, String str8, CommerceAgentActionButton commerceAgentActionButton) {
        this.isFirstSug = z;
        this.sugList = list;
        this.sugCardType = num;
        this.replyUuid = str;
        this.replyMsgId = str2;
        this.sugMultiLanguageKeyMap = map;
        this.isClick = z2;
        this.sugShowType = i;
        this.sugGuide = str3;
        this.sugIdList = list2;
        this.sugSource = num2;
        this.passExtra = map2;
        this.sugTitle = str4;
        this.emojiList = list3;
        this.sugFloatingContent = str5;
        this.luckySendContent = str6;
        this.botId = j;
        this.extra = map3;
        this.LIZ = j2;
        this.LIZIZ = str7;
        this.LIZJ = z3;
        this.LIZLLL = z4;
        this.LJ = c321240CiY;
        this.LJFF = i2;
        this.LJI = j3;
        this.LJII = z5;
        this.LJIIIIZZ = message;
        this.LJIIIZ = z6;
        this.hintInText = str8;
        this.actionButton = commerceAgentActionButton;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CommerceAgentSug(boolean z, List list, Integer num, String str, String str2, Map map, boolean z2, int i, String str3, List list2, Integer num2, Map map2, String str4, List list3, String str5, String str6, long j, Map map3, long j2, String str7, boolean z3, boolean z4, C321240CiY c321240CiY, int i2, long j3, boolean z5, Message message, boolean z6, String str8, CommerceAgentActionButton commerceAgentActionButton, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        CommerceAgentActionButton commerceAgentActionButton2;
        String str9 = str8;
        boolean z7 = z6;
        Message message2 = message;
        boolean z8 = z5;
        boolean z9 = z3;
        String str10 = str5;
        long j4 = j2;
        Map mapLJ = map3;
        long j5 = j;
        List list4 = list3;
        String str11 = str6;
        String str12 = str4;
        Map mapLJ2 = map2;
        Integer num3 = num2;
        List list5 = list2;
        String str13 = str3;
        int i4 = i;
        boolean z10 = z2;
        Map mapLJ3 = map;
        String str14 = str2;
        String str15 = str;
        int i5 = i2;
        Integer num4 = num;
        C321240CiY c321240CiY2 = c321240CiY;
        List list6 = list;
        boolean z11 = z4;
        boolean z12 = (i3 & 1) != 0 ? false : z;
        list6 = (i3 & 2) != 0 ? C13BV.INSTANCE : list6;
        num4 = (i3 & 4) != 0 ? null : num4;
        str15 = (i3 & 8) != 0 ? null : str15;
        str14 = (i3 & 16) != 0 ? null : str14;
        mapLJ3 = (i3 & 32) != 0 ? C2097608Jq.LJ() : mapLJ3;
        z10 = (i3 & 64) != 0 ? false : z10;
        i4 = (i3 & 128) != 0 ? 0 : i4;
        str13 = (i3 & 256) != 0 ? "" : str13;
        list5 = (i3 & 512) != 0 ? C13BV.INSTANCE : list5;
        num3 = (i3 & 1024) != 0 ? null : num3;
        mapLJ2 = (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? C2097608Jq.LJ() : mapLJ2;
        str12 = (i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : str12;
        list4 = (i3 & 8192) != 0 ? null : list4;
        str10 = (i3 & 16384) != 0 ? null : str10;
        str11 = (32768 & i3) != 0 ? null : str11;
        j5 = (65536 & i3) != 0 ? 0L : j5;
        mapLJ = (131072 & i3) != 0 ? C2097608Jq.LJ() : mapLJ;
        j4 = (262144 & i3) != 0 ? 0L : j4;
        String str16 = (524288 & i3) == 0 ? str7 : "";
        z9 = (1048576 & i3) != 0 ? false : z9;
        z11 = (2097152 & i3) != 0 ? false : z11;
        if ((4194304 & i3) != 0) {
            commerceAgentActionButton2 = null;
            c321240CiY2 = new C321240CiY(0 == true ? 1 : 0, 0 == true ? 1 : 0, 63);
        } else {
            commerceAgentActionButton2 = null;
        }
        this(z12, list6, num4, str15, str14, mapLJ3, z10, i4, str13, list5, num3, mapLJ2, str12, list4, str10, str11, j5, mapLJ, j4, str16, z9, z11, c321240CiY2, (8388608 & i3) != 0 ? 0 : i5, (16777216 & i3) == 0 ? j3 : 0L, (33554432 & i3) != 0 ? true : z8, (67108864 & i3) != 0 ? commerceAgentActionButton2 : message2, (134217728 & i3) != 0 ? false : z7, (268435456 & i3) != 0 ? commerceAgentActionButton2 : str9, (i3 & 536870912) == 0 ? commerceAgentActionButton : commerceAgentActionButton2);
    }
}
