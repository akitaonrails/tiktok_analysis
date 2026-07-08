package com.bytedance.android.livesdk.livesetting.clientai;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes35.dex */
public final class Config_OptTypeAdapter extends TypeAdapter<Config> {
    public final Gson LIZ;

    public Config_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final Config read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        Config config = new Config(0, null, 0, null, null, null, 63, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1343047742:
                        if (strLJJJJ.equals("delay_download_pkgs")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.delayDownloadPkgs = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.enable = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -489773823:
                        if (strLJJJJ.equals("im_msg_enable_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.imMsgEnableList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 46605331:
                        if (strLJJJJ.equals("guide_trigger_business_names")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.guideTriggerBusinessNames = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 522023324:
                        if (strLJJJJ.equals("cep_package_coverage_report_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.cepPkgCoverageReportList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1610118343:
                        if (strLJJJJ.equals("algo_package_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.algoPackageConfigMap = C473040Igo.LIZIZ(this.LIZ, c09cu, AlgoPkgConfig.class);
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
        return config;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, Config config) {
        Config config2 = config;
        if (config2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJ(Integer.valueOf(config2.enable));
        c09dl.LJIILLIIL("im_msg_enable_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, config2.imMsgEnableList, String.class);
        c09dl.LJIILLIIL("delay_download_pkgs");
        c09dl.LJJJJ(Integer.valueOf(config2.delayDownloadPkgs));
        c09dl.LJIILLIIL("guide_trigger_business_names");
        C473040Igo.LIZLLL(this.LIZ, c09dl, config2.guideTriggerBusinessNames, String.class);
        c09dl.LJIILLIIL("algo_package_config");
        C473040Igo.LJ(this.LIZ, c09dl, config2.algoPackageConfigMap, AlgoPkgConfig.class);
        c09dl.LJIILLIIL("cep_package_coverage_report_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, config2.cepPkgCoverageReportList, String.class);
        c09dl.LJII();
    }
}
