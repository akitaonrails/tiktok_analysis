package com.bytedance.android.livesdk.model;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class FeedPreloadConfig_OptTypeAdapter extends TypeAdapter<FeedPreloadConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final FeedPreloadConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        FeedPreloadConfig feedPreloadConfig = new FeedPreloadConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1905898415:
                        if (strLJJJJ.equals("live_feed_preload_in_room")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                feedPreloadConfig.feedPreloadInRoom = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1852482623:
                        if (strLJJJJ.equals("live_feed_preload_new_feed")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                feedPreloadConfig.feedPreloadNewFeed = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 478721140:
                        if (strLJJJJ.equals("live_feed_preload_style_one")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                feedPreloadConfig.feedPreloadStyleOne = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 478726234:
                        if (strLJJJJ.equals("live_feed_preload_style_two")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                feedPreloadConfig.feedPreloadStyleTwo = c09cu.LJJIZ();
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
        return feedPreloadConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FeedPreloadConfig feedPreloadConfig) {
        FeedPreloadConfig feedPreloadConfig2 = feedPreloadConfig;
        if (feedPreloadConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("live_feed_preload_style_one");
        c09dl.LJJJJ(Integer.valueOf(feedPreloadConfig2.feedPreloadStyleOne));
        c09dl.LJIILLIIL("live_feed_preload_style_two");
        c09dl.LJJJJ(Integer.valueOf(feedPreloadConfig2.feedPreloadStyleTwo));
        c09dl.LJIILLIIL("live_feed_preload_in_room");
        c09dl.LJJJJ(Integer.valueOf(feedPreloadConfig2.feedPreloadInRoom));
        c09dl.LJIILLIIL("live_feed_preload_new_feed");
        c09dl.LJJJJ(Integer.valueOf(feedPreloadConfig2.feedPreloadNewFeed));
        c09dl.LJII();
    }
}
