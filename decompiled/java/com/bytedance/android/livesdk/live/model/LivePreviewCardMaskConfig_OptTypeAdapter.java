package com.bytedance.android.livesdk.live.model;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LivePreviewCardMaskConfig_OptTypeAdapter extends TypeAdapter<LivePreviewCardMaskConfig> {
    public final Gson LIZ;

    public LivePreviewCardMaskConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LivePreviewCardMaskConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LivePreviewCardMaskConfig livePreviewCardMaskConfig = new LivePreviewCardMaskConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != 885586298) {
                    if (iHashCode != 920600943) {
                        if (iHashCode == 1877101707 && strLJJJJ.equals("live_preview_card_bottom_mask_height")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePreviewCardMaskConfig.setBottomMaskHeight(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("live_preview_card_mask_top_optimized")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            livePreviewCardMaskConfig.setTopOptimized(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("live_preview_card_bottom_mask_alpha")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        livePreviewCardMaskConfig.setBottomMaskAlpha(c09cu.LJJIZ());
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return livePreviewCardMaskConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LivePreviewCardMaskConfig livePreviewCardMaskConfig) throws IOException {
        LivePreviewCardMaskConfig livePreviewCardMaskConfig2 = livePreviewCardMaskConfig;
        if (livePreviewCardMaskConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("live_preview_card_bottom_mask_height");
        c09dl.LJJJJ(Integer.valueOf(livePreviewCardMaskConfig2.getBottomMaskHeight()));
        c09dl.LJIILLIIL("live_preview_card_mask_top_optimized");
        c09dl.LJJJJJL(livePreviewCardMaskConfig2.getTopOptimized());
        c09dl.LJIILLIIL("live_preview_card_bottom_mask_alpha");
        c09dl.LJJJJ(Integer.valueOf(livePreviewCardMaskConfig2.getBottomMaskAlpha()));
        c09dl.LJII();
    }
}
