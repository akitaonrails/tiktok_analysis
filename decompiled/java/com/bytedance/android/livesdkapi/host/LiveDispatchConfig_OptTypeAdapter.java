package com.bytedance.android.livesdkapi.host;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes24.dex */
public final class LiveDispatchConfig_OptTypeAdapter extends TypeAdapter<LiveDispatchConfig> {
    public final Gson LIZ;

    public LiveDispatchConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveDispatchConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveDispatchConfig liveDispatchConfig = new LiveDispatchConfig(null, 0, null, null, null, 0, 0, null, null, null, null, null, null, 8191, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2082150910:
                        if (strLJJJJ.equals("ws_throttle_limited_domain_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveDispatchConfig.setWsThrottleLimitedDomainList(C473040Igo.LIZ(this.LIZ, c09cu, String.class));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -2062488700:
                        if (strLJJJJ.equals("api_throttle_limited_domain_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveDispatchConfig.setApiThrottleLimitedDomainList(C473040Igo.LIZ(this.LIZ, c09cu, String.class));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1638694487:
                        if (strLJJJJ.equals("low_priority_apis")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveDispatchConfig.setLowPriorityApis(C473040Igo.LIZ(this.LIZ, c09cu, String.class));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1638203170:
                        if (strLJJJJ.equals("black_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveDispatchConfig.setBlackList(C473040Igo.LIZ(this.LIZ, c09cu, String.class));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1586838988:
                        if (strLJJJJ.equals("throttle_limit_by_path")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveDispatchConfig.setThrottleConfigByPath(C473040Igo.LIZIZ(this.LIZ, c09cu, Integer.TYPE));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1477741055:
                        if (strLJJJJ.equals("max_delay_time_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveDispatchConfig.setMaxDelayTimeMs(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -513722386:
                        if (strLJJJJ.equals("drop_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveDispatchConfig.setDropList(C473040Igo.LIZ(this.LIZ, c09cu, String.class));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -70509755:
                        if (strLJJJJ.equals("delay_disable_time_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveDispatchConfig.setDelayDisableTimeMs(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 258330356:
                        if (strLJJJJ.equals("white_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveDispatchConfig.setWhiteList(C473040Igo.LIZ(this.LIZ, c09cu, String.class));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 925866871:
                        if (strLJJJJ.equals("high_priority_apis")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveDispatchConfig.setHighPriorityApis(C473040Igo.LIZ(this.LIZ, c09cu, String.class));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1745959272:
                        if (strLJJJJ.equals("sparse_send_interval_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveDispatchConfig.setSparseSendIntervalMs(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2080412254:
                        if (strLJJJJ.equals("scene_name")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveDispatchConfig.setSceneName(c09cu.LJJJZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2110230998:
                        if (strLJJJJ.equals("default_priority_apis")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveDispatchConfig.setDefaultPriorityApis(C473040Igo.LIZ(this.LIZ, c09cu, String.class));
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
        return liveDispatchConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveDispatchConfig liveDispatchConfig) {
        LiveDispatchConfig liveDispatchConfig2 = liveDispatchConfig;
        if (liveDispatchConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("api_throttle_limited_domain_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveDispatchConfig2.getApiThrottleLimitedDomainList(), String.class);
        c09dl.LJIILLIIL("black_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveDispatchConfig2.getBlackList(), String.class);
        c09dl.LJIILLIIL("default_priority_apis");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveDispatchConfig2.getDefaultPriorityApis(), String.class);
        c09dl.LJIILLIIL("delay_disable_time_ms");
        c09dl.LJJJJ(Integer.valueOf(liveDispatchConfig2.getDelayDisableTimeMs()));
        c09dl.LJIILLIIL("drop_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveDispatchConfig2.getDropList(), String.class);
        c09dl.LJIILLIIL("high_priority_apis");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveDispatchConfig2.getHighPriorityApis(), String.class);
        c09dl.LJIILLIIL("low_priority_apis");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveDispatchConfig2.getLowPriorityApis(), String.class);
        c09dl.LJIILLIIL("max_delay_time_ms");
        c09dl.LJJJJ(Integer.valueOf(liveDispatchConfig2.getMaxDelayTimeMs()));
        c09dl.LJIILLIIL("scene_name");
        c09dl.LJJJJJ(liveDispatchConfig2.getSceneName());
        c09dl.LJIILLIIL("sparse_send_interval_ms");
        c09dl.LJJJJ(Integer.valueOf(liveDispatchConfig2.getSparseSendIntervalMs()));
        c09dl.LJIILLIIL("throttle_limit_by_path");
        C473040Igo.LJ(this.LIZ, c09dl, liveDispatchConfig2.getThrottleConfigByPath(), Integer.TYPE);
        c09dl.LJIILLIIL("white_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveDispatchConfig2.getWhiteList(), String.class);
        c09dl.LJIILLIIL("ws_throttle_limited_domain_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveDispatchConfig2.getWsThrottleLimitedDomainList(), String.class);
        c09dl.LJII();
    }
}
