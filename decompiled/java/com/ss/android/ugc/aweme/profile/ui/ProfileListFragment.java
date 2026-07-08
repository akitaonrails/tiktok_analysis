package com.ss.android.ugc.aweme.profile.ui;

import X.C098200Yq;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1258440iqw;
import X.C1258980iro;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2187451AjH;
import X.C616540OGe;
import X.C786410Ut5;
import X.EnumC1252760ihm;
import X.EnumC1258430iqv;
import X.EnumC1258450iqx;
import X.InterfaceC1206550hVF;
import X.InterfaceC1258040iqI;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes20.dex */
public abstract class ProfileListFragment extends AmeBaseFragment implements InterfaceC1206550hVF, InterfaceC1258040iqI {
    public boolean LL;
    public String LLILLJJLI;
    public String LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;

    public abstract void Bp();

    public void HP(boolean z) {
    }

    public void MR(int i) {
    }

    public void P5(int i, float f, int i2) {
    }

    public View SR(EnumC1258430iqv enumC1258430iqv) {
        return null;
    }

    public void Sl(boolean z) {
    }

    public int UR() {
        return -2;
    }

    public View VR(EnumC1258430iqv enumC1258430iqv) {
        return null;
    }

    public View WR() {
        return null;
    }

    public void Wb(boolean z) {
    }

    public View ZR(EnumC1258430iqv enumC1258430iqv) {
        return null;
    }

    public View aS(EnumC1258430iqv enumC1258430iqv) {
        return null;
    }

    public void b(boolean z) {
    }

    public void bS(EnumC1258430iqv enumC1258430iqv, EnumC1258450iqx enumC1258450iqx) {
    }

    public abstract void cS(boolean z);

    public void gS(int i) {
    }

    public void hS(int i) {
    }

    public void iS(EnumC1252760ihm enumC1252760ihm) {
    }

    public abstract boolean isEmpty();

    public void mz() {
    }

    public void nS(String str, String str2) {
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return RR(this, layoutInflater, viewGroup, bundle);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        PR(this);
    }

    public void rS(List<Long> list, boolean z, User user) {
    }

    public void ro(boolean z) {
    }

    public void uS(boolean z) {
    }

    public void vs(boolean z) {
    }

    public void OR() {
        super.onResume();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
    }

    public static void PR(ProfileListFragment profileListFragment) {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(profileListFragment.getActivity())) {
            C2187451AjH.LJJIJIIJI(profileListFragment.getClass().getName());
        }
        profileListFragment.OR();
    }

    public void An(String str) {
        this.LLILLJJLI = str;
    }

    public void dS(boolean z) {
        this.LLILZIL = z;
    }

    public void kS(boolean z) {
        this.LLILZ = z;
    }

    public void mS(boolean z) {
        this.LL = z;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/ss/android/ugc/aweme/profile/ui/ProfileListFragment", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPq6bJnH0DffLkPw8ENenh7r5ILJeDmitPGixQV6QA==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.onHiddenChanged(z);
    }

    public void setPreviousPage(String str) {
        this.LLILLL = str;
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/profile/ui/ProfileListFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPq6bJnH0DffLkPw8ENenh7r5ILJeDmitPGixQV6QA==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
    }

    private void sS(View view, int i) {
        if (view != null) {
            C786410Ut5.LJLLLLLL(i, view);
        }
    }

    public boolean oS(EnumC1258430iqv enumC1258430iqv, EnumC1258450iqx enumC1258450iqx) {
        return qS(enumC1258430iqv, enumC1258450iqx, null);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    public View NR(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public boolean qS(EnumC1258430iqv enumC1258430iqv, EnumC1258450iqx enumC1258450iqx, C1258980iro c1258980iro) {
        int i = C1258440iqw.LIZ[enumC1258450iqx.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i == 5) {
                        sS(ZR(enumC1258430iqv), 8);
                        sS(VR(enumC1258430iqv), 8);
                        sS(aS(enumC1258430iqv), 8);
                        sS(SR(enumC1258430iqv), 0);
                    }
                } else {
                    sS(ZR(enumC1258430iqv), 8);
                    sS(SR(enumC1258430iqv), 8);
                    sS(aS(enumC1258430iqv), 8);
                    sS(VR(enumC1258430iqv), 0);
                }
            } else {
                sS(ZR(enumC1258430iqv), 8);
                sS(SR(enumC1258430iqv), 8);
                sS(VR(enumC1258430iqv), 8);
                sS(aS(enumC1258430iqv), 0);
            }
        } else {
            sS(SR(enumC1258430iqv), 8);
            sS(VR(enumC1258430iqv), 8);
            sS(aS(enumC1258430iqv), 8);
            sS(ZR(enumC1258430iqv), 0);
        }
        bS(enumC1258430iqv, enumC1258450iqx);
        return true;
    }

    public static View RR(ProfileListFragment profileListFragment, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewNR = profileListFragment.NR(layoutInflater, viewGroup, bundle);
        C19GS c19gs = null;
        if (!(viewNR instanceof View)) {
            viewNR = null;
        }
        if (viewNR != null) {
            try {
                ViewTreeLifecycleOwner.set(viewNR, profileListFragment.getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewNR, profileListFragment);
                viewNR.setTag(R.id.view_tree_saved_state_registry_owner, profileListFragment);
                C19EG activity = profileListFragment.getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewNR;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewNR;
    }
}
