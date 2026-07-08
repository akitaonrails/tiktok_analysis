package com.ss.android.ugc.aweme.homepage.ui.view.tab.lynx;

import X.AbstractC1591090rVT;
import X.C01GW;
import X.C098200Yq;
import X.C0CUL;
import X.C14LC;
import X.C1558360qeg;
import X.C1561720qk6;
import X.C1581510rG1;
import X.C1591880rWk;
import X.C1592450rXf;
import X.C1593390rZB;
import X.C1593400rZC;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C21395918oH;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.EnumC1571190qzN;
import X.EnumC452301pR;
import X.InterfaceC1055110dYz;
import X.InterfaceC1541990qEH;
import X.InterfaceC1583870rJp;
import X.InterfaceC1591870rWj;
import X.InterfaceC1593430rZF;
import X.RunnableC1593370rZ9;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public final class ActivityTabContainerFragment extends FeedFragment implements InterfaceC1055110dYz, InterfaceC1591870rWj {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zi0jJCojKSIpZzo6ZjMlLDHELIOSh9PCQuZyMqJj1iCCwnITMlPTYHKScPJiEnKSwiLD0VOiQrJCo9PA==";
    public final int LLILZLL;
    public final int LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final RunnableC1593370rZ9 LLJIJIL;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLJILJIL;
    public C1593390rZB LLJILJILJ;
    public View LLJILLL;
    public View LLJJ;
    public C21395918oH LLJJI;
    public int LLJJIII;

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final String MR() {
        return "a2270.b75559";
    }

    @Override // X.InterfaceC1591870rWj
    public final String wm() {
        return "ActivityTabContainerFragment";
    }

    @Override // X.InterfaceC1583780rJg
    public final String getHoxNodeTag() {
        return (String) this.LLJ.getValue();
    }

    public ActivityTabContainerFragment() {
        C1592450rXf.LLLIZZ.getClass();
        this.LLILZLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C1592450rXf.LLLL)));
        this.LLIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C14LC.LJIILIIL)));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 582));
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLJ = C452501pT.LIZ(enumC452301pR, new AwS568S0100000_24(this, 583));
        this.LLJI = C452501pT.LIZ(enumC452301pR, new AwS568S0100000_24(this, 584));
        this.LLJIJIL = RunnableC1593370rZ9.LL;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final void SR() {
        UR();
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final boolean Oi(boolean z) throws JSONException {
        ZR("click_top_icon", z);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0132 A[Catch: Exception -> 0x0147, PHI: r2
      0x0132: PHI (r2v2 java.lang.String) = (r2v0 java.lang.String), (r2v3 java.lang.String) binds: [B:46:0x0130, B:44:0x012d] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0147, blocks: (B:40:0x0117, B:43:0x012b, B:47:0x0132, B:50:0x0137), top: B:55:0x0117 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB VR(android.content.Context r14) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.homepage.ui.view.tab.lynx.ActivityTabContainerFragment.VR(android.content.Context):X.0qEB");
    }

    public final void WR(Bundle bundle) {
        if (bundle != null && this.LLJILJILJ == null) {
            String string = bundle.getString("top_tab_key", "");
            String string2 = bundle.getString("activity_id", "");
            long j = bundle.getLong("start_time", 0L);
            long j2 = bundle.getLong("end_time", 0L);
            String string3 = bundle.getString("activity_scheme", "");
            String string4 = bundle.getString("gecko_channal", "");
            bundle.getBoolean("gecko_force_check", true);
            this.LLJILJILJ = new C1593390rZB(string, string2, string3, j, j2, string4);
        }
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeHide(Bundle bundle) throws JSONException {
        InterfaceC1541990qEH kitView;
        C19EG activity;
        Fragment fragment;
        IMFToolBarAbility iMFToolBarAbilityLJ;
        C1593400rZC c1593400rZC = (C1593400rZC) this.LLJI.getValue();
        c1593400rZC.getClass();
        String str = null;
        if (!C1581510rG1.LIZLLL() && (activity = c1593400rZC.LIZ.getActivity()) != null && !C960203pA.LIZIZ(activity) && Intrinsics.LJFF(bundle.getString("fromStart"), "MainFragment") && !Intrinsics.LJFF(bundle.getString("toPage"), "homepage_explore") && !Intrinsics.LJFF(bundle.getString("toPage"), "Shop")) {
            AbstractC1591090rVT abstractC1591090rVTY01 = C1591880rWk.LIZIZ.LJIILL(activity).y01();
            if (abstractC1591090rVTY01 != null) {
                abstractC1591090rVTY01.LJIILIIL(true);
            }
            Object objLJIIIIZZ = ((IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class)).LJIIIIZZ(activity);
            if (objLJIIIIZZ != null && (objLJIIIIZZ instanceof Fragment) && (fragment = (Fragment) objLJIIIIZZ) != null && (iMFToolBarAbilityLJ = C1561720qk6.LJ(fragment)) != null) {
                iMFToolBarAbilityLJ.ae0(null, true);
            }
        }
        WR(getArguments());
        UR();
        JSONObject jSONObject = new JSONObject();
        C1593390rZB c1593390rZB = this.LLJILJILJ;
        if (c1593390rZB != null) {
            str = c1593390rZB.LIZIZ;
        }
        jSONObject.put("activity_id", str);
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJILJIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null) {
            kitView.LIZ("on_page_disappear", jSONObject);
        }
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeShow(Bundle bundle) throws JSONException {
        InterfaceC1541990qEH kitView;
        C19EG activity;
        EnumC1571190qzN enumC1571190qzNLJIIJJI;
        EnumC1571190qzN enumC1571190qzNLJIILIIL;
        boolean z;
        C1593400rZC c1593400rZC = (C1593400rZC) this.LLJI.getValue();
        c1593400rZC.getClass();
        String str = null;
        if (!C1581510rG1.LIZLLL() && (activity = c1593400rZC.LIZ.getActivity()) != null) {
            InterfaceC1583870rJp interfaceC1583870rJp = c1593400rZC.LIZIZ;
            if (interfaceC1583870rJp != null) {
                enumC1571190qzNLJIIJJI = interfaceC1583870rJp.LJIIJJI();
            } else {
                enumC1571190qzNLJIIJJI = null;
            }
            InterfaceC1583870rJp interfaceC1583870rJp2 = c1593400rZC.LIZIZ;
            if (interfaceC1583870rJp2 != null) {
                enumC1571190qzNLJIILIIL = interfaceC1583870rJp2.LJIILIIL();
            } else {
                enumC1571190qzNLJIILIIL = null;
            }
            IMFToolBarAbility iMFToolBarAbilityLIZIZ = C0CUL.LIZIZ(C1558360qeg.LJI(activity, null));
            if (iMFToolBarAbilityLIZIZ != null) {
                iMFToolBarAbilityLIZIZ.j6();
            }
            EnumC1571190qzN enumC1571190qzN = EnumC1571190qzN.DARK;
            if (enumC1571190qzNLJIIJJI == enumC1571190qzN) {
                if (iMFToolBarAbilityLIZIZ != null) {
                    iMFToolBarAbilityLIZIZ.ae0(null, false);
                }
            } else if (iMFToolBarAbilityLIZIZ != null) {
                iMFToolBarAbilityLIZIZ.Rt2(null, false);
            }
            AbstractC1591090rVT abstractC1591090rVTY01 = C1591880rWk.LIZIZ.LJIILL(activity).y01();
            if (abstractC1591090rVTY01 != null) {
                abstractC1591090rVTY01.LJJJLZIJ(null, enumC1571190qzNLJIILIIL);
                boolean z2 = false;
                if (enumC1571190qzNLJIILIIL == enumC1571190qzN) {
                    z = true;
                } else {
                    z = false;
                }
                abstractC1591090rVTY01.LJIIJ(z);
                if (enumC1571190qzNLJIILIIL == enumC1571190qzN) {
                    z2 = true;
                }
                abstractC1591090rVTY01.LJIILIIL(z2);
            }
        }
        WR(getArguments());
        RR();
        JSONObject jSONObject = new JSONObject();
        C1593390rZB c1593390rZB = this.LLJILJILJ;
        if (c1593390rZB != null) {
            str = c1593390rZB.LIZIZ;
        }
        jSONObject.put("activity_id", str);
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJILJIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null) {
            kitView.LIZ("on_page_appear", jSONObject);
        }
    }

    public final boolean ZR(String str, boolean z) throws JSONException {
        ViewGroup viewGroup;
        FrameLayout frameLayout;
        InterfaceC1583870rJp interfaceC1583870rJpVR1;
        Map<String, String> mapLIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enter_from", this.LLILLJJLI);
        jSONObject.put("refresh_method", str);
        HomeTabAbility homeTabAbility = (HomeTabAbility) this.LLIZLLLIL.getValue();
        if (homeTabAbility != null && (interfaceC1583870rJpVR1 = homeTabAbility.vR1(getHoxNodeTag())) != null && (mapLIZ = interfaceC1583870rJpVR1.LIZ()) != null) {
            for (Map.Entry<String, String> entry : mapLIZ.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        }
        C20684815ws.LJIJ("refresh_homepage", jSONObject);
        this.LLJJIII = 0;
        Context context = getContext();
        if (context != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBVR = VR(context);
            View view = this.LLJILLL;
            if (view != null && (frameLayout = (FrameLayout) view.findViewById(R.id.nua)) != null) {
                C786410Ut5.LJJJJIZL(frameLayout);
            }
            View view2 = this.LLJILLL;
            if (view2 != null && (viewGroup = (ViewGroup) view2.findViewById(R.id.nua)) != null) {
                viewGroup.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBVR);
            }
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBVR != null) {
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBVR.LJIIIIZZ();
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super.onViewCreated(view, bundle);
        WR(getArguments());
        C21395918oH c21395918oH = new C21395918oH();
        this.LLJJI = c21395918oH;
        c21395918oH.LLILZ = new InterfaceC1593430rZF() { // from class: X.0rZA
            @Override // X.InterfaceC1593430rZF
            public final void LJFF() throws JSONException {
                this.LIZ.ZR("no_network_retry", false);
            }
        };
        View viewFindViewById = view.findViewById(R.id.nua);
        int i2 = this.LLIZ;
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            i = marginLayoutParams.bottomMargin;
        } else {
            i = 0;
        }
        if (i != i2) {
            ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
            if (layoutParams2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.bottomMargin = i2;
                C786410Ut5.W5(viewFindViewById, marginLayoutParams2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        this.LLJJ = view.findViewById(R.id.nui);
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBVR = VR(view.getContext());
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBVR != null) {
            ((ViewGroup) view.findViewById(R.id.nua)).addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBVR);
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBVR.LJIIIIZZ();
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.cds, viewGroup, false);
        this.LLJILLL = viewTd;
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
