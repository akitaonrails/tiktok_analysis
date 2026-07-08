package com.ss.android.ugc.aweme.chatnotice.viewmodel;

import X.AbstractC2252651DEx;
import X.AnonymousClass0680;
import X.AnonymousClass0681;
import X.AnonymousClass0683;
import X.AnonymousClass0688;
import X.C01GW;
import X.C068A;
import X.C068B;
import X.C068D;
import X.C068F;
import X.C068U;
import X.C069B;
import X.C06NH;
import X.C06OD;
import X.C06OO;
import X.C06SA;
import X.C09AE;
import X.C0PEM;
import X.C14EU;
import X.C1509305vX;
import X.C1509705vb;
import X.C15566067o;
import X.C15567067p;
import X.C15568067q;
import X.C15569067r;
import X.C15570067s;
import X.C15571067t;
import X.C15572067u;
import X.C15574067w;
import X.C1559260qg8;
import X.C15594068q;
import X.C15626069w;
import X.C1596206Mu;
import X.C1770006wU;
import X.C1DFB;
import X.C23250099c;
import X.C457780HxI;
import X.C723600SZy;
import X.C869590Y9l;
import X.EnumC15556067e;
import X.EnumC1596306Mv;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1599506Ob;
import X.InterfaceC904740ZeS;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.api.TikTokImApi;
import com.ss.android.ugc.aweme.im.common.model.IMNoticeMsgStruct;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.IChatNoticeFlowEngine;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.viewmodel.ICommonChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.ui.IChatNoticeApiHelper;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS17S0010000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes3.dex */
public class BaseCommonChatNoticeViewModel extends ICommonChatNoticeViewModel {
    public final AbstractC2252651DEx LLILLL;
    public final C1559260qg8 LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final IChatNoticeApiHelper LLIZ;
    public final C1770006wU LLIZLLLIL;
    public boolean LLJ;

    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.viewmodel.ICommonChatNoticeViewModel
    public final void KQ2() {
        this.LL.LIZIZ();
    }

