package com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage;

import X.C01GW;
import X.C0HO1;
import X.C1559260qg8;
import X.C23250099c;
import X.C440270HOf;
import X.C440440HOw;
import X.C440500HPc;
import X.C452501pT;
import X.C723600SZy;
import X.InterfaceC440230HOb;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository;
import java.util.List;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS21S0010000_6;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class MixStudioHomePageViewModel extends AssemViewModel<C440270HOf> {
    public final C1559260qg8 LL = new C1559260qg8(new C723600SZy(this, C440500HPc.class, null), true);
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(243));
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(247));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(246));
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(245));
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(244));

    /* JADX WARN: Removed duplicated region for block: B:39:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0195  */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC0148002o defaultState() {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageViewModel.defaultState():X.002o");
    }

    public final C440500HPc wQ2() {
        return (C440500HPc) this.LL.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        MixStudioStatusRepository mixStudioStatusRepository = (MixStudioStatusRepository) this.LLILLL.getValue();
        if (mixStudioStatusRepository == null) {
            return;
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C0HO1(mixStudioStatusRepository, this, null), 3);
    }

    public final void vQ2(boolean z) {
        setState(new AwS21S0010000_6(z, 2));
    }

    public final void xQ2(InterfaceC440230HOb<? extends List<C440440HOw>> interfaceC440230HOb) {
        setState(new AwS585S0100000_6(interfaceC440230HOb, (InterfaceC440230HOb<?>) 177));
    }

    public final void yQ2(InterfaceC440230HOb<? extends List<C440440HOw>> interfaceC440230HOb) {
        setState(new AwS585S0100000_6(interfaceC440230HOb, (InterfaceC440230HOb<?>) 178));
    }
}
