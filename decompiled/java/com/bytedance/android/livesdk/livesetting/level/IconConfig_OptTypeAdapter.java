package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class IconConfig_OptTypeAdapter extends TypeAdapter<IconConfig> {
    public final Gson LIZ;

    public IconConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final IconConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        IconConfig iconConfig = new IconConfig("", false, "", 0, 0, true, 0);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1644053531:
                        if (strLJJJJ.equals("real_width")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                iconConfig.width = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1316467858:
                        if (strLJJJJ.equals("file_name")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                iconConfig.fileName = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 140953320:
                        if (strLJJJJ.equals("real_height")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                iconConfig.height = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 496798466:
                        if (strLJJJJ.equals("size_unit")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                iconConfig.useDpUnit = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 738950403:
                        if (strLJJJJ.equals("channel")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                iconConfig.geckoChannel = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1308382032:
                        if (strLJJJJ.equals("container_fixed_height")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                iconConfig.containerFixedHeight = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1867466441:
                        if (strLJJJJ.equals("need_download_files")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                iconConfig.needDownloadFiles = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return iconConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, IconConfig iconConfig) throws IOException {
        IconConfig iconConfig2 = iconConfig;
        if (iconConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("channel");
        c09dl.LJJJJJ(iconConfig2.geckoChannel);
        c09dl.LJIILLIIL("need_download_files");
        c09dl.LJJJJJL(iconConfig2.needDownloadFiles);
        c09dl.LJIILLIIL("file_name");
        c09dl.LJJJJJ(iconConfig2.fileName);
        c09dl.LJIILLIIL("real_height");
        c09dl.LJJJJ(Integer.valueOf(iconConfig2.height));
        c09dl.LJIILLIIL("real_width");
        c09dl.LJJJJ(Integer.valueOf(iconConfig2.width));
        c09dl.LJIILLIIL("size_unit");
        c09dl.LJJJJJL(iconConfig2.useDpUnit);
        c09dl.LJIILLIIL("container_fixed_height");
        c09dl.LJJJJ(Integer.valueOf(iconConfig2.containerFixedHeight));
        c09dl.LJII();
    }
}
