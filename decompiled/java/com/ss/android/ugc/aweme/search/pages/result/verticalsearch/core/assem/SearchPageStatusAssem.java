package com.ss.android.ugc.aweme.search.pages.result.verticalsearch.core.assem;

import X.C01GW;
import X.C098200Yq;
import X.C0PCY;
import X.C0Q3E;
import X.C0Q9S;
import X.C1257170iot;
import X.C1390410mHn;
import X.C14EU;
import X.C1558520qew;
import X.C1749280vcc;
import X.C189200o6;
import X.C19EG;
import X.C21609119hZ;
import X.C452501pT;
import X.C646670PYb;
import X.C724240Sb0;
import X.C7840034k;
import X.C786410Ut5;
import X.EnumC1609900rzo;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AObserverS214S0100000_10;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.core.ability.ISearchPageStatusAbility;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import kotlin.Unit;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchPageStatusAssem extends UIContentAssem implements ISearchPageStatusAbility, InterfaceC1554640qYg {
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 803));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 802));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 799));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 801));
    public C0Q9S LLJILJIL = C0Q9S.DEFAULT;
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 800));

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -983374560) {
            return null;
        }
        return this;
    }

    public final C21609119hZ Go() {
        return (C21609119hZ) this.LLJ.getValue();
    }

    public final C1749280vcc Ho() {
        return (C1749280vcc) this.LLIZLLLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.core.ability.ISearchPageStatusAbility
    public final boolean mR() {
        C0Q9S c0q9s = this.LLJILJIL;
        return (c0q9s == C0Q9S.DEFAULT || c0q9s == C0Q9S.LOADING) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.core.ability.ISearchPageStatusAbility
    public final void uS1() {
        C1390410mHn c1390410mHn = (C1390410mHn) this.LLJI.getValue();
        if (c1390410mHn != null && c1390410mHn.LLIZLLLIL) {
            c1390410mHn.LIZLLL();
        }
        C21609119hZ c21609119hZGo = Go();
        if (c21609119hZGo != null) {
            c21609119hZGo.setRefreshing(false);
        }
    }

    public final void Jo() {
        C1749280vcc c1749280vccHo = Ho();
        if (c1749280vccHo != null) {
            C786410Ut5.LLLZLZ(c1749280vccHo, 0);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) this.LLJIJIL.getValue();
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            C786410Ut5.LLF(8, viewOnAttachStateChangeListenerC20604515jv);
        }
        C21609119hZ c21609119hZGo = Go();
        if (c21609119hZGo != null) {
            c21609119hZGo.setRefreshing(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.core.ability.ISearchPageStatusAbility
    public final void Yj0() {
        try {
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            Unit unit = null;
            if (c19egLIZ != null) {
                C1257170iot.LIZ(c19egLIZ, EnumC1609900rzo.SEARCH, null, null);
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.core.ability.ISearchPageStatusAbility
    public final void bG1() {
        ISearchContextAbility iSearchContextAbilityLIZIZ;
        C0PCY<C646670PYb> c0pcyJh0;
        C646670PYb c646670PYb;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || (iSearchContextAbilityLIZIZ = C0Q3E.LIZIZ(fragmentLJI)) == null || (c0pcyJh0 = iSearchContextAbilityLIZIZ.Jh0()) == null || (c646670PYb = (C646670PYb) c0pcyJh0.LIZJ()) == null || c646670PYb.LLIZLLLIL) {
            C1390410mHn c1390410mHn = (C1390410mHn) this.LLJI.getValue();
            if (c1390410mHn != null) {
                c1390410mHn.LIZJ();
                return;
            }
            return;
        }
        C21609119hZ c21609119hZGo = Go();
        if (c21609119hZGo != null) {
            c21609119hZGo.setRefreshing(true);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        C1558520qew.LIZLLL(this);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void hideLoadingBall(C7840034k c7840034k) {
        if ((Intrinsics.LJFF(c7840034k.LIZ, "vertical-sounds") || Intrinsics.LJFF(c7840034k.LIZ, "vertical-shopping") || Intrinsics.LJFF(c7840034k.LIZ, "vertical-poi")) && this.LLILZ) {
            uS1();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x011d  */
    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.core.ability.ISearchPageStatusAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1(X.C0Q9U r12) {
        /*
            Method dump skipped, instruction units count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.verticalsearch.core.assem.SearchPageStatusAssem.mo1(X.0Q9U):void");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        NextLiveData nextLiveData;
        super.onViewCreated(view);
        C21609119hZ c21609119hZGo = Go();
        if (c21609119hZGo != null) {
            c21609119hZGo.setEnabled(false);
        }
        EventBus.LIZLLL().LJIJJ(this);
        SearchGlobalViewModel searchGlobalViewModel = (SearchGlobalViewModel) this.LLJILJILJ.getValue();
        if (searchGlobalViewModel != null && (nextLiveData = searchGlobalViewModel.LLILZLL) != null) {
            nextLiveData.observe(this, new AObserverS214S0100000_10(this, 60));
        }
    }
}
