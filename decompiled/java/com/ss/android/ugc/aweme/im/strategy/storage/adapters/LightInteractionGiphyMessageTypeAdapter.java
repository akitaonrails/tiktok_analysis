package com.ss.android.ugc.aweme.im.strategy.storage.adapters;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionGiphyMessage;

/* JADX INFO: loaded from: classes15.dex */
public final class LightInteractionGiphyMessageTypeAdapter extends TypeAdapter<LightInteractionGiphyMessage> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LightInteractionGiphyMessage read(C09CU c09cu) {
        c09cu.LIZIZ();
        Integer numValueOf = null;
        Integer numValueOf2 = null;
        String strLJJJZ = null;
        String strLJJJZ2 = null;
        Integer numValueOf3 = null;
        String strLJJJZ3 = null;
        String strLJJJZ4 = null;
        String strLJJJZ5 = null;
        String strLJJJZ6 = null;
        String strLJJJZ7 = null;
        String strLJJJZ8 = null;
        String strLJJJZ9 = null;
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1524479350:
                        if (strLJJJJ.equals("awe_type")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                numValueOf3 = Integer.valueOf(c09cu.LJJIZ());
                            }
                        }
                        break;
                    case -1442758754:
                        if (strLJJJJ.equals("image_type")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ3 = c09cu.LJJJZ();
                            }
                        }
                        break;
                    case -1221029593:
                        if (strLJJJJ.equals("height")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                numValueOf2 = Integer.valueOf(c09cu.LJJIZ());
                            }
                        }
                        break;
                    case -1195408547:
                        if (strLJJJJ.equals("sticker_id")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ6 = c09cu.LJJJZ();
                            }
                        }
                        break;
                    case -859601281:
                        if (strLJJJJ.equals("image_id")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ5 = c09cu.LJJJZ();
                            }
                        }
                        break;
                    case -109978594:
                        if (strLJJJJ.equals("static_url")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ2 = c09cu.LJJJZ();
                            }
                        }
                        break;
                    case 116079:
                        if (strLJJJJ.equals("url")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ = c09cu.LJJJZ();
                            }
                        }
                        break;
                    case 29331380:
                        if (strLJJJJ.equals("package_id")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ7 = c09cu.LJJJZ();
                            }
                        }
                        break;
                    case 92525830:
                        if (strLJJJJ.equals("a_src")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ9 = c09cu.LJJJZ();
                            }
                        }
                        break;
                    case 113126854:
                        if (strLJJJJ.equals("width")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                numValueOf = Integer.valueOf(c09cu.LJJIZ());
                            }
                        }
                        break;
                    case 351608024:
                        if (strLJJJJ.equals("version")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ8 = c09cu.LJJJZ();
                            }
                        }
                        break;
                    case 1615086568:
                        if (strLJJJJ.equals("display_name")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ4 = c09cu.LJJJZ();
                            }
                        }
                        break;
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return new LightInteractionGiphyMessage(numValueOf, numValueOf2, strLJJJZ, strLJJJZ2, numValueOf3, strLJJJZ3, strLJJJZ4, strLJJJZ5, strLJJJZ6, strLJJJZ7, strLJJJZ8, strLJJJZ9);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LightInteractionGiphyMessage lightInteractionGiphyMessage) {
        LightInteractionGiphyMessage lightInteractionGiphyMessage2 = lightInteractionGiphyMessage;
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("width");
        c09dl.LJJJJ(lightInteractionGiphyMessage2.width);
        c09dl.LJIILLIIL("height");
        c09dl.LJJJJ(lightInteractionGiphyMessage2.height);
        c09dl.LJIILLIIL("url");
        c09dl.LJJJJJ(lightInteractionGiphyMessage2.url);
        c09dl.LJIILLIIL("static_url");
        c09dl.LJJJJJ(lightInteractionGiphyMessage2.staticUrl);
        c09dl.LJIILLIIL("awe_type");
        c09dl.LJJJJ(lightInteractionGiphyMessage2.aweType);
        c09dl.LJIILLIIL("image_type");
        c09dl.LJJJJJ(lightInteractionGiphyMessage2.imageType);
        c09dl.LJIILLIIL("display_name");
        c09dl.LJJJJJ(lightInteractionGiphyMessage2.displayName);
        c09dl.LJIILLIIL("image_id");
        c09dl.LJJJJJ(lightInteractionGiphyMessage2.imageId);
        c09dl.LJIILLIIL("sticker_id");
        c09dl.LJJJJJ(lightInteractionGiphyMessage2.stickerId);
        c09dl.LJIILLIIL("package_id");
        c09dl.LJJJJJ(lightInteractionGiphyMessage2.packageId);
        c09dl.LJIILLIIL("version");
        c09dl.LJJJJJ(lightInteractionGiphyMessage2.version);
        c09dl.LJIILLIIL("a_src");
        c09dl.LJJJJJ(lightInteractionGiphyMessage2.aSrc);
        c09dl.LJII();
    }
}
