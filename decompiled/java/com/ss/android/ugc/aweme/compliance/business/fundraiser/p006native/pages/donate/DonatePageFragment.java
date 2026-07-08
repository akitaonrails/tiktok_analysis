package com.ss.android.ugc.aweme.compliance.business.fundraiser.p006native.pages.donate;

import X.C01GW;
import X.C08J7;
import X.C098200Yq;
import X.C1257404w0;
import X.C1554300qY8;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C1BHX;
import X.C452501pT;
import X.C786410Ut5;
import Y.ACListenerS162S0100000_28;
import Y.AObserverS230S0100000_28;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.hybrid.spark.third.router.SparkThirdContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.compliance.business.fundraiser.p006native.FundraiserContainerViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class DonatePageFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD8/ISQiKip9KjA/ICE2OzZiLzo9HELIOSLDctIDw2OmsiKDs6PiBiOS40LTZiLSA9KTEpZws8JiQ4LB8yLyAKOy40JSAiPQ==";
    public C08J7 LL;
    public String LLILLJJLI;
    public boolean LLILLL;
    public String LLILZ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 139));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 140));

    public final DonatePageViewModel MR() {
        return (DonatePageViewModel) this.LLILZLL.getValue();
    }

    public final void NR() {
        C08J7 c08j7 = this.LL;
        String str = this.LLILLJJLI;
        if (str == null || c08j7 == null) {
            return;
        }
        if (this.LLILLL && Intrinsics.LJFF(this.LLILZ, str)) {
            return;
        }
        FundraiserContainerViewModel fundraiserContainerViewModel = (FundraiserContainerViewModel) this.LLILZIL.getValue();
        c08j7.LLILZ = str;
        TuxIconView tuxIconView = c08j7.LL;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS162S0100000_28(fundraiserContainerViewModel, 87));
        }
        SparkThirdContext sparkThirdContext = new SparkThirdContext();
        sparkThirdContext.url = c08j7.LLILZ;
        C1BHX c1bhxLIZ = C1554300qY8.LIZ(c08j7.getContext(), sparkThirdContext);
        C786410Ut5.W5(c1bhxLIZ, new LinearLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout = c08j7.LLILLJJLI;
        if (frameLayout != null) {
            frameLayout.addView(c1bhxLIZ);
        }
        c1bhxLIZ.LIZ(sparkThirdContext);
        c08j7.setLifecycleOwner(this);
        this.LLILLL = true;
        this.LLILZ = str;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLL = false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (((FundraiserContainerViewModel) this.LLILZIL.getValue()).LL.getValue() != null) {
            MR().getClass();
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.getString("arg_org_id");
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            arguments2.getString("arg_fundraiser_id");
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            arguments3.getString("arg_enter_from");
        }
        MR().getClass();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C1257404w0 value;
        String str;
        super.onViewCreated(view, bundle);
        ((FundraiserContainerViewModel) this.LLILZIL.getValue()).LL.observe(getViewLifecycleOwner(), new AObserverS230S0100000_28(this, 63));
        ((FundraiserContainerViewModel) this.LLILZIL.getValue()).LLILLJJLI.observe(getViewLifecycleOwner(), new AObserverS230S0100000_28(this, 64));
        MR().LL.observe(getViewLifecycleOwner(), new AObserverS230S0100000_28(this, 65));
        if (((FundraiserContainerViewModel) this.LLILZIL.getValue()).LL.getValue() != null && (value = MR().LL.getValue()) != null && (str = value.LIZ) != null && str.length() > 0) {
            this.LLILLJJLI = str;
            NR();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        C08J7 c08j7 = new C08J7(requireContext());
        this.LL = c08j7;
        c08j7.setId(View.generateViewId());
        try {
            ViewTreeLifecycleOwner.set(c08j7, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(c08j7, this);
            c08j7.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return c08j7;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return c08j7;
        }
    }
}
