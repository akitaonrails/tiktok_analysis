package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.gift.ViewerWishesConfig;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class ViewerWishesConfig_ViewerWishesConfigModel_OptTypeAdapter extends TypeAdapter<ViewerWishesConfig.ViewerWishesConfigModel> {
    public final Gson LIZ;

    public ViewerWishesConfig_ViewerWishesConfigModel_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final ViewerWishesConfig.ViewerWishesConfigModel read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        ViewerWishesConfig.ViewerWishesConfigModel viewerWishesConfigModel = new ViewerWishesConfig.ViewerWishesConfigModel(true, true, 30, 3);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2094989913:
                        if (strLJJJJ.equals("live_viewer_wishes_anchor_enabled")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                viewerWishesConfigModel.anchorEnabled = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -2044679690:
                        if (strLJJJJ.equals("live_viewer_wishes_audience_enabled")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                viewerWishesConfigModel.audienceEnabled = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1974455318:
                        if (strLJJJJ.equals("settlement_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                viewerWishesConfigModel.settlementDuration = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1608103474:
                        if (strLJJJJ.equals("result_display_sec")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                viewerWishesConfigModel.resultDisplaySec = c09cu.LJJIZ();
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
        return viewerWishesConfigModel;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, ViewerWishesConfig.ViewerWishesConfigModel viewerWishesConfigModel) throws IOException {
        ViewerWishesConfig.ViewerWishesConfigModel viewerWishesConfigModel2 = viewerWishesConfigModel;
        if (viewerWishesConfigModel2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("live_viewer_wishes_audience_enabled");
        c09dl.LJJJJJL(viewerWishesConfigModel2.audienceEnabled);
        c09dl.LJIILLIIL("live_viewer_wishes_anchor_enabled");
        c09dl.LJJJJJL(viewerWishesConfigModel2.anchorEnabled);
        c09dl.LJIILLIIL("result_display_sec");
        c09dl.LJJJJ(Integer.valueOf(viewerWishesConfigModel2.resultDisplaySec));
        c09dl.LJIILLIIL("settlement_duration");
        c09dl.LJJJJ(Integer.valueOf(viewerWishesConfigModel2.settlementDuration));
        c09dl.LJII();
    }
}
