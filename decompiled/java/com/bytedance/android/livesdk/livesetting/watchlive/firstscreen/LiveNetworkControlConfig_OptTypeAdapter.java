package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveNetworkControlConfig_OptTypeAdapter extends TypeAdapter<LiveNetworkControlConfig> {
    public final Gson LIZ;

    public LiveNetworkControlConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveNetworkControlConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveNetworkControlConfig liveNetworkControlConfig = new LiveNetworkControlConfig(false, null, null, null, null, null, null, 0L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2143169673:
                        if (strLJJJJ.equals("delayReleaseTimeMs")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveNetworkControlConfig.delayReleaseTimeMs = Long.valueOf(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1455890735:
                        if (strLJJJJ.equals("lowPriorityApis")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveNetworkControlConfig.lowPriorityApis = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveNetworkControlConfig.enabled = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -432782291:
                        if (strLJJJJ.equals("dropList")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveNetworkControlConfig.dropList = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -7719496:
                        if (strLJJJJ.equals("apiThrottleLimitedDomainList")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveNetworkControlConfig.apiThrottleLimitedDomainList = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 911021087:
                        if (strLJJJJ.equals("highPriorityApis")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveNetworkControlConfig.highPriorityApis = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1322829640:
                        if (strLJJJJ.equals("throttleConfigByPath")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveNetworkControlConfig.throttleConfigByPath = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1332059453:
                        if (strLJJJJ.equals("blackList")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveNetworkControlConfig.blackList = c09cu.LJJJZ();
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
        return liveNetworkControlConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveNetworkControlConfig liveNetworkControlConfig) throws IOException {
        LiveNetworkControlConfig liveNetworkControlConfig2 = liveNetworkControlConfig;
        if (liveNetworkControlConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(liveNetworkControlConfig2.enabled);
        c09dl.LJIILLIIL("dropList");
        c09dl.LJJJJJ(liveNetworkControlConfig2.dropList);
        c09dl.LJIILLIIL("blackList");
        c09dl.LJJJJJ(liveNetworkControlConfig2.blackList);
        c09dl.LJIILLIIL("lowPriorityApis");
        c09dl.LJJJJJ(liveNetworkControlConfig2.lowPriorityApis);
        c09dl.LJIILLIIL("highPriorityApis");
        c09dl.LJJJJJ(liveNetworkControlConfig2.highPriorityApis);
        c09dl.LJIILLIIL("throttleConfigByPath");
        c09dl.LJJJJJ(liveNetworkControlConfig2.throttleConfigByPath);
        c09dl.LJIILLIIL("apiThrottleLimitedDomainList");
        c09dl.LJJJJJ(liveNetworkControlConfig2.apiThrottleLimitedDomainList);
        c09dl.LJIILLIIL("delayReleaseTimeMs");
        c09dl.LJJJJ(liveNetworkControlConfig2.delayReleaseTimeMs);
        c09dl.LJII();
    }
}
