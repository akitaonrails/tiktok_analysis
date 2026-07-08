package com.ss.android.ugc.aweme.video.simpreloader;

import X.C09S2;
import X.C0C64;
import X.C1476830oXB;
import X.C1477160oXi;
import X.C1478350oZd;
import X.C1478370oZf;
import X.C1481060oe0;
import X.C1485800ole;
import X.C1602860roS;
import X.C1787106zF;
import X.C2524209uq;
import X.C582130MsN;
import X.C786410Ut5;
import X.EnumC2281141EQm;
import X.InterfaceC1469840oLu;
import X.InterfaceC1471450oOV;
import X.InterfaceC1472690oQV;
import X.InterfaceC1474850oTz;
import X.InterfaceC1474890oU3;
import X.InterfaceC1474910oU5;
import X.InterfaceC1474920oU6;
import X.InterfaceC1475250oUd;
import X.InterfaceC1475350oUn;
import X.InterfaceC1475520oV4;
import X.InterfaceC1476900oXI;
import X.InterfaceC1479230ob3;
import X.InterfaceC1479240ob4;
import X.InterfaceC1479250ob5;
import X.InterfaceC1479260ob6;
import X.InterfaceC1479270ob7;
import X.InterfaceC1482820ogq;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.app.IAwemeApplicationService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.player.sdk.api.IPortraitService;
import com.ss.android.ugc.aweme.setting.model.MLModel;
import com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator;
import com.ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig;
import com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class VideoPreloadManagerConfigImpl implements IVideoPreloadConfig {
    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public /* bridge */ /* synthetic */ InterfaceC1475250oUd createVideoUrlProcessor() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public /* bridge */ /* synthetic */ boolean enableLoadMorePreload() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public boolean forbidBypassCookie() {
        return true;
    }

    public /* bridge */ /* synthetic */ int getBitrateQuality() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public /* bridge */ /* synthetic */ InterfaceC1474920oU6 getKVStorageProvider() {
        return null;
    }

    public /* bridge */ /* synthetic */ InterfaceC1479260ob6 getPlayerPgoPlugin() {
        return null;
    }

    public /* bridge */ /* synthetic */ IPortraitService getPortraitService() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public /* bridge */ /* synthetic */ C1477160oXi getSelectedBitrateForColdBoot(SimVideoUrlModel simVideoUrlModel) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public /* bridge */ /* synthetic */ InterfaceC1472690oQV getSensitiveSceneTransmitter() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public /* bridge */ /* synthetic */ boolean isOpenDataFreeMode() {
        return false;
    }

    public /* bridge */ /* synthetic */ boolean isUseLastNetworkSpeed() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public /* bridge */ /* synthetic */ String preloadConfigJsonInScene() {
        return null;
    }

    public /* bridge */ /* synthetic */ boolean strategyCenterEnabled() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public InterfaceC1475350oUn getAppLog() {
        return new InterfaceC1475350oUn() { // from class: X.0ob8
            @Override // X.InterfaceC1475350oUn
            public final /* synthetic */ void LIZ() {
            }

            @Override // X.InterfaceC1475350oUn
            public final String getServerDeviceId() {
                return AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
            }

            @Override // X.InterfaceC1475350oUn
            public final String LIZIZ() {
                return AppLog.getCurrentSessionId();
            }

            @Override // X.InterfaceC1475350oUn
            public final void recordMiscLog(Context context, String str, JSONObject jSONObject) {
                AppLog.recordMiscLog(context, str, jSONObject);
            }
        };
    }

    public InterfaceC1479230ob3 getCacheHelper() {
        return new InterfaceC1479230ob3() { // from class: X.0oay
        };
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public IPreloaderExperiment getExperiment() {
        return new PreloaderExperiment();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public InterfaceC1474890oU3 getMLServiceSpeedModel() {
        return new InterfaceC1474890oU3() { // from class: X.0oaV
            @Override // X.InterfaceC1474890oU3
            public final Integer LIZ() {
                MLModel mLModel = C1478980oae.LIZIZ.LIZ;
                if (mLModel == null) {
                    return null;
                }
                int[] iArr = mLModel.params;
                return Integer.valueOf((iArr == null || iArr.length <= 0) ? 500 : iArr[0]);
            }
        };
    }

    public InterfaceC1479240ob4 getMusicService() {
        return new InterfaceC1479240ob4() { // from class: X.0oax
        };
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public InterfaceC1469840oLu getNetClient() {
        return new C1485800ole(C09S2.LIZ(C786410Ut5.j4("https://%s/", new Object[]{"tiktokv.com"})));
    }

    public InterfaceC1479250ob5 getPlayerCommonParamManager() {
        return new InterfaceC1479250ob5() { // from class: X.0oaz
        };
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public InterfaceC1475520oV4 getPlayerEventReportService() {
        return new InterfaceC1475520oV4() { // from class: X.0ob0
            @Override // X.InterfaceC1475520oV4
            public final void LIZ() {
            }

            @Override // X.InterfaceC1475520oV4
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1475520oV4
            public final /* synthetic */ void LIZJ() {
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public InterfaceC1482820ogq getPreloadStrategy() {
        return new C1478350oZd(this);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public InterfaceC1471450oOV getQOSSpeedUpService() {
        return new C1478370oZf(this);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public InterfaceC1474850oTz getSpeedManager() {
        return new InterfaceC1474850oTz() { // from class: X.0oau
            @Override // X.InterfaceC1474850oTz
            public final void LIZ() {
                C1479130oat.LJIIIIZZ().LIZ();
            }

            @Override // X.InterfaceC1474850oTz
            public final void LIZIZ() {
                C1479130oat.LJIIIIZZ().LIZIZ();
            }

            @Override // X.InterfaceC1474850oTz
            public final void LIZLLL() {
                C1479130oat.LJIIIIZZ().LIZIZ = new InterfaceC1479150oav() { // from class: X.0oaC
                    public final Map<InterfaceC1478780oaK, InterfaceC1478790oaL> LIZ = new HashMap();
                    public final ISpeedCalculator LIZIZ;
                    public final boolean LIZJ;

                    @Override // X.InterfaceC1479150oav
                    public final double LIZ() {
                        return this.LIZIZ.LIZ();
                    }

                    @Override // X.InterfaceC1479150oav
                    public final void LIZIZ() {
                        this.LIZIZ.LIZIZ();
                    }

                    @Override // X.InterfaceC1479150oav
                    public final C1478850oaR[] LJFF() {
                        C1478710oaD[] c1478710oaDArrLJFF = this.LIZIZ.LJFF();
                        if (c1478710oaDArrLJFF == null) {
                            return null;
                        }
                        C1478850oaR[] c1478850oaRArr = new C1478850oaR[c1478710oaDArrLJFF.length];
                        for (int i = 0; i < c1478710oaDArrLJFF.length; i++) {
                            C1478710oaD c1478710oaD = c1478710oaDArrLJFF[i];
                            c1478850oaRArr[i] = c1478710oaD == null ? null : new C1478850oaR(c1478710oaD.LLILLL, c1478710oaD.LL / 8.0d, (long) c1478710oaD.LLILLJJLI, c1478710oaD.LLILZ);
                        }
                        return c1478850oaRArr;
                    }

                    @Override // X.InterfaceC1479160oaw
                    public final double getSpeed() {
                        return this.LIZJ ? TTVideoEngine.LJJLIIIIJ() : this.LIZIZ.LJIIIIZZ();
                    }

                    {
                        C582130MsN.LIZ().LJ();
                        this.LIZIZ = C1476910oXJ.LIZJ();
                        this.LIZJ = ((Boolean) C1474810oTv.LJJJLIIL.getValue()).booleanValue();
                    }

                    @Override // X.InterfaceC1479150oav
                    public final void LIZJ(int i) {
                        if (this.LIZJ) {
                            TTVideoEngine.LJIIJ(1002, i);
                        } else {
                            this.LIZIZ.LIZJ(i);
                        }
                    }

                    @Override // X.InterfaceC1479150oav
                    public final void LIZLLL(double d) {
                        this.LIZIZ.LIZLLL(d);
                    }

                    @Override // X.InterfaceC1479150oav
                    public final void LJI(InterfaceC1478780oaK interfaceC1478780oaK) {
                        C1478750oaH c1478750oaH = new C1478750oaH((C0N95) interfaceC1478780oaK);
                        this.LIZIZ.LJIIJJI(c1478750oaH);
                        ((HashMap) this.LIZ).put(interfaceC1478780oaK, c1478750oaH);
                    }

                    @Override // X.InterfaceC1479150oav
                    public final void LJ(double d, double d2, long j) {
                        this.LIZIZ.LJIIJ(new C1478710oaD(d2 * 8.0d, j));
                    }
                };
            }

            @Override // X.InterfaceC1474850oTz
            public final int getAverageSpeedInKBps() {
                return C1479130oat.LJII();
            }

            @Override // X.InterfaceC1474850oTz
            public final int LJFF() {
                return C1479130oat.LIZJ;
            }

            @Override // X.InterfaceC1474850oTz
            public final void LIZJ(int i) {
                C1479130oat.LJIIIIZZ().LIZJ(i);
            }

            @Override // X.InterfaceC1474850oTz
            public final void LJI(int i) {
                C1479130oat.LIZJ = i;
            }

            @Override // X.InterfaceC1474850oTz
            public final void LJ(double d, double d2, long j) {
                C1479130oat.LJIIIIZZ().LJ(d, d2, j);
            }
        };
    }

    public InterfaceC1479270ob7 getStorageManager() {
        return new InterfaceC1479270ob7() { // from class: X.0ob1
        };
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public InterfaceC1474910oU5 getVideoCachePlugin() {
        return new InterfaceC1474910oU5() { // from class: X.0ob2
            @Override // X.InterfaceC1474910oU5
            public final void LIZ() {
            }

            @Override // X.InterfaceC1474910oU5
            public final void LIZIZ() {
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public boolean isDashABREnabled() {
        if (C1481060oe0.LIZIZ == null) {
            C1481060oe0.LIZIZ = Boolean.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "player_abr_enable", true) == 1);
        }
        return C1481060oe0.LIZIZ.booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public boolean useSyncPreloadStyle() {
        C1602860roS.LIZ.getClass();
        return C1602860roS.LJ() ? ((Boolean) C1787106zF.LIZ.getValue()).booleanValue() : C2524209uq.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public boolean canPreload() {
        return !((IAwemeApplicationService) ServiceManager.get().getService(IAwemeApplicationService.class)).isAppBackground() || C0C64.LJIILLIIL().LJIJ(31744, 1, "enable_preload_background", true) == 1;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public int getNetworkRttMs() {
        try {
            return TTNetInit.getNetworkQuality().LIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return -1;
        }
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public int getNetworkType() {
        return TTNetInit.getEffectiveConnectionType();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public boolean isPlayerPreferchCaption() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "player_prefetch_cla_caption", true) == 1;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public boolean isPlayerPreferchTtsAudio() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "player_preferch_tts_audio", true) == 1;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public boolean isPreloadV3Enabled() {
        return C1481060oe0.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public float playerPreferchCaptionSize() {
        return C0C64.LJIILLIIL().LJIILL(31744, "player_prefetch_cla_caption_size", true, 0.0f);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public float playerPreferchTtsAudioSize() {
        return C0C64.LJIILLIIL().LJIILL(31744, "player_preferch_tts_audio_size", true, 0.0f);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public Map getRequestHeader(String str) {
        return new HashMap();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public EnumC2281141EQm getProperResolution(String str, InterfaceC1476900oXI interfaceC1476900oXI) {
        if (VideoBitRateABManager.LJFF.LJFF()) {
            return C582130MsN.LIZ().LJ().LIZIZ().getProperResolution(str, interfaceC1476900oXI);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public C1476830oXB getProperBitrateForDash(SimVideoUrlModel simVideoUrlModel, InterfaceC1476900oXI interfaceC1476900oXI, boolean z, int i) {
        if (VideoBitRateABManager.LJFF.LJFF()) {
            return C582130MsN.LIZ().LJ().LIZIZ().getProperBitrateForDash(simVideoUrlModel, interfaceC1476900oXI, z, i);
        }
        return null;
    }
}
