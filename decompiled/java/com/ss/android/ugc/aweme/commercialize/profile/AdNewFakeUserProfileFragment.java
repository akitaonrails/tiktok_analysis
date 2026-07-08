package com.ss.android.ugc.aweme.commercialize.profile;

import X.C01GW;
import X.C098200Yq;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1017070cZd;
import X.C1017180cZo;
import X.C1022030chd;
import X.C1035020d2a;
import X.C1260280itu;
import X.C14LC;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20533215Wg;
import X.C2184171Adz;
import X.C2200821BBo;
import X.C452501pT;
import X.C497270Jen;
import X.C786410Ut5;
import X.InterfaceC1054930dYh;
import X.InterfaceC1260330itz;
import Y.ACListenerS151S0100000_16;
import Y.AObjectS391S0100000_16;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class AdNewFakeUserProfileFragment extends CommonPageFragment implements InterfaceC1054930dYh {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2OiYlKCM6MiHELIOSBiOT08LiwgLGESLAspPgkyIyAZOiohGDcjLyY/LQM+KCg+LSs4";
    public ConstraintLayout LL;
    public ConstraintLayout LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public ConstraintLayout LLILZIL;
    public C1260280itu LLILZLL;
    public TuxIconView LLIZ;
    public TuxIconView LLIZLLLIL;
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 188));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS560S0100000_16(this, 190));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 191));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 186));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 185));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 189));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 184));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS560S0100000_16(this, 187));
    public Aweme LLJJIII;
    public DataCenter LLJJIJI;
    public Function0<Unit> LLJJIJIIJIL;
    public WidgetManager LLJJIJIL;

    @Override // X.InterfaceC1054930dYh
    public final void PG() {
    }

    @Override // X.InterfaceC1054930dYh
    public final Fragment Ui() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        AwemeRawAd awemeRawAd = null;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/commercialize/profile/AdNewFakeUserProfileFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLLzjHP2aI3/COMqHP3lj6MFIsfLOuDYE18hFG7IrftK1S8anTPqTDFMYO0nG4M", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        C497270Jen.LJFF(getActivity());
        if (z) {
            C19EG activity = getActivity();
            if (activity != null) {
                activity.getWindow().getDecorView().setSystemUiVisibility(activity.getWindow().getDecorView().getSystemUiVisibility() | 8192);
            }
        } else {
            C19EG activity2 = getActivity();
            if (activity2 != null) {
                activity2.getWindow().getDecorView().setSystemUiVisibility(1024);
            }
        }
        DataCenter dataCenter = this.LLJJIJI;
        if (dataCenter != null) {
            dataCenter.zQ2(Boolean.valueOf(z), "AD_PROFILE_VISIBILITY_CHANGED");
        }
        if (!z) {
            Aweme aweme = this.LLJJIII;
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            }
            C2184171Adz.LIZLLL("homepage_ad", "close", awemeRawAd).LJII();
            ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILLL(this.LLJJIII);
        }
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(AdNewFakeUserProfileFragment.class);
        }
    }

    @Override // X.InterfaceC1054930dYh
    public final void setVisible(boolean z) throws Throwable {
        setUserVisibleHint(z);
    }

    @Override // X.InterfaceC1054930dYh
    public final void wC(AObjectS391S0100000_16 aObjectS391S0100000_16) {
        C786410Ut5.I7(new ACListenerS151S0100000_16(aObjectS391S0100000_16, 26), (View) this.LLJJ.getValue());
        this.LLJJIJIIJIL = aObjectS391S0100000_16;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        Aweme aweme;
        String nickname;
        boolean z;
        boolean z2;
        AwemeRawAd awemeRawAd;
        User author;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("aweme_id");
        } else {
            string = null;
        }
        this.LLJJIII = C1022030chd.LJII(string);
        DataCenter dataCenterVQ2 = DataCenter.vQ2(ViewModelProviders.of(this), this);
        this.LLJJIJI = dataCenterVQ2;
        C1035020d2a c1035020d2a = new C1035020d2a();
        new AwS595S0100000_16(this, 78).invoke(c1035020d2a.LIZ);
        dataCenterVQ2.zQ2(c1035020d2a.LIZ, "AD_PROFILE_PARAMS");
        ViewGroup.LayoutParams layoutParams = ((View) this.LLJI.getValue()).getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.topMargin = C14LC.LIZLLL(getContext());
            C786410Ut5.m6((ConstraintLayout) this.LLJI.getValue(), marginLayoutParams);
        }
        Aweme aweme2 = this.LLJJIII;
        if ((aweme2 == null || !C1017070cZd.LLJL(aweme2)) && ((aweme = this.LLJJIII) == null || !C1017070cZd.LLJJL(aweme))) {
            C786410Ut5.LJLZ(8, (ViewGroup) this.LLJILJILJ.getValue());
        }
        TextView textView = (TextView) this.LLJIJIL.getValue();
        Aweme aweme3 = this.LLJJIII;
        if (aweme3 != null && (author = aweme3.getAuthor()) != null) {
            nickname = author.getNickname();
        } else {
            nickname = null;
        }
        textView.setText(nickname);
        ((C1260280itu) this.LLJILLL.getValue()).LJ(new InterfaceC1260330itz() { // from class: X.0dTp
            @Override // X.InterfaceC1260330itz
            public final boolean onScrollEnd() {
                return false;
            }

            @Override // X.InterfaceC1260330itz
            public final void onScrolled(float f, float f2) {
            }

            @Override // X.InterfaceC1260330itz
            public final void onScroll(int i, int i2) {
                Rect rectLIZ = C0J0T.LIZ((View) this.LL.LLJI.getValue());
                Rect rectLIZ2 = C0J0T.LIZ((View) this.LL.LLJILJIL.getValue());
                if (rectLIZ.bottom > rectLIZ2.bottom && ((View) this.LL.LLJIJIL.getValue()).getAlpha() == 0.0f) {
                    ((View) this.LL.LLJIJIL.getValue()).animate().alpha(1.0f).setDuration(350L).start();
                } else {
                    if (rectLIZ.bottom >= rectLIZ2.bottom || ((View) this.LL.LLJIJIL.getValue()).getAlpha() != 1.0f) {
                        return;
                    }
                    ((View) this.LL.LLJIJIL.getValue()).animate().alpha(0.0f).setDuration(350L).start();
                }
            }
        });
        C786410Ut5.I7(new ACListenerS151S0100000_16(this, 27), (View) this.LLJJI.getValue());
        View view2 = (View) this.LLJ.getValue();
        String str = WidgetManager._pnsPageId;
        WidgetManager widgetManagerOR = WidgetManager.OR(null, this, view2, getContext());
        this.LLJJIJIL = widgetManagerOR;
        if (widgetManagerOR != null) {
            widgetManagerOR.UR(this.LLJJIJI);
        }
        WidgetManager widgetManager = this.LLJJIJIL;
        if (widgetManager != null) {
            Aweme aweme4 = this.LLJJIII;
            if (aweme4 != null && C1017070cZd.LLJL(aweme4)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                widgetManager.MR(R.id.a_q, new AdNewFakeBottomDescBarWidget(false));
            } else {
                Aweme aweme5 = this.LLJJIII;
                if (aweme5 != null && (awemeRawAd = aweme5.getAwemeRawAd()) != null && C1017180cZo.LJJIIZI(awemeRawAd) && !TextUtils.isEmpty(awemeRawAd.getWebUrl()) && ((!C1017180cZo.LJIIJJI(awemeRawAd) && !C1017070cZd.LJJJJLI(aweme5) && C1017180cZo.LJJIIJ(awemeRawAd) && C1017070cZd.LLJJJ(aweme5)) || ((!C1017180cZo.LJIIJJI(awemeRawAd) && !C1017070cZd.LJJJJLI(aweme5) && !C1017180cZo.LJJIIJ(awemeRawAd) && C1017070cZd.LLJJJ(aweme5)) || (C1017180cZo.LJIIJJI(awemeRawAd) && C1017070cZd.LLJJJ(aweme5))))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    widgetManager.MR(R.id.a_v, new AdNewFakePopUpWebPageWidget());
                } else {
                    Aweme aweme6 = this.LLJJIII;
                    if (aweme6 != null && C1017070cZd.LLJJL(aweme6)) {
                        widgetManager.MR(R.id.a_q, new AdNewFakeBottomDescBarWidget(true));
                        widgetManager.MR(R.id.a_v, new AdNewFakePopUpWebPageWidget());
                    }
                }
            }
            widgetManager.MR(R.id.hkv, new AdNewFakeUserProfileHeaderWidget());
            AdNewFakeUserProfileDetailFragmentWidget adNewFakeUserProfileDetailFragmentWidget = new AdNewFakeUserProfileDetailFragmentWidget();
            adNewFakeUserProfileDetailFragmentWidget.LLJJJIL = new AwS560S0100000_16(this, 210);
            adNewFakeUserProfileDetailFragmentWidget.LJIJJLI();
            widgetManager.MR(R.id.u3l, adNewFakeUserProfileDetailFragmentWidget);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.edb, viewGroup, false);
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
