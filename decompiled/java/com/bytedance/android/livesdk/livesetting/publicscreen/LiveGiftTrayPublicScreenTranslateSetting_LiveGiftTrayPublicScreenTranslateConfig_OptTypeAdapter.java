package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveGiftTrayPublicScreenTranslateSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveGiftTrayPublicScreenTranslateSetting_LiveGiftTrayPublicScreenTranslateConfig_OptTypeAdapter extends TypeAdapter<LiveGiftTrayPublicScreenTranslateSetting.LiveGiftTrayPublicScreenTranslateConfig> {
    public final Gson LIZ;

    public LiveGiftTrayPublicScreenTranslateSetting_LiveGiftTrayPublicScreenTranslateConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveGiftTrayPublicScreenTranslateSetting.LiveGiftTrayPublicScreenTranslateConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveGiftTrayPublicScreenTranslateSetting.LiveGiftTrayPublicScreenTranslateConfig liveGiftTrayPublicScreenTranslateConfig = new LiveGiftTrayPublicScreenTranslateSetting.LiveGiftTrayPublicScreenTranslateConfig(new ArrayList(), false, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -804565608) {
                    if (iHashCode != -202761566) {
                        if (iHashCode == 1006493261 && strLJJJJ.equals("biz_types")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftTrayPublicScreenTranslateConfig.bizTypes = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("top_gift_message")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            liveGiftTrayPublicScreenTranslateConfig.translateGiftTray = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("top_public_screen")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveGiftTrayPublicScreenTranslateConfig.translatePublishScreen = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return liveGiftTrayPublicScreenTranslateConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveGiftTrayPublicScreenTranslateSetting.LiveGiftTrayPublicScreenTranslateConfig liveGiftTrayPublicScreenTranslateConfig) throws IOException {
        LiveGiftTrayPublicScreenTranslateSetting.LiveGiftTrayPublicScreenTranslateConfig liveGiftTrayPublicScreenTranslateConfig2 = liveGiftTrayPublicScreenTranslateConfig;
        if (liveGiftTrayPublicScreenTranslateConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("biz_types");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveGiftTrayPublicScreenTranslateConfig2.bizTypes, String.class);
        c09dl.LJIILLIIL("top_gift_message");
        c09dl.LJJJJJL(liveGiftTrayPublicScreenTranslateConfig2.translateGiftTray);
        c09dl.LJIILLIIL("top_public_screen");
        c09dl.LJJJJJL(liveGiftTrayPublicScreenTranslateConfig2.translatePublishScreen);
        c09dl.LJII();
    }
}
