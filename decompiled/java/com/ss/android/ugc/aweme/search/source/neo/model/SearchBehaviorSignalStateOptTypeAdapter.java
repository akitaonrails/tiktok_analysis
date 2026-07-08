package com.ss.android.ugc.aweme.search.source.neo.model;

import X.C09CI;
import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.discover.helper.LastSearch;

/* JADX INFO: loaded from: classes15.dex */
public final class SearchBehaviorSignalStateOptTypeAdapter extends TypeAdapter<SearchBehaviorSignalState> {
    public final Gson LIZ;

    public SearchBehaviorSignalStateOptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final SearchBehaviorSignalState read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        SearchBehaviorSignalState searchBehaviorSignalState = new SearchBehaviorSignalState(null, null, null, 7, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1042293310) {
                    if (iHashCode != -176827528) {
                        if (iHashCode == -168391243 && strLJJJJ.equals("query_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                C09CI.LIZ(this.LIZ, c09cu, searchBehaviorSignalState.queryList, LastSearch.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("search_scene_info")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            C09CI.LIZ(this.LIZ, c09cu, searchBehaviorSignalState.searchSceneInfo, SearchSceneInfo.class);
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("feed_scene_info")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        C09CI.LIZ(this.LIZ, c09cu, searchBehaviorSignalState.feedSceneInfo, FeedSceneInfo.class);
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return searchBehaviorSignalState;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, SearchBehaviorSignalState searchBehaviorSignalState) {
        SearchBehaviorSignalState searchBehaviorSignalState2 = searchBehaviorSignalState;
        if (searchBehaviorSignalState2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("query_list");
        C09CI.LIZIZ(this.LIZ, c09dl, searchBehaviorSignalState2.queryList, LastSearch.class);
        c09dl.LJIILLIIL("search_scene_info");
        C09CI.LIZIZ(this.LIZ, c09dl, searchBehaviorSignalState2.searchSceneInfo, SearchSceneInfo.class);
        c09dl.LJIILLIIL("feed_scene_info");
        C09CI.LIZIZ(this.LIZ, c09dl, searchBehaviorSignalState2.feedSceneInfo, FeedSceneInfo.class);
        c09dl.LJII();
    }
}
