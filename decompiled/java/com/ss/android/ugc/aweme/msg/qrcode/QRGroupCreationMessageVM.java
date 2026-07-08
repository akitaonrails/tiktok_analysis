package com.ss.android.ugc.aweme.msg.qrcode;

import X.C01GW;
import X.C036E;
import X.C098200Yq;
import X.C0I0B;
import X.C0PEM;
import X.C0Y8T;
import X.C0YSQ;
import X.C0ZV1;
import X.C0ZV2;
import X.C1159300gH2;
import X.C1389890mGx;
import X.C1411140mpE;
import X.C1466930oHD;
import X.C1509305vX;
import X.C1559260qg8;
import X.C189200o6;
import X.C19EG;
import X.C2188811AlT;
import X.C23250099c;
import X.C291001Au;
import X.C452501pT;
import X.C457780HxI;
import X.C461720I8s;
import X.C899270ZPp;
import X.C900610ZUt;
import X.EnumC1411170mpH;
import X.InterfaceC0148002o;
import X.InterfaceC1409110mlx;
import X.InterfaceC876950Yaj;
import android.app.Activity;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.model.InvitationInfo;
import com.ss.android.ugc.aweme.im.common.model.QRCodeGroupChatLayout;
import com.ss.android.ugc.aweme.im.message.content.GroupInfo;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.analytics.IMGroupChatDetailAnalytics;
import com.ss.android.ugc.aweme.msg.qrcode.QRGroupCreationMessageVM;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS41S0010000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes30.dex */
public final class QRGroupCreationMessageVM extends AssemViewModel<C1159300gH2> {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public QRCodeGroupChatLayout LLILZLL;
    public final C01GW LL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(101));
    public final C1559260qg8 LLILLJJLI = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C457780HxI.class, (Class<Object>) null, (String) 13), true);
    public final C01GW LLILLL = C1509305vX.LIZ(new AwS573S0100000_29(this, 162));
    public final String LLILZ = C461720I8s.LIZIZ();
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(100));
    public final AtomicBoolean LLIZ = new AtomicBoolean(false);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1159300gH2(new C291001Au(EnumC1411170mpH.UNKNOWN), false);
    }

    public final QRCodeGroupChatLayout yQ2() {
        Object c098200Yq;
        if (this.LLIZ.compareAndSet(false, true)) {
            try {
                c098200Yq = (QRCodeGroupChatLayout) ((Gson) this.LLILZIL.getValue()).LJII(((Keva) this.LL.getValue()).getString(xQ2(), ""), QRCodeGroupChatLayout.class);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            this.LLILZLL = (QRCodeGroupChatLayout) c098200Yq;
        }
        return this.LLILZLL;
    }

    public final SessionInfo zQ2() {
        return (SessionInfo) this.LLILLL.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C0ZV1.LIZ.remove(zQ2().getConversationId());
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C0ZV1.LIZ.put(zQ2().getConversationId(), new C0ZV2() { // from class: X.0npM
            @Override // X.C0ZV2
            public final void LIZ() {
                QRGroupCreationMessageVM qRGroupCreationMessageVM = this.LIZ;
                qRGroupCreationMessageVM.LLILZLL = null;
                ((Keva) qRGroupCreationMessageVM.LL.getValue()).erase(qRGroupCreationMessageVM.xQ2());
                qRGroupCreationMessageVM.BQ2(qRGroupCreationMessageVM.zQ2().getConversationId(), true, null);
            }
        });
    }

    public final String xQ2() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(zQ2().getConversationId());
        sbLIZ.append('_');
        sbLIZ.append(this.LLILZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void AQ2(QRGroupCreationMessageVM qRGroupCreationMessageVM, String str) {
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "chat");
        EnterChatParams enterChatParams = ((C457780HxI) qRGroupCreationMessageVM.LLILLJJLI.getValue()).LLILLL;
        if (enterChatParams != null && C899270ZPp.LIZ(enterChatParams)) {
            str2 = "new_group_shot_group_chat";
        } else {
            str2 = "new_qrcode_group_chat";
        }
        linkedHashMap.put("enter_method", str2);
        IMGroupChatDetailAnalytics.LIZ.LJIILIIL(str, linkedHashMap, C0I0B.LJFF.LIZIZ());
    }

    public final void vQ2(final C19EG c19eg, final Function2 function2) {
        try {
            if (C036E.LIZ.LIZIZ()) {
                setState(new AwS41S0010000_29(true, 41));
                BQ2(zQ2().getConversationId(), true, new InterfaceC1409110mlx() { // from class: X.12Q1
                    @Override // X.InterfaceC1409110mlx
                    public final void LIZ() {
                        QRGroupCreationMessageVM qRGroupCreationMessageVM = this.LIZ;
                        qRGroupCreationMessageVM.getClass();
                        qRGroupCreationMessageVM.setState(new AwS41S0010000_29(false, 41));
                        C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
                        c1389890mGx.LJIIIZ(2131829438);
                        c1389890mGx.LJIIJJI();
                    }

                    @Override // X.InterfaceC1409110mlx
                    public final void LIZIZ(QRCodeGroupChatLayout qRCodeGroupChatLayout) {
                        QRGroupCreationMessageVM qRGroupCreationMessageVM = this.LIZ;
                        qRGroupCreationMessageVM.getClass();
                        qRGroupCreationMessageVM.setState(new AwS41S0010000_29(false, 41));
                        function2.invoke(qRCodeGroupChatLayout, c19eg);
                    }
                });
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
        c1389890mGx.LJIIIZ(2131829438);
        c1389890mGx.LJIIJJI();
    }

    public final void wQ2(QRCodeGroupChatLayout qRCodeGroupChatLayout, Activity activity) {
        C0Y8T c0y8tLIZ;
        String str;
        String str2;
        if (qRCodeGroupChatLayout == null || (c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(zQ2().getConversationId())) == null) {
            return;
        }
        C900610ZUt.LIZJ.getClass();
        GroupInfo groupInfoLIZIZ = C900610ZUt.LIZIZ(c0y8tLIZ);
        InvitationInfo invitationInfo = qRCodeGroupChatLayout.invitationInfo;
        Long l = null;
        if (invitationInfo != null) {
            str = invitationInfo.inviteShortUrl;
            str2 = invitationInfo.inviteId;
            l = invitationInfo.expiredAt;
        } else {
            str = null;
            str2 = null;
        }
        C900610ZUt.LJ(activity, C900610ZUt.LIZLLL(str, str2, l, groupInfoLIZIZ, "chat_room_button"));
    }

    public final void BQ2(String str, boolean z, InterfaceC1409110mlx interfaceC1409110mlx) {
        if (yQ2() != null && !z) {
            setState(new AwS608S0100000_29(EnumC1411170mpH.LOAD_SUCCESS, 548));
            return;
        }
        EnumC1411170mpH enumC1411170mpH = getState().LL.LIZ;
        EnumC1411170mpH enumC1411170mpH2 = EnumC1411170mpH.LOADING;
        if (enumC1411170mpH == enumC1411170mpH2) {
            return;
        }
        setState(new AwS608S0100000_29(enumC1411170mpH2, 548));
        C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ.plus(new C1466930oHD(CoroutineExceptionHandler.LJJLIL, this, 0)), null, new C1411140mpE(str, this, interfaceC1409110mlx, null), 2);
    }
}
