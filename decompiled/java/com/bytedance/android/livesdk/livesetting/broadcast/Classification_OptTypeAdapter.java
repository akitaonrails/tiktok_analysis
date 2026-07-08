package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class Classification_OptTypeAdapter extends TypeAdapter<Classification> {
    public final Gson LIZ;

    public Classification_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final Classification read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        Classification classification = new Classification(-1L, true, new Post(0, 0), new Post(0, 0));
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case 111267:
                        if (strLJJJJ.equals("pre")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                classification.setPre((Post) this.LIZ.LJIIJ(Post.class).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 3446944:
                        if (strLJJJJ.equals("post")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                classification.setPost((Post) this.LIZ.LJIIJ(Post.class).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 3532159:
                        if (strLJJJJ.equals("skip")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                classification.setSkip(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 94935213:
                        if (strLJJJJ.equals("crowd")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                classification.setCrowd(c09cu.LJJJ());
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
        return classification;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, Classification classification) throws IOException {
        Classification classification2 = classification;
        if (classification2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("crowd");
        c09dl.LJJIZ(classification2.getCrowd());
        c09dl.LJIILLIIL("skip");
        c09dl.LJJJJJL(classification2.getSkip());
        c09dl.LJIILLIIL("pre");
        TypeAdapter typeAdapterLJIIJ = this.LIZ.LJIIJ(Post.class);
        typeAdapterLJIIJ.write(c09dl, classification2.getPre());
        c09dl.LJIILLIIL("post");
        typeAdapterLJIIJ.write(c09dl, classification2.getPost());
        c09dl.LJII();
    }
}
