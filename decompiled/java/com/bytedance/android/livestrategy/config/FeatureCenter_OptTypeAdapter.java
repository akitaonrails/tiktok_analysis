package com.bytedance.android.livestrategy.config;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class FeatureCenter_OptTypeAdapter extends TypeAdapter<FeatureCenter> {
    public final Gson LIZ;

    public FeatureCenter_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final FeatureCenter read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        FeatureCenter featureCenter = new FeatureCenter(null, null, null, null, 15, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1776627643:
                        if (strLJJJJ.equals("pitayaNativeBusiness")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                featureCenter.pitayaNativeBusiness = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1449124854:
                        if (strLJJJJ.equals("pitayaPythonBusiness")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                featureCenter.pitayaPythonBusiness = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 596232893:
                        if (strLJJJJ.equals("portraitConfig")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                featureCenter.portraitConfig = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2122037677:
                        if (strLJJJJ.equals("pspBusiness")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                featureCenter.pspBusiness = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
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
        return featureCenter;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FeatureCenter featureCenter) {
        FeatureCenter featureCenter2 = featureCenter;
        if (featureCenter2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("pitayaPythonBusiness");
        C473040Igo.LIZLLL(this.LIZ, c09dl, featureCenter2.pitayaPythonBusiness, String.class);
        c09dl.LJIILLIIL("pitayaNativeBusiness");
        C473040Igo.LIZLLL(this.LIZ, c09dl, featureCenter2.pitayaNativeBusiness, String.class);
        c09dl.LJIILLIIL("pspBusiness");
        C473040Igo.LIZLLL(this.LIZ, c09dl, featureCenter2.pspBusiness, String.class);
        c09dl.LJIILLIIL("portraitConfig");
        C473040Igo.LIZLLL(this.LIZ, c09dl, featureCenter2.portraitConfig, String.class);
        c09dl.LJII();
    }
}
