package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.revenuestrategy.GiftGuideLynxPopupEnableSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftGuideLynxPopupEnableSetting_MockParams_OptTypeAdapter extends TypeAdapter<GiftGuideLynxPopupEnableSetting.MockParams> {
    public final Gson LIZ;

    public GiftGuideLynxPopupEnableSetting_MockParams_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final GiftGuideLynxPopupEnableSetting.MockParams read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        GiftGuideLynxPopupEnableSetting.MockParams mockParams = new GiftGuideLynxPopupEnableSetting.MockParams(0, "", 140, 177, 147, false, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                mockParams.enable = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1221029593:
                        if (strLJJJJ.equals("height")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                mockParams.height = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -826243148:
                        if (strLJJJJ.equals("min_height")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                mockParams.minHeight = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -615829668:
                        if (strLJJJJ.equals("popup_url")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                mockParams.popupUrl = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 113126854:
                        if (strLJJJJ.equals("width")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                mockParams.width = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 342195050:
                        if (strLJJJJ.equals("wrap_comment")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                mockParams.wrapComment = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 745623085:
                        if (strLJJJJ.equals("gift_icon_animation")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                mockParams.giftIconAnimation = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return mockParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GiftGuideLynxPopupEnableSetting.MockParams mockParams) throws IOException {
        GiftGuideLynxPopupEnableSetting.MockParams mockParams2 = mockParams;
        if (mockParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJ(Integer.valueOf(mockParams2.enable));
        c09dl.LJIILLIIL("popup_url");
        c09dl.LJJJJJ(mockParams2.popupUrl);
        c09dl.LJIILLIIL("width");
        c09dl.LJJJJ(Integer.valueOf(mockParams2.width));
        c09dl.LJIILLIIL("height");
        c09dl.LJJJJ(Integer.valueOf(mockParams2.height));
        c09dl.LJIILLIIL("min_height");
        c09dl.LJJJJ(Integer.valueOf(mockParams2.minHeight));
        c09dl.LJIILLIIL("wrap_comment");
        c09dl.LJJJJJL(mockParams2.wrapComment);
        c09dl.LJIILLIIL("gift_icon_animation");
        c09dl.LJJJJJL(mockParams2.giftIconAnimation);
        c09dl.LJII();
    }
}
