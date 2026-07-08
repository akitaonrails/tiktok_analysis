package com.ss.android.ugc.aweme.account.agegate.customdataforsdk;

import X.C01GW;
import X.C098200Yq;
import X.C0FNV;
import X.C0OM1;
import X.C10SV;
import X.C10VR;
import X.C1250250idj;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1389890mGx;
import X.C1685300txQ;
import X.C189200o6;
import X.C19252910Tv;
import X.C19258510Vz;
import X.C19299010eq;
import X.C19300910f9;
import X.C19301110fB;
import X.C1954807lC;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C21405318pn;
import X.C2344009Gk;
import X.C294460BgS;
import X.C294530BgZ;
import X.C294540Bga;
import X.C452501pT;
import X.C785410UrT;
import X.C786410Ut5;
import X.C844470XAv;
import X.C960203pA;
import X.DialogC1389620mGW;
import X.EnumC19300410f4;
import X.EnumC19300510f5;
import X.EnumC19300610f6;
import Y.ACListenerS162S0100000_28;
import Y.AObserverS188S0200000_28;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.agegate.RegistrationAgeGateServiceImpl;
import com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSErrorModel;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSHyperlink;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSNavButton;
import com.ss.android.ugc.aweme.services.AgeGateSdkRegistrationFlow;
import com.zhiliaoapp.musically.R;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes29.dex */
public class TTKAgeGateUiUpgradeRegistrationFragment extends TTKRegistrationBaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiKCg2LyQ4LGEwPTY4JiI3KTHELIOSEtLyAhOyEnZxsHAwQrLAgyPCAZIBojLzctLSoBLSIlOjshKTElJiEVOiQrJCo9PA==";
    public final Map<String, String> LLJLLIL = new LinkedHashMap(RegistrationAgeGateServiceImpl.LIZJ);
    public final C01GW LLJLLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(75));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 52));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 53));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 51));

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment, X.C10WS
    public final LiveData<C19258510Vz> Un() {
        return sS().LLILZIL;
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment
    public final void VS() {
        C197039127h c197039127hHS = hS();
        if (c197039127hHS != null) {
            C786410Ut5.U8(c197039127hHS, new ACListenerS162S0100000_28(this, 24));
        }
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJII(this.LLJLLIL);
        c2344009Gk.LJIIIIZZ("default_format", C10VR.LIZ());
        c2344009Gk.LIZJ(0, "day");
        c2344009Gk.LIZJ(0, "month");
        c2344009Gk.LIZJ(0, "year");
        c2344009Gk.LIZJ(Math.max(0, Math.max(0, 0)), "selected_cnt");
        c2344009Gk.LIZJ(this.LLJL ? 1 : 0, "is_submit");
        C20684815ws.LJIILLIIL("age_scroll_result", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        if (C294530BgZ.LIZ()) {
            DialogC1389620mGW dialogC1389620mGW = this.LLJLL;
            if (dialogC1389620mGW != null) {
                C0FNV.LIZIZ(dialogC1389620mGW);
            }
            DialogC1389620mGW dialogC1389620mGW2 = this.LLJLL;
            if (dialogC1389620mGW2 != null) {
                dialogC1389620mGW2.cancel();
            }
            DialogC1389620mGW dialogC1389620mGW3 = this.LLJLL;
            if (dialogC1389620mGW3 != null) {
                dialogC1389620mGW3.dismiss();
                C785410UrT.LIZ(dialogC1389620mGW3);
            }
            this.LLJLL = null;
            sS().LLILZLL.postValue(Boolean.FALSE);
        }
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (((Number) this.LLJZIJLIL.getValue()).intValue() == AgeGateSdkRegistrationFlow.SIGN_UP.getFlow() || this.LLJL) {
            return;
        }
        C10VR.LIZIZ("background");
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        C19EG activity = getActivity();
        if (activity != null) {
            KeyboardUtils.LJ(16, activity, 240);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment, X.C10WS
    public final void qh() {
        C786410Ut5.LLLLZLL(oS(), 0);
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment
    public final void ES(Date date) {
        ZR().LIZJ(date);
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment
    public final void FS(String str) {
        int i;
        if (str == null) {
            Context context = getContext();
            if (context != null && C960203pA.LIZIZ(context)) {
                i = R.drawable.bdm;
            } else {
                i = R.drawable.bdl;
            }
            C1331670kl3 c1331670kl3LJFF = C1331660kl2.LJFF(i);
            c1331670kl3LJFF.LJJ(bS());
            C786410Ut5.h3(c1331670kl3LJFF);
            return;
        }
        if (a0.LJJJIL(str)) {
            C786410Ut5.LLFF(8, bS());
        } else {
            if (!(true ^ a0.LJJJIL(str))) {
                return;
            }
            C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(UriProtector.parse(str));
            c1331670kl3LJI.LJJ(bS());
            C786410Ut5.h3(c1331670kl3LJI);
            C786410Ut5.LLFF(0, bS());
        }
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment
    public final void GS(String str) {
        EditText editText;
        C21405318pn c21405318pnAS = aS();
        if (c21405318pnAS != null && (editText = c21405318pnAS.getEditText()) != null) {
            editText.setHint(str);
            editText.setInputType(0);
            editText.setTypeface(Typeface.DEFAULT);
            editText.setEnabled(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment
    public final void HS(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        ZR().setLowerBoundDate(calendar);
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment, X.C10WS
    public final void Kq(String str) {
        C21405318pn c21405318pnAS;
        if (str != null && (c21405318pnAS = aS()) != null) {
            c21405318pnAS.setText(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment, X.C10WS
    public final void Kz(boolean z) {
        hS().setEnabled(z);
        if (z) {
            C786410Ut5.LJZL(8, kS());
        }
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment
    public final void NS(String str) {
        C197039127h c197039127hHS = hS();
        if (c197039127hHS != null) {
            C844470XAv.LIZ.getClass();
            c197039127hHS.setText(C844470XAv.LIZ().getString(2131837635));
        }
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment
    public final void OR(PNSErrorModel pNSErrorModel) {
        Integer num = pNSErrorModel.errorType;
        if (num != null) {
            int iIntValue = num.intValue();
            EnumC19300510f5.Companion.getClass();
            int i = C19300910f9.LIZ[C19301110fB.LIZ(iIntValue).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        String string = pNSErrorModel.errorMessage;
                        if (string != null) {
                            C1389890mGx c1389890mGx = new C1389890mGx(this);
                            if (string.length() == 0) {
                                string = getString(2131837962);
                            }
                            c1389890mGx.LJIIJ(string);
                            c1389890mGx.LJIIJJI();
                            return;
                        }
                        return;
                    }
                    throw new C1954807lC();
                }
                eT(pNSErrorModel.errorMessage, false);
                return;
            }
            eT(pNSErrorModel.errorMessage, true);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment
    public final void PS(String str) {
        WR().setText(str);
        C786410Ut5.LLLLZLL(WR(), 0);
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment
    public final void QS(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        ZR().setUpperBoundDate(calendar);
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment
    public final void US(C19299010eq c19299010eq) {
        String str;
        boolean z;
        String str2;
        String str3;
        String str4;
        List<PNSHyperlink> list;
        String str5 = null;
        if (c19299010eq != null) {
            str = c19299010eq.title;
        } else {
            str = null;
        }
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C786410Ut5.LLLLZLL(WR(), 8);
        } else {
            if (c19299010eq != null) {
                str2 = c19299010eq.title;
            } else {
                str2 = null;
            }
            PS(str2);
        }
        if (c19299010eq != null && (str3 = c19299010eq.contentDesc) != null && !a0.LJJJIL(str3)) {
            if (c19299010eq != null) {
                str4 = c19299010eq.contentDesc;
                list = c19299010eq.hyperLinks;
            } else {
                str4 = null;
                list = null;
            }
            BS(str4, list);
        } else {
            C786410Ut5.LLLLZLL(VR(), 8);
        }
        if (c19299010eq != null) {
            str5 = c19299010eq.nextBtnText;
        }
        NS(str5);
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment, X.C10WS
    public final void er(String str) {
        gS().setText(str);
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment, X.C10WS
    public final void jF(boolean z) {
        hS().setLoading(z);
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment, X.C10WS
    public final void lu(C19299010eq c19299010eq) {
        boolean z;
        if (c19299010eq == null) {
            return;
        }
        US(c19299010eq);
        JS(c19299010eq.header, c19299010eq.navButtons);
        FS(c19299010eq.imageUrl);
        GS(c19299010eq.inputPlaceHolder);
        Date date = c19299010eq.defaultDate;
        if (date == null) {
            date = new Date();
        }
        ES(date);
        Date date2 = c19299010eq.upperBound;
        if (date2 == null) {
            date2 = new Date();
        }
        QS(date2);
        Date date3 = c19299010eq.lowerBound;
        if (date3 != null) {
            HS(date3);
        }
        if (c19299010eq.indicatorType == EnumC19300610f6.DISPLAY) {
            z = true;
        } else {
            z = false;
        }
        zS(z);
        TuxTextView tuxTextViewOS = oS();
        C844470XAv.LIZ.getClass();
        tuxTextViewOS.setText(C844470XAv.LIZ().getString(2131847051));
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment
    public final void zS(boolean z) {
        int i;
        TuxTextView tuxTextViewGS = gS();
        if (tuxTextViewGS != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLLLZLL(tuxTextViewGS, i);
        }
    }

    private final void eT(String str, boolean z) {
        int iIntValue;
        View viewFindViewById = this.LLJILLL;
        if (viewFindViewById == null) {
            View view = getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.ak5);
            } else {
                viewFindViewById = null;
            }
            this.LLJILLL = (TuxIconView) viewFindViewById;
        }
        ImageView imageView = (ImageView) viewFindViewById;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bii, requireContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        imageView.setColorFilter(iIntValue, PorterDuff.Mode.SRC_IN);
        C786410Ut5.LJZL(0, kS());
        cS().setText(str);
        if (z) {
            TTKRegistrationBaseFragment.XS(kS());
        }
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment
    public final void BS(String str, List<PNSHyperlink> list) {
        int iIntValue;
        int iIntValue2;
        VR().setText(str);
        C786410Ut5.LLLLZLL(VR(), 0);
        TuxTextView tuxTextViewVR = VR();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, requireContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        tuxTextViewVR.setTextColor(iIntValue);
        TuxTextView tuxTextViewVR2 = VR();
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.bm, requireContext());
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = 0;
        }
        tuxTextViewVR2.setHighlightColor(iIntValue2);
        if (list != null && !list.isEmpty()) {
            VR().setText(ZS(VR().getText().toString(), list));
            VR().setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment
    public final void JS(String str, List list) {
        PNSNavButton pNSNavButton;
        PNSNavButton pNSNavButton2 = null;
        if (list != null) {
            Iterator it2 = list.iterator();
            PNSNavButton pNSNavButton3 = null;
            while (it2.hasNext()) {
                PNSNavButton pNSNavButton4 = (PNSNavButton) it2.next();
                EnumC19300410f4 enumC19300410f4 = pNSNavButton4.position;
                if (enumC19300410f4 == EnumC19300410f4.LEFT) {
                    pNSNavButton3 = pNSNavButton4;
                } else if (enumC19300410f4 == EnumC19300410f4.RIGHT) {
                    pNSNavButton2 = pNSNavButton4;
                }
            }
            pNSNavButton = pNSNavButton2;
            pNSNavButton2 = pNSNavButton3;
        } else {
            pNSNavButton = null;
        }
        C786410Ut5.LLLLZLLLI(iS(), 0);
        TuxNavBar tuxNavBarIS = iS();
        C0OM1 c0om1 = new C0OM1();
        c0om1.LJ(SR(pNSNavButton2));
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = "";
        c0om1.LIZJ = c1250250idj;
        c0om1.LIZIZ(SR(pNSNavButton));
        c0om1.LIZLLL = false;
        tuxNavBarIS.setNavActions(c0om1);
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String storeRegionUpperCase;
        boolean z;
        IPNSDeviceConsentService iPNSDeviceConsentService;
        String string2;
        String string3;
        if (C294540Bga.LIZ()) {
            sS().N(((Boolean) this.LLJZ.getValue()).booleanValue());
            sS().LLILZLL.observe(getViewLifecycleOwner(), new AObserverS188S0200000_28(this, view, (ViewPagerBottomSheetBehavior<View>) 0));
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("platform");
        } else {
            string = null;
        }
        if (Intrinsics.LJFF(string, "google_onetap")) {
            RegistrationAgeGateServiceImpl.LIZIZ.invoke(UR());
        }
        Bundle arguments2 = getArguments();
        boolean z2 = false;
        if (arguments2 != null && arguments2.getBoolean("need_show_gsma_text")) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                string2 = arguments3.getString("enter_from");
            } else {
                string2 = null;
            }
            c2344009Gk.LJIIIIZZ("enter_from", string2);
            Bundle arguments4 = getArguments();
            if (arguments4 != null) {
                string3 = arguments4.getString("enter_method");
            } else {
                string3 = null;
            }
            c2344009Gk.LJIIIIZZ("enter_method", string3);
            c2344009Gk.LJIIIIZZ("age_gate", "delay");
            C20684815ws.LJIILLIIL("show_gsma_signup_banner", c2344009Gk.LIZ);
            View viewFindViewById = view.findViewById(R.id.j8v);
            C19EG activity = getActivity();
            if (activity != null) {
                C786410Ut5.LJLLLLLL(0, viewFindViewById);
                viewFindViewById.setBackground(C1308910kAL.LJ(R.attr.a0l, activity));
            }
        }
        VS();
        uS(ZR());
        if (((Number) this.LLJZIJLIL.getValue()).intValue() != AgeGateSdkRegistrationFlow.SIGN_UP.getFlow()) {
            int i = ((Keva) this.LLJLLL.getValue()).getInt("times_shown", 0) + 1;
            ((Keva) this.LLJLLL.getValue()).storeInt("times_shown", i);
            this.LLJLLIL.put("times_of_appearance", String.valueOf(i));
        }
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJII(this.LLJLLIL);
        C10SV.LIZ(c2344009Gk2);
        C20684815ws.LJIILLIIL("age_gate_registration_show", c2344009Gk2.LIZ);
        C786410Ut5.LLLLZLL(nS(), 8);
        C19252910Tv.LIZIZ.LIZLLL().LIZIZ().LIZLLL(dS());
        if (!C294460BgS.LIZ()) {
            IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
            if (iAccountService != null) {
                storeRegionUpperCase = iAccountService.getStoreRegionUpperCase();
            } else {
                storeRegionUpperCase = null;
            }
            IPNSDeviceConsentService iPNSDeviceConsentService2 = (IPNSDeviceConsentService) PluggableExtentionKt.pluggableSpi$default(IPNSDeviceConsentService.class, false, false, false, 14, null);
            if (iPNSDeviceConsentService2 != null && iPNSDeviceConsentService2.LIZJ()) {
                z = true;
            } else {
                z = false;
            }
            IPNSDeviceConsentService iPNSDeviceConsentService3 = (IPNSDeviceConsentService) PluggableExtentionKt.pluggableSpi$default(IPNSDeviceConsentService.class, false, false, false, 14, null);
            if (iPNSDeviceConsentService3 != null && iPNSDeviceConsentService3.LJII(null)) {
                z2 = true;
            }
            if (Intrinsics.LJFF(storeRegionUpperCase, "HU") && z && !z2 && (iPNSDeviceConsentService = (IPNSDeviceConsentService) PluggableExtentionKt.pluggableSpi$default(IPNSDeviceConsentService.class, false, false, false, 14, null)) != null) {
                iPNSDeviceConsentService.LJI(true);
            }
        }
        NR();
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.a07, viewGroup, false);
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
