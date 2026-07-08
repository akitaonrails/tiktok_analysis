package com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.ui;

import X.C01GW;
import X.C098200Yq;
import X.C0HE8;
import X.C0HZQ;
import X.C0KCC;
import X.C0KCJ;
import X.C0KDH;
import X.C0KDI;
import X.C0KQD;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C452501pT;
import X.C786410Ut5;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.viewmodel.UpDowngradePackageViewModel;
import com.ss.android.ugc.aweme.subscription.pgc.commonui.fragment.PgcBaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class SubUpdowngradePackageFragment extends PgcBaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY5KzwwOiw8PSY8Jms8Lix9KjA/ICE2OzZiLyAmHELIOSJiEtPSY8Jms8KCw4KSIpOS40LWs5IGEAPScZOSs8PysrOy43LRUtKiQyLyAKOy40JSAiPQ==";
    public UpDowngradePackageViewModel LLILLL;
    public Map<String, String> LLILZLL;
    public boolean LLIZ;
    public C197039127h LLIZLLLIL;
    public C0HZQ LLJ;
    public TuxTextView LLJI;
    public ViewGroup LLJIJIL;
    public ImageView LLJILJIL;
    public ImageView LLJILJILJ;
    public ViewGroup LLJILLL;
    public TextView LLJJ;
    public TextView LLJJI;
    public TextView LLJJIII;
    public TextView LLJJIJI;
    public TextView LLJJIJIIJIL;
    public ViewGroup LLJJIJIL;
    public TextView LLJJJ;
    public TextView LLJJJIL;
    public TextView LLJJJJ;
    public TextView LLJJJJJIL;
    public TextView LLJJJJLIIL;
    public ObjectAnimator LLJJL;
    public C0KDI LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public List<? extends C0KQD> LLJLILLLLZIIL;
    public Function0<Unit> LLILLJJLI = AFwS193S0000000_7.get$arr$(175);
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(176));
    public C0KCC LLILZIL = new C0KCC(null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, 0, null, null, null, null, null, null, false, 0, null, 0, 0, false, -1, 15);

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.fragment.PgcBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ObjectAnimator objectAnimator = this.LLJJL;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            objectAnimator.removeAllListeners();
        }
        ((Handler) this.LLILZ.getValue()).removeCallbacksAndMessages(null);
        this.LLJLIL = true;
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.fragment.PgcBaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.fragment.PgcBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
    }

    public final C0KDH MR(String str) {
        UpDowngradePackageViewModel upDowngradePackageViewModel;
        MediatorLiveData<C0KCJ> mediatorLiveData;
        C0KCJ value;
        Map<String, C0KDH> map;
        if (str == null || (upDowngradePackageViewModel = this.LLILLL) == null || (mediatorLiveData = upDowngradePackageViewModel.LLILZLL) == null || (value = mediatorLiveData.getValue()) == null || (map = value.LIZLLL) == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.fragment.PgcBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02e2  */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, kotlin.jvm.internal.AwS408S0200000_7] */
    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.fragment.PgcBaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r13, android.os.Bundle r14) {
        /*
            Method dump skipped, instruction units count: 786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.ui.SubUpdowngradePackageFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater.cloneInContext(C0HE8.LIZ(requireActivity())), R.layout.ffc, viewGroup, false);
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
