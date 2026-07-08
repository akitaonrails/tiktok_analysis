package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.AbstractC19483511Kn;
import X.C01GW;
import X.C0I7D;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C0XGR;
import X.C0XQ6;
import X.C0XZ2;
import X.C0XZ4;
import X.C10S5;
import X.C1232150iAX;
import X.C1236870iI9;
import X.C1237010iIN;
import X.C1237030iIP;
import X.C1237220iIi;
import X.C1237880iJm;
import X.C1239250iLz;
import X.C13LE;
import X.C20533215Wg;
import X.C20684815ws;
import X.C2097908Jt;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2200821BBo;
import X.C2204961BRm;
import X.C2451909jB;
import X.C336720DHy;
import X.C452501pT;
import X.C616540OGe;
import X.C786410Ut5;
import X.C851360XaY;
import X.C851370XaZ;
import X.C851910XbR;
import X.C852510XcP;
import X.C852810Xct;
import X.C853660XeG;
import X.C853750XeP;
import X.EnumC1153490g7f;
import X.EnumC1237640iJO;
import X.EnumC852660Xce;
import X.EnumC852910Xd3;
import X.InterfaceC1238210iKJ;
import X.InterfaceC1254030ijp;
import X.InterfaceC852520XcQ;
import Y.ACListenerS87S1100000_19;
import Y.AfS178S0100000_9;
import Y.AfS46S1100000_13;
import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelLazy;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.account.login.v2.base.AvailableWaysViewModel;
import com.ss.android.ugc.aweme.account.login.v2.ui.AccountKeyBoardHelper;
import com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS168S1100000_19;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public final class EmailLoginFragment extends BaseI18nLoginFragment implements View.OnClickListener, InterfaceC1238210iKJ, InterfaceC852520XcQ, C10S5 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJSA0ISHELIOStiP319PSxiLz0yLygpJzsgZgAhKCY/BCorICEVOiQrJCo9PA==";
    public C1237880iJm LLLIILIL;
    public ConstraintLayout LLLIL;
    public View LLLILZ;
    public View LLLILZJ;
    public C0I7D LLLILZLLLI;
    public boolean LLLJ;
    public boolean LLLL;
    public C852510XcP LLLLII;
    public boolean LLLLIIIILLL;
    public String LLLLIIL;
    public final long LLLIZZ = System.currentTimeMillis();
    public String LLLJIL = "";
    public boolean LLLJL = true;
    public final ViewModelLazy LLLLIILL = C336720DHy.LIZ(this, C13LE.LIZ(AvailableWaysViewModel.class), new AwS563S0100000_19((Fragment) this, 263), new AwS420S0200000_19((Function0) null, this, 21), new AwS563S0100000_19((Fragment) this, 264));
    public long LLLLIILLL = -1;
    public final C01GW LLLLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 261));
    public final C01GW LLLLILI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 262));
    public final String LLLLJ = "email/username";

    @Override // X.C10S5
    public final String pO() {
        return "PhoneEmailLoginStep";
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final int sS() {
        return R.layout.a0w;
    }

    public final void NS() {
        C0I7D c0i7d = this.LLLILZLLLI;
        if (c0i7d == null) {
            c0i7d = null;
        }
        if (C1232150iAX.LIZJ(c0i7d)) {
            C01GW<Boolean> c01gw = AccountKeyBoardHelper.LLJ;
            if (C853750XeP.LIZ()) {
                C0I7D c0i7d2 = this.LLLILZLLLI;
                C1232150iAX.LIZ(c0i7d2 != null ? c0i7d2 : null);
            } else {
                C0I7D c0i7d3 = this.LLLILZLLLI;
                (c0i7d3 != null ? c0i7d3 : null).requestFocus();
            }
        }
    }

    public final C0XGR PS() {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_method", getEnterMethod());
        c0xgr.LIZLLL("enter_from", getEnterFrom());
        c0xgr.LIZLLL("login_panel_type", PR());
        return c0xgr;
    }

    public final C1237880iJm RS() {
        View viewFindViewById = this.LLLIILIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.gyz) : null;
            this.LLLIILIL = (C1237880iJm) viewFindViewById;
        }
        return (C1237880iJm) viewFindViewById;
    }

    public final View US() {
        View viewFindViewById = this.LLLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.vba) : null;
            this.LLLILZ = viewFindViewById;
        }
        return viewFindViewById;
    }

    @Override // X.InterfaceC852520XcQ
    public final String getEmail() {
        C0I7D c0i7d = this.LLLILZLLLI;
        if (c0i7d == null) {
            c0i7d = null;
        }
        return C2204961BRm.LLJILLL(c0i7d, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owsk1PEpk5Z4F7WzzjzzRSEqAB37ynHWPT2yRWBWGmlof9q9iQ==", null)).toString();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C1237010iIN iS() {
        C1237010iIN c1237010iIN;
        if (this.LLLJ) {
            String string = getString(2131829304);
            String string2 = getString(2131829335);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("<b>");
            sbLIZ.append(getString(2131833841));
            sbLIZ.append("</b>");
            c1237010iIN = new C1237010iIN(string, null, false, string2, Html.fromHtml(getString(2131833842, C2188811AlT.LIZIZ(sbLIZ))), false, "email_sign_up_to_login_enter_password_page", false, true, null, false, null, null, null, null, 67071230);
        } else {
            c1237010iIN = new C1237010iIN(null, null, false, null, null, false, "email_login_homepage", false, true, null, false, null, null, null, null, 67071999);
        }
        c1237010iIN.LJIJ = new C1237030iIP(null, C1236870iI9.LIZ(true), C1236870iI9.LIZIZ(true), null, 9);
        if (((Boolean) this.LLLLILI.getValue()).booleanValue()) {
            c1237010iIN.LJIJI = new C1237030iIP(getString(2131830557), null, null, new AwS598S0100000_19(this, 88), 6);
        }
        return c1237010iIN;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final List<View> qS() {
        View viewFindViewById = this.LLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.gyb) : null;
            this.LLLIL = (ConstraintLayout) viewFindViewById;
        }
        return Collections.singletonList(viewFindViewById);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void HS() {
        nS().setLoading(true);
    }

    public final void XS() {
        if (isViewValid()) {
            C0I7D c0i7d = this.LLLILZLLLI;
            if (c0i7d == null) {
                c0i7d = null;
            }
            nS().setEnabled(!C1232150iAX.LIZJ(c0i7d));
            RS().LIZ();
            if (this.LLLLIIL != null) {
                C786410Ut5.LJLLLLLL(8, US());
                this.LLLLIIL = null;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void aS() {
        nS().setLoading(false);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void clearFromXmlViewCache() {
        super.clearFromXmlViewCache();
        this.LLLIILIL = null;
        this.LLLIL = null;
        this.LLLILZ = null;
        this.LLLILZJ = null;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C0I7D c0i7d = this.LLLILZLLLI;
        if (c0i7d == null) {
            c0i7d = null;
        }
        KeyboardUtils.LIZIZ(c0i7d);
        clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(EmailLoginFragment.class.getName());
        }
        super.onResume();
        if (this.LLLJ) {
            NS();
        }
        XS();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.LLLLIIIILLL = false;
    }

    @Override // X.InterfaceC1238210iKJ
    public final boolean h1() {
        return this.LLLJL;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final String hS() {
        return this.LLLLJ;
    }

    public final void VS(String str) {
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        C786410Ut5.LJJJI("args_email", str, arguments);
        arguments.putBoolean("is_from_username_login", true);
        arguments.putInt("next_page", EnumC852910Xd3.EMAIL_OTP_LOGIN_SWITCH_TO_PASSWORD.getValue());
        arguments.putInt("current_scene", SR().getValue());
        arguments.putInt("current_scene", SR().getValue());
        JS(arguments);
        fo(arguments);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, X.C0XYD
    public final void dk(int i) {
        super.dk(i);
        if (i != 2) {
            if (i == 3) {
                C0I7D c0i7d = this.LLLILZLLLI;
                if (c0i7d == null) {
                    c0i7d = null;
                }
                String string = C2204961BRm.LLJILLL(c0i7d, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owsk1PEpk5Z4F7WzzjzzRSEqAB37ynHWPT2yRWBWGmlof9q9iQ==", null)).toString();
                Bundle arguments = getArguments();
                if (arguments == null) {
                    arguments = new Bundle();
                }
                C786410Ut5.LJJJI("args_email", string, arguments);
                arguments.putInt("next_page", EnumC852910Xd3.ORG_OTP_LOGIN.getValue());
                arguments.putInt("current_scene", SR().getValue());
                JS(arguments);
                fo(arguments);
                return;
            }
            return;
        }
        C0I7D c0i7d2 = this.LLLILZLLLI;
        if (c0i7d2 == null) {
            c0i7d2 = null;
        }
        VS(C2204961BRm.LLJILLL(c0i7d2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owsk1PEpk5Z4F7WzzjzzRSEqAB37ynHWPT2yRWBWGmlof9q9iQ==", null)).toString());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        C1237220iIi c1237220iIi;
        this.LLLJL = false;
        C0XQ6.LIZ(getContext());
        C0I7D c0i7d = this.LLLILZLLLI;
        if (c0i7d == null) {
            c0i7d = null;
        }
        String string = C2204961BRm.LLJILLL(c0i7d, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owsk1PEpk5Z4F7WzzjzzRSEqAB37ynHWPT2yRWBWGmlof9q9iQ==", null)).toString();
        boolean zLIZ = C2451909jB.LIZ(string);
        C0XGR c0xgrPS = PS();
        if (zLIZ) {
            str = "email";
        } else {
            str = "handle";
        }
        c0xgrPS.LIZLLL("platform", str);
        c0xgrPS.LIZIZ(System.currentTimeMillis() - this.LLLIZZ, "stay_time");
        C20684815ws.LJIILLIIL("phone_email_click_next", c0xgrPS.LIZ);
        C852810Xct.LIZ.getClass();
        C852810Xct.LJIIZILJ(this, string);
        C0I7D c0i7d2 = this.LLLILZLLLI;
        if (c0i7d2 == null) {
            c0i7d2 = null;
        }
        final String string2 = C2204961BRm.LLJILLL(c0i7d2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owsk1PEpk5Z4F7WzzjzzRSEqAB37ynHWPT2yRWBWGmlof9q9iQ==", null)).toString();
        if (C2451909jB.LIZ(string2)) {
            C851370XaZ c851370XaZLIZ = C851360XaY.LIZ(getActivity(), string2, EnumC852660Xce.EMAIL_OTP_LOGIN);
            if (c851370XaZLIZ != null && (c1237220iIi = c851370XaZLIZ.LIZ) != null && c1237220iIi.LIZIZ()) {
                fo(QS(string2, false));
                return;
            }
            Map<String, String> mapNR = NR();
            mapNR.put("use_passport_ticket", "1");
            mapNR.put(Scene.SCENE_SERVICE, "3");
            C0XZ4.LJJIII(C0XZ4.LIZ, this, this, string2, 13, "click_continue", mapNR, null, null, null, null, 960).LJIIIIZZ(new AfS46S1100000_13(this, string2, 14)).LJIILL();
            return;
        }
        AwS168S1100000_19 awS168S1100000_19 = new AwS168S1100000_19(this, string2, 8);
        C0XZ4 c0xz4 = C0XZ4.LIZ;
        final Map mapLIZJ = C2097908Jt.LIZJ(new Pair(Scene.SCENE_SERVICE, "3"));
        c0xz4.getClass();
        C1239250iLz.LIZIZ(this, this, AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0XZw
            /* JADX WARN: Type inference failed for: r6v0, types: [X.0XGw, X.0XZt] */
            @Override // X.InterfaceC1254030ijp
            public final void LIZ(final C11KY c11ky) {
                ?? r6 = new AbstractC850960XZu() { // from class: X.0XZt
                    @Override // X.C0XH7
                    /* JADX INFO: renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
                    public final void LJI(C0XT7<C850990XZx> c0xt7) {
                        if (c0xt7 != null) {
                            ((C11KY) c11ky).onSuccess(c0xt7);
                        }
                    }

                    @Override // X.C0XH7
                    /* JADX INFO: renamed from: LJII, reason: merged with bridge method [inline-methods] */
                    public final void LJ(C0XT7<C850990XZx> c0xt7, int i) {
                        int i2;
                        String str2;
                        if (c0xt7 != null) {
                            i2 = c0xt7.LIZLLL;
                        } else {
                            i2 = -10000;
                        }
                        if (c0xt7 != null) {
                            str2 = c0xt7.LJFF;
                        } else {
                            str2 = null;
                        }
                        EnumC852660Xce enumC852660Xce = EnumC852660Xce.LOGIN;
                        EnumC852910Xd3 enumC852910Xd3 = EnumC852910Xd3.INPUT_EMAIL_LOGIN;
                        C0XZ4.LIZ.getClass();
                        ((C11KY) c11ky).onError(new C0XZJ(i2, str2, enumC852660Xce, enumC852910Xd3, C0XZ4.LJIIJJI(c0xt7), ""));
                    }
                };
                this.gk(r6);
                Context context = this.getContext();
                if (context != null) {
                    String str2 = string2;
                    Map<String, String> map = mapLIZJ;
                    C850990XZx c850990XZx = new C850990XZx(str2);
                    C846070XGz c846070XGz = new C846070XGz();
                    c846070XGz.LIZ = C0XH1.LIZ("/passport/user/check_login_name_registered/");
                    HashMap map2 = new HashMap();
                    if (!TextUtils.isEmpty(c850990XZx.LJI)) {
                        map2.put("login_name", c850990XZx.LJI);
                    }
                    if (map != null && !map.isEmpty()) {
                        map2.putAll(map);
                    }
                    c846070XGz.LIZLLL(map2);
                    new AbstractC845940XGm<C0XT7<C850990XZx>>(context, c846070XGz.LIZIZ(), c850990XZx, r6) { // from class: X.0XZv
                        public static final /* synthetic */ int LJIIIZ = 0;
                        public final C850990XZx LJIIIIZZ;

                        @Override // X.AbstractC845940XGm
                        public final /* bridge */ /* synthetic */ void LJ(C0XGA c0xga) {
                        }

                        @Override // X.AbstractC845940XGm
                        public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
                            C0XV1.LIZJ(this.LJIIIIZZ, jSONObject);
                            this.LJIIIIZZ.LJ = jSONObject2;
                        }

                        @Override // X.AbstractC845940XGm
                        public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
                            this.LJIIIIZZ.LJ = jSONObject;
                            JSONObjectProtectorUtils.getBoolean(jSONObject2, "is_registered");
                        }

                        @Override // X.AbstractC845940XGm
                        public final C0XGA LJIIJ(boolean z, C845980XGq c845980XGq) {
                            return new C0XT7(z, 1008, this.LJIIIIZZ);
                        }

                        {
                            this.LJIIIIZZ = c850990XZx;
                        }
                    }.LJIIIZ();
                }
            }
        })).LJIIIIZZ(new AfS178S0100000_9(awS168S1100000_19, 39)).LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        String string;
        C852510XcP c852510XcP;
        String str;
        Serializable serializable;
        this.LLLLIILLL = System.currentTimeMillis();
        super.onCreate(bundle);
        EnumC852660Xce enumC852660XceSR = SR();
        EnumC852660Xce enumC852660Xce = EnumC852660Xce.RECOVER_ACCOUNT;
        if (enumC852660XceSR == enumC852660Xce) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                serializable = arguments.getSerializable("recover_account_data");
            } else {
                serializable = null;
            }
            this.LLLLII = (C852510XcP) serializable;
        }
        boolean z3 = false;
        if (VR() == EnumC852910Xd3.EMAIL_PASSWORD_LOGIN) {
            z = true;
        } else {
            z = false;
        }
        this.LLLJ = z;
        if (z) {
            C852810Xct.LIZ.getClass();
            this.LLLJIL = C852810Xct.LJ(getArguments());
            return;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            z2 = arguments2.getBoolean("email_should_add_email", false);
        } else {
            z2 = false;
        }
        C852510XcP c852510XcP2 = this.LLLLII;
        if (c852510XcP2 != null) {
            z3 = c852510XcP2.safe;
        }
        if (SR() == enumC852660Xce && z2) {
            if (!z3 || (c852510XcP = this.LLLLII) == null || (str = c852510XcP.email) == null) {
                return;
            }
            this.LLLJIL = str;
            return;
        }
        Bundle arguments3 = getArguments();
        String str2 = "";
        if (arguments3 != null && (string = arguments3.getString("auto_fill_account_name", "")) != null) {
            str2 = string;
        }
        this.LLLJIL = str2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        boolean z2;
        Object obj;
        boolean zBooleanValue = z;
        View viewFindViewById = null;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/account/login/v2/ui/fragments/EmailLoginFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(zBooleanValue)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owsk1PEpk5Z4F7WzzjzzRSEqAB37ynHWPT2yRWBWGmlof9q9iQ==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            zBooleanValue = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(zBooleanValue);
        if (zBooleanValue) {
            if (isViewValid()) {
                C851910XbR c851910XbR = C851910XbR.LIZ;
                View view = this.LLLILZJ;
                if (view == null) {
                    View view2 = getView();
                    if (view2 != null) {
                        viewFindViewById = view2.findViewById(R.id.phl);
                    }
                    this.LLLILZJ = viewFindViewById;
                } else {
                    viewFindViewById = view;
                }
                if (((IOneClickLoginService) ServiceManager.get().getService(IOneClickLoginService.class)).LIZIZ() && (!this.LLLJ || ComplianceServiceProvider.LJIJ().LIZLLL("sign_up"))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean zWS = wS();
                String strPR = PR();
                String str = this.LLLLJ;
                c851910XbR.getClass();
                this.LLLF = C851910XbR.LIZ(viewFindViewById, z2, zWS, strPR, str, null, true);
                NS();
            } else {
                this.LLLL = true;
            }
        }
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && zBooleanValue) {
            C20533215Wg.LIZ(EmailLoginFragment.class);
        }
    }

    public final Bundle QS(String str, boolean z) {
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        if (C0XZ2.LIZIZ(str)) {
            arguments.putInt("next_page", EnumC852910Xd3.EMAIL_LINK_LOGIN_OR_SIGNUP.getValue());
        } else {
            arguments.putInt("next_page", EnumC852910Xd3.EMAIL_OTP_LOGIN.getValue());
        }
        C786410Ut5.LJJJI("args_email", str, arguments);
        arguments.putInt("current_scene", EnumC852660Xce.EMAIL_OTP_LOGIN.getValue());
        arguments.putBoolean("code_sent", z);
        C786410Ut5.LJJIJL(arguments, "get_available_ways_approach", new AvailableWaysViewModel.GetAvailableWayType(true, false));
        arguments.putBoolean("is_register", false);
        JS(arguments);
        return arguments;
    }

    public final void YS(String str, String str2) {
        this.LLLLIIL = str;
        nS().setEnabled(false);
        C786410Ut5.I7(new ACListenerS87S1100000_19(this, str2, 0), US());
        C786410Ut5.LJLLLLLL(0, US());
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x01ac  */
    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailLoginFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.C0XYD
    public final void pn(int i, String str) {
        String str2;
        if (i == 1011) {
            C0I7D c0i7d = this.LLLILZLLLI;
            if (c0i7d == null) {
                c0i7d = null;
            }
            if (C2451909jB.LIZ(C2204961BRm.LLJILLL(c0i7d, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owsk1PEpk5Z4F7WzzjzzRSEqAB37ynHWPT2yRWBWGmlof9q9iQ==", null)).toString())) {
                str2 = "email";
            } else {
                str2 = "username";
            }
            EnumC1153490g7f enumC1153490g7f = EnumC1153490g7f.STYLE_V1;
            C853660XeG c853660XeG = C853660XeG.LIZ;
            String enterFrom = getEnterFrom();
            String enterMethod = getEnterMethod();
            String panelType = EnumC1237640iJO.LOGIN.getPanelType();
            c853660XeG.getClass();
            C0XGR c0xgr = new C0XGR();
            c0xgr.LIZLLL("enter_from", enterFrom);
            c0xgr.LIZLLL("enter_method", enterMethod);
            c0xgr.LIZLLL("login_panel_type", panelType);
            c0xgr.LIZLLL("platform", str2);
            c0xgr.LIZLLL("button_design", enumC1153490g7f.getValue());
            C20684815ws.LJIILLIIL("create_account_message_show", c0xgr.LIZ);
            YS(str, str2);
        }
        RS().LIZIZ(str);
    }
}
