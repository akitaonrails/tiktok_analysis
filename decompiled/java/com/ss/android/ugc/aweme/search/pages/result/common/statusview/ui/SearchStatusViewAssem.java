package com.ss.android.ugc.aweme.search.pages.result.common.statusview.ui;

import X.C01GW;
import X.C036E;
import X.C098200Yq;
import X.C0PQK;
import X.C1257170iot;
import X.C1749280vcc;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C418440Gaw;
import X.C452501pT;
import X.C724240Sb0;
import X.C814420VxA;
import X.EnumC1609900rzo;
import Y.AObserverS175S0200000_10;
import Y.AObserverS214S0100000_10;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment;
import com.ss.android.ugc.aweme.search.pages.result.common.statusview.viewmodel.SearchStatusViewVM;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchStatusViewAssem extends UIContentAssem {
    public static final int LLJILJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(130));
    public static final int LLJILJILJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(96));
    public C1749280vcc LLIZLLLIL;
    public C197039127h LLJ;
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 592));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 591));

    public final void Go() {
        if (C036E.LIZ.LIZIZ()) {
            return;
        }
        try {
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            Unit unit = null;
            if (c19egLIZ != null) {
                C1257170iot.LIZ(c19egLIZ, EnumC1609900rzo.SEARCH, null, this.LLIZLLLIL);
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void Ho() {
        SearchFragment searchFragment;
        try {
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            Unit unit = null;
            if ((fragmentLJI instanceof SearchFragment) && (searchFragment = (SearchFragment) fragmentLJI) != null) {
                searchFragment.PT();
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Unit unit;
        SearchStatusViewVM searchStatusViewVMLIZIZ;
        super.onViewCreated(view);
        this.LLIZLLLIL = (C1749280vcc) view.findViewById(R.id.ud9);
        this.LLJ = (C197039127h) view.findViewById(R.id.ufj);
        C1749280vcc c1749280vcc = this.LLIZLLLIL;
        if (c1749280vcc != null) {
            c1749280vcc.setLayoutVariant(0);
        }
        try {
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI != null && (searchStatusViewVMLIZIZ = C0PQK.LIZIZ(fragmentLJI)) != null) {
                searchStatusViewVMLIZIZ.LLILLL.observe(fragmentLJI, new AObserverS214S0100000_10(this, 173));
                searchStatusViewVMLIZIZ.LLILLJJLI.observe(fragmentLJI, new AObserverS175S0200000_10(this, fragmentLJI, 12));
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
