package com.bytedance.android.livesdk.model;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveRepetitionTtlConfig_OptTypeAdapter extends TypeAdapter<LiveRepetitionTtlConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveRepetitionTtlConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveRepetitionTtlConfig liveRepetitionTtlConfig = new LiveRepetitionTtlConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1704076645:
                        if (strLJJJJ.equals("ttlive_default_ttl")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRepetitionTtlConfig.defaultTtl = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1100213571:
                        if (strLJJJJ.equals("ttlive_foru_card_ttl")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRepetitionTtlConfig.foruCardTtl = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -897399688:
                        if (strLJJJJ.equals("ttlive_drawer_one_ttl")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRepetitionTtlConfig.drawerOneTtl = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -635128953:
                        if (strLJJJJ.equals("enable_live_petition_show")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRepetitionTtlConfig.enableLivePetitionShow = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -487951010:
                        if (strLJJJJ.equals("ttlive_drawer_two_ttl")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRepetitionTtlConfig.drawerTwoTtl = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -181318317:
                        if (strLJJJJ.equals("ttlive_close_page_recommend_ttl")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRepetitionTtlConfig.closePage = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 603195946:
                        if (strLJJJJ.equals("ttlive_live_square_ttl")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRepetitionTtlConfig.liveSquareTtl = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1714498190:
                        if (strLJJJJ.equals("ttlive_live_bottom_tab_ttl")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRepetitionTtlConfig.liveBottomTabTtl = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2087222669:
                        if (strLJJJJ.equals("ttlive_foru_head_ttl")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRepetitionTtlConfig.foruHeadTtl = c09cu.LJJJ();
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
        return liveRepetitionTtlConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveRepetitionTtlConfig liveRepetitionTtlConfig) throws IOException {
        LiveRepetitionTtlConfig liveRepetitionTtlConfig2 = liveRepetitionTtlConfig;
        if (liveRepetitionTtlConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_live_petition_show");
        c09dl.LJJIZ(liveRepetitionTtlConfig2.enableLivePetitionShow);
        c09dl.LJIILLIIL("ttlive_default_ttl");
        c09dl.LJJIZ(liveRepetitionTtlConfig2.defaultTtl);
        c09dl.LJIILLIIL("ttlive_foru_card_ttl");
        c09dl.LJJIZ(liveRepetitionTtlConfig2.foruCardTtl);
        c09dl.LJIILLIIL("ttlive_foru_head_ttl");
        c09dl.LJJIZ(liveRepetitionTtlConfig2.foruHeadTtl);
        c09dl.LJIILLIIL("ttlive_drawer_two_ttl");
        c09dl.LJJIZ(liveRepetitionTtlConfig2.drawerTwoTtl);
        c09dl.LJIILLIIL("ttlive_drawer_one_ttl");
        c09dl.LJJIZ(liveRepetitionTtlConfig2.drawerOneTtl);
        c09dl.LJIILLIIL("ttlive_live_square_ttl");
        c09dl.LJJIZ(liveRepetitionTtlConfig2.liveSquareTtl);
        c09dl.LJIILLIIL("ttlive_close_page_recommend_ttl");
        c09dl.LJJIZ(liveRepetitionTtlConfig2.closePage);
        c09dl.LJIILLIIL("ttlive_live_bottom_tab_ttl");
        c09dl.LJJIZ(liveRepetitionTtlConfig2.liveBottomTabTtl);
        c09dl.LJII();
    }
}
