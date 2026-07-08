package com.bytedance.android.livesdk.livesetting.other;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.other.LiveTapLikeViewAnimationOptSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveTapLikeViewAnimationOptSetting_LiveTapLikeViewAnimationOptConfig_OptTypeAdapter extends TypeAdapter<LiveTapLikeViewAnimationOptSetting.LiveTapLikeViewAnimationOptConfig> {
    public final Gson LIZ;

    public LiveTapLikeViewAnimationOptSetting_LiveTapLikeViewAnimationOptConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveTapLikeViewAnimationOptSetting.LiveTapLikeViewAnimationOptConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveTapLikeViewAnimationOptSetting.LiveTapLikeViewAnimationOptConfig liveTapLikeViewAnimationOptConfig = new LiveTapLikeViewAnimationOptSetting.LiveTapLikeViewAnimationOptConfig(false, 10, true, false, 0);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2077904636:
                        if (strLJJJJ.equals("enable_digg_tap_draw_bitmap_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveTapLikeViewAnimationOptConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -2031898263:
                        if (strLJJJJ.equals("digg_tap_bitmap_user_hw")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveTapLikeViewAnimationOptConfig.useHw = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1150378722:
                        if (strLJJJJ.equals("clear_cache_when_room_switch")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveTapLikeViewAnimationOptConfig.clearCacheWhenRoomSwitch = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1493129988:
                        if (strLJJJJ.equals("digg_tap_bitmap_view_pool_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveTapLikeViewAnimationOptConfig.viewPoolSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1869976329:
                        if (strLJJJJ.equals("add_view_count_when_init")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveTapLikeViewAnimationOptConfig.addViewCountWhenInit = c09cu.LJJIZ();
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
        return liveTapLikeViewAnimationOptConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveTapLikeViewAnimationOptSetting.LiveTapLikeViewAnimationOptConfig liveTapLikeViewAnimationOptConfig) throws IOException {
        LiveTapLikeViewAnimationOptSetting.LiveTapLikeViewAnimationOptConfig liveTapLikeViewAnimationOptConfig2 = liveTapLikeViewAnimationOptConfig;
        if (liveTapLikeViewAnimationOptConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_digg_tap_draw_bitmap_opt");
        c09dl.LJJJJJL(liveTapLikeViewAnimationOptConfig2.enable);
        c09dl.LJIILLIIL("digg_tap_bitmap_view_pool_size");
        c09dl.LJJJJ(Integer.valueOf(liveTapLikeViewAnimationOptConfig2.viewPoolSize));
        c09dl.LJIILLIIL("digg_tap_bitmap_user_hw");
        c09dl.LJJJJJL(liveTapLikeViewAnimationOptConfig2.useHw);
        c09dl.LJIILLIIL("clear_cache_when_room_switch");
        c09dl.LJJJJJL(liveTapLikeViewAnimationOptConfig2.clearCacheWhenRoomSwitch);
        c09dl.LJIILLIIL("add_view_count_when_init");
        c09dl.LJJJJ(Integer.valueOf(liveTapLikeViewAnimationOptConfig2.addViewCountWhenInit));
        c09dl.LJII();
    }
}
