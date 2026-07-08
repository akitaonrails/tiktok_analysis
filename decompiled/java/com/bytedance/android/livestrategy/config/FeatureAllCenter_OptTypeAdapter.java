package com.bytedance.android.livestrategy.config;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C2097608Jq;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class FeatureAllCenter_OptTypeAdapter extends TypeAdapter<FeatureAllCenter> {
    public final Gson LIZ;

    public FeatureAllCenter_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final FeatureAllCenter read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        FeatureAllCenter featureAllCenter = new FeatureAllCenter(C2097608Jq.LJ(), C2097608Jq.LJ(), C2097608Jq.LJ(), C2097608Jq.LJ());
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1776627643:
                        if (strLJJJJ.equals("pitayaNativeBusiness")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                featureAllCenter.pitayaNativeBusiness = C473040Igo.LIZIZ(this.LIZ, c09cu, Object.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1449124854:
                        if (strLJJJJ.equals("pitayaPythonBusiness")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                featureAllCenter.pitayaPythonBusiness = C473040Igo.LIZIZ(this.LIZ, c09cu, Object.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 596232893:
                        if (strLJJJJ.equals("portraitConfig")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                featureAllCenter.portraitConfig = C473040Igo.LIZIZ(this.LIZ, c09cu, Object.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2122037677:
                        if (strLJJJJ.equals("pspBusiness")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                featureAllCenter.pspBusiness = C473040Igo.LIZIZ(this.LIZ, c09cu, Object.class);
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
        return featureAllCenter;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FeatureAllCenter featureAllCenter) {
        FeatureAllCenter featureAllCenter2 = featureAllCenter;
        if (featureAllCenter2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("pitayaPythonBusiness");
        C473040Igo.LJ(this.LIZ, c09dl, featureAllCenter2.pitayaPythonBusiness, Object.class);
        c09dl.LJIILLIIL("pitayaNativeBusiness");
        C473040Igo.LJ(this.LIZ, c09dl, featureAllCenter2.pitayaNativeBusiness, Object.class);
        c09dl.LJIILLIIL("pspBusiness");
        C473040Igo.LJ(this.LIZ, c09dl, featureAllCenter2.pspBusiness, Object.class);
        c09dl.LJIILLIIL("portraitConfig");
        C473040Igo.LJ(this.LIZ, c09dl, featureAllCenter2.portraitConfig, Object.class);
        c09dl.LJII();
    }
}
