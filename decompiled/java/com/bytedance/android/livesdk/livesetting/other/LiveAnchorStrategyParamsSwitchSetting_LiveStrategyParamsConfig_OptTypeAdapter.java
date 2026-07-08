package com.bytedance.android.livesdk.livesetting.other;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.other.LiveAnchorStrategyParamsSwitchSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveAnchorStrategyParamsSwitchSetting_LiveStrategyParamsConfig_OptTypeAdapter extends TypeAdapter<LiveAnchorStrategyParamsSwitchSetting.LiveStrategyParamsConfig> {
    public final Gson LIZ;

    public LiveAnchorStrategyParamsSwitchSetting_LiveStrategyParamsConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveAnchorStrategyParamsSwitchSetting.LiveStrategyParamsConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveAnchorStrategyParamsSwitchSetting.LiveStrategyParamsConfig liveStrategyParamsConfig = new LiveAnchorStrategyParamsSwitchSetting.LiveStrategyParamsConfig(30000L, 15000L, new ArrayList(), false, false, 10000L, new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList());
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1711386507:
                        if (strLJJJJ.equals("performance_params")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveStrategyParamsConfig.performanceParams = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1549814658:
                        if (strLJJJJ.equals("realtime_feature_period")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveStrategyParamsConfig.realtimeFeaturePeriod = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1497146781:
                        if (strLJJJJ.equals("upload_filter_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveStrategyParamsConfig.uploadFilterType = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveStrategyParamsConfig.f35switch = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1236527405:
                        if (strLJJJJ.equals("room_feature_params")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveStrategyParamsConfig.roomFeatureParams = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1136394288:
                        if (strLJJJJ.equals("user_profile_params")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveStrategyParamsConfig.userProfileParams = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1051599987:
                        if (strLJJJJ.equals("active_keys")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveStrategyParamsConfig.directUploadType = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -991726143:
                        if (strLJJJJ.equals("period")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveStrategyParamsConfig.period = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 95467907:
                        if (strLJJJJ.equals("delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveStrategyParamsConfig.startUploadDelay = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1009511995:
                        if (strLJJJJ.equals("user_action_params")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveStrategyParamsConfig.userActionParams = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1586972105:
                        if (strLJJJJ.equals("base_info_params")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveStrategyParamsConfig.baseInfoParams = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1597487523:
                        if (strLJJJJ.equals("repeat_skip")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveStrategyParamsConfig.repeatSkip = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return liveStrategyParamsConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveAnchorStrategyParamsSwitchSetting.LiveStrategyParamsConfig liveStrategyParamsConfig) throws IOException {
        LiveAnchorStrategyParamsSwitchSetting.LiveStrategyParamsConfig liveStrategyParamsConfig2 = liveStrategyParamsConfig;
        if (liveStrategyParamsConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("delay");
        c09dl.LJJIZ(liveStrategyParamsConfig2.startUploadDelay);
        c09dl.LJIILLIIL("period");
        c09dl.LJJIZ(liveStrategyParamsConfig2.period);
        c09dl.LJIILLIIL("active_keys");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveStrategyParamsConfig2.directUploadType, String.class);
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(liveStrategyParamsConfig2.f35switch);
        c09dl.LJIILLIIL("repeat_skip");
        c09dl.LJJJJJL(liveStrategyParamsConfig2.repeatSkip);
        c09dl.LJIILLIIL("realtime_feature_period");
        c09dl.LJJIZ(liveStrategyParamsConfig2.realtimeFeaturePeriod);
        c09dl.LJIILLIIL("upload_filter_type");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveStrategyParamsConfig2.uploadFilterType, String.class);
        c09dl.LJIILLIIL("user_action_params");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveStrategyParamsConfig2.userActionParams, String.class);
        c09dl.LJIILLIIL("base_info_params");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveStrategyParamsConfig2.baseInfoParams, String.class);
        c09dl.LJIILLIIL("performance_params");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveStrategyParamsConfig2.performanceParams, String.class);
        c09dl.LJIILLIIL("user_profile_params");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveStrategyParamsConfig2.userProfileParams, String.class);
        c09dl.LJIILLIIL("room_feature_params");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveStrategyParamsConfig2.roomFeatureParams, String.class);
        c09dl.LJII();
    }
}
