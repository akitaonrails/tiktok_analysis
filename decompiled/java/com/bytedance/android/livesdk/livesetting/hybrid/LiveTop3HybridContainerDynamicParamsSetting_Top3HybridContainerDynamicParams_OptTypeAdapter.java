package com.bytedance.android.livesdk.livesetting.hybrid;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveTop3HybridContainerDynamicParamsSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveTop3HybridContainerDynamicParamsSetting_Top3HybridContainerDynamicParams_OptTypeAdapter extends TypeAdapter<LiveTop3HybridContainerDynamicParamsSetting.Top3HybridContainerDynamicParams> {
    public final Gson LIZ;

    public LiveTop3HybridContainerDynamicParamsSetting_Top3HybridContainerDynamicParams_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveTop3HybridContainerDynamicParamsSetting.Top3HybridContainerDynamicParams read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveTop3HybridContainerDynamicParamsSetting.Top3HybridContainerDynamicParams top3HybridContainerDynamicParams = new LiveTop3HybridContainerDynamicParamsSetting.Top3HybridContainerDynamicParams(new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap());
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -106115856:
                        if (strLJJJJ.equals("middle_touch_params")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                top3HybridContainerDynamicParams.middleTouchParams = C473040Igo.LIZIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1306517082:
                        if (strLJJJJ.equals("common_params")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                top3HybridContainerDynamicParams.commonParams = C473040Igo.LIZIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1370246649:
                        if (strLJJJJ.equals("banner_params")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                top3HybridContainerDynamicParams.bannerParams = C473040Igo.LIZIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1625510249:
                        if (strLJJJJ.equals("short_touch_params")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                top3HybridContainerDynamicParams.shortTouchParams = C473040Igo.LIZIZ(this.LIZ, c09cu, String.class);
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
        return top3HybridContainerDynamicParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveTop3HybridContainerDynamicParamsSetting.Top3HybridContainerDynamicParams top3HybridContainerDynamicParams) {
        LiveTop3HybridContainerDynamicParamsSetting.Top3HybridContainerDynamicParams top3HybridContainerDynamicParams2 = top3HybridContainerDynamicParams;
        if (top3HybridContainerDynamicParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("common_params");
        C473040Igo.LJ(this.LIZ, c09dl, top3HybridContainerDynamicParams2.commonParams, String.class);
        c09dl.LJIILLIIL("banner_params");
        C473040Igo.LJ(this.LIZ, c09dl, top3HybridContainerDynamicParams2.bannerParams, String.class);
        c09dl.LJIILLIIL("middle_touch_params");
        C473040Igo.LJ(this.LIZ, c09dl, top3HybridContainerDynamicParams2.middleTouchParams, String.class);
        c09dl.LJIILLIIL("short_touch_params");
        C473040Igo.LJ(this.LIZ, c09dl, top3HybridContainerDynamicParams2.shortTouchParams, String.class);
        c09dl.LJII();
    }
}
