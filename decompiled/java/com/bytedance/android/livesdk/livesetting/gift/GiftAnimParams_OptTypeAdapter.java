package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftAnimParams_OptTypeAdapter extends TypeAdapter<GiftAnimParams> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final GiftAnimParams read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        GiftAnimParams giftAnimParams = new GiftAnimParams(0.7f, 100, 1.3f, 10, 1.5f, 1.4f);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -500819150:
                        if (strLJJJJ.equals("queue_small_size_scale")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftAnimParams.queueSmallSizeScale = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 117968396:
                        if (strLJJJJ.equals("counsume_d30_scale")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftAnimParams.consumeD30Scale = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 961032473:
                        if (strLJJJJ.equals("queue_big_size_scale")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftAnimParams.queueBigSizeScale = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1414637607:
                        if (strLJJJJ.equals("queue_small_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftAnimParams.queueSmallSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1553463118:
                        if (strLJJJJ.equals("queue_big_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftAnimParams.queueBigSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2075191254:
                        if (strLJJJJ.equals("ua_consume_d14_to_anchor_scale")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftAnimParams.uaConsumeD14ToAnchorScale = (float) c09cu.LJJIL();
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
        return giftAnimParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GiftAnimParams giftAnimParams) {
        GiftAnimParams giftAnimParams2 = giftAnimParams;
        if (giftAnimParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("queue_big_size_scale");
        c09dl.LJJJJ(Float.valueOf(giftAnimParams2.queueBigSizeScale));
        c09dl.LJIILLIIL("queue_big_size");
        c09dl.LJJJJ(Integer.valueOf(giftAnimParams2.queueBigSize));
        c09dl.LJIILLIIL("queue_small_size_scale");
        c09dl.LJJJJ(Float.valueOf(giftAnimParams2.queueSmallSizeScale));
        c09dl.LJIILLIIL("queue_small_size");
        c09dl.LJJJJ(Integer.valueOf(giftAnimParams2.queueSmallSize));
        c09dl.LJIILLIIL("ua_consume_d14_to_anchor_scale");
        c09dl.LJJJJ(Float.valueOf(giftAnimParams2.uaConsumeD14ToAnchorScale));
        c09dl.LJIILLIIL("counsume_d30_scale");
        c09dl.LJJJJ(Float.valueOf(giftAnimParams2.consumeD30Scale));
        c09dl.LJII();
    }
}
