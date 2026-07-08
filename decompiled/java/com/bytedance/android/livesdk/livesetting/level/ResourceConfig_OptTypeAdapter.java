package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class ResourceConfig_OptTypeAdapter extends TypeAdapter<ResourceConfig> {
    public final Gson LIZ;

    public ResourceConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final ResourceConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        ResourceConfig resourceConfig = new ResourceConfig(0, "", "", false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case 3575610:
                        if (strLJJJJ.equals("type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                resourceConfig.type = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 738950403:
                        if (strLJJJJ.equals("channel")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                resourceConfig.channel = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1327851472:
                        if (strLJJJJ.equals("zip_file_name")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                resourceConfig.fileName = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1867466441:
                        if (strLJJJJ.equals("need_download_files")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                resourceConfig.needDownloadFiles = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return resourceConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, ResourceConfig resourceConfig) throws IOException {
        ResourceConfig resourceConfig2 = resourceConfig;
        if (resourceConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("type");
        c09dl.LJJJJ(Integer.valueOf(resourceConfig2.type));
        c09dl.LJIILLIIL("zip_file_name");
        c09dl.LJJJJJ(resourceConfig2.fileName);
        c09dl.LJIILLIIL("channel");
        c09dl.LJJJJJ(resourceConfig2.channel);
        c09dl.LJIILLIIL("need_download_files");
        c09dl.LJJJJJL(resourceConfig2.needDownloadFiles);
        c09dl.LJII();
    }
}
