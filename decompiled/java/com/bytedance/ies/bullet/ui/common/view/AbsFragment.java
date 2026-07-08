package com.bytedance.ies.bullet.ui.common.view;

import X.C1519760peQ;
import X.InterfaceC1369400lju;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes22.dex */
public abstract class AbsFragment extends Fragment {
    public final C1519760peQ<InterfaceC1369400lju> LL = new C1519760peQ<>();

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (this.LL.isEmpty()) {
            return;
        }
        for (InterfaceC1369400lju interfaceC1369400lju : this.LL) {
            if (interfaceC1369400lju != null) {
                interfaceC1369400lju.onDestroy();
            }
        }
        this.LL.LL.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (this.LL.isEmpty()) {
            return;
        }
        for (InterfaceC1369400lju interfaceC1369400lju : this.LL) {
            if (interfaceC1369400lju != null) {
                interfaceC1369400lju.onPause();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.LL.isEmpty()) {
            return;
        }
        for (InterfaceC1369400lju interfaceC1369400lju : this.LL) {
            if (interfaceC1369400lju != null) {
                interfaceC1369400lju.onResume();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (this.LL.isEmpty()) {
            return;
        }
        for (InterfaceC1369400lju interfaceC1369400lju : this.LL) {
            if (interfaceC1369400lju != null) {
                interfaceC1369400lju.onStop();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.putBoolean("WORKAROUND_FOR_BUG_19917_KEY", true);
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }
}
