package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class DropsPageSchemaData_OptTypeAdapter extends TypeAdapter<DropsPageSchemaData> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final DropsPageSchemaData read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        DropsPageSchemaData dropsPageSchemaData = new DropsPageSchemaData("", "", "", "", "", "");
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1820079627:
                        if (strLJJJJ.equals("drops_pin_card")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                dropsPageSchemaData.pageDropsCard = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -796447002:
                        if (strLJJJJ.equals("drops_host_task_panel")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                dropsPageSchemaData.dropsHostTaskPanel = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -700810822:
                        if (strLJJJJ.equals("drops_host_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                dropsPageSchemaData.dropsHostList = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 430256737:
                        if (strLJJJJ.equals("drops_guide")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                dropsPageSchemaData.dropsGuide = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 440873442:
                        if (strLJJJJ.equals("drops_setup")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                dropsPageSchemaData.dropsSetup = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1069016158:
                        if (strLJJJJ.equals("drops_audience_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                dropsPageSchemaData.dropsAudienceList = c09cu.LJJJZ();
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
        return dropsPageSchemaData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, DropsPageSchemaData dropsPageSchemaData) {
        DropsPageSchemaData dropsPageSchemaData2 = dropsPageSchemaData;
        if (dropsPageSchemaData2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("drops_guide");
        c09dl.LJJJJJ(dropsPageSchemaData2.dropsGuide);
        c09dl.LJIILLIIL("drops_audience_list");
        c09dl.LJJJJJ(dropsPageSchemaData2.dropsAudienceList);
        c09dl.LJIILLIIL("drops_host_list");
        c09dl.LJJJJJ(dropsPageSchemaData2.dropsHostList);
        c09dl.LJIILLIIL("drops_host_task_panel");
        c09dl.LJJJJJ(dropsPageSchemaData2.dropsHostTaskPanel);
        c09dl.LJIILLIIL("drops_setup");
        c09dl.LJJJJJ(dropsPageSchemaData2.dropsSetup);
        c09dl.LJIILLIIL("drops_pin_card");
        c09dl.LJJJJJ(dropsPageSchemaData2.pageDropsCard);
        c09dl.LJII();
    }
}
