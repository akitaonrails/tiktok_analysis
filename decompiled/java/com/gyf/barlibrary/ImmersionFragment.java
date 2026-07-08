package com.gyf.barlibrary;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C20533215Wg;
import X.C2200821BBo;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes30.dex */
public abstract class ImmersionFragment extends Fragment implements ImmersionOwner {
    public ImmersionProxy mImmersionProxy = new ImmersionProxy(this);

    @Override // com.gyf.barlibrary.ImmersionOwner
    public boolean immersionBarEnabled() {
        return true;
    }

    @Override // com.gyf.barlibrary.ImmersionOwner
    public void onInvisible() {
    }

    @Override // com.gyf.barlibrary.ImmersionOwner
    public void onLazyAfterView() {
    }

    @Override // com.gyf.barlibrary.ImmersionOwner
    public void onLazyBeforeView() {
    }

    @Override // com.gyf.barlibrary.ImmersionOwner
    public void onVisible() {
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/gyf/barlibrary/ImmersionFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgUjWYTeVEUtTBCWZ3wqfypqzMyPjXNyfDfEHyuha+xi", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        com_gyf_barlibrary_ImmersionFragment_com_bytedance_otis_milo_lancet_MiloFragmentLancet_onFragmentUserVisibleHint(this, z);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.mImmersionProxy.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.mImmersionProxy.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.mImmersionProxy.onResume();
    }

    public void com_gyf_barlibrary_ImmersionFragment__setUserVisibleHint$___twin___(boolean z) throws Throwable {
        super.setUserVisibleHint(z);
        this.mImmersionProxy.setUserVisibleHint(z);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.mImmersionProxy.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.mImmersionProxy.onConfigurationChanged(configuration);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mImmersionProxy.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/gyf/barlibrary/ImmersionFragment", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgUjWYTeVEUtTBCWZ3wqfypqzMyPjXNyfDfEHyuha+xi", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.onHiddenChanged(z);
        this.mImmersionProxy.onHiddenChanged(z);
    }

    public static void com_gyf_barlibrary_ImmersionFragment_com_bytedance_otis_milo_lancet_MiloFragmentLancet_onFragmentUserVisibleHint(ImmersionFragment immersionFragment, boolean z) throws Throwable {
        immersionFragment.com_gyf_barlibrary_ImmersionFragment__setUserVisibleHint$___twin___(z);
        C2200821BBo.LIZ.getClass();
        if (C2200821BBo.LIZ() || !C2200821BBo.LJI || !z) {
            return;
        }
        C20533215Wg.LIZ(immersionFragment.getClass());
    }
}
