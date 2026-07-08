package com.ss.android.ugc.aweme.setting;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C0C64;
import X.C0CLW;
import X.C0CQI;
import X.C0N6B;
import X.C0N6C;
import X.C0OM1;
import X.C0PEM;
import X.C0T3I;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C0XPY;
import X.C0XQ5;
import X.C0XQ7;
import X.C1057370dcd;
import X.C11NJ;
import X.C11S5;
import X.C1207404nw;
import X.C1235040iFC;
import X.C1235590iG5;
import X.C1237450iJ5;
import X.C1238220iKK;
import X.C1238550iKr;
import X.C1238560iKs;
import X.C1238600iKw;
import X.C1238610iKx;
import X.C1238650iL1;
import X.C1238660iL2;
import X.C1238690iL5;
import X.C1238730iL9;
import X.C1238740iLA;
import X.C1238750iLB;
import X.C1238760iLC;
import X.C1266240j3W;
import X.C1308910kAL;
import X.C1360520lVa;
import X.C1389890mGx;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1397620mTQ;
import X.C13BV;
import X.C13DV;
import X.C14EU;
import X.C1533950q1J;
import X.C15O7;
import X.C1697810uHb;
import X.C1697820uHc;
import X.C1701330uNH;
import X.C1701940uOG;
import X.C19292910dr;
import X.C19315910hZ;
import X.C19318810i2;
import X.C19319010i4;
import X.C19319110i5;
import X.C19319810iC;
import X.C19323610io;
import X.C1954807lC;
import X.C2026107wh;
import X.C20684815ws;
import X.C2174441A8c;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2201608ju;
import X.C2222691Bz1;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C255720A0k;
import X.C299020Bno;
import X.C316660CbA;
import X.C335910DEv;
import X.C340190DVh;
import X.C419910GdJ;
import X.C458801qU;
import X.C735800Ste;
import X.C786410Ut5;
import X.C852390XcD;
import X.C852610XcZ;
import X.C960203pA;
import X.DialogC1389620mGW;
import X.EnumC1059300dfk;
import X.EnumC1234990iF7;
import X.EnumC1235020iFA;
import X.EnumC1235110iFJ;
import X.EnumC1235120iFK;
import X.EnumC1235150iFN;
import X.EnumC1238570iKt;
import X.EnumC1238580iKu;
import X.EnumC335920DEw;
import X.EnumC852630Xcb;
import X.EnumC854510Xfd;
import X.InterfaceC1210900hcG;
import X.InterfaceC1238640iL0;
import X.InterfaceC2385309Wh;
import X.InterfaceC2661011f;
import X.InterfaceC586170Myt;
import X.InterfaceC852600XcY;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewOnClickListenerC2082208Ds;
import Y.ACListenerS138S0100000_3;
import Y.ACListenerS139S0100000_4;
import Y.ACListenerS147S0100000_12;
import Y.ACListenerS154S0100000_19;
import Y.ACListenerS78S1100000_3;
import Y.AObjectS120S0000000_19;
import Y.AObjectS362S0100000_19;
import Y.AObserverS182S0200000_19;
import Y.ARunnableS104S0100000_4;
import Y.ARunnableS119S0100000_19;
import Y.ARunnableS27S0400000_19;
import Y.ARunnableS52S0300000_19;
import Y.ARunnableS88S0200000_19;
import Y.AfS140S0000000_19;
import Y.AfS188S0100000_19;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.util.TypedValue;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LiveData;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IBindService;
import com.ss.android.ugc.aweme.ICredentialManagerService;
import com.ss.android.ugc.aweme.account.eventtracking.bindings.ExitUnlinkPhoneEmailConfirmPageEvent;
import com.ss.android.ugc.aweme.account.eventtracking.bindings.ExitUnlinkPhoneEmailPopupEvent;
import com.ss.android.ugc.aweme.account.eventtracking.bindings.ShowUnlinkPhoneEmailConfirmPageEvent;
import com.ss.android.ugc.aweme.account.eventtracking.bindings.ShowUnlinkPhoneEmailPopupEvent;
import com.ss.android.ugc.aweme.account.login.passkey.passkeyets.EnterSetPasskeyEvent;
import com.ss.android.ugc.aweme.account.model.SafeEnvData;
import com.ss.android.ugc.aweme.account.model.SafeEnvV2Response;
import com.ss.android.ugc.aweme.account.model.TwoStepVerifyWays;
import com.ss.android.ugc.aweme.account.model.VerificationMethod;
import com.ss.android.ugc.aweme.account.model.VerificationMethodType;
import com.ss.android.ugc.aweme.account.settings.LeakedPasswordNotificationModel;
import com.ss.android.ugc.aweme.account.ui.SmsConsentPageActivity;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.appdiff.ISettingsInternalAppDiffProtocol;
import com.ss.android.ugc.aweme.autofill.IAdAutofillService;
import com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionService;
import com.ss.android.ugc.aweme.commerce.BizAccountSwitchInfo;
import com.ss.android.ugc.aweme.commercialize.service.ICoinCloseCommerceSettings;
import com.ss.android.ugc.aweme.commercialize.tcm.depend.IBaBottomBannerInfo;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.service.ILanguageService;
import com.ss.android.ugc.aweme.profile.experiment.TikTokSellerSvcConfigSettings;
import com.ss.android.ugc.aweme.profile.model.ShopTab;
import com.ss.android.ugc.aweme.profile.model.TabSetting;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;
import com.ss.android.ugc.aweme.setting.api.RegionStatusApi;
import com.ss.android.ugc.aweme.setting.model.DoBStatus;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS121S1100000_7;
import kotlin.jvm.internal.AwS133S1100000_19;
import kotlin.jvm.internal.AwS385S0200000_19;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes20.dex */
public class I18nSettingManageMyAccountActivity extends BaseActivity implements WeakHandler.IHandler {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpPTs6JiJiAHHELIOS5rJhYpPTs6JiIBKCEyLyABMA4wKyo5JzsSKzElPyYnMQ==";
    public User LL;
    public boolean LLILLJJLI;
    public AccountAttributesData LLILLL;
    public boolean LLILZ;
    public int LLILZIL;
    public DoBStatus LLILZLL = new DoBStatus();
    public boolean LLIZ = false;
    public boolean LLIZLLLIL = false;
    public boolean LLJ = false;
    public String LLJI = "";
    public String LLJIJIL = "";
    public long LLJILJIL;
    public C1238760iLC LLJILJILJ;
    public C1238760iLC LLJILLL;
    public C1238760iLC LLJJ;
    public C1238760iLC LLJJI;
    public C1238760iLC LLJJIII;
    public C1238760iLC LLJJIJI;
    public C1238760iLC LLJJIJIIJIL;
    public C1238760iLC LLJJIJIL;
    public C1238760iLC LLJJJ;
    public C1238760iLC LLJJJIL;
    public DialogC1389620mGW LLJJJJ;
    public C1238550iKr LLJJJJJIL;
    public C1235040iFC LLJJJJLIIL;
    public WeakHandler LLJJL;
    public final C11NJ LLJJLIIIJLLLLLLLZ;
    public C19318810i2 LLJL;
    public C19319110i5 LLJLIL;
    public C1238760iLC LLJLILLLLZIIL;
    public C19292910dr LLJLL;
    public C19319810iC LLJLLIL;
    public C1238760iLC LLJLLL;
    public C19292910dr LLJZ;
    public C19319810iC LLJZIJLIL;
    public C1238760iLC LLL;
    public C1238760iLC LLLF;
    public C1238600iKw LLLFF;
    public boolean LLLFFI;
    public String LLLFZ;
    public TuxIconView LLLI;
    public TuxTextView LLLII;
    public String LLLIIII;
    public String LLLIIIIL;
    public boolean LLLIIIL;
    public final int LLLIIL;
    public final int LLLIILIL;

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void LJIIL() {
        DialogC1389620mGW dialogC1389620mGW = this.LLJJJJ;
        if (dialogC1389620mGW == null || !dialogC1389620mGW.isShowing()) {
            return;
        }
        C786410Ut5.LJIIJ(this.LLJJJJ);
    }

