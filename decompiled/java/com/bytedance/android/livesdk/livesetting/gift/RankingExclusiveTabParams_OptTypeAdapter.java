package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class RankingExclusiveTabParams_OptTypeAdapter extends TypeAdapter<RankingExclusiveTabParams> {
    public final Gson LIZ;

    public RankingExclusiveTabParams_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final RankingExclusiveTabParams read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        RankingExclusiveTabParams rankingExclusiveTabParams = new RankingExclusiveTabParams(false, 3L, 3L, 3L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1849401521:
                        if (strLJJJJ.equals("max_anim_entry_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                rankingExclusiveTabParams.maxAnimEntryCount = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1382476084:
                        if (strLJJJJ.equals("banner_transition_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                rankingExclusiveTabParams.bannerTransitionDelay = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 181542793:
                        if (strLJJJJ.equals("toast_display_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                rankingExclusiveTabParams.toastDisplayDuration = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 444223681:
                        if (strLJJJJ.equals("enable_sectioned_layout")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                rankingExclusiveTabParams.enabled = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return rankingExclusiveTabParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, RankingExclusiveTabParams rankingExclusiveTabParams) throws IOException {
        RankingExclusiveTabParams rankingExclusiveTabParams2 = rankingExclusiveTabParams;
        if (rankingExclusiveTabParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_sectioned_layout");
        c09dl.LJJJJJL(rankingExclusiveTabParams2.enabled);
        c09dl.LJIILLIIL("max_anim_entry_count");
        c09dl.LJJIZ(rankingExclusiveTabParams2.maxAnimEntryCount);
        c09dl.LJIILLIIL("toast_display_duration");
        c09dl.LJJIZ(rankingExclusiveTabParams2.toastDisplayDuration);
        c09dl.LJIILLIIL("banner_transition_delay");
        c09dl.LJJIZ(rankingExclusiveTabParams2.bannerTransitionDelay);
        c09dl.LJII();
    }
}
