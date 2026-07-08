package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class BgGovernorStagesConfig_OptTypeAdapter extends TypeAdapter<BgGovernorStagesConfig> {
    public final Gson LIZ;

    public BgGovernorStagesConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final BgGovernorStagesConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        BgGovernorStagesConfig bgGovernorStagesConfig = new BgGovernorStagesConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2024701067:
                        if (strLJJJJ.equals("MEDIUM")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                bgGovernorStagesConfig.setMedium((BgGovernorStageOption) this.LIZ.LJIIJ(BgGovernorStageOption.class).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1560189025:
                        if (strLJJJJ.equals("CRITICAL")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                bgGovernorStagesConfig.setCritical((BgGovernorStageOption) this.LIZ.LJIIJ(BgGovernorStageOption.class).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -383989871:
                        if (strLJJJJ.equals("IMMEDIATE")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                bgGovernorStagesConfig.setImmediate((BgGovernorStageOption) this.LIZ.LJIIJ(BgGovernorStageOption.class).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2342524:
                        if (strLJJJJ.equals("LONG")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                bgGovernorStagesConfig.setLong((BgGovernorStageOption) this.LIZ.LJIIJ(BgGovernorStageOption.class).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 78875740:
                        if (strLJJJJ.equals("SHORT")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                bgGovernorStagesConfig.setShort((BgGovernorStageOption) this.LIZ.LJIIJ(BgGovernorStageOption.class).read(c09cu));
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
        return bgGovernorStagesConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, BgGovernorStagesConfig bgGovernorStagesConfig) {
        BgGovernorStagesConfig bgGovernorStagesConfig2 = bgGovernorStagesConfig;
        if (bgGovernorStagesConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("IMMEDIATE");
        TypeAdapter typeAdapterLJIIJ = this.LIZ.LJIIJ(BgGovernorStageOption.class);
        typeAdapterLJIIJ.write(c09dl, bgGovernorStagesConfig2.getImmediate());
        c09dl.LJIILLIIL("SHORT");
        typeAdapterLJIIJ.write(c09dl, bgGovernorStagesConfig2.getShort());
        c09dl.LJIILLIIL("MEDIUM");
        typeAdapterLJIIJ.write(c09dl, bgGovernorStagesConfig2.getMedium());
        c09dl.LJIILLIIL("LONG");
        typeAdapterLJIIJ.write(c09dl, bgGovernorStagesConfig2.getLong());
        c09dl.LJIILLIIL("CRITICAL");
        typeAdapterLJIIJ.write(c09dl, bgGovernorStagesConfig2.getCritical());
        c09dl.LJII();
    }
}
