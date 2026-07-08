package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class MultiGuestFeSchemaConfig_OptTypeAdapter extends TypeAdapter<MultiGuestFeSchemaConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final MultiGuestFeSchemaConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MultiGuestFeSchemaConfig multiGuestFeSchemaConfig = new MultiGuestFeSchemaConfig("", "", "", "aweme://roma_redirect/?spark_page=guest_point_panel", "", "", "aweme://roma_redirect/?spark_page=top_guest_ranking_list", "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Fsf-teko-source.tiktokcdn.com%2Fobj%2Ftiktok-teko-internal-sg%2Fmusically%2Ffe%2Flive%2Ftiktok_live_interaction_multi_guest%2Fpages%2Ftext-header-faq%2Ftemplate.js&use_spark=1&bdhm_bid=tiktok_live_mg_guest_text_header_faq&height=70%25&gravity=bottom&radius=12&height_mode=fixed_7&use_live_sheet=1 ", "aweme://roma_redirect/?spark_page=guest_showdown_ranking", "aweme://roma_redirect/?spark_page=guest_showdown_settings", "aweme://roma_redirect/?spark_page=guest_showdown_faq");
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2013208914:
                        if (strLJJJJ.equals("guest_point_panel")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestFeSchemaConfig.guestPointPanel = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1881757745:
                        if (strLJJJJ.equals("playbook_editor")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestFeSchemaConfig.playbookEditor = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1539963904:
                        if (strLJJJJ.equals("guest_overview")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestFeSchemaConfig.guestOverview = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -984969275:
                        if (strLJJJJ.equals("top_guests")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestFeSchemaConfig.topGuestPanel = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -728198986:
                        if (strLJJJJ.equals("text_header_faq")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestFeSchemaConfig.textHeaderFAQ = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -403719011:
                        if (strLJJJJ.equals("guest_showdown_ranking")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestFeSchemaConfig.guestShowdownRanking = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -191501435:
                        if (strLJJJJ.equals("feedback")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestFeSchemaConfig.feedback = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -64815772:
                        if (strLJJJJ.equals("guest_review_panel")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestFeSchemaConfig.guestReviewPanel = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 604110519:
                        if (strLJJJJ.equals("guest_showdown_setting")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestFeSchemaConfig.guestShowdownSetting = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1239511028:
                        if (strLJJJJ.equals("playbook_faq")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestFeSchemaConfig.playbookFAQ = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1241695997:
                        if (strLJJJJ.equals("guest_showdown_faq")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestFeSchemaConfig.guestShowdownFaq = c09cu.LJJJZ();
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
        return multiGuestFeSchemaConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MultiGuestFeSchemaConfig multiGuestFeSchemaConfig) {
        MultiGuestFeSchemaConfig multiGuestFeSchemaConfig2 = multiGuestFeSchemaConfig;
        if (multiGuestFeSchemaConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("feedback");
        c09dl.LJJJJJ(multiGuestFeSchemaConfig2.feedback);
        c09dl.LJIILLIIL("guest_overview");
        c09dl.LJJJJJ(multiGuestFeSchemaConfig2.guestOverview);
        c09dl.LJIILLIIL("guest_review_panel");
        c09dl.LJJJJJ(multiGuestFeSchemaConfig2.guestReviewPanel);
        c09dl.LJIILLIIL("guest_point_panel");
        c09dl.LJJJJJ(multiGuestFeSchemaConfig2.guestPointPanel);
        c09dl.LJIILLIIL("playbook_faq");
        c09dl.LJJJJJ(multiGuestFeSchemaConfig2.playbookFAQ);
        c09dl.LJIILLIIL("playbook_editor");
        c09dl.LJJJJJ(multiGuestFeSchemaConfig2.playbookEditor);
        c09dl.LJIILLIIL("top_guests");
        c09dl.LJJJJJ(multiGuestFeSchemaConfig2.topGuestPanel);
        c09dl.LJIILLIIL("text_header_faq");
        c09dl.LJJJJJ(multiGuestFeSchemaConfig2.textHeaderFAQ);
        c09dl.LJIILLIIL("guest_showdown_ranking");
        c09dl.LJJJJJ(multiGuestFeSchemaConfig2.guestShowdownRanking);
        c09dl.LJIILLIIL("guest_showdown_setting");
        c09dl.LJJJJJ(multiGuestFeSchemaConfig2.guestShowdownSetting);
        c09dl.LJIILLIIL("guest_showdown_faq");
        c09dl.LJJJJJ(multiGuestFeSchemaConfig2.guestShowdownFaq);
        c09dl.LJII();
    }
}
