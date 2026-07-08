package com.bytedance.android.livesdk.livesetting.starcomment;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.starcomment.LiveStarCommentSchemaConfig;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes15.dex */
public final class LiveStarCommentSchemaConfig_Config_OptTypeAdapter extends TypeAdapter<LiveStarCommentSchemaConfig.Config> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveStarCommentSchemaConfig.Config read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveStarCommentSchemaConfig.Config config = new LiveStarCommentSchemaConfig.Config("", "", "", "", "");
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2068700286:
                        if (strLJJJJ.equals("star_comment_purchase_page_bubble_faq")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.bubblePageFaq = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -2029968697:
                        if (strLJJJJ.equals("star_comment_history")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.starCommentHistory = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -610645127:
                        if (strLJJJJ.equals("star_comment_anchor_faq")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.starCommentAnchorFaq = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 493071368:
                        if (strLJJJJ.equals("star_comment_audience_faq")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.starCommentAudienceFaq = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 797321143:
                        if (strLJJJJ.equals("anchor_settings_scheme")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.anchor_settings_scheme = c09cu.LJJJZ();
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
        return config;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveStarCommentSchemaConfig.Config config) {
        LiveStarCommentSchemaConfig.Config config2 = config;
        if (config2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("anchor_settings_scheme");
        c09dl.LJJJJJ(config2.anchor_settings_scheme);
        c09dl.LJIILLIIL("star_comment_history");
        c09dl.LJJJJJ(config2.starCommentHistory);
        c09dl.LJIILLIIL("star_comment_anchor_faq");
        c09dl.LJJJJJ(config2.starCommentAnchorFaq);
        c09dl.LJIILLIIL("star_comment_audience_faq");
        c09dl.LJJJJJ(config2.starCommentAudienceFaq);
        c09dl.LJIILLIIL("star_comment_purchase_page_bubble_faq");
        c09dl.LJJJJJ(config2.bubblePageFaq);
        c09dl.LJII();
    }
}
