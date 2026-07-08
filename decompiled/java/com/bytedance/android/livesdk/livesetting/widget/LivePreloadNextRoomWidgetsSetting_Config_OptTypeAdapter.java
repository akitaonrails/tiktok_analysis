package com.bytedance.android.livesdk.livesetting.widget;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.android.livesdk.livesetting.widget.LivePreloadNextRoomWidgetsSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class LivePreloadNextRoomWidgetsSetting_Config_OptTypeAdapter extends TypeAdapter<LivePreloadNextRoomWidgetsSetting.Config> {
    public final Gson LIZ;

    public LivePreloadNextRoomWidgetsSetting_Config_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LivePreloadNextRoomWidgetsSetting.Config read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LivePreloadNextRoomWidgetsSetting.Config config = new LivePreloadNextRoomWidgetsSetting.Config(Boolean.FALSE, null, Integer.valueOf(LivePreCreateNextRoomPlayer.ENABLE), Boolean.FALSE, Boolean.FALSE, Boolean.FALSE);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1359487028:
                        if (strLJJJJ.equals("enable_click")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.enableClick = (Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1306510045:
                        if (strLJJJJ.equals("enable_follow_anim")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.enableFollowAnim = (Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.enable = (Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1086790392:
                        if (strLJJJJ.equals("post_delay_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.postDelayTime = Integer.valueOf(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -179878489:
                        if (strLJJJJ.equals("preload_trigger_timing")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.preloadTriggerTiming = Integer.valueOf(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1589633585:
                        if (strLJJJJ.equals("only_follower_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.onlyFollowerEnable = (Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu);
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
        return config;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LivePreloadNextRoomWidgetsSetting.Config config) {
        LivePreloadNextRoomWidgetsSetting.Config config2 = config;
        if (config2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJ(config2.enable);
        c09dl.LJIILLIIL("preload_trigger_timing");
        c09dl.LJJJJ(config2.preloadTriggerTiming);
        c09dl.LJIILLIIL("post_delay_time");
        c09dl.LJJJJ(config2.postDelayTime);
        c09dl.LJIILLIIL("enable_click");
        c09dl.LJJJ(config2.enableClick);
        c09dl.LJIILLIIL("enable_follow_anim");
        c09dl.LJJJ(config2.enableFollowAnim);
        c09dl.LJIILLIIL("only_follower_enable");
        c09dl.LJJJ(config2.onlyFollowerEnable);
        c09dl.LJII();
    }
}
