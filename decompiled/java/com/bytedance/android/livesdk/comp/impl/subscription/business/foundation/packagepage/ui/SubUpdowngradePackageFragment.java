package com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.ui;

import X.C01GW;
import X.C098200Yq;
import X.C0HZQ;
import X.C0KCF;
import X.C0KEK;
import X.C0KFB;
import X.C0KGO;
import X.C1361400lX0;
import X.C1685300txQ;
import X.C16F5;
import X.C1834150xpV;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C452501pT;
import X.C514390KFh;
import X.C514830KGz;
import X.C786410Ut5;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.viewmodel.UpDowngradePackageViewModel;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public final class SubUpdowngradePackageFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZzwmKjYvOyYjPCwjJ2ExPTYlJyHELIOSogO2sqJjo9LCQ4ICA9ZjUtKiQyLyA8KCg2ZjAlZxwmKhA8LSAkJiI+KCs2GCQvIi40LQM+KCg+LSs4";
    public UpDowngradePackageViewModel LLILLJJLI;
    public Map<String, String> LLILZIL;
    public boolean LLILZLL;
    public C197039127h LLIZ;
    public C0HZQ LLIZLLLIL;
    public C16F5 LLJ;
    public ViewGroup LLJI;
    public LiveIconView LLJIJIL;
    public LiveIconView LLJILJIL;
    public ViewGroup LLJILJILJ;
    public C16F5 LLJILLL;
    public C16F5 LLJJ;
    public C16F5 LLJJI;
    public C16F5 LLJJIII;
    public C16F5 LLJJIJI;
    public ViewGroup LLJJIJIIJIL;
    public C16F5 LLJJIJIL;
    public C16F5 LLJJJ;
    public C16F5 LLJJJIL;
    public C16F5 LLJJJJ;
    public C16F5 LLJJJJJIL;
    public ObjectAnimator LLJJJJLIIL;
    public C0KGO LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public Function0<Unit> LL = new C514390KFh();
    public final C01GW LLILLL = C452501pT.LIZIZ(new C0KEK());
    public C0KCF LLILZ = new C0KCF(null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, false, null, 0, null, null, null, null, null, 0, null, 0, 0, false, -1, 15);

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ObjectAnimator objectAnimator = this.LLJJJJLIIL;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            objectAnimator.removeAllListeners();
        }
        ((Handler) this.LLILLL.getValue()).removeCallbacksAndMessages(null);
        this.LLJL = true;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
    }

    public final C0KFB NR(String str) {
        UpDowngradePackageViewModel upDowngradePackageViewModel;
        MediatorLiveData<C514830KGz> mediatorLiveData;
        C514830KGz value;
        Map<String, C0KFB> map;
        if (str == null || (upDowngradePackageViewModel = this.LLILLJJLI) == null || (mediatorLiveData = upDowngradePackageViewModel.LLILZLL) == null || (value = mediatorLiveData.getValue()) == null || (map = value.LIZLLL) == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x02da  */
    /* JADX WARN: Type inference failed for: r0v60, types: [T, X.0KEE] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.0KCB] */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(final android.view.View r15, android.os.Bundle r16) {
        /*
            Method dump skipped, instruction units count: 787
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.ui.SubUpdowngradePackageFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (C1834150xpV.LJI(getContext())) {
            i = R.style.uy;
        } else {
            i = R.style.v0;
        }
        View viewTd = C786410Ut5.Td(layoutInflater.cloneInContext(new C1361400lX0(requireActivity(), i)), R.layout.gc0, viewGroup, false);
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
