package com.ss.android.ugc.aweme.relation.auth;

import X.AbstractC848400XPy;
import X.AbstractViewOnClickListenerC1173120gdK;
import X.C01GW;
import X.C098200Yq;
import X.C0DR9;
import X.C0OM1;
import X.C0PEM;
import X.C0XQ7;
import X.C1069830dwj;
import X.C1070600dxy;
import X.C1070610dxz;
import X.C1070630dy1;
import X.C1070690dy7;
import X.C1073970e3P;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1378990lzN;
import X.C1685300txQ;
import X.C189200o6;
import X.C1954807lC;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C384050F3z;
import X.C418440Gaw;
import X.C430210Gtv;
import X.C438710HIf;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1070410dxf;
import X.InterfaceC836760Ws6;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes17.dex */
@InterfaceC836760Ws6(attachActivity = SuggestAuthHostActivity.class)
public final class SuggestAuthPage extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjcpHELIOSJS4nISoiZy4mPC1iGjo0LyA/PQ4mPC0cKCg2";
    public SmartImageView LLIZ;
    public LinearLayout LLIZLLLIL;
    public C430210Gtv LLJ;
    public FrameLayout LLJI;
    public TuxIconView LLJIJIL;
    public TuxTextView LLJILJIL;
    public TuxTextView LLJILJILJ;
    public C197039127h LLJILLL;
    public TuxNavBar LLJJ;
    public EnumC1070410dxf LLJJI = EnumC1070410dxf.CONTACT;
    public final C01GW LLJJIII = RouteArgExtension.INSTANCE.optionalArg(this, AFwS231S0000000_3.get$arr$(58), "enter_method", String.class);
    public final C01GW LLJJIJI = RouteArgExtension.INSTANCE.optionalArg(this, AFwS231S0000000_3.get$arr$(57), "enter_from", String.class);
    public final C01GW LLJJIJIIJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS231S0000000_3.get$arr$(59), "enter_position", String.class);
    public final C01GW LLJJIJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS231S0000000_3.get$arr$(60), "scene_type", String.class);
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS547S0100000_3(this, 48));

    public final C197039127h SR() {
        View viewFindViewById = this.LLJILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.bbn) : null;
            this.LLJILLL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final FrameLayout UR() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.bl5) : null;
            this.LLJI = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final SmartImageView VR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.bo6) : null;
            this.LLIZ = (SmartImageView) viewFindViewById;
        }
        return (SmartImageView) viewFindViewById;
    }

    public final TuxTextView WR() {
        View viewFindViewById = this.LLJILJILJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.c8b) : null;
            this.LLJILJILJ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final C430210Gtv ZR() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.p07) : null;
            this.LLJ = (C430210Gtv) viewFindViewById;
        }
        return (C430210Gtv) viewFindViewById;
    }

    public final TuxIconView aS() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.xvs) : null;
            this.LLJIJIL = (TuxIconView) viewFindViewById;
        }
        return (TuxIconView) viewFindViewById;
    }

    public final TuxTextView bS() {
        View viewFindViewById = this.LLJILJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.title) : null;
            this.LLJILJIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final String getEnterFrom() {
        return (String) this.LLJJIJI.getValue();
    }

    public final String getEnterMethod() {
        return (String) this.LLJJIII.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
        this.LLJILLL = null;
        this.LLJJ = null;
    }

    public final void cS(boolean z) {
        if (!z) {
            return;
        }
        C19EG activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
        int i = C1070600dxy.LIZ[this.LLJJI.ordinal()];
        if (i != 1) {
            if (i == 2) {
                SmartRouter.buildRoute(getContext(), "//friends/facebook").open();
                return;
            }
            throw new C1954807lC();
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(getContext(), "//friends/contact");
        smartRouteBuildRoute.withParam("scene_type", (String) this.LLJJIJIL.getValue());
        smartRouteBuildRoute.withParam("enter_from", getEnterFrom());
        smartRouteBuildRoute.withParam("enter_method", getEnterMethod());
        smartRouteBuildRoute.open();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        NR(AFwS252S0000000_16.get$arr$(312));
        super.onCreate(bundle);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        Integer numLIZJ;
        ForegroundColorSpan foregroundColorSpan;
        super.onViewCreated(view, bundle);
        String string2 = null;
        int i = 12;
        int i2 = 4;
        if (((Boolean) this.LLJJJ.getValue()).booleanValue()) {
            C0DR9.LIZJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(196)), VR());
            View viewFindViewById = this.LLIZLLLIL;
            if (viewFindViewById == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.eu1);
                } else {
                    viewFindViewById = null;
                }
                this.LLIZLLLIL = (LinearLayout) viewFindViewById;
            }
            C0DR9.LIZIZ(viewFindViewById, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(142)), 0, 0);
            C0DR9.LIZJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(108)), ZR());
            C430210Gtv c430210GtvZR = ZR();
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(108));
            ViewGroup.LayoutParams layoutParams = c430210GtvZR.getLayoutParams();
            layoutParams.width = iLIZIZ;
            C786410Ut5.W5(c430210GtvZR, layoutParams);
            C0DR9.LIZJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(108)), UR());
            FrameLayout frameLayoutUR = UR();
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(108));
            ViewGroup.LayoutParams layoutParams2 = frameLayoutUR.getLayoutParams();
            layoutParams2.width = iLIZIZ2;
            C786410Ut5.W5(frameLayoutUR, layoutParams2);
            ZR().setBorderWidthPx(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
            C0DR9.LIZJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(39)), aS());
            TuxIconView tuxIconViewAS = aS();
            int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(39));
            ViewGroup.LayoutParams layoutParams3 = tuxIconViewAS.getLayoutParams();
            layoutParams3.width = iLIZIZ3;
            C786410Ut5.W5(tuxIconViewAS, layoutParams3);
            aS().setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(21)));
            aS().setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(21)));
            C0DR9.LIZIZ(aS(), 0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)));
            C0DR9.LIZIZ(bS(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), 0);
            C0DR9.LIZIZ(WR(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), 0);
            C0DR9.LIZIZ(SR(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), 0);
        } else {
            C0DR9.LIZJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(276)), VR());
            View viewFindViewById2 = this.LLIZLLLIL;
            if (viewFindViewById2 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById2 = view3.findViewById(R.id.eu1);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLIZLLLIL = (LinearLayout) viewFindViewById2;
            }
            C0DR9.LIZIZ(viewFindViewById2, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(208)), 0, 0);
            C0DR9.LIZJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(136)), UR());
            FrameLayout frameLayoutUR2 = UR();
            int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(136));
            ViewGroup.LayoutParams layoutParams4 = frameLayoutUR2.getLayoutParams();
            layoutParams4.width = iLIZIZ4;
            C786410Ut5.W5(frameLayoutUR2, layoutParams4);
            C0DR9.LIZJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(136)), ZR());
            C430210Gtv c430210GtvZR2 = ZR();
            int iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(136));
            ViewGroup.LayoutParams layoutParams5 = c430210GtvZR2.getLayoutParams();
            layoutParams5.width = iLIZIZ5;
            C786410Ut5.W5(c430210GtvZR2, layoutParams5);
            ZR().setBorderWidthPx(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
            C0DR9.LIZJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(49)), aS());
            C0DR9.LIZJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(49)), aS());
            C0DR9.LIZIZ(aS(), 0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
            C0DR9.LIZIZ(bS(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), 0);
            C0DR9.LIZIZ(WR(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), 0);
            C0DR9.LIZIZ(SR(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), 0);
        }
        View viewFindViewById3 = this.LLJJ;
        if (viewFindViewById3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById3 = view4.findViewById(R.id.p15);
            } else {
                viewFindViewById3 = null;
            }
            this.LLJJ = (TuxNavBar) viewFindViewById3;
        }
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LJIIIIZZ = getString(2131823350);
        c1251150ifB.LIZJ(new AwS560S0100000_16(this, 863));
        c0om1.LJ(c1251150ifB);
        ((TuxNavBar) viewFindViewById3).setNavActions(c0om1);
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1070690dy7(this, null), 3);
        C430210Gtv c430210GtvZR3 = ZR();
        c430210GtvZR3.setBorderAttrRes(R.attr.zq);
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        if (curUser != null) {
            UrlModel avatar300 = curUser.getAvatar300();
            if (avatar300 == null && (avatar300 = curUser.getAvatarMedium()) == null && (avatar300 = curUser.getAvatar168()) == null) {
                avatar300 = curUser.getAvatarThumb();
            }
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(avatar300));
            c1331670kl3LJIIIIZZ.LJJ(c430210GtvZR3);
            c1331670kl3LJIIIIZZ.LIZLLL("[ffp]");
            C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        }
        TuxIconView tuxIconViewAS2 = aS();
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.z_);
        if (!((Boolean) this.LLJJJ.getValue()).booleanValue()) {
            i = 16;
        }
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        if (!((Boolean) this.LLJJJ.getValue()).booleanValue()) {
            i2 = 5;
        }
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2))));
        c384050F3z.LJFF = Integer.valueOf(R.attr.zq);
        tuxIconViewAS2.setBackground(c384050F3z.LIZ(tuxIconViewAS2.getContext()));
        TuxTextView tuxTextViewBS = bS();
        String string3 = getString(2131839066);
        EnumC1070410dxf enumC1070410dxf = this.LLJJI;
        int[] iArr = C1070600dxy.LIZ;
        int i3 = iArr[enumC1070410dxf.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                string = getString(2131839065);
                numLIZJ = C1308910kAL.LIZJ(R.attr.tb, tuxTextViewBS.getContext());
            } else {
                throw new C1954807lC();
            }
        } else {
            string = getString(2131839064);
            numLIZJ = C1308910kAL.LIZJ(R.attr.ta, tuxTextViewBS.getContext());
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C786410Ut5.j4(string3, Arrays.copyOf(new Object[]{string}, 1)));
        int iLJJJ = a0.LJJJ(spannableStringBuilder, string, 0, false, 6);
        int length = string.length() + iLJJJ;
        if (iLJJJ != -1 && iLJJJ <= length) {
            if (numLIZJ != null) {
                foregroundColorSpan = new ForegroundColorSpan(numLIZJ.intValue());
            } else {
                foregroundColorSpan = null;
            }
            C786410Ut5.q2(spannableStringBuilder, foregroundColorSpan, iLJJJ, length, 33);
        }
        tuxTextViewBS.setTuxFont(13);
        tuxTextViewBS.setTextColorRes(R.attr.a1h);
        tuxTextViewBS.setText(spannableStringBuilder);
        TuxTextView tuxTextViewWR = WR();
        tuxTextViewWR.setTuxFont(101);
        tuxTextViewWR.setTextColorRes(R.attr.a1j);
        tuxTextViewWR.setText(tuxTextViewWR.getContext().getString(2131839063));
        final C197039127h c197039127hSR = SR();
        int i4 = iArr[this.LLJJI.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                c197039127hSR.setButtonStartIcon(Integer.valueOf(R.raw.icon_facebook_circle));
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.tb, c197039127hSR.getContext());
                if (numLIZJ2 != null) {
                    c197039127hSR.setBackgroundColor(numLIZJ2.intValue());
                }
            } else {
                throw new C1954807lC();
            }
        } else {
            c197039127hSR.setButtonStartIcon(Integer.valueOf(R.raw.icon_phone_book_fill));
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.ta, c197039127hSR.getContext());
            if (numLIZJ3 != null) {
                c197039127hSR.setBackgroundColor(numLIZJ3.intValue());
            }
        }
        C1378990lzN.LIZIZ(c197039127hSR, Float.valueOf(C418440Gaw.LIZIZ(10)), null, null, null, null, 30);
        C786410Ut5.I7(new AbstractViewOnClickListenerC1173120gdK() { // from class: X.0dxw
            @Override // X.AbstractViewOnClickListenerC1173120gdK
            public final void LIZ(View view5) {
                String string4;
                C1070630dy1 c1070630dy1 = C1070630dy1.LIZ;
                String enterFrom = this.LLILZ.getEnterFrom();
                String enterMethod = this.LLILZ.getEnterMethod();
                EnumC1070410dxf enumC1070410dxf2 = this.LLILZ.LLJJI;
                EnumC1070590dxx enumC1070590dxx = EnumC1070590dxx.CONTINUE;
                c1070630dy1.getClass();
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", enterFrom);
                c2344009Gk.LJIIIIZZ("enter_method", enterMethod);
                String value = null;
                if (enumC1070410dxf2 != null) {
                    string4 = enumC1070410dxf2.getString();
                } else {
                    string4 = null;
                }
                c2344009Gk.LJIIIIZZ("platform", string4);
                if (enumC1070590dxx != null) {
                    value = enumC1070590dxx.getValue();
                }
                c2344009Gk.LJIIIIZZ("result", value);
                C20684815ws.LJIILLIIL("confirm_auth_page", c2344009Gk.LIZ);
                EnumC1070410dxf enumC1070410dxf3 = this.LLILZ.LLJJI;
                Context context = c197039127hSR.getContext();
                String enterFrom2 = this.LLILZ.getEnterFrom();
                String str = "";
                if (enterFrom2 == null) {
                    enterFrom2 = "";
                }
                String enterMethod2 = this.LLILZ.getEnterMethod();
                if (enterMethod2 != null) {
                    str = enterMethod2;
                }
                C1069830dwj.LIZ(enumC1070410dxf3, context, new C1073970e3P(enterFrom2, str, (String) null, (String) null, 28), new C1070620dy0(this.LLILZ));
            }
        }, c197039127hSR);
        C1070630dy1 c1070630dy1 = C1070630dy1.LIZ;
        String enterFrom = getEnterFrom();
        String enterMethod = getEnterMethod();
        EnumC1070410dxf enumC1070410dxf2 = this.LLJJI;
        c1070630dy1.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", enterFrom);
        c2344009Gk.LJIIIIZZ("enter_method", enterMethod);
        if (enumC1070410dxf2 != null) {
            string2 = enumC1070410dxf2.getString();
        }
        c2344009Gk.LJIIIIZZ("platform", string2);
        C20684815ws.LJIILLIIL("show_auth_page", c2344009Gk.LIZ);
        if (!Intrinsics.LJFF(getEnterMethod(), "inbox_add_phone_banner")) {
            EnumC1070410dxf enumC1070410dxf3 = this.LLJJI;
            Context contextRequireContext = requireContext();
            String enterFrom2 = getEnterFrom();
            String str = "";
            if (enterFrom2 == null) {
                enterFrom2 = "";
            }
            String enterMethod2 = getEnterMethod();
            if (enterMethod2 != null) {
                str = enterMethod2;
            }
            C1069830dwj.LIZ(enumC1070410dxf3, contextRequireContext, new C1073970e3P(enterFrom2, str, (String) null, (String) null, 28), new C1070610dxz(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c_c, viewGroup, false);
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
