package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class LiveCohostInvitationOverIssuranceConfig_OptTypeAdapter extends TypeAdapter<LiveCohostInvitationOverIssuranceConfig> {
    public final Gson LIZ;

    public LiveCohostInvitationOverIssuranceConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveCohostInvitationOverIssuranceConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveCohostInvitationOverIssuranceConfig liveCohostInvitationOverIssuranceConfig = new LiveCohostInvitationOverIssuranceConfig(0, 3, new int[0]);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1609594047) {
                    if (iHashCode != 964660063) {
                        if (iHashCode == 1886921941 && strLJJJJ.equals("maximum_invitable_mic_slots")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveCohostInvitationOverIssuranceConfig.setMaximumInvitableMicSlots(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("source_type_list")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            liveCohostInvitationOverIssuranceConfig.setSourceTypeList((int[]) this.LIZ.LJIIJ(int[].class).read(c09cu));
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("enabled")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveCohostInvitationOverIssuranceConfig.setEnabled(c09cu.LJJIZ());
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return liveCohostInvitationOverIssuranceConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveCohostInvitationOverIssuranceConfig liveCohostInvitationOverIssuranceConfig) {
        LiveCohostInvitationOverIssuranceConfig liveCohostInvitationOverIssuranceConfig2 = liveCohostInvitationOverIssuranceConfig;
        if (liveCohostInvitationOverIssuranceConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enabled");
        c09dl.LJJJJ(Integer.valueOf(liveCohostInvitationOverIssuranceConfig2.getEnabled()));
        c09dl.LJIILLIIL("maximum_invitable_mic_slots");
        c09dl.LJJJJ(Integer.valueOf(liveCohostInvitationOverIssuranceConfig2.getMaximumInvitableMicSlots()));
        c09dl.LJIILLIIL("source_type_list");
        this.LIZ.LJIIJ(int[].class).write(c09dl, liveCohostInvitationOverIssuranceConfig2.getSourceTypeList());
        c09dl.LJII();
    }
}
