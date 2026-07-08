package com.ss.android.ugc.tiktok.pns.activitycenter.bimetricslock.toggle.ui;

import X.C01GW;
import X.C098200Yq;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C127A;
import X.C127K;
import X.C127M;
import X.C1308910kAL;
import X.C1389890mGx;
import X.C1685300txQ;
import X.C1766560w4U;
import X.C1801880wzS;
import X.C1801890wzT;
import X.C1852050yIN;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20277814Wa;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1791270wiL;
import X.InterfaceC21503819Do;
import X.InterfaceC836760Ws6;
import Y.AObserverS187S0200000_27;
import Y.AObserverS208S0100000_4;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS271S0300000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
@InterfaceC836760Ws6
public final class ACEntranceUnlockToggleSettingFragment extends Fragment implements InterfaceC21503819Do {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjElIjs8I2s8Jzx9KSY4IDk6PDwvLCEnLTdiKyY+LTE+ICwgHELIOSJCovImEnJyIrJSp9PSxiCAwWJjE+KCEwLRAiJSAwIxEjLig/LRYpPTs6JiIKOy40JSAiPQ==";
    public TuxNavBar LL;
    public C127K LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1017));

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void FE(Bundle bundle) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void WK(boolean z) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ap() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void onActivityFinish() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyDown(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyLongPress(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyUp(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void qO(Intent intent) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void tv() {
        C20277814Wa.LIZIZ(this);
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ur(int i, int i2, Intent intent) {
        C20277814Wa.LIZ(this, i, i2, intent);
    }

    public final TuxNavBar MR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.p0y) : null;
            this.LL = (TuxNavBar) viewFindViewById;
        }
        return (TuxNavBar) viewFindViewById;
    }

    public final ACEntranceUnlockToggleSettingViewModel NR() {
        return (ACEntranceUnlockToggleSettingViewModel) this.LLILLL.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        PopupManager.LIZJ(C1852050yIN.class);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "activity_center_setting");
        c2344009Gk.LJIIIIZZ("biometric_unlock_status", Intrinsics.LJFF(NR().LL.getValue(), Boolean.TRUE) ? "on" : "off");
        c2344009Gk.LJIIIIZZ("biometric_type", "fingerprint");
        C20684815ws.LJIILLIIL("exit_activity_center_setting", c2344009Gk.LIZ);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Context context = getContext();
        if (context != null) {
            ACEntranceUnlockToggleSettingViewModel aCEntranceUnlockToggleSettingViewModelNR = NR();
            aCEntranceUnlockToggleSettingViewModelNR.LL.postValue(Boolean.valueOf(C1801880wzS.LIZ(context, ((IUserService) aCEntranceUnlockToggleSettingViewModelNR.LLILLJJLI.getValue()).getCurrentUserID())));
        }
    }

    @Override // X.InterfaceC21503819Do
    public final void Q9(Activity activity) {
        if (activity != null) {
            activity.setTheme(R.style.my);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
        tuxImmersionBarLIZLLL.LIZ(true);
        tuxImmersionBarLIZLLL.LJIIIIZZ(R.attr.zp);
        tuxImmersionBarLIZLLL.LJ(R.attr.zp);
        tuxImmersionBarLIZLLL.LIZLLL();
    }

    public final void OR(boolean z, EnumC1791270wiL enumC1791270wiL) {
        String str;
        String str2;
        C1389890mGx c1389890mGx = new C1389890mGx(this);
        c1389890mGx.LJIIIZ(2131834580);
        c1389890mGx.LJIIJJI();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "activity_center_setting");
        if (enumC1791270wiL == EnumC1791270wiL.FAILED) {
            str = "fail";
        } else {
            str = "quit";
        }
        c2344009Gk.LJIIIIZZ("fail_reason", str);
        if (z) {
            str2 = "on";
        } else {
            str2 = "off";
        }
        c2344009Gk.LJIIIIZZ("from_status", str2);
        c2344009Gk.LJIIIIZZ("biometric_type", "fingerprint");
        C20684815ws.LJIILLIIL("switch_biometric_unlock_failed", c2344009Gk.LIZ);
    }

    public final void PR(boolean z, boolean z2) {
        String str;
        if (z2) {
            C1389890mGx c1389890mGx = new C1389890mGx(this);
            c1389890mGx.LJIIIZ(2131834581);
            c1389890mGx.LJFF(R.raw.icon_tick_circle_fill);
            c1389890mGx.LJII(R.attr.a1h);
            c1389890mGx.LJIIJJI();
        }
        ACEntranceUnlockToggleSettingViewModel aCEntranceUnlockToggleSettingViewModelNR = NR();
        aCEntranceUnlockToggleSettingViewModelNR.getClass();
        String currentUserID = ((IUserService) aCEntranceUnlockToggleSettingViewModelNR.LLILLJJLI.getValue()).getCurrentUserID();
        C01GW c01gw = C1801890wzT.LIZ;
        Keva keva = (Keva) c01gw.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Toggle_");
        sbLIZ.append(currentUserID);
        keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), z2);
        if (z2) {
            Keva keva2 = (Keva) c01gw.getValue();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("HasSet_");
            sbLIZ2.append(currentUserID);
            keva2.storeBoolean(C2188811AlT.LIZIZ(sbLIZ2), true);
        }
        aCEntranceUnlockToggleSettingViewModelNR.LL.postValue(Boolean.valueOf(z2));
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "activity_center_setting");
        String str2 = "on";
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        c2344009Gk.LJIIIIZZ("from_status", str);
        if (!z2) {
            str2 = "off";
        }
        c2344009Gk.LJIIIIZZ("to_status", str2);
        c2344009Gk.LJIIIIZZ("biometric_type", "fingerprint");
        C20684815ws.LJIILLIIL("switch_biometric_unlock", c2344009Gk.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C127A c127a;
        Integer numLIZJ;
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zp, context)) != null) {
            view.setBackgroundColor(numLIZJ.intValue());
        }
        TuxNavBar tuxNavBarMR = MR();
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS571S0100000_27(this, 1391));
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = tuxNavBarMR.getContext().getString(2131834579);
        c0om1.LIZJ = c1250250idj;
        tuxNavBarMR.setNavActions(c0om1);
        MR().LJIIZILJ(false);
        MR().setNavBackground(0);
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.np3);
            } else {
                viewFindViewById = null;
            }
            this.LLILLJJLI = (C127K) viewFindViewById;
        }
        C127K c127k = (C127K) viewFindViewById;
        c127k.setTitle(c127k.getContext().getString(2131834583));
        c127k.setSubtitle(c127k.getContext().getString(2131834582));
        C127M accessory = c127k.getAccessory();
        if ((accessory instanceof C127A) && (c127a = (C127A) accessory) != null) {
            c127a.LJIILL(new AwS271S0300000_27(c127a, this, c127k, 27));
            NR().LL.observe(getViewLifecycleOwner(), new AObserverS208S0100000_4(c127a, 16));
        }
        MutableLiveData<Boolean> mutableLiveData = NR().LL;
        mutableLiveData.observe(getViewLifecycleOwner(), new AObserverS187S0200000_27(mutableLiveData, 6));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.kt, viewGroup, false);
        viewTd.setFitsSystemWindows(true);
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewTd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewTd;
        }
    }
}
