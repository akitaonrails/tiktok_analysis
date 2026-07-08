package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveCoHostMonitorConfig_OptTypeAdapter extends TypeAdapter<LiveCoHostMonitorConfig> {
    public final Gson LIZ;

    public LiveCoHostMonitorConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveCoHostMonitorConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveCoHostMonitorConfig liveCoHostMonitorConfig = new LiveCoHostMonitorConfig(false, null, null, null, 15, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1894867213:
                        if (strLJJJJ.equals("online_event_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveCoHostMonitorConfig.onlineEventConfig = (Map) this.LIZ.LJIIIZ(new TypeToken<Map<String, ? extends Map<String, ? extends Integer>>>() { // from class: X.00VZ
                                }).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1632759453:
                        if (strLJJJJ.equals("offline_event_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveCoHostMonitorConfig.offlineEventConfig = (Map) this.LIZ.LJIIIZ(new TypeToken<Map<String, ? extends List<? extends String>>>() { // from class: X.00Va
                                }).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -834809288:
                        if (strLJJJJ.equals("is_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveCoHostMonitorConfig.isEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2064396776:
                        if (strLJJJJ.equals("offline_service_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveCoHostMonitorConfig.offlineServiceConfig = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
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
        return liveCoHostMonitorConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveCoHostMonitorConfig liveCoHostMonitorConfig) throws IOException {
        LiveCoHostMonitorConfig liveCoHostMonitorConfig2 = liveCoHostMonitorConfig;
        if (liveCoHostMonitorConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("is_enable");
        c09dl.LJJJJJL(liveCoHostMonitorConfig2.isEnable);
        c09dl.LJIILLIIL("online_event_config");
        this.LIZ.LJIIIZ(new TypeToken<Map<String, ? extends Map<String, ? extends Integer>>>() { // from class: X.00Vb
        }).write(c09dl, liveCoHostMonitorConfig2.onlineEventConfig);
        c09dl.LJIILLIIL("offline_event_config");
        this.LIZ.LJIIIZ(new TypeToken<Map<String, ? extends List<? extends String>>>() { // from class: X.00Vc
        }).write(c09dl, liveCoHostMonitorConfig2.offlineEventConfig);
        c09dl.LJIILLIIL("offline_service_config");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveCoHostMonitorConfig2.offlineServiceConfig, String.class);
        c09dl.LJII();
    }
}
