package com.bytedance.effectcreatormobile.infrastructure.ui.widgets.bottomdrawerviewpager;

import X.C015R;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C128Y;
import X.InterfaceC472370Ifj;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes8.dex */
public class BottomDrawerFragment extends Fragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWspLyk2KzEvOyoyPCo+JCAxISkpZyY9LjctOjshPSY4PD02ZjAlHELIOSZzg6LCIpPTx9Kio4PSA+LDctPiohPiwpPj8yLyA+Zw08PDEjJAshKTIpOwkhKSIhLCEn";
    public C015R LL;

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/bytedance/effectcreatormobile/infrastructure/ui/widgets/bottomdrawerviewpager/BottomDrawerFragment", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgAjS8/YVFkiQFyBYEX3a2w90uwm6aLMSbFiJWE1UvIsGBUlSnj4PBTU1O2EsO+Ps2OLUwEAZwWPB9RSWyYx9JKS2/8fLAt0FMv4Nflql9+bKKa/IoWsRWltK5BwzZi7vP0z", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.onHiddenChanged(z);
        if (z) {
            onPause();
        } else {
            onResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        InterfaceC472370Ifj interfaceC472370Ifj;
        super.onViewCreated(view, bundle);
        C128Y parentFragment = getParentFragment();
        C015R c015rUb = null;
        if ((parentFragment instanceof InterfaceC472370Ifj) && (interfaceC472370Ifj = (InterfaceC472370Ifj) parentFragment) != null) {
            c015rUb = interfaceC472370Ifj.Ub();
        }
        this.LL = c015rUb;
    }
}
