package com.ss.android.ugc.aweme.tux.business.base;

import X.C1766570w4V;
import X.C1896507bn;
import X.C19EH;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.DialogChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.model.InterceptResult;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;

/* JADX INFO: loaded from: classes30.dex */
public class GlobalHookDialogFragment extends DialogFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjE5MWExPTYlJyHELIOSogO2suKDw2ZgIgJi0yJA0jJiQXISQgJigVOiQrJCo9PA==";

    @Override // androidx.fragment.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        com_ss_android_ugc_aweme_tux_business_base_GlobalHookDialogFragment_com_ss_android_ugc_aweme_lancet_PopupMonitorDialogLancet_showDialogFragment(this, fragmentManager, str);
    }

    @Override // androidx.fragment.app.DialogFragment
    public void showNow(FragmentManager fragmentManager, String str) {
        com_ss_android_ugc_aweme_tux_business_base_GlobalHookDialogFragment_com_ss_android_ugc_aweme_lancet_PopupMonitorDialogLancet_showNow(this, fragmentManager, str);
    }

    public void com_ss_android_ugc_aweme_tux_business_base_GlobalHookDialogFragment__show$___twin___(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
        C1766570w4V c1766570w4V = C1766570w4V.LIZ;
        C1896507bn c1896507bn = new C1896507bn(this);
        c1766570w4V.getClass();
        C1766570w4V.LIZ(c1896507bn);
    }

    public void com_ss_android_ugc_aweme_tux_business_base_GlobalHookDialogFragment__showNow$___twin___(FragmentManager fragmentManager, String str) {
        super.showNow(fragmentManager, str);
        C1766570w4V c1766570w4V = C1766570w4V.LIZ;
        C1896507bn c1896507bn = new C1896507bn(this);
        c1766570w4V.getClass();
        C1766570w4V.LIZ(c1896507bn);
    }

    @Override // androidx.fragment.app.DialogFragment
    public int show(C19EH c19eh, String str) {
        int iShow = super.show(c19eh, str);
        C1766570w4V c1766570w4V = C1766570w4V.LIZ;
        C1896507bn c1896507bn = new C1896507bn(this);
        c1766570w4V.getClass();
        C1766570w4V.LIZ(c1896507bn);
        return iShow;
    }

    public static void com_ss_android_ugc_aweme_tux_business_base_GlobalHookDialogFragment_com_bytedance_tt_reliability_monitor_viewchecker_DialogChecker_show(GlobalHookDialogFragment globalHookDialogFragment, FragmentManager fragmentManager, String str) {
        try {
            DialogChecker.reportShowMonitorIfNeed(null, fragmentManager, globalHookDialogFragment);
            if (DialogChecker.enableCheck) {
                InterceptResult interceptResultInterceptDialogShow = DialogChecker.interceptDialogShow(fragmentManager, globalHookDialogFragment);
                if (interceptResultInterceptDialogShow.isIntercept()) {
                    DialogChecker.reportInterceptSuccess(globalHookDialogFragment.getClass().getName(), interceptResultInterceptDialogShow);
                    return;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        globalHookDialogFragment.com_ss_android_ugc_aweme_tux_business_base_GlobalHookDialogFragment__show$___twin___(fragmentManager, str);
    }

    public static void com_ss_android_ugc_aweme_tux_business_base_GlobalHookDialogFragment_com_ss_android_ugc_aweme_lancet_PopupMonitorDialogLancet_showDialogFragment(GlobalHookDialogFragment globalHookDialogFragment, FragmentManager fragmentManager, String str) {
        com_ss_android_ugc_aweme_tux_business_base_GlobalHookDialogFragment_com_bytedance_tt_reliability_monitor_viewchecker_DialogChecker_show(globalHookDialogFragment, fragmentManager, str);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJIZ(globalHookDialogFragment);
    }

    public static void com_ss_android_ugc_aweme_tux_business_base_GlobalHookDialogFragment_com_ss_android_ugc_aweme_lancet_PopupMonitorDialogLancet_showNow(GlobalHookDialogFragment globalHookDialogFragment, FragmentManager fragmentManager, String str) {
        globalHookDialogFragment.com_ss_android_ugc_aweme_tux_business_base_GlobalHookDialogFragment__showNow$___twin___(fragmentManager, str);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJIZ(globalHookDialogFragment);
    }
}
