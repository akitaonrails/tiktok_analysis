package com.ss.android.ugc.aweme.tako.startup.onboarding.vm;

import X.C1863140yaG;
import X.C1863150yaH;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.tako.ccl.net.TakoOnBoardingResponse;
import com.ss.android.ugc.aweme.tako.ccl.net.TakoOnboardingData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoOnboardingViewModel extends AssemViewModel<C1863140yaG> {
    public final List<Function0<Unit>> LL = new ArrayList();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1863140yaG(0);
    }

    public final void xQ2() {
        setStateImmediate(AFwS269S0000000_27.get$arr$(302));
    }

    public final boolean isVisible() {
        return getState().LLILLL;
    }

    public final String wQ2() {
        LogPbBean logPbBean;
        TakoOnBoardingResponse takoOnBoardingResponse = getState().LL;
        if (takoOnBoardingResponse == null || (logPbBean = takoOnBoardingResponse.logPbBean) == null) {
            return null;
        }
        return logPbBean.getImprId();
    }

    public final TakoOnboardingData vQ2(String str) {
        List<TakoOnboardingData> list;
        TakoOnBoardingResponse takoOnBoardingResponse = getState().LL;
        TakoOnboardingData takoOnboardingData = null;
        if (takoOnBoardingResponse == null || (list = takoOnBoardingResponse.data) == null) {
            return null;
        }
        Iterator<TakoOnboardingData> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            TakoOnboardingData next = it2.next();
            if (Intrinsics.LJFF(next.type, str)) {
                takoOnboardingData = next;
                break;
            }
        }
        return takoOnboardingData;
    }

    public final void yQ2(Function0<Unit> function0) {
        if (getState().LL != null) {
            function0.invoke();
        } else {
            ((ArrayList) this.LL).add(function0);
        }
    }

    public static void zQ2(TakoOnboardingViewModel takoOnboardingViewModel, boolean z, Integer num, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = takoOnboardingViewModel.getState().LLILZLL;
        }
        if ((i & 2) != 0) {
            num = takoOnboardingViewModel.getState().LLIZ;
        }
        if ((i & 4) != 0) {
            z2 = takoOnboardingViewModel.getState().LLIZLLLIL;
        }
        if ((i & 8) != 0) {
            z3 = takoOnboardingViewModel.getState().LLJ;
        }
        takoOnboardingViewModel.setStateImmediate(new C1863150yaH(takoOnboardingViewModel, z, num, z2, z3));
    }
}
