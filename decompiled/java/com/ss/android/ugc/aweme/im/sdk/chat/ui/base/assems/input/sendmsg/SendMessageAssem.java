package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.sendmsg;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C051M;
import X.C09R3;
import X.C0I3C;
import X.C0IC5;
import X.C0QSJ;
import X.C0YHX;
import X.C0YM2;
import X.C0YOZ;
import X.C0YP2;
import X.C0YTK;
import X.C0YTP;
import X.C0YTZ;
import X.C0ZDT;
import X.C1220000hqw;
import X.C1265504xJ;
import X.C13DA;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2095008Iq;
import X.C2217381BqS;
import X.C23250099c;
import X.C451030HmP;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C453300Hq4;
import X.C453570HqV;
import X.C453670Hqf;
import X.C453680Hqg;
import X.C453690Hqh;
import X.C453700Hqi;
import X.C454980Hsm;
import X.C455000Hso;
import X.C455040Hss;
import X.C457780HxI;
import X.C459820I1k;
import X.C459840I1m;
import X.C459930I1v;
import X.C687700QyG;
import X.C723590SZx;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736950SvV;
import X.C866530Xz1;
import X.C869590Y9l;
import X.C874730YTf;
import X.C874780YTk;
import X.C874810YTn;
import X.C875420YVw;
import X.C877840YcA;
import X.C901060ZWm;
import X.InterfaceC1146704e9;
import X.InterfaceC1743406sC;
import X.InterfaceC2217461Bqa;
import X.InterfaceC454990Hsn;
import X.InterfaceC459890I1r;
import X.InterfaceC665370Q7z;
import android.graphics.Rect;
import android.util.SparseArray;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.model.IMGiphyInfo;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.message.content.BaseText;
import com.ss.android.ugc.aweme.im.message.content.FeatureAttachmentContent;
import com.ss.android.ugc.aweme.im.message.content.GifContent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.draft.MessageDraftVM;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.reply.MessageReplyVM;
import com.ss.android.ugc.aweme.im.sdk.chat.utils.ChatRoomEventTrackingStore;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS550S0100000_6;
import okio.ByteString;

