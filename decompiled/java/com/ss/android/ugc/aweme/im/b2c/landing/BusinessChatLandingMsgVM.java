package com.ss.android.ugc.aweme.im.b2c.landing;

import X.C01GW;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C0I0B;
import X.C0YHR;
import X.C0YNP;
import X.C0YTZ;
import X.C0ZDT;
import X.C13DA;
import X.C1559260qg8;
import X.C1668706g9;
import X.C1684506ih;
import X.C1736506r5;
import X.C1736806r8;
import X.C1737506rF;
import X.C1742306s1;
import X.C1742506s3;
import X.C20684815ws;
import X.C2097608Jq;
import X.C23250099c;
import X.C23260099m;
import X.C452501pT;
import X.C455040Hss;
import X.C457780HxI;
import X.C459910I1t;
import X.C461720I8s;
import X.C723600SZy;
import X.C869590Y9l;
import X.C874730YTf;
import X.C874770YTj;
import X.C874780YTk;
import X.C874810YTn;
import X.C882760Yk6;
import X.C901060ZWm;
import X.C909290Zln;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1743406sC;
import X.InterfaceC1743606sE;
import X.InterfaceC1743706sF;
import X.InterfaceC1757506uT;
import android.util.SparseArray;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.content.TextContent;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeMsgOperatorService;
import com.ss.android.ugc.aweme.im.sdk.common.controller.analytics.IMAnalyticsUtil;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS211S0300000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class BusinessChatLandingMsgVM extends AssemViewModel<C1736506r5> implements InterfaceC1743406sC, InterfaceC1743606sE {
    public final InterfaceC1743706sF LL;
    public final ChatroomEventAbility LLILLJJLI;
    public C1737506rF LLILZ;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public final C1559260qg8 LLILLL = new C1559260qg8(new C723600SZy(this, C457780HxI.class, null), true);
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 312));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 311));
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(340));
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(339));
    public List<C1736806r8> LLJIJIL = new ArrayList();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1736506r5(0);
    }

    public final C909290Zln vQ2() {
        C457780HxI c457780HxI = (C457780HxI) this.LLILLL.getValue();
        SessionInfo sessionInfo = c457780HxI != null ? c457780HxI.LL : null;
        if (sessionInfo instanceof C909290Zln) {
            return (C909290Zln) sessionInfo;
        }
        return null;
    }

    public final C1742506s3 wQ2() {
        return (C1742506s3) this.LLJ.getValue();
    }

    public final String xQ2() {
        C909290Zln c909290ZlnVQ2 = vQ2();
        if (c909290ZlnVQ2 != null) {
            return c909290ZlnVQ2.getTrafficTypeForMob();
        }
        return null;
    }

    public final void DQ2(String str) {
        if (C455040Hss.LIZ()) {
            C1737506rF c1737506rF = this.LLILZ;
            if (c1737506rF != null) {
                C1742306s1.LIZIZ(str, c1737506rF);
            }
            this.LLILZ = null;
            return;
        }
        CopyOnWriteArrayList<InterfaceC1743406sC> copyOnWriteArrayList = C874810YTn.LIZ;
        C874810YTn.LIZ.remove(this);
        C882760Yk6.LIZ(C882760Yk6.LIZ).LIZIZ(this);
    }

    public BusinessChatLandingMsgVM(InterfaceC1743706sF interfaceC1743706sF, ChatroomEventAbility chatroomEventAbility) {
        this.LL = interfaceC1743706sF;
        this.LLILLJJLI = chatroomEventAbility;
    }

    public final void CQ2(C869590Y9l c869590Y9l, boolean z) {
        Long lValueOf;
        String uuid;
        String str;
        List<ChatIntro> list = getState().LLILZLL;
        if (list == null) {
            return;
        }
        C909290Zln c909290ZlnVQ2 = vQ2();
        String uid = null;
        if ((c909290ZlnVQ2 instanceof SessionInfo) && c909290ZlnVQ2 != null) {
            if (c869590Y9l != null) {
                lValueOf = Long.valueOf(c869590Y9l.getSender());
            } else {
                lValueOf = null;
            }
            String strValueOf = String.valueOf(lValueOf);
            IMUser singleChatFromUser = c909290ZlnVQ2.getSingleChatFromUser();
            if (singleChatFromUser != null) {
                uid = singleChatFromUser.getUid();
            }
            if (!Intrinsics.LJFF(strValueOf, uid) && !Intrinsics.LJFF(strValueOf, C461720I8s.LIZIZ())) {
                return;
            }
            FakeMsgOperatorService fakeMsgOperatorService = (FakeMsgOperatorService) PluggableExtentionKt.pluggableSpiForReal(FakeMsgOperatorService.class);
            if (fakeMsgOperatorService != null) {
                String conversationId = c909290ZlnVQ2.getConversationId();
                C1684506ih c1684506ih = new C1684506ih();
                c1684506ih.LIZLLL(46);
                c1684506ih.LJFF = list;
                c1684506ih.LIZ(c909290ZlnVQ2);
                fakeMsgOperatorService.LIZ(conversationId, c1684506ih, c909290ZlnVQ2.getUuid(), new InterfaceC1757506uT() { // from class: X.06rx
                    @Override // X.InterfaceC1757506uT
                    public final void LIZIZ(C1736606r6 c1736606r6, int i, String str2) {
                        if (i == 1) {
                            this.LIZ.setState(AFwS229S0000000_2.get$arr$(237));
                        }
                    }
                });
            }
            if (!z || (c869590Y9l != null && c869590Y9l.getMsgStatus() == 2)) {
                String conversationId2 = c909290ZlnVQ2.getConversationId();
                String strLJ = IMAnalyticsUtil.LIZIZ.LJ(c909290ZlnVQ2);
                String strLIZIZ = C1668706g9.LIZ(IIMBusinessChatService.LIZ).LJIILJJIL().LIZIZ(C0YNP.LJII(c909290ZlnVQ2.getConversationId()));
                if (c869590Y9l == null || (uuid = c869590Y9l.getUuid()) == null) {
                    uuid = "";
                }
                C0I0B.LJFF.LIZIZ();
                Pair[] pairArr = new Pair[5];
                pairArr[0] = new Pair("conversation_id", conversationId2);
                pairArr[1] = new Pair("chat_type", strLJ);
                pairArr[2] = new Pair("other_user_account_type", strLIZIZ);
                pairArr[3] = new Pair("message_id", uuid);
                if (z) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                pairArr[4] = new Pair("send_from_me", str);
                C20684815ws.LJIILLIIL("chatroom_chat_intro_dismiss", C2097608Jq.LJIIIIZZ(pairArr));
            }
        }
    }

    @Override // X.InterfaceC1743606sE
    public final Object PI(String str, C0YHR c0yhr) {
        String conversationId;
        C909290Zln c909290ZlnVQ2 = vQ2();
        if (c909290ZlnVQ2 != null) {
            conversationId = c909290ZlnVQ2.getConversationId();
        } else {
            conversationId = null;
        }
        if (Intrinsics.LJFF(str, conversationId)) {
            C23260099m c23260099m = new C23260099m(C099M.LIZLLL(c0yhr));
            withState(new AwS211S0300000_2(c23260099m, (InterfaceC1364105Vn<? super Unit>) this, (BusinessChatLandingMsgVM) null, (Map<String, String>) 26));
            Object objLIZ = c23260099m.LIZ();
            if (objLIZ == C099R.LJFF()) {
                C099Q.LIZJ(c0yhr);
            }
            if (objLIZ == C099R.LJFF()) {
                return objLIZ;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    public final void BQ2(SuggestedQuestion suggestedQuestion, int i, String str) {
        ByteString byteStringLIZJ;
        C909290Zln c909290ZlnVQ2 = vQ2();
        if (c909290ZlnVQ2 == null) {
            return;
        }
        TextContent textContentLJ = C0ZDT.LJ(C0ZDT.LIZ, suggestedQuestion.displayText, null, false, null, 24);
        textContentLJ.type = 711;
        C13DA c13da = new C13DA();
        c13da.put("a:suggestion_rank_index", String.valueOf(i));
        if (str != null && str.length() > 0) {
            c13da.put("a:client_reply_uuids", str);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(c13da.build());
        Map mapLJFF = C0ZDT.LJFF(null, null, c909290ZlnVQ2, null, null);
        Map<String, String> mapLIZ = C0ZDT.LIZ(null, c909290ZlnVQ2, null);
        mapLIZ.put("a:sq_id", String.valueOf(suggestedQuestion.id));
        mapLIZ.put("a:sq_ver", String.valueOf(suggestedQuestion.qnVer));
        mapLIZ.put("a:set_by", suggestedQuestion.setBy);
        mapLIZ.put("a:landing_msg_type", "suggested_question");
        if (str != null) {
            byteStringLIZJ = C0ZDT.LIZJ(null, str);
        } else {
            byteStringLIZJ = null;
        }
        if (C455040Hss.LIZ()) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C459910I1t(c909290ZlnVQ2, textContentLJ, mapLJFF, mapLIZ, linkedHashMap, byteStringLIZJ, null), 3);
            return;
        }
        CopyOnWriteArrayList<InterfaceC1743406sC> copyOnWriteArrayList = C874810YTn.LIZ;
        C874730YTf c874730YTfLIZ = C874780YTk.LIZ();
        c874730YTfLIZ.LIZIZ.LJFF = c909290ZlnVQ2.getConversationId();
        c874730YTfLIZ.LIZIZ(textContentLJ);
        c874730YTfLIZ.LIZIZ.LJIILIIL = linkedHashMap;
        SparseArray<Object> sparseArrayLJ = C901060ZWm.LJ(mapLJFF);
        C0YTZ c0ytz = c874730YTfLIZ.LIZIZ;
        c0ytz.LJIILL = sparseArrayLJ;
        c0ytz.LJIIIZ = mapLIZ;
        c0ytz.LJIIJJI = byteStringLIZJ;
        c874730YTfLIZ.LJ();
    }

    @Override // X.InterfaceC1743406sC
    public final Object TX0(String str, Map map, Map map2, C874770YTj c874770YTj) {
        String conversationId;
        C909290Zln c909290ZlnVQ2 = vQ2();
        if (c909290ZlnVQ2 != null) {
            conversationId = c909290ZlnVQ2.getConversationId();
        } else {
            conversationId = null;
        }
        if (Intrinsics.LJFF(str, conversationId)) {
            C23260099m c23260099m = new C23260099m(C099M.LIZLLL(c874770YTj));
            withState(new AwS211S0300000_2((InterfaceC1364105Vn) c23260099m, (InterfaceC1364105Vn<? super Unit>) this, (BusinessChatLandingMsgVM) map, (Map<String, String>) 26));
            Object objLIZ = c23260099m.LIZ();
            if (objLIZ == C099R.LJFF()) {
                C099Q.LIZJ(c874770YTj);
            }
            if (objLIZ == C099R.LJFF()) {
                return objLIZ;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x025f  */
    /* JADX WARN: Type inference failed for: r11v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v66, types: [X.06rF, X.06s2] */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeMsgOperatorService] */
    /* JADX WARN: Type inference failed for: r6v4, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void yQ2(X.C909290Zln r26, com.ss.android.ugc.aweme.im.b2c.landing.BusinessChatLandingMsgRespV2 r27, long r28, X.EnumC1001040c9m r30, boolean r31) {
        /*
            Method dump skipped, instruction units count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.b2c.landing.BusinessChatLandingMsgVM.yQ2(X.0Zln, com.ss.android.ugc.aweme.im.b2c.landing.BusinessChatLandingMsgRespV2, long, X.0c9m, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zQ2(X.C909290Zln r30, final long r31, int r33, final java.lang.String r34, final java.lang.String r35, X.InterfaceC1364105Vn<? super kotlin.Unit> r36) {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.b2c.landing.BusinessChatLandingMsgVM.zQ2(X.0Zln, long, int, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AQ2(X.C909290Zln r13, com.ss.android.ugc.aweme.im.b2c.platformization.ConvContext r14, long r15, java.lang.String r17, java.lang.String r18, com.ss.android.ugc.aweme.im.b2c.landing.BusinessChatLandingMsgRespV2 r19, X.InterfaceC1364105Vn<? super kotlin.Unit> r20) {
        /*
            r12 = this;
            r3 = r20
            boolean r0 = r3 instanceof X.C1742206s0
            if (r0 == 0) goto L22
            r4 = r3
            X.06s0 r4 = (X.C1742206s0) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.LLILLL = r2
        L14:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L30
            if (r0 != r1) goto L28
            goto L5e
        L22:
            X.06s0 r4 = new X.06s0
            r4.<init>(r12, r3)
            goto L14
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r3)
            boolean r0 = r13.getDisableLandingMessage()
            if (r0 == 0) goto L3c
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3c:
            r0 = r19
            java.util.List<com.ss.android.ugc.aweme.im.b2c.landing.BusinessAutoMessage> r11 = r0.landingMessages
            com.ss.android.ugc.aweme.im.b2c.landing.LandingMessageRequestBody r5 = new com.ss.android.ugc.aweme.im.b2c.landing.LandingMessageRequestBody     // Catch: java.lang.Exception -> La4
            java.lang.Long r7 = X.C2286608xc.LJFF(r15)     // Catch: java.lang.Exception -> La4
            r0 = 0
            java.lang.Integer r10 = X.C2286608xc.LJ(r0)     // Catch: java.lang.Exception -> La4
            r9 = r18
            r8 = r17
            r6 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> La4
            com.ss.android.ugc.aweme.im.b2c.landing.BusinessLandingMsgAPI r0 = com.ss.android.ugc.aweme.im.b2c.landing.BusinessLandingMsgAPI.LIZIZ     // Catch: java.lang.Exception -> La4
            r4.LLILLL = r1     // Catch: java.lang.Exception -> La4
            java.lang.Object r3 = r0.getBusinessChatLandingMsgV2(r5, r4)     // Catch: java.lang.Exception -> La4
            if (r3 != r2) goto L61
            return r2
        L5e:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> La4
        L61:
            com.ss.android.ugc.aweme.im.b2c.landing.BusinessChatLandingMsgRespV2 r3 = (com.ss.android.ugc.aweme.im.b2c.landing.BusinessChatLandingMsgRespV2) r3     // Catch: java.lang.Exception -> La4
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> La4
            java.lang.String r0 = "revalidatePreloadedLandingMessage resp, status: "
            r1.append(r0)     // Catch: java.lang.Exception -> La4
            int r0 = r3.status_code     // Catch: java.lang.Exception -> La4
            r1.append(r0)     // Catch: java.lang.Exception -> La4
            java.lang.String r0 = ", landingMessages: "
            r1.append(r0)     // Catch: java.lang.Exception -> La4
            java.util.List<com.ss.android.ugc.aweme.im.b2c.landing.BusinessAutoMessage> r0 = r3.landingMessages     // Catch: java.lang.Exception -> La4
            r2 = 0
            if (r0 == 0) goto L96
            int r0 = r0.size()     // Catch: java.lang.Exception -> La4
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)     // Catch: java.lang.Exception -> La4
        L83:
            r1.append(r0)     // Catch: java.lang.Exception -> La4
            X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> La4
            java.util.List<com.ss.android.ugc.aweme.im.b2c.landing.BusinessAutoMessage> r1 = r3.landingMessages     // Catch: java.lang.Exception -> La4
            if (r1 == 0) goto L99
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Exception -> La4
            r0 = r0 ^ 1
            if (r0 == 0) goto L99
            goto L98
        L96:
            r0 = r2
            goto L83
        L98:
            r2 = r1
        L99:
            kotlin.jvm.internal.AwS581S0100000_2 r1 = new kotlin.jvm.internal.AwS581S0100000_2     // Catch: java.lang.Exception -> La4
            r0 = 628(0x274, float:8.8E-43)
            r1.<init>(r2, r0)     // Catch: java.lang.Exception -> La4
            r12.setState(r1)     // Catch: java.lang.Exception -> La4
            goto Lc2
        La4:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            boolean r0 = r2 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto Laf
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        Laf:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "revalidatePreloadedLandingMessage, exception: "
            r1.append(r0)
            java.lang.String r0 = android.util.Log.getStackTraceString(r2)
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
        Lc2:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.b2c.landing.BusinessChatLandingMsgVM.AQ2(X.0Zln, com.ss.android.ugc.aweme.im.b2c.platformization.ConvContext, long, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.im.b2c.landing.BusinessChatLandingMsgRespV2, X.05Vn):java.lang.Object");
    }
}
