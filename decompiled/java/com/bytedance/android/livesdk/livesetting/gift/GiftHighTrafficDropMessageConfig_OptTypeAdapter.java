package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftHighTrafficDropMessageConfig_OptTypeAdapter extends TypeAdapter<GiftHighTrafficDropMessageConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final GiftHighTrafficDropMessageConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        GiftHighTrafficDropMessageConfig giftHighTrafficDropMessageConfig = new GiftHighTrafficDropMessageConfig(5000, 50, 500L, 1, 5);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1895334827:
                        if (strLJJJJ.equals("insertion_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftHighTrafficDropMessageConfig.insertInterval = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 388468684:
                        if (strLJJJJ.equals("clear_percentage")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftHighTrafficDropMessageConfig.clearPercentage = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 600130165:
                        if (strLJJJJ.equals("insert_small_gift_num")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftHighTrafficDropMessageConfig.insertSmallGiftNum = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1801035983:
                        if (strLJJJJ.equals("max_queue_length")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftHighTrafficDropMessageConfig.maxQueueLength = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1889934364:
                        if (strLJJJJ.equals("insert_big_gift_num")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftHighTrafficDropMessageConfig.insertBigGiftNum = c09cu.LJJIZ();
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
        return giftHighTrafficDropMessageConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GiftHighTrafficDropMessageConfig giftHighTrafficDropMessageConfig) throws IOException {
        GiftHighTrafficDropMessageConfig giftHighTrafficDropMessageConfig2 = giftHighTrafficDropMessageConfig;
        if (giftHighTrafficDropMessageConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("max_queue_length");
        c09dl.LJJJJ(Integer.valueOf(giftHighTrafficDropMessageConfig2.maxQueueLength));
        c09dl.LJIILLIIL("clear_percentage");
        c09dl.LJJJJ(Integer.valueOf(giftHighTrafficDropMessageConfig2.clearPercentage));
        c09dl.LJIILLIIL("insertion_interval");
        c09dl.LJJIZ(giftHighTrafficDropMessageConfig2.insertInterval);
        c09dl.LJIILLIIL("insert_big_gift_num");
        c09dl.LJJJJ(Integer.valueOf(giftHighTrafficDropMessageConfig2.insertBigGiftNum));
        c09dl.LJIILLIIL("insert_small_gift_num");
        c09dl.LJJJJ(Integer.valueOf(giftHighTrafficDropMessageConfig2.insertSmallGiftNum));
        c09dl.LJII();
    }
}
