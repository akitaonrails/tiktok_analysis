package com.bytedance.android.livestrategy.config;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C2097608Jq;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveFeatureCenterAllConfig_OptTypeAdapter extends TypeAdapter<LiveFeatureCenterAllConfig> {
    public final Gson LIZ;

    public LiveFeatureCenterAllConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveFeatureCenterAllConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveFeatureCenterAllConfig liveFeatureCenterAllConfig = new LiveFeatureCenterAllConfig(new FeatureAllCenter(C2097608Jq.LJ(), C2097608Jq.LJ(), C2097608Jq.LJ(), C2097608Jq.LJ()), new FeatureAllCenter(C2097608Jq.LJ(), C2097608Jq.LJ(), C2097608Jq.LJ(), C2097608Jq.LJ()), new FeatureAllCenter(C2097608Jq.LJ(), C2097608Jq.LJ(), C2097608Jq.LJ(), C2097608Jq.LJ()), new FeatureAllCenter(C2097608Jq.LJ(), C2097608Jq.LJ(), C2097608Jq.LJ(), C2097608Jq.LJ()));
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1038357759:
                        if (strLJJJJ.equals("liveSessionFeatureCenter")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFeatureCenterAllConfig.liveSessionFeatureCenter = (FeatureAllCenter) this.LIZ.LJIIJ(FeatureAllCenter.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 730649156:
                        if (strLJJJJ.equals("liveRoomFeatureCenter")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFeatureCenterAllConfig.liveRoomFeatureCenter = (FeatureAllCenter) this.LIZ.LJIIJ(FeatureAllCenter.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1386124874:
                        if (strLJJJJ.equals("appFeatureCenter")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFeatureCenterAllConfig.appFeatureCenter = (FeatureAllCenter) this.LIZ.LJIIJ(FeatureAllCenter.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1933546922:
                        if (strLJJJJ.equals("liveAnchorFeatureCenter")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFeatureCenterAllConfig.liveAnchorFeatureCenter = (FeatureAllCenter) this.LIZ.LJIIJ(FeatureAllCenter.class).read(c09cu);
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
        return liveFeatureCenterAllConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveFeatureCenterAllConfig liveFeatureCenterAllConfig) {
        LiveFeatureCenterAllConfig liveFeatureCenterAllConfig2 = liveFeatureCenterAllConfig;
        if (liveFeatureCenterAllConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("appFeatureCenter");
        TypeAdapter typeAdapterLJIIJ = this.LIZ.LJIIJ(FeatureAllCenter.class);
        typeAdapterLJIIJ.write(c09dl, liveFeatureCenterAllConfig2.appFeatureCenter);
        c09dl.LJIILLIIL("liveSessionFeatureCenter");
        typeAdapterLJIIJ.write(c09dl, liveFeatureCenterAllConfig2.liveSessionFeatureCenter);
        c09dl.LJIILLIIL("liveRoomFeatureCenter");
        typeAdapterLJIIJ.write(c09dl, liveFeatureCenterAllConfig2.liveRoomFeatureCenter);
        c09dl.LJIILLIIL("liveAnchorFeatureCenter");
        typeAdapterLJIIJ.write(c09dl, liveFeatureCenterAllConfig2.liveAnchorFeatureCenter);
        c09dl.LJII();
    }
}
