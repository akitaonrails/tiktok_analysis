package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.C01GW;
import X.C0XGR;
import X.C1237010iIN;
import X.C1238410iKd;
import X.C1238420iKe;
import X.C1245410iVv;
import X.C1245440iVy;
import X.C1250250idj;
import X.C1266190j3R;
import X.C128Y;
import X.C12ES;
import X.C1308910kAL;
import X.C19Y2;
import X.C19Y3;
import X.C19Y5;
import X.C20684815ws;
import X.C2105908Mv;
import X.C21594419fC;
import X.C2187451AjH;
import X.C2211631BhB;
import X.C426750GoL;
import X.C452501pT;
import X.C616540OGe;
import X.C786410Ut5;
import X.C798410VTr;
import X.EnumC852660Xce;
import X.EnumC852910Xd3;
import X.InterfaceC1245470iW1;
import X.InterfaceC1740760vOs;
import X.InterfaceC20516715Px;
import android.content.Context;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneEmailLoginFragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class PhoneEmailLoginFragment extends BaseI18nLoginFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJSA0IStiHELIOSP319PSxiLz0yLygpJzsgZhUkJiE2DSgtICMfJyIlJwkhKSIhLCEn";
    public C21594419fC LLLIILIL;
    public C19Y3 LLLIL;
    public TuxTextView LLLILZ;
    public View LLLILZJ;
    public View LLLILZLLLI;
    public C1245410iVv LLLIZZ;
    public final C01GW LLLJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
    public int LLLJIL = -1;
    public boolean LLLJL = true;
    public boolean LLLL = true;
    public long LLLLII = -1;
    public final C01GW LLLLIIIILLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 301));
    public final C01GW LLLLIIL = C452501pT.LIZIZ(new C1238410iKd(this));
    public final C01GW LLLLIILL = C452501pT.LIZIZ(new C1238420iKe(this));

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
        return R.layout.a0k;
    }

    public final C21594419fC NS() {
        View viewFindViewById = this.LLLIILIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.qag) : null;
            this.LLLIILIL = (C21594419fC) viewFindViewById;
        }
        return (C21594419fC) viewFindViewById;
    }

    public final C19Y3 PS() {
        View viewFindViewById = this.LLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.qah) : null;
            this.LLLIL = (C19Y3) viewFindViewById;
        }
        return (C19Y3) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C1237010iIN iS() {
        return new C1237010iIN(getString(2131829350), null, false, null, null, false, "phone_login_homepage", SR() != EnumC852660Xce.RECOVER_ACCOUNT, false, null, false, null, null, null, null, 67096574);
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

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(PhoneEmailLoginFragment.class.getName());
        }
        super.onResume();
        C1245410iVv c1245410iVv = this.LLLIZZ;
        if (c1245410iVv == null) {
            c1245410iVv = null;
        }
        C128Y c128yLJJIJIL = c1245410iVv.LJJIJIL(this.LLLJIL);
        if (c128yLJJIJIL instanceof InterfaceC1740760vOs) {
            C2211631BhB.LJIIL((InterfaceC1740760vOs) c128yLJJIJIL, getActivity());
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        int i = this.LLLJIL;
        if (i == -1) {
            Bundle arguments = getArguments();
            i = (arguments == null || arguments.getInt("child_page") != EnumC852910Xd3.INPUT_EMAIL_LOGIN.getValue()) ? 0 : 1;
        }
        int i2 = this.LLLJIL;
        if (i2 != i) {
            if (i2 != -1) {
                this.LLLJL = false;
            }
            this.LLLJIL = i;
            NS().setCurrentItem(i);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        this.LLLLII = System.currentTimeMillis();
        super.onCreate(bundle);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        final int iIntValue;
        final int iIntValue2;
        int i2;
        float fMeasureText;
        String string;
        String string2;
        String string3;
        String string4;
        C19Y2 c19y2;
        TextView customTextView;
        TextPaint paint;
        C19Y2 c19y22;
        TextView customTextView2;
        C19Y2 c19y23;
        TextView customTextView3;
        Integer numLIZJ;
        Integer numLIZJ2;
        super.onViewCreated(view, bundle);
        if (C798410VTr.LIZ()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("monitor_scene", "scene_login");
            linkedHashMap.put("vv_code", 2212);
            C798410VTr.LJFF(linkedHashMap);
        }
        C1245410iVv c1245410iVv = new C1245410iVv(getChildFragmentManager());
        this.LLLIZZ = c1245410iVv;
        c1245410iVv.LJJIJL((C1245440iVy) this.LLLLIIL.getValue());
        C1245410iVv c1245410iVv2 = this.LLLIZZ;
        String string5 = null;
        if (c1245410iVv2 == null) {
            c1245410iVv2 = null;
        }
        c1245410iVv2.LJJIJL((C1245440iVy) this.LLLLIILL.getValue());
        C21594419fC c21594419fCNS = NS();
        C1245410iVv c1245410iVv3 = this.LLLIZZ;
        if (c1245410iVv3 == null) {
            c1245410iVv3 = null;
        }
        c21594419fCNS.setAdapter(c1245410iVv3);
        if (!((Boolean) this.LLLLIIIILLL.getValue()).booleanValue()) {
            i = R.layout.a00;
        } else {
            i = R.layout.a01;
        }
        PS().setCustomTabViewResId(i);
        PS().setupWithViewPager(NS());
        if (((Boolean) this.LLLLIIIILLL.getValue()).booleanValue()) {
            TuxNavBar tuxNavBarGS = gS();
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = "";
            tuxNavBarGS.LJIJJ(c1250250idj);
            View viewFindViewById = this.LLLILZLLLI;
            if (viewFindViewById == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.qai);
                } else {
                    viewFindViewById = null;
                }
                this.LLLILZLLLI = viewFindViewById;
            }
            C786410Ut5.LJLLLLLL(4, viewFindViewById);
            View viewFindViewById2 = this.LLLILZ;
            if (viewFindViewById2 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById2 = view3.findViewById(R.id.qaj);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLLILZ = (TuxTextView) viewFindViewById2;
            }
            C786410Ut5.LLLLZLL((TuxTextView) viewFindViewById2, 0);
            ((LinearLayout.LayoutParams) PS().getLayoutParams()).width = -2;
            C19Y3 c19y3PS = PS();
            c19y3PS.setTabMode(0);
            c19y3PS.setMarginBetweenTabs(16);
            if (Float.compare(C12ES.LJIIJ(getContext()), 360) < 0) {
                View viewFindViewById3 = this.LLLILZ;
                if (viewFindViewById3 == null) {
                    View view4 = getView();
                    if (view4 != null) {
                        viewFindViewById3 = view4.findViewById(R.id.qaj);
                    } else {
                        viewFindViewById3 = null;
                    }
                    this.LLLILZ = (TuxTextView) viewFindViewById3;
                }
                TuxTextView tuxTextView = (TuxTextView) viewFindViewById3;
                C426750GoL.LJIIIZ(tuxTextView, null, 0, 16, null, false, 25);
                tuxTextView.setTuxFont(13);
                C19Y3 c19y3PS2 = PS();
                C426750GoL.LJIIIZ(c19y3PS2, 24, null, 24, null, false, 26);
                c19y3PS2.setMarginBetweenTabs(10);
                View viewFindViewById4 = this.LLLILZJ;
                if (viewFindViewById4 == null) {
                    View view5 = getView();
                    if (view5 != null) {
                        viewFindViewById4 = view5.findViewById(R.id.phl);
                    } else {
                        viewFindViewById4 = null;
                    }
                    this.LLLILZJ = viewFindViewById4;
                }
                C426750GoL.LJIIL(viewFindViewById4, null, 8, null, null, 29);
            }
        } else {
            C19Y3 c19y3PS3 = PS();
            if (c19y3PS3 != null) {
                c19y3PS3.setMarginBetweenTabs(16);
            }
        }
        C19Y3 c19y3PS4 = PS();
        Context context = c19y3PS4.getContext();
        if (context != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1k, context)) != null) {
            iIntValue = numLIZJ2.intValue();
        } else {
            iIntValue = 0;
        }
        Context context2 = c19y3PS4.getContext();
        if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1i, context2)) != null) {
            iIntValue2 = numLIZJ.intValue();
        } else {
            iIntValue2 = 0;
        }
        C21594419fC c21594419fCNS2 = NS();
        if (c21594419fCNS2 != null && c21594419fCNS2.getCurrentItem() == 1) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        C19Y5 c19y5LJIIIZ = c19y3PS4.LJIIIZ(i2);
        if (c19y5LJIIIZ != null && (c19y23 = c19y5LJIIIZ.LJIIIIZZ) != null && (customTextView3 = c19y23.getCustomTextView()) != null) {
            customTextView3.setTextColor(iIntValue2);
        }
        C19Y5 c19y5LJIIIZ2 = c19y3PS4.LJIIIZ(1 - i2);
        if (c19y5LJIIIZ2 != null && (c19y22 = c19y5LJIIIZ2.LJIIIIZZ) != null && (customTextView2 = c19y22.getCustomTextView()) != null) {
            customTextView2.setTextColor(iIntValue);
        }
        c19y3PS4.LIZIZ(new InterfaceC20516715Px() { // from class: X.0iVw
            @Override // X.InterfaceC20516715Px
            public final void LIZ(C19Y5 c19y5) {
            }

            @Override // X.InterfaceC20516715Px
            public final void LIZIZ(C19Y5 c19y5) {
                TextView customTextView4;
                C19Y2 c19y24 = c19y5.LJIIIIZZ;
                if (c19y24 != null && (customTextView4 = c19y24.getCustomTextView()) != null) {
                    customTextView4.setTextColor(iIntValue);
                }
            }

            @Override // X.InterfaceC20516715Px
            public final void LIZJ(C19Y5 c19y5) {
                C19Y2 c19y24;
                TextView customTextView4;
                if (c19y5 != null && (c19y24 = c19y5.LJIIIIZZ) != null && (customTextView4 = c19y24.getCustomTextView()) != null) {
                    customTextView4.setTextColor(iIntValue2);
                }
            }
        });
        NS().addOnPageChangeListener(new C1266190j3R(this, 0));
        PS().setOnTabClickListener(new InterfaceC1245470iW1() { // from class: X.0iVs
            @Override // X.InterfaceC1245470iW1
            public final void LIZ(C19Y5 c19y5) {
                String str;
                String str2;
                PhoneEmailLoginFragment phoneEmailLoginFragment = this.LIZ;
                phoneEmailLoginFragment.LLLJL = false;
                if (phoneEmailLoginFragment.LLLJIL == c19y5.LJ) {
                    return;
                }
                C0XGR c0xgr = new C0XGR();
                if (c19y5.LJ == 0) {
                    str = "switch_to_phone";
                } else {
                    C0C64.LJIILLIIL().LJIIIZ(31744, "enable_org_login_optimize", true, true);
                    str = "switch_to_email";
                }
                c0xgr.LIZLLL("enter_method", this.LIZ.getEnterMethod());
                c0xgr.LIZLLL("enter_type", this.LIZ.LLJIJIL);
                c0xgr.LIZLLL("enter_from", this.LIZ.getEnterFrom());
                c0xgr.LIZLLL("login_panel_type", this.LIZ.PR());
                if (this.LIZ.LLLL) {
                    str2 = "1";
                } else {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                c0xgr.LIZJ("is_first_show", str2);
                C20684815ws.LJIILLIIL(str, c0xgr.LIZ);
                PhoneEmailLoginFragment phoneEmailLoginFragment2 = this.LIZ;
                phoneEmailLoginFragment2.LLLL = false;
                phoneEmailLoginFragment2.NS().setCurrentItem(c19y5.LJ);
            }
        });
        C19Y5 c19y5LJIIIZ3 = PS().LJIIIZ(1);
        if (c19y5LJIIIZ3 != null && (c19y2 = c19y5LJIIIZ3.LJIIIIZZ) != null && (customTextView = c19y2.getCustomTextView()) != null && (paint = customTextView.getPaint()) != null) {
            fMeasureText = paint.measureText(((C1245440iVy) this.LLLLIILL.getValue()).LIZIZ);
        } else {
            fMeasureText = 0.0f;
        }
        if (fMeasureText + C12ES.LIZJ(24.0f, getContext()) > C12ES.LJIIJ(getContext()) / 2) {
            PS().setTabMode(0);
        }
        Integer num = (Integer) this.LLLJ.getValue();
        if (num != null) {
            NS().setCurrentItem(num.intValue());
        }
        View viewFindViewById5 = view.findViewById(R.id.flu);
        TextView textView = (TextView) view.findViewById(R.id.flw);
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("deprecation_banner_text", "");
        } else {
            string = null;
        }
        View viewFindViewById6 = view.findViewById(R.id.flx);
        TextView textView2 = (TextView) view.findViewById(R.id.fm0);
        TextView textView3 = (TextView) view.findViewById(R.id.fly);
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            string2 = arguments2.getString("deprecation_banner_title", "");
        } else {
            string2 = null;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            string3 = arguments3.getString("deprecation_banner_description", "");
        } else {
            string3 = null;
        }
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            string4 = arguments4.getString("3p_failed_platform");
        } else {
            string4 = null;
        }
        if (!C2105908Mv.LIZ(string4) && !C2105908Mv.LIZ(string2) && !C2105908Mv.LIZ(string3)) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById5);
            C786410Ut5.LJLLLLLL(0, viewFindViewById6);
            textView2.setText(string2);
            textView3.setText(string3);
        } else {
            Bundle arguments5 = getArguments();
            if (arguments5 != null) {
                string5 = arguments5.getString("3p_failed_platform");
            }
            if (!C2105908Mv.LIZ(string5) && !C2105908Mv.LIZ(string)) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById6);
                C786410Ut5.LJLLLLLL(0, viewFindViewById5);
                textView.setText(string);
            } else {
                C786410Ut5.LJLLLLLL(8, viewFindViewById5);
                C786410Ut5.LJLLLLLL(8, viewFindViewById6);
            }
        }
        if (this.LLLLII > 0) {
            C0XGR c0xgr = new C0XGR();
            c0xgr.LIZIZ(System.currentTimeMillis() - this.LLLLII, "load_time");
            c0xgr.LIZLLL("enter_from", "login_homepage");
            c0xgr.LIZLLL("login_panel_type", "login");
            C20684815ws.LJIILLIIL("account_page_load_time", c0xgr.LIZ);
            this.LLLLII = -1L;
        }
    }
}
