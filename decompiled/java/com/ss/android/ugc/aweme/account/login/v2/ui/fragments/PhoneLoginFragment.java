package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.C01GW;
import X.C0C64;
import X.C0TS3;
import X.C0W3J;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C0XWJ;
import X.C0XZ4;
import X.C10S5;
import X.C1232150iAX;
import X.C1236870iI9;
import X.C1237010iIN;
import X.C1237030iIP;
import X.C1237220iIi;
import X.C1238150iKD;
import X.C1238160iKE;
import X.C1238180iKG;
import X.C1238190iKH;
import X.C1238240iKM;
import X.C1238820iLI;
import X.C1238990iLZ;
import X.C197039127h;
import X.C19EG;
import X.C20533215Wg;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2200821BBo;
import X.C2210608lM;
import X.C452501pT;
import X.C616540OGe;
import X.C688120Qyw;
import X.C786410Ut5;
import X.C831920WkI;
import X.C832080WkY;
import X.C833530Wmt;
import X.C833580Wmy;
import X.C833680Wn8;
import X.C833900WnU;
import X.C833910WnV;
import X.C834010Wnf;
import X.C834200Wny;
import X.C851360XaY;
import X.C851370XaZ;
import X.C851590Xav;
import X.C851660Xb2;
import X.C852810Xct;
import X.C853660XeG;
import X.C853750XeP;
import X.DialogC1389620mGW;
import X.EnumC852660Xce;
import X.EnumC852910Xd3;
import X.InterfaceC1238210iKJ;
import X.InterfaceC1238810iLH;
import X.InterfaceC20660615sy;
import X.InterfaceC835710WqP;
import X.InterfaceC835730WqR;
import X.InterfaceC851550Xar;
import Y.AfS188S0100000_19;
import Y.AfS33S0210000_13;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.ss.android.ugc.aweme.account.experiment.AccountGSMAExperiment;
import com.ss.android.ugc.aweme.account.experiment.AccountGSMAPhase2Experiment;
import com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.ss.android.ugc.aweme.account.login.v2.ui.AccountKeyBoardHelper;
import com.ss.android.ugc.aweme.account.login.v2.ui.experiment.SMSPermissionCheckboxExp;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.services.AlternativeNetworkService;
import com.ss.android.ugc.aweme.services.GSMAService;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class PhoneLoginFragment extends BaseI18nLoginFragment implements InterfaceC1238210iKJ, C10S5, InterfaceC20660615sy, InterfaceC1238810iLH, InterfaceC851550Xar {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJSA0ISHELIOStiP319PSxiLz0yLygpJzsgZhUkJiE2BCorICEVOiQrJCo9PA==";
    public C1238240iKM LLLIILIL;
    public View LLLIL;
    public LinearLayout LLLILZ;
    public boolean LLLILZLLLI;
    public boolean LLLIZZ;
    public boolean LLLJ;
    public C1238240iKM LLLLIIL;
    public DialogC1389620mGW LLLLIILLL;
    public boolean LLLILZJ = true;
    public final C01GW LLLJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 306));
    public final C01GW LLLJL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 307));
    public final C01GW LLLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 303));
    public final C01GW LLLLII = C452501pT.LIZIZ(new AwS563S0100000_19(this, 304));
    public final C01GW LLLLIIIILLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 308));
    public long LLLLIILL = -1;
    public final String LLLLIL = "phone";
    public final String LLLLILI = "phone_login";

    public final void YS() {
        String fullPhoneNumber;
        C851370XaZ c851370XaZLIZ;
        C1237220iIi c1237220iIi;
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.putBoolean("from_sms_login_only", false);
            arguments.putBoolean("need_show_gsma_text", false);
            arguments.putBoolean("is_gsma", false);
        }
        C1238240iKM c1238240iKM = this.LLLLIIL;
        if (c1238240iKM != null && (fullPhoneNumber = c1238240iKM.getFullPhoneNumber()) != null && (c851370XaZLIZ = C851360XaY.LIZ(getActivity(), fullPhoneNumber, EnumC852660Xce.LOGIN)) != null && (c1237220iIi = c851370XaZLIZ.LIZ) != null && c1237220iIi.LIZIZ()) {
            RS("", false, null);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (SMSPermissionCheckboxExp.INSTANCE.showCheckbox()) {
            linkedHashMap.put("query_sms_permission", "1");
        }
        C0XZ4 c0xz4 = C0XZ4.LIZ;
        C1238240iKM c1238240iKM2 = this.LLLLIIL;
        String strLIZ = PhoneNumberUtil.LIZ(c1238240iKM2 != null ? c1238240iKM2.getPhoneNumberObject() : null);
        EnumC852660Xce enumC852660Xce = EnumC852660Xce.LOGIN;
        EnumC852910Xd3 enumC852910Xd3 = EnumC852910Xd3.PHONE_SMS_LOGIN;
        c0xz4.getClass();
        C0XZ4.LJJIIZ(this, this, strLIZ, enumC852660Xce, enumC852910Xd3, "", "user_click", linkedHashMap).LJIIIIZZ(new AfS188S0100000_19(this, 17)).LJIILL();
    }

    @Override // X.C10S5
    public final String pO() {
        return "PhoneEmailLoginStep";
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final int sS() {
        return R.layout.a0m;
    }

    @Override // X.InterfaceC20660615sy
    public final boolean t2() {
        return true;
    }

    public final void NS() {
        EditText editText;
        C1238240iKM c1238240iKM;
        C1238240iKM c1238240iKM2 = this.LLLLIIL;
        if ((c1238240iKM2 != null ? c1238240iKM2.getPhoneNumber() : 0L) <= 0 && !this.LLLIZZ) {
            if (!C1238150iKD.LIZ()) {
                C832080WkY c832080WkY = (C832080WkY) this.LLLJIL.getValue();
                C1238240iKM c1238240iKM3 = this.LLLLIIL;
                c832080WkY.LLILLL = c1238240iKM3 != null ? c1238240iKM3.getEditText() : null;
                if (!c832080WkY.LLIZLLLIL) {
                    c832080WkY.LIZ(c832080WkY.LLILZ, "Feature cannot be used", false, c832080WkY.LLILZIL);
                } else if (c832080WkY.LL == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Failed to create GoogleApiClient, exception: ");
                    sbLIZ.append(C2210608lM.LIZ(c832080WkY.LLIZ));
                    c832080WkY.LIZ(c832080WkY.LLILZ, C2188811AlT.LIZIZ(sbLIZ), false, c832080WkY.LLILZIL);
                } else {
                    Fragment fragment = c832080WkY.LLILLJJLI;
                    if (fragment == null || !fragment.isAdded()) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Unexpected error occurred, fragment: ");
                        sbLIZ2.append(c832080WkY.LLILLJJLI);
                        c832080WkY.LIZ(c832080WkY.LLILZ, C2188811AlT.LIZIZ(sbLIZ2), false, c832080WkY.LLILZIL);
                    } else {
                        C1238160iKE c1238160iKE = new C1238160iKE();
                        C1238180iKG c1238180iKG = new C1238180iKG();
                        c1238180iKG.LIZ = true;
                        c1238160iKE.LIZJ = c1238180iKG.LIZ();
                        c1238160iKE.LIZ = true;
                        if (c1238160iKE.LIZIZ == null) {
                            c1238160iKE.LIZIZ = new String[0];
                        }
                        HintRequest hintRequest = new HintRequest(2, c1238160iKE.LIZJ, false, c1238160iKE.LIZ, c1238160iKE.LIZIZ, false, null, null);
                        C833680Wn8 c833680Wn8 = C833530Wmt.LIZJ;
                        C831920WkI c831920WkI = c832080WkY.LL;
                        c833680Wn8.getClass();
                        C0W3J.LJIIIZ(c831920WkI, "client must not be null");
                        C833910WnV c833910WnV = ((C833900WnU) c831920WkI.LJIIIIZZ(C833530Wmt.LJ)).LL;
                        Context context = c831920WkI.LJFF;
                        String strLIZ = c833910WnV.LLILLJJLI;
                        C0W3J.LJIIIZ(context, "context must not be null");
                        if (TextUtils.isEmpty(strLIZ)) {
                            strLIZ = C833580Wmy.LIZ();
                        } else {
                            C0W3J.LJIIIIZZ(strLIZ);
                        }
                        Intent intentPutExtra = new Intent("com.google.android.gms.auth.api.credentials.PICKER").setPackage("com.google.android.gms").putExtra("claimedCallingPackage", (String) null).putExtra("logSessionId", strLIZ);
                        Parcel parcelObtain = Parcel.obtain();
                        hintRequest.writeToParcel(parcelObtain, 0);
                        byte[] bArrMarshall = parcelObtain.marshall();
                        parcelObtain.recycle();
                        intentPutExtra.putExtra("com.google.android.gms.credentials.HintRequest", bArrMarshall);
                        try {
                            c832080WkY.LLILLJJLI.startIntentSenderForResult(PendingIntent.getActivity(context, 2000, intentPutExtra, C1238190iKH.LIZ | 134217728).getIntentSender(), LSPassThroughRecordSizeConfig.DEFAULT, null, 0, 0, 0, null);
                        } catch (IntentSender.SendIntentException e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("Error when calling startIntentSenderForResult: ");
                            sbLIZ3.append(C2210608lM.LIZ(e));
                            c832080WkY.LIZ(c832080WkY.LLILZ, C2188811AlT.LIZIZ(sbLIZ3), false, c832080WkY.LLILZIL);
                        }
                    }
                }
            } else if (C0C64.LJIILLIIL().LJIIZILJ(31744, 0, 1, "upgrade_phone_hint_helper_android", true) == 1 && (c1238240iKM = this.LLLLIIL) != null) {
                final C834200Wny c834200Wny = (C834200Wny) this.LLLJL.getValue();
                c834200Wny.LIZJ = c1238240iKM;
                if (!c834200Wny.LJFF) {
                    c834200Wny.LIZ("Feature cannot be used", false);
                } else if (c834200Wny.LIZ.isAdded()) {
                    GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest = new GetPhoneNumberHintIntentRequest(0);
                    C19EG activity = c834200Wny.LIZ.getActivity();
                    if (activity != null) {
                        C834010Wnf.LIZ(activity).LJ(getPhoneNumberHintIntentRequest).LJFF(new InterfaceC835710WqP() { // from class: X.0WpM
                            @Override // X.InterfaceC835710WqP
                            public final void onSuccess(Object obj) {
                                PendingIntent pendingIntent = (PendingIntent) obj;
                                try {
                                    Fragment fragment2 = c834200Wny.LIZ;
                                    IntentSender intentSender = pendingIntent.getIntentSender();
                                    c834200Wny.getClass();
                                    fragment2.startIntentSenderForResult(intentSender, 9999, null, 0, 0, 0, null);
                                } catch (IntentSender.SendIntentException e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                    C834200Wny c834200Wny2 = c834200Wny;
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append("Error when calling startIntentSenderForResult: ");
                                    sbLIZ4.append(e2);
                                    c834200Wny2.LIZ(C2188811AlT.LIZIZ(sbLIZ4), false);
                                }
                            }
                        }).LIZLLL(new InterfaceC835730WqR() { // from class: X.0WoM
                            @Override // X.InterfaceC835730WqR
                            public final void onFailure(Exception exc) {
                                C834200Wny c834200Wny2 = c834200Wny;
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("Error fetching phone number or pulling up dialog: ");
                                sbLIZ4.append(exc);
                                c834200Wny2.LIZ(C2188811AlT.LIZIZ(sbLIZ4), false);
                            }
                        });
                    }
                } else {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("Unexpected error occurred, fragment: ");
                    sbLIZ4.append(c834200Wny.LIZ);
                    c834200Wny.LIZ(C2188811AlT.LIZIZ(sbLIZ4), false);
                }
            }
        }
        this.LLLIZZ = true;
        C1238240iKM c1238240iKM4 = this.LLLLIIL;
        if (c1238240iKM4 == null || (editText = c1238240iKM4.getEditText()) == null) {
            return;
        }
        C1232150iAX.LIZ(editText);
    }

    public final C1238240iKM PS() {
        View viewFindViewById = this.LLLIILIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.qb1) : null;
            this.LLLIILIL = (C1238240iKM) viewFindViewById;
        }
        return (C1238240iKM) viewFindViewById;
    }

    public final boolean QS() {
        return ((Boolean) this.LLLLIIIILLL.getValue()).booleanValue();
    }

    public final boolean US() {
        return ((Boolean) this.LLLLII.getValue()).booleanValue();
    }

    public final boolean XS() {
        EditText editText;
        C1238240iKM c1238240iKM = this.LLLLIIL;
        return (c1238240iKM == null || (editText = c1238240iKM.getEditText()) == null || C1232150iAX.LIZJ(editText)) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C1237010iIN iS() {
        C1237010iIN c1237010iIN = new C1237010iIN(null, null, false, null, null, true, null, false, false, new C1237030iIP(null, C1236870iI9.LIZ(true), C1236870iI9.LIZIZ(true), null, 9), false, null, null, null, null, 66581758);
        if (US()) {
            c1237010iIN.LJIJI = new C1237030iIP(getString(2131830557), null, null, new AwS598S0100000_19(this, 89), 6);
        } else if (AccountGSMAPhase2Experiment.LIZIZ() && QS()) {
            c1237010iIN.LJIJI = new C1237030iIP(getString(2131824507), null, null, null, 14);
            return c1237010iIN;
        }
        return c1237010iIN;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final List<View> qS() {
        View viewFindViewById = this.LLLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.qas) : null;
            this.LLLILZ = (LinearLayout) viewFindViewById;
        }
        return Collections.singletonList(viewFindViewById);
    }

    @Override // X.InterfaceC1238810iLH
    public final void BM() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.putBoolean("gsma_available", false);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void HS() {
        C19EG activity;
        C197039127h c197039127h;
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getBoolean("from_sms_login_only") && !QS() && !US()) {
            C1238820iLI.LIZIZ(this);
            return;
        }
        C197039127h c197039127hNS = nS();
        if (c197039127hNS != null) {
            c197039127hNS.setLoading(true);
            if (QS()) {
                c197039127hNS.setEnabled(false);
            }
        }
        if (!AccountGSMAPhase2Experiment.LIZIZ() || !QS() || (activity = getActivity()) == null || (c197039127h = (C197039127h) activity.findViewById(R.id.fal)) == null) {
            return;
        }
        c197039127h.setLoading(true);
        c197039127h.setEnabled(false);
    }

    @Override // X.InterfaceC20658015sY
    public final boolean Xu() {
        return getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void aS() {
        C19EG activity;
        C197039127h c197039127h;
        C1238820iLI.LIZ(this);
        C197039127h c197039127hNS = nS();
        if (c197039127hNS != null) {
            c197039127hNS.setLoading(false);
            if (QS()) {
                c197039127hNS.setEnabled(XS());
            }
        }
        if (!AccountGSMAPhase2Experiment.LIZIZ() || !QS() || (activity = getActivity()) == null || (c197039127h = (C197039127h) activity.findViewById(R.id.fal)) == null) {
            return;
        }
        c197039127h.setLoading(false);
        c197039127h.setEnabled(XS());
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void clearFromXmlViewCache() {
        super.clearFromXmlViewCache();
        this.LLLIILIL = null;
        this.LLLIL = null;
        this.LLLILZ = null;
    }

    @Override // X.InterfaceC1238810iLH
    public final void ha() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.putBoolean("gsma_available", true);
        }
    }

    @Override // X.InterfaceC20658015sY
    public final C688120Qyw i2() {
        return new C688120Qyw(requireContext(), this, null);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        if (!US()) {
            AccountGSMAExperiment.LIZ.getClass();
            if (AccountGSMAExperiment.LIZIZ() || QS()) {
                GSMAService.INSTANCE.cancelJob();
            }
        }
        C1238240iKM c1238240iKM = this.LLLLIIL;
        KeyboardUtils.LIZIZ(c1238240iKM != null ? c1238240iKM.getEditText() : null);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(PhoneLoginFragment.class.getName());
        }
        super.onResume();
        VS(false);
        nS();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C1238240iKM c1238240iKM = this.LLLLIIL;
        if (c1238240iKM != null) {
            C01GW<Boolean> c01gw = AccountKeyBoardHelper.LLJ;
            if (C853750XeP.LIZ()) {
                C1232150iAX.LIZ(c1238240iKM.getEditText());
            } else {
                c1238240iKM.getEditText().requestFocus();
            }
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (!C1238150iKD.LIZ()) {
            ((C832080WkY) this.LLLJIL.getValue()).LIZLLL();
        }
        this.LLLJ = false;
    }

    @Override // X.InterfaceC1238810iLH
    public final void CQ() {
        C1238820iLI.LIZIZ(this);
    }

    @Override // X.InterfaceC1238810iLH
    public final DialogC1389620mGW Jz() {
        return this.LLLLIILLL;
    }

    @Override // X.InterfaceC1238810iLH
    public final void WP() {
        C1238820iLI.LIZ(this);
    }

    @Override // X.InterfaceC20658015sY
    public final String getSceneId() {
        return this.LLLLILI;
    }

    @Override // X.InterfaceC1238210iKJ
    public final boolean h1() {
        return this.LLLILZJ;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final String hS() {
        return this.LLLLIL;
    }

    public final void VS(boolean z) {
        C19EG activity;
        C197039127h c197039127h;
        C1238240iKM c1238240iKMPS = PS();
        if (c1238240iKMPS != null) {
            c1238240iKMPS.LIZ();
        }
        C197039127h c197039127hNS = nS();
        if (c197039127hNS != null) {
            c197039127hNS.setEnabled(XS());
        }
        if (AccountGSMAPhase2Experiment.LIZIZ() && QS() && (activity = getActivity()) != null && (c197039127h = (C197039127h) activity.findViewById(R.id.fal)) != null) {
            c197039127h.setEnabled(XS());
        }
        if (!this.LLLJ && z) {
            C853660XeG c853660XeG = C853660XeG.LIZ;
            String enterMethod = getEnterMethod();
            String enterFrom = getEnterFrom();
            String strPR = PR();
            String strRR = RR();
            c853660XeG.getClass();
            C853660XeG.LIZIZ(enterMethod, enterFrom, strPR, strRR, true);
            this.LLLJ = true;
            if (!US()) {
                AccountGSMAExperiment.LIZ.getClass();
                if (AccountGSMAExperiment.LIZJ() || QS()) {
                    AlternativeNetworkService.INSTANCE.preconnect(C1238990iLZ.LIZ);
                }
            }
        }
    }

    @Override // X.InterfaceC1238810iLH
    public final void kD(String str) {
        C19EG activity;
        Bundle arguments = getArguments();
        if (arguments != null) {
            C786410Ut5.LJJJI("gsma_fail_reason", str, arguments);
        }
        aS();
        if (QS() && !Intrinsics.LJFF(str, "quit") && (activity = getActivity()) != null) {
            GSMAService.INSTANCE.showGSMAFailureToast(activity);
        }
        YS();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        this.LLLLIILL = System.currentTimeMillis();
        super.onCreate(bundle);
        if (!C1238150iKD.LIZ()) {
            ((C832080WkY) this.LLLJIL.getValue()).LIZJ();
        }
    }

    @Override // X.InterfaceC1238810iLH
    public final void rC(DialogC1389620mGW dialogC1389620mGW) {
        this.LLLLIILLL = dialogC1389620mGW;
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/account/login/v2/ui/fragments/PhoneLoginFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owsk1PEpk5Z4F7WzzjzzRSEqAAj+xHbfPT2yRTKfhomOWIDsNg==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        if (z) {
            if (this.LLLF != null) {
                C0XWJ c0xwj = C0XWJ.LIZ;
                String strPR = PR();
                String str = this.LLLLIL;
                c0xwj.getClass();
                C0XWJ.LJIILJJIL(strPR, str);
            }
            if (isViewValid()) {
                NS();
            } else {
                this.LLLILZLLLI = true;
            }
        }
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(PhoneLoginFragment.class);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x02f4  */
    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instruction units count: 759
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneLoginFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.C0XYD
    public final void pn(int i, String str) {
        if (i == 1053) {
            PopupManager.LJIJI(new C0TS3(this, getActivity()), true);
        }
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getBoolean("from_sms_login_only") && !US()) {
            kD("auth_check_code_fail");
        } else {
            PS().LIZJ(str);
            aS();
        }
    }

    @Override // X.InterfaceC851550Xar
    public final void QK(EnumC852910Xd3 enumC852910Xd3, Bundle bundle, C851660Xb2 c851660Xb2) {
        C851590Xav.LIZ(enumC852910Xd3, bundle, c851660Xb2);
    }

    public final void RS(String str, boolean z, Boolean bool) {
        PhoneNumberUtil.PhoneNumber phoneNumberObject;
        PhoneNumberUtil.PhoneNumber phoneNumberObject2;
        if (this.LLLLIIL != null) {
            C19EG activity = getActivity();
            boolean z2 = false;
            if (activity != null && activity.isFinishing()) {
                return;
            }
            C1238240iKM c1238240iKM = this.LLLLIIL;
            if (c1238240iKM != null && (phoneNumberObject2 = c1238240iKM.getPhoneNumberObject()) != null) {
                C852810Xct.LIZ.getClass();
                C852810Xct.LJIJ(this, phoneNumberObject2);
            }
            Bundle arguments = getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putInt("current_page", EnumC852910Xd3.INPUT_PHONE_LOGIN.getValue());
            arguments.putInt("next_page", EnumC852910Xd3.PHONE_SMS_LOGIN.getValue());
            arguments.putInt("current_scene", EnumC852660Xce.LOGIN.getValue());
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                arguments2.getString("auto_fill_for_auto_test_sms", "");
            }
            if (SR() == EnumC852660Xce.RECOVER_ACCOUNT) {
                z2 = true;
            }
            arguments.putBoolean("recover_mobile_code", z2);
            arguments.putBoolean("code_sent", z);
            C1238240iKM c1238240iKM2 = this.LLLLIIL;
            if (c1238240iKM2 != null) {
                phoneNumberObject = c1238240iKM2.getPhoneNumberObject();
            } else {
                phoneNumberObject = null;
            }
            C786410Ut5.LJJIZ(arguments, "args_phone_number", phoneNumberObject);
            JS(arguments);
            if (bool != null) {
                arguments.putBoolean("is_register", !bool.booleanValue());
            }
            if (!TextUtils.isEmpty(str)) {
                C786410Ut5.LJJJI("has_sms_permission", str, arguments);
            }
            fo(arguments);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (!C1238150iKD.LIZ()) {
            ((C832080WkY) this.LLLJIL.getValue()).LIZIZ(i, i2, intent);
        } else {
            if (C0C64.LJIILLIIL().LJIIZILJ(31744, 0, 1, "upgrade_phone_hint_helper_android", true) != 1) {
                return;
            }
            ((C834200Wny) this.LLLJL.getValue()).LIZIZ(i, i2, intent);
        }
    }

    @Override // X.InterfaceC1238810iLH
    public final void yq(String str, boolean z, Boolean bool) {
        PhoneNumberUtil.PhoneNumber phoneNumberObject;
        C1238240iKM c1238240iKM = this.LLLLIIL;
        if (c1238240iKM != null) {
            phoneNumberObject = c1238240iKM.getPhoneNumberObject();
        } else {
            phoneNumberObject = null;
        }
        String strLIZ = PhoneNumberUtil.LIZ(phoneNumberObject);
        Bundle arguments = getArguments();
        if (arguments != null) {
            JS(arguments);
            C786410Ut5.LJJIZ(arguments, "args_phone_number", phoneNumberObject);
            arguments.putBoolean("from_sms_login_only", true);
            arguments.putInt("previous_page", EnumC852910Xd3.INPUT_PHONE_LOGIN.getValue());
            arguments.putInt("current_page", EnumC852910Xd3.PHONE_SMS_LOGIN.getValue());
            arguments.putBoolean("need_show_gsma_text", !z);
            arguments.putBoolean("is_gsma", true);
            arguments.remove("gsma_fail_reason");
        }
        C0XZ4 c0xz4 = C0XZ4.LIZ;
        boolean zLJFF = Intrinsics.LJFF(bool, Boolean.FALSE);
        EnumC852660Xce enumC852660Xce = EnumC852660Xce.LOGIN;
        EnumC852910Xd3 enumC852910Xd3 = EnumC852910Xd3.PHONE_SMS_LOGIN;
        Map<String, String> gSMAExtraMap = GSMAService.INSTANCE.getGSMAExtraMap();
        c0xz4.getClass();
        C0XZ4.LJIJJ(this, this, strLIZ, str, zLJFF, enumC852660Xce, enumC852910Xd3, gSMAExtraMap, null).LJIIIIZZ(new AfS33S0210000_13(phoneNumberObject, z, this, 0)).LJIILL();
    }
}
