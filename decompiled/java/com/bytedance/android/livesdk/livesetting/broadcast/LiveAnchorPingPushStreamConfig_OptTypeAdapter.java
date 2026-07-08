package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveAnchorPingPushStreamConfig_OptTypeAdapter extends TypeAdapter<LiveAnchorPingPushStreamConfig> {
    public final Gson LIZ;

    public LiveAnchorPingPushStreamConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveAnchorPingPushStreamConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveAnchorPingPushStreamConfig liveAnchorPingPushStreamConfig = new LiveAnchorPingPushStreamConfig(0, false, 0.0f, 0);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1267426631:
                        if (strLJJJJ.equals("ping_stream_try_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveAnchorPingPushStreamConfig.pingStreamTryCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -320474689:
                        if (strLJJJJ.equals("ping_stream_end_live_alert")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveAnchorPingPushStreamConfig.pingStreamEndLiveAlert = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 229963466:
                        if (strLJJJJ.equals("ping_anchor_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveAnchorPingPushStreamConfig.pingAnchorTime = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2085615417:
                        if (strLJJJJ.equals("ping_anchor_gap")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveAnchorPingPushStreamConfig.pingAnchorGap = (float) c09cu.LJJIL();
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
        return liveAnchorPingPushStreamConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveAnchorPingPushStreamConfig liveAnchorPingPushStreamConfig) throws IOException {
        LiveAnchorPingPushStreamConfig liveAnchorPingPushStreamConfig2 = liveAnchorPingPushStreamConfig;
        if (liveAnchorPingPushStreamConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("ping_stream_try_count");
        c09dl.LJJJJ(Integer.valueOf(liveAnchorPingPushStreamConfig2.pingStreamTryCount));
        c09dl.LJIILLIIL("ping_stream_end_live_alert");
        c09dl.LJJJJJL(liveAnchorPingPushStreamConfig2.pingStreamEndLiveAlert);
        c09dl.LJIILLIIL("ping_anchor_gap");
        c09dl.LJJJJ(Float.valueOf(liveAnchorPingPushStreamConfig2.pingAnchorGap));
        c09dl.LJIILLIIL("ping_anchor_time");
        c09dl.LJJJJ(Integer.valueOf(liveAnchorPingPushStreamConfig2.pingAnchorTime));
        c09dl.LJII();
    }
}
