package com.ss.android.ugc.aweme.share.invitelink;

import X.C0I0B;
import X.C0Y8T;
import X.C0YSQ;
import X.C0ZBQ;
import X.C0ZFW;
import X.C0ZV1;
import X.C1218370hoJ;
import X.C1234260iDw;
import X.C1383370m6R;
import X.C1389890mGx;
import X.C1559260qg8;
import X.C1608506Rn;
import X.C1623706Xj;
import X.C491101vh;
import X.InterfaceC0148002o;
import X.InterfaceC866830XzV;
import X.InterfaceC876950Yaj;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.common.model.GroupInviteInfoModel;
import com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.analytics.IMGroupChatDetailAnalytics;
import com.ss.android.ugc.aweme.share.invitelink.InviteLinkVM;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class InviteLinkVM extends AssemViewModel<C1218370hoJ> {
    public final C1559260qg8 LL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C0ZBQ.class, (Class<Object>) null, (String) 13), true);
    public final C0ZFW LLILLJJLI = C0ZFW.LIZ;
    public final C1234260iDw LLILLL = new InterfaceC866830XzV() { // from class: X.0iDw
        @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
        public final void LJJJJJL(C0Y8T c0y8t) {
        }

        @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
        public final void LJJLIIIJ(C0Y8T c0y8t) {
        }

        @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
        public final void LJJLJLI(List<C0YAE> list) {
        }

        @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
        public final void LJJLL(List<C0YAE> list) {
        }

        @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
        public final void LJJZZI(List<C0YAE> list) {
        }

        @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
        public final void LJLI(String str, List<C0YAE> list) {
        }

        @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
        public final void LJLILLLLZI(C0Y8T c0y8t) {
        }

        @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
        public final void LJLL(C1711306n1 c1711306n1) {
        }

        @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
        public final void LJZI(C0Y8T c0y8t) {
        }

        @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
        public final void LLIIII(int i, String str) {
        }

        @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
        public final void LLIILZL(int i, String str, List list) {
        }

        @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
        public final int LLLIIII() {
            return 0;
        }

        @Override // X.InterfaceC866830XzV, X.InterfaceC867280Y0o
        public final void LLLIZZ(Map<String, C0Y8T> map) {
        }

        @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
        public final void LJLJI(int i, C0Y8T c0y8t) {
            if (c0y8t != null && Intrinsics.LJFF(c0y8t.getConversationId(), this.LL.xQ2().LL)) {
                InviteLinkVM inviteLinkVM = this.LL;
                inviteLinkVM.setState(new AwS385S0200000_19(inviteLinkVM, c0y8t, 48));
            }
        }
    };

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        String strLJIIJ;
        C0ZFW c0zfw = this.LLILLJJLI;
        String strLJIILLIIL = c0zfw != null ? c0zfw.LJIILLIIL(wQ2()) : null;
        C0ZFW c0zfw2 = this.LLILLJJLI;
        if (c0zfw2 == null || (strLJIIJ = c0zfw2.LJIIJ(wQ2())) == null) {
            strLJIIJ = "";
        }
        C491101vh c491101vh = C491101vh.LIZ;
        return new C1218370hoJ(strLJIILLIIL, strLJIIJ, c491101vh, null, c491101vh);
    }

    public final C0Y8T wQ2() {
        return C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(xQ2().LL);
    }

    public final C0ZBQ xQ2() {
        return (C0ZBQ) this.LL.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJJIJIIJIL(this.LLILLL);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJI(this.LLILLL);
        yQ2();
    }

    public final void yQ2() {
        if (getState().LLILLL instanceof C1623706Xj) {
            return;
        }
        C0Y8T c0y8tWQ2 = wQ2();
        GroupInviteInfoModel groupInviteInfoModelLIZIZ = C0ZV1.LIZIZ(c0y8tWQ2 != null ? c0y8tWQ2.getConversationId() : null);
        if (groupInviteInfoModelLIZIZ == null) {
            setState(AFwS257S0000000_19.get$arr$(314));
        } else {
            setState(new AwS598S0100000_19(groupInviteInfoModelLIZIZ, 254));
        }
        C0ZV1.LIZ(xQ2().LL, true, new AwS598S0100000_19(this, 255), new AwS598S0100000_19(this, 256));
    }

    public final void vQ2(View view, String str) {
        String inviteShortUrl;
        IMGroupChatDetailAnalytics.LIZ.LJFF("click_invite_link_action", new Pair[]{new Pair("enter_from", xQ2().LLILLJJLI), new Pair("action", str)}, C0I0B.LJFF.LIZIZ());
        GroupInviteInfoModel groupInviteInfoModelLIZ = getState().LLILLL.LIZ();
        if (groupInviteInfoModelLIZ != null && (inviteShortUrl = groupInviteInfoModelLIZ.getInviteShortUrl()) != null) {
            IMShareService.LIZ.getClass();
            IMShareService iMShareServiceLIZ = C1608506Rn.LIZ();
            if (iMShareServiceLIZ != null) {
                iMShareServiceLIZ.LJIJJ(view.getContext(), inviteShortUrl);
            }
            String strLJIIJ = C1383370m6R.LJIIJ(2131831436);
            C1389890mGx c1389890mGx = new C1389890mGx(view);
            c1389890mGx.LJIIJ(strLJIIJ);
            c1389890mGx.LJIIJJI();
        }
    }
}
