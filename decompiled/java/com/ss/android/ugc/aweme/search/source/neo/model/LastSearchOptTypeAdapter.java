package com.ss.android.ugc.aweme.search.source.neo.model;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.discover.helper.LastSearch;
import java.io.IOException;

/* JADX INFO: loaded from: classes15.dex */
public final class LastSearchOptTypeAdapter extends TypeAdapter<LastSearch> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LastSearch read(C09CU c09cu) throws IOException {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        c09cu.LIZIZ();
        long jLJJJ = 0;
        String strLJJJZ = "";
        String strLJJJZ2 = "";
        String strLJJJZ3 = "";
        String strLJJJZ4 = "";
        long jLJJJ2 = 0;
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1875072335:
                        if (strLJJJJ.equals("tag_timestamp")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                jLJJJ2 = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -896505829:
                        if (strLJJJJ.equals("source")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                strLJJJZ4 = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 3560141:
                        if (strLJJJJ.equals("time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                jLJJJ = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 107944136:
                        if (strLJJJJ.equals("query")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                strLJJJZ = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 738950403:
                        if (strLJJJJ.equals("channel")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                strLJJJZ3 = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1778207506:
                        if (strLJJJJ.equals("search_id")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                strLJJJZ2 = c09cu.LJJJZ();
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
        return new LastSearch(strLJJJZ, strLJJJZ2, strLJJJZ3, strLJJJZ4, Long.valueOf(jLJJJ), Long.valueOf(jLJJJ2));
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LastSearch lastSearch) {
        LastSearch lastSearch2 = lastSearch;
        if (lastSearch2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("query");
        c09dl.LJJJJJ(lastSearch2.query);
        c09dl.LJIILLIIL("search_id");
        c09dl.LJJJJJ(lastSearch2.search_id);
        c09dl.LJIILLIIL("channel");
        c09dl.LJJJJJ(lastSearch2.channel);
        c09dl.LJIILLIIL("source");
        c09dl.LJJJJJ(lastSearch2.source);
        c09dl.LJIILLIIL("time");
        c09dl.LJJJJ(lastSearch2.time);
        c09dl.LJIILLIIL("tag_timestamp");
        c09dl.LJJJJ(lastSearch2.tag_timestamp);
        c09dl.LJII();
    }
}
