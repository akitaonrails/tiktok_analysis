package defpackage;

import X.C13BV;
import X.C1697810uHb;
import X.C1863380yae;
import X.C1E8R;
import X.C786410Ut5;
import X.InterfaceC1856420yPQ;
import X.InterfaceC1859790yUr;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.tako.ccl.model.ActionDoc;
import com.ss.android.ugc.aweme.tako.ccl.model.BotDoc;
import com.ss.android.ugc.aweme.tako.ccl.model.EntryDoc;
import com.ss.android.ugc.aweme.tako.ccl.model.NovelStatus;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BatchUpdateMessage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.EntityIntro;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.SubConversationInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug;
import com.ss.android.ugc.aweme.tako.ccl.model.api.UpSyncItem;
import com.ss.android.ugc.aweme.tako.ccl.model.request.ExtraRequestInfo;
import defpackage.p2;
import defpackage.w2;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class r2 implements p2 {
    public final int LIZIZ;
    public final Message LIZJ;
    public final Function0<Unit> LIZLLL;
    public final Function1<List<BaseImage>, Unit> LJ;
    public final Function1<Long, Unit> LJFF;
    public final Function1<TakoSug, Unit> LJI;
    public final Function1<TakoSug, Unit> LJII;
    public final Function1<EntityIntro, Unit> LJIIIIZZ;
    public final Integer LJIIIZ;
    public final UpSyncItem LJIIJ;
    public final int LJIIJJI;
    public final int LJIIL;
    public final Function1<w2, Unit> LJIILIIL;
    public final C1E8R LJIILJJIL;
    public final boolean LJIILL;
    public final C1863380yae LJIILLIIL;
    public final ActionDoc LJIIZILJ;
    public final BotDoc LJIJ;
    public final List<Message> LJIJI;
    public final List<BatchUpdateMessage> LJIJJ;
    public final NovelStatus LJIJJLI;
    public final InterfaceC1859790yUr LJIL;
    public final Message LJJ;
    public final ExtraRequestInfo LJJI;
    public final Map<String, String> LJJIFFI;
    public volatile boolean LJJII;
    public final InterfaceC1856420yPQ LJJIII;
    public final int LJJIIJ;
    public final int LJJIIJZLJL;
    public final boolean LJJIIZ;
    public final Map<String, String> LJJIIZI;
    public final Message LJJIJ;
    public final int LJJIJIIJI;
    public final Integer LJJIJIIJIL;
    public final String LJJIJIL;
    public final String LJJIJL;
    public final boolean LJJIJLIJ;
    public final String LJJIL;
    public final String LJJIZ;
    public final boolean LJJJ;
    public final boolean LJJJI;
    public final boolean LJJJIL;
    public SubConversationInfo LJJJJ;
    public final boolean LJJJJI;
    public final w2.a LJJJJIZL;
    public p2.b LJJJJJ;

    public final boolean LIZJ() {
        return C1697810uHb.LJIIJJI(1, 4, 9, 1007).contains(Integer.valueOf(getOp()));
    }

    public final boolean LIZLLL() {
        return C1697810uHb.LJIIJJI(1, 2, 1003, 9, 1007, 13, 16).contains(Integer.valueOf(getOp()));
    }

    public final boolean LJFF() {
        return C1697810uHb.LJIIJJI(4, 5, 9).contains(Integer.valueOf(getOp()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj;
        return this.LIZIZ == r2Var.LIZIZ && Intrinsics.LJFF(this.LIZJ, r2Var.LIZJ) && Intrinsics.LJFF(this.LIZLLL, r2Var.LIZLLL) && Intrinsics.LJFF(this.LJ, r2Var.LJ) && Intrinsics.LJFF(this.LJFF, r2Var.LJFF) && Intrinsics.LJFF(this.LJI, r2Var.LJI) && Intrinsics.LJFF(this.LJII, r2Var.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, r2Var.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, r2Var.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, r2Var.LJIIJ) && this.LJIIJJI == r2Var.LJIIJJI && this.LJIIL == r2Var.LJIIL && Intrinsics.LJFF(this.LJIILIIL, r2Var.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, r2Var.LJIILJJIL) && this.LJIILL == r2Var.LJIILL && Intrinsics.LJFF(this.LJIILLIIL, r2Var.LJIILLIIL) && Intrinsics.LJFF(this.LJIIZILJ, r2Var.LJIIZILJ) && Intrinsics.LJFF(this.LJIJ, r2Var.LJIJ) && Intrinsics.LJFF(this.LJIJI, r2Var.LJIJI) && Intrinsics.LJFF(this.LJIJJ, r2Var.LJIJJ) && Intrinsics.LJFF(this.LJIJJLI, r2Var.LJIJJLI) && Intrinsics.LJFF(this.LJIL, r2Var.LJIL) && Intrinsics.LJFF(this.LJJ, r2Var.LJJ) && Intrinsics.LJFF(this.LJJI, r2Var.LJJI) && Intrinsics.LJFF(this.LJJIFFI, r2Var.LJJIFFI) && this.LJJII == r2Var.LJJII && Intrinsics.LJFF(this.LJJIII, r2Var.LJJIII) && this.LJJIIJ == r2Var.LJJIIJ && this.LJJIIJZLJL == r2Var.LJJIIJZLJL && this.LJJIIZ == r2Var.LJJIIZ && Intrinsics.LJFF(this.LJJIIZI, r2Var.LJJIIZI) && Intrinsics.LJFF(this.LJJIJ, r2Var.LJJIJ) && this.LJJIJIIJI == r2Var.LJJIJIIJI && Intrinsics.LJFF(this.LJJIJIIJIL, r2Var.LJJIJIIJIL) && Intrinsics.LJFF(this.LJJIJIL, r2Var.LJJIJIL) && Intrinsics.LJFF(this.LJJIJL, r2Var.LJJIJL) && this.LJJIJLIJ == r2Var.LJJIJLIJ && Intrinsics.LJFF(this.LJJIL, r2Var.LJJIL) && Intrinsics.LJFF(this.LJJIZ, r2Var.LJJIZ) && this.LJJJ == r2Var.LJJJ && this.LJJJI == r2Var.LJJJI && this.LJJJIL == r2Var.LJJJIL && Intrinsics.LJFF(this.LJJJJ, r2Var.LJJJJ) && this.LJJJJI == r2Var.LJJJJI && this.LJJJJIZL == r2Var.LJJJJIZL;
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZIZ * 31) + this.LIZJ.hashCode()) * 31;
        Function0<Unit> function0 = this.LIZLLL;
        int iHashCode2 = (iHashCode + (function0 == null ? 0 : function0.hashCode())) * 31;
        Function1<List<BaseImage>, Unit> function1 = this.LJ;
        int iHashCode3 = (iHashCode2 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function1<Long, Unit> function12 = this.LJFF;
        int iHashCode4 = (iHashCode3 + (function12 == null ? 0 : function12.hashCode())) * 31;
        Function1<TakoSug, Unit> function13 = this.LJI;
        int iHashCode5 = (iHashCode4 + (function13 == null ? 0 : function13.hashCode())) * 31;
        Function1<TakoSug, Unit> function14 = this.LJII;
        int iHashCode6 = (iHashCode5 + (function14 == null ? 0 : function14.hashCode())) * 31;
        Function1<EntityIntro, Unit> function15 = this.LJIIIIZZ;
        int iHashCode7 = (iHashCode6 + (function15 == null ? 0 : function15.hashCode())) * 31;
        Integer num = this.LJIIIZ;
        int iHashCode8 = (((((((((iHashCode7 + (num == null ? 0 : num.hashCode())) * 31) + this.LJIIJ.hashCode()) * 31) + this.LJIIJJI) * 31) + this.LJIIL) * 31) + this.LJIILIIL.hashCode()) * 31;
        C1E8R c1e8r = this.LJIILJJIL;
        int iHashCode9 = (((((((((((((iHashCode8 + (c1e8r == null ? 0 : c1e8r.hashCode())) * 31) + C786410Ut5.Z2(this.LJIILL)) * 31) + this.LJIILLIIL.hashCode()) * 31) + this.LJIIZILJ.hashCode()) * 31) + this.LJIJ.hashCode()) * 31) + this.LJIJI.hashCode()) * 31) + this.LJIJJ.hashCode()) * 31;
        NovelStatus novelStatus = this.LJIJJLI;
        int iHashCode10 = (iHashCode9 + (novelStatus == null ? 0 : novelStatus.hashCode())) * 31;
        InterfaceC1859790yUr interfaceC1859790yUr = this.LJIL;
        int iHashCode11 = (((iHashCode10 + (interfaceC1859790yUr == null ? 0 : interfaceC1859790yUr.hashCode())) * 31) + this.LJJ.hashCode()) * 31;
        ExtraRequestInfo extraRequestInfo = this.LJJI;
        int iHashCode12 = (((((iHashCode11 + (extraRequestInfo == null ? 0 : extraRequestInfo.hashCode())) * 31) + this.LJJIFFI.hashCode()) * 31) + C786410Ut5.Z2(this.LJJII)) * 31;
        InterfaceC1856420yPQ interfaceC1856420yPQ = this.LJJIII;
        int iHashCode13 = (((((((iHashCode12 + (interfaceC1856420yPQ == null ? 0 : interfaceC1856420yPQ.hashCode())) * 31) + this.LJJIIJ) * 31) + this.LJJIIJZLJL) * 31) + C786410Ut5.Z2(this.LJJIIZ)) * 31;
        Map<String, String> map = this.LJJIIZI;
        int iHashCode14 = (iHashCode13 + (map == null ? 0 : map.hashCode())) * 31;
        Message message = this.LJJIJ;
        int iHashCode15 = (((iHashCode14 + (message == null ? 0 : message.hashCode())) * 31) + this.LJJIJIIJI) * 31;
        Integer num2 = this.LJJIJIIJIL;
        int iHashCode16 = (((((((((((((((((iHashCode15 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.LJJIJIL.hashCode()) * 31) + this.LJJIJL.hashCode()) * 31) + C786410Ut5.Z2(this.LJJIJLIJ)) * 31) + this.LJJIL.hashCode()) * 31) + this.LJJIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LJJJ)) * 31) + C786410Ut5.Z2(this.LJJJI)) * 31) + C786410Ut5.Z2(this.LJJJIL)) * 31;
        SubConversationInfo subConversationInfo = this.LJJJJ;
        int iHashCode17 = (((iHashCode16 + (subConversationInfo == null ? 0 : subConversationInfo.hashCode())) * 31) + C786410Ut5.Z2(this.LJJJJI)) * 31;
        w2.a aVar = this.LJJJJIZL;
        return iHashCode17 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "MessageActionImpl(op=" + this.LIZIZ + ", sendItem=" + this.LIZJ + ", sendSuccessCallback=" + this.LIZLLL + ", imageUploadSuccessCallback=" + this.LJ + ", imageUploadErrorCallback=" + this.LJFF + ", sugCallback=" + this.LJI + ", entityWordSugCallback=" + this.LJII + ", entityWordIntroCallback=" + this.LJIIIIZZ + ", entityOpRetryType=" + this.LJIIIZ + ", upSyncItem=" + this.LJIIJ + ", pullCount=" + this.LJIIJJI + ", pullMsgSource=" + this.LJIIL + ", callback=" + this.LJIILIIL + ", historyPatchCallback=" + this.LJIILJJIL + ", syncCheck=" + this.LJIILL + ", conversationModel=" + this.LJIILLIIL + ", actionDoc=" + this.LJIIZILJ + ", botDoc=" + this.LJIJ + ", batchDeleteList=" + this.LJIJI + ", batchUpdateMessageList=" + this.LJIJJ + ", novelStatus=" + this.LJIJJLI + ", chunkRspCallback=" + this.LJIL + ", stopMessage=" + this.LJJ + ", extraRequestInfo=" + this.LJJI + ", ext=" + this.LJJIFFI + ", withScrollAnimation=" + this.LJJII + ", uploader=" + this.LJJIII + ", genStyle=" + this.LJJIIJ + ", versionSeq=" + this.LJJIIJZLJL + ", isPreFetch=" + this.LJJIIZ + ", preFetchParams=" + this.LJJIIZI + ", originAnswer=" + this.LJJIJ + ", activeSubModeBar=" + this.LJJIJIIJI + ", activeTemplateType=" + this.LJJIJIIJIL + ", aiImageFrom=" + this.LJJIJIL + ", actionBarUniqueKey=" + this.LJJIJL + ", deleteConversation=" + this.LJJIJLIJ + ", conversationId2Delete=" + this.LJJIL + ", subConversationId2Delete=" + this.LJJIZ + ", syncDeleteConversation2Remote=" + this.LJJJ + ", isMiddlePage=" + this.LJJJI + ", isFromNewConversation=" + this.LJJJIL + ", createSubConversationInfo=" + this.LJJJJ + ", isSwitchMessage=" + this.LJJJJI + ", switchAnswerType=" + this.LJJJJIZL + ')';
    }

    public final k9 LIZ() {
        String str;
        String str2;
        String strLIZIZ = LIZIZ();
        EntryDoc entryDocInvoke = this.LJIILLIIL.LIZ.invoke();
        if (this.LJJIIZ) {
            Map<String, String> map = this.LJJIIZI;
            String str3 = "";
            if (map == null || (str = map.get("enter_from")) == null) {
                str = "";
            }
            Map<String, String> map2 = this.LJJIIZI;
            if (map2 != null && (str2 = map2.get("enter_method")) != null) {
                str3 = str2;
            }
            entryDocInvoke = new EntryDoc(entryDocInvoke.LIZ, entryDocInvoke.LIZIZ, entryDocInvoke.gid, entryDocInvoke.pred, entryDocInvoke.textFactor, entryDocInvoke.viewDuration, entryDocInvoke.feedBar, str, str3, entryDocInvoke.subEnterMethod, entryDocInvoke.firstReplyStatus, entryDocInvoke.searchId, entryDocInvoke.feedConsumeInfos, entryDocInvoke.sarInfo, entryDocInvoke.location, entryDocInvoke.visualSearchContextMessages, entryDocInvoke.askMsgId, entryDocInvoke.LIZJ);
        }
        return new k9(this, strLIZIZ, entryDocInvoke, 71);
    }

    public final String LIZIZ() {
        String str;
        if (!this.LJJIIZ) {
            return this.LJIILLIIL.LJ;
        }
        Map<String, String> map = this.LJJIIZI;
        return (map == null || (str = map.get("process_id")) == null) ? "" : str;
    }

    public final boolean LJ() {
        return Collections.singletonList(12).contains(Integer.valueOf(getOp()));
    }

    @Override // defpackage.p2
    public final Map<String, String> getExt() {
        return this.LJJIFFI;
    }

    @Override // defpackage.p2
    public final int getOp() {
        return this.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r2(int i, Message message, Function0<Unit> function0, Function1<? super List<BaseImage>, Unit> function1, Function1<? super Long, Unit> function12, Function1<? super TakoSug, Unit> function13, Function1<? super TakoSug, Unit> function14, Function1<? super EntityIntro, Unit> function15, Integer num, UpSyncItem upSyncItem, int i2, int i3, Function1<? super w2, Unit> function16, C1E8R c1e8r, boolean z, C1863380yae c1863380yae, ActionDoc actionDoc, BotDoc botDoc, List<Message> list, List<BatchUpdateMessage> list2, NovelStatus novelStatus, InterfaceC1859790yUr interfaceC1859790yUr, Message message2, ExtraRequestInfo extraRequestInfo, Map<String, String> map, boolean z2, InterfaceC1856420yPQ interfaceC1856420yPQ, int i4, int i5, boolean z3, Map<String, String> map2, Message message3, int i6, Integer num2, String str, String str2, boolean z4, String str3, String str4, boolean z5, boolean z6, boolean z7, SubConversationInfo subConversationInfo, boolean z8, w2.a aVar) {
        this.LIZIZ = i;
        this.LIZJ = message;
        this.LIZLLL = function0;
        this.LJ = function1;
        this.LJFF = function12;
        this.LJI = function13;
        this.LJII = function14;
        this.LJIIIIZZ = function15;
        this.LJIIIZ = num;
        this.LJIIJ = upSyncItem;
        this.LJIIJJI = i2;
        this.LJIIL = i3;
        this.LJIILIIL = function16;
        this.LJIILJJIL = c1e8r;
        this.LJIILL = z;
        this.LJIILLIIL = c1863380yae;
        this.LJIIZILJ = actionDoc;
        this.LJIJ = botDoc;
        this.LJIJI = list;
        this.LJIJJ = list2;
        this.LJIJJLI = novelStatus;
        this.LJIL = interfaceC1859790yUr;
        this.LJJ = message2;
        this.LJJI = extraRequestInfo;
        this.LJJIFFI = map;
        this.LJJII = z2;
        this.LJJIII = interfaceC1856420yPQ;
        this.LJJIIJ = i4;
        this.LJJIIJZLJL = i5;
        this.LJJIIZ = z3;
        this.LJJIIZI = map2;
        this.LJJIJ = message3;
        this.LJJIJIIJI = i6;
        this.LJJIJIIJIL = num2;
        this.LJJIJIL = str;
        this.LJJIJL = str2;
        this.LJJIJLIJ = z4;
        this.LJJIL = str3;
        this.LJJIZ = str4;
        this.LJJJ = z5;
        this.LJJJI = z6;
        this.LJJJIL = z7;
        this.LJJJJ = subConversationInfo;
        this.LJJJJI = z8;
        this.LJJJJIZL = aVar;
        this.LJJJJJ = p2.b.QUEUE;
    }

    public r2(int i, Message message, AwS571S0100000_27 awS571S0100000_27, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Integer num, UpSyncItem upSyncItem, int i2, int i3, Function1 function16, C1E8R c1e8r, boolean z, C1863380yae c1863380yae, ActionDoc actionDoc, BotDoc botDoc, List list, List list2, NovelStatus novelStatus, InterfaceC1859790yUr interfaceC1859790yUr, Message message2, ExtraRequestInfo extraRequestInfo, Map map, boolean z2, InterfaceC1856420yPQ interfaceC1856420yPQ, int i4, int i5, boolean z3, Map map2, Message message3, int i6, Integer num2, String str, String str2, boolean z4, String str3, String str4, boolean z5, boolean z6, boolean z7, boolean z8, w2.a aVar, int i7, int i8) {
        this((i7 & 1) != 0 ? 0 : i, (i7 & 2) != 0 ? new Message(null, null, null, null, null, null, false, null, 0L, 0L, null, 0, null, null, false, 0, false, null, null, 0L, 0L, 0L, 0, 0, 0, null, 0, null, 0L, false, 0, 0, null, null, false, false, 0, null, 0L, 0, 0, null, 0L, null, false, null, null, null, null, null, null, false, null, -1, 2097151, null) : message, (i7 & 4) != 0 ? null : awS571S0100000_27, (i7 & 8) != 0 ? null : function1, (i7 & 16) != 0 ? null : function12, (i7 & 32) != 0 ? null : function13, (i7 & 64) != 0 ? null : function14, (i7 & 128) != 0 ? null : function15, (i7 & 256) != 0 ? null : num, (i7 & 512) != 0 ? new UpSyncItem(null, null, null, 0, false, false, false, null, null, null, null, false, false, 8191, null) : upSyncItem, (i7 & 1024) != 0 ? 0 : i2, (i7 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 0 : i3, (i7 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? AFwS283S0000000_35.get$arr$(190) : function16, (i7 & 8192) != 0 ? null : c1e8r, (i7 & 16384) != 0 ? false : z, c1863380yae, (65536 & i7) != 0 ? new ActionDoc(0L, "") : actionDoc, (131072 & i7) != 0 ? new BotDoc(0L, "", -1) : botDoc, (262144 & i7) != 0 ? C13BV.INSTANCE : list, (524288 & i7) != 0 ? C13BV.INSTANCE : list2, (1048576 & i7) != 0 ? null : novelStatus, (2097152 & i7) != 0 ? null : interfaceC1859790yUr, (4194304 & i7) != 0 ? new Message(null, null, null, null, null, null, false, null, 0L, 0L, null, 0, null, null, false, 0, false, null, null, 0L, 0L, 0L, 0, 0, 0, null, 0, null, 0L, false, 0, 0, null, null, false, false, 0, null, 0L, 0, 0, null, 0L, null, false, null, null, null, null, null, null, false, null, -1, 2097151, null) : message2, (8388608 & i7) != 0 ? null : extraRequestInfo, (16777216 & i7) != 0 ? new LinkedHashMap() : map, (33554432 & i7) != 0 ? false : z2, (67108864 & i7) != 0 ? null : interfaceC1856420yPQ, (134217728 & i7) != 0 ? 0 : i4, (268435456 & i7) != 0 ? 0 : i5, (536870912 & i7) != 0 ? false : z3, (1073741824 & i7) != 0 ? null : map2, (i7 & Integer.MIN_VALUE) != 0 ? null : message3, (i8 & 1) != 0 ? 0 : i6, (i8 & 2) != 0 ? null : num2, (i8 & 4) != 0 ? "" : str, (i8 & 8) != 0 ? "" : str2, (i8 & 16) != 0 ? false : z4, (i8 & 32) != 0 ? "" : str3, (i8 & 64) == 0 ? str4 : "", (i8 & 128) != 0 ? false : z5, (i8 & 256) != 0 ? false : z6, (i8 & 512) != 0 ? false : z7, null, (i8 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z8, (i8 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? aVar : null);
    }
}
