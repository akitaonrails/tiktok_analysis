package com.bytedance.android.livesdk.livesetting.wallet;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftExchangeSchema_OptTypeAdapter extends TypeAdapter<GiftExchangeSchema> {
    public final Gson LIZ;

    public GiftExchangeSchema_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final GiftExchangeSchema read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        GiftExchangeSchema giftExchangeSchema = new GiftExchangeSchema();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1779788452:
                        if (strLJJJJ.equals("gift_exchange_pop_schema")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftExchangeSchema.giftExchangePopSchema = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1037198336:
                        if (strLJJJJ.equals("live_wallet_enable_lynx_gift_exchange_popup")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftExchangeSchema.liveWalletEnableLynxGiftExchangePopup = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 120600224:
                        if (strLJJJJ.equals("auto_exchange_popup_schema")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftExchangeSchema.autoExchangePopUpSchema = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 317759656:
                        if (strLJJJJ.equals("tax_popup_schema")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftExchangeSchema.taxPopUpSchema = c09cu.LJJJZ();
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
        return giftExchangeSchema;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GiftExchangeSchema giftExchangeSchema) throws IOException {
        GiftExchangeSchema giftExchangeSchema2 = giftExchangeSchema;
        if (giftExchangeSchema2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("auto_exchange_popup_schema");
        c09dl.LJJJJJ(giftExchangeSchema2.autoExchangePopUpSchema);
        c09dl.LJIILLIIL("tax_popup_schema");
        c09dl.LJJJJJ(giftExchangeSchema2.taxPopUpSchema);
        c09dl.LJIILLIIL("live_wallet_enable_lynx_gift_exchange_popup");
        c09dl.LJJJJJL(giftExchangeSchema2.liveWalletEnableLynxGiftExchangePopup);
        c09dl.LJIILLIIL("gift_exchange_pop_schema");
        c09dl.LJJJJJ(giftExchangeSchema2.giftExchangePopSchema);
        c09dl.LJII();
    }
}
