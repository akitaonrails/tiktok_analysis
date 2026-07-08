package com.ss.android.ugc.aweme.account.agegate.customdataforsdk;

import X.AbstractC1250290idn;
import X.C01GW;
import X.C0CQG;
import X.C0R94;
import X.C10SV;
import X.C10VR;
import X.C1250280idm;
import X.C1250300ido;
import X.C1308910kAL;
import X.C1389890mGx;
import X.C14KQ;
import X.C19252910Tv;
import X.C19254610Um;
import X.C19299010eq;
import X.C19300810f8;
import X.C19301110fB;
import X.C1954807lC;
import X.C197039127h;
import X.C19EG;
import X.C20684815ws;
import X.C21405318pn;
import X.C2257791DYr;
import X.C2344009Gk;
import X.C294460BgS;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C844470XAv;
import X.EnumC19300210f2;
import X.EnumC19300510f5;
import X.EnumC638250P1r;
import X.ViewOnLayoutChangeListenerC19332410kE;
import Y.ACListenerS162S0100000_28;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.agegate.RegistrationAgeGateServiceImpl;
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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes29.dex */
public final class AgeGateForNUJRevampFragment extends TTKRegistrationBaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiKCg2LyQ4LGEwPTHELIOSY4JiI3KTEtLyAhOyEnZw40LQItPSoVJzcCHAUBLTMtJD8VOiQrJCo9PA==";
    public C2257791DYr LLJLLIL;
    public ImageView LLJLLL;
    public Long LLJZ;
    public boolean LLJZIJLIL;
    public final Map<String, String> LLL = new LinkedHashMap(RegistrationAgeGateServiceImpl.LIZJ);
    public final Calendar LLLF = Calendar.getInstance();
    public final Calendar LLLFF = Calendar.getInstance();
    public final C01GW LLLFFI = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(74));
    public final C01GW LLLFZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 49));

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment
    public final void FS(String str) {
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment, X.C10WS
    public final void er(String str) {
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment
    public final void zS(boolean z) {
    }

    private final int mS() {
        return ((Number) this.LLLFZ.getValue()).intValue();
    }

    public final void iT() {
        Object parent;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
        int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120));
        int i = iLIZIZ * 2;
        int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)) + i;
        int i2 = i + iLIZIZ2;
        int iLIZ = C0R94.LIZ(dS());
        int iLIZ2 = C0R94.LIZ(WR());
        int iLIZ3 = C0R94.LIZ(jT());
        TuxTextView tuxTextViewVR = VR();
        int iLIZ4 = iLIZ - (((iLIZ2 + iLIZ3) + ((tuxTextViewVR == null || (parent = tuxTextViewVR.getParent()) == null) ? 0 : C0R94.LIZ((View) parent))) + C0R94.LIZ(hS()));
        View viewFindViewById = this.LLJLLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ak4) : null;
            this.LLJLLL = (ImageView) viewFindViewById;
        }
        ImageView imageView = (ImageView) viewFindViewById;
        if (imageView != null) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
            if (iLIZ4 < iLIZIZ4) {
                C786410Ut5.LJZI(4, imageView);
                return;
            }
            if (iLIZ4 < i2) {
                int i3 = iLIZ4 - i;
                layoutParams.weight = 0.0f;
                layoutParams.height = i3;
                layoutParams.width = (i3 / 2) * 3;
                C786410Ut5.c6(imageView, layoutParams);
                C426750GoL.LJIIIZ(imageView, null, Integer.valueOf(iLIZIZ), null, Integer.valueOf(iLIZIZ), false, 21);
                C786410Ut5.LJZI(0, imageView);
                return;
            }
            layoutParams.weight = 0.0f;
            layoutParams.height = iLIZIZ2;
            layoutParams.width = iLIZIZ3;
            C786410Ut5.c6(imageView, layoutParams);
            int i4 = (iLIZ4 - iLIZIZ2) / 2;
            C426750GoL.LJIIIZ(imageView, null, Integer.valueOf(i4), null, Integer.valueOf(i4), false, 21);
            C786410Ut5.LJZI(0, imageView);
        }
    }

    public final C2257791DYr jT() {
        View viewFindViewById = this.LLJLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.wheelPicker) : null;
            this.LLJLLIL = (C2257791DYr) viewFindViewById;
        }
        return (C2257791DYr) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment
    public final void VS() {
        C21405318pn c21405318pnAS = aS();
        if (c21405318pnAS != null) {
            c21405318pnAS.setText(getString(2131825244));
        }
        C197039127h c197039127hHS = hS();
        if (c197039127hHS != null) {
            C786410Ut5.U8(c197039127hHS, new ACListenerS162S0100000_28(this, 18));
        }
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (mS() == AgeGateSdkRegistrationFlow.SIGN_UP.getFlow() || this.LLJL) {
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

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment
    public final void ES(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        C2257791DYr c2257791DYrJT = jT();
        if (c2257791DYrJT != null) {
            c2257791DYrJT.setCurrentTime(calendar.getTimeInMillis());
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
        this.LLLF.setTime(date);
        C2257791DYr c2257791DYrJT = jT();
        if (c2257791DYrJT != null) {
            c2257791DYrJT.LJ(this.LLLF.getTimeInMillis(), this.LLLFF.getTimeInMillis());
        }
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
            C786410Ut5.LLLLZLL(cS(), 8);
            C786410Ut5.LLLLZLL(oS(), 8);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment
    public final void NS(String str) {
        C197039127h c197039127hHS = hS();
        if (c197039127hHS != null) {
            if (str == null) {
                C844470XAv.LIZ.getClass();
                str = C844470XAv.LIZ().getString(2131838123);
            }
            c197039127hHS.setText(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment
    public final void OR(PNSErrorModel pNSErrorModel) {
        Integer num = pNSErrorModel.errorType;
        if (num != null) {
            int iIntValue = num.intValue();
            EnumC19300510f5.Companion.getClass();
            int i = C19300810f8.LIZ[C19301110fB.LIZ(iIntValue).ordinal()];
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
                String str = pNSErrorModel.errorMessage;
                TuxTextView tuxTextViewCS = cS();
                if (tuxTextViewCS == null) {
                    return;
                }
                tuxTextViewCS.setText(str);
                C786410Ut5.LLLLZLL(tuxTextViewCS, 0);
                return;
            }
            String str2 = pNSErrorModel.errorMessage;
            TuxTextView tuxTextViewCS2 = cS();
            if (tuxTextViewCS2 != null) {
                tuxTextViewCS2.setText(str2);
                C786410Ut5.LLLLZLL(tuxTextViewCS2, 0);
            }
            TTKRegistrationBaseFragment.XS(cS());
        }
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment
    public final void PS(String str) {
        WR().setText(str);
        C786410Ut5.LLLLZLL(WR(), 0);
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment
    public final void QS(Date date) {
        this.LLLFF.setTime(date);
        C2257791DYr c2257791DYrJT = jT();
        if (c2257791DYrJT != null) {
            c2257791DYrJT.LJ(this.LLLF.getTimeInMillis(), this.LLLFF.getTimeInMillis());
        }
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment
    public final AbstractC1250290idn SR(PNSNavButton pNSNavButton) {
        if (pNSNavButton == null) {
            return new C1250280idm();
        }
        if (pNSNavButton.type == EnumC19300210f2.TEXT) {
            C1250300ido c1250300ido = new C1250300ido();
            String str = pNSNavButton.content;
            if (str == null) {
                str = "";
            }
            c1250300ido.LIZJ = str;
            c1250300ido.LJFF = true;
            c1250300ido.LJ = true;
            c1250300ido.LIZLLL = EnumC638250P1r.PRIMARY;
            c1250300ido.LIZ(new AwS572S0100000_28(this, 50));
            return c1250300ido;
        }
        return super.SR(pNSNavButton);
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
    public final void jF(boolean z) {
        hS().setLoading(z);
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment, X.C10WS
    public final void lu(C19299010eq c19299010eq) {
        if (c19299010eq == null) {
            return;
        }
        US(c19299010eq);
        JS(c19299010eq.header, c19299010eq.navButtons);
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
        TuxTextView tuxTextViewOS = oS();
        C844470XAv.LIZ.getClass();
        tuxTextViewOS.setText(C844470XAv.LIZ().getString(2131847051));
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment
    public final void BS(String str, List<PNSHyperlink> list) {
        VR().setText(str);
        C786410Ut5.LLLLZLL(VR(), 0);
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String storeRegionUpperCase;
        boolean z;
        boolean z2;
        IPNSDeviceConsentService iPNSDeviceConsentService;
        String string2;
        String string3;
        Bundle arguments = getArguments();
        View viewFindViewById = null;
        if (arguments != null) {
            string = arguments.getString("platform");
        } else {
            string = null;
        }
        if (Intrinsics.LJFF(string, "google_onetap")) {
            RegistrationAgeGateServiceImpl.LIZIZ.invoke(UR());
        }
        if (mS() == AgeGateSdkRegistrationFlow.NEW_COMPONENT.getFlow()) {
            C19254610Um.LIZIZ.LJJJI(getActivity(), "age_gate");
        } else if (mS() == AgeGateSdkRegistrationFlow.LOGIN_CONSENT.getFlow()) {
            C19254610Um.LIZIZ.LJJJI(getActivity(), "login_and_consent_age_gate");
        }
        Bundle arguments2 = getArguments();
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
            View viewFindViewById2 = view.findViewById(R.id.j8v);
            C19EG activity = getActivity();
            if (activity != null) {
                C786410Ut5.LJLLLLLL(0, viewFindViewById2);
                viewFindViewById2.setBackground(C1308910kAL.LJ(R.attr.a0l, activity));
            }
        }
        VS();
        Calendar calendar = Calendar.getInstance();
        Date value = sS().LL.getValue();
        if (value != null) {
            calendar.setTime(value);
            C2257791DYr c2257791DYrJT = jT();
            if (c2257791DYrJT != null) {
                c2257791DYrJT.setCurrentTime(calendar.getTimeInMillis());
            }
        }
        int i = calendar.get(1);
        this.LLLF.set(i - 120, 0, 1);
        long timeInMillis = this.LLLF.getTimeInMillis();
        this.LLLFF.set(i - 1, 11, 31);
        long timeInMillis2 = this.LLLFF.getTimeInMillis();
        C2257791DYr c2257791DYrJT2 = jT();
        if (c2257791DYrJT2 != null) {
            c2257791DYrJT2.setPickerVariant(0);
            c2257791DYrJT2.LJ(timeInMillis, timeInMillis2);
            c2257791DYrJT2.setCurrentTime(calendar.getTimeInMillis());
            c2257791DYrJT2.setOnTimePickedListener(new AwS607S0100000_28(this, 22));
        }
        if (mS() != AgeGateSdkRegistrationFlow.SIGN_UP.getFlow()) {
            int i2 = ((Keva) this.LLLFFI.getValue()).getInt("times_shown", 0) + 1;
            ((Keva) this.LLLFFI.getValue()).storeInt("times_shown", i2);
            this.LLL.put("times_of_appearance", String.valueOf(i2));
        }
        this.LLL.put("ui_type", "nuj_revamp");
        C0CQG c0cqg = C0CQG.LIZ;
        String str = (String) ((LinkedHashMap) this.LLL).get("registration_flow");
        if (str == null) {
            str = "";
        }
        c0cqg.getClass();
        C0CQG.LIZ(str, "revamp");
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJII(this.LLL);
        C10SV.LIZ(c2344009Gk2);
        C20684815ws.LJIILLIIL("age_gate_registration_show", c2344009Gk2.LIZ);
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
            } else {
                z2 = false;
            }
            if (Intrinsics.LJFF(storeRegionUpperCase, "HU") && z && !z2 && (iPNSDeviceConsentService = (IPNSDeviceConsentService) PluggableExtentionKt.pluggableSpi$default(IPNSDeviceConsentService.class, false, false, false, 14, null)) != null) {
                iPNSDeviceConsentService.LJI(true);
            }
        }
        Context context = getContext();
        if (context != null) {
            int iLJ = C14KQ.LJ(context);
            if (C14KQ.LJIIIIZZ(context) <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(360)) && iLJ <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(640))) {
                TuxTextView tuxTextViewWR = WR();
                if (tuxTextViewWR != null) {
                    tuxTextViewWR.LJJJJI(24.0f);
                    C426750GoL.LJIIIZ(tuxTextViewWR, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), null, null, false, 29);
                }
                TuxTextView tuxTextViewVR = VR();
                if (tuxTextViewVR != null) {
                    tuxTextViewVR.setTuxFont(71);
                    tuxTextViewVR.LJJJJI(12.0f);
                }
                C2257791DYr c2257791DYrJT3 = jT();
                if (c2257791DYrJT3 != null) {
                    C426750GoL.LJIIIZ(c2257791DYrJT3, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), false, 23);
                }
                TuxTextView tuxTextViewWR2 = WR();
                if (tuxTextViewWR2 != null) {
                    C426750GoL.LJIIIZ(tuxTextViewWR2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, false, 26);
                }
                TuxTextView tuxTextViewCS = cS();
                if (tuxTextViewCS != null) {
                    C426750GoL.LJIIIZ(tuxTextViewCS, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, false, 26);
                }
                TuxTextView tuxTextViewOS = oS();
                if (tuxTextViewOS != null) {
                    C426750GoL.LJIIIZ(tuxTextViewOS, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, false, 26);
                }
            }
        }
        View view2 = this.LLJLLL;
        if (view2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById = view3.findViewById(R.id.ak4);
            }
            this.LLJLLL = (ImageView) viewFindViewById;
            view2 = viewFindViewById;
        }
        ImageView imageView = (ImageView) view2;
        if (imageView != null) {
            C786410Ut5.LJZI(4, imageView);
        }
        if (view.isLaidOut() && !view.isLayoutRequested()) {
            if (isAdded()) {
                iT();
            }
        } else {
            view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC19332410kE(this, 0));
        }
        NR();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r5, android.view.ViewGroup r6, android.os.Bundle r7) {
        /*
            r4 = this;
            android.content.Context r0 = r4.getContext()
            r2 = 0
            if (r0 == 0) goto L35
            boolean r1 = X.C960203pA.LIZIZ(r0)
            r0 = 1
            if (r1 != r0) goto L35
        Le:
            if (r0 == 0) goto L2a
            android.content.Context r1 = r5.getContext()
            r0 = 2131886953(0x7f120369, float:1.94085E38)
            r1.setTheme(r0)
        L1a:
            r0 = 2131559053(0x7f0d028d, float:1.874344E38)
            android.view.View r3 = X.C786410Ut5.Td(r5, r0, r6, r2)
            boolean r0 = r3 instanceof android.view.View
            r2 = 0
            if (r0 != 0) goto L27
            r3 = r2
        L27:
            if (r3 == 0) goto L55
            goto L37
        L2a:
            android.content.Context r1 = r5.getContext()
            r0 = 2131886939(0x7f12035b, float:1.940847E38)
            r1.setTheme(r0)
            goto L1a
        L35:
            r0 = 0
            goto Le
        L37:
            androidx.lifecycle.LifecycleOwner r0 = r4.getViewLifecycleOwner()     // Catch: java.lang.Throwable -> L5b
            androidx.lifecycle.ViewTreeLifecycleOwner.set(r3, r0)     // Catch: java.lang.Throwable -> L5b
            androidx.lifecycle.ViewTreeViewModelStoreOwner.set(r3, r4)     // Catch: java.lang.Throwable -> L5b
            r0 = 2131400122(0x7f0a95ba, float:1.8421089E38)
            r3.setTag(r0, r4)     // Catch: java.lang.Throwable -> L5b
            X.19EG r1 = r4.getActivity()     // Catch: java.lang.Throwable -> L5b
            boolean r0 = r1 instanceof X.C19GS     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto L52
            r2 = r1
            X.19GS r2 = (X.C19GS) r2     // Catch: java.lang.Throwable -> L5b
        L52:
            X.C1685300txQ.LIZ(r2)     // Catch: java.lang.Throwable -> L5b
        L55:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L5b
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L5b
            return r3
        L5b:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.agegate.customdataforsdk.AgeGateForNUJRevampFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