/* JADX INFO: loaded from: classes7.dex */
public final class SendMessageAssem extends AbstractC738140SxQ implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final C1559260qg8 LL = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C736950SvV LLILLJJLI;
    public final AssemVMLazy LLILLL;
    public final AssemVMLazy LLILZ;
    public final C01GW LLILZIL;
    public C866530Xz1 LLILZLL;
    public volatile InterfaceC459890I1r LLIZ;
    public InterfaceC665370Q7z LLIZLLLIL;
    public C0QSJ LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SendMessageAssem.class, "draftVM", "getDraftVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/input/draft/MessageDraftVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SendMessageAssem.class, "sendMessageVM", "getSendMessageVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/input/sendmsg/SendMessageVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(SendMessageAssem.class, "messageListAnimateSendAbility", "getMessageListAnimateSendAbility()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/IMessageListAnimateSendAbility;", 0);
        c09r3.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ChatRoomScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatRoomScope.class);
        return arrayList;
    }

    public SendMessageAssem() {
        AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6(this, 272);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MessageReplyVM.class);
        AFwS236S0000000_6 aFwS236S0000000_6 = AFwS236S0000000_6.get$arr$(146);
        this.LLILLJJLI = new C736950SvV(c19719912DlLIZ, new AwS550S0100000_6(awS550S0100000_6, 273), new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS236S0000000_6, new AwS550S0100000_6((AbstractC738140SxQ) this, 274), new C451610HnL(this, true, true), new C723700Sa8(this));
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MessageDraftVM.class);
        this.LLILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ2, 527), AFwS236S0000000_6.get$arr$(144), null, true);
        C1637906bB c1637906bBLIZ = C1637806bA.LIZ(AFwS236S0000000_6.get$arr$(143));
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(SendMessageVM.class);
        this.LLILZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bBLIZ, new AwS546S0100000_2(c19719912DlLIZ3, 528), AFwS236S0000000_6.get$arr$(145), null, true);
        this.LLILZIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 526));
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final C455000Hso m239do() {
        InterfaceC454990Hsn interfaceC454990Hsn = (InterfaceC454990Hsn) ((MessageReplyVM) this.LLILLJJLI.getValue()).LLILLJJLI.getValue();
        ((MessageReplyVM) this.LLILLJJLI.getValue()).At1();
        if (interfaceC454990Hsn instanceof C459840I1m) {
            C459840I1m c459840I1m = (C459840I1m) interfaceC454990Hsn;
            C0ZDT.LIZ.getClass();
            return new C455000Hso(null, new FeatureAttachmentContent(14, c459840I1m.LIZ.thoughtId, C2095008Iq.LJIILIIL(c459840I1m.LIZIZ), null, new BaseText(c459840I1m.LIZ.textContent, null, null)), C0ZDT.LIZLLL(c459840I1m), c459840I1m.LIZLLL);
        }
        if (!(interfaceC454990Hsn instanceof C454980Hsm)) {
            return interfaceC454990Hsn == null ? new C455000Hso(null, null, null, null) : new C455000Hso(null, null, null, null);
        }
        C454980Hsm c454980Hsm = (C454980Hsm) interfaceC454990Hsn;
        return new C455000Hso(c454980Hsm.LIZ, null, null, c454980Hsm.LIZIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC459890I1r fo() {
        /*
            r4 = this;
            X.0I1r r0 = r4.LLIZ
            if (r0 != 0) goto L39
            monitor-enter(r4)
            X.0I1r r0 = r4.LLIZ     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLJ     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLIZLLLIL     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLIZLLLIL = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope> r1 = com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLJ = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<X.0I1r> r0 = X.InterfaceC459890I1r.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            X.0I1r r0 = (X.InterfaceC459890I1r) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLIZ = r0     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            return r0
        L35:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L38:
            monitor-exit(r4)
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.sendmsg.SendMessageAssem.fo():X.0I1r");
    }

    public final C457780HxI getChatHierarchyData() {
        return (C457780HxI) this.LL.getValue();
    }

    public final SendMessageVM ho() {
        AssemVMLazy assemVMLazy = this.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        return (SendMessageVM) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void onAssemPostCreate() {
        super.onAssemPostCreate();
        getChatHierarchyData();
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C453670Hqf(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C453300Hq4(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C453680Hqg(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C453690Hqh(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C453700Hqi(this, null), 3);
    }

    public static void bo(C455000Hso c455000Hso, Map map) {
        if (c455000Hso.LIZLLL == C0I3C.THOUGHT_BUBBLE) {
            map.put("enter_method", "chat_header_thought_bubble");
            map.put("enter_position", "chat_header_thought_bubble");
        }
    }

    public final void ko(C451030HmP c451030HmP, String str, final Rect rect) {
        String previousPage;
        SparseArray<Object> sparseArrayLJ;
        Map<String, String> mapLIZ;
        C0YHX c0yhxLIZ;
        C0YOZ c0yozLJFF;
        SparseArray<Object> sparseArrayLJ2;
        Map<String, String> mapLIZ2;
        SessionInfo sessionInfo = getChatHierarchyData().LL;
        EnterChatParams enterChatParams = getChatHierarchyData().LLILLL;
        LinkedHashMap linkedHashMap = null;
        if (enterChatParams == null || (previousPage = enterChatParams.getPreviousPage()) == null) {
            previousPage = "";
        }
        C455000Hso c455000HsoM239do = m239do();
        C13DA c13da = new C13DA();
        c13da.putAll(ChatRoomEventTrackingStore.LIZIZ.LIZIZ(sessionInfo.getUuid()));
        if (str != null) {
            c13da.put("enter_method", str);
        }
        String stickerId = c451030HmP.LIZJ.getStickerId();
        if (stickerId != null) {
            c13da.put("sticker_id", stickerId);
        }
        c13da.put("pre_enter_from", previousPage);
        bo(c455000HsoM239do, c13da);
        Map mapBuild = c13da.build();
        SendMessageVM sendMessageVMHo = ho();
        String conversationId = getChatHierarchyData().LL.getConversationId();
        C0ZDT.LIZ.getClass();
        ByteString byteStringLIZIZ = C0ZDT.LIZIZ(previousPage);
        C869590Y9l c869590Y9l = c455000HsoM239do.LIZ;
        FeatureAttachmentContent featureAttachmentContent = c455000HsoM239do.LIZIZ;
        C0YTK c0ytk = new C0YTK() { // from class: X.0I1n
            @Override // X.C0YTK
            public final void LIZIZ(C0Y8T c0y8t, List<C869590Y9l> list, Map<C869590Y9l, C0YMW> map) {
            }

            @Override // X.C0YTY
            public final void LIZJ(C0Y8T c0y8t, List<? extends C869590Y9l> list) {
            }

            @Override // X.C0YTK
            public final void LJ(C0Y8T c0y8t, C869590Y9l c869590Y9l2) {
            }

            @Override // X.C0YTY
            public final void LJI(C0Y8T c0y8t, C869590Y9l c869590Y9l2) {
            }

            @Override // X.C0YTK
            public final void LJII(C0Y8T c0y8t, C869590Y9l c869590Y9l2, C0YMW c0ymw) {
            }

            @Override // X.C0YTK
            public final void LIZLLL(C0Y8T c0y8t, C869590Y9l c869590Y9l2) {
                String uuid;
                Rect rect2;
                InterfaceC459890I1r interfaceC459890I1rFo;
                if (c869590Y9l2 != null && (uuid = c869590Y9l2.getUuid()) != null && (rect2 = rect) != null && (interfaceC459890I1rFo = this.fo()) != null) {
                    interfaceC459890I1rFo.LIZ(uuid, rect2);
                }
            }
        };
        CopyOnWriteArrayList<InterfaceC1743406sC> copyOnWriteArrayList = C874810YTn.LIZ;
        C874730YTf c874730YTfLIZ = C874780YTk.LIZ();
        GifContent gifContentLIZ = C459820I1k.LIZ(c451030HmP.LIZJ);
        gifContentLIZ.setAttachment(featureAttachmentContent);
        gifContentLIZ.setHeader(null);
        ReferenceInfo referenceInfoLJII = C0ZDT.LJII(c869590Y9l);
        if (C455040Hss.LIZ()) {
            C0YM2 c0ym2 = C0YM2.TIKTOK_SOCIAL_IM;
            IIMCoreProxyService.LIZ.getClass();
            IIMCoreProxyService iIMCoreProxyServiceLIZ = C875420YVw.LIZ();
            if (iIMCoreProxyServiceLIZ != null && (c0yhxLIZ = iIMCoreProxyServiceLIZ.LIZ(c0ym2)) != null && (c0yozLJFF = c0yhxLIZ.LJFF()) != null) {
                C1265504xJ c1265504xJ = new C1265504xJ(conversationId);
                int iLIZ = C877840YcA.LIZ(gifContentLIZ);
                C459930I1v c459930I1v = new C459930I1v(C051M.LJ(gifContentLIZ, false));
                if (mapBuild != null) {
                    sparseArrayLJ2 = C901060ZWm.LJ(mapBuild);
                } else {
                    sparseArrayLJ2 = null;
                }
                IMGiphyInfo iMGiphyInfo = c451030HmP.LJI;
                if (iMGiphyInfo != null) {
                    mapLIZ2 = C453570HqV.LIZ(iMGiphyInfo);
                } else {
                    mapLIZ2 = null;
                }
                c0yozLJFF.LJI(new C0YP2(c1265504xJ, iLIZ, c459930I1v, null, null, mapLIZ2, null, byteStringLIZIZ, null, sparseArrayLJ2, null, referenceInfoLJII, 13592), new C0IC5(null, 3), C0YTP.LIZIZ(c0ytk, ViewModelKt.getViewModelScope(sendMessageVMHo), null, false, 30));
                return;
            }
            C0YTP.LIZ(c0ytk);
            return;
        }
        c874730YTfLIZ.LIZIZ.LJFF = conversationId;
        c874730YTfLIZ.LIZIZ(gifContentLIZ);
        C0YTZ c0ytz = c874730YTfLIZ.LIZIZ;
        c0ytz.LJIJ = referenceInfoLJII;
        c0ytz.LJIILIIL = null;
        if (mapBuild != null) {
            sparseArrayLJ = C901060ZWm.LJ(mapBuild);
        } else {
            sparseArrayLJ = null;
        }
        c874730YTfLIZ.LIZIZ.LJIILL = sparseArrayLJ;
        IMGiphyInfo iMGiphyInfo2 = c451030HmP.LJI;
        if (iMGiphyInfo2 != null && (mapLIZ = C453570HqV.LIZ(iMGiphyInfo2)) != null) {
            linkedHashMap = new LinkedHashMap(mapLIZ);
        }
        C0YTZ c0ytz2 = c874730YTfLIZ.LIZIZ;
        c0ytz2.LJIIIZ = linkedHashMap;
        c0ytz2.LJIIJ = byteStringLIZIZ;
        c874730YTfLIZ.LJFF(c0ytk);
    }
}
