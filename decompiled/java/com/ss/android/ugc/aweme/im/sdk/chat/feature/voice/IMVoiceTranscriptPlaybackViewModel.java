package com.ss.android.ugc.aweme.im.sdk.chat.feature.voice;

import X.C0PEM;
import X.C0VSJ;
import X.C0Z6D;
import X.C0ZDX;
import X.C0ZRA;
import X.C0ZSI;
import X.C0ZSJ;
import X.C1211004oW;
import X.C1329305Id;
import X.C140300gD;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2230008oU;
import X.C2230108oV;
import X.C2296808zG;
import X.C23250099c;
import X.C259800zU;
import X.C263240ATi;
import X.C458270Hy5;
import X.C458620Hye;
import X.C869590Y9l;
import X.C899820ZRs;
import X.C899830ZRt;
import X.C914160Zte;
import X.InterfaceC0148002o;
import X.InterfaceC458340HyC;
import X.InterfaceC458410HyJ;
import X.InterfaceC458460HyO;
import android.app.Activity;
import android.content.Context;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.IMVoiceMessageUtil;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.voice.IMVoiceTranscriptPlaybackViewModel;
import com.ss.android.ugc.aweme.preload.api.IIMPreloadService;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class IMVoiceTranscriptPlaybackViewModel extends AssemViewModel<InterfaceC0148002o> {
    public final InterfaceC458410HyJ LL = C458620Hye.LIZ.LJII();
    public final ConcurrentHashMap<String, Integer> LLILLJJLI = new ConcurrentHashMap<>();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C914160Zte(16);
    }

    public static void vQ2(String str) {
        IMVoiceMessageUtil.LIZ.getClass();
        IMVoiceMessageUtil.LJIIJ("IMVoiceTranscriptPlaybackViewModel", str);
    }

    public static boolean zQ2(C899830ZRt c899830ZRt) {
        int iIntValue = ((Number) C263240ATi.LIZ.getValue()).intValue();
        if (iIntValue == 0) {
            return false;
        }
        if (iIntValue == 1) {
            return c899830ZRt.LIZLLL;
        }
        if (iIntValue == 2) {
            return true;
        }
        return c899830ZRt.LIZLLL;
    }

    public static void yQ2(C869590Y9l c869590Y9l, C2230008oU c2230008oU) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C0Z6D(c2230008oU, c869590Y9l, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v2, types: [X.0ZSE] */
    /* JADX WARN: Type inference failed for: r2v10, types: [T, X.08oU] */
    /* JADX WARN: Type inference failed for: r9v3, types: [X.0ZSF] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void wQ2(final Context context, final C869590Y9l c869590Y9l, C899820ZRs c899820ZRs, final SessionInfo sessionInfo, final C0ZSJ c0zsj, C2230008oU c2230008oU) {
        String str;
        String str2;
        IIMPreloadService iIMPreloadService;
        C2230008oU c2230008oU2 = c2230008oU;
        boolean zLJJJJIZL = C0ZDX.LJJJJIZL(c869590Y9l);
        final C259800zU c259800zU = new C259800zU();
        int i = 0;
        T c2230008oU3 = c2230008oU2;
        if (c2230008oU2 == null) {
            String strValueOf = String.valueOf(c869590Y9l.getMsgId());
            int i2 = c899820ZRs.LIZJ.LIZ;
            long jCurrentTimeMillis = System.currentTimeMillis();
            c2230008oU3 = new C2230008oU(strValueOf, Integer.valueOf(zLJJJJIZL ? 1 : 0), Integer.valueOf(!C0ZRA.LIZ(c869590Y9l).hasInteracted ? 1 : 0), Integer.valueOf(i2), null, null, 0, Long.valueOf(jCurrentTimeMillis), "playback", c869590Y9l.getSourceVregion(), 97776);
        }
        c259800zU.element = c2230008oU3;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("enter_from", "chat");
        pairArr[1] = new Pair("duration", String.valueOf(c899820ZRs.LIZJ.LIZIZ));
        if (zLJJJJIZL) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[2] = new Pair("is_self", str);
        pairArr[3] = new Pair("is_unread", CardStruct.IStatusCode.DEFAULT);
        if (sessionInfo.isSingleChat()) {
            str2 = "private";
        } else if (sessionInfo.isGroupChat()) {
            str2 = "group";
        } else {
            str2 = "";
        }
        pairArr[4] = new Pair("chat_type", str2);
        pairArr[5] = new Pair("from_user_id", String.valueOf(c869590Y9l.getSender()));
        C458270Hy5 c458270Hy5 = new C458270Hy5("voice_message_play_finish", C2097608Jq.LJIIIIZZ(pairArr));
        IMVoiceMessageUtil iMVoiceMessageUtil = IMVoiceMessageUtil.LIZ;
        iMVoiceMessageUtil.getClass();
        final String str3 = IMVoiceMessageUtil.LIZLLL;
        final C899830ZRt c899830ZRt = c899820ZRs.LIZIZ;
        if (new C0VSJ(c899830ZRt.LIZ).exists()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("play LOCAL, msgId=");
            sbLIZ.append(c869590Y9l.getMsgId());
            sbLIZ.append(", path=");
            sbLIZ.append(c899830ZRt.LIZ);
            vQ2(C2188811AlT.LIZIZ(sbLIZ));
            C2230008oU c2230008oULIZ = C2230008oU.LIZ((C2230008oU) c259800zU.element, 0, null, 1, null, null, null, null, null, null, null, null, null, 524223);
            InterfaceC458410HyJ interfaceC458410HyJ = this.LL;
            String str4 = c899830ZRt.LIZ;
            interfaceC458410HyJ.LJIIJ(str4, str4, c2230008oULIZ, c458270Hy5, new InterfaceC458340HyC() { // from class: X.0ZSH
                @Override // X.InterfaceC458340HyC
                public final void LJJLIIIJ() {
                    C869590Y9l c869590Y9lLIZ;
                    C0ZSJ c0zsj2 = c0zsj;
                    if (Intrinsics.LJFF(c0zsj2, C0ZSK.LIZ)) {
                        return;
                    }
                    if (!(c0zsj2 instanceof C0ZSG)) {
                        throw new C1954807lC();
                    }
                    IMVoiceMessageUtil.LIZ.getClass();
                    if (Intrinsics.LJFF(IMVoiceMessageUtil.LIZLLL, str3) && (c869590Y9lLIZ = ((C0ZSG) c0zsj).LIZ(c869590Y9l)) != null) {
                        this.wQ2(context, c869590Y9lLIZ, C899710ZRh.LIZ(c869590Y9lLIZ), sessionInfo, c0zsj, null);
                    }
                }
            });
            if (C2230108oV.LIZIZ.remove(c869590Y9l.getUuid()) != null) {
                i = 1;
            }
            C2230108oV.LIZ(i, c869590Y9l.getUuid(), "playback");
            return;
        }
        c259800zU.element = C2230008oU.LIZ((C2230008oU) c259800zU.element, 0, null, 0, null, null, null, null, null, null, null, null, null, 524223);
        String str5 = c899830ZRt.LIZIZ;
        if (str5 != null && str5.length() != 0) {
            if (C140300gD.LIZ()) {
                if (IMVoiceMessageUtil.LJIIJJI(c869590Y9l, c899830ZRt.LIZIZ) && zQ2(c899830ZRt)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("playStream skipped, url expired -> refresh, msgId=");
                    sbLIZ2.append(c869590Y9l.getMsgId());
                    vQ2(C2188811AlT.LIZIZ(sbLIZ2));
                    yQ2(c869590Y9l, (C2230008oU) c259800zU.element);
                    return;
                }
                if (((Boolean) C1211004oW.LIZJ.getValue()).booleanValue() && (iIMPreloadService = (IIMPreloadService) PluggableExtentionKt.pluggableSpiForReal(IIMPreloadService.class)) != null && iIMPreloadService.LIZ() != null) {
                    C1329305Id.LIZIZ(c869590Y9l.getUuid());
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("play STREAM, msgId=");
                sbLIZ3.append(c869590Y9l.getMsgId());
                vQ2(C2188811AlT.LIZIZ(sbLIZ3));
                this.LL.LJI(c899830ZRt.LIZ, Collections.singletonList(c899830ZRt.LIZIZ), (C2230008oU) c259800zU.element, c458270Hy5, new InterfaceC458340HyC() { // from class: X.0ZSF
                    @Override // X.InterfaceC458340HyC
                    public final void LJJLIIIJ() {
                        C869590Y9l c869590Y9lLIZ;
                        this.LLILLJJLI.remove(c869590Y9l.getUuid());
                        C0ZSJ c0zsj2 = c0zsj;
                        if (Intrinsics.LJFF(c0zsj2, C0ZSK.LIZ)) {
                            return;
                        }
                        if (!(c0zsj2 instanceof C0ZSG)) {
                            throw new C1954807lC();
                        }
                        IMVoiceMessageUtil.LIZ.getClass();
                        if (Intrinsics.LJFF(IMVoiceMessageUtil.LIZLLL, str3) && (c869590Y9lLIZ = ((C0ZSG) c0zsj).LIZ(c869590Y9l)) != null) {
                            this.wQ2(context, c869590Y9lLIZ, C899710ZRh.LIZ(c869590Y9lLIZ), sessionInfo, c0zsj, null);
                        }
                    }
                }, new InterfaceC458460HyO() { // from class: X.0ZSE
                    @Override // X.InterfaceC458460HyO
                    public final void LIZ(Integer num) {
                        int iIntValue;
                        IMVoiceTranscriptPlaybackViewModel iMVoiceTranscriptPlaybackViewModel = this.LIZ;
                        Context context2 = context;
                        C869590Y9l c869590Y9l2 = c869590Y9l;
                        C899830ZRt c899830ZRt2 = c899830ZRt;
                        C2230008oU c2230008oU4 = c259800zU.element;
                        Integer num2 = iMVoiceTranscriptPlaybackViewModel.LLILLJJLI.get(c869590Y9l2.getUuid());
                        if (num2 != null) {
                            iIntValue = num2.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        if (IMVoiceTranscriptPlaybackViewModel.zQ2(c899830ZRt2) && iIntValue < 1) {
                            int i3 = iIntValue + 1;
                            iMVoiceTranscriptPlaybackViewModel.LLILLJJLI.put(c869590Y9l2.getUuid(), Integer.valueOf(i3));
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("playStream failed (networkErrorCode=");
                            sbLIZ4.append(num);
                            sbLIZ4.append("), msgId=");
                            sbLIZ4.append(c869590Y9l2.getMsgId());
                            sbLIZ4.append(", refresh retry ");
                            sbLIZ4.append(i3);
                            sbLIZ4.append("/1");
                            IMVoiceTranscriptPlaybackViewModel.vQ2(C2188811AlT.LIZIZ(sbLIZ4));
                            IMVoiceTranscriptPlaybackViewModel.yQ2(c869590Y9l2, c2230008oU4);
                            return;
                        }
                        iMVoiceTranscriptPlaybackViewModel.LLILLJJLI.remove(c869590Y9l2.getUuid());
                        Activity activityLIZ = C1388190mED.LIZ(context2);
                        if (activityLIZ == null) {
                            return;
                        }
                        C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                        c1389890mGx.LJIIIZ(2131834210);
                        c1389890mGx.LJIIJJI();
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("playStream failed, give up (retried=");
                        sbLIZ5.append(iIntValue);
                        sbLIZ5.append("), msgId=");
                        sbLIZ5.append(c869590Y9l2.getMsgId());
                        sbLIZ5.append(", networkErrorCode=");
                        sbLIZ5.append(num);
                        sbLIZ5.append(", refresh action=");
                        sbLIZ5.append(c899830ZRt2.LIZLLL);
                        IMVoiceTranscriptPlaybackViewModel.vQ2(C2188811AlT.LIZIZ(sbLIZ5));
                    }
                });
                return;
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("play DOWNLOAD, msgId=");
            sbLIZ4.append(c869590Y9l.getMsgId());
            vQ2(C2188811AlT.LIZIZ(sbLIZ4));
            iMVoiceMessageUtil.LJ(c899830ZRt.LIZJ, context, c899830ZRt.LIZIZ, c899830ZRt.LIZ, (C2230008oU) c259800zU.element, new AwS558S0100000_14(context, 626), new C0ZSI(str3, this, context, c869590Y9l, c899820ZRs, sessionInfo, c0zsj));
            return;
        }
        if (zQ2(c899830ZRt)) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("no remote url, refreshing message, msgId=");
            sbLIZ5.append(c869590Y9l.getMsgId());
            vQ2(C2188811AlT.LIZIZ(sbLIZ5));
            yQ2(c869590Y9l, (C2230008oU) c259800zU.element);
            return;
        }
        int iIntValue = ((Number) C263240ATi.LIZ.getValue()).intValue();
        C2230008oU.LIZ((C2230008oU) c259800zU.element, 4, null, null, null, null, null, null, null, null, null, null, null, 524271).LIZIZ();
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("no remote url, refresh not enabled (audit pending, give up), msgId=");
        sbLIZ6.append(c869590Y9l.getMsgId());
        sbLIZ6.append(", mode=");
        sbLIZ6.append(iIntValue);
        sbLIZ6.append(", refresh action=");
        sbLIZ6.append(c899830ZRt.LIZLLL);
        vQ2(C2188811AlT.LIZIZ(sbLIZ6));
    }
}
