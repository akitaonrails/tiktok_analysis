package com.ss.android.ugc.aweme.account.setpwd;

import X.AbstractC19483511Kn;
import X.C01GW;
import X.C0HTI;
import X.C0HZQ;
import X.C0I7D;
import X.C0PEM;
import X.C0TS1;
import X.C0WZX;
import X.C0XGR;
import X.C0XQ5;
import X.C0XUD;
import X.C0XZ4;
import X.C11NJ;
import X.C11S5;
import X.C11SU;
import X.C1232150iAX;
import X.C1237010iIN;
import X.C1237030iIP;
import X.C1237890iJn;
import X.C1239250iLz;
import X.C1391790mK1;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1489290orH;
import X.C1489320orK;
import X.C1669720tYI;
import X.C1678400tmI;
import X.C1701940uOG;
import X.C19475711Hn;
import X.C197039127h;
import X.C19EG;
import X.C19ME;
import X.C2026107wh;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2296808zG;
import X.C23250099c;
import X.C418440Gaw;
import X.C420580GeO;
import X.C426750GoL;
import X.C452501pT;
import X.C616540OGe;
import X.C688120Qyw;
import X.C786410Ut5;
import X.C814420VxA;
import X.C851880XbO;
import X.C851910XbR;
import X.C852170Xbr;
import X.C852280Xc2;
import X.C852290Xc3;
import X.C852340Xc8;
import X.C852390XcD;
import X.C852460XcK;
import X.C852470XcL;
import X.C852540XcS;
import X.C854830Xg9;
import X.C948810anX;
import X.C960203pA;
import X.C985403tE;
import X.EnumC1489220orA;
import X.EnumC852910Xd3;
import X.InterfaceC1254030ijp;
import X.InterfaceC20660615sy;
import X.InterfaceC626120Oh8;
import X.InterfaceC852360XcA;
import X.InterfaceC853790XeT;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS148S0100000_13;
import Y.ARunnableS113S0100000_13;
import Y.AfS182S0100000_13;
import Y.AfS40S1200000_13;
import Y.AfS46S1100000_13;
import Y.AfS9S2200000_13;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.eventtracking.SetPasswordClickNextEvent;
import com.ss.android.ugc.aweme.account.login.v2.base.AccountFlowSharedViewModel;
import com.ss.android.ugc.aweme.account.login.v2.network.SetPasswordMobHelper;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment;
import com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment;
import com.ss.android.ugc.aweme.account.settings.LeakedPasswordNotificationModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AFwS247S0000000_13;
import kotlin.jvm.internal.AwS379S0200000_13;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.AwS592S0100000_13;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import u4.q0;

