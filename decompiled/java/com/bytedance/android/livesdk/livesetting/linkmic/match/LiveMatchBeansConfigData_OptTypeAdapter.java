package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public final class LiveMatchBeansConfigData_OptTypeAdapter extends TypeAdapter<LiveMatchBeansConfigData> {
    public final Gson LIZ;

    public LiveMatchBeansConfigData_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveMatchBeansConfigData read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveMatchBeansConfigData liveMatchBeansConfigData = new LiveMatchBeansConfigData(false, true, 2, 3, 3, 5, 1, 3L, 10L, 180L, 0.2f, "7401143682998473217");
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1974455318:
                        if (strLJJJJ.equals("settlement_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchBeansConfigData.settlement_duration = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1736534600:
                        if (strLJJJJ.equals("score_sync_period")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchBeansConfigData.score_sync_period = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1609594047:
                        if (strLJJJJ.equals("enabled")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchBeansConfigData.anchor_enabled = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1031702085:
                        if (strLJJJJ.equals("sei_result_waiting_max_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchBeansConfigData.sei_result_waiting_max_duration = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -810883302:
                        if (strLJJJJ.equals("volume")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchBeansConfigData.volume = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -173560802:
                        if (strLJJJJ.equals("audience_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchBeansConfigData.audience_enabled = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -47226778:
                        if (strLJJJJ.equals("final_score_send_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchBeansConfigData.final_score_send_interval = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 11675616:
                        if (strLJJJJ.equals("final_score_send_max_counts")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchBeansConfigData.final_score_send_max_counts = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 369668199:
                        if (strLJJJJ.equals("score_message_repeat_times")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchBeansConfigData.score_message_repeat_times = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 887294447:
                        if (strLJJJJ.equals("final_score_message_waiting_max_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchBeansConfigData.final_score_message_waiting_max_duration = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 906658625:
                        if (strLJJJJ.equals("game_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchBeansConfigData.game_duration = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1234537196:
                        if (strLJJJJ.equals("resource_id")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchBeansConfigData.catch_beans_resource_id = c09cu.LJJJZ();
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
        return liveMatchBeansConfigData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveMatchBeansConfigData liveMatchBeansConfigData) throws IOException {
        LiveMatchBeansConfigData liveMatchBeansConfigData2 = liveMatchBeansConfigData;
        if (liveMatchBeansConfigData2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enabled");
        c09dl.LJJJJJL(liveMatchBeansConfigData2.anchor_enabled);
        c09dl.LJIILLIIL("audience_enable");
        c09dl.LJJJJJL(liveMatchBeansConfigData2.audience_enabled);
        c09dl.LJIILLIIL("score_sync_period");
        c09dl.LJJJJ(Integer.valueOf(liveMatchBeansConfigData2.score_sync_period));
        c09dl.LJIILLIIL("score_message_repeat_times");
        c09dl.LJJJJ(Integer.valueOf(liveMatchBeansConfigData2.score_message_repeat_times));
        c09dl.LJIILLIIL("final_score_send_max_counts");
        c09dl.LJJJJ(Integer.valueOf(liveMatchBeansConfigData2.final_score_send_max_counts));
        c09dl.LJIILLIIL("settlement_duration");
        c09dl.LJJJJ(Integer.valueOf(liveMatchBeansConfigData2.settlement_duration));
        c09dl.LJIILLIIL("final_score_send_interval");
        c09dl.LJJJJ(Integer.valueOf(liveMatchBeansConfigData2.final_score_send_interval));
        c09dl.LJIILLIIL("final_score_message_waiting_max_duration");
        c09dl.LJJIZ(liveMatchBeansConfigData2.final_score_message_waiting_max_duration);
        c09dl.LJIILLIIL("sei_result_waiting_max_duration");
        c09dl.LJJIZ(liveMatchBeansConfigData2.sei_result_waiting_max_duration);
        c09dl.LJIILLIIL("game_duration");
        c09dl.LJJIZ(liveMatchBeansConfigData2.game_duration);
        c09dl.LJIILLIIL("volume");
        c09dl.LJJJJ(Float.valueOf(liveMatchBeansConfigData2.volume));
        c09dl.LJIILLIIL("resource_id");
        c09dl.LJJJJJ(liveMatchBeansConfigData2.catch_beans_resource_id);
        c09dl.LJII();
    }
}
