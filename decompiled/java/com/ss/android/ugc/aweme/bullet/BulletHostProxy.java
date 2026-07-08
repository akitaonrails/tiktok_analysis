package com.ss.android.ugc.aweme.bullet;

import X.C0XQ7;
import X.C1038660d8S;
import X.C1047190dMD;
import X.C1051660dTQ;
import X.C1059930dgl;
import X.C1060000dgs;
import X.C1060420dhY;
import X.C1060430dhZ;
import X.C1061880dju;
import X.C1062300dka;
import X.C1066040dqc;
import X.C13BV;
import X.C1544000qHW;
import X.C1874940ytI;
import X.C1877450yxL;
import X.C2097608Jq;
import X.C2097908Jt;
import X.EnumC1051570dTH;
import X.EnumC1059790dgX;
import X.InterfaceC1051730dTX;
import X.InterfaceC1051760dTa;
import X.InterfaceC1063690dmp;
import X.InterfaceC1063710dmr;
import X.InterfaceC20673515v3;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.ss.android.ugc.aweme.bullet.bridge.ad.AdThirdTrackMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.DownloadAppClickMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.LoadGeckoResourcesMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.OpenRechargePanel;
import com.ss.android.ugc.aweme.bullet.bridge.ad.SendAdLogMethod;
import com.ss.android.ugc.aweme.bullet.bridge.commerce.AdInfoMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.AppInstalledMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.BdturingMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.BroadcastMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.FetchMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.FileSelectionMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.GetAbTestMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.GetNativeItemMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.GetSettingsMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.GetThemeMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.IBEDidFinishInteractionMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.IBEDidStartInteractionMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.IBEGetViewSizeMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.IBEPreRenderReadyMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.InitPIPOSdkMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.IsAppInstalledMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.LaunchChatMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.LoginMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.LoginWithPlatform;
import com.ss.android.ugc.aweme.bullet.bridge.common.LogoutMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.NoticePermissionMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.OpenAdPanelPageMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.OpenAuthPageMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.OpenPhoneAreaMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.OpenScanMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.RequestMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.SetNativeItemMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.SetScrollTopMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.UploadFileMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.AppInfoMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.BulletGetAppInfoMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.BulletUserInfoMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.CloseMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.DarkModeMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.EditPageMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.GetAppInfoMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.GetContainerIdMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.LoadFeedsFlowMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.MonitorLogMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.OpenAwemeDetailMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.OpenBrowserMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.OpenRecordOnLiveTakeMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.OpenSchemaMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.SendLogMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.SendLogV3Method;
import com.ss.android.ugc.aweme.bullet.bridge.framework.ShowToastMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.UserInfoMethod;
import com.ss.android.ugc.aweme.bullet.utils.BulletMethodAdapter$javaMethodToBullet$1;
import com.ss.android.ugc.aweme.commercialize.ecommerce.service.IShoppingAdsService;
import com.ss.android.ugc.aweme.commercialize.tcm.anchor.GetContainerDataMethod;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.fe.method.DownloadFileMethod;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.service.IECommerceLiveBridgeService;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.jsb.LiveMethod;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.share.ShareH5Service;
import com.ss.android.ugc.aweme.spark.bullet.IBulletHostProxy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes17.dex */
public final class BulletHostProxy implements IBulletHostProxy {
    @Override // com.ss.android.ugc.aweme.spark.bullet.IBulletHostProxy
    public final List<Class<? extends InterfaceC1063710dmr>> LIZ() {
        C1060000dgs.LIZ.getClass();
        return C1060000dgs.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.spark.bullet.IBulletHostProxy
    public final HashMap<Class<?>, HashMap<String, Class<?>>> LIZLLL() {
        C1060000dgs.LIZ.getClass();
        if (C1544000qHW.LJIIZILJ) {
            return new HashMap<>();
        }
        HashMap<Class<?>, HashMap<String, Class<?>>> map = new HashMap<>();
        HashMap<String, Class<?>> map2 = new HashMap<>();
        HashMap map3 = new HashMap();
        EnumC1059790dgX enumC1059790dgX = EnumC1059790dgX.ALL;
        Map mapLIZIZ = C1062300dka.LIZIZ(enumC1059790dgX, LivePreviewCTASmartDisplayManager.DEFAULT);
        if (mapLIZIZ != null) {
            map3.putAll(mapLIZIZ);
        }
        Map mapLIZIZ2 = C1062300dka.LIZIZ(enumC1059790dgX, "Spark");
        if (mapLIZIZ2 != null) {
            map3.putAll(mapLIZIZ2);
        }
        map2.putAll(map3);
        map.put(InterfaceC1063690dmp.class, map2);
        return map;
    }

    @Override // com.ss.android.ugc.aweme.spark.bullet.IBulletHostProxy
    public final HashMap<Class<?>, HashMap<String, Class<?>>> LJ() {
        Map<String, Class<?>> mapLIZ;
        Map<String, Class<?>> mapLIZJ;
        Map<String, Class<?>> mapLJJIIZ;
        Map<String, Class<?>> mapLJJIIZ2;
        Map<String, Class<?>> mapLIZIZ;
        C1060000dgs.LIZ.getClass();
        if (C1544000qHW.LJIIZILJ) {
            return new HashMap<>();
        }
        HashMap<Class<?>, HashMap<String, Class<?>>> map = new HashMap<>();
        HashMap<String, Class<?>> map2 = new HashMap<>();
        map2.putAll(C2097608Jq.LJIIIIZZ(new Pair("fetch", FetchMethod.class), new Pair("request", RequestMethod.class), new Pair("getNativeItem", GetNativeItemMethod.class), new Pair("setNativeItem", SetNativeItemMethod.class), new Pair("getSettings", GetSettingsMethod.class), new Pair("broadcast", BroadcastMethod.class), new Pair("IBEPreRenderReady", IBEPreRenderReadyMethod.class), new Pair("IBEGetViewSize", IBEGetViewSizeMethod.class), new Pair("IBEDidFinishInteraction", IBEDidFinishInteractionMethod.class), new Pair("IBEDidStartInteraction", IBEDidStartInteractionMethod.class), new Pair("initPipo", InitPIPOSdkMethod.class), new Pair("setScrollTop", SetScrollTopMethod.class), new Pair("openBrowser", OpenBrowserMethod.class), new Pair("uploadFile", UploadFileMethod.class), new Pair("scan", OpenScanMethod.class), new Pair("fileSelection", FileSelectionMethod.class), new Pair("isAppInstall", IsAppInstalledMethod.class), new Pair("noticePermission", NoticePermissionMethod.class), new Pair("login", LoginMethod.class), new Pair("loginWithPlatform", LoginWithPlatform.class), new Pair("accountLogout", LogoutMethod.class), new Pair("choosePhoneArea", OpenPhoneAreaMethod.class), new Pair("openRechargePanel", OpenRechargePanel.class), new Pair("getABTestParams", GetAbTestMethod.class), new Pair("getTheme", GetThemeMethod.class), new Pair("openAdPanelPage", OpenAdPanelPageMethod.class), new Pair("popTuringVerifyView", BdturingMethod.class), new Pair("launchChat", LaunchChatMethod.class), new Pair("isAppInstalled", AppInstalledMethod.class)));
        Map<? extends String, ? extends Class<?>> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("close", CloseMethod.class), new Pair("userInfo", UserInfoMethod.class), new Pair("sendLog", SendLogMethod.class), new Pair("sendLogV3", SendLogV3Method.class), new Pair("monitorLog", MonitorLogMethod.class), new Pair("openSchema", OpenSchemaMethod.class), new Pair("showToast", ShowToastMethod.class), new Pair("openBrowser", OpenBrowserMethod.class), new Pair("appInfo", AppInfoMethod.class), new Pair("getAppInfo", GetAppInfoMethod.class), new Pair("loadFeedsFlow", LoadFeedsFlowMethod.class), new Pair("openRecordOnLiveTake", OpenRecordOnLiveTakeMethod.class), new Pair("openAwemeDetail", OpenAwemeDetailMethod.class), new Pair("darkMode", DarkModeMethod.class), new Pair("uniUserInfo", BulletUserInfoMethod.class), new Pair("uniAppInfo", BulletGetAppInfoMethod.class), new Pair("getContainerId", GetContainerIdMethod.class), new Pair("loadGeckoResources", LoadGeckoResourcesMethod.class), new Pair("jumpOpenAuthPage", OpenAuthPageMethod.class), new Pair("openVideoEdit", EditPageMethod.class));
        ShareH5Service.LIZ.getClass();
        ShareH5Service shareH5ServiceLIZIZ = C1038660d8S.LIZIZ();
        if (shareH5ServiceLIZIZ != null && (mapLIZIZ = shareH5ServiceLIZIZ.LIZIZ()) != null) {
            mapLJIIJ.putAll(mapLIZIZ);
        }
        map2.putAll(mapLJIIJ);
        map2.putAll(C2097608Jq.LJ());
        IMusicService iMusicService = (IMusicService) PluggableExtentionKt.pluggableSpi$default(IMusicService.class, false, false, false, 14, null);
        if (iMusicService != null && (mapLJJIIZ2 = iMusicService.LJJIIZ()) != null) {
            map2.putAll(mapLJJIIZ2);
        }
        C1060430dhZ.LIZ.getClass();
        ISearchService iSearchService = C1060430dhZ.LIZIZ;
        if (iSearchService != null && (mapLJJIIZ = iSearchService.LJJIIZ()) != null) {
            map2.putAll(mapLJJIIZ);
        }
        map2.putAll(C2097908Jt.LIZJ(new Pair("adInfo", AdInfoMethod.class)));
        map2.putAll(C2097608Jq.LJIIIIZZ(new Pair("download_app_click", DownloadAppClickMethod.class), new Pair("getContainerData", GetContainerDataMethod.class)));
        IECommerceLiveBridgeService iECommerceLiveBridgeService = (IECommerceLiveBridgeService) PluggableExtentionKt.pluggableSpi$default(IECommerceLiveBridgeService.class, false, false, false, 14, null);
        if (iECommerceLiveBridgeService != null && (mapLIZJ = iECommerceLiveBridgeService.LIZJ()) != null) {
            map2.putAll(mapLIZJ);
        }
        map2.putAll(C2097608Jq.LJIIIIZZ(new Pair("sendAdLog", SendAdLogMethod.class), new Pair("sendThirdTrack", AdThirdTrackMethod.class)));
        map2.putAll(C2097608Jq.LJ());
        IShoppingAdsService iShoppingAdsService = (IShoppingAdsService) PluggableExtentionKt.pluggableSpi$default(IShoppingAdsService.class, false, false, false, 14, null);
        if (iShoppingAdsService != null && (mapLIZ = iShoppingAdsService.LIZ()) != null) {
            map2.putAll(mapLIZ);
        }
        map.put(InterfaceC1051730dTX.class, map2);
        return map;
    }

