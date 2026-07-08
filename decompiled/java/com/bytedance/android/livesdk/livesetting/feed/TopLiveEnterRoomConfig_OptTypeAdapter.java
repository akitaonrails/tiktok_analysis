package com.bytedance.android.livesdk.livesetting.feed;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class TopLiveEnterRoomConfig_OptTypeAdapter extends TypeAdapter<TopLiveEnterRoomConfig> {
    public final Gson LIZ;

    public TopLiveEnterRoomConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final TopLiveEnterRoomConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        TopLiveEnterRoomConfig topLiveEnterRoomConfig = new TopLiveEnterRoomConfig(0, 0, 0, false, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1667618101:
                        if (strLJJJJ.equals("max_no_feed_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                topLiveEnterRoomConfig.maxNoFeedTime = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1572049853:
                        if (strLJJJJ.equals("cancel_feed")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                topLiveEnterRoomConfig.cancelFeed = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1571636182:
                        if (strLJJJJ.equals("cancel_task")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                topLiveEnterRoomConfig.cancelTask = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1333703108:
                        if (strLJJJJ.equals("max_wait_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                topLiveEnterRoomConfig.maxWaitTime = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 351608024:
                        if (strLJJJJ.equals("version")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                topLiveEnterRoomConfig.version = c09cu.LJJIZ();
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
        return topLiveEnterRoomConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TopLiveEnterRoomConfig topLiveEnterRoomConfig) throws IOException {
        TopLiveEnterRoomConfig topLiveEnterRoomConfig2 = topLiveEnterRoomConfig;
        if (topLiveEnterRoomConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("version");
        c09dl.LJJJJ(Integer.valueOf(topLiveEnterRoomConfig2.version));
        c09dl.LJIILLIIL("max_wait_time");
        c09dl.LJJJJ(Integer.valueOf(topLiveEnterRoomConfig2.maxWaitTime));
        c09dl.LJIILLIIL("max_no_feed_time");
        c09dl.LJJJJ(Integer.valueOf(topLiveEnterRoomConfig2.maxNoFeedTime));
        c09dl.LJIILLIIL("cancel_feed");
        c09dl.LJJJJJL(topLiveEnterRoomConfig2.cancelFeed);
        c09dl.LJIILLIIL("cancel_task");
        c09dl.LJJJJJL(topLiveEnterRoomConfig2.cancelTask);
        c09dl.LJII();
    }
}
