package com.ss.android.ugc.aweme.group;

import X.AbstractC1702506lb;
import X.C01GW;
import X.C11NJ;
import X.C1239300iM4;
import X.C13LE;
import X.C1559260qg8;
import X.C1636406aw;
import X.C1769806wS;
import X.C2217381BqS;
import X.C452501pT;
import X.C457780HxI;
import X.C903930Zd9;
import X.InterfaceC0148002o;
import X.InterfaceC2217461Bqa;
import X.InterfaceC905060Zey;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class ChatConvUpdateVM extends AssemViewModel<InterfaceC0148002o> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public final C11NJ LL = new C11NJ();
    public final C1559260qg8 LLILLJJLI = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C457780HxI.class, (Class<Object>) null, (String) 13), true);
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 227));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 225));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 226));
    public final ConcurrentHashMap<Object, Function1<AbstractC1702506lb, Unit>> LLILZLL = new ConcurrentHashMap<>();
    public volatile C903930Zd9 LLIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ChatConvUpdateVM.class, "imConvoRepoProvider", "getImConvoRepoProvider()Lcom/ss/android/ugc/aweme/im/sdk/chat/data/repository/IMConversationRepositoryProvider;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1769806wS(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        this.LL.LIZ(C1239300iM4.LJ(((InterfaceC905060Zey) this.LLILZIL.getValue()).LIZ((String) this.LLILZ.getValue()), C1239300iM4.LIZIZ, C1239300iM4.LIZJ, new C1636406aw(this)));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLILZLL.clear();
        this.LL.LJ();
    }
}
