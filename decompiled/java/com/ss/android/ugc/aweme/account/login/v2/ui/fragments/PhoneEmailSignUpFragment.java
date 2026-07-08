package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.AbstractC813200VvC;
import X.C01GW;
import X.C1237010iIN;
import X.C1238430iKf;
import X.C1238440iKg;
import X.C1245410iVv;
import X.C1245440iVy;
import X.C1250250idj;
import X.C1266190j3R;
import X.C12ES;
import X.C1308910kAL;
import X.C19Y2;
import X.C19Y3;
import X.C19Y5;
import X.C21594419fC;
import X.C2187451AjH;
import X.C426750GoL;
import X.C452501pT;
import X.C616540OGe;
import X.C786410Ut5;
import X.EnumC852910Xd3;
import X.InterfaceC1245470iW1;
import X.InterfaceC20516715Px;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneEmailSignUpFragment;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class PhoneEmailSignUpFragment extends BaseI18nLoginFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJSA0IStiP3HELIOS19PSxiLz0yLygpJzsgZhUkJiE2DSgtICMAISIiHD8VOiQrJCo9PA==";
    public C21594419fC LLLIILIL;
    public C19Y3 LLLIL;
    public TuxTextView LLLILZ;
    public View LLLILZJ;
    public View LLLILZLLLI;
    public C1245410iVv LLLIZZ;
    public int LLLJ = -1;
    public boolean LLLJIL = true;
    public boolean LLLJL = true;
    public final C01GW LLLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 302));
    public final C01GW LLLLII = C452501pT.LIZIZ(new C1238430iKf(this));
    public final C01GW LLLLIIIILLL = C452501pT.LIZIZ(new C1238440iKg(this));

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void HS() {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void aS() {
    }

    @Override // X.C0XYD
    public final void pn(int i, String str) {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final int sS() {
        return R.layout.a0l;
    }

    public final C21594419fC NS() {
        View viewFindViewById = this.LLLIILIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.qak) : null;
            this.LLLIILIL = (C21594419fC) viewFindViewById;
        }
        return (C21594419fC) viewFindViewById;
    }

    public final C19Y3 PS() {
        View viewFindViewById = this.LLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.qal) : null;
            this.LLLIL = (C19Y3) viewFindViewById;
        }
        return (C19Y3) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C1237010iIN iS() {
        return new C1237010iIN(getString(2131829309), null, false, null, null, false, "phone_sign_up_homepage", false, false, null, false, null, null, null, null, 67104766);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void clearFromXmlViewCache() {
        super.clearFromXmlViewCache();
        this.LLLIILIL = null;
        this.LLLIL = null;
        this.LLLILZ = null;
        this.LLLILZJ = null;
        this.LLLILZLLLI = null;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final boolean onBackPressed() {
        KeyboardUtils.LIZIZ(getView());
        super.onBackPressed();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(PhoneEmailSignUpFragment.class.getName());
        }
        super.onResume();
        getChildFragmentManager().LJZL(new AbstractC813200VvC() { // from class: X.0iVu
            @Override // X.AbstractC813200VvC
            public final void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
                super.onFragmentResumed(fragmentManager, fragment);
                PhoneEmailSignUpFragment phoneEmailSignUpFragment = this.LL;
                C1245410iVv c1245410iVv = phoneEmailSignUpFragment.LLLIZZ;
                if (c1245410iVv == null) {
                    c1245410iVv = null;
                }
                C128Y c128yLJJIJIL = c1245410iVv.LJJIJIL(phoneEmailSignUpFragment.LLLJ);
                if ((c128yLJJIJIL instanceof InterfaceC1740760vOs) && Intrinsics.LJFF(c128yLJJIJIL, fragment)) {
                    C2211631BhB.LJIIL((InterfaceC1740760vOs) c128yLJJIJIL, this.LL.getActivity());
                }
            }
        }, true);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        int i = this.LLLJ;
        if (i == -1) {
            Bundle arguments = getArguments();
            i = (arguments == null || arguments.getInt("child_page") != EnumC852910Xd3.INPUT_EMAIL_SIGN_UP.getValue()) ? 0 : 1;
        }
        int i2 = this.LLLJ;
        if (i2 != i) {
            if (i2 != -1) {
                this.LLLJIL = false;
            }
            this.LLLJ = i;
            NS().setCurrentItem(i);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        final int iIntValue;
        final int iIntValue2;
        C19Y2 c19y2;
        TextView customTextView;
        C19Y2 c19y22;
        TextView customTextView2;
        Integer numLIZJ;
        Integer numLIZJ2;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            C786410Ut5.LJJJI("page", "signup", arguments);
        }
        C1245410iVv c1245410iVv = new C1245410iVv(getChildFragmentManager());
        this.LLLIZZ = c1245410iVv;
        c1245410iVv.LJJIJL((C1245440iVy) this.LLLLII.getValue());
        C1245410iVv c1245410iVv2 = this.LLLIZZ;
        View viewFindViewById = null;
        if (c1245410iVv2 == null) {
            c1245410iVv2 = null;
        }
        c1245410iVv2.LJJIJL((C1245440iVy) this.LLLLIIIILLL.getValue());
        C21594419fC c21594419fCNS = NS();
        C1245410iVv c1245410iVv3 = this.LLLIZZ;
        if (c1245410iVv3 == null) {
            c1245410iVv3 = null;
        }
        c21594419fCNS.setAdapter(c1245410iVv3);
        if (!((Boolean) this.LLLL.getValue()).booleanValue()) {
            i = R.layout.a00;
        } else {
            i = R.layout.a01;
        }
        PS().setCustomTabViewResId(i);
        PS().setupWithViewPager(NS());
        int i2 = 0;
        if (((Boolean) this.LLLL.getValue()).booleanValue()) {
            TuxNavBar tuxNavBarGS = gS();
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = "";
            tuxNavBarGS.LJIJJ(c1250250idj);
            View viewFindViewById2 = this.LLLILZLLLI;
            if (viewFindViewById2 == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById2 = view2.findViewById(R.id.qan);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLLILZLLLI = viewFindViewById2;
            }
            C786410Ut5.LJLLLLLL(4, viewFindViewById2);
            View viewFindViewById3 = this.LLLILZ;
            if (viewFindViewById3 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById3 = view3.findViewById(R.id.qam);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLLILZ = (TuxTextView) viewFindViewById3;
            }
            C786410Ut5.LLLLZLL((TuxTextView) viewFindViewById3, 0);
            ((LinearLayout.LayoutParams) PS().getLayoutParams()).width = -2;
            C19Y3 c19y3PS = PS();
            c19y3PS.setTabMode(0);
            c19y3PS.setMarginBetweenTabs(16);
            if (Float.compare(C12ES.LJIIJ(getContext()), 360) < 0) {
                View viewFindViewById4 = this.LLLILZ;
                if (viewFindViewById4 == null) {
                    View view4 = getView();
                    if (view4 != null) {
                        viewFindViewById4 = view4.findViewById(R.id.qam);
                    } else {
                        viewFindViewById4 = null;
                    }
                    this.LLLILZ = (TuxTextView) viewFindViewById4;
                }
                TuxTextView tuxTextView = (TuxTextView) viewFindViewById4;
                C426750GoL.LJIIIZ(tuxTextView, null, 0, 16, null, false, 25);
                tuxTextView.setTuxFont(13);
                C19Y3 c19y3PS2 = PS();
                C426750GoL.LJIIIZ(c19y3PS2, 24, null, 24, null, false, 26);
                c19y3PS2.setMarginBetweenTabs(10);
                View view5 = this.LLLILZJ;
                if (view5 == null) {
                    View view6 = getView();
                    if (view6 != null) {
                        viewFindViewById = view6.findViewById(R.id.phl);
                    }
                    this.LLLILZJ = viewFindViewById;
                } else {
                    viewFindViewById = view5;
                }
                C426750GoL.LJIIL(viewFindViewById, null, 8, null, null, 29);
            }
        }
        C19Y3 c19y3PS3 = PS();
        Context context = c19y3PS3.getContext();
        if (context != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1k, context)) != null) {
            iIntValue = numLIZJ2.intValue();
        } else {
            iIntValue = 0;
        }
        Context context2 = c19y3PS3.getContext();
        if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1i, context2)) != null) {
            iIntValue2 = numLIZJ.intValue();
        } else {
            iIntValue2 = 0;
        }
        C21594419fC c21594419fCNS2 = NS();
        if (c21594419fCNS2 != null && c21594419fCNS2.getCurrentItem() == 1) {
            i2 = 1;
        }
        C19Y5 c19y5LJIIIZ = c19y3PS3.LJIIIZ(i2);
        if (c19y5LJIIIZ != null && (c19y22 = c19y5LJIIIZ.LJIIIIZZ) != null && (customTextView2 = c19y22.getCustomTextView()) != null) {
            customTextView2.setTextColor(iIntValue2);
        }
        C19Y5 c19y5LJIIIZ2 = c19y3PS3.LJIIIZ(1 - i2);
        if (c19y5LJIIIZ2 != null && (c19y2 = c19y5LJIIIZ2.LJIIIIZZ) != null && (customTextView = c19y2.getCustomTextView()) != null) {
            customTextView.setTextColor(iIntValue);
        }
        c19y3PS3.LIZIZ(new InterfaceC20516715Px() { // from class: X.0iVx
            @Override // X.InterfaceC20516715Px
            public final void LIZ(C19Y5 c19y5) {
            }

            @Override // X.InterfaceC20516715Px
            public final void LIZIZ(C19Y5 c19y5) {
                TextView customTextView3;
                C19Y2 c19y23 = c19y5.LJIIIIZZ;
                if (c19y23 != null && (customTextView3 = c19y23.getCustomTextView()) != null) {
                    customTextView3.setTextColor(iIntValue);
                }
            }

            @Override // X.InterfaceC20516715Px
            public final void LIZJ(C19Y5 c19y5) {
                C19Y2 c19y23;
                TextView customTextView3;
                if (c19y5 != null && (c19y23 = c19y5.LJIIIIZZ) != null && (customTextView3 = c19y23.getCustomTextView()) != null) {
                    customTextView3.setTextColor(iIntValue2);
                }
            }
        });
        NS().addOnPageChangeListener(new C1266190j3R(this, 1));
        PS().setOnTabClickListener(new InterfaceC1245470iW1() { // from class: X.0iVt
            @Override // X.InterfaceC1245470iW1
            public final void LIZ(C19Y5 c19y5) {
                String str;
                String str2;
                PhoneEmailSignUpFragment phoneEmailSignUpFragment = this.LIZ;
                phoneEmailSignUpFragment.LLLJIL = false;
                int i3 = phoneEmailSignUpFragment.LLLJ;
                int i4 = c19y5.LJ;
                if (i3 == i4) {
                    return;
                }
                if (i4 == 0) {
                    str = "switch_to_phone";
                } else {
                    str = "switch_to_email";
                }
                C0XGR c0xgr = new C0XGR();
                c0xgr.LIZLLL("enter_from", this.LIZ.getEnterFrom());
                c0xgr.LIZLLL("enter_method", this.LIZ.getEnterMethod());
                c0xgr.LIZLLL("enter_type", this.LIZ.LLJIJIL);
                c0xgr.LIZLLL("login_panel_type", this.LIZ.PR());
                if (this.LIZ.LLLJL) {
                    str2 = "1";
                } else {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                c0xgr.LIZLLL("is_first_show", str2);
                C20684815ws.LJIILLIIL(str, c0xgr.LIZ);
                PhoneEmailSignUpFragment phoneEmailSignUpFragment2 = this.LIZ;
                phoneEmailSignUpFragment2.LLLJL = false;
                phoneEmailSignUpFragment2.NS().setCurrentItem(c19y5.LJ);
            }
        });
    }
}
