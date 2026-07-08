package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.AbstractC431340Gvk;
import X.C0DYO;
import X.C0P0T;
import X.C0WW9;
import X.C0WWB;
import X.C0XGR;
import X.C0XZ4;
import X.C10VO;
import X.C1236860iI8;
import X.C1236920iIE;
import X.C1236960iII;
import X.C1236990iIL;
import X.C1237110iIX;
import X.C1237220iIi;
import X.C1237240iIk;
import X.C1237300iIq;
import X.C1237680iJS;
import X.C1266340j3g;
import X.C1308910kAL;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1602160rnK;
import X.C1754640vlG;
import X.C19713212Aw;
import X.C19EG;
import X.C20684815ws;
import X.C21407818qC;
import X.C2188811AlT;
import X.C23250099c;
import X.C424320GkQ;
import X.C431300Gvg;
import X.C751070TdB;
import X.C786410Ut5;
import X.C851360XaY;
import X.C851370XaZ;
import X.C852170Xbr;
import X.C852810Xct;
import X.C852950Xd7;
import X.C853080XdK;
import X.C853090XdL;
import X.C853130XdP;
import X.C853310Xdh;
import X.C853320Xdi;
import X.C853660XeG;
import X.C853700XeK;
import X.C985403tE;
import X.EnumC1237100iIW;
import X.EnumC852660Xce;
import X.EnumC852910Xd3;
import X.InterfaceC1236910iID;
import X.InterfaceC1237610iJL;
import X.InterfaceC1754730vlP;
import X.InterfaceC20096813kE;
import X.InterfaceC853100XdM;
import X.InterfaceC853790XeT;
import X.ViewOnLongClickListenerC1265920j30;
import Y.AObserverS223S0100000_19;
import Y.ARunnableS104S0100000_4;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment;
import com.ss.android.ugc.aweme.account.eventtracking.AutoKeystrokesCodeDetectedEvent;
import com.ss.android.ugc.aweme.account.eventtracking.PasteCodeFocusedInputEvent;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: loaded from: classes20.dex */
public abstract class InputCodeFragmentV2 extends BaseAccountBindingsFlowFragment implements InterfaceC1237610iJL, View.OnClickListener {
    public C1237240iIk LLLIL;
    public C1237680iJS LLLILZ;
    public C21407818qC LLLILZJ;
    public TuxTextView LLLILZLLLI;
    public TuxTextView LLLIZZ;
    public C424320GkQ LLLJ;
    public C19713212Aw LLLJIL;
    public TuxTextView LLLJL;
    public C1236860iI8 LLLL;
    public C1237220iIi LLLLII;
    public C0WWB LLLLIIIILLL;
    public boolean LLLLIIL;
    public boolean LLLLIILL;
    public boolean LLLLIILLL;
    public boolean LLLLILI;
    public C0P0T LLLLJI;
    public boolean LLLLL;
    public long LLLLLILLIL;
    public boolean LLLLIL = true;
    public boolean LLLLJ = true;
    public EnumC1237100iIW LLLLLIL = EnumC1237100iIW.UNDEFINED;
    public final C1237110iIX LLLLLJIL = new C1236960iII() { // from class: X.0iIX
        @Override // X.InterfaceC1237230iIj
        public final void LIZLLL() {
            if (this.LL.isViewValid()) {
                InputCodeFragmentV2 inputCodeFragmentV2 = this.LL;
                if (inputCodeFragmentV2.hT().getVisibility() != 8) {
                    C786410Ut5.c(inputCodeFragmentV2.hT(), 8);
                }
                inputCodeFragmentV2.gT().setEnabled(true);
            }
        }

        @Override // X.InterfaceC1237230iIj
        public final void onStart() {
            InputCodeFragmentV2 inputCodeFragmentV2 = this.LL;
            if (inputCodeFragmentV2.hT().getVisibility() != 0) {
                C786410Ut5.c(inputCodeFragmentV2.hT(), 0);
            }
            inputCodeFragmentV2.gT().setEnabled(false);
        }

        @Override // X.C1236960iII, X.InterfaceC1237230iIj
        public final void LJJI(long j) {
            if (this.LL.isViewValid()) {
                this.LL.vT(j, true);
            }
        }
    };

    public abstract C1236860iI8 eT();

    public void qT(CharSequence charSequence) {
    }

    public abstract void rT(String str, String str2);

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public int sS() {
        return R.layout.y1;
    }

    public abstract void uT();

