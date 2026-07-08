package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.rank.LiveCreatorLeagueMatchCampaignRankingSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveCreatorLeagueMatchCampaignRankingSetting_Config_OptTypeAdapter extends TypeAdapter<LiveCreatorLeagueMatchCampaignRankingSetting.Config> {
    public final Gson LIZ;

    public LiveCreatorLeagueMatchCampaignRankingSetting_Config_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveCreatorLeagueMatchCampaignRankingSetting.Config read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveCreatorLeagueMatchCampaignRankingSetting.Config config = new LiveCreatorLeagueMatchCampaignRankingSetting.Config(true, true, true, true, true, true);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -931373318:
                        if (strLJJJJ.equals("creator_ranking_page_creator_labels_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.creatorRankingPageCreatorLabelsOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -504687351:
                        if (strLJJJJ.equals("creator_ranking_page_banner_icon_loading_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.creatorRankingPageBannerIconLoadingOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -276745279:
                        if (strLJJJJ.equals("campaign_banner_update_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.campaignBannerUpdateOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -24055581:
                        if (strLJJJJ.equals("campaign_banner_init_data_handling_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.campaignBannerInitDataHandlingOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 16037008:
                        if (strLJJJJ.equals("creator_ranking_page_banner_layout_adaption_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.creatorRankingPageBannerLayoutAdaptionOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 708117845:
                        if (strLJJJJ.equals("creator_ranking_page_first_tab_style_adaption_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.creatorRankingPageFirstTabStyleAdaptionOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
    public final void write(C09DL c09dl, LiveCreatorLeagueMatchCampaignRankingSetting.Config config) throws IOException {
        LiveCreatorLeagueMatchCampaignRankingSetting.Config config2 = config;
        if (config2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("creator_ranking_page_first_tab_style_adaption_opt");
        c09dl.LJJJJJL(config2.creatorRankingPageFirstTabStyleAdaptionOpt);
        c09dl.LJIILLIIL("creator_ranking_page_banner_icon_loading_opt");
        c09dl.LJJJJJL(config2.creatorRankingPageBannerIconLoadingOpt);
        c09dl.LJIILLIIL("creator_ranking_page_banner_layout_adaption_opt");
        c09dl.LJJJJJL(config2.creatorRankingPageBannerLayoutAdaptionOpt);
        c09dl.LJIILLIIL("campaign_banner_update_opt");
        c09dl.LJJJJJL(config2.campaignBannerUpdateOpt);
        c09dl.LJIILLIIL("campaign_banner_init_data_handling_opt");
        c09dl.LJJJJJL(config2.campaignBannerInitDataHandlingOpt);
        c09dl.LJIILLIIL("creator_ranking_page_creator_labels_opt");
        c09dl.LJJJJJL(config2.creatorRankingPageCreatorLabelsOpt);
        c09dl.LJII();
    }
}
