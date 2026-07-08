package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.InteractionSourceTypeTrackingSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes36.dex */
public final class InteractionSourceTypeTrackingSetting_Configs_OptTypeAdapter extends TypeAdapter<InteractionSourceTypeTrackingSetting.Configs> {
    public final Gson LIZ;

    public InteractionSourceTypeTrackingSetting_Configs_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final InteractionSourceTypeTrackingSetting.Configs read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        InteractionSourceTypeTrackingSetting.Configs configs = new InteractionSourceTypeTrackingSetting.Configs(false, null, null, null, null, null, 63, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1567241681:
                        if (strLJJJJ.equals("source_type_string_map")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                configs.sourceTypeStringMap = C473040Igo.LIZIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1419969708:
                        if (strLJJJJ.equals("source_type_to_enter_from")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                configs.sourceTypeToEnterFromMap = C473040Igo.LIZIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -432769351:
                        if (strLJJJJ.equals("auto_match_entrance_to_source_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                configs.autoMatchEntranceToSourceTypeMap = C473040Igo.LIZIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -109284052:
                        if (strLJJJJ.equals("is_enabled")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                configs.isEnabled = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 40276126:
                        if (strLJJJJ.equals("invitee_list_map")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                configs.sourceTypeToInviteeListMap = C473040Igo.LIZIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1227487661:
                        if (strLJJJJ.equals("quick_pair_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                configs.quickPairType = C473040Igo.LIZIZ(this.LIZ, c09cu, String.class);
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
        return configs;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, InteractionSourceTypeTrackingSetting.Configs configs) throws IOException {
        InteractionSourceTypeTrackingSetting.Configs configs2 = configs;
        if (configs2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("is_enabled");
        c09dl.LJJJJJL(configs2.isEnabled);
        c09dl.LJIILLIIL("invitee_list_map");
        C473040Igo.LJ(this.LIZ, c09dl, configs2.sourceTypeToInviteeListMap, String.class);
        c09dl.LJIILLIIL("source_type_string_map");
        C473040Igo.LJ(this.LIZ, c09dl, configs2.sourceTypeStringMap, String.class);
        c09dl.LJIILLIIL("quick_pair_type");
        C473040Igo.LJ(this.LIZ, c09dl, configs2.quickPairType, String.class);
        c09dl.LJIILLIIL("auto_match_entrance_to_source_type");
        C473040Igo.LJ(this.LIZ, c09dl, configs2.autoMatchEntranceToSourceTypeMap, String.class);
        c09dl.LJIILLIIL("source_type_to_enter_from");
        C473040Igo.LJ(this.LIZ, c09dl, configs2.sourceTypeToEnterFromMap, String.class);
        c09dl.LJII();
    }
}
