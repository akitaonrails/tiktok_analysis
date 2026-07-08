package com.bytedance.android.livesdk.livesetting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveInteractionMaskConfig_OptTypeAdapter extends TypeAdapter<LiveInteractionMaskConfig> {
    public final Gson LIZ;

    public LiveInteractionMaskConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveInteractionMaskConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveInteractionMaskConfig liveInteractionMaskConfig = new LiveInteractionMaskConfig(false, false, false, 140);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1699789607:
                        if (strLJJJJ.equals("respect_clear_screen_anim")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveInteractionMaskConfig.respectClearScreenAnim = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 220545836:
                        if (strLJJJJ.equals("mask_show_after_first_frame")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveInteractionMaskConfig.maskShowAfterFirstFrame = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 781053424:
                        if (strLJJJJ.equals("top_mask_height")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveInteractionMaskConfig.topMaskHeight = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 849094735:
                        if (strLJJJJ.equals("preview_card_enter_mask_sync")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveInteractionMaskConfig.previewCardEnterMaskSync = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return liveInteractionMaskConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveInteractionMaskConfig liveInteractionMaskConfig) throws IOException {
        LiveInteractionMaskConfig liveInteractionMaskConfig2 = liveInteractionMaskConfig;
        if (liveInteractionMaskConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("respect_clear_screen_anim");
        c09dl.LJJJJJL(liveInteractionMaskConfig2.respectClearScreenAnim);
        c09dl.LJIILLIIL("preview_card_enter_mask_sync");
        c09dl.LJJJJJL(liveInteractionMaskConfig2.previewCardEnterMaskSync);
        c09dl.LJIILLIIL("mask_show_after_first_frame");
        c09dl.LJJJJJL(liveInteractionMaskConfig2.maskShowAfterFirstFrame);
        c09dl.LJIILLIIL("top_mask_height");
        c09dl.LJJJJ(Integer.valueOf(liveInteractionMaskConfig2.topMaskHeight));
        c09dl.LJII();
    }
}
