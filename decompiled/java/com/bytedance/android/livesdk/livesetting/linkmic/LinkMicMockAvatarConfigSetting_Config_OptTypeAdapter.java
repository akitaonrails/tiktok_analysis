package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMockAvatarConfigSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes35.dex */
public final class LinkMicMockAvatarConfigSetting_Config_OptTypeAdapter extends TypeAdapter<LinkMicMockAvatarConfigSetting.Config> {
    public final Gson LIZ;

    public LinkMicMockAvatarConfigSetting_Config_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LinkMicMockAvatarConfigSetting.Config read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LinkMicMockAvatarConfigSetting.Config config = new LinkMicMockAvatarConfigSetting.Config(0, 15, 0, 0, 1.77f, 0, 0, "mouth_close.mp4", "", "", true, false, 1, 400L, 1, 0.0f, 1.0f, 0.0f, 1.0f, 0.5f);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2050375022:
                        if (strLJJJJ.equals("speak_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.speakInterval = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1738251205:
                        if (strLJJJJ.equals("o_ratio")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.outputRatio = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1733410314:
                        if (strLJJJJ.equals("o_width")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.outputWidth = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1351982455:
                        if (strLJJJJ.equals("crop_x")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.cropX = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1351982454:
                        if (strLJJJJ.equals("crop_y")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.cropY = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1316467858:
                        if (strLJJJJ.equals("file_name")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.fileName = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1316408056:
                        if (strLJJJJ.equals("file_path")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.filePath = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1306084975:
                        if (strLJJJJ.equals("effect")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.effect = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 101609:
                        if (strLJJJJ.equals("fps")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.fps = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 3327652:
                        if (strLJJJJ.equals("loop")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.loop = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 47167091:
                        if (strLJJJJ.equals("s_height")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.surfaceHeight = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 108285963:
                        if (strLJJJJ.equals("ratio")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.ratio = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 979623115:
                        if (strLJJJJ.equals("resource_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.resourceType = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1041652214:
                        if (strLJJJJ.equals("remote_url")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.remoteUrl = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1078635711:
                        if (strLJJJJ.equals("ues_texture")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.uesTexture = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1147623782:
                        if (strLJJJJ.equals("fill_layout")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.fillLayout = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1461133143:
                        if (strLJJJJ.equals("crop_width")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.cropWidth = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1665860343:
                        if (strLJJJJ.equals("o_height")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.outputHeight = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1816604410:
                        if (strLJJJJ.equals("s_width")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.surfaceWidth = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1912459702:
                        if (strLJJJJ.equals("crop_height")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.cropHeight = (float) c09cu.LJJIL();
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
        return config;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LinkMicMockAvatarConfigSetting.Config config) throws IOException {
        LinkMicMockAvatarConfigSetting.Config config2 = config;
        if (config2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("ues_texture");
        c09dl.LJJJJ(Integer.valueOf(config2.uesTexture));
        c09dl.LJIILLIIL("fps");
        c09dl.LJJJJ(Integer.valueOf(config2.fps));
        c09dl.LJIILLIIL("o_width");
        c09dl.LJJJJ(Integer.valueOf(config2.outputWidth));
        c09dl.LJIILLIIL("o_height");
        c09dl.LJJJJ(Integer.valueOf(config2.outputHeight));
        c09dl.LJIILLIIL("o_ratio");
        c09dl.LJJJJ(Float.valueOf(config2.outputRatio));
        c09dl.LJIILLIIL("s_width");
        c09dl.LJJJJ(Integer.valueOf(config2.surfaceWidth));
        c09dl.LJIILLIIL("s_height");
        c09dl.LJJJJ(Integer.valueOf(config2.surfaceHeight));
        c09dl.LJIILLIIL("file_name");
        c09dl.LJJJJJ(config2.fileName);
        c09dl.LJIILLIIL("file_path");
        c09dl.LJJJJJ(config2.filePath);
        c09dl.LJIILLIIL("remote_url");
        c09dl.LJJJJJ(config2.remoteUrl);
        c09dl.LJIILLIIL("loop");
        c09dl.LJJJJJL(config2.loop);
        c09dl.LJIILLIIL("effect");
        c09dl.LJJJJJL(config2.effect);
        c09dl.LJIILLIIL("resource_type");
        c09dl.LJJJJ(Integer.valueOf(config2.resourceType));
        c09dl.LJIILLIIL("speak_interval");
        c09dl.LJJIZ(config2.speakInterval);
        c09dl.LJIILLIIL("fill_layout");
        c09dl.LJJJJ(Integer.valueOf(config2.fillLayout));
        c09dl.LJIILLIIL("crop_x");
        c09dl.LJJJJ(Float.valueOf(config2.cropX));
        c09dl.LJIILLIIL("crop_y");
        c09dl.LJJJJ(Float.valueOf(config2.cropY));
        c09dl.LJIILLIIL("crop_width");
        c09dl.LJJJJ(Float.valueOf(config2.cropWidth));
        c09dl.LJIILLIIL("crop_height");
        c09dl.LJJJJ(Float.valueOf(config2.cropHeight));
        c09dl.LJIILLIIL("ratio");
        c09dl.LJJJJ(Float.valueOf(config2.ratio));
        c09dl.LJII();
    }
}
