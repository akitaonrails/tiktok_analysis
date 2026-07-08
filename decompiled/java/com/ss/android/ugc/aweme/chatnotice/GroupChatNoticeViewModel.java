package com.ss.android.ugc.aweme.chatnotice;

import X.C01GW;
import X.C067S;
import X.C067T;
import X.C0YSQ;
import X.C0Z5O;
import X.C1509305vX;
import X.C1559260qg8;
import X.C15604069a;
import X.C15606069c;
import X.C1769306wN;
import X.C2095008Iq;
import X.C23250099c;
import X.C723600SZy;
import X.C913140Zs0;
import X.EnumC1596306Mv;
import X.InterfaceC0148002o;
import X.InterfaceC1639706bT;
import X.InterfaceC876950Yaj;
import Y.AObserverS206S0100000_2;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.IChatNoticeFlowEngine;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class GroupChatNoticeViewModel extends AssemViewModel<C15604069a> implements InterfaceC1639706bT {
    public static final /* synthetic */ int LLJ = 0;
    public final IChatNoticeFlowEngine LL;
    public final InterfaceC876950Yaj LLILLJJLI;
    public final C1559260qg8 LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public boolean LLILZLL;
    public final MutableLiveData<Integer> LLIZ;
    public final AObserverS206S0100000_2 LLIZLLLIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C15604069a(0);
    }

    @Override // X.InterfaceC1639706bT
    public final void nY0() {
        String conversationId;
        InterfaceC876950Yaj interfaceC876950Yaj = this.LLILLJJLI;
        C913140Zs0 c913140Zs0WQ2 = wQ2();
        if (c913140Zs0WQ2 == null || (conversationId = c913140Zs0WQ2.getConversationId()) == null) {
            conversationId = "";
        }
        interfaceC876950Yaj.LJJ(conversationId, new C1769306wN(this, 3));
    }

    public final C913140Zs0 wQ2() {
        return (C913140Zs0) this.LLILZ.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        String conversationId;
        Long lLJIILIIL;
        super.onCleared();
        C913140Zs0 c913140Zs0WQ2 = wQ2();
        if (c913140Zs0WQ2 != null && (conversationId = c913140Zs0WQ2.getConversationId()) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(conversationId)) != null) {
            C0Z5O.LIZ.LIZIZ(lLJIILIIL.longValue(), this.LLIZ);
        }
        this.LLIZ.removeObserver(this.LLIZLLLIL);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPrepared() {
        /*
            r4 = this;
            super.onPrepared()
            X.0Yaj r1 = r4.LLILLJJLI
            X.0Zs0 r0 = r4.wQ2()
            if (r0 == 0) goto L36
            java.lang.String r0 = r0.getConversationId()
        Lf:
            X.0Y8T r0 = r1.LIZ(r0)
            if (r0 == 0) goto L24
            X.0Z5O r3 = X.C0Z5O.LIZ
            long r1 = r0.getConversationShortId()
            androidx.lifecycle.MutableLiveData<java.lang.Integer> r0 = r4.LLIZ
            r3.LIZ(r1, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != 0) goto L2e
        L24:
            androidx.lifecycle.MutableLiveData<java.lang.Integer> r1 = r4.LLIZ
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.setValue(r0)
        L2e:
            androidx.lifecycle.MutableLiveData<java.lang.Integer> r1 = r4.LLIZ
            Y.AObserverS206S0100000_2 r0 = r4.LLIZLLLIL
            r1.observeForever(r0)
            return
        L36:
            r0 = 0
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.chatnotice.GroupChatNoticeViewModel.onPrepared():void");
    }

    public GroupChatNoticeViewModel(IChatNoticeFlowEngine iChatNoticeFlowEngine) {
        InterfaceC876950Yaj interfaceC876950YajLIZIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ);
        this.LL = iChatNoticeFlowEngine;
        this.LLILLJJLI = interfaceC876950YajLIZIZ;
        this.LLILLL = new C1559260qg8(new C723600SZy(this, C15606069c.class, null), true);
        this.LLILZ = C1509305vX.LIZ(new AwS546S0100000_2(this, 963));
        this.LLILZIL = C1509305vX.LIZ(AFwS187S0000000_2.get$arr$(830));
        this.LLIZ = new MutableLiveData<>();
        this.LLIZLLLIL = new AObserverS206S0100000_2(this, 12);
    }

    public final void vQ2(EnumC1596306Mv enumC1596306Mv) {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C067S(this, enumC1596306Mv, null), 3);
    }

    public final void xQ2(EnumC1596306Mv enumC1596306Mv, boolean z) {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C067T(z, enumC1596306Mv, this, null), 3);
    }
}
