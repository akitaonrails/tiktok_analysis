package com.bytedance.android.livesdk.live.model;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveFeedSettings_OptTypeAdapter extends TypeAdapter<LiveFeedSettings> {
    public final Gson LIZ;

    public LiveFeedSettings_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveFeedSettings read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveFeedSettings liveFeedSettings = new LiveFeedSettings();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1930808873:
                        if (strLJJJJ.equals("channel_id")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFeedSettings.channel_id = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFeedSettings.enable = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -804919194:
                        if (strLJJJJ.equals("is_follow")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFeedSettings.isFollow = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 106436749:
                        if (strLJJJJ.equals("param")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFeedSettings.param = c09cu.LJJJZ();
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
        return liveFeedSettings;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveFeedSettings liveFeedSettings) throws IOException {
        LiveFeedSettings liveFeedSettings2 = liveFeedSettings;
        if (liveFeedSettings2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJ(liveFeedSettings2.enable);
        c09dl.LJIILLIIL("is_follow");
        c09dl.LJJJJJL(liveFeedSettings2.isFollow);
        c09dl.LJIILLIIL("param");
        c09dl.LJJJJJ(liveFeedSettings2.param);
        c09dl.LJIILLIIL("channel_id");
        c09dl.LJJJJ(Integer.valueOf(liveFeedSettings2.channel_id));
        c09dl.LJII();
    }
}
