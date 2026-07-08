package com.ss.android.ugc.aweme.im.strategy.storage.adapters;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.LightInteractionEntryConf;

/* JADX INFO: loaded from: classes15.dex */
public final class LightInteractionEntryConfTypeAdapter extends TypeAdapter<LightInteractionEntryConf> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LightInteractionEntryConf read(C09CU c09cu) {
        c09cu.LIZIZ();
        String strLJJJZ = null;
        String strLJJJZ2 = null;
        String strLJJJZ3 = null;
        String strLJJJZ4 = null;
        String strLJJJZ5 = null;
        String strLJJJZ6 = null;
        String strLJJJZ7 = null;
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -737588055:
                        if (strLJJJJ.equals("icon_url")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ2 = c09cu.LJJJZ();
                            }
                        }
                        break;
                    case 3556653:
                        if (strLJJJJ.equals("text")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ5 = c09cu.LJJJZ();
                            }
                        }
                        break;
                    case 17328488:
                        if (strLJJJJ.equals("config_name")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ = c09cu.LJJJZ();
                            }
                        }
                        break;
                    case 119785231:
                        if (strLJJJJ.equals("inbox_preview")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ7 = c09cu.LJJJZ();
                            }
                        }
                        break;
                    case 1148320220:
                        if (strLJJJJ.equals("light_mode_url")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ3 = c09cu.LJJJZ();
                            }
                        }
                        break;
                    case 1585572732:
                        if (strLJJJJ.equals("dark_mode_url")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ4 = c09cu.LJJJZ();
                            }
                        }
                        break;
                    case 1590386840:
                        if (strLJJJJ.equals("interaction_name")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ6 = c09cu.LJJJZ();
                            }
                        }
                        break;
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        LightInteractionEntryConf lightInteractionEntryConf = new LightInteractionEntryConf(strLJJJZ2, strLJJJZ3, strLJJJZ4, strLJJJZ5, strLJJJZ6, strLJJJZ7);
        lightInteractionEntryConf.setConfigName(strLJJJZ);
        return lightInteractionEntryConf;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LightInteractionEntryConf lightInteractionEntryConf) {
        LightInteractionEntryConf lightInteractionEntryConf2 = lightInteractionEntryConf;
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("config_name");
        c09dl.LJJJJJ(lightInteractionEntryConf2.getConfigName());
        c09dl.LJIILLIIL("icon_url");
        c09dl.LJJJJJ(lightInteractionEntryConf2.getIconUrl());
        c09dl.LJIILLIIL("light_mode_url");
        c09dl.LJJJJJ(lightInteractionEntryConf2.getLightModeUrl());
        c09dl.LJIILLIIL("dark_mode_url");
        c09dl.LJJJJJ(lightInteractionEntryConf2.getDarkModeUrl());
        c09dl.LJIILLIIL("text");
        c09dl.LJJJJJ(lightInteractionEntryConf2.getText());
        c09dl.LJIILLIIL("interaction_name");
        c09dl.LJJJJJ(lightInteractionEntryConf2.getInteractionName());
        c09dl.LJIILLIIL("inbox_preview");
        c09dl.LJJJJJ(lightInteractionEntryConf2.getInboxPreview());
        c09dl.LJII();
    }
}
