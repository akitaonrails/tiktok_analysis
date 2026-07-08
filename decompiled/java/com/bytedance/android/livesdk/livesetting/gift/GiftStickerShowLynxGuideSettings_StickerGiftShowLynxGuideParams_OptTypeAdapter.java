package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.gift.GiftStickerShowLynxGuideSettings;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftStickerShowLynxGuideSettings_StickerGiftShowLynxGuideParams_OptTypeAdapter extends TypeAdapter<GiftStickerShowLynxGuideSettings.StickerGiftShowLynxGuideParams> {
    public final Gson LIZ;

    public GiftStickerShowLynxGuideSettings_StickerGiftShowLynxGuideParams_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final GiftStickerShowLynxGuideSettings.StickerGiftShowLynxGuideParams read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        GiftStickerShowLynxGuideSettings.StickerGiftShowLynxGuideParams stickerGiftShowLynxGuideParams = new GiftStickerShowLynxGuideSettings.StickerGiftShowLynxGuideParams(3000L, false, 3, 5);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1452357880:
                        if (strLJJJJ.equals("max_show_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                stickerGiftShowLynxGuideParams.maxShowCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -886354867:
                        if (strLJJJJ.equals("ignore_frequency_control")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                stickerGiftShowLynxGuideParams.ignoreFrequencyControl = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -82177728:
                        if (strLJJJJ.equals("first_frame_timeout")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                stickerGiftShowLynxGuideParams.firstFrameTimeOut = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 491972598:
                        if (strLJJJJ.equals("show_interval_in_minute")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                stickerGiftShowLynxGuideParams.showIntervalInMinute = c09cu.LJJIZ();
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
        return stickerGiftShowLynxGuideParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GiftStickerShowLynxGuideSettings.StickerGiftShowLynxGuideParams stickerGiftShowLynxGuideParams) throws IOException {
        GiftStickerShowLynxGuideSettings.StickerGiftShowLynxGuideParams stickerGiftShowLynxGuideParams2 = stickerGiftShowLynxGuideParams;
        if (stickerGiftShowLynxGuideParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("first_frame_timeout");
        c09dl.LJJIZ(stickerGiftShowLynxGuideParams2.firstFrameTimeOut);
        c09dl.LJIILLIIL("ignore_frequency_control");
        c09dl.LJJJJJL(stickerGiftShowLynxGuideParams2.ignoreFrequencyControl);
        c09dl.LJIILLIIL("max_show_count");
        c09dl.LJJJJ(Integer.valueOf(stickerGiftShowLynxGuideParams2.maxShowCount));
        c09dl.LJIILLIIL("show_interval_in_minute");
        c09dl.LJJJJ(Integer.valueOf(stickerGiftShowLynxGuideParams2.showIntervalInMinute));
        c09dl.LJII();
    }
}
