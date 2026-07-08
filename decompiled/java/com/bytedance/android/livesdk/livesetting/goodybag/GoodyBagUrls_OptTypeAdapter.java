package com.bytedance.android.livesdk.livesetting.goodybag;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class GoodyBagUrls_OptTypeAdapter extends TypeAdapter<GoodyBagUrls> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final GoodyBagUrls read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        GoodyBagUrls goodyBagUrls = new GoodyBagUrls();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case 51727198:
                        if (strLJJJJ.equals("goody_bag_short_touch_schema")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                goodyBagUrls.shortTouch = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 197352132:
                        if (strLJJJJ.equals("goody_bag_faq_schema")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                goodyBagUrls.goodyBagFaqSchema = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 286203294:
                        if (strLJJJJ.equals("goody_bag_send_schema")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                goodyBagUrls.sendUrl = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 339550077:
                        if (strLJJJJ.equals("goody_bag_open_schema_for_audience")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                goodyBagUrls.openAudienceSchema = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 436677546:
                        if (strLJJJJ.equals("goody_bag_waiting_open_schema")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                goodyBagUrls.waitingOpenSchema = c09cu.LJJJZ();
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
        return goodyBagUrls;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GoodyBagUrls goodyBagUrls) {
        GoodyBagUrls goodyBagUrls2 = goodyBagUrls;
        if (goodyBagUrls2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("goody_bag_send_schema");
        c09dl.LJJJJJ(goodyBagUrls2.sendUrl);
        c09dl.LJIILLIIL("goody_bag_short_touch_schema");
        c09dl.LJJJJJ(goodyBagUrls2.shortTouch);
        c09dl.LJIILLIIL("goody_bag_waiting_open_schema");
        c09dl.LJJJJJ(goodyBagUrls2.waitingOpenSchema);
        c09dl.LJIILLIIL("goody_bag_open_schema_for_audience");
        c09dl.LJJJJJ(goodyBagUrls2.openAudienceSchema);
        c09dl.LJIILLIIL("goody_bag_faq_schema");
        c09dl.LJJJJJ(goodyBagUrls2.goodyBagFaqSchema);
        c09dl.LJII();
    }
}