    public final SessionInfo RQ2() {
        return (SessionInfo) this.LLILZIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.viewmodel.ICommonChatNoticeViewModel
    public final boolean ny() {
        AnonymousClass0683 dismissedByActions;
        EnumC1596306Mv enumC1596306MvLIZJ = this.LL.LIZJ(C06NH.BOTTOM);
        if (enumC1596306MvLIZJ == null || (dismissedByActions = enumC1596306MvLIZJ.getDismissedByActions()) == null) {
            return false;
        }
        return dismissedByActions.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.viewmodel.ICommonChatNoticeViewModel
    /* JADX INFO: renamed from: zQ2 */
    public final C069B defaultState() {
        return new C069B(false, null, null, null);
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.viewmodel.ICommonChatNoticeViewModel
    public final void AQ2() {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C15572067u(this, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.viewmodel.ICommonChatNoticeViewModel
    public final void CQ2() {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C15574067w(this, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.viewmodel.ICommonChatNoticeViewModel
    public final void LQ2() {
        SessionInfo sessionInfoRQ2 = RQ2();
        if (sessionInfoRQ2 == null) {
            return;
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C15594068q(sessionInfoRQ2, this, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.viewmodel.ICommonChatNoticeViewModel, com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* bridge */ /* synthetic */ InterfaceC0148002o defaultState() {
        return defaultState();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        if (EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
        super.onCleared();
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.viewmodel.ICommonChatNoticeViewModel
    public final void BQ2(EnumC1596306Mv enumC1596306Mv) {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C15566067o(this, enumC1596306Mv, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.viewmodel.ICommonChatNoticeViewModel
    public final EnumC1596306Mv FQ2(C06NH c06nh) {
        return this.LL.LIZJ(c06nh);
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.viewmodel.ICommonChatNoticeViewModel
    public final <T extends C06OO> void HQ2(C06OD<T> c06od) {
        this.LL.LJIIIZ(c06od);
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.viewmodel.ICommonChatNoticeViewModel
    public final C09AE JQ2(EnumC1596306Mv enumC1596306Mv) {
        return C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C15571067t(this, enumC1596306Mv, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.viewmodel.ICommonChatNoticeViewModel
    public final void MQ2(String str) {
        SessionInfo sessionInfoRQ2 = RQ2();
        if (sessionInfoRQ2 == null) {
            return;
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), this.LLILLL, null, new AnonymousClass0680(this, str, 2, sessionInfoRQ2, null), 2);
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.viewmodel.ICommonChatNoticeViewModel
    public final void NQ2(boolean z) {
        this.LL.LJIIIIZZ(z);
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.viewmodel.ICommonChatNoticeViewModel
    public final void OQ2(boolean z) {
        setState(new AwS17S0010000_2(z, 1));
    }

    public final void QQ2(C869590Y9l c869590Y9l) {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass0681(c869590Y9l, this, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.viewmodel.ICommonChatNoticeViewModel
    public final void df1(InterfaceC904740ZeS interfaceC904740ZeS) {
        if (interfaceC904740ZeS instanceof C1509705vb) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass0688((C1509705vb) interfaceC904740ZeS, this, null), 3);
        } else if (interfaceC904740ZeS instanceof C06SA) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C068F(this, (C06SA) interfaceC904740ZeS, null), 3);
        } else {
            if (!(interfaceC904740ZeS instanceof C15626069w)) {
                return;
            }
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C15570067s((C15626069w) interfaceC904740ZeS, this, null), 3);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onDebugNoticeCodeEvent(C068D c068d) {
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.viewmodel.ICommonChatNoticeViewModel
    public C09AE vQ2(Function2<? super C06OO, ? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> function2) {
        return C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C068A(this, function2, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.viewmodel.ICommonChatNoticeViewModel
    public final C09AE xQ2(C06OO c06oo) {
        return C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C15568067q(this, c06oo, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.viewmodel.ICommonChatNoticeViewModel
    public final C09AE wQ2(List<IMNoticeMsgStruct> list, Function2<? super C06OO, ? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> function2) {
        return C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C1596206Mu(list, this, function2, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.viewmodel.ICommonChatNoticeViewModel
    public final C09AE yQ2(Function2 function2, boolean z) {
        return C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C15569067r(this, z, function2, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.069Y] */
    public BaseCommonChatNoticeViewModel(IChatNoticeFlowEngine iChatNoticeFlowEngine, C1DFB c1dfb, TikTokImApi tikTokImApi) {
        super(iChatNoticeFlowEngine);
        this.LLILLL = c1dfb;
        this.LLILZ = new C1559260qg8(new C723600SZy(this, C457780HxI.class, null), true);
        this.LLILZIL = C1509305vX.LIZ(new AwS546S0100000_2(this, 1116));
        this.LLILZLL = C1509305vX.LIZ(AFwS187S0000000_2.get$arr$(1120));
        IChatNoticeApiHelper.LIZ.getClass();
        this.LLIZ = C068B.LIZ(tikTokImApi);
        this.LLIZLLLIL = new C1770006wU(CoroutineExceptionHandler.LJJLIL, 16);
        iChatNoticeFlowEngine.LJ(new InterfaceC1599506Ob() { // from class: X.069Y
            @Override // X.InterfaceC1599506Ob
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1599506Ob
            public final void LIZLLL() {
            }

            @Override // X.InterfaceC1599506Ob
            public final void LIZ(EnumC1596306Mv enumC1596306Mv) {
                C06NH c06nh;
                C06NH sceneId = enumC1596306Mv.getSceneId();
                C291001Au<C06NH> c291001Au = this.LIZ.getState().LLILLL;
                if (c291001Au != null) {
                    c06nh = c291001Au.LIZ;
                } else {
                    c06nh = null;
                }
                if (sceneId == c06nh) {
                    this.LIZ.setState(new AwS581S0100000_2(enumC1596306Mv, 558));
                } else {
                    this.LIZ.setState(new AwS581S0100000_2(enumC1596306Mv, 559));
                }
            }

            @Override // X.InterfaceC1599506Ob
            public final void LIZIZ(C06NH c06nh) {
                this.LIZ.setState(new AwS581S0100000_2(c06nh, 557));
            }
        });
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZ, null, new C15567067p(this, null), 2);
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.viewmodel.ICommonChatNoticeViewModel
    public void DQ2(EnumC15556067e enumC15556067e, String str, String str2, long j) {
        SessionInfo sessionInfoRQ2 = RQ2();
        if (sessionInfoRQ2 == null) {
            return;
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), this.LLIZLLLIL, null, new C068U(j, this, enumC15556067e, str, str2, sessionInfoRQ2, null), 2);
    }
}
