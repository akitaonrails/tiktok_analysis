package com.ss.android.ugc.aweme.compliance.protection.timelock.ui.fragment;

import X.C098200Yq;
import X.C127K;
import X.C1388190mED;
import X.C1389890mGx;
import X.C15YW;
import X.C15YX;
import X.C15ZB;
import X.C1685300txQ;
import X.C1871910yoP;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20536115Xj;
import X.C20684815ws;
import X.C2344009Gk;
import X.C262100zr;
import X.C786410Ut5;
import X.EnumC1781490wSZ;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.compliance.api.model.SleepHourSettings;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class SleepHourManagerDialog extends BaseFragment implements InterfaceC1141530foN {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD8/ISQiKip9ODcjPSowPCwjHELIOSJ2EnISgpJSAwI2s5IGE1OiQrJCo9PGsfJSo2OA0jPD0eKSstLiohDCwtJSA0";
    public TuxSheet LLIZ;
    public boolean LLIZLLLIL;
    public String LLJ = "";

    public final void SR(String str) {
        if (!Intrinsics.LJFF(this.LLJ, "manage_sleep_hour")) {
            return;
        }
        C15YX.LIZ.getClass();
        int iLJ = C15YX.LJ();
        Keva kevaLIZ = C15YX.LIZ();
        C20536115Xj.LIZ.getClass();
        int i = 0;
        int i2 = kevaLIZ.getInt(C20536115Xj.LJI("sleep_hour_manage_sheet_cadence_day"), 0);
        int i3 = C15YX.LIZ().getInt(C20536115Xj.LJI("sleep_hour_manage_sheet_cadence_count"), 0);
        if (i2 == iLJ) {
            i = i3;
        }
        Integer numValueOf = Integer.valueOf(i);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("business", "dwl_sleephour_reminder_manage");
        c2344009Gk.LJFF("style", "bottom");
        c2344009Gk.LJFF("action_id", str);
        if (numValueOf != null) {
            c2344009Gk.LIZJ(numValueOf.intValue(), "cadence");
        }
        c2344009Gk.LJFF("enter_from", "dwl_sleephour_reminder");
        C20684815ws.LJIILLIIL("pns_content_click", c2344009Gk.LIZ);
    }

    public final void UR(String str) {
        int i;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action", str);
        C15YX.LIZ.getClass();
        SleepHourSettings sleepHourSettingsLIZJ = C15YX.LIZJ();
        if (sleepHourSettingsLIZJ != null) {
            i = sleepHourSettingsLIZJ.popupShowTimes;
        } else {
            i = 0;
        }
        c2344009Gk.LIZJ(i, "trigger_time");
        c2344009Gk.LJIIIIZZ("version", "meditation");
        c2344009Gk.LJIIIIZZ("reminder_type", this.LLJ);
        C20684815ws.LJIILLIIL("click_feed_sleep_hour_reminder_menu", c2344009Gk.LIZ);
    }

    public final void VR(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "homepage_hot");
        c2344009Gk.LJIIIIZZ("popup_name", "sleephour");
        c2344009Gk.LJIIIIZZ("button_name", str);
        C20684815ws.LJIILLIIL("PrivacyDWL_popup_button_click", c2344009Gk.LIZ);
    }

    public final void bu(String str) {
        Activity activityLIZ;
        Context context = getContext();
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LIZ(true);
            c1389890mGx.LIZLLL(3000L);
            c1389890mGx.LJIIJ(str);
            c1389890mGx.LJIIJJI();
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
        if (interfaceC1107590evd == null) {
            return;
        }
        Context context = getContext();
        if (context != null) {
            String strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "action", "");
            if (Intrinsics.LJFF(strLJFF, "screen_time_update")) {
                if (interfaceC1107590evd.hasKey("hour") && interfaceC1107590evd.hasKey("min")) {
                    bu(context.getString(2131845167));
                }
            } else if (Intrinsics.LJFF(strLJFF, "screen_time_switch_update") && !C1871910yoP.LIZIZ(interfaceC1107590evd, "enable", false)) {
                bu(context.getString(2131845166));
            }
        }
        TuxSheet tuxSheet = this.LLIZ;
        if (tuxSheet != null) {
            tuxSheet.dismiss();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C127K c127k = (C127K) view.findViewById(R.id.vg1);
        C127K c127k2 = (C127K) view.findViewById(R.id.vg0);
        C127K c127k3 = (C127K) view.findViewById(R.id.vjb);
        C15YW.LIZ.getClass();
        int iLIZ = C15YW.LIZ();
        int i = 0;
        if ((iLIZ == EnumC1781490wSZ.EXPAND_ENTRANCE.getI() || iLIZ == EnumC1781490wSZ.EXPAND_ENTRANCE_NO_RESHOW.getI()) && c127k3 != null) {
            C786410Ut5.LLZLL(c127k3, 8);
        }
        if (c127k != null) {
            c127k.setOnClickListener(new AwS610S0100000_31(this, 308));
        }
        if (c127k2 != null) {
            c127k2.setOnClickListener(new AwS610S0100000_31(this, 309));
        }
        if (c127k3 != null) {
            c127k3.setOnClickListener(new AwS610S0100000_31(this, 310));
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("popup_name", "sleephour");
        c2344009Gk.LJIIIIZZ("enter_from", "homepage_hot");
        C20684815ws.LJIILLIIL("PrivacyDWL_popup_show", c2344009Gk.LIZ);
        if (Intrinsics.LJFF(this.LLJ, "manage_sleep_hour")) {
            C15YX.LIZ.getClass();
            int iLJ = C15YX.LJ();
            Keva kevaLIZ = C15YX.LIZ();
            C20536115Xj.LIZ.getClass();
            int i2 = kevaLIZ.getInt(C20536115Xj.LJI("sleep_hour_manage_sheet_cadence_day"), 0);
            int i3 = C15YX.LIZ().getInt(C20536115Xj.LJI("sleep_hour_manage_sheet_cadence_count"), 0);
            if (i2 == iLJ) {
                iLJ = i2;
                i = i3;
            }
            int i4 = i + 1;
            C15YX.LIZ().storeInt(C20536115Xj.LJI("sleep_hour_manage_sheet_cadence_day"), iLJ);
            C15YX.LIZ().storeInt(C20536115Xj.LJI("sleep_hour_manage_sheet_cadence_count"), i4);
            C15ZB.LIZ(Integer.valueOf(i4), "dwl_sleephour_reminder_manage", "bottom");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bcx, viewGroup, false);
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
