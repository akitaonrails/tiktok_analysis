package com.bytedance.android.livesdk.model;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class LoginGuideConfig_OptTypeAdapter extends TypeAdapter<LoginGuideConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LoginGuideConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LoginGuideConfig loginGuideConfig = new LoginGuideConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1563308546:
                        if (strLJJJJ.equals("image_url_from_comment")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                loginGuideConfig.imageUrlFromComment = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1341829932:
                        if (strLJJJJ.equals("from_home_upper_right")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                loginGuideConfig.fromHomeUpperRight = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -968903200:
                        if (strLJJJJ.equals("image_url_from_default")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                loginGuideConfig.imageUrlFromDefault = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -164819482:
                        if (strLJJJJ.equals("from_follow")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                loginGuideConfig.fromFollow = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 435281373:
                        if (strLJJJJ.equals("image_url_from_favorite")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                loginGuideConfig.imageUrlFromFavorite = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 818963146:
                        if (strLJJJJ.equals("from_comment")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                loginGuideConfig.fromComment = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1079458848:
                        if (strLJJJJ.equals("image_url_from_home_upper_right")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                loginGuideConfig.imageUrlFromHomeUpperRight = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1271259793:
                        if (strLJJJJ.equals("from_favorite")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                loginGuideConfig.fromFavorite = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1413368492:
                        if (strLJJJJ.equals("from_default")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                loginGuideConfig.fromDefault = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1836543026:
                        if (strLJJJJ.equals("image_url_from_follow")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                loginGuideConfig.imageUrlFromFollow = c09cu.LJJJZ();
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
        return loginGuideConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LoginGuideConfig loginGuideConfig) {
        LoginGuideConfig loginGuideConfig2 = loginGuideConfig;
        if (loginGuideConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("from_default");
        c09dl.LJJJJJ(loginGuideConfig2.fromDefault);
        c09dl.LJIILLIIL("from_home_upper_right");
        c09dl.LJJJJJ(loginGuideConfig2.fromHomeUpperRight);
        c09dl.LJIILLIIL("from_follow");
        c09dl.LJJJJJ(loginGuideConfig2.fromFollow);
        c09dl.LJIILLIIL("from_favorite");
        c09dl.LJJJJJ(loginGuideConfig2.fromFavorite);
        c09dl.LJIILLIIL("from_comment");
        c09dl.LJJJJJ(loginGuideConfig2.fromComment);
        c09dl.LJIILLIIL("image_url_from_default");
        c09dl.LJJJJJ(loginGuideConfig2.imageUrlFromDefault);
        c09dl.LJIILLIIL("image_url_from_home_upper_right");
        c09dl.LJJJJJ(loginGuideConfig2.imageUrlFromHomeUpperRight);
        c09dl.LJIILLIIL("image_url_from_follow");
        c09dl.LJJJJJ(loginGuideConfig2.imageUrlFromFollow);
        c09dl.LJIILLIIL("image_url_from_favorite");
        c09dl.LJJJJJ(loginGuideConfig2.imageUrlFromFavorite);
        c09dl.LJIILLIIL("image_url_from_comment");
        c09dl.LJJJJJ(loginGuideConfig2.imageUrlFromComment);
        c09dl.LJII();
    }
}
