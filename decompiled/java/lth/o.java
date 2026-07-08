package lth;

import X.C01GW;
import X.C09DC;
import X.C0ARF;
import X.C0C64;
import X.C0CHQ;
import X.C0XS9;
import X.C13RE;
import X.C13RH;
import X.C13RI;
import X.C1403010mc7;
import X.C1411520mpq;
import X.C1443590nfZ;
import X.C1447430nll;
import X.C1866300yfM;
import X.C19997113Mb;
import X.C19997713Mh;
import X.C20002113Nz;
import X.C20005913Pl;
import X.C20010613Rg;
import X.C20011013Rk;
import X.C2208671BcP;
import X.C2216151BoT;
import X.C2216161BoU;
import X.C2504709rh;
import X.C278800AwI;
import X.C292590BdR;
import X.C297640Bla;
import X.C306080BzC;
import X.C365090ETb;
import X.C554190LoP;
import X.C801140Vbk;
import X.C823050WQl;
import X.C838130WuJ;
import X.C861730XrH;
import X.C988940bqG;
import X.InterfaceC1394580mOW;
import X.InterfaceC1420020n3Y;
import X.InterfaceC1434690nRD;
import X.InterfaceC1439690nZH;
import X.InterfaceC1445350niP;
import X.InterfaceC1447070nlB;
import X.InterfaceC1447080nlC;
import X.InterfaceC1457290o1f;
import X.InterfaceC1624140sMm;
import X.InterfaceC1631430sYX;
import X.InterfaceC1655090tAh;
import X.InterfaceC194468116k;
import X.InterfaceC2269341Ds4;
import X.InterfaceC2269521DsM;
import X.InterfaceC376620Epg;
import X.InterfaceC555500LqW;
import X.InterfaceC580190MpF;
import X.InterfaceC855410Xh5;
import X.InterfaceC856880XjS;
import Y.AObjectS127S0000000_30;
import android.app.Application;
import android.os.Build;
import android.util.Log;
import com.bef.effectsdk.EffectSDKBuildConfig;
import com.bef.effectsdk.EffectSensorCallback;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.entry.auth.CertAuthEntry;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ttve.nativePort.TEEffectUtils;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatformMonitor;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.internal.ICreationEventMonitorService;
import com.ss.android.ugc.aweme.port.in.IAnotherMusicService;
import com.ss.android.ugc.aweme.port.in.IHashTagService;
import com.ss.android.ugc.aweme.property.EnableEffectCleanupOnUsing;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.IFoundationAVService;
import com.ss.android.ugc.aweme.services.IInternalAVService;
import com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.effectmanager.DownloadableModelConfig;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.DownloadableModelSupportLibraryLoader;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.FetchModelType;
import com.ss.android.ugc.effectmanager.ModelEventListener;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.logger.ILogger;
import com.ss.android.ugc.effectmanager.common.model.ModelInfo;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ugc.effectplatform.EffectSingleDownloadOpt;
import com.ss.ugc.effectplatform.abtest.EffectCleanConfig;
import java.util.List;
import kotlin.text.a0;
import lth.o;

/* JADX INFO: loaded from: classes31.dex */
public class o {
    public static Application LIZ;
    public static Gson LIZIZ;
    public static InterfaceC376620Epg LIZJ;
    public static InterfaceC194468116k LIZLLL;
    public static InterfaceC856880XjS LJ;
    public static InterfaceC1420020n3Y LJFF;
    public static IAnotherMusicService LJI;
    public static InterfaceC2269521DsM LJII;
    public static IHashTagService LJIIIIZZ;
    public static InterfaceC1631430sYX LJIIIZ;
    public static InterfaceC855410Xh5 LJIIJ;
    public static C1443590nfZ LJIIJJI;
    public static C1447430nll LJIIL;
    public static C1443590nfZ LJIILIIL;
    public static InterfaceC1439690nZH LJIILJJIL;
    public static InterfaceC1655090tAh LJIILL;
    public static InterfaceC580190MpF LJIILLIIL;
    public static InterfaceC1457290o1f LJIIZILJ;
    public static InterfaceC1445350niP LJIJ;
    public static InterfaceC1434690nRD LJIJI;
    public static InterfaceC555500LqW LJIJJ;
    public static InterfaceC1447080nlC LJIJJLI;
    public static InterfaceC2269341Ds4 LJIL;
    public static InterfaceC1447070nlB LJJ;
    public static InterfaceC1624140sMm LJJI;
    public static C2208671BcP LJJIFFI;
    public static final Object LJJII = new Object();

