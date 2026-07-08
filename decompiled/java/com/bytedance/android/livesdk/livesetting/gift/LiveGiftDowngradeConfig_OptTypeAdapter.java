package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveGiftDowngradeConfig_OptTypeAdapter extends TypeAdapter<LiveGiftDowngradeConfig> {
    public final Gson LIZ;

    public LiveGiftDowngradeConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveGiftDowngradeConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveGiftDowngradeConfig liveGiftDowngradeConfig = new LiveGiftDowngradeConfig(null, null, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1077756671) {
                    if (iHashCode != 101609) {
                        if (iHashCode == 1040573901 && strLJJJJ.equals("overload_score")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftDowngradeConfig.overloadScoreConfig = (DowngradeDimensionConfig) this.LIZ.LJIIJ(DowngradeDimensionConfig.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("fps")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            liveGiftDowngradeConfig.fpsConfig = (DowngradeDimensionConfig) this.LIZ.LJIIJ(DowngradeDimensionConfig.class).read(c09cu);
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("memory")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveGiftDowngradeConfig.memoryConfig = (DowngradeDimensionConfig) this.LIZ.LJIIJ(DowngradeDimensionConfig.class).read(c09cu);
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return liveGiftDowngradeConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveGiftDowngradeConfig liveGiftDowngradeConfig) {
        LiveGiftDowngradeConfig liveGiftDowngradeConfig2 = liveGiftDowngradeConfig;
        if (liveGiftDowngradeConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("fps");
        TypeAdapter typeAdapterLJIIJ = this.LIZ.LJIIJ(DowngradeDimensionConfig.class);
        typeAdapterLJIIJ.write(c09dl, liveGiftDowngradeConfig2.fpsConfig);
        c09dl.LJIILLIIL("memory");
        typeAdapterLJIIJ.write(c09dl, liveGiftDowngradeConfig2.memoryConfig);
        c09dl.LJIILLIIL("overload_score");
        typeAdapterLJIIJ.write(c09dl, liveGiftDowngradeConfig2.overloadScoreConfig);
        c09dl.LJII();
    }
}