    @Override // com.ss.android.ugc.aweme.spark.bullet.IBulletHostProxy
    public final HashMap<Class<?>, HashMap<String, Class<?>>> LJFF() {
        C1060000dgs.LIZ.getClass();
        if (C1544000qHW.LJIIZILJ) {
            return new HashMap<>();
        }
        HashMap<Class<?>, HashMap<String, Class<?>>> map = new HashMap<>();
        HashMap<String, Class<?>> map2 = new HashMap<>();
        C1874940ytI.LIZ();
        C1877450yxL.LIZ();
        HashMap map3 = new HashMap();
        EnumC1059790dgX enumC1059790dgX = EnumC1059790dgX.ALL;
        Map mapLIZIZ = C1062300dka.LIZIZ(enumC1059790dgX, LivePreviewCTASmartDisplayManager.DEFAULT);
        if (mapLIZIZ != null) {
            map3.putAll(mapLIZIZ);
        }
        Map mapLIZIZ2 = C1062300dka.LIZIZ(enumC1059790dgX, "Spark");
        if (mapLIZIZ2 != null) {
            map3.putAll(mapLIZIZ2);
        }
        map2.putAll(map3);
        map.put(InterfaceC1063690dmp.class, map2);
        return map;
    }

    @Override // com.ss.android.ugc.aweme.spark.bullet.IBulletHostProxy
    public final List<InterfaceC1051730dTX> LIZJ(C1051660dTQ c1051660dTQ) {
        Map<String, InterfaceC1051760dTa> javaMethods;
        InterfaceC20673515v3 interfaceC20673515v3K4;
        Map<String, InterfaceC1051760dTa> liveWalletJSB;
        C1060000dgs.LIZ.getClass();
        if (C1544000qHW.LJIIZILJ) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        IESJsBridge iESJsBridge = (IESJsBridge) c1051660dTQ.LIZIZ(IESJsBridge.class);
        Object objLIZIZ = c1051660dTQ.LIZIZ(Context.class);
        if (iESJsBridge != null && objLIZIZ != null) {
            LiveMethod liveMethod = new LiveMethod(new WeakReference(objLIZIZ), iESJsBridge);
            EnumC1051570dTH enumC1051570dTH = EnumC1051570dTH.PROTECT;
            arrayList2.add(new BulletMethodAdapter$javaMethodToBullet$1("openLiveRoom", enumC1051570dTH, c1051660dTQ, liveMethod));
            arrayList2.add(new BulletMethodAdapter$javaMethodToBullet$1("openAweme", enumC1051570dTH, c1051660dTQ, new C1059930dgl(new WeakReference(objLIZIZ), iESJsBridge)));
            arrayList2.add(new BulletMethodAdapter$javaMethodToBullet$1("openRecord", enumC1051570dTH, c1051660dTQ, new C1066040dqc(new WeakReference(objLIZIZ))));
            DownloadFileMethod downloadFileMethod = new DownloadFileMethod(iESJsBridge);
            downloadFileMethod.attach(new WeakReference<>(objLIZIZ));
            arrayList2.add(new BulletMethodAdapter$javaMethodToBullet$1("downloadMedia", enumC1051570dTH, c1051660dTQ, downloadFileMethod));
            new WeakReference(objLIZIZ);
            arrayList2.add(new BulletMethodAdapter$javaMethodToBullet$1("appSetting", enumC1051570dTH, c1051660dTQ, new C1061880dju(iESJsBridge)));
            ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
            if (iLiveOuterService != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null && (liveWalletJSB = interfaceC20673515v3K4.getLiveWalletJSB(new WeakReference<>(objLIZIZ), iESJsBridge)) != null) {
                for (Map.Entry<String, InterfaceC1051760dTa> entry : liveWalletJSB.entrySet()) {
                    arrayList2.add(new BulletMethodAdapter$javaMethodToBullet$1(entry.getKey(), EnumC1051570dTH.PROTECT, c1051660dTQ, entry.getValue()));
                }
            }
        }
        arrayList.addAll(arrayList2);
        C1060000dgs.LIZ.getClass();
        ArrayList arrayList3 = new ArrayList();
        IESJsBridge iESJsBridge2 = (IESJsBridge) c1051660dTQ.LIZIZ(IESJsBridge.class);
        Object objLIZIZ2 = c1051660dTQ.LIZIZ(Context.class);
        if (iESJsBridge2 != null && objLIZIZ2 != null && (javaMethods = C0XQ7.LIZLLL().getJavaMethods(new WeakReference<>(objLIZIZ2), iESJsBridge2)) != null) {
            for (Map.Entry<String, InterfaceC1051760dTa> entry2 : javaMethods.entrySet()) {
                if (!TextUtils.equals(entry2.getKey(), "localPhoneNo")) {
                    arrayList3.add(C1047190dMD.LIZ(c1051660dTQ, entry2.getKey(), entry2.getValue()));
                }
            }
        }
        arrayList.addAll(arrayList3);
        C1060000dgs.LIZ.getClass();
        ArrayList arrayList4 = new ArrayList();
        Object objLIZIZ3 = c1051660dTQ.LIZIZ(IESJsBridge.class);
        Object objLIZIZ4 = c1051660dTQ.LIZIZ(Context.class);
        if (objLIZIZ3 != null && objLIZIZ4 != null) {
            new WeakReference(objLIZIZ4);
            arrayList4.add(new BulletMethodAdapter$javaMethodToBullet$1("copyToClipboard", EnumC1051570dTH.PROTECT, c1051660dTQ, new C1060420dhY()));
        }
        arrayList.addAll(arrayList4);
        List<InterfaceC1051730dTX> listLJIILLIIL = ComplianceServiceProvider.LJIL().LJIILLIIL(c1051660dTQ);
        if (listLJIILLIIL == null) {
            return arrayList;
        }
        arrayList.addAll(listLJIILLIIL);
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    @Override // com.ss.android.ugc.aweme.spark.bullet.IBulletHostProxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1051730dTX LIZIZ(X.C1051660dTQ r6, java.lang.String r7) {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bullet.BulletHostProxy.LIZIZ(X.0dTQ, java.lang.String):X.0dTX");
    }
}