    public static void LIZJ() {
        C20005913Pl.LJIIJ = true;
        C13RH.LIZ = C13RH.LIZ || (C988940bqG.LIZ() ? ((Boolean) C306080BzC.LIZ.getValue()).booleanValue() : C0C64.LJIILLIIL().LJIIIZ(31744, "enable_effectplatform_decrypt_optimization", true, false));
        C13RE.LIZ = true;
        C13RI.LIZ = true;
        C19997713Mh.LIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "ep_enable_directory_integrity_cache", true, false);
        C19997713Mh.LIZIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "ep_enable_lru_clean_trigger_time_opt", true, false);
        C19997713Mh.LIZJ = C297640Bla.LIZ();
        C19997713Mh.LJFF = C1866300yfM.LIZ();
        C19997713Mh.LJI = ((Boolean) C0ARF.LIZ.getValue()).booleanValue();
        C01GW c01gw = EnableEffectCleanupOnUsing.LIZIZ;
        C19997713Mh.LJ = new EffectCleanConfig(((EnableEffectCleanupOnUsing.EffectCleanConfig) c01gw.getValue()).isOpen, ((EnableEffectCleanupOnUsing.EffectCleanConfig) c01gw.getValue()).cacheThresholdMb * 1048576, ((EnableEffectCleanupOnUsing.EffectCleanConfig) c01gw.getValue()).cacheAfterCleanMb * 1048576);
        C19997713Mh.LIZLLL = new C19997113Mb(C20011013Rk.LIZ().isOpen, a0.LJJLIIIJILLIZJL(C20011013Rk.LIZ().allowList, new String[]{","}, 0, 6), C20011013Rk.LIZ().cleanupThresholdMb * 1048576, C20011013Rk.LIZ().retentionThresholdMb * 1048576, C20011013Rk.LIZ().enableLruClean, ((long) C20011013Rk.LIZ().lruCacheDays) * 86400000);
        C20002113Nz.LIZIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "ep_diff_effect_check_url", true, false);
        C20002113Nz.LIZJ = new AObjectS127S0000000_30(3);
    }

    static {
        Application application = C0CHQ.LIZ;
        InterfaceC2269341Ds4 interfaceC2269341Ds4LIZ = C0CHQ.LIZ();
        InterfaceC1447070nlB interfaceC1447070nlB = C1403010mc7.LIZ;
        LIZ = application;
        LJIL = interfaceC2269341Ds4LIZ;
        LJJ = interfaceC1447070nlB;
        LIZIZ = interfaceC2269341Ds4LIZ.getGson();
        LIZJ = LJJ.getApplicationService();
        LIZLLL = LJJ.getChallengeService();
        LJ = LJJ.getCaptionMentionService();
        LJFF = LJJ.getRegionService();
        LJI = LJJ.getMusicService();
        LJIILJJIL = LJJ.getPublishService();
        LJII = LJJ.LJI();
        LJIIIIZZ = LJJ.getHashTagService();
        LJJ.getSyncShareService();
        LJIIIZ = LJJ.getCommerceService();
        LJIIJ = LJJ.getSpService();
        LJIILL = LJJ.getLiveService();
        LJIILLIIL = LJJ.getBridgeService();
        LJIIZILJ = LJIL.getAccountService();
        LJIJ = LJIL.getNetworkService();
        LJIJI = LJJ.LIZJ();
        LJIJJ = LJJ.getBusinessGoodsService();
        LJIJJLI = LJJ.getShareService();
        LJIL.getIStickerPropService();
        LJJI = LJIL.unlockStickerService();
        LJIL.getLocalHashTagService();
        LJJIFFI = LJIL.LJJJJ();
        LJIIJJI = new C1443590nfZ(false);
        LJIIL = new C1447430nll();
        LJIILIIL = new C1443590nfZ(true);
        C2216161BoU.LIZ(application, LIZIZ, LJJIFFI);
        if (C801140Vbk.LIZ()) {
            ICreationEventMonitorService iCreationEventMonitorService = (ICreationEventMonitorService) PluggableExtentionKt.pluggableSpi(ICreationEventMonitorService.class);
            if (iCreationEventMonitorService != null) {
                iCreationEventMonitorService.LIZIZ((List) C292590BdR.LIZ.getValue());
            }
            C1411520mpq.LIZ.getClass();
            C1411520mpq.LJ.getValue();
        }
    }

    public static String LIZ() {
        final StringBuilder sb = new StringBuilder();
        C861730XrH.LIZ.LIZ(new InterfaceC1394580mOW() { // from class: X.13Rj
            @Override // X.InterfaceC1394580mOW
            public final boolean apply(Object obj) {
                StringBuilder sb2 = sb;
                Application application = o.LIZ;
                if (obj instanceof InterfaceC20011613Rq) {
                    sb2.append(obj);
                    sb2.append(" isRecording: ");
                    sb2.append(((InterfaceC20011613Rq) obj).isRecording());
                    sb2.append("\n");
                    return false;
                }
                sb2.append(obj);
                sb2.append("\n");
                return false;
            }
        });
        return sb.toString();
    }

    public static void LIZLLL() {
        synchronized (LJJII) {
            try {
                if (!DownloadableModelSupport.isInitialized()) {
                    LIZJ();
                    IEffectPlatformFactory iEffectPlatformFactory = (IEffectPlatformFactory) ServiceManager.get().getService(IEffectPlatformFactory.class);
                    EffectPlatformBuilder effectPlatformBuilder = new EffectPlatformBuilder();
                    effectPlatformBuilder.setContext(LIZ);
                    EffectConfiguration effectConfigurationBuild = iEffectPlatformFactory.createEffectConfigurationBuilder(effectPlatformBuilder).build();
                    final C20010613Rg c20010613Rg = new C20010613Rg();
                    DownloadableModelConfig.Builder builder = new DownloadableModelConfig.Builder();
                    builder.setAssetManager(LIZ.getAssets());
                    builder.setJsonConverter(new C09DC(C0CHQ.LIZ().getGson()));
                    builder.setMonitorService(new EffectPlatformMonitor());
                    builder.setAppId(EffectPlatform.LJJJJJ());
                    builder.setAccessKey("142710f02c3a11e8b42429f14557854a");
                    builder.setDeviceType(Build.MODEL);
                    builder.setHosts(((IEffectPlatformFactory) ServiceManager.get().getService(IEffectPlatformFactory.class)).getDownloadableModelHosts());
                    builder.setSdkVersion(LIZIZ());
                    builder.setWorkspace(C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJLI(""));
                    builder.setEffectNetWorker(new C0XS9());
                    builder.setEffectConfiguration(effectConfigurationBuild);
                    builder.setFetchModelListApiVersion(C0C64.LJIILLIIL().LJIIIZ(31744, "ckresource_simplify_model_interface", true, false) ? 2 : 1);
                    builder.setExecutor(C823050WQl.LIZLLL());
                    builder.setRetryCount(((Number) C278800AwI.LIZ.getValue()).intValue());
                    builder.setBackupUrlRetryCount(((EffectSingleDownloadOpt.Config) EffectSingleDownloadOpt.LIZIZ.getValue()).backupUrlRetryCount);
                    builder.setEventListener(new ModelEventListener() { // from class: X.13Rh
                        @Override // com.ss.android.ugc.effectmanager.ModelEventListener
                        public final void onModelDownloadStart(Effect effect, ModelInfo modelInfo) {
                            c20010613Rg.startDownloadEffectModelAlog(effect, modelInfo, o.LIZIZ());
                        }

                        @Override // com.ss.android.ugc.effectmanager.ModelEventListener
                        public final void onModelNotFound(Effect effect, Exception exc) {
                            C13RX c13rx = C13RX.LIZIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("onModelNotFound\n");
                            sbLIZ.append(Log.getStackTraceString(exc));
                            C201955140j.LJII(c13rx, C2188811AlT.LIZIZ(sbLIZ));
                            C543670LTx c543670LTx = new C543670LTx();
                            c543670LTx.LIZ.put("errorDesc", Log.getStackTraceString(exc));
                            c543670LTx.LIZ.put("zip_model", 0);
                            C1637890six.LJ("model_not_found_rate", 1, c543670LTx.LJ());
                        }

                        @Override // com.ss.android.ugc.effectmanager.ModelEventListener
                        public final void onModelDownloadError(Effect effect, ModelInfo modelInfo, Exception exc) {
                            C13RX c13rx = C13RX.LIZIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("onModelDownloadError ");
                            sbLIZ.append(effect.getName());
                            sbLIZ.append(" requirements ");
                            sbLIZ.append(modelInfo.getName());
                            C201955140j.LJII(c13rx, C2188811AlT.LIZIZ(sbLIZ));
                            C543670LTx c543670LTx = new C543670LTx();
                            c543670LTx.LIZ.put("errorDesc", Log.getStackTraceString(exc));
                            c543670LTx.LIZ.put("zip_model", 0);
                            C1637890six.LJ("service_model_download_error_rate", 1, c543670LTx.LJ());
                            c20010613Rg.endDownloadEffectModelAlog(effect, modelInfo, -1L, -1, exc, o.LIZIZ());
                        }

                        @Override // com.ss.android.ugc.effectmanager.ModelEventListener
                        public final void onModelDownloadSuccess(Effect effect, ModelInfo modelInfo, long j) {
                            C13RX c13rx = C13RX.LIZIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("onModelDownloadSuccess ");
                            sbLIZ.append(effect.getName());
                            sbLIZ.append(" requirements ");
                            sbLIZ.append(modelInfo.getName());
                            C201955140j.LIZJ(c13rx, C2188811AlT.LIZIZ(sbLIZ));
                            C543670LTx c543670LTx = new C543670LTx();
                            c543670LTx.LIZ.put("duration", Long.valueOf(j));
                            C1637890six.LJ("model_download_time", 0, c543670LTx.LJ());
                            C543670LTx c543670LTx2 = new C543670LTx();
                            c543670LTx2.LIZ.put("zipModel", 0);
                            C1637890six.LJ("service_model_download_error_rate", 0, c543670LTx2.LJ());
                            c20010613Rg.endDownloadEffectModelAlog(effect, modelInfo, j, 0, null, o.LIZIZ());
                        }

                        @Override // com.ss.android.ugc.effectmanager.ModelEventListener
                        public final void onFetchModelList(boolean z, String str, long j, String str2) {
                            c20010613Rg.reportModelListAlog(z, str, j, str2);
                        }
                    });
                    C365090ETb.LIZIZ();
                    C0CHQ.LIZ().isRegressionTest();
                    builder.setModelFileEnv(DownloadableModelConfig.ModelFileEnv.ONLINE);
                    builder.setModelType(FetchModelType.fromValue(0));
                    builder.ignoreBuiltInModel(false);
                    builder.ignoreModelLruVersion(true);
                    builder.abDiffEffect(C0C64.LJIILLIIL().LJIIIZ(31744, "enable_ep_diff_effect", true, false));
                    builder.modelNameCache(C0C64.LJIILLIIL().LJIIIZ(31744, "enable_ep_model_name_cache", true, false));
                    DownloadableModelConfig downloadableModelConfigBuild = builder.build();
                    EPLog.setLogger(new ILogger() { // from class: X.13Ri
                        @Override // com.ss.android.ugc.effectmanager.common.logger.ILogger
                        public final void d(String str) {
                            C13RX c13rx = C13RX.LIZIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("effect_platform::");
                            sbLIZ.append(str);
                            C201955140j.LIZJ(c13rx, C2188811AlT.LIZIZ(sbLIZ));
                        }

                        @Override // com.ss.android.ugc.effectmanager.common.logger.ILogger
                        public final void i(String str) {
                            C13RX c13rx = C13RX.LIZIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("effect_platform::");
                            sbLIZ.append(str);
                            C201955140j.LJIILJJIL(c13rx, C2188811AlT.LIZIZ(sbLIZ));
                        }

                        @Override // com.ss.android.ugc.effectmanager.common.logger.ILogger
                        public final void w(String str) {
                            C13RX c13rx = C13RX.LIZIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("effect_platform::");
                            sbLIZ.append(str);
                            C201955140j.LJIJI(c13rx, C2188811AlT.LIZIZ(sbLIZ));
                        }

                        @Override // com.ss.android.ugc.effectmanager.common.logger.ILogger
                        public final void e(String str, Throwable th) {
                            C13RX c13rx = C13RX.LIZIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("effect_platform::");
                            sbLIZ.append(str);
                            sbLIZ.append(", cause::");
                            sbLIZ.append(Log.getStackTraceString(th));
                            C201955140j.LJII(c13rx, C2188811AlT.LIZIZ(sbLIZ));
                        }
                    });
                    DownloadableModelSupport.initialize(downloadableModelConfigBuild);
                    DownloadableModelSupport.setLibraryLoader(new DownloadableModelSupportLibraryLoader() { // from class: X.0tNv
                        @Override // com.ss.android.ugc.effectmanager.DownloadableModelSupportLibraryLoader
                        public final void loadLibrary(String str) {
                            Application application = o.LIZ;
                            ((IFoundationAVService) ServiceManager.get().getService(IInternalAVService.class)).loadLibrary(str, o.LIZ);
                        }
                    });
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static boolean LJI() {
        return C861730XrH.LIZ.LIZ(new InterfaceC1394580mOW() { // from class: X.13Rl
            @Override // X.InterfaceC1394580mOW
            public final boolean apply(Object obj) {
                Application application = o.LIZ;
                if ((obj instanceof InterfaceC20011613Rq) && ((InterfaceC20011613Rq) obj).isRecording()) {
                    return true;
                }
                return false;
            }
        });
    }

    public static String LIZIZ() {
        if (C554190LoP.LIZ() && C2216161BoU.LJI) {
            CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi(CreativeToolsPluginService.class);
            if (creativeToolsPluginService != null && creativeToolsPluginService.LJI(null)) {
                try {
                    return TEEffectUtils.getEffectVersion();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return EffectSDKBuildConfig.getSdkVersion();
                }
            }
        }
        return EffectSDKBuildConfig.getSdkVersion();
    }

    public static void LJ() {
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).getEffectSDKGeneralParamService().generalParam().setNetWorkInfoCallback();
        EffectSensorCallback.setSensorInfoCallback(new EffectSensorCallback.GetSensorInfo() { // from class: X.13Rn
            @Override // com.bef.effectsdk.EffectSensorCallback.GetSensorInfo
            public final boolean onUnregister(int i) {
                return o.LJII("ASensorEventQueue_disableSensor");
            }

            @Override // com.bef.effectsdk.EffectSensorCallback.GetSensorInfo
            public final boolean onRegister(int i, int i2) {
                return o.LJII("ASensorEventQueue_enableSensor");
            }

            @Override // com.bef.effectsdk.EffectSensorCallback.GetSensorInfo
            public final boolean onSetRate(int i, int i2) {
                return o.LJII("ASensorEventQueue_setEventRate");
            }
        });
    }

    public static void LJIIIIZZ() {
        LIZLLL();
        C2216161BoU c2216161BoULIZ = C2216161BoU.LIZ(LIZ, LIZIZ, LJJIFFI);
        if (C2216161BoU.LJI) {
            c2216161BoULIZ.getClass();
        } else if (c2216161BoULIZ.LIZIZ != null) {
            c2216161BoULIZ.LIZIZ(c2216161BoULIZ.LIZIZ.get());
        }
    }

    public static void LJFF(C2216151BoT c2216151BoT) {
        C2504709rh.LIZ();
        LIZLLL();
        C2216161BoU.LIZ(LIZ, LIZIZ, LJJIFFI).LIZIZ(c2216151BoT);
        LJ();
    }

    public static boolean LJII(String str) {
        try {
            CertAuthEntry.checkCert(CertProviderManagerKt.findCert("bpea-effect_sdk_sensor", 1476415493), new String[]{"sensor"}, "effectSDK", str, "Collect");
            return true;
        } catch (C838130WuJ e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
