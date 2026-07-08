package com.ss.android.ugc.aweme.commercialize.ba.impl.service;

import X.AbstractC1542100qES;
import X.AbstractC848400XPy;
import X.C013C;
import X.C04TD;
import X.C08JS;
import X.C09JN;
import X.C0C64;
import X.C0DHG;
import X.C0XQ7;
import X.C1029590ctp;
import X.C1029740cu4;
import X.C1044430dHl;
import X.C1050610dRj;
import X.C1050760dRy;
import X.C1050790dS1;
import X.C1050820dS4;
import X.C1050840dS6;
import X.C1050890dSB;
import X.C11S5;
import X.C1247510iZJ;
import X.C1247530iZL;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1390850mIV;
import X.C1391420mJQ;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1397620mTQ;
import X.C1537900q7g;
import X.C1541950qED;
import X.C1701940uOG;
import X.C19719212De;
import X.C19EG;
import X.C1AF0;
import X.C20642515q3;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C2429209fW;
import X.C341270DZl;
import X.C632670Orh;
import X.C786410Ut5;
import X.C985403tE;
import X.DialogC1389620mGW;
import X.EnumC1016560cYo;
import Y.AfS137S0200000_1;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentManager;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.api.BACouponApi;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.model.ExpandEmailAndPhone;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAProfilePageService;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.settings.BACouponEntranceSettingModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.AbsOpenResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commerce.BizAccountInfo;
import com.ss.android.ugc.aweme.commerce.BizAddress;
import com.ss.android.ugc.aweme.commerce.BizContactInfo;
import com.ss.android.ugc.aweme.commerce.CouponInfo;
import com.ss.android.ugc.aweme.commerce.LeadsGenModel;
import com.ss.android.ugc.aweme.commercialize.ba.impl.ui.BusinessPageFragment;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridContainerManager;
import com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.IProfileService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS225S0300000_16;
import kotlin.jvm.internal.AwS40S2100000_16;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class BAProfilePageServiceImpl implements IBAProfilePageService {
    public static IBAProfilePageService LJIIL() {
        Object objLIZ = C04TD.LIZ(IBAProfilePageService.class, false);
        if (objLIZ != null) {
            return (IBAProfilePageService) objLIZ;
        }
        if (C04TD.LLJLL == null) {
            synchronized (IBAProfilePageService.class) {
                if (C04TD.LLJLL == null) {
                    C04TD.LLJLL = new BAProfilePageServiceImpl();
                }
            }
        }
        return C04TD.LLJLL;
    }

    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAProfilePageService
    public final void LIZJ() {
        ((IAdHybridContainerManager) ServiceManager.get().getService(IAdHybridContainerManager.class)).LIZ(EnumC1016560cYo.SWITCH_TO_PROFILE, null, new C1029740cu4(null, null, null, null, null, null, false, 127), null);
    }

    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAProfilePageService
    public final ExpandEmailAndPhone LJIIIIZZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        ExpandEmailAndPhone expandEmailAndPhone = C1050840dS6.LIZ;
        ExpandEmailAndPhone expandEmailAndPhone2 = (ExpandEmailAndPhone) c0c64LJIILLIIL.LJJII(ExpandEmailAndPhone.class, expandEmailAndPhone, "ba_contact_setting", true);
        return expandEmailAndPhone2 != null ? expandEmailAndPhone2 : expandEmailAndPhone;
    }

    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAProfilePageService
    public final void LJI(C19EG c19eg) {
        String strLJI;
        User curUser;
        if (c19eg == null || !LJIIJJI(c19eg, "app")) {
            return;
        }
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if (iAccountUserServiceLJFF != null && (curUser = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUser()) != null && curUser.getAccountType() == 3) {
            new C1050610dRj().LJI("ttelite_BA_download_click_edit", new Pair<>("enter_from", "ba_profile"));
        }
        new Object() { // from class: X.0dS7
        }.getClass();
        String str = "aweme://webview/?url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Ftiktok_baca_fe%2Fdownload_app_link%3Fhide_nav_bar%3D1%26enter_from%3D((enter_from))%26locale%3D((locale))&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel%3Dbaca_fe%26bundle%3Dindex.js%26module_name%3Dpage_download_app_link%26hide_nav_bar%3D1%26enter_from%3D((enter_from))%26locale%3D((locale))";
        try {
            SettingsManager.LIZLLL().getClass();
            strLJI = SettingsManager.LJI("download_app_link_schema", "aweme://webview/?url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Ftiktok_baca_fe%2Fdownload_app_link%3Fhide_nav_bar%3D1%26enter_from%3D((enter_from))%26locale%3D((locale))&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel%3Dbaca_fe%26bundle%3Dindex.js%26module_name%3Dpage_download_app_link%26hide_nav_bar%3D1%26enter_from%3D((enter_from))%26locale%3D((locale))");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            strLJI = null;
        }
        if (!TextUtils.isEmpty(strLJI)) {
            str = strLJI;
        }
        String appLanguage = ((ISettingService) ServiceManager.get().getService(ISettingService.class)).getAppLanguage();
        if (appLanguage == null) {
            appLanguage = "";
        }
        SmartRouter.buildRoute(c19eg, u.LJJIFFI(str, "((locale))", appLanguage, false)).open();
    }

    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAProfilePageService
    public final boolean LJII(C19EG c19eg) {
        if (c19eg == null || !LJIIJJI(c19eg, "email")) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAProfilePageService
    public final void LJIIJ(C19EG c19eg) {
        if (c19eg == null) {
            return;
        }
        if (!LJIIJJI(c19eg, "address")) {
            new C1050610dRj().LJIILJJIL(CardStruct.IStatusCode.DEFAULT);
            return;
        }
        SettingsManager.LIZLLL().getClass();
        String strLJI = SettingsManager.LJI("ba_contact_address_schema", "");
        if (strLJI.length() > 0) {
            new C1050610dRj().LJIILJJIL("1");
            SmartRouter.buildRoute(c19eg, strLJI).open();
        }
    }

    public static boolean LJIIJJI(C19EG c19eg, String str) {
        BizAccountInfo bizAccountInfo;
        List<String> addedContactAndLinkList;
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        if (curUser == null || (bizAccountInfo = curUser.getBizAccountInfo()) == null || (addedContactAndLinkList = bizAccountInfo.getAddedContactAndLinkList()) == null || addedContactAndLinkList.size() < 3) {
            return true;
        }
        if (addedContactAndLinkList.size() == 3 && addedContactAndLinkList.contains(str)) {
            return true;
        }
        if (addedContactAndLinkList.size() > 3 && addedContactAndLinkList.contains(str)) {
            C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
            c1389890mGx.LJIIIZ(2131827218);
            c1389890mGx.LJIIJJI();
            new C1050610dRj().LJII("ttelite_ba_contact_ba_editprofile_adding_4_tools_warning", new String[0]);
            return true;
        }
        C1389890mGx c1389890mGx2 = new C1389890mGx(c19eg);
        c1389890mGx2.LJIIIZ(2131827218);
        c1389890mGx2.LJIIJJI();
        new C1050610dRj().LJII("ttelite_ba_contact_ba_editprofile_adding_4_tools_warning", new String[0]);
        return false;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAProfilePageService
    public final void LIZ(Context context, String str) {
        String strLJJIFFI;
        if (context == null) {
            return;
        }
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LJI("ba_profile_schema", "").length() == 0) {
            return;
        }
        switch (str.hashCode()) {
            case 3237038:
                if (!str.equals("info")) {
                    return;
                }
                SettingsManager.LIZLLL().getClass();
                strLJJIFFI = u.LJJIFFI(u.LJJIFFI(SettingsManager.LJI("ba_profile_schema", ""), "((page_action_type))", "1", false), "((enter_from))", "profile", false);
                break;
                break;
            case 1224335515:
                if (!str.equals("website")) {
                    return;
                }
                SettingsManager.LIZLLL().getClass();
                SmartRouter.buildRoute(context, u.LJJIFFI(u.LJJIFFI(SettingsManager.LJI("ba_profile_schema_popup", ""), "((page_action_type))", "3", false), "((enter_from))", "website", false)).open();
                return;
            case 1575275090:
                if (!str.equals("leads_from")) {
                    return;
                }
                if (C1044430dHl.LIZ().enable) {
                    strLJJIFFI = C1044430dHl.LIZ().profile;
                } else {
                    SettingsManager.LIZLLL().getClass();
                    strLJJIFFI = SettingsManager.LJI("get_leads_schema_settings", "aweme://lynxview/?channel=tiktok_ba_lynx_next&bundle=pages%2Fba%2Ftemplate.js&group=tiktok_ba_lynx_next&pageModule=lead-gen&webview_clear_color=1&dynamic=3&hide_nav_bar=1&use_bdx=1&trans_status_bar=1&hide_status_bar=0&enable_canvas=1&status_bar_color=00000000&surl=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Fba_lynx_next%2Ftiktok_ba_lynx_next%2Fpages%2Fba%2Ftemplate.js&enter_from=business_suite&createModel=3");
                    if (TextUtils.isEmpty(strLJJIFFI)) {
                        strLJJIFFI = "aweme://lynxview/?channel=tiktok_ba_lynx_next&bundle=pages%2Fba%2Ftemplate.js&group=tiktok_ba_lynx_next&pageModule=lead-gen&webview_clear_color=1&dynamic=3&hide_nav_bar=1&use_bdx=1&trans_status_bar=1&hide_status_bar=0&enable_canvas=1&status_bar_color=00000000&surl=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Fba_lynx_next%2Ftiktok_ba_lynx_next%2Fpages%2Fba%2Ftemplate.js&enter_from=business_suite&createModel=3";
                    }
                }
                break;
                break;
            case 1671764162:
                if (!str.equals("display")) {
                    return;
                }
                SettingsManager.LIZLLL().getClass();
                strLJJIFFI = u.LJJIFFI(u.LJJIFFI(SettingsManager.LJI("ba_profile_schema", ""), "((page_action_type))", "2", false), "((enter_from))", "profile", false);
                break;
                break;
            default:
                return;
        }
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(strLJJIFFI);
        sparkContext.LJJJJLL(new AbstractC1542100qES() { // from class: X.0dS2
            @Override // X.AbstractC1537870q7d
            public final void onDestroy() {
                C1440005kM.LIZ(new C1436405jm(false));
            }
        });
        c1537900q7g.getClass();
        new C1541950qED(context, sparkContext).LIZIZ();
    }

    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAProfilePageService
    public final BusinessPageFragment LJIIIZ(Function0 function0, boolean z) {
        BusinessPageFragment businessPageFragment = new BusinessPageFragment();
        businessPageFragment.LLJJIJI = z;
        businessPageFragment.LLJJIJIIJIL = function0;
        return businessPageFragment;
    }

    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAProfilePageService
    public final void LJFF(C19EG c19eg, String str, BizAccountInfo bizAccountInfo) {
        if (c19eg == null) {
            return;
        }
        if (!LJIIJJI(c19eg, "call")) {
            new C1050610dRj().LJIJI(CardStruct.IStatusCode.DEFAULT);
            return;
        }
        if (bizAccountInfo.enableEditPhone()) {
            SettingsManager.LIZLLL().getClass();
            String strLJI = SettingsManager.LJI("profile_phone_edit_schema", "aweme://webview/?use_spark=1&container_color_auto_dark=1&hide_nav_bar=1&use_forest=1&disable_ttnet_proxy=0&status_bar_color=00000000&trans_status_bar=1&url=https%3A%2F%2Flf19-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-tx%2F8%2Fgecko%2Fresource%2Ftiktok_ba_pia%2Fprofile-phone-edit.html%3F__pia_manifest__%3D%257B%2522page_name%2522%253A%2522profile-phone-edit%2522%252C%2522public_path%2522%253A%2522https%253A%252F%252Flf19-gecko-source.tiktokcdn.com%252Fobj%252Fbyte-gurd-source-tx%252F8%252Fgecko%252Fresource%252Ftiktok_ba_pia%252F%2522%252C%2522worker%2522%253Atrue%252C%2522nsr%2522%253Atrue%257D%26enter_from%3D((enter_from))");
            if (!TextUtils.isEmpty(str)) {
                strLJI = UriProtector.parse(strLJI).buildUpon().appendQueryParameter("phone", str).toString();
            }
            SmartRouter.buildRoute(c19eg, strLJI).open();
            new C1050610dRj().LJIJI("1");
            return;
        }
        C1397620mTQ c1397620mTQ = new C1397620mTQ(c19eg);
        c1397620mTQ.LJFF(2131821369, null);
        C1391420mJQ c1391420mJQ = new C1391420mJQ(c19eg);
        c1391420mJQ.LIZLLL(c19eg.getString(2131821370));
        c1391420mJQ.LIZJ(true);
        c1391420mJQ.LJ(new AwS591S0100000_12(c19eg, 1223));
        C1397580mTM c1397580mTM = new C1397580mTM(c19eg);
        c1397580mTM.LIZ(2131821371);
        c1397580mTM.LJIIL = c1397620mTQ;
        c1397580mTM.LJIIJJI = c1391420mJQ;
        c1397580mTM.LJII = false;
        new C1397510mTF(c1397580mTM).LIZLLL();
        new C1050610dRj().LJIJI(CardStruct.IStatusCode.DEFAULT);
    }

    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAProfilePageService
    public final void LIZIZ(Context context, LeadsGenModel leadsGenModel, User user, Aweme aweme) throws JSONException {
        String schema;
        String str;
        List<String> urlList;
        if (user == null || (schema = leadsGenModel.getSchema()) == null || context == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        String businessData = leadsGenModel.getBusinessData();
        if (businessData != null) {
            jSONObject.put("ixBusinessData", businessData);
        }
        Uri.Builder builderBuildUpon = UriProtector.parse(schema).buildUpon();
        C1050610dRj c1050610dRj = new C1050610dRj();
        c1050610dRj.LIZJ = 0;
        c1050610dRj.LJIIIZ(aweme);
        Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("enter_from", (String) c1050610dRj.LIZLLL("enter_from"));
        UrlModel avatarLarger = user.getAvatarLarger();
        if (avatarLarger != null && (urlList = avatarLarger.getUrlList()) != null) {
            str = (String) ListProtector.get(urlList, 0);
        } else {
            str = null;
        }
        String string = builderAppendQueryParameter.appendQueryParameter("avatar", str).appendQueryParameter("name", user.getNickname()).appendQueryParameter("title", leadsGenModel.getActionName()).appendQueryParameter("ba_uid", user.getUid()).appendQueryParameter("is_ad", String.valueOf(new C1050610dRj().LIZLLL("is_ad"))).toString();
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(string);
        sparkContext.LJJJZ("initialData", C786410Ut5.J3(jSONObject));
        c1537900q7g.getClass();
        new C1541950qED(context, sparkContext).LIZIZ();
        new C1050610dRj().LJJII(user, aweme, 0, 1);
    }

    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAProfilePageService
    public final void LIZLLL(final Context context, final Aweme aweme, final User user, final CouponInfo couponInfo) {
        List<String> second;
        String uid;
        String nickname;
        if (context == null) {
            return;
        }
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        BACouponEntranceSettingModel bACouponEntranceSettingModel = C1050820dS4.LIZ;
        BACouponEntranceSettingModel bACouponEntranceSettingModel2 = (BACouponEntranceSettingModel) settingsManagerLIZLLL.LJIIIIZZ("ba_coupon_entrance_setting", BACouponEntranceSettingModel.class, bACouponEntranceSettingModel);
        if (bACouponEntranceSettingModel2 != null) {
            bACouponEntranceSettingModel = bACouponEntranceSettingModel2;
        }
        int i = 0;
        int followStatus = -1;
        if (Intrinsics.LJFF(bACouponEntranceSettingModel.getEnable(), Boolean.TRUE) && !TextUtils.isEmpty(bACouponEntranceSettingModel.getSchema())) {
            String schema = bACouponEntranceSettingModel.getSchema();
            if (schema != null) {
                SparkContext sparkContext = new SparkContext();
                sparkContext.LJJLIIJ(schema);
                if (user != null) {
                    followStatus = user.getFollowStatus();
                }
                sparkContext.LJJJLZIJ(followStatus, "follow_status");
                String str = "";
                if (user == null || (uid = user.getUid()) == null) {
                    uid = "";
                }
                sparkContext.LJJJZ("author_id", uid);
                if (user != null && (nickname = user.getNickname()) != null) {
                    str = nickname;
                }
                sparkContext.LJJJZ("author_name", str);
                if (aweme != null) {
                    if (!AwemeExtKt.isAdTraffic(aweme) && !AwemeExtKt.isPseudoAd(aweme)) {
                        i = 1;
                    }
                    sparkContext.LJJJLZIJ(i, "is_organic");
                    sparkContext.LJJJZ("item_id", aweme.getAid());
                }
                C1541950qED.LIZJ.getClass();
                new C1541950qED(context, sparkContext).LIZIZ();
                return;
            }
            return;
        }
        C1050760dRy c1050760dRy = C1050760dRy.LIZ;
        boolean followersOnly = couponInfo.getFollowersOnly();
        c1050760dRy.getClass();
        if (followersOnly) {
            if (user != null && user.getFollowStatus() == -1) {
                return;
            }
            String currentUserID = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
            if (user != null && user.getFollowStatus() == 0 && !Intrinsics.LJFF(user.getUid(), currentUserID)) {
                String strLJJIFFI = u.LJJIFFI(C20642515q3.LJI(2131858012), "{Name}", user.getNickname(), false);
                String strLJJIFFI2 = u.LJJIFFI(C20642515q3.LJI(2131858011), "{Name}", user.getNickname(), false);
                if (C0DHG.LIZ() && C1388190mED.LIZ(context) != null) {
                    C632670Orh.LIZIZ(context, new C19719212De(-2050190594, new C341270DZl(strLJJIFFI, strLJJIFFI2), true));
                } else {
                    C1397580mTM c1397580mTM = new C1397580mTM(context);
                    c1397580mTM.LJI(strLJJIFFI);
                    c1397580mTM.LIZIZ(strLJJIFFI2);
                    C985403tE.LIZ(c1397580mTM, AFwS252S0000000_16.get$arr$(0));
                    c1397580mTM.LJII = false;
                    new C1397510mTF(c1397580mTM).LIZLLL();
                }
                C1050610dRj c1050610dRj = new C1050610dRj();
                c1050610dRj.LJIIIZ(user);
                c1050610dRj.LJII("ttelite_user_coupon_follow_show", "to_user_id", "from_user_id");
                if (TextUtils.equals(C1050760dRy.LIZIZ.getFirst(), currentUserID)) {
                    second = C1050760dRy.LIZIZ.getSecond();
                } else {
                    Pair<String, ? extends List<String>> pair = new Pair<>(currentUserID, new ArrayList());
                    C1050760dRy.LIZIZ = pair;
                    second = pair.getSecond();
                }
                if (second.contains(user.getUid())) {
                    return;
                }
                second.add(user.getUid());
                return;
            }
        }
        if (couponInfo.getReceivedId() == null) {
            final DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(context);
            dialogC1389620mGW.LJJLJ(2131835638);
            dialogC1389620mGW.LJJLIIJ(true);
            C786410Ut5.J4(dialogC1389620mGW);
            BACouponApi.LIZ.getClass();
            C1050790dS1.LIZ().LIZIZ(String.valueOf(couponInfo.getCouponId())).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0dS0
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("HandleClickOnProfile@337f.clickCouponOnRequestReceive$1");
                    BACouponApi.ReceiveResponse receiveResponse = (BACouponApi.ReceiveResponse) obj;
                    C786410Ut5.LJIIJ(dialogC1389620mGW);
                    if (receiveResponse.statusCode == 0 && C123100dR.LIZ(receiveResponse.getReceivedID())) {
                        couponInfo.setReceivedId(receiveResponse.getReceivedID());
                        C1050760dRy c1050760dRy2 = C1050760dRy.LIZ;
                        Context context2 = context;
                        Aweme aweme2 = aweme;
                        User user2 = user;
                        CouponInfo couponInfo2 = couponInfo;
                        c1050760dRy2.getClass();
                        C1050760dRy.LJ(context2, aweme2, user2, couponInfo2);
                    } else if (receiveResponse.statusCode == 3019030) {
                        if (C0DHG.LIZ() && C1388190mED.LIZ(context) != null) {
                            C632670Orh.LIZIZ(context, C341260DZk.LIZ);
                        } else {
                            C1397580mTM c1397580mTM2 = new C1397580mTM(context);
                            c1397580mTM2.LJFF(2131858015);
                            c1397580mTM2.LIZ(2131858014);
                            C985403tE.LIZ(c1397580mTM2, AFwS252S0000000_16.get$arr$(1));
                            c1397580mTM2.LJII = false;
                            new C1397510mTF(c1397580mTM2).LIZLLL();
                        }
                        C1050610dRj c1050610dRj2 = new C1050610dRj();
                        c1050610dRj2.LJIIIZ(user, aweme, couponInfo);
                        c1050610dRj2.LJII("ttelite_user_coupon_out_of_stock_show", "to_user_id", "from_user_id", "code", "coupon_id");
                    } else {
                        Activity activityLIZ = C1388190mED.LIZ(context);
                        if (activityLIZ != null) {
                            String str2 = receiveResponse.statusMsg;
                            if (str2 != null && C123100dR.LIZ(str2)) {
                                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                                c1389890mGx.LJIIJ(str2);
                                c1389890mGx.LIZ(true);
                                c1389890mGx.LJIIJJI();
                            } else {
                                C1050760dRy c1050760dRy3 = C1050760dRy.LIZ;
                                C1389890mGx c1389890mGx2 = new C1389890mGx(activityLIZ);
                                c1389890mGx2.LJIIIZ(2131822154);
                                c1389890mGx2.LIZ(true);
                                c1389890mGx2.LJIIJJI();
                            }
                        }
                    }
                    C1C7U.LIZIZ("HandleClickOnProfile@337f.clickCouponOnRequestReceive$1");
                }
            }, new AfS137S0200000_1(context, dialogC1389620mGW, 0));
            return;
        }
        C1050760dRy.LJ(context, aweme, user, couponInfo);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAProfilePageService
    public final boolean LJ(Context context, int i, String str, Aweme aweme, String str2, String str3, Integer num) {
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        C19EG c19egLIZIZ2;
        FragmentManager supportFragmentManager2;
        int iIntValue;
        String str4;
        String str5;
        String str6 = "402657282";
        boolean zLJ = false;
        switch (i) {
            case 1:
                C1050760dRy.LIZ.getClass();
                if (u.LJJIIJZLJL(str, "https://", false) || str == null) {
                    String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                    if (context == null) {
                        return true;
                    }
                    C1537900q7g c1537900q7g = C1541950qED.LIZJ;
                    SparkContext sparkContext = new SparkContext();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("aweme://webview/?url=");
                    sbLIZ.append(Uri.encode(str));
                    sbLIZ.append("&use_spark=1&bid=bio_link_scene&enable_runtime_switch=0&target_handler=crossPlatform&nav_btn_type=more");
                    sparkContext.LJJLIIJ(C2188811AlT.LIZIZ(sbLIZ));
                    ISandboxService iSandboxServiceLIZ = C2429209fW.LIZ();
                    Bundle bundle = sparkContext.bundle;
                    Object obj = str6;
                    if (num != null) {
                        obj = num;
                    }
                    sparkContext.LJJJJL(iSandboxServiceLIZ.appendDataFlowId(bundle, obj.toString()));
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 402657282;
                    }
                    sparkContext.bizCert = new ThirdPartyBizCert(iIntValue);
                    if (str2 == null) {
                        str4 = "";
                    } else {
                        str4 = str2;
                    }
                    sparkContext.LJJJZ("owner_id", str4);
                    sparkContext.LJJJZ("enter_from", "biolink_profile_page");
                    sparkContext.LJJJZ("report_type", "bio_link");
                    sparkContext.LJJJLZIJ(0, "page_depth_of_report_show");
                    sparkContext.LJJJZ("sec_link_scene", "bio_url");
                    sparkContext.LJJL("need_sec_link", true);
                    sparkContext.LJJL("need_report", true);
                    sparkContext.LJJLIIIJLLLLLLLZ(((IProfileService) ServiceManager.get().getService(IProfileService.class)).getProfileBioLinkTitleBarProvider());
                    if (TextUtils.equals(curUserId, str2)) {
                        str5 = "personal_homepage";
                    } else {
                        str5 = "others_homepage";
                    }
                    sparkContext.LJJJZ("previous_page", str5);
                    sparkContext.LJJJZ("bio_url", str);
                    sparkContext.LJJJJZ(new C1050890dSB());
                    c1537900q7g.getClass();
                    new C1541950qED(context, sparkContext).LIZIZ();
                    return true;
                }
                return false;
            case 2:
                C1050760dRy.LIZ.getClass();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("mailto:");
                sbLIZ2.append(str);
                Intent intent = new Intent("android.intent.action.SENDTO", UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ2)));
                C2429209fW.LIZ().appendDataFlowId(intent, 1207964163);
                if (context == null) {
                    return true;
                }
                try {
                    if (intent.resolveActivity(context.getPackageManager()) != null) {
                        C1050760dRy.LIZ(context, intent);
                        return true;
                    }
                    C1050760dRy.LIZIZ(C1388190mED.LIZ(context));
                    return true;
                } catch (ActivityNotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1050760dRy c1050760dRy = C1050760dRy.LIZ;
                    Activity activityLIZ = C1388190mED.LIZ(context);
                    c1050760dRy.getClass();
                    C1050760dRy.LIZIZ(activityLIZ);
                    C1AF0.LJ(e);
                }
                break;
                break;
            case 3:
                C1050760dRy c1050760dRy2 = C1050760dRy.LIZ;
                BizContactInfo bizContactInfo = (BizContactInfo) C08JS.LIZ(str3, BizContactInfo.class);
                c1050760dRy2.getClass();
                if (bizContactInfo != null) {
                    if (Intrinsics.LJFF(bizContactInfo.getCall(), Boolean.TRUE)) {
                        if (Intrinsics.LJFF(bizContactInfo.getText(), Boolean.TRUE)) {
                            C1390850mIV c1390850mIV = new C1390850mIV();
                            C1247510iZJ c1247510iZJ = new C1247510iZJ();
                            c1247510iZJ.LIZIZ(2131829472);
                            c1247510iZJ.LJFF = str;
                            c1247510iZJ.LIZ(new AwS40S2100000_16(context, str2, str, 0));
                            C1247510iZJ c1247510iZJ2 = new C1247510iZJ();
                            c1247510iZJ2.LIZIZ(2131829478);
                            c1247510iZJ2.LJFF = str;
                            c1247510iZJ2.LIZ(new AwS40S2100000_16(context, str2, str, 1));
                            c1390850mIV.LIZIZ(c1247510iZJ, c1247510iZJ2);
                            TuxActionSheet tuxActionSheetLIZJ = c1390850mIV.LIZJ();
                            Activity activityLJFF = C2214201BlK.LJFF();
                            if (activityLJFF != null && (c19egLIZIZ2 = C1388190mED.LIZIZ(activityLJFF)) != null && (supportFragmentManager2 = c19egLIZIZ2.getSupportFragmentManager()) != null) {
                                tuxActionSheetLIZJ.show(supportFragmentManager2, (String) null);
                                return true;
                            }
                            return false;
                        }
                    } else if (bizContactInfo != null) {
                    }
                    if (Intrinsics.LJFF(bizContactInfo.getCall(), Boolean.TRUE)) {
                        return C1050760dRy.LIZJ(context, str);
                    }
                    if (bizContactInfo != null && Intrinsics.LJFF(bizContactInfo.getText(), Boolean.TRUE)) {
                        return C1050760dRy.LIZLLL(context, str);
                    }
                }
                return C1050760dRy.LIZJ(context, str);
            case 4:
                C1050760dRy.LIZ.getClass();
                Uri uri = UriProtector.parse(str);
                if (C1029590ctp.LJ().LJIIIIZZ().LIZJ(uri) && C1029590ctp.LJ().LJIIIIZZ().LIZLLL(context)) {
                    zLJ = C1029590ctp.LJ().LJIIIIZZ().LJ(context, uri);
                }
                final C013C c013c = new C013C();
                if (!zLJ) {
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://webview/");
                    smartRouteBuildRoute.withCallback(new AbsOpenResultCallback() { // from class: X.0dS5
                        @Override // com.bytedance.router.AbsOpenResultCallback, com.bytedance.router.OpenResultCallback
                        public final void onSuccess(Intent intent2) {
                            c013c.element = true;
                        }

                        @Override // com.bytedance.router.AbsOpenResultCallback, com.bytedance.router.OpenResultCallback
                        public final void onFail(String str7, String str8) {
                            c013c.element = false;
                        }
                    });
                    smartRouteBuildRoute.withParam("url", str);
                    ISandboxService iSandboxServiceLIZ2 = C2429209fW.LIZ();
                    Bundle bundle2 = new Bundle();
                    Object obj2 = num;
                    if (num == null) {
                        obj2 = "402657282";
                    }
                    smartRouteBuildRoute.withParam(iSandboxServiceLIZ2.appendDataFlowId(bundle2, obj2.toString()));
                    smartRouteBuildRoute.withParam("use_webview_title", true);
                    smartRouteBuildRoute.open();
                }
                return c013c.element;
            case 5:
                C1050760dRy c1050760dRy3 = C1050760dRy.LIZ;
                BizAddress bizAddress = (BizAddress) C08JS.LIZ(str, BizAddress.class);
                c1050760dRy3.getClass();
                C1390850mIV c1390850mIV2 = new C1390850mIV();
                c1390850mIV2.LJII(2131858007);
                C1247530iZL c1247530iZL = new C1247530iZL();
                c1247530iZL.LIZIZ(2131858008);
                c1247530iZL.LIZJ(R.raw.icon_arrow_up_right_ltr);
                c1247530iZL.LIZ(new AwS225S0300000_16(context, bizAddress, aweme, 0));
                c1390850mIV2.LIZ(c1247530iZL);
                TuxActionSheet tuxActionSheetLIZJ2 = c1390850mIV2.LIZJ();
                Activity activityLJFF2 = C2214201BlK.LJFF();
                if (activityLJFF2 != null && (c19egLIZIZ = C1388190mED.LIZIZ(activityLJFF2)) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                    tuxActionSheetLIZJ2.show(supportFragmentManager, "BAOpenMapsSheet");
                    return true;
                }
                return false;
            case 6:
                C1050760dRy.LIZ.getClass();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("aweme://chat/message?uid=");
                sbLIZ3.append(str);
                SmartRouter.buildRoute(context, C2188811AlT.LIZIZ(sbLIZ3)).open();
                return true;
            default:
                return false;
        }
    }
}