/* JADX INFO: loaded from: classes14.dex */
public class BaseUpdatePasswordFragment extends BaseI18nLoginFragment implements InterfaceC20660615sy {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiHELIOSOionODIoZw0yOyAZOSsyPCAcKDwgPyo+LQkhKSIhLCEn";
    public C1237890iJn LLLIILIL;
    public C420580GeO LLLIL;
    public C420580GeO LLLILZ;
    public C420580GeO LLLILZJ;
    public String LLLLII;
    public boolean LLLLIIIILLL;
    public C0I7D LLLLIL;
    public C197039127h LLLLILI;
    public final C01GW LLLILZLLLI = C452501pT.LIZIZ(new AwS557S0100000_13(this, 85));
    public final C01GW LLLIZZ = C452501pT.LIZIZ(new AwS557S0100000_13(this, 90));
    public final C01GW LLLJ = C452501pT.LIZIZ(new AwS557S0100000_13(this, 88));
    public final C01GW LLLJIL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 86));
    public final String LLLJL = "password";
    public final C01GW LLLL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 89));
    public final C11NJ LLLLIIL = new C11NJ();
    public final C01GW LLLLIILL = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(100));
    public final C01GW LLLLIILLL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 87));
    public final C01GW LLLLJ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(98));
    public final C01GW LLLLJI = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(96));
    public final C01GW LLLLL = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(97));
    public final C01GW LLLLLIL = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(95));
    public final C01GW LLLLLILLIL = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(99));
    public final String LLLLLJIL = "update_password";

    public void hT() {
        final String string;
        Editable editableLLJILLL;
        HS();
        C0I7D c0i7d = this.LLLLIL;
        if (c0i7d == null || (editableLLJILLL = C2204961BRm.LLJILLL(c0i7d, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibEFvtmuhJujIFmlZoDAaOzALEuwjGjCzJ/lB0/WQx1xqpe", null))) == null || (string = editableLLJILLL.toString()) == null) {
            string = "";
        }
        if (ZS(string)) {
            return;
        }
        if (OR().yQ2()) {
            AccountFlowSharedViewModel accountFlowSharedViewModelOR = OR();
            C0HZQ c0hzq = this.LLLF;
            accountFlowSharedViewModelOR.wQ2(new CreatePasswordActions.CreatePasswordClickAction(new C852460XcK(string, c0hzq != null ? c0hzq.isChecked() : false), this));
            return;
        }
        if (VR() == EnumC852910Xd3.CREATE_PASSWORD_FOR_1P) {
            SetPasswordClickNextEvent setPasswordClickNextEvent = new SetPasswordClickNextEvent();
            setPasswordClickNextEvent.LJI(RR(), "page");
            setPasswordClickNextEvent.LJI(getEnterFrom(), "enter_from");
            setPasswordClickNextEvent.LJI(getEnterMethod(), "enter_method");
            setPasswordClickNextEvent.LJIIIIZZ();
        }
        if (eT()) {
            C19EG activity = getActivity();
            if (activity != null) {
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(activity), C0PEM.LIZJ, null, new C851880XbO(string, this, activity, null), 2);
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(YS())) {
            C0XZ4 c0xz4 = C0XZ4.LIZ;
            String strXS = XS();
            Bundle arguments = getArguments();
            String string2 = arguments != null ? arguments.getString("passport_ticket", null) : null;
            c0xz4.getClass();
            C0XZ4.LJJIJIL(this, this, string, strXS, string2).LJIIIIZZ(new AfS182S0100000_13(this, 50)).LJIILL();
            return;
        }
        String string3 = eT() ? getString(2131828514) : getString(2131828506);
        if (TextUtils.equals(VS(), "email")) {
            C0XZ4 c0xz42 = C0XZ4.LIZ;
            final String strYS = YS();
            final String strXS2 = XS();
            c0xz42.getClass();
            SetPasswordMobHelper setPasswordMobHelper = new SetPasswordMobHelper(this);
            C1239250iLz.LIZIZ(this, this, AbstractC19483511Kn.LJ(new InterfaceC1254030ijp(this) { // from class: X.0Xa6
                public final /* synthetic */ Fragment LIZIZ;

                {
                    this.LIZIZ = this;
                }

                /* JADX WARN: Type inference failed for: r3v0, types: [X.0XGw, X.0Xa7] */
                @Override // X.InterfaceC1254030ijp
                public final void LIZ(final C11KY c11ky) {
                    final C0XYD c0xyd = this;
                    ?? r3 = new AbstractC851110Xa9() { // from class: X.0Xa7
                        @Override // X.C0XH7
                        public final void LJFF(C0XGA c0xga) {
                            ((C11KY) c11ky).onError(new C0XZJ(c0xga.LIZLLL, c0xga.LJFF, c0xyd.scene(), c0xyd.LLJJLIIIJLLLLLLLZ(), null, ""));
                        }

                        @Override // X.C0XH7
                        /* JADX INFO: renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
                        public final void LJI(C0XT7<C851100Xa8> c0xt7) {
                            C851100Xa8 c851100Xa8 = (C851100Xa8) c0xt7.LJIIIZ;
                            if (c851100Xa8 != null && c851100Xa8.LJII != null) {
                                ((C11KY) c11ky).onSuccess(c0xt7);
                                return;
                            }
                            C0XWW<C0XT7<C851100Xa8>> c0xww = c11ky;
                            C0XYG c0xyg = C0XZJ.Companion;
                            EnumC852660Xce enumC852660XceScene = c0xyd.scene();
                            EnumC852910Xd3 enumC852910Xd3LLJJLIIIJLLLLLLLZ = c0xyd.LLJJLIIIJLLLLLLLZ();
                            c0xyg.getClass();
                            ((C11KY) c0xww).onError(C0XYG.LIZ(enumC852660XceScene, enumC852910Xd3LLJJLIIIJLLLLLLLZ));
                        }

                        @Override // X.C0XH7
                        /* JADX INFO: renamed from: LJII, reason: merged with bridge method [inline-methods] */
                        public final void LJ(C0XT7<C851100Xa8> c0xt7, int i) {
                            String str;
                            C0XWW<C0XT7<C851100Xa8>> c0xww = c11ky;
                            if (c0xt7 != null) {
                                str = c0xt7.LJFF;
                            } else {
                                str = null;
                            }
                            ((C11KY) c0xww).onError(new C0XZJ(i, str, c0xyd.scene(), c0xyd.LLJJLIIIJLLLLLLLZ(), null, ""));
                        }
                    };
                    this.gk(r3);
                    Context context = this.LIZIZ.getContext();
                    if (context != null) {
                        C851100Xa8 c851100Xa8 = new C851100Xa8(strYS, string, strXS2);
                        C846070XGz c846070XGz = new C846070XGz();
                        c846070XGz.LIZ = "/passport/email/change_password/";
                        HashMap map = new HashMap();
                        map.put("ticket", C2093608Ic.LIZIZ(c851100Xa8.LJI));
                        map.put("password", C2093608Ic.LIZIZ(c851100Xa8.LJII));
                        map.put("mix_mode", "1");
                        String str = c851100Xa8.LJIIIIZZ;
                        if (str != null && str.length() != 0) {
                            map.put("rule_strategies", str);
                        } else {
                            map.put("rules_version", "v2");
                        }
                        c846070XGz.LIZLLL(map);
                        new AbstractC845940XGm<C0XT7<C851100Xa8>>(context, c846070XGz.LJFF(), c851100Xa8, r3) { // from class: X.0Xa5
                            public static final /* synthetic */ int LJIIIZ = 0;
                            public final C851100Xa8 LJIIIIZZ;

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
                            }

                            @Override // X.AbstractC845940XGm
                            public final C0XGA LJIIJ(boolean z, C845980XGq c845980XGq) {
                                return new C0XT7(z, 1010, this.LJIIIIZZ);
                            }

                            {
                                this.LJIIIIZZ = c851100Xa8;
                            }
                        }.LJIIIZ();
                    }
                }
            }).LJIIIIZZ(new AfS40S1200000_13(setPasswordMobHelper, this, string, 9)).LJII(new AfS40S1200000_13(setPasswordMobHelper, this, string, 10))).LJIIIIZZ(new AfS46S1100000_13(this, string3, 9)).LJIILL();
            return;
        }
        C0XZ4 c0xz43 = C0XZ4.LIZ;
        final String strYS2 = YS();
        final String strXS3 = XS();
        c0xz43.getClass();
        SetPasswordMobHelper setPasswordMobHelper2 = new SetPasswordMobHelper(this);
        C1239250iLz.LIZIZ(this, this, AbstractC19483511Kn.LJ(new InterfaceC1254030ijp(this) { // from class: X.0Xa2
            public final /* synthetic */ Fragment LIZIZ;

            {
                this.LIZIZ = this;
            }

            /* JADX WARN: Type inference failed for: r3v0, types: [X.0XGw, X.0Xa0] */
            @Override // X.InterfaceC1254030ijp
            public final void LIZ(final C11KY c11ky) {
                final C0XYD c0xyd = this;
                ?? r3 = new AbstractC851010XZz() { // from class: X.0Xa0
                    @Override // X.C0XH7
                    public final void LJFF(C0XGA c0xga) {
                        ((C11KY) c11ky).onError(new C0XZJ(c0xga.LIZLLL, c0xga.LJFF, c0xyd.scene(), c0xyd.LLJJLIIIJLLLLLLLZ(), null, ""));
                    }

                    @Override // X.C0XH7
                    /* JADX INFO: renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
                    public final void LJI(C0XT7<C851050Xa3> c0xt7) {
                        C851050Xa3 c851050Xa3 = (C851050Xa3) c0xt7.LJIIIZ;
                        if (c851050Xa3 != null && c851050Xa3.LJII != null) {
                            ((C11KY) c11ky).onSuccess(c0xt7);
                            return;
                        }
                        C0XWW<C0XT7<C851050Xa3>> c0xww = c11ky;
                        C0XYG c0xyg = C0XZJ.Companion;
                        EnumC852660Xce enumC852660XceScene = c0xyd.scene();
                        EnumC852910Xd3 enumC852910Xd3LLJJLIIIJLLLLLLLZ = c0xyd.LLJJLIIIJLLLLLLLZ();
                        c0xyg.getClass();
                        ((C11KY) c0xww).onError(C0XYG.LIZ(enumC852660XceScene, enumC852910Xd3LLJJLIIIJLLLLLLLZ));
                    }

                    @Override // X.C0XH7
                    /* JADX INFO: renamed from: LJII, reason: merged with bridge method [inline-methods] */
                    public final void LJ(C0XT7<C851050Xa3> c0xt7, int i) {
                        String str;
                        C0XWW<C0XT7<C851050Xa3>> c0xww = c11ky;
                        if (c0xt7 != null) {
                            str = c0xt7.LJFF;
                        } else {
                            str = null;
                        }
                        ((C11KY) c0xww).onError(new C0XZJ(i, str, c0xyd.scene(), c0xyd.LLJJLIIIJLLLLLLLZ(), null, ""));
                    }
                };
                this.gk(r3);
                Context context = this.LIZIZ.getContext();
                if (context != null) {
                    C851060Xa4 c851060Xa4 = new C851060Xa4(strYS2, string, strXS3);
                    C846070XGz c846070XGz = new C846070XGz();
                    c846070XGz.LIZ = C0XH1.LIZ("/passport/password/change/");
                    HashMap map = new HashMap();
                    if (!TextUtils.isEmpty(c851060Xa4.LJIIIIZZ)) {
                        map.put("captcha", c851060Xa4.LJIIIIZZ);
                    }
                    map.put("ticket", C2093608Ic.LIZIZ(c851060Xa4.LJI));
                    map.put("password", C2093608Ic.LIZIZ(c851060Xa4.LJII));
                    map.put("mix_mode", "1");
                    String str = c851060Xa4.LJIIIZ;
                    if (str != null && str.length() != 0) {
                        map.put("rule_strategies", str);
                    } else {
                        map.put("rules_version", "v2");
                    }
                    c846070XGz.LIZLLL(map);
                    new AbstractC845940XGm<C0XT7<C851050Xa3>>(context, c846070XGz.LJFF(), c851060Xa4, r3) { // from class: X.0Xa1
                        public static final /* synthetic */ int LJIIIZ = 0;
                        public final C851050Xa3 LJIIIIZZ;

                        @Override // X.AbstractC845940XGm
                        public final void LJ(C0XGA c0xga) {
                            C0XG9.LIZIZ("passport_mobile_change_password", "mobile", null, c0xga, null);
                        }

                        @Override // X.AbstractC845940XGm
                        public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
                            C0XV1.LIZJ(this.LJIIIIZZ, jSONObject);
                            this.LJIIIIZZ.LJ = jSONObject2;
                        }

                        @Override // X.AbstractC845940XGm
                        public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
                            this.LJIIIIZZ.LJ = jSONObject;
                        }

                        @Override // X.AbstractC845940XGm
                        public final C0XGA LJIIJ(boolean z, C845980XGq c845980XGq) {
                            return new C0XT7(z, 1010, this.LJIIIIZZ);
                        }

                        {
                            this.LJIIIIZZ = c851060Xa4;
                        }
                    }.LJIIIZ();
                }
            }
        }).LJIIIIZZ(new AfS40S1200000_13(setPasswordMobHelper2, this, string, 11)).LJII(new AfS40S1200000_13(setPasswordMobHelper2, this, string, 12))).LJIIIIZZ(new AfS46S1100000_13(this, string3, 10)).LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public int sS() {
        return R.layout.a0a;
    }

    @Override // X.InterfaceC20660615sy
    public final boolean t2() {
        return true;
    }

    private final String VS() {
        return (String) this.LLLIZZ.getValue();
    }

    public final C420580GeO PS() {
        View viewFindViewById = this.LLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.dr2) : null;
            this.LLLIL = (C420580GeO) viewFindViewById;
        }
        return (C420580GeO) viewFindViewById;
    }

    public final C420580GeO QS() {
        View viewFindViewById = this.LLLILZJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.dr6) : null;
            this.LLLILZJ = (C420580GeO) viewFindViewById;
        }
        return (C420580GeO) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final String RR() {
        return (String) this.LLLL.getValue();
    }

    public final C420580GeO RS() {
        View viewFindViewById = this.LLLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.dr7) : null;
            this.LLLILZ = (C420580GeO) viewFindViewById;
        }
        return (C420580GeO) viewFindViewById;
    }

    public final C1237890iJn US() {
        View viewFindViewById = this.LLLIILIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.q3k) : null;
            this.LLLIILIL = (C1237890iJn) viewFindViewById;
        }
        return (C1237890iJn) viewFindViewById;
    }

    public final String XS() {
        return (String) this.LLLLIILL.getValue();
    }

    public final String YS() {
        return (String) this.LLLILZLLLI.getValue();
    }

    public final boolean eT() {
        return ((Boolean) this.LLLJ.getValue()).booleanValue();
    }

    public final void fT() {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", getEnterFrom());
        c0xgr.LIZLLL("page", RR());
        c0xgr.LIZLLL("platform", VS());
        C20684815ws.LJIILLIIL("exit_password_back", c0xgr.LIZ);
    }

    public final void gT() {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", getEnterFrom());
        c0xgr.LIZLLL("enter_method", getEnterMethod());
        c0xgr.LIZLLL("login_panel_type", PR());
        c0xgr.LIZLLL("platform", VS());
        c0xgr.LIZLLL("page", RR());
        C20684815ws.LJIILLIIL("start_password_typing", c0xgr.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public C1237010iIN iS() {
        C1237010iIN c1237010iIN = new C1237010iIN(null, null, false, null, null, false, null, false, false, null, false, null, null, null, null, 67108863);
        c1237010iIN.LJIIIIZZ = getString((eT() && this.LLLJIL.getValue() == null) ? R.string.update_pwd_hint : 2131829354);
        c1237010iIN.LIZ = " ";
        c1237010iIN.LJIIL = false;
        c1237010iIN.LJIIJ = true;
        c1237010iIN.LJIJ = new C1237030iIP(null, null, null, null, 15);
        return c1237010iIN;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.LLLLIIL.LJ();
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void HS() {
        nS().setLoading(true);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, X.InterfaceC1232290iAl
    public final void LLIIIZ() {
        LinearLayout.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        TuxTextView tuxTextViewMS = mS();
        if (tuxTextViewMS != null) {
            ViewGroup.LayoutParams layoutParams2 = tuxTextViewMS.getLayoutParams();
            if ((layoutParams2 instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                marginLayoutParams.topMargin = ((Number) this.LLLLJ.getValue()).intValue();
                C786410Ut5.R6(tuxTextViewMS, marginLayoutParams);
            }
        }
        C1237890iJn c1237890iJnUS = US();
        if (c1237890iJnUS != null) {
            ViewGroup.LayoutParams layoutParams3 = c1237890iJnUS.getLayoutParams();
            if (!(layoutParams3 instanceof LinearLayout.LayoutParams) || (layoutParams = (LinearLayout.LayoutParams) layoutParams3) == null) {
                return;
            }
            layoutParams.topMargin = ((Number) this.LLLLL.getValue()).intValue();
            layoutParams.bottomMargin = ((Number) this.LLLLL.getValue()).intValue();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1237890iJnUS);
            c1237890iJnUS.setLayoutParams(layoutParams);
        }
    }

    @Override // X.InterfaceC20658015sY
    public final boolean Xu() {
        return getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void aS() {
        nS().setLoading(false);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public void clearFromXmlViewCache() {
        super.clearFromXmlViewCache();
        this.LLLIILIL = null;
        this.LLLIL = null;
        this.LLLILZ = null;
        this.LLLILZJ = null;
    }

    @Override // X.InterfaceC20658015sY
    public final C688120Qyw i2() {
        return new C688120Qyw(requireContext(), this, null);
    }

    public final void iT() {
        if (getContext() != null) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C852540XcS(this, null), 3);
        }
    }

    public final void jT() {
        CharSequence charSequenceJ4;
        Context context = getContext();
        if (context != null) {
            String string = context.getString(2131824594);
            String string2 = context.getString(2131824611);
            final int iLIZ = C960203pA.LIZ(R.attr.a1h, context);
            C1678400tmI.LIZ.getClass();
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            LeakedPasswordNotificationModel leakedPasswordNotificationModel = C852390XcD.LIZ;
            LeakedPasswordNotificationModel leakedPasswordNotificationModel2 = (LeakedPasswordNotificationModel) settingsManagerLIZLLL.LJIIIIZZ("leaked_pw_notification_config_android", LeakedPasswordNotificationModel.class, leakedPasswordNotificationModel);
            if (leakedPasswordNotificationModel2 != null) {
                leakedPasswordNotificationModel = leakedPasswordNotificationModel2;
            }
            final String str = leakedPasswordNotificationModel.learnMoreLink;
            if (str != null) {
                String strJ4 = C786410Ut5.j4(string, Arrays.copyOf(new Object[]{string2}, 1));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strJ4);
                C786410Ut5.q2(spannableStringBuilder, new ClickableSpan() { // from class: X.0vwP
                    @Override // android.text.style.ClickableSpan
                    public final void onClick(View view) {
                        C1678400tmI c1678400tmI = C1678400tmI.LIZ;
                        String str2 = str;
                        c1678400tmI.getClass();
                        C1678400tmI.LIZIZ(str2);
                    }

                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                    public final void updateDrawState(TextPaint textPaint) {
                        textPaint.setColor(iLIZ);
                        C444890HcV c444890HcV = new C444890HcV();
                        c444890HcV.LIZ(82);
                        textPaint.setTypeface(c444890HcV.getTypeface());
                        textPaint.setUnderlineText(false);
                    }
                }, strJ4.length() - string2.length(), strJ4.length(), 33);
                charSequenceJ4 = spannableStringBuilder;
            } else {
                charSequenceJ4 = C786410Ut5.j4(string, Arrays.copyOf(new Object[]{""}, 1));
            }
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.uf;
            C1391790mK1 c1391790mK1 = new C1391790mK1(context, c0hti.LIZ(context));
            c1391790mK1.LJFF = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c1397580mTM.LJIIIZ = c1391790mK1;
            c1397580mTM.LJI(context.getString(2131824596));
            c1397580mTM.LIZIZ(charSequenceJ4);
            C985403tE.LIZ(c1397580mTM, new AwS379S0200000_13(context, this, 2));
            c1397580mTM.LIZJ(new AwS592S0100000_13(this, 33));
            c1397580mTM.LJIIIIZZ = true;
            new C1397510mTF(c1397580mTM).LIZLLL();
            C1669720tYI c1669720tYI = C1669720tYI.LIZ;
            String enterFrom = getEnterFrom();
            String strRR = RR();
            c1669720tYI.getClass();
            C1669720tYI.LIZIZ(enterFrom, strRR);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, X.InterfaceC1232290iAl
    public final void ln() {
        View view = getView();
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS113S0100000_13(this, 90));
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public boolean onBackPressed() {
        fT();
        super.onBackPressed();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(getClass().getName());
        }
        super.onResume();
        C0I7D c0i7d = this.LLLLIL;
        if (c0i7d != null) {
            C1232150iAX.LIZIZ(c0i7d);
        }
    }

    public static abstract class CreatePasswordActions implements InterfaceC853790XeT<Object> {
        public static final int $stable = 0;

        public abstract BaseI18nLoginFragment getFragment();

        public abstract /* synthetic */ Object getParams();

        public static final class ChangeToCreatePasswordAction extends CreatePasswordActions {
            public static final int $stable = 8;
            public final BaseI18nLoginFragment fragment;
            public final C852470XcL params;

            public final ChangeToCreatePasswordAction copy(C852470XcL c852470XcL, BaseI18nLoginFragment baseI18nLoginFragment) {
                return new ChangeToCreatePasswordAction(c852470XcL, baseI18nLoginFragment);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ChangeToCreatePasswordAction)) {
                    return false;
                }
                ChangeToCreatePasswordAction changeToCreatePasswordAction = (ChangeToCreatePasswordAction) obj;
                return Intrinsics.LJFF(this.params, changeToCreatePasswordAction.params) && Intrinsics.LJFF(this.fragment, changeToCreatePasswordAction.fragment);
            }

            public int hashCode() {
                return (this.params.hashCode() * 31) + this.fragment.hashCode();
            }

            public String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ChangeToCreatePasswordAction(params=");
                sbLIZ.append(this.params);
                sbLIZ.append(", fragment=");
                sbLIZ.append(this.fragment);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment.CreatePasswordActions
            public BaseI18nLoginFragment getFragment() {
                return this.fragment;
            }

            @Override // com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment.CreatePasswordActions
            public C852470XcL getParams() {
                return this.params;
            }

            public ChangeToCreatePasswordAction(C852470XcL c852470XcL, BaseI18nLoginFragment baseI18nLoginFragment) {
                this.params = c852470XcL;
                this.fragment = baseI18nLoginFragment;
            }
        }

        public static final class CreatePasswordClickAction extends CreatePasswordActions {
            public static final int $stable = 8;
            public final BaseI18nLoginFragment fragment;
            public final C852460XcK params;

            public final CreatePasswordClickAction copy(C852460XcK c852460XcK, BaseI18nLoginFragment baseI18nLoginFragment) {
                return new CreatePasswordClickAction(c852460XcK, baseI18nLoginFragment);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CreatePasswordClickAction)) {
                    return false;
                }
                CreatePasswordClickAction createPasswordClickAction = (CreatePasswordClickAction) obj;
                return Intrinsics.LJFF(this.params, createPasswordClickAction.params) && Intrinsics.LJFF(this.fragment, createPasswordClickAction.fragment);
            }

            public int hashCode() {
                return (this.params.hashCode() * 31) + this.fragment.hashCode();
            }

            public String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("CreatePasswordClickAction(params=");
                sbLIZ.append(this.params);
                sbLIZ.append(", fragment=");
                sbLIZ.append(this.fragment);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment.CreatePasswordActions
            public BaseI18nLoginFragment getFragment() {
                return this.fragment;
            }

            @Override // com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment.CreatePasswordActions
            public C852460XcK getParams() {
                return this.params;
            }

            public CreatePasswordClickAction(C852460XcK c852460XcK, BaseI18nLoginFragment baseI18nLoginFragment) {
                this.params = c852460XcK;
                this.fragment = baseI18nLoginFragment;
            }
        }
    }

    @Override // X.InterfaceC20658015sY
    public final String getSceneId() {
        return this.LLLLLJIL;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public String hS() {
        return this.LLLJL;
    }

    public final void NS(final String str) {
        final String str2;
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("rule_strategies", XS());
        if (((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin() && C0XQ5.LJ().isEnableMultiAccountLogin()) {
            linkedHashMap.put("multi_login", Uri.encode("1"));
        }
        final String str3 = (String) this.LLLJIL.getValue();
        if (str3 == null) {
            return;
        }
        String str4 = "phone";
        if (Intrinsics.LJFF(VS(), "phone") || Intrinsics.LJFF(VS(), "mobile")) {
            str2 = "mobile";
        } else {
            str2 = "email";
        }
        C0XZ4 c0xz4 = C0XZ4.LIZ;
        final String strYS = YS();
        c0xz4.getClass();
        SetPasswordMobHelper setPasswordMobHelper = new SetPasswordMobHelper(this);
        if (!Intrinsics.LJFF(str2, "mobile")) {
            str4 = str2;
        }
        C1239250iLz.LIZIZ(this, this, AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0XZg
            /* JADX WARN: Type inference failed for: r6v0, types: [X.0XGw, X.0XZi] */
            @Override // X.InterfaceC1254030ijp
            public final void LIZ(final C11KY c11ky) {
                String str5;
                final C0XYD c0xyd = this;
                ?? r6 = new AbstractC850870XZl() { // from class: X.0XZi
                    @Override // X.C0XH7
                    /* JADX INFO: renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
                    public final void LJI(C850850XZj c850850XZj) {
                        int i;
                        if (c850850XZj != null && c850850XZj.LJIILL != null) {
                            ((C11KY) c11ky).onSuccess(c850850XZj);
                            return;
                        }
                        C0XWW<C850850XZj> c0xww = c11ky;
                        if (c850850XZj != null) {
                            i = c850850XZj.LIZLLL;
                        } else {
                            i = -1;
                        }
                        ((C11KY) c0xww).onError(new C0XZJ(i, "no data", EnumC852660Xce.LOGIN, EnumC852910Xd3.CHANGE_PASSWORD, null, "no data"));
                    }

                    @Override // X.C0XH7
                    /* JADX INFO: renamed from: LJII, reason: merged with bridge method [inline-methods] */
                    public final void LJ(C850850XZj c850850XZj, int i) {
                        if (c850850XZj == null) {
                            C0XWW<C850850XZj> c0xww = c11ky;
                            C0XYG c0xyg = C0XZJ.Companion;
                            EnumC852660Xce enumC852660XceScene = c0xyd.scene();
                            EnumC852910Xd3 enumC852910Xd3LLJJLIIIJLLLLLLLZ = c0xyd.LLJJLIIIJLLLLLLLZ();
                            c0xyg.getClass();
                            ((C11KY) c0xww).onError(C0XYG.LIZ(enumC852660XceScene, enumC852910Xd3LLJJLIIIJLLLLLLLZ));
                            return;
                        }
                        ((C11KY) c11ky).onError(new C0XZJ(i, c850850XZj.LJFF, c0xyd.scene(), c0xyd.LLJJLIIIJLLLLLLLZ(), c850850XZj.LJII, ""));
                    }
                };
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                EnumC851500Xam.Companion.getClass();
                String value = EnumC851500Xam.ruleStrategies$delegate.getValue();
                C0XZ4.LIZ.getClass();
                C0XZ4.LJJIJLIJ(value, linkedHashMap2);
                Map<String, String> map = linkedHashMap;
                if (map != null) {
                    linkedHashMap2.putAll(map);
                }
                this.gk(r6);
                Context context = this.getContext();
                if (context != null) {
                    String str6 = str2;
                    C850860XZk c850860XZk = new C850860XZk(str, str3, strYS);
                    C846070XGz c846070XGz = new C846070XGz();
                    if (Intrinsics.LJFF(str6, "email")) {
                        str5 = "/passport/password/forced_reset_by_email_ticket/";
                    } else {
                        str5 = "/passport/password/forced_reset_by_mobile_ticket/";
                    }
                    c846070XGz.LIZ = str5;
                    boolean z = !Intrinsics.LJFF(str6, "email");
                    HashMap map2 = new HashMap();
                    map2.put("conditional_login_ticket", C2093608Ic.LIZIZ(c850860XZk.LJII));
                    map2.put("password", C2093608Ic.LIZIZ(c850860XZk.LJI));
                    String strLIZIZ = c850860XZk.LJIIIIZZ;
                    if (z) {
                        strLIZIZ = C2093608Ic.LIZIZ(strLIZIZ);
                    }
                    map2.put("ticket", strLIZIZ);
                    map2.put("mix_mode", "1");
                    map2.putAll(linkedHashMap2);
                    c846070XGz.LIZLLL(map2);
                    C850830XZh c850830XZh = new C850830XZh(context, c846070XGz.LJFF(), c850860XZk, r6);
                    c850830XZh.LJIIIZ = !Intrinsics.LJFF(str6, "email");
                    c850830XZh.LJIIIZ();
                }
            }
        }).LJIIIIZZ(new AfS9S2200000_13(this, setPasswordMobHelper, str4, str, 0)).LJII(new AfS9S2200000_13(this, setPasswordMobHelper, str4, str, 1))).LJIIIIZZ(new AfS46S1100000_13(this, str2, 7)).LJIILL();
    }

    public final boolean ZS(final String str) {
        final String str2 = (String) this.LLLJIL.getValue();
        if (str2 == null || str2.length() == 0) {
            return false;
        }
        if (!Intrinsics.LJFF(this.LLLLII, str)) {
            this.LLLLII = str;
            C0XZ4 c0xz4 = C0XZ4.LIZ;
            final String strXS = XS();
            c0xz4.getClass();
            C1239250iLz.LIZIZ(this, this, AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0XY4
                public final /* synthetic */ Map<String, String> LIZJ = null;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r3v0, types: [X.0XGw, X.0XY5] */
                @Override // X.InterfaceC1254030ijp
                public final void LIZ(final C11KY c11ky) {
                    final C0XYD c0xyd = this;
                    ?? r3 = new C0XY6() { // from class: X.0XY5
                        @Override // X.C0XH7
                        public final void LJI(C0XGA c0xga) {
                            int i;
                            if (c0xga != null && c0xga.LIZIZ) {
                                ((C11KY) c11ky).onSuccess(c0xga);
                                return;
                            }
                            C0XWW<C850430XXt> c0xww = c11ky;
                            if (c0xga != null) {
                                i = c0xga.LIZLLL;
                            } else {
                                i = -1;
                            }
                            ((C11KY) c0xww).onError(new C0XZJ(i, "no data", EnumC852660Xce.SET_OR_RESET_PASSWORD, EnumC852910Xd3.CHANGE_PASSWORD, null, "no data"));
                        }

                        @Override // X.C0XH7
                        public final void LJ(C0XGA c0xga, int i) {
                            if (c0xga == null) {
                                C0XWW<C850430XXt> c0xww = c11ky;
                                C0XYG c0xyg = C0XZJ.Companion;
                                EnumC852660Xce enumC852660XceScene = c0xyd.scene();
                                EnumC852910Xd3 enumC852910Xd3LLJJLIIIJLLLLLLLZ = c0xyd.LLJJLIIIJLLLLLLLZ();
                                c0xyg.getClass();
                                ((C11KY) c0xww).onError(C0XYG.LIZ(enumC852660XceScene, enumC852910Xd3LLJJLIIIJLLLLLLLZ));
                                return;
                            }
                            ((C11KY) c11ky).onError(new C0XZJ(i, c0xga.LJFF, c0xyd.scene(), c0xyd.LLJJLIIIJLLLLLLLZ(), c0xga.LJII, ""));
                        }
                    };
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("conditional_login_ticket", str2);
                    C0XZ4 c0xz42 = C0XZ4.LIZ;
                    String str3 = strXS;
                    c0xz42.getClass();
                    C0XZ4.LJJIJLIJ(str3, linkedHashMap);
                    Map<String, String> map = this.LIZJ;
                    if (map != null) {
                        linkedHashMap.putAll(map);
                    }
                    this.gk(r3);
                    this.m8().LIZJ(str, linkedHashMap, r3);
                }
            })).LJIIIIZZ(new AfS46S1100000_13(this, str, 8)).LJIILL();
            return true;
        }
        NS(str);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        Bundle arguments;
        super.onCreate(bundle);
        C852170Xbr c852170Xbr = C852170Xbr.LIZ;
        Bundle arguments2 = getArguments();
        c852170Xbr.getClass();
        if (C852170Xbr.LJI(arguments2) == null && (arguments = getArguments()) != null) {
            C786410Ut5.LJJIZ(arguments, "extra_param", new HashMap());
        }
        Map mapLJI = C852170Xbr.LJI(getArguments());
        if (mapLJI != null) {
            mapLJI.put("page", RR());
        }
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("platform", VS());
        c0xgr.LIZLLL("enter_from", getEnterFrom());
        c0xgr.LIZLLL("enter_method", getEnterMethod());
        c0xgr.LIZLLL("login_panel_type", PR());
        c0xgr.LIZLLL("page", RR());
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (string = arguments3.getString("enter_flow")) == null) {
            string = "";
        }
        c0xgr.LIZLLL("enter_flow", string);
        C20684815ws.LJIILLIIL("set_password_show", c0xgr.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        View viewFindViewById;
        super.onViewCreated(view, bundle);
        this.LLLLIL = US().getInputBox().LLJLILLLLZIIL;
        C197039127h c197039127hNS = nS();
        this.LLLLILI = c197039127hNS;
        if (c197039127hNS != null) {
            c197039127hNS.setEnabled(false);
        }
        C0I7D c0i7d = this.LLLLIL;
        if (c0i7d != null) {
            c0i7d.setHint(getString(2131857913));
        }
        PS().setDesc(getString(2131848247));
        RS().setDesc(getString(2131833848));
        QS().setDesc(getString(2131833847));
        final Resources resources = getResources();
        C852290Xc3 c852290Xc3 = new C852290Xc3(resources);
        ((ArrayList) c852290Xc3.LIZ).add(new InterfaceC852360XcA() { // from class: X.0Xc4
            public static final EnumC852270Xc1 LIZJ = EnumC852270Xc1.LENGTH_RANGE_RULE;
            public final int LIZ = 8;
            public final int LIZIZ = 20;

            @Override // X.InterfaceC852360XcA
            public final C852340Xc8 LIZ(String str) {
                boolean z;
                EnumC852270Xc1 enumC852270Xc1 = LIZJ;
                int i = this.LIZ;
                int i2 = this.LIZIZ;
                int length = str.length();
                if (i <= length && length <= i2) {
                    z = true;
                } else {
                    z = false;
                }
                return new C852340Xc8(enumC852270Xc1, z, null);
            }
        });
        ((ArrayList) c852290Xc3.LIZ).add(new InterfaceC852360XcA() { // from class: X.0Xc6
            public static final EnumC852270Xc1 LIZIZ = EnumC852270Xc1.LETTER_NUMBER_SPECIAL_CHAR_CONTAINED;
            public final C852350Xc9 LIZ = new C852350Xc9();

            @Override // X.InterfaceC852360XcA
            public final C852340Xc8 LIZ(String str) {
                this.LIZ.getClass();
                boolean z = false;
                if (PatternProtector.compile(".*[_~!@#$%^&*()+,.:;=<>?\\/|\\-\\[\\]\\\\].*").matcher(str).matches()) {
                    this.LIZ.getClass();
                    if (PatternProtector.compile(".*[A-Za-z].*").matcher(str).matches() && PatternProtector.compile(".*[\\d].*").matcher(str).matches()) {
                        z = true;
                    }
                }
                return new C852340Xc8(LIZIZ, z, null);
            }
        });
        ((ArrayList) c852290Xc3.LIZ).add(new InterfaceC852360XcA(resources) { // from class: X.0Xc5
            public static final EnumC852270Xc1 LIZJ = EnumC852270Xc1.ALL_CHARS_VALID_RULE;
            public final Resources LIZ;
            public final C852350Xc9 LIZIZ;

            {
                C852350Xc9 c852350Xc9 = new C852350Xc9();
                this.LIZ = resources;
                this.LIZIZ = c852350Xc9;
            }

            @Override // X.InterfaceC852360XcA
            public final C852340Xc8 LIZ(String str) {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char cCharAt = str.charAt(i);
                    this.LIZIZ.getClass();
                    if (!PatternProtector.compile("^[A-Za-z0-9_~!@#$%^&*()+,.:;=<>?\\/|\\-\\[\\]\\\\]*$").matcher(String.valueOf(cCharAt)).matches()) {
                        return new C852340Xc8(LIZJ, false, this.LIZ.getString(2131848246, Character.valueOf(cCharAt)));
                    }
                }
                return new C852340Xc8(LIZJ, true, null);
            }
        });
        final C852280Xc2 c852280Xc2 = new C852280Xc2(c852290Xc3);
        final C1489320orK c1489320orKLIZ = C1489290orH.LIZ();
        C11SU<C852340Xc8> c11su = c852280Xc2.LIZIZ;
        c11su.getClass();
        C19475711Hn c19475711Hn = new C19475711Hn(c11su);
        C11SU<EnumC1489220orA> c11su2 = c1489320orKLIZ.LIZIZ;
        c11su2.getClass();
        final int i = 0;
        C948810anX.LIZ(c19475711Hn, new C19475711Hn(c11su2)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new InterfaceC626120Oh8(this, i) { // from class: X.0Xg6
            public final int $t;
            public Object l0;

            public static final void onComplete$0(C854800Xg6 c854800Xg6) {
            }

            public static final void onComplete$1(C854800Xg6 c854800Xg6) {
            }

            public static final void onError$0(C854800Xg6 c854800Xg6, Throwable th) {
            }

            public static final void onError$1(C854800Xg6 c854800Xg6, Throwable th) {
            }

            @Override // X.InterfaceC626120Oh8
            public final void onComplete() {
                switch (this.$t) {
                    case 0:
                        onComplete$0(this);
                        break;
                    case 1:
                        onComplete$1(this);
                        break;
                }
            }

            @Override // X.InterfaceC626120Oh8
            public final void onError(Throwable th) {
                switch (this.$t) {
                    case 0:
                        onError$0(this, th);
                        break;
                    case 1:
                        onError$1(this, th);
                        break;
                }
            }

            @Override // X.InterfaceC626120Oh8
            public final void onNext(Object obj) {
                switch (this.$t) {
                    case 0:
                        onNext$0(this, obj);
                        break;
                    case 1:
                        onNext$1(this, obj);
                        break;
                }
            }

            @Override // X.InterfaceC626120Oh8
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                switch (this.$t) {
                    case 0:
                        onSubscribe$0(this, interfaceC420801kM);
                        break;
                    case 1:
                        onSubscribe$1(this, interfaceC420801kM);
                        break;
                }
            }

            {
                this.$t = i;
                this.l0 = this;
            }

            public static final void onNext$0(C854800Xg6 c854800Xg6, Object obj) {
                EnumC428960Gru enumC428960Gru;
                EnumC428960Gru enumC428960Gru2;
                EnumC428960Gru enumC428960Gru3;
                Pair pair = (Pair) obj;
                C852340Xc8 c852340Xc8 = (C852340Xc8) pair.getFirst();
                EnumC1489220orA enumC1489220orA = (EnumC1489220orA) pair.getSecond();
                int i2 = C852260Xc0.LIZ[c852340Xc8.LIZ.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            if (c852340Xc8.LIZIZ) {
                                ((BaseUpdatePasswordFragment) c854800Xg6.l0).US().LIZ();
                            } else {
                                BaseUpdatePasswordFragment baseUpdatePasswordFragment = (BaseUpdatePasswordFragment) c854800Xg6.l0;
                                String str = c852340Xc8.LIZJ;
                                if (str == null) {
                                    str = (String) baseUpdatePasswordFragment.LLLLIILLL.getValue();
                                }
                                baseUpdatePasswordFragment.pn(0, str);
                            }
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        C420580GeO c420580GeOQS = ((BaseUpdatePasswordFragment) c854800Xg6.l0).QS();
                        if (c852340Xc8.LIZIZ) {
                            enumC428960Gru3 = EnumC428960Gru.SUCCESS;
                        } else {
                            enumC428960Gru3 = EnumC428960Gru.NONE;
                        }
                        c420580GeOQS.setVariant(enumC428960Gru3);
                    }
                } else {
                    C420580GeO c420580GeOPS = ((BaseUpdatePasswordFragment) c854800Xg6.l0).PS();
                    if (c852340Xc8.LIZIZ) {
                        enumC428960Gru = EnumC428960Gru.SUCCESS;
                    } else {
                        enumC428960Gru = EnumC428960Gru.NONE;
                    }
                    c420580GeOPS.setVariant(enumC428960Gru);
                }
                C420580GeO c420580GeORS = ((BaseUpdatePasswordFragment) c854800Xg6.l0).RS();
                if (enumC1489220orA.isSetPasswordAllowed()) {
                    enumC428960Gru2 = EnumC428960Gru.SUCCESS;
                } else {
                    enumC428960Gru2 = EnumC428960Gru.NONE;
                }
                c420580GeORS.setVariant(enumC428960Gru2);
            }

            public static final void onNext$1(C854800Xg6 c854800Xg6, Object obj) {
                boolean z;
                Pair pair = (Pair) obj;
                BaseUpdatePasswordFragment baseUpdatePasswordFragment = (BaseUpdatePasswordFragment) c854800Xg6.l0;
                pair.getSecond();
                baseUpdatePasswordFragment.getClass();
                C197039127h c197039127h = ((BaseUpdatePasswordFragment) c854800Xg6.l0).LLLLILI;
                if (c197039127h != null) {
                    if (((Boolean) pair.getFirst()).booleanValue() && ((EnumC1489220orA) pair.getSecond()).isSetPasswordAllowed()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c197039127h.setEnabled(z);
                }
            }

            public static final void onSubscribe$0(C854800Xg6 c854800Xg6, InterfaceC420801kM interfaceC420801kM) {
                ((BaseUpdatePasswordFragment) c854800Xg6.l0).LLLLIIL.LIZ(interfaceC420801kM);
            }

            public static final void onSubscribe$1(C854800Xg6 c854800Xg6, InterfaceC420801kM interfaceC420801kM) {
                ((BaseUpdatePasswordFragment) c854800Xg6.l0).LLLLIIL.LIZ(interfaceC420801kM);
            }
        });
        C11SU<Boolean> c11su3 = c852280Xc2.LIZJ;
        c11su3.getClass();
        C19475711Hn c19475711Hn2 = new C19475711Hn(c11su3);
        C11SU<EnumC1489220orA> c11su4 = c1489320orKLIZ.LIZIZ;
        c11su4.getClass();
        final int i2 = 1;
        C948810anX.LIZ(c19475711Hn2, new C19475711Hn(c11su4)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new InterfaceC626120Oh8(this, i2) { // from class: X.0Xg6
            public final int $t;
            public Object l0;

            public static final void onComplete$0(C854800Xg6 c854800Xg6) {
            }

            public static final void onComplete$1(C854800Xg6 c854800Xg6) {
            }

            public static final void onError$0(C854800Xg6 c854800Xg6, Throwable th) {
            }

            public static final void onError$1(C854800Xg6 c854800Xg6, Throwable th) {
            }

            @Override // X.InterfaceC626120Oh8
            public final void onComplete() {
                switch (this.$t) {
                    case 0:
                        onComplete$0(this);
                        break;
                    case 1:
                        onComplete$1(this);
                        break;
                }
            }

            @Override // X.InterfaceC626120Oh8
            public final void onError(Throwable th) {
                switch (this.$t) {
                    case 0:
                        onError$0(this, th);
                        break;
                    case 1:
                        onError$1(this, th);
                        break;
                }
            }

            @Override // X.InterfaceC626120Oh8
            public final void onNext(Object obj) {
                switch (this.$t) {
                    case 0:
                        onNext$0(this, obj);
                        break;
                    case 1:
                        onNext$1(this, obj);
                        break;
                }
            }

            @Override // X.InterfaceC626120Oh8
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                switch (this.$t) {
                    case 0:
                        onSubscribe$0(this, interfaceC420801kM);
                        break;
                    case 1:
                        onSubscribe$1(this, interfaceC420801kM);
                        break;
                }
            }

            {
                this.$t = i2;
                this.l0 = this;
            }

            public static final void onNext$0(C854800Xg6 c854800Xg6, Object obj) {
                EnumC428960Gru enumC428960Gru;
                EnumC428960Gru enumC428960Gru2;
                EnumC428960Gru enumC428960Gru3;
                Pair pair = (Pair) obj;
                C852340Xc8 c852340Xc8 = (C852340Xc8) pair.getFirst();
                EnumC1489220orA enumC1489220orA = (EnumC1489220orA) pair.getSecond();
                int i22 = C852260Xc0.LIZ[c852340Xc8.LIZ.ordinal()];
                if (i22 != 1) {
                    if (i22 != 2) {
                        if (i22 == 3) {
                            if (c852340Xc8.LIZIZ) {
                                ((BaseUpdatePasswordFragment) c854800Xg6.l0).US().LIZ();
                            } else {
                                BaseUpdatePasswordFragment baseUpdatePasswordFragment = (BaseUpdatePasswordFragment) c854800Xg6.l0;
                                String str = c852340Xc8.LIZJ;
                                if (str == null) {
                                    str = (String) baseUpdatePasswordFragment.LLLLIILLL.getValue();
                                }
                                baseUpdatePasswordFragment.pn(0, str);
                            }
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        C420580GeO c420580GeOQS = ((BaseUpdatePasswordFragment) c854800Xg6.l0).QS();
                        if (c852340Xc8.LIZIZ) {
                            enumC428960Gru3 = EnumC428960Gru.SUCCESS;
                        } else {
                            enumC428960Gru3 = EnumC428960Gru.NONE;
                        }
                        c420580GeOQS.setVariant(enumC428960Gru3);
                    }
                } else {
                    C420580GeO c420580GeOPS = ((BaseUpdatePasswordFragment) c854800Xg6.l0).PS();
                    if (c852340Xc8.LIZIZ) {
                        enumC428960Gru = EnumC428960Gru.SUCCESS;
                    } else {
                        enumC428960Gru = EnumC428960Gru.NONE;
                    }
                    c420580GeOPS.setVariant(enumC428960Gru);
                }
                C420580GeO c420580GeORS = ((BaseUpdatePasswordFragment) c854800Xg6.l0).RS();
                if (enumC1489220orA.isSetPasswordAllowed()) {
                    enumC428960Gru2 = EnumC428960Gru.SUCCESS;
                } else {
                    enumC428960Gru2 = EnumC428960Gru.NONE;
                }
                c420580GeORS.setVariant(enumC428960Gru2);
            }

            public static final void onNext$1(C854800Xg6 c854800Xg6, Object obj) {
                boolean z;
                Pair pair = (Pair) obj;
                BaseUpdatePasswordFragment baseUpdatePasswordFragment = (BaseUpdatePasswordFragment) c854800Xg6.l0;
                pair.getSecond();
                baseUpdatePasswordFragment.getClass();
                C197039127h c197039127h = ((BaseUpdatePasswordFragment) c854800Xg6.l0).LLLLILI;
                if (c197039127h != null) {
                    if (((Boolean) pair.getFirst()).booleanValue() && ((EnumC1489220orA) pair.getSecond()).isSetPasswordAllowed()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c197039127h.setEnabled(z);
                }
            }

            public static final void onSubscribe$0(C854800Xg6 c854800Xg6, InterfaceC420801kM interfaceC420801kM) {
                ((BaseUpdatePasswordFragment) c854800Xg6.l0).LLLLIIL.LIZ(interfaceC420801kM);
            }

            public static final void onSubscribe$1(C854800Xg6 c854800Xg6, InterfaceC420801kM interfaceC420801kM) {
                ((BaseUpdatePasswordFragment) c854800Xg6.l0).LLLLIIL.LIZ(interfaceC420801kM);
            }
        });
        C0I7D c0i7d2 = this.LLLLIL;
        if (c0i7d2 != null) {
            q0.LJIJ(c0i7d2, new C854830Xg9(this, 1));
        }
        C0I7D c0i7d3 = this.LLLLIL;
        if (c0i7d3 != null) {
            c0i7d3.addTextChangedListener(new TextWatcher() { // from class: X.0Xbz
                @Override // android.text.TextWatcher
                public final void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                }

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                }

                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    String string;
                    if (!this.LL.isViewValid()) {
                        return;
                    }
                    BaseUpdatePasswordFragment baseUpdatePasswordFragment = this.LL;
                    if (!baseUpdatePasswordFragment.LLLLIIIILLL) {
                        baseUpdatePasswordFragment.LLLLIIIILLL = true;
                        baseUpdatePasswordFragment.gT();
                    }
                    if (editable == null || (string = editable.toString()) == null) {
                        string = "";
                    }
                    C852280Xc2 c852280Xc22 = c852280Xc2;
                    Iterator it2 = ((ArrayList) c852280Xc22.LIZ.LIZ).iterator();
                    while (true) {
                        boolean z = true;
                        while (it2.hasNext()) {
                            C852340Xc8 c852340Xc8LIZ = ((InterfaceC852360XcA) it2.next()).LIZ(string);
                            c852280Xc22.LIZIZ.onNext(c852340Xc8LIZ);
                            if (!z || !c852340Xc8LIZ.LIZIZ) {
                                z = false;
                            }
                        }
                        c852280Xc22.LIZJ.onNext(Boolean.valueOf(z));
                        c1489320orKLIZ.LIZ(string);
                        return;
                    }
                }
            });
        }
        GS(new ACListenerS148S0100000_13(this, 24), this.LLLLILI);
        if (rS() && (viewFindViewById = view.findViewById(R.id.phl)) != null) {
            C426750GoL.LJIIIZ(viewFindViewById, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), false, 23);
            C851910XbR c851910XbR = C851910XbR.LIZ;
            C0XUD.LIZ.getClass();
            boolean z = !C0XUD.LJIIJJI;
            String strHS = hS();
            AFwS247S0000000_13 aFwS247S0000000_13 = AFwS247S0000000_13.get$arr$(18);
            c851910XbR.getClass();
            this.LLLF = C851910XbR.LIZ(viewFindViewById, true, z, "", strHS, aFwS247S0000000_13, false);
        }
        if (eT()) {
            if (C2026107wh.LIZ()) {
                if (!Intrinsics.LJFF(getEnterFrom(), "settings_page") && !Intrinsics.LJFF(getEnterFrom(), "security_checkup_page")) {
                    if (Intrinsics.LJFF(getEnterFrom(), "email")) {
                        jT();
                        return;
                    } else {
                        iT();
                        return;
                    }
                }
                ((Keva) C2026107wh.LIZ.getValue()).storeBoolean("should_show", false);
                jT();
                return;
            }
            iT();
        }
    }

    @Override // X.C0XYD
    public final void pn(int i, String str) {
        aS();
        C197039127h c197039127h = this.LLLLILI;
        if (c197039127h != null) {
            c197039127h.setEnabled(false);
        }
        US().LIZIZ(str);
        if (i == 1356) {
            PopupManager.LJIJI(new C0TS1(this, getActivity()), true);
        }
    }
}
