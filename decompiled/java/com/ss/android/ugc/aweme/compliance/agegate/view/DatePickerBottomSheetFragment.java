package com.ss.android.ugc.aweme.compliance.agegate.view;

import X.C01GW;
import X.C098200Yq;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1390920mIc;
import X.C1685300txQ;
import X.C189200o6;
import X.C19318110hv;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C452501pT;
import X.C786410Ut5;
import X.DialogInterfaceOnDismissListenerC19333210kM;
import X.InterfaceC19298210ei;
import X.InterfaceC344240DeY;
import Y.ACListenerS162S0100000_28;
import Y.AObserverS217S0100000_13;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.compliance.agegate.view.BirthdaySettingsViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Calendar;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class DatePickerBottomSheetFragment extends Fragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD8/ISQiKip9KSIpHELIOSLi4nLWs6ICokZgEtPSoDISYnLD0RJzE4JiIAICApPQkhKSIhLCEn";
    public C197039127h LL;
    public TuxTextView LLILLJJLI;
    public C19318110hv LLILLL;
    public LinearLayout LLILZ;
    public TuxIconView LLILZIL;
    public TuxTextView LLILZLL;
    public TuxSheet LLIZ;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 132));
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(102));

    public final BirthdaySettingsViewModel MR() {
        return (BirthdaySettingsViewModel) this.LLIZLLLIL.getValue();
    }

    public final C19318110hv NR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.v3y) : null;
            this.LLILLL = (C19318110hv) viewFindViewById;
        }
        return (C19318110hv) viewFindViewById;
    }

    public final C197039127h OR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.v41) : null;
            this.LL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        String string;
        Context contextP3;
        Resources resources;
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        C19EG activity = getActivity();
        if (activity == null || (contextP3 = C786410Ut5.P3(activity)) == null || (resources = contextP3.getResources()) == null || (string = resources.getString(2131828433)) == null) {
            string = getString(2131828433);
        }
        c1250250idj.LIZJ = string;
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS572S0100000_28(this, 131));
        c0om1.LIZIZ(c1251150ifB);
        return c0om1;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDestroy() {
        /*
            r9 = this;
            super.onDestroy()
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.lang.Class<com.tiktok.ef.i18n.service.manager.I18nServiceApi> r3 = com.tiktok.ef.i18n.service.manager.I18nServiceApi.class
            r4 = 0
            r7 = 14
            r8 = 0
            r5 = r4
            r6 = r4
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r3, r4, r5, r6, r7, r8)
            com.tiktok.ef.i18n.service.manager.I18nServiceApi r0 = (com.tiktok.ef.i18n.service.manager.I18nServiceApi) r0
            if (r0 == 0) goto L2d
            com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi r1 = r0.LIZ()
            if (r1 == 0) goto L2d
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            android.content.Context r0 = X.C844470XAv.LIZ()
            java.lang.String r3 = r1.LJIJJ(r0)
            if (r3 != 0) goto L35
        L2d:
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r3 = X.C786410Ut5.t2(r0)
        L35:
            java.util.Locale r1 = new java.util.Locale
            java.lang.String r0 = X.C2222691Bz1.LIZ()
            r1.<init>(r3, r0)
            java.lang.String r1 = X.C10WW.LIZJ(r1)
            java.lang.String r0 = "default_format"
            r2.put(r0, r1)
            com.ss.android.ugc.aweme.compliance.agegate.view.BirthdaySettingsViewModel r0 = r9.MR()
            java.util.Map r0 = r0.vQ2()
            r2.putAll(r0)
            java.lang.String r1 = "is_submit"
            java.lang.String r0 = "0"
            r2.put(r1, r0)
            X.01GW r0 = r9.LLJ
            java.lang.Object r1 = r0.getValue()
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r0 = "user_type"
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r0 = "edit"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L7d
            java.lang.String r1 = "age_edit_scroll_results"
        L71:
            X.01GW r0 = r9.LLJ
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            X.C19298010eg.LJ(r1, r2, r0)
            return
        L7d:
            java.lang.String r1 = "age_scroll_result"
            goto L71
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.agegate.view.DatePickerBottomSheetFragment.onDestroy():void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        MR().LLIZLLLIL.postValue(Boolean.FALSE);
    }

    public final void PR(FragmentManager fragmentManager) {
        TuxSheet tuxSheet = new C1390920mIc(false, 0).LIZ;
        tuxSheet.LLJJIJI = this;
        tuxSheet.LLJJIJIIJIL = true;
        tuxSheet.LLILLL = false;
        tuxSheet.LLILLJJLI = new DialogInterfaceOnDismissListenerC19333210kM(this, 3);
        this.LLIZ = tuxSheet;
        tuxSheet.show(fragmentManager, "DatePickerBottomSheetFragment");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Context contextP3;
        Resources resources;
        super.onViewCreated(view, bundle);
        MR().LL.observe(getViewLifecycleOwner(), new AObserverS217S0100000_13(this, 1));
        MR().LLILLJJLI.observe(getViewLifecycleOwner(), new AObserverS217S0100000_13(this, 2));
        MR().LLILLL.observe(getViewLifecycleOwner(), new AObserverS217S0100000_13(this, 3));
        MR().LLILZ.observe(getViewLifecycleOwner(), new AObserverS217S0100000_13(this, 4));
        MR().LLILZIL.observe(getViewLifecycleOwner(), new AObserverS217S0100000_13(this, 5));
        MR().LLILZLL.observe(getViewLifecycleOwner(), new AObserverS217S0100000_13(this, 6));
        MR().LLJI.observe(getViewLifecycleOwner(), new AObserverS217S0100000_13(this, 7));
        C197039127h c197039127hOR = OR();
        if (c197039127hOR != null) {
            C786410Ut5.U8(c197039127hOR, new ACListenerS162S0100000_28(this, 37));
        }
        View viewFindViewById = this.LLILLJJLI;
        String string = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.fft);
            } else {
                viewFindViewById = null;
            }
            this.LLILLJJLI = (TuxTextView) viewFindViewById;
        }
        TextView textView = (TextView) viewFindViewById;
        C19EG activity = getActivity();
        if (activity != null && (contextP3 = C786410Ut5.P3(activity)) != null && (resources = contextP3.getResources()) != null) {
            string = resources.getString(2131828434);
        }
        textView.setText(string);
        C19318110hv c19318110hvNR = NR();
        if (c19318110hvNR != null) {
            c19318110hvNR.LLIZ = new InterfaceC19298210ei() { // from class: X.10ej
                @Override // X.InterfaceC19298210ei
                public final void LIZ(Calendar calendar, int i) {
                    Date time;
                    MutableLiveData<Date> mutableLiveData = this.LIZ.MR().LLIZ;
                    if (calendar != null) {
                        time = calendar.getTime();
                    } else {
                        time = null;
                    }
                    mutableLiveData.postValue(time);
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                BirthdaySettingsViewModel birthdaySettingsViewModelMR = this.LIZ.MR();
                                if (birthdaySettingsViewModelMR.LLJILJILJ == 0) {
                                    birthdaySettingsViewModelMR.LLJILJILJ = Math.max(birthdaySettingsViewModelMR.LLJILLL, birthdaySettingsViewModelMR.LLJJ) + 1;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        BirthdaySettingsViewModel birthdaySettingsViewModelMR2 = this.LIZ.MR();
                        if (birthdaySettingsViewModelMR2.LLJILLL != 0) {
                            return;
                        }
                        birthdaySettingsViewModelMR2.LLJILLL = Math.max(birthdaySettingsViewModelMR2.LLJILJILJ, birthdaySettingsViewModelMR2.LLJJ) + 1;
                        return;
                    }
                    BirthdaySettingsViewModel birthdaySettingsViewModelMR3 = this.LIZ.MR();
                    if (birthdaySettingsViewModelMR3.LLJJ != 0) {
                        return;
                    }
                    birthdaySettingsViewModelMR3.LLJJ = Math.max(birthdaySettingsViewModelMR3.LLJILJILJ, birthdaySettingsViewModelMR3.LLJILLL) + 1;
                }
            };
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dx_, viewGroup, false);
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
