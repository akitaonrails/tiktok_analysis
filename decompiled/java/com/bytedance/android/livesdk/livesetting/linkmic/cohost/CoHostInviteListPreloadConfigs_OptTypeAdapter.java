package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public final class CoHostInviteListPreloadConfigs_OptTypeAdapter extends TypeAdapter<CoHostInviteListPreloadConfigs> {
    public final Gson LIZ;

    public CoHostInviteListPreloadConfigs_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final CoHostInviteListPreloadConfigs read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        CoHostInviteListPreloadConfigs coHostInviteListPreloadConfigs = new CoHostInviteListPreloadConfigs();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                coHostInviteListPreloadConfigs.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1139086716:
                        if (strLJJJJ.equals("experience_opt_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                coHostInviteListPreloadConfigs.experienceOptEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -326543249:
                        if (strLJJJJ.equals("fetch_when_capsule_show")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                coHostInviteListPreloadConfigs.fetchWhenCapsuleShow = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1194250197:
                        if (strLJJJJ.equals("fetch_valid_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                coHostInviteListPreloadConfigs.fetchValidTime = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1302483298:
                        if (strLJJJJ.equals("rival_section_configs")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                coHostInviteListPreloadConfigs.rivalSectionConfigs = C473040Igo.LIZ(this.LIZ, c09cu, RivalSectionConfig.class);
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
        return coHostInviteListPreloadConfigs;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, CoHostInviteListPreloadConfigs coHostInviteListPreloadConfigs) throws IOException {
        CoHostInviteListPreloadConfigs coHostInviteListPreloadConfigs2 = coHostInviteListPreloadConfigs;
        if (coHostInviteListPreloadConfigs2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(coHostInviteListPreloadConfigs2.enable);
        c09dl.LJIILLIIL("rival_section_configs");
        C473040Igo.LIZLLL(this.LIZ, c09dl, coHostInviteListPreloadConfigs2.rivalSectionConfigs, RivalSectionConfig.class);
        c09dl.LJIILLIIL("experience_opt_enable");
        c09dl.LJJJJJL(coHostInviteListPreloadConfigs2.experienceOptEnable);
        c09dl.LJIILLIIL("fetch_when_capsule_show");
        c09dl.LJJJJJL(coHostInviteListPreloadConfigs2.fetchWhenCapsuleShow);
        c09dl.LJIILLIIL("fetch_valid_time");
        c09dl.LJJIZ(coHostInviteListPreloadConfigs2.fetchValidTime);
        c09dl.LJII();
    }
}
