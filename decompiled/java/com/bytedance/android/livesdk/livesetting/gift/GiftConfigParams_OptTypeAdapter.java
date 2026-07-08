package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftConfigParams_OptTypeAdapter extends TypeAdapter<GiftConfigParams> {
    public final Gson LIZ;

    public GiftConfigParams_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final GiftConfigParams read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        GiftConfigParams giftConfigParams = new GiftConfigParams();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1691060630:
                        if (strLJJJJ.equals("self_side")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftConfigParams._selfSide = (GiftConfig) this.LIZ.LJIIJ(GiftConfig.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1546118485:
                        if (strLJJJJ.equals("other_queue_size_stairs")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftConfigParams._otherQueueStairs = C473040Igo.LIZ(this.LIZ, c09cu, MsgStair.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1544274783:
                        if (strLJJJJ.equals("anchor_side")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftConfigParams._anchorSide = (GiftConfig) this.LIZ.LJIIJ(GiftConfig.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -182255322:
                        if (strLJJJJ.equals("other_side")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftConfigParams._otherSide = (GiftConfig) this.LIZ.LJIIJ(GiftConfig.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 808497534:
                        if (strLJJJJ.equals("enable_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftConfigParams._enableConfig = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2104906727:
                        if (strLJJJJ.equals("self_queue_size_stairs")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftConfigParams._selfQueueStairs = C473040Igo.LIZ(this.LIZ, c09cu, MsgStair.class);
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
        return giftConfigParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GiftConfigParams giftConfigParams) throws IOException {
        GiftConfigParams giftConfigParams2 = giftConfigParams;
        if (giftConfigParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_config");
        c09dl.LJJJJJL(giftConfigParams2._enableConfig);
        c09dl.LJIILLIIL("self_side");
        TypeAdapter typeAdapterLJIIJ = this.LIZ.LJIIJ(GiftConfig.class);
        typeAdapterLJIIJ.write(c09dl, giftConfigParams2._selfSide);
        c09dl.LJIILLIIL("anchor_side");
        typeAdapterLJIIJ.write(c09dl, giftConfigParams2._anchorSide);
        c09dl.LJIILLIIL("other_side");
        typeAdapterLJIIJ.write(c09dl, giftConfigParams2._otherSide);
        c09dl.LJIILLIIL("self_queue_size_stairs");
        C473040Igo.LIZLLL(this.LIZ, c09dl, giftConfigParams2._selfQueueStairs, MsgStair.class);
        c09dl.LJIILLIIL("other_queue_size_stairs");
        C473040Igo.LIZLLL(this.LIZ, c09dl, giftConfigParams2._otherQueueStairs, MsgStair.class);
        c09dl.LJII();
    }
}
