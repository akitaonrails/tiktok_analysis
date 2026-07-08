package com.ss.android.ugc.profile.business.profile.biolink;

import X.C01GW;
import X.C08JS;
import X.C0OBG;
import X.C0WZX;
import X.C1047050dLz;
import X.C1066700drg;
import X.C1066710drh;
import X.C123100dR;
import X.C1247530iZL;
import X.C1251350ifV;
import X.C1253930ijf;
import X.C1254160ik2;
import X.C1254290ikF;
import X.C1254430ikT;
import X.C1254440ikU;
import X.C1254510ikb;
import X.C1266310j3d;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1390850mIV;
import X.C13LP;
import X.C1537900q7g;
import X.C1541950qED;
import X.C1554300qY8;
import X.C1701330uNH;
import X.C1721460utk;
import X.C178200mK;
import X.C19EG;
import X.C1BHW;
import X.C1ECD;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2273111Dy9;
import X.C2277041EAs;
import X.C2344009Gk;
import X.C2429209fW;
import X.C259800zU;
import X.C452501pT;
import X.C698190Ra5;
import X.C844470XAv;
import X.EnumC1216830hlp;
import X.EnumC1216860hls;
import X.EnumC1248370iah;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.hybrid.spark.third.router.SeclinkConfig;
import com.bytedance.hybrid.spark.third.router.SparkThirdContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM;
import com.ss.android.ugc.profile.business.profile.ProfileBioLinkData;
import com.ss.android.ugc.profile.business.profile.ProfileLinkData;
import com.ss.android.ugc.profile.business.ur.experiment.BioLinkReportConfig;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.base.data.Icon;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.UserAccountInfo;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AwS263S0300000_19;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes20.dex */
public final class BioStructuralLinkProtocol extends ProfilePlatformProtocol<ProfileBioLinkData> {
    public long LLJJJIL;
    public boolean LLJJJJ;
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2090));

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "bio_structural_link";
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0101  */
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.profile.biolink.BioStructuralLinkProtocol.LIZLLL():void");
    }

    public final String LJJZZI() {
        String uid;
        UserProfileInfo userProfileInfo;
        Uri uri = UriProtector.parse((String) C2277041EAs.LJ.getValue());
        ConcurrentHashMap concurrentHashMapLIZ = C178200mK.LIZ(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "landing_config"));
        if (concurrentHashMapLIZ != null) {
            ProfileCommonInfo profileCommonInfoLJIILIIL = LJIILIIL();
            if (profileCommonInfoLJIILIIL == null || (userProfileInfo = profileCommonInfoLJIILIIL.getUserProfileInfo()) == null || (uid = userProfileInfo.getUid()) == null) {
                uid = "";
            }
            concurrentHashMapLIZ.putIfAbsent("recommend_user_id", uid);
        }
        String strLIZIZ = C178200mK.LIZIZ(concurrentHashMapLIZ);
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.clearQuery();
        for (String str : UriProtector.getQueryParameterNames(uri)) {
            if (!Intrinsics.LJFF(str, "landing_config")) {
                builderBuildUpon.appendQueryParameter(str, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str));
            }
        }
        if (strLIZIZ != null && strLIZIZ.length() != 0) {
            builderBuildUpon.appendQueryParameter("landing_config", strLIZIZ);
        }
        return Uri.encode(builderBuildUpon.build().toString());
    }

    public final Map<String, String> LJLI() {
        String uid;
        UserProfileInfo userProfileInfo;
        C1251350ifV state;
        Aweme aweme;
        String aid;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
        if (iProfilePlatformVM != null && (state = iProfilePlatformVM.getState()) != null && (aweme = state.LLJILJILJ) != null && (aid = aweme.getAid()) != null) {
            linkedHashMap.put("aweme_id", aid);
        }
        ProfileCommonInfo profileCommonInfoLJIILIIL = LJIILIIL();
        if (profileCommonInfoLJIILIIL == null || (userProfileInfo = profileCommonInfoLJIILIIL.getUserProfileInfo()) == null || (uid = userProfileInfo.getUid()) == null) {
            uid = "";
        }
        linkedHashMap.put("owner_id", uid);
        linkedHashMap.put("enter_from", "biolink_profile_page");
        linkedHashMap.put("report_type", "bio_link");
        linkedHashMap.put("page_depth_of_report_show", String.valueOf(C1254290ikF.LIZ()));
        linkedHashMap.put("previous_page", Intrinsics.LJFF(LJLIIIL(), Boolean.TRUE) ? "personal_homepage" : "others_homepage");
        return linkedHashMap;
    }

    public final Boolean LJLIIIL() {
        return (Boolean) this.LLJJJJJIL.getValue();
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        C19EG activity;
        FragmentManager supportFragmentManager;
        Integer numValueOf;
        List<ProfileLinkData> profileLinks;
        ProfileBioLinkData profileBioLinkData;
        List<ProfileLinkData> profileLinks2;
        String localIcon;
        Integer numValueOf2;
        int iIntValue;
        String remoteText;
        String backupUrl;
        C698190Ra5 c698190Ra5LIZJ;
        if (C0OBG.LIZIZ(this.LLILZLL)) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        User userVQ2 = null;
        if (this.LLJILJIL != 0 && getContext() != null && (profileBioLinkData = (ProfileBioLinkData) this.LLJILJIL) != null && (profileLinks2 = profileBioLinkData.getProfileLinks()) != null) {
            for (ProfileLinkData profileLinkData : profileLinks2) {
                Integer profileLinkId = profileLinkData.getProfileLinkId();
                EnumC1216830hlp enumC1216830hlp = EnumC1216830hlp.TWITTER;
                enumC1216830hlp.getType();
                if (profileLinkId != null) {
                    profileLinkId.intValue();
                }
                Integer profileLinkId2 = profileLinkData.getProfileLinkId();
                int type = enumC1216830hlp.getType();
                if (profileLinkId2 == null || profileLinkId2.intValue() != type) {
                    C1247530iZL c1247530iZL = new C1247530iZL();
                    Icon icon = profileLinkData.getIcon();
                    if (icon != null) {
                        localIcon = icon.getLocalIcon();
                    } else {
                        localIcon = null;
                    }
                    Context context = getContext();
                    if (context != null && (c698190Ra5LIZJ = C1721460utk.LIZJ(context, localIcon, null, "bio_profile_link", "")) != null) {
                        numValueOf2 = Integer.valueOf(c698190Ra5LIZJ.LIZ);
                    } else {
                        numValueOf2 = null;
                    }
                    if (numValueOf2 != null) {
                        iIntValue = numValueOf2.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    c1247530iZL.LIZJ(iIntValue);
                    Describe text = profileLinkData.getText();
                    if (text == null || (remoteText = text.getRemoteText()) == null) {
                        remoteText = "";
                    }
                    c1247530iZL.LIZ = remoteText;
                    c1247530iZL.LIZ(new AwS385S0200000_19(this, profileLinkData, 98));
                    Integer profileLinkId3 = profileLinkData.getProfileLinkId();
                    int type2 = EnumC1216830hlp.WEBSITE.getType();
                    if (profileLinkId3 != null && profileLinkId3.intValue() == type2 && ((backupUrl = profileLinkData.getBackupUrl()) == null || backupUrl.length() == 0)) {
                        c1247530iZL.LIZLLL = false;
                    } else {
                        c1247530iZL.LIZLLL = true;
                    }
                    arrayList.add(c1247530iZL);
                }
            }
        }
        Fragment fragment = this.LLILZ;
        if (fragment != null && (activity = fragment.getActivity()) != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            C1390850mIV c1390850mIV = new C1390850mIV();
            c1390850mIV.LJFF(arrayList);
            c1390850mIV.LIZ.LLJJJ = 1;
            c1390850mIV.LIZJ().show(supportFragmentManager, "third social");
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", this.LLJJIJIL);
            ProfileBioLinkData profileBioLinkData2 = (ProfileBioLinkData) this.LLJILJIL;
            if (profileBioLinkData2 != null && (profileLinks = profileBioLinkData2.getProfileLinks()) != null) {
                numValueOf = Integer.valueOf(profileLinks.size());
            } else {
                numValueOf = null;
            }
            c2344009Gk.LJ(numValueOf, "link_num");
            c2344009Gk.LJIIIIZZ("website_order", LJL(EnumC1216830hlp.WEBSITE.getType()));
            c2344009Gk.LJIIIIZZ("youtube_order", LJL(EnumC1216830hlp.YOUTUBE.getType()));
            c2344009Gk.LJIIIIZZ("instagram_order", LJL(EnumC1216830hlp.INSTAGRAM.getType()));
            c2344009Gk.LJIIIIZZ("twitter_order", LJL(EnumC1216830hlp.TWITTER.getType()));
            c2344009Gk.LJIIIIZZ("lemon8_order", LJL(EnumC1216830hlp.LEMON8.getType()));
            C20684815ws.LJIILLIIL("profile_biolink_list_unfold", c2344009Gk.LIZ);
            C1253930ijf c1253930ijf = C1253930ijf.LIZ;
            IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
            if (iProfilePlatformVM != null) {
                userVQ2 = iProfilePlatformVM.vQ2();
            }
            c1253930ijf.getClass();
            C1253930ijf.LIZ(userVQ2, "weblink");
        }
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LJJJLZIJ(n nVar) {
        this.LLJILJIL = (T) C08JS.LIZ(nVar.toString(), ProfileBioLinkData.class);
    }

    public final boolean LJJLJLI(ProfileLinkData profileLinkData) {
        ProfileCommonInfo profileCommonInfoLJIILIIL;
        UserProfileInfo userProfileInfo;
        boolean z;
        String url = profileLinkData.getUrl();
        if (url != null) {
            C1254510ikb.LIZ.getClass();
            if (C1254510ikb.LIZ(url) && (profileCommonInfoLJIILIIL = LJIILIIL()) != null && (userProfileInfo = profileCommonInfoLJIILIIL.getUserProfileInfo()) != null && userProfileInfo.getUid() != null) {
                C1254430ikT c1254430ikT = C1254430ikT.LIZ;
                String str = this.LLJJIJIL;
                Integer bioLinkClickAction = profileLinkData.getBioLinkClickAction();
                EnumC1216860hls enumC1216860hls = EnumC1216860hls.ALLOW;
                int value = enumC1216860hls.getValue();
                if (bioLinkClickAction != null && bioLinkClickAction.intValue() == value) {
                    z = true;
                } else {
                    z = false;
                }
                c1254430ikT.getClass();
                C1254430ikT.LIZ(str, z);
                Integer bioLinkClickAction2 = profileLinkData.getBioLinkClickAction();
                int value2 = enumC1216860hls.getValue();
                if (bioLinkClickAction2 != null && bioLinkClickAction2.intValue() == value2) {
                    C1254510ikb.LIZIZ(url, new C1254440ikU(true, this.LLJJIJIL));
                    return true;
                }
                C1254430ikT.LIZIZ(0, this.LLJJIJIL, false);
            }
        }
        return false;
    }

    public final void LJJLL(Context context) {
        if (context == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.LLJJJIL < 3000) {
            return;
        }
        this.LLJJJIL = jCurrentTimeMillis;
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LIZLLL(2000L);
            c1389890mGx.LJIIIZ(2131830512);
            c1389890mGx.LJIIJJI();
        }
    }

    public final String LJL(int i) {
        List<ProfileLinkData> profileLinks;
        List<ProfileLinkData> profileLinks2;
        ProfileBioLinkData profileBioLinkData = (ProfileBioLinkData) this.LLJILJIL;
        Integer numValueOf = null;
        if (profileBioLinkData != null && (profileLinks = profileBioLinkData.getProfileLinks()) != null) {
            Iterator<ProfileLinkData> it2 = profileLinks.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ProfileLinkData next = it2.next();
                Integer profileLinkId = next.getProfileLinkId();
                if (profileLinkId != null && profileLinkId.intValue() == i) {
                    if (next != null) {
                        ProfileBioLinkData profileBioLinkData2 = (ProfileBioLinkData) this.LLJILJIL;
                        if (profileBioLinkData2 != null && (profileLinks2 = profileBioLinkData2.getProfileLinks()) != null) {
                            Iterator<ProfileLinkData> it3 = profileLinks2.iterator();
                            int i2 = 0;
                            while (true) {
                                if (it3.hasNext()) {
                                    Integer profileLinkId2 = it3.next().getProfileLinkId();
                                    if (profileLinkId2 != null && profileLinkId2.intValue() == i) {
                                        break;
                                    }
                                    i2++;
                                } else {
                                    i2 = -1;
                                    break;
                                }
                            }
                            numValueOf = Integer.valueOf(i2 + 1);
                        }
                        return String.valueOf(numValueOf);
                    }
                }
            }
        }
        return null;
    }

    public final void LJLJJLL(ProfileLinkData profileLinkData) {
        Context context;
        BioLinkReportConfig bioLinkReportConfig;
        String uid;
        String str;
        String str2;
        UserProfileInfo userProfileInfo;
        C1251350ifV state;
        Aweme aweme;
        String aid;
        UserAccountInfo userAccountInfo;
        Integer accountType;
        UserProfileInfo userProfileInfo2;
        if (!LJJLJLI(profileLinkData) && (context = getContext()) != null) {
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJJJL(C2429209fW.LIZ().appendDataFlowId(sparkContext.bundle, "402665472"));
            sparkContext.bizCert = new ThirdPartyBizCert(402665472);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("aweme://webview/?url=");
            String backupUrl = profileLinkData.getBackupUrl();
            String str3 = "";
            if (backupUrl == null) {
                backupUrl = "";
            }
            sbLIZ.append(Uri.encode(backupUrl));
            sbLIZ.append("&use_spark=1&bid=bio_link_scene&enable_runtime_switch=0&target_handler=crossPlatform");
            sparkContext.LJJLIIJ(C2188811AlT.LIZIZ(sbLIZ));
            try {
                SettingsManager.LIZLLL().getClass();
                bioLinkReportConfig = (BioLinkReportConfig) SettingsManager.LJII("bio_link_report_config", BioLinkReportConfig.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                bioLinkReportConfig = null;
            }
            if (bioLinkReportConfig == null || bioLinkReportConfig.isBioLinkReportShow()) {
                IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
                if (iProfilePlatformVM != null && (state = iProfilePlatformVM.getState()) != null && (aweme = state.LLJILJILJ) != null && (aid = aweme.getAid()) != null) {
                    sparkContext.LJJJZ("aweme_id", aid);
                }
                ProfileCommonInfo profileCommonInfoLJIILIIL = LJIILIIL();
                if (profileCommonInfoLJIILIIL == null || (userProfileInfo = profileCommonInfoLJIILIIL.getUserProfileInfo()) == null || (uid = userProfileInfo.getUid()) == null) {
                    uid = "";
                }
                sparkContext.LJJJZ("owner_id", uid);
                sparkContext.LJJJZ("enter_from", "biolink_profile_page");
                sparkContext.LJJJZ("report_type", "bio_link");
                sparkContext.LJJJLZIJ(C1254290ikF.LIZ(), "page_depth_of_report_show");
                sparkContext.LJJJZ("sec_link_scene", "bio_url");
                sparkContext.LJJL("need_sec_link", true);
                if (C2273111Dy9.LIZ()) {
                    str = "more";
                } else {
                    str = "report";
                }
                sparkContext.LJJJZ("nav_btn_type", str);
                sparkContext.LJJL("need_report", true);
                sparkContext.LJJJZ("title", context.getString(2131848751));
                if (C2273111Dy9.LIZ()) {
                    sparkContext.LJJLIIIJLLLLLLLZ(new C1047050dLz());
                    if (Intrinsics.LJFF(LJLIIIL(), Boolean.TRUE)) {
                        str2 = "personal_homepage";
                    } else {
                        str2 = "others_homepage";
                    }
                    sparkContext.LJJJZ("previous_page", str2);
                    String url = profileLinkData.getUrl();
                    if (url == null) {
                        url = "";
                    }
                    sparkContext.LJJJZ("bio_url", url);
                }
            }
            Integer bioLinkClickAction = profileLinkData.getBioLinkClickAction();
            int value = EnumC1216860hls.ALLOW.getValue();
            if (bioLinkClickAction != null && bioLinkClickAction.intValue() == value) {
                int i = C2187451AjH.LIZ;
                ProfileCommonInfo profileCommonInfoLJIILIIL2 = LJIILIIL();
                if (profileCommonInfoLJIILIIL2 != null && (userProfileInfo2 = profileCommonInfoLJIILIIL2.getUserProfileInfo()) != null && userProfileInfo2.getUid() != null) {
                    C1254510ikb c1254510ikb = C1254510ikb.LIZ;
                    C1254440ikU c1254440ikU = new C1254440ikU(false, this.LLJJIJIL);
                    c1254510ikb.getClass();
                    sparkContext.LJJJJZ(new C1266310j3d(c1254440ikU, 1));
                }
            } else {
                ProfileCommonInfo profileCommonInfoLJIILIIL3 = LJIILIIL();
                if ((profileCommonInfoLJIILIIL3 == null || (userAccountInfo = profileCommonInfoLJIILIIL3.getUserAccountInfo()) == null || (accountType = userAccountInfo.getAccountType()) == null || accountType.intValue() != 3) && profileLinkData.getUrl() != null) {
                    IComplianceBusinessService iComplianceBusinessServiceLJI = ComplianceServiceProvider.LJI();
                    String url2 = profileLinkData.getUrl();
                    if (url2 != null) {
                        str3 = url2;
                    }
                    if (iComplianceBusinessServiceLJI.LJ(str3)) {
                        sparkContext.LJJJJZ(new C1266310j3d(this, 2));
                    }
                }
            }
            c1537900q7g.getClass();
            new C1541950qED(context, sparkContext).LIZIZ();
        }
    }

    public final int LJLL(String str) {
        if (str != null) {
            try {
                String strLJJIFFI = u.LJJIFFI(str, "0x", "", false);
                if (strLJJIFFI != null) {
                    CharsKt__CharJVMKt.checkRadix(16);
                    return CastIntegerProtector.parseInt(strLJJIFFI, 16);
                }
                return 402665472;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return 402665472;
            }
        }
        return 402665472;
    }

    public static void LJJLIIIJLJLI(Context context, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5vpjsCmOQvxKkBTraMbyDi95RG+wa/EUEyXpgc2LVgkix0TjL5k5M8NZk=", null));
    }

    public final void LJLILLLLZI(Context context, String str) {
        String strLIZIZ;
        String strLIZ = C1ECD.LIZ();
        if (C123100dR.LIZ(strLIZ) && strLIZ != null) {
            if (a0.LJJIIZI(str, "?", false)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append("&tt_ab_version_id=");
                sbLIZ.append(strLIZ);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append("?tt_ab_version_id=");
                sbLIZ2.append(strLIZ);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            LJLJI(context, strLIZIZ);
            return;
        }
        LJLJI(context, str);
    }

    public final void LJLJI(Context context, String str) {
        String str2;
        C1254160ik2 c1254160ik2 = C1254160ik2.LIZIZ;
        if (Intrinsics.LJFF(LJLIIIL(), Boolean.TRUE)) {
            str2 = "personal_homepage";
        } else {
            str2 = "others_homepage";
        }
        c1254160ik2.LJIILLIIL(str2, "in_app_viewer", "", "", "", "");
        C1066710drh c1066710drh = new C1066710drh(str);
        Map<String, String> mapLJLI = LJLI();
        SparkThirdContext sparkThirdContext = new SparkThirdContext();
        sparkThirdContext.url = str;
        sparkThirdContext.bizCert = new ThirdPartyBizCert(402665476);
        sparkThirdContext.seclinkConfig = new SeclinkConfig(true, "bio_url");
        sparkThirdContext.callback = c1066710drh;
        sparkThirdContext.titleBar = new C1BHW(mapLJLI);
        C1066700drg.LIZ.getClass();
        sparkThirdContext.actions = C1066700drg.LIZJ(context, c1066710drh, mapLJLI);
        sparkThirdContext.disableOpenInSystem = true;
        C1554300qY8.LIZIZ(context, sparkThirdContext);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v26, types: [T, java.lang.String] */
    public final void LJLJJI(Context context, ProfileLinkData profileLinkData) {
        C19EG activity;
        Object obj;
        C259800zU c259800zU = new C259800zU();
        ?? backupUrl = profileLinkData.getBackupUrl();
        if (backupUrl == 0) {
            return;
        }
        c259800zU.element = backupUrl;
        Fragment fragment = this.LLILZ;
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            String str = "tiktok_selfhomepage_icon";
            if (C2277041EAs.LIZIZ()) {
                Pair[] pairArr = new Pair[4];
                ArrayList arrayList = new ArrayList();
                arrayList.add(String.valueOf(C2277041EAs.LIZ()));
                pairArr[0] = new Pair("tt_ab_vids", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
                pairArr[1] = new Pair("redirect_url", LJJZZI());
                if (Intrinsics.LJFF(LJLIIIL(), Boolean.TRUE)) {
                    obj = "tiktok_selfhomepage_icon";
                } else {
                    obj = "tiktok_otherhomepage_icon";
                }
                pairArr[2] = new Pair("from_scene", obj);
                C844470XAv.LIZ.getClass();
                pairArr[3] = new Pair("app_id", String.valueOf(C844470XAv.LJIIJ));
                Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
                Uri.Builder builderBuildUpon = UriProtector.parse((String) c259800zU.element).buildUpon();
                builderBuildUpon.appendQueryParameter("amp_extra", C08JS.LIZLLL(mapLJIIJ));
                builderBuildUpon.appendQueryParameter("pid", "tiktok_connect");
                c259800zU.element = builderBuildUpon.toString();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("urlWithParams after appended = ");
                sbLIZ.append((String) c259800zU.element);
                C2188811AlT.LIZIZ(sbLIZ);
            }
            if (((Boolean) C1ECD.LIZJ.getValue()).booleanValue()) {
                C1254160ik2 c1254160ik2 = C1254160ik2.LIZIZ;
                Pair[] pairArr2 = new Pair[3];
                if (!Intrinsics.LJFF(LJLIIIL(), Boolean.TRUE)) {
                    str = "tiktok_otherhomepage_icon";
                }
                pairArr2[0] = new Pair("from_scene", str);
                pairArr2[1] = new Pair("redirect_url", LJJZZI());
                pairArr2[2] = new Pair("pid", "tiktok_connect");
                Map<String, String> mapLJIIJ2 = C2097608Jq.LJIIJ(pairArr2);
                String lemon8DeepLinkValue = profileLinkData.getLemon8DeepLinkValue();
                if (lemon8DeepLinkValue != null) {
                    mapLJIIJ2.put("lemon8_deep_link_value", lemon8DeepLinkValue);
                }
                String lemon8CppAndroidPageId = profileLinkData.getLemon8CppAndroidPageId();
                if (lemon8CppAndroidPageId != null) {
                    mapLJIIJ2.put("cpp_link", lemon8CppAndroidPageId);
                }
                c1254160ik2.LJIIJJI(activity, mapLJIIJ2, new AwS563S0100000_19(this, 2955), new AwS263S0300000_19(this, (BioStructuralLinkProtocol) context, (Context) c259800zU, (C259800zU<String>) 24));
                return;
            }
            LJLILLLLZI(context, (String) c259800zU.element);
        }
    }

    public final void LJLJLLL(String str, EnumC1248370iah enumC1248370iah) {
        String str2;
        String uid;
        Aweme aweme;
        String aid;
        UserProfileInfo userProfileInfo;
        if (Intrinsics.LJFF(LJLIIIL(), Boolean.TRUE)) {
            str2 = "personal_homepage";
        } else {
            str2 = "others_homepage";
        }
        ProfileCommonInfo profileCommonInfoLJIILIIL = LJIILIIL();
        String str3 = "";
        if (profileCommonInfoLJIILIIL == null || (userProfileInfo = profileCommonInfoLJIILIIL.getUserProfileInfo()) == null || (uid = userProfileInfo.getUid()) == null) {
            uid = "";
        }
        IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
        if (iProfilePlatformVM != null && (aweme = iProfilePlatformVM.getAweme()) != null && (aid = aweme.getAid()) != null) {
            str3 = aid;
        }
        C1253930ijf.LJJIII(C1253930ijf.LIZ, str2, uid, str3, str, enumC1248370iah, null, null, 96);
    }
}
