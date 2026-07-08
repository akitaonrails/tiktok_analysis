package com.ss.android.ugc.aweme.ecommercelive.audience.common.preload;

import X.C098200Yq;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C786410Ut5;
import X.InterfaceC1541990qEH;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes27.dex */
public final class ShopBagListSparkFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLCM6PiBiKDo3ISHELIOSAiKip9KyohJCA9ZjU+LCM8KSFiGic8OActLgM6OzEfOS4hIwM+KCg+LSs4";
    public SparkFragment sparkFragment;

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com_ss_android_ugc_aweme_ecommercelive_audience_common_preload_ShopBagListSparkFragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyOnCreateView(this, layoutInflater, viewGroup, bundle);
    }

    public final InterfaceC1541990qEH getKitView() {
        SparkFragment sparkFragment = this.sparkFragment;
        if (sparkFragment != null) {
            return sparkFragment.getKitView();
        }
        return null;
    }

    public final void onFragmentHide() {
        SparkFragment sparkFragment = this.sparkFragment;
        if (sparkFragment != null) {
            sparkFragment.onFragmentHide();
        }
    }

    public final void onFragmentShow() {
        SparkFragment sparkFragment = this.sparkFragment;
        if (sparkFragment != null) {
            sparkFragment.onFragmentShow();
        }
    }

    public final void release() {
        SparkFragment sparkFragment = this.sparkFragment;
        if (sparkFragment != null) {
            String str = SparkFragment._pnsPageId;
            sparkFragment.WR(true);
        }
    }

    public final SparkFragment getSparkFragment() {
        return this.sparkFragment;
    }

    public final void setSparkFragment(SparkFragment sparkFragment) {
        this.sparkFragment = sparkFragment;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        SparkFragment sparkFragment = this.sparkFragment;
        if (sparkFragment != null) {
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LIZJ(R.id.gmw, sparkFragment, "shop_bag_spark_wrapper");
            c19ehLJIIJ.LJIIL();
        }
    }

    public View com_ss_android_ugc_aweme_ecommercelive_audience_common_preload_ShopBagListSparkFragment__onCreateView$___twin___(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.bwg, viewGroup, false);
    }

    public static View com_ss_android_ugc_aweme_ecommercelive_audience_common_preload_ShopBagListSparkFragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyOnCreateView(ShopBagListSparkFragment shopBagListSparkFragment, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewCom_ss_android_ugc_aweme_ecommercelive_audience_common_preload_ShopBagListSparkFragment__onCreateView$___twin___ = shopBagListSparkFragment.com_ss_android_ugc_aweme_ecommercelive_audience_common_preload_ShopBagListSparkFragment__onCreateView$___twin___(layoutInflater, viewGroup, bundle);
        C19GS c19gs = null;
        if (!(viewCom_ss_android_ugc_aweme_ecommercelive_audience_common_preload_ShopBagListSparkFragment__onCreateView$___twin___ instanceof View)) {
            viewCom_ss_android_ugc_aweme_ecommercelive_audience_common_preload_ShopBagListSparkFragment__onCreateView$___twin___ = null;
        }
        if (viewCom_ss_android_ugc_aweme_ecommercelive_audience_common_preload_ShopBagListSparkFragment__onCreateView$___twin___ != null) {
            try {
                ViewTreeLifecycleOwner.set(viewCom_ss_android_ugc_aweme_ecommercelive_audience_common_preload_ShopBagListSparkFragment__onCreateView$___twin___, shopBagListSparkFragment.getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewCom_ss_android_ugc_aweme_ecommercelive_audience_common_preload_ShopBagListSparkFragment__onCreateView$___twin___, shopBagListSparkFragment);
                viewCom_ss_android_ugc_aweme_ecommercelive_audience_common_preload_ShopBagListSparkFragment__onCreateView$___twin___.setTag(R.id.view_tree_saved_state_registry_owner, shopBagListSparkFragment);
                C19EG activity = shopBagListSparkFragment.getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewCom_ss_android_ugc_aweme_ecommercelive_audience_common_preload_ShopBagListSparkFragment__onCreateView$___twin___;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewCom_ss_android_ugc_aweme_ecommercelive_audience_common_preload_ShopBagListSparkFragment__onCreateView$___twin___;
    }
}
