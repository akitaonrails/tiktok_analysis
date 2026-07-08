package com.ss.android.ugc.aweme.compliance.business.fundraiser.p006native.pages.edit;

import X.C01GW;
import X.C098200Yq;
import X.C1041990dDp;
import X.C1685300txQ;
import X.C189200o6;
import X.C1910590zon;
import X.C1911040zpW;
import X.C19336910kx;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C452501pT;
import X.C513601zK;
import X.C5182020e;
import X.C786410Ut5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.business.fundraiser.p006native.FundraiserContainerViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class EditFundraiserPageFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD8/ISQiKip9KjA/ICE2OzZiLzo9LDctHELIOSIDw2OmsiKDs6PiBiOS40LTZiLCs6PGsJLSYnDjAiLT0yITYpOx8yLyAKOy40JSAiPQ==";
    public final C01GW LL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 145));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C5182020e(this, 106));

    public final FundraiserContainerViewModel MR() {
        return (FundraiserContainerViewModel) this.LL.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (MR().LL.getValue() != null) {
            this.LLILLJJLI.getValue().getClass();
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
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            arguments4.getString("arg_enter_method");
        }
        this.LLILLJJLI.getValue().getClass();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        MR().LL.observe(getViewLifecycleOwner(), new C513601zK(this, 37));
        MR().LLILLJJLI.observe(getViewLifecycleOwner(), new C513601zK(this, 38));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        String string2;
        String string3;
        int i;
        String string4;
        C19GS c19gs;
        C1910590zon c1910590zon = new C1910590zon(requireContext());
        c1910590zon.setId(View.generateViewId());
        C1911040zpW value = MR().LL.getValue();
        if (value != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            FundraiserContainerViewModel fundraiserContainerViewModelMR = MR();
            String str = value.LIZ;
            String str2 = value.LIZIZ;
            String str3 = value.LIZLLL;
            int i2 = value.LJ;
            String str4 = value.LJFF;
            c1910590zon.LLILLL = childFragmentManager;
            c1910590zon.LLILZ = fundraiserContainerViewModelMR;
            c1910590zon.LLILZLL = str;
            c1910590zon.LLIZ = str2;
            c1910590zon.LLIZLLLIL = str3;
            c1910590zon.LLJ = i2;
            c1910590zon.LLJI = str4;
            c1910590zon.LLJIJIL = false;
            c1910590zon.setLifecycleOwner(this);
        } else {
            Bundle arguments = getArguments();
            String str5 = "";
            if (arguments == null || (string = arguments.getString("arg_org_id")) == null) {
                string = "";
            }
            Bundle arguments2 = getArguments();
            if (arguments2 == null || (string2 = arguments2.getString("arg_fundraiser_id")) == null) {
                string2 = "";
            }
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                arguments3.getString("arg_enter_from");
            }
            Bundle arguments4 = getArguments();
            if (arguments4 == null || (string3 = arguments4.getString("arg_enter_method")) == null) {
                string3 = "";
            }
            Bundle arguments5 = getArguments();
            if (arguments5 != null) {
                i = arguments5.getInt("arg_item_type", 0);
            } else {
                i = 0;
            }
            Bundle arguments6 = getArguments();
            if (arguments6 != null && (string4 = arguments6.getString("arg_item_id")) != null) {
                str5 = string4;
            }
            FragmentManager childFragmentManager2 = getChildFragmentManager();
            FundraiserContainerViewModel fundraiserContainerViewModelMR2 = MR();
            c1910590zon.LLILLL = childFragmentManager2;
            c1910590zon.LLILZ = fundraiserContainerViewModelMR2;
            c1910590zon.LLILZLL = string;
            c1910590zon.LLIZ = string2;
            c1910590zon.LLIZLLLIL = string3;
            c1910590zon.LLJ = i;
            c1910590zon.LLJI = str5;
            c1910590zon.LLJIJIL = false;
            c1910590zon.setLifecycleOwner(this);
        }
        FragmentManager fragmentManager = c1910590zon.LLILLL;
        if (fragmentManager != null) {
            Fragment fragmentLJJJJZI = fragmentManager.LJJJJZI("EditFundraiserSparkFragment");
            if (fragmentLJJJJZI != null) {
                C19EH c19ehLJIIJ = fragmentManager.LJIIJ();
                c19ehLJIIJ.LJIIZILJ(fragmentLJJJJZI);
                c19ehLJIIJ.LJIIJ();
            }
            if (c1910590zon.LL == null) {
                String string5 = UriProtector.parse("https://inapp.tiktokv.com/tpp/inapp/pns_product_poseidon/donation-creation.html").buildUpon().appendQueryParameter("organization_id", c1910590zon.LLILZLL).appendQueryParameter("fundraiser_id", c1910590zon.LLIZ).appendQueryParameter("enter_from", "donor_panel").appendQueryParameter("enter_method", c1910590zon.LLIZLLLIL).appendQueryParameter("item_type", String.valueOf(c1910590zon.LLJ)).appendQueryParameter("item_id", c1910590zon.LLJI).appendQueryParameter("live_started", "1").build().toString();
                SparkContext sparkContext = new SparkContext();
                sparkContext.LJJLIIJ(string5);
                sparkContext.LJJJJZI(new C19336910kx(c1910590zon, 3));
                c1910590zon.LL = new SparkFragment();
                C1041990dDp.LIZ.getClass();
                C1041990dDp.LIZJ(sparkContext);
                SparkFragment sparkFragment = c1910590zon.LL;
                if (sparkFragment != null) {
                    Bundle bundle2 = new Bundle();
                    C786410Ut5.LJJJI("SparkContextContainerId", sparkContext.containerId, bundle2);
                    sparkFragment.setArguments(bundle2);
                }
            }
            SparkFragment sparkFragment2 = c1910590zon.LL;
            if (sparkFragment2 != null) {
                C19EH c19ehLJIIJ2 = fragmentManager.LJIIJ();
                c19ehLJIIJ2.LIZJ(c1910590zon.getId(), sparkFragment2, "EditFundraiserSparkFragment");
                c19ehLJIIJ2.LJIIJ();
            }
        }
        try {
            ViewTreeLifecycleOwner.set(c1910590zon, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(c1910590zon, this);
            c1910590zon.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return c1910590zon;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return c1910590zon;
        }
    }
}
