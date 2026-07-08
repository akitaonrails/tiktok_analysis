package com.ss.android.ugc.aweme.vibefeed.feed.viewmodel;

import X.AnonymousClass0956;
import X.C01GW;
import X.C099R;
import X.C09YA;
import X.C0P30;
import X.C0P31;
import X.C0P3H;
import X.C0P3I;
import X.C0P3N;
import X.C0P3O;
import X.C0P3X;
import X.C0P40;
import X.C0VI1;
import X.C0VIO;
import X.C0VIR;
import X.C0YTK;
import X.C1227904rF;
import X.C13BV;
import X.C13DA;
import X.C13LP;
import X.C1496910p3Z;
import X.C1575440r6E;
import X.C1575980r76;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2241931Cox;
import X.C23250099c;
import X.C452501pT;
import X.C638560P2w;
import X.C795380VIa;
import X.C795410VId;
import X.C844470XAv;
import X.C874730YTf;
import X.C874780YTk;
import X.C874810YTn;
import X.C901060ZWm;
import X.EnumC1575470r6H;
import X.EnumC912680ZrG;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1743406sC;
import android.util.Base64;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.DynamicCardTemplate;
import com.ss.android.ugc.aweme.vibefeed.cache.VibeInteractRecord;
import com.ss.android.ugc.aweme.vibefeed.feed.interact.reach.InlineMsgRequestWorker;
import com.ss.android.ugc.aweme.vibefeed.model.InlineMessageInfo;
import com.ss.android.ugc.aweme.vibefeed.model.SummaryStats;
import com.ss.android.ugc.aweme.vibefeed.model.VibeStatDelta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: loaded from: classes10.dex */
public final class VibeFeedConsumeViewModel extends AssemViewModel<C0P3X> {
    public C0P31 LLILZ;
    public AnonymousClass0956 LLIZLLLIL;
    public final C09YA LL = new C09YA(this, AFwS195S0000000_9.get$arr$(352));
    public final C09YA LLILLJJLI = new C09YA(this, AFwS195S0000000_9.get$arr$(353));
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(351));
    public String LLILZIL = "";
    public EnumC912680ZrG LLILZLL = EnumC912680ZrG.MUTUAL_FEED_SCENE_PRIVATE;
    public C638560P2w LLIZ = new C638560P2w(0, 0);
    public C0P3N LLJ = new C0P3N(false, false, false);
    public String LLJI = "";

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0P3X(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        String conversationId;
        super.onCleared();
        C0P31 c0p31 = this.LLILZ;
        if (c0p31 == null || (conversationId = c0p31.getConversationId()) == null) {
            return;
        }
        C0P40.LIZ.remove(conversationId);
        C0P40.LIZIZ.remove(conversationId);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("trackingParams clear conv=");
        sbLIZ.append(conversationId);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int yQ2() {
        List<String> listLJI;
        Integer num;
        SummaryStats summaryStats = getState().LLILZIL;
        if (summaryStats != null && (num = summaryStats.coLikeCount) != null) {
            return num.intValue();
        }
        C0P31 c0p31 = this.LLILZ;
        if (c0p31 == null || (listLJI = c0p31.LJI()) == null) {
            listLJI = C13BV.INSTANCE;
        }
        return listLJI.size();
    }

    public final void DQ2(List<String> list) {
        List<String> listLJIILIIL;
        EnumC1575470r6H enumC1575470r6H;
        C0P31 c0p31 = this.LLILZ;
        if (c0p31 == null || (listLJIILIIL = c0p31.LJIILIIL()) == null) {
            listLJIILIIL = C13BV.INSTANCE;
        }
        if (this.LLILZLL.isGroup()) {
            String strLIZ = C1575440r6E.LIZ();
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                if (true ^ Intrinsics.LJFF(str, strLIZ)) {
                    arrayList.add(str);
                }
            }
            if (arrayList.isEmpty()) {
                enumC1575470r6H = EnumC1575470r6H.LOCKED;
            } else {
                int size = C13LP.LJJL(listLJIILIIL, arrayList).size();
                if (size >= arrayList.size()) {
                    enumC1575470r6H = EnumC1575470r6H.UNLOCKED;
                } else if (1 <= size && size < arrayList.size()) {
                    enumC1575470r6H = EnumC1575470r6H.PARTIAL_UNLOCKED;
                } else {
                    enumC1575470r6H = EnumC1575470r6H.LOCKED;
                }
            }
        } else if (listLJIILIIL.contains(this.LLJI)) {
            enumC1575470r6H = EnumC1575470r6H.UNLOCKED;
        } else {
            enumC1575470r6H = EnumC1575470r6H.LOCKED;
        }
        setState(new AwS588S0100000_9(enumC1575470r6H, 415));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(X.InterfaceC1364105Vn<? super kotlin.Unit> r23) {
        /*
            r22 = this;
            r3 = r23
            boolean r0 = r3 instanceof X.C05DW
            r5 = r22
            if (r0 == 0) goto Lb1
            r4 = r3
            X.05DW r4 = (X.C05DW) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb1
            int r2 = r2 - r1
            r4.LLILLL = r2
        L16:
            java.lang.Object r7 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r6 = 1
            r2 = 0
            if (r0 == 0) goto L65
            if (r0 != r6) goto Lb8
            X.C155000ia.LIZIZ(r7)
        L27:
            X.0Oly r7 = (X.C629120Oly) r7
            if (r7 == 0) goto L2d
            X.0OlZ r2 = r7.LIZIZ
        L2d:
            X.0OlZ r0 = X.EnumC628870OlZ.SUCCESS
            if (r2 != r0) goto L62
            com.ss.android.ugc.aweme.vibefeed.model.SummaryPageResponse r0 = r7.LIZ
            if (r0 == 0) goto L62
            com.ss.android.ugc.aweme.vibefeed.model.SummaryStats r2 = r0.summaryStats
            if (r2 == 0) goto L62
            X.0P31 r0 = r5.LLILZ
            if (r0 == 0) goto L40
            r0.LJII(r2)
        L40:
            X.002o r0 = r5.getState()
            X.0P3X r0 = (X.C0P3X) r0
            X.0r6H r1 = r0.LLIZLLLIL
            X.0r6H r0 = X.EnumC1575470r6H.UNLOCKED
            if (r1 == r0) goto L58
            X.002o r0 = r5.getState()
            X.0P3X r0 = (X.C0P3X) r0
            X.0r6H r1 = r0.LLIZLLLIL
            X.0r6H r0 = X.EnumC1575470r6H.PARTIAL_UNLOCKED
            if (r1 != r0) goto L62
        L58:
            kotlin.jvm.internal.AwS375S0200000_9 r1 = new kotlin.jvm.internal.AwS375S0200000_9
            r0 = 107(0x6b, float:1.5E-43)
            r1.<init>(r2, r7, r0)
            r5.setState(r1)
        L62:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L65:
            X.C155000ia.LIZIZ(r7)
            X.09YA r0 = r5.LLILLJJLI
            java.lang.Object r0 = r0.getValue()
            X.0SvR r0 = (X.InterfaceC736910SvR) r0
            X.00hg r7 = r0.getOperator()
            X.0Om6 r7 = (X.InterfaceC629200Om6) r7
            java.lang.String r8 = X.C1575440r6E.LIZ()
            java.lang.String r1 = ""
            if (r8 != 0) goto L7f
            r8 = r1
        L7f:
            java.lang.String r9 = r5.LLJI
            X.0P31 r0 = r5.LLILZ
            if (r0 == 0) goto L8b
            java.lang.String r10 = r0.getConversationId()
            if (r10 != 0) goto L8c
        L8b:
            r10 = r1
        L8c:
            X.0P31 r0 = r5.LLILZ
            if (r0 == 0) goto Laf
            java.lang.String r15 = r0.LJIL()
        L94:
            X.0ZrG r0 = r5.LLILZLL
            r4.LLILLL = r6
            r11 = 1
            r14 = 0
            r18 = 4
            r12 = r11
            r13 = r11
            r16 = r14
            r19 = r14
            r20 = r11
            r21 = r4
            r17 = r0
            java.lang.Object r7 = r7.LLFF(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            if (r7 != r3) goto L27
            return r3
        Laf:
            r15 = r2
            goto L94
        Lb1:
            X.05DW r4 = new X.05DW
            r4.<init>(r5, r3)
            goto L16
        Lb8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedConsumeViewModel.vQ2(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void xQ2(java.lang.String r3) {
        /*
            r2 = this;
            int r0 = r3.hashCode()
            r1 = 1
            switch(r0) {
                case -2143911776: goto L36;
                case -1728776482: goto L1b;
                case -1360685984: goto L12;
                case 1076386590: goto L9;
                default: goto L8;
            }
        L8:
            return
        L9:
            java.lang.String r0 = "ci_share_feed_group_summary"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L24
            return
        L12:
            java.lang.String r0 = "ci_share_feed_group_notice"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L3f
            return
        L1b:
            java.lang.String r0 = "ci_share_feed_summary"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L24
            return
        L24:
            X.0P3N r0 = r2.LLJ
            r0.LIZJ = r1
            X.0P31 r1 = r2.LLILZ
            if (r1 == 0) goto L8
            X.0P3K r0 = X.C0P3K.SEND_CO_LIKE_CARD
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1.LJIJI(r0)
            return
        L36:
            java.lang.String r0 = "ci_share_feed_notice"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L3f
            return
        L3f:
            X.0P3N r0 = r2.LLJ
            r0.LIZ = r1
            X.0P31 r1 = r2.LLILZ
            if (r1 == 0) goto L8
            X.0P3K r0 = X.C0P3K.SEND_REMINDER
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1.LJIJI(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedConsumeViewModel.xQ2(java.lang.String):void");
    }

    public final void CQ2(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[storeConsumeManager] reason = ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        C0P31 c0p31 = this.LLILZ;
        if (c0p31 != null) {
            c0p31.LJIILJJIL(str2);
            C0P30.LIZ().LJ(c0p31);
        }
    }

    public final Object wQ2(List<VibeStatDelta> list, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        String conversationId;
        String strLJJLIIIJ;
        List<String> listLJJIFFI;
        C0P3H c0p3h = (C0P3H) this.LL.getValue().getOperator();
        String strLIZ = C1575440r6E.LIZ();
        String str = this.LLJI;
        C0P31 c0p31 = this.LLILZ;
        if (c0p31 != null) {
            conversationId = c0p31.getConversationId();
        } else {
            conversationId = null;
        }
        C0P31 c0p312 = this.LLILZ;
        if (c0p312 == null || (listLJJIFFI = c0p312.LJJIFFI()) == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(listLJJIFFI, ",", null, null, 0, null, null, 62)) == null) {
            strLJJLIIIJ = "";
        }
        Object objM = c0p3h.m(strLIZ, str, conversationId, list, strLJJLIIIJ, this.LLILZLL, interfaceC1364105Vn);
        if (objM == C099R.LJFF()) {
            return objM;
        }
        return Unit.LIZ;
    }

    public final boolean zQ2(final String str, String str2, String str3, Map<String, String> map) {
        String strLJJLIIIJ;
        Map<String, String> mapLJ = map;
        BaseTemplate baseTemplateLIZLLL = C2241931Cox.LIZLLL(C1496910p3Z.LIZJ(ByteString.Companion, Base64.decode(str2, 0)), DynamicCardTemplate.class);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sendDynamicMessageCard template = ");
        sbLIZ.append(baseTemplateLIZLLL);
        C2188811AlT.LIZIZ(sbLIZ);
        if (baseTemplateLIZLLL != null) {
            CopyOnWriteArrayList<InterfaceC1743406sC> copyOnWriteArrayList = C874810YTn.LIZ;
            C874730YTf c874730YTfLIZ = C874780YTk.LIZ();
            c874730YTfLIZ.LIZIZ.LJIIL = str;
            c874730YTfLIZ.LIZJ(baseTemplateLIZLLL);
            c874730YTfLIZ.LIZIZ.LJFF = str3;
            if (mapLJ == null) {
                mapLJ = C2097608Jq.LJ();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(mapLJ);
            if (Intrinsics.LJFF(str, "ci_share_feed_group_summary")) {
                List<String> list = getState().LLJILJIL;
                if (list == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62)) == null) {
                    strLJJLIIIJ = "";
                }
                linkedHashMap.put("s:visible", strLJJLIIIJ);
            }
            c874730YTfLIZ.LIZIZ.LJIILIIL = linkedHashMap;
            C13DA c13da = new C13DA();
            if (Intrinsics.LJFF(str, "ci_share_feed_group_summary") || Intrinsics.LJFF(str, "ci_share_feed_summary")) {
                c13da.put("intercept_report_send_message", "1");
            }
            c874730YTfLIZ.LIZIZ.LJIILL = C901060ZWm.LJ(c13da.build());
            c874730YTfLIZ.LJFF(new C0YTK() { // from class: X.06Sa
                @Override // X.C0YTK
                public final void LIZIZ(C0Y8T c0y8t, List<C869590Y9l> list2, Map<C869590Y9l, C0YMW> map2) {
                }

                @Override // X.C0YTY
                public final void LIZJ(C0Y8T c0y8t, List<? extends C869590Y9l> list2) {
                }

                @Override // X.C0YTY
                public final void LJI(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
                }

                @Override // X.C0YTK
                public final void LJ(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
                    BaseTemplate baseTemplateLIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("send invite card success, ");
                    if (c869590Y9l != null) {
                        baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, DynamicCardTemplate.class);
                    } else {
                        baseTemplateLIZ = null;
                    }
                    sbLIZ2.append(baseTemplateLIZ);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    this.LIZ.xQ2(str);
                }

                @Override // X.C0YTK
                public final void LIZLLL(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
                }

                @Override // X.C0YTK
                public final void LJII(C0Y8T c0y8t, C869590Y9l c869590Y9l, C0YMW c0ymw) {
                }
            });
            return true;
        }
        xQ2(str);
        return false;
    }

    public final void AQ2(String str, C0P3O c0p3o, Map<String, String> map, Function0<Unit> function0, Function1<? super Boolean, Unit> function1, Function0<Unit> function02) {
        String strLJIL;
        VibeInteractRecord vibeInteractRecordLJFF;
        String conversationId;
        int iIntValue;
        Integer num;
        Integer num2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[sendInteractReachMsg] reason = ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        C0P3O c0p3o2 = C0P3O.REACH_TYPE_ONLY_INLINE_MSG;
        if ((c0p3o == c0p3o2 || c0p3o == C0P3O.REACH_TYPE_GROUP_ONLY_INLINE_MSG) && this.LLJ.LIZIZ) {
            return;
        }
        if ((c0p3o == C0P3O.REACH_TYPE_INLINE_MSG_BOTH_LIKE_CARD || c0p3o == C0P3O.REACH_TYPE_GROUP_INLINE_MSG_BOTH_LIKE_CARD) && this.LLJ.LIZJ) {
            return;
        }
        if ((c0p3o == C0P3O.REACH_TYPE_INLINE_MSG_REMINDER_CARD || c0p3o == C0P3O.REACH_TYPE_GROUP_INLINE_MSG_REMINDER_CARD) && this.LLJ.LIZ) {
            return;
        }
        C0P31 c0p31 = this.LLILZ;
        int iIntValue2 = 0;
        if (c0p31 != null && c0p31.LJIIJJI()) {
            C0P31 c0p312 = this.LLILZ;
            Boolean bool = null;
            if (c0p312 == null || (strLJIL = c0p312.LJIL()) == null) {
                strLJIL = "";
            }
            C0P31 c0p313 = this.LLILZ;
            if (c0p313 != null) {
                vibeInteractRecordLJFF = c0p313.LJFF();
            } else {
                vibeInteractRecordLJFF = null;
            }
            C0P31 c0p314 = this.LLILZ;
            if (c0p314 != null) {
                conversationId = c0p314.getConversationId();
            } else {
                conversationId = null;
            }
            String strLIZ = C1575440r6E.LIZ();
            if (c0p3o != c0p3o2 && c0p3o != C0P3O.REACH_TYPE_GROUP_ONLY_INLINE_MSG) {
                if (function0 != null) {
                    function0.invoke();
                }
                C23250099c.LIZLLL(getAssemVMScope(), null, null, new C0P3I(this, strLIZ, conversationId, strLJIL, c0p3o, vibeInteractRecordLJFF, map, function02, function1, null), 3);
                return;
            }
            if (vibeInteractRecordLJFF != null && (num2 = vibeInteractRecordLJFF.likedCnt) != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = 0;
            }
            Integer numValueOf = Integer.valueOf(iIntValue);
            if (vibeInteractRecordLJFF != null && (num = vibeInteractRecordLJFF.sendMsgCnt) != null) {
                iIntValue2 = num.intValue();
            }
            Integer numValueOf2 = Integer.valueOf(iIntValue2);
            if (vibeInteractRecordLJFF != null) {
                bool = vibeInteractRecordLJFF.sendReminderToday;
            }
            InlineMessageInfo inlineMessageInfo = new InlineMessageInfo(numValueOf, numValueOf2, Boolean.valueOf(C1575980r76.LIZLLL(bool)));
            C795410VId c795410VId = new C795410VId();
            c795410VId.LIZLLL("cur_user_id", strLIZ);
            c795410VId.LIZLLL("to_user_id", this.LLJI);
            c795410VId.LIZLLL("conversation_id", conversationId);
            c795410VId.LIZLLL("feed_id", strLJIL);
            ((HashMap) c795410VId.LIZ).put("reach_type", Integer.valueOf(c0p3o.getValue()));
            C1227904rF.LIZ.getClass();
            c795410VId.LIZLLL("inline_msg_info", C1227904rF.LJI(inlineMessageInfo));
            ((HashMap) c795410VId.LIZ).put("mutual_feed_scene", Integer.valueOf(this.LLILZLL.getValue()));
            C795380VIa c795380VIaLIZ = c795410VId.LIZ();
            if (this.LLJ.LIZIZ) {
                return;
            }
            C844470XAv.LIZ.getClass();
            C0VI1 c0vi1LJII = C0VI1.LJII(C844470XAv.LIZ());
            C0VIO c0vio = new C0VIO(InlineMsgRequestWorker.class);
            c0vio.LJ(c795380VIaLIZ);
            C0VIR c0virLIZ = c0vio.LIZ();
            c0vi1LJII.getClass();
            c0vi1LJII.LJFF(Collections.singletonList(c0virLIZ));
        }
    }
}
