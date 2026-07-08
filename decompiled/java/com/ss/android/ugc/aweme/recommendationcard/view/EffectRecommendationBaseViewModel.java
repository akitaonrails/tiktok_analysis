package com.ss.android.ugc.aweme.recommendationcard.view;

import X.AbstractC197104129u;
import X.C01GW;
import X.C05E8;
import X.C05E9;
import X.C09IC;
import X.C09IR;
import X.C0T2Y;
import X.C19EG;
import X.C2252331DDr;
import X.C23250099c;
import X.C452501pT;
import X.C486860J7k;
import X.C861640Xr8;
import X.InterfaceC1483670oiD;
import android.content.ComponentCallbacks;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: loaded from: classes30.dex */
public abstract class EffectRecommendationBaseViewModel<T, S> extends ViewModel {
    public final C01GW LL = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(98));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(122));
    public ScrollSwitchStateManager LLILLL;
    public final C2252331DDr LLILZ;
    public final MutableLiveData<S> LLILZIL;
    public final MutableLiveData LLILZLL;

    public abstract void xQ2(T t);

    public final InterfaceC1483670oiD wQ2() {
        return (InterfaceC1483670oiD) this.LL.getValue();
    }

    public EffectRecommendationBaseViewModel() {
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 0, null, 7);
        this.LLILZ = c2252331DDrLIZIZ;
        MutableLiveData<S> mutableLiveData = new MutableLiveData<>();
        this.LLILZIL = mutableLiveData;
        this.LLILZLL = mutableLiveData;
        C09IC.LJJI(ViewModelKt.getViewModelScope(this), new C861640Xr8(new C05E9(this, null), c2252331DDrLIZIZ));
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        wQ2().release();
    }

    public final void vQ2(AbstractC197104129u abstractC197104129u) {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C05E8(this, abstractC197104129u, null), 3);
    }

    public final void yQ2(C19EG c19eg, Aweme aweme, Function1<? super Boolean, Boolean> function1) {
        ComponentCallbacks componentCallbacksXQ2;
        C0T2Y c0t2y;
        if (c19eg != null) {
            this.LLILLL = C486860J7k.LIZIZ(c19eg);
        }
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService.isLogin()) {
            ScrollSwitchStateManager scrollSwitchStateManager = this.LLILLL;
            if (scrollSwitchStateManager != null) {
                componentCallbacksXQ2 = scrollSwitchStateManager.xQ2("page_profile");
            } else {
                componentCallbacksXQ2 = null;
            }
            if ((componentCallbacksXQ2 instanceof C0T2Y) && (c0t2y = (C0T2Y) componentCallbacksXQ2) != null) {
                c0t2y.Y3(null);
            }
        }
        ScrollSwitchStateManager scrollSwitchStateManager2 = this.LLILLL;
        if (scrollSwitchStateManager2 != null) {
            scrollSwitchStateManager2.KQ2(function1.invoke(Boolean.valueOf(iUserService.isLogin())).booleanValue());
        }
    }
}
