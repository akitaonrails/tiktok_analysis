package com.ss.android.ugc.aweme.search.source.neo.model;

import X.C09CJ;
import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.HashSet;

/* JADX INFO: loaded from: classes15.dex */
public final class CardConsumptionOptTypeAdapter extends TypeAdapter<CardConsumption> {
    public final Gson LIZ;

    public CardConsumptionOptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final CardConsumption read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        c09cu.LIZIZ();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        String strLJJJZ = "";
        String strLJJJZ2 = null;
        String strLJJJZ3 = null;
        Long lValueOf = null;
        Long lValueOf2 = null;
        String strLJJJZ4 = null;
        Long lValueOf3 = null;
        Long lValueOf4 = null;
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1790206114:
                        if (strLJJJJ.equals("music_play_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                lValueOf3 = Long.valueOf(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -769302988:
                        if (strLJJJJ.equals("outer_play_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                lValueOf2 = Long.valueOf(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -220318129:
                        if (strLJJJJ.equals("inner_play_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                lValueOf = Long.valueOf(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 96402:
                        if (strLJJJJ.equals("act")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                C09CJ.LIZ(this.LIZ, c09cu, hashSet2, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 55126294:
                        if (strLJJJJ.equals("timestamp")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                lValueOf4 = Long.valueOf(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 101507520:
                        if (strLJJJJ.equals("token_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                strLJJJZ3 = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 841548499:
                        if (strLJJJJ.equals("doc_rank")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                strLJJJZ4 = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1155679910:
                        if (strLJJJJ.equals("search_result_id")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                strLJJJZ = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1198625574:
                        if (strLJJJJ.equals("list_item_id")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                strLJJJZ2 = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1753008747:
                        if (strLJJJJ.equals("product_id")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                C09CJ.LIZ(this.LIZ, c09cu, hashSet, String.class);
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
        return new CardConsumption(strLJJJZ, strLJJJZ2, strLJJJZ3, lValueOf, lValueOf2, hashSet, strLJJJZ4, lValueOf3, lValueOf4, hashSet2);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, CardConsumption cardConsumption) {
        CardConsumption cardConsumption2 = cardConsumption;
        if (cardConsumption2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("search_result_id");
        c09dl.LJJJJJ(cardConsumption2.searchResultId);
        c09dl.LJIILLIIL("list_item_id");
        c09dl.LJJJJJ(cardConsumption2.listItemId);
        c09dl.LJIILLIIL("token_type");
        c09dl.LJJJJJ(cardConsumption2.tokenType);
        c09dl.LJIILLIIL("inner_play_time");
        c09dl.LJJJJ(cardConsumption2.innerPlayTime);
        c09dl.LJIILLIIL("outer_play_time");
        c09dl.LJJJJ(cardConsumption2.outerPlayTime);
        c09dl.LJIILLIIL("product_id");
        C09CJ.LIZIZ(this.LIZ, c09dl, cardConsumption2.productIdList, String.class);
        c09dl.LJIILLIIL("doc_rank");
        c09dl.LJJJJJ(cardConsumption2.docRank);
        c09dl.LJIILLIIL("music_play_time");
        c09dl.LJJJJ(cardConsumption2.musicPlayTime);
        c09dl.LJIILLIIL("timestamp");
        c09dl.LJJJJ(cardConsumption2.timestamp);
        c09dl.LJIILLIIL("act");
        C09CJ.LIZIZ(this.LIZ, c09dl, cardConsumption2.actSet, String.class);
        c09dl.LJII();
    }
}
