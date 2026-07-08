package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.gift.GiftShinyCardInteractionConfigSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftShinyCardInteractionConfigSetting_GiftShinyCardInteractionParams_OptTypeAdapter extends TypeAdapter<GiftShinyCardInteractionConfigSetting.GiftShinyCardInteractionParams> {
    @Override // com.google.gson.TypeAdapter
    public final GiftShinyCardInteractionConfigSetting.GiftShinyCardInteractionParams read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        GiftShinyCardInteractionConfigSetting.GiftShinyCardInteractionParams giftShinyCardInteractionParams = new GiftShinyCardInteractionConfigSetting.GiftShinyCardInteractionParams(30000L, 2000L, LivePreCreateNextRoomPlayer.ENABLE);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != 17995604) {
                    if (iHashCode != 448831809) {
                        if (iHashCode == 962576152 && strLJJJJ.equals("bubble_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftShinyCardInteractionParams.bubbleInterval = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("shiny_card_interact_random_delay")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            giftShinyCardInteractionParams.requestApiRandomDelay = c09cu.LJJIZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("bubble_show_delay")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        giftShinyCardInteractionParams.bubbleShowDelay = c09cu.LJJJ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return giftShinyCardInteractionParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GiftShinyCardInteractionConfigSetting.GiftShinyCardInteractionParams giftShinyCardInteractionParams) throws IOException {
        GiftShinyCardInteractionConfigSetting.GiftShinyCardInteractionParams giftShinyCardInteractionParams2 = giftShinyCardInteractionParams;
        if (giftShinyCardInteractionParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("bubble_interval");
        c09dl.LJJIZ(giftShinyCardInteractionParams2.bubbleInterval);
        c09dl.LJIILLIIL("bubble_show_delay");
        c09dl.LJJIZ(giftShinyCardInteractionParams2.bubbleShowDelay);
        c09dl.LJIILLIIL("shiny_card_interact_random_delay");
        c09dl.LJJJJ(Integer.valueOf(giftShinyCardInteractionParams2.requestApiRandomDelay));
        c09dl.LJII();
    }
}
