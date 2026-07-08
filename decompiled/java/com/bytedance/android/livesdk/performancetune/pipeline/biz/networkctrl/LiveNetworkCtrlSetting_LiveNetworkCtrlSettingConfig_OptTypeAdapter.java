package com.bytedance.android.livesdk.performancetune.pipeline.biz.networkctrl;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.performancetune.pipeline.biz.networkctrl.LiveNetworkCtrlSetting;
import com.bytedance.android.livesdkapi.host.LiveDispatchConfig;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveNetworkCtrlSetting_LiveNetworkCtrlSettingConfig_OptTypeAdapter extends TypeAdapter<LiveNetworkCtrlSetting.LiveNetworkCtrlSettingConfig> {
    public final Gson LIZ;

    public LiveNetworkCtrlSetting_LiveNetworkCtrlSettingConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveNetworkCtrlSetting.LiveNetworkCtrlSettingConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveNetworkCtrlSetting.LiveNetworkCtrlSettingConfig liveNetworkCtrlSettingConfig = new LiveNetworkCtrlSetting.LiveNetworkCtrlSettingConfig(false, 3, 4, 4, new LiveDispatchConfig(null, 0, null, null, null, 0, 0, null, null, null, null, null, null, 8191, null));
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveNetworkCtrlSettingConfig.setEnable(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -620616955:
                        if (strLJJJJ.equals("network_ctrl_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveNetworkCtrlSettingConfig.setNetworkCtrlConfig((LiveDispatchConfig) this.LIZ.LJIIJ(LiveDispatchConfig.class).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 93433057:
                        if (strLJJJJ.equals("threshold_ttnet_network_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveNetworkCtrlSettingConfig.setThresholdTtnetNetworkType(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1234737537:
                        if (strLJJJJ.equals("threshold_live_network_state")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveNetworkCtrlSettingConfig.setThresholdLiveNetworkState(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1966136826:
                        if (strLJJJJ.equals("threshold_live_network_state_v2")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveNetworkCtrlSettingConfig.setThresholdLiveNetworkStateV2(c09cu.LJJIZ());
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
        return liveNetworkCtrlSettingConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveNetworkCtrlSetting.LiveNetworkCtrlSettingConfig liveNetworkCtrlSettingConfig) throws IOException {
        LiveNetworkCtrlSetting.LiveNetworkCtrlSettingConfig liveNetworkCtrlSettingConfig2 = liveNetworkCtrlSettingConfig;
        if (liveNetworkCtrlSettingConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(liveNetworkCtrlSettingConfig2.getEnable());
        c09dl.LJIILLIIL("threshold_ttnet_network_type");
        c09dl.LJJJJ(Integer.valueOf(liveNetworkCtrlSettingConfig2.getThresholdTtnetNetworkType()));
        c09dl.LJIILLIIL("threshold_live_network_state");
        c09dl.LJJJJ(Integer.valueOf(liveNetworkCtrlSettingConfig2.getThresholdLiveNetworkState()));
        c09dl.LJIILLIIL("threshold_live_network_state_v2");
        c09dl.LJJJJ(Integer.valueOf(liveNetworkCtrlSettingConfig2.getThresholdLiveNetworkStateV2()));
        c09dl.LJIILLIIL("network_ctrl_config");
        this.LIZ.LJIIJ(LiveDispatchConfig.class).write(c09dl, liveNetworkCtrlSettingConfig2.getNetworkCtrlConfig());
        c09dl.LJII();
    }
}
