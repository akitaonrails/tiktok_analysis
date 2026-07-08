package com.ss.android.ugc.aweme.commercialize.profile;

import X.C01GW;
import X.C03IT;
import X.C098200Yq;
import X.C0J0T;
import X.C0N0Y;
import X.C0RD4;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1022030chd;
import X.C1035020d2a;
import X.C1052840dVK;
import X.C1052870dVN;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C14LC;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20533215Wg;
import X.C21578619ce;
import X.C2188811AlT;
import X.C2200821BBo;
import X.C341940Daq;
import X.C424560Gko;
import X.C452501pT;
import X.C497270Jen;
import X.C786410Ut5;
import X.InterfaceC1054930dYh;
import X.InterfaceC1809520xBm;
import Y.ACListenerS151S0100000_16;
import Y.AObjectS391S0100000_16;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.commercialize.model.FakeAuthor;
import com.ss.android.ugc.aweme.commercialize.widget.AdFakePopUpWebPageWidget;
import com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileBottomBarWidget;
import com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileNewBottomBarWidget;
import com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoDescWidget;
import com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoNewDescWidget;
import com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoPlayWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class FakeUserProfileFragment extends CommonPageFragment implements InterfaceC1054930dYh, Observer<C0RD4> {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2OiYlKCM6HELIOSMiBiOT08LiwgLGEVKS4pHDw2OhU+Jik6JCAKOy40JSAiPQ==";
    public ConstraintLayout LL;
    public ConstraintLayout LLILLJJLI;
    public ImageView LLILLL;
    public TuxTextView LLILZ;
    public C21578619ce LLILZIL;
    public C424560Gko LLILZLL;
    public TuxTextView LLIZ;
    public TuxTextView LLIZLLLIL;
    public TuxTextView LLJ;
    public ConstraintLayout LLJI;
    public ConstraintLayout LLJIJIL;
    public FrameLayout LLJILJIL;
    public LinearLayout LLJILJILJ;
    public View LLJILLL;
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 201));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS560S0100000_16(this, 205));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS560S0100000_16(this, 198));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS560S0100000_16(this, 204));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 202));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 206));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 208));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 207));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 203));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 196));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 197));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 209));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 200));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 199));
    public Aweme LLJLIL;
    public String LLJLILLLLZIIL;
    public DataCenter LLJLL;
    public WidgetManager LLJLLIL;

    @Override // X.InterfaceC1054930dYh
    public final void PG() {
    }

    @Override // X.InterfaceC1054930dYh
    public final Fragment Ui() {
        return this;
    }

    public final View MR() {
        return (View) this.LLJJ.getValue();
    }

    public final boolean NR() {
        AwemeRawAd awemeRawAd;
        FakeAuthor fakeAuthor;
        Integer fakeAuthorVersion;
        Aweme aweme = this.LLJLIL;
        return (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (fakeAuthor = awemeRawAd.getFakeAuthor()) == null || (fakeAuthorVersion = fakeAuthor.getFakeAuthorVersion()) == null || fakeAuthorVersion.intValue() != 1) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        DataCenter dataCenter = this.LLJLL;
        if (dataCenter != null) {
            dataCenter.AQ2(this);
        }
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
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
        this.LLJILLL = null;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C0RD4 c0rd4) {
        String str = c0rd4.LIZ;
        if (str.hashCode() == 860337036 && str.equals("ON_VIDEO_CONTAINER_SIZE_CHANGE")) {
            Rect rectLIZ = C0J0T.LIZ(MR().findViewById(R.id.video_container_layout));
            View viewFindViewById = MR().findViewById(R.id.video_container);
            Rect rectLIZ2 = C0J0T.LIZ(viewFindViewById);
            View viewFindViewById2 = MR().findViewById(R.id.a78);
            Rect rectLIZ3 = C0J0T.LIZ(MR().findViewById(R.id.a78));
            float fLIZ = (rectLIZ3.top + (C341940Daq.LIZ(-16.0d) - viewFindViewById2.getTranslationY())) - rectLIZ.top;
            if (NR()) {
                fLIZ = C0J0T.LIZ(MR().findViewById(R.id.h3n)).top - rectLIZ.top;
            }
            if (fLIZ - rectLIZ2.height() > 0.0f) {
                C786410Ut5.ed(viewFindViewById, (fLIZ - rectLIZ2.height()) / 2.0f);
            }
            Rect rectLIZ4 = C0J0T.LIZ(MR());
            View viewFindViewById3 = MR().findViewById(R.id.video_cover);
            int i = rectLIZ4.bottom - C0J0T.LIZ(viewFindViewById3).top;
            if (i > 0) {
                ViewGroup.LayoutParams layoutParams = viewFindViewById3.getLayoutParams();
                layoutParams.width = rectLIZ4.width();
                layoutParams.height = i;
                viewFindViewById3.requestLayout();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/commercialize/profile/FakeUserProfileFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLLzjHP2aI3/COMqHP3lj6MFIsYezzovcZjsyLJnGhTbkAn6uSC4q39SQ==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        DataCenter dataCenter = this.LLJLL;
        if (dataCenter != null) {
            dataCenter.zQ2(Boolean.valueOf(z), "AD_PROFILE_VISIBILITY_CHANGED");
        }
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
        WeakReference<C0N0Y> weakReference = C1052870dVN.LIZ;
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(FakeUserProfileFragment.class);
        }
    }

    @Override // X.InterfaceC1054930dYh
    public final void setVisible(boolean z) throws Throwable {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("visible=");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        setUserVisibleHint(z);
    }

    @Override // X.InterfaceC1054930dYh
    public final void wC(AObjectS391S0100000_16 aObjectS391S0100000_16) {
        C786410Ut5.Q7((ImageView) this.LLJJIII.getValue(), new ACListenerS151S0100000_16(aObjectS391S0100000_16, 25));
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String string2;
        String nickname;
        String nickname2;
        User author;
        String description;
        AwemeRawAd awemeRawAd;
        FakeAuthor fakeAuthor;
        String openUrl;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        String description2;
        String openUrl2;
        String type;
        AwemeRawAd awemeRawAd4;
        AwemeRawAd awemeRawAd5;
        AwemeRawAd awemeRawAd6;
        FakeAuthor fakeAuthor2;
        User author2;
        User author3;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        String type2 = null;
        if (arguments != null) {
            string = arguments.getString("aweme_id");
        } else {
            string = null;
        }
        this.LLJLIL = C1022030chd.LJII(string);
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            string2 = arguments2.getString("enter_from");
        } else {
            string2 = null;
        }
        this.LLJLILLLLZIIL = string2;
        DataCenter dataCenterVQ2 = DataCenter.vQ2(ViewModelProviders.of(this), this);
        this.LLJLL = dataCenterVQ2;
        C1035020d2a c1035020d2a = new C1035020d2a();
        new AwS595S0100000_16(this, 76).invoke(c1035020d2a.LIZ);
        dataCenterVQ2.zQ2(c1035020d2a.LIZ, "AD_PROFILE_PARAMS");
        ViewGroup.LayoutParams layoutParams = ((View) this.LLJJI.getValue()).getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.topMargin = C14LC.LIZLLL(getContext());
            C786410Ut5.W5((View) this.LLJJI.getValue(), marginLayoutParams);
        }
        TextView textView = (TextView) this.LLJJIJI.getValue();
        Aweme aweme = this.LLJLIL;
        if (aweme != null && (author3 = aweme.getAuthor()) != null) {
            nickname = author3.getNickname();
        } else {
            nickname = null;
        }
        textView.setText(nickname);
        ((C21578619ce) this.LLJJIJIIJIL.getValue()).setOnScrollChangeListener(new InterfaceC1809520xBm() { // from class: X.0dVJ
            @Override // X.InterfaceC1809520xBm
            public final void LIZ(C21578619ce c21578619ce, int i, int i2, int i3, int i4) {
                Rect rectLIZ = C0J0T.LIZ((View) this.LIZ.LLJJI.getValue());
                Rect rectLIZ2 = C0J0T.LIZ((View) this.LIZ.LLJJJ.getValue());
                if (rectLIZ.bottom > rectLIZ2.bottom && ((View) this.LIZ.LLJJIJI.getValue()).getAlpha() == 0.0f) {
                    ((View) this.LIZ.LLJJIJI.getValue()).animate().alpha(1.0f).setDuration(350L).start();
                } else {
                    if (rectLIZ.bottom >= rectLIZ2.bottom || ((View) this.LIZ.LLJJIJI.getValue()).getAlpha() != 1.0f) {
                        return;
                    }
                    ((View) this.LIZ.LLJJIJI.getValue()).animate().alpha(0.0f).setDuration(350L).start();
                }
            }
        });
        TextView textView2 = (TextView) this.LLJJJ.getValue();
        Aweme aweme2 = this.LLJLIL;
        if (aweme2 != null && (author2 = aweme2.getAuthor()) != null) {
            nickname2 = author2.getNickname();
        } else {
            nickname2 = null;
        }
        textView2.setText(nickname2);
        Aweme aweme3 = this.LLJLIL;
        if (aweme3 != null) {
            author = aweme3.getAuthor();
        } else {
            author = null;
        }
        C03IT c03itLIZ = C1052840dVK.LIZ(author);
        if (c03itLIZ != null) {
            C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(c03itLIZ);
            c1331670kl3LJIIJ.LJJ((SmartImageView) this.LLJJIJIL.getValue());
            C786410Ut5.h3(c1331670kl3LJIIJ);
        }
        if (NR()) {
            C786410Ut5.LLIL((TextView) this.LLJJJJ.getValue(), 0);
            C786410Ut5.LLIL((TextView) this.LLJJJIL.getValue(), 8);
            TextView textView3 = (TextView) this.LLJJJJ.getValue();
            Aweme aweme4 = this.LLJLIL;
            if (aweme4 != null && (awemeRawAd6 = aweme4.getAwemeRawAd()) != null && (fakeAuthor2 = awemeRawAd6.getFakeAuthor()) != null) {
                description2 = fakeAuthor2.getDescription();
            } else {
                description2 = null;
            }
            textView3.setText(description2);
            C786410Ut5.LL(8, (ConstraintLayout) this.LLJJJJJIL.getValue());
            C786410Ut5.LJZ(8, (FrameLayout) this.LLJJL.getValue());
            C786410Ut5.LJLLLLLL(0, (View) this.LLJL.getValue());
            Aweme aweme5 = this.LLJLIL;
            if (aweme5 != null && (awemeRawAd5 = aweme5.getAwemeRawAd()) != null) {
                openUrl2 = awemeRawAd5.getOpenUrl();
            } else {
                openUrl2 = null;
            }
            if (!C1022030chd.LJIJI(openUrl2)) {
                Aweme aweme6 = this.LLJLIL;
                if (aweme6 != null && (awemeRawAd4 = aweme6.getAwemeRawAd()) != null) {
                    type = awemeRawAd4.getType();
                } else {
                    type = null;
                }
                if (!Intrinsics.LJFF(type, "app")) {
                    C786410Ut5.LL(8, (ConstraintLayout) this.LLJJJJLIIL.getValue());
                }
            }
        } else {
            C786410Ut5.LLIL((TextView) this.LLJJJJ.getValue(), 8);
            C786410Ut5.LLIL((TextView) this.LLJJJIL.getValue(), 0);
            TextView textView4 = (TextView) this.LLJJJIL.getValue();
            Aweme aweme7 = this.LLJLIL;
            if (aweme7 != null && (awemeRawAd = aweme7.getAwemeRawAd()) != null && (fakeAuthor = awemeRawAd.getFakeAuthor()) != null) {
                description = fakeAuthor.getDescription();
            } else {
                description = null;
            }
            textView4.setText(description);
            C786410Ut5.LJZL(8, (LinearLayout) this.LLJJLIIIJLLLLLLLZ.getValue());
            C786410Ut5.LL(8, (ConstraintLayout) this.LLJJJJLIIL.getValue());
            C786410Ut5.LJLLLLLL(8, (View) this.LLJL.getValue());
        }
        DataCenter dataCenter = this.LLJLL;
        if (dataCenter != null) {
            dataCenter.yQ2("ON_VIDEO_CONTAINER_SIZE_CHANGE", this, false);
        }
        View viewMR = MR();
        String str = WidgetManager._pnsPageId;
        WidgetManager widgetManagerOR = WidgetManager.OR(null, this, viewMR, getContext());
        this.LLJLLIL = widgetManagerOR;
        if (widgetManagerOR != null) {
            widgetManagerOR.UR(this.LLJLL);
        }
        WidgetManager widgetManager = this.LLJLLIL;
        if (widgetManager != null) {
            widgetManager.MR(R.id.video_container_layout, new AdFakeUserProfileVideoPlayWidget());
            if (NR()) {
                widgetManager.MR(R.id.video_desc_new_container, new AdFakeUserProfileVideoNewDescWidget());
                Aweme aweme8 = this.LLJLIL;
                if (aweme8 != null && (awemeRawAd3 = aweme8.getAwemeRawAd()) != null) {
                    openUrl = awemeRawAd3.getOpenUrl();
                } else {
                    openUrl = null;
                }
                if (!C1022030chd.LJIJI(openUrl)) {
                    Aweme aweme9 = this.LLJLIL;
                    if (aweme9 != null && (awemeRawAd2 = aweme9.getAwemeRawAd()) != null) {
                        type2 = awemeRawAd2.getType();
                    }
                    if (!Intrinsics.LJFF(type2, "app")) {
                        widgetManager.MR(R.id.a8q, new AdFakePopUpWebPageWidget());
                        return;
                    }
                }
                widgetManager.MR(R.id.a79, new AdFakeUserProfileNewBottomBarWidget());
                return;
            }
            widgetManager.MR(R.id.a78, new AdFakeUserProfileBottomBarWidget());
            widgetManager.MR(R.id.video_desc_container, new AdFakeUserProfileVideoDescWidget());
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c8k, viewGroup, false);
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
