package com.bytedance.android.livesdk.livesetting.clientai;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class AlgoPkgConfig_OptTypeAdapter extends TypeAdapter<AlgoPkgConfig> {
    public final Gson LIZ;

    public AlgoPkgConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final AlgoPkgConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        AlgoPkgConfig algoPkgConfig = new AlgoPkgConfig(false, false, 1000L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -906392653) {
                    if (iHashCode != 308925828) {
                        if (iHashCode == 640976732 && strLJJJJ.equals("force_download")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                algoPkgConfig.forceDownload = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("trigger_ignore_failure")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            algoPkgConfig.triggerIgnoreFailure = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("exec_timeout")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        algoPkgConfig.execTimeout = c09cu.LJJJ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return algoPkgConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, AlgoPkgConfig algoPkgConfig) throws IOException {
        AlgoPkgConfig algoPkgConfig2 = algoPkgConfig;
        if (algoPkgConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("force_download");
        c09dl.LJJJJJL(algoPkgConfig2.forceDownload);
        c09dl.LJIILLIIL("trigger_ignore_failure");
        c09dl.LJJJJJL(algoPkgConfig2.triggerIgnoreFailure);
        c09dl.LJIILLIIL("exec_timeout");
        c09dl.LJJIZ(algoPkgConfig2.execTimeout);
        c09dl.LJII();
    }
}
