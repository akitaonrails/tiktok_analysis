package com.bytedance.pipo.stellar.base.card.carousel;

import X.C01GW;
import X.C098200Yq;
import X.C1685300txQ;
import X.C1720720usY;
import X.C1720760usc;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1720740usa;
import X.InterfaceC1206390hUz;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.pipo.stellar.base.model.CardDO;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class CarouselFragment extends Fragment implements InterfaceC1206390hUz {
    public static C1720760usc LLILLL = null;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWs8ID88ZjY4LCM/KTdiKy4gLWHELIOSsvKD03ZiYtOyAmOyAgZwwyOio5Oio/DjctLiI2JjE=";
    public CarouselFragmentData LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 36));

    @Override // X.InterfaceC1206390hUz
    public final void LLLILZLLLI() {
    }

    @Override // X.InterfaceC1206390hUz
    public final void V6() {
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            CarouselFragmentData carouselFragmentData = null;
            if (Build.VERSION.SDK_INT >= 33) {
                Bundle arguments = getArguments();
                if (arguments != null) {
                    carouselFragmentData = (CarouselFragmentData) arguments.getParcelable("power_viewpager_default_key", CarouselFragmentData.class);
                }
            } else {
                Bundle arguments2 = getArguments();
                if (arguments2 != null) {
                    carouselFragmentData = (CarouselFragmentData) arguments2.getParcelable("power_viewpager_default_key");
                }
            }
            this.LL = carouselFragmentData;
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // X.InterfaceC1206390hUz
    public final void onPageSelected(int i) {
        C1720720usY c1720720usY = (C1720720usY) this.LLILLJJLI.getValue();
        if (c1720720usY != null) {
            c1720720usY.LIZJ();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List<CardDO> list;
        C1720720usY c1720720usY;
        boolean z;
        super.onViewCreated(view, bundle);
        C1720720usY c1720720usY2 = (C1720720usY) this.LLILLJJLI.getValue();
        if (c1720720usY2 != null) {
            C1720760usc c1720760usc = LLILLL;
            EnumC1720740usa enumC1720740usa = EnumC1720740usa.LINE;
            CarouselFragmentData carouselFragmentData = this.LL;
            if (carouselFragmentData != null && carouselFragmentData.suppressCarouselV2ScrollListener) {
                z = true;
            } else {
                z = false;
            }
            C1720720usY.LIZIZ(c1720720usY2, c1720760usc, enumC1720740usa, null, z, 4);
        }
        CarouselFragmentData carouselFragmentData2 = this.LL;
        if (carouselFragmentData2 != null && (list = carouselFragmentData2.cardData) != null && (c1720720usY = (C1720720usY) this.LLILLJJLI.getValue()) != null) {
            c1720720usY.LIZLLL(null, list);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.d29, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
