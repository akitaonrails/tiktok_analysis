package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostSubtitleConfig;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveCoHostSubtitleConfig_Configs_OptTypeAdapter extends TypeAdapter<LiveCoHostSubtitleConfig.Configs> {
    public final Gson LIZ;

    public LiveCoHostSubtitleConfig_Configs_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveCoHostSubtitleConfig.Configs read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveCoHostSubtitleConfig.Configs configs = new LiveCoHostSubtitleConfig.Configs(true, 30, "aweme://roma_redirect/?spark_page=live_cohost_subtitle_first_guide", false, false, 10, true);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1603933232:
                        if (strLJJJJ.equals("no_speaker_exit_timeout_sec")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                configs.noSpeakerExitTimeoutSec = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                configs.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1079147811:
                        if (strLJJJJ.equals("first_guide_url")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                configs.firstGuideUrl = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -650598458:
                        if (strLJJJJ.equals("show_room_owner_subtitle")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                configs.showRoomOwnerSubtitle = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 177034411:
                        if (strLJJJJ.equals("monitor_display_sample_divisor")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                configs.monitorDisplaySampleDivisor = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 832954804:
                        if (strLJJJJ.equals("enable_alog_receive_subtitle")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                configs.enableALogReceiveSubtitle = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1389311652:
                        if (strLJJJJ.equals("show_unconfirmed")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                configs.showUnconfirmed = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return configs;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveCoHostSubtitleConfig.Configs configs) throws IOException {
        LiveCoHostSubtitleConfig.Configs configs2 = configs;
        if (configs2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(configs2.enable);
        c09dl.LJIILLIIL("no_speaker_exit_timeout_sec");
        c09dl.LJJJJ(Integer.valueOf(configs2.noSpeakerExitTimeoutSec));
        c09dl.LJIILLIIL("first_guide_url");
        c09dl.LJJJJJ(configs2.firstGuideUrl);
        c09dl.LJIILLIIL("show_room_owner_subtitle");
        c09dl.LJJJJJL(configs2.showRoomOwnerSubtitle);
        c09dl.LJIILLIIL("show_unconfirmed");
        c09dl.LJJJJJL(configs2.showUnconfirmed);
        c09dl.LJIILLIIL("monitor_display_sample_divisor");
        c09dl.LJJJJ(Integer.valueOf(configs2.monitorDisplaySampleDivisor));
        c09dl.LJIILLIIL("enable_alog_receive_subtitle");
        c09dl.LJJJJJL(configs2.enableALogReceiveSubtitle);
        c09dl.LJII();
    }
}
