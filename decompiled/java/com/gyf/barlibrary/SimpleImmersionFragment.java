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

/* JADX INFO: loaded from: classes8.dex */
public abstract class SimpleImmersionFragment extends Fragment implements SimpleImmersionOwner {
    public SimpleImmersionProxy mSimpleImmersionProxy = new SimpleImmersionProxy(this);

    @Override // com.gyf.barlibrary.SimpleImmersionOwner
    public boolean immersionBarEnabled() {
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/gyf/barlibrary/SimpleImmersionFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgUjWYTeVEUtTBCWZ3wqfzBuzNmRm1NwfxTEDSWpFVUsbSuBxM9t", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        com_gyf_barlibrary_SimpleImmersionFragment_com_bytedance_otis_milo_lancet_MiloFragmentLancet_onFragmentUserVisibleHint(this, z);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.mSimpleImmersionProxy.onDestroy();
    }

    public void com_gyf_barlibrary_SimpleImmersionFragment__setUserVisibleHint$___twin___(boolean z) throws Throwable {
        super.setUserVisibleHint(z);
        this.mSimpleImmersionProxy.setUserVisibleHint(z);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.mSimpleImmersionProxy.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.mSimpleImmersionProxy.onConfigurationChanged(configuration);
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/gyf/barlibrary/SimpleImmersionFragment", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgUjWYTeVEUtTBCWZ3wqfzBuzNmRm1NwfxTEDSWpFVUsbSuBxM9t", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.onHiddenChanged(z);
        this.mSimpleImmersionProxy.onHiddenChanged(z);
    }

    public static void com_gyf_barlibrary_SimpleImmersionFragment_com_bytedance_otis_milo_lancet_MiloFragmentLancet_onFragmentUserVisibleHint(SimpleImmersionFragment simpleImmersionFragment, boolean z) throws Throwable {
        simpleImmersionFragment.com_gyf_barlibrary_SimpleImmersionFragment__setUserVisibleHint$___twin___(z);
        C2200821BBo.LIZ.getClass();
        if (C2200821BBo.LIZ() || !C2200821BBo.LJI || !z) {
            return;
        }
        C20533215Wg.LIZ(simpleImmersionFragment.getClass());
    }
}
