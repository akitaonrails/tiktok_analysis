package com.bytedance.android.livesdk.model;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveUplinkConfig_OptTypeAdapter extends TypeAdapter<LiveUplinkConfig> {
    public final Gson LIZ;

    public LiveUplinkConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveUplinkConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveUplinkConfig liveUplinkConfig = new LiveUplinkConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveUplinkConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -715886178:
                        if (strLJJJJ.equals("ws_uplink_wait_timeout")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveUplinkConfig.wsUplinkWaitTimeout = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 777995101:
                        if (strLJJJJ.equals("uplink_strategy")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveUplinkConfig.uplinkStrategy = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1339572557:
                        if (strLJJJJ.equals("ws_fail_fallback_to_http")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveUplinkConfig.wsFailFallbackToHttp = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1394820439:
                        if (strLJJJJ.equals("uplink_api_alternative_service_id_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveUplinkConfig.uplinkApiAlternativeServiceIdList = (Map) this.LIZ.LJIIIZ(new TypeToken<Map<String, ? extends Map<String, ? extends Long>>>() { // from class: X.00Vg
                                }).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1731129540:
                        if (strLJJJJ.equals("uplink_api_allowed_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveUplinkConfig.uplinkApiAllowedList = (Map) this.LIZ.LJIIIZ(new TypeToken<Map<String, ? extends Map<String, ? extends Long>>>() { // from class: X.00Vf
                                }).read(c09cu);
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
        return liveUplinkConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveUplinkConfig liveUplinkConfig) throws IOException {
        LiveUplinkConfig liveUplinkConfig2 = liveUplinkConfig;
        if (liveUplinkConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(liveUplinkConfig2.enable);
        c09dl.LJIILLIIL("uplink_strategy");
        c09dl.LJJJJ(Integer.valueOf(liveUplinkConfig2.uplinkStrategy));
        c09dl.LJIILLIIL("ws_uplink_wait_timeout");
        c09dl.LJJIZ(liveUplinkConfig2.wsUplinkWaitTimeout);
        c09dl.LJIILLIIL("uplink_api_allowed_list");
        this.LIZ.LJIIIZ(new TypeToken<Map<String, ? extends Map<String, ? extends Long>>>() { // from class: X.00Vh
        }).write(c09dl, liveUplinkConfig2.uplinkApiAllowedList);
        c09dl.LJIILLIIL("uplink_api_alternative_service_id_list");
        this.LIZ.LJIIIZ(new TypeToken<Map<String, ? extends Map<String, ? extends Long>>>() { // from class: X.00Vi
        }).write(c09dl, liveUplinkConfig2.uplinkApiAlternativeServiceIdList);
        c09dl.LJIILLIIL("ws_fail_fallback_to_http");
        c09dl.LJJJJJL(liveUplinkConfig2.wsFailFallbackToHttp);
        c09dl.LJII();
    }
}
