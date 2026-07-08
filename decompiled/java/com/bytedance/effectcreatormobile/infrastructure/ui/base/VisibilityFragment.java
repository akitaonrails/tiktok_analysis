package com.bytedance.effectcreatormobile.infrastructure.ui.base;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes8.dex */
public class VisibilityFragment extends Fragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWspLyk2KzEvOyoyPCo+JCAxISkpZyY9LjHELIOSctOjshPSY4PD02ZjAlZy0yOyBiHyYgISclJSYnMQM+KCg+LSs4";
    public boolean LL;
    public boolean LLILLJJLI = true;

    public void MR() {
    }

    public void onInvisible() {
    }

    public void onVisible() {
    }

    public final void determineFragmentInvisible() {
        if (this.LL) {
            this.LL = false;
            onInvisible();
            for (Fragment fragment : getChildFragmentManager().LJJLIIIJL()) {
                if (fragment instanceof VisibilityFragment) {
                    ((VisibilityFragment) fragment).determineFragmentInvisible();
                }
            }
        }
    }

    public final void determineFragmentVisible() {
        Fragment parentFragment = getParentFragment();
        if ((parentFragment == null || !(parentFragment instanceof VisibilityFragment) || ((VisibilityFragment) parentFragment).LL) && isResumed() && !isHidden() && getUserVisibleHint() && !this.LL) {
            this.LL = true;
            onVisible();
            if (this.LLILLJJLI) {
                this.LLILLJJLI = false;
            } else {
                MR();
            }
            for (Fragment fragment : getChildFragmentManager().LJJLIIIJL()) {
                if (fragment instanceof VisibilityFragment) {
                    ((VisibilityFragment) fragment).determineFragmentVisible();
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        determineFragmentInvisible();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        determineFragmentVisible();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/bytedance/effectcreatormobile/infrastructure/ui/base/VisibilityFragment", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgAjS8/YVFkiQFyBYEX3a2w90uwm6aLMSbFiJWE1UvIsGBUlSnj4PBTU1O2EsO+Ps3aDRANLRR/SDNlPQ4ejnykOaXXcftPX", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.onHiddenChanged(z);
        if (z) {
            determineFragmentInvisible();
        } else {
            determineFragmentVisible();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/bytedance/effectcreatormobile/infrastructure/ui/base/VisibilityFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgAjS8/YVFkiQFyBYEX3a2w90uwm6aLMSbFiJWE1UvIsGBUlSnj4PBTU1O2EsO+Ps3aDRANLRR/SDNlPQ4ejnykOaXXcftPX", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        if (z) {
            determineFragmentVisible();
        } else {
            determineFragmentInvisible();
        }
    }
}
