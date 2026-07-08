package com.ss.android.ugc.aweme.search.source.neo.model;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes15.dex */
public final class SearchSceneInfoOptTypeAdapter extends TypeAdapter<SearchSceneInfo> {
    public final Gson LIZ;

    public SearchSceneInfoOptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final SearchSceneInfo read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        c09cu.LIZIZ();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        String strLJJJZ = "";
        String strLJJJZ2 = "";
        String strLJJJZ3 = null;
        String strLJJJZ4 = null;
        Long lValueOf = null;
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1344490260:
                        if (strLJJJJ.equals("card_consumption")) {
                            C09D6 c09d6LJJLIIIJ = c09cu.LJJLIIIJ();
                            C09D6 c09d6 = C09D6.NULL;
                            if (c09d6LJJLIIIJ != c09d6) {
                                Gson gson = this.LIZ;
                                if (c09cu.LJJLIIIJ() != c09d6) {
                                    TypeAdapter typeAdapterLJIIJ = gson.LJIIJ(CardConsumption.class);
                                    c09cu.LIZIZ();
                                    while (c09cu.LJIIZILJ()) {
                                        String strLJJJJ2 = c09cu.LJJJJ();
                                        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                            c09cu.LJJJJJL();
                                        } else {
                                            concurrentHashMap.put(strLJJJJ2, typeAdapterLJIIJ.read(c09cu));
                                        }
                                    }
                                    c09cu.LJII();
                                }
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
                    case 55126294:
                        if (strLJJJJ.equals("timestamp")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                lValueOf = Long.valueOf(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 107944136:
                        if (strLJJJJ.equals("query")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                strLJJJZ2 = c09cu.LJJJZ();
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
                                strLJJJZ = c09cu.LJJJZ();
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
        return new SearchSceneInfo(strLJJJZ, strLJJJZ2, strLJJJZ3, strLJJJZ4, lValueOf, concurrentHashMap);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, SearchSceneInfo searchSceneInfo) {
        SearchSceneInfo searchSceneInfo2 = searchSceneInfo;
        if (searchSceneInfo2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("search_id");
        c09dl.LJJJJJ(searchSceneInfo2.searchId);
        c09dl.LJIILLIIL("query");
        c09dl.LJJJJJ(searchSceneInfo2.query);
        c09dl.LJIILLIIL("channel");
        c09dl.LJJJJJ(searchSceneInfo2.channel);
        c09dl.LJIILLIIL("source");
        c09dl.LJJJJJ(searchSceneInfo2.source);
        c09dl.LJIILLIIL("timestamp");
        c09dl.LJJJJ(searchSceneInfo2.timestamp);
        c09dl.LJIILLIIL("card_consumption");
        Gson gson = this.LIZ;
        Map<String, CardConsumption> map = searchSceneInfo2.cardConsumptionMap;
        if (map == null) {
            c09dl.LJIJJ();
        } else {
            c09dl.LIZLLL();
            if (!map.isEmpty()) {
                TypeAdapter typeAdapterLJIIJ = gson.LJIIJ(CardConsumption.class);
                for (Map.Entry<String, CardConsumption> entry : map.entrySet()) {
                    c09dl.LJIILLIIL(String.valueOf(entry.getKey()));
                    typeAdapterLJIIJ.write(c09dl, entry.getValue());
                }
            }
            c09dl.LJII();
        }
        c09dl.LJII();
    }
}
