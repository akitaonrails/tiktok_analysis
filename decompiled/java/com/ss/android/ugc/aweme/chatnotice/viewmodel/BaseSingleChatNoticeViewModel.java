package com.ss.android.ugc.aweme.chatnotice.viewmodel;

import X.AnonymousClass0694;
import X.C01GW;
import X.C068O;
import X.C068S;
import X.C069P;
import X.C06OD;
import X.C06OO;
import X.C06SA;
import X.C099R;
import X.C09AE;
import X.C123100dR;
import X.C1509305vX;
import X.C1509705vb;
import X.C1527105yP;
import X.C15585068h;
import X.C15588068k;
import X.C1559260qg8;
import X.C15596068s;
import X.C1665706ff;
import X.C1675506hF;
import X.C1770006wU;
import X.C23250099c;
import X.C452501pT;
import X.C461060I6e;
import X.C723600SZy;
import X.C869590Y9l;
import X.C909290Zln;
import X.EnumC1596306Mv;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1674206h2;
import X.InterfaceC904740ZeS;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.repo.IChatRequestRepository;
import com.ss.android.ugc.aweme.im.common.model.IMNoticeMsgStruct;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.IChatNoticeFlowEngine;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.CheckMessage;
import com.ss.android.ugc.aweme.im.service.service.IMatchedFriendsAnalytics;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseSingleChatNoticeViewModel extends AssemViewModel<AnonymousClass0694> implements InterfaceC1674206h2 {
    public static final /* synthetic */ int LLJIJIL = 0;
    public final IChatNoticeFlowEngine LL;
    public final IMatchedFriendsAnalytics LLILLJJLI;
    public final IChatRequestRepository LLILLL;
    public final C1559260qg8 LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C1770006wU LLIZ;
    public final C01GW LLIZLLLIL;
    public EnumC1596306Mv LLJ;
    public boolean LLJI;

    public final void AQ2() {
        if (((PrivacySettingsFeature) this.LLILZLL.getValue()).LJIILJJIL()) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C15588068k(this, null), 3);
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new AnonymousClass0694(0);
    }

    @Override // X.InterfaceC1674206h2
    public final void kP() {
        setState(AFwS229S0000000_2.get$arr$(100));
    }

    public final C909290Zln zQ2() {
        return (C909290Zln) this.LLILZIL.getValue();
    }

    public final void yQ2() {
        String uid;
        String recType;
        IMUser singleChatFromUser;
        C909290Zln c909290ZlnZQ2 = zQ2();
        if (c909290ZlnZQ2 == null) {
            return;
        }
        IMUser fromUser = c909290ZlnZQ2.getFromUser();
        if (fromUser == null || fromUser.getFollowStatus() != 2) {
            IMUser fromUser2 = c909290ZlnZQ2.getFromUser();
            if (fromUser2 == null || (uid = fromUser2.getUid()) == null) {
                uid = "";
            }
            IMContactApi.LIZ.getClass();
            IMUser iMUserLIZIZ = C069P.LIZ().getImMafService().LIZIZ(uid);
            if (iMUserLIZIZ != null && (recType = iMUserLIZIZ.getRecType()) != null && C123100dR.LIZ(recType) && (singleChatFromUser = c909290ZlnZQ2.getSingleChatFromUser()) != null) {
                singleChatFromUser.setRecType(recType);
            }
            setState(new AwS581S0100000_2(iMUserLIZIZ, 76));
        }
    }

    public BaseSingleChatNoticeViewModel(IChatNoticeFlowEngine iChatNoticeFlowEngine) {
        IMatchedFriendsAnalytics iMatchedFriendsAnalytics = (IMatchedFriendsAnalytics) PluggableExtentionKt.pluggableSpiForReal(IMatchedFriendsAnalytics.class);
        IChatRequestRepository.LIZ.getClass();
        IChatRequestRepository iChatRequestRepositoryLIZ = C15596068s.LIZ();
        this.LL = iChatNoticeFlowEngine;
        this.LLILLJJLI = iMatchedFriendsAnalytics;
        this.LLILLL = iChatRequestRepositoryLIZ;
        this.LLILZ = new C1559260qg8(new C723600SZy(this, C1527105yP.class, null), true);
        this.LLILZIL = C1509305vX.LIZ(new AwS546S0100000_2(this, 1117));
        this.LLILZLL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1122));
        this.LLIZ = new C1770006wU(CoroutineExceptionHandler.LJJLIL, 17);
        this.LLIZLLLIL = C1509305vX.LIZ(AFwS187S0000000_2.get$arr$(1121));
    }

    public final C09AE BQ2(InterfaceC904740ZeS interfaceC904740ZeS) {
        if (interfaceC904740ZeS instanceof C1509705vb) {
            return C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C068O((C1509705vb) interfaceC904740ZeS, this, null), 3);
        }
        if (!(interfaceC904740ZeS instanceof C06SA)) {
            return null;
        }
        return C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C15585068h(this, (C06SA) interfaceC904740ZeS, null), 3);
    }

    public final <T extends C06OO> void CQ2(C06OD<T> c06od) {
        this.LL.LJIIIZ(c06od);
    }

    public final void EQ2(List<IMNoticeMsgStruct> list) {
        for (IMNoticeMsgStruct iMNoticeMsgStruct : list) {
            if (Intrinsics.LJFF(iMNoticeMsgStruct.noticeCode, "minor_protection")) {
                if (iMNoticeMsgStruct != null) {
                    setState(AFwS229S0000000_2.get$arr$(101));
                    return;
                }
                return;
            }
        }
    }

    public final void xQ2(EnumC1596306Mv... enumC1596306MvArr) {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C068S(this, enumC1596306MvArr, null), 3);
    }

    public final Object DQ2(C06SA c06sa, Function2<? super C06OO, ? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> function2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        String noticeCode;
        CheckMessage.StatusMsg statusMsg;
        C909290Zln c909290ZlnZQ2 = zQ2();
        if (c909290ZlnZQ2 == null) {
            return Unit.LIZ;
        }
        C869590Y9l c869590Y9l = c06sa.LIZJ;
        if (!Intrinsics.LJFF(c869590Y9l.getConversationId(), c909290ZlnZQ2.getConversationId())) {
            return Unit.LIZ;
        }
        IChatRequestRepository iChatRequestRepository = this.LLILLL;
        if (iChatRequestRepository != null && iChatRequestRepository.LIZ(c909290ZlnZQ2.getConversationId())) {
            int msgStatus = c06sa.LIZJ.getMsgStatus();
            if (msgStatus != 1) {
                if (msgStatus == 2) {
                    if (C1665706ff.LIZJ.LJIIIIZZ() && C461060I6e.LIZJ(c869590Y9l)) {
                        return Unit.LIZ;
                    }
                    C1675506hF c1675506hF = C1675506hF.LIZ;
                    Map<String, String> localExt = c869590Y9l.getLocalExt();
                    c1675506hF.getClass();
                    CheckMessage checkMessageLIZ = C1675506hF.LIZ(localExt);
                    if (checkMessageLIZ != null && (statusMsg = checkMessageLIZ.getStatusMsg()) != null) {
                        noticeCode = statusMsg.getNoticeCode();
                    } else {
                        noticeCode = null;
                    }
                    if (Intrinsics.LJFF(noticeCode, "chat_request_sent")) {
                        Object objVQ2 = vQ2("chat_request_sent", interfaceC1364105Vn, function2);
                        if (objVQ2 == C099R.LJFF()) {
                            return objVQ2;
                        }
                        return Unit.LIZ;
                    }
                }
                return Unit.LIZ;
            }
            if (C1665706ff.LIZJ.LJIIIIZZ()) {
                return Unit.LIZ;
            }
            Object objVQ22 = vQ2("chat_request_sent", interfaceC1364105Vn, function2);
            if (objVQ22 == C099R.LJFF()) {
                return objVQ22;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    public final Object vQ2(String str, InterfaceC1364105Vn interfaceC1364105Vn, Function2 function2) {
        EnumC1596306Mv enumC1596306Mv;
        if (Intrinsics.LJFF(str, "chat_request_sent")) {
            enumC1596306Mv = EnumC1596306Mv.CHAT_REQUEST_SENT;
        } else if (Intrinsics.LJFF(str, "chat_request_start")) {
            enumC1596306Mv = EnumC1596306Mv.CHAT_REQUEST_START;
        } else {
            return Unit.LIZ;
        }
        Object objWQ2 = wQ2(enumC1596306Mv, function2, interfaceC1364105Vn);
        if (objWQ2 == C099R.LJFF()) {
            return objWQ2;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object wQ2(X.EnumC1596306Mv r10, kotlin.jvm.functions.Function2<? super X.C06OO, ? super X.InterfaceC1364105Vn<? super java.lang.Boolean>, ? extends java.lang.Object> r11, X.InterfaceC1364105Vn<? super kotlin.Unit> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof X.C15590068m
            if (r0 == 0) goto Lb9
            r4 = r12
            X.068m r4 = (X.C15590068m) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb9
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r1 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r5 = 1
            if (r0 == 0) goto L29
            if (r0 != r5) goto Lc0
            X.06Mv r10 = r4.LL
            X.C155000ia.LIZIZ(r1)
        L24:
            r9.LLJ = r10
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L29:
            X.C155000ia.LIZIZ(r1)
            X.0Zln r8 = r9.zQ2()
            if (r8 != 0) goto L35
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L35:
            com.ss.android.ugc.aweme.im.chatroom.api.repo.IChatRequestRepository r1 = r9.LLILLL
            r7 = 2
            if (r1 == 0) goto L65
            java.lang.String r0 = r8.getConversationId()
            X.0691 r0 = r1.LJFF(r0)
            if (r0 == 0) goto L65
            int[] r1 = X.AnonymousClass0692.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            if (r1 == r5) goto L59
            if (r1 == r7) goto L5c
            r0 = 3
            if (r1 == r0) goto L65
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        L59:
            X.06Mv r0 = X.EnumC1596306Mv.CHAT_REQUEST_START
            goto L5e
        L5c:
            X.06Mv r0 = X.EnumC1596306Mv.CHAT_REQUEST_SENT
        L5e:
            if (r0 == 0) goto L65
            if (r0 != r10) goto L65
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L65:
            X.01GW r0 = X.AnonymousClass0695.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 0
            if (r0 == 0) goto Lab
            X.06Mv[] r1 = new X.EnumC1596306Mv[r5]
            X.06Mv r0 = X.EnumC1596306Mv.CHAT_REQUEST_START
            r1[r2] = r0
            r9.xQ2(r1)
        L7d:
            com.ss.android.ugc.aweme.im.chatroom.api.repo.IChatRequestRepository r6 = r9.LLILLL
            if (r6 == 0) goto L96
            java.lang.String r2 = r8.getConversationId()
            int[] r1 = X.AnonymousClass0692.LIZIZ
            int r0 = r10.ordinal()
            r0 = r1[r0]
            if (r0 == r5) goto La8
            if (r0 == r7) goto La5
            X.0691 r0 = X.AnonymousClass0691.NOT_CHAT_REQUEST
        L93:
            r6.LJ(r2, r0)
        L96:
            X.06OO r0 = r10.toTask()
            r4.LL = r10
            r4.LLILZ = r5
            java.lang.Object r0 = r11.invoke(r0, r4)
            if (r0 != r3) goto L24
            return r3
        La5:
            X.0691 r0 = X.AnonymousClass0691.REQUEST_SENT
            goto L93
        La8:
            X.0691 r0 = X.AnonymousClass0691.START_REQUEST
            goto L93
        Lab:
            X.06Mv[] r1 = new X.EnumC1596306Mv[r7]
            X.06Mv r0 = X.EnumC1596306Mv.CHAT_REQUEST_START
            r1[r2] = r0
            X.06Mv r0 = X.EnumC1596306Mv.CHAT_REQUEST_SENT
            r1[r5] = r0
            r9.xQ2(r1)
            goto L7d
        Lb9:
            X.068m r4 = new X.068m
            r4.<init>(r9, r12)
            goto L12
        Lc0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseSingleChatNoticeViewModel.wQ2(X.06Mv, kotlin.jvm.functions.Function2, X.05Vn):java.lang.Object");
    }
}
