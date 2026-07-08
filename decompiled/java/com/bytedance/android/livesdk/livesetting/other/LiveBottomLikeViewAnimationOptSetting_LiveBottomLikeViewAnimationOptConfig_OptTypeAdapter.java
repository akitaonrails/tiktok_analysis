package com.bytedance.android.livesdk.livesetting.other;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.other.LiveBottomLikeViewAnimationOptSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveBottomLikeViewAnimationOptSetting_LiveBottomLikeViewAnimationOptConfig_OptTypeAdapter extends TypeAdapter<LiveBottomLikeViewAnimationOptSetting.LiveBottomLikeViewAnimationOptConfig> {
    public final Gson LIZ;

    public LiveBottomLikeViewAnimationOptSetting_LiveBottomLikeViewAnimationOptConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveBottomLikeViewAnimationOptSetting.LiveBottomLikeViewAnimationOptConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveBottomLikeViewAnimationOptSetting.LiveBottomLikeViewAnimationOptConfig liveBottomLikeViewAnimationOptConfig = new LiveBottomLikeViewAnimationOptSetting.LiveBottomLikeViewAnimationOptConfig(false, 10, false, true, false, 0);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -532408312:
                        if (strLJJJJ.equals("enable_digg_bottom_draw_bitmap_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveBottomLikeViewAnimationOptConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 456405741:
                        if (strLJJJJ.equals("digg_bottom_bitmap_user_hw")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveBottomLikeViewAnimationOptConfig.useHw = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1150378722:
                        if (strLJJJJ.equals("clear_cache_when_room_switch")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveBottomLikeViewAnimationOptConfig.clearCacheWhenRoomSwitch = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1382472960:
                        if (strLJJJJ.equals("digg_bottom_bitmap_view_pool_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveBottomLikeViewAnimationOptConfig.viewPoolSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1869976329:
                        if (strLJJJJ.equals("add_view_count_when_init")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveBottomLikeViewAnimationOptConfig.addViewCountWhenInit = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2036132565:
                        if (strLJJJJ.equals("use_key_frame")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveBottomLikeViewAnimationOptConfig.useKeyFrame = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return liveBottomLikeViewAnimationOptConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveBottomLikeViewAnimationOptSetting.LiveBottomLikeViewAnimationOptConfig liveBottomLikeViewAnimationOptConfig) throws IOException {
        LiveBottomLikeViewAnimationOptSetting.LiveBottomLikeViewAnimationOptConfig liveBottomLikeViewAnimationOptConfig2 = liveBottomLikeViewAnimationOptConfig;
        if (liveBottomLikeViewAnimationOptConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_digg_bottom_draw_bitmap_opt");
        c09dl.LJJJJJL(liveBottomLikeViewAnimationOptConfig2.enable);
        c09dl.LJIILLIIL("digg_bottom_bitmap_view_pool_size");
        c09dl.LJJJJ(Integer.valueOf(liveBottomLikeViewAnimationOptConfig2.viewPoolSize));
        c09dl.LJIILLIIL("use_key_frame");
        c09dl.LJJJJJL(liveBottomLikeViewAnimationOptConfig2.useKeyFrame);
        c09dl.LJIILLIIL("digg_bottom_bitmap_user_hw");
        c09dl.LJJJJJL(liveBottomLikeViewAnimationOptConfig2.useHw);
        c09dl.LJIILLIIL("clear_cache_when_room_switch");
        c09dl.LJJJJJL(liveBottomLikeViewAnimationOptConfig2.clearCacheWhenRoomSwitch);
        c09dl.LJIILLIIL("add_view_count_when_init");
        c09dl.LJJJJ(Integer.valueOf(liveBottomLikeViewAnimationOptConfig2.addViewCountWhenInit));
        c09dl.LJII();
    }
}
