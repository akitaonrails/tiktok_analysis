package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public final class MatchLayoutIds_OptTypeAdapter extends TypeAdapter<MatchLayoutIds> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final MatchLayoutIds read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MatchLayoutIds matchLayoutIds = new MatchLayoutIds(2002L, 200201L, 2030L, 2031L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -973135991:
                        if (strLJJJJ.equals("nvn_crop")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                matchLayoutIds.matchNvNCropLayoutId = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 50857:
                        if (strLJJJJ.equals("1vn")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                matchLayoutIds.match1vNLayoutId = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 109417:
                        if (strLJJJJ.equals("nv1")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                matchLayoutIds.matchNv1LayoutId = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 109478:
                        if (strLJJJJ.equals("nvn")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                matchLayoutIds.matchNvNLayoutId = c09cu.LJJJ();
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
        return matchLayoutIds;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MatchLayoutIds matchLayoutIds) throws IOException {
        MatchLayoutIds matchLayoutIds2 = matchLayoutIds;
        if (matchLayoutIds2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("nvn");
        c09dl.LJJIZ(matchLayoutIds2.matchNvNLayoutId);
        c09dl.LJIILLIIL("nvn_crop");
        c09dl.LJJIZ(matchLayoutIds2.matchNvNCropLayoutId);
        c09dl.LJIILLIIL("1vn");
        c09dl.LJJIZ(matchLayoutIds2.match1vNLayoutId);
        c09dl.LJIILLIIL("nv1");
        c09dl.LJJIZ(matchLayoutIds2.matchNv1LayoutId);
        c09dl.LJII();
    }
}
