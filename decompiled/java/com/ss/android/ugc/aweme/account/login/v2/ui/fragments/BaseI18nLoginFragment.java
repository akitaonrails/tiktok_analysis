package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.C01GW;
import X.C036E;
import X.C098200Yq;
import X.C0HZQ;
import X.C1237010iIN;
import X.C13BV;
import X.C1685300txQ;
import X.C1766560w4U;
import X.C189200o6;
import X.C19276210bA;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C2187451AjH;
import X.C427480GpW;
import X.C452501pT;
import X.C616540OGe;
import X.C786410Ut5;
import X.C852150Xbp;
import X.C852810Xct;
import X.C853750XeP;
import X.C854460XfY;
import X.InterfaceC1232290iAl;
import X.InterfaceC1740760vOs;
import Y.ACListenerS154S0100000_19;
import Y.ACListenerS85S0300000_19;
import Y.AObserverS217S0100000_13;
import Y.AObserverS223S0100000_19;
import Y.ARunnableS88S0200000_19;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.account.eventtracking.bindings.BackToPreviousPageEvent;
import com.ss.android.ugc.aweme.account.login.v2.base.AccountFlowFragmentViewModel;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.AccountKeyBoardHelper;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public abstract class BaseI18nLoginFragment extends BaseAccountFlowFragment implements InterfaceC1232290iAl, InterfaceC1740760vOs {
    public static final /* synthetic */ int LLLIIL = 0;
    public LinearLayout LLJJJJ;
    public C427480GpW LLJJJJJIL;
    public TuxNavBar LLJJJJLIIL;
    public TuxTextView LLJJL;
    public C197039127h LLJJLIIIJLLLLLLLZ;
    public ConstraintLayout LLJL;
    public TuxTextView LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public C197039127h LLJLL;
    public LinearLayout LLJLLIL;
    public AccountKeyBoardHelper LLJLLL;
    public C1237010iIN LLJZ;
    public boolean LLJZIJLIL;
    public boolean LLL;
    public C0HZQ LLLF;
    public View LLLFZ;
    public TextView LLLI;
    public View LLLII;
    public TextView LLLIIII;
    public TextView LLLIIIIL;
    public final String LLLFF = "";
    public final C01GW LLLFFI = C452501pT.LIZIZ(new AwS557S0100000_13(this, 64));
    public final C01GW LLLIIIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 239));

    public void ES() {
        this.LLL = true;
        C19EG activity = getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    public abstract void HS();

    public void LLIIIZ() {
    }

    public abstract void aS();

    public void bS() {
    }

    public void clearFromXmlViewCache() {
        this.LLJJJJ = null;
        this.LLJJJJJIL = null;
        this.LLJJJJLIIL = null;
        this.LLJJL = null;
        this.LLJJLIIIJLLLLLLLZ = null;
        this.LLJL = null;
        this.LLJLIL = null;
        this.LLJLILLLLZIIL = null;
        this.LLJLL = null;
        this.LLJLLIL = null;
    }

    public abstract C1237010iIN iS();

    public void ln() {
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    public abstract int sS();

    public final ConstraintLayout cS() {
        View viewFindViewById = this.LLJL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.btr) : null;
            this.LLJL = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    public final TuxTextView dS() {
        View viewFindViewById = this.LLJJL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.bto) : null;
            this.LLJJL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxNavBar gS() {
        View viewFindViewById = this.LLJJJJLIIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.btp) : null;
            this.LLJJJJLIIL = (TuxNavBar) viewFindViewById;
        }
        return (TuxNavBar) viewFindViewById;
    }

    public final TuxTextView kS() {
        View viewFindViewById = this.LLJLILLLLZIIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ev2) : null;
            this.LLJLILLLLZIIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView mS() {
        View viewFindViewById = this.LLJLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ewu) : null;
            this.LLJLIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final C197039127h nS() {
        View viewFindViewById = this.LLJJLIIIJLLLLLLLZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.fak) : null;
            this.LLJJLIIIJLLLLLLLZ = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final C197039127h oS() {
        View viewFindViewById = this.LLJLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.fal) : null;
            this.LLJLL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public boolean onBackPressed() {
        String string;
        String string2;
        C854460XfY c854460XfY = C854460XfY.LIZ;
        String enterMethod = getEnterMethod();
        String strRR = RR();
        c854460XfY.getClass();
        if (!C854460XfY.LJIILIIL(enterMethod, strRR)) {
            return false;
        }
        BackToPreviousPageEvent backToPreviousPageEvent = new BackToPreviousPageEvent();
        backToPreviousPageEvent.LJI(getEnterFrom(), "enter_from");
        backToPreviousPageEvent.LJI(this.LLL ? "click_go_back" : "press_back", "enter_method");
        backToPreviousPageEvent.LJI(RR(), "page");
        C852810Xct c852810Xct = C852810Xct.LIZ;
        Bundle arguments = getArguments();
        c852810Xct.getClass();
        String str = "";
        if (arguments == null || (string = arguments.getString("previous_page_name")) == null) {
            string = "";
        }
        backToPreviousPageEvent.LJI(string, "current_page");
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string2 = arguments2.getString("current_page_name")) != null) {
            str = string2;
        }
        backToPreviousPageEvent.LJI(str, "pre_page");
        backToPreviousPageEvent.LJIIIIZZ();
        return false;
    }

    public final boolean rS() {
        return ((Boolean) this.LLLFFI.getValue()).booleanValue();
    }

    public final LinearLayout uS() {
        View viewFindViewById = this.LLJJJJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.npj) : null;
            this.LLJJJJ = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final boolean BS() {
        getContext();
        try {
            if (C036E.LIZ.LIZIZ()) {
                return true;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        pn(0, getString(2131837962));
        return false;
    }

    public final void FS() {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(getContext(), "aweme://account_recover");
        smartRouteBuildRoute.withParam("feedback_id", "6437");
        smartRouteBuildRoute.withParam("from_type", "");
        smartRouteBuildRoute.withParam("group", CardStruct.IStatusCode.DEFAULT);
        smartRouteBuildRoute.withParam("enter_from", getEnterFrom());
        smartRouteBuildRoute.withAnimation(R.anim.fv, R.anim.aa);
        smartRouteBuildRoute.open();
    }

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return C852150Xbp.LIZ(VR());
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        aS();
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        AccountKeyBoardHelper accountKeyBoardHelper = this.LLJLLL;
        if (accountKeyBoardHelper != null) {
            accountKeyBoardHelper.LLIZLLLIL = null;
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(getClass().getName());
        }
        super.onResume();
        AccountKeyBoardHelper accountKeyBoardHelper = this.LLJLLL;
        if (accountKeyBoardHelper != null) {
            accountKeyBoardHelper.LLIZLLLIL = this;
        }
    }

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return String.valueOf(hashCode());
    }

    public final boolean wS() {
        Bundle arguments = getArguments();
        return !((arguments == null || arguments.getBoolean("ocl_checkbox_checked", true)) ? false : true);
    }

    public final boolean zS() {
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.getBoolean("is_from_optional_signup", false)) {
            return false;
        }
        SettingsManager.LIZLLL().getClass();
        return !SettingsManager.LIZ("optional_signup_secondary_pii", false);
    }

    public String hS() {
        return this.LLLFF;
    }

    public List<View> qS() {
        return C13BV.INSTANCE;
    }

    public final void JS(Bundle bundle) {
        boolean z;
        C0HZQ c0hzq = this.LLLF;
        if (c0hzq != null) {
            bundle.putBoolean("ocl_checkbox_checked", c0hzq.isChecked());
            C786410Ut5.LJJJI("channel_for_ocl", hS(), bundle);
            if (this.LLLF != null) {
                z = true;
            } else {
                z = false;
            }
            bundle.putBoolean("ocl_checkbox_shown", z);
        }
    }

    public void dk(int i) {
        if (i != 0) {
            if (i == 1) {
                if (isViewValid()) {
                    HS();
                    return;
                } else {
                    this.LLJZIJLIL = true;
                    return;
                }
            }
            return;
        }
        if (isViewValid()) {
            if (C19276210bA.LIZJ()) {
                return;
            }
            aS();
        } else {
            if (!this.LLJZIJLIL) {
                return;
            }
            this.LLJZIJLIL = false;
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        View view;
        super.onConfigurationChanged(configuration);
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("foldable_account_layout_readapt_rollback_android", false) || (view = getView()) == null) {
            return;
        }
        HandlerHook.viewPost(view, new ARunnableS88S0200000_19(this, view, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x0333  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void yS(X.C1237010iIN r15) {
        /*
            Method dump skipped, instruction units count: 1199
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment.yS(X.0iIN):void");
    }

    public final void GS(View.OnClickListener onClickListener, View view) {
        if (view == null) {
            return;
        }
        C786410Ut5.I7(new ACListenerS85S0300000_19(view, this, onClickListener, 18), view);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
        tuxImmersionBarLIZLLL.LJ(R.attr.bx);
        tuxImmersionBarLIZLLL.LJIIIIZZ(R.attr.bx);
        tuxImmersionBarLIZLLL.LIZ(true);
        tuxImmersionBarLIZLLL.LIZLLL();
        this.LLLFZ = view.findViewById(R.id.flu);
        this.LLLI = (TextView) view.findViewById(R.id.flw);
        this.LLLII = view.findViewById(R.id.flx);
        this.LLLIIII = (TextView) view.findViewById(R.id.fm0);
        this.LLLIIIIL = (TextView) view.findViewById(R.id.fly);
        View viewFindViewById = null;
        if (OR().yQ2()) {
            OR().LLILLJJLI.observe(getViewLifecycleOwner(), new AObserverS217S0100000_13(this, 16));
            ((AccountFlowFragmentViewModel) this.LLILLJJLI.getValue()).LLILLJJLI.observe(getViewLifecycleOwner(), new AObserverS223S0100000_19(this, 55));
        } else {
            yS(null);
        }
        C1237010iIN c1237010iIN = this.LLJZ;
        if (c1237010iIN != null && c1237010iIN.LJIIJ) {
            this.LLJLLL = new AccountKeyBoardHelper(uS(), this);
        }
        C1237010iIN c1237010iIN2 = this.LLJZ;
        if (c1237010iIN2 != null && c1237010iIN2.LJIILJJIL) {
            C01GW<Boolean> c01gw = AccountKeyBoardHelper.LLJ;
            if (!C853750XeP.LIZ()) {
                C786410Ut5.I7(new ACListenerS154S0100000_19(view, 56), view);
            }
        }
        Bundle arguments = getArguments();
        if (arguments != null && (i = arguments.getInt("progress", -1)) >= 0) {
            View view2 = this.LLJJJJJIL;
            if (view2 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById = view3.findViewById(R.id.s8q);
                }
                this.LLJJJJJIL = (C427480GpW) viewFindViewById;
                view2 = viewFindViewById;
            }
            C427480GpW c427480GpW = (C427480GpW) view2;
            C786410Ut5.LLZIL(c427480GpW, 0);
            c427480GpW.setProgress(i);
            c427480GpW.setAutoDisappear(false);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        Window window;
        C19EG activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(20);
        }
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.a08, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof LinearLayout)) {
            viewTd = null;
        }
        if (viewTd != null) {
            viewGroup2 = (ViewGroup) viewTd.findViewById(R.id.eux);
        } else {
            viewGroup2 = null;
        }
        if (viewGroup2 != null) {
            int iSS = sS();
            if (viewTd != null) {
                viewGroup3 = (ViewGroup) viewTd.findViewById(R.id.eux);
            } else {
                viewGroup3 = null;
            }
            viewGroup2.addView(C786410Ut5.Td(layoutInflater, iSS, viewGroup3, false));
        }
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity2 = getActivity();
                if (activity2 instanceof C19GS) {
                    c19gs = (C19GS) activity2;
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
