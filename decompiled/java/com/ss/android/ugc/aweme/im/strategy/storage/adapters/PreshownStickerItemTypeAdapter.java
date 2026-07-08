package com.ss.android.ugc.aweme.im.strategy.storage.adapters;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.AIMojiStickerConfig;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.PreshownStickerItem;
import com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionGiphyMessage;
import com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionStickerSetMessage;

/* JADX INFO: loaded from: classes15.dex */
public final class PreshownStickerItemTypeAdapter extends TypeAdapter<PreshownStickerItem> {
    public final Gson LIZ;

    public PreshownStickerItemTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final PreshownStickerItem read(C09CU c09cu) {
        c09cu.LIZIZ();
        Integer numValueOf = null;
        LightInteractionGiphyMessage lightInteractionGiphyMessage = null;
        LightInteractionStickerSetMessage lightInteractionStickerSetMessage = null;
        AIMojiStickerConfig aIMojiStickerConfig = null;
        String strLJJJZ = null;
        String strLJJJZ2 = null;
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2030994180:
                        if (strLJJJJ.equals("sticker_type")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                numValueOf = Integer.valueOf(c09cu.LJJIZ());
                            }
                        }
                        break;
                    case -1855312172:
                        if (strLJJJJ.equals("quote_string_key")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ2 = c09cu.LJJJZ();
                            }
                        }
                        break;
                    case -1417612663:
                        if (strLJJJJ.equals("aimoji")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                aIMojiStickerConfig = (AIMojiStickerConfig) this.LIZ.LJIIJ(AIMojiStickerConfig.class).read(c09cu);
                            }
                        }
                        break;
                    case -1321546630:
                        if (strLJJJJ.equals("template")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                lightInteractionStickerSetMessage = (LightInteractionStickerSetMessage) this.LIZ.LJIIJ(LightInteractionStickerSetMessage.class).read(c09cu);
                            }
                        }
                        break;
                    case 98361695:
                        if (strLJJJJ.equals("giphy")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                lightInteractionGiphyMessage = (LightInteractionGiphyMessage) this.LIZ.LJIIJ(LightInteractionGiphyMessage.class).read(c09cu);
                            }
                        }
                        break;
                    case 117447147:
                        if (strLJJJJ.equals("receiver_copy_string_key")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ = c09cu.LJJJZ();
                            }
                        }
                        break;
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return new PreshownStickerItem(numValueOf, lightInteractionGiphyMessage, lightInteractionStickerSetMessage, aIMojiStickerConfig, strLJJJZ, strLJJJZ2);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, PreshownStickerItem preshownStickerItem) {
        PreshownStickerItem preshownStickerItem2 = preshownStickerItem;
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("sticker_type");
        c09dl.LJJJJ(preshownStickerItem2.stickerType);
        c09dl.LJIILLIIL("giphy");
        if (preshownStickerItem2.giphy == null) {
            c09dl.LJIJJ();
        } else {
            this.LIZ.LJIIJ(LightInteractionGiphyMessage.class).write(c09dl, preshownStickerItem2.giphy);
        }
        c09dl.LJIILLIIL("template");
        if (preshownStickerItem2.template == null) {
            c09dl.LJIJJ();
        } else {
            this.LIZ.LJIIJ(LightInteractionStickerSetMessage.class).write(c09dl, preshownStickerItem2.template);
        }
        c09dl.LJIILLIIL("aimoji");
        if (preshownStickerItem2.aimoji == null) {
            c09dl.LJIJJ();
        } else {
            this.LIZ.LJIIJ(AIMojiStickerConfig.class).write(c09dl, preshownStickerItem2.aimoji);
        }
        c09dl.LJIILLIIL("receiver_copy_string_key");
        c09dl.LJJJJJ(preshownStickerItem2.receiverCopyStringKey);
        c09dl.LJIILLIIL("quote_string_key");
        c09dl.LJJJJJ(preshownStickerItem2.quoteStringKey);
        c09dl.LJII();
    }
}
