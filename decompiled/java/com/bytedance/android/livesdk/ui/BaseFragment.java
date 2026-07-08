package com.bytedance.android.livesdk.ui;

import X.C0IJ7;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C11NJ;
import X.InterfaceC420801kM;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* JADX INFO: loaded from: classes8.dex */
public class BaseFragment extends LiveThemeAwareFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyHELIOSM6PiA/LSR9PSxiCy4gLQM+KCg+LSs4";
    public final C11NJ compositeDisposable = new C11NJ();
    public boolean mStatusActive;
    public boolean mStatusDestroyed;
    public boolean mStatusViewValid;

    public void onVisible() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.mStatusViewValid = false;
        this.mStatusDestroyed = true;
        this.compositeDisposable.LJ();
        DataChannelGlobal.LLILZ.zQ2(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.mStatusViewValid = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.mStatusActive = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (getUserVisibleHint()) {
            onVisible();
        }
        this.mStatusActive = true;
    }

    public boolean isViewValid() {
        return this.mStatusViewValid;
    }

    public final void MR(InterfaceC420801kM interfaceC420801kM) {
        this.compositeDisposable.LIZ(interfaceC420801kM);
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mStatusActive = false;
        this.mStatusViewValid = false;
        this.mStatusDestroyed = false;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        if (C0IJ7.LIZLLL(getContext())) {
            LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
            getContext();
            return layoutInflaterOnGetLayoutInflater;
        }
        return super.onGetLayoutInflater(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        Object obj;
        boolean z2 = true;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/bytedance/android/livesdk/ui/BaseFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl/iMX7iHQ8HP62SfKmaoP", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        if (z == getUserVisibleHint()) {
            z2 = false;
        }
        super.setUserVisibleHint(z);
        if (isResumed() && z2 && getUserVisibleHint()) {
            onVisible();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mStatusViewValid = true;
    }
}
