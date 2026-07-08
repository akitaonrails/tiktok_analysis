package com.ss.android.ugc.aweme.favorites.business;

import X.AbstractC2369409Qe;
import X.C01GW;
import X.C098200Yq;
import X.C09JN;
import X.C0T6K;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C11JF;
import X.C11S5;
import X.C1206280hUo;
import X.C1206360hUw;
import X.C1206450hV5;
import X.C1458960o4M;
import X.C1685300txQ;
import X.C1701940uOG;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C19Y3;
import X.C20533215Wg;
import X.C20673215v0;
import X.C21594419fC;
import X.C2187451AjH;
import X.C2200821BBo;
import X.C452501pT;
import X.C616540OGe;
import X.C786410Ut5;
import X.InterfaceC1206270hUn;
import X.InterfaceC1206570hVH;
import X.InterfaceC1258040iqI;
import X.InterfaceC469360Ias;
import Y.ARunnableS118S0100000_18;
import Y.AfS154S0200000_18;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.als.extensions.LifecycleOwnerExtensionsKt;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class FavoritesFragmentOtherProfile extends AmeBaseFragment implements InterfaceC469360Ias, InterfaceC1258040iqI {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiMtPyAhITEpOmExPTHELIOSYlJyogO2sKKDk8Oiw4LDwVOiQrJCo9PAo4ISohGDcjLyY/LQ==";
    public C19Y3 LLILLJJLI;
    public C21594419fC LLILLL;
    public int LLILZIL;
    public boolean LLILZLL;
    public C11JF LLIZ;
    public String LLJ;
    public final String LL = "others_homepage";
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 254));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(113));

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
    }

    public final FavoritesPagerAdapterOtherProfile MR() {
        return (FavoritesPagerAdapterOtherProfile) this.LLILZ.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1258040iqI
    public final View LJJLIIIJILLIZJL() {
        if (getHost() == null) {
            return null;
        }
        FavoritesPagerAdapterOtherProfile favoritesPagerAdapterOtherProfileMR = MR();
        int i = this.LLILZIL;
        if (((ArrayList) favoritesPagerAdapterOtherProfileMR.LJJIJLIJ()).isEmpty()) {
            return null;
        }
        Fragment fragment = (Fragment) ListProtector.get(favoritesPagerAdapterOtherProfileMR.LJJIJLIJ(), i);
        return fragment instanceof InterfaceC1258040iqI ? ((InterfaceC1258040iqI) fragment).LJJLIIIJILLIZJL() : C1206360hUw.LIZ(fragment.getView());
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C11JF c11jf = this.LLIZ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C20673215v0.LJIIIIZZ(R.layout.c6d);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        ProfileListFragment profileListFragment;
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(FavoritesFragmentOtherProfile.class.getName());
        }
        C1206450hV5.LIZ = this.LL;
        super.onResume();
        FavoritesPagerAdapterOtherProfile favoritesPagerAdapterOtherProfileMR = MR();
        int i = this.LLILZIL;
        favoritesPagerAdapterOtherProfileMR.LJJIZ(i);
        if (i >= 1 && i < ((ArrayList) favoritesPagerAdapterOtherProfileMR.LLJ).size()) {
            Object obj = ListProtector.get(favoritesPagerAdapterOtherProfileMR.LJJIJLIJ(), i);
            if ((obj instanceof ProfileListFragment) && (profileListFragment = (ProfileListFragment) obj) != null) {
                profileListFragment.mS(true);
            }
        }
        if (this.LLILZLL) {
            return;
        }
        C21594419fC c21594419fC = this.LLILLL;
        C0T6K.LIZ(c21594419fC != null ? c21594419fC : null, AFwS206S0000000_18.get$arr$(699));
        this.LLILZLL = true;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C1458960o4M.LIZ = false;
        C1458960o4M.LIZIZ = -1;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getLifecycle().addObserver(MR());
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        InterfaceC1206570hVH interfaceC1206570hVH;
        ProfileListFragment profileListFragment;
        if (i >= 0 && i < MR().getCount()) {
            FavoritesPagerAdapterOtherProfile favoritesPagerAdapterOtherProfileMR = MR();
            int i2 = this.LLILZIL;
            ((AbstractC2369409Qe) ListProtector.get(favoritesPagerAdapterOtherProfileMR.LLJ, i)).LIZJ(true);
            ((AbstractC2369409Qe) ListProtector.get(favoritesPagerAdapterOtherProfileMR.LLJ, i2)).LIZJ(false);
            favoritesPagerAdapterOtherProfileMR.LJJIZ(i);
            if (i >= 1 && i < ((ArrayList) favoritesPagerAdapterOtherProfileMR.LLJ).size()) {
                Object obj = ListProtector.get(favoritesPagerAdapterOtherProfileMR.LJJIJLIJ(), i);
                if ((obj instanceof ProfileListFragment) && (profileListFragment = (ProfileListFragment) obj) != null && profileListFragment.LJLLL()) {
                    profileListFragment.Ii(false);
                }
                Object obj2 = ListProtector.get(favoritesPagerAdapterOtherProfileMR.LJJIJLIJ(), i);
                if ((obj2 instanceof InterfaceC1206570hVH) && (interfaceC1206570hVH = (InterfaceC1206570hVH) obj2) != null) {
                    interfaceC1206570hVH.onPageSelected();
                }
            }
            this.LLILZIL = i;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/favorites/business/FavoritesFragmentOtherProfile", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOypdZDc1SYJh7FSwtQaJ5OuoLlTH5ozTLPhUZy6C3cDbaMAZV0VO0xKNo9QuiyQqA==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        if (z) {
            C1206450hV5.LIZ = this.LL;
        }
        super.setUserVisibleHint(z);
        if (getHost() != null) {
            for (AbstractC2369409Qe abstractC2369409Qe : (ArrayList) MR().LLJ) {
                if (!z) {
                    abstractC2369409Qe.LIZJ(false);
                }
                abstractC2369409Qe.getClass();
            }
        }
        if (getHost() != null && z && MR().getCount() > 0) {
            LifecycleOwnerExtensionsKt.LIZ(this, new ARunnableS118S0100000_18(this, 10));
        }
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(FavoritesFragmentOtherProfile.class);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        super.onViewCreated(view, bundle);
        C786410Ut5.LJLLLLLL(8, view.findViewById(R.id.y08));
        C19Y3 c19y3 = (C19Y3) view.findViewById(R.id.wya);
        this.LLILLJJLI = c19y3;
        if (c19y3 == null) {
            c19y3 = null;
        }
        C786410Ut5.LLLLIL(c19y3, 8);
        C21594419fC c21594419fC = (C21594419fC) view.findViewById(R.id.viewpager);
        this.LLILLL = c21594419fC;
        if (c21594419fC == null) {
            c21594419fC = null;
        }
        c21594419fC.setBackground(null);
        C19Y3 c19y32 = this.LLILLJJLI;
        if (c19y32 == null) {
            c19y32 = null;
        }
        c19y32.setBackground(null);
        InterfaceC1206270hUn.LIZ.getClass();
        InterfaceC1206270hUn interfaceC1206270hUnLIZ = C1206280hUo.LIZ();
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("ownerUid")) != null) {
            this.LLIZ = (C11JF) interfaceC1206270hUnLIZ.LIZIZ(string).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIJIIJIL(new AfS154S0200000_18(view, this, 1)).LJJLL(new C09JN() { // from class: X.0hVB
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("FavoritesFragmentOtherProfile@6f30.onViewCreated$2");
                    C1C7U.LIZIZ("FavoritesFragmentOtherProfile@6f30.onViewCreated$2");
                }
            }, new C09JN() { // from class: X.0hVC
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("FavoritesFragmentOtherProfile@6f30.onViewCreated$3");
                    C1C7U.LIZIZ("FavoritesFragmentOtherProfile@6f30.onViewCreated$3");
                }
            });
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c6d, viewGroup, false);
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
