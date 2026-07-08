package com.ss.android.ugc.profile.business.ur.aigc;

import X.AbstractC19484711Kz;
import X.C01GW;
import X.C098200Yq;
import X.C09JN;
import X.C0HZQ;
import X.C0T1N;
import X.C11NJ;
import X.C11NZ;
import X.C11S5;
import X.C1221880hty;
import X.C1239300iM4;
import X.C1251150ifB;
import X.C1389890mGx;
import X.C1685300txQ;
import X.C1701940uOG;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2344009Gk;
import X.C346200Dhi;
import X.C444920HcY;
import X.C452501pT;
import X.C497820Jfg;
import X.C786410Ut5;
import X.EnumC584810Mwh;
import X.InterfaceC836760Ws6;
import Y.ACListenerS154S0100000_19;
import Y.AfS188S0100000_19;
import Y.AkS481S0100000_19;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.aigc.AIGCAvatarServiceImpl;
import com.ss.android.ugc.aweme.aigc.AIGCQuota;
import com.ss.android.ugc.aweme.profile.aigc.ProfileAIGCMainArg;
import com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcIntroFragmentV2;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes20.dex */
@InterfaceC836760Ws6(attachActivity = ProfileAigcIntroHostActivity.class)
public final class ProfileAigcIntroFragmentV2 extends ProfileAigcIntroFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjx9HELIOSPTdiKCY0K2scOyA1ISkpCCY0KwwiPT08DjctLiI2JjEaew==";
    public TuxTextView LLJJI;
    public ViewStub LLJJIII;
    public FrameLayout LLJJIJI;
    public FrameLayout LLJJIJIIJIL;
    public C0HZQ LLJJIJIL;
    public C0HZQ LLJJJ;
    public TuxTextView LLJJJIL;
    public TuxTextView LLJJJJ;
    public TuxTextView LLJJJJJIL;
    public TuxTextView LLJJJJLIIL;
    public TuxTextView LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public View LLJLIL;
    public View LLJLILLLLZIIL;
    public boolean LLJLL = true;
    public boolean LLJLLIL = true;
    public EnumC584810Mwh LLJLLL = EnumC584810Mwh.SLOW;
    public final C11NJ LLJZ = new C11NJ();
    public boolean LLJZIJLIL = true;
    public final C01GW LLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(410));
    public boolean LLLF = true;

    public final TuxTextView SR() {
        View viewFindViewById = this.LLJJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.f6h) : null;
            this.LLJJI = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final FrameLayout UR() {
        View viewFindViewById = this.LLJJIJIIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.mt4) : null;
            this.LLJJIJIIJIL = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final C0HZQ VR() {
        View viewFindViewById = this.LLJJJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.mt5) : null;
            this.LLJJJ = (C0HZQ) viewFindViewById;
        }
        return (C0HZQ) viewFindViewById;
    }

    public final TuxTextView WR() {
        View viewFindViewById = this.LLJJJJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.mt6) : null;
            this.LLJJJJ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView ZR() {
        View viewFindViewById = this.LLJJL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.mta) : null;
            this.LLJJL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final FrameLayout aS() {
        View viewFindViewById = this.LLJJIJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.qvh) : null;
            this.LLJJIJI = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final C0HZQ bS() {
        View viewFindViewById = this.LLJJIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.qvi) : null;
            this.LLJJIJIL = (C0HZQ) viewFindViewById;
        }
        return (C0HZQ) viewFindViewById;
    }

    public final TuxTextView cS() {
        View viewFindViewById = this.LLJJJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.qvj) : null;
            this.LLJJJIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView dS() {
        View viewFindViewById = this.LLJJJJLIIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.qvr) : null;
            this.LLJJJJLIIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final void hS() {
        C19EG activity;
        if (!this.LLLF || (activity = getActivity()) == null) {
            return;
        }
        this.LLLF = false;
        C1389890mGx c1389890mGx = new C1389890mGx(activity);
        c1389890mGx.LJIIIZ(2131820634);
        c1389890mGx.LIZLLL(3000L);
        c1389890mGx.LJIIJJI();
        this.LLJZ.LIZ(C11NZ.LJLJJLL(3000L, TimeUnit.MILLISECONDS).LJJLL(new AfS188S0100000_19(this, 42), new C09JN() { // from class: X.0htx
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("ProfileAigcIntroFragmentV2@931b.showMaxToast$1$2");
                int i = C2187451AjH.LIZ;
                C1720106oR.LIZLLL((Throwable) obj);
                C1C7U.LIZIZ("ProfileAigcIntroFragmentV2@931b.showMaxToast$1$2");
            }
        }));
    }

    @Override // com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcIntroFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LLJZ.LJ();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJJI = null;
        this.LLJJIII = null;
        this.LLJJIJI = null;
        this.LLJJIJIIJIL = null;
        this.LLJJIJIL = null;
        this.LLJJJ = null;
        this.LLJJJIL = null;
        this.LLJJJJ = null;
        this.LLJJJJJIL = null;
        this.LLJJJJLIIL = null;
        this.LLJJL = null;
    }

    @Override // com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcIntroFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.LLJZIJLIL = false;
        this.LLLF = false;
        this.LLJZ.LIZ(C1239300iM4.LIZLLL(AbstractC19484711Kz.LJIJI(new Callable() { // from class: X.0htw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("ProfileAigcIntroFragmentV2@931b.onResume$1");
                List<AIGCQuota> listVq = AIGCAvatarServiceImpl.LIZIZ().Vq();
                C1C7U.LIZIZ("ProfileAigcIntroFragmentV2@931b.onResume$1");
                return listVq;
            }
        }).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJIL(new AkS481S0100000_19(this, 0)), AFwS257S0000000_19.get$arr$(372), C1239300iM4.LIZ));
    }

    public final void gS(EnumC584810Mwh enumC584810Mwh) {
        if (this.LLJLIL != null && this.LLJLILLLLZIIL != null) {
            if (enumC584810Mwh == EnumC584810Mwh.FAST && this.LLJLLIL) {
                this.LLJLLL = enumC584810Mwh;
                bS().setChecked(false);
                C786410Ut5.LLLLLZ(bS(), 4);
                VR().setChecked(true);
                C786410Ut5.LLLLLZ(VR(), 0);
                aS().setBackgroundResource(R.drawable.cxg);
                UR().setBackgroundResource(R.drawable.cxf);
                return;
            }
            if (enumC584810Mwh != EnumC584810Mwh.SLOW || !this.LLJLL) {
                return;
            }
            this.LLJLLL = enumC584810Mwh;
            bS().setChecked(true);
            C786410Ut5.LLLLLZ(bS(), 0);
            VR().setChecked(false);
            C786410Ut5.LLLLLZ(VR(), 4);
            aS().setBackgroundResource(R.drawable.cxf);
            UR().setBackgroundResource(R.drawable.cxg);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        NR(AFwS257S0000000_19.get$arr$(371));
        super.onCreate(bundle);
        ProfileAIGCMainArg profileAIGCMainArg = (ProfileAIGCMainArg) this.LLJI.getValue();
        boolean zBooleanValue = true;
        if (profileAIGCMainArg != null) {
            Boolean introPageWithNavBar = profileAIGCMainArg.getIntroPageWithNavBar();
            if (introPageWithNavBar != null) {
                zBooleanValue = introPageWithNavBar.booleanValue();
            }
            this.LLIZ = zBooleanValue;
            this.LLIZLLLIL = profileAIGCMainArg.getEnterFrom();
            this.LLJ = profileAIGCMainArg.getEnterMethod();
            return;
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        this.LLIZ = arguments.getBoolean("intro_page_nav_bar", true);
        this.LLIZLLLIL = arguments.getString("enter_from");
        this.LLJ = arguments.getString("enter_method");
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        String lowerCase;
        Pair pair;
        super.onViewCreated(view, bundle);
        this.LLJILJIL = (TuxTextView) view.findViewById(R.id.at6);
        this.LLJIJIL = (SmartImageView) view.findViewById(R.id.at7);
        Context context = getContext();
        String lowerCase2 = null;
        if (context != null) {
            String string = context.getResources().getString(2131820625);
            String string2 = context.getResources().getString(2131820626);
            SpannableString spannableString = new SpannableString(u.LJJIFFI(string, "%@", string2, false));
            C346200Dhi c346200Dhi = new C346200Dhi(this, context, 0);
            Integer numValueOf = Integer.valueOf(a0.LJJJ(spannableString, string2, 0, false, 6));
            if (numValueOf.intValue() != -1) {
                pair = new Pair(Integer.valueOf(numValueOf.intValue()), Integer.valueOf(string2.length()));
            } else {
                pair = new Pair(0, Integer.valueOf(Math.min(string2.length(), spannableString.length())));
            }
            int iIntValue = ((Number) pair.getFirst()).intValue();
            int iIntValue2 = ((Number) pair.getSecond()).intValue() + iIntValue;
            C786410Ut5.p2(spannableString, c346200Dhi, iIntValue, iIntValue2, 33);
            C786410Ut5.p2(spannableString, new C444920HcY(53, false), iIntValue, iIntValue2, 33);
            TuxTextView tuxTextView = this.LLJILJIL;
            if (tuxTextView == null) {
                tuxTextView = null;
            }
            tuxTextView.setText(spannableString);
            TuxTextView tuxTextView2 = this.LLJILJIL;
            if (tuxTextView2 == null) {
                tuxTextView2 = null;
            }
            tuxTextView2.setHighlightColor(0);
            TuxTextView tuxTextView3 = this.LLJILJIL;
            if (tuxTextView3 == null) {
                tuxTextView3 = null;
            }
            tuxTextView3.setMovementMethod(LinkMovementMethod.getInstance());
        }
        View viewFindViewById = view.findViewById(R.id.w0u);
        Context context2 = viewFindViewById.getContext();
        if (context2 != null) {
            viewFindViewById.getLayoutParams().height = C497820Jfg.LIZJ(context2);
        }
        this.LLJJLIIIJLLLLLLLZ = viewFindViewById;
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.p15);
        if (this.LLIZ) {
            C786410Ut5.LLLLZLLLI(tuxNavBar, 0);
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_x_mark;
            c1251150ifB.LIZJ(new AwS563S0100000_19(this, 2235));
            tuxNavBar.LIZIZ(c1251150ifB);
        } else {
            C786410Ut5.LLLLZLLLI(tuxNavBar, 8);
        }
        tuxNavBar.LJIIZILJ(false);
        View viewFindViewById2 = view.findViewById(R.id.lc0);
        if (this.LLIZ) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById2);
        } else {
            C786410Ut5.LJLLLLLL(0, viewFindViewById2);
            C786410Ut5.I7(new ACListenerS154S0100000_19(this, 156), viewFindViewById2);
        }
        this.LLJL = viewFindViewById2;
        TuxTextView tuxTextView4 = (TuxTextView) view.findViewById(R.id.at8);
        if (tuxTextView4 == null) {
            tuxTextView4 = null;
        }
        tuxTextView4.LJJJJI(32.0f);
        if (((Boolean) this.LLL.getValue()).booleanValue()) {
            SR().setText(2131820619);
            View viewFindViewById3 = this.LLJJIII;
            if (viewFindViewById3 == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById3 = view2.findViewById(R.id.un0);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLJJIII = (ViewStub) viewFindViewById3;
            }
            ((ViewStub) viewFindViewById3).setOnInflateListener(new ViewStub.OnInflateListener() { // from class: X.0huD
                @Override // android.view.ViewStub.OnInflateListener
                public final void onInflate(ViewStub viewStub, View view3) {
                    ProfileAigcIntroFragmentV2 profileAigcIntroFragmentV2 = this.LIZ;
                    profileAigcIntroFragmentV2.LLJLIL = profileAigcIntroFragmentV2.aS();
                    ProfileAigcIntroFragmentV2 profileAigcIntroFragmentV22 = this.LIZ;
                    profileAigcIntroFragmentV22.LLJLILLLLZIIL = profileAigcIntroFragmentV22.UR();
                    C786410Ut5.O7(this.LIZ.aS(), new ACListenerS154S0100000_19(this.LIZ, 157));
                    this.LIZ.bS().setInterceptToggleListener(new AwS563S0100000_19(this.LIZ, 2236));
                    C786410Ut5.O7(this.LIZ.UR(), new ACListenerS154S0100000_19(this.LIZ, 158));
                    this.LIZ.VR().setInterceptToggleListener(new AwS563S0100000_19(this.LIZ, 2237));
                    ProfileAigcIntroFragmentV2 profileAigcIntroFragmentV23 = this.LIZ;
                    Context context3 = view.getContext();
                    profileAigcIntroFragmentV23.getClass();
                    if (C497820Jfg.LIZIZ(context3) <= 680) {
                        int i = C2187451AjH.LIZ;
                        profileAigcIntroFragmentV23.dS().setTextSize(2, 8.0f);
                        profileAigcIntroFragmentV23.cS().setMaxLines(2);
                        profileAigcIntroFragmentV23.cS().setTextSize(2, 6.0f);
                        profileAigcIntroFragmentV23.ZR().setTextSize(2, 8.0f);
                        profileAigcIntroFragmentV23.WR().setMaxLines(2);
                        profileAigcIntroFragmentV23.WR().setTextSize(2, 6.0f);
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) profileAigcIntroFragmentV23.dS().getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) profileAigcIntroFragmentV23.cS().getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) profileAigcIntroFragmentV23.ZR().getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) profileAigcIntroFragmentV23.WR().getLayoutParams();
                        TuxTextView tuxTextViewDS = profileAigcIntroFragmentV23.dS();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("plus title LP1: ");
                        sbLIZ.append(marginLayoutParams);
                        C2188811AlT.LIZIZ(sbLIZ);
                        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, 10, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                        C786410Ut5.R6(tuxTextViewDS, marginLayoutParams);
                        TuxTextView tuxTextViewCS = profileAigcIntroFragmentV23.cS();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("plus content LP1: ");
                        sbLIZ2.append(marginLayoutParams2);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, 10);
                        C786410Ut5.R6(tuxTextViewCS, marginLayoutParams2);
                        TuxTextView tuxTextViewZR = profileAigcIntroFragmentV23.ZR();
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("lite title LP1: ");
                        sbLIZ3.append(marginLayoutParams3);
                        C2188811AlT.LIZIZ(sbLIZ3);
                        marginLayoutParams3.setMargins(marginLayoutParams3.leftMargin, 10, marginLayoutParams3.rightMargin, marginLayoutParams3.bottomMargin);
                        C786410Ut5.R6(tuxTextViewZR, marginLayoutParams3);
                        TuxTextView tuxTextViewWR = profileAigcIntroFragmentV23.WR();
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("lite content LP1: ");
                        sbLIZ4.append(marginLayoutParams4);
                        C2188811AlT.LIZIZ(sbLIZ4);
                        marginLayoutParams4.setMargins(marginLayoutParams4.leftMargin, marginLayoutParams4.topMargin, marginLayoutParams4.rightMargin, 10);
                        C786410Ut5.R6(tuxTextViewWR, marginLayoutParams4);
                    }
                    ProfileAigcIntroFragmentV2 profileAigcIntroFragmentV24 = this.LIZ;
                    if (!profileAigcIntroFragmentV24.LLJZIJLIL) {
                        View view4 = profileAigcIntroFragmentV24.LLJLIL;
                        if (view4 != null) {
                            C786410Ut5.T4(view4, 0.3f);
                        }
                        View view5 = profileAigcIntroFragmentV24.LLJLILLLLZIIL;
                        if (view5 != null) {
                            C786410Ut5.T4(view5, 0.3f);
                        }
                    }
                    C118300cf c118300cf = new C118300cf();
                    C786410Ut5.x3(this.LIZ.cS().getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC1266000j38(c118300cf, this.LIZ, 1));
                    C786410Ut5.x3(this.LIZ.WR().getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC1266000j38(c118300cf, this.LIZ, 2));
                }
            });
            View viewFindViewById4 = this.LLJJIII;
            if (viewFindViewById4 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById4 = view3.findViewById(R.id.un0);
                } else {
                    viewFindViewById4 = null;
                }
                this.LLJJIII = (ViewStub) viewFindViewById4;
            }
            C786410Ut5.LJLLLL((ViewStub) viewFindViewById4);
        } else {
            SR().setText(2131820636);
            View viewFindViewById5 = this.LLJJJJJIL;
            if (viewFindViewById5 == null) {
                View view4 = getView();
                if (view4 != null) {
                    viewFindViewById5 = view4.findViewById(R.id.at5);
                } else {
                    viewFindViewById5 = null;
                }
                this.LLJJJJJIL = (TuxTextView) viewFindViewById5;
            }
            ((TextView) viewFindViewById5).setText(getResources().getString(2131820635));
        }
        C786410Ut5.h9(SR(), new ACListenerS154S0100000_19(this, 159));
        Forest forestLIZ = C0T1N.LIZ();
        RequestParams requestParams = new RequestParams(null, 1, null);
        requestParams.channel = "tiktok_tool_aigc_avatar";
        requestParams.bundle = "aigc_intro.webp";
        requestParams.waitGeckoUpdate = true;
        forestLIZ.fetchResourceAsync("", requestParams, new AwS585S0100000_6((ProfileAigcIntroFragment) this, 337));
        C1221880hty c1221880hty = C1221880hty.LIZ;
        String str = this.LLIZLLLIL;
        String str2 = this.LLJ;
        c1221880hty.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
        } else {
            lowerCase = null;
        }
        c2344009Gk.LJIIIIZZ("enter_from", lowerCase);
        if (str2 != null) {
            lowerCase2 = str2.toLowerCase(Locale.ROOT);
        }
        c2344009Gk.LJIIIIZZ("enter_method", lowerCase2);
        C20684815ws.LJIILLIIL("ai_avatar_intro_page_enter", c2344009Gk.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ebc, viewGroup, false);
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
