package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C1697810uHb;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostWithGuestBorderViewSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public final class CohostWithGuestBorderViewSetting_Configs_OptTypeAdapter extends TypeAdapter<CohostWithGuestBorderViewSetting.Configs> {
    public final Gson LIZ;

    public CohostWithGuestBorderViewSetting_Configs_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final CohostWithGuestBorderViewSetting.Configs read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        CohostWithGuestBorderViewSetting.Configs configs = new CohostWithGuestBorderViewSetting.Configs(false, true, 2.0f, 1.5f, 0.0f, C1697810uHb.LJIIJJI(1, 3), true);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2126719139:
                        if (strLJJJJ.equals("rtl_enable_role")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                configs.rtlEnableRoles = C473040Igo.LIZ(this.LIZ, c09cu, Integer.TYPE);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1850253364:
                        if (strLJJJJ.equals("stroke_width_dp")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                configs.strokeWidthDp = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -369756782:
                        if (strLJJJJ.equals("remove_without_post")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                configs.removeWithoutPost = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
                    case 759836763:
                        if (strLJJJJ.equals("extra_size_dp")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                configs.extraSizeDp = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1770100588:
                        if (strLJJJJ.equals("is_anchor_enabled")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                configs.isAnchorEnabled = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2122377790:
                        if (strLJJJJ.equals("corner_radius_extra_dp")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                configs.cornerRadiusExtraDp = (float) c09cu.LJJIL();
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
    public final void write(C09DL c09dl, CohostWithGuestBorderViewSetting.Configs configs) throws IOException {
        CohostWithGuestBorderViewSetting.Configs configs2 = configs;
        if (configs2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("is_enabled");
        c09dl.LJJJJJL(configs2.isEnabled);
        c09dl.LJIILLIIL("is_anchor_enabled");
        c09dl.LJJJJJL(configs2.isAnchorEnabled);
        c09dl.LJIILLIIL("extra_size_dp");
        c09dl.LJJJJ(Float.valueOf(configs2.extraSizeDp));
        c09dl.LJIILLIIL("stroke_width_dp");
        c09dl.LJJJJ(Float.valueOf(configs2.strokeWidthDp));
        c09dl.LJIILLIIL("corner_radius_extra_dp");
        c09dl.LJJJJ(Float.valueOf(configs2.cornerRadiusExtraDp));
        c09dl.LJIILLIIL("rtl_enable_role");
        C473040Igo.LIZLLL(this.LIZ, c09dl, configs2.rtlEnableRoles, Integer.TYPE);
        c09dl.LJIILLIIL("remove_without_post");
        c09dl.LJJJJJL(configs2.removeWithoutPost);
        c09dl.LJII();
    }
}
