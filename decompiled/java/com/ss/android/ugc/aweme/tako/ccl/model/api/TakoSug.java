package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import X.C786410Ut5;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import defpackage.k9;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class TakoSug {
    public final transient long LIZ;
    public final transient String LIZIZ;
    public transient boolean LIZJ;
    public final transient boolean LIZLLL;
    public final transient k9 LJ;
    public transient Map<String, String> LJFF;
    public final transient int LJI;
    public final long LJII;
    public final boolean LJIIIIZZ;
    public final transient Message LJIIIZ;
    public final boolean LJIIJ;
    public final transient boolean LJIIJJI;
    public final transient boolean LJIIL;
    public final transient boolean LJIILIIL;
    public final transient boolean LJIILJJIL;
    public final transient String LJIILL;

    @C09CT("answer_msg_id")
    public final String answerMsgId;

    @C09CT("bot_id")
    public final long botId;

    @C09CT("emoji_list")
    public final List<String> emojiList;

    @C09CT("extra")
    public final Map<String, String> extra;

    @C09CT("is_click")
    public boolean isClick;

    @C09CT("is_first_sug")
    public final boolean isFirstSug;

    @C09CT("dynamic_patch")
    public final TakoLynx lynxData;

    @C09CT("pass_extra")
    public Map<String, String> passExtra;

    @C09CT("quick_follow")
    public final List<TakoQuickFollow> quickFollow;

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

    @C09CT("video_info")
    public final BaseVideo videoInfo;

    public TakoSug() {
        this(false, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, 0L, null, null, 0L, null, false, false, null, null, 0, 0L, false, null, false, false, false, false, false, null, null, -1, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoSug)) {
            return false;
        }
        TakoSug takoSug = (TakoSug) obj;
        return this.isFirstSug == takoSug.isFirstSug && Intrinsics.LJFF(this.sugList, takoSug.sugList) && Intrinsics.LJFF(this.sugCardType, takoSug.sugCardType) && Intrinsics.LJFF(this.replyUuid, takoSug.replyUuid) && Intrinsics.LJFF(this.replyMsgId, takoSug.replyMsgId) && Intrinsics.LJFF(this.answerMsgId, takoSug.answerMsgId) && Intrinsics.LJFF(this.sugMultiLanguageKeyMap, takoSug.sugMultiLanguageKeyMap) && this.isClick == takoSug.isClick && this.sugShowType == takoSug.sugShowType && Intrinsics.LJFF(this.sugGuide, takoSug.sugGuide) && Intrinsics.LJFF(this.sugIdList, takoSug.sugIdList) && Intrinsics.LJFF(this.sugSource, takoSug.sugSource) && Intrinsics.LJFF(this.passExtra, takoSug.passExtra) && Intrinsics.LJFF(this.sugTitle, takoSug.sugTitle) && Intrinsics.LJFF(this.emojiList, takoSug.emojiList) && Intrinsics.LJFF(this.lynxData, takoSug.lynxData) && Intrinsics.LJFF(this.sugFloatingContent, takoSug.sugFloatingContent) && this.botId == takoSug.botId && Intrinsics.LJFF(this.extra, takoSug.extra) && Intrinsics.LJFF(this.videoInfo, takoSug.videoInfo) && this.LIZ == takoSug.LIZ && Intrinsics.LJFF(this.LIZIZ, takoSug.LIZIZ) && this.LIZJ == takoSug.LIZJ && this.LIZLLL == takoSug.LIZLLL && Intrinsics.LJFF(this.LJ, takoSug.LJ) && Intrinsics.LJFF(this.LJFF, takoSug.LJFF) && this.LJI == takoSug.LJI && this.LJII == takoSug.LJII && this.LJIIIIZZ == takoSug.LJIIIIZZ && Intrinsics.LJFF(this.LJIIIZ, takoSug.LJIIIZ) && this.LJIIJ == takoSug.LJIIJ && this.LJIIJJI == takoSug.LJIIJJI && this.LJIIL == takoSug.LJIIL && this.LJIILIIL == takoSug.LJIILIIL && this.LJIILJJIL == takoSug.LJIILJJIL && Intrinsics.LJFF(this.LJIILL, takoSug.LJIILL) && Intrinsics.LJFF(this.quickFollow, takoSug.quickFollow);
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.isFirstSug) * 31) + this.sugList.hashCode()) * 31;
        Integer num = this.sugCardType;
        int iHashCode = (iZ2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.replyUuid;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.replyMsgId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.answerMsgId;
        int iHashCode4 = (((((((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.sugMultiLanguageKeyMap.hashCode()) * 31) + C786410Ut5.Z2(this.isClick)) * 31) + this.sugShowType) * 31;
        String str4 = this.sugGuide;
        int iHashCode5 = (((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.sugIdList.hashCode()) * 31;
        Integer num2 = this.sugSource;
        int iHashCode6 = (((iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.passExtra.hashCode()) * 31;
        String str5 = this.sugTitle;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<String> list = this.emojiList;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        TakoLynx takoLynx = this.lynxData;
        int iHashCode9 = (iHashCode8 + (takoLynx == null ? 0 : takoLynx.hashCode())) * 31;
        String str6 = this.sugFloatingContent;
        int iHashCode10 = (((((iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31) + C786410Ut5.Y2(this.botId)) * 31) + this.extra.hashCode()) * 31;
        BaseVideo baseVideo = this.videoInfo;
        int iHashCode11 = (((((((((((iHashCode10 + (baseVideo == null ? 0 : baseVideo.hashCode())) * 31) + C786410Ut5.Y2(this.LIZ)) * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + this.LJ.hashCode()) * 31;
        Map<String, String> map = this.LJFF;
        int iHashCode12 = (((((((iHashCode11 + (map == null ? 0 : map.hashCode())) * 31) + this.LJI) * 31) + C786410Ut5.Y2(this.LJII)) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31;
        Message message = this.LJIIIZ;
        int iHashCode13 = (((((((((((iHashCode12 + (message == null ? 0 : message.hashCode())) * 31) + C786410Ut5.Z2(this.LJIIJ)) * 31) + C786410Ut5.Z2(this.LJIIJJI)) * 31) + C786410Ut5.Z2(this.LJIIL)) * 31) + C786410Ut5.Z2(this.LJIILIIL)) * 31) + C786410Ut5.Z2(this.LJIILJJIL)) * 31;
        String str7 = this.LJIILL;
        return ((iHashCode13 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.quickFollow.hashCode();
    }

    public final String toString() {
        return "TakoSug(isFirstSug=" + this.isFirstSug + ", sugList=" + this.sugList + ", sugCardType=" + this.sugCardType + ", replyUuid=" + this.replyUuid + ", replyMsgId=" + this.replyMsgId + ", answerMsgId=" + this.answerMsgId + ", sugMultiLanguageKeyMap=" + this.sugMultiLanguageKeyMap + ", isClick=" + this.isClick + ", sugShowType=" + this.sugShowType + ", sugGuide=" + this.sugGuide + ", sugIdList=" + this.sugIdList + ", sugSource=" + this.sugSource + ", passExtra=" + this.passExtra + ", sugTitle=" + this.sugTitle + ", emojiList=" + this.emojiList + ", lynxData=" + this.lynxData + ", sugFloatingContent=" + this.sugFloatingContent + ", botId=" + this.botId + ", extra=" + this.extra + ", videoInfo=" + this.videoInfo + ", actionId=" + this.LIZ + ", subSessionId=" + this.LIZIZ + ", isAnchorBotSug=" + this.LIZJ + ", sugWaitingReply=" + this.LIZLLL + ", commonInfo=" + this.LJ + ", mobParamMap=" + this.LJFF + ", statusCode=" + this.LJI + ", clientSeq=" + this.LJII + ", isSuccess=" + this.LJIIIIZZ + ", fromMessage=" + this.LJIIIZ + ", ignoreFirstSugLocate=" + this.LJIIJ + ", isMiddlePageSug=" + this.LJIIJJI + ", isPushUseMiddlePageSugStyle=" + this.LJIIL + ", isFromNewConversation=" + this.LJIILIIL + ", isSkeletonLoading=" + this.LJIILJJIL + ", subConversationId=" + this.LJIILL + ", quickFollow=" + this.quickFollow + ')';
    }

    public static TakoSug LIZ(TakoSug takoSug, boolean z, Map map, Map map2, long j, String str, boolean z2, boolean z3, k9 k9Var, int i, long j2, Message message, boolean z4, boolean z5, boolean z6, String str2, int i2, int i3) {
        List<String> list;
        Integer num;
        String str3;
        String str4;
        String str5;
        Map<String, String> map3;
        boolean z7;
        int i4;
        String str6;
        List<String> list2;
        Integer num2;
        String str7;
        List<String> list3;
        TakoLynx takoLynx;
        String str8;
        long j3;
        BaseVideo baseVideo;
        Map<String, String> map4;
        boolean z8;
        boolean z9;
        boolean z10;
        List<TakoQuickFollow> list4;
        boolean z11 = z5;
        boolean z12 = z4;
        boolean z13 = z6;
        long j4 = j2;
        int i5 = i;
        Message message2 = message;
        k9 k9Var2 = k9Var;
        boolean z14 = z2;
        String str9 = str2;
        Map map5 = map;
        long j5 = j;
        boolean z15 = z3;
        Map map6 = map2;
        String str10 = str;
        boolean z16 = z;
        if ((i2 & 1) != 0) {
            z16 = takoSug.isFirstSug;
        }
        if ((i2 & 2) != 0) {
            list = takoSug.sugList;
        } else {
            list = null;
        }
        if ((i2 & 4) != 0) {
            num = takoSug.sugCardType;
        } else {
            num = null;
        }
        if ((i2 & 8) != 0) {
            str3 = takoSug.replyUuid;
        } else {
            str3 = null;
        }
        if ((i2 & 16) != 0) {
            str4 = takoSug.replyMsgId;
        } else {
            str4 = null;
        }
        if ((i2 & 32) != 0) {
            str5 = takoSug.answerMsgId;
        } else {
            str5 = null;
        }
        if ((i2 & 64) != 0) {
            map3 = takoSug.sugMultiLanguageKeyMap;
        } else {
            map3 = null;
        }
        if ((i2 & 128) != 0) {
            z7 = takoSug.isClick;
        } else {
            z7 = false;
        }
        if ((i2 & 256) != 0) {
            i4 = takoSug.sugShowType;
        } else {
            i4 = 0;
        }
        if ((i2 & 512) != 0) {
            str6 = takoSug.sugGuide;
        } else {
            str6 = null;
        }
        if ((i2 & 1024) != 0) {
            list2 = takoSug.sugIdList;
        } else {
            list2 = null;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            num2 = takoSug.sugSource;
        } else {
            num2 = null;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            map5 = takoSug.passExtra;
        }
        if ((i2 & 8192) != 0) {
            str7 = takoSug.sugTitle;
        } else {
            str7 = null;
        }
        if ((i2 & 16384) != 0) {
            list3 = takoSug.emojiList;
        } else {
            list3 = null;
        }
        if ((32768 & i2) != 0) {
            takoLynx = takoSug.lynxData;
        } else {
            takoLynx = null;
        }
        if ((65536 & i2) != 0) {
            str8 = takoSug.sugFloatingContent;
        } else {
            str8 = null;
        }
        if ((131072 & i2) != 0) {
            j3 = takoSug.botId;
        } else {
            j3 = 0;
        }
        if ((262144 & i2) != 0) {
            map6 = takoSug.extra;
        }
        if ((524288 & i2) != 0) {
            baseVideo = takoSug.videoInfo;
        } else {
            baseVideo = null;
        }
        if ((1048576 & i2) != 0) {
            j5 = takoSug.LIZ;
        }
        if ((2097152 & i2) != 0) {
            str10 = takoSug.LIZIZ;
        }
        if ((4194304 & i2) != 0) {
            z14 = takoSug.LIZJ;
        }
        if ((8388608 & i2) != 0) {
            z15 = takoSug.LIZLLL;
        }
        if ((16777216 & i2) != 0) {
            k9Var2 = takoSug.LJ;
        }
        if ((33554432 & i2) != 0) {
            map4 = takoSug.LJFF;
        } else {
            map4 = null;
        }
        if ((67108864 & i2) != 0) {
            i5 = takoSug.LJI;
        }
        if ((134217728 & i2) != 0) {
            j4 = takoSug.LJII;
        }
        if ((268435456 & i2) != 0) {
            z8 = takoSug.LJIIIIZZ;
        } else {
            z8 = false;
        }
        if ((536870912 & i2) != 0) {
            message2 = takoSug.LJIIIZ;
        }
        if ((1073741824 & i2) != 0) {
            z9 = takoSug.LJIIJ;
        } else {
            z9 = false;
        }
        if ((i2 & Integer.MIN_VALUE) != 0) {
            z12 = takoSug.LJIIJJI;
        }
        if ((i3 & 1) != 0) {
            z11 = takoSug.LJIIL;
        }
        if ((i3 & 2) != 0) {
            z13 = takoSug.LJIILIIL;
        }
        if ((i3 & 4) != 0) {
            z10 = takoSug.LJIILJJIL;
        } else {
            z10 = false;
        }
        if ((i3 & 8) != 0) {
            str9 = takoSug.LJIILL;
        }
        if ((i3 & 16) != 0) {
            list4 = takoSug.quickFollow;
        } else {
            list4 = null;
        }
        takoSug.getClass();
        return new TakoSug(z16, list, num, str3, str4, str5, map3, z7, i4, str6, list2, num2, map5, str7, list3, takoLynx, str8, j3, map6, baseVideo, j5, str10, z14, z15, k9Var2, map4, i5, j4, z8, message2, z9, z12, z11, z13, z10, str9, list4);
    }

    public TakoSug(boolean z, List<String> list, Integer num, String str, String str2, String str3, Map<String, String> map, boolean z2, int i, String str4, List<String> list2, Integer num2, Map<String, String> map2, String str5, List<String> list3, TakoLynx takoLynx, String str6, long j, Map<String, String> map3, BaseVideo baseVideo, long j2, String str7, boolean z3, boolean z4, k9 k9Var, Map<String, String> map4, int i2, long j3, boolean z5, Message message, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, String str8, List<TakoQuickFollow> list4) {
        this.isFirstSug = z;
        this.sugList = list;
        this.sugCardType = num;
        this.replyUuid = str;
        this.replyMsgId = str2;
        this.answerMsgId = str3;
        this.sugMultiLanguageKeyMap = map;
        this.isClick = z2;
        this.sugShowType = i;
        this.sugGuide = str4;
        this.sugIdList = list2;
        this.sugSource = num2;
        this.passExtra = map2;
        this.sugTitle = str5;
        this.emojiList = list3;
        this.lynxData = takoLynx;
        this.sugFloatingContent = str6;
        this.botId = j;
        this.extra = map3;
        this.videoInfo = baseVideo;
        this.LIZ = j2;
        this.LIZIZ = str7;
        this.LIZJ = z3;
        this.LIZLLL = z4;
        this.LJ = k9Var;
        this.LJFF = map4;
        this.LJI = i2;
        this.LJII = j3;
        this.LJIIIIZZ = z5;
        this.LJIIIZ = message;
        this.LJIIJ = z6;
        this.LJIIJJI = z7;
        this.LJIIL = z8;
        this.LJIILIIL = z9;
        this.LJIILJJIL = z10;
        this.LJIILL = str8;
        this.quickFollow = list4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r37v0 */
    /* JADX WARN: Type inference failed for: r37v1, types: [com.ss.android.ugc.aweme.tako.ccl.model.api.Message] */
    /* JADX WARN: Type inference failed for: r37v2 */
    public TakoSug(boolean z, List list, Integer num, String str, String str2, String str3, Map map, boolean z2, int i, String str4, List list2, Integer num2, Map map2, String str5, List list3, TakoLynx takoLynx, String str6, long j, Map map3, BaseVideo baseVideo, long j2, String str7, boolean z3, boolean z4, k9 k9Var, Map map4, int i2, long j3, boolean z5, Message message, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, String str8, List list4, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        String str9;
        List list5 = list4;
        boolean z11 = z10;
        boolean z12 = z9;
        boolean z13 = z8;
        boolean z14 = z7;
        boolean z15 = z6;
        ?? r37 = message;
        boolean z16 = z5;
        int i5 = i2;
        k9 k9Var2 = k9Var;
        long j4 = j2;
        BaseVideo baseVideo2 = baseVideo;
        Map mapLJ = map3;
        long j5 = j;
        String str10 = str6;
        TakoLynx takoLynx2 = takoLynx;
        Integer num3 = num2;
        List list6 = list2;
        String str11 = str4;
        int i6 = i;
        boolean z17 = z2;
        Map mapLJ2 = map;
        ?? r32 = map4;
        List list7 = list3;
        String str12 = str3;
        String str13 = str2;
        String str14 = str;
        boolean z18 = z4;
        boolean z19 = z3;
        String str15 = str5;
        Integer num4 = num;
        List list8 = list;
        Map mapLJ3 = map2;
        boolean z20 = (i3 & 1) != 0 ? false : z;
        list8 = (i3 & 2) != 0 ? C13BV.INSTANCE : list8;
        num4 = (i3 & 4) != 0 ? null : num4;
        str14 = (i3 & 8) != 0 ? null : str14;
        str13 = (i3 & 16) != 0 ? null : str13;
        str12 = (i3 & 32) != 0 ? null : str12;
        mapLJ2 = (i3 & 64) != 0 ? C2097608Jq.LJ() : mapLJ2;
        z17 = (i3 & 128) != 0 ? false : z17;
        i6 = (i3 & 256) != 0 ? 0 : i6;
        str11 = (i3 & 512) != 0 ? "" : str11;
        list6 = (i3 & 1024) != 0 ? C13BV.INSTANCE : list6;
        num3 = (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : num3;
        mapLJ3 = (i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? C2097608Jq.LJ() : mapLJ3;
        str15 = (i3 & 8192) != 0 ? null : str15;
        list7 = (i3 & 16384) != 0 ? null : list7;
        takoLynx2 = (32768 & i3) != 0 ? null : takoLynx2;
        str10 = (65536 & i3) != 0 ? null : str10;
        j5 = (131072 & i3) != 0 ? 0L : j5;
        mapLJ = (262144 & i3) != 0 ? C2097608Jq.LJ() : mapLJ;
        baseVideo2 = (524288 & i3) != 0 ? null : baseVideo2;
        j4 = (1048576 & i3) != 0 ? 0L : j4;
        String str16 = (2097152 & i3) == 0 ? str7 : "";
        z19 = (4194304 & i3) != 0 ? false : z19;
        z18 = (8388608 & i3) != 0 ? false : z18;
        if ((16777216 & i3) != 0) {
            str9 = null;
            k9Var2 = new k9(0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127);
        } else {
            str9 = null;
        }
        this(z20, list8, num4, str14, str13, str12, mapLJ2, z17, i6, str11, list6, num3, mapLJ3, str15, list7, takoLynx2, str10, j5, mapLJ, baseVideo2, j4, str16, z19, z18, k9Var2, (33554432 & i3) != 0 ? str9 : r32, (67108864 & i3) != 0 ? 0 : i5, (134217728 & i3) == 0 ? j3 : 0L, (268435456 & i3) != 0 ? true : z16, (536870912 & i3) != 0 ? str9 : r37, (1073741824 & i3) != 0 ? false : z15, (i3 & Integer.MIN_VALUE) != 0 ? false : z14, (i4 & 1) != 0 ? false : z13, (i4 & 2) != 0 ? false : z12, (i4 & 4) != 0 ? false : z11, (i4 & 8) == 0 ? str8 : str9, (i4 & 16) != 0 ? C13BV.INSTANCE : list5);
    }
}
