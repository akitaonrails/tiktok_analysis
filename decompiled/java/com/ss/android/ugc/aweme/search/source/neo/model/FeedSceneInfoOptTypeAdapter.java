package com.ss.android.ugc.aweme.search.source.neo.model;

import X.C09CJ;
import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.HashSet;

/* JADX INFO: loaded from: classes15.dex */
public final class FeedSceneInfoOptTypeAdapter extends TypeAdapter<FeedSceneInfo> {
    public final Gson LIZ;

    public FeedSceneInfoOptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final FeedSceneInfo read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        c09cu.LIZIZ();
        HashSet hashSet = new HashSet();
        String strLJJJZ = "";
        Long lValueOf = null;
        Long lValueOf2 = null;
        Long lValueOf3 = null;
        String strLJJJZ2 = null;
        String strLJJJZ3 = null;
        String strLJJJZ4 = null;
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1877516040:
                        if (strLJJJJ.equals("play_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                lValueOf2 = Long.valueOf(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1790206114:
                        if (strLJJJJ.equals("music_play_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                lValueOf3 = Long.valueOf(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1512022125:
                        if (strLJJJJ.equals("aweme_id")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                strLJJJZ = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1468661111:
                        if (strLJJJJ.equals("effect_id")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                strLJJJZ3 = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -982768848:
                        if (strLJJJJ.equals("poi_id")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                strLJJJZ4 = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 96402:
                        if (strLJJJJ.equals("act")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                C09CJ.LIZ(this.LIZ, c09cu, hashSet, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 55126294:
                        if (strLJJJJ.equals("timestamp")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                lValueOf = Long.valueOf(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 843879797:
                        if (strLJJJJ.equals("music_id")) {
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
        return new FeedSceneInfo(lValueOf, strLJJJZ, lValueOf2, lValueOf3, strLJJJZ2, strLJJJZ3, strLJJJZ4, hashSet);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FeedSceneInfo feedSceneInfo) {
        FeedSceneInfo feedSceneInfo2 = feedSceneInfo;
        if (feedSceneInfo2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("timestamp");
        c09dl.LJJJJ(feedSceneInfo2.timestamp);
        c09dl.LJIILLIIL("aweme_id");
        c09dl.LJJJJJ(feedSceneInfo2.awemeId);
        c09dl.LJIILLIIL("play_time");
        c09dl.LJJJJ(feedSceneInfo2.playTime);
        c09dl.LJIILLIIL("music_play_time");
        c09dl.LJJJJ(feedSceneInfo2.musicPlayTime);
        c09dl.LJIILLIIL("music_id");
        c09dl.LJJJJJ(feedSceneInfo2.musicId);
        c09dl.LJIILLIIL("effect_id");
        c09dl.LJJJJJ(feedSceneInfo2.effectId);
        c09dl.LJIILLIIL("poi_id");
        c09dl.LJJJJJ(feedSceneInfo2.poiId);
        c09dl.LJIILLIIL("act");
        C09CJ.LIZIZ(this.LIZ, c09dl, feedSceneInfo2.actSet, String.class);
        c09dl.LJII();
    }
}
