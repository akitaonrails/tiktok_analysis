package com.ss.android.ugc.aweme.requesttask.idle;

import X.C00GW;
import X.C01GW;
import X.C05EI;
import X.C07TA;
import X.C07TB;
import X.C098200Yq;
import X.C0C64;
import X.C0C88;
import X.C0CCZ;
import X.C0CF8;
import X.C0CQA;
import X.C0PEM;
import X.C0VSJ;
import X.C0VZ0;
import X.C0W9W;
import X.C0WT1;
import X.C1129604bO;
import X.C1209604oI;
import X.C1209704oJ;
import X.C1226604r2;
import X.C1226704r3;
import X.C1226804r4;
import X.C1226904r5;
import X.C1227004r6;
import X.C1227104r7;
import X.C1227204r8;
import X.C1227304r9;
import X.C1227404rA;
import X.C1243004tg;
import X.C1335290kqt;
import X.C1336210ksN;
import X.C1528020prk;
import X.C1549140qPo;
import X.C1550670qSH;
import X.C1551380qTQ;
import X.C1551470qTZ;
import X.C1551780qU4;
import X.C1551940qUK;
import X.C1552050qUV;
import X.C1552630qVR;
import X.C1552780qVg;
import X.C1552910qVt;
import X.C1552920qVu;
import X.C1552930qVv;
import X.C1552940qVw;
import X.C1552950qVx;
import X.C1552960qVy;
import X.C1552970qVz;
import X.C1553040qW6;
import X.C1553170qWJ;
import X.C1553240qWQ;
import X.C1553370qWd;
import X.C1553460qWm;
import X.C1553670qX7;
import X.C1553790qXJ;
import X.C1856807Pa;
import X.C1856907Pb;
import X.C1858207Po;
import X.C1866410yfX;
import X.C188800o2;
import X.C189200o6;
import X.C1905290zgF;
import X.C1957007lY;
import X.C2214201BlK;
import X.C2250131D5f;
import X.C2250201D5m;
import X.C23250099c;
import X.C2407009bw;
import X.C260090AHf;
import X.C263410ATz;
import X.C264820AZk;
import X.C264830AZl;
import X.C264840AZm;
import X.C292530BdL;
import X.C303220Bua;
import X.C307270C2r;
import X.C307280C2s;
import X.C452501pT;
import X.C596970NbD;
import X.C797990VSb;
import X.C817503Hh;
import X.EnumC1733330vCt;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.EnumC993310bxJ;
import X.InterfaceC2210981Bg8;
import X.InterfaceC2211051BgF;
import X.InterfaceC596980NbE;
import Y.ARunnableS14S0301000_23;
import Y.ARunnableS29S0201000_23;
import Y.AfS171S0100000_2;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.applog.AppLog;
import com.bytedance.geckox.AppSettingsManager;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.interceptors.zstd.compress.GeckoCompressConfig;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.CheckRequestParamModel;
import com.bytedance.geckox.model.CleanPolicyModel;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.policy.lazy.BlockLazyUpdateSettings;
import com.bytedance.geckox.policy.meta.ChannelMetaDataReportSettings;
import com.bytedance.geckox.settings.model.EventMapper;
import com.bytedance.geckox.settings.model.GeckoSSCConfigs;
import com.bytedance.geckox.settings.model.WaitGeckoSettingsConfig;
import com.bytedance.geckox.statistic.model.SyncEventModel;
import com.bytedance.geckox.sync.model.SyncCheckUpdateModel;
import com.bytedance.geckox.sync.model.SyncDownloadChanelModel;
import com.bytedance.geckox.sync.model.SyncMsgModel;
import com.bytedance.hybrid.spark.security.impl.service.gecko.SparkSecurityGeckoRewriteConfigList;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.storage.GeckoNewUserDowngradeConfig;
import com.ss.android.ugc.aweme.utils.gecko.GeckoDownloadResumeConfig;
import com.ss.android.ugc.aweme.utils.gecko.GeckoDownloadStrategy;
import com.ss.android.ugc.aweme.utils.gecko.GeckoExperimentsType;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import com.tiktok.geckox.ng.model.Config;
import com.tiktok.geckox.ng.model.MetaSettings;
import com.tiktok.geckox.ng.model.OptimizeMultiTriggerCheckUpdateSettings;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS263S0000000_23;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class GeckoGlobalInitTask implements C0CCZ {
    public final C01GW LL = C452501pT.LIZIZ(new C0WT1());

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "GeckoGlobalInitTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    public final void LIZ() {
        ChannelMetaDataReportSettings channelMetaDataReportSettings;
        Map<String, List<String>> map;
        C2407009bw.LIZ();
        ConcurrentHashMap<String, Boolean> concurrentHashMap = C0C88.LIZIZ;
        Boolean bool = concurrentHashMap.get("GeckoGlobalInitTask");
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool, bool2)) {
            return;
        }
        concurrentHashMap.put("GeckoGlobalInitTask", bool2);
        Context context = C1552050qUV.LIZ;
        DeviceRegisterManager.addOnDeviceConfigUpdateListener(new InterfaceC2210981Bg8() { // from class: X.0qWX
            @Override // X.InterfaceC2210981Bg8
            public final void LIZ(boolean z) {
                C1552050qUV.LJIJ();
            }

            @Override // X.InterfaceC2210981Bg8
            public final void LIZJ(boolean z) {
                C1552050qUV.LJIJ();
            }

            @Override // X.InterfaceC2210981Bg8
            public final void LIZIZ(String str, String str2) {
                C1552050qUV.LJIJ();
            }
        });
        C1553670qX7.LIZ();
        C0VSJ c0vsjLIZLLL = C1553670qX7.LIZLLL();
        C1551940qUK c1551940qUK = C797990VSb.LIZ;
        c0vsjLIZLLL.getAbsolutePath();
        c1551940qUK.getClass();
        HashMap map2 = new HashMap();
        map2.put("business_version", new OptionCheckUpdateParams.CustomValue() { // from class: X.0qWR
            @Override // com.bytedance.geckox.OptionCheckUpdateParams.CustomValue
            public final Object getValue() {
                C844470XAv.LIZ.getClass();
                return C844470XAv.LIZJ();
            }
        });
        if (((Boolean) C263410ATz.LIZ.getValue()).booleanValue()) {
            final String str = "creator";
            map2.put("user_identity", new OptionCheckUpdateParams.CustomValue() { // from class: X.0qWq
                @Override // com.bytedance.geckox.OptionCheckUpdateParams.CustomValue
                public final Object getValue() {
                    return str;
                }
            });
        }
        if (((Boolean) C1866410yfX.LIZLLL.getValue()).booleanValue()) {
            if (((Boolean) C1866410yfX.LIZIZ.getValue()).booleanValue()) {
                map2.put("live_resource_opt", new OptionCheckUpdateParams.CustomValue() { // from class: X.0qWV
                    @Override // com.bytedance.geckox.OptionCheckUpdateParams.CustomValue
                    public final Object getValue() {
                        return 5;
                    }
                });
            } else if (((Boolean) C1866410yfX.LIZJ.getValue()).booleanValue()) {
                map2.put("live_resource_opt", new OptionCheckUpdateParams.CustomValue() { // from class: X.0qWW
                    @Override // com.bytedance.geckox.OptionCheckUpdateParams.CustomValue
                    public final Object getValue() {
                        return 4;
                    }
                });
            }
        }
        c1551940qUK.LJIIJ(C1553670qX7.LIZ(), map2);
        if (((Boolean) C307280C2s.LIZ.getValue()).booleanValue()) {
            C1957007lY.LIZ.LIZJ = (Map) SettingsManager.LIZLLL().LJIIIIZZ("geckox_resource_clean_group_name", Map.class, C1129604bO.LIZ);
        }
        if ((((Number) C303220Bua.LIZ.getValue()).intValue() & 1) == 1) {
            if (C1336210ksN.LJ) {
                map = (Map) C2250131D5f.LJII.getValue();
            } else {
                int i = C1335290kqt.LIZ[C1336210ksN.LIZLLL().ordinal()];
                map = i != 1 ? (i == 2 || i == 3) ? (Map) C07TA.LIZJ.getValue() : (Map) C07TB.LIZJ.getValue() : (Map) C2250201D5m.LJIIIZ.getValue();
            }
            C1957007lY.LIZ.LJ = map;
        }
        AppSettingsManager appSettingsManager = C1957007lY.LIZ;
        appSettingsManager.LIZLLL = (Map) SettingsManager.LIZLLL().LJIIIIZZ("geckox_resource_clean_channel_list", Map.class, C00GW.LIZ);
        GeckoExperimentsType geckoExperimentsType = (GeckoExperimentsType) C307270C2r.LIZIZ.getValue();
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("gecko_fix_lazy_callback", false)) {
            appSettingsManager.LJIIIZ = true;
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "gecko_request_simplification", true, true)) {
            appSettingsManager.LJIIJ = true;
        }
        GeckoDownloadStrategy geckoDownloadStrategy = (GeckoDownloadStrategy) C0C64.LJIILLIIL().LJJII(GeckoDownloadStrategy.class, null, "GeckoDownloadStrategyAB", true);
        if (geckoDownloadStrategy == null || geckoDownloadStrategy.getAvailableStorageFull() <= 0 || geckoDownloadStrategy.getAvailableStoragePatch() <= 0) {
            appSettingsManager.LIZ = geckoExperimentsType == null ? 200 : geckoExperimentsType.getAvailableStorageFull();
            appSettingsManager.LIZIZ = geckoExperimentsType != null ? geckoExperimentsType.getAvailableStoragePatch() : 200;
        } else {
            appSettingsManager.LIZ = geckoDownloadStrategy.getAvailableStorageFull();
            appSettingsManager.LIZIZ = geckoDownloadStrategy.getAvailableStoragePatch();
        }
        appSettingsManager.LJIIIIZZ = ((Boolean) C264830AZl.LIZ.getValue()).booleanValue();
        C1552050qUV.LJ = geckoExperimentsType == null ? true : geckoExperimentsType.getUseGeckoSettings();
        try {
            channelMetaDataReportSettings = (ChannelMetaDataReportSettings) SettingsManager.LIZLLL().LJIIIIZZ("report_geckosdk_resource_info", ChannelMetaDataReportSettings.class, C1551470qTZ.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            channelMetaDataReportSettings = (ChannelMetaDataReportSettings) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
        }
        appSettingsManager.LJIIL = channelMetaDataReportSettings;
        if (C1552050qUV.LJ) {
            ((ArrayList) C1551380qTQ.LIZIZ).add(new Runnable() { // from class: X.0qVK
                /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
                /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public static void LIZ() {
                    /*
                        Method dump skipped, instruction units count: 248
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1552560qVK.LIZ():void");
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("CheckValidTask@e52.run");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("CheckValidTask@e52.run");
                }
            });
            C1551940qUK c1551940qUK2 = C797990VSb.LIZ;
            c1551940qUK2.LIZIZ();
            if (c1551940qUK2.LIZLLL == null) {
                throw new IllegalArgumentException("Please init GeckoGlobalConfig first");
            }
            c1551940qUK2.LIZJ();
            c1551940qUK2.LJ.LIZJ(1, false);
        }
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        GeckoDownloadResumeConfig geckoDownloadResumeConfig = C1553460qWm.LIZ;
        GeckoDownloadResumeConfig geckoDownloadResumeConfig2 = (GeckoDownloadResumeConfig) c0c64LJIILLIIL.LJJIIJ(true, "gecko_download_resume", 31744, GeckoDownloadResumeConfig.class, geckoDownloadResumeConfig, 1);
        if (geckoDownloadResumeConfig2 != null) {
            geckoDownloadResumeConfig = geckoDownloadResumeConfig2;
        }
        AppSettingsManager appSettingsManager2 = C1957007lY.LIZ;
        appSettingsManager2.LJFF = geckoDownloadResumeConfig.downloadResume;
        appSettingsManager2.LJI = geckoDownloadResumeConfig.downloadResumeAddAE;
        appSettingsManager2.LJII = geckoDownloadResumeConfig.resumeThreshold;
        ArrayList arrayList = (ArrayList) C1858207Po.LIZIZ.getValue();
        if (arrayList != null && !arrayList.isEmpty()) {
            C188800o2.LIZ(C1553670qX7.LIZ(), C797990VSb.LIZ.LJIILIIL, new HashSet(arrayList));
        }
        Config config = (Config) C1552910qVt.LIZIZ.getValue();
        if (config == null) {
            config = C1552910qVt.LIZ;
        }
        Config config2 = (Config) C1552920qVu.LIZIZ.getValue();
        if (config2 == null) {
            config2 = C1552920qVu.LIZ;
        }
        Config config3 = (Config) C1552930qVv.LIZIZ.getValue();
        if (config3 == null) {
            config3 = C1552930qVv.LIZ;
        }
        Config config4 = (Config) C1552940qVw.LIZIZ.getValue();
        if (config4 == null) {
            config4 = C1552940qVw.LIZ;
        }
        Config config5 = (Config) C1552950qVx.LIZIZ.getValue();
        if (config5 == null) {
            config5 = C1552950qVx.LIZ;
        }
        Config config6 = (Config) C1552960qVy.LIZIZ.getValue();
        if (config6 == null) {
            config6 = C1552960qVy.LIZ;
        }
        Config config7 = (Config) C1552970qVz.LIZIZ.getValue();
        if (config7 == null) {
            config7 = C1552970qVz.LIZ;
        }
        ArrayList arrayList2 = new ArrayList();
        List<EventMapper> list = config.eventMappers;
        if (list != null) {
            arrayList2.addAll(list);
        }
        List<EventMapper> list2 = config2.eventMappers;
        if (list2 != null) {
            arrayList2.addAll(list2);
        }
        List<EventMapper> list3 = config3.eventMappers;
        if (list3 != null) {
            arrayList2.addAll(list3);
        }
        List<EventMapper> list4 = config4.eventMappers;
        if (list4 != null) {
            arrayList2.addAll(list4);
        }
        List<EventMapper> list5 = config5.eventMappers;
        if (list5 != null) {
            arrayList2.addAll(list5);
        }
        List<EventMapper> list6 = config6.eventMappers;
        if (list6 != null) {
            arrayList2.addAll(list6);
        }
        List<EventMapper> list7 = config7.eventMappers;
        if (list7 != null) {
            arrayList2.addAll(list7);
        }
        Config config8 = new Config(arrayList2);
        WaitGeckoSettingsConfig waitGeckoSettingsConfig = (WaitGeckoSettingsConfig) C1553170qWJ.LIZIZ.getValue();
        if (waitGeckoSettingsConfig == null) {
            waitGeckoSettingsConfig = C1553170qWJ.LIZ;
        }
        appSettingsManager2.LJIILJJIL = waitGeckoSettingsConfig;
        appSettingsManager2.LJIJ = C0C64.LJIILLIIL().LJIIIZ(31744, "geckong_mappers_use_gp", true, false);
        C1552630qVR c1552630qVR = C1552630qVR.LIZ;
        String strLIZ = C1553670qX7.LIZ();
        MetaSettings metaSettings = (MetaSettings) C1552780qVg.LIZIZ.getValue();
        if (metaSettings == null) {
            metaSettings = C1552780qVg.LIZ;
        }
        c1552630qVR.getClass();
        AtomicInteger atomicInteger = C1552630qVR.LIZIZ;
        if (atomicInteger.get() == EnumC993310bxJ.Not.ordinal()) {
            atomicInteger.set(EnumC993310bxJ.Initializing.ordinal());
            C1552630qVR.LJII = strLIZ;
            if (metaSettings.optimizeMultiTriggerCheckUpdateSettings == null) {
                metaSettings.setOptimizeMultiTriggerCheckUpdateSettings(new OptimizeMultiTriggerCheckUpdateSettings(false, 600, 15, null));
            }
            C1552630qVR.LIZJ = metaSettings;
            if (appSettingsManager2.LJIJ) {
                C1552630qVR.LIZIZ();
            } else {
                C1552630qVR.LJ(config8.eventMappers);
                C1552630qVR.LIZIZ();
            }
        }
        ArrayList<String> arrayList3 = (ArrayList) C1226604r2.LIZIZ.getValue();
        if (arrayList3 == null) {
            arrayList3 = C1226604r2.LIZ;
        }
        ArrayList<String> arrayList4 = (ArrayList) C1226704r3.LIZIZ.getValue();
        if (arrayList4 == null) {
            arrayList4 = C1226704r3.LIZ;
        }
        ArrayList<String> arrayList5 = (ArrayList) C1226804r4.LIZIZ.getValue();
        if (arrayList5 == null) {
            arrayList5 = C1226804r4.LIZ;
        }
        ArrayList<String> arrayList6 = (ArrayList) C1226904r5.LIZIZ.getValue();
        if (arrayList6 == null) {
            arrayList6 = C1226904r5.LIZ;
        }
        C1209604oI.LIZIZ.getValue();
        C1209704oJ.LIZIZ.getValue();
        ArrayList arrayList7 = new ArrayList();
        arrayList7.addAll(arrayList3);
        arrayList7.addAll(arrayList4);
        arrayList7.addAll(arrayList5);
        arrayList7.addAll(arrayList6);
        if (((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).o6()) {
            arrayList7.addAll(((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).l3());
        }
        if (C1553790qXJ.LIZ()) {
            arrayList7.addAll(((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).f5());
        } else {
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).r5();
        }
        C01GW c01gw = C292530BdL.LIZIZ;
        if (!((ArrayList) c01gw.getValue()).isEmpty()) {
            arrayList7.addAll((ArrayList) c01gw.getValue());
        }
        ArrayList<String> arrayList8 = C0CQA.LIZ().contains("tts") ? ((GeckoNewUserDowngradeConfig) C1553040qW6.LIZIZ.getValue()).channelListTTS : ((GeckoNewUserDowngradeConfig) C1553040qW6.LIZIZ.getValue()).channelList;
        if (!arrayList8.isEmpty()) {
            arrayList7.addAll(arrayList8);
        }
        if (C1905290zgF.LIZ(64) || (((Number) C1243004tg.LIZ.getValue()).intValue() & 1) == 1) {
            C01GW c01gw2 = C1856807Pa.LIZIZ;
            if (!((ArrayList) c01gw2.getValue()).isEmpty()) {
                arrayList7.addAll((ArrayList) c01gw2.getValue());
            }
        }
        if (!arrayList7.isEmpty()) {
            C188800o2.LIZ(C1553670qX7.LIZ(), C797990VSb.LIZ.LJIILIIL, new HashSet(arrayList7));
        }
        ArrayList<String> arrayList9 = (ArrayList) C1227004r6.LIZIZ.getValue();
        if (arrayList9 == null) {
            arrayList9 = C1227004r6.LIZ;
        }
        ArrayList<String> arrayList10 = (ArrayList) C1227104r7.LIZIZ.getValue();
        if (arrayList10 == null) {
            arrayList10 = C1227104r7.LIZ;
        }
        ArrayList<String> arrayList11 = (ArrayList) C1227204r8.LIZIZ.getValue();
        if (arrayList11 == null) {
            arrayList11 = C1227204r8.LIZ;
        }
        ArrayList<String> arrayList12 = (ArrayList) C1227304r9.LIZIZ.getValue();
        if (arrayList12 == null) {
            arrayList12 = C1227304r9.LIZ;
        }
        ArrayList<String> arrayList13 = (ArrayList) C1227404rA.LIZIZ.getValue();
        if (arrayList13 == null) {
            arrayList13 = C1227404rA.LIZ;
        }
        ArrayList arrayList14 = new ArrayList();
        arrayList14.addAll(arrayList9);
        arrayList14.addAll(arrayList10);
        arrayList14.addAll(arrayList11);
        arrayList14.addAll(arrayList12);
        arrayList14.addAll(arrayList13);
        if (((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).o6()) {
            arrayList14.addAll(((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).l3());
        }
        if (C1553790qXJ.LIZ()) {
            arrayList14.addAll(((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).f5());
        } else {
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).r5();
        }
        if (!((ArrayList) c01gw.getValue()).isEmpty()) {
            arrayList14.addAll((ArrayList) c01gw.getValue());
        }
        if (C1905290zgF.LIZ(64) || (((Number) C1243004tg.LIZ.getValue()).intValue() & 1) == 1) {
            C01GW c01gw3 = C1856907Pb.LIZIZ;
            if (!((ArrayList) c01gw3.getValue()).isEmpty()) {
                arrayList14.addAll((ArrayList) c01gw3.getValue());
            }
        }
        if (!arrayList14.isEmpty()) {
            C188800o2.LIZ(C1553670qX7.LIZ(), C797990VSb.LIZ.LJIILJJIL, new HashSet(arrayList14));
        }
        appSettingsManager2.LJIILIIL = ((Boolean) C264840AZm.LIZ.getValue()).booleanValue();
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        BlockLazyUpdateSettings blockLazyUpdateSettings = C1553370qWd.LIZ;
        BlockLazyUpdateSettings blockLazyUpdateSettings2 = (BlockLazyUpdateSettings) settingsManagerLIZLLL.LJIIIIZZ("gecko_lazy_update_settings", BlockLazyUpdateSettings.class, blockLazyUpdateSettings);
        if (blockLazyUpdateSettings2 != null) {
            blockLazyUpdateSettings = blockLazyUpdateSettings2;
        }
        appSettingsManager2.LJIILL = blockLazyUpdateSettings;
        appSettingsManager2.LJIILLIIL = C0C64.LJIILLIIL().LJIIIZ(31744, "gecko_expire_clean_target_optimize", true, false);
        SettingsManager settingsManagerLIZLLL2 = SettingsManager.LIZLLL();
        GeckoSSCConfigs geckoSSCConfigs = C1553240qWQ.LIZ;
        GeckoSSCConfigs geckoSSCConfigs2 = (GeckoSSCConfigs) settingsManagerLIZLLL2.LJIIIIZZ("gecko_ssc_configs", GeckoSSCConfigs.class, geckoSSCConfigs);
        if (geckoSSCConfigs2 != null) {
            geckoSSCConfigs = geckoSSCConfigs2;
        }
        appSettingsManager2.LJIIZILJ = geckoSSCConfigs;
        appSettingsManager2.LJIJI = ((Boolean) C264820AZk.LIZ.getValue()).booleanValue();
        Map<String, String> map3 = SparkSecurityGeckoRewriteConfigList.LIZ().channelMapping;
        if (map3 != null) {
            HashMap map4 = new HashMap();
            for (Map.Entry<String, String> entry : map3.entrySet()) {
                map4.put(entry.getValue(), entry.getKey());
            }
            appSettingsManager2.LJIJJ = map4;
        }
        C596970NbD c596970NbD = C596970NbD.LIZIZ;
        C1528020prk.LIZ().getClass();
        c596970NbD.LIZ(EnumC1733330vCt.GECKO_ONLINE_SYNC, new InterfaceC596980NbE() { // from class: X.0qUd
            @Override // X.InterfaceC596980NbE
            public final void LJ(C1525630pnt c1525630pnt) {
                InterfaceC1553470qWn interfaceC1553470qWn;
                byte[] bArr = c1525630pnt.LIZ;
                if (bArr != null) {
                    try {
                        SyncMsgModel syncMsgModel = (SyncMsgModel) C1551400qTS.LIZIZ.LIZ.LJII(new String(bArr, "utf-8"), SyncMsgModel.class);
                        int msgType = syncMsgModel.getMsgType();
                        if (msgType != 1) {
                            if (msgType != 2) {
                                if (msgType != 3) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("unexpected sync message type:");
                                    sbLIZ.append(syncMsgModel.getMsgType());
                                    final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                    interfaceC1553470qWn = new InterfaceC1553470qWn(strLIZIZ) { // from class: X.0qV6
                                        @Override // X.InterfaceC1553470qWn
                                        public final void LIZ(SyncMsgModel syncMsgModel2) {
                                            C1552410qV5 c1552410qV5 = C1553390qWf.LIZ;
                                            int syncTaskId = syncMsgModel2.getSyncTaskId();
                                            int msgType2 = syncMsgModel2.getMsgType();
                                            c1552410qV5.getClass();
                                            SyncEventModel syncEventModel = new SyncEventModel(c1552410qV5.LIZ);
                                            syncEventModel.setSyncTaskId(syncTaskId);
                                            syncEventModel.setSyncTaskType(msgType2);
                                            syncEventModel.setSyncStatsType(2);
                                            C1551780qU4.LJIIJJI(syncEventModel);
                                        }
                                    };
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("unexpected sync message type:");
                                    sbLIZ2.append(syncMsgModel.getMsgType());
                                    C1553130qWF.LIZ("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ2));
                                } else {
                                    interfaceC1553470qWn = new InterfaceC1553470qWn() { // from class: X.0qUe
                                        @Override // X.InterfaceC1553470qWn
                                        public final void LIZ(SyncMsgModel syncMsgModel2) {
                                            Map<String, List<SyncDownloadChanelModel>> downloadInfo;
                                            if (syncMsgModel2.getData() != null && (downloadInfo = syncMsgModel2.getData().getDownloadInfo()) != null && !downloadInfo.isEmpty()) {
                                                C1553130qWF.LIZ("gecko-debug-tag", "sync download CDN channel msg", downloadInfo);
                                                ArrayList arrayList15 = new ArrayList();
                                                for (String str2 : downloadInfo.keySet()) {
                                                    List<SyncDownloadChanelModel> list8 = downloadInfo.get(str2);
                                                    if (list8 != null && !list8.isEmpty()) {
                                                        for (SyncDownloadChanelModel syncDownloadChanelModel : list8) {
                                                            UpdatePackage updatePackage = new UpdatePackage(syncDownloadChanelModel.getVersion(), syncDownloadChanelModel.getChannel(), (UpdatePackage.Package) null, (UpdatePackage.Package) null);
                                                            updatePackage.setPackageType(syncDownloadChanelModel.getPackageType());
                                                            updatePackage.setAccessKey(str2);
                                                            SyncDownloadChanelModel.SyncChannelUrlModel url = syncDownloadChanelModel.getUrl();
                                                            List<String> domains = url.getDomains();
                                                            if (!TextUtils.isEmpty(url.getScheme()) && !TextUtils.isEmpty(url.getUri()) && domains != null && !domains.isEmpty()) {
                                                                ArrayList arrayList16 = new ArrayList();
                                                                for (String str3 : domains) {
                                                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                                    sbLIZ3.append(url.getScheme());
                                                                    sbLIZ3.append("://");
                                                                    sbLIZ3.append(str3);
                                                                    sbLIZ3.append(url.getUri());
                                                                    arrayList16.add(C2188811AlT.LIZIZ(sbLIZ3));
                                                                }
                                                                UpdatePackage.Package r4 = new UpdatePackage.Package(syncDownloadChanelModel.getId(), arrayList16, syncDownloadChanelModel.getMd5());
                                                                r4.setLength(syncDownloadChanelModel.getSize());
                                                                updatePackage.setFullPackage(r4);
                                                                arrayList15.add(updatePackage);
                                                            }
                                                        }
                                                    }
                                                }
                                                if (arrayList15.isEmpty()) {
                                                    return;
                                                }
                                                C1552410qV5 c1552410qV5 = C1553390qWf.LIZ;
                                                int syncTaskId = syncMsgModel2.getSyncTaskId();
                                                if (!c1552410qV5.LIZ(syncTaskId, syncMsgModel2.getMsgType(), syncMsgModel2.getTimestamp())) {
                                                    C1553130qWF.LIZ("gecko-debug-tag", "sync download CDN channel start");
                                                    C1551510qTd.LIZ.LIZ().execute(new ARunnableS29S0201000_23(syncTaskId, arrayList15, c1552410qV5, 5));
                                                }
                                            }
                                        }
                                    };
                                }
                            } else {
                                interfaceC1553470qWn = new InterfaceC1553470qWn() { // from class: X.0qUc
                                    @Override // X.InterfaceC1553470qWn
                                    public final void LIZ(SyncMsgModel syncMsgModel2) {
                                        if (syncMsgModel2.getData() != null && syncMsgModel2.getData().getCleanInfo() != null && !syncMsgModel2.getData().getCleanInfo().isEmpty()) {
                                            C1552410qV5 c1552410qV5 = C1553390qWf.LIZ;
                                            int syncTaskId = syncMsgModel2.getSyncTaskId();
                                            int msgType2 = syncMsgModel2.getMsgType();
                                            long timestamp = syncMsgModel2.getTimestamp();
                                            Map<String, CleanPolicyModel> cleanInfo = syncMsgModel2.getData().getCleanInfo();
                                            if (!c1552410qV5.LIZ(syncTaskId, msgType2, timestamp)) {
                                                C1553130qWF.LIZ("gecko-debug-tag", "sync clean channel msg start");
                                                C1551940qUK c1551940qUK3 = C797990VSb.LIZ;
                                                c1551940qUK3.LIZIZ();
                                                C1551200qT8.LIZ(4, cleanInfo, c1551940qUK3.LIZLLL.getRootDirectory(), null);
                                            }
                                        }
                                    }
                                };
                            }
                        } else {
                            interfaceC1553470qWn = new InterfaceC1553470qWn() { // from class: X.0qUW
                                @Override // X.InterfaceC1553470qWn
                                public final void LIZ(SyncMsgModel syncMsgModel2) {
                                    SyncCheckUpdateModel checkUpdateInfo = syncMsgModel2.getData().getCheckUpdateInfo();
                                    C1553130qWF.LIZ("gecko-debug-tag", "sync check update msg", checkUpdateInfo);
                                    Map<String, SyncCheckUpdateModel.SyncChannelModel> config9 = checkUpdateInfo.getConfig();
                                    if (config9 != null && !config9.isEmpty()) {
                                        HashMap map5 = new HashMap();
                                        HashMap map6 = new HashMap();
                                        Map<String, Map<String, OptionCheckUpdateParams.CustomValue>> map7 = C797990VSb.LIZ.LIZIZ;
                                        for (String str2 : config9.keySet()) {
                                            SyncCheckUpdateModel.SyncChannelModel syncChannelModel = config9.get(str2);
                                            CheckRequestParamModel checkRequestParamModel = new CheckRequestParamModel(syncChannelModel.getGroup());
                                            ArrayList arrayList15 = new ArrayList();
                                            Iterator<String> it2 = syncChannelModel.getTargetChannel().iterator();
                                            while (it2.hasNext()) {
                                                arrayList15.add(new CheckRequestBodyModel.TargetChannel(it2.next()));
                                            }
                                            checkRequestParamModel.setTargetChannels(arrayList15);
                                            map5.put(str2, checkRequestParamModel);
                                            if (map7 != null) {
                                                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) map7;
                                                if (!concurrentHashMap2.isEmpty() && concurrentHashMap2.containsKey(str2)) {
                                                    HashMap map8 = new HashMap();
                                                    Map map9 = (Map) concurrentHashMap2.get(str2);
                                                    if (map9 != null && !map9.isEmpty()) {
                                                        for (Map.Entry entry2 : map9.entrySet()) {
                                                            if (syncChannelModel.getCustomKeys().contains(entry2.getKey())) {
                                                                map8.put(entry2.getKey(), ((OptionCheckUpdateParams.CustomValue) entry2.getValue()).getValue());
                                                            }
                                                        }
                                                        map6.put(str2, map8);
                                                    }
                                                }
                                            }
                                        }
                                        C1552410qV5 c1552410qV5 = C1553390qWf.LIZ;
                                        int syncTaskId = syncMsgModel2.getSyncTaskId();
                                        if (!c1552410qV5.LIZ(syncTaskId, syncMsgModel2.getMsgType(), syncMsgModel2.getTimestamp()) && !map5.isEmpty()) {
                                            C1551800qU6 c1551800qU6 = new C1551800qU6();
                                            OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
                                            optionCheckUpdateParams.setCustomParam(map6);
                                            optionCheckUpdateParams.setEnableRetry(true);
                                            optionCheckUpdateParams.setEnableThrottle(false);
                                            optionCheckUpdateParams.setCheckUpdateData(c1551800qU6);
                                            C1553130qWF.LIZ("gecko-debug-tag", "sync check update start");
                                            C1551510qTd.LIZ.LIZ().execute(new ARunnableS14S0301000_23(map5, optionCheckUpdateParams, c1552410qV5, syncTaskId, 1));
                                        }
                                    }
                                }
                            };
                        }
                        interfaceC1553470qWn.LIZ(syncMsgModel);
                    } catch (UnsupportedEncodingException e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1553130qWF.LIZ("gecko-debug-tag", "sync message encoding exception:", e);
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        C1553130qWF.LIZ("gecko-debug-tag", "sync message exception:", e2);
                    }
                }
            }
        });
        C2214201BlK.LIZLLL().LJJLJLI(new AfS171S0100000_2(this, 36));
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C1551780qU4 c1551780qU4 = C1551780qU4.LIZ;
        AFwS187S0000000_2 aFwS187S0000000_2 = AFwS187S0000000_2.get$arr$(615);
        c1551780qU4.getClass();
        C1551780qU4.LIZJ = aFwS187S0000000_2;
        if (C1549140qPo.LIZ().enabled) {
            AppLog.addSessionHook(new InterfaceC2211051BgF() { // from class: X.01vj
                @Override // X.InterfaceC2211051BgF
                public final void LIZJ(String str, long j, JSONObject jSONObject) {
                }

                @Override // X.InterfaceC2211051BgF
                public final void LIZIZ(long j, String str) {
                    C01VY.LIZ(System.currentTimeMillis());
                }

                @Override // X.InterfaceC2211051BgF
                public final void LIZ(String str, long j, JSONObject jSONObject) {
                    C01VY.LIZ(System.currentTimeMillis());
                }
            });
        }
        final GeckoCompressConfig geckoCompressConfigLIZ = C1549140qPo.LIZ();
        new PthreadTimer("GeckoCompressUtil").schedule(new C0W9W() { // from class: X.0qSR
            public int LL;

            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("GeckoCompressUtil@ea7d.stopCompressionConfig$1");
                boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
                try {
                    LIZ();
                } finally {
                }
                if (zLJ) {
                    C0W9U.LJFF();
                }
                C1C7U.LIZIZ("GeckoCompressUtil@ea7d.stopCompressionConfig$1");
            }

            public final void LIZ() {
                C1512840pTG c1512840pTGLIZLLL = C1BCA.LIZLLL();
                if (c1512840pTGLIZLLL.LIZ.getScore() >= C1549140qPo.LIZ().cpu_usage_level) {
                    int i = this.LL + 1;
                    this.LL = i;
                    GeckoCompressConfig geckoCompressConfig = geckoCompressConfigLIZ;
                    if (i >= geckoCompressConfig.decompress_trigger_count) {
                        this.LL = 0;
                        if (!geckoCompressConfig.enabled) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("compress switch off, trigger decompress by cpu score: ");
                            sbLIZ.append(c1512840pTGLIZLLL.LIZ.getScore());
                            C1553130qWF.LIZ("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ));
                            C1550730qSN c1550730qSN = C1550730qSN.LIZ;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Map.Entry<String, ConcurrentHashMap<String, C1550720qSM>> entry : C1550730qSN.LIZJ.entrySet()) {
                                String key = entry.getKey();
                                ConcurrentHashMap<String, C1550720qSM> value = entry.getValue();
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                for (Map.Entry<String, C1550720qSM> entry2 : value.entrySet()) {
                                    if (entry2.getValue().LIZIZ) {
                                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                                    }
                                }
                                if (!linkedHashMap2.isEmpty()) {
                                    linkedHashMap.put(key, linkedHashMap2);
                                }
                            }
                            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                                String str = (String) entry3.getKey();
                                for (Map.Entry entry4 : ((Map) entry3.getValue()).entrySet()) {
                                    String str2 = (String) entry4.getKey();
                                    C1550720qSM c1550720qSM = (C1550720qSM) entry4.getValue();
                                    try {
                                        C1551980qUO c1551980qUO = C1551980qUO.LIZ;
                                        UpdatePackage updatePackage = new UpdatePackage(c1550720qSM, CastLongProtector.parseLong(c1550720qSM.LIZLLL), str, str2);
                                        updatePackage.setDecompressFrom(2);
                                        AFwS263S0000000_23 aFwS263S0000000_23 = AFwS263S0000000_23.get$arr$(4);
                                        c1551980qUO.getClass();
                                        C1551980qUO.LIZ(updatePackage, aFwS263S0000000_23);
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                    }
                                }
                            }
                            return;
                        }
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("trigger compression by cpu score: ");
                    sbLIZ2.append(c1512840pTGLIZLLL.LIZ.getScore());
                    C1553130qWF.LIZ("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ2));
                    C1550750qSP.LIZ();
                }
            }
        }, 0L, 60000L);
        List<String> list = geckoCompressConfigLIZ.opt_objective;
        C0CF8.LIZ.getClass();
        if (list.contains(String.valueOf(C0CF8.LIZIZ().getValue())) || geckoCompressConfigLIZ.opt_objective.contains("all_device_opt")) {
            C1550670qSH c1550670qSH = C1550670qSH.LIZ;
            C1550670qSH.LIZLLL = new AwS575S0100000_31(geckoCompressConfigLIZ, 9);
        }
        long jLongValue = ((Number) C260090AHf.LIZ.getValue()).longValue();
        if (jLongValue > 0) {
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C05EI(jLongValue, this, null), 2);
        } else {
            LIZ();
        }
    }
}
