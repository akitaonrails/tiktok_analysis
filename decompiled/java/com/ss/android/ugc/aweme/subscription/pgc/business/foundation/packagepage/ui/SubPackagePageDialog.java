package com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.ui;

import X.C098200Yq;
import X.C0CU7;
import X.C0K0R;
import X.C0K61;
import X.C0KC5;
import X.C0KC9;
import X.C0KCC;
import X.C0KCI;
import X.C0KCJ;
import X.C0KDQ;
import X.C0KDZ;
import X.C0KLA;
import X.C1389600mGU;
import X.C1390410mHn;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C337070DJh;
import X.C457801qK;
import X.C511520K4g;
import X.C511970K5z;
import X.C513430KBp;
import X.C513450KBr;
import X.C513470KBt;
import X.C513510KBx;
import X.C513570KCd;
import X.C513580KCe;
import X.C513880KDi;
import X.C521940KdU;
import X.C786410Ut5;
import X.EnumC513400KBm;
import X.EnumC513420KBo;
import Y.AObserverS211S0100000_7;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.subscription.pgc.bridge.SubscriptionBridgeViewModel;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.viewmodel.PackagePageViewModel;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.viewmodel.UpDowngradePackageViewModel;
import com.ss.android.ugc.aweme.subscription.pgc.experiment.PGCRestructureDebugIndicator;
import com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class SubPackagePageDialog extends GlobalHookDialogFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY5KzwwOiw8PSY8Jms8Lix9KjA/ICE2OzHELIOSZiLyAmJiEtPSY8Jms8KCw4KSIpOS40LWs5IGEAPSccKCw4KSIpGS40LQElKCM8Lw==";
    public String LL;
    public PackagePageViewModel LLILLJJLI;
    public UpDowngradePackageViewModel LLILLL;
    public SubscriptionBridgeViewModel LLILZ;
    public boolean LLJ;
    public Boolean LLJI;
    public ViewGroup LLJIJIL;
    public C1390410mHn LLJILJIL;
    public ViewStub LLJILJILJ;
    public ViewGroup LLJILLL;
    public boolean LLJJ;
    public Map<String, String> LLJJI;
    public EnumC513400KBm LLILZIL = EnumC513400KBm.UNKNOWN;
    public final C0KC5 LLILZLL = new C0KC5(0);
    public final Bundle LLIZ = new Bundle();
    public C0KCC LLIZLLLIL = new C0KCC(null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, 0, null, null, null, null, null, null, false, 0, null, 0, 0, false, -1, 15);
    public long LLJJIII = System.currentTimeMillis();

    static {
        new C513510KBx();
    }

    public final void PR() {
        C1390410mHn c1390410mHn = this.LLJILJIL;
        if (c1390410mHn != null) {
            C0K0R.LIZ(c1390410mHn);
            c1390410mHn.LIZLLL();
        }
    }

    public final void VR() {
        String str = SubPackageMultiMonthFragment._pnsPageId;
        C0KCC c0kcc = this.LLIZLLLIL;
        PackagePageViewModel packagePageViewModel = this.LLILLJJLI;
        boolean z = this.LLJ;
        Map<String, String> map = this.LLJJI;
        AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(this, 445);
        SubPackageMultiMonthFragment subPackageMultiMonthFragment = new SubPackageMultiMonthFragment();
        subPackageMultiMonthFragment.LLILZIL = c0kcc;
        subPackageMultiMonthFragment.LLILLL = packagePageViewModel;
        subPackageMultiMonthFragment.LLILLJJLI = awS551S0100000_7;
        subPackageMultiMonthFragment.LLIZ = z;
        String str2 = c0kcc.LJIIJ;
        if (str2 != null && map != null) {
            map.put("group_id", str2);
        }
        subPackageMultiMonthFragment.LLILZLL = map;
        subPackageMultiMonthFragment.setArguments(this.LLIZ);
        SR(subPackageMultiMonthFragment);
        PR();
    }

    public final void MR() {
        Window window;
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-2, -2);
    }

    public final boolean isViewValid() {
        return (!isAdded() || getView() == null || isStateSaved()) ? false : true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        PackagePageViewModel packagePageViewModel = this.LLILLJJLI;
        if (packagePageViewModel != null) {
            if (packagePageViewModel.LLILZ) {
                this.LLILZLL.LIZIZ = "iap_loading";
            } else if (packagePageViewModel.LLILLL) {
                this.LLILZLL.LIZIZ = "tpl_loading";
            }
        }
        C0KDQ c0kdq = C0KDQ.LIZ;
        String str = this.LLIZLLLIL.LJII;
        Map<String, String> map = this.LLJJI;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJJIII;
        String str2 = this.LLILZLL.LIZIZ;
        c0kdq.getClass();
        C0KDQ.LJIIIIZZ(jCurrentTimeMillis, str, map, str2);
        if (Intrinsics.LJFF(this.LLIZLLLIL.LJIIJJI, Boolean.TRUE)) {
            C513470KBt.LJ();
        } else {
            ((LinkedHashMap) C513470KBt.LIZIZ).clear();
            C513470KBt.LIZJ = null;
        }
        new C513570KCd(hashCode());
        C513880KDi.LIZ = "1";
        C513880KDi.LIZIZ = CardStruct.IStatusCode.DEFAULT;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        Window window2;
        float f;
        float f2;
        int i;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            Boolean bool = this.LLIZLLLIL.LJIIJJI;
            Boolean bool2 = Boolean.TRUE;
            window2.setDimAmount((!Intrinsics.LJFF(bool, bool2) || Intrinsics.LJFF(this.LLIZLLLIL.LJII, "others_homepage") || C513450KBr.LIZJ(this.LLILZLL.LIZJ) || Intrinsics.LJFF(this.LLJI, bool2)) ? 0.5f : 0.0f);
            WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.gravity = 80;
            window2.setAttributes(attributes);
            if (C513450KBr.LIZJ(this.LLILZLL.LIZJ)) {
                i = -2;
            } else {
                int iLJFF = C511520K4g.LJFF(getActivity());
                EnumC513400KBm enumC513400KBm = this.LLILZIL;
                if ((enumC513400KBm == EnumC513400KBm.PLAN_CHANGE_PAGE || C513450KBr.LIZLLL(enumC513400KBm)) && !C513450KBr.LIZIZ(this.LLILZLL.LIZJ)) {
                    f = iLJFF;
                    f2 = 0.7f;
                } else {
                    f = iLJFF;
                    f2 = 0.6f;
                }
                i = (int) (f * f2);
            }
            window2.setLayout(-1, i);
            if (PGCRestructureDebugIndicator.INSTANCE.isEnabled()) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(-16711936);
                window2.setBackgroundDrawable(gradientDrawable);
            }
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    public final void NR(boolean z) {
        String str;
        this.LLILZLL.LIZIZ = "tpl_loading";
        if (!C513450KBr.LIZLLL(this.LLILZIL) && !C513450KBr.LIZIZ(this.LLILZLL.LIZJ)) {
            if (this.LLILZIL == EnumC513400KBm.PLAN_CHANGE_PAGE) {
                C0KC9 c0kc9 = C0KC9.LIZ;
                C0KCC c0kcc = this.LLIZLLLIL;
                c0kc9.getClass();
                C0KLA c0klaLIZJ = C0KC9.LIZJ(c0kcc, null);
                UpDowngradePackageViewModel upDowngradePackageViewModel = this.LLILLL;
                if (upDowngradePackageViewModel != null) {
                    C511970K5z c511970K5z = new C511970K5z("livesdk_subscription_combo_page_fetch");
                    C0K61.LIZ(c511970K5z, null);
                    c511970K5z.LIZJ(this.LLJJI);
                    c511970K5z.LIZIZ(this.LLIZLLLIL.LJII, "show_entrance");
                    c511970K5z.LIZIZ("sub_package_page_dialog.fetch_plan_change.pgc", "trigger_component");
                    if (z) {
                        str = "retry";
                    } else {
                        str = "init";
                    }
                    c511970K5z.LIZIZ(str, "fetch_phase");
                    c511970K5z.LIZLLL();
                    if (c0klaLIZJ != null) {
                        upDowngradePackageViewModel.LLILLJJLI.setValue(c0klaLIZJ);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        C0KC9 c0kc92 = C0KC9.LIZ;
        C0KCC c0kcc2 = this.LLIZLLLIL;
        c0kc92.getClass();
        OR(C0KC9.LIZJ(c0kcc2, null), z);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void RR(X.C0KCP r7) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.ui.SubPackagePageDialog.RR(X.0KCP):void");
    }

    public final void SR(Fragment fragment) {
        try {
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIJ(R.id.eqx, fragment, getTag());
            c19ehLJIIJ.LJIIIZ();
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void UR(EnumC513420KBo enumC513420KBo) {
        C0KCC c0kcc = this.LLIZLLLIL;
        Map<String, String> map = this.LLJJI;
        AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(this, 444);
        SubPackageMultiAccountGuideFragment subPackageMultiAccountGuideFragment = new SubPackageMultiAccountGuideFragment();
        subPackageMultiAccountGuideFragment.LLILLL = c0kcc;
        subPackageMultiAccountGuideFragment.LLJILJILJ = awS551S0100000_7;
        subPackageMultiAccountGuideFragment.LLILLJJLI = enumC513420KBo;
        subPackageMultiAccountGuideFragment.LLILZ = map;
        subPackageMultiAccountGuideFragment.setArguments(this.LLIZ);
        SR(subPackageMultiAccountGuideFragment);
        PR();
    }

    public final void WR(EnumC513420KBo enumC513420KBo) {
        switch (C513430KBp.LIZ[enumC513420KBo.ordinal()]) {
            case 1:
            case 2:
            case 3:
                C0KCC c0kcc = this.LLIZLLLIL;
                Map<String, String> map = this.LLJJI;
                String str = this.LL;
                AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(this, 738);
                AwS551S0100000_7 awS551S0100000_72 = new AwS551S0100000_7(this, 739);
                SubPackageRenewalSpecialStatusFragment subPackageRenewalSpecialStatusFragment = new SubPackageRenewalSpecialStatusFragment();
                subPackageRenewalSpecialStatusFragment.LLILZ = c0kcc;
                subPackageRenewalSpecialStatusFragment.LLJILJIL = awS551S0100000_72;
                subPackageRenewalSpecialStatusFragment.LLILLL = enumC513420KBo;
                subPackageRenewalSpecialStatusFragment.LLILZIL = map;
                subPackageRenewalSpecialStatusFragment.LLJILJILJ = awS551S0100000_7;
                if (str == null) {
                    str = "";
                }
                subPackageRenewalSpecialStatusFragment.LLILLJJLI = str;
                subPackageRenewalSpecialStatusFragment.setArguments(this.LLIZ);
                SR(subPackageRenewalSpecialStatusFragment);
                PR();
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                UR(enumC513420KBo);
                break;
        }
        PR();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LLILZ = (SubscriptionBridgeViewModel) ViewModelProviders.of(requireActivity()).get(SubscriptionBridgeViewModel.class);
        C513450KBr.LIZLLL(this.LLILZIL);
        new C513580KCe(hashCode());
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        View decorView;
        Resources.Theme theme;
        Dialog dialog = new Dialog(requireContext(), R.style.ag_);
        Context context = dialog.getContext();
        if (context != null && (theme = context.getTheme()) != null) {
            theme.applyStyle(R.style.lc, false);
        }
        Window window = dialog.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(dialog);
        return dialog;
    }

    public final void OR(C0KLA c0kla, boolean z) {
        String str;
        PackagePageViewModel packagePageViewModel = this.LLILLJJLI;
        if (packagePageViewModel != null) {
            C511970K5z c511970K5z = new C511970K5z("livesdk_subscription_combo_page_fetch");
            C0K61.LIZ(c511970K5z, null);
            c511970K5z.LIZJ(this.LLJJI);
            c511970K5z.LIZIZ(this.LLIZLLLIL.LJII, "show_entrance");
            c511970K5z.LIZIZ("sub_package_page_dialog.fetch_package_page.pgc", "trigger_component");
            if (z) {
                str = "retry";
            } else {
                str = "init";
            }
            c511970K5z.LIZIZ(str, "fetch_phase");
            c511970K5z.LIZLLL();
            if (c0kla != null) {
                packagePageViewModel.LLILLJJLI.setValue(c0kla);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        LiveData<C0KCI> liveData;
        LiveData<C0KCI> liveData2;
        MediatorLiveData<C0KCJ> mediatorLiveData;
        MutableLiveData<C0KDZ> mutableLiveData;
        MutableLiveData<C0KDZ> mutableLiveData2;
        super.onViewCreated(view, bundle);
        this.LLILLJJLI = (PackagePageViewModel) ViewModelProviders.of(this, new ViewModelProvider.Factory() { // from class: X.0KCU
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final <T extends ViewModel> T create(Class<T> cls) {
                return new PackagePageViewModel();
            }
        }).get(PackagePageViewModel.class);
        UpDowngradePackageViewModel upDowngradePackageViewModel = (UpDowngradePackageViewModel) ViewModelProviders.of(this, new ViewModelProvider.Factory() { // from class: X.0KCV
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final <T extends ViewModel> T create(Class<T> cls) {
                return new UpDowngradePackageViewModel();
            }
        }).get(UpDowngradePackageViewModel.class);
        this.LLILLL = upDowngradePackageViewModel;
        if (upDowngradePackageViewModel != null) {
            upDowngradePackageViewModel.LLILZIL = new AwS551S0100000_7(this, 737);
        }
        NR(false);
        C1390410mHn c1390410mHn = (C1390410mHn) view.findViewById(R.id.pxr);
        this.LLJILJIL = c1390410mHn;
        if (c1390410mHn != null) {
            C0K0R.LIZJ(c1390410mHn);
            c1390410mHn.LIZJ();
        }
        this.LLJILJILJ = (ViewStub) view.findViewById(R.id.pxl);
        if (C513450KBr.LIZJ(this.LLILZLL.LIZJ)) {
            WR(this.LLILZLL.LIZJ);
        } else {
            EnumC513400KBm enumC513400KBm = this.LLILZIL;
            if (enumC513400KBm == EnumC513400KBm.PLAN_CHANGE_PAGE) {
                UpDowngradePackageViewModel upDowngradePackageViewModel2 = this.LLILLL;
                if (upDowngradePackageViewModel2 != null && (mediatorLiveData = upDowngradePackageViewModel2.LLILZLL) != null) {
                    mediatorLiveData.observe(getViewLifecycleOwner(), new AObserverS211S0100000_7(this, 68));
                }
                PackagePageViewModel packagePageViewModel = this.LLILLJJLI;
                if (packagePageViewModel != null && (liveData2 = packagePageViewModel.LLILZIL) != null) {
                    liveData2.observe(getViewLifecycleOwner(), new AObserverS211S0100000_7(this, 69));
                }
            } else if (C513450KBr.LIZLLL(enumC513400KBm)) {
                PackagePageViewModel packagePageViewModel2 = this.LLILLJJLI;
                if (packagePageViewModel2 != null && (liveData = packagePageViewModel2.LLILZIL) != null) {
                    liveData.observe(getViewLifecycleOwner(), new AObserverS211S0100000_7(this, 67));
                }
            } else {
                RR(null);
            }
        }
        PackagePageViewModel packagePageViewModel3 = this.LLILLJJLI;
        if (packagePageViewModel3 != null && (mutableLiveData2 = packagePageViewModel3.LLJIJIL) != null) {
            mutableLiveData2.observe(getViewLifecycleOwner(), new AObserverS211S0100000_7(this, 70));
        }
        UpDowngradePackageViewModel upDowngradePackageViewModel3 = this.LLILLL;
        if (upDowngradePackageViewModel3 != null && (mutableLiveData = upDowngradePackageViewModel3.LLJI) != null) {
            mutableLiveData.observe(getViewLifecycleOwner(), new AObserverS211S0100000_7(this, 59));
        }
        SubscriptionBridgeViewModel subscriptionBridgeViewModel = this.LLILZ;
        if (subscriptionBridgeViewModel != null) {
            C457801qK.LIZ(new C521940KdU(subscriptionBridgeViewModel.LL, 0), this, new C0CU7(this, null));
        }
        SubscriptionBridgeViewModel subscriptionBridgeViewModel2 = this.LLILZ;
        if (subscriptionBridgeViewModel2 != null) {
            C457801qK.LIZ(new C521940KdU(subscriptionBridgeViewModel2.LL, 3), this, new C337070DJh(this, null));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ffa, viewGroup, false);
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
