package com.ss.android.ugc.profile.platform.framework.aweme.profile.ui;

import X.C098200Yq;
import X.C0C64;
import X.C0QSJ;
import X.C0SXF;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1075590e61;
import X.C11NJ;
import X.C1250680ieQ;
import X.C1253690ijH;
import X.C1265780j2m;
import X.C1388190mED;
import X.C15O7;
import X.C1685300txQ;
import X.C189200o6;
import X.C19252910Tv;
import X.C19EG;
import X.C19GS;
import X.C1EE2;
import X.C20673215v0;
import X.C20684815ws;
import X.C214820195e;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2537109wv;
import X.C268330AfP;
import X.C300140Bpc;
import X.C455790Hu5;
import X.C487280J9a;
import X.C497270Jen;
import X.C616540OGe;
import X.C673150Qan;
import X.C687700QyG;
import X.C960203pA;
import X.InterfaceC1146704e9;
import X.InterfaceC1603190roz;
import X.InterfaceC487330J9f;
import X.InterfaceC614560O8o;
import X.InterfaceC687730QyJ;
import X.InterfaceC744170THb;
import X.ViewOnAttachStateChangeListenerC1265900j2y;
import Y.ACallableS5S1101100_19;
import Y.AObjectS362S0100000_19;
import Y.ARunnableS119S0100000_19;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.ui.experiment.EasyNavigationExperimentServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.screenshot.IScreenshotService;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.profile.business.profile.ui.v2.I18nMyProfileFragment;
import com.ss.android.ugc.profile.business.profile.ui.v2.I18nUserProfileFragment;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.ProfileState;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.ProfileViewModel;
import com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformScope;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS0S1010100_19;
import kotlin.jvm.internal.AwS592S0100000_13;

