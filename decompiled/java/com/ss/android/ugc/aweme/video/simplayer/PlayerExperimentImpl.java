package com.ss.android.ugc.aweme.video.simplayer;

import X.C07D9;
import X.C07DA;
import X.C0AOQ;
import X.C0C64;
import X.C266150Abt;
import X.C266250Ac3;
import X.C274520ApO;
import X.C274540ApQ;
import X.C274550ApR;
import X.C274560ApS;
import X.C274570ApT;
import X.C304180Bw8;
import X.C307500C3o;
import X.C308310C6r;
import X.C581900Ms0;
import X.InterfaceC274530ApP;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.util.IFeedCacheLoaderService;
import com.ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.ss.android.ugc.playerkit.model.PlayerPowerThermalConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class PlayerExperimentImpl extends C274570ApT {
    public static Boolean sDashABREnabled;

    @Override // X.C274570ApT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public /* bridge */ /* synthetic */ int cacheDuration(int i) {
        return -1;
    }

    @Override // X.C274570ApT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public /* bridge */ /* synthetic */ boolean enableBufferTimeControl() {
        return false;
    }

    @Override // X.C274570ApT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public /* bridge */ /* synthetic */ boolean enableLazyLoadVideoDecode() {
        return false;
    }

    @Override // X.C274570ApT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public /* bridge */ /* synthetic */ boolean enableNoSurfacePreRenderWithoutRender() {
        return false;
    }

    @Override // X.C274570ApT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public /* bridge */ /* synthetic */ boolean enableNoSurfacePreRenderWithoutRenderForStartup() {
        return false;
    }

    @Override // X.C274570ApT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public /* bridge */ /* synthetic */ boolean enableSoftwareDecodeBlockIssueOpt() {
        return false;
    }

    @Override // X.C274570ApT
    public int getSuperResolutionStrategyConstDash() {
        return 4;
    }

    @Override // X.C274570ApT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public /* bridge */ /* synthetic */ boolean isOpenPlayerReleaseOpt() {
        return false;
    }

    @Override // X.C274570ApT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public /* bridge */ /* synthetic */ int memCacheVideoDurationThreshold() {
        return 0;
    }

    @Override // X.C274570ApT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public /* bridge */ /* synthetic */ int resumeFileIoBlockDurationThreshold() {
        return 0;
    }

    public boolean enableLazyInitMdl() {
        return ((Boolean) C274520ApO.LIZ.getValue()).booleanValue();
    }

    @Override // X.C274570ApT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public List<C308310C6r> engineStaticOptionList() {
        C307500C3o.LIZ.getClass();
        return (List) C307500C3o.LIZJ.getValue();
    }

    @Override // X.C274570ApT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public int frameWait() {
        int i = C274550ApR.LIZ;
        return C274550ApR.LIZ;
    }

    @Override // X.C274570ApT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public int get265DecodeType() {
        int i = C274560ApS.LIZ;
        return C274560ApS.LIZ;
    }

    public PlayerPowerThermalConfig getPlayerPowerThermalConfig() {
        return new PlayerPowerThermalConfig();
    }

    @Override // X.C274570ApT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public float getVolLoudUnity() {
        int i = C07DA.LIZ;
        return C07D9.LIZ;
    }

    @Override // X.C274570ApT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public boolean isAsyncInit() {
        boolean z = C274540ApQ.LIZ;
        return C274540ApQ.LIZ;
    }

    @Override // X.C274570ApT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public boolean isDashABREnabled() {
        if (sDashABREnabled == null) {
            sDashABREnabled = Boolean.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "player_abr_enable", true) == 1);
        }
        return sDashABREnabled.booleanValue();
    }

    @Override // X.C274570ApT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public boolean playEventLogEnabled() {
        return ((Boolean) C266150Abt.LIZ.getValue()).booleanValue();
    }

    @Override // X.C274570ApT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public boolean videoBitRateEnabled() {
        return VideoBitRateABManager.LJFF.LJFF();
    }

    @Override // X.C274570ApT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public int ABR4GMaxResolutionIndex() {
        if (C304180Bw8.LJII()) {
            return 0;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "player_abr_4g_max_res_index", true);
    }

    @Override // X.C274570ApT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public int ABRFixedLevel() {
        if (C304180Bw8.LJII()) {
            return 0;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "player_abr_fixed_level", true);
    }

    @Override // X.C274570ApT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public boolean Bytevc1PlayAddrPolicyUnifyExperiment() {
        if (C304180Bw8.LJII()) {
            return true;
        }
        return InterfaceC274530ApP.LIZ;
    }

    @Override // X.C274570ApT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public int PlayeAbDashHijackRetryEnableExp() {
        if (C304180Bw8.LJII()) {
            return 0;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "player_dash_enable_hijack_retry", true);
    }

    @Override // X.C274570ApT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public int PlayeAbFixPrepareSeqTmpEnableExp() {
        if (C304180Bw8.LJII()) {
            return 0;
        }
        return ((Number) C0AOQ.LIZ.getValue()).intValue();
    }

    @Override // X.C274570ApT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public int PlayeAbVIDDashHijackRetryEnableExp() {
        if (C304180Bw8.LJII()) {
            return 1;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 1, "player_vid_dash_enable_hijack_retry", true);
    }

    @Override // X.C274570ApT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public float PlayerAbABRBandwidthParamExp() {
        if (C304180Bw8.LJII()) {
            return 1.0f;
        }
        return C0C64.LJIILLIIL().LJIILL(31744, "player_abr_bandwidth_param", true, 1.0f);
    }

    @Override // X.C274570ApT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public float PlayerAbABRStallPenaltyParamExp() {
        if (C304180Bw8.LJII()) {
            return 9.0f;
        }
        return C0C64.LJIILLIIL().LJIILL(31744, "player_abr_stall_penalty_param", true, 9.0f);
    }

    @Override // X.C274570ApT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public int PlayerAbABRStartUpModelExp() {
        if (C304180Bw8.LJII()) {
            return 0;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "player_abr_startup_model", true);
    }

    @Override // X.C274570ApT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public int PlayerAbABRSwitchCsModelExp() {
        if (C304180Bw8.LJII()) {
            return 0;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "player_abr_cs_model", true);
    }

    @Override // X.C274570ApT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public float PlayerAbABRSwitchPenaltyParamExp() {
        if (C304180Bw8.LJII()) {
            return 2.0f;
        }
        return C0C64.LJIILLIIL().LJIILL(31744, "player_abr_switch_penalty_param", true, 2.0f);
    }

    @Override // X.C274570ApT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public int PlayerAbABRSwitchSensitivityExp() {
        if (C304180Bw8.LJII()) {
            return 0;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "player_abr_switch_sensitivity", true);
    }

    @Override // X.C274570ApT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public int PlayerAbABRTimerIntervalMillExp() {
        if (C304180Bw8.LJII()) {
            return 500;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 500, "player_abr_time_interval_mill", true);
    }

    @Override // X.C274570ApT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public boolean PreloadProcessDataExperiment() {
        if (C304180Bw8.LJII()) {
            return false;
        }
        return C0C64.LJIILLIIL().LJIIIZ(31744, "is_preload_process_data", true, false);
    }

    @Override // X.C274570ApT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public boolean enableCdnUrlExpiredExperiment() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_video_cdn_url_expired_tt", true) == 1;
    }

    @Override // X.C274570ApT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public boolean isCbofCache() {
        List<Aweme> listLJIIIZ;
        List<CaptionItemModel> list;
        boolean z = ((IFeedCacheLoaderService) ServiceManager.get().getService(IFeedCacheLoaderService.class)).LJII() && !C581900Ms0.LJI;
        if (((Boolean) C266250Ac3.LIZ.getValue()).booleanValue() && (listLJIIIZ = ((IFeedCacheLoaderService) ServiceManager.get().getService(IFeedCacheLoaderService.class)).LJIIIZ()) != null) {
            if (listLJIIIZ.size() < 2) {
                return false;
            }
            for (Aweme aweme : new ArrayList(listLJIIIZ)) {
                if (aweme != null && aweme.getVideo() != null && aweme.getVideo().getCaptionModel() != null && (list = aweme.getVideo().getCaptionModel().captionList) != null && !list.isEmpty()) {
                    return false;
                }
            }
        }
        return z;
    }

    @Override // X.C274570ApT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public int enableIntertrust() {
        return 0;
    }

    @Override // X.C274570ApT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public int enableIntertrustDemotion() {
        return 0;
    }
}
