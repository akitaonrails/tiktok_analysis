package com.bytedance.android.livesdk.workaround;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C1697810uHb;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes36.dex */
public final class Options_OptTypeAdapter extends TypeAdapter<Options> {
    public final Gson LIZ;

    public Options_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final Options read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        Options options = new Options(false, false, false, false, false, false, false, C1697810uHb.LJIIJJI("sm-j260m", "sm-j260f", "sm-a260f", "sm-g570m", "sm-a260g", "sm-g950f", "cph 1901"), C1697810uHb.LJIIJJI("rmx3231", "sm-j400f", "tecno bd4", "nokia c01 plus", "sm-j400m", "zte blade a31 plus", "sm-a032f", "sm-a032m", "i85", "blu g52l", "sky elite n55max", "noolah_mobile p11", "sm-j410g", "sm-j410f", "sm-j260mu", "moto e5 play", "sm-j260m", "samsung-sm-j327a", "sm-j327w", "tfy-lx2", "cma-lx2", "tfy-lx3", "cma-lx3", "hey-w09", "any-lx3", "tfy-lx1", "redmi 8a", "redmi 7a", "redmi 8a dual", "lm-k200"));
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1392036013:
                        if (strLJJJJ.equals("hardware_block_models")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                options.hardwareBlockModels = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1148453277:
                        if (strLJJJJ.equals("enable_preview_card")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                options.optEnablePreviewPositionChange = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -902400149:
                        if (strLJJJJ.equals("further_position_change")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                options.optFurtherPositionChange = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -356100148:
                        if (strLJJJJ.equals("remove_trans_logic")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                options.removeTransLogic = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -182341896:
                        if (strLJJJJ.equals("other_plan")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                options.optOtherPlan = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 88371590:
                        if (strLJJJJ.equals("enable_view_root_surface_judge")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                options.enableViewRootJudge = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1571791017:
                        if (strLJJJJ.equals("surfaceview_block_models")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                options.surfaceviewBlockModels = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1918273414:
                        if (strLJJJJ.equals("position_change")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                options.optPositionChange = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1941746047:
                        if (strLJJJJ.equals("enable_live_inner")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                options.optEnablePositionChange = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return options;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, Options options) throws IOException {
        Options options2 = options;
        if (options2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("position_change");
        c09dl.LJJJJJL(options2.optPositionChange);
        c09dl.LJIILLIIL("further_position_change");
        c09dl.LJJJJJL(options2.optFurtherPositionChange);
        c09dl.LJIILLIIL("other_plan");
        c09dl.LJJJJJL(options2.optOtherPlan);
        c09dl.LJIILLIIL("enable_live_inner");
        c09dl.LJJJJJL(options2.optEnablePositionChange);
        c09dl.LJIILLIIL("enable_preview_card");
        c09dl.LJJJJJL(options2.optEnablePreviewPositionChange);
        c09dl.LJIILLIIL("remove_trans_logic");
        c09dl.LJJJJJL(options2.removeTransLogic);
        c09dl.LJIILLIIL("enable_view_root_surface_judge");
        c09dl.LJJJJJL(options2.enableViewRootJudge);
        c09dl.LJIILLIIL("hardware_block_models");
        C473040Igo.LIZLLL(this.LIZ, c09dl, options2.hardwareBlockModels, String.class);
        c09dl.LJIILLIIL("surfaceview_block_models");
        C473040Igo.LIZLLL(this.LIZ, c09dl, options2.surfaceviewBlockModels, String.class);
        c09dl.LJII();
    }
}
