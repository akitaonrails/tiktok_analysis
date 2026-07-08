package com.bytedance.android.livesdk.model;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveRecommendAtEnd_OptTypeAdapter extends TypeAdapter<LiveRecommendAtEnd> {
    public final Gson LIZ;

    public LiveRecommendAtEnd_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveRecommendAtEnd read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveRecommendAtEnd liveRecommendAtEnd = new LiveRecommendAtEnd();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1652592311:
                        if (strLJJJJ.equals("live_to_recommend_distance")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRecommendAtEnd.recommendDistance = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -698990538:
                        if (strLJJJJ.equals("enable_show_recommend")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRecommendAtEnd.enableShowRecommend = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -435062705:
                        if (strLJJJJ.equals("following_entrances")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRecommendAtEnd.followingEntrances = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 355349285:
                        if (strLJJJJ.equals("recommend_button_show_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRecommendAtEnd.recommendButtonShowTime = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1179164155:
                        if (strLJJJJ.equals("delay_hide_guide")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRecommendAtEnd.delayHideGuide = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1285230783:
                        if (strLJJJJ.equals("android_follow_unread_extra_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRecommendAtEnd.followUnreadExtraList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1420970529:
                        if (strLJJJJ.equals("is_limit_player_width")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRecommendAtEnd.isLimitPlayerWidth = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return liveRecommendAtEnd;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveRecommendAtEnd liveRecommendAtEnd) throws IOException {
        LiveRecommendAtEnd liveRecommendAtEnd2 = liveRecommendAtEnd;
        if (liveRecommendAtEnd2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_show_recommend");
        c09dl.LJJJJ(Integer.valueOf(liveRecommendAtEnd2.enableShowRecommend));
        c09dl.LJIILLIIL("recommend_button_show_time");
        c09dl.LJJIZ(liveRecommendAtEnd2.recommendButtonShowTime);
        c09dl.LJIILLIIL("following_entrances");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveRecommendAtEnd2.followingEntrances, String.class);
        c09dl.LJIILLIIL("is_limit_player_width");
        c09dl.LJJJJJL(liveRecommendAtEnd2.isLimitPlayerWidth);
        c09dl.LJIILLIIL("live_to_recommend_distance");
        c09dl.LJJJJ(Float.valueOf(liveRecommendAtEnd2.recommendDistance));
        c09dl.LJIILLIIL("delay_hide_guide");
        c09dl.LJJJJJL(liveRecommendAtEnd2.delayHideGuide);
        c09dl.LJIILLIIL("android_follow_unread_extra_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveRecommendAtEnd2.followUnreadExtraList, String.class);
        c09dl.LJII();
    }
}
