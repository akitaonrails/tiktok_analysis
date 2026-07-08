package com.ss.android.ugc.aweme.video.simkit;

import X.C00UI;
import X.C0C64;
import X.C0CJJ;
import X.C0CJL;
import X.C0CJP;
import X.C0VSP;
import X.C1474810oTv;
import X.C1481000odu;
import X.C2179771ASp;
import X.C2188811AlT;
import X.C2511009si;
import X.C266230Ac1;
import X.C285070BFh;
import X.C302510BtR;
import X.C304180Bw8;
import X.C308360C6w;
import X.C586580MzY;
import X.C844470XAv;
import X.EnumC1479590obd;
import X.EnumC1479760obu;
import X.InterfaceC1479910oc9;
import X.InterfaceC2523309uh;
import X.InterfaceC2523509uj;
import X.InterfaceC2524009uo;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;
import com.ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.ss.android.ugc.playerkit.model.PlayerGlobalConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.util.EncodingUtils;

/* JADX INFO: loaded from: classes5.dex */
public class PlayerGlobalConfigImpl implements PlayerGlobalConfig {
    public static volatile boolean autoAudioFocus = false;
    public static int isEnableSurfaceLifeCycleExpCachedVal = -1;
    public static boolean sForceHttps;
    public static EnumC1479760obu sPlayerType;
    public final Map<String, Integer> scenesValueMap = new ConcurrentHashMap();

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public /* bridge */ /* synthetic */ float getAdjustedVolume() {
        return -1.0f;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public /* bridge */ /* synthetic */ int getBitrateSelectMode() {
        return 0;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public /* bridge */ /* synthetic */ int getPlayerBackgroundSleepStrategy() {
        return 0;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public /* bridge */ /* synthetic */ String getPredictLabelResult() {
        return null;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public int getPreloadType() {
        return 2;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public /* bridge */ /* synthetic */ C00UI getVideoEffectInfo(String str) {
        return null;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public /* bridge */ /* synthetic */ boolean isDebug() {
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public /* bridge */ /* synthetic */ boolean isEnableByteVC1AutoRetry() {
        return true;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public /* bridge */ /* synthetic */ boolean isPowerModeHandlerEnable() {
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public /* bridge */ /* synthetic */ boolean isPrepareAhead() {
        return false;
    }

    public /* bridge */ /* synthetic */ boolean isStrategyCenterInitialized() {
        return false;
    }

    public boolean isSurfaceControlClearSurface() {
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public /* bridge */ /* synthetic */ boolean isUseOptimizedSurfaceView() {
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public /* bridge */ /* synthetic */ boolean optGlobalAppAnr() {
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public /* bridge */ /* synthetic */ boolean optSpecialAppAnr() {
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public Context context() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LIZ();
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean forceHttps() {
        return sForceHttps;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public String getGraphJson() {
        int i = C2511009si.LIZ;
        if (!(C2511009si.LIZ == 1)) {
            return "";
        }
        final C0CJJ c0cjjLIZ = C0CJJ.LIZ();
        synchronized (c0cjjLIZ) {
            if (!c0cjjLIZ.LJFF) {
                String str = c0cjjLIZ.LIZLLL;
                if (str == null) {
                    str = "";
                }
                return str;
            }
            if (c0cjjLIZ.LJ) {
                c0cjjLIZ.LJ = false;
                IAVEffectService iAVEffectServiceEffectService = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).abilityService().effectService();
                if (iAVEffectServiceEffectService != null) {
                    iAVEffectServiceEffectService.fetchEffectResourcePathById("36619792", new IAVEffectService.OnFetchResult() { // from class: X.0CJK
                        @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService.OnFetchResult
                        public final void onResult(String str2) {
                            c0cjjLIZ.LIZJ = str2;
                            if (str2 != null) {
                                if (str2.isEmpty()) {
                                    C2344009Gk c2344009Gk = new C2344009Gk();
                                    c2344009Gk.LIZJ(-1, "success");
                                    C20684815ws.LJIILLIIL("fetch_feed_page_ae_loki", c2344009Gk.LIZ);
                                    return;
                                } else {
                                    C2344009Gk c2344009Gk2 = new C2344009Gk();
                                    c2344009Gk2.LIZJ(0, "success");
                                    C20684815ws.LJIILLIIL("fetch_feed_page_ae_loki", c2344009Gk2.LIZ);
                                    return;
                                }
                            }
                            C2344009Gk c2344009Gk3 = new C2344009Gk();
                            c2344009Gk3.LIZJ(-2, "success");
                            C20684815ws.LJIILLIIL("fetch_feed_page_ae_loki", c2344009Gk3.LIZ);
                        }
                    });
                }
            }
            if (TextUtils.isEmpty(c0cjjLIZ.LIZJ)) {
                return "";
            }
            if (c0cjjLIZ.LJFF) {
                c0cjjLIZ.LJFF = false;
                try {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(c0cjjLIZ.LIZJ);
                    sbLIZ.append("/graph.json");
                    C0VSP c0vsp = new C0VSP(C2188811AlT.LIZIZ(sbLIZ));
                    byte[] bArr = new byte[c0vsp.available()];
                    c0vsp.read(bArr);
                    String string = EncodingUtils.getString(bArr, "UTF-8");
                    c0cjjLIZ.LIZLLL = string;
                    return string;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            String str2 = c0cjjLIZ.LIZLLL;
            if (str2 == null) {
                str2 = "";
            }
            return str2;
        }
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public C0CJP getLiveGlobalConfig() {
        return new C0CJP() { // from class: X.0CJO
            @Override // X.C0CJP
            public final InterfaceC1500900pA0 LIZJ() {
                return ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().getLiveGlobalConfig().LIZJ();
            }

            @Override // X.C0CJP
            public final Object LIZ(Object obj, String str) {
                return ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().getLiveGlobalConfig().LIZ(obj, str);
            }

            @Override // X.C0CJP
            public final HashMap<String, Object> LIZIZ(C0CJQ c0cjq, String str) {
                return ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().getLiveGlobalConfig().LIZIZ(c0cjq, str);
            }
        };
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public EnumC1479760obu getPlayerType() {
        if (sPlayerType == null) {
            sPlayerType = C1481000odu.LIZIZ();
        }
        return sPlayerType;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isDynamicBitrateEnable() {
        return VideoBitRateABManager.LJFF.LJFF();
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isDynamicConfigAvailable() {
        boolean z;
        VideoBitRateABManager videoBitRateABManager = VideoBitRateABManager.LJFF;
        synchronized (videoBitRateABManager) {
            if (C302510BtR.LIZ()) {
                if (videoBitRateABManager.LJ == null || !videoBitRateABManager.LJ.isValid()) {
                    RateSettingsResponse rateSettingsResponse = videoBitRateABManager.LIZ;
                    if (rateSettingsResponse != null) {
                        if (rateSettingsResponse.isValid()) {
                        }
                    }
                    z = false;
                }
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isPrerenderSurfaceSlowSetFix() {
        return ((Boolean) C266230Ac1.LIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isUseSurfaceControl() {
        return C285070BFh.LIZ && isUseSurfaceView();
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isUseSurfaceView() {
        return Build.VERSION.SDK_INT >= 24 && C0C64.LJIILLIIL().LJIJ(31744, 0, "player_enable_surface_surfaceview", true) == 1;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public String getAudioRoute() {
        String str;
        synchronized (C0CJJ.LIZ()) {
            int iLJ = C2179771ASp.LJ();
            str = iLJ != -1 ? iLJ != 0 ? iLJ != 2 ? iLJ != 3 ? iLJ != 4 ? iLJ != 5 ? "empty" : "usb" : "wired" : "others" : "bluetooth" : "speaker" : "none";
        }
        return str;
    }

    public double getBitrateModelThreshold() {
        if (C304180Bw8.LIZLLL()) {
            return -1.0d;
        }
        return C0C64.LJIILLIIL().LJIIL(-1.0d, 31744, "video_auto_model_threshold", true);
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public int getEnableSAMISDKAB() {
        int i;
        synchronized (C0CJJ.LIZ()) {
            i = !C308360C6w.LIZ ? 0 : 1;
        }
        return i;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public int getPlaybackAbility() {
        int i;
        C0CJJ c0cjjLIZ = C0CJJ.LIZ();
        synchronized (c0cjjLIZ) {
            int iLJ = C2179771ASp.LJ();
            if (iLJ == c0cjjLIZ.LIZ && (i = c0cjjLIZ.LIZIZ) != -1) {
                return i;
            }
            try {
                c0cjjLIZ.LIZ = iLJ;
                int iLIZ = C0CJL.LIZ.LIZ(iLJ);
                c0cjjLIZ.LIZIZ = iLIZ;
                return iLIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return -1;
            }
        }
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public int getPlayerFramesWait() {
        return C0C64.LJIILLIIL().LJIJ(31744, 1, "player_framews_wait", true);
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public int getRenderType() {
        if (C304180Bw8.LIZLLL()) {
            return 0;
        }
        return InterfaceC2523309uh.LIZ;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isAsyncInit() {
        if (C304180Bw8.LIZLLL()) {
            return true;
        }
        return C0C64.LJIILLIIL().LJIIIZ(31744, "is_ttplayer_async_init", true, true);
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isCallbackCompletionFix() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "player_callback_completion_fix_experiment", true, false);
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isEnableBytevc1BlackList() {
        if (C304180Bw8.LIZLLL()) {
            return false;
        }
        return C0C64.LJIILLIIL().LJIIIZ(31744, "enable_bytevc1_black_list", true, false);
    }

    public boolean isEnableLocalVideoPlay() {
        if (C304180Bw8.LIZLLL()) {
            return true;
        }
        return C0C64.LJIILLIIL().LJIIIZ(31744, "is_local_video_play_enable", true, true);
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isEnablePlayerLogV2() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "player_event_log_v2_open", true, true);
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isEnableSurfaceLifeCycleNotification() {
        if (C304180Bw8.LIZLLL()) {
            return false;
        }
        if (-1 == isEnableSurfaceLifeCycleExpCachedVal) {
            isEnableSurfaceLifeCycleExpCachedVal = C0C64.LJIILLIIL().LJIJ(31744, 0, "surface_lifecycle_notification_enabled", true);
        }
        return 1 == isEnableSurfaceLifeCycleExpCachedVal;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isMultiPlayer() {
        if (C304180Bw8.LIZLLL()) {
            return false;
        }
        return C0C64.LJIILLIIL().LJIIIZ(31744, "enable_multi_player", true, false);
    }

    public boolean isPlayLinkSelectEnabled() {
        if (C304180Bw8.LIZLLL()) {
            return true;
        }
        return C586580MzY.LJ();
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isSurfaceViewLogOpt() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "surfaceview_log_opt_exp", true, false);
    }

    public boolean isUseTTNet() {
        return C0C64.LJIILLIIL().LJIJ(31744, 1, "use_ttnet", true) == 1;
    }

    public boolean isUseVideoCacheHttpDns() {
        if (C304180Bw8.LIZLLL()) {
            return true;
        }
        return C0C64.LJIILLIIL().LJIIIZ(31744, "use_video_cache_http_dns", true, false);
    }

    public boolean shouldForceToKeepSurfaceBelowKITKAT() {
        if (C304180Bw8.LIZLLL()) {
            return false;
        }
        return C0C64.LJIILLIIL().LJIIIZ(31744, "should_force_to_keep_surface_below_kitkat", true, false);
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean getAutoAudioFocus() {
        return autoAudioFocus;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isEnableBytevc1() {
        return InterfaceC2524009uo.LIZ;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isUseVideoTextureRenderer() {
        return InterfaceC2523509uj.LIZ;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public InterfaceC1479910oc9 prepareConfig() {
        return EnumC1479590obd.Normal;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public void setForceHttps(boolean z) {
        sForceHttps = z;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public void setAutoAudioFocus(boolean z, String str) {
        if (!C1474810oTv.LJJIJIIJIL()) {
            return;
        }
        if (z) {
            if (this.scenesValueMap.get(str) != null && Objects.equals(this.scenesValueMap.get(str), -1)) {
                this.scenesValueMap.put(str, 0);
            } else {
                this.scenesValueMap.put(str, 1);
            }
        } else if (this.scenesValueMap.get(str) != null && Objects.equals(this.scenesValueMap.get(str), 1)) {
            this.scenesValueMap.put(str, 0);
        } else {
            this.scenesValueMap.put(str, -1);
        }
        if (this.scenesValueMap.containsValue(-1)) {
            autoAudioFocus = false;
        } else {
            autoAudioFocus = this.scenesValueMap.containsValue(1);
        }
    }
}
