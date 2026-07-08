package com.ss.android.ugc.aweme.web.utils;

import X.C098200Yq;
import X.C0C64;
import X.C1003700cE4;
import X.C1009340cNA;
import X.C1009740cNo;
import X.C1014230cV3;
import X.C1016360cYU;
import X.C1017180cZo;
import X.C1017520caM;
import X.C1017540caO;
import X.C1025720cna;
import X.C1026310coX;
import X.C1035880d3y;
import X.C1037430d6T;
import X.C1038840d8k;
import X.C1533610q0l;
import X.C189200o6;
import X.C2188811AlT;
import X.C2522209uW;
import X.C2522509uZ;
import X.C283370B8t;
import X.C7740030o;
import X.EnumC696280RSw;
import X.InterfaceC1017210cZr;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAnoleService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.AdStyleActionModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.commercialize.model.IABBottomBarElement;
import com.ss.android.ugc.aweme.commercialize.model.IABLoadingFormatModel;
import com.ss.android.ugc.aweme.commercialize.model.LandingPageDataModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.EfficiencyComponents;
import com.ss.android.ugc.aweme.feed.model.IABHistory;
import com.ss.android.ugc.aweme.feed.model.LandingPageConfig;
import com.ss.android.ugc.aweme.feed.model.ad.AdExternalGuideConfig;
import com.ss.android.ugc.aweme.feed.model.ad.AdExternalGuideFormatConfig;
import com.ss.android.ugc.aweme.feed.model.ad.AdExternalGuideTriggerCondition;
import com.ss.android.ugc.aweme.feed.model.ad.FeatureCenterModel;
import com.ss.android.ugc.aweme.feed.model.ad.PlayableData;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.model.IABBottomBarComponentModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.ss.android.ugc.aweme.web.experiment.AdSparkWebViewLoadNewConfig;
import com.ss.android.ugc.aweme.web.experiment.IABLoadingFormatConfigExp;
import com.ss.android.ugc.aweme.web.experiment.IABLoadingFormatOptConfigExp;
import com.ss.android.ugc.aweme.web.service.IAdWebUIUtils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class AdWebUIUtils implements IAdWebUIUtils {
    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUIUtils
    public final int LIZIZ() {
        return ((Boolean) AdSparkWebViewLoadNewConfig.LJ.getValue()).booleanValue() ? 1 : 0;
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUIUtils
    public final int LJIIIIZZ() {
        return ((Boolean) AdSparkWebViewLoadNewConfig.LIZLLL.getValue()).booleanValue() ? 1 : 0;
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUIUtils
    public final boolean LIZLLL() {
        return IABLoadingFormatConfigExp.LJIIIIZZ;
    }

    public static boolean LJJIFFI(C1035880d3y c1035880d3y) {
        C1025720cna tuxSheetConfig;
        C1025720cna tuxSheetConfig2;
        if (c1035880d3y == null) {
            return false;
        }
        C1026310coX adlpPopUpModel = c1035880d3y.getAdlpPopUpModel();
        if (adlpPopUpModel != null && (tuxSheetConfig2 = adlpPopUpModel.getTuxSheetConfig()) != null && tuxSheetConfig2.variant == 3) {
            return true;
        }
        C1026310coX adlpPopUpModel2 = c1035880d3y.getAdlpPopUpModel();
        if (adlpPopUpModel2 == null || (tuxSheetConfig = adlpPopUpModel2.getTuxSheetConfig()) == null || tuxSheetConfig.variant != 2) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUIUtils
    public final boolean LIZJ(C1035880d3y c1035880d3y) {
        String uid;
        User currentUser;
        if (c1035880d3y == null || !c1035880d3y.getIabIsShowAndDelayInChangedScreen() || !c1035880d3y.getIabResume() || !c1035880d3y.getShouldShowHistoryTips() || c1035880d3y.getShowedHistoryTips()) {
            return false;
        }
        if (C2522509uZ.LIZ == 0 && !c1035880d3y.getBottomBarShowing()) {
            return false;
        }
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null || (uid = currentUser.getUid()) == null) {
            uid = "default";
        }
        boolean zLJJII = LJJII(c1035880d3y);
        if (((Boolean) C283370B8t.LIZ.getValue()).booleanValue()) {
            if (zLJJII && !Keva.getRepo("iab_history_tips").getBoolean(uid, false)) {
                return true;
            }
            return false;
        }
        return zLJJII;
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUIUtils
    public final UrlModel LJ(User user) {
        if (user == null) {
            return null;
        }
        UrlModel avatarLarger = user.getAvatarLarger();
        if (avatarLarger == null) {
            UrlModel avatarMedium = user.getAvatarMedium();
            if (avatarMedium == null) {
                return user.getAvatarThumb();
            }
            return avatarMedium;
        }
        return avatarLarger;
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUIUtils
    public final boolean LJFF(C1035880d3y c1035880d3y) {
        return LJJIII(c1035880d3y, 2);
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUIUtils
    public final void LJII(C1035880d3y c1035880d3y) {
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        IABLoadingFormatModel iABLoadingFormatModelLIZ;
        IABLoadingFormatModel iABLoadingFormatModel;
        PlayableData playableData;
        if (!IABLoadingFormatConfigExp.LIZ || C1017540caO.LIZ(c1035880d3y)) {
            return;
        }
        Integer numValueOf = null;
        String webUrl = null;
        C1016360cYU c1016360cYU = new C1016360cYU(null, false, null, null, null, null, null, null, 0, 0, 0L, 0L);
        if (c1035880d3y != null && (((awemeRawAd = c1035880d3y.getAwemeRawAd()) != null && C1003700cE4.LIZIZ(awemeRawAd, "tt_iab_loading_format")) || ((awemeRawAd2 = c1035880d3y.getAwemeRawAd()) != null && C1003700cE4.LIZIZ(awemeRawAd2, EnumC696280RSw.TT_PLAYABLE_LOADING_FORMAT.getSlotName())))) {
            c1016360cYU.setAuthorAvatar(c1035880d3y.getAuthorAvatar());
            AwemeRawAd awemeRawAd3 = c1035880d3y.getAwemeRawAd();
            String str = null;
            if (awemeRawAd3 != null) {
                iABLoadingFormatModelLIZ = C1003700cE4.LIZ(awemeRawAd3);
            } else {
                iABLoadingFormatModelLIZ = null;
            }
            c1016360cYU.setIabLoadingFormatModel(iABLoadingFormatModelLIZ);
            IABLoadingFormatModel iABLoadingFormatModel2 = c1016360cYU.iabLoadingFormatModel;
            if (iABLoadingFormatModel2 != null) {
                numValueOf = Integer.valueOf(iABLoadingFormatModel2.getLandingFormatType());
            }
            c1016360cYU.setLandingFormatType(numValueOf);
            String url = c1035880d3y.getUrl();
            AwemeRawAd awemeRawAd4 = c1035880d3y.getAwemeRawAd();
            if (awemeRawAd4 != null) {
                webUrl = awemeRawAd4.getWebUrl();
            }
            if (!TextUtils.equals(url, webUrl)) {
                String url2 = c1035880d3y.getUrl();
                AwemeRawAd awemeRawAd5 = c1035880d3y.getAwemeRawAd();
                if (awemeRawAd5 != null && (playableData = awemeRawAd5.getPlayableData()) != null) {
                    str = playableData.playableUrl;
                }
                if (!TextUtils.equals(url2, str)) {
                    c1016360cYU.setLoadingFormatStatus("3");
                    c1035880d3y.setAdWebLoadingFormatModel(c1016360cYU);
                    return;
                }
            }
            if (LJIJI(c1035880d3y) < IABLoadingFormatConfigExp.LIZJ) {
                c1016360cYU.setLoadingFormatStatus("5");
                c1035880d3y.setAdWebLoadingFormatModel(c1016360cYU);
                return;
            } else if (!LJJIFFI(c1035880d3y) || ((iABLoadingFormatModel = c1016360cYU.iabLoadingFormatModel) != null && iABLoadingFormatModel.getEnableDynamicSplitScreen())) {
                c1016360cYU.setShouldAddLoadingFormatView(true);
                c1016360cYU.setLoadingFormatStatus("7");
                c1035880d3y.setAdWebLoadingFormatModel(c1016360cYU);
                return;
            } else {
                c1016360cYU.setLoadingFormatStatus("4");
                c1035880d3y.setAdWebLoadingFormatModel(c1016360cYU);
                return;
            }
        }
        c1016360cYU.setLoadingFormatStatus("2");
        c1016360cYU.setLandingFormatType(0);
        if (c1035880d3y != null) {
            c1035880d3y.setAdWebLoadingFormatModel(c1016360cYU);
        }
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUIUtils
    public final C1038840d8k LJIIJ(Context context) {
        return new C1038840d8k(context);
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUIUtils
    public final boolean LJIIJJI(Aweme aweme) {
        boolean z;
        boolean z2;
        AwemeRawAd awemeRawAd;
        FeatureCenterModel feature;
        Long l;
        FeatureCenterModel feature2;
        Long l2;
        if (aweme != null) {
            aweme.getAwemeRawAd();
        }
        IABLoadingFormatOptConfigExp.IABLoadingFormatOptConfig iABLoadingFormatOptConfigLIZ = IABLoadingFormatOptConfigExp.LIZ();
        if (iABLoadingFormatOptConfigLIZ != null && iABLoadingFormatOptConfigLIZ.allFallbackIcon) {
            z = true;
        } else {
            z = false;
        }
        if (aweme != null) {
            if (C1009740cNo.LJIIJ(aweme)) {
                z2 = true;
            } else {
                z2 = false;
                if (aweme != null) {
                }
            }
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if ((awemeRawAd2 != null && (feature2 = awemeRawAd2.getFeature()) != null && (l2 = feature2.deviceOverallScoreLayer) != null && l2.longValue() == 2) || ((awemeRawAd = aweme.getAwemeRawAd()) != null && (feature = awemeRawAd.getFeature()) != null && (l = feature.deviceOverallScoreLayer) != null && l.longValue() == 3)) {
                if (z2 || !z) {
                    return true;
                }
                return false;
            }
        }
        if (IABLoadingFormatConfigExp.LJII && aweme != null && C1009740cNo.LJIIJ(aweme)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUIUtils
    public final View LJIIL(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.ymi);
        return frameLayout;
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUIUtils
    public final boolean LJIILIIL(AwemeRawAd awemeRawAd) {
        LandingPageDataModel landingPageData;
        String loadingFormatCdn;
        IABLoadingFormatModel iABLoadingFormatModelLIZ = C1003700cE4.LIZ(awemeRawAd);
        if (iABLoadingFormatModelLIZ != null && (landingPageData = iABLoadingFormatModelLIZ.getLandingPageData()) != null && (loadingFormatCdn = landingPageData.getLoadingFormatCdn()) != null && C1533610q0l.LIZIZ(loadingFormatCdn)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUIUtils
    public final boolean LJIILJJIL(C1035880d3y c1035880d3y) {
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        String webUrl;
        C1016360cYU adWebLoadingFormatModel;
        IABLoadingFormatModel iABLoadingFormatModel;
        PlayableData playableData;
        if (!IABLoadingFormatConfigExp.LIZ || C1017540caO.LIZ(c1035880d3y) || c1035880d3y == null || (((awemeRawAd = c1035880d3y.getAwemeRawAd()) == null || !C1003700cE4.LIZIZ(awemeRawAd, "tt_iab_loading_format")) && ((awemeRawAd2 = c1035880d3y.getAwemeRawAd()) == null || !C1003700cE4.LIZIZ(awemeRawAd2, EnumC696280RSw.TT_PLAYABLE_LOADING_FORMAT.getSlotName())))) {
            return false;
        }
        String url = c1035880d3y.getUrl();
        AwemeRawAd awemeRawAd3 = c1035880d3y.getAwemeRawAd();
        String str = null;
        if (awemeRawAd3 != null) {
            webUrl = awemeRawAd3.getWebUrl();
        } else {
            webUrl = null;
        }
        if (!TextUtils.equals(url, webUrl)) {
            String url2 = c1035880d3y.getUrl();
            AwemeRawAd awemeRawAd4 = c1035880d3y.getAwemeRawAd();
            if (awemeRawAd4 != null && (playableData = awemeRawAd4.getPlayableData()) != null) {
                str = playableData.playableUrl;
            }
            if (!TextUtils.equals(url2, str)) {
                return false;
            }
        }
        if (LJIJI(c1035880d3y) < IABLoadingFormatConfigExp.LIZJ) {
            return false;
        }
        if (LJJIFFI(c1035880d3y) && ((adWebLoadingFormatModel = c1035880d3y.getAdWebLoadingFormatModel()) == null || (iABLoadingFormatModel = adWebLoadingFormatModel.iabLoadingFormatModel) == null || !iABLoadingFormatModel.getEnableDynamicSplitScreen())) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUIUtils
    public final boolean LJIILL(C1035880d3y c1035880d3y) {
        AwemeRawAd awemeRawAd;
        if (c1035880d3y != null && c1035880d3y.isPlayableUrl() && (awemeRawAd = c1035880d3y.getAwemeRawAd()) != null && C1003700cE4.LIZIZ(awemeRawAd, EnumC696280RSw.TT_PLAYABLE_IAB_FULL_SCREEN.getSlotName())) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUIUtils
    public final C1037430d6T LJIILLIIL(Context context) {
        return new C1037430d6T(context);
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUIUtils
    public final boolean LJIIZILJ(Aweme aweme) {
        IAnoleService iAnoleService;
        if (aweme == null) {
            return false;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        String aid = aweme.getAid();
        if (awemeRawAd == null || aid == null || (iAnoleService = (IAnoleService) PluggableExtentionKt.pluggableSpi$default(IAnoleService.class, false, false, false, 14, null)) == null) {
            return false;
        }
        return iAnoleService.LIZ(new C1009340cNA(aid, aweme.getGroupId(), aweme, awemeRawAd, null, null, null, 112), "tt_iab_loading_format", C1014230cV3.LIZ("iab_loading_format_dynamic"));
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUIUtils
    public final boolean LJIJ(C1035880d3y c1035880d3y) {
        C1026310coX adlpPopUpModel;
        C1025720cna tuxSheetConfig;
        if ((c1035880d3y != null && (adlpPopUpModel = c1035880d3y.getAdlpPopUpModel()) != null && (tuxSheetConfig = adlpPopUpModel.getTuxSheetConfig()) != null && Intrinsics.LJFF(tuxSheetConfig.hideHistoryEntry, Boolean.TRUE)) || !LJJI(c1035880d3y)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUIUtils
    public final float LJIJI(C1035880d3y c1035880d3y) {
        C1026310coX adlpPopUpModel;
        C1025720cna tuxSheetConfig;
        int i;
        C1025720cna tuxSheetConfig2;
        C1025720cna tuxSheetConfig3;
        C1025720cna tuxSheetConfig4;
        C1025720cna tuxSheetConfig5;
        C1025720cna tuxSheetConfig6;
        if (c1035880d3y == null) {
            return 1.0f;
        }
        C1026310coX adlpPopUpModel2 = c1035880d3y.getAdlpPopUpModel();
        int i2 = 1;
        if ((adlpPopUpModel2 != null && (tuxSheetConfig6 = adlpPopUpModel2.getTuxSheetConfig()) != null && tuxSheetConfig6.variant == 3) || ((adlpPopUpModel = c1035880d3y.getAdlpPopUpModel()) != null && (tuxSheetConfig4 = adlpPopUpModel.getTuxSheetConfig()) != null && tuxSheetConfig4.variant == 1)) {
            C1026310coX adlpPopUpModel3 = c1035880d3y.getAdlpPopUpModel();
            if (adlpPopUpModel3 == null || (tuxSheetConfig5 = adlpPopUpModel3.getTuxSheetConfig()) == null) {
                return 1.0f;
            }
            return tuxSheetConfig5.defaultHeightRatio;
        }
        C1026310coX adlpPopUpModel4 = c1035880d3y.getAdlpPopUpModel();
        if (adlpPopUpModel4 == null || (tuxSheetConfig = adlpPopUpModel4.getTuxSheetConfig()) == null || tuxSheetConfig.variant != 2) {
            return 1.0f;
        }
        C1026310coX adlpPopUpModel5 = c1035880d3y.getAdlpPopUpModel();
        if (adlpPopUpModel5 != null && (tuxSheetConfig3 = adlpPopUpModel5.getTuxSheetConfig()) != null) {
            i = tuxSheetConfig3.peekHeight;
        } else {
            i = 1;
        }
        C1026310coX adlpPopUpModel6 = c1035880d3y.getAdlpPopUpModel();
        if (adlpPopUpModel6 != null && (tuxSheetConfig2 = adlpPopUpModel6.getTuxSheetConfig()) != null) {
            i2 = tuxSheetConfig2.dynamicHeight;
        }
        return i / i2;
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUIUtils
    public final boolean LJIJJ(C1035880d3y c1035880d3y) {
        return LJJIII(c1035880d3y, 1);
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUIUtils
    public final boolean LJIJJLI(C1035880d3y c1035880d3y) {
        String uid;
        User currentUser;
        if (c1035880d3y == null || !c1035880d3y.getIabIsShowAndDelayInChangedScreen() || !c1035880d3y.getIabResume()) {
            return false;
        }
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null || (uid = currentUser.getUid()) == null) {
            uid = "default";
        }
        boolean zLJJII = LJJII(c1035880d3y);
        if (((Boolean) C283370B8t.LIZ.getValue()).booleanValue()) {
            if (zLJJII && !Keva.getRepo("iab_history_guide").getBoolean(uid, false)) {
                return true;
            }
            return false;
        }
        return zLJJII;
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUIUtils
    public final void LJIL(C1035880d3y c1035880d3y) {
        AwemeRawAd awemeRawAd;
        LandingPageConfig landingPageConfig;
        AnoleModel anoleModel;
        Map<String, AnoleComponentModel> map;
        Collection<AnoleComponentModel> collectionValues;
        List<IABBottomBarElement> list;
        Object c098200Yq;
        EfficiencyComponents efficiencyComponents = null;
        if (c1035880d3y != null && (awemeRawAd = c1035880d3y.getAwemeRawAd()) != null && (landingPageConfig = awemeRawAd.getLandingPageConfig()) != null) {
            c1035880d3y.setEfficiencyComponents(landingPageConfig.efficiencyComponents);
            if (landingPageConfig.enableIabFrameworkRevamp) {
                AwemeRawAd awemeRawAd2 = c1035880d3y.getAwemeRawAd();
                if (awemeRawAd2 != null && (anoleModel = awemeRawAd2.getAnoleModel()) != null && (map = anoleModel.components) != null && (collectionValues = map.values()) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : collectionValues) {
                        if (Intrinsics.LJFF(((AnoleComponentModel) obj).slotID, "tt_iab_bottom_bar_slot")) {
                            arrayList.add(obj);
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    loop1: while (true) {
                        list = null;
                        while (it2.hasNext()) {
                            Map<String, ? extends Object> map2 = ((AnoleComponentModel) it2.next()).data;
                            try {
                                Gson gson = C7740030o.LIZ().getGson();
                                if (gson != null) {
                                    c098200Yq = (IABBottomBarComponentModel) gson.LJII(gson.LJIILL(map2), IABBottomBarComponentModel.class);
                                } else {
                                    c098200Yq = null;
                                }
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            C189200o6.m8isSuccessimpl(c098200Yq);
                            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                            if (thM5exceptionOrNullimpl != null) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("getLoadingFormatData() parse failed ,reason = ");
                                sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
                                C2188811AlT.LIZIZ(sbLIZ);
                            }
                            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                                c098200Yq = null;
                            }
                            IABBottomBarComponentModel iABBottomBarComponentModel = (IABBottomBarComponentModel) c098200Yq;
                            if (iABBottomBarComponentModel != null) {
                                list = iABBottomBarComponentModel.iabBottomBarElements;
                            }
                        }
                    }
                    if (list != null && !list.isEmpty()) {
                        Iterator<IABBottomBarElement> it3 = list.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            EfficiencyComponents efficiencyComponents2 = it3.next().efficiencyComponents;
                            if (efficiencyComponents2 != null) {
                                efficiencyComponents = efficiencyComponents2;
                                break;
                            }
                        }
                    }
                }
                c1035880d3y.setEfficiencyComponents(efficiencyComponents);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUIUtils
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.gson.n LJJ(com.ss.android.ugc.aweme.feed.model.Aweme r12) {
        /*
            r11 = this;
            if (r12 != 0) goto L4
            r0 = 0
            return r0
        L4:
            com.google.gson.n r3 = new com.google.gson.n
            r3.<init>()
            com.google.gson.n r2 = new com.google.gson.n
            r2.<init>()
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r12.getAwemeRawAd()
            java.lang.String r4 = ""
            if (r0 == 0) goto L2a
            com.ss.android.ugc.aweme.commercialize.model.IABLoadingFormatModel r0 = X.C1003700cE4.LIZ(r0)
            if (r0 == 0) goto L2a
            java.util.List r0 = r0.getGeckoChannel()
            if (r0 == 0) goto L2a
            java.lang.Object r1 = X.C13LP.LJJJLL(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L2b
        L2a:
            r1 = r4
        L2b:
            java.lang.Class<com.ss.android.ugc.aweme.web.service.IAdWebUtils> r5 = com.ss.android.ugc.aweme.web.service.IAdWebUtils.class
            r6 = 0
            r9 = 14
            r10 = 0
            r7 = r6
            r8 = r6
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r5, r6, r7, r8, r9, r10)
            com.ss.android.ugc.aweme.web.service.IAdWebUtils r0 = (com.ss.android.ugc.aweme.web.service.IAdWebUtils) r0
            if (r0 == 0) goto L42
            java.lang.String r0 = r0.dp()
            if (r0 == 0) goto L42
            r4 = r0
        L42:
            java.lang.String r0 = "gecko_channel"
            r2.LJJIIJ(r0, r1)
            java.lang.String r1 = "file_path"
            java.lang.String r0 = "screenshot.jpeg"
            r2.LJJIIJ(r1, r0)
            java.lang.String r0 = "gecko_ak"
            r2.LJJIIJ(r0, r4)
            java.lang.Class<com.ss.android.ugc.aweme.web.service.IAdWebUIUtils> r5 = com.ss.android.ugc.aweme.web.service.IAdWebUIUtils.class
            r7 = r6
            r8 = r6
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r5, r6, r7, r8, r9, r10)
            com.ss.android.ugc.aweme.web.service.IAdWebUIUtils r0 = (com.ss.android.ugc.aweme.web.service.IAdWebUIUtils) r0
            if (r0 == 0) goto L75
            boolean r1 = r0.LJIIZILJ(r12)
            r0 = 1
            if (r1 != r0) goto L75
        L66:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_ready"
            r2.LJJII(r1, r0)
            java.lang.String r0 = "iab_screenshot"
            r3.LJJIFFI(r0, r2)
            return r3
        L75:
            r0 = 0
            goto L66
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.web.utils.AdWebUIUtils.LJJ(com.ss.android.ugc.aweme.feed.model.Aweme):com.google.gson.n");
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUIUtils
    public final boolean LJJI(C1035880d3y c1035880d3y) {
        IAccountService iAccountService;
        AccountUserService accountUserServiceLJIIJ;
        AwemeRawAd awemeRawAd;
        LandingPageConfig landingPageConfig;
        IABHistory iABHistory;
        Integer num;
        if (c1035880d3y != null && !c1035880d3y.isPreviewMode() && (iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class)) != null && (accountUserServiceLJIIJ = iAccountService.LJIIJ()) != null && accountUserServiceLJIIJ.isLogin() && c1035880d3y != null && (awemeRawAd = c1035880d3y.getAwemeRawAd()) != null && (landingPageConfig = awemeRawAd.getLandingPageConfig()) != null && (iABHistory = landingPageConfig.iabHistory) != null && (num = iABHistory.historyFunctionStatus) != null && num.intValue() == 1 && C2522209uW.LIZ) {
            return true;
        }
        return false;
    }

    public final boolean LJJII(C1035880d3y c1035880d3y) {
        IABHistory iABHistory;
        LandingPageConfig landingPageConfig;
        AwemeRawAd awemeRawAd = c1035880d3y.getAwemeRawAd();
        if (awemeRawAd != null && (landingPageConfig = awemeRawAd.getLandingPageConfig()) != null) {
            iABHistory = landingPageConfig.iabHistory;
        } else {
            iABHistory = null;
        }
        if (!LJJI(c1035880d3y) || iABHistory == null || !Intrinsics.LJFF(iABHistory.showHistoryUserGuide, Boolean.TRUE)) {
            return false;
        }
        return true;
    }

    public static boolean LJJIII(C1035880d3y c1035880d3y, Integer num) {
        AwemeRawAd awemeRawAd;
        AdStyleActionModel adStyleActionModel;
        AdExternalGuideConfig adExternalGuideConfig;
        AdExternalGuideFormatConfig bannerGuideFormat;
        List<AdExternalGuideTriggerCondition> triggerConditions;
        Integer num2;
        LandingPageConfig landingPageConfig;
        Integer num3;
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "iab_mid_page_banner_style", true);
        if (num == null || iLJIJ != num.intValue()) {
            return false;
        }
        if (c1035880d3y != null) {
            AwemeRawAd awemeRawAd2 = c1035880d3y.getAwemeRawAd();
            if (awemeRawAd2 != null && C1017180cZo.LJJIJIIJI(awemeRawAd2)) {
                return true;
            }
            AwemeRawAd awemeRawAd3 = c1035880d3y.getAwemeRawAd();
            if (awemeRawAd3 != null && (landingPageConfig = awemeRawAd3.getLandingPageConfig()) != null && (num3 = landingPageConfig.showBocBannerType) != null && num3.intValue() == 1) {
                return true;
            }
        }
        InterfaceC1017210cZr interfaceC1017210cZr = (InterfaceC1017210cZr) ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ().VW0(InterfaceC1017210cZr.class);
        String realCreativeIdStr = null;
        if (interfaceC1017210cZr != null) {
            if (c1035880d3y != null) {
                realCreativeIdStr = c1035880d3y.getRealCreativeIdStr();
            }
            C1017520caM c1017520caMSW0 = interfaceC1017210cZr.SW0(realCreativeIdStr);
            if (c1017520caMSW0 != null && !c1017520caMSW0.LIZIZ && c1017520caMSW0.LIZJ && (num2 = c1017520caMSW0.LIZLLL) != null && num2.intValue() == 0) {
                return true;
            }
        }
        if (c1035880d3y == null || (awemeRawAd = c1035880d3y.getAwemeRawAd()) == null || (adStyleActionModel = awemeRawAd.getAdStyleActionModel()) == null || (adExternalGuideConfig = adStyleActionModel.externalGuideConfig) == null || (bannerGuideFormat = adExternalGuideConfig.getBannerGuideFormat()) == null || (triggerConditions = bannerGuideFormat.getTriggerConditions()) == null || triggerConditions.isEmpty()) {
            return false;
        }
        c1035880d3y.setBannerShowedByExternalGuide(true);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUIUtils
    public final boolean LIZ(SparkContext sparkContext, C1035880d3y c1035880d3y) {
        AwemeRawAd awemeRawAd;
        LandingPageConfig landingPageConfig;
        if (sparkContext == null) {
            if (c1035880d3y == null) {
                return false;
            }
        } else {
            C1035880d3y c1035880d3y2 = (C1035880d3y) sparkContext.LJFF(C1035880d3y.class);
            if (c1035880d3y2 != null) {
                c1035880d3y = c1035880d3y2;
            }
        }
        if (c1035880d3y == null || c1035880d3y.isPreviewMode() || (awemeRawAd = c1035880d3y.getAwemeRawAd()) == null || (landingPageConfig = awemeRawAd.getLandingPageConfig()) == null || !landingPageConfig.enableIabFrameworkRevamp) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUIUtils
    public final View LJI(final Context context, C1035880d3y c1035880d3y) {
        if (c1035880d3y != null && c1035880d3y.isPlayableUrl()) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(R.id.i7a);
            return frameLayout;
        }
        return new FrameLayout(context) { // from class: X.09o9
            {
                super(context, null, 0);
                setId(R.id.i7a);
                C786410Ut5.Td(C786410Ut5.ne(context), R.layout.ce4, this, true);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUIUtils
    public final boolean LJIIIZ(C1035880d3y c1035880d3y, int i) {
        C1026310coX adlpPopUpModel;
        C1025720cna tuxSheetConfig;
        if ((c1035880d3y != null && (adlpPopUpModel = c1035880d3y.getAdlpPopUpModel()) != null && (tuxSheetConfig = adlpPopUpModel.getTuxSheetConfig()) != null && Intrinsics.LJFF(tuxSheetConfig.hideHistoryEntry, Boolean.TRUE)) || !LJJI(c1035880d3y) || C2522509uZ.LIZ != i) {
            return false;
        }
        return true;
    }
}
