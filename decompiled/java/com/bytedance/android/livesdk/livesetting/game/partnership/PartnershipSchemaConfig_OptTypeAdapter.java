package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class PartnershipSchemaConfig_OptTypeAdapter extends TypeAdapter<PartnershipSchemaConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final PartnershipSchemaConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        PartnershipSchemaConfig partnershipSchemaConfig = new PartnershipSchemaConfig("", "", "", "", "", "", "", "", "", "", "");
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2126089543:
                        if (strLJJJJ.equals("roma_schema_page_promote_introduction")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                partnershipSchemaConfig.promoteIntroduction = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -2092084086:
                        if (strLJJJJ.equals("roma_schema_page_event_qualification")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                partnershipSchemaConfig.eventQualification = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1998020754:
                        if (strLJJJJ.equals("roma_schema_page_drop_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                partnershipSchemaConfig.pageDropList = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1806796413:
                        if (strLJJJJ.equals("roma_schema_page_intro_card")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                partnershipSchemaConfig.pageIntroCard = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1210813830:
                        if (strLJJJJ.equals("roma_schema_page_current_promote")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                partnershipSchemaConfig.currentPromote = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1140258252:
                        if (strLJJJJ.equals("roma_schema_page_promote_center")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                partnershipSchemaConfig.promoteCenter = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -537146265:
                        if (strLJJJJ.equals("roma_schema_page_promote_center_v2")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                partnershipSchemaConfig.pagePromoteCenterV2 = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -210970051:
                        if (strLJJJJ.equals("roma_schema_page_promote_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                partnershipSchemaConfig.promoteList = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 37668753:
                        if (strLJJJJ.equals("roma_schema_page_user_game_detail_v2")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                partnershipSchemaConfig.userGameDetail = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 904523594:
                        if (strLJJJJ.equals("roma_schema_page_user_game_detail")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                partnershipSchemaConfig.userGameDetailLandscape = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2075604577:
                        if (strLJJJJ.equals("roma_schema_page_current_promote_v2")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                partnershipSchemaConfig.currentPromoteV2 = c09cu.LJJJZ();
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
        return partnershipSchemaConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, PartnershipSchemaConfig partnershipSchemaConfig) {
        PartnershipSchemaConfig partnershipSchemaConfig2 = partnershipSchemaConfig;
        if (partnershipSchemaConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("roma_schema_page_intro_card");
        c09dl.LJJJJJ(partnershipSchemaConfig2.pageIntroCard);
        c09dl.LJIILLIIL("roma_schema_page_promote_list");
        c09dl.LJJJJJ(partnershipSchemaConfig2.promoteList);
        c09dl.LJIILLIIL("roma_schema_page_promote_introduction");
        c09dl.LJJJJJ(partnershipSchemaConfig2.promoteIntroduction);
        c09dl.LJIILLIIL("roma_schema_page_promote_center");
        c09dl.LJJJJJ(partnershipSchemaConfig2.promoteCenter);
        c09dl.LJIILLIIL("roma_schema_page_current_promote");
        c09dl.LJJJJJ(partnershipSchemaConfig2.currentPromote);
        c09dl.LJIILLIIL("roma_schema_page_event_qualification");
        c09dl.LJJJJJ(partnershipSchemaConfig2.eventQualification);
        c09dl.LJIILLIIL("roma_schema_page_drop_list");
        c09dl.LJJJJJ(partnershipSchemaConfig2.pageDropList);
        c09dl.LJIILLIIL("roma_schema_page_user_game_detail");
        c09dl.LJJJJJ(partnershipSchemaConfig2.userGameDetailLandscape);
        c09dl.LJIILLIIL("roma_schema_page_user_game_detail_v2");
        c09dl.LJJJJJ(partnershipSchemaConfig2.userGameDetail);
        c09dl.LJIILLIIL("roma_schema_page_promote_center_v2");
        c09dl.LJJJJJ(partnershipSchemaConfig2.pagePromoteCenterV2);
        c09dl.LJIILLIIL("roma_schema_page_current_promote_v2");
        c09dl.LJJJJJ(partnershipSchemaConfig2.currentPromoteV2);
        c09dl.LJII();
    }
}
