package com.ss.android.ugc.aweme.creatorcenter.fragment;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C098200Yq;
import X.C0TGK;
import X.C0XQ7;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1323820kYO;
import X.C1386740mBs;
import X.C1548820qPI;
import X.C1685300txQ;
import X.C1891110zJN;
import X.C189200o6;
import X.C19292910dr;
import X.C19318810i2;
import X.C19319810iC;
import X.C19EG;
import X.C19GS;
import X.C397901gf;
import X.C452501pT;
import X.C501801xQ;
import X.C501901xR;
import X.C786260Usq;
import X.C786410Ut5;
import X.InterfaceC836760Ws6;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS162S0100000_28;
import Y.ARunnableS128S0100000_28;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.check.IAutoSoundCheckService;
import com.ss.android.ugc.aweme.creatorcenter.fragment.CreatorCenterSettingsFragment;
import com.ss.android.ugc.aweme.creatorcenter.settings.AiStudioApi;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.edit.CachedAutoMuteStripSettingStatus;
import com.ss.android.ugc.aweme.services.edit.IMuteStripSettingService;
import com.ss.android.ugc.aweme.setting.ui.cell.SettingHeaderCell;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS40S0001000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
@InterfaceC836760Ws6
public final class CreatorCenterSettingsFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiY+LC4nJzcvLCEnLTdiHELIOSLz0yLygpJzt9CzcpKDs8OgYpJzs2OhYpPTs6JiI/Dz0yLygpJzs=";
    public ViewOnAttachStateChangeListenerC20604515jv LLIZ;
    public TuxNavBar LLIZLLLIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJ;
    public C19292910dr LLJI;
    public C19292910dr LLJIJIL;
    public C19292910dr LLJILJIL;
    public C19292910dr LLJILJILJ;
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 180));
    public final C01GW LLJJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(135));

    public final C19318810i2 SR() {
        return (C19318810i2) this.LLJILLL.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLIZ = null;
    }

    public static void VR(boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_on", z ? 1 : 0);
        C1548820qPI.LIZIZ(new C397901gf(jCurrentTimeMillis, new C1323820kYO(jSONObject), "creatorAIStudioEtranceToggleSwitched"));
    }

    public final void UR(int i) {
        boolean z;
        ((IMuteStripSettingService) this.LLJJ.getValue()).storeAutoMuteStripSetting(i);
        if (i < CachedAutoMuteStripSettingStatus.OFF.getValue()) {
            return;
        }
        C19318810i2 c19318810i2SR = SR();
        String string = getString(2131826880);
        String string2 = getString(2131826879);
        if (i == CachedAutoMuteStripSettingStatus.ON.getValue()) {
            z = true;
        } else {
            z = false;
        }
        C19292910dr c19292910dr = new C19292910dr(new C19319810iC(z, string, new ACListenerS162S0100000_28(this, 46), true, null, null, null, string2, false, false, true, null, 113648));
        this.LLJILJIL = c19292910dr;
        c19318810i2SR.LIZ(c19292910dr);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        NR(AFwS271S0000000_28.get$arr$(86));
        super.onCreate(bundle);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        CachedAutoMuteStripSettingStatus cachedAutoMuteStripSetting;
        boolean z;
        super.onViewCreated(view, bundle);
        TuxNavBar tuxNavBar = this.LLIZLLLIL;
        if (tuxNavBar != null) {
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
            c1251150ifB.LIZLLL = true;
            c1251150ifB.LIZJ(new AwS572S0100000_28(this, 889));
            tuxNavBar.LIZIZ(c1251150ifB);
        }
        TuxNavBar tuxNavBar2 = this.LLIZLLLIL;
        if (tuxNavBar2 != null) {
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = getString(2131830120);
            tuxNavBar2.LJIJJ(c1250250idj);
        }
        TuxNavBar tuxNavBar3 = this.LLIZLLLIL;
        if (tuxNavBar3 != null) {
            tuxNavBar3.LJIIZILJ(false);
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zp, requireContext());
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            TuxNavBar tuxNavBar4 = this.LLIZLLLIL;
            if (tuxNavBar4 != null) {
                tuxNavBar4.setNavBackground(iIntValue);
            }
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJ;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(SettingHeaderCell.class);
        }
        boolean adAuthorization = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getAdAuthorization();
        C19318810i2 c19318810i2SR = SR();
        boolean z2 = false;
        C19292910dr c19292910dr = new C19292910dr(new C19319810iC(adAuthorization, getString(2131836779), new ACListenerS162S0100000_28(this, 141), true, null, null, null, getString(2131836780), false, true, false, null, 121840));
        this.LLJI = c19292910dr;
        c19318810i2SR.LIZ(c19292910dr);
        C1891110zJN.LIZ(SR(), requireContext());
        if (((Boolean) C1386740mBs.LIZ.getValue()).booleanValue()) {
            C19318810i2 c19318810i2SR2 = SR();
            String string = getString(2131839341);
            String string2 = getString(2131839340);
            if (C501801xQ.LIZIZ.getInt("ai_studio_status", 0) == 1) {
                z = true;
            } else {
                z = false;
            }
            z2 = false;
            C19292910dr c19292910dr2 = new C19292910dr(new C19319810iC(z, string, new ACListenerS162S0100000_28(this, 140), true, null, null, null, string2, false, true, false, null, 121840));
            this.LLJILJILJ = c19292910dr2;
            c19318810i2SR2.LIZ(c19292910dr2);
            if (getContext() != null) {
                C0TGK c0tgk = new C0TGK() { // from class: X.0zJQ
                    @Override // X.C0TGK
                    public final void onFailed() {
                        CreatorCenterSettingsFragment creatorCenterSettingsFragment = this.LIZ;
                        C19292910dr c19292910dr3 = creatorCenterSettingsFragment.LLJILJILJ;
                        if (c19292910dr3 != null) {
                            c19292910dr3.LJI(new AwS607S0100000_28(creatorCenterSettingsFragment, 301));
                        }
                    }

                    @Override // X.C0TGK
                    public final void LIZIZ(int i) {
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("enter_from", "creator_center");
                        int i2 = 1;
                        if (i != 1) {
                            i2 = 0;
                        }
                        c2344009Gk.LIZJ(i2, "is_assistant_turned_on");
                        C20684815ws.LJIILLIIL("ai_assistant_studio_toggle_show", c2344009Gk.LIZ);
                        C19292910dr c19292910dr3 = this.LIZ.LLJILJILJ;
                        if (c19292910dr3 != null) {
                            c19292910dr3.LJI(new AwS40S0001000_28(i, 3));
                        }
                    }
                };
                AiStudioApi.LIZ.getClass();
                C501901xR.LIZIZ.requestAiStudioSetting().enqueue(new C786260Usq(c0tgk, 14));
            }
        }
        IMuteStripSettingService iMuteStripSettingService = (IMuteStripSettingService) PluggableExtentionKt.pluggableSpi$default(IMuteStripSettingService.class, false, false, false, 14, null);
        if (iMuteStripSettingService != null && (cachedAutoMuteStripSetting = iMuteStripSettingService.getCachedAutoMuteStripSetting(false)) != null && cachedAutoMuteStripSetting.getValue() >= CachedAutoMuteStripSettingStatus.OFF.getValue()) {
            UR(cachedAutoMuteStripSetting.getValue());
        }
        IAutoSoundCheckService iAutoSoundCheckService = (IAutoSoundCheckService) PluggableExtentionKt.pluggableSpi$default(IAutoSoundCheckService.class, z2, z2, z2, 14, null);
        if (iAutoSoundCheckService != null) {
            iAutoSoundCheckService.LIZ(new AwS607S0100000_28(this, 302));
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zp, requireContext());
        if (numLIZJ2 != null) {
            view.setBackgroundColor(numLIZJ2.intValue());
        }
        SR().LJ();
        HandlerHook.viewPost(view, new ARunnableS128S0100000_28(this, 24));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.f5w, viewGroup, false);
        this.LLIZLLLIL = (TuxNavBar) viewTd.findViewById(R.id.y1z);
        this.LLJ = (ViewOnAttachStateChangeListenerC20604515jv) viewTd.findViewById(R.id.uxe);
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
