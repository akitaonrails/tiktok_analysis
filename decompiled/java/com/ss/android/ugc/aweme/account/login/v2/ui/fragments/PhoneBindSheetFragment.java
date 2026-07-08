package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.C01GW;
import X.C0OM1;
import X.C0WZX;
import X.C0XQ5;
import X.C123100dR;
import X.C1232150iAX;
import X.C1237010iIN;
import X.C1237730iJX;
import X.C1238240iKM;
import X.C1239020iLc;
import X.C1251150ifB;
import X.C1266120j3K;
import X.C1308910kAL;
import X.C1391190mJ3;
import X.C19293810e0;
import X.C197039127h;
import X.C19EG;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C418440Gaw;
import X.C426750GoL;
import X.C431260Gvc;
import X.C452501pT;
import X.C616540OGe;
import X.C786410Ut5;
import X.C814420VxA;
import X.C849680XUw;
import X.C851940XbU;
import X.C852810Xct;
import X.C853660XeG;
import X.C854460XfY;
import X.EnumC1237860iJk;
import X.EnumC852660Xce;
import X.InterfaceC1058150ddt;
import X.InterfaceC344240DeY;
import Y.ACListenerS154S0100000_19;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.IBindService;
import com.ss.android.ugc.aweme.IForceBindingAccountService;
import com.ss.android.ugc.aweme.account.eventtracking.bindings.BackToPreviousPageEvent;
import com.ss.android.ugc.aweme.account.experiment.ThirdPartyDeprecationExperiment5;
import com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneBindSheetFragment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class PhoneBindSheetFragment extends BaseI18nLoginFragment implements InterfaceC344240DeY, InterfaceC1058150ddt {
    public static IBinder LLLL = null;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJSA0IStiHELIOSP319PSxiLz0yLygpJzsgZhUkJiE2CiwiLRw7LSA4Dz0yLygpJzs=";
    public TuxTextView LLLIILIL;
    public TuxTextView LLLIL;
    public C197039127h LLLILZ;
    public C197039127h LLLILZJ;
    public C1238240iKM LLLILZLLLI;
    public final C01GW LLLIZZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 289));
    public final C01GW LLLJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 290));
    public boolean LLLJIL = true;
    public boolean LLLJL;

    @Override // X.InterfaceC1058150ddt
    public final void LLLFFI(TuxSheet tuxSheet, float f) {
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C1237010iIN iS() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final int sS() {
        return R.layout.a0j;
    }

    public final C197039127h NS() {
        View viewFindViewById = this.LLLILZJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.dnx) : null;
            this.LLLILZJ = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final C197039127h PS() {
        View viewFindViewById = this.LLLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.kpy) : null;
            this.LLLILZ = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final C1238240iKM QS() {
        View viewFindViewById = this.LLLILZLLLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.kq0) : null;
            this.LLLILZLLLI = (C1238240iKM) viewFindViewById;
        }
        return (C1238240iKM) viewFindViewById;
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C852810Xct.LIZ.getClass();
        if (C852810Xct.LJIIIZ(this)) {
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
            c1251150ifB.LIZJ(new AwS563S0100000_19(this, 288));
            c0om1.LIZIZ(c1251150ifB);
        }
        return c0om1;
    }

    @Override // X.InterfaceC1058150ddt
    public final boolean onBackPress() {
        C854460XfY.LIZ.getClass();
        if (!Intrinsics.LJFF(C854460XfY.LJI().get("exit_page"), "verification_page")) {
            return false;
        }
        boolean zLJFF = Intrinsics.LJFF(C854460XfY.LJI().get("current_page"), "PHONE_BIND_SHEET");
        BackToPreviousPageEvent backToPreviousPageEvent = new BackToPreviousPageEvent();
        backToPreviousPageEvent.LJI(zLJFF ? "phone_binding_show" : "email_binding_show", "current_page");
        backToPreviousPageEvent.LJI(zLJFF ? "sms_verification" : "email_verification", "pre_page");
        backToPreviousPageEvent.LJI(getEnterFrom(), "enter_from");
        backToPreviousPageEvent.LJI("press_back", "enter_method");
        backToPreviousPageEvent.LJI(RR(), "page");
        backToPreviousPageEvent.LJIIIIZZ();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void HS() {
        EditText editText;
        C1238240iKM c1238240iKMQS = QS();
        if (c1238240iKMQS != null) {
            c1238240iKMQS.setValidationStatus(0);
        }
        C1238240iKM c1238240iKMQS2 = QS();
        if (c1238240iKMQS2 != null && (editText = c1238240iKMQS2.getEditText()) != null) {
            editText.setFilters(new C1237730iJX[]{C1237730iJX.LL});
        }
        C197039127h c197039127hPS = PS();
        if (c197039127hPS != null) {
            c197039127hPS.setLoading(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void aS() {
        EditText editText;
        C1238240iKM c1238240iKMQS = QS();
        if (c1238240iKMQS != null) {
            c1238240iKMQS.setValidationStatus(0);
        }
        C1238240iKM c1238240iKMQS2 = QS();
        if (c1238240iKMQS2 != null && (editText = c1238240iKMQS2.getEditText()) != null) {
            editText.setFilters(new InputFilter[0]);
        }
        C197039127h c197039127hPS = PS();
        if (c197039127hPS != null) {
            c197039127hPS.setLoading(false);
        }
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
    public final void onPause() {
        super.onPause();
        LLLL = null;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        EditText editText;
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(PhoneBindSheetFragment.class.getName());
        }
        super.onResume();
        this.LLLJIL = true;
        C854460XfY.LIZ.getClass();
        C854460XfY.LJI().put("enter_from", getEnterFrom());
        C854460XfY.LJI().put("enter_method", getEnterMethod());
        C854460XfY.LJI().put("exit_page", "binding_page");
        C854460XfY.LJI().put("current_page", "PHONE_BIND_SHEET");
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getBoolean("keyboard_auto_raise")) {
            C1232150iAX.LIZIZ(QS().getEditText());
            C1238240iKM c1238240iKMQS = QS();
            LLLL = (c1238240iKMQS == null || (editText = c1238240iKMQS.getEditText()) == null) ? null : editText.getWindowToken();
        } else {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                arguments2.putBoolean("keyboard_auto_raise", true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void RS(boolean r9) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneBindSheetFragment.RS(boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        C853660XeG c853660XeG = C853660XeG.LIZ;
        String enterMethod = getEnterMethod();
        String enterFrom = getEnterFrom();
        String strRR = RR();
        C852810Xct.LIZ.getClass();
        String strLIZJ = C852810Xct.LIZJ(this);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("popup_freq")) == null) {
            string = "";
        }
        C853660XeG.LIZ(c853660XeG, enterMethod, enterFrom, strRR, null, strLIZJ, string, null, 72);
    }

    public final void US(boolean z, boolean z2) {
        if (z2) {
            C19EG activity = getActivity();
            if (activity != null) {
                Bundle arguments = getArguments();
                if (arguments == null) {
                    arguments = new Bundle();
                }
                Bundle bundle = new Bundle(arguments);
                bundle.putBoolean("code_sent", z);
                bundle.putInt("current_scene", EnumC852660Xce.BIND_PHONE.getValue());
                bundle.putBoolean("from_phone_bind_sheet_fullscreen", true);
                C1266120j3K c1266120j3K = new C1266120j3K(activity, this, 1);
                IBindService iBindService = (IBindService) PluggableExtentionKt.pluggableSpi$default(IBindService.class, false, false, false, 14, null);
                if (iBindService != null) {
                    iBindService.startBindMobileSMSVerify(activity, getEnterFrom(), getEnterMethod(), bundle, c1266120j3K);
                    return;
                }
                return;
            }
            return;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            arguments2.putBoolean("keyboard_auto_raise", true);
        }
        InputCodeSheetFragment inputCodeSheetFragment = new InputCodeSheetFragment();
        Bundle arguments3 = getArguments();
        if (arguments3 == null) {
            arguments3 = new Bundle();
        }
        Bundle bundle2 = new Bundle(arguments3);
        bundle2.putBoolean("code_sent", z);
        bundle2.putBoolean("is_phone", true);
        bundle2.putInt("view_height", uS().getHeight());
        inputCodeSheetFragment.setArguments(bundle2);
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJIJI(this, inputCodeSheetFragment, false, null, 12);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String lowerCase;
        String strLIZLLL;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        Integer numLIZJ;
        Context context;
        String string6;
        String strName;
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LLLIILIL;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.qae);
            } else {
                viewFindViewById = null;
            }
            this.LLLIILIL = (TuxTextView) viewFindViewById;
        }
        ((TuxTextView) viewFindViewById).LJJJJI(28.0f);
        EnumC1237860iJk currentLoginUser3pPlatform = ((IForceBindingAccountService) ServiceManager.get().getService(IForceBindingAccountService.class)).getCurrentLoginUser3pPlatform();
        if (currentLoginUser3pPlatform == null || (strName = currentLoginUser3pPlatform.name()) == null || (lowerCase = strName.toLowerCase(Locale.ROOT)) == null) {
            lowerCase = "";
        }
        Context context2 = getContext();
        if (context2 != null) {
            strLIZLLL = C849680XUw.LIZLLL(context2, lowerCase);
        } else {
            strLIZLLL = null;
        }
        ThirdPartyDeprecationExperiment5.LIZ.getClass();
        if (ThirdPartyDeprecationExperiment5.LIZLLL() && C123100dR.LIZ(lowerCase)) {
            string = getString(2131836810);
        } else {
            string = getString(2131838796);
        }
        View viewFindViewById2 = this.LLLIILIL;
        if (viewFindViewById2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById2 = view3.findViewById(R.id.qae);
            } else {
                viewFindViewById2 = null;
            }
            this.LLLIILIL = (TuxTextView) viewFindViewById2;
        }
        TextView textView = (TextView) viewFindViewById2;
        Bundle arguments = getArguments();
        if (arguments != null) {
            string2 = arguments.getString("phone_sheet_title");
        } else {
            string2 = null;
        }
        if (C123100dR.LIZ(string2) && string2 != null) {
            string = string2;
        }
        textView.setText(string);
        View viewFindViewById3 = this.LLLIL;
        if (viewFindViewById3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById3 = view4.findViewById(R.id.qac);
            } else {
                viewFindViewById3 = null;
            }
            this.LLLIL = (TuxTextView) viewFindViewById3;
        }
        ((TextView) viewFindViewById3).setMovementMethod(C431260Gvc.LIZ);
        int iIntValue = 0;
        if (ThirdPartyDeprecationExperiment5.LIZLLL() && C123100dR.LIZ(lowerCase)) {
            string3 = getString(2131836801, strLIZLLL);
        } else {
            string3 = getString(2131838786);
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            string4 = arguments2.getString("phone_sheet_desc");
        } else {
            string4 = null;
        }
        String str = string3;
        str = string3;
        if (C123100dR.LIZ(string4) && string4 != null) {
            str = string4;
        }
        View viewFindViewById4 = this.LLLIL;
        if (viewFindViewById4 == null) {
            View view5 = getView();
            if (view5 != null) {
                viewFindViewById4 = view5.findViewById(R.id.qac);
            } else {
                viewFindViewById4 = null;
            }
            this.LLLIL = (TuxTextView) viewFindViewById4;
        }
        TextView textView2 = (TextView) viewFindViewById4;
        Bundle arguments3 = getArguments();
        CharSequence charSequenceLIZIZ = str;
        if (arguments3 != null) {
            charSequenceLIZIZ = str;
            if (arguments3.getBoolean("should_show_learn_more", true)) {
                charSequenceLIZIZ = C1239020iLc.LIZIZ(getContext(), str, 41, null, 24);
            }
        }
        textView2.setText(charSequenceLIZIZ);
        C197039127h c197039127hPS = PS();
        if (c197039127hPS != null) {
            if (!((Boolean) this.LLLJ.getValue()).booleanValue() && !ThirdPartyDeprecationExperiment5.LJ()) {
                string6 = getString(2131838790);
            } else {
                string6 = getString(2131829384);
            }
            c197039127hPS.setText(string6);
        }
        if (((Boolean) this.LLLJ.getValue()).booleanValue()) {
            C197039127h c197039127hPS2 = PS();
            if (c197039127hPS2 != null) {
                C426750GoL.LJIIIZ(c197039127hPS2, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), false, 23);
            }
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.qad);
            if (tuxTextView != null && (context = tuxTextView.getContext()) != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 0);
                C19293810e0.LIZJ(context, tuxTextView, 9, null);
            }
        }
        if (!C0XQ5.LIZJ().isHasEmail()) {
            C786410Ut5.LLLLLLJ(NS(), 0);
            C197039127h c197039127hNS = NS();
            if (ThirdPartyDeprecationExperiment5.LJ()) {
                string5 = getString(2131836811);
            } else {
                string5 = getString(2131838791);
            }
            c197039127hNS.setText(string5);
            C197039127h c197039127hNS2 = NS();
            Context context3 = getContext();
            if (context3 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1b, context3)) != null) {
                iIntValue = numLIZJ.intValue();
            }
            c197039127hNS2.setBackgroundColor(iIntValue);
            NS().setTextColorRes(R.attr.a1h);
        } else {
            C197039127h c197039127hNS3 = NS();
            if (c197039127hNS3 != null) {
                C786410Ut5.LLLLLLJ(c197039127hNS3, 8);
            }
        }
        C852810Xct.LIZ.getClass();
        PhoneNumberUtil.PhoneNumber phoneNumberLJII = C852810Xct.LJII(getArguments());
        if (phoneNumberLJII != null) {
            this.LLLJL = true;
            C1238240iKM c1238240iKMQS = QS();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("");
            sbLIZ.append(phoneNumberLJII.getCountryCode());
            c1238240iKMQS.setCountryCode(C2188811AlT.LIZIZ(sbLIZ));
            C1238240iKM c1238240iKMQS2 = QS();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("");
            sbLIZ2.append(phoneNumberLJII.getCountryIso());
            c1238240iKMQS2.setCountryName(C2188811AlT.LIZIZ(sbLIZ2));
            C1238240iKM c1238240iKMQS3 = QS();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("");
            sbLIZ3.append(phoneNumberLJII.getNationalNumber());
            c1238240iKMQS3.setPhoneNumber(C2188811AlT.LIZIZ(sbLIZ3));
        } else {
            QS().LIZIZ();
        }
        QS().setOnCountryCodeChanged(new AwS563S0100000_19(this, 291));
        final EditText editText = QS().getEditText();
        editText.addTextChangedListener(new C851940XbU() { // from class: X.0iJW
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                C197039127h c197039127hPS3 = this.LL.PS();
                if (c197039127hPS3 != null) {
                    c197039127hPS3.setEnabled(!TextUtils.isEmpty(C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owsk1PEpk5Z4F7WzzjzzRSEqAAj+xHbfMzu7SHw+cUQ0Gw2d0nF3+j8=", null))));
                }
                this.LL.QS().setValidationStatus(0);
                this.LL.QS().LIZ();
                PhoneBindSheetFragment phoneBindSheetFragment = this.LL;
                if (phoneBindSheetFragment.LLLJIL && !phoneBindSheetFragment.LLLJL) {
                    C852810Xct c852810Xct = C852810Xct.LIZ;
                    PhoneBindSheetFragment phoneBindSheetFragment2 = this.LL;
                    c852810Xct.getClass();
                    C20684815ws.LJIILLIIL("start_phone_typing", C2097608Jq.LJIIIIZZ(new Pair("enter_from", phoneBindSheetFragment.getEnterFrom()), new Pair("enter_method", this.LL.getEnterMethod()), new Pair("page", C852810Xct.LJFF(phoneBindSheetFragment2)), new Pair("config_key", C852810Xct.LIZJ(this.LL))));
                    this.LL.LLLJIL = false;
                    return;
                }
                phoneBindSheetFragment.LLLJL = false;
            }
        });
        editText.setHint(getString(2131838795));
        C197039127h c197039127hPS3 = PS();
        if (c197039127hPS3 != null) {
            c197039127hPS3.setEnabled(!TextUtils.isEmpty(C2204961BRm.LLJILLL(QS().getEditText(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owsk1PEpk5Z4F7WzzjzzRSEqAAj+xHbfMzu7SHw+cUQ0Gw2d0nF3+j8=", null))));
        }
        GS(new ACListenerS154S0100000_19(this, 67), PS());
        GS(new ACListenerS154S0100000_19(this, 68), NS());
    }

    @Override // X.C0XYD
    public final void pn(int i, String str) {
        if (i == 1001 && !((Boolean) this.LLLIZZ.getValue()).booleanValue() && !C0XQ5.LIZJ().isHasEmail()) {
            RS(true);
            return;
        }
        C1238240iKM c1238240iKMQS = QS();
        if (c1238240iKMQS != null) {
            c1238240iKMQS.setValidationStatus(3);
        }
        C1238240iKM c1238240iKMQS2 = QS();
        if (c1238240iKMQS2 == null) {
            return;
        }
        c1238240iKMQS2.LIZJ(str);
    }
}
