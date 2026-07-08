package com.ss.android.ugc.aweme.verify.pin;

import X.AbstractC1714770uix;
import X.C019F;
import X.C01GW;
import X.C098200Yq;
import X.C1155570gB1;
import X.C1308910kAL;
import X.C1389890mGx;
import X.C1390410mHn;
import X.C1391190mJ3;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1707050uWV;
import X.C1707060uWW;
import X.C1707070uWX;
import X.C1713570uh1;
import X.C1713680uhC;
import X.C1713750uhJ;
import X.C1713790uhN;
import X.C1713840uhS;
import X.C1714040uhm;
import X.C1714120uhu;
import X.C1714150uhx;
import X.C1714180ui0;
import X.C1714230ui5;
import X.C1714240ui6;
import X.C1714270ui9;
import X.C1714440uiQ;
import X.C1714660uim;
import X.C1714750uiv;
import X.C1714760uiw;
import X.C1714780uiy;
import X.C1719460uqW;
import X.C189200o6;
import X.C1954807lC;
import X.C19719912Dl;
import X.C19EG;
import X.C1AF0;
import X.C20642515q3;
import X.C21244318Bt;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C343970De7;
import X.C443160HZi;
import X.C444920HcY;
import X.C452501pT;
import X.C511501yz;
import X.C723590SZx;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786150Usf;
import X.C786410Ut5;
import X.CountDownTimerC1714500uiW;
import X.EnumC1714130uhv;
import X.EnumC1714450uiR;
import X.EnumC743970TGh;
import X.EnumC925903jd;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.pipo.verify.base.model.VerifyDetail;
import com.bytedance.pipo.verify.base.model.VerifyInfo;
import com.bytedance.pipo.verify.base.tracking.VerifyAnalysisSession;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipo.IPipoService;
import com.ss.android.ugc.aweme.verify.BaseVerifyFragment;
import com.ss.android.ugc.aweme.verify.BaseVerifyTuxSheet;
import com.ss.android.ugc.aweme.verify.ThemedContextUIContentAssem;
import com.ss.android.ugc.aweme.verify.ab.PipoVeriCenterAnalysisUpgradeSettings;
import com.ss.android.ugc.aweme.verify.ab.PipoVerificationRetentionPopupSettings;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public final class PinVerifyViewAssem extends ThemedContextUIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public C1719460uqW LLJ;
    public TuxTextView LLJI;
    public TuxNavBar LLJIJIL;
    public TuxTextView LLJILJIL;
    public TuxTextView LLJILJILJ;
    public final AssemVMLazy LLJILLL;
    public final C1559260qg8 LLJJ;
    public long LLJJI;
    public boolean LLJJIII;
    public AbstractC1714770uix LLJJIJI;
    public CountDownTimerC1714500uiW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PinVerifyViewAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/verify/pin/PinVerifyViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PinVerifyViewAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PinVerifyViewModel.class);
        this.LLJILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS556S0100000_12(c19719912DlLIZ, 627), AFwS268S0000000_26.get$arr$(492), null, true);
        this.LLJJ = new C1559260qg8(new C723590SZx(this, C1155570gB1.class, "KEY_VERIFY_DATA"), checkSupervisorPrepared());
        this.LLJJI = System.currentTimeMillis();
        this.LLJJIJI = C1714780uiy.LIZ;
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1175));
        this.LLJJJ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 628));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 626));
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final VerifyAnalysisSession Jo() {
        VerifyInfo verifyInfoLJIIIZ;
        C1707060uWW c1707060uWW = C1707060uWW.LIZ;
        C1713570uh1 c1713570uh1 = Vo().LL;
        String str = (c1713570uh1 == null || (verifyInfoLJIIIZ = c1713570uh1.LJIIIZ()) == null) ? null : verifyInfoLJIIIZ.verifyId;
        c1707060uWW.getClass();
        return C1707060uWW.LIZ(str);
    }

    public final Map<String, Object> Lo() {
        return BtmSDK.createReportParams$default(BtmSDK.INSTANCE, "a2270.b87466", PageFinder.via(C724240Sb0.LJI(this)), null, 4, null);
    }

    public final C1714180ui0 No() {
        return (C1714180ui0) this.LLJJIJIL.getValue();
    }

    public final C1719460uqW Oo() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.qge) : null;
            this.LLJ = (C1719460uqW) viewFindViewById;
        }
        return (C1719460uqW) viewFindViewById;
    }

    public final TuxTextView So() {
        View viewFindViewById = this.LLJILJILJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.qiy) : null;
            this.LLJILJILJ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final C1155570gB1 Vo() {
        return (C1155570gB1) this.LLJJ.getValue();
    }

    public final PinVerifyViewModel Zo() {
        AssemVMLazy assemVMLazy = this.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        return (PinVerifyViewModel) assemVMLazy.getValue();
    }

    public final void lp() {
        String string;
        String strLJI;
        Integer numLIZJ;
        Integer numLIZJ2;
        View viewFindViewById = this.LLJILJIL;
        String strLJI2 = null;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.qix) : null;
            this.LLJILJIL = (TuxTextView) viewFindViewById;
        }
        TextView textView = (TextView) viewFindViewById;
        if (textView == null) {
            return;
        }
        if (this.LLJJIII) {
            string = C20642515q3.LJI(2131840389);
        } else {
            String strLJI3 = C20642515q3.LJI(2131840407);
            String strLJI4 = C20642515q3.LJI(2131840442);
            AbstractC1714770uix abstractC1714770uix = this.LLJJIJI;
            if (abstractC1714770uix instanceof C1714750uiv) {
                strLJI2 = C20642515q3.LJI(((C1714750uiv) abstractC1714770uix).LIZIZ);
            } else if (abstractC1714770uix instanceof C1714760uiw) {
                strLJI2 = C20642515q3.LJI(((C1714760uiw) abstractC1714770uix).LIZIZ);
            } else if (!Intrinsics.LJFF(abstractC1714770uix, C1714780uiy.LIZ)) {
                throw new C1954807lC();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(strLJI3);
            sb.append(' ');
            sb.append(strLJI4);
            if (strLJI2 != null && !a0.LJJJIL(strLJI2)) {
                sb.append(' ');
                sb.append(C20642515q3.LJI(2131840415));
                sb.append(' ');
                sb.append(strLJI2);
            }
            string = sb.toString();
        }
        SpannableString spannableString = new SpannableString(string);
        Context context = this.LLIZLLLIL;
        int iIntValue = (context == null || (numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, context)) == null) ? -16777216 : numLIZJ2.intValue();
        Context context2 = this.LLIZLLLIL;
        int iIntValue2 = (context2 == null || (numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, context2)) == null) ? iIntValue : numLIZJ.intValue();
        if (this.LLJJIII) {
            C786410Ut5.p2(spannableString, new C444920HcY(52, false), 0, string.length(), 17);
            C786410Ut5.p2(spannableString, new C511501yz(iIntValue, new AwS570S0100000_26(this, 1176), 2), 0, string.length(), 17);
        } else {
            String strLJI5 = C20642515q3.LJI(2131840442);
            int iLJJJ = a0.LJJJ(string, strLJI5, 0, false, 6);
            C786410Ut5.p2(spannableString, new C444920HcY(52, false), iLJJJ, strLJI5.length() + iLJJJ, 17);
            C786410Ut5.p2(spannableString, new C511501yz(iIntValue, new AwS570S0100000_26(this, 1177), 2), iLJJJ, strLJI5.length() + iLJJJ, 17);
            AbstractC1714770uix abstractC1714770uix2 = this.LLJJIJI;
            if (abstractC1714770uix2 instanceof C1714750uiv) {
                strLJI = C20642515q3.LJI(((C1714750uiv) abstractC1714770uix2).LIZIZ);
            } else if (abstractC1714770uix2 instanceof C1714760uiw) {
                strLJI = C20642515q3.LJI(((C1714760uiw) abstractC1714770uix2).LIZIZ);
            } else if (!Intrinsics.LJFF(abstractC1714770uix2, C1714780uiy.LIZ)) {
                throw new C1954807lC();
            }
            if (strLJI != null && !a0.LJJJIL(strLJI)) {
                String strLJI6 = C20642515q3.LJI(2131840415);
                int iLJJJ2 = a0.LJJJ(string, strLJI6, iLJJJ + strLJI5.length(), false, 4);
                C786410Ut5.p2(spannableString, new ForegroundColorSpan(iIntValue2), iLJJJ2, strLJI6.length() + iLJJJ2, 17);
                int iLJJJ3 = a0.LJJJ(string, strLJI, iLJJJ2 + strLJI6.length(), false, 4);
                C786410Ut5.p2(spannableString, new C444920HcY(52, false), iLJJJ3, strLJI.length() + iLJJJ3, 17);
                C786410Ut5.p2(spannableString, new C511501yz(iIntValue, new AwS570S0100000_26(this, 1178), 2), iLJJJ3, strLJI.length() + iLJJJ3, 17);
            }
        }
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(0);
    }

    public final boolean ap() {
        C1714040uhm c1714040uhm;
        C1713570uh1 c1713570uh1 = Vo().LL;
        return ((c1713570uh1 == null || (c1714040uhm = c1713570uh1.LIZ.LIZIZ) == null) ? null : c1714040uhm.LIZJ) == EnumC925903jd.MINIMAL;
    }

    public final void bp() {
        VerifyDetail verifyDetailLJIIIIZZ;
        cp(System.currentTimeMillis() - this.LLJJI, "forgot_pin");
        C1719460uqW c1719460uqWOo = Oo();
        c1719460uqWOo.getClass();
        C443160HZi c443160HZi = C443160HZi.LIZ;
        View viewFindViewById = c1719460uqWOo.getTuxPinFromXml().findViewById(R.id.grz);
        c443160HZi.getClass();
        KeyboardUtils.LIZIZ(viewFindViewById);
        C1713570uh1 c1713570uh1 = Vo().LL;
        String str = (c1713570uh1 == null || (verifyDetailLJIIIIZZ = c1713570uh1.LJIIIIZZ()) == null) ? null : verifyDetailLJIIIIZZ.forgetPinToastTxt;
        VerifyAnalysisSession verifyAnalysisSessionJo = Jo();
        if (verifyAnalysisSessionJo != null) {
            verifyAnalysisSessionJo.LJI("forgot_pin");
        }
        kp("forgot_pin", "link", (str == null || str.length() == 0) ? "routed" : "blocked");
        if (str == null || str.length() == 0) {
            ep();
            return;
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(fragmentLJI);
            c1389890mGx.LJIIJ(str);
            c1389890mGx.LJIIJJI();
        }
    }

    public final void ep() {
        View view;
        C1390410mHn c1390410mHn;
        View view2;
        C1390410mHn c1390410mHn2;
        if (((IPipoService) ServiceManager.get().getService(IPipoService.class)).LJFF(EnumC743970TGh.FOUNDATION)) {
            hp();
            return;
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (view2 = fragmentLJI.getView()) != null && (c1390410mHn2 = (C1390410mHn) view2.findViewById(R.id.qiz)) != null) {
            C786410Ut5.LLLZZIL(c1390410mHn2, 0);
        }
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        if (fragmentLJI2 != null && (view = fragmentLJI2.getView()) != null && (c1390410mHn = (C1390410mHn) view.findViewById(R.id.qiz)) != null) {
            c1390410mHn.LIZJ();
        }
        ((IPipoService) ServiceManager.get().getService(IPipoService.class)).LIZIZ(new AwS591S0100000_12(this, 653));
    }

    public final void hp() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Boolean bool;
        C1713750uhJ c1713750uhJLJII;
        C1713840uhS c1713840uhSLIZLLL;
        n nVar;
        k kVarLJJIIZ;
        C1714040uhm c1714040uhm;
        VerifyInfo verifyInfoLJIIIZ;
        String str6;
        VerifyInfo verifyInfoLJIIIZ2;
        VerifyDetail verifyDetailLJIIIIZZ;
        VerifyDetail verifyDetailLJIIIIZZ2;
        VerifyDetail verifyDetailLJIIIIZZ3;
        VerifyDetail verifyDetailLJIIIIZZ4;
        BaseVerifyFragment baseVerifyFragment;
        C1714660uim c1714660uimVR;
        if (!((IPipoService) ServiceManager.get().getService(IPipoService.class)).LJFF(EnumC743970TGh.FOUNDATION)) {
            C1AF0.LIZJ("DynamicFeature not installed when verify pin to forget pin");
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        Unit unit = null;
        if ((fragmentLJI instanceof BaseVerifyFragment) && (baseVerifyFragment = (BaseVerifyFragment) fragmentLJI) != null && (c1714660uimVR = baseVerifyFragment.VR()) != null) {
            c1714660uimVR.LIZJ = "next";
        }
        Context context = getContext();
        if (context != null) {
            C1713570uh1 c1713570uh1 = Vo().LL;
            String strLJI = c1713570uh1 != null ? c1713570uh1.LJI() : null;
            C1713570uh1 c1713570uh12 = Vo().LL;
            String str7 = (c1713570uh12 == null || (verifyDetailLJIIIIZZ4 = c1713570uh12.LJIIIIZZ()) == null) ? null : verifyDetailLJIIIIZZ4.pinHost;
            if (strLJI == null || strLJI.length() == 0 || str7 == null || str7.length() == 0) {
                Fragment fragmentLJI2 = C724240Sb0.LJI(this);
                if (fragmentLJI2 != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(fragmentLJI2);
                    c1389890mGx.LJIIIZ(2131848597);
                    c1389890mGx.LJIIJJI();
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Invalid Session [");
                sbLIZ.append(strLJI);
                sbLIZ.append("] or Host [");
                sbLIZ.append(str7);
                sbLIZ.append(']');
                C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            C1713570uh1 c1713570uh13 = Vo().LL;
            String str8 = "";
            if (c1713570uh13 == null || (verifyDetailLJIIIIZZ3 = c1713570uh13.LJIIIIZZ()) == null || (str = verifyDetailLJIIIIZZ3.pipoProductCat) == null) {
                str = "";
            }
            C1713570uh1 c1713570uh14 = Vo().LL;
            if (c1713570uh14 == null || (verifyDetailLJIIIIZZ2 = c1713570uh14.LJIIIIZZ()) == null || (str2 = verifyDetailLJIIIIZZ2.merchantId) == null) {
                str2 = "";
            }
            C1713570uh1 c1713570uh15 = Vo().LL;
            if (c1713570uh15 == null || (verifyDetailLJIIIIZZ = c1713570uh15.LJIIIIZZ()) == null || (str3 = verifyDetailLJIIIIZZ.merchantUserId) == null) {
                str3 = "";
            }
            C1713570uh1 c1713570uh16 = Vo().LL;
            String strValueOf = String.valueOf(c1713570uh16 != null ? c1713570uh16.LIZLLL() : null);
            C1713570uh1 c1713570uh17 = Vo().LL;
            if (c1713570uh17 == null || (verifyInfoLJIIIZ2 = c1713570uh17.LJIIIZ()) == null || (str4 = verifyInfoLJIIIZ2.verifyId) == null) {
                str4 = "";
            }
            C1713570uh1 c1713570uh18 = Vo().LL;
            if (c1713570uh18 != null && (verifyInfoLJIIIZ = c1713570uh18.LJIIIZ()) != null && (str6 = verifyInfoLJIIIZ.verifyType) != null) {
                str8 = str6;
            }
            C1713570uh1 c1713570uh19 = Vo().LL;
            if (c1713570uh19 == null || (c1714040uhm = c1713570uh19.LIZ.LIZIZ) == null || (str5 = c1714040uhm.LIZLLL) == null) {
                str5 = "default";
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//verify_center/forget_pin");
            smartRouteBuildRoute.withParam("host", str7);
            smartRouteBuildRoute.withParam("session_id", strLJI);
            smartRouteBuildRoute.withParam("merchant_id", str2);
            smartRouteBuildRoute.withParam("merchant_user_id", str3);
            smartRouteBuildRoute.withParam("pipo_product_code", str);
            smartRouteBuildRoute.withParam("previous_page_id", "bnpl_pin_use");
            smartRouteBuildRoute.withParam("verify_id", str4);
            smartRouteBuildRoute.withParam("verify_type", str8);
            smartRouteBuildRoute.withParam("KEY_EVENT_PARAM", strValueOf);
            smartRouteBuildRoute.withParam("enter_from", "verify_center");
            smartRouteBuildRoute.withParam("theme", str5);
            if (C1714240ui6.LIZ()) {
                try {
                    VerifyAnalysisSession verifyAnalysisSessionJo = Jo();
                    if (verifyAnalysisSessionJo != null) {
                        smartRouteBuildRoute.withParam("enter_seq", verifyAnalysisSessionJo.LJFF.incrementAndGet());
                        C1713570uh1 c1713570uh110 = Vo().LL;
                        if (c1713570uh110 != null && (c1713750uhJLJII = c1713570uh110.LJII()) != null && C1714240ui6.LIZ()) {
                            C1707050uWV.LIZ(new C1713790uhN(c1713750uhJLJII));
                        }
                        VerifyAnalysisSession.LIZLLL(verifyAnalysisSessionJo, EnumC1714130uhv.LLIZ);
                        if (C1714240ui6.LIZ()) {
                            C1714240ui6.LIZ.getClass();
                            PipoVeriCenterAnalysisUpgradeSettings.PipoVeriCenterAnalysisUpgradeModel pipoVeriCenterAnalysisUpgradeModelLJ = C1714240ui6.LJ();
                            if ((pipoVeriCenterAnalysisUpgradeModelLJ == null || (bool = pipoVeriCenterAnalysisUpgradeModelLJ.enableForgotPinReturnListen) == null || bool.booleanValue()) && verifyAnalysisSessionJo.LJJII.compareAndSet(false, true)) {
                                C1707070uWX.LIZ.addIfAbsent(verifyAnalysisSessionJo);
                            }
                        }
                        unit = Unit.LIZ;
                    }
                    C189200o6.m2constructorimpl(unit);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
            try {
                C1713570uh1 c1713570uh111 = Vo().LL;
                if (c1713570uh111 != null && (c1713840uhSLIZLLL = c1713570uh111.LIZLLL()) != null && (nVar = c1713840uhSLIZLLL.LIZ) != null && (kVarLJJIIZ = nVar.LJJIIZ("close_vc_after_forgot_pin")) != null) {
                    if (kVarLJJIIZ.LJ()) {
                        smartRouteBuildRoute.open(1111, new C786150Usf(this, 0));
                        return;
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C1AF0.LJ(th2);
            }
            smartRouteBuildRoute.open();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        Window window;
        super.onCreate();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null || (window = c19egLIZ.getWindow()) == null) {
            return;
        }
        window.setFlags(8192, 8192);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        Window window;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null && (window = c19egLIZ.getWindow()) != null) {
            window.clearFlags(8192);
        }
        super.onDestroy();
        CountDownTimerC1714500uiW countDownTimerC1714500uiW = this.LLJJIJIIJIL;
        if (countDownTimerC1714500uiW != null) {
            countDownTimerC1714500uiW.cancel();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        VerifyAnalysisSession verifyAnalysisSessionJo = Jo();
        if (verifyAnalysisSessionJo != null) {
            verifyAnalysisSessionJo.LJFF();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        super.onStart();
        Oo().LIZIZ();
        VerifyAnalysisSession verifyAnalysisSessionJo = Jo();
        if (verifyAnalysisSessionJo == null || !C1714240ui6.LIZJ()) {
            return;
        }
        C1714120uhu c1714120uhu = verifyAnalysisSessionJo.LIZIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c1714120uhu.LIZIZ <= 0) {
            c1714120uhu.LIZIZ = jCurrentTimeMillis;
            c1714120uhu.LIZJ = "auto";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0061 A[PHI: r10
      0x0061: PHI (r10v1 boolean) = (r10v0 boolean), (r10v3 boolean), (r10v3 boolean) binds: [B:41:0x005e, B:26:0x0039, B:28:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0067 A[PHI: r6
      0x0067: PHI (r6v1 boolean) = (r6v0 boolean), (r6v3 boolean) binds: [B:45:0x0064, B:13:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Go(int r13) {
        /*
            r12 = this;
            X.0gB1 r0 = r12.Vo()
            X.0uh1 r3 = r0.LL
            r5 = 0
            if (r3 == 0) goto L69
            com.bytedance.pipo.verify.base.model.VerifyInfo r4 = r3.LJIIIZ()
        Ld:
            if (r4 == 0) goto L11
            java.lang.String r5 = r4.verifyType
        L11:
            r2 = 1
            if (r4 == 0) goto L63
            boolean r0 = r4.switchCandidate
            if (r0 != r2) goto L63
            r6 = 1
        L19:
            boolean r0 = r4.isProgressive
            if (r0 != r2) goto L67
            r7 = 1
        L1e:
            if (r3 == 0) goto L2e
            X.0uh7 r0 = r3.LIZIZ
            if (r0 == 0) goto L2e
            X.01GW r0 = r0.LIZJ
            java.lang.Object r9 = r0.getValue()
            java.util.List r9 = (java.util.List) r9
            if (r9 != 0) goto L30
        L2e:
            X.13BV r9 = X.C13BV.INSTANCE
        L30:
            if (r3 == 0) goto L5d
            boolean r0 = r3.LJIIL
            if (r0 != r2) goto L5d
            r10 = 1
        L37:
            X.0uiK r0 = r3.LIZLLL
            if (r0 == 0) goto L61
            boolean r0 = r0.LIZIZ
            if (r0 != r2) goto L61
            r11 = 1
        L40:
            r8 = r13
            X.0uix r1 = X.C1714730uit.LIZIZ(r5, r6, r7, r8, r9, r10, r11)
            if (r4 == 0) goto L57
            boolean r0 = r4.isProgressive
            if (r0 != r2) goto L57
            X.0uiy r0 = X.C1714780uiy.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L57
            if (r3 == 0) goto L57
            r3.LJIIL = r2
        L57:
            r12.LLJJIJI = r1
            r12.lp()
            return
        L5d:
            r10 = 0
            if (r3 == 0) goto L61
            goto L37
        L61:
            r11 = 0
            goto L40
        L63:
            r6 = 0
            if (r4 == 0) goto L67
            goto L19
        L67:
            r7 = 0
            goto L1e
        L69:
            r4 = r5
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.verify.pin.PinVerifyViewAssem.Go(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0289 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0188 A[LOOP:0: B:49:0x0182->B:51:0x0188, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0247  */
    @Override // com.ss.android.ugc.aweme.verify.ThemedContextUIContentAssem, com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r19) {
        /*
            Method dump skipped, instruction units count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.verify.pin.PinVerifyViewAssem.onViewCreated(android.view.View):void");
    }

    public final void Ho(String str, String str2) {
        C1714180ui0 c1714180ui0No;
        EnumC1714450uiR enumC1714450uiRLJFF;
        Fragment fragmentLJI;
        C1713680uhC c1713680uhC;
        BaseVerifyFragment baseVerifyFragment;
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        if ((fragmentLJI2 instanceof BaseVerifyFragment) && (baseVerifyFragment = (BaseVerifyFragment) fragmentLJI2) != null) {
            baseVerifyFragment.bS(str);
        }
        if (Intrinsics.LJFF(str, "PASS")) {
            C1714180ui0 c1714180ui0No2 = No();
            if (c1714180ui0No2 != null) {
                c1714180ui0No2.LJFF("verify_success");
            }
            BaseVerifyTuxSheet baseVerifyTuxSheet = ((BaseVerifyFragment) C724240Sb0.LJI(this)).LLJILJIL;
            if (baseVerifyTuxSheet != null) {
                baseVerifyTuxSheet.SR();
            }
        } else if (Intrinsics.LJFF(str, "REJECT") && (c1714180ui0No = No()) != null) {
            c1714180ui0No.LJFF("verify_failed");
        }
        Fragment fragmentLJI3 = C724240Sb0.LJI(this);
        if (fragmentLJI3 != null) {
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            C21244318Bt c21244318Bt = new C21244318Bt();
            c21244318Bt.LIZ = "a2270.b87466";
            c21244318Bt.LIZIZ = PageFinder.via(fragmentLJI3);
            String strCreateJumpSourceBtmToken = btmSDK.createJumpSourceBtmToken(c21244318Bt);
            C1713570uh1 c1713570uh1 = Vo().LL;
            if (c1713570uh1 != null && (c1713680uhC = c1713570uh1.LJIILIIL) != null) {
                C1714230ui5.LIZJ(c1713680uhC, fragmentLJI3, str, "bnpl_pin_use", str2, strCreateJumpSourceBtmToken, 16);
            }
        }
        C1713570uh1 c1713570uh12 = Vo().LL;
        if (c1713570uh12 != null && (enumC1714450uiRLJFF = c1713570uh12.LJFF()) != null) {
            int i = C1714440uiQ.LIZ[enumC1714450uiRLJFF.ordinal()];
            if (i != 1) {
                if (i == 2 && (fragmentLJI = C724240Sb0.LJI(this)) != null) {
                    if (PipoVerificationRetentionPopupSettings.LIZ().LIZ()) {
                        BaseVerifyTuxSheet baseVerifyTuxSheet2 = ((BaseVerifyFragment) fragmentLJI).LLJILJIL;
                        if (baseVerifyTuxSheet2 != null) {
                            baseVerifyTuxSheet2.SR();
                            return;
                        }
                        return;
                    }
                    String str3 = TuxSheet._pnsPageId;
                    C1391190mJ3.LJFF(fragmentLJI, C343970De7.LIZ);
                    return;
                }
                return;
            }
            C1714230ui5.LIZIZ(C724240Sb0.LIZ(this), Vo().LL, str);
        }
    }

    public final void cp(long j, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("obj_id", str);
        linkedHashMap.put("click_use_time", String.valueOf(j));
        for (Map.Entry<String, Object> entry : Lo().entrySet()) {
            linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
        ip("fp_sdk_bnpl_pin_click", linkedHashMap);
        if (Intrinsics.LJFF(str, "forgot_pin")) {
            C1714180ui0 c1714180ui0No = No();
            if (c1714180ui0No != null) {
                c1714180ui0No.LIZIZ("forgot_pin");
                return;
            }
            return;
        }
        if (!Intrinsics.LJFF(str, "back")) {
            return;
        }
        C1714180ui0 c1714180ui0No2 = No();
        if (c1714180ui0No2 != null) {
            c1714180ui0No2.LIZIZ("back");
        }
        C1714180ui0 c1714180ui0No3 = No();
        if (c1714180ui0No3 == null) {
            return;
        }
        c1714180ui0No3.LJFF("user_cancel");
    }

    public final void ip(String str, Map<String, String> map) {
        String strLJIL;
        n nVar;
        k kVarLJJIIZ;
        C1713570uh1 c1713570uh1 = Vo().LL;
        if (c1713570uh1 != null) {
            try {
                nVar = c1713570uh1.LIZLLL().LIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
            }
            if (nVar != null && (kVarLJJIIZ = nVar.LJJIIZ("previous_page_id")) != null) {
                strLJIL = kVarLJJIIZ.LJIL();
                if (strLJIL == null) {
                    strLJIL = "";
                }
            } else {
                strLJIL = "";
            }
            map.put("source", strLJIL);
            c1713570uh1.LJIIJJI(str, "bnpl_pin_use", C1714270ui9.LIZ(), map);
        }
    }

    public final void kp(String str, String str2, String str3) {
        C1713750uhJ c1713750uhJLJII;
        Integer numValueOf;
        if (!C1714240ui6.LIZ()) {
            return;
        }
        try {
            C1713570uh1 c1713570uh1 = Vo().LL;
            Unit unit = null;
            Integer numValueOf2 = null;
            unit = null;
            if (c1713570uh1 != null && (c1713750uhJLJII = c1713570uh1.LJII()) != null) {
                VerifyAnalysisSession verifyAnalysisSessionJo = Jo();
                if (verifyAnalysisSessionJo != null) {
                    numValueOf = Integer.valueOf(verifyAnalysisSessionJo.LJIIZILJ);
                } else {
                    numValueOf = null;
                }
                VerifyAnalysisSession verifyAnalysisSessionJo2 = Jo();
                if (verifyAnalysisSessionJo2 != null) {
                    numValueOf2 = Integer.valueOf(verifyAnalysisSessionJo2.LJ.get());
                }
                if (C1714240ui6.LIZ()) {
                    C1707050uWV.LIZ(new C1714150uhx(c1713750uhJLJII, str, str2, str3, numValueOf, numValueOf2));
                }
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void dp(long j, long j2, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("obj_id", "current_pin");
        linkedHashMap.put("finish_timestamp", String.valueOf(j));
        linkedHashMap.put("duration", String.valueOf(j2));
        if (str != null && str.length() != 0) {
            linkedHashMap.put("pin_err_code", str);
        }
        if (str2 != null && str2.length() != 0) {
            linkedHashMap.put("verification_err_msg", str2);
        }
        for (Map.Entry<String, Object> entry : Lo().entrySet()) {
            linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
        ip("fp_sdk_bnpl_pin_fillin", linkedHashMap);
    }
}