    public final void LLLLZLL() {
        String str;
        boolean z;
        if (this.LLLIIIL) {
            Bundle bundle = new Bundle();
            AccountAttributesData accountAttributesData = this.LLILLL;
            boolean z2 = false;
            if (accountAttributesData == null || !accountAttributesData.passkeyExists) {
                z = false;
                if (accountAttributesData != null) {
                }
                bundle.putBoolean("SHOW_CREATE_PASSKEY", !z);
                bundle.putBoolean("HAS_PASSWORD", z2);
                str = "settings_page";
                C786410Ut5.LJJJI("enter_from", "settings_page", bundle);
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this, "//account/passkey/management");
                smartRouteBuildRoute.withParam(bundle);
                smartRouteBuildRoute.open();
            } else {
                z = true;
            }
            if (accountAttributesData.passwordExists) {
                z2 = true;
            }
            bundle.putBoolean("SHOW_CREATE_PASSKEY", !z);
            bundle.putBoolean("HAS_PASSWORD", z2);
            str = "settings_page";
            C786410Ut5.LJJJI("enter_from", "settings_page", bundle);
            SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(this, "//account/passkey/management");
            smartRouteBuildRoute2.withParam(bundle);
            smartRouteBuildRoute2.open();
        } else {
            ICredentialManagerService iCredentialManagerService = (ICredentialManagerService) PluggableExtentionKt.pluggableSpi(ICredentialManagerService.class);
            if (iCredentialManagerService != null) {
                iCredentialManagerService.LIZIZ(this);
            }
            str = "account_page";
        }
        EnterSetPasskeyEvent enterSetPasskeyEvent = new EnterSetPasskeyEvent();
        enterSetPasskeyEvent.LJI(str, "enter_from");
        enterSetPasskeyEvent.LJI("click", "enter_method");
        enterSetPasskeyEvent.LJIIIIZZ();
    }

    public final void LLLLZLLIL() {
        C20684815ws.onEventV3("manage_account_password_click");
        this.LLILZ = true;
        String str = this.LLLIIIL ? "settings_page" : this.LLLIIII;
        Bundle bundle = new Bundle();
        bundle.putBoolean("have_set_password", this.LLILLJJLI);
        C786410Ut5.LJJJI("purpose", "security", bundle);
        C0XQ7.LJ();
        C0XQ7.LIZ.LJIIJJI().changePassword(this, str, "password_click", bundle, null);
    }

    public final void LLLZIL() {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this, "//main");
        smartRouteBuildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
        smartRouteBuildRoute.addFlags(67108864);
        smartRouteBuildRoute.addFlags(268435456);
        smartRouteBuildRoute.open();
    }

    public final void LLZZZIL() {
        User user = this.LL;
        if (user == null || user.getBindPhone() == null) {
            return;
        }
        this.LLLFZ = this.LL.getBindPhone();
        String bindPhone = this.LL.getBindPhone();
        C1360520lVa c1360520lVa = new C1360520lVa();
        c1360520lVa.LIZLLL(bindPhone);
        this.LLJILLL.LJIIIIZZ(c1360520lVa.LIZ.toString());
    }

    public final void l() {
        if (this.LLJLILLLLZIIL == null) {
            return;
        }
        if (((IAdAutofillService) ServiceManager.get().getService(IAdAutofillService.class)).LJIIJ()) {
            this.LLJLILLLLZIIL.LJIIIIZZ(getString(2131829473));
        } else {
            this.LLJLILLLLZIIL.LJIIIIZZ("");
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() throws Throwable {
        ComponentActivity componentActivity;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity", "onResume", true);
        super.onResume();
        if (this.LLIZ) {
            l();
            if (!C255720A0k.LIZ() && ((IAdAutofillService) ServiceManager.get().getService(IAdAutofillService.class)).LJIIJJI() && this.LLIZ) {
                this.LLL.LJIIIZ(((IAdAutofillService) ServiceManager.get().getService(IAdAutofillService.class)).LJIJ());
                this.LLJLLL.LJIIIZ(((IAdAutofillService) ServiceManager.get().getService(IAdAutofillService.class)).LJIL());
            }
        } else {
            if (this.LLLIIIL) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2201608ju(new AObjectS362S0100000_19(this, 5), null), 3);
            } else {
                C0XQ7.LJFF();
                AbstractC848400XPy.LJJIJIIJI(new C0T3I() { // from class: X.0iKy
                    @Override // X.C0T3I
                    public final void onUpdateFailed(String str) {
                    }

                    @Override // X.C0T3I
                    public final void onUpdateSuccess(boolean z) {
                        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = this.LIZ;
                        Boolean boolValueOf = Boolean.valueOf(z);
                        i18nSettingManageMyAccountActivity.getClass();
                        i18nSettingManageMyAccountActivity.LLILLJJLI = boolValueOf.booleanValue();
                        SharePrefCache.inst().getUserHasPassword().LJ(Boolean.valueOf(i18nSettingManageMyAccountActivity.LLILLJJLI));
                    }
                });
            }
            C1238550iKr c1238550iKr = this.LLJJJJJIL;
            if (c1238550iKr.LJ) {
                c1238550iKr.LIZ("unknown");
                c1238550iKr.LIZIZ.LJFF(true);
                InterfaceC1238640iL0.LIZ.getClass();
                InterfaceC2661011f interfaceC2661011fLIZ = C1238650iL1.LIZIZ.LIZ(C458801qU.LIZ);
                (interfaceC2661011fLIZ != null ? (InterfaceC1238640iL0) interfaceC2661011fLIZ.create(InterfaceC1238640iL0.class) : null).LIZ().LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new C1266240j3W(c1238550iKr, 1));
            } else {
                c1238550iKr.LIZIZ.LJFF(false);
            }
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("I18nSettingManageMyAccountActivity.onResume(updateUi: ");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(",  phone: ");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", needSmsConsent: ");
        sbLIZ.append(this.LLLFFI);
        sbLIZ.append(")");
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LLILZ) {
            this.LLILZ = false;
            f();
            if (this.LLIZ) {
                LLZZLLIL(this.LL);
                boolean z = this.LLLFZ != null ? !r4.equals(this.LL.getBindPhone()) : this.LL.getBindPhone() != null;
                LLZZZIL();
                int i2 = this.LLILZIL;
                if (i2 > 0) {
                    String str = i2 != 1 ? i2 != 2 ? "" : "change_phone" : "bind_phone";
                    this.LLILZIL = 0;
                    if (z && this.LLLFFI && this.LL.getBindPhone() != null) {
                        String bindPhone = this.LL.getBindPhone();
                        if (C0C64.LJIILLIIL().LJIIIZ(31744, "show_sms_consent_after_bind_phone", true, false)) {
                            Keva keva = C1235590iG5.LIZ;
                            if (keva.getInt("sms_consent_show_times", 0) < 5 && System.currentTimeMillis() - keva.getLong("sms_consent_last_show_time", 0L) >= 86400000 && str.length() != 0 && C1238220iKK.LIZIZ.contains(str)) {
                                Intent intent = new Intent(this, (Class<?>) SmsConsentPageActivity.class);
                                intent.putExtra("enter_from", str);
                                intent.putExtra("phone_number", bindPhone);
                                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(this, intent, "Activity_startActivityForResult_2");
                                C1701330uNH.LIZ(intent, this);
                                C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owsk1PEpk5Z4Iqqhn3Bh2RtIgbPoBkwg2a4/Qvc=", null);
                                C0WST c0wst = new C0WST();
                                int iIntValue = 11;
                                Object[] objArr = {intent, 11};
                                C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;I)V", c0wzx);
                                C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11094, "com/bytedance/ies/foundation/activity/BaseActivity", "startActivityForResult", this, objArr, "void", c0wzw);
                                if (c0wsuLIZIZ.LIZ) {
                                    c0wst.LIZ(11094, "com/bytedance/ies/foundation/activity/BaseActivity", "startActivityForResult", null, objArr, this, c0wzw, false);
                                } else {
                                    Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                                    if (objArr2 != null) {
                                        Object obj = objArr2[0];
                                        componentActivity = obj != null ? (ComponentActivity) obj : this;
                                        Object obj2 = objArr2[1];
                                        if (obj2 != null) {
                                            intent = (Intent) obj2;
                                        }
                                        Object obj3 = objArr2[2];
                                        if (obj3 != null) {
                                            iIntValue = ((Integer) obj3).intValue();
                                        }
                                    } else {
                                        componentActivity = this;
                                    }
                                    componentActivity.startActivityForResult(intent, iIntValue);
                                    c0wst.LIZ(11094, "com/bytedance/ies/foundation/activity/BaseActivity", "startActivityForResult", null, objArr, componentActivity, c0wzw, true);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!this.LLJ && this.LLIZ) {
            this.LLJILJIL = System.currentTimeMillis();
            if (C1207404nw.LIZ()) {
                IPNSChangeRegionService iPNSChangeRegionService = (IPNSChangeRegionService) PluggableExtentionKt.pluggableSpi(IPNSChangeRegionService.class);
                if (iPNSChangeRegionService != null) {
                    iPNSChangeRegionService.LIZIZ();
                }
            } else {
                RegionStatusApi.LIZ.getClass();
                this.LLJJLIIIJLLLLLLLZ.LIZ(C0CQI.LIZIZ.getRegionStatus().LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS188S0100000_19(this, 3), new AfS140S0000000_19(0)));
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity", "onResume", false);
    }

    public I18nSettingManageMyAccountActivity() {
        new C11NJ();
        this.LLJILJIL = 0L;
        this.LLJJLIIIJLLLLLLLZ = new C11NJ();
        this.LLLFFI = false;
        this.LLLFZ = "";
        this.LLLIIL = 52;
        this.LLLIILIL = 41;
    }

    public final void LLLZLZ() {
        String string = getString(2131826947);
        C786410Ut5.p2(new SpannableString(string), new StyleSpan(1), 0, string.length(), 33);
        String string2 = getString(2131826946);
        if (((IAdAutofillService) ServiceManager.get().getService(IAdAutofillService.class)).LJIIJJI()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(getString(2131826937));
            sbLIZ.append(getString(2131826939));
            string2 = C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(" ");
        sbLIZ2.append(getString(2131826945));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        int length = string2.length() - 1;
        int length2 = string2.length() + strLIZIZ.length();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(string2);
        sbLIZ3.append(strLIZIZ);
        SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ3));
        C786410Ut5.p2(spannableString, new ClickableSpan() { // from class: X.0dwG
            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                IAdAutofillService iAdAutofillService = (IAdAutofillService) PluggableExtentionKt.pluggableSpi(IAdAutofillService.class);
                if (iAdAutofillService != null) {
                    iAdAutofillService.LIZJ(view.getContext(), "user_information_page", "");
                }
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                textPaint.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
                textPaint.setUnderlineText(false);
            }
        }, length + 1, length2, 33);
        if (((IAdAutofillService) ServiceManager.get().getService(IAdAutofillService.class)).LJII()) {
            this.LLJLIL = LLLZ(string, spannableString, Boolean.FALSE);
        } else {
            this.LLJLIL = LLLZ(string, string2, Boolean.FALSE);
        }
        this.LLJL.LIZ(this.LLJLIL);
    }

    public final void f() {
        this.LL = C0XQ7.LJFF().getCurUser();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (!this.LLIZ) {
            ComplianceServiceProvider.LIZLLL().LJIILL(null);
        }
        this.LLJJJJLIIL.LIZ.LJ();
        this.LLJJJJJIL.LJFF.LJ();
        EventBus.LIZLLL().LJJI(this);
        this.LLJJL = null;
        this.LLJJLIIIJLLLLLLLZ.dispose();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    public static void LLZLI(int i) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "age_edit_page");
        c2344009Gk.LIZJ(i, "user_age_status");
        C20684815ws.LJIILLIIL("click_manage_account_birthday_edit", c2344009Gk.LIZ);
    }

    public final void LLLLZI(final boolean z) {
        EnumC852630Xcb enumC852630Xcb;
        runOnUiThread(new ARunnableS104S0100000_4((Object) this, 2));
        if (z) {
            enumC852630Xcb = EnumC852630Xcb.CHANGE_MOBILE;
        } else {
            enumC852630Xcb = EnumC852630Xcb.CHANGE_EMAIL;
        }
        InterfaceC852600XcY.LIZ.getClass();
        C852610XcZ.LIZ(enumC852630Xcb).LJ(new InterfaceC2385309Wh() { // from class: X.0iEs
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o7) {
                I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = this.LIZ;
                boolean z2 = z;
                String str = I18nSettingManageMyAccountActivity._pnsPageId;
                i18nSettingManageMyAccountActivity.getClass();
                C1C7U.LIZ("I18nSettingManageMyAccountActivity@7df8.attemptChangeBindings$1L");
                if (!C09UZ.LIZLLL(c15o7) || ((SafeEnvV2Response) c15o7.LJIIL()).data == null || (((SafeEnvV2Response) c15o7.LJIIL()).data.errorCode != 0 && ((SafeEnvV2Response) c15o7.LJIIL()).data.errorCode != 2029)) {
                    if (((SafeEnvV2Response) c15o7.LJIIL()).data.errorCode != 2135) {
                        C1389890mGx c1389890mGx = new C1389890mGx(i18nSettingManageMyAccountActivity);
                        c1389890mGx.LJIIIZ(2131835079);
                        c1389890mGx.LJIIJJI();
                    }
                } else {
                    SafeEnvData safeEnvData = ((SafeEnvV2Response) c15o7.LJIIL()).data;
                    boolean zLLZ = I18nSettingManageMyAccountActivity.LLZ(safeEnvData.twoStepVerifyWays, z2);
                    boolean z3 = safeEnvData.safe;
                    Bundle bundle = new Bundle();
                    C786410Ut5.LJJJI("enter_method", "normal", bundle);
                    bundle.putBoolean("is_safe_env", z3);
                    C786410Ut5.LJJJI("passport_ticket", safeEnvData.passportTicket, bundle);
                    bundle.putBoolean("is_changing", true);
                    ArrayList<VerificationMethodType> arrayList = new ArrayList<>();
                    if (safeEnvData.eligibleVerificationMethods != null) {
                        arrayList.addAll(safeEnvData.LIZ());
                    }
                    if (z3) {
                        if (zLLZ) {
                            i18nSettingManageMyAccountActivity.g(z2, true, arrayList, bundle);
                        } else if (z2) {
                            i18nSettingManageMyAccountActivity.runOnUiThread(new ARunnableS88S0200000_19(i18nSettingManageMyAccountActivity, bundle, 1));
                        } else {
                            i18nSettingManageMyAccountActivity.runOnUiThread(new ARunnableS88S0200000_19(i18nSettingManageMyAccountActivity, bundle, 0));
                        }
                    } else if (zLLZ) {
                        i18nSettingManageMyAccountActivity.g(z2, false, arrayList, bundle);
                    } else {
                        i18nSettingManageMyAccountActivity.n(z2, arrayList, bundle);
                    }
                }
                i18nSettingManageMyAccountActivity.runOnUiThread(new ARunnableS119S0100000_19(i18nSettingManageMyAccountActivity, 8));
                C1C7U.LIZIZ("I18nSettingManageMyAccountActivity@7df8.attemptChangeBindings$1L");
                return null;
            }
        }, C15O7.LJIIIIZZ, null);
    }

    public final void LLLLZIL(final boolean z) {
        EnumC852630Xcb enumC852630Xcb;
        if (z) {
            enumC852630Xcb = EnumC852630Xcb.UNBIND_MOBILE;
        } else {
            enumC852630Xcb = EnumC852630Xcb.UNBIND_EMAIL;
        }
        runOnUiThread(new ARunnableS104S0100000_4((Object) this, 2));
        InterfaceC852600XcY.LIZ.getClass();
        C852610XcZ.LIZ(enumC852630Xcb).LJ(new InterfaceC2385309Wh() { // from class: X.0iF6
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o7) {
                List<VerificationMethod> list;
                int i;
                I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = this.LIZ;
                boolean z2 = z;
                String str = I18nSettingManageMyAccountActivity._pnsPageId;
                i18nSettingManageMyAccountActivity.getClass();
                C1C7U.LIZ("I18nSettingManageMyAccountActivity@7df8.attemptUnlinkBinding$1L");
                if (!C09UZ.LIZLLL(c15o7) || ((SafeEnvV2Response) c15o7.LJIIL()).data == null || (((SafeEnvV2Response) c15o7.LJIIL()).data.errorCode != 0 && ((SafeEnvV2Response) c15o7.LJIIL()).data.errorCode != 2029)) {
                    if (((SafeEnvV2Response) c15o7.LJIIL()).data.errorCode != 2135) {
                        C1389890mGx c1389890mGx = new C1389890mGx(i18nSettingManageMyAccountActivity);
                        c1389890mGx.LJIIIZ(2131835079);
                        c1389890mGx.LJIIJJI();
                    }
                    i18nSettingManageMyAccountActivity.LLZLLLL(z2, EnumC1235020iFA.UNLINK, EnumC1234990iF7.UNKNOWN);
                } else {
                    i18nSettingManageMyAccountActivity.LLILZ = true;
                    SafeEnvData safeEnvData = ((SafeEnvV2Response) c15o7.LJIIL()).data;
                    C854460XfY.LIZ.getClass();
                    boolean zLJIIZILJ = C854460XfY.LJIIZILJ(z2);
                    boolean z3 = safeEnvData.safe;
                    Bundle bundle = new Bundle();
                    C786410Ut5.LJJJI("enter_method", "normal", bundle);
                    bundle.putBoolean("is_safe_env", z3);
                    if (safeEnvData.eligibleVerificationMethods != null) {
                        ArrayList arrayList = new ArrayList();
                        Iterator<VerificationMethod> it2 = safeEnvData.eligibleVerificationMethods.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(it2.next().type);
                        }
                        C786410Ut5.LJJIZ(bundle, "eligible_verification_methods", arrayList);
                    }
                    C786410Ut5.LJJJI("passport_ticket", safeEnvData.passportTicket, bundle);
                    bundle.putBoolean("is_2sv_env", I18nSettingManageMyAccountActivity.LLZ(safeEnvData.twoStepVerifyWays, z2));
                    if (!z3 ? !zLJIIZILJ || (list = safeEnvData.eligibleVerificationMethods) == null || list.isEmpty() : !zLJIIZILJ) {
                        i18nSettingManageMyAccountActivity.LLZLLLL(z2, EnumC1235020iFA.UNLINK, EnumC1234990iF7.DIGITAL_3);
                        if (z2) {
                            i = 2131827407;
                        } else {
                            i = 2131827405;
                        }
                        i18nSettingManageMyAccountActivity.bu(i18nSettingManageMyAccountActivity.getString(i));
                    } else {
                        i18nSettingManageMyAccountActivity.LLZLLLL(z2, EnumC1235020iFA.UNLINK, EnumC1234990iF7.DIGITAL_1);
                        if (z2) {
                            IBindService iBindServiceLIZ = C0XQ7.LIZ();
                            C854460XfY.LIZ.getClass();
                            iBindServiceLIZ.unbindPhoneV2(i18nSettingManageMyAccountActivity, C854460XfY.LJ(true), C0N6C.MANAGE_MY_ACCOUNT.getValue(), z3, bundle);
                        } else {
                            IBindService iBindServiceLIZ2 = C0XQ7.LIZ();
                            boolean zIsEmailVerified = i18nSettingManageMyAccountActivity.LL.isEmailVerified();
                            C854460XfY.LIZ.getClass();
                            iBindServiceLIZ2.unbindEmailV2(i18nSettingManageMyAccountActivity, zIsEmailVerified, C854460XfY.LJ(false), C0N6C.MANAGE_MY_ACCOUNT.getValue(), z3, bundle);
                        }
                    }
                }
                i18nSettingManageMyAccountActivity.runOnUiThread(new ARunnableS119S0100000_19(i18nSettingManageMyAccountActivity, 8));
                C1C7U.LIZIZ("I18nSettingManageMyAccountActivity@7df8.attemptUnlinkBinding$1L");
                return null;
            }
        }, C15O7.LJIIIIZZ, null);
    }

    public final String LLLLZLLLI(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ROOT);
        try {
            List<InterfaceC586170Myt> list = C0XQ5.LIZ;
            return DateFormat.getDateInstance(1, new Locale(((ILanguageService) C0XPY.LIZIZ(ILanguageService.class)).getAppLanguage(), C2222691Bz1.LIZ())).format(simpleDateFormat.parse(str));
        } catch (ParseException e) {
            TryCatchGuardChecker.doCheck(e);
            return getString(2131824780);
        }
    }

    public final void LLLZZIL(Bundle bundle) {
        AccountUserService accountUserServiceLJIIJ;
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        LeakedPasswordNotificationModel leakedPasswordNotificationModel = C852390XcD.LIZ;
        LeakedPasswordNotificationModel leakedPasswordNotificationModel2 = (LeakedPasswordNotificationModel) settingsManagerLIZLLL.LJIIIIZZ("leaked_pw_notification_config_android", LeakedPasswordNotificationModel.class, leakedPasswordNotificationModel);
        if (leakedPasswordNotificationModel2 != null) {
            leakedPasswordNotificationModel = leakedPasswordNotificationModel2;
        }
        if (!leakedPasswordNotificationModel.enabled) {
            LLLZIL();
        }
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi(IAccountService.class);
        if (iAccountService == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null) {
            return;
        }
        String string = bundle.getString("username");
        if (!accountUserServiceLJIIJ.isLogin()) {
            C19315910hZ.LIZ.getClass();
            if (C19315910hZ.LIZ() && string != null) {
                C1238690iL5.LIZ.getClass();
                C01GW c01gw = C1238690iL5.LIZIZ;
                ((Keva) c01gw.getValue()).storeString("username", string);
                ((Keva) c01gw.getValue()).storeBoolean("show_on_login", true);
            }
            LLLZIL();
            return;
        }
        if (!accountUserServiceLJIIJ.getCurUserId().equals(bundle.getString("uid"))) {
            if (string == null) {
                return;
            }
            C1238690iL5.LIZ.getClass();
            C1238690iL5.LIZ(this, string);
            return;
        }
        String string2 = bundle.getString("android_route");
        if (string2 == null) {
            return;
        }
        String string3 = bundle.getString("enter_from");
        if (string3 == null) {
            string3 = "settings_page";
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this, string2);
        smartRouteBuildRoute.withParam("enter_from", string3);
        smartRouteBuildRoute.open();
    }

    public final void LLZZ(boolean z) {
        EnumC1235120iFK enumC1235120iFK;
        EnumC854510Xfd enumC854510Xfd;
        ShowUnlinkPhoneEmailPopupEvent showUnlinkPhoneEmailPopupEvent = new ShowUnlinkPhoneEmailPopupEvent();
        if (z) {
            enumC1235120iFK = EnumC1235120iFK.NULL;
        } else if (this.LL.isEmailVerified()) {
            enumC1235120iFK = EnumC1235120iFK.DIGITAL_1;
        } else {
            enumC1235120iFK = EnumC1235120iFK.DIGITAL_0;
        }
        showUnlinkPhoneEmailPopupEvent.LJI(enumC1235120iFK.getValue(), "is_email_verified");
        showUnlinkPhoneEmailPopupEvent.LJI(C0N6C.MANAGE_MY_ACCOUNT.getValue(), "enter_from");
        if (z) {
            enumC854510Xfd = EnumC854510Xfd.PHONE;
        } else {
            enumC854510Xfd = EnumC854510Xfd.EMAIL;
        }
        showUnlinkPhoneEmailPopupEvent.LJI(enumC854510Xfd.getValue(), "unlink_type");
        showUnlinkPhoneEmailPopupEvent.LJIIIIZZ();
    }

    public final void LLZZLLIL(User user) {
        if (C0CLW.LIZIZ.LIZ.getEnableEmailVerification().intValue() != 1) {
            this.LLJJJ.LJFF(false);
            return;
        }
        this.LLJJJ.LJFF(true);
        String email = user.getEmail();
        if (TextUtils.isEmpty(email)) {
            this.LLLII.setText(email);
            this.LLJJJ.LJI(new AwS133S1100000_19(this.LLLII, (String) null, 20));
        } else if (user.isEmailVerified()) {
            this.LLLII.setText(email);
            this.LLJJJ.LJI(new AwS133S1100000_19(this.LLLII, (String) null, 20));
        } else {
            this.LLJJJ.LJI(new AwS133S1100000_19(this.LLLI, getString(2131857910, user.getEmail()), 20));
        }
    }

    public final void bu(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(this);
        c1389890mGx.LJIIJ(str);
        c1389890mGx.LJIIJJI();
    }

    public void exit(View view) {
        finish();
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        if (message.what == 112 && (HandlerHook.getMessageObj(message.obj) instanceof User)) {
            C0XQ7.LJFF().LJIL((User) HandlerHook.getMessageObj(message.obj));
            f();
        }
    }

    public final void i(boolean z) {
        f();
        if (this.LL == null) {
            return;
        }
        this.LLJJIJIIJIL.LJFF(false);
        this.LLJJIJIL.LJFF(false);
        ICoinCloseCommerceSettings iCoinCloseCommerceSettings = (ICoinCloseCommerceSettings) C1057370dcd.LIZ.getValue();
        if (iCoinCloseCommerceSettings != null) {
            iCoinCloseCommerceSettings.LIZIZ();
        }
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "disable_account_switch_in_setting", true, false)) {
            if (this.LL.getAccountType() != 0 && !z) {
                if (this.LL.getAccountType() == 3) {
                    this.LLJJIJIIJIL.LJFF(true);
                    return;
                } else {
                    if (this.LL.getAccountType() != 2) {
                        return;
                    }
                    this.LLJJIJIIJIL.LJFF(true);
                    this.LLJJIJIL.LJFF(true);
                    return;
                }
            }
            this.LLJJIJIL.LJFF(true);
        }
    }

    /* JADX WARN: Type inference failed for: r13v13, types: [X.08Ds] */
    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        String stringExtra2;
        boolean z;
        String stringExtra3;
        List<EnumC1238580iKu> listLJIIJJI;
        C1238760iLC c1238760iLC;
        IPNSChangeRegionService iPNSChangeRegionService;
        String string;
        String str;
        String str2;
        String str3;
        C1238760iLC c1238760iLCLIZ;
        TikTokSellerSvcConfigSettings.EcomTtsSvcConfig ecomTtsSvcConfig;
        ShopTab shopTab;
        boolean zBooleanValue;
        String string2;
        String string3;
        boolean zLJI = MethodIDManager.LJI(202405);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity", "onCreate", true);
        activityConfiguration(new AObjectS120S0000000_19(0));
        super.onCreate(bundle);
        this.LLIZ = getIntent().getBooleanExtra("IS_ACCOUNT_INFO", false);
        this.LLIZLLLIL = getIntent().getBooleanExtra("is_from_prompt", false);
        try {
            stringExtra = getIntent().getStringExtra("enter_from");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        this.LLLIIII = stringExtra;
        if (!getIntent().hasExtra("enter_method")) {
            stringExtra2 = "";
        } else {
            try {
                stringExtra2 = getIntent().getStringExtra("enter_method");
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                stringExtra2 = null;
            }
        }
        this.LLLIIIIL = stringExtra2;
        ICredentialManagerService iCredentialManagerService = (ICredentialManagerService) PluggableExtentionKt.pluggableSpi(ICredentialManagerService.class);
        if (iCredentialManagerService != null && iCredentialManagerService.LJIIL()) {
            z = true;
        } else {
            z = false;
        }
        this.LLLIIIL = z;
        if (TextUtils.isEmpty(this.LLLIIII)) {
            this.LLLIIII = "manage_my_account";
        } else if (this.LLIZLLLIL) {
            if (!getIntent().hasExtra("enter_from")) {
                stringExtra3 = "";
            } else {
                try {
                    stringExtra3 = getIntent().getStringExtra("enter_from");
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    stringExtra3 = null;
                }
            }
            this.LLLIIII = stringExtra3;
        }
        supportRequestWindowFeature(10);
        setTheme(R.style.my);
        setContentView(R.layout.f6_);
        if (getIntent().getSerializableExtra("dob_status") != null) {
            this.LLILZLL = (DoBStatus) getIntent().getSerializableExtra("dob_status");
        }
        this.LLJJL = new WeakHandler(getMainLooper(), this);
        EventBus.LIZLLL().LJIJJ(this);
        ((AbstractC848400XPy) C0XQ7.LJFF()).LJJII(this.LLJJL);
        this.LLJL = new C19318810i2((ViewOnAttachStateChangeListenerC20604515jv) findViewById(R.id.rn0));
        f();
        this.LLJJJJJIL = new C1238550iKr(this);
        this.LLLFF = new C1238600iKw(this);
        if (!C255720A0k.LIZ() && ((((IAdAutofillService) ServiceManager.get().getService(IAdAutofillService.class)).autofillEnable() || ((IAdAutofillService) ServiceManager.get().getService(IAdAutofillService.class)).LJIIJJI()) && this.LLIZ)) {
            this.LLJL.LIZ(LLLZ(getString(2131858026), null, Boolean.TRUE));
        }
        if (!this.LLIZ) {
            C1238600iKw c1238600iKw = this.LLLFF;
            c1238600iKw.getClass();
            ISettingsInternalAppDiffProtocol.LIZ.getClass();
            C1238660iL2.LIZIZ.LIZ();
            List<EnumC1238570iKt> listLJIIJJI2 = C13BV.INSTANCE;
            if (!(!listLJIIJJI2.isEmpty())) {
                if (c1238600iKw.LIZIZ) {
                    C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
                    c13dvLIZIZ.add(EnumC1238570iKt.ACCOUNT_USER_INFO);
                    c13dvLIZIZ.add(EnumC1238570iKt.CREATOR_VERIFICATION);
                    SettingsManager.LIZLLL().getClass();
                    if (SettingsManager.LJI("external_account_benefits_link", "").length() > 0) {
                        c13dvLIZIZ.add(EnumC1238570iKt.EXTERNAL_ACCOUNTS);
                    }
                    c13dvLIZIZ.add(EnumC1238570iKt.SELLER_SETTINGS);
                    if (c1238600iKw.LIZJ) {
                        c13dvLIZIZ.add(EnumC1238570iKt.PIN);
                    }
                    c13dvLIZIZ.add(EnumC1238570iKt.DOWNLOAD_DATA);
                    c13dvLIZIZ.add(EnumC1238570iKt.DEACTIVATE_DELETE_ACCOUNT);
                    if (c1238600iKw.LIZLLL) {
                        c13dvLIZIZ.add(EnumC1238570iKt.MANAGE_ORG_PERMISSIONS);
                    }
                    if (c1238600iKw.LJ) {
                        c13dvLIZIZ.add(EnumC1238570iKt.MANAGE_ORG_ACCOUNTS);
                    }
                    listLJIIJJI2 = C1697820uHc.LIZ(c13dvLIZIZ);
                } else {
                    listLJIIJJI2 = C1697810uHb.LJIIJJI(EnumC1238570iKt.ACCOUNT_USER_INFO, EnumC1238570iKt.PASSWORD, EnumC1238570iKt.PASSKEY, EnumC1238570iKt.REQUEST_VERIFICATION, EnumC1238570iKt.CREATOR_VERIFICATION, EnumC1238570iKt.EXTERNAL_ACCOUNTS, EnumC1238570iKt.SWITCH_ACCOUNT, EnumC1238570iKt.SELLER_SETTINGS, EnumC1238570iKt.DOWNLOAD_DATA, EnumC1238570iKt.DEACTIVATE_DELETE_ACCOUNT);
                }
            }
            for (EnumC1238570iKt enumC1238570iKt : listLJIIJJI2) {
                I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = c1238600iKw.LIZ;
                switch (C1238560iKs.LIZ[enumC1238570iKt.ordinal()]) {
                    case 1:
                        i18nSettingManageMyAccountActivity.LLJL.LIZ(C1238610iKx.LIZ(i18nSettingManageMyAccountActivity.getString(2131837035), new ACListenerS139S0100000_4(i18nSettingManageMyAccountActivity, 1)));
                        break;
                    case 2:
                        if (i18nSettingManageMyAccountActivity.LLLIIIL) {
                            if (i18nSettingManageMyAccountActivity.LLILLL == null) {
                                i18nSettingManageMyAccountActivity.LLJJ = C1238610iKx.LIZLLL(i18nSettingManageMyAccountActivity.getString(2131837675), C2026107wh.LIZ(), new ACListenerS154S0100000_19(i18nSettingManageMyAccountActivity, 11));
                            } else {
                                String string4 = i18nSettingManageMyAccountActivity.getString(2131837675);
                                if (i18nSettingManageMyAccountActivity.LLILLL.passwordExists) {
                                    string3 = "";
                                } else {
                                    string3 = i18nSettingManageMyAccountActivity.getString(2131821313);
                                }
                                i18nSettingManageMyAccountActivity.LLJJ = C1238610iKx.LIZJ(string4, string3, new ACListenerS154S0100000_19(i18nSettingManageMyAccountActivity, 13), C2026107wh.LIZ(), null);
                            }
                            i18nSettingManageMyAccountActivity.LLJL.LIZ(i18nSettingManageMyAccountActivity.LLJJ);
                        } else if (!C1238740iLA.LIZJ("profile").LIZJ("is_passkey_signup_account", false)) {
                            C1238760iLC c1238760iLCLIZLLL = C1238610iKx.LIZLLL(i18nSettingManageMyAccountActivity.getString(2131837675), C2026107wh.LIZ(), new ACListenerS154S0100000_19(i18nSettingManageMyAccountActivity, 19));
                            i18nSettingManageMyAccountActivity.LLJJ = c1238760iLCLIZLLL;
                            i18nSettingManageMyAccountActivity.LLJL.LIZ(c1238760iLCLIZLLL);
                        }
                        break;
                    case 3:
                        if (i18nSettingManageMyAccountActivity.LLLIIIL) {
                            if (i18nSettingManageMyAccountActivity.LLILLL == null) {
                                i18nSettingManageMyAccountActivity.LLJJI = C1238610iKx.LIZ(i18nSettingManageMyAccountActivity.getString(2131839118), new ACListenerS154S0100000_19(i18nSettingManageMyAccountActivity, 14));
                            } else {
                                String string5 = i18nSettingManageMyAccountActivity.getString(2131839118);
                                if (i18nSettingManageMyAccountActivity.LLILLL.passkeyExists) {
                                    string2 = i18nSettingManageMyAccountActivity.getString(2131821294);
                                } else {
                                    string2 = i18nSettingManageMyAccountActivity.getString(2131821295);
                                }
                                i18nSettingManageMyAccountActivity.LLJJI = C1238610iKx.LIZJ(string5, string2, new ACListenerS154S0100000_19(i18nSettingManageMyAccountActivity, 15), false, null);
                            }
                        } else {
                            i18nSettingManageMyAccountActivity.LLJJI = C1238610iKx.LIZJ(i18nSettingManageMyAccountActivity.getString(2131839118), i18nSettingManageMyAccountActivity.getString(2131826582), new ACListenerS154S0100000_19(i18nSettingManageMyAccountActivity, 16), false, null);
                        }
                        if (((ICredentialManagerService) ServiceManager.get().getService(ICredentialManagerService.class)).LJIILL()) {
                            i18nSettingManageMyAccountActivity.LLJL.LIZ(i18nSettingManageMyAccountActivity.LLJJI);
                        }
                        break;
                    case 4:
                        i18nSettingManageMyAccountActivity.LLJL.LIZ(C1238610iKx.LIZ(i18nSettingManageMyAccountActivity.getString(2131838959), new ACListenerS138S0100000_3(i18nSettingManageMyAccountActivity, 4)));
                        break;
                    case 5:
                        C1238760iLC c1238760iLCLIZ2 = C1238610iKx.LIZ(i18nSettingManageMyAccountActivity.getString(2131846430), new ACListenerS154S0100000_19(i18nSettingManageMyAccountActivity, 20));
                        i18nSettingManageMyAccountActivity.LLJJIII = c1238760iLCLIZ2;
                        i18nSettingManageMyAccountActivity.LLJL.LIZ(c1238760iLCLIZ2);
                        C1238760iLC c1238760iLC2 = i18nSettingManageMyAccountActivity.LLJJIII;
                        try {
                            zBooleanValue = C0CLW.LIZIZ.LIZ.getMtcertSettings().getShowCertEntry().booleanValue();
                        } catch (C316660CbA e4) {
                            TryCatchGuardChecker.doCheck(e4);
                            zBooleanValue = false;
                        }
                        c1238760iLC2.LJFF(zBooleanValue);
                        break;
                    case 6:
                        i18nSettingManageMyAccountActivity.LLJL.LIZ(i18nSettingManageMyAccountActivity.LLJJJJJIL.LIZIZ);
                        break;
                    case 7:
                        C1238760iLC c1238760iLCLIZ3 = C1238610iKx.LIZ(i18nSettingManageMyAccountActivity.getString(2131850529), new ACListenerS147S0100000_12(i18nSettingManageMyAccountActivity, 34));
                        i18nSettingManageMyAccountActivity.LLJJIJIIJIL = c1238760iLCLIZ3;
                        i18nSettingManageMyAccountActivity.LLJL.LIZ(c1238760iLCLIZ3);
                        C1238760iLC c1238760iLCLIZ4 = C1238610iKx.LIZ(i18nSettingManageMyAccountActivity.getString(2131849422), new ACListenerS147S0100000_12(i18nSettingManageMyAccountActivity, 35));
                        i18nSettingManageMyAccountActivity.LLJJIJIL = c1238760iLCLIZ4;
                        i18nSettingManageMyAccountActivity.LLJL.LIZ(c1238760iLCLIZ4);
                        if (PluggableExtentionKt.pluggableSpi(IBaBottomBannerInfo.class) != null && ((IBaBottomBannerInfo) PluggableExtentionKt.pluggableSpi(IBaBottomBannerInfo.class)).LIZ() != null && ((IBaBottomBannerInfo) PluggableExtentionKt.pluggableSpi(IBaBottomBannerInfo.class)).LIZ().getBizAccountSwitchInfo() != null) {
                            BizAccountSwitchInfo bizAccountSwitchInfo = ((IBaBottomBannerInfo) PluggableExtentionKt.pluggableSpi(IBaBottomBannerInfo.class)).LIZ().getBizAccountSwitchInfo();
                            String title = bizAccountSwitchInfo.getTitle();
                            if (!TextUtils.isEmpty(title)) {
                                C1238760iLC c1238760iLC3 = i18nSettingManageMyAccountActivity.LLJJIJIL;
                                c1238760iLC3.getClass();
                                c1238760iLC3.LJI(new AwS121S1100000_7(c1238760iLC3, title, 6));
                                C1238760iLC c1238760iLC4 = i18nSettingManageMyAccountActivity.LLJJIJIIJIL;
                                c1238760iLC4.getClass();
                                c1238760iLC4.LJI(new AwS121S1100000_7(c1238760iLC4, title, 6));
                            }
                            String subtitle = bizAccountSwitchInfo.getSubtitle();
                            if (!TextUtils.isEmpty(subtitle)) {
                                i18nSettingManageMyAccountActivity.LLJJIJIL.LJIIIZ(subtitle);
                                i18nSettingManageMyAccountActivity.LLJJIJIIJIL.LJIIIZ(subtitle);
                            }
                            final String schema = bizAccountSwitchInfo.getSchema();
                            if (!TextUtils.isEmpty(schema)) {
                                ?? r13 = new View.OnClickListener() { // from class: X.08Ds
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        String str4 = schema;
                                        String str5 = I18nSettingManageMyAccountActivity._pnsPageId;
                                        SmartRouter.buildRoute(view.getContext(), str4).open();
                                    }
                                };
                                C1238760iLC c1238760iLC5 = i18nSettingManageMyAccountActivity.LLJJIJIL;
                                c1238760iLC5.getClass();
                                c1238760iLC5.LJI(new AwS385S0200000_19(c1238760iLC5, (ViewOnClickListenerC2082208Ds) r13, 129));
                                C1238760iLC c1238760iLC6 = i18nSettingManageMyAccountActivity.LLJJIJIIJIL;
                                c1238760iLC6.getClass();
                                c1238760iLC6.LJI(new AwS385S0200000_19(c1238760iLC6, (ViewOnClickListenerC2082208Ds) r13, 129));
                            }
                        }
                        i18nSettingManageMyAccountActivity.i(false);
                        break;
                    case 8:
                        User user = i18nSettingManageMyAccountActivity.LL;
                        new Object() { // from class: X.0iL4
                        }.getClass();
                        String storeRegionUpperCase = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).getStoreRegionUpperCase();
                        Map map = (Map) SettingsManager.LIZLLL().LJIIIIZZ("ecom_settings_tts_entrance_config", Map.class, null);
                        TabSetting tabSetting = user.getTabSetting();
                        if (tabSetting != null && (shopTab = tabSetting.shopTab) != null) {
                            str = shopTab.shopSchemaV2;
                        } else {
                            str = null;
                        }
                        try {
                            SettingsManager.LIZLLL().getClass();
                            ecomTtsSvcConfig = (TikTokSellerSvcConfigSettings.EcomTtsSvcConfig) SettingsManager.LJII("ecom_tts_svc_config", TikTokSellerSvcConfigSettings.EcomTtsSvcConfig.class);
                        } catch (Exception e5) {
                            TryCatchGuardChecker.doCheck(e5);
                        }
                        if (ecomTtsSvcConfig == null) {
                            str2 = null;
                        } else {
                            str2 = ecomTtsSvcConfig.shortVideoCenterSettinsLink;
                        }
                        if (C0C64.LJIILLIIL().LJIIIZ(31744, "show_seller_profile_video_edu", true, false) && C1533950q1J.LJ(str) && C1533950q1J.LJ(str2)) {
                            try {
                                SettingsManager.LIZLLL().getClass();
                                TikTokSellerSvcConfigSettings.EcomTtsSvcConfig ecomTtsSvcConfig2 = (TikTokSellerSvcConfigSettings.EcomTtsSvcConfig) SettingsManager.LJII("ecom_tts_svc_config", TikTokSellerSvcConfigSettings.EcomTtsSvcConfig.class);
                                if (ecomTtsSvcConfig2 != null) {
                                    str3 = ecomTtsSvcConfig2.shortVideoCenterSettinsLink;
                                    if (str3 == null) {
                                    }
                                }
                            } catch (Exception e6) {
                                TryCatchGuardChecker.doCheck(e6);
                            }
                        } else {
                            if (map != null) {
                                str3 = (String) map.get(storeRegionUpperCase);
                            } else {
                                str3 = null;
                            }
                            if (C1533950q1J.LJ(str3)) {
                                if (str3 == null && (c1238760iLCLIZ = C1238610iKx.LIZ(i18nSettingManageMyAccountActivity.getString(2131832627), new ACListenerS78S1100000_3(i18nSettingManageMyAccountActivity, str3, 1))) != null) {
                                    i18nSettingManageMyAccountActivity.LLJL.LIZ(c1238760iLCLIZ);
                                }
                            }
                        }
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        i18nSettingManageMyAccountActivity.getClass();
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("enter_from", "manage_account");
                        C20684815ws.LJIILLIIL("show_data_download", c2344009Gk.LIZ);
                        i18nSettingManageMyAccountActivity.LLJL.LIZ(C1238610iKx.LIZJ(i18nSettingManageMyAccountActivity.getString(2131847703), i18nSettingManageMyAccountActivity.getString(2131832499), new ACListenerS138S0100000_3(i18nSettingManageMyAccountActivity, 3), false, null));
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        C1238760iLC c1238760iLCLIZ5 = C1238610iKx.LIZ(i18nSettingManageMyAccountActivity.getString(2131837033), new ACListenerS138S0100000_3(i18nSettingManageMyAccountActivity, 1));
                        i18nSettingManageMyAccountActivity.LLJJIJI = c1238760iLCLIZ5;
                        i18nSettingManageMyAccountActivity.LLJL.LIZ(c1238760iLCLIZ5);
                        boolean z2 = !ComplianceServiceProvider.LJIJJ().LJIIJ();
                        i18nSettingManageMyAccountActivity.LLJJIJI.LJFF(z2);
                        if (z2) {
                            C2344009Gk c2344009Gk2 = new C2344009Gk();
                            c2344009Gk2.LJIIIIZZ("enter_from", "manage_account");
                            C20684815ws.LJIILLIIL("show_delete_account", c2344009Gk2.LIZ);
                        }
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        i18nSettingManageMyAccountActivity.getClass();
                        C2344009Gk c2344009Gk3 = new C2344009Gk();
                        c2344009Gk3.LJIIIIZZ("enter_from", "settings_page");
                        C20684815ws.LJIILLIIL("account_page_permission_show", c2344009Gk3.LIZ);
                        i18nSettingManageMyAccountActivity.LLJL.LIZ(C1238610iKx.LIZ(i18nSettingManageMyAccountActivity.getString(2131838984), new ACListenerS138S0100000_3(i18nSettingManageMyAccountActivity, 0)));
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        i18nSettingManageMyAccountActivity.LLJL.LIZ(C1238610iKx.LIZ(i18nSettingManageMyAccountActivity.getString(2131835971), new ACListenerS138S0100000_3(i18nSettingManageMyAccountActivity, 2)));
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        i18nSettingManageMyAccountActivity.getClass();
                        SettingsManager.LIZLLL().getClass();
                        if (SettingsManager.LJI("external_account_benefits_link", "").length() > 0) {
                            C735800Ste c735800Ste = new C735800Ste("external_account_benefits_show");
                            c735800Ste.LJFF("enter_from", "settings_page", InterfaceC1210900hcG.LIZ);
                            c735800Ste.LJIILJJIL();
                            i18nSettingManageMyAccountActivity.LLJL.LIZ(C1238610iKx.LIZ(i18nSettingManageMyAccountActivity.getString(2131858578), new ACListenerS138S0100000_3(i18nSettingManageMyAccountActivity, 6)));
                        }
                        break;
                    default:
                        ISettingsInternalAppDiffProtocol.LIZ.getClass();
                        C1238660iL2.LIZIZ.LIZIZ();
                        break;
                }
            }
        } else {
            C1238600iKw c1238600iKw2 = this.LLLFF;
            if (c1238600iKw2.LIZIZ) {
                listLJIIJJI = Collections.singletonList(EnumC1238580iKu.ACCOUNT_REGION);
            } else {
                listLJIIJJI = C1697810uHb.LJIIJJI(EnumC1238580iKu.PHONE, EnumC1238580iKu.EMAIL, EnumC1238580iKu.DOB, EnumC1238580iKu.ACCOUNT_REGION, EnumC1238580iKu.AUTOFILL);
            }
            for (EnumC1238580iKu enumC1238580iKu : listLJIIJJI) {
                boolean zLIZLLL = C2174441A8c.LIZIZ.LIZLLL();
                I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity2 = c1238600iKw2.LIZ;
                switch (C1238560iKs.LIZIZ[enumC1238580iKu.ordinal()]) {
                    case 1:
                        C1238760iLC c1238760iLCLIZIZ = C1238610iKx.LIZIZ(i18nSettingManageMyAccountActivity2.getString(R.string.t6p), new ACListenerS154S0100000_19(i18nSettingManageMyAccountActivity2, 7), zLIZLLL);
                        i18nSettingManageMyAccountActivity2.LLJILLL = c1238760iLCLIZIZ;
                        i18nSettingManageMyAccountActivity2.LLJL.LIZ(c1238760iLCLIZIZ);
                        i18nSettingManageMyAccountActivity2.LLZZZIL();
                        break;
                    case 2:
                        String stringExtra4 = null;
                        i18nSettingManageMyAccountActivity2.getClass();
                        C419910GdJ c419910GdJ = new C419910GdJ();
                        c419910GdJ.LIZ = R.raw.icon_exclamation_mark_circle_fill;
                        c419910GdJ.LJ = Integer.valueOf(R.attr.zs);
                        int i = (int) ((16.0f * i18nSettingManageMyAccountActivity2.getResources().getDisplayMetrics().density) + 0.5f);
                        c419910GdJ.LIZIZ = i;
                        c419910GdJ.LIZJ = i;
                        TuxIconView tuxIconView = new TuxIconView(i18nSettingManageMyAccountActivity2);
                        i18nSettingManageMyAccountActivity2.LLLI = tuxIconView;
                        tuxIconView.setTuxIcon(c419910GdJ);
                        i18nSettingManageMyAccountActivity2.LLLI.setIconWidth(i);
                        i18nSettingManageMyAccountActivity2.LLLI.setIconHeight(i);
                        TuxTextView tuxTextView = new TuxTextView(i18nSettingManageMyAccountActivity2);
                        i18nSettingManageMyAccountActivity2.LLLII = tuxTextView;
                        tuxTextView.setTuxFont(41);
                        i18nSettingManageMyAccountActivity2.LLLII.setTextColor(C960203pA.LIZ(R.attr.a1k, i18nSettingManageMyAccountActivity2));
                        C1238760iLC c1238760iLCLIZIZ2 = C1238610iKx.LIZIZ(i18nSettingManageMyAccountActivity2.getString(2131837640), new ACListenerS154S0100000_19(i18nSettingManageMyAccountActivity2, 21), zLIZLLL);
                        i18nSettingManageMyAccountActivity2.LLJJJ = c1238760iLCLIZIZ2;
                        i18nSettingManageMyAccountActivity2.LLJL.LIZ(c1238760iLCLIZIZ2);
                        try {
                            stringExtra4 = i18nSettingManageMyAccountActivity2.getIntent().getStringExtra("action");
                        } catch (Exception e7) {
                            TryCatchGuardChecker.doCheck(e7);
                        }
                        if ("show_email_dialog".equals(stringExtra4)) {
                            String email = i18nSettingManageMyAccountActivity2.LL.getEmail();
                            if (!TextUtils.isEmpty(email)) {
                                i18nSettingManageMyAccountActivity2.h(email, i18nSettingManageMyAccountActivity2.LL.isEmailVerified());
                            }
                        }
                        i18nSettingManageMyAccountActivity2.LLZZLLIL(i18nSettingManageMyAccountActivity2.LL);
                        break;
                    case 3:
                        C1238760iLC c1238760iLCLIZIZ3 = C1238610iKx.LIZIZ(i18nSettingManageMyAccountActivity2.getString(2131825277), new ACListenerS154S0100000_19(i18nSettingManageMyAccountActivity2, 8), zLIZLLL);
                        i18nSettingManageMyAccountActivity2.LLJJJIL = c1238760iLCLIZIZ3;
                        i18nSettingManageMyAccountActivity2.LLJL.LIZ(c1238760iLCLIZIZ3);
                        if (i18nSettingManageMyAccountActivity2.LLILZLL.getType().intValue() == 0) {
                            i18nSettingManageMyAccountActivity2.LLJJJIL.LJFF(false);
                        } else {
                            i18nSettingManageMyAccountActivity2.LLJJJIL.LJFF(true);
                            if (ComplianceServiceProvider.LIZLLL().LIZIZ() != null) {
                                i18nSettingManageMyAccountActivity2.LLJJJIL.LJIIIIZZ(i18nSettingManageMyAccountActivity2.LLLLZLLLI(ComplianceServiceProvider.LIZLLL().LIZIZ()));
                            } else if (i18nSettingManageMyAccountActivity2.LLILZLL.getType().intValue() == 1) {
                                i18nSettingManageMyAccountActivity2.LLJJJIL.LJIIIIZZ(i18nSettingManageMyAccountActivity2.getString(2131824780));
                            } else {
                                i18nSettingManageMyAccountActivity2.LLJJJIL.LJIIIIZZ(i18nSettingManageMyAccountActivity2.LLLLZLLLI(i18nSettingManageMyAccountActivity2.LLILZLL.getDefaultDoB()));
                            }
                        }
                        break;
                    case 4:
                        String string6 = i18nSettingManageMyAccountActivity2.getString(2131828613);
                        String string7 = i18nSettingManageMyAccountActivity2.getString(2131828612);
                        ACListenerS154S0100000_19 aCListenerS154S0100000_19 = new ACListenerS154S0100000_19(i18nSettingManageMyAccountActivity2, 6);
                        if (zLIZLLL) {
                            c1238760iLC = C1238610iKx.LIZJ(string6, string7, aCListenerS154S0100000_19, false, null);
                        } else {
                            c1238760iLC = new C1238760iLC(new C19323610io(string6, null, null, null, false, null, null, null, false, false, null, string7, false, false, null, null, null, 16772862));
                        }
                        i18nSettingManageMyAccountActivity2.LLJILJILJ = c1238760iLC;
                        i18nSettingManageMyAccountActivity2.LLJL.LIZ(c1238760iLC);
                        i18nSettingManageMyAccountActivity2.LLJILJILJ.LJFF(false);
                        if (C1207404nw.LIZ() && (iPNSChangeRegionService = (IPNSChangeRegionService) PluggableExtentionKt.pluggableSpi(IPNSChangeRegionService.class)) != null) {
                            LiveData<? extends C1238730iL9> liveDataLJ = iPNSChangeRegionService.LJ();
                            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                            if (liveDataLJ != null) {
                                liveDataLJ.observe(i18nSettingManageMyAccountActivity2, new AObserverS182S0200000_19(atomicBoolean, i18nSettingManageMyAccountActivity2, 0));
                            }
                        }
                        break;
                    case 5:
                        C1238760iLC c1238760iLCLIZIZ4 = C1238610iKx.LIZIZ(i18nSettingManageMyAccountActivity2.getString(2131825267), new ACListenerS138S0100000_3(i18nSettingManageMyAccountActivity2, 5), zLIZLLL);
                        i18nSettingManageMyAccountActivity2.LLLF = c1238760iLCLIZIZ4;
                        i18nSettingManageMyAccountActivity2.LLJL.LIZ(c1238760iLCLIZIZ4);
                        i18nSettingManageMyAccountActivity2.LLLF.LJFF(false);
                        break;
                    case 6:
                        i18nSettingManageMyAccountActivity2.getClass();
                        if (!C255720A0k.LIZ() && ((IAdAutofillService) ServiceManager.get().getService(IAdAutofillService.class)).autofillEnable()) {
                            if (!i18nSettingManageMyAccountActivity2.LLIZ) {
                                ((IAdAutofillService) ServiceManager.get().getService(IAdAutofillService.class)).LJIJI(EnumC1059300dfk.AD);
                            } else {
                                i18nSettingManageMyAccountActivity2.LLLZLZ();
                                C1238760iLC c1238760iLCLIZIZ5 = C1238610iKx.LIZIZ(i18nSettingManageMyAccountActivity2.getString(2131829474), new ACListenerS154S0100000_19(i18nSettingManageMyAccountActivity2, 9), zLIZLLL);
                                i18nSettingManageMyAccountActivity2.LLJLILLLLZIIL = c1238760iLCLIZIZ5;
                                i18nSettingManageMyAccountActivity2.LLJL.LIZ(c1238760iLCLIZIZ5);
                                i18nSettingManageMyAccountActivity2.l();
                            }
                        }
                        if (!C255720A0k.LIZ() && ((IAdAutofillService) ServiceManager.get().getService(IAdAutofillService.class)).LJIIJJI()) {
                            if (!i18nSettingManageMyAccountActivity2.LLIZ) {
                                ((IAdAutofillService) ServiceManager.get().getService(IAdAutofillService.class)).LJIJI(EnumC1059300dfk.AD);
                            } else {
                                Boolean bool = Boolean.TRUE;
                                i18nSettingManageMyAccountActivity2.LLLZLZ();
                                boolean zLJI2 = ((IAdAutofillService) ServiceManager.get().getService(IAdAutofillService.class)).LJI();
                                C19319810iC c19319810iC = new C19319810iC(i18nSettingManageMyAccountActivity2.getString(2131835648), new ACListenerS154S0100000_19(i18nSettingManageMyAccountActivity2, 17), zLJI2);
                                i18nSettingManageMyAccountActivity2.LLJLLIL = c19319810iC;
                                C19292910dr c19292910dr = new C19292910dr(c19319810iC);
                                i18nSettingManageMyAccountActivity2.LLJLL = c19292910dr;
                                i18nSettingManageMyAccountActivity2.LLJL.LIZ(c19292910dr);
                                C1238760iLC c1238760iLCLIZJ = C1238610iKx.LIZJ(i18nSettingManageMyAccountActivity2.getString(2131835649), ((IAdAutofillService) ServiceManager.get().getService(IAdAutofillService.class)).LJIL(), new ACListenerS154S0100000_19(i18nSettingManageMyAccountActivity2, 18), false, 1);
                                i18nSettingManageMyAccountActivity2.LLJLLL = c1238760iLCLIZJ;
                                i18nSettingManageMyAccountActivity2.LLJL.LIZ(c1238760iLCLIZJ);
                                i18nSettingManageMyAccountActivity2.LLJLLL.LJFF(zLJI2);
                                boolean zLJIIL = ((IAdAutofillService) ServiceManager.get().getService(IAdAutofillService.class)).LJIIL();
                                C19319810iC c19319810iC2 = new C19319810iC(i18nSettingManageMyAccountActivity2.getString(2131835651), new ACListenerS154S0100000_19(i18nSettingManageMyAccountActivity2, 10), zLJIIL);
                                i18nSettingManageMyAccountActivity2.LLJZIJLIL = c19319810iC2;
                                C19292910dr c19292910dr2 = new C19292910dr(c19319810iC2);
                                i18nSettingManageMyAccountActivity2.LLJZ = c19292910dr2;
                                i18nSettingManageMyAccountActivity2.LLJL.LIZ(c19292910dr2);
                                C1238760iLC c1238760iLCLIZJ2 = C1238610iKx.LIZJ(i18nSettingManageMyAccountActivity2.getString(2131835650), ((IAdAutofillService) ServiceManager.get().getService(IAdAutofillService.class)).LJIJ(), new ACListenerS154S0100000_19(i18nSettingManageMyAccountActivity2, 12), false, 1);
                                i18nSettingManageMyAccountActivity2.LLL = c1238760iLCLIZJ2;
                                i18nSettingManageMyAccountActivity2.LLJL.LIZ(c1238760iLCLIZJ2);
                                i18nSettingManageMyAccountActivity2.LLL.LJFF(zLJIIL);
                                if (!zLJIIL) {
                                    i18nSettingManageMyAccountActivity2.LLJZ.LIZ(Boolean.FALSE, bool);
                                }
                            }
                        }
                        break;
                    default:
                        throw new C1954807lC();
                }
            }
        }
        TuxNavBar tuxNavBar = (TuxNavBar) findViewById(R.id.y1z);
        getString(2131837032);
        if (this.LLIZ) {
            string = getString(2131837035);
        } else {
            string = getString(2131847815);
        }
        C0OM1 c0om1 = new C0OM1();
        C1237450iJ5.LIZ(c0om1, string, this);
        tuxNavBar.setNavActions(c0om1);
        System.currentTimeMillis();
        if (this.LLIZ && this.LLIZLLLIL) {
            C2344009Gk c2344009Gk4 = new C2344009Gk();
            c2344009Gk4.LJIIIIZZ("enter_method", this.LLLIIIIL);
            c2344009Gk4.LJIIIIZZ("enter_from", this.LLLIIII);
            C20684815ws.LJIILLIIL("enter_account_info", c2344009Gk4.LIZ);
        }
        this.LLJJJJLIIL = new C1235040iFC();
        TypedValue typedValue = new TypedValue();
        getTheme().resolveAttribute(R.attr.zp, typedValue, true);
        tuxNavBar.LJIIZILJ(false);
        tuxNavBar.setNavBackground(typedValue.data);
        findViewById(R.id.tsc).setBackgroundColor(typedValue.data);
        this.LLJL.LJ();
        findViewById(R.id.rn0).setPadding(0, 0, 0, 0);
        try {
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                try {
                    Uri uri = UriProtector.parse(extras.getString("convert_url"));
                    if (uri.getPath() != null && uri.getPath().endsWith("ucenter_web/deeplink/account/risk_notification")) {
                        LLLZZIL(extras);
                    }
                } catch (Exception e8) {
                    TryCatchGuardChecker.doCheck(e8);
                }
            }
        } catch (Exception e9) {
            TryCatchGuardChecker.doCheck(e9);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity", "onCreate", false);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public void onSwitchBusinessAccountSuccessEvent(C1238750iLB c1238750iLB) {
        finish();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        boolean z;
        super.setTheme(i);
        if (C299020Bno.LIZ() != 0) {
            boolean z2 = false;
            if (!C1697810uHb.LJIIJJI(Integer.valueOf(R.style.a9t), Integer.valueOf(R.style.a9u), Integer.valueOf(R.style.a9v), Integer.valueOf(R.style.a9s)).contains(Integer.valueOf(i))) {
                Integer numLIZ = C1308910kAL.LIZ(R.attr.g0c, this);
                if (numLIZ != null && numLIZ.intValue() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numLIZ2 = C1308910kAL.LIZ(R.attr.g0d, this);
                if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                    z2 = true;
                }
                if (z) {
                    getTheme().applyStyle(R.style.a9u, true);
                } else {
                    getTheme().applyStyle(R.style.a9t, true);
                }
                if (z2) {
                    getTheme().applyStyle(R.style.a9v, true);
                } else {
                    getTheme().applyStyle(R.style.a9s, true);
                }
            }
        }
        EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
        if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
            getTheme().applyStyle(R.style.a9x, true);
        } else {
            if (enumC335920DEwLIZ != EnumC335920DEw.V2) {
                return;
            }
            getTheme().applyStyle(R.style.a9y, true);
        }
    }

    public static void LLLLLZL(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity, Intent intent) throws Throwable {
        Intent intent2 = intent;
        Activity activity = i18nSettingManageMyAccountActivity;
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent2, "Context_startActivity_1");
        C1701330uNH.LIZ(intent2, activity);
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtd4vH0jV93kG4Fv3bZQu//Fh023UvObZ2aReaqd3lMbhahIgcSrQn2Q==", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11098, "com/ss/android/ugc/aweme/setting/I18nSettingManageMyAccountActivity", "startActivity", activity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11098, "com/ss/android/ugc/aweme/setting/I18nSettingManageMyAccountActivity", "startActivity", null, objArr, activity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            }
        }
        activity.startActivity(intent2);
        c0wst.LIZ(11098, "com/ss/android/ugc/aweme/setting/I18nSettingManageMyAccountActivity", "startActivity", null, objArr, activity, c0wzw, true);
    }

    public static boolean LLZ(List list, boolean z) {
        String str;
        if (list == null) {
            return false;
        }
        if (z) {
            str = "mobile_sms_verify";
        } else {
            str = "email_verify";
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            TwoStepVerifyWays twoStepVerifyWays = (TwoStepVerifyWays) it2.next();
            if (Objects.equals(twoStepVerifyWays.verify_way, str) && Boolean.TRUE.equals(twoStepVerifyWays.isAvailable())) {
                return true;
            }
        }
        return false;
    }

    public final void h(String str, boolean z) {
        int i;
        int i2;
        LLZZ(false);
        C1397620mTQ c1397620mTQ = new C1397620mTQ(this);
        c1397620mTQ.LJFF = true;
        if (z) {
            c1397620mTQ.LJFF(2131857869, new AObjectS362S0100000_19(this, 8));
            c1397620mTQ.LJFF(2131857872, new AObjectS362S0100000_19(this, 9));
            i = 2131857871;
        } else {
            c1397620mTQ.LJFF(2131857868, new AObjectS362S0100000_19(this, 10));
            c1397620mTQ.LJII(2131857864, new AObjectS362S0100000_19(this, 11));
            c1397620mTQ.LJII(2131857867, new AObjectS362S0100000_19(this, 0));
            i = 2131857866;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("\n");
        sbLIZ.append(str);
        String string = getString(i, C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            i2 = 2131857870;
        } else {
            i2 = 2131857865;
        }
        String string2 = getString(i2);
        C1397580mTM c1397580mTM = new C1397580mTM(this);
        c1397580mTM.LJI(string);
        c1397580mTM.LIZIZ(string2);
        c1397580mTM.LJIIL = c1397620mTQ;
        c1397580mTM.LJIIIZ = new C340190DVh(R.raw.icon_envelope, 0, this, Integer.valueOf(R.attr.a1h));
        c1397580mTM.LJIIIIZZ = false;
        c1397580mTM.LJII = true;
        c1397580mTM.LIZLLL(new AObjectS362S0100000_19(this, 1));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C19319110i5 LLLZ(CharSequence charSequence, CharSequence charSequence2, Boolean bool) {
        Integer num = null;
        return new C19319110i5(new C19319010i4(charSequence, !bool.booleanValue(), true, false, 0 == true ? 1 : 0, charSequence2, Integer.valueOf(this.LLLIIL), Integer.valueOf(this.LLLIILIL), num, num, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 64512));
    }

    public final void LLZLLLL(boolean z, EnumC1235020iFA enumC1235020iFA, EnumC1234990iF7 enumC1234990iF7) {
        EnumC1235150iFN enumC1235150iFN;
        EnumC1235110iFJ enumC1235110iFJ;
        ExitUnlinkPhoneEmailPopupEvent exitUnlinkPhoneEmailPopupEvent = new ExitUnlinkPhoneEmailPopupEvent();
        if (z) {
            enumC1235150iFN = EnumC1235150iFN.PHONE;
        } else {
            enumC1235150iFN = EnumC1235150iFN.EMAIL;
        }
        exitUnlinkPhoneEmailPopupEvent.LJI(enumC1235150iFN.getValue(), "unlink_type");
        exitUnlinkPhoneEmailPopupEvent.LJI(enumC1235020iFA.getValue(), "exit_method");
        if (z) {
            enumC1235110iFJ = EnumC1235110iFJ.NULL;
        } else if (this.LL.isEmailVerified()) {
            enumC1235110iFJ = EnumC1235110iFJ.DIGITAL_1;
        } else {
            enumC1235110iFJ = EnumC1235110iFJ.DIGITAL_0;
        }
        exitUnlinkPhoneEmailPopupEvent.LJI(enumC1235110iFJ.getValue(), "is_email_verified");
        exitUnlinkPhoneEmailPopupEvent.LJI(C0N6B.MANAGE_MY_ACCOUNT.getValue(), "enter_from");
        if (enumC1234990iF7 != null) {
            exitUnlinkPhoneEmailPopupEvent.LJI(enumC1234990iF7.getValue(), "unlink_eligible_status");
        }
        exitUnlinkPhoneEmailPopupEvent.LJIIIIZZ();
    }

    public final void j(int i, int i2, final boolean z) {
        C1397620mTQ c1397620mTQ = new C1397620mTQ(this);
        c1397620mTQ.LIZJ(0, getResources().getString(i2), new Function1() { // from class: X.0TRo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = this.LL;
                boolean z2 = z;
                String str = I18nSettingManageMyAccountActivity._pnsPageId;
                i18nSettingManageMyAccountActivity.getClass();
                C786230Usn c786230Usn = new C786230Usn(i18nSettingManageMyAccountActivity, ((C1397660mTU) obj).LIZIZ, 0);
                if (z2) {
                    C0XQ7.LJ();
                    C0XQ7.LIZ.LIZLLL().quitBusinessAccount(c786230Usn);
                } else {
                    C0XQ7.LJ();
                    C0XQ7.LIZ.LIZLLL().switchProAccount(0, null, null, 0, c786230Usn);
                }
                return Unit.LIZ;
            }
        });
        c1397620mTQ.LIZJ(1, getResources().getString(R.string.f1_), null);
        c1397620mTQ.LJFF = true;
        C1397580mTM c1397580mTM = new C1397580mTM(this);
        c1397580mTM.LJFF(2131850880);
        c1397580mTM.LIZ(i);
        c1397580mTM.LJIIL = c1397620mTQ;
        c1397580mTM.LJII = false;
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    public final void n(boolean z, ArrayList<VerificationMethodType> arrayList, Bundle bundle) {
        boolean z2 = !arrayList.isEmpty();
        if (z) {
            if (z2) {
                VerificationMethodType verificationMethodType = VerificationMethodType.MOBILE;
                if (arrayList.contains(verificationMethodType)) {
                    runOnUiThread(new ARunnableS27S0400000_19(this, bundle, arrayList, verificationMethodType, 0));
                    return;
                } else {
                    runOnUiThread(new ARunnableS27S0400000_19(this, bundle, arrayList, (VerificationMethodType) ListProtector.get(arrayList, 0), 0));
                    return;
                }
            }
            bu(getString(2131827401));
            return;
        }
        if (z2) {
            if (arrayList.contains(VerificationMethodType.EMAIL)) {
                runOnUiThread(new ARunnableS52S0300000_19(this, bundle, arrayList, 0));
                return;
            } else {
                ListProtector.get(arrayList, 0);
                runOnUiThread(new ARunnableS52S0300000_19(this, bundle, arrayList, 0));
                return;
            }
        }
        bu(getString(2131827395));
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        User curUser;
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onActivityResult(requestCode: ");
        sbLIZ.append(i);
        sbLIZ.append(", resultCode: ");
        sbLIZ.append(i2);
        sbLIZ.append(")");
        C2188811AlT.LIZIZ(sbLIZ);
        if (i != 1) {
            if (i == 11 && i2 == 12) {
                C1389890mGx c1389890mGx = new C1389890mGx(this);
                c1389890mGx.LJIIJ(getString(2131848563));
                c1389890mGx.LJFF(R.raw.icon_tick_fill_small);
                c1389890mGx.LJII(R.attr.a0i);
                c1389890mGx.LJIIJJI();
                return;
            }
            return;
        }
        if (i2 != 2 || intent.getIntExtra("bind_email_result", -1) != 1 || (curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser()) == null) {
            return;
        }
        C1389890mGx c1389890mGx2 = new C1389890mGx(this);
        c1389890mGx2.LJIIJ(getString(2131821594, curUser.getEmail()));
        c1389890mGx2.LJFF(R.raw.icon_tick_fill_small);
        c1389890mGx2.LJII(R.attr.a0i);
        c1389890mGx2.LJIIJJI();
    }

    public final void g(final boolean z, final boolean z2, final ArrayList<VerificationMethodType> arrayList, final Bundle bundle) {
        final C1397620mTQ c1397620mTQ = new C1397620mTQ(this);
        c1397620mTQ.LIZJ(0, getString(2131827400), new Function1() { // from class: X.0iFH
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                EnumC1235170iFP enumC1235170iFP;
                EnumC1235140iFM enumC1235140iFM;
                I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = this.LL;
                boolean z3 = z2;
                boolean z4 = z;
                ArrayList<VerificationMethodType> arrayList2 = arrayList;
                Bundle bundle2 = bundle;
                String str = I18nSettingManageMyAccountActivity._pnsPageId;
                if (!z3) {
                    i18nSettingManageMyAccountActivity.n(z4, arrayList2, bundle2);
                } else {
                    if (z4) {
                        i18nSettingManageMyAccountActivity.getClass();
                        i18nSettingManageMyAccountActivity.runOnUiThread(new ARunnableS88S0200000_19(i18nSettingManageMyAccountActivity, bundle2, 1));
                    } else {
                        i18nSettingManageMyAccountActivity.getClass();
                        i18nSettingManageMyAccountActivity.runOnUiThread(new ARunnableS88S0200000_19(i18nSettingManageMyAccountActivity, bundle2, 0));
                    }
                    i18nSettingManageMyAccountActivity.LJIIL();
                }
                ExitUnlinkPhoneEmailConfirmPageEvent exitUnlinkPhoneEmailConfirmPageEvent = new ExitUnlinkPhoneEmailConfirmPageEvent();
                if (z3) {
                    enumC1235170iFP = EnumC1235170iFP.YES;
                } else {
                    enumC1235170iFP = EnumC1235170iFP.NO;
                }
                exitUnlinkPhoneEmailConfirmPageEvent.LJIIJJI(enumC1235170iFP);
                if (z4) {
                    enumC1235140iFM = EnumC1235140iFM.PHONE;
                } else {
                    enumC1235140iFM = EnumC1235140iFM.EMAIL;
                }
                exitUnlinkPhoneEmailConfirmPageEvent.LJI(enumC1235140iFM.getValue(), "unlink_type");
                exitUnlinkPhoneEmailConfirmPageEvent.LJI(EnumC1235130iFL.CHANGE.getValue(), "action_type");
                exitUnlinkPhoneEmailConfirmPageEvent.LJIIJ(EnumC1235160iFO.DIGITAL_1);
                exitUnlinkPhoneEmailConfirmPageEvent.LJI(EnumC1235240iFW.CLICK_CONTINUE.getValue(), "exit_method");
                exitUnlinkPhoneEmailConfirmPageEvent.LJIIIIZZ();
                return Unit.LIZ;
            }
        });
        c1397620mTQ.LJII(2131827399, null);
        runOnUiThread(new Runnable() { // from class: X.0iFQ
            @Override // java.lang.Runnable
            public final void run() {
                final I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = this.LL;
                final boolean z3 = z;
                C1397620mTQ c1397620mTQ2 = c1397620mTQ;
                final boolean z4 = z2;
                String str = I18nSettingManageMyAccountActivity._pnsPageId;
                i18nSettingManageMyAccountActivity.getClass();
                C1C7U.LIZ("I18nSettingManageMyAccountActivity@7df8.showChangeBindings2svConfirmationDialog$1L");
                C1397580mTM c1397580mTM = new C1397580mTM(i18nSettingManageMyAccountActivity);
                c1397580mTM.LJIIIZ = new C340190DVh(R.raw.icon_exclamation_mark_circle, 0, i18nSettingManageMyAccountActivity, Integer.valueOf(R.attr.zs));
                c1397580mTM.LJI(i18nSettingManageMyAccountActivity.getString(z3 ? 2131827403 : 2131827397));
                c1397580mTM.LIZIZ(i18nSettingManageMyAccountActivity.getString(z3 ? 2131827402 : 2131827396));
                c1397580mTM.LJIIL = c1397620mTQ2;
                c1397580mTM.LIZLLL(new Function1() { // from class: X.0iFI
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        EnumC1235170iFP enumC1235170iFP;
                        EnumC1235140iFM enumC1235140iFM;
                        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity2 = i18nSettingManageMyAccountActivity;
                        boolean z5 = z4;
                        boolean z6 = z3;
                        String str2 = I18nSettingManageMyAccountActivity._pnsPageId;
                        i18nSettingManageMyAccountActivity2.getClass();
                        if (((AbstractDialogInterfaceC1397690mTX) obj).LLIZ == null) {
                            i18nSettingManageMyAccountActivity2.LLZLLLL(false, EnumC1235020iFA.CLOSE, null);
                            ExitUnlinkPhoneEmailConfirmPageEvent exitUnlinkPhoneEmailConfirmPageEvent = new ExitUnlinkPhoneEmailConfirmPageEvent();
                            if (z5) {
                                enumC1235170iFP = EnumC1235170iFP.YES;
                            } else {
                                enumC1235170iFP = EnumC1235170iFP.NO;
                            }
                            exitUnlinkPhoneEmailConfirmPageEvent.LJIIJJI(enumC1235170iFP);
                            if (z6) {
                                enumC1235140iFM = EnumC1235140iFM.PHONE;
                            } else {
                                enumC1235140iFM = EnumC1235140iFM.EMAIL;
                            }
                            exitUnlinkPhoneEmailConfirmPageEvent.LJI(enumC1235140iFM.getValue(), "unlink_type");
                            exitUnlinkPhoneEmailConfirmPageEvent.LJI(EnumC1235130iFL.CHANGE.getValue(), "action_type");
                            exitUnlinkPhoneEmailConfirmPageEvent.LJIIJ(EnumC1235160iFO.DIGITAL_1);
                            exitUnlinkPhoneEmailConfirmPageEvent.LJIIIIZZ();
                        }
                        return null;
                    }
                });
                new C1397510mTF(c1397580mTM).LIZLLL();
                ShowUnlinkPhoneEmailConfirmPageEvent showUnlinkPhoneEmailConfirmPageEvent = new ShowUnlinkPhoneEmailConfirmPageEvent();
                showUnlinkPhoneEmailConfirmPageEvent.LJI(Integer.valueOf((z4 ? EnumC1235210iFT.YES : EnumC1235210iFT.NO).getValue()), "is_env_safe");
                showUnlinkPhoneEmailConfirmPageEvent.LJI((z3 ? EnumC1235190iFR.PHONE : EnumC1235190iFR.EMAIL).getValue(), "unlink_type");
                showUnlinkPhoneEmailConfirmPageEvent.LJI(EnumC1235200iFS.CHANGE.getValue(), "action_type");
                showUnlinkPhoneEmailConfirmPageEvent.LJI(Integer.valueOf(EnumC1235220iFU.DIGITAL_1.getValue()), "is_2sv_on");
                showUnlinkPhoneEmailConfirmPageEvent.LJIIIIZZ();
                C1C7U.LIZIZ("I18nSettingManageMyAccountActivity@7df8.showChangeBindings2svConfirmationDialog$1L");
            }
        });
    }
}
