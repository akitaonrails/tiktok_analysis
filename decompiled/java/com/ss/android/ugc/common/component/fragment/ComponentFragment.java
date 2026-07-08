package com.ss.android.ugc.common.component.fragment;

import X.C098200Yq;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2187451AjH;
import X.C616540OGe;
import X.InterfaceC1581960rGk;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes25.dex */
public abstract class ComponentFragment extends AbsFragment {
    public SparseArray<InterfaceC1581960rGk> mComponents = new SparseArray<>();

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com_ss_android_ugc_common_component_fragment_ComponentFragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyOnCreateView(this, layoutInflater, viewGroup, bundle);
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        for (int i = 0; i < this.mComponents.size(); i++) {
            this.mComponents.valueAt(i).onDestroy();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        for (int i = 0; i < this.mComponents.size(); i++) {
            this.mComponents.valueAt(i).onDetach();
        }
        SparseArray<InterfaceC1581960rGk> sparseArray = this.mComponents;
        if (sparseArray != null) {
            sparseArray.clear();
        }
        super.onDetach();
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        com_ss_android_ugc_common_component_fragment_ComponentFragment_com_ss_android_ugc_aweme_lancet_ComponentFragmentLancet_onResume(this);
    }

    public abstract SparseArray<InterfaceC1581960rGk> registerComponents();

    public void com_ss_android_ugc_common_component_fragment_ComponentFragment__onResume$___twin___() {
        super.onResume();
        for (int i = 0; i < this.mComponents.size(); i++) {
            this.mComponents.valueAt(i).onResume();
        }
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        for (int i = 0; i < this.mComponents.size(); i++) {
            this.mComponents.valueAt(i).onPause();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        for (int i = 0; i < this.mComponents.size(); i++) {
            this.mComponents.valueAt(i).onStart();
        }
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        for (int i = 0; i < this.mComponents.size(); i++) {
            this.mComponents.valueAt(i).onStop();
        }
    }

    public SparseArray<InterfaceC1581960rGk> getComponents() {
        return this.mComponents;
    }

    public static void com_ss_android_ugc_common_component_fragment_ComponentFragment_com_ss_android_ugc_aweme_lancet_ComponentFragmentLancet_onResume(ComponentFragment componentFragment) {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(componentFragment.getActivity())) {
            C2187451AjH.LJJIJIIJI(componentFragment.getClass().getName());
        }
        componentFragment.com_ss_android_ugc_common_component_fragment_ComponentFragment__onResume$___twin___();
    }

    /* JADX INFO: renamed from: getComponent, reason: merged with bridge method [inline-methods] */
    public InterfaceC1581960rGk m336getComponent(int i) {
        return this.mComponents.get(i);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        this.mComponents = registerComponents();
        for (int i = 0; i < this.mComponents.size(); i++) {
            this.mComponents.valueAt(i).onAttach(activity, this);
        }
        super.onAttach(activity);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        for (int i = 0; i < this.mComponents.size(); i++) {
            this.mComponents.valueAt(i).onConfigurationChanged(configuration);
        }
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        for (int i = 0; i < this.mComponents.size(); i++) {
            this.mComponents.valueAt(i).onCreate(bundle);
        }
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        for (int i = 0; i < this.mComponents.size(); i++) {
            this.mComponents.valueAt(i).onSaveInstanceState(bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        for (int i = 0; i < this.mComponents.size(); i++) {
            this.mComponents.valueAt(i).onViewStateRestored(bundle);
        }
    }

    public View com_ss_android_ugc_common_component_fragment_ComponentFragment__onCreateView$___twin___(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public static View com_ss_android_ugc_common_component_fragment_ComponentFragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyOnCreateView(ComponentFragment componentFragment, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewCom_ss_android_ugc_common_component_fragment_ComponentFragment__onCreateView$___twin___ = componentFragment.com_ss_android_ugc_common_component_fragment_ComponentFragment__onCreateView$___twin___(layoutInflater, viewGroup, bundle);
        C19GS c19gs = null;
        if (!(viewCom_ss_android_ugc_common_component_fragment_ComponentFragment__onCreateView$___twin___ instanceof View)) {
            viewCom_ss_android_ugc_common_component_fragment_ComponentFragment__onCreateView$___twin___ = null;
        }
        if (viewCom_ss_android_ugc_common_component_fragment_ComponentFragment__onCreateView$___twin___ != null) {
            try {
                ViewTreeLifecycleOwner.set(viewCom_ss_android_ugc_common_component_fragment_ComponentFragment__onCreateView$___twin___, componentFragment.getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewCom_ss_android_ugc_common_component_fragment_ComponentFragment__onCreateView$___twin___, componentFragment);
                viewCom_ss_android_ugc_common_component_fragment_ComponentFragment__onCreateView$___twin___.setTag(R.id.view_tree_saved_state_registry_owner, componentFragment);
                C19EG activity = componentFragment.getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewCom_ss_android_ugc_common_component_fragment_ComponentFragment__onCreateView$___twin___;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewCom_ss_android_ugc_common_component_fragment_ComponentFragment__onCreateView$___twin___;
    }
}
