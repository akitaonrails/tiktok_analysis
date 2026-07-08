package com.ss.android.ugc.aweme.compliance.agegate.coarsetonarrow;

import X.AbstractC480470Isn;
import X.C01GW;
import X.C098200Yq;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C452501pT;
import X.C527640Kmg;
import X.C786410Ut5;
import Y.AObserverS188S0200000_28;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.compliance.agegate.coarsetonarrow.AgeGateConfirmationFragment;
import com.ss.android.ugc.aweme.compliance.agegate.coarsetonarrow.AgeGateDateFragment;
import com.ss.android.ugc.aweme.compliance.agegate.coarsetonarrow.AgeGateMonthFragment;
import com.ss.android.ugc.aweme.compliance.agegate.coarsetonarrow.AgeGateRangeFragment;
import com.ss.android.ugc.aweme.compliance.agegate.coarsetonarrow.AgeGateYearFragment;
import com.ss.android.ugc.aweme.compliance.agegate.view.AgeGateBaseLowerFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class AgeGateExistingStartFragment extends AgeGateBaseLowerFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD8/ISQiKip9KSIpLi4nLWHELIOSsvJi4hOyA4JiEyOjcjPmESLyALKDs2DT0lOjs6JiIfPS4hPAM+KCg+LSs4";
    public C527640Kmg LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 126));

    @Override // com.ss.android.ugc.aweme.compliance.agegate.view.AgeGateBaseLowerFragment
    public final MutableLiveData MR() {
        return ((AgeGateCTNViewModel) this.LLILLJJLI.getValue()).LLILLL;
    }

    public final C527640Kmg WR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.viewPager) : null;
            this.LL = (C527640Kmg) viewFindViewById;
        }
        return (C527640Kmg) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.compliance.agegate.view.AgeGateBaseLowerFragment
    public final MutableLiveData<Unit> bJ() {
        return new MutableLiveData<>();
    }

    @Override // com.ss.android.ugc.aweme.compliance.agegate.view.AgeGateBaseLowerFragment
    public final LiveData<Boolean> iz() {
        return ((AgeGateCTNViewModel) this.LLILLJJLI.getValue()).LLILZ;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
    }

    @Override // com.ss.android.ugc.aweme.compliance.agegate.view.AgeGateBaseLowerFragment
    public final void VR(String str, boolean z) {
        ((AgeGateCTNViewModel) this.LLILLJJLI.getValue()).LL.postValue(str);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        final FragmentManager fragmentManagerRequireFragmentManager = requireFragmentManager();
        AbstractC480470Isn abstractC480470Isn = new AbstractC480470Isn(fragmentManagerRequireFragmentManager) { // from class: X.1A4K
            public final BaseFragment[] LLIZ;

            @Override // androidx.viewpager.widget.PagerAdapter
            public final int LJIJJ(Object obj) {
                return -2;
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public final int getCount() {
                return this.LLIZ.length;
            }

            {
                String str = AgeGateRangeFragment._pnsPageId;
                String str2 = AgeGateYearFragment._pnsPageId;
                String str3 = AgeGateMonthFragment._pnsPageId;
                String str4 = AgeGateDateFragment._pnsPageId;
                String str5 = AgeGateConfirmationFragment._pnsPageId;
                this.LLIZ = new BaseFragment[]{new AgeGateRangeFragment(), new AgeGateYearFragment(), new AgeGateMonthFragment(), new AgeGateDateFragment(), new AgeGateConfirmationFragment()};
            }

            @Override // X.AbstractC480470Isn
            public final Fragment LJJIJIL(int i) {
                return this.LLIZ[i];
            }
        };
        WR().setAdapter(abstractC480470Isn);
        WR().setOnTouchListener(new View.OnTouchListener() { // from class: X.10ek
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return true;
            }
        });
        ((AgeGateCTNViewModel) this.LLILLJJLI.getValue()).LLILLJJLI.observe(this, new AObserverS188S0200000_28((Object) abstractC480470Isn, (View) this, (ViewPagerBottomSheetBehavior<View>) 3));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dxd, viewGroup, false);
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
