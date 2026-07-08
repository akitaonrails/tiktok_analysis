package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C1697810uHb;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastResourceOptSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes15.dex */
public final class LiveBroadcastResourceOptSetting_LiveBroadcastResourceOptConfig_OptTypeAdapter extends TypeAdapter<LiveBroadcastResourceOptSetting.LiveBroadcastResourceOptConfig> {
    public final Gson LIZ;

    public LiveBroadcastResourceOptSetting_LiveBroadcastResourceOptConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveBroadcastResourceOptSetting.LiveBroadcastResourceOptConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveBroadcastResourceOptSetting.LiveBroadcastResourceOptConfig liveBroadcastResourceOptConfig = new LiveBroadcastResourceOptSetting.LiveBroadcastResourceOptConfig(0, true, true, true, true, C1697810uHb.LJIIJJI("LiveBootFinishSettingTask", "LiveInjectContextTask", "LivePipoInitOptimizeTask"));
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1775453167:
                        if (strLJJJJ.equals("throttle_app_log")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveBroadcastResourceOptConfig.throttleAppLog = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1663723053:
                        if (strLJJJJ.equals("suspend_lego_tasks")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveBroadcastResourceOptConfig.suspendLegoTasks = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 43476591:
                        if (strLJJJJ.equals("pause_image_pipeline")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveBroadcastResourceOptConfig.pauseImagePipeline = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 106629499:
                        if (strLJJJJ.equals("phase")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveBroadcastResourceOptConfig.phase = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 601898503:
                        if (strLJJJJ.equals("pause_gecko_download")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveBroadcastResourceOptConfig.pauseGeckoDownload = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 996993712:
                        if (strLJJJJ.equals("lego_task_allow_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveBroadcastResourceOptConfig.legoTaskAllowList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
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
        return liveBroadcastResourceOptConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveBroadcastResourceOptSetting.LiveBroadcastResourceOptConfig liveBroadcastResourceOptConfig) throws IOException {
        LiveBroadcastResourceOptSetting.LiveBroadcastResourceOptConfig liveBroadcastResourceOptConfig2 = liveBroadcastResourceOptConfig;
        if (liveBroadcastResourceOptConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("phase");
        c09dl.LJJJJ(Integer.valueOf(liveBroadcastResourceOptConfig2.phase));
        c09dl.LJIILLIIL("pause_image_pipeline");
        c09dl.LJJJJJL(liveBroadcastResourceOptConfig2.pauseImagePipeline);
        c09dl.LJIILLIIL("suspend_lego_tasks");
        c09dl.LJJJJJL(liveBroadcastResourceOptConfig2.suspendLegoTasks);
        c09dl.LJIILLIIL("throttle_app_log");
        c09dl.LJJJJJL(liveBroadcastResourceOptConfig2.throttleAppLog);
        c09dl.LJIILLIIL("pause_gecko_download");
        c09dl.LJJJJJL(liveBroadcastResourceOptConfig2.pauseGeckoDownload);
        c09dl.LJIILLIIL("lego_task_allow_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveBroadcastResourceOptConfig2.legoTaskAllowList, String.class);
        c09dl.LJII();
    }
}