/* JADX INFO: loaded from: classes20.dex */
public abstract class I18nAbsProfileFragmentV2 extends AmeBaseFragment implements InterfaceC614560O8o, InterfaceC487330J9f, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ int LLJJJ = 0;
    public String LL;
    public String LLILLJJLI;
    public View LLILLL;
    public View LLILZ;
    public String LLILZIL;
    public String LLILZLL = "";
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public User LLJI;
    public ViewGroup LLJIJIL;
    public AnalysisStayTimeFragmentComponent LLJILJIL;
    public ProfileViewModel LLJILJILJ;
    public C214820195e LLJILLL;
    public Boolean LLJJ;
    public Boolean LLJJI;
    public Boolean LLJJIII;
    public final C11NJ LLJJIJI;
    public C1253690ijH LLJJIJIIJIL;
    public long LLJJIJIL;

    public abstract int MR();

    public abstract boolean PR();

    public void RR() {
    }

    public final void WR() {
        if (this.LLJJIJIL > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJJIJIL;
            if (jCurrentTimeMillis > 0) {
                C15O7.LIZIZ(new ACallableS5S1101100_19(this, PR() ? "personal_homepage" : "others_homepage", jCurrentTimeMillis, this.LLIZ, 1), C20684815ws.LJFF(), null);
            }
            this.LLJJIJIL = -1L;
        }
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    public void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ProfilePlatformScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    public List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ProfilePlatformScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ProfilePlatformScope.class);
        return arrayList;
    }

    public void initData() {
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public boolean isRegisterEventBus() {
        return true;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public Map<String, String> NR() {
        return new HashMap();
    }

    public I18nAbsProfileFragmentV2() {
        Boolean bool = Boolean.FALSE;
        this.LLJJ = bool;
        this.LLJJI = Boolean.TRUE;
        this.LLJJIII = bool;
        this.LLJJIJI = new C11NJ();
        this.LLJJIJIL = -1L;
    }

    private void SR() {
        ((IScreenshotService) ServiceManager.get().getService(IScreenshotService.class)).LIZJ(PR() ? "personal_homepage" : "others_homepage");
    }

    private void UR() {
        String str = PR() ? "personal_homepage" : "others_homepage";
        IScreenshotService iScreenshotService = (IScreenshotService) ServiceManager.get().getService(IScreenshotService.class);
        this.LLJJIJIIJIL = new C1253690ijH(str);
        SR();
        iScreenshotService.LJI(str, this.LLJJIJIIJIL);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.LLJJIJI.dispose();
        if (C19252910Tv.LIZIZ.LIZLLL().LJI().LLLII()) {
            C487280J9a.LIZJ(this);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        SR();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(getClass().getName());
        }
        super.onResume();
        this.LLJJIJIL = System.currentTimeMillis();
        if (this.LLJJIII.booleanValue()) {
            UR();
        }
    }

    public void OR(View view) {
        view.setBackgroundColor(C960203pA.LIZ(R.attr.bx, getContext()));
    }

    public final void VR(boolean z) {
        boolean z2;
        C19EG activity = getActivity();
        if (activity == null) {
            return;
        }
        C1EE2 c1ee2 = C1EE2.LIZIZ;
        if (c1ee2.LJJJZ(activity)) {
            return;
        }
        if ((activity.getWindow().getDecorView().getSystemUiVisibility() & 8192) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            if (z2) {
                return;
            }
            C497270Jen.LJFF(activity);
            if (C960203pA.LIZIZ(activity)) {
                C455790Hu5.LIZ(activity);
                return;
            } else {
                C497270Jen.LIZJ(activity);
                return;
            }
        }
        if (activity instanceof InterfaceC1603190roz) {
            EasyNavigationExperimentServiceImpl.LIZIZ().LIZ(activity);
        }
        if (!c1ee2.LJJJZ(activity)) {
            C497270Jen.LJFF(activity);
            activity.getWindow().getDecorView().setSystemUiVisibility(1024);
        }
    }

    public void initView(View view) {
        View viewFindViewById = view.findViewById(R.id.w0u);
        this.LLILZ = viewFindViewById;
        viewFindViewById.getLayoutParams().height = C0SXF.LJIIZILJ(getActivity());
        if (!C268330AfP.LJIIIZ() && C2537109wv.LJIIIIZZ()) {
            this.LLJIJIL = (ViewGroup) view.findViewById(R.id.s11);
        } else {
            this.LLJIJIL = (ViewGroup) view.findViewById(R.id.eqx);
        }
        AnalysisStayTimeFragmentComponent analysisStayTimeFragmentComponent = new AnalysisStayTimeFragmentComponent(this);
        this.LLJILJIL = analysisStayTimeFragmentComponent;
        analysisStayTimeFragmentComponent.LLILZ = new InterfaceC744170THb() { // from class: X.0iit
            @Override // X.InterfaceC744170THb
            public final C1386470mBR LIZ(C1386470mBR c1386470mBR) {
                for (Map.Entry<String, String> entry : this.LIZ.NR().entrySet()) {
                    c1386470mBR.LJ(entry.getKey(), entry.getValue());
                }
                return c1386470mBR;
            }
        };
        try {
            view.findViewById(R.id.y08).setOnTouchListener(new View.OnTouchListener() { // from class: X.0ij9
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return true;
                }
            });
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        this.LLJJIII = Boolean.valueOf(!PR());
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        ProfileViewModel profileViewModelLIZ = C1075590e61.LIZ(this);
        this.LLJILJILJ = profileViewModelLIZ;
        JediViewModel.bR2(profileViewModelLIZ, new C2217381BqS() { // from class: X.0ij1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((ProfileState) obj).getCurTabType());
            }
        }, null, new AwS592S0100000_13(new AObjectS362S0100000_19(this, 18), 94), 2, null);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Activity activityLIZ;
        super.onCreate(bundle);
        if (!C19252910Tv.LIZIZ.LIZLLL().LJI().LLLII() || getContext() == null || (activityLIZ = C1388190mED.LIZ(getContext())) == null) {
            return;
        }
        C487280J9a.LIZ(activityLIZ.hashCode(), this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/ss/android/ugc/profile/platform/framework/aweme/profile/ui/I18nAbsProfileFragmentV2", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mc5PPyDR0YS/W4tNR7d3eDWYJLHJF0jXFoPO/kpXD3cFfbydfTcSr9ygnuCqm7BbhEh74695CORwfkYXo", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.onHiddenChanged(z);
        AnalysisStayTimeFragmentComponent analysisStayTimeFragmentComponent = this.LLJILJIL;
        if (analysisStayTimeFragmentComponent != null) {
            analysisStayTimeFragmentComponent.LIZIZ(!z);
        }
        if (z) {
            WR();
            SR();
        } else {
            this.LLJJIJIL = System.currentTimeMillis();
            UR();
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("profile_cur_pos", this.LLIZ);
        bundle.putInt("indicator_scroll_maxx", this.LLJ);
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/profile/platform/framework/aweme/profile/ui/I18nAbsProfileFragmentV2", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mc5PPyDR0YS/W4tNR7d3eDWYJLHJF0jXFoPO/kpXD3cFfbydfTcSr9ygnuCqm7BbhEh74695CORwfkYXo", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        this.LLJJIII = Boolean.valueOf(z);
        if (z) {
            UR();
            VR(true);
        } else {
            SR();
            VR(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        boolean zLJI = MethodIDManager.LJI(71708);
        super.onViewCreated(view, bundle);
        WeakReference weakReference = new WeakReference(this);
        if (C300140Bpc.LIZ() && getActivity() != null) {
            LifecycleOwner lifecycleOwnerLIZLLL = ((IDetailFeedSafService) ServiceManager.get().getService(IDetailFeedSafService.class)).LIZLLL(this);
            if (C1EE2.LIZIZ.LJJIIZI(this)) {
                OnBackPressedDispatcher onBackPressedDispatcher = getActivity().getOnBackPressedDispatcher();
                if (lifecycleOwnerLIZLLL == null) {
                    lifecycleOwnerLIZLLL = getViewLifecycleOwner();
                }
                onBackPressedDispatcher.LIZ(lifecycleOwnerLIZLLL, new C1265780j2m(weakReference, 7));
            } else if (lifecycleOwnerLIZLLL != null) {
                getActivity().getOnBackPressedDispatcher().LIZ(lifecycleOwnerLIZLLL, new C1265780j2m(this, 8));
            } else {
                getActivity().getOnBackPressedDispatcher().LIZIZ(new C1265780j2m(this, 9));
            }
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "is_release_window_background", true, true)) {
            view.setBackgroundColor(-1);
        }
        this.LLILLL = view;
        if (bundle != null) {
            this.LLIZ = bundle.getInt("profile_cur_pos", 0);
            this.LLJ = bundle.getInt("indicator_scroll_maxx", 0);
        }
        initView(view);
        OR(view);
        initData();
        if (!PR()) {
            this.LLILZ.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1265900j2y(this, 5));
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C19GS c19gs = null;
        this.LLJILLL = null;
        View viewLIZJ = C20673215v0.LIZJ(MR(), getActivity());
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCreateView cost time: ");
        sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this instanceof I18nMyProfileFragment) {
            str = "v3_platform_create_layout";
        } else if (this instanceof I18nUserProfileFragment) {
            str = "v2_user_create_layout";
        } else {
            str = "";
        }
        C1250680ieQ c1250680ieQ = C1250680ieQ.LIZ;
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        boolean zPR = PR();
        c1250680ieQ.getClass();
        C20684815ws.LJFF().execute(new ARunnableS119S0100000_19((Function0) new AwS0S1010100_19(jCurrentTimeMillis2, str, zPR, 1), 222));
        if (!(viewLIZJ instanceof View)) {
            viewLIZJ = null;
        }
        if (viewLIZJ != null) {
            try {
                ViewTreeLifecycleOwner.set(viewLIZJ, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewLIZJ, this);
                viewLIZJ.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewLIZJ;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewLIZJ;
    }
}
