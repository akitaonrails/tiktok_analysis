package com.ss.android.ugc.aweme.group;

import X.C01GW;
import X.C0Y8T;
import X.C0YSQ;
import X.C11NJ;
import X.C1239300iM4;
import X.C1389890mGx;
import X.C13LE;
import X.C1504905up;
import X.C1559260qg8;
import X.C1655406e0;
import X.C1701940uOG;
import X.C1702706ld;
import X.C2217381BqS;
import X.C23250099c;
import X.C291001Au;
import X.C452501pT;
import X.C457780HxI;
import X.C723600SZy;
import X.C903930Zd9;
import X.InterfaceC0148002o;
import X.InterfaceC1655706e3;
import X.InterfaceC2217461Bqa;
import X.InterfaceC876950Yaj;
import X.InterfaceC905060Zey;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class MockedConvVM extends AssemViewModel<C1655406e0> implements InterfaceC1655706e3 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public final C1559260qg8 LL = new C1559260qg8(new C723600SZy(this, C457780HxI.class, null), true);
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS546S0100000_2(this, 229));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 228));
    public final C11NJ LLILZ = new C11NJ();
    public final ConcurrentHashMap<Integer, Function1<C1702706ld, Unit>> LLILZIL = new ConcurrentHashMap<>();
    public int LLILZLL;
    public volatile C903930Zd9 LLIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MockedConvVM.class, "imConvoRepoProvider", "getImConvoRepoProvider()Lcom/ss/android/ugc/aweme/im/sdk/chat/data/repository/IMConversationRepositoryProvider;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1655406e0(new C291001Au(null), new C291001Au(Unit.LIZ));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        SessionInfo sessionInfo = (SessionInfo) this.LLILLJJLI.getValue();
        if (sessionInfo == null) {
            return;
        }
        if (wQ2() == null) {
            C23250099c.LIZLLL(getAssemVMScope(), null, null, new C1504905up(sessionInfo, null), 3);
        }
        this.LLILZ.LIZ(C1239300iM4.LJ(((InterfaceC905060Zey) this.LLILLL.getValue()).LIZ(sessionInfo.getConversationId()).LJJJLZIJ(C1701940uOG.LIZIZ()), C1239300iM4.LIZIZ, C1239300iM4.LIZJ, new AwS581S0100000_2(this, 190)));
        C0Y8T c0y8tWQ2 = wQ2();
        if (c0y8tWQ2 == null || !c0y8tWQ2.isTemp() || sessionInfo.isNewGroupChat()) {
            return;
        }
        C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJ(c0y8tWQ2.getConversationShortId(), "enter_chat");
    }

    public final C0Y8T wQ2() {
        SessionInfo sessionInfo = (SessionInfo) this.LLILLJJLI.getValue();
        if (sessionInfo == null) {
            return null;
        }
        return C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(sessionInfo.getConversationId());
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLILZIL.clear();
        this.LLILZ.LJ();
    }

    @Override // X.InterfaceC1655706e3
    public final void cc1(Function1<? super C1702706ld, Unit> function1) {
        C0Y8T c0y8tWQ2 = wQ2();
        if (c0y8tWQ2 != null && c0y8tWQ2.isTemp()) {
            AwS581S0100000_2 awS581S0100000_2 = new AwS581S0100000_2((Function1) function1, (Function1<Object, String>) 191);
            ConcurrentHashMap<Integer, Function1<C1702706ld, Unit>> concurrentHashMap = this.LLILZIL;
            int i = this.LLILZLL;
            this.LLILZLL = i + 1;
            concurrentHashMap.put(Integer.valueOf(i), awS581S0100000_2);
            return;
        }
        function1.invoke(null);
    }

    public final void vQ2(View view, String str, Function0<Unit> function0) {
        C0Y8T c0y8tWQ2 = wQ2();
        if (c0y8tWQ2 != null && c0y8tWQ2.isTemp()) {
            C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJ(c0y8tWQ2.getConversationShortId(), str);
            C1389890mGx c1389890mGx = new C1389890mGx(view);
            c1389890mGx.LJIIJ(view.getContext().getString(2131831447));
            c1389890mGx.LJIIJJI();
            return;
        }
        function0.invoke();
    }
}
