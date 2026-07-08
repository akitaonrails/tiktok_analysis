package com.bytedance.android.livesdk.livesetting.message;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C1697810uHb;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.message.LiveSignalingSystemSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveSignalingSystemSetting_SignalingConfig_OptTypeAdapter extends TypeAdapter<LiveSignalingSystemSetting.SignalingConfig> {
    public final Gson LIZ;

    public LiveSignalingSystemSetting_SignalingConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveSignalingSystemSetting.SignalingConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveSignalingSystemSetting.SignalingConfig signalingConfig = new LiveSignalingSystemSetting.SignalingConfig(false, false, true, Mp4ScreenVideoLoadTimeout.CONTROL, 120L, true, false, true, 8L, LSPassThroughRecordSizeConfig.DEFAULT, -1, -1, C1697810uHb.LJIILJJIL("inbox_dm_head"));
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1674331780:
                        if (strLJJJJ.equals("need_response_scenes")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                signalingConfig.needResponseScenes = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -875644256:
                        if (strLJJJJ.equals("live_enable_singling_system")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                signalingConfig.enableSignaling = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -77765850:
                        if (strLJJJJ.equals("override_biz_sampling")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                signalingConfig.overrideBizSampling = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -75677327:
                        if (strLJJJJ.equals("live_poll_post_timer_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                signalingConfig.timerInterval = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 76727021:
                        if (strLJJJJ.equals("override_recv_sampling")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                signalingConfig.overrideRecvSampling = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 412075357:
                        if (strLJJJJ.equals("live_enable_poll_post_timer")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                signalingConfig.enableTimer = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 703141908:
                        if (strLJJJJ.equals("live_enable_uplink_poll_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                signalingConfig.enableUplinkPollOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 915916037:
                        if (strLJJJJ.equals("try_poller_at_start")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                signalingConfig.tryPollerAtStart = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 921694022:
                        if (strLJJJJ.equals("android_signaling_connect_ws")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                signalingConfig.connectWs = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1134960562:
                        if (strLJJJJ.equals("feed_head_scene_prefetch_stream_data")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                signalingConfig.preloadEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1373130903:
                        if (strLJJJJ.equals("head_scene_prefetch_stream_data_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                signalingConfig.preloadDelay = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1419197699:
                        if (strLJJJJ.equals("send_monitor_sampling")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                signalingConfig.sendMonitorSampling = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1771443533:
                        if (strLJJJJ.equals("poller_at_start_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                signalingConfig.pollerAtStartDelay = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return signalingConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveSignalingSystemSetting.SignalingConfig signalingConfig) throws IOException {
        LiveSignalingSystemSetting.SignalingConfig signalingConfig2 = signalingConfig;
        if (signalingConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("live_enable_singling_system");
        c09dl.LJJJJJL(signalingConfig2.enableSignaling);
        c09dl.LJIILLIIL("live_enable_poll_post_timer");
        c09dl.LJJJJJL(signalingConfig2.enableTimer);
        c09dl.LJIILLIIL("try_poller_at_start");
        c09dl.LJJJJJL(signalingConfig2.tryPollerAtStart);
        c09dl.LJIILLIIL("poller_at_start_delay");
        c09dl.LJJIZ(signalingConfig2.pollerAtStartDelay);
        c09dl.LJIILLIIL("live_poll_post_timer_interval");
        c09dl.LJJIZ(signalingConfig2.timerInterval);
        c09dl.LJIILLIIL("live_enable_uplink_poll_opt");
        c09dl.LJJJJJL(signalingConfig2.enableUplinkPollOpt);
        c09dl.LJIILLIIL("android_signaling_connect_ws");
        c09dl.LJJJJJL(signalingConfig2.connectWs);
        c09dl.LJIILLIIL("feed_head_scene_prefetch_stream_data");
        c09dl.LJJJJJL(signalingConfig2.preloadEnable);
        c09dl.LJIILLIIL("head_scene_prefetch_stream_data_delay");
        c09dl.LJJIZ(signalingConfig2.preloadDelay);
        c09dl.LJIILLIIL("send_monitor_sampling");
        c09dl.LJJJJ(Integer.valueOf(signalingConfig2.sendMonitorSampling));
        c09dl.LJIILLIIL("override_recv_sampling");
        c09dl.LJJJJ(Integer.valueOf(signalingConfig2.overrideRecvSampling));
        c09dl.LJIILLIIL("override_biz_sampling");
        c09dl.LJJJJ(Integer.valueOf(signalingConfig2.overrideBizSampling));
        c09dl.LJIILLIIL("need_response_scenes");
        C473040Igo.LIZLLL(this.LIZ, c09dl, signalingConfig2.needResponseScenes, String.class);
        c09dl.LJII();
    }
}
