package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class VolumeMixStreamConfig_OptTypeAdapter extends TypeAdapter<VolumeMixStreamConfig> {
    public final Gson LIZ;

    public VolumeMixStreamConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final VolumeMixStreamConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        VolumeMixStreamConfig volumeMixStreamConfig = new VolumeMixStreamConfig(0.5f, true, 25, true, 1);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1761160480:
                        if (strLJJJJ.equals("isAddVolumeValue")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                volumeMixStreamConfig.addVolume = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 73702629:
                        if (strLJJJJ.equals("seiContentMode")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                volumeMixStreamConfig.seiContentMode = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 491133881:
                        if (strLJJJJ.equals("enableVolumeIndication")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                volumeMixStreamConfig.enableVolumeIndication = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1460529915:
                        if (strLJJJJ.equals("volumeIndicationInterval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                volumeMixStreamConfig.volumeIndicationInterval = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1736365798:
                        if (strLJJJJ.equals("talkVolume")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                volumeMixStreamConfig.talkVolumeThreshold = c09cu.LJJIZ();
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
        return volumeMixStreamConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, VolumeMixStreamConfig volumeMixStreamConfig) throws IOException {
        VolumeMixStreamConfig volumeMixStreamConfig2 = volumeMixStreamConfig;
        if (volumeMixStreamConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("volumeIndicationInterval");
        c09dl.LJJJJ(Float.valueOf(volumeMixStreamConfig2.volumeIndicationInterval));
        c09dl.LJIILLIIL("enableVolumeIndication");
        c09dl.LJJJJJL(volumeMixStreamConfig2.enableVolumeIndication);
        c09dl.LJIILLIIL("talkVolume");
        c09dl.LJJJJ(Integer.valueOf(volumeMixStreamConfig2.talkVolumeThreshold));
        c09dl.LJIILLIIL("isAddVolumeValue");
        c09dl.LJJJJJL(volumeMixStreamConfig2.addVolume);
        c09dl.LJIILLIIL("seiContentMode");
        c09dl.LJJJJ(Integer.valueOf(volumeMixStreamConfig2.seiContentMode));
        c09dl.LJII();
    }
}
