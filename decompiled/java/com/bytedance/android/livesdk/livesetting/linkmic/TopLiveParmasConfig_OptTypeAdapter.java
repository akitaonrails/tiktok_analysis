package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C1697810uHb;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class TopLiveParmasConfig_OptTypeAdapter extends TypeAdapter<TopLiveParmasConfig> {
    public final Gson LIZ;

    public TopLiveParmasConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final TopLiveParmasConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        TopLiveParmasConfig topLiveParmasConfig = new TopLiveParmasConfig("toplive_mg", "hangout_live_cell", "hangout_live_cell_all", "hangout_join_live", C1697810uHb.LJIIJJI("live_merge_hangout_mg_agg_playlabel_boxbattle", "live_merge_hangout_mg_agg_playlabel_debating", "live_merge_hangout_mg_agg_playlabel_talent_show", "live_merge_hangout_mg_agg_playlabel_random_chat", "live_merge_hangout_mg_agg_playlabel_dating", "live_merge_hangout_live_cell_boxbattle", "live_merge_hangout_live_cell_debating", "live_merge_hangout_live_cell_talent_show", "live_merge_hangout_cover"));
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1541390846:
                        if (strLJJJJ.equals("other_end_at_mg_top_live")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                topLiveParmasConfig.otherEndAtMgTopLive = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1041491584:
                        if (strLJJJJ.equals("join_button_enter_method")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                topLiveParmasConfig.joinButtonEnterMethod = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 250479544:
                        if (strLJJJJ.equals("top_live_page_enter_from")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                topLiveParmasConfig.topLivePageEnterFrom = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 931164869:
                        if (strLJJJJ.equals("feed_card_enter_method_v2")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                topLiveParmasConfig.feedCardEnterMethodV2 = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2134323350:
                        if (strLJJJJ.equals("feed_card_enter_method")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                topLiveParmasConfig.feedCardEnterMethod = c09cu.LJJJZ();
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
        return topLiveParmasConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TopLiveParmasConfig topLiveParmasConfig) {
        TopLiveParmasConfig topLiveParmasConfig2 = topLiveParmasConfig;
        if (topLiveParmasConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("top_live_page_enter_from");
        c09dl.LJJJJJ(topLiveParmasConfig2.topLivePageEnterFrom);
        c09dl.LJIILLIIL("feed_card_enter_method");
        c09dl.LJJJJJ(topLiveParmasConfig2.feedCardEnterMethod);
        c09dl.LJIILLIIL("feed_card_enter_method_v2");
        c09dl.LJJJJJ(topLiveParmasConfig2.feedCardEnterMethodV2);
        c09dl.LJIILLIIL("join_button_enter_method");
        c09dl.LJJJJJ(topLiveParmasConfig2.joinButtonEnterMethod);
        c09dl.LJIILLIIL("other_end_at_mg_top_live");
        C473040Igo.LIZLLL(this.LIZ, c09dl, topLiveParmasConfig2.otherEndAtMgTopLive, String.class);
        c09dl.LJII();
    }
}
