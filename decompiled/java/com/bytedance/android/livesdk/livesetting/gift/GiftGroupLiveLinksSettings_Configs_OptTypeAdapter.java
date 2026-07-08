package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.gift.GiftGroupLiveLinksSettings;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class GiftGroupLiveLinksSettings_Configs_OptTypeAdapter extends TypeAdapter<GiftGroupLiveLinksSettings.Configs> {
    @Override // com.google.gson.TypeAdapter
    public final GiftGroupLiveLinksSettings.Configs read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        GiftGroupLiveLinksSettings.Configs configs = new GiftGroupLiveLinksSettings.Configs("aweme://roma_redirect/?roma_group_key=roma_schema_group_group_live_gift&roma_page_key=roma_schema_page_guide", "aweme://roma_redirect/?roma_group_key=roma_schema_group_group_live_gift&roma_page_key=roma_schema_page_faq", "aweme://roma_redirect/?spark_page=group_live_ranking");
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -789712345) {
                    if (iHashCode != 892689283) {
                        if (iHashCode == 978111542 && strLJJJJ.equals("ranking")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                configs.rankingLink = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("faq_link")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            configs.faqLink = c09cu.LJJJZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("guide_page_link")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        configs.guideLink = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return configs;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GiftGroupLiveLinksSettings.Configs configs) {
        GiftGroupLiveLinksSettings.Configs configs2 = configs;
        if (configs2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("guide_page_link");
        c09dl.LJJJJJ(configs2.guideLink);
        c09dl.LJIILLIIL("faq_link");
        c09dl.LJJJJJ(configs2.faqLink);
        c09dl.LJIILLIIL("ranking");
        c09dl.LJJJJJ(configs2.rankingLink);
        c09dl.LJII();
    }
}
