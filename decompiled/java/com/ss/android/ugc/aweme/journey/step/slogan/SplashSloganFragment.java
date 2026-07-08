package com.ss.android.ugc.aweme.journey.step.slogan;

import X.C0TVI;
import X.C10NW;
import X.C14K9;
import X.C1749280vcc;
import X.C1766560w4U;
import X.C1912490zrr;
import X.C1912930zsZ;
import X.C1912940zsa;
import X.C1912950zsb;
import X.C19EG;
import X.C2187451AjH;
import X.C587550N2r;
import X.C616540OGe;
import X.C786410Ut5;
import X.C800330VaR;
import X.InterfaceC1912500zrs;
import X.InterfaceC1912510zrt;
import Y.ARunnableS128S0100000_28;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes29.dex */
public final class SplashSloganFragment extends SloganFragment implements InterfaceC1912510zrt {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zi8jPD09LTxiHELIOSOjs2OGs/JSA0KStiGj8/KTYkGiM8LyQiDz0yLygpJzs=";
    public View LLJILLL;
    public C1749280vcc LLJJ;

    @Override // X.InterfaceC1912510zrt
    public final void wl() {
        Window window;
        View decorView;
        View viewFindViewById;
        InterfaceC1912500zrs interfaceC1912500zrs = C1912490zrr.LIZIZ;
        if (interfaceC1912500zrs != null) {
            interfaceC1912500zrs.LIZ();
        }
        C1912490zrr.LIZIZ = null;
        C19EG activity = getActivity();
        if (activity != null) {
            ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(activity);
            TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(activity, immersionBarLJIILJJIL);
            immersionBarLJIILJJIL.LJIIL();
            tuxImmersionBar.LJFF(-1);
            tuxImmersionBar.LIZLLL();
            activity.getWindow().setBackgroundDrawable(new ColorDrawable(-1));
            View view = this.LLJILLL;
            if (view != null) {
                view.setBackgroundDrawable(C800330VaR.LIZIZ(activity, R.drawable.cfa));
            }
        }
        C19EG activity2 = getActivity();
        if (activity2 == null || (window = activity2.getWindow()) == null || (decorView = window.getDecorView()) == null || (viewFindViewById = decorView.findViewById(R.id.iiv)) == null) {
            return;
        }
        viewFindViewById.setBackgroundColor(-1);
        C14K9.LJIJJ(viewFindViewById, null);
    }

    public SplashSloganFragment() {
        C1912930zsZ c1912930zsZ = C1912930zsZ.LIZ;
        C10NW c10nw = C10NW.JOURNEY_SLOGAN_ID;
        c1912930zsZ.getClass();
        C1912940zsa c1912940zsaLIZ = C1912930zsZ.LIZ(c10nw);
        C1912930zsZ.LIZJ(c1912940zsaLIZ != null ? c1912940zsaLIZ.LJII : null);
    }

    @Override // com.ss.android.ugc.aweme.journey.step.slogan.SloganFragment, com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(SplashSloganFragment.class.getName());
        }
        C1912930zsZ c1912930zsZ = C1912930zsZ.LIZ;
        C10NW c10nw = C10NW.JOURNEY_SLOGAN_ID;
        c1912930zsZ.getClass();
        C1912940zsa c1912940zsaLIZ = C1912930zsZ.LIZ(c10nw);
        C1912930zsZ.LIZJ(c1912940zsaLIZ != null ? c1912940zsaLIZ.LJI : null);
        super.onResume();
        C1912940zsa c1912940zsaLIZ2 = C1912930zsZ.LIZ(c10nw);
        C1912930zsZ.LIZIZ(c1912940zsaLIZ2 != null ? c1912940zsaLIZ2.LJI : null);
        C1912940zsa c1912940zsaLIZ3 = C1912930zsZ.LIZ(c10nw);
        C1912930zsZ.LIZIZ(c1912940zsaLIZ3 != null ? c1912940zsaLIZ3.LJII : null);
        C1912930zsZ.LIZLLL(c10nw);
    }

    @Override // com.ss.android.ugc.aweme.journey.step.slogan.SloganFragment
    public final View WR(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.czt, viewGroup, false);
        if (viewGroup != null) {
            C14K9.LJIJJ(viewGroup, new C0TVI() { // from class: X.0zrq
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
                    view.setPadding(0, 0, 0, 0);
                    return c20246014Ju;
                }
            });
        }
        return viewTd;
    }

    @Override // com.ss.android.ugc.aweme.journey.step.slogan.SloganFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C1912950zsb c1912950zsb;
        C1912930zsZ c1912930zsZ = C1912930zsZ.LIZ;
        C10NW c10nw = C10NW.JOURNEY_SLOGAN_ID;
        c1912930zsZ.getClass();
        C1912940zsa c1912940zsaLIZ = C1912930zsZ.LIZ(c10nw);
        if (c1912940zsaLIZ != null) {
            c1912950zsb = c1912940zsaLIZ.LJFF;
        } else {
            c1912950zsb = null;
        }
        C1912930zsZ.LIZJ(c1912950zsb);
        super.onViewCreated(view, bundle);
        this.LLJILLL = view.findViewById(R.id.vko);
        this.LLJJ = (C1749280vcc) view.findViewById(R.id.vkr);
        C1912490zrr.LIZ = new WeakReference<>(this);
        TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
        tuxImmersionBarLIZLLL.LIZIZ.LJIIL();
        tuxImmersionBarLIZLLL.LIZIZ.LJIIJJI();
        tuxImmersionBarLIZLLL.LIZLLL();
        bS(false);
        C1749280vcc c1749280vcc = this.LLJJ;
        if (c1749280vcc != null) {
            c1749280vcc.LJ();
        }
        C1749280vcc c1749280vcc2 = this.LLJJ;
        if (c1749280vcc2 != null) {
            C786410Ut5.LLLZLZ(c1749280vcc2, 0);
        }
        C587550N2r.LIZ(1000L, new ARunnableS128S0100000_28(this, 41));
    }
}
