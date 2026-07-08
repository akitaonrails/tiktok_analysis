package com.ss.android.ugc.aweme.relation.auth.pipeline.common;

import X.AnonymousClass0954;
import X.AnonymousClass0955;
import X.C01GW;
import X.C04U5;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C0AEB;
import X.C0C64;
import X.C0TIG;
import X.C1070720dyA;
import X.C1070870dyP;
import X.C1071220dyy;
import X.C1071670dzh;
import X.C1071790dzt;
import X.C1071800dzu;
import X.C1071940e08;
import X.C1071990e0D;
import X.C1072010e0F;
import X.C1072020e0G;
import X.C1072030e0H;
import X.C1076010e6h;
import X.C123100dR;
import X.C1360520lVa;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1391850mK7;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C14EU;
import X.C1948007k6;
import X.C19EG;
import X.C1ATR;
import X.C1B3P;
import X.C2188811AlT;
import X.C2252611DEt;
import X.C2296808zG;
import X.C452501pT;
import X.C627150Oin;
import X.C786410Ut5;
import X.C844470XAv;
import X.C960203pA;
import X.C985403tE;
import X.EnumC1070340dxY;
import X.EnumC1072080e0M;
import X.InterfaceC1070550dxt;
import X.InterfaceC1364105Vn;
import X.InterfaceC21614319iP;
import X.InterfaceC497601wk;
import android.content.Context;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.FacebookSdk;
import com.ss.android.ugc.aweme.experiment.FacebookSocialPromptV2flagsSettings;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.relation.auth.dialogcenter.RelationFreqControlData;
import com.ss.android.ugc.aweme.relation.auth.fb.IFacebookAppIdSyncService;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS208S0000000_20;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS130S1100000_16;
import kotlin.jvm.internal.AwS382S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS56S1300000_16;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes17.dex */
public final class RelationAuthDialogControl implements LifecycleEventObserver {
    public final Context LL;
    public final InterfaceC497601wk LLILLJJLI;
    public C1071220dyy LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public final Keva LLJILJIL;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(336));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(40));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 475));
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(236));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(235));

    public final C1071220dyy LIZ() {
        C1071220dyy c1071220dyy = this.LLILZ;
        if (c1071220dyy != null) {
            return c1071220dyy;
        }
        return null;
    }

    public final int LJ() {
        Bundle bundle;
        RelationFreqControlData relationFreqControlData;
        if (this.LLILZ == null || (bundle = LIZ().LIZ.LJI) == null || (relationFreqControlData = (RelationFreqControlData) bundle.getParcelable("freq_data_before_pipeline")) == null) {
            return 0;
        }
        return relationFreqControlData.showIndex;
    }

    public final void LJII() {
        Bundle bundle = LIZ().LIZ.LJI;
        if (bundle == null || !bundle.getBoolean("is_passive_pop_up")) {
            return;
        }
        this.LLJILJIL.storeLong("last_click_cancel_time", System.currentTimeMillis());
    }

    public static String LIZIZ(EnumC1070340dxY enumC1070340dxY) {
        int i = C1071670dzh.LIZ[enumC1070340dxY.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return "";
                    }
                    return "424_email";
                }
                return "424_mlbb";
            }
            return "424_fb";
        }
        return "424_contact";
    }

    public final void LIZJ(EnumC1072080e0M enumC1072080e0M) {
        if (this.LLILZ == null) {
            return;
        }
        String str = LIZ().LIZ.LJ.LIZ;
        String str2 = LIZ().LIZ.LJ.LIZIZ;
        C1071990e0D c1071990e0D = C1071990e0D.LIZ;
        int iLJ = LJ() + 1;
        c1071990e0D.getClass();
        C1071990e0D.LIZ(str, str2, iLJ, enumC1072080e0M);
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onEvent$auth_release(C1B3P c1b3p) {
        if (C123100dR.LIZ(c1b3p.LIZ)) {
            this.LLIZ = true;
        }
    }

    public RelationAuthDialogControl(Context context, InterfaceC497601wk interfaceC497601wk) {
        this.LL = context;
        this.LLILLJJLI = interfaceC497601wk;
        String str = C1071790dzt.LIZIZ;
        this.LLJILJIL = C1071800dzu.LIZ().LIZ;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (this.LLILZIL && event == Lifecycle.Event.ON_RESUME) {
            this.LLILZIL = false;
            if (C1076010e6h.LIZJ.LJIIJ().LJ()) {
                ((AnonymousClass0955) this.LLIZLLLIL.getValue()).LJIIIIZZ(Boolean.TRUE);
                ((InterfaceC1070550dxt) C1948007k6.LIZ(this.LL, InterfaceC1070550dxt.class)).LIZ();
            } else {
                ((AnonymousClass0955) this.LLIZLLLIL.getValue()).LJIIIIZZ(Boolean.FALSE);
            }
        }
        if (this.LLILZLL && event == Lifecycle.Event.ON_RESUME) {
            this.LLILZLL = false;
            if (this.LLIZ) {
                this.LLIZ = false;
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LL);
                if (c19egLIZIZ != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZIZ);
                    c1389890mGx.LJIIIZ(2131837440);
                    c1389890mGx.LJIIJJI();
                }
            }
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            lifecycleOwner.getLifecycle().removeObserver(this);
            C2296808zG.LIZJ(this.LLILLJJLI, null);
            ((AnonymousClass0954) this.LLIZLLLIL.getValue()).LIZIZ(null);
            if (EventBus.LIZLLL().LJIIJ(this)) {
                EventBus.LIZLLL().LJJI(this);
            }
        }
    }

    public final Object LIZLLL(C19EG c19eg, final C1071220dyy c1071220dyy, C1071940e08 c1071940e08) {
        String str;
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(c1071940e08));
        c2252611DEt.LJIJJ();
        InterfaceC21614319iP interfaceC21614319iP = new InterfaceC21614319iP() { // from class: X.0e09
            @Override // X.InterfaceC21614319iP
            public final void LLLLJ(AuthResult authResult) {
                boolean z;
                if (authResult.mIsSuccessful && !authResult.mIsCancelled && C123100dR.LIZ(authResult.mToken) && C1071190dyv.LIZLLL(authResult, "user_friends")) {
                    z = true;
                } else {
                    z = false;
                }
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("FacebookMTSync auth callback ");
                sbLIZ.append(z);
                C2188811AlT.LIZIZ(sbLIZ);
                if (z) {
                    if (C1071190dyv.LIZLLL(authResult, "email") && ((Boolean) C04U5.LIZ.getValue()).booleanValue()) {
                        String str2 = authResult.mToken;
                        ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                        HashMap map = new HashMap();
                        map.put("access_token", str2);
                        map.put("mix_mode", "1");
                        map.put("platform_app_id", "310");
                        map.put("platform", "facebook");
                        C844470XAv.LIZ.getClass();
                        map.put("act_aid", String.valueOf(C844470XAv.LJIIJ));
                        ((C0XH0) C0XH0.LIZLLL()).LIZIZ("/passport/user/fetch_oauth_info/", map, new AbstractC846040XGw<C846060XGy>() { // from class: X.0dw4
                            @Override // X.AbstractC846040XGw
                            public final /* bridge */ /* synthetic */ void LIZ(C0XGA c0xga) {
                            }
                        });
                    }
                    C1076010e6h.LIZJ.LJII().LJIIIZ(authResult.mExpiryDateInMillis, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), authResult.mToken);
                    InterfaceC20236714Gf<Boolean> interfaceC20236714Gf = c2252611DEt;
                    Boolean bool = Boolean.TRUE;
                    C189200o6.m2constructorimpl(bool);
                    interfaceC20236714Gf.resumeWith(bool);
                } else {
                    new C1071710dzl(c1071220dyy, (Integer) this.LLJI.getValue(), false, Boolean.valueOf(!authResult.mIsCancelled)).LIZLLL(null);
                    InterfaceC20236714Gf<Boolean> interfaceC20236714Gf2 = c2252611DEt;
                    Boolean bool2 = Boolean.FALSE;
                    C189200o6.m2constructorimpl(bool2);
                    interfaceC20236714Gf2.resumeWith(bool2);
                }
                FacebookSdk.LJII();
                if (FacebookSdk.LJII()) {
                    FacebookSdk.LIZLLL();
                    C786410Ut5.C2();
                }
                IFacebookAppIdSyncService iFacebookAppIdSyncService = (IFacebookAppIdSyncService) PluggableExtentionKt.pluggableSpi$default(IFacebookAppIdSyncService.class, false, false, false, 14, null);
                if (iFacebookAppIdSyncService != null) {
                    iFacebookAppIdSyncService.LIZIZ();
                }
                if (FacebookSdk.LJII()) {
                    FacebookSdk.LIZLLL();
                    C786410Ut5.C2();
                }
            }
        };
        C1ATR c1atrLIZIZ = C1ATR.LIZIZ();
        C1072010e0F c1072010e0F = new C1072010e0F(c19eg);
        c1072010e0F.LIZ = "facebook";
        C627150Oin c627150Oin = new C627150Oin();
        if (((Boolean) C04U5.LIZ.getValue()).booleanValue()) {
            str = "email, user_friends";
        } else {
            str = "user_friends";
        }
        C786410Ut5.LJJJI("fb_read_permissions", str, c627150Oin.LIZ);
        Bundle bundle = c627150Oin.LIZ;
        Bundle bundle2 = c1072010e0F.LIZLLL;
        if (bundle2 == null) {
            c1072010e0F.LIZLLL = bundle;
        } else {
            C786410Ut5.LJJIIJZLJL(bundle2, bundle);
        }
        c1072010e0F.LIZJ = interfaceC21614319iP;
        C1072020e0G c1072020e0G = new C1072020e0G(c1072010e0F);
        c1atrLIZIZ.getClass();
        C1ATR.LIZJ(c1072020e0G);
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(c1071940e08);
        }
        return objLJIJ;
    }

    public final Object LJFF(Context context, EnumC1070340dxY enumC1070340dxY, String str, Bundle bundle, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) throws Exception {
        CharSequence charSequenceLIZ;
        String string;
        String string2;
        String string3;
        String strLIZIZ;
        C1360520lVa c1360520lVa;
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LJI("");
        C1072030e0H c1072030e0H = new C1072030e0H(LIZ().LIZ.LJ.LIZ, LIZ().LIZ.LJ.LIZIZ, LJ() + 1);
        int i = C1070870dyP.LIZ[enumC1070340dxY.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    charSequenceLIZ = context.getString(2131837431);
                } else {
                    throw new Exception("no such relationAuthPlatform");
                }
            } else if (bundle != null && bundle.getBoolean("is_login")) {
                C1070720dyA.LIZ.getClass();
                C844470XAv.LIZ.getClass();
                charSequenceLIZ = C844470XAv.LIZ().getString(2131823128);
            } else {
                C0TIG.LIZ.getClass();
                if (C0C64.LJIILLIIL().LJIJ(31744, 2, "fb_social_prompt_rephrase_android", true) == 0) {
                    charSequenceLIZ = context.getString(2131821657);
                } else {
                    SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                    FacebookSocialPromptV2flagsSettings.FacebookSocialPromptV2flagsModel facebookSocialPromptV2flagsModel = FacebookSocialPromptV2flagsSettings.LIZ;
                    FacebookSocialPromptV2flagsSettings.FacebookSocialPromptV2flagsModel facebookSocialPromptV2flagsModel2 = (FacebookSocialPromptV2flagsSettings.FacebookSocialPromptV2flagsModel) settingsManagerLIZLLL.LJIIIIZZ("facebook_social_prompt_v2flags", FacebookSocialPromptV2flagsSettings.FacebookSocialPromptV2flagsModel.class, facebookSocialPromptV2flagsModel);
                    if (facebookSocialPromptV2flagsModel2 != null) {
                        facebookSocialPromptV2flagsModel = facebookSocialPromptV2flagsModel2;
                    }
                    if (C0AEB.LIZ()) {
                        string = context.getString(2131849339);
                    } else {
                        String str2 = facebookSocialPromptV2flagsModel.promptExcludeTitle;
                        if (str2 != null && str2.length() != 0) {
                            string = facebookSocialPromptV2flagsModel.promptExcludeTitle;
                        } else {
                            string = context.getString(2131834352);
                        }
                    }
                    String str3 = facebookSocialPromptV2flagsModel.promptExcludeTitle;
                    if (str3 != null && str3.length() != 0) {
                        string2 = facebookSocialPromptV2flagsModel.learnMoreText;
                    } else {
                        string2 = context.getString(2131834354);
                    }
                    String str4 = facebookSocialPromptV2flagsModel.promptExcludeTitle;
                    if (str4 != null && str4.length() != 0) {
                        string3 = facebookSocialPromptV2flagsModel.helpCenterLinkText;
                    } else {
                        string3 = context.getString(2131834353);
                    }
                    if (C0AEB.LIZ()) {
                        strLIZIZ = C786410Ut5.j4(string, Arrays.copyOf(new Object[]{string2}, 1));
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(string);
                        sbLIZ.append(' ');
                        sbLIZ.append(string2);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    }
                    if (C0AEB.LIZ()) {
                        CharSequence charSequenceLIZ2 = C0TIG.LIZ(context, string3, strLIZIZ);
                        if (C0C64.LJIILLIIL().LJIJ(31744, 2, "fb_social_prompt_rephrase_android", true) == 2) {
                            c1360520lVa = new C1360520lVa();
                            c1360520lVa.LJI(context.getString(2131849340));
                            c1360520lVa.LIZ.append((CharSequence) " ");
                            c1360520lVa.LIZLLL(charSequenceLIZ2);
                        } else {
                            c1360520lVa = new C1360520lVa();
                            c1360520lVa.LIZLLL(charSequenceLIZ2);
                        }
                        charSequenceLIZ = c1360520lVa.LIZ;
                    } else {
                        String string4 = context.getString(2131834355);
                        if (C0C64.LJIILLIIL().LJIJ(31744, 2, "fb_social_prompt_rephrase_android", true) == 2) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(string4);
                            sbLIZ2.append(' ');
                            sbLIZ2.append(strLIZIZ);
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        }
                        charSequenceLIZ = C0TIG.LIZ(context, string3, strLIZIZ);
                    }
                }
            }
        } else {
            C1070720dyA.LIZ.getClass();
            charSequenceLIZ = C1070720dyA.LIZ(c1072030e0H, true);
        }
        c1397580mTM.LIZIZ(charSequenceLIZ);
        C985403tE.LIZ(c1397580mTM, new AwS382S0200000_16(this, enumC1070340dxY, 37));
        c1397580mTM.LJII = false;
        c1397580mTM.LIZLLL(new AwS56S1300000_16(this, str, enumC1070340dxY, c2252611DEt, 1));
        c1397580mTM.LJ(new AwS130S1100000_16(this, str, 14));
        C1397510mTF c1397510mTF = new C1397510mTF(c1397580mTM);
        if (enumC1070340dxY == EnumC1070340dxY.FACEBOOK) {
            C0TIG.LIZ.getClass();
            TuxTextView tuxTextView = (TuxTextView) c1397510mTF.LJI(R.id.ewz);
            tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
            tuxTextView.setHighlightColor(0);
            tuxTextView.setTuxFont(41);
            tuxTextView.setTextColor(C960203pA.LIZ(R.attr.a1j, context));
        }
        C1391850mK7.LIZIZ(c1397510mTF, "access_facebook_email_dialog");
        c1397510mTF.LIZLLL();
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }
}
