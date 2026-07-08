package com.ss.android.ugc.aweme.commercialize.ba.impl.ui;

import X.AbstractC1028360crq;
import X.AbstractC848400XPy;
import X.C01GW;
import X.C098200Yq;
import X.C0WOV;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C0XQ7;
import X.C1014910cW9;
import X.C1028380crs;
import X.C1029740cu4;
import X.C1051290dSp;
import X.C1548820qPI;
import X.C1685300txQ;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C1AF0;
import X.C20533215Wg;
import X.C2187451AjH;
import X.C2200821BBo;
import X.C262100zr;
import X.C341940Daq;
import X.C426750GoL;
import X.C452501pT;
import X.C616540OGe;
import X.C786410Ut5;
import X.InterfaceC1051190dSf;
import X.InterfaceC1141530foN;
import X.InterfaceC1257980iqC;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridContainerManager;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.MiniUser;
import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class BusinessPageFragment extends ProfileListFragment implements InterfaceC1257980iqC, InterfaceC1051190dSf, InterfaceC1141530foN {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2OiYlKCM6HELIOSMiBiKy59ISg8JWEmIWsOPDw6JiA/Oh8yLyAKOy40JSAiPQ==";
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public String LLJILJILJ;
    public boolean LLJJIJI;
    public Function0<Unit> LLJJIJIIJIL;
    public View LLJJIJIL;
    public AbstractC1028360crq LLJJJJJIL;
    public String LLJILLL = "others";
    public String LLJJ = "";
    public String LLJJI = "";
    public String LLJJIII = "";
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 149));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 151));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 150));

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void Bp() {
    }

    @Override // X.InterfaceC1257980iqC
    public final void LJFF() {
    }

    @Override // X.InterfaceC1206550hVF
    public final boolean LJLLL() {
        return false;
    }

    @Override // X.InterfaceC1257980iqC
    public final void PB(String str) {
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void cS(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final boolean isEmpty() {
        return false;
    }

    @Override // X.InterfaceC1257980iqC
    public final void q3(boolean z) {
    }

    public final void BS() {
        AbstractC1028360crq abstractC1028360crq = this.LLJJJJJIL;
        if (abstractC1028360crq != null) {
            abstractC1028360crq.LJJ((C1051290dSp) this.LLJJJIL.getValue(), this, null);
            return;
        }
        C1028380crs c1028380crsYS = yS();
        AbstractC1028360crq abstractC1028360crqLIZLLL = c1028380crsYS != null ? ((IAdHybridContainerManager) ServiceManager.get().getService(IAdHybridContainerManager.class)).LIZLLL(c1028380crsYS, (C1051290dSp) this.LLJJJJ.getValue()) : null;
        this.LLJJJJJIL = abstractC1028360crqLIZLLL;
        if (abstractC1028360crqLIZLLL != null) {
            abstractC1028360crqLIZLLL.LJJ((C1051290dSp) this.LLJJJJ.getValue(), this, null);
        }
    }

    @Override // X.InterfaceC1258040iqI
    public final View LJJLIIIJILLIZJL() {
        ScrollView scrollViewWS = wS(this.LLJJIJIL);
        if (scrollViewWS != null) {
            return scrollViewWS;
        }
        Context context = getContext();
        if (context != null) {
            return new ScrollView(context);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        AbstractC1028360crq abstractC1028360crq = this.LLJJJJJIL;
        if (abstractC1028360crq != null) {
            abstractC1028360crq.LJIJJLI();
            abstractC1028360crq.LJIIIIZZ();
        }
        this.LLJJJJJIL = null;
        C1548820qPI.LJIIIIZZ("switch_to_shop", this);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        ViewGroup viewGroup;
        View view;
        ViewGroup viewGroup2;
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(BusinessPageFragment.class.getName());
        }
        super.onResume();
        View view2 = getView();
        if (!(view2 instanceof ViewGroup) || (viewGroup = (ViewGroup) view2) == null || (view = this.LLJJIJIL) == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJLZIJ(this.LLJJIJIL, viewGroup2);
        }
        C786410Ut5.LJJJJI(viewGroup);
        viewGroup.addView(view);
    }

    public final C1028380crs yS() {
        Context context = getContext();
        if (context != null) {
            return new C1028380crs("profile_business_page", C0WOV.SPARK, context, new C1029740cu4(null, null, null, null, null, null, false, 127));
        }
        return null;
    }

    public final void zS() {
        ViewGroup viewGroup;
        String string;
        String strJ4;
        if (isViewValid()) {
            if (this.LLJ || this.LLILZLL || this.LLIZ || this.LLIZLLLIL || this.LLJI) {
                View view = getView();
                if (!(view instanceof ViewGroup) || (viewGroup = (ViewGroup) view) == null) {
                    return;
                }
                C786410Ut5.LJJJJI(viewGroup);
                if (this.LLJ) {
                    string = getString(2131822989);
                    strJ4 = getString(2131822987);
                } else if (this.LLIZLLLIL) {
                    string = getString(2131822977);
                    String string2 = getString(2131822976);
                    Object[] objArr = new Object[1];
                    String str = this.LLJJ;
                    if (str == null) {
                        str = "";
                    }
                    objArr[0] = str;
                    strJ4 = C786410Ut5.j4(string2, Arrays.copyOf(objArr, 1));
                } else {
                    string = "";
                    strJ4 = "";
                }
                if (this.LLJI) {
                    string = getString(2131824639);
                    strJ4 = getString(2131824638);
                } else if (this.LLILZLL) {
                    String string3 = getString(2131822983);
                    strJ4 = getString(2131822982);
                    Object[] objArr2 = new Object[1];
                    String str2 = this.LLJJ;
                    objArr2[0] = str2 != null ? str2 : "";
                    string = C786410Ut5.j4(string3, Arrays.copyOf(objArr2, 1));
                } else if (this.LLIZ) {
                    string = getString(2131822989);
                    strJ4 = getString(2131822987);
                }
                Context context = getContext();
                if (context != null) {
                    C1749280vcc c1749280vcc = new C1749280vcc(context, null, 6);
                    c1749280vcc.setTopMargin(C341940Daq.LIZ(40.0d));
                    c1749280vcc.setLayoutVariant(1);
                    C1722300uv6 c1722300uv6 = new C1722300uv6();
                    c1722300uv6.LJI = string;
                    c1722300uv6.LJIIIIZZ = strJ4;
                    c1749280vcc.setStatus(c1722300uv6);
                    viewGroup.addView(c1749280vcc);
                    this.LLJIJIL = true;
                }
            }
        }
    }

    public static ScrollView wS(View view) {
        if (view instanceof ScrollView) {
            return (ScrollView) view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                ScrollView scrollViewWS = wS(viewGroup.getChildAt(i));
                if (scrollViewWS != null) {
                    return scrollViewWS;
                }
            }
            return null;
        }
        return null;
    }

    @Override // X.InterfaceC1051190dSf
    public final void A9(C1014910cW9 c1014910cW9) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        Resources resources;
        View view = getView();
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            C786410Ut5.LJJJJI(viewGroup);
            this.LLJJIJIL = null;
            View view2 = c1014910cW9.LIZ;
            this.LLJILJIL = true;
            C786410Ut5.W5(view2, new ViewGroup.LayoutParams(-1, -1));
            if (this.LLJJIJI) {
                int dimension = 0;
                Context context = view2.getContext();
                if (context != null && (resources = context.getResources()) != null) {
                    dimension = (int) resources.getDimension(R.dimen.a3q);
                }
                C426750GoL.LJIIL(view2, 0, 0, 0, Integer.valueOf(dimension), 16);
            }
            this.LLJJIJIL = view2;
            ViewParent parent = view2.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(this.LLJJIJIL, viewGroup2);
            }
            viewGroup.addView(this.LLJJIJIL);
            AbstractC1028360crq abstractC1028360crq = this.LLJJJJJIL;
            if (abstractC1028360crq != null) {
                abstractC1028360crq.LJIILJJIL();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void HP(boolean z) {
        this.LLIZLLLIL = z;
    }

    @Override // X.InterfaceC1206550hVF
    public final void Ii(boolean z) {
        zS();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void Sl(boolean z) {
        this.LLJ = z;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void Wb(boolean z) {
        this.LLILZLL = z;
        if (z) {
            zS();
        } else {
            if (!this.LLJIJIL) {
                return;
            }
            BS();
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        Function0<Unit> function0 = null;
        if (Intrinsics.LJFF(c262100zr.LIZ, "switch_to_shop")) {
            ((AbstractC848400XPy) C0XQ7.LJFF()).LJI();
            Function0<Unit> function02 = this.LLJJIJIIJIL;
            if (function02 != null) {
                function0 = function02;
            }
            function0.invoke();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        String string2;
        String string3;
        String string4;
        super.onCreate(bundle);
        C1548820qPI.LIZLLL("switch_to_shop", this);
        Bundle arguments = getArguments();
        String string5 = null;
        if (arguments != null) {
            string = arguments.getString("author_id");
        } else {
            string = null;
        }
        this.LLJILJILJ = string;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            string2 = arguments2.getString("enter_from");
        } else {
            string2 = null;
        }
        this.LLJILLL = String.valueOf(string2);
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            string3 = arguments3.getString("user_handle");
        } else {
            string3 = null;
        }
        this.LLJJ = String.valueOf(string3);
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            string4 = arguments4.getString("web_url");
        } else {
            string4 = null;
        }
        this.LLJJI = String.valueOf(string4);
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            string5 = arguments5.getString("secure_web_url");
        }
        this.LLJJIII = String.valueOf(string5);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void ro(boolean z) {
        this.LLIZ = z;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/commercialize/ba/impl/ui/BusinessPageFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLLzjHP2aI3/COMumC2mTqQHYsrsUcWQahA2ifqZJW0S2vPms9i1yL9NA==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        if (z) {
            if (!this.LLJ && !this.LLILZLL && !this.LLIZ && !this.LLIZLLLIL && !this.LLJI) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("web_url", this.LLJJI);
                jSONObject.put("secure_web_url", this.LLJJIII);
                AbstractC1028360crq abstractC1028360crq = this.LLJJJJJIL;
                if (abstractC1028360crq != null) {
                    abstractC1028360crq.LJIIJJI("biz_page_refreshed", jSONObject);
                }
                if (!this.LLJILJIL) {
                    BS();
                }
            } else {
                zS();
            }
        }
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(BusinessPageFragment.class);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void vs(boolean z) {
        this.LLJI = z;
    }

    @Override // X.InterfaceC1257980iqC
    public final void za(MiniUser miniUser) {
        this.LLJJI = miniUser.bioUrl;
        this.LLJJIII = miniUser.bioSecureUrl;
        if (getUserVisibleHint()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("web_url", this.LLJJI);
                jSONObject.put("secure_web_url", this.LLJJIII);
                AbstractC1028360crq abstractC1028360crq = this.LLJJJJJIL;
                if (abstractC1028360crq != null) {
                    abstractC1028360crq.LJIIJJI("biz_page_refreshed", jSONObject);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
        }
    }

    @Override // X.InterfaceC1051190dSf
    public final void k3(String str, String str2) {
        this.LLJILJIL = false;
        AbstractC1028360crq abstractC1028360crq = this.LLJJJJJIL;
        if (abstractC1028360crq != null) {
            abstractC1028360crq.LJIILIIL(str2, str);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("enable_preload_biz_page", true)) {
            C1028380crs c1028380crsYS = yS();
            AbstractC1028360crq abstractC1028360crqLIZIZ = null;
            if (c1028380crsYS != null) {
                abstractC1028360crqLIZIZ = ((IAdHybridContainerManager) ServiceManager.get().getService(IAdHybridContainerManager.class)).LIZIZ(c1028380crsYS, (C1051290dSp) this.LLJJJIL.getValue(), null);
            }
            this.LLJJJJJIL = abstractC1028360crqLIZIZ;
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        FrameLayout frameLayout = new FrameLayout(requireContext());
        try {
            ViewTreeLifecycleOwner.set(frameLayout, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(frameLayout, this);
            frameLayout.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return frameLayout;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return frameLayout;
        }
    }
}