    public final TuxTextView ZS() {
        View viewFindViewById = this.LLLJL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.dnx) : null;
            this.LLLJL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final C19713212Aw fT() {
        View viewFindViewById = this.LLLJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.kpc) : null;
            this.LLLJIL = (C19713212Aw) viewFindViewById;
        }
        return (C19713212Aw) viewFindViewById;
    }

    public final TuxTextView gT() {
        View viewFindViewById = this.LLLILZLLLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.kpd) : null;
            this.LLLILZLLLI = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final C1237240iIk hT() {
        View viewFindViewById = this.LLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.kpm) : null;
            this.LLLIL = (C1237240iIk) viewFindViewById;
        }
        return (C1237240iIk) viewFindViewById;
    }

    public final C21407818qC iT() {
        View viewFindViewById = this.LLLILZJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.kpn) : null;
            this.LLLILZJ = (C21407818qC) viewFindViewById;
        }
        return (C21407818qC) viewFindViewById;
    }

    public final TuxTextView jT() {
        View viewFindViewById = this.LLLIZZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.kpo) : null;
            this.LLLIZZ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final EnumC1237100iIW kT() {
        C1236860iI8 c1236860iI8 = this.LLLL;
        if ((c1236860iI8 == null ? null : c1236860iI8).LIZIZ) {
            return EnumC1237100iIW.PHONE;
        }
        if (c1236860iI8 == null) {
            c1236860iI8 = null;
        }
        return c1236860iI8.LIZJ ? EnumC1237100iIW.TOTP : EnumC1237100iIW.EMAIL;
    }

    public final C1237680iJS lT() {
        View viewFindViewById = this.LLLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.qgj) : null;
            this.LLLILZ = (C1237680iJS) viewFindViewById;
        }
        return (C1237680iJS) viewFindViewById;
    }

    public String mT() {
        return this.LLLLILI ? "resend" : "user_click";
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C0WW9 c0ww9;
        C0WWB c0wwb = this.LLLLIIIILLL;
        if (c0wwb != null && c0wwb.LIZ() && (c0ww9 = c0wwb.LIZIZ) != null) {
            try {
                C786410Ut5.LJJIFFI(c0ww9.LIZ, c0ww9);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        this.LLLLJI = null;
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    public final void sT() {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_method", getEnterMethod());
        C20684815ws.LJIILLIIL("auto_fill_sms_verification", c0xgr.LIZ);
        C0XGR c0xgr2 = new C0XGR();
        c0xgr2.LIZLLL("enter_from", getEnterFrom());
        c0xgr2.LIZLLL("enter_method", getEnterMethod());
        c0xgr2.LIZLLL("page", RR());
        C20684815ws.LJIILLIIL("sms_code_autofill", c0xgr2.LIZ);
    }

    public final void LJ() {
        C786410Ut5.w1(fT(), 0);
        fT().LIZIZ();
    }

    @Override // X.InterfaceC1237610iJL
    public void LJJJLIIL() {
        if (isViewValid()) {
            if (this.LLLLIILLL) {
                iT().setText("");
                this.LLLLIILLL = false;
            }
            C1237680iJS c1237680iJSLT = lT();
            c1237680iJSLT.getFormViewFromXml().setFooter(null);
            c1237680iJSLT.LLILLJJLI.LIZJ();
        }
    }

    public void LJJLL() {
        String string;
        this.LLLLLILLIL = SystemClock.elapsedRealtime();
        C1236860iI8 c1236860iI8 = this.LLLL;
        if ((c1236860iI8 == null ? null : c1236860iI8).LIZIZ) {
            C0XGR c0xgr = new C0XGR();
            c0xgr.LIZLLL("login_panel_type", PR());
            c0xgr.LIZLLL("enter_from", getEnterFrom());
            c0xgr.LIZLLL("enter_method", getEnterMethod());
            c0xgr.LIZLLL("page", RR());
            c0xgr.LIZLLL("login_panel_type", PR());
            C852170Xbr c852170Xbr = C852170Xbr.LIZ;
            Bundle arguments = getArguments();
            c852170Xbr.getClass();
            C852170Xbr.LIZIZ(c0xgr, C852170Xbr.LJFF(arguments));
            C20684815ws.LJIILLIIL("start_sms_typing", c0xgr.LIZ);
            return;
        }
        if (c1236860iI8 == null) {
            c1236860iI8 = null;
        }
        if (c1236860iI8.LIZJ) {
            return;
        }
        C0XGR c0xgr2 = new C0XGR();
        c0xgr2.LIZLLL("enter_from", getEnterFrom());
        c0xgr2.LIZLLL("enter_method", getEnterMethod());
        c0xgr2.LIZLLL("send_method", mT());
        c0xgr2.LIZLLL("page", RR());
        c0xgr2.LIZLLL("login_panel_type", PR());
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString("send_type")) == null || string.length() <= 0) {
            string = "code_and_link";
        }
        c0xgr2.LIZLLL("send_type", string);
        C852810Xct.LIZ.getClass();
        c0xgr2.LIZLLL("3p_platform", C852810Xct.LIZ(this));
        c0xgr2.LIZLLL("config_key", C852810Xct.LIZJ(this));
        c0xgr2.LIZLLL("login_panel_type", PR());
        if (requireArguments().containsKey("is_register")) {
            c0xgr2.LIZ(requireArguments().getBoolean("is_register") ? 1 : 0, "is_register");
        }
        C20684815ws.LJIILLIIL("start_email_code_typing", c0xgr2.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void aS() {
        lT().getPinField().setEnabled(true);
        iT().setEnabled(true);
        C786410Ut5.w1(fT(), 8);
        fT().LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public void clearFromXmlViewCache() {
        super.clearFromXmlViewCache();
        this.LLLIL = null;
        this.LLLILZ = null;
        this.LLLILZJ = null;
        this.LLLILZLLLI = null;
        this.LLLIZZ = null;
        this.LLLJ = null;
        this.LLLJIL = null;
        this.LLLJL = null;
    }

    public final void oT() {
        if (isViewValid()) {
            pT();
        } else {
            this.LLLLIL = true;
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C1236860iI8 c1236860iI8 = this.LLLL;
        if (c1236860iI8 == null) {
            c1236860iI8 = null;
        }
        if (c1236860iI8.LJI) {
            C1754640vlG pinField = lT().getPinField();
            pinField.requestFocus();
            HandlerHook.viewPostDelay(pinField, new ARunnableS104S0100000_4(pinField, 11), 500L);
        }
    }

    public final void pT() {
        gT().setEnabled(false);
        hT().setCallback(this.LLLLLJIL);
        C1237220iIi c1237220iIiLJJJJJ = hT().LJJJJJ();
        C1236860iI8 c1236860iI8 = this.LLLL;
        if ((c1236860iI8 == null ? null : c1236860iI8).LJII) {
            if (c1236860iI8 == null) {
                c1236860iI8 = null;
            }
            C1236990iIL.LIZIZ(c1236860iI8.LIZ(), new C851370XaZ(c1237220iIiLJJJJJ), SR());
        } else {
            C19EG activity = getActivity();
            C1236860iI8 c1236860iI82 = this.LLLL;
            if (c1236860iI82 == null) {
                c1236860iI82 = null;
            }
            C851360XaY.LIZIZ(activity, c1236860iI82.LIZ(), new C851370XaZ(c1237220iIiLJJJJJ), SR());
        }
        C1236860iI8 c1236860iI83 = this.LLLL;
        if ((c1236860iI83 == null ? null : c1236860iI83).LIZIZ) {
            if (c1236860iI83 == null) {
                c1236860iI83 = null;
            }
            if (Intrinsics.LJFF(c1236860iI83.LIZLLL, Boolean.TRUE)) {
                HashMap mapLIZ = C1236920iIE.LIZ();
                C1236860iI8 c1236860iI84 = this.LLLL;
                if (c1236860iI84 == null) {
                    c1236860iI84 = null;
                }
                if (mapLIZ.containsKey(c1236860iI84.LIZ())) {
                    HashMap mapLIZ2 = C1236920iIE.LIZ();
                    C1236860iI8 c1236860iI85 = this.LLLL;
                    if (c1236860iI85 == null) {
                        c1236860iI85 = null;
                    }
                    if (mapLIZ2.get(c1236860iI85.LIZ()) != null) {
                        HashMap mapLIZ3 = C1236920iIE.LIZ();
                        C1236860iI8 c1236860iI86 = this.LLLL;
                        this.LLLLIIL = ((Boolean) mapLIZ3.get((c1236860iI86 != null ? c1236860iI86 : null).LIZ())).booleanValue();
                        return;
                    }
                }
                C1236860iI8 c1236860iI87 = this.LLLL;
                C1237300iIq.LIZ((c1236860iI87 != null ? c1236860iI87 : null).LIZ(), new InterfaceC1236910iID() { // from class: X.0iIF
                    @Override // X.InterfaceC1236910iID
                    public final void LIZ(boolean z) {
                        String str;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Voice code ");
                        if (z) {
                            str = "enabled";
                        } else {
                            str = "disabled";
                        }
                        sbLIZ.append(str);
                        C2188811AlT.LIZIZ(sbLIZ);
                        HashMap mapLIZ4 = C1236920iIE.LIZ();
                        C1236860iI8 c1236860iI88 = this.LIZ.LLLL;
                        if (c1236860iI88 == null) {
                            c1236860iI88 = null;
                        }
                        mapLIZ4.put(c1236860iI88.LIZ(), Boolean.valueOf(z));
                        this.LIZ.LLLLIIL = z;
                    }
                });
            }
        }
    }

    public void xT() {
        TuxTextView tuxTextViewZS = ZS();
        if (tuxTextViewZS != null) {
            C0DYO.LIZ(tuxTextViewZS);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void HS() {
        LJ();
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static abstract class VerifyCodeActions implements InterfaceC853790XeT<InterfaceC853100XdM> {
        public static final int $stable = 8;
        public final InterfaceC853100XdM params;

        public abstract BaseAccountFlowFragment getFragment();

        public static final class VerifyEmailCodeAction extends VerifyCodeActions {
            public static final int $stable = 8;
            public final BaseAccountFlowFragment fragment;
            public final C853090XdL params;

            public final VerifyEmailCodeAction copy(C853090XdL c853090XdL, BaseAccountFlowFragment baseAccountFlowFragment) {
                return new VerifyEmailCodeAction(c853090XdL, baseAccountFlowFragment);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof VerifyEmailCodeAction)) {
                    return false;
                }
                VerifyEmailCodeAction verifyEmailCodeAction = (VerifyEmailCodeAction) obj;
                return Intrinsics.LJFF(this.params, verifyEmailCodeAction.params) && Intrinsics.LJFF(this.fragment, verifyEmailCodeAction.fragment);
            }

            public int hashCode() {
                return (this.params.hashCode() * 31) + this.fragment.hashCode();
            }

            public String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("VerifyEmailCodeAction(params=");
                sbLIZ.append(this.params);
                sbLIZ.append(", fragment=");
                sbLIZ.append(this.fragment);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2.VerifyCodeActions
            public BaseAccountFlowFragment getFragment() {
                return this.fragment;
            }

            @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2.VerifyCodeActions
            /* JADX INFO: renamed from: getParams */
            public C853090XdL mo153getParams() {
                return this.params;
            }

            public VerifyEmailCodeAction(C853090XdL c853090XdL, BaseAccountFlowFragment baseAccountFlowFragment) {
                super(c853090XdL);
                this.params = c853090XdL;
                this.fragment = baseAccountFlowFragment;
            }
        }

        public static final class VerifyPhoneCodeAction extends VerifyCodeActions {
            public static final int $stable = 8;
            public final BaseAccountFlowFragment fragment;
            public final C853080XdK params;

            public final VerifyPhoneCodeAction copy(C853080XdK c853080XdK, BaseAccountFlowFragment baseAccountFlowFragment) {
                return new VerifyPhoneCodeAction(c853080XdK, baseAccountFlowFragment);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof VerifyPhoneCodeAction)) {
                    return false;
                }
                VerifyPhoneCodeAction verifyPhoneCodeAction = (VerifyPhoneCodeAction) obj;
                return Intrinsics.LJFF(this.params, verifyPhoneCodeAction.params) && Intrinsics.LJFF(this.fragment, verifyPhoneCodeAction.fragment);
            }

            public int hashCode() {
                return (this.params.hashCode() * 31) + this.fragment.hashCode();
            }

            public String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("VerifyPhoneCodeAction(params=");
                sbLIZ.append(this.params);
                sbLIZ.append(", fragment=");
                sbLIZ.append(this.fragment);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2.VerifyCodeActions
            public BaseAccountFlowFragment getFragment() {
                return this.fragment;
            }

            @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2.VerifyCodeActions
            /* JADX INFO: renamed from: getParams */
            public C853080XdK mo153getParams() {
                return this.params;
            }

            public VerifyPhoneCodeAction(C853080XdK c853080XdK, BaseAccountFlowFragment baseAccountFlowFragment) {
                super(c853080XdK);
                this.params = c853080XdK;
                this.fragment = baseAccountFlowFragment;
            }
        }

        public static final class ClickResendEmailCodeAction extends VerifyCodeActions {
            public static final int $stable = 8;
            public final InputCodeFragmentV2 fragment;
            public final C853130XdP params;

            public final ClickResendEmailCodeAction copy(C853130XdP c853130XdP, InputCodeFragmentV2 inputCodeFragmentV2) {
                return new ClickResendEmailCodeAction(c853130XdP, inputCodeFragmentV2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ClickResendEmailCodeAction)) {
                    return false;
                }
                ClickResendEmailCodeAction clickResendEmailCodeAction = (ClickResendEmailCodeAction) obj;
                return Intrinsics.LJFF(this.params, clickResendEmailCodeAction.params) && Intrinsics.LJFF(this.fragment, clickResendEmailCodeAction.fragment);
            }

            public int hashCode() {
                return (this.params.hashCode() * 31) + this.fragment.hashCode();
            }

            public String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ClickResendEmailCodeAction(params=");
                sbLIZ.append(this.params);
                sbLIZ.append(", fragment=");
                sbLIZ.append(this.fragment);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2.VerifyCodeActions
            public InputCodeFragmentV2 getFragment() {
                return this.fragment;
            }

            @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2.VerifyCodeActions
            /* JADX INFO: renamed from: getParams, reason: merged with bridge method [inline-methods] */
            public C853130XdP mo153getParams() {
                return this.params;
            }

            public ClickResendEmailCodeAction(C853130XdP c853130XdP, InputCodeFragmentV2 inputCodeFragmentV2) {
                super(c853130XdP);
                this.params = c853130XdP;
                this.fragment = inputCodeFragmentV2;
            }
        }

        public static final class ClickResendPhoneCodeAction extends VerifyCodeActions {
            public static final int $stable = 8;
            public final InputCodeFragmentV2 fragment;
            public final C853310Xdh params;

            public final ClickResendPhoneCodeAction copy(C853310Xdh c853310Xdh, InputCodeFragmentV2 inputCodeFragmentV2) {
                return new ClickResendPhoneCodeAction(c853310Xdh, inputCodeFragmentV2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ClickResendPhoneCodeAction)) {
                    return false;
                }
                ClickResendPhoneCodeAction clickResendPhoneCodeAction = (ClickResendPhoneCodeAction) obj;
                return Intrinsics.LJFF(this.params, clickResendPhoneCodeAction.params) && Intrinsics.LJFF(this.fragment, clickResendPhoneCodeAction.fragment);
            }

            public int hashCode() {
                return (this.params.hashCode() * 31) + this.fragment.hashCode();
            }

            public String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ClickResendPhoneCodeAction(params=");
                sbLIZ.append(this.params);
                sbLIZ.append(", fragment=");
                sbLIZ.append(this.fragment);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2.VerifyCodeActions
            public InputCodeFragmentV2 getFragment() {
                return this.fragment;
            }

            @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2.VerifyCodeActions
            /* JADX INFO: renamed from: getParams */
            public C853310Xdh mo153getParams() {
                return this.params;
            }

            public ClickResendPhoneCodeAction(C853310Xdh c853310Xdh, InputCodeFragmentV2 inputCodeFragmentV2) {
                super(c853310Xdh);
                this.params = c853310Xdh;
                this.fragment = inputCodeFragmentV2;
            }
        }

        public static final class StartCodeTypingAction extends VerifyCodeActions {
            public static final int $stable = 8;
            public final InputCodeFragmentV2 fragment;
            public final C853320Xdi params;

            public final StartCodeTypingAction copy(C853320Xdi c853320Xdi, InputCodeFragmentV2 inputCodeFragmentV2) {
                return new StartCodeTypingAction(c853320Xdi, inputCodeFragmentV2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof StartCodeTypingAction)) {
                    return false;
                }
                StartCodeTypingAction startCodeTypingAction = (StartCodeTypingAction) obj;
                return Intrinsics.LJFF(this.params, startCodeTypingAction.params) && Intrinsics.LJFF(this.fragment, startCodeTypingAction.fragment);
            }

            public int hashCode() {
                return (hashCode() * 31) + this.fragment.hashCode();
            }

            public String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("StartCodeTypingAction(params=");
                sbLIZ.append(this.params);
                sbLIZ.append(", fragment=");
                sbLIZ.append(this.fragment);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2.VerifyCodeActions
            public InputCodeFragmentV2 getFragment() {
                return this.fragment;
            }

            @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2.VerifyCodeActions
            /* JADX INFO: renamed from: getParams */
            public C853320Xdi mo153getParams() {
                return this.params;
            }

            public StartCodeTypingAction(C853320Xdi c853320Xdi, InputCodeFragmentV2 inputCodeFragmentV2) {
                super(c853320Xdi);
                this.params = c853320Xdi;
                this.fragment = inputCodeFragmentV2;
            }
        }

        @Override // 
        /* JADX INFO: renamed from: getParams */
        public InterfaceC853100XdM mo153getParams() {
            return this.params;
        }

        public VerifyCodeActions(InterfaceC853100XdM interfaceC853100XdM) {
            this.params = interfaceC853100XdM;
        }
    }

    public final boolean nT(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if ('0' > cCharAt || cCharAt >= ':') {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer numValueOf;
        C1236860iI8 c1236860iI8;
        C1236860iI8 c1236860iI82 = null;
        if (view != null && (numValueOf = Integer.valueOf(view.getId())) != null) {
            if (numValueOf.intValue() == R.id.kpd) {
                this.LLLLILI = true;
                uT();
                return;
            }
            if (numValueOf.intValue() != R.id.kpo) {
                return;
            }
            C1236860iI8 c1236860iI83 = this.LLLL;
            if (c1236860iI83 == null) {
                c1236860iI8 = null;
            } else {
                c1236860iI8 = c1236860iI83;
            }
            if (c1236860iI8.LIZIZ) {
                if (c1236860iI83 == null) {
                    c1236860iI83 = null;
                }
                if (Intrinsics.LJFF(c1236860iI83.LIZLLL, Boolean.TRUE)) {
                    C20684815ws.onEventV3("request_phone_call");
                }
            }
            if (!this.LLLLIIL) {
                return;
            }
            this.LLLLIILL = true;
            C0XZ4 c0xz4 = C0XZ4.LIZ;
            C1236860iI8 c1236860iI84 = this.LLLL;
            if (c1236860iI84 != null) {
                c1236860iI82 = c1236860iI84;
            }
            String strLIZ = c1236860iI82.LIZ();
            EnumC852660Xce enumC852660XceSR = SR();
            EnumC852910Xd3 enumC852910Xd3VR = VR();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            c0xz4.getClass();
            C0XZ4.LJJIJIIJI(this, this, strLIZ, false, enumC852660XceSR, enumC852910Xd3VR, "user_click", linkedHashMap).LJIILL();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        C1236860iI8 c1236860iI8;
        Window window;
        super.onCreate(bundle);
        C19EG activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
        C1236860iI8 c1236860iI8ET = eT();
        this.LLLL = c1236860iI8ET;
        if (c1236860iI8ET == null) {
            c1236860iI8 = null;
        } else {
            c1236860iI8 = c1236860iI8ET;
        }
        this.LLLLIL = c1236860iI8.LJ;
        if (c1236860iI8ET == null) {
            c1236860iI8ET = null;
        }
        if (c1236860iI8ET.LIZIZ) {
            if (this.LLLLIIIILLL == null) {
                this.LLLLIIIILLL = new C0WWB(getContext());
            }
            this.LLLLIIIILLL.LIZIZ();
            this.LLLLIIIILLL.LIZJ();
        }
    }

    @Override // X.InterfaceC1237610iJL
    public void Tk(String str, String str2) {
        if (SystemClock.elapsedRealtime() - this.LLLLLILLIL < 500) {
            new AutoKeystrokesCodeDetectedEvent().LJIIIIZZ();
        }
        C1237680iJS c1237680iJSLT = lT();
        C1236860iI8 c1236860iI8 = this.LLLL;
        if (c1236860iI8 == null) {
            c1236860iI8 = null;
        }
        c1237680iJSLT.setEnabled(!c1236860iI8.LJFF);
        this.LLLLIILLL = false;
        this.LLLLLIL = kT();
        rT(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        final int iIntValue;
        final int iIntValue2;
        C1236860iI8 c1236860iI8;
        C851370XaZ c851370XaZLIZ;
        C1237220iIi c1237220iIi;
        long jLIZ;
        Bundle arguments;
        String string;
        String value;
        MutableLiveData<String> mutableLiveData;
        MutableLiveData<String> mutableLiveData2;
        super.onViewCreated(view, bundle);
        C10VO.LIZIZ(gT());
        GS(this, gT());
        gT().setEnabled(false);
        C21407818qC c21407818qCIT = iT();
        int visibility = c21407818qCIT.getVisibility();
        c21407818qCIT.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c21407818qCIT);
        C1237680iJS c1237680iJSLT = lT();
        int visibility2 = c1237680iJSLT.getVisibility();
        c1237680iJSLT.setVisibility(0);
        C1602160rnK.LIZIZ(visibility2, 0, c1237680iJSLT);
        gT().setTuxFont(42);
        C1754640vlG pinField = lT().getPinField();
        pinField.setEnabled(true);
        int visibility3 = pinField.getVisibility();
        pinField.setVisibility(0);
        C1602160rnK.LIZIZ(visibility3, 0, pinField);
        pinField.setOnLongClickListener(new ViewOnLongClickListenerC1265920j30(this, 3));
        pinField.setListener(new InterfaceC1754730vlP() { // from class: X.0iIV
            @Override // X.InterfaceC1754730vlP
            public final void LJJLL() {
                if (this.LIZ.LLLLJ) {
                    C0XGR c0xgr = new C0XGR();
                    c0xgr.LIZLLL("enter_from", this.LIZ.getEnterFrom());
                    c0xgr.LIZLLL("enter_method", this.LIZ.getEnterMethod());
                    Bundle arguments2 = this.LIZ.getArguments();
                    c0xgr.LIZLLL("page", arguments2 != null ? arguments2.getString("page", "") : null);
                    C20684815ws.LJIILLIIL("input_email_code", c0xgr.LIZ);
                    this.LIZ.LLLLJ = false;
                }
                this.LIZ.LJJLL();
            }

            @Override // X.InterfaceC1754730vlP
            public final void LJJZ(CharSequence charSequence) {
                String string2;
                InputCodeFragmentV2 inputCodeFragmentV2 = this.LIZ;
                if (charSequence == null || (string2 = charSequence.toString()) == null) {
                    string2 = "";
                }
                inputCodeFragmentV2.Tk(string2, null);
            }

            @Override // X.InterfaceC1754730vlP
            public final void LIZ(int i, CharSequence charSequence) {
                this.LIZ.qT(charSequence);
            }
        });
        q0.LJIL(pinField, new String[]{"text/*"}, new InterfaceC20096813kE() { // from class: X.14XM
            @Override // X.InterfaceC20096813kE
            public final C20098713kX LIZ(View view2, C20098713kX c20098713kX) {
                String string2 = C2204961BRm.LJJIIZ(c20098713kX.LIZ.LIZ(), 0, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owsk1PEpk5Z4F7WzzjzzRSEqABH4223OMj2xSbkb9ic7d0aPhFw=", null)).coerceToText(view2.getContext()).toString();
                if (!this.LIZ.nT(string2) || (string2.length() > 1 && string2.length() != 6)) {
                    PasteCodeFocusedInputEvent pasteCodeFocusedInputEvent = new PasteCodeFocusedInputEvent();
                    pasteCodeFocusedInputEvent.LJI(Integer.valueOf(string2.length()), "code_length");
                    pasteCodeFocusedInputEvent.LJI(Integer.valueOf(!this.LIZ.nT(string2) ? 1 : 0), "is_alpha_numeric");
                    pasteCodeFocusedInputEvent.LJIIIIZZ();
                }
                return c20098713kX;
            }
        });
        String string2 = getString(2131829361);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getString(2131829364, string2));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a04, jT().getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a04, jT().getContext());
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = 0;
        }
        C786410Ut5.q2(spannableStringBuilder, new AbstractC431340Gvk(iIntValue, iIntValue2) { // from class: X.0iIb
            @Override // android.text.style.ClickableSpan
            public final void onClick(View view2) {
                if (!C0OBG.LIZIZ(view2) && this.LL.BS()) {
                    this.LL.onClick(view2);
                }
            }
        }, spannableStringBuilder.length() - string2.length(), spannableStringBuilder.length(), 34);
        jT().setText(spannableStringBuilder);
        jT().setMovementMethod(C431300Gvg.LIZ());
        q0.LJIJ(jT(), new C1266340j3g(this, 4));
        C0WWB c0wwb = this.LLLLIIIILLL;
        if (c0wwb != null) {
            MutableLiveData<String> mutableLiveData3 = c0wwb.LIZLLL;
            if (mutableLiveData3 != null) {
                value = mutableLiveData3.getValue();
            } else {
                value = null;
            }
            if (!TextUtils.isEmpty(value)) {
                lT().getPinField().LJ(value, true);
                C0WWB c0wwb2 = this.LLLLIIIILLL;
                if (c0wwb2 != null && (mutableLiveData2 = c0wwb2.LIZLLL) != null) {
                    mutableLiveData2.setValue("");
                }
                sT();
            } else {
                C0WWB c0wwb3 = this.LLLLIIIILLL;
                if (c0wwb3 != null && (mutableLiveData = c0wwb3.LIZLLL) != null) {
                    mutableLiveData.observe(getViewLifecycleOwner(), new AObserverS223S0100000_19(this, 56));
                }
            }
        }
        C853660XeG c853660XeG = C853660XeG.LIZ;
        EnumC1237100iIW enumC1237100iIWKT = kT();
        c853660XeG.getClass();
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZ(enumC1237100iIWKT.ordinal(), "input_type");
        C20684815ws.LJIILLIIL("code_input_page_show", c0xgr.LIZ);
        C1236860iI8 c1236860iI82 = this.LLLL;
        if (c1236860iI82 == null) {
            c1236860iI8 = null;
        } else {
            c1236860iI8 = c1236860iI82;
        }
        if (c1236860iI8.LJII) {
            if (c1236860iI82 == null) {
                c1236860iI82 = null;
            }
            c851370XaZLIZ = C1236990iIL.LIZ(c1236860iI82.LIZ(), SR());
        } else {
            C19EG activity = getActivity();
            C1236860iI8 c1236860iI83 = this.LLLL;
            if (c1236860iI83 == null) {
                c1236860iI83 = null;
            }
            c851370XaZLIZ = C851360XaY.LIZ(activity, c1236860iI83.LIZ(), SR());
        }
        if (c851370XaZLIZ != null) {
            c1237220iIi = c851370XaZLIZ.LIZ;
        } else {
            c1237220iIi = null;
        }
        this.LLLLII = c1237220iIi;
        C1237240iIk c1237240iIkHT = hT();
        C1237220iIi c1237220iIi2 = this.LLLLII;
        if (c1237220iIi2 != null) {
            jLIZ = c1237220iIi2.LIZ();
        } else {
            jLIZ = 60000;
        }
        c1237240iIkHT.LLJJLIIIJLLLLLLLZ = "s";
        c1237240iIkHT.LLJJJJLIIL = 60000L;
        c1237240iIkHT.LLJJL = 1000L;
        c1237240iIkHT.setText(String.valueOf(jLIZ / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) + "s");
        if (this.LLLLIL) {
            this.LLLLIL = false;
            pT();
        } else {
            if (this.LLLLII != null) {
                HashMap mapLIZ = C1236920iIE.LIZ();
                C1236860iI8 c1236860iI84 = this.LLLL;
                if (c1236860iI84 == null) {
                    c1236860iI84 = null;
                }
                if (mapLIZ.containsKey(c1236860iI84.LIZ())) {
                    HashMap mapLIZ2 = C1236920iIE.LIZ();
                    C1236860iI8 c1236860iI85 = this.LLLL;
                    if (c1236860iI85 == null) {
                        c1236860iI85 = null;
                    }
                    if (mapLIZ2.get(c1236860iI85.LIZ()) != null) {
                        HashMap mapLIZ3 = C1236920iIE.LIZ();
                        C1236860iI8 c1236860iI86 = this.LLLL;
                        if (c1236860iI86 == null) {
                            c1236860iI86 = null;
                        }
                        this.LLLLIIL = ((Boolean) mapLIZ3.get(c1236860iI86.LIZ())).booleanValue();
                        C1237220iIi c1237220iIi3 = this.LLLLII;
                        super.onViewCreated(view, bundle);
                        vT(c1237220iIi3.LIZ(), false);
                    }
                }
            }
            C1237220iIi c1237220iIi4 = this.LLLLII;
            if (c1237220iIi4 != null && c1237220iIi4.LIZIZ()) {
                hT().setCallback(this.LLLLLJIL);
                hT().LJJJJL(this.LLLLII);
                if (hT().getVisibility() != 0) {
                    C786410Ut5.c(hT(), 0);
                }
                gT().setEnabled(false);
            } else {
                C1236860iI8 c1236860iI87 = this.LLLL;
                if (c1236860iI87 == null) {
                    c1236860iI87 = null;
                }
                if (c1236860iI87.LJ || this.LLLLII != null) {
                    if (hT().getVisibility() != 8) {
                        C786410Ut5.c(hT(), 8);
                    }
                    gT().setEnabled(true);
                }
            }
        }
        if (this.LLJZIJLIL) {
            this.LLJZIJLIL = false;
            LJ();
        }
        C1236860iI8 c1236860iI88 = this.LLLL;
        if (c1236860iI88 == null) {
            c1236860iI88 = null;
        }
        if (c1236860iI88.LIZIZ) {
            C0XGR c0xgr2 = new C0XGR();
            c0xgr2.LIZLLL("enter_type", this.LLJIJIL);
            c0xgr2.LIZLLL("enter_method", getEnterMethod());
            c0xgr2.LIZLLL("enter_from", getEnterFrom());
            c0xgr2.LIZLLL("page", RR());
            c0xgr2.LIZLLL("login_panel_type", PR());
            C20684815ws.LJIILLIIL("phone_enter_sms", c0xgr2.LIZ);
        }
        xT();
        C853700XeK.LIZ.getClass();
        if (C853700XeK.LIZ() && (arguments = getArguments()) != null && (string = arguments.getString("enter_from_item")) != null && string.length() != 0 && C852950Xd7.LIZIZ.contains(string)) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C751070TdB(this, null), 3);
        }
    }

    @Override // X.C0XYD
    public final void pn(int i, String str) {
        String string;
        if (this.LLLLIILL && i == 1206) {
            this.LLLLIILL = false;
            Context context = getContext();
            if (context == null) {
                return;
            }
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            Context context2 = getContext();
            if (context2 != null) {
                string = context2.getString(2131829362);
            } else {
                string = null;
            }
            c1397580mTM.LIZIZ(string);
            C985403tE.LIZ(c1397580mTM, AFwS257S0000000_19.get$arr$(61));
            c1397580mTM.LJII = false;
            new C1397510mTF(c1397580mTM).LIZLLL();
            return;
        }
        this.LLLLIILLL = true;
        C1237680iJS c1237680iJSLT = lT();
        if (str != null) {
            c1237680iJSLT.LLILLL.setMessage(str);
            c1237680iJSLT.getFormViewFromXml().setFooter(c1237680iJSLT.LLILLL);
        }
        c1237680iJSLT.LLILLJJLI.setEnabled(true);
        c1237680iJSLT.LLILLJJLI.LJI(str);
    }

    public void vT(long j, boolean z) {
        if (this.LLLLIIL && j <= 50000 && jT().getVisibility() != 0) {
            if (z) {
                C786410Ut5.LLLLZLL(jT(), 0);
            } else {
                C786410Ut5.LLLLZLL(jT(), 0);
            }
        }
    }
}
