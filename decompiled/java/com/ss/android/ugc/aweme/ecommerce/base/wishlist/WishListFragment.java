package com.ss.android.ugc.aweme.ecommerce.base.wishlist;

import X.C098200Yq;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1018703yb;
import X.C1077550e9B;
import X.C123100dR;
import X.C13BV;
import X.C1537900q7g;
import X.C1541950qED;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20533215Wg;
import X.C2097608Jq;
import X.C2187451AjH;
import X.C2200821BBo;
import X.C616540OGe;
import X.C786410Ut5;
import X.InterfaceC1206390hUz;
import X.InterfaceC1258040iqI;
import X.InterfaceC1541990qEH;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.core.ab.ECWishListSchemaConfig;
import com.ss.android.ugc.aweme.ecommerce.core.services.ECommerceService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes17.dex */
public final class WishListFragment extends ECBaseFragment implements InterfaceC1258040iqI, InterfaceC1206390hUz {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvHELIOSLGExKTYpZzg6Oy0gIDwnZhIlOicfITY4Dz0yLygpJzs=";
    public FrameLayout LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public String LLJ = "";
    public long LLJI;
    public boolean LLJIJIL;
    public View LLJILJIL;

    @Override // X.InterfaceC1206390hUz
    public final void LLLILZLLLI() throws Throwable {
        setUserVisibleHint(false);
    }

    @Override // X.InterfaceC1206390hUz
    public final void V6() {
    }

    @Override // X.InterfaceC1258040iqI
    public final View LJJLIIIJILLIZJL() {
        View viewVR = this.LLJILJIL;
        if (viewVR == null) {
            View viewFindViewById = this.LLILLL;
            if (viewFindViewById == null) {
                View view = getView();
                viewFindViewById = view != null ? view.findViewById(R.id.wishlist_content_container) : null;
                this.LLILLL = (FrameLayout) viewFindViewById;
            }
            viewVR = VR(viewFindViewById);
            if (viewVR == null) {
                if (getContext() == null) {
                    return null;
                }
                ScrollView scrollView = new ScrollView(getContext());
                this.LLJILJIL = scrollView;
                return scrollView;
            }
            this.LLJILJIL = viewVR;
        }
        return viewVR;
    }

    public final void WR() {
        InterfaceC1541990qEH kitView;
        C1018703yb.LIZIZ("ads_wishlist_tab_enter", C2097608Jq.LJ());
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILZLL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB == null || (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) == null) {
            return;
        }
        kitView.X0("favoritePageShow", C13BV.INSTANCE);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LLIZLLLIL = false;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLILLL = null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (getUserVisibleHint()) {
            C1018703yb.LIZIZ("ads_wishlist_tab_exit", C2097608Jq.LJ());
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(WishListFragment.class.getName());
        }
        super.onResume();
        if (getUserVisibleHint() && this.LLIZLLLIL) {
            WR();
        }
        if (this.LLIZLLLIL) {
            return;
        }
        this.LLIZLLLIL = true;
    }

    public final View VR(View view) {
        if ((view instanceof RecyclerView) || (view instanceof ScrollView)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View viewVR = VR(viewGroup.getChildAt(i));
                if (viewVR != null) {
                    return viewVR;
                }
            }
            return null;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ECommerceService.WishListFragmentData wishListFragmentData;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (wishListFragmentData = (ECommerceService.WishListFragmentData) arguments.getParcelable("power_viewpager_default_key")) != null) {
            this.LLILZ = wishListFragmentData.location;
            this.LLILZIL = wishListFragmentData.previousPage;
        }
    }

    @Override // X.InterfaceC1206390hUz
    public final void onPageSelected(int i) throws Throwable {
        setUserVisibleHint(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/ecommerce/base/wishlist/WishListFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5LQRkPsw1Lo2RonX3WCZK8tJ9tuAdsu40zg=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        if (z) {
            this.LLIZ = true;
            WR();
        } else if (this.LLIZ) {
            C1018703yb.LIZIZ("ads_wishlist_tab_exit", C2097608Jq.LJ());
        }
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(WishListFragment.class);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        super.onViewCreated(view, bundle);
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            ECWishListSchemaConfig.RomaSchemaGroupFavoritePageModel romaSchemaGroupFavoritePageModel = ECWishListSchemaConfig.LIZ;
            ECWishListSchemaConfig.RomaSchemaGroupFavoritePageModel romaSchemaGroupFavoritePageModel2 = (ECWishListSchemaConfig.RomaSchemaGroupFavoritePageModel) settingsManagerLIZLLL.LJIIIIZZ("roma_schema_group_favorite_page", ECWishListSchemaConfig.RomaSchemaGroupFavoritePageModel.class, romaSchemaGroupFavoritePageModel);
            if (romaSchemaGroupFavoritePageModel2 != null) {
                romaSchemaGroupFavoritePageModel = romaSchemaGroupFavoritePageModel2;
            }
            Uri.Builder builderBuildUpon = UriProtector.parse(romaSchemaGroupFavoritePageModel.romaSchemaPageFavoriteProduct).buildUpon();
            if (C123100dR.LIZ(this.LLILZ)) {
                builderBuildUpon.appendQueryParameter("page_location", this.LLILZ);
            }
            if (C123100dR.LIZ(this.LLILZIL)) {
                builderBuildUpon.appendQueryParameter("previous_page", this.LLILZIL);
            }
            string = builderBuildUpon.build().toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            SettingsManager settingsManagerLIZLLL2 = SettingsManager.LIZLLL();
            ECWishListSchemaConfig.RomaSchemaGroupFavoritePageModel romaSchemaGroupFavoritePageModel3 = ECWishListSchemaConfig.LIZ;
            ECWishListSchemaConfig.RomaSchemaGroupFavoritePageModel romaSchemaGroupFavoritePageModel4 = (ECWishListSchemaConfig.RomaSchemaGroupFavoritePageModel) settingsManagerLIZLLL2.LJIIIIZZ("roma_schema_group_favorite_page", ECWishListSchemaConfig.RomaSchemaGroupFavoritePageModel.class, romaSchemaGroupFavoritePageModel3);
            if (romaSchemaGroupFavoritePageModel4 != null) {
                romaSchemaGroupFavoritePageModel3 = romaSchemaGroupFavoritePageModel4;
            }
            string = romaSchemaGroupFavoritePageModel3.romaSchemaPageFavoriteProduct;
        }
        this.LLJ = string;
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        Context context = view.getContext();
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(this.LLJ);
        sparkContext.LJJJJZI(new C1077550e9B(this, 4));
        c1537900q7g.getClass();
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = new C1541950qED(context, sparkContext).LIZ(false);
        this.LLILZLL = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ;
        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.LJIIIIZZ();
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.wishlist_content_container);
            } else {
                viewFindViewById = null;
            }
            this.LLILLL = (FrameLayout) viewFindViewById;
        }
        ((ViewGroup) viewFindViewById).addView(this.LLILZLL, new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.amu, viewGroup, false);
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
