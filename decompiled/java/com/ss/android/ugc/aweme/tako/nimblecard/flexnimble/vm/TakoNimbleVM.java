package com.ss.android.ugc.aweme.tako.nimblecard.flexnimble.vm;

import X.C09U0;
import X.C13LE;
import X.C2217381BqS;
import X.C329020Cv6;
import X.C329050Cv9;
import X.C329060CvA;
import X.C329070CvB;
import X.EnumC328990Cv3;
import X.InterfaceC0148002o;
import X.InterfaceC2217461Bqa;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class TakoNimbleVM extends AssemViewModel<C329050Cv9> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public final C329070CvB LL = new C329070CvB();
    public volatile C09U0 LLILLJJLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoNimbleVM.class, "dispatchers", "getDispatchers()Lcom/ss/android/ugc/aweme/utils/dispatchers/TTDispatchers;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C329050Cv9(0);
    }

    public static void vQ2(TakoNimbleVM takoNimbleVM, C329020Cv6 c329020Cv6, EnumC328990Cv3 enumC328990Cv3, int i, Function1 function1) {
        takoNimbleVM.getClass();
        takoNimbleVM.withState(new C329060CvA(takoNimbleVM, enumC328990Cv3, c329020Cv6, i, null, function1));
    }
}
